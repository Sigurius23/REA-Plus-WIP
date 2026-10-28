package v71;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b11.C2275b;
import b11.C2276c;
import bm2.C3467p0;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import gb1.AbstractC15673b0;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import js1.C21915f;
import kd1.C22411w;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13806m1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import re1.C31324k;
import rz0.AbstractC31926e;
import v01.C35509k;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: v71.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aS\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a=\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lv71/i;", "state", "Lkotlin/Function1;", "Lcom/whoop/navigation/e;", "Ll83/a0;", "backendDrivenNavigationAction", "", "action", "onHeaderCtaEvent", "q", "(Landroidx/compose/ui/Modifier;Lv71/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/navigation/models/GenericInteraction;", "ctaInteraction", "navigationAction", "onNavigationAction", "x", "(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "Lm91/u;", "items", "n", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "k", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lv71/a;", "style", "y", "(Landroidx/compose/ui/Modifier;Lv71/a;)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35767h {

    /* JADX INFO: renamed from: v71.h$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f152123a;

        static {
            int[] iArr = new int[EnumC35760a.values().length];
            try {
                iArr[EnumC35760a.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35760a.AI_COACH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f152123a = iArr;
        }
    }

    /* JADX INFO: renamed from: k */
    private static final void m113343k(Modifier modifier, List<? extends InterfaceC25312u> list, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2379038);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i17 = i15;
        boolean z4 = false;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            for (InterfaceC25312u interfaceC25312u : list) {
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z4);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                boolean z13 = (i17 & 896) == 256;
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C2275b(function1, 19);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
                c28655q.m87173q(true);
                z4 = false;
            }
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21915f(modifier2, list, function1, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m113344l(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m113345m(Modifier modifier, List list, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m113343k(modifier, list, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m113346n(Modifier modifier, List<? extends InterfaceC25312u> items, Function1 action, Function1 backendDrivenNavigationAction, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(backendDrivenNavigationAction, "backendDrivenNavigationAction");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1683805318);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(items) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(action) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(backendDrivenNavigationAction) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i15;
        int i18 = 0;
        if (c28655q.m87135U(i17 & 1, (i17 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            boolean z4 = featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA);
            int i19 = 0;
            for (Object obj : items) {
                int i24 = i19 + 1;
                if (i19 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, i18);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                boolean z13 = z4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                boolean zM87149e = ((i17 & 7168) == 2048) | ((i17 & 896) == 256) | c28655q.m87149e(i19);
                Object objM87133R = c28655q.m87133R();
                if (zM87149e || objM87133R == C28635l.f115821a) {
                    objM87133R = new C13806m1(backendDrivenNavigationAction, action, i19, 3);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function1 = (Function1) objM87133R;
                C2314t c2314t2 = c2314t;
                int i25 = i19;
                AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, 0, 6);
                if (!z13 || i25 == AbstractC37056f.m118951C(items)) {
                    c28655q.m87150e0(-1095256508);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1095334349);
                    AbstractC25012a.m73388u((float) 0.5d, 8, c2314t2, c28655q, false);
                }
                c28655q.m87173q(true);
                z4 = z13;
                c2314t = c2314t2;
                i18 = 0;
                i19 = i24;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c(modifier2, (Object) items, (Object) action, (InterfaceC23459e) backendDrivenNavigationAction, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m113347o(Function1 function1, Function1 function2, int i13, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof C9598e) {
            function1.invoke(it);
        } else {
            function2.invoke(new AbstractC35769j.a(i13, it));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m113348p(Modifier modifier, List list, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m113346n(modifier, list, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017b  */
    /* JADX WARN: Code duplicated, block: B:103:0x018a  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x0115  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x011d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x0142  */
    /* JADX INFO: renamed from: q */
    public static final void m113349q(Modifier modifier, C35768i state, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        boolean z4;
        boolean z13;
        C28655q c28655q;
        Modifier modifier3;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        FeatureFlagChecker featureFlagChecker;
        InterfaceC22973k1 interfaceC22973k1M113361e;
        long jM125379a1;
        float f13;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1908928358);
        int i24 = i14 & 1;
        if (i24 != 0) {
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
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                function4 = function1;
                i15 |= c28655q2.m87157i(function4) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function2;
                    if (c28655q2.m87157i(function5)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q2.m87157i(function6)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    z4 = true;
                    if ((i15 & 9363) != 9362) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z13)) {
                        c2314t = C2314t.f9131w;
                        if (i24 != 0) {
                            modifier2 = c2314t;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i25 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35509k(18);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function10 = (Function1) objM87133R3;
                        } else {
                            function10 = function4;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35509k(19);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function11 = (Function1) objM87133R2;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C35509k(20);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function6 = (Function1) objM87133R;
                        }
                        featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                        if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) && !featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
                            z4 = false;
                        }
                        interfaceC22973k1M113361e = state.getContentPadding();
                        if (interfaceC22973k1M113361e == null) {
                            if (z4) {
                                f13 = 2;
                            } else {
                                f13 = (float) 1.5d;
                            }
                            float f14 = f13 * 8;
                            float f15 = 2 * 8;
                            interfaceC22973k1M113361e = new C22976l1(f14, f15, f14, f15);
                        }
                        Modifier modifierM113357y = m113357y(c2314t, state.getBackgroundStyle());
                        if (z4) {
                            c28655q2.m87150e0(529141357);
                            jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
                        } else {
                            c28655q2.m87150e0(529142348);
                            jM125379a1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite5();
                            c28655q2.m87173q(false);
                        }
                        modifier3 = modifier2;
                        Function1 function12 = function6;
                        c28655q = c28655q2;
                        AbstractC31926e.m99375j(modifierM113357y, null, jM125379a1, null, null, null, 0.0f, AbstractC37817c.m121344e(-877966602, c28655q2, new C3467p0(modifier3, interfaceC22973k1M113361e, state, function12, function10, function11, featureFlagChecker)), c28655q, 12582912, 122);
                        function7 = function10;
                        function9 = function12;
                        function8 = function11;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        function7 = function4;
                        function8 = function5;
                        function9 = function6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C35766g((Object) modifier3, (Object) state, (Object) function7, (Object) function8, (Object) function9, i13, i14, 0);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                z4 = true;
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35509k(18);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function10 = (Function1) objM87133R3;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35509k(19);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function11 = (Function1) objM87133R2;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(20);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = (Function1) objM87133R;
                    }
                    featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                    if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                        z4 = false;
                    }
                    interfaceC22973k1M113361e = state.getContentPadding();
                    if (interfaceC22973k1M113361e == null) {
                        if (z4) {
                            f13 = 2;
                        } else {
                            f13 = (float) 1.5d;
                        }
                        float f16 = f13 * 8;
                        float f17 = 2 * 8;
                        interfaceC22973k1M113361e = new C22976l1(f16, f17, f16, f17);
                    }
                    Modifier modifierM113357y2 = m113357y(c2314t, state.getBackgroundStyle());
                    if (z4) {
                        c28655q2.m87150e0(529141357);
                        jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
                    } else {
                        c28655q2.m87150e0(529142348);
                        jM125379a1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite5();
                        c28655q2.m87173q(false);
                    }
                    modifier3 = modifier2;
                    Function1 function13 = function6;
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(modifierM113357y2, null, jM125379a1, null, null, null, 0.0f, AbstractC37817c.m121344e(-877966602, c28655q2, new C3467p0(modifier3, interfaceC22973k1M113361e, state, function13, function10, function11, featureFlagChecker)), c28655q, 12582912, 122);
                    function7 = function10;
                    function9 = function13;
                    function8 = function11;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) modifier3, (Object) state, (Object) function7, (Object) function8, (Object) function9, i13, i14, 0);
                }
            }
            i15 |= 3072;
            function5 = function2;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q2.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                z4 = true;
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35509k(18);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function10 = (Function1) objM87133R3;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35509k(19);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function11 = (Function1) objM87133R2;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(20);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = (Function1) objM87133R;
                    }
                    featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                    if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                        z4 = false;
                    }
                    interfaceC22973k1M113361e = state.getContentPadding();
                    if (interfaceC22973k1M113361e == null) {
                        if (z4) {
                            f13 = 2;
                        } else {
                            f13 = (float) 1.5d;
                        }
                        float f18 = f13 * 8;
                        float f19 = 2 * 8;
                        interfaceC22973k1M113361e = new C22976l1(f18, f19, f18, f19);
                    }
                    Modifier modifierM113357y3 = m113357y(c2314t, state.getBackgroundStyle());
                    if (z4) {
                        c28655q2.m87150e0(529141357);
                        jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
                    } else {
                        c28655q2.m87150e0(529142348);
                        jM125379a1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite5();
                        c28655q2.m87173q(false);
                    }
                    modifier3 = modifier2;
                    Function1 function14 = function6;
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(modifierM113357y3, null, jM125379a1, null, null, null, 0.0f, AbstractC37817c.m121344e(-877966602, c28655q2, new C3467p0(modifier3, interfaceC22973k1M113361e, state, function14, function10, function11, featureFlagChecker)), c28655q, 12582912, 122);
                    function7 = function10;
                    function9 = function14;
                    function8 = function11;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) modifier3, (Object) state, (Object) function7, (Object) function8, (Object) function9, i13, i14, 0);
                }
            }
            i15 |= 24576;
            function6 = function3;
            z4 = true;
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35509k(18);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function10 = (Function1) objM87133R3;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35509k(19);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function11 = (Function1) objM87133R2;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35509k(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function6 = (Function1) objM87133R;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                    z4 = false;
                }
                interfaceC22973k1M113361e = state.getContentPadding();
                if (interfaceC22973k1M113361e == null) {
                    if (z4) {
                        f13 = 2;
                    } else {
                        f13 = (float) 1.5d;
                    }
                    float f110 = f13 * 8;
                    float f111 = 2 * 8;
                    interfaceC22973k1M113361e = new C22976l1(f110, f111, f110, f111);
                }
                Modifier modifierM113357y4 = m113357y(c2314t, state.getBackgroundStyle());
                if (z4) {
                    c28655q2.m87150e0(529141357);
                    jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
                } else {
                    c28655q2.m87150e0(529142348);
                    jM125379a1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite5();
                    c28655q2.m87173q(false);
                }
                modifier3 = modifier2;
                Function1 function15 = function6;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(modifierM113357y4, null, jM125379a1, null, null, null, 0.0f, AbstractC37817c.m121344e(-877966602, c28655q2, new C3467p0(modifier3, interfaceC22973k1M113361e, state, function15, function10, function11, featureFlagChecker)), c28655q, 12582912, 122);
                function7 = function10;
                function9 = function15;
                function8 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) modifier3, (Object) state, (Object) function7, (Object) function8, (Object) function9, i13, i14, 0);
            }
        }
        i15 |= 384;
        function4 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function5 = function2;
                if (c28655q2.m87157i(function5)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q2.m87157i(function6)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                z4 = true;
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35509k(18);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function10 = (Function1) objM87133R3;
                    } else {
                        function10 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35509k(19);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function11 = (Function1) objM87133R2;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35509k(20);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = (Function1) objM87133R;
                    }
                    featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                    if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                        z4 = false;
                    }
                    interfaceC22973k1M113361e = state.getContentPadding();
                    if (interfaceC22973k1M113361e == null) {
                        if (z4) {
                            f13 = 2;
                        } else {
                            f13 = (float) 1.5d;
                        }
                        float f112 = f13 * 8;
                        float f113 = 2 * 8;
                        interfaceC22973k1M113361e = new C22976l1(f112, f113, f112, f113);
                    }
                    Modifier modifierM113357y5 = m113357y(c2314t, state.getBackgroundStyle());
                    if (z4) {
                        c28655q2.m87150e0(529141357);
                        jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
                    } else {
                        c28655q2.m87150e0(529142348);
                        jM125379a1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite5();
                        c28655q2.m87173q(false);
                    }
                    modifier3 = modifier2;
                    Function1 function16 = function6;
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(modifierM113357y5, null, jM125379a1, null, null, null, 0.0f, AbstractC37817c.m121344e(-877966602, c28655q2, new C3467p0(modifier3, interfaceC22973k1M113361e, state, function16, function10, function11, featureFlagChecker)), c28655q, 12582912, 122);
                    function7 = function10;
                    function9 = function16;
                    function8 = function11;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function7 = function4;
                    function8 = function5;
                    function9 = function6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g((Object) modifier3, (Object) state, (Object) function7, (Object) function8, (Object) function9, i13, i14, 0);
                }
            }
            i15 |= 24576;
            function6 = function3;
            z4 = true;
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35509k(18);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function10 = (Function1) objM87133R3;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35509k(19);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function11 = (Function1) objM87133R2;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35509k(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function6 = (Function1) objM87133R;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                    z4 = false;
                }
                interfaceC22973k1M113361e = state.getContentPadding();
                if (interfaceC22973k1M113361e == null) {
                    if (z4) {
                        f13 = 2;
                    } else {
                        f13 = (float) 1.5d;
                    }
                    float f114 = f13 * 8;
                    float f115 = 2 * 8;
                    interfaceC22973k1M113361e = new C22976l1(f114, f115, f114, f115);
                }
                Modifier modifierM113357y6 = m113357y(c2314t, state.getBackgroundStyle());
                if (z4) {
                    c28655q2.m87150e0(529141357);
                    jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
                } else {
                    c28655q2.m87150e0(529142348);
                    jM125379a1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite5();
                    c28655q2.m87173q(false);
                }
                modifier3 = modifier2;
                Function1 function17 = function6;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(modifierM113357y6, null, jM125379a1, null, null, null, 0.0f, AbstractC37817c.m121344e(-877966602, c28655q2, new C3467p0(modifier3, interfaceC22973k1M113361e, state, function17, function10, function11, featureFlagChecker)), c28655q, 12582912, 122);
                function7 = function10;
                function9 = function17;
                function8 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) modifier3, (Object) state, (Object) function7, (Object) function8, (Object) function9, i13, i14, 0);
            }
        }
        i15 |= 3072;
        function5 = function2;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function6 = function3;
                if (c28655q2.m87157i(function6)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            z4 = true;
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35509k(18);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function10 = (Function1) objM87133R3;
                } else {
                    function10 = function4;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35509k(19);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function11 = (Function1) objM87133R2;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35509k(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function6 = (Function1) objM87133R;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
                if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                    z4 = false;
                }
                interfaceC22973k1M113361e = state.getContentPadding();
                if (interfaceC22973k1M113361e == null) {
                    if (z4) {
                        f13 = 2;
                    } else {
                        f13 = (float) 1.5d;
                    }
                    float f116 = f13 * 8;
                    float f117 = 2 * 8;
                    interfaceC22973k1M113361e = new C22976l1(f116, f117, f116, f117);
                }
                Modifier modifierM113357y7 = m113357y(c2314t, state.getBackgroundStyle());
                if (z4) {
                    c28655q2.m87150e0(529141357);
                    jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
                } else {
                    c28655q2.m87150e0(529142348);
                    jM125379a1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite5();
                    c28655q2.m87173q(false);
                }
                modifier3 = modifier2;
                Function1 function18 = function6;
                c28655q = c28655q2;
                AbstractC31926e.m99375j(modifierM113357y7, null, jM125379a1, null, null, null, 0.0f, AbstractC37817c.m121344e(-877966602, c28655q2, new C3467p0(modifier3, interfaceC22973k1M113361e, state, function18, function10, function11, featureFlagChecker)), c28655q, 12582912, 122);
                function7 = function10;
                function9 = function18;
                function8 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                function7 = function4;
                function8 = function5;
                function9 = function6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g((Object) modifier3, (Object) state, (Object) function7, (Object) function8, (Object) function9, i13, i14, 0);
            }
        }
        i15 |= 24576;
        function6 = function3;
        z4 = true;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C35509k(18);
                    c28655q2.m87172p0(objM87133R3);
                }
                function10 = (Function1) objM87133R3;
            } else {
                function10 = function4;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35509k(19);
                    c28655q2.m87172p0(objM87133R2);
                }
                function11 = (Function1) objM87133R2;
            } else {
                function11 = function5;
            }
            if (i18 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C35509k(20);
                    c28655q2.m87172p0(objM87133R);
                }
                function6 = (Function1) objM87133R;
            }
            featureFlagChecker = (FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p());
            if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                z4 = false;
            }
            interfaceC22973k1M113361e = state.getContentPadding();
            if (interfaceC22973k1M113361e == null) {
                if (z4) {
                    f13 = 2;
                } else {
                    f13 = (float) 1.5d;
                }
                float f118 = f13 * 8;
                float f119 = 2 * 8;
                interfaceC22973k1M113361e = new C22976l1(f118, f119, f118, f119);
            }
            Modifier modifierM113357y8 = m113357y(c2314t, state.getBackgroundStyle());
            if (z4) {
                c28655q2.m87150e0(529141357);
                jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(529142348);
                jM125379a1 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite5();
                c28655q2.m87173q(false);
            }
            modifier3 = modifier2;
            Function1 function19 = function6;
            c28655q = c28655q2;
            AbstractC31926e.m99375j(modifierM113357y8, null, jM125379a1, null, null, null, 0.0f, AbstractC37817c.m121344e(-877966602, c28655q2, new C3467p0(modifier3, interfaceC22973k1M113361e, state, function19, function10, function11, featureFlagChecker)), c28655q, 12582912, 122);
            function7 = function10;
            function9 = function19;
            function8 = function11;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            function7 = function4;
            function8 = function5;
            function9 = function6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35766g((Object) modifier3, (Object) state, (Object) function7, (Object) function8, (Object) function9, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m113350r(C9598e c9598e) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m113351s(Object obj) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m113352t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m113353u(Modifier modifier, InterfaceC22973k1 interfaceC22973k1, C35768i c35768i, Function1 function1, Function1 function2, Function1 function3, FeatureFlagChecker featureFlagChecker, Composer composer, int i13) throws XmlPullParserException, IOException {
        float f13;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3393o(interfaceC22973k1, modifier));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C35764e c35764eM113364h = c35768i.getHeader();
            C2314t c2314t = C2314t.f9131w;
            if (c35764eM113364h != null) {
                c28655q.m87150e0(-1471152090);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * 8, 7);
                C35764e c35764eM113364h2 = c35768i.getHeader();
                List<String> listM113320c = c35768i.getHeader().m113320c();
                if (!(listM113320c instanceof Collection) || !listM113320c.isEmpty()) {
                    Iterator<T> it = listM113320c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z4 = true;
                            break;
                        }
                        if (!featureFlagChecker.isFeatureEnabled((String) it.next())) {
                            z4 = false;
                            break;
                        }
                    }
                } else {
                    z4 = true;
                    break;
                }
                boolean zM87157i = c28655q.m87157i(c35768i) | c28655q.m87153g(function1) | c28655q.m87153g(function2);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C31324k(c35768i, function1, function2, 13);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC35763d.m113314d(modifierM3398t, c35764eM113364h2, z4, (InterfaceC4339a) objM87133R, c28655q, 6, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1470477034);
                c28655q.m87173q(false);
            }
            float f14 = 8;
            m113346n(AbstractC1099a.m3396r(c2314t, 0.0f, ((float) 0.5d) * f14, 1), c35768i.m113365i(), function3, function2, c28655q, 6, 0);
            if (c35768i.m113363g().isEmpty()) {
                f13 = f14;
                c28655q.m87150e0(-1469821322);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1470165360);
                f13 = f14;
                m113343k(AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f14, 0.0f, 0.0f, 13), c35768i.m113363g(), function3, c28655q, 6, 0);
                c28655q.m87173q(false);
            }
            if (c35768i.getFooter() != null) {
                c28655q.m87150e0(-1469774016);
                AbstractC35761b.m113303d(AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13), c35768i.getFooter(), function2, c28655q, (C9598e.f28134d << 3) | 6, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1469537610);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m113354v(C35768i c35768i, Function1 function1, Function1 function2) {
        m113356x(c35768i.getHeader().getCtaInteraction(), c35768i.getHeader().getNavigationAction(), function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m113355w(Modifier modifier, C35768i c35768i, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m113349q(modifier, c35768i, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m113356x(GenericInteraction genericInteraction, C9598e c9598e, Function1 onHeaderCtaEvent, Function1 onNavigationAction) {
        AbstractC22676k.m65750j(onHeaderCtaEvent, "onHeaderCtaEvent");
        AbstractC22676k.m65750j(onNavigationAction, "onNavigationAction");
        if (genericInteraction != null) {
            onHeaderCtaEvent.invoke(genericInteraction);
        } else {
            onNavigationAction.invoke(c9598e);
        }
    }

    /* JADX INFO: renamed from: y */
    private static final Modifier m113357y(Modifier modifier, EnumC35760a enumC35760a) {
        int i13 = a.f152123a[enumC35760a.ordinal()];
        if (i13 == 1) {
            return modifier;
        }
        if (i13 == 2) {
            return AbstractC1092a.m3357b(modifier, AbstractC15673b0.m43974B(), C22411w.f87680a.m64535a().m64090c(), 0.0f, 4);
        }
        throw new NoWhenBranchMatchedException();
    }
}
