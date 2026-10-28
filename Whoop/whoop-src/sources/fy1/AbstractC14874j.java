package fy1;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.metrics.common.ScreenState;
import cy1.C11186b;
import f01.C13845b;
import j93.InterfaceC21467g;
import l83.C23454a0;
import l83.C23465k;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import qf1.AbstractC30320a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: fy1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0011²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lfy1/k;", "viewState", "", "screenTag", "Ll83/a0;", "c", "(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "", "nanoTime", "d", "(Lfy1/k;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "hasEmittedFirstVisible", "Ll83/k;", "Lcom/whoop/metrics/common/ScreenState;", "previousObservation", "metrics-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14874j {

    /* JADX INFO: renamed from: fy1.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final a f55510w = new a();

        public a() {
            super(0, System.class, "nanoTime", "nanoTime()J", 0);
        }

        @Override // c93.InterfaceC4339a
        public final Long invoke() {
            return Long.valueOf(System.nanoTime());
        }
    }

    /* JADX INFO: renamed from: fy1.j$b */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.common.ScreenStateObserverKt$ObserveScreenState$3$1", m100430f = "ScreenStateObserver.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f55511E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ long f55512F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC4339a f55513G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f55514H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f55515I;

        /* JADX INFO: renamed from: w */
        int f55516w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f55517x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ScreenState f55518y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC14876l f55519z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ScreenState screenState, InterfaceC14876l interfaceC14876l, boolean z4, long j7, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f55517x = str;
            this.f55518y = screenState;
            this.f55519z = interfaceC14876l;
            this.f55511E = z4;
            this.f55512F = j7;
            this.f55513G = interfaceC4339a;
            this.f55514H = interfaceC28601c1;
            this.f55515I = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f55517x, this.f55518y, this.f55519z, this.f55511E, this.f55512F, this.f55513G, this.f55514H, this.f55515I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Long lM42894a;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f55516w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C23465k c23465k = new C23465k(this.f55517x, this.f55518y);
            if (!AbstractC22676k.m65745e(AbstractC14874j.m42910i(this.f55514H), c23465k)) {
                this.f55519z.mo42900a(this.f55517x, this.f55518y);
                AbstractC14874j.m42911j(this.f55514H, c23465k);
            }
            boolean z4 = this.f55511E;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (z4 && (lM42894a = C14869e.f55499a.m42894a(this.f55512F, AbstractC14874j.m42908g(this.f55515I), this.f55518y, ((Number) this.f55513G.invoke()).longValue())) != null) {
                AbstractC14874j.m42909h(this.f55515I, true);
                this.f55519z.mo42901b(this.f55517x, lM42894a.longValue());
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m42904c(InterfaceC14875k viewState, String screenTag, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(screenTag, "screenTag");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-724877045);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(screenTag) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = a.f55510w;
                c28655q.m87172p0(objM87133R);
            }
            m42905d(viewState, screenTag, (InterfaceC4339a) ((InterfaceC21467g) objM87133R), c28655q, (i14 & 112) | (i14 & 14) | 384);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(viewState, screenTag, i13, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m42905d(InterfaceC14875k viewState, String screenTag, InterfaceC4339a nanoTime, Composer composer, int i13) {
        int i14;
        String str;
        ScreenState screenState;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(screenTag, "screenTag");
        AbstractC22676k.m65750j(nanoTime, "nanoTime");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1079535977);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(screenTag) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(nanoTime) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            InterfaceC14876l interfaceC14876l = (InterfaceC14876l) c28655q.m87161k(AbstractC14877m.m42918c());
            boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC30320a.m92665c())).isFeatureEnabled("mobile-time-to-first-view-metric");
            ScreenState state = viewState.getState();
            if (state == ScreenState.CACHE_HIT && !zIsFeatureEnabled) {
                state = ScreenState.SUCCESS;
            }
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = Long.valueOf(((Number) nanoTime.invoke()).longValue());
                c28655q.m87172p0(objM87133R);
            }
            long jLongValue = ((Number) objM87133R).longValue();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            boolean zM87149e = ((i14 & 112) == 32) | c28655q.m87149e(state.ordinal()) | c28655q.m87157i(interfaceC14876l) | c28655q.m87155h(zIsFeatureEnabled) | ((i14 & 896) == 256);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87149e || objM87133R4 == c28676v0) {
                screenState = state;
                str = screenTag;
                b bVar = new b(str, screenState, interfaceC14876l, zIsFeatureEnabled, jLongValue, nanoTime, interfaceC28601c2, interfaceC28601c1, null);
                c28655q.m87172p0(bVar);
                objM87133R4 = bVar;
            } else {
                str = screenTag;
                screenState = state;
            }
            AbstractC28683x.m87254h(str, screenState, (InterfaceC4351m) objM87133R4, c28655q);
        } else {
            str = screenTag;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(viewState, str, nanoTime, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m42906e(InterfaceC14875k interfaceC14875k, String str, int i13, Composer composer, int i14) {
        m42904c(interfaceC14875k, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m42907f(InterfaceC14875k interfaceC14875k, String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m42905d(interfaceC14875k, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final boolean m42908g(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m42909h(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23465k m42910i(InterfaceC28601c1 interfaceC28601c1) {
        return (C23465k) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m42911j(InterfaceC28601c1 interfaceC28601c1, C23465k c23465k) {
        interfaceC28601c1.setValue(c23465k);
    }
}
