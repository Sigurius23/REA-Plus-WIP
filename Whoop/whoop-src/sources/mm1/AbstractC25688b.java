package mm1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import f11.AbstractC14004d;
import f11.C14002b;
import f11.C14005e;
import f11.C14006f;
import f11.C14007g;
import f11.C14008h;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import j21.C21245d;
import java.util.List;
import l83.C23454a0;
import lq0.C24656d;
import m01.C24875c;
import mi2.C25592o;
import ny0.C27246d;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p717lq2.C24671c;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: mm1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\"\u0010\u0015\u001a\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lmm1/c;", "mciTileState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Lmm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lf11/h;", "a", "Ljava/util/List;", "getSampleStateTickMarksDefaults", "()Ljava/util/List;", "sampleStateTickMarksDefaults", "b", "Lmm1/c;", "getSampleMciHomeTile", "()Lmm1/c;", "setSampleMciHomeTile", "(Lmm1/c;)V", "sampleMciHomeTile", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25688b {

    /* JADX INFO: renamed from: a */
    private static final List<C14008h> f101173a;

    /* JADX INFO: renamed from: b */
    private static C25689c f101174b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC39333f enumC39333f = EnumC39333f.MCI_RED;
        C14008h c14008h = new C14008h(enumC39333f, false, null, 6, null);
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z4 = false;
        EnumC39333f enumC39333f2 = null;
        C14008h c14008h2 = new C14008h(enumC39333f, z4, enumC39333f2, i13, defaultConstructorMarker);
        C14008h c14008h3 = new C14008h(enumC39333f, z4, enumC39333f2, i13, defaultConstructorMarker);
        C14008h c14008h4 = new C14008h(enumC39333f, z4, enumC39333f2, i13, defaultConstructorMarker);
        C14008h c14008h5 = new C14008h(enumC39333f, z4, enumC39333f2, i13, defaultConstructorMarker);
        EnumC39333f enumC39333f3 = EnumC39333f.SLEEP_LIGHT_SLEEP;
        int i14 = 6;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z13 = false;
        EnumC39333f enumC39333f4 = null;
        C14008h c14008h6 = new C14008h(enumC39333f3, z13, enumC39333f4, i14, defaultConstructorMarker2);
        C14008h c14008h7 = new C14008h(enumC39333f3, z13, enumC39333f4, i14, defaultConstructorMarker2);
        C14008h c14008h8 = new C14008h(enumC39333f3, z13, enumC39333f4, i14, defaultConstructorMarker2);
        C14008h c14008h9 = new C14008h(enumC39333f3, z13, enumC39333f4, i14, defaultConstructorMarker2);
        C14008h c14008h10 = new C14008h(enumC39333f3, z13, enumC39333f4, i14, defaultConstructorMarker2);
        C14008h c14008h11 = new C14008h(enumC39333f3, z13, enumC39333f4, i14, defaultConstructorMarker2);
        C14008h c14008h12 = new C14008h(enumC39333f3, z13, enumC39333f4, i14, defaultConstructorMarker2);
        EnumC39333f enumC39333f5 = EnumC39333f.STRAIN_ZONE_2;
        C14008h c14008h13 = new C14008h(enumC39333f5, false, null, 6, null);
        C14008h c14008h14 = new C14008h(enumC39333f5, false, null, 6, null);
        EnumC39333f enumC39333f6 = EnumC39333f.SLEEP_REM_SLEEP;
        C14008h c14008h15 = new C14008h(enumC39333f6, false, null, 6, null);
        int i15 = 6;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        boolean z14 = false;
        EnumC39333f enumC39333f7 = null;
        C14008h c14008h16 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h17 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h18 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h19 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h20 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h21 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h22 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h23 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h24 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h25 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h26 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h27 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h28 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h29 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h30 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h31 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h32 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h33 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h34 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h35 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        C14008h c14008h36 = new C14008h(enumC39333f6, z14, enumC39333f7, i15, defaultConstructorMarker3);
        EnumC39333f enumC39333f8 = EnumC39333f.BRAND_WHITE;
        C14008h c14008h37 = new C14008h(enumC39333f8, false, null, 6, null);
        EnumC39333f enumC39333f9 = EnumC39333f.WHITE_10;
        EnumC39333f enumC39333f10 = null;
        List<C14008h> listM118959K = AbstractC37056f.m118959K(c14008h, c14008h2, c14008h3, c14008h4, c14008h5, c14008h6, c14008h7, c14008h8, c14008h9, c14008h10, c14008h11, c14008h12, c14008h13, c14008h14, c14008h15, c14008h16, c14008h17, c14008h18, c14008h19, c14008h20, c14008h21, c14008h22, c14008h23, c14008h24, c14008h25, c14008h26, c14008h27, c14008h28, c14008h29, c14008h30, c14008h31, c14008h32, c14008h33, c14008h34, c14008h35, c14008h36, c14008h37, new C14008h(enumC39333f9, false, 0 == true ? 1 : 0, 6, null), new C14008h(EnumC39333f.MCI_RED_50, false, 0 == true ? 1 : 0, 6, null), new C14008h(enumC39333f9, false, enumC39333f10, 6, null));
        f101173a = listM118959K;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("MENSTRUAL CYCLE INSIGHTS");
        C9598e c9598e = new C9598e(null, null, null, 7, null);
        EnumC16313m0 enumC16313m0 = EnumC16313m0.CARET_FORWARD;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        C14002b c14002b = new C14002b(AbstractC8693b.m21278l("Day 37"), null, AbstractC8693b.m21278l("OVERDUE"), AbstractC8693b.m21278l("Make sure to log your period"), EnumC39333f.RECOVERY, null, null, 98, defaultConstructorMarker4);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
        EnumC39333f enumC39333f11 = EnumC39333f.WHITE_20;
        int i16 = 84;
        DefaultConstructorMarker defaultConstructorMarker5 = null;
        TextResource textResource = null;
        EnumC39333f enumC39333f12 = null;
        boolean z15 = true;
        Float f13 = null;
        boolean z16 = true;
        boolean z17 = true;
        boolean z18 = false;
        boolean z19 = false;
        float f14 = 0.0f;
        float f15 = 0.0f;
        boolean z24 = false;
        Object[] objArr = 0 == true ? 1 : 0;
        f101174b = new C25689c(textResourceM21278l, c9598e, enumC16313m0, new C14005e(c14002b, z16, z17, listM118959K, AbstractC37056f.m118959K(new C14007g(0, textResourceM21278l2, null, enumC39333f11, null, true, 0 == true ? 1 : 0, 84, defaultConstructorMarker4), new C14007g(6, AbstractC8693b.m21278l("7"), textResource, enumC39333f11, enumC39333f12, z15, f13, i16, defaultConstructorMarker5), new C14007g(13, AbstractC8693b.m21278l("14"), textResource, enumC39333f11, enumC39333f12, z15, f13, i16, defaultConstructorMarker5), new C14007g(20, AbstractC8693b.m21278l("21"), textResource, enumC39333f11, enumC39333f12, z15, f13, i16, defaultConstructorMarker5), new C14007g(27, AbstractC8693b.m21278l("28"), textResource, enumC39333f11, enumC39333f12, z15, f13, i16, defaultConstructorMarker5), new C14007g(34, AbstractC8693b.m21278l("35"), textResource, enumC39333f11, enumC39333f12, z15, f13, i16, defaultConstructorMarker5), new C14007g(36, AbstractC8693b.m21278l("37"), null, enumC39333f8, enumC39333f10, true, 0 == true ? 1 : 0, 84, null), new C14007g(39, AbstractC8693b.m21278l("40"), textResource, enumC39333f11, enumC39333f12, z15, f13, i16, defaultConstructorMarker5)), z18, z19, f14, f15, z24, new C14006f(38, "Mar. 5-7 (expected period start)"), objArr, 3008, defaultConstructorMarker4), null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m75642f(C25689c mciTileState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(mciTileState, "mciTileState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-868651972);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(mciTileState) : c28655q.m87157i(mciTileState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            z4 = true;
            if ((i15 & 19) != 18) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24875c(28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, 3);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q.m87157i(mciTileState))) {
                    z4 = false;
                }
                z15 = z14 | z4;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C25592o(1, function4, mciTileState);
                    c28655q.m87172p0(objM87133R);
                }
                float f13 = 4;
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3427x, false, null, null, (InterfaceC4339a) objM87133R, 15), AbstractC33253j.m105489e(3 * f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f13, AbstractC37817c.m121344e(-743604807, c28655q, new C21245d(17, mciTileState, function4)), c28655q, 1769472, 24);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24671c(mciTileState, i13, function3, i14, 14);
            }
        }
        i15 |= 48;
        function2 = function1;
        z4 = true;
        if ((i15 & 19) != 18) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24875c(28);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, 3);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i15 & 14) != 4) {
                z4 = false;
            }
            z15 = z14 | z4;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C25592o(1, function4, mciTileState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C25592o(1, function4, mciTileState);
                c28655q.m87172p0(objM87133R);
            }
            float f14 = 4;
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3427x2, false, null, null, (InterfaceC4339a) objM87133R, 15), AbstractC33253j.m105489e(3 * f14), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, 0 * f14, AbstractC37817c.m121344e(-743604807, c28655q, new C21245d(17, mciTileState, function4)), c28655q, 1769472, 24);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(mciTileState, i13, function3, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m75643g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m75644h(Function1 function1, C25689c c25689c) {
        function1.invoke(c25689c.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m75645i(C25689c c25689c, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(c25689c.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            C28655q c28655q2 = c28655q;
            float f14 = 4;
            float f15 = f14 * f14;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c25689c.getEndIcon().toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(f15, c2314t), c38072d.m121949b(c28655q2, i14).getWhite30(), c28655q2, 432, 0);
            AbstractC17176i.m48516r(c28655q2, true, c2314t, f15, c28655q2);
            AbstractC14004d.m39859h(c25689c.getDailyTickMark(), false, c28655q2, C14005e.f49972m, 2);
            C27256h c27256hM75651e = c25689c.getLogButton();
            if (c27256hM75651e == null) {
                c28655q2.m87150e0(202584683);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(202584684);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
                C27246d c27246d = new C27246d();
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87157i(c25689c);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C24656d(13, function1, c25689c);
                    c28655q2.m87172p0(objM87133R);
                }
                c27246d.Compose(modifierM3409f2, c27256hM75651e, (Function1) objM87133R, c28655q2, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m75646j(Function1 function1, C25689c c25689c, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c25689c.getLogButton().getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m75647k(C25689c c25689c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m75642f(c25689c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
