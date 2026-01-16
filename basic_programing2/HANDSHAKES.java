System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

       
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        
        System.out.println("Max number of possible handshakes: " + handshakes);

        
    }
}