package ef1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ef1.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lef1/f;", "", "Lef1/c$b;", "modifiedState", "", "isScrubbing", "<init>", "(Lef1/c$b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lef1/c$b;", "()Lef1/c$b;", "b", "Z", "()Z", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13150f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13147c.b modifiedState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isScrubbing;

    public C13150f(C13147c.b bVar, boolean z4) {
        this.modifiedState = bVar;
        this.isScrubbing = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C13147c.b getModifiedState() {
        return this.modifiedState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsScrubbing() {
        return this.isScrubbing;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13150f)) {
            return false;
        }
        C13150f c13150f = (C13150f) other;
        return AbstractC22676k.m65745e(this.modifiedState, c13150f.modifiedState) && this.isScrubbing == c13150f.isScrubbing;
    }

    public int hashCode() {
        C13147c.b bVar = this.modifiedState;
        return Boolean.hashCode(this.isScrubbing) + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public String toString() {
        return "ScrubResult(modifiedState=" + this.modifiedState + ", isScrubbing=" + this.isScrubbing + ")";
    }
}
