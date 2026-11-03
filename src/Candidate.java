public class Candidate {
    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;
    private String[] skills;

    // Constructor
    public Candidate(String name, double percentage, int backlogs, int graduationYear, String[] skills) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    // Skill check method
    public boolean hasSkill(String skill) {
        if (skills == null) {
            return false;
        }
        for (int i = 0; i < skills.length; i++) {
            if (skills[i].equalsIgnoreCase(skill)) {
                return true;
            }
        }
        return false;
    }
}