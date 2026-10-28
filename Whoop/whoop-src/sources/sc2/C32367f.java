package sc2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sc2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lsc2/f;", "", "", "animation", "Lsc2/g;", "state", "<init>", "(ILsc2/g;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lsc2/g;", "()Lsc2/g;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32367f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int animation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC32368g state;

    public C32367f(int i13, EnumC32368g state) {
        AbstractC22676k.m65750j(state, "state");
        this.animation = i13;
        this.state = state;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAnimation() {
        return this.animation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC32368g getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32367f)) {
            return false;
        }
        C32367f c32367f = (C32367f) other;
        return this.animation == c32367f.animation && this.state == c32367f.state;
    }

    public int hashCode() {
        return this.state.hashCode() + (Integer.hashCode(this.animation) * 31);
    }

    public String toString() {
        return "StrapAnimation(animation=" + this.animation + ", state=" + this.state + ")";
    }
}
