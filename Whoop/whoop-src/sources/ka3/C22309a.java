package ka3;

import java.util.Set;
import lb3.AbstractC23763c0;
import lb3.EnumC23761b1;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31165x0;

/* JADX INFO: renamed from: ka3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22309a {

    /* JADX INFO: renamed from: a */
    public final EnumC23761b1 f87065a;

    /* JADX INFO: renamed from: b */
    public final EnumC22310b f87066b;

    /* JADX INFO: renamed from: c */
    public final boolean f87067c;

    /* JADX INFO: renamed from: d */
    public final boolean f87068d;

    /* JADX INFO: renamed from: e */
    public final Set f87069e;

    /* JADX INFO: renamed from: f */
    public final AbstractC23763c0 f87070f;

    public C22309a(EnumC23761b1 enumC23761b1, EnumC22310b enumC22310b, boolean z4, boolean z13, Set set, AbstractC23763c0 abstractC23763c0) {
        this.f87065a = enumC23761b1;
        this.f87066b = enumC22310b;
        this.f87067c = z4;
        this.f87068d = z13;
        this.f87069e = set;
        this.f87070f = abstractC23763c0;
    }

    /* JADX INFO: renamed from: a */
    public static C22309a m64108a(C22309a c22309a, EnumC22310b enumC22310b, boolean z4, Set set, AbstractC23763c0 abstractC23763c0, int i13) {
        EnumC23761b1 howThisTypeIsUsed = c22309a.f87065a;
        if ((i13 & 2) != 0) {
            enumC22310b = c22309a.f87066b;
        }
        EnumC22310b flexibility = enumC22310b;
        if ((i13 & 4) != 0) {
            z4 = c22309a.f87067c;
        }
        boolean z13 = z4;
        boolean z14 = c22309a.f87068d;
        if ((i13 & 16) != 0) {
            set = c22309a.f87069e;
        }
        Set set2 = set;
        if ((i13 & 32) != 0) {
            abstractC23763c0 = c22309a.f87070f;
        }
        AbstractC22676k.m65750j(howThisTypeIsUsed, "howThisTypeIsUsed");
        AbstractC22676k.m65750j(flexibility, "flexibility");
        return new C22309a(howThisTypeIsUsed, flexibility, z13, z14, set2, abstractC23763c0);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC23763c0 m64109b() {
        return this.f87070f;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC22310b m64110c() {
        return this.f87066b;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC23761b1 m64111d() {
        return this.f87065a;
    }

    /* JADX INFO: renamed from: e */
    public final Set m64112e() {
        return this.f87069e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22309a)) {
            return false;
        }
        C22309a c22309a = (C22309a) obj;
        return AbstractC22676k.m65745e(c22309a.f87070f, this.f87070f) && c22309a.f87065a == this.f87065a && c22309a.f87066b == this.f87066b && c22309a.f87067c == this.f87067c && c22309a.f87068d == this.f87068d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m64113f() {
        return this.f87068d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m64114g() {
        return this.f87067c;
    }

    /* JADX INFO: renamed from: h */
    public final C22309a m64115h(boolean z4) {
        return m64108a(this, null, z4, null, null, 59);
    }

    public final int hashCode() {
        AbstractC23763c0 abstractC23763c0 = this.f87070f;
        int iHashCode = abstractC23763c0 != null ? abstractC23763c0.hashCode() : 0;
        int iHashCode2 = this.f87065a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f87066b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i13 = (iHashCode3 * 31) + (this.f87067c ? 1 : 0) + iHashCode3;
        return (i13 * 31) + (this.f87068d ? 1 : 0) + i13;
    }

    /* JADX INFO: renamed from: i */
    public final C22309a m64116i(EnumC22310b enumC22310b) {
        return m64108a(this, enumC22310b, false, null, null, 61);
    }

    /* JADX INFO: renamed from: j */
    public final C22309a m64117j(InterfaceC31165x0 interfaceC31165x0) {
        Set set = this.f87069e;
        return m64108a(this, null, false, set != null ? AbstractC12350b.m34555D(interfaceC31165x0, set) : AbstractC12350b.m34570S(interfaceC31165x0), null, 47);
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f87065a + ", flexibility=" + this.f87066b + ", isRaw=" + this.f87067c + ", isForAnnotationParameter=" + this.f87068d + ", visitedTypeParameters=" + this.f87069e + ", defaultType=" + this.f87070f + ')';
    }

    public /* synthetic */ C22309a(EnumC23761b1 enumC23761b1, boolean z4, boolean z13, Set set, int i13) {
        this(enumC23761b1, EnumC22310b.f87071w, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : set, null);
    }
}
