package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class TaskOptions implements Serializable {
    private final long delay;
    private final TaskPriority priority;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TaskOptions(long j7, TaskPriority taskPriority) {
        this.delay = j7;
        this.priority = taskPriority;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskOptions taskOptions = (TaskOptions) obj;
        return this.delay == taskOptions.delay && Objects.equals(this.priority, taskOptions.priority);
    }

    public long getDelay() {
        return this.delay;
    }

    public TaskPriority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.delay), this.priority);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[delay: ");
        AbstractC3855a.m11836t(this.delay, ", priority: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.priority));
        sb4.append("]");
        return sb4.toString();
    }

    public TaskOptions(long j7) {
        this.delay = j7;
        this.priority = TaskPriority.DEFAULT;
    }
}
