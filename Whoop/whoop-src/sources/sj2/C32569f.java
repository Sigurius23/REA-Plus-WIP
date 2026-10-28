package sj2;

import bc3.InterfaceC3018i0;
import bc3.InterfaceC3055s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sj2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001e\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b\u001b\u0010%¨\u0006&"}, m65681d2 = {"Lsj2/f;", "R", "", "", "tag", "Lsj2/a;", "executionPriority", "Lsj2/e;", "task", "Lbc3/i0;", "internalTaskJob", "Lbc3/s;", "externalTaskJob", "<init>", "(Ljava/lang/String;Lsj2/a;Lsj2/e;Lbc3/i0;Lbc3/s;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lsj2/a;", "()Lsj2/a;", "c", "Lsj2/e;", "e", "()Lsj2/e;", "Lbc3/i0;", "()Lbc3/i0;", "Lbc3/s;", "()Lbc3/s;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32569f<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC32564a executionPriority;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32568e<R> task;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC3018i0 internalTaskJob;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC3055s externalTaskJob;

    public C32569f(String tag, InterfaceC32564a executionPriority, C32568e<R> task, InterfaceC3018i0 internalTaskJob, InterfaceC3055s externalTaskJob) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(executionPriority, "executionPriority");
        AbstractC22676k.m65750j(task, "task");
        AbstractC22676k.m65750j(internalTaskJob, "internalTaskJob");
        AbstractC22676k.m65750j(externalTaskJob, "externalTaskJob");
        this.tag = tag;
        this.executionPriority = executionPriority;
        this.task = task;
        this.internalTaskJob = internalTaskJob;
        this.externalTaskJob = externalTaskJob;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC32564a getExecutionPriority() {
        return this.executionPriority;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC3055s getExternalTaskJob() {
        return this.externalTaskJob;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC3018i0 getInternalTaskJob() {
        return this.internalTaskJob;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: e */
    public final C32568e<R> m101619e() {
        return this.task;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32569f)) {
            return false;
        }
        C32569f c32569f = (C32569f) other;
        return AbstractC22676k.m65745e(this.tag, c32569f.tag) && AbstractC22676k.m65745e(this.executionPriority, c32569f.executionPriority) && AbstractC22676k.m65745e(this.task, c32569f.task) && AbstractC22676k.m65745e(this.internalTaskJob, c32569f.internalTaskJob) && AbstractC22676k.m65745e(this.externalTaskJob, c32569f.externalTaskJob);
    }

    public int hashCode() {
        return this.externalTaskJob.hashCode() + ((this.internalTaskJob.hashCode() + ((this.task.hashCode() + ((this.executionPriority.hashCode() + (this.tag.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "TaskData(tag=" + this.tag + ", executionPriority=" + this.executionPriority + ", task=" + this.task + ", internalTaskJob=" + this.internalTaskJob + ", externalTaskJob=" + this.externalTaskJob + ")";
    }
}
