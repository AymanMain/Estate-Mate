// App.js
import React from 'react';
import { BrowserRouter as Router, Route, Redirect } from 'react-router-dom';
import LandingPage from './LandingPage';
import LoginPage from './LoginPage';
import AdminDashboard from './AdminDashboard';
import UserDashboard from './UserDashboard';

function App() {
  const [isLoggedIn, setIsLoggedIn] = React.useState(false);
  const [isAdmin, setIsAdmin] = React.useState(false);

  // Simulated login function
  const login = (username, password) => {
    // Simulate authentication logic here
    if (username === 'admin' && password === 'admin') {
      setIsLoggedIn(true);
      setIsAdmin(true);
    } else if (username === 'user' && password === 'user') {
      setIsLoggedIn(true);
      setIsAdmin(false);
    } else {
      alert('Invalid credentials');
    }
  };

  return (
    <Router>
      <Route exact path="/" component={LandingPage} />
      <Route
        path="/login"
        render={() => (isLoggedIn ? <Redirect to="/dashboard" /> : <LoginPage onLogin={login} />)}
      />
      <Route
        path="/dashboard"
        render={() =>
          isLoggedIn ? (
            isAdmin ? <AdminDashboard /> : <UserDashboard />
          ) : (
            <Redirect to="/login" />
          )
        }
      />
    </Router>
  );
}

export default App;
