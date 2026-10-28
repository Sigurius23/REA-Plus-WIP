package p133f1;

import java.util.ArrayList;
import p002a0.AbstractC0056v;
import p002a0.C0029i0;
import p635y2.InterfaceC39147y;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: f1.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13973r0 {

    /* JADX INFO: renamed from: a */
    public final long f49821a;

    /* JADX INFO: renamed from: b */
    public final long f49822b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC39147y f49823c;

    /* JADX INFO: renamed from: d */
    public final boolean f49824d;

    /* JADX INFO: renamed from: e */
    public final C13981u f49825e;

    /* JADX INFO: renamed from: f */
    public final C13982u0 f49826f;

    /* JADX INFO: renamed from: g */
    public final C0029i0 f49827g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f49828h;

    /* JADX INFO: renamed from: i */
    public int f49829i;

    /* JADX INFO: renamed from: j */
    public int f49830j;

    /* JADX INFO: renamed from: k */
    public int f49831k;

    public C13973r0(long j7, long j13, InterfaceC39147y interfaceC39147y, boolean z4, C13981u c13981u, C13982u0 c13982u0) {
        this.f49821a = j7;
        this.f49822b = j13;
        this.f49823c = interfaceC39147y;
        this.f49824d = z4;
        this.f49825e = c13981u;
        this.f49826f = c13982u0;
        int i13 = AbstractC0056v.f169a;
        this.f49827g = new C0029i0(6);
        this.f49828h = new ArrayList();
        this.f49829i = -1;
        this.f49830j = -1;
        this.f49831k = -1;
    }

    /* JADX INFO: renamed from: a */
    public final int m39770a(int i13, EnumC13942h enumC13942h, EnumC13942h enumC13942h2) {
        if (i13 == -1) {
            int iOrdinal = AbstractC13994y0.m39836y(enumC13942h, enumC13942h2).ordinal();
            if (iOrdinal == 0) {
                return this.f49831k - 1;
            }
            if (iOrdinal == 1) {
                return this.f49831k;
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i13;
    }
}
