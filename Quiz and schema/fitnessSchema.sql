CREATE TABLE User(
    ID INT PRIMARY KEY,
    user_name VARCHAR(50) NOT NULL,
    dob DATE,
    email VARCHAR(50) NOT NULL,
    phone INT NOT NULL,
    line1 VARCHAR(50) NOT NULL,
    line2 VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    pin_code INT NOT NULL
);

CREATE TABLE Package (
    ID INT PRIMARY KEY,
    package_name VARCHAR(20),
    per_session_price INT
);

CREATE TABLE Employee (
    ID INT PRIMARY KEY,
    emp_name VARCHAR(20),
    gender VARCHAR(10),
    type VARCHAR(20),
    check(gender in ('Male', 'Female', 'Unknown')),
    check(type in ('Trainer', 'Physio'))
);

CREATE TABLE Appointments (
    appointment_ID  INT PRIMARY KEY,
    trainer_id INT,
    user_id INT,
    physio_required BOOL,
    package_id INT,
    weeks tinyint,
    amount INT,
    FOREIGN KEY (trainer_id) REFERENCES Employee(ID),
    FOREIGN KEY (user_id) REFERENCES User(ID),
    FOREIGN KEY (package_id) REFERENCES Package(ID)
    
);