package com.example.demo;

/**
 * Represents a user entity with personal information.
 */
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String password;
    private String address;
    private String phone;

    /**
     * Default constructor for User.
     */
    public User() {}


    /**
     * Constructs a new User with all fields.
     *
     * @param id the unique identifier for the user
     * @param name the user's full name
     * @param age the user's age
     * @param email the user's email address
     * @param password the user's password
     * @param address the user's address
     * @param phone the user's phone number
     */
    public User(Long id, String name, Integer age, String email, String password, String address, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Gets the user's unique identifier.
     *
     * @return the user's ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the user's unique identifier.
     *
     * @param id the user's ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the user's full name.
     *
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the user's full name.
     *
     * @param name the user's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the user's age.
     *
     * @return the user's age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the user's age.
     *
     * @param age the user's age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Gets the user's email address.
     *
     * @return the user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email address.
     *
     * @param email the user's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the user's password.
     *
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the user's password.
     *
     * @param password the user's password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the user's address.
     *
     * @return the user's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the user's address.
     *
     * @param address the user's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the user's phone number.
     *
     * @return the user's phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the user's phone number.
     *
     * @param phone the user's phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * Returns a string representation of the User object.
     *
     * @return a string containing all user fields
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    /**
     * Constructs a new User without password.
     *
     * @param id the unique identifier for the user
     * @param name the user's full name
     * @param age the user's age
     * @param email the user's email address
     * @param address the user's address
     * @param phone the user's phone number
     */
    public User(Long id, String name, Integer age, String email, String address, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
}