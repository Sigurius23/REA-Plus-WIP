package p599wz;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.link.LinkActivity;
import ec3.InterfaceC13087t1;
import g00.AbstractC14936g;
import h00.AbstractC16495c0;
import h00.C16493b0;
import h00.C16508j;
import h40.C16845k;
import i00.AbstractC17837a;
import java.util.Map;
import k20.C22136a;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m40.C25046w;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p025b1.C2213d;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p161g.AbstractActivityC14909l;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pp2.C29451o;
import s10.C32061c;
import se.AbstractC32410a;
import v20.C35567g;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: wz.n1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37740n1 {

    /* JADX INFO: renamed from: a */
    public static final C32061c f161699a = new C32061c(9);

    /* JADX INFO: renamed from: b */
    public static final C32061c f161700b = new C32061c(10);

    /* JADX INFO: renamed from: a */
    public static final void m121152a(C37770y viewModel, C16845k bottomSheetState, Composer composer, int i13) {
        C16845k c16845k;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(bottomSheetState, "bottomSheetState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2002168174);
        if ((((c28655q.m87157i(viewModel) ? 4 : 2) | i13 | (c28655q.m87157i(bottomSheetState) ? 32 : 16)) & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            c16845k = bottomSheetState;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(viewModel.f161777V, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(viewModel.f161772Q, c28655q, 0);
            c28655q.m87150e0(1969104857);
            boolean zM87153g = c28655q.m87153g(viewModel);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                C16493b0 c16493b0 = new C16493b0(new C35567g(1, viewModel, C37770y.class, "onContentCanScrollBackwardChanged", "onContentCanScrollBackwardChanged(Z)V", 0, 9));
                c28655q.m87172p0(c16493b0);
                objM87133R = c16493b0;
            }
            c28655q.m87173q(false);
            C28673u1[] c28673u1Arr = {AbstractC16495c0.f63391a.mo86977a((C16493b0) objM87133R), AbstractC17837a.f69350a.mo86977a(new C25046w((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b), 30)), AbstractC14936g.f55704a.mo86977a(viewModel.f161760E.f161628b0)};
            c16845k = bottomSheetState;
            AbstractC28683x.m87248b(c28673u1Arr, AbstractC37817c.m121344e(114420562, c28655q, new C2213d(viewModel, c16845k, interfaceC28601c1M83597t, interfaceC28601c1M83597t2, 7)), c28655q, 56);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29451o(viewModel, c16845k, i13, 27);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m121153b(final C16845k bottomSheetState, InterfaceC37752r1 screenState, final C16508j appBarState, final C22136a eventReporter, final InterfaceC13087t1 navigationChannel, final Function1 onNavBackStackEntryChanged, final InterfaceC4339a onDismissClicked, final InterfaceC4339a onBackPressed, final InterfaceC4351m navigate, final InterfaceC4339a dismiss, final Function1 dismissWithResult, final InterfaceC4339a getLinkAccount, final Function1 handleViewAction, final Function1 moveToWeb, final InterfaceC4339a goBack, final InterfaceC4339a changeEmail, Composer composer, final int i13) {
        C28655q c28655q;
        InterfaceC37752r1 interfaceC37752r1;
        AbstractC22676k.m65750j(bottomSheetState, "bottomSheetState");
        AbstractC22676k.m65750j(screenState, "screenState");
        AbstractC22676k.m65750j(appBarState, "appBarState");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(navigationChannel, "navigationChannel");
        AbstractC22676k.m65750j(onNavBackStackEntryChanged, "onNavBackStackEntryChanged");
        AbstractC22676k.m65750j(onDismissClicked, "onDismissClicked");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        AbstractC22676k.m65750j(navigate, "navigate");
        AbstractC22676k.m65750j(dismiss, "dismiss");
        AbstractC22676k.m65750j(dismissWithResult, "dismissWithResult");
        AbstractC22676k.m65750j(getLinkAccount, "getLinkAccount");
        AbstractC22676k.m65750j(handleViewAction, "handleViewAction");
        AbstractC22676k.m65750j(moveToWeb, "moveToWeb");
        AbstractC22676k.m65750j(goBack, "goBack");
        AbstractC22676k.m65750j(changeEmail, "changeEmail");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(524961075);
        int i14 = i13 | (c28655q2.m87157i(bottomSheetState) ? 4 : 2) | (c28655q2.m87153g(screenState) ? 32 : 16) | (c28655q2.m87157i(appBarState) ? 256 : 128);
        boolean zM87153g = c28655q2.m87153g(eventReporter);
        int i15 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        int i16 = i14 | (zM87153g ? 2048 : 1024);
        boolean zM87157i = c28655q2.m87157i(navigationChannel);
        int i17 = DfuBaseService.ERROR_REMOTE_MASK;
        int i18 = i16 | (zM87157i ? 16384 : 8192);
        boolean zM87157i2 = c28655q2.m87157i(onNavBackStackEntryChanged);
        int i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        int i24 = i18 | (zM87157i2 ? 131072 : 65536) | (c28655q2.m87157i(onDismissClicked) ? 1048576 : 524288) | (c28655q2.m87157i(onBackPressed) ? 8388608 : 4194304) | (c28655q2.m87157i(navigate) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE) | (c28655q2.m87157i(dismiss) ? 536870912 : 268435456);
        int i25 = (c28655q2.m87157i(dismissWithResult) ? 4 : 2) | (c28655q2.m87157i(getLinkAccount) ? 32 : 16) | (c28655q2.m87157i(handleViewAction) ? 256 : 128);
        if (c28655q2.m87157i(moveToWeb)) {
            i15 = 2048;
        }
        int i26 = i25 | i15;
        if (c28655q2.m87157i(goBack)) {
            i17 = 16384;
        }
        int i27 = i26 | i17;
        if (c28655q2.m87157i(changeEmail)) {
            i19 = 131072;
        }
        int i28 = i27 | i19;
        if ((i24 & 306783379) == 306783378 && (i28 & 74899) == 74898 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            interfaceC37752r1 = screenState;
            c28655q = c28655q2;
        } else {
            boolean z4 = screenState instanceof C37743o1;
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q2.m87150e0(-33478784);
                int i29 = i24 << 3;
                int i34 = i28 << 9;
                int i35 = (i29 & 57344) | 70 | (i29 & 112) | (i29 & 7168) | ((i24 >> 6) & 458752) | (i34 & 3670016) | (i34 & 29360128) | ((i24 << 9) & 234881024) | ((i24 << 15) & 1879048192);
                int i36 = i24 >> 21;
                AbstractC32410a.m101030g(AbstractC1136a.m3599a(c2314t, "full_screen_content_tag"), bottomSheetState, ((C37743o1) screenState).f161706a, appBarState, eventReporter, onBackPressed, moveToWeb, goBack, onNavBackStackEntryChanged, navigationChannel, handleViewAction, navigate, dismiss, dismissWithResult, getLinkAccount, changeEmail, c28655q2, i35, (i34 & 7168) | ((i28 >> 6) & 14) | (i36 & 112) | (i36 & 896) | (i34 & 57344) | (i28 & 458752));
                c28655q = c28655q2;
                c28655q.m87173q(false);
                interfaceC37752r1 = screenState;
            } else {
                c28655q = c28655q2;
                interfaceC37752r1 = screenState;
                if (interfaceC37752r1.equals(C37746p1.f161711a)) {
                    c28655q.m87150e0(-1247977704);
                    c28655q.m87173q(false);
                } else {
                    if (!(interfaceC37752r1 instanceof C37749q1)) {
                        throw AbstractC11895b.m32003v(-1248007298, c28655q, false);
                    }
                    c28655q.m87150e0(-32542460);
                    AbstractC22674j.m65732r(AbstractC1136a.m3599a(c2314t, "verification_dialog_content_tag"), ((C37749q1) interfaceC37752r1).f161712a, changeEmail, onDismissClicked, dismissWithResult, c28655q, ((i28 >> 9) & 896) | 6 | ((i24 >> 9) & 7168) | ((i28 << 12) & 57344));
                    c28655q.m87173q(false);
                }
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final InterfaceC37752r1 interfaceC37752r2 = interfaceC37752r1;
            c28677v1M87180u.f115982d = new InterfaceC4351m(interfaceC37752r2, appBarState, eventReporter, navigationChannel, onNavBackStackEntryChanged, onDismissClicked, onBackPressed, navigate, dismiss, dismissWithResult, getLinkAccount, handleViewAction, moveToWeb, goBack, changeEmail, i13) { // from class: wz.f1

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ InterfaceC13087t1 f161588E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ Function1 f161589F;

                /* JADX INFO: renamed from: G */
                public final /* synthetic */ InterfaceC4339a f161590G;

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ InterfaceC4339a f161591H;

                /* JADX INFO: renamed from: I */
                public final /* synthetic */ InterfaceC4351m f161592I;

                /* JADX INFO: renamed from: J */
                public final /* synthetic */ InterfaceC4339a f161593J;

                /* JADX INFO: renamed from: K */
                public final /* synthetic */ Function1 f161594K;

                /* JADX INFO: renamed from: L */
                public final /* synthetic */ InterfaceC4339a f161595L;

                /* JADX INFO: renamed from: M */
                public final /* synthetic */ Function1 f161596M;

                /* JADX INFO: renamed from: N */
                public final /* synthetic */ Function1 f161597N;

                /* JADX INFO: renamed from: O */
                public final /* synthetic */ InterfaceC4339a f161598O;

                /* JADX INFO: renamed from: P */
                public final /* synthetic */ InterfaceC4339a f161599P;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ InterfaceC37752r1 f161601x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ C16508j f161602y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ C22136a f161603z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(9);
                    AbstractC37740n1.m121153b(this.f161600w, this.f161601x, this.f161602y, this.f161603z, this.f161588E, this.f161589F, this.f161590G, this.f161591H, this.f161592I, this.f161593J, this.f161594K, this.f161595L, this.f161596M, this.f161597N, this.f161598O, this.f161599P, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m121154c(String str, Map map) {
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                builderBuildUpon.appendQueryParameter(str2, str3);
            }
        }
        String string = builderBuildUpon.build().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public static final LinkActivity m121155d(Composer composer) {
        AbstractActivityC14909l abstractActivityC14909l;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(994393249);
        Context baseContext = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        AbstractC22676k.m65750j(baseContext, "<this>");
        if (baseContext instanceof AbstractActivityC14909l) {
            abstractActivityC14909l = (AbstractActivityC14909l) baseContext;
        } else {
            while (baseContext instanceof ContextWrapper) {
                if (baseContext instanceof AbstractActivityC14909l) {
                    abstractActivityC14909l = (AbstractActivityC14909l) baseContext;
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            abstractActivityC14909l = null;
        }
        AbstractC22676k.m65748h(abstractActivityC14909l, "null cannot be cast to non-null type com.stripe.android.link.LinkActivity");
        LinkActivity linkActivity = (LinkActivity) abstractActivityC14909l;
        c28655q.m87173q(false);
        return linkActivity;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC38794c0 m121156e(InterfaceC37739n0 interfaceC37739n0) {
        if ((interfaceC37739n0 instanceof C37724i0) || (interfaceC37739n0 instanceof C37727j0) || (interfaceC37739n0 instanceof C37733l0)) {
            return null;
        }
        if (interfaceC37739n0 instanceof C37730k0) {
            return ((C37730k0) interfaceC37739n0).f161676w.mo121164h();
        }
        if (interfaceC37739n0 instanceof C37736m0) {
            return ((C37736m0) interfaceC37739n0).f161690w;
        }
        throw new NoWhenBranchMatchedException();
    }
}
