package ea3;

import ca3.C4377d;
import ca3.InterfaceC4381h;
import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ea3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C12936g implements InterfaceC4381h {

    /* JADX INFO: renamed from: c */
    public static final C4377d f44667c = new C4377d(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12936g.class));

    /* JADX INFO: renamed from: a */
    public boolean f44668a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f44669b = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C12936g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension");
        C12936g c12936g = (C12936g) obj;
        return this.f44668a == c12936g.f44668a && AbstractC22676k.m65745e(this.f44669b, c12936g.f44669b);
    }

    @Override // ca3.InterfaceC4376c
    public final C4377d getType() {
        return f44667c;
    }

    public final int hashCode() {
        return this.f44669b.hashCode() + (Boolean.hashCode(this.f44668a) * 31);
    }
}
