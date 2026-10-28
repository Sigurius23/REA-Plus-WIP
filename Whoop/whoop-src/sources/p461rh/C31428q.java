package p461rh;

import android.content.Context;
import fi.C14500f;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rh.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C31428q {

    /* JADX INFO: renamed from: a */
    public final Context f129301a;

    /* JADX INFO: renamed from: b */
    public final C14500f f129302b;

    /* JADX INFO: renamed from: c */
    public final C23470p f129303c;

    /* JADX INFO: renamed from: d */
    public final C23470p f129304d;

    /* JADX INFO: renamed from: e */
    public final C31415d f129305e;

    public C31428q(Context context, C14500f c14500f, C23470p c23470p, C23470p c23470p2, C31415d c31415d) {
        this.f129301a = context;
        this.f129302b = c14500f;
        this.f129303c = c23470p;
        this.f129304d = c23470p2;
        this.f129305e = c31415d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31428q)) {
            return false;
        }
        C31428q c31428q = (C31428q) obj;
        if (!AbstractC22676k.m65745e(this.f129301a, c31428q.f129301a) || !this.f129302b.equals(c31428q.f129302b) || !this.f129303c.equals(c31428q.f129303c) || !this.f129304d.equals(c31428q.f129304d)) {
            return false;
        }
        Object obj2 = C31418g.f129284a;
        return obj2.equals(obj2) && this.f129305e.equals(c31428q.f129305e);
    }

    public final int hashCode() {
        return (this.f129305e.hashCode() + ((C31418g.f129284a.hashCode() + ((this.f129304d.hashCode() + ((this.f129303c.hashCode() + ((this.f129302b.hashCode() + (this.f129301a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.f129301a + ", defaults=" + this.f129302b + ", memoryCacheLazy=" + this.f129303c + ", diskCacheLazy=" + this.f129304d + ", eventListenerFactory=" + C31418g.f129284a + ", componentRegistry=" + this.f129305e + ", logger=null)";
    }
}
