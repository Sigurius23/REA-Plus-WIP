package p105e1;

import p031b9.AbstractC2875y;
import p294l3.C23254g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e1.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C12528o {

    /* JADX INFO: renamed from: a */
    public final C23254g f42795a;

    /* JADX INFO: renamed from: b */
    public C23254g f42796b;

    /* JADX INFO: renamed from: c */
    public boolean f42797c = false;

    /* JADX INFO: renamed from: d */
    public C12518e f42798d = null;

    public C12528o(C23254g c23254g, C23254g c23254g2) {
        this.f42795a = c23254g;
        this.f42796b = c23254g2;
    }

    /* JADX INFO: renamed from: a */
    public final C12518e m35191a() {
        return this.f42798d;
    }

    /* JADX INFO: renamed from: b */
    public final C23254g m35192b() {
        return this.f42795a;
    }

    /* JADX INFO: renamed from: c */
    public final C23254g m35193c() {
        return this.f42796b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m35194d() {
        return this.f42797c;
    }

    /* JADX INFO: renamed from: e */
    public final void m35195e(C12518e c12518e) {
        this.f42798d = c12518e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12528o)) {
            return false;
        }
        C12528o c12528o = (C12528o) obj;
        return AbstractC22676k.m65745e(this.f42795a, c12528o.f42795a) && AbstractC22676k.m65745e(this.f42796b, c12528o.f42796b) && this.f42797c == c12528o.f42797c && AbstractC22676k.m65745e(this.f42798d, c12528o.f42798d);
    }

    /* JADX INFO: renamed from: f */
    public final void m35196f(boolean z4) {
        this.f42797c = z4;
    }

    /* JADX INFO: renamed from: g */
    public final void m35197g(C23254g c23254g) {
        this.f42796b = c23254g;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.f42796b.hashCode() + (this.f42795a.hashCode() * 31)) * 31, 31, this.f42797c);
        C12518e c12518e = this.f42798d;
        return iM8289b + (c12518e == null ? 0 : c12518e.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f42795a) + ", substitution=" + ((Object) this.f42796b) + ", isShowingSubstitution=" + this.f42797c + ", layoutCache=" + this.f42798d + ')';
    }
}
