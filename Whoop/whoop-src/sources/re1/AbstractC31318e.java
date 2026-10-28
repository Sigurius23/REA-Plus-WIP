package re1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2541i2;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.educationModels.MediaHeader;
import com.whoop.educationModels.StickyButton;
import ie1.AbstractC18445c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import oe1.AbstractC27875e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: re1.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ae\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Loe1/e;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onTryAgainClicked", "Lkotlin/Function1;", "", "scrollDepthAnalyticsEvent", "Lne1/a;", "onNavigationEvent", "podcastAnalyticsEvent", "", "isArticleTileMediaCardEnabled", "b", "(Loe1/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V", "education_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31318e {
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x021d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0252  */
    /* JADX WARN: Code duplicated, block: B:88:0x025a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0265  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m96325b(AbstractC27875e viewState, InterfaceC4339a onTryAgainClicked, Function1 scrollDepthAnalyticsEvent, Function1 onNavigationEvent, InterfaceC4339a podcastAnalyticsEvent, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        boolean z17;
        boolean z18;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onTryAgainClicked, "onTryAgainClicked");
        AbstractC22676k.m65750j(scrollDepthAnalyticsEvent, "scrollDepthAnalyticsEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(podcastAnalyticsEvent, "podcastAnalyticsEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1001717085);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onTryAgainClicked) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(scrollDepthAnalyticsEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(podcastAnalyticsEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i16 = i14 & 32;
        if (i16 == 0) {
            if ((196608 & i13) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (viewState instanceof AbstractC27875e.c) {
                    c28655q2.m87150e0(-720538841);
                    AbstractC27875e.c cVar = (AbstractC27875e.c) viewState;
                    int i17 = i15 << 9;
                    AbstractC31323j.m96342P(cVar.m84145c(), cVar.getNavBarTitle(), cVar.getMediaHeader(), cVar.getStickyButton(), null, scrollDepthAnalyticsEvent, onNavigationEvent, podcastAnalyticsEvent, z16, c28655q2, (TextResource.$stable << 3) | (MediaHeader.$stable << 6) | (StickyButton.$stable << 9) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024), 16);
                    z17 = z16;
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    z17 = z16;
                    z18 = viewState instanceof AbstractC27875e.a;
                    c2314t = C2314t.f9131w;
                    if (z18) {
                        c28655q2.m87150e0(-719968627);
                        Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "EducationErrorScreen");
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i2 = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.b(new TextResource.C8688b(AbstractC18445c.f71819d, null, 2, null), false, null, 6, null), AbstractC8693b.m21267a(), onTryAgainClicked, new TextResource.C8688b(AbstractC18445c.f71817b, null, 2, null), onTryAgainClicked, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | ((i15 << 3) & 896) | (TextResource.C8688b.f25889c << 9) | ((i15 << 9) & 57344), 0, 4064);
                        c28655q = c28655q2;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC27875e.b) {
                            throw AbstractC11895b.m32003v(-577433458, c28655q2, false);
                        }
                        c28655q2.m87150e0(-719438062);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q2;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                }
                z15 = z17;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2541i2(i13, i14, 17, viewState, onTryAgainClicked, scrollDepthAnalyticsEvent, onNavigationEvent, podcastAnalyticsEvent, z15);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        if ((74899 & i15) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (viewState instanceof AbstractC27875e.c) {
                c28655q2.m87150e0(-720538841);
                AbstractC27875e.c cVar2 = (AbstractC27875e.c) viewState;
                int i18 = i15 << 9;
                AbstractC31323j.m96342P(cVar2.m84145c(), cVar2.getNavBarTitle(), cVar2.getMediaHeader(), cVar2.getStickyButton(), null, scrollDepthAnalyticsEvent, onNavigationEvent, podcastAnalyticsEvent, z16, c28655q2, (TextResource.$stable << 3) | (MediaHeader.$stable << 6) | (StickyButton.$stable << 9) | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (i18 & 234881024), 16);
                z17 = z16;
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                z17 = z16;
                z18 = viewState instanceof AbstractC27875e.a;
                c2314t = C2314t.f9131w;
                if (z18) {
                    c28655q2.m87150e0(-719968627);
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "EducationErrorScreen");
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3599a2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.b(new TextResource.C8688b(AbstractC18445c.f71819d, null, 2, null), false, null, 6, null), AbstractC8693b.m21267a(), onTryAgainClicked, new TextResource.C8688b(AbstractC18445c.f71817b, null, 2, null), onTryAgainClicked, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | ((i15 << 3) & 896) | (TextResource.C8688b.f25889c << 9) | ((i15 << 9) & 57344), 0, 4064);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC27875e.b) {
                        throw AbstractC11895b.m32003v(-577433458, c28655q2, false);
                    }
                    c28655q2.m87150e0(-719438062);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
            }
            z15 = z17;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2541i2(i13, i14, 17, viewState, onTryAgainClicked, scrollDepthAnalyticsEvent, onNavigationEvent, podcastAnalyticsEvent, z15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m96326c(AbstractC27875e abstractC27875e, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a2, boolean z4, int i13, int i14, Composer composer, int i15) {
        m96325b(abstractC27875e, interfaceC4339a, function1, function2, interfaceC4339a2, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
