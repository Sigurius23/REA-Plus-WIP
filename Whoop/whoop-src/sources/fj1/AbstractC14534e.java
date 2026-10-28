package fj1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b30.C2626t2;
import b91.C2886a;
import c93.InterfaceC4339a;
import cj1.C4759o;
import cj1.C4760p;
import cj1.C4762r;
import cj1.EnumC4761q;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d91.AbstractC11816d;
import d91.InterfaceC11815c;
import ej1.C13242h;
import f02.C13917c;
import f41.C14068f;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import hy0.AbstractC17746g1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13989w1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import rz0.EnumC31927f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: fj1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0003¢\u0006\u0004\b\u000e\u0010\r\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u001a\u0010\u001d\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u001a\u0010 \u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u001a\u0010\"\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u001a\u0010%\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016\"\u001a\u0010(\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016¨\u0006)"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcj1/r;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lcj1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcj1/q;", "Li2/x;", "l", "(Lcj1/q;Landroidx/compose/runtime/Composer;I)J", "m", "Lkd1/o$a;", "a", "Lkd1/o$a;", "sampleBodyImage", "b", "Lcj1/r;", "getSampleOnboardingState", "()Lcj1/r;", "sampleOnboardingState", "c", "getSampleInitialConnectingState", "sampleInitialConnectingState", "d", "getSampleInitialConnectionErrState", "sampleInitialConnectionErrState", "e", "getSampleUpdatingPostInitState", "sampleUpdatingPostInitState", "getSampleUpdatingErrState", "sampleUpdatingErrState", "g", "getSampleEnabledState", "sampleEnabledState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getSampleEnabledNoRecordsState", "sampleEnabledNoRecordsState", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14534e {

    /* JADX INFO: renamed from: a */
    private static final AbstractC22403o.a f53100a;

    /* JADX INFO: renamed from: b */
    private static final C4762r f53101b;

    /* JADX INFO: renamed from: c */
    private static final C4762r f53102c;

    /* JADX INFO: renamed from: d */
    private static final C4762r f53103d;

    /* JADX INFO: renamed from: e */
    private static final C4762r f53104e;

    /* JADX INFO: renamed from: f */
    private static final C4762r f53105f;

    /* JADX INFO: renamed from: g */
    private static final C4762r f53106g;

    /* JADX INFO: renamed from: h */
    private static final C4762r f53107h;

    /* JADX INFO: renamed from: fj1.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f53108a;

        static {
            int[] iArr = new int[EnumC4761q.values().length];
            try {
                iArr[EnumC4761q.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4761q.NO_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4761q.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4761q.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f53108a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f61988Q4);
        f53100a = aVar;
        EnumC16313m0 enumC16313m0 = EnumC16313m0.CARET_FORWARD;
        C9598e c9598e = new C9598e(null, null, null, 7, null);
        int i13 = 48;
        String str = "HEALTH_RECORDS";
        String str2 = "CONNECT HEALTH RECORDS";
        String str3 = null;
        C4760p c4760p = null;
        String str4 = "GET STARTED";
        f53101b = new C4762r(str, str2, enumC16313m0, new C4759o("Securely connect your health records, including conditions, medications, and labs, to add deeper context to your insights.", aVar, null, 4, null), str3, c4760p, str4, c9598e, i13, null);
        int i14 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C4759o c4759o = new C4759o("--", aVar, null, i14, defaultConstructorMarker);
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_ELLIPSE;
        EnumC4761q enumC4761q = EnumC4761q.PENDING;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        C4760p c4760p2 = new C4760p("Updating records...", 0 == true ? 1 : 0, enumC16313m1, enumC4761q, 2, defaultConstructorMarker2);
        String str5 = null;
        C4762r c4762r = new C4762r("HEALTH_RECORDS", "HEALTH RECORDS", enumC16313m0, c4759o, "INCLUDES", c4760p2, str5, new C9598e(null, null, null, 7, null), 64, defaultConstructorMarker2);
        f53102c = c4762r;
        EnumC16313m0 enumC16313m2 = EnumC16313m0.TINY_ATTENTION_ORANGE;
        EnumC4761q enumC4761q2 = EnumC4761q.ERROR;
        f53103d = C4762r.m15006b(c4762r, null, null, null, null, null, new C4760p("Unable to update.", "Records may be incomplete.", enumC16313m2, enumC4761q2), null, null, 223, null);
        String str6 = "Updating records...";
        String str7 = "healthex";
        String str8 = "HEALTH RECORDS";
        String str9 = "INCLUDES";
        C4762r c4762r2 = new C4762r(str7, str8, enumC16313m0, new C4759o("0 connected providers", aVar, null, i14, defaultConstructorMarker), str9, new C4760p(str6, str5, enumC16313m1, enumC4761q, 2, null), str5, new C9598e(null, null, null, 7, null), 64, null);
        f53104e = c4762r2;
        f53105f = C4762r.m15006b(c4762r2, null, null, null, C4759o.m14997b(c4762r2.getBodyContent(), "3 providers, 23 visits, and 4 medications", null, null, 6, null), null, new C4760p("Unable to update.", "Records may be incomplete.", enumC16313m2, enumC4761q2), null, null, 215, null);
        f53106g = C4762r.m15006b(c4762r2, null, null, null, C4759o.m14997b(c4762r2.getBodyContent(), "3 providers, 23 visits, and 4 medications", null, null, 6, null), null, new C4760p("Last updated: April 23, 2026", "12 records added", EnumC16313m0.TINY_CHECKMARK, EnumC4761q.SUCCESS), null, null, 215, null);
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        String str10 = "healthex";
        String str11 = "HEALTH RECORDS";
        String str12 = "INCLUDES";
        String str13 = null;
        f53107h = new C4762r(str10, str11, enumC16313m0, new C4759o("0 connected providers", aVar, null, 4, null), str12, new C4760p("Connect a medical provider to pull in medical records", null, EnumC16313m0.REMOVE, EnumC4761q.NO_DATA, 2, defaultConstructorMarker3), str13, new C9598e(null, null, null, 7, null), 64, defaultConstructorMarker3);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    /* JADX WARN: Code duplicated, block: B:84:0x0135  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m41494f(Modifier modifier, C4762r state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifierM5391i;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        EnumC31927f enumC31927f;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1258042129);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                modifierM5391i = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = modifierM5391i;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C14068f(21);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (state.getTag() == null || state.getFooter() != null) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    enumC31927f = EnumC31927f.ONBOARDING_GRADIENT_FILL;
                } else {
                    enumC31927f = EnumC31927f.DEFAULT;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                if (state.getDestination() != null) {
                    c28655q2.m87150e0(448892714);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q2.m87157i(state))) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q2.m87133R();
                    if (z16 || objM87133R == c28676v0) {
                        objM87133R = new C13989w1(6, function4, state);
                        c28655q2.m87172p0(objM87133R);
                    }
                    modifierM5391i = AbstractC1772c1.m5391i(modifierM5391i, false, null, (InterfaceC4339a) objM87133R, 3);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(448999137);
                    c28655q2.m87173q(false);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(modifierM3409f.mo3471e(modifierM5391i), enumC31927f, 0L, AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-246523231, c28655q2, new C2626t2(z13, state)), c28655q, 12582912, 116);
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13917c(i13, i14, 5, modifier2, function3, state);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            modifierM5391i = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = modifierM5391i;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C14068f(21);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (state.getTag() == null) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (z13) {
                enumC31927f = EnumC31927f.ONBOARDING_GRADIENT_FILL;
            } else {
                enumC31927f = EnumC31927f.DEFAULT;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            if (state.getDestination() != null) {
                c28655q2.m87150e0(448892714);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 112) != 32) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                z16 = z14 | z15;
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    objM87133R = new C13989w1(6, function4, state);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C13989w1(6, function4, state);
                    c28655q2.m87172p0(objM87133R);
                }
                modifierM5391i = AbstractC1772c1.m5391i(modifierM5391i, false, null, (InterfaceC4339a) objM87133R, 3);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(448999137);
                c28655q2.m87173q(false);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(modifierM3409f2.mo3471e(modifierM5391i), enumC31927f, 0L, AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-246523231, c28655q2, new C2626t2(z13, state)), c28655q, 12582912, 116);
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 5, modifier2, function3, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m41495g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m41496h(Function1 function1, C4762r c4762r) {
        function1.invoke(c4762r.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m41497i(boolean z4, C4762r c4762r, Composer composer, int i13) {
        C0213j c0213j;
        C0209i c0209i;
        C2305k c2305k;
        C0209i c0209i2;
        float f13;
        C0209i c0209i3;
        C0209i c0209i4;
        int i14;
        C0213j c0213j2;
        float f14;
        boolean z13;
        C2886a h7;
        C0213j c0213j3;
        C0209i c0209i5;
        C0209i c0209i6;
        C0209i c0209i7;
        C0209i c0209i8;
        boolean z14;
        C0213j c0213j4;
        C0209i c0209i9;
        C4760p c4760p;
        int i15;
        boolean z15;
        C0213j c0213j5;
        C0209i c0209i10;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f15 = 2;
            float f16 = 8;
            float f17 = f15 * f16;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f17, AbstractC1102d.m3409f(1.0f, c2314t));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f17);
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k2, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j6 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j6);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m);
            C0209i c0209i13 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i13);
            }
            C0209i c0209i14 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j6);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i13);
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, modifierM118962N2);
            String title = c4762r.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a h13 = c38072d.m121952e(c28655q, i16).getH4();
            long brandWhite = c38072d.m121949b(c28655q, i16).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(title, layoutWeightElement, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h13, null, c28655q, 0, i17, 196600);
            C28655q c28655q2 = c28655q;
            EnumC16313m0 endIcon = c4762r.getEndIcon();
            if (endIcon == null) {
                c28655q2.m87150e0(-1329864359);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1329864358);
                float f18 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(endIcon.toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(f18 * f18, c2314t), c38072d.m121949b(c28655q2, i16).getWhite50(), c28655q2, 432, 0);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 48);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j = c0213j6;
                c28655q2.m87163l(c0213j);
            } else {
                c0213j = c0213j6;
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i13;
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                c0209i = c0209i13;
            }
            AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            float f19 = 1;
            float f24 = f19 * f16;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f24), c2305k2, c28655q2, 6);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N4);
            String tag = c4762r.getTag();
            if (tag == null) {
                c28655q2.m87150e0(1408267532);
                z13 = false;
                c28655q2.m87173q(false);
                c2305k = c2305k2;
                c0209i2 = c0209i14;
                c0209i4 = c0209i;
                c0213j2 = c0213j;
                c0209i3 = c0209i11;
                f13 = f19;
                f14 = f24;
                i14 = 4;
            } else {
                c28655q2.m87150e0(1408267533);
                c2305k = c2305k2;
                c0209i2 = c0209i14;
                f13 = f19;
                c0209i3 = c0209i11;
                c0209i4 = c0209i;
                i14 = 4;
                c0213j2 = c0213j;
                f14 = f24;
                AbstractC30795n.m94707h(tag, null, c38072d.m121949b(c28655q2, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getH5(), null, c28655q2, 0, i17, 196602);
                c28655q2 = c28655q2;
                z13 = false;
                c28655q2.m87173q(false);
            }
            String text = c4762r.getBodyContent().getText();
            if (z4) {
                c28655q2.m87150e0(183989738);
                h7 = c38072d.m121952e(c28655q2, i16).getB2();
            } else {
                c28655q2.m87150e0(183990698);
                h7 = c38072d.m121952e(c28655q2, i16).getH4();
            }
            c28655q2.m87173q(z13);
            C2886a c2886a = h7;
            long jM73370c = z4 ? AbstractC25012a.m73370c(c28655q2, 183993071, c38072d, c28655q2, i16) : AbstractC25012a.m73366B(c28655q2, 183994066, c38072d, c28655q2, i16);
            c28655q2.m87173q(z13);
            C28655q c28655q3 = c28655q2;
            AbstractC14537h.m41504c(text, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886a, null, Float.valueOf(0.5f), c28655q3, 0, i17 | 100666416, 186362);
            C28655q c28655q4 = c28655q3;
            String pill = c4762r.getBodyContent().getPill();
            if (pill == null) {
                c28655q4.m87150e0(1409079918);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(1409079919);
                AbstractC17746g1.m50874j(AbstractC8693b.m21278l(pill), c38072d.m121949b(c28655q4, i16).getWhite10(), null, c38072d.m121949b(c28655q4, i16).getBrandWhite(), null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, null, null, 0.0f, null, null, null, 0, 0, null, null, c28655q4, TextResource.$stable, 0, 0, 8388596);
                c28655q4 = c28655q4;
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
            if (AbstractC22676k.m65745e(c4762r.getBodyContent().getImage(), AbstractC22403o.b.f87641b)) {
                c28655q4.m87150e0(1470462960);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(1470066067);
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3424u(f17, c2314t));
                C28655q c28655q5 = c28655q4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c4762r.getBodyContent().getImage(), null, null, c28655q5, AbstractC22403o.f87638a, 3), null, AbstractC1099a.m3398t(AbstractC1102d.m3419p(24 * i14, c2314t), 0.0f, 0.0f, f17, 0.0f, 11), null, null, 0.0f, null, c28655q5, 432, 120);
                c28655q4 = c28655q5;
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
            if (!z4 || c4762r.getCta() == null) {
                c0213j3 = c0213j2;
                c0209i5 = c0209i3;
                c0209i6 = r43;
                c0209i7 = c0209i4;
                c0209i8 = c0209i2;
                z14 = false;
                c28655q4.m87150e0(584918443);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(584177078);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q4, 54);
                int iHashCode5 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c0213j5 = c0213j2;
                    c28655q4.m87163l(c0213j5);
                } else {
                    c0213j5 = c0213j2;
                    c28655q4.m87178s0();
                }
                C0209i c0209i15 = c0209i3;
                AbstractC28683x.m87239G(c28655q4, c0209i15, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q4, c0209i12, interfaceC28653p1M87165m5);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                    c0209i10 = c0209i4;
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i10);
                } else {
                    c0209i10 = c0209i4;
                }
                C0209i c0209i16 = c0209i2;
                AbstractC28683x.m87239G(c28655q4, c0209i16, modifierM118962N5);
                C28655q c28655q6 = c28655q4;
                c0213j3 = c0213j5;
                c0209i8 = c0209i16;
                c0209i5 = c0209i15;
                c0209i6 = c0209i12;
                c0209i7 = c0209i10;
                AbstractC30795n.m94707h(c4762r.getCta(), null, c38072d.m121949b(c28655q4, i16).getAccentOnboardingAction(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, i16).getSh4(), null, c28655q6, 0, i17, 196602);
                c28655q4 = c28655q6;
                float f25 = i14;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.CARET_FORWARD.toWhoopIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f25 * f25, c2314t), c38072d.m121949b(c28655q4, i16).getAccentOnboardingAction(), c28655q4, 432, 0);
                c28655q4.m87173q(true);
                z14 = false;
                c28655q4.m87173q(false);
            }
            C4760p footer = c4762r.getFooter();
            if (footer == null) {
                c28655q4.m87150e0(585021176);
                c28655q4.m87173q(z14);
                z15 = true;
            } else {
                c28655q4.m87150e0(585021177);
                float f26 = i14;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t), f15, f26);
                long black20 = c38072d.m121949b(c28655q4, i16).getBlack20();
                C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                float f27 = ((float) 1.5d) * f16;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(modifierM53364e, black20, c17916v0), f27, f27);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q4, 54);
                int iHashCode6 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM3395q);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c0213j4 = c0213j3;
                    c28655q4.m87163l(c0213j4);
                } else {
                    c0213j4 = c0213j3;
                    c28655q4.m87178s0();
                }
                C0209i c0209i17 = c0209i5;
                AbstractC28683x.m87239G(c28655q4, c0209i17, c22994r1M66759a4);
                C0209i c0209i18 = c0209i6;
                AbstractC28683x.m87239G(c28655q4, c0209i18, interfaceC28653p1M87165m6);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode6))) {
                    c0209i9 = c0209i7;
                    AbstractC11266d.m30471y(iHashCode6, c28655q4, iHashCode6, c0209i9);
                } else {
                    c0209i9 = c0209i7;
                }
                C0209i c0209i19 = c0209i8;
                AbstractC28683x.m87239G(c28655q4, c0209i19, modifierM118962N6);
                EnumC16313m0 enumC16313m0M15003b = footer.getIcon();
                if (enumC16313m0M15003b == null) {
                    c28655q4.m87150e0(-1247274141);
                    c28655q4.m87173q(false);
                    c4760p = footer;
                    i15 = 1;
                } else {
                    c28655q4.m87150e0(-1247274140);
                    c4760p = footer;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3419p(5 * f26, c2314t), f13, f26), m41500l(footer.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String(), c28655q4, 0), c17916v0);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    int iHashCode7 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3358c);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j4);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i17, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q4, c0209i18, interfaceC28653p1M87165m7);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode7))) {
                        AbstractC11266d.m30471y(iHashCode7, c28655q4, iHashCode7, c0209i9);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i19, modifierM118962N7);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M15003b.toWhoopIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(3 * f26, c2314t), m41501m(c4760p.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String(), c28655q4, 0), c28655q4, 432, 0);
                    i15 = 1;
                    c28655q4.m87173q(true);
                    c28655q4.m87173q(false);
                }
                AbstractC11816d.m31681b(1.3f, null, new InterfaceC11815c.a(null, new C39174f(f14), i15, null), new InterfaceC11815c.b(c2305k, new C39174f(((float) 0.25d) * f16), null), AbstractC37817c.m121344e(405543279, c28655q4, new C13242h(c4760p, 13)), c28655q4, (InterfaceC11815c.a.f38406c << 6) | 24582 | (InterfaceC11815c.b.f38409c << 9), 2);
                z15 = true;
                c28655q4.m87173q(true);
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(z15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m41498j(C4760p c4760p, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM15004c = c4760p.getStartTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a b6 = c38072d.m121952e(c28655q, i14).getB2();
            long jM73366B = c4760p.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC4761q.ERROR ? AbstractC25012a.m73366B(c28655q, -1114924391, c38072d, c28655q, i14) : AbstractC25012a.m73370c(c28655q, -1114923306, c38072d, c28655q, i14);
            c28655q.m87173q(false);
            long j7 = jM73366B;
            int i15 = C2886a.f11498d;
            AbstractC30795n.m94707h(strM15004c, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, i15 << 18, 196602);
            String strM15002a = c4760p.getEndTitle();
            if (strM15002a == null) {
                c28655q.m87150e0(-202800851);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-202800850);
                AbstractC30795n.m94707h(strM15002a, null, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 0, i15 << 18, 196602);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m41499k(Modifier modifier, C4762r c4762r, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m41494f(modifier, c4762r, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final long m41500l(EnumC4761q enumC4761q, Composer composer, int i13) {
        int i14 = a.f53108a[enumC4761q.ordinal()];
        if (i14 == 1 || i14 == 2) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1881804951);
            return AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
        }
        if (i14 != 3) {
            if (i14 != 4) {
                throw AbstractC11895b.m32003v(-1881808395, (C28655q) composer, false);
            }
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1881800151);
            return AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-1881802793);
        long accentNegativeTrend15 = C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getAccentNegativeTrend15();
        c28655q3.m87173q(false);
        return accentNegativeTrend15;
    }

    /* JADX INFO: renamed from: m */
    private static final long m41501m(EnumC4761q enumC4761q, Composer composer, int i13) {
        int i14 = a.f53108a[enumC4761q.ordinal()];
        if (i14 == 1 || i14 == 2) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1125804228);
            return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
        }
        if (i14 == 3) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1125802072);
            long accentNegativeTrend = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getAccentNegativeTrend();
            c28655q2.m87173q(false);
            return accentNegativeTrend;
        }
        if (i14 != 4) {
            throw AbstractC11895b.m32003v(-1125807661, (C28655q) composer, false);
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-1125799479);
        long recoveryHighRecovery = C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getRecoveryHighRecovery();
        c28655q3.m87173q(false);
        return recoveryHighRecovery;
    }
}
