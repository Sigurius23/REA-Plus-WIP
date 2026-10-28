package rw2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.StateClearAction;
import com.whoop.whoopaction.domain.models.StatePopAction;
import com.whoop.whoopaction.domain.models.StatePushAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u82.AbstractC34647h;

/* JADX INFO: renamed from: rw2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R(\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lrw2/g;", "Lrw2/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lec3/l;", "Lqw2/a;", "upstream", "Lqw2/b;", "b", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "actionTypes", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31877g implements InterfaceC31871a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Set<InterfaceC21461d> actionTypes;

    /* JADX INFO: renamed from: rw2.g$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f132296w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31877g f132297x;

        /* JADX INFO: renamed from: rw2.g$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42305a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f132298w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31877g f132299x;

            /* JADX INFO: renamed from: rw2.g$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.StateUpdateActionHandler$handleActions$$inlined$mapNotNull$1$2", m100430f = "StateUpdateActionHandler.kt", m100431l = {90}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42306a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f132300E;

                /* JADX INFO: renamed from: F */
                Object f132301F;

                /* JADX INFO: renamed from: G */
                Object f132302G;

                /* JADX INFO: renamed from: H */
                Object f132303H;

                /* JADX INFO: renamed from: I */
                int f132304I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f132305w;

                /* JADX INFO: renamed from: x */
                int f132306x;

                /* JADX INFO: renamed from: y */
                Object f132307y;

                public C42306a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f132305w = obj;
                    this.f132306x |= Integer.MIN_VALUE;
                    return C42305a.this.emit(null, this);
                }
            }

            public C42305a(InterfaceC13062m interfaceC13062m, C31877g c31877g) {
                this.f132298w = interfaceC13062m;
                this.f132299x = c31877g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42306a c42306a;
                Object mVar;
                Object jVar;
                if (interfaceC30057d instanceof C42306a) {
                    c42306a = (C42306a) interfaceC30057d;
                    int i13 = c42306a.f132306x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42306a.f132306x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42306a = new C42306a(interfaceC30057d);
                    }
                } else {
                    c42306a = new C42306a(interfaceC30057d);
                }
                Object obj2 = c42306a.f132305w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42306a.f132306x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f132298w;
                    Action action = ((InterfaceC30693a) obj).getAction();
                    if (action instanceof StateUpdateAction) {
                        boolean zIsFeatureEnabled = this.f132299x.featureFlagChecker.isFeatureEnabled("android-arch-v2-preserve-quoted-state-strings");
                        Map<String, JsonElement> state = ((StateUpdateAction) action).getState();
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, JsonElement> entry : state.entrySet()) {
                            String key = entry.getKey();
                            Object objM109489d = AbstractC34647h.m109489d(entry.getValue(), zIsFeatureEnabled);
                            C23465k c23465k = objM109489d != null ? new C23465k(key, objM109489d) : null;
                            if (c23465k != null) {
                                arrayList.add(c23465k);
                            }
                        }
                        Map mapM74000i0 = AbstractC25247g0.m74000i0(arrayList);
                        this.f132299x.logger.mo85228t("STATE_UPDATE patch=" + mapM74000i0.keySet(), new AbstractC30556a.a[0]);
                        mVar = new AbstractC30694b.m(mapM74000i0, action);
                    } else {
                        if (action instanceof StateClearAction) {
                            StateClearAction stateClearAction = (StateClearAction) action;
                            this.f132299x.logger.mo85228t(AbstractC11895b.m31998q("STATE_CLEAR keys=", stateClearAction.getKeys()), new AbstractC30556a.a[0]);
                            jVar = new AbstractC30694b.l(AbstractC25265s.m74103I1(stateClearAction.getKeys()), action);
                        } else if (action instanceof StatePushAction) {
                            StatePushAction statePushAction = (StatePushAction) action;
                            this.f132299x.logger.mo85228t(AbstractC11266d.m30461o("STATE_PUSH key=", statePushAction.getKey()), new AbstractC30556a.a[0]);
                            jVar = new AbstractC30694b.k(statePushAction.getKey(), statePushAction.getValue(), action);
                        } else if (action instanceof StatePopAction) {
                            StatePopAction statePopAction = (StatePopAction) action;
                            this.f132299x.logger.mo85228t(AbstractC11266d.m30461o("STATE_POP key=", statePopAction.getKey()), new AbstractC30556a.a[0]);
                            jVar = new AbstractC30694b.j(statePopAction.getKey(), action);
                        } else {
                            mVar = null;
                        }
                        mVar = jVar;
                    }
                    if (mVar != null) {
                        c42306a.f132307y = null;
                        c42306a.f132300E = null;
                        c42306a.f132301F = null;
                        c42306a.f132302G = null;
                        c42306a.f132303H = null;
                        c42306a.f132304I = 0;
                        c42306a.f132306x = 1;
                        if (interfaceC13062m.emit(mVar, c42306a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C31877g c31877g) {
            this.f132296w = interfaceC13058l;
            this.f132297x = c31877g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f132296w.collect(new C42305a(interfaceC13062m, this.f132297x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C31877g(FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.actionTypes = AbstractC25260n.m74059b1(new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(StateUpdateAction.class), c22673i0.getOrCreateKotlinClass(StateClearAction.class), c22673i0.getOrCreateKotlinClass(StatePushAction.class), c22673i0.getOrCreateKotlinClass(StatePopAction.class)});
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: a */
    public Set<InterfaceC21461d> mo28414a() {
        return this.actionTypes;
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo28415b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    @Override // rw2.InterfaceC31871a, od1.InterfaceC27844g
    public /* bridge */ InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return super.interact(interfaceC13058l);
    }

    public /* synthetic */ C31877g(FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("JdslState") : interfaceC34116n);
    }
}
