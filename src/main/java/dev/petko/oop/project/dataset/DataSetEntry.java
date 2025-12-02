/**
 * @file DataSetEntry.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.project.dataset;

/**
 * Represents a model for an entry within
 * the dataset file.
 */
public final class DataSetEntry {
    ///////////////// CONSTANTS /////////////////////

    /**
     * Column delimiter for CSV entries.
     */
    public static final String CSV_DELIM = ",";

    /**
     * The total number of columns an entry has.
     */
    public static final int NUM_COLUMNS = 7;

    /**
     * Column index for the Student_ID column.
     */
    public static final int STUDENT_ID = 0;

    /**
     * Column index for the Subject column.
     */
    public static final int SUBJECT = 1;

    /**
     * Column index for the Assesments column.
     */
    public static final int NUM_ASSESSMENTS = 2;

    /**
     * Column index for the Average_Score column.
     */
    public static final int AVERAGE_SCORE = 3;

    /**
     * Column index for the Attendence_% column.
     */
    public static final int ATTENDANCE_PERCENT = 4;

    /**
     * Column index for the Grade column.
     */
    public static final int GRADE = 5;

    /**
     * Column index for the Term column.
     */
    public static final int TERM = 6;

    /**
     * Array of all column indices used for filters.
     */
    public static final int[] COLUMN_INDICES = {
        STUDENT_ID,
        SUBJECT,
        NUM_ASSESSMENTS,
        AVERAGE_SCORE,
        ATTENDANCE_PERCENT,
        GRADE,
        TERM
    };

    /**
     * Array of all the individual column names.
     */
    public static final String[] COLUMN_NAMES = { 
        "Student_ID", 
        "Subject", 
        "Assessments", 
        "Average_Score", 
        "Attendance_%", 
        "Grade", 
        "Term" 
    };

    private String subject;
    private int studentId, numAssessments;
    private float averageScore, attendancePercent;
    private Grade grade;
    private Term term;

    /**
     * All possible values of the Grade column.
     */
    public enum Grade {
        /**
         * Represents an A grade.
         */
        A, 
        
        /**
         * Represents a B grade.
         */
        B, 

        /**
         * Represents a C grade.
         */
        C,

        /**
         * Represents a D grade.
         */
        D,

        /**
         * Represents a failing grade.
         */
        F
    }

    /**
     * All possible values of the Term column.
     */
    public enum Term {
        /**
         * Represents Term 1.
         */
        T1,

        /**
         * Represents Term 2.
         */
        T2,

        /**
         * Represents Term 3.
         */
        T3
    }

    /**
     * Constructs a new instance of {@link DataSetEntry}
     *
     * @param row An individual string row in CSV format.
     * @throws IllegalArgumentException Expected at least {@link DataSetEntry#NUM_COLUMNS} arguments, got N.
     * @throws NumberFormatException Invalid entry number type.
     * @throws IllegalArgumentException Student ID cannot be negative.
     * @throws IllegalArgumentException Subject cannot be empty or whitespace!
     * @throws IllegalArgumentException Number of assessments cannot be negative.
     * @throws IllegalArgumentException Average score must be between 1-100!
     * @throws IllegalArgumentException Attendance percent must be between 1-100!
     * @throws IllegalArgumentException No enum constant of {@link Grade}.XX!
     * @throws IllegalArgumentException No enum constant of {@link Term}.XX!
     */
    public DataSetEntry(String row) throws IllegalArgumentException, NumberFormatException {
        var columns = row.split(CSV_DELIM);        
        if (columns.length < NUM_COLUMNS) 
            throw new IllegalArgumentException(String.format("Expected at least %d arguments, got %d!", NUM_COLUMNS, columns.length));

        setStudentId(Integer.parseInt(columns[STUDENT_ID]));               // "Student_ID"
        setSubject(columns[SUBJECT]);                                     // "Subject"
        setNumAssessments(Integer.parseInt(columns[NUM_ASSESSMENTS]));     // "Assessments"
        setAverageScore(Float.parseFloat(columns[AVERAGE_SCORE]));           // "Average_Score"
        setAttendancePercent(Float.parseFloat(columns[ATTENDANCE_PERCENT])); // "Attendance_%"
        setGrade(Grade.valueOf(columns[GRADE]));                          // "Grade"
        setTerm(Term.valueOf(columns[TERM]));                             // "Term"
    }
 
    /**
     * Gets the Student_ID.
     *
     * @return The Student_ID.
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Sets the Student_ID.
     *
     * @param studentId The new Student_ID
     * @throws IllegalArgumentException Student ID cannot be negative.
     */
    public void setStudentId(int studentId) throws IllegalArgumentException {
        if (studentId < 1) throw new IllegalArgumentException("Student ID cannot be negative!");

        this.studentId = studentId;
    }

    /**
     * Gets the Subject.
     *
     * @return The Subject.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the Subject.
     *
     * @param subject The new Subject
     * @throws IllegalArgumentException Subject cannot be empty or whitespace!
     */
    public void setSubject(String subject) throws IllegalArgumentException {
        if (subject.isBlank()) throw new IllegalArgumentException("Subject cannot be empty or whitespace!");

        this.subject = subject;
    }

    /**
     * Gets the Assesments.
     *
     * @return The Assestements.
     */
    public int getNumAssessments() {
        return numAssessments;
    }

    /**
     * Sets the Assessments
     *
     * @param numAssessments The new Assessments.
     * @throws IllegalArgumentException Number of assessments cannot be negative.
     */
    public void setNumAssessments(int numAssessments) throws IllegalArgumentException {
        if (numAssessments < 1) throw new IllegalArgumentException("Number of assessments cannot be negative!");

        this.numAssessments = numAssessments;
    }

    /**
     * Gets the Average_Score.
     *
     * @return The Average_Score.
     */
    public float getAverageScore() {
        return averageScore;
    }

    /**
     * Sets the Average_Score.
     *
     * @param averageScore The new Average_Score.
     * @throws IllegalArgumentException Average score must be between 1-100!
     */
    public void setAverageScore(float averageScore) throws IllegalArgumentException {
        if (averageScore < 1 || averageScore > 100) throw new IllegalArgumentException("Average score must be between 1-100!");

        this.averageScore = averageScore;
    }
    
    /**
     * Gets the Attendance_%.
     *
     * @return The Attendance_%.
     */
    public float getAttendancePercent() {
        return attendancePercent;
    }

    /**
     * Sets the Attendance_%.
     *
     * @param attendancePercent The new Attendance_%.
     * @throws IllegalArgumentException Attendance percent must be between 1-100!
     */
    public void setAttendancePercent(float attendancePercent) throws IllegalArgumentException {
        if (attendancePercent < 1 || attendancePercent > 100) throw new IllegalArgumentException("Attendance percent must be between 1-100!");

        this.attendancePercent = attendancePercent;
    }

    /**
     * Gets the Grade.
     *
     * @return The Grade.
     */
    public Grade getGrade() {
        return grade;
    }

    /**
     * Sets the Grade.
     *
     * @param grade The new Grade.
     */
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    /**
     * Gets the Term.
     *
     * @return The Term.
     */
    public Term getTerm() {
        return term;
    }

    /**
     * Sets the Term.
     *
     * @param term The new Term.
     */
    public void setTerm(Term term) {
        this.term = term;
    }

    /**
     * Gets the column based on the specified column index.
     *
     * @param columnIdx The index of the column from the JTable.
     * @return The stringified value of the column with the specified index.
     * @throws IllegalArgumentException Column index is out of range.
     */
    public String getColumn(int columnIdx) throws IllegalArgumentException {
        switch (columnIdx) {
            case STUDENT_ID -> {
                return String.valueOf(getStudentId());
            }
            case SUBJECT -> {
                return getSubject();
            }
            case NUM_ASSESSMENTS -> {
                return String.valueOf(getNumAssessments());
            }
            case AVERAGE_SCORE -> {
                return String.valueOf(getAverageScore());
            }
            case ATTENDANCE_PERCENT -> {
                return String.valueOf(getAttendancePercent());
            }
            case GRADE -> {
                return String.valueOf(getGrade());
            }
            case TERM -> {
                return String.valueOf(getTerm());
            }
            default -> throw new IllegalArgumentException("Column index out of range.");
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return String.format(
            "%d,%s,%d,%f,%f,%s,%s",
            getStudentId(),
            getSubject(),
            getNumAssessments(),
            getAverageScore(),
            getAttendancePercent(),
            getGrade(),
            getTerm()
        );
    }
}
