package ed3;

import dd3.C11972a;
import dd3.EnumC11973b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ed3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C13133q extends C13129m {

    /* JADX INFO: renamed from: k */
    public int f45432k;

    /* JADX INFO: renamed from: l */
    public final long f45433l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13133q(C11972a c11972a, C13131o c13131o, long j7, InterfaceC39443g descriptor) {
        super(c11972a, c13131o, descriptor);
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f45432k = -1;
        if (j7 == 19500) {
            int iM36742c = c13131o.m36742c(EnumC11973b.DEFAULT);
            if (iM36742c < 0) {
                throw new IllegalArgumentException(("Expected positive length for " + descriptor + ", but got " + iM36742c).toString());
            }
            j7 = -iM36742c;
        }
        this.f45433l = j7;
    }

    @Override // ed3.C13129m
    /* JADX INFO: renamed from: T */
    public final long mo36721T(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        long j7 = this.f45433l;
        if (j7 > 0) {
            return j7;
        }
        return 19500L;
    }

    @Override // ed3.C13129m, zc3.InterfaceC40539b
    public final int decodeElementIndex(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        long j7 = this.f45433l;
        C13131o c13131o = this.f45409d;
        if (j7 > 0) {
            if ((this.f45432k == -1 ? c13131o.f45421b : c13131o.m36757r()) == ((int) (j7 & 2147483647L))) {
                int i13 = this.f45432k + 1;
                this.f45432k = i13;
                return i13;
            }
            c13131o.f45423d = true;
            int i14 = (c13131o.f45421b << 3) | ((EnumC13128l) c13131o.f45425f).f45407w;
            c13131o.m36759t(c13131o.f45422c);
            c13131o.f45422c = i14;
            return -1;
        }
        long j13 = -j7;
        int i15 = this.f45432k + 1;
        this.f45432k = i15;
        if (i15 == j13) {
            return -1;
        }
        if (!c13131o.f45423d) {
            C13117a c13117a = (C13117a) c13131o.f45424e;
            if (c13117a.f45382b - c13117a.f45383c == 0) {
                return -1;
            }
        }
        return i15;
    }
}
