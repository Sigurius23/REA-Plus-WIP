package x93;

import java.lang.annotation.Annotation;
import java.util.Collection;
import ma3.InterfaceC25373b;
import ma3.InterfaceC25376e;
import p000.AbstractC11266d;
import p482s7.AbstractC32237a;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: x93.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C38110c0 extends AbstractC38126r implements InterfaceC25373b {

    /* JADX INFO: renamed from: a */
    public final AbstractC38106a0 f163215a;

    /* JADX INFO: renamed from: b */
    public final Annotation[] f163216b;

    /* JADX INFO: renamed from: c */
    public final String f163217c;

    /* JADX INFO: renamed from: d */
    public final boolean f163218d;

    public C38110c0(AbstractC38106a0 abstractC38106a0, Annotation[] reflectAnnotations, String str, boolean z4) {
        AbstractC22676k.m65750j(reflectAnnotations, "reflectAnnotations");
        this.f163215a = abstractC38106a0;
        this.f163216b = reflectAnnotations;
        this.f163217c = str;
        this.f163218d = z4;
    }

    @Override // ma3.InterfaceC25373b
    /* JADX INFO: renamed from: a */
    public final C38111d mo74422a(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        return AbstractC32237a.m100291e(this.f163216b, fqName);
    }

    /* JADX INFO: renamed from: b */
    public final C35850h m122093b() {
        String str = this.f163217c;
        if (str != null) {
            return C35850h.m113813d(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC25376e m122094c() {
        return this.f163215a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m122095d() {
        return this.f163218d;
    }

    @Override // ma3.InterfaceC25373b
    public final Collection getAnnotations() {
        return AbstractC32237a.m100292f(this.f163216b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        AbstractC11266d.m30443A(C38110c0.class, sb4, ": ");
        sb4.append(this.f163218d ? "vararg " : "");
        sb4.append(m122093b());
        sb4.append(": ");
        sb4.append(this.f163215a);
        return sb4.toString();
    }
}
