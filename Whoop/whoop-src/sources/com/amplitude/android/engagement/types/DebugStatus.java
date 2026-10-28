package com.amplitude.android.engagement.types;

import aa3.C0656u0;
import androidx.compose.runtime.Composer;
import com.squareup.wire.AbstractC5583n;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p035bp.AbstractC3511b;
import p208i2.C17875c1;
import p208i2.C17919x;
import p305lj.AbstractC24432i;
import p305lj.C24418b;
import p305lj.C24430h;
import p355o2.AbstractC27433f0;
import p355o2.C27428d;
import p355o2.C27430e;
import p355o2.C27444o;
import p390p1.C28655q;
import p525uj.AbstractC35029g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import q83.AbstractC30060g;
import wc3.InterfaceC37144i;
import x30.AbstractC37926s0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/DebugStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Lo2/e;", "getIcon", "(Landroidx/compose/runtime/Composer;I)Lo2/e;", "icon", "Li2/x;", "getColor", "(Landroidx/compose/runtime/Composer;I)J", "color", "Companion", "lj/h", "SUCCESS", "WARNING", "INFO", "ERROR", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public enum DebugStatus {
    SUCCESS,
    WARNING,
    INFO,
    ERROR;

    public static final C24430h Companion = new C24430h();
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, C24418b.f95287F);

    public final long getColor(Composer composer, int i13) {
        long j7;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(-1904122221);
        int i14 = AbstractC24432i.f95321a[ordinal()];
        if (i14 == 1) {
            float f13 = AbstractC35029g.f148252a;
            j7 = AbstractC35029g.f148264m;
        } else if (i14 == 2) {
            float f14 = AbstractC35029g.f148252a;
            j7 = AbstractC35029g.f148265n;
        } else if (i14 == 3) {
            float f15 = AbstractC35029g.f148252a;
            j7 = AbstractC35029g.f148268q;
        } else {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i15 = C17919x.f69638o;
            j7 = C17919x.f69630g;
        }
        c28655q.m87173q(false);
        return j7;
    }

    public final C27430e getIcon(Composer composer, int i13) {
        C27430e c27430eM82859b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(197422888);
        int i14 = AbstractC24432i.f95321a[ordinal()];
        if (i14 == 1) {
            c27430eM82859b = AbstractC37926s0.f162382a;
            if (c27430eM82859b == null) {
                C27428d c27428d = new C27428d("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i15 = AbstractC27433f0.f110561a;
                C17875c1 c17875c1 = new C17875c1(C17919x.f69625b);
                C0656u0 c0656u0 = new C0656u0(5);
                ArrayList arrayList = c0656u0.f2286a;
                c0656u0.m1651t(12.0f, 2.0f);
                c0656u0.m1641j(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                c0656u0.m1652u(4.48f, 10.0f, 10.0f, 10.0f);
                c0656u0.m1652u(10.0f, -4.48f, 10.0f, -10.0f);
                arrayList.add(new C27444o(17.52f, 2.0f, 12.0f, 2.0f));
                c0656u0.m1640i();
                c0656u0.m1651t(10.0f, 17.0f);
                c0656u0.m1650s(-5.0f, -5.0f);
                c0656u0.m1650s(1.41f, -1.41f);
                c0656u0.m1649r(10.0f, 14.17f);
                c0656u0.m1650s(7.59f, -7.59f);
                c0656u0.m1649r(19.0f, 8.0f);
                c0656u0.m1650s(-9.0f, 9.0f);
                c0656u0.m1640i();
                C27428d.m82858a(c27428d, arrayList, c17875c1);
                c27430eM82859b = c27428d.m82859b();
                AbstractC37926s0.f162382a = c27430eM82859b;
            }
        } else if (i14 == 2) {
            c27430eM82859b = AbstractC20301a.f76207a;
            if (c27430eM82859b == null) {
                C27428d c27428d2 = new C27428d("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i16 = AbstractC27433f0.f110561a;
                C17875c1 c17875c2 = new C17875c1(C17919x.f69625b);
                C0656u0 c0656u1 = new C0656u0(5);
                c0656u1.m1651t(1.0f, 21.0f);
                c0656u1.m1648q(22.0f);
                c0656u1.m1649r(12.0f, 2.0f);
                c0656u1.m1649r(1.0f, 21.0f);
                c0656u1.m1640i();
                c0656u1.m1651t(13.0f, 18.0f);
                c0656u1.m1648q(-2.0f);
                c0656u1.m1653v(-2.0f);
                c0656u1.m1648q(2.0f);
                c0656u1.m1653v(2.0f);
                c0656u1.m1640i();
                c0656u1.m1651t(13.0f, 14.0f);
                c0656u1.m1648q(-2.0f);
                c0656u1.m1653v(-4.0f);
                c0656u1.m1648q(2.0f);
                c0656u1.m1653v(4.0f);
                c0656u1.m1640i();
                C27428d.m82858a(c27428d2, c0656u1.f2286a, c17875c2);
                c27430eM82859b = c27428d2.m82859b();
                AbstractC20301a.f76207a = c27430eM82859b;
            }
        } else if (i14 == 3) {
            c27430eM82859b = AbstractC5583n.m16749H();
        } else {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c27430eM82859b = AbstractC3511b.f13987z;
            if (c27430eM82859b == null) {
                C27428d c27428d3 = new C27428d("Filled.Error", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i17 = AbstractC27433f0.f110561a;
                C17875c1 c17875c3 = new C17875c1(C17919x.f69625b);
                C0656u0 c0656u2 = new C0656u0(5);
                ArrayList arrayList2 = c0656u2.f2286a;
                c0656u2.m1651t(12.0f, 2.0f);
                c0656u2.m1641j(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                c0656u2.m1652u(4.48f, 10.0f, 10.0f, 10.0f);
                c0656u2.m1652u(10.0f, -4.48f, 10.0f, -10.0f);
                arrayList2.add(new C27444o(17.52f, 2.0f, 12.0f, 2.0f));
                c0656u2.m1640i();
                c0656u2.m1651t(13.0f, 17.0f);
                c0656u2.m1648q(-2.0f);
                c0656u2.m1653v(-2.0f);
                c0656u2.m1648q(2.0f);
                c0656u2.m1653v(2.0f);
                c0656u2.m1640i();
                c0656u2.m1651t(13.0f, 13.0f);
                c0656u2.m1648q(-2.0f);
                c0656u2.m1649r(11.0f, 7.0f);
                c0656u2.m1648q(2.0f);
                c0656u2.m1653v(6.0f);
                c0656u2.m1640i();
                C27428d.m82858a(c27428d3, arrayList2, c17875c3);
                c27430eM82859b = c27428d3.m82859b();
                AbstractC3511b.f13987z = c27430eM82859b;
            }
        }
        c28655q.m87173q(false);
        return c27430eM82859b;
    }
}
