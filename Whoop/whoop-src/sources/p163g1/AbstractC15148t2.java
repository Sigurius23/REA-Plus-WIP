package p163g1;

import l83.C23454a0;
import p077d0.AbstractC11333b0;
import p077d0.C11344e;
import p077d0.C11347e2;
import p077d0.C11407v;
import p238j0.C21076b;
import p238j0.C21078d;
import p238j0.C21080f;
import p238j0.C21086l;
import p238j0.InterfaceC21082h;
import p636y3.C39174f;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.t2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15148t2 {

    /* JADX INFO: renamed from: a */
    public static final C11347e2 f56814a = new C11347e2(120, AbstractC11333b0.f36310a, 2);

    /* JADX INFO: renamed from: b */
    public static final C11347e2 f56815b = new C11347e2(150, new C11407v(0.4f, 0.0f, 0.6f, 1.0f), 2);

    /* JADX INFO: renamed from: c */
    public static final C11347e2 f56816c = new C11347e2(120, new C11407v(0.4f, 0.0f, 0.6f, 1.0f), 2);

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 d0.e2) = (r1v0 d0.e2), (r1v0 d0.e2), (r1v0 d0.e2), (r1v4 d0.e2), (r1v4 d0.e2), (r1v4 d0.e2), (r1v4 d0.e2) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final Object m43191a(C11344e c11344e, float f13, InterfaceC21082h interfaceC21082h, InterfaceC21082h interfaceC21082h2, AbstractC32269c abstractC32269c) {
        C11347e2 c11347e2;
        C11347e2 c11347e3 = null;
        if (interfaceC21082h2 != null) {
            boolean z4 = interfaceC21082h2 instanceof C21086l;
            c11347e2 = f56814a;
            if (z4 || (interfaceC21082h2 instanceof C21076b) || (interfaceC21082h2 instanceof C21080f) || (interfaceC21082h2 instanceof C21078d)) {
                c11347e3 = c11347e2;
            }
        } else if (interfaceC21082h != null) {
            boolean z13 = interfaceC21082h instanceof C21086l;
            c11347e2 = f56815b;
            if (z13 || (interfaceC21082h instanceof C21076b)) {
                c11347e3 = c11347e2;
            } else if (interfaceC21082h instanceof C21080f) {
                c11347e3 = f56816c;
            } else if (interfaceC21082h instanceof C21078d) {
                c11347e3 = c11347e2;
            }
        }
        C11347e2 c11347e4 = c11347e3;
        if (c11347e4 != null) {
            Object objM30547d = C11344e.m30547d(c11344e, new C39174f(f13), c11347e4, null, abstractC32269c, 12);
            if (objM30547d == EnumC31071a.f128113w) {
                return objM30547d;
            }
        } else {
            Object objM30551g = c11344e.m30551g(new C39174f(f13), abstractC32269c);
            if (objM30551g == EnumC31071a.f128113w) {
                return objM30551g;
            }
        }
        return C23454a0.f92919a;
    }
}
