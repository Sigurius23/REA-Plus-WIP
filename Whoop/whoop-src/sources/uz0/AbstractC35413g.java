package uz0;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import java.util.ArrayList;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17893k;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p330n1.C26102b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import re1.C31324k;
import t01.C33259e;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uz0.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aq\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0081\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 \u001a?\u0010)\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010*\"\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u00100\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-\"\u0014\u00103\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00104\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102¨\u00065²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Luz0/i;", "viewState", "Lkotlin/Function1;", "Luz0/h;", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "d", "(Luz0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "id", "", "isSelected", "Lkd1/o;", "iconImageSource", "activityTitle", "activityStrain", "activityDuration", "activityDurationUnit", "activityDurationLabel", "Luz0/o;", "targetZones", "Luz0/l;", "buttonViewState", "l", "(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/o;Luz0/l;)Luz0/i;", "Luz0/b;", "intensityStyle", "intensityTitle", "intensitySubtitle", "n", "(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/b;Ljava/lang/String;Ljava/lang/String;Luz0/l;)Luz0/i;", "Ly3/f;", "strokeWidth", "Li2/t;", "brush", "cornerRadiusDp", "", "dashPattern", "isDashed", "i", "(Landroidx/compose/ui/Modifier;FLi2/t;F[FZ)Landroidx/compose/ui/Modifier;", "Li2/x;", "a", "J", "tileGradientStart", "b", "tileGradientEnd", "c", "Li2/t;", "customGradient", "customButtonGradient", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35413g {

    /* JADX INFO: renamed from: a */
    private static final long f150845a;

    /* JADX INFO: renamed from: b */
    private static final long f150846b;

    /* JADX INFO: renamed from: c */
    private static final AbstractC17911t f150847c;

    /* JADX INFO: renamed from: d */
    private static final AbstractC17911t f150848d;

    static {
        long jM51517e = AbstractC17918w0.m51517e(4283487743L);
        f150845a = jM51517e;
        long jM51517e2 = AbstractC17918w0.m51517e(4287324927L);
        f150846b = jM51517e2;
        C17909s c17909s = AbstractC17911t.f69612b;
        f150847c = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, jM51517e2)), new C17919x(C17919x.m51541c(0.1f, jM51517e))), 0L, 9187343241974906880L, 8);
        f150848d = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.8f, jM51517e2)), new C17919x(C17919x.m51541c(0.8f, jM51517e))), 0L, 0L, 14);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x015f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0165  */
    /* JADX WARN: Code duplicated, block: B:68:0x01db  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x0203  */
    /* JADX WARN: Code duplicated, block: B:74:0x020f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0224  */
    /* JADX WARN: Code duplicated, block: B:77:0x0229  */
    /* JADX WARN: Code duplicated, block: B:80:0x0236  */
    /* JADX WARN: Code duplicated, block: B:82:0x023b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0244  */
    /* JADX WARN: Code duplicated, block: B:87:0x024d  */
    /* JADX WARN: Code duplicated, block: B:90:0x025a  */
    /* JADX WARN: Code duplicated, block: B:92:0x025f  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ae  */
    /* JADX INFO: renamed from: d */
    public static final void m112340d(C35415i viewState, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        AbstractC17911t abstractC17911t;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C2314t c2314t2;
        C28676v0 c28676v1;
        boolean z13;
        boolean z14;
        InterfaceC25312u interfaceC25312uM112361h;
        boolean z15;
        C35418l c35418lM112360g;
        String strM112371a;
        EnumC16313m0 enumC16313m0;
        AbstractC18247a abstractC18247aM52575m;
        EnumC39333f enumC39333f;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(607046981);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsSelected()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                float f14 = 4;
                float f15 = f14 * f14;
                Modifier modifier5 = modifier4;
                Modifier modifierM112346j = m112346j(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier4), AbstractC33253j.m105489e(f15)), (float) 1.5d, AbstractC15673b0.m43972A(), f15, null, !m112341e(interfaceC28601c1), 8, null);
                abstractC17911t = f150847c;
                f13 = 2 * 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3357b(modifierM112346j, abstractC17911t, null, 0.0f, 6));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (viewState.m112367n() || viewState.getTargetZones() == null) {
                    if (viewState.m112368o() || viewState.getIntensityStyle() == null || viewState.getIntensityTitle() == null || viewState.getIntensitySubtitle() == null) {
                        c28655q.m87150e0(406958574);
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        AbstractC35409c.m112326b(viewState.getIconImageSource(), viewState.getActivityStrain(), viewState.getActivityTitle(), abstractC17911t, c28655q, 3072);
                        z13 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(406170306);
                        z14 = false;
                        AbstractC35411e.m112332b(new C35420n(viewState.getIconImageSource(), viewState.getActivityStrain(), viewState.getActivityTitle(), viewState.getActivityDuration(), viewState.getActivityDurationUnit(), viewState.getActivityDurationLabel(), viewState.getIntensityStyle(), viewState.getIntensityTitle(), viewState.getIntensitySubtitle(), abstractC17911t), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    interfaceC25312uM112361h = viewState.getContent();
                    if (interfaceC25312uM112361h == null) {
                        c28655q.m87150e0(407261257);
                        c28655q.m87173q(z13);
                        z15 = z13;
                    } else {
                        AbstractC33745d.m106667z(c28655q, 407261258, c2314t2, f13, c28655q);
                        z15 = z13;
                        AbstractC25303l.m74291r(interfaceC25312uM112361h, null, null, null, c28655q, 0, 14);
                        c28655q.m87173q(z15);
                    }
                    c35418lM112360g = viewState.getButtonViewState();
                    if (c35418lM112360g == null) {
                        c28655q.m87150e0(407467097);
                        c28655q.m87173q(z15);
                    } else {
                        c28655q.m87150e0(407467098);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t2));
                        if (m112341e(interfaceC28601c1)) {
                            strM112371a = c35418lM112360g.getIsSelectedCtaTitle();
                        } else {
                            strM112371a = c35418lM112360g.getNotSelectedCtaTitle();
                        }
                        TextResource.C8691e c8691e = new TextResource.C8691e(strM112371a);
                        if (m112341e(interfaceC28601c1)) {
                            enumC16313m0 = EnumC16313m0.CHECKMARK;
                        } else {
                            enumC16313m0 = EnumC16313m0.ADD;
                        }
                        EnumC16313m0 enumC16313m1 = enumC16313m0;
                        if (m112341e(interfaceC28601c1)) {
                            abstractC18247aM52575m = AbstractC18249c.m52570h(f150848d);
                        } else {
                            abstractC18247aM52575m = AbstractC18249c.m52575m(EnumC39333f.BRAND_WHITE);
                        }
                        AbstractC18247a abstractC18247a = abstractC18247aM52575m;
                        if (m112341e(interfaceC28601c1)) {
                            enumC39333f = EnumC39333f.BRAND_WHITE;
                        } else {
                            enumC39333f = EnumC39333f.BRAND_BLACK;
                        }
                        C27256h c27256h = new C27256h(c8691e, enumC16313m1, abstractC18247a, enumC39333f, null, null, EnumC27272p.DEFAULT, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529776, null);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                        if ((i15 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = z15;
                        }
                        if ((i15 & 14) == 4) {
                            z17 = true;
                        } else {
                            z17 = z15;
                        }
                        z18 = z17 | z16;
                        objM87133R2 = c28655q.m87133R();
                        if (z18 || objM87133R2 == c28676v1) {
                            objM87133R2 = new C31324k(onViewEvent, viewState, interfaceC28601c1, 12);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27249e.m82121d(modifierM3409f, c27256h, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 4);
                        c28655q.m87173q(z15);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                } else {
                    c28655q.m87150e0(405367964);
                    z14 = false;
                    AbstractC35410d.m112329b(new C35419m(viewState.getIconImageSource(), viewState.getActivityStrain(), viewState.getActivityTitle(), viewState.getActivityDuration(), viewState.getActivityDurationUnit(), viewState.getActivityDurationLabel(), viewState.getTargetZones(), abstractC17911t), c28655q, 0);
                    c28655q.m87173q(false);
                }
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                z13 = z14;
                interfaceC25312uM112361h = viewState.getContent();
                if (interfaceC25312uM112361h == null) {
                    c28655q.m87150e0(407261257);
                    c28655q.m87173q(z13);
                    z15 = z13;
                } else {
                    AbstractC33745d.m106667z(c28655q, 407261258, c2314t2, f13, c28655q);
                    z15 = z13;
                    AbstractC25303l.m74291r(interfaceC25312uM112361h, null, null, null, c28655q, 0, 14);
                    c28655q.m87173q(z15);
                }
                c35418lM112360g = viewState.getButtonViewState();
                if (c35418lM112360g == null) {
                    c28655q.m87150e0(407467097);
                    c28655q.m87173q(z15);
                } else {
                    c28655q.m87150e0(407467098);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t2));
                    if (m112341e(interfaceC28601c1)) {
                        strM112371a = c35418lM112360g.getIsSelectedCtaTitle();
                    } else {
                        strM112371a = c35418lM112360g.getNotSelectedCtaTitle();
                    }
                    TextResource.C8691e c8691e2 = new TextResource.C8691e(strM112371a);
                    if (m112341e(interfaceC28601c1)) {
                        enumC16313m0 = EnumC16313m0.CHECKMARK;
                    } else {
                        enumC16313m0 = EnumC16313m0.ADD;
                    }
                    EnumC16313m0 enumC16313m2 = enumC16313m0;
                    if (m112341e(interfaceC28601c1)) {
                        abstractC18247aM52575m = AbstractC18249c.m52570h(f150848d);
                    } else {
                        abstractC18247aM52575m = AbstractC18249c.m52575m(EnumC39333f.BRAND_WHITE);
                    }
                    AbstractC18247a abstractC18247a2 = abstractC18247aM52575m;
                    if (m112341e(interfaceC28601c1)) {
                        enumC39333f = EnumC39333f.BRAND_WHITE;
                    } else {
                        enumC39333f = EnumC39333f.BRAND_BLACK;
                    }
                    C27256h c27256h2 = new C27256h(c8691e2, enumC16313m2, abstractC18247a2, enumC39333f, null, null, EnumC27272p.DEFAULT, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529776, null);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    if ((i15 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = z15;
                    }
                    if ((i15 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    z18 = z17 | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (z18) {
                        objM87133R2 = new C31324k(onViewEvent, viewState, interfaceC28601c1, 12);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C31324k(onViewEvent, viewState, interfaceC28601c1, 12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27249e.m82121d(modifierM3409f2, c27256h2, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 4);
                    c28655q.m87173q(z15);
                }
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(i13, i14, 23, modifier3, (InterfaceC23459e) onViewEvent, (InterfaceC25312u) viewState);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsSelected()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            float f16 = 4;
            float f17 = f16 * f16;
            Modifier modifier6 = modifier4;
            Modifier modifierM112346j2 = m112346j(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier4), AbstractC33253j.m105489e(f17)), (float) 1.5d, AbstractC15673b0.m43972A(), f17, null, !m112341e(interfaceC28601c1), 8, null);
            abstractC17911t = f150847c;
            f13 = 2 * 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f13, AbstractC1092a.m3357b(modifierM112346j2, abstractC17911t, null, 0.0f, 6));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (viewState.m112367n()) {
                if (viewState.m112368o()) {
                }
                c28655q.m87150e0(406958574);
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                AbstractC35409c.m112326b(viewState.getIconImageSource(), viewState.getActivityStrain(), viewState.getActivityTitle(), abstractC17911t, c28655q, 3072);
                z13 = false;
                c28655q.m87173q(false);
            } else {
                if (viewState.m112368o()) {
                }
                c28655q.m87150e0(406958574);
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                AbstractC35409c.m112326b(viewState.getIconImageSource(), viewState.getActivityStrain(), viewState.getActivityTitle(), abstractC17911t, c28655q, 3072);
                z13 = false;
                c28655q.m87173q(false);
            }
            interfaceC25312uM112361h = viewState.getContent();
            if (interfaceC25312uM112361h == null) {
                c28655q.m87150e0(407261257);
                c28655q.m87173q(z13);
                z15 = z13;
            } else {
                AbstractC33745d.m106667z(c28655q, 407261258, c2314t2, f13, c28655q);
                z15 = z13;
                AbstractC25303l.m74291r(interfaceC25312uM112361h, null, null, null, c28655q, 0, 14);
                c28655q.m87173q(z15);
            }
            c35418lM112360g = viewState.getButtonViewState();
            if (c35418lM112360g == null) {
                c28655q.m87150e0(407467097);
                c28655q.m87173q(z15);
            } else {
                c28655q.m87150e0(407467098);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t2));
                if (m112341e(interfaceC28601c1)) {
                    strM112371a = c35418lM112360g.getIsSelectedCtaTitle();
                } else {
                    strM112371a = c35418lM112360g.getNotSelectedCtaTitle();
                }
                TextResource.C8691e c8691e3 = new TextResource.C8691e(strM112371a);
                if (m112341e(interfaceC28601c1)) {
                    enumC16313m0 = EnumC16313m0.CHECKMARK;
                } else {
                    enumC16313m0 = EnumC16313m0.ADD;
                }
                EnumC16313m0 enumC16313m3 = enumC16313m0;
                if (m112341e(interfaceC28601c1)) {
                    abstractC18247aM52575m = AbstractC18249c.m52570h(f150848d);
                } else {
                    abstractC18247aM52575m = AbstractC18249c.m52575m(EnumC39333f.BRAND_WHITE);
                }
                AbstractC18247a abstractC18247a3 = abstractC18247aM52575m;
                if (m112341e(interfaceC28601c1)) {
                    enumC39333f = EnumC39333f.BRAND_WHITE;
                } else {
                    enumC39333f = EnumC39333f.BRAND_BLACK;
                }
                C27256h c27256h3 = new C27256h(c8691e3, enumC16313m3, abstractC18247a3, enumC39333f, null, null, EnumC27272p.DEFAULT, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529776, null);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                if ((i15 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = z15;
                }
                if ((i15 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                z18 = z17 | z16;
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    objM87133R2 = new C31324k(onViewEvent, viewState, interfaceC28601c1, 12);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C31324k(onViewEvent, viewState, interfaceC28601c1, 12);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27249e.m82121d(modifierM3409f3, c27256h3, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 4);
                c28655q.m87173q(z15);
            }
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(i13, i14, 23, modifier3, (InterfaceC23459e) onViewEvent, (InterfaceC25312u) viewState);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m112341e(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    private static final void m112342f(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m112343g(Function1 function1, C35415i c35415i, InterfaceC28601c1 interfaceC28601c1) {
        m112342f(interfaceC28601c1, !m112341e(interfaceC28601c1));
        function1.invoke(new InterfaceC35414h.a(c35415i.getId(), m112341e(interfaceC28601c1), c35415i.getActivityTitle()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m112344h(C35415i c35415i, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m112340d(c35415i, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final Modifier m112345i(Modifier modifier, float f13, AbstractC17911t abstractC17911t, float f14, float[] fArr, boolean z4) {
        return AbstractC1125a.m3480c(modifier, new C26102b(f14, fArr, f13, z4, abstractC17911t));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Modifier m112346j(Modifier modifier, float f13, AbstractC17911t abstractC17911t, float f14, float[] fArr, boolean z4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            fArr = new float[]{4.0f, 2.0f};
        }
        return m112345i(modifier, f13, abstractC17911t, f14, fArr, (i13 & 16) != 0 ? true : z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m112347k(float f13, float[] fArr, float f14, boolean z4, AbstractC17911t abstractC17911t, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        float fMo743q0 = c0238p0.mo743q0(f13);
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f15 : fArr) {
            arrayList.add(Float.valueOf(c0238p0.f815w.getDensity() * f15));
        }
        InterfaceC22131e.m63376J0(drawWithContent, abstractC17911t, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fMo743q0))), 0.5f, new C22135i(c0238p0.mo743q0(f14), 0.0f, 0, 0, z4 ? new C17893k(new DashPathEffect(AbstractC25265s.m74089B1(arrayList), 0.0f)) : null, 14), 198);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final C35415i m112348l(String id4, boolean z4, AbstractC22403o iconImageSource, String activityTitle, String str, String activityDuration, String activityDurationUnit, String activityDurationLabel, C35421o targetZones, C35418l buttonViewState) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(iconImageSource, "iconImageSource");
        AbstractC22676k.m65750j(activityTitle, "activityTitle");
        AbstractC22676k.m65750j(activityDuration, "activityDuration");
        AbstractC22676k.m65750j(activityDurationUnit, "activityDurationUnit");
        AbstractC22676k.m65750j(activityDurationLabel, "activityDurationLabel");
        AbstractC22676k.m65750j(targetZones, "targetZones");
        AbstractC22676k.m65750j(buttonViewState, "buttonViewState");
        return new C35415i(id4, z4, iconImageSource, activityTitle, str, activityDuration, activityDurationUnit, activityDurationLabel, targetZones, null, null, null, buttonViewState, null, DfuBaseService.ERROR_REMOTE_MASK, null);
    }

    /* JADX INFO: renamed from: n */
    public static final C35415i m112350n(String id4, boolean z4, AbstractC22403o iconImageSource, String activityTitle, String str, String activityDuration, String activityDurationUnit, String activityDurationLabel, EnumC35408b intensityStyle, String intensityTitle, String intensitySubtitle, C35418l buttonViewState) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(iconImageSource, "iconImageSource");
        AbstractC22676k.m65750j(activityTitle, "activityTitle");
        AbstractC22676k.m65750j(activityDuration, "activityDuration");
        AbstractC22676k.m65750j(activityDurationUnit, "activityDurationUnit");
        AbstractC22676k.m65750j(activityDurationLabel, "activityDurationLabel");
        AbstractC22676k.m65750j(intensityStyle, "intensityStyle");
        AbstractC22676k.m65750j(intensityTitle, "intensityTitle");
        AbstractC22676k.m65750j(intensitySubtitle, "intensitySubtitle");
        AbstractC22676k.m65750j(buttonViewState, "buttonViewState");
        return new C35415i(id4, z4, iconImageSource, activityTitle, str, activityDuration, activityDurationUnit, activityDurationLabel, null, intensityStyle, intensityTitle, intensitySubtitle, buttonViewState, null, DfuBaseService.ERROR_REMOTE_MASK, null);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ C35415i m112351o(String str, boolean z4, AbstractC22403o abstractC22403o, String str2, String str3, String str4, String str5, String str6, EnumC35408b enumC35408b, String str7, String str8, C35418l c35418l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "intensityTile1";
        }
        if ((i13 & 4) != 0) {
            abstractC22403o = new AbstractC22403o.a(C38072d.f163053a.m121951d().getActivities().getCycling());
        }
        if ((i13 & 8) != 0) {
            str2 = "Cycling";
        }
        if ((i13 & 16) != 0) {
            str3 = null;
        }
        if ((i13 & 32) != 0) {
            str4 = "60";
        }
        if ((i13 & 64) != 0) {
            str5 = "min";
        }
        if ((i13 & 128) != 0) {
            str6 = "Est. Duration";
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str8 = "Active Recovery";
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c35418l = new C35418l("COMMITTED", "COMMIT");
        }
        String str9 = str6;
        String str10 = str5;
        String str11 = str4;
        String str12 = str3;
        String str13 = str2;
        return m112350n(str, z4, abstractC22403o, str13, str12, str11, str10, str9, enumC35408b, str7, str8, c35418l);
    }
}
