package p005a3;

import a63.C0498o;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p018ui.graphics.vector.VectorPainter;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.fragment.app.AbstractC1329o1;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1579e2;
import androidx.navigation.fragment.NavHostFragment;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.C2986a0;
import bc3.C2990b0;
import bc3.C3004e2;
import c93.InterfaceC4339a;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.whoop.android.R;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import io.sentry.C20513q6;
import io.sentry.ThreadFactoryC20389j0;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.util.ScheduledExecutorServiceC20236d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23470p;
import o63.C27616g;
import p002a0.C0057v0;
import p026b2.AbstractC2316v;
import p027b3.C2472z1;
import p040c0.EnumC3771q0;
import p077d0.C11421z1;
import p114eb.AbstractC12939a0;
import p114eb.C12954f0;
import p114eb.C12967j1;
import p114eb.C12968k;
import p114eb.C12982q;
import p114eb.C12991u0;
import p114eb.C12993v0;
import p173gj.C15903d;
import p174gk.C15922a;
import p189hb.C17068d;
import p189hb.C17070f;
import p208i2.C17920x0;
import p223ik.InterfaceC18598b;
import p241j3.C21265b;
import p282kk.C22533b;
import p390p1.C28621h1;
import p390p1.InterfaceC28670t2;
import p412q3.C29863b0;
import p446r1.C30848b;
import p446r1.C30849c;
import p492t2.C33316d;
import p492t2.C33319g;
import p550vd.AbstractC35902e;
import p581we.C37199o;
import p635y2.C39091f0;
import p635y2.C39115n0;
import p635y2.C39137u1;
import p669z2.C40001d;
import p669z2.C40005h;
import p685zl.C40866a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import uf3.C34911a;
import y53.AbstractC39243c;
import z53.C40115g;

/* JADX INFO: renamed from: a3.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0222l0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f735w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f736x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0222l0(Object obj, int i13) {
        super(0);
        this.f735w = i13;
        this.f736x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0118 A[LOOP:3: B:32:0x00e3->B:42:0x0118, LOOP_END] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f735w;
        int i14 = 2;
        boolean z4 = false;
        z4 = false;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f736x;
        switch (i13) {
            case 0:
                C0246r0 c0246r0M643t = ((C0230n0) obj).m643t();
                c0246r0M643t.f854p.f674a0 = true;
                C0187c1 c0187c1 = c0246r0M643t.f855q;
                if (c0187c1 != null) {
                    c0187c1.f603U = true;
                }
                return c23454a0;
            case 1:
                C17920x0 c17920x0 = NodeCoordinator.f4853k0;
                ((Function1) obj).invoke(c17920x0);
                c17920x0.f69658W = c17920x0.f69650O.mo39171a(c17920x0.f69653R, c17920x0.f69655T, c17920x0.f69654S);
                return c23454a0;
            case 2:
                return Boolean.valueOf(((C0498o) obj).f1683c);
            case 4:
                ((InterfaceC4339a) ((C22669g0) obj).f89336w).invoke();
            case 3:
                return c23454a0;
            case 5:
                C11421z1 c11421z1 = (C11421z1) obj;
                Object objMo2428y0 = c11421z1.f36630a.mo2428y0();
                EnumC3771q0 enumC3771q0 = EnumC3771q0.f15394y;
                if (objMo2428y0 == enumC3771q0 && c11421z1.f36633d.getValue() == enumC3771q0) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 6:
                AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) obj;
                abstractC12939a0.getClass();
                return new C12993v0(abstractC12939a0.f44680a, abstractC12939a0.f44702w);
            case 7:
                String uriPattern = (String) obj;
                AbstractC22676k.m65750j(uriPattern, "uriPattern");
                return new C12954f0(uriPattern, null, null);
            case 8:
                return Boolean.valueOf(AbstractC35902e.m113940H("androidx.fragment.app.FragmentActivity", ((C15903d) ((C37199o) obj).f159040w).f60138k));
            case 9:
                return AbstractC15751g.m44451d((Context) obj);
            case 10:
                List list = (List) ((InterfaceC28670t2) obj).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (AbstractC22676k.m65745e(((C12982q) obj2).f44844x.f44822w, "composable")) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 11:
                return new C15922a((C12968k) obj);
            case 12:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context context = navHostFragment.getContext();
                if (context == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                C12991u0 c12991u0 = new C12991u0(context);
                c12991u0.m36502O(navHostFragment);
                C1579e2 viewModelStore = navHostFragment.getViewModelStore();
                AbstractC22676k.m65749i(viewModelStore, "viewModelStore");
                c12991u0.m36503P(viewModelStore);
                Context contextRequireContext = navHostFragment.requireContext();
                AbstractC22676k.m65749i(contextRequireContext, "requireContext()");
                AbstractC1329o1 childFragmentManager = navHostFragment.getChildFragmentManager();
                AbstractC22676k.m65749i(childFragmentManager, "childFragmentManager");
                C17068d c17068d = new C17068d(contextRequireContext, childFragmentManager);
                C12967j1 c12967j1 = c12991u0.f44702w;
                c12967j1.m36450a(c17068d);
                Context contextRequireContext2 = navHostFragment.requireContext();
                AbstractC22676k.m65749i(contextRequireContext2, "requireContext()");
                AbstractC1329o1 childFragmentManager2 = navHostFragment.getChildFragmentManager();
                AbstractC22676k.m65749i(childFragmentManager2, "childFragmentManager");
                int id4 = navHostFragment.getId();
                if (id4 == 0 || id4 == -1) {
                    id4 = R.id.nav_host_fragment_container;
                }
                c12967j1.m36450a(new C17070f(contextRequireContext2, childFragmentManager2, id4));
                Bundle bundleM88291a = navHostFragment.getSavedStateRegistry().m88291a("android-support-nav:fragment:navControllerState");
                if (bundleM88291a != null) {
                    c12991u0.m36380H(bundleM88291a);
                }
                navHostFragment.getSavedStateRegistry().m88293c("android-support-nav:fragment:navControllerState", new C2472z1(c12991u0, i14));
                Bundle bundleM88291a2 = navHostFragment.getSavedStateRegistry().m88291a("android-support-nav:fragment:graphId");
                if (bundleM88291a2 != null) {
                    navHostFragment.f6513y = bundleM88291a2.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.getSavedStateRegistry().m88293c("android-support-nav:fragment:graphId", new C2472z1(navHostFragment, 3));
                int i15 = navHostFragment.f6513y;
                C23470p c23470p = c12991u0.f44677D;
                if (i15 != 0) {
                    c12991u0.m36383K(((C12993v0) c23470p.getValue()).m36506b(i15), null);
                } else {
                    Bundle arguments = navHostFragment.getArguments();
                    int i16 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i16 != 0) {
                        c12991u0.m36383K(((C12993v0) c23470p.getValue()).m36506b(i16), bundle);
                    }
                }
                return c12991u0;
            case 13:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC20389j0(1));
                AbstractC22676k.m65747g(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                C20513q6 c20513q6 = ((ReplayIntegration) obj).f75804z;
                if (c20513q6 != null) {
                    return new ScheduledExecutorServiceC20236d(scheduledExecutorServiceNewSingleThreadScheduledExecutor, c20513q6);
                }
                AbstractC22676k.m65757q("options");
                throw null;
            case 14:
                C21265b c21265b = (C21265b) obj;
                c21265b.f81189g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c21265b.m59668b();
                    return c23454a0;
                } finally {
                    Trace.endSection();
                }
            case 15:
                C22533b c22533b = (C22533b) obj;
                InterfaceC18598b interfaceC18598b = c22533b.f88562e;
                C15903d c15903d = c22533b.f88558a;
                return interfaceC18598b.mo33430g(c22533b, c15903d.f60128a, c22533b.f88563f, c15903d.f60133f);
            case 16:
                VectorPainter vectorPainter = (VectorPainter) obj;
                int i17 = vectorPainter.f4829K;
                C28621h1 c28621h1 = vectorPainter.f4826H;
                if (i17 == c28621h1.m87024x()) {
                    c28621h1.m87025y(c28621h1.m87024x() + 1);
                }
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                Object systemService = ((View) ((C0237p) obj).f812x).getContext().getSystemService("input_method");
                AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new BaseInputConnection(((C29863b0) obj).f122049a, false);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C33316d) obj).f138980d;
            case 20:
                return ((C33319g) obj).m105693X0();
            case 21:
                return "| put parameters on stack " + ((C34911a) obj) + ' ';
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C39115n0 c39115n0M124665a = ((C39137u1) obj).m124665a();
                C0230n0 c0230n0 = c39115n0M124665a.f168240w;
                if (c39115n0M124665a.f168237N != ((C30848b) c0230n0.m639r()).f127226w.f127229y) {
                    C0057v0 c0057v0 = c39115n0M124665a.f168229F;
                    Object[] objArr = c0057v0.f172c;
                    long[] jArr = c0057v0.f170a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j7 = jArr[i18];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i19 = 8 - ((~(i18 - length)) >>> 31);
                                for (int i24 = 0; i24 < i19; i24++) {
                                    if ((255 & j7) < 128) {
                                        ((C39091f0) objArr[(i18 << 3) + i24]).f168165d = true;
                                    }
                                    j7 >>= 8;
                                }
                                if (i19 == 8) {
                                    if (i18 != length) {
                                        i18++;
                                    }
                                }
                            } else if (i18 != length) {
                                i18++;
                            }
                        }
                    }
                    if (c0230n0.f759G != null) {
                        if (!c0230n0.m648x()) {
                            C0230n0.m574t0(c0230n0, false, 7);
                        }
                    } else if (!c0230n0.m577A()) {
                        C0230n0.m575v0(c0230n0, false, 7);
                    }
                }
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC12889b.m36254T(new C3004e2(null), new C27616g(C2986a0.f11990w, 0)).plus((AbstractC3076z) ((C40115g) ((AbstractC39243c) obj)).f173158z.getValue()).plus(new C2990b0("ktor-okhttp-context"));
            case 24:
                C40001d c40001d = (C40001d) obj;
                C30849c c30849c = c40001d.f172587c;
                C30849c c30849c2 = c40001d.f172586b;
                C30849c c30849c3 = c40001d.f172589e;
                c40001d.f172590f = false;
                HashSet hashSet = new HashSet();
                C30849c c30849c4 = c40001d.f172588d;
                Object[] objArr2 = c30849c4.f127227w;
                int i25 = c30849c4.f127229y;
                for (int i26 = 0; i26 < i25; i26++) {
                    C0230n0 c0230n1 = (C0230n0) objArr2[i26];
                    C40005h c40005h = (C40005h) c30849c3.f127227w[i26];
                    AbstractC2316v abstractC2316v = (AbstractC2316v) c0230n1.f783e0.f743g;
                    if (abstractC2316v.f9141N) {
                        C40001d.m128237b(abstractC2316v, c40005h, hashSet);
                    }
                }
                c30849c4.m94890g();
                c30849c3.m94890g();
                Object[] objArr3 = c30849c2.f127227w;
                int i27 = c30849c2.f127229y;
                for (int i28 = 0; i28 < i27; i28++) {
                    C0189d c0189d = (C0189d) objArr3[i28];
                    C40005h c40005h2 = (C40005h) c30849c.f127227w[i28];
                    if (c0189d.f9141N) {
                        C40001d.m128237b(c0189d, c40005h2, hashSet);
                    }
                }
                c30849c2.m94890g();
                c30849c.m94890g();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((C0189d) it.next()).m463Z0();
                }
                return c23454a0;
            case 25:
                C22365e c22365e = AbstractC3050q0.f12077a;
                ((C40115g) obj).f173157y.getClass();
                return ExecutorC22364d.f87316w.limitedParallelism(4);
            default:
                return new C40866a((DrawablePainter) obj);
        }
    }
}
