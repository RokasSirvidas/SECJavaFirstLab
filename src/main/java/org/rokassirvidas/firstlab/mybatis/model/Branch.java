package org.rokassirvidas.firstlab.mybatis.model;

public class Branch {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BRANCH.ID
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BRANCH.NAME
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BRANCH.ID
     *
     * @return the value of PUBLIC.BRANCH.ID
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BRANCH.ID
     *
     * @param id the value for PUBLIC.BRANCH.ID
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BRANCH.NAME
     *
     * @return the value of PUBLIC.BRANCH.NAME
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BRANCH.NAME
     *
     * @param name the value for PUBLIC.BRANCH.NAME
     *
     * @mbg.generated Wed Apr 17 15:14:00 EEST 2024
     */
    public void setName(String name) {
        this.name = name;
    }
}