package qn0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4048j0;
import c93.InterfaceC4339a;
import com.whoop.challengedetails.domain.models.JoinChallengeResponseStatus;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16272a;
import jn0.C21801d;
import l83.C23454a0;
import ln0.InterfaceC24522b;
import mn0.InterfaceC25707a;
import no.nordicsemi.android.dfu.DfuBaseService;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p62.C28947h;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import qe0.C30301b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qn0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\r\u001a\u00020\f*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Ljn0/d;", "joinChallengeState", "", "challengeName", "Lkotlin/Function1;", "Lmn0/a;", "Ll83/a0;", "onViewEvent", "Lln0/b;", "onNavigationEvent", "g", "(Ljn0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lsz0/p0;", "m", "(Ljn0/d;Lkotlin/jvm/functions/Function1;)Lsz0/p0;", "challenge-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30516k {

    /* JADX INFO: renamed from: qn0.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f125354a;

        static {
            int[] iArr = new int[JoinChallengeResponseStatus.values().length];
            try {
                iArr[JoinChallengeResponseStatus.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JoinChallengeResponseStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JoinChallengeResponseStatus.FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125354a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x013c  */
    /* JADX WARN: Code duplicated, block: B:76:0x013e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Code duplicated, block: B:86:0x0156  */
    /* JADX WARN: Code duplicated, block: B:87:0x0158  */
    /* JADX WARN: Code duplicated, block: B:90:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0163  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x0173  */
    /* JADX WARN: Code duplicated, block: B:98:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x017c  */
    /* JADX INFO: renamed from: g */
    public static final void m93470g(C21801d joinChallengeState, String challengeName, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        C28655q c28655q;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResourceM61701b;
        boolean z13;
        TextResource textResourceM61700a;
        int i18;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        boolean z17;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(joinChallengeState, "joinChallengeState");
        AbstractC22676k.m65750j(challengeName, "challengeName");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(755339124);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(joinChallengeState) : c28655q2.m87157i(joinChallengeState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(challengeName) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q2.m87157i(function3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C30301b(14);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C30301b(15);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    } else {
                        function8 = function4;
                    }
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack70(), AbstractC17918w0.f69621a));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    AbstractC33208p0 abstractC33208p0M93476m = m93476m(joinChallengeState, function8);
                    TextResource textResourceM61703d = joinChallengeState.getSubText();
                    textResourceM61701b = joinChallengeState.getCtaText();
                    if (textResourceM61701b == null) {
                        textResourceM61701b = AbstractC8693b.m21267a();
                    }
                    if (joinChallengeState.getCtaClose() != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    textResourceM61700a = joinChallengeState.getCtaClose();
                    if (textResourceM61700a == null) {
                        textResourceM61700a = AbstractC8693b.m21267a();
                    }
                    i18 = i15 & 896;
                    if (i18 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q2.m87133R();
                    if (z16 || objM87133R == c28676v0) {
                        objM87133R = new C4048j0(function7, challengeName, 12);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    if (i18 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z17 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C28947h(function7, 29);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    int i24 = AbstractC33208p0.f138461d;
                    int i25 = TextResource.$stable;
                    AbstractC33199m0.m105214F(abstractC33208p0M93476m, textResourceM61703d, null, textResourceM61701b, interfaceC4339a, z13, false, textResourceM61700a, (InterfaceC4339a) objM87133R2, null, true, false, c28655q2, i24 | (i25 << 3) | (i25 << 9) | (i25 << 21), 6, 2628);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    Function1 function9 = function7;
                    function6 = function8;
                    function5 = function9;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27640a((Object) joinChallengeState, challengeName, function5, function6, i13, i14, 16);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30301b(14);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C30301b(15);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                } else {
                    function8 = function4;
                }
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack70(), AbstractC17918w0.f69621a));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                AbstractC33208p0 abstractC33208p0M93476m2 = m93476m(joinChallengeState, function8);
                TextResource textResourceM61703d2 = joinChallengeState.getSubText();
                textResourceM61701b = joinChallengeState.getCtaText();
                if (textResourceM61701b == null) {
                    textResourceM61701b = AbstractC8693b.m21267a();
                }
                if (joinChallengeState.getCtaClose() != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                textResourceM61700a = joinChallengeState.getCtaClose();
                if (textResourceM61700a == null) {
                    textResourceM61700a = AbstractC8693b.m21267a();
                }
                i18 = i15 & 896;
                if (i18 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    objM87133R = new C4048j0(function7, challengeName, 12);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C4048j0(function7, challengeName, 12);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                if (i18 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z17) {
                    objM87133R2 = new C28947h(function7, 29);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C28947h(function7, 29);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i26 = AbstractC33208p0.f138461d;
                int i27 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M93476m2, textResourceM61703d2, null, textResourceM61701b, interfaceC4339a2, z13, false, textResourceM61700a, (InterfaceC4339a) objM87133R2, null, true, false, c28655q2, i26 | (i27 << 3) | (i27 << 9) | (i27 << 21), 6, 2628);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                Function1 function10 = function7;
                function6 = function8;
                function5 = function10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) joinChallengeState, challengeName, function5, function6, i13, i14, 16);
            }
        }
        i15 |= 384;
        function3 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C30301b(14);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C30301b(15);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                } else {
                    function8 = function4;
                }
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack70(), AbstractC17918w0.f69621a));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3407d3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                AbstractC33208p0 abstractC33208p0M93476m3 = m93476m(joinChallengeState, function8);
                TextResource textResourceM61703d3 = joinChallengeState.getSubText();
                textResourceM61701b = joinChallengeState.getCtaText();
                if (textResourceM61701b == null) {
                    textResourceM61701b = AbstractC8693b.m21267a();
                }
                if (joinChallengeState.getCtaClose() != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                textResourceM61700a = joinChallengeState.getCtaClose();
                if (textResourceM61700a == null) {
                    textResourceM61700a = AbstractC8693b.m21267a();
                }
                i18 = i15 & 896;
                if (i18 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    objM87133R = new C4048j0(function7, challengeName, 12);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C4048j0(function7, challengeName, 12);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                if (i18 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z17) {
                    objM87133R2 = new C28947h(function7, 29);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C28947h(function7, 29);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i28 = AbstractC33208p0.f138461d;
                int i29 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M93476m3, textResourceM61703d3, null, textResourceM61701b, interfaceC4339a3, z13, false, textResourceM61700a, (InterfaceC4339a) objM87133R2, null, true, false, c28655q2, i28 | (i29 << 3) | (i29 << 9) | (i29 << 21), 6, 2628);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                Function1 function11 = function7;
                function6 = function8;
                function5 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) joinChallengeState, challengeName, function5, function6, i13, i14, 16);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C30301b(14);
                    c28655q2.m87172p0(objM87133R4);
                }
                function7 = (Function1) objM87133R4;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C30301b(15);
                    c28655q2.m87172p0(objM87133R3);
                }
                function8 = (Function1) objM87133R3;
            } else {
                function8 = function4;
            }
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack70(), AbstractC17918w0.f69621a));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3407d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            AbstractC33208p0 abstractC33208p0M93476m4 = m93476m(joinChallengeState, function8);
            TextResource textResourceM61703d4 = joinChallengeState.getSubText();
            textResourceM61701b = joinChallengeState.getCtaText();
            if (textResourceM61701b == null) {
                textResourceM61701b = AbstractC8693b.m21267a();
            }
            if (joinChallengeState.getCtaClose() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            textResourceM61700a = joinChallengeState.getCtaClose();
            if (textResourceM61700a == null) {
                textResourceM61700a = AbstractC8693b.m21267a();
            }
            i18 = i15 & 896;
            if (i18 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i15 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z14 | z15;
            objM87133R = c28655q2.m87133R();
            if (z16) {
                objM87133R = new C4048j0(function7, challengeName, 12);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C4048j0(function7, challengeName, 12);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            if (i18 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z17) {
                objM87133R2 = new C28947h(function7, 29);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C28947h(function7, 29);
                c28655q2.m87172p0(objM87133R2);
            }
            int i210 = AbstractC33208p0.f138461d;
            int i211 = TextResource.$stable;
            AbstractC33199m0.m105214F(abstractC33208p0M93476m4, textResourceM61703d4, null, textResourceM61701b, interfaceC4339a4, z13, false, textResourceM61700a, (InterfaceC4339a) objM87133R2, null, true, false, c28655q2, i210 | (i211 << 3) | (i211 << 9) | (i211 << 21), 6, 2628);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            Function1 function12 = function7;
            function6 = function8;
            function5 = function12;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a((Object) joinChallengeState, challengeName, function5, function6, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m93471h(InterfaceC25707a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m93472i(InterfaceC24522b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m93473j(Function1 function1, String str) {
        function1.invoke(new InterfaceC25707a.b(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m93474k(Function1 function1) {
        function1.invoke(InterfaceC25707a.a.f101222a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m93475l(C21801d c21801d, String str, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m93470g(c21801d, str, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final AbstractC33208p0 m93476m(C21801d c21801d, Function1 function1) {
        int i13 = a.f125354a[c21801d.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().ordinal()];
        if (i13 == 1) {
            return new AbstractC33208p0.e(c21801d.getText(), AbstractC16272a.f61976O4);
        }
        if (i13 == 2) {
            return new AbstractC33208p0.h(c21801d.getText(), 0L, new C30515j(function1, 0), 2, null);
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new AbstractC33208p0.b(c21801d.getText(), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m93477n(Function1 function1) {
        function1.invoke(InterfaceC24522b.a.f95683a);
        return C23454a0.f92919a;
    }
}
