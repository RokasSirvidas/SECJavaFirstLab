package org.rokassirvidas.firstlab.mybatis.model;

public class Worker {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.WORKER.ID
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.WORKER.BRANCH_ID
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    private Long branchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.WORKER.NAME
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.WORKER.SURNAME
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    private String surname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.WORKER.AGE
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.WORKER.ID
     *
     * @return the value of PUBLIC.WORKER.ID
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.WORKER.ID
     *
     * @param id the value for PUBLIC.WORKER.ID
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.WORKER.BRANCH_ID
     *
     * @return the value of PUBLIC.WORKER.BRANCH_ID
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public Long getBranchId() {
        return branchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.WORKER.BRANCH_ID
     *
     * @param branchId the value for PUBLIC.WORKER.BRANCH_ID
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.WORKER.NAME
     *
     * @return the value of PUBLIC.WORKER.NAME
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.WORKER.NAME
     *
     * @param name the value for PUBLIC.WORKER.NAME
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.WORKER.SURNAME
     *
     * @return the value of PUBLIC.WORKER.SURNAME
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.WORKER.SURNAME
     *
     * @param surname the value for PUBLIC.WORKER.SURNAME
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.WORKER.AGE
     *
     * @return the value of PUBLIC.WORKER.AGE
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.WORKER.AGE
     *
     * @param age the value for PUBLIC.WORKER.AGE
     *
     * @mbg.generated Wed Apr 17 14:15:43 EEST 2024
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}