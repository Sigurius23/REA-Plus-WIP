package com.whoop.stories;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.data.onboarding.FeatureEducationType;
import hj0.AbstractC17354m;
import ih1.C18522f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Locale;
import js2.C21927e;
import kd1.AbstractC22387b0;
import kk1.C22541b;
import l01.C23045q;
import l83.C23454a0;
import lc0.C23821c;
import lc0.C23825g;
import lf0.C23956p1;
import lh2.C24070a;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.AbstractC28163g0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15164u8;
import p163g1.AbstractC15166v0;
import p163g1.C15043i8;
import p163g1.C15077m1;
import p163g1.C15197y1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!²\u0006\u000e\u0010 \u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/stories/OnboardingStoriesDebugFragment;", "Lhj0/m;", "<init>", "()V", "", "featureEducationName", "Ll83/a0;", "M", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/util/List;", "onboardingStoryItems", "Lm91/p;", "x", "Lm91/p;", "debugOnboardingStoriesItemFactory", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "a", "text", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OnboardingStoriesDebugFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final List<C10256b> onboardingStoryItems;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25307p debugOnboardingStoriesItemFactory = Function1.m74306g(new C23825g(24));

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoriesDebugFragment$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J3\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;", "Lm91/f;", "Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "i", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10255a implements InterfaceC25297f<C10256b> {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final C23454a0 m26134e(p715kotlin.jvm.functions.Function1 function1, C10256b c10256b) {
            function1.invoke(c10256b.getEvent());
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final C23454a0 m26135f(C10255a c10255a, C10256b c10256b, InterfaceC22997s1 Button, Composer composer, int i13) {
            AbstractC22676k.m65750j(Button, "$this$Button");
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
                Modifier modifierM26138i = c10255a.m26138i(C2314t.f9131w);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM26138i);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC15011f9.m43114b(c10256b.getText(), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131066);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final C23454a0 m26136g(C10255a c10255a, Modifier modifier, C10256b c10256b, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
            c10255a.Compose(modifier, c10256b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: h */
        private final Modifier m26137h(Modifier modifier) {
            return AbstractC1099a.m3394p(8, AbstractC1102d.m3409f(1.0f, modifier));
        }

        /* JADX INFO: renamed from: i */
        private final Modifier m26138i(Modifier modifier) {
            return AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier), 0.0f, 8, 1);
        }

        @Override // p720m91.InterfaceC25297f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void Compose(Modifier modifier, C10256b itemState, p715kotlin.jvm.functions.Function1 onViewEvent, Composer composer, int i13) {
            int i14;
            AbstractC22676k.m65750j(modifier, "modifier");
            AbstractC22676k.m65750j(itemState, "itemState");
            AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87154g0(-1575744839);
            if ((i13 & 48) == 0) {
                i14 = (c28655q.m87153g(itemState) ? 32 : 16) | i13;
            } else {
                i14 = i13;
            }
            if ((i13 & 384) == 0) {
                i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                i14 |= c28655q.m87153g(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if (c28655q.m87135U(i14 & 1, (i14 & 1169) != 1168)) {
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(AbstractC17918w0.m51518f(0.25f, 0.25f, 0.25f, 0.0f, 24), 0L, 0L, 0L, c28655q, 6, 14);
                Modifier modifierM26137h = m26137h(C2314t.f9131w);
                boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C23045q(onViewEvent, itemState, 17);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC12350b.m34578a((InterfaceC4339a) objM87133R, modifierM26137h, false, null, null, null, c15077m1M43196a, null, AbstractC37817c.m121344e(-2009751351, c28655q, new C18522f(20, this, itemState)), c28655q, 805306368, 380);
                c28655q = c28655q;
            } else {
                c28655q.m87138X();
            }
            C28677v1 c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23956p1(i13, 10, this, modifier, itemState, onViewEvent);
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoriesDebugFragment$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10257c implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10256b f30996x;

        public C10257c(C10256b c10256b) {
            this.f30996x = c10256b;
        }

        /* JADX INFO: renamed from: a */
        public final void m26143a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            OnboardingStoriesDebugFragment.this.m26124M(this.f30996x.getFeatureEducationType().name());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m26143a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoriesDebugFragment$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10258d implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final C10258d f30997w = new C10258d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C10256b c10256b) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoriesDebugFragment$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10259e implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f30998w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f30999x;

        public C10259e(p715kotlin.jvm.functions.Function1 function1, List list) {
            this.f30998w = function1;
            this.f30999x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m26145a(int i13) {
            return this.f30998w.invoke(this.f30999x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26145a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoriesDebugFragment$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10260f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f31000w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ OnboardingStoriesDebugFragment f31001x;

        public C10260f(List list, OnboardingStoriesDebugFragment onboardingStoriesDebugFragment) {
            this.f31000w = list;
            this.f31001x = onboardingStoriesDebugFragment;
        }

        /* JADX INFO: renamed from: a */
        public final void m26146a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C10256b c10256b = (C10256b) this.f31000w.get(i13);
            c28655q.m87150e0(210871532);
            C25307p c25307p = this.f31001x.debugOnboardingStoriesItemFactory;
            boolean zM87157i = c28655q.m87157i(this.f31001x) | c28655q.m87153g(c10256b);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = this.f31001x.new C10257c(c10256b);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c10256b, c25307p, null, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m26146a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    public OnboardingStoriesDebugFragment() {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        this.onboardingStoryItems = AbstractC37056f.m118959K(new C10256b(FeatureEducationType.CUSTOMIZE_JOURNAL, null, str, 6, null), new C10256b(FeatureEducationType.SAVE_JOURNAL, str, str2, 6, null), new C10256b(FeatureEducationType.ALARM_SCHEDULING, str2, str3, 6, null), new C10256b(FeatureEducationType.WEIGHTLIFTING_MSK_STORY, str3, str4, 6, null), new C10256b(FeatureEducationType.DEVICE_SETUP_STORY, str4, str5, 6, null), new C10256b(FeatureEducationType.STRESS_MONITOR_STORY, str5, null, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m26123L(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10256b.class), new C10255a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final void m26124M(String featureEducationName) {
        AbstractC10268a.a aVarM26182a = AbstractC10268a.m26182a(featureEducationName);
        AbstractC22676k.m65749i(aVarM26182a, "actionDebugOnboardingToOnboarding(...)");
        AbstractC28163g0.m85259o(this).m85340f(aVarM26182a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m26125N(OnboardingStoriesDebugFragment onboardingStoriesDebugFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            float f13 = 8;
            float f14 = 2 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, c2314t);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
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
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f13, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            String strM26126O = m26126O(interfaceC28601c1);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C15043i8 c15043i8 = C15043i8.f56313a;
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            long jM125372X0 = c38072d.m121949b(c28655q, i14).getWhite20();
            long jM125372X1 = c38072d.m121949b(c28655q, i14).getWhite20();
            long j7 = C17919x.f69627d;
            C15197y1 c15197y1M43130h = C15043i8.m43130h(jM125430y, 0L, 0L, jM125372X0, 0L, jM125372X1, j7, 0L, 0L, c38072d.m121949b(c28655q, i14).getBrandWhite(), j7, 0L, 0L, c28655q, 1998742);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C21927e(10, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            C24070a c24070a = C24070a.f95108a;
            AbstractC15164u8.m43192a(strM26126O, (p715kotlin.jvm.functions.Function1) objM87133R2, modifierM3409f, false, null, c24070a.m70992d(), null, null, null, null, null, false, 0, 0, null, c15197y1M43130h, c28655q, 1573296, 0, 524216);
            c28655q.m87173q(true);
            boolean z4 = !AbstractC39414r.m125890i0(m26126O(interfaceC28601c1));
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14);
            boolean zM87157i = c28655q.m87157i(onboardingStoriesDebugFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C23045q(16, onboardingStoriesDebugFragment, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC12350b.m34578a((InterfaceC4339a) objM87133R3, modifierM3398t2, z4, null, null, null, null, null, c24070a.m70991c(), c28655q, 805306416, 504);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h("Examples", null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 6, C2886a.f11498d << 18, 196602);
            boolean zM87157i2 = c28655q.m87157i(onboardingStoriesDebugFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C23821c(onboardingStoriesDebugFragment, 2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC22674j.m65717c(null, null, null, null, null, null, false, null, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 0, FrameMetricsAggregator.EVERY_DURATION);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final String m26126O(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: P */
    private static final void m26127P(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m26128Q(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m26127P(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m26129R(OnboardingStoriesDebugFragment onboardingStoriesDebugFragment, InterfaceC28601c1 interfaceC28601c1) {
        String upperCase = AbstractC39414r.m125869O0(m26126O(interfaceC28601c1)).toString().toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        onboardingStoriesDebugFragment.m26124M(upperCase);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m26130S(OnboardingStoriesDebugFragment onboardingStoriesDebugFragment, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C10256b> list = onboardingStoriesDebugFragment.onboardingStoryItems;
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(list.size(), null, new C10259e(C10258d.f30997w, list), new C37816b(new C10260f(list, onboardingStoriesDebugFragment), true, 802480018));
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return "DebugOnboardingStoryFragment";
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 19), true, -1916693706));
    }

    /* JADX INFO: renamed from: com.whoop.stories.OnboardingStoriesDebugFragment$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0013\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;", "Lm91/u;", "Lcom/whoop/data/onboarding/FeatureEducationType;", "featureEducationType", "", "text", NotificationCompat.CATEGORY_EVENT, "<init>", "(Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/data/onboarding/FeatureEducationType;", "b", "()Lcom/whoop/data/onboarding/FeatureEducationType;", "Ljava/lang/String;", "c", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C10256b implements InterfaceC25312u {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final FeatureEducationType featureEducationType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String text;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String event;

        public C10256b(FeatureEducationType featureEducationType, String text, String event) {
            AbstractC22676k.m65750j(featureEducationType, "featureEducationType");
            AbstractC22676k.m65750j(text, "text");
            AbstractC22676k.m65750j(event, "event");
            this.featureEducationType = featureEducationType;
            this.text = text;
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getEvent() {
            return this.event;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FeatureEducationType getFeatureEducationType() {
            return this.featureEducationType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C10256b)) {
                return false;
            }
            C10256b c10256b = (C10256b) other;
            return this.featureEducationType == c10256b.featureEducationType && AbstractC22676k.m65745e(this.text, c10256b.text) && AbstractC22676k.m65745e(this.event, c10256b.event);
        }

        public int hashCode() {
            return this.event.hashCode() + AbstractC11266d.m30450d(this.featureEducationType.hashCode() * 31, 31, this.text);
        }

        public String toString() {
            FeatureEducationType featureEducationType = this.featureEducationType;
            String str = this.text;
            String str2 = this.event;
            StringBuilder sb4 = new StringBuilder("DebugOnboardingStoriesMenuItemState(featureEducationType=");
            sb4.append(featureEducationType);
            sb4.append(", text=");
            sb4.append(str);
            sb4.append(", event=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ C10256b(FeatureEducationType featureEducationType, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i13 & 2) != 0 ? featureEducationType.name() : str;
            this(featureEducationType, str, (i13 & 4) != 0 ? str : str2);
        }
    }
}
