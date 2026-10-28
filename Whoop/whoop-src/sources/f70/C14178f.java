package f70;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f70.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lf70/f;", "", "Lf70/e$b;", "result", "", "shouldMoveForward", "<init>", "(Lf70/e$b;Z)V", "a", "()Lf70/e$b;", "b", "()Z", "c", "(Lf70/e$b;Z)Lf70/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lf70/e$b;", "e", "Z", "f", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14178f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14176e.b result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean shouldMoveForward;

    public C14178f(InterfaceC14176e.b result, boolean z4) {
        AbstractC22676k.m65750j(result, "result");
        this.result = result;
        this.shouldMoveForward = z4;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C14178f m40437d(C14178f c14178f, InterfaceC14176e.b bVar, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bVar = c14178f.result;
        }
        if ((i13 & 2) != 0) {
            z4 = c14178f.shouldMoveForward;
        }
        return c14178f.m40440c(bVar, z4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC14176e.b getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldMoveForward() {
        return this.shouldMoveForward;
    }

    /* JADX INFO: renamed from: c */
    public final C14178f m40440c(InterfaceC14176e.b result, boolean shouldMoveForward) {
        AbstractC22676k.m65750j(result, "result");
        return new C14178f(result, shouldMoveForward);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC14176e.b m40441e() {
        return this.result;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14178f)) {
            return false;
        }
        C14178f c14178f = (C14178f) other;
        return AbstractC22676k.m65745e(this.result, c14178f.result) && this.shouldMoveForward == c14178f.shouldMoveForward;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m40442f() {
        return this.shouldMoveForward;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldMoveForward) + (this.result.hashCode() * 31);
    }

    public String toString() {
        return "ActivationDomainResultWrapper(result=" + this.result + ", shouldMoveForward=" + this.shouldMoveForward + ")";
    }
}
