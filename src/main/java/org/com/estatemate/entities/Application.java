@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private String message;

    // Consider storing the path or reference to the contract file
    private String contract;

    private LocalDateTime contractExpirationDate;

    private String[] images;

    @ManyToOne
    private User owner;

    // Getters and Setters

    public enum ApplicationStatus {
        PENDING, APPROVED, REJECTED
    }
}
