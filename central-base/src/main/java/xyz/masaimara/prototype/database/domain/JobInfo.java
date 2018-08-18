package xyz.masaimara.prototype.database.domain;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

public class JobInfo implements Serializable {
    private String jobName="";

    public String getJobName() {
        return jobName;
    }

    public JobInfo setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("jobName", jobName)
                .toString();
    }
}
