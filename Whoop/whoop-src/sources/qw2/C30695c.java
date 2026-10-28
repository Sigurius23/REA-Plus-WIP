package qw2;

import ad3.AbstractC0757c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm.C3383g;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.ActionSequenceAction;
import com.whoop.whoopaction.domain.models.ActionSequenceFullScreenBehavior;
import com.whoop.whoopaction.domain.models.ActionSequenceStep;
import com.whoop.whoopaction.domain.models.LoadingTreatment;
import com.whoop.whoopaction.domain.models.UnknownAction;
import ec3.AbstractC13091v;
import ec3.AbstractC13095w0;
import ec3.C13052j1;
import ec3.C13054k;
import ec3.C13078q1;
import ec3.C13084s1;
import ec3.C13100y;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import fy1.InterfaceC14871g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import jy1.C22047a;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import m83.AbstractC25265s;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rw2.InterfaceC31871a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sw2.AbstractC33054a;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qw2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00019BY\u0012\u001a\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e*\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020**\u00020\u00032\u0006\u0010)\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020**\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020**\u00020\u0003H\u0002¢\u0006\u0004\b/\u0010.J3\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u00100\u001a\u00020\u00032\u0006\u0010)\u001a\u00020%2\f\u00101\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b2\u00103J3\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u00100\u001a\u0002042\u0006\u0010)\u001a\u00020%2\f\u00101\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b5\u00106J#\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b8\u0010 R(\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m65681d2 = {"Lqw2/c;", "Lod1/g;", "Lqw2/a;", "Lqw2/b;", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "Lrw2/a;", "actionHandlerMap", "Lfi0/a;", "analytics", "Lfy1/g;", "nanoClock", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "Lbc3/c0;", "scope", "Lad3/c;", "json", "<init>", "(Ljava/util/Map;Lfi0/a;Lfy1/g;Liy1/c;Ltr2/n;Lbc3/c0;Lad3/c;)V", "", "startNano", "", "cause", "Ll83/a0;", "m", "(JLjava/lang/Throwable;)V", "Lec3/l;", "s", "(Lec3/l;)Lec3/l;", "action", "l", "(Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;", "", "Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;", "steps", "k", "(Ljava/util/List;)Lec3/l;", "step", "", "n", "(Lqw2/b;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;)Z", "q", "(Lqw2/b;)Z", "r", "state", "remaining", "p", "(Lqw2/b;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Ljava/util/List;)Lec3/l;", "Lqw2/b$b;", "o", "(Lqw2/b$b;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Ljava/util/List;)Lec3/l;", "upstream", "interact", "a", "Ljava/util/Map;", "b", "Lfi0/a;", "c", "Lfy1/g;", "d", "Liy1/c;", "e", "Ltr2/n;", "f", "Lbc3/c0;", "g", "Lad3/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30695c implements InterfaceC27844g<InterfaceC30693a, AbstractC30694b> {

    /* JADX INFO: renamed from: i */
    public static final int f126354i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<InterfaceC21461d, InterfaceC31871a> actionHandlerMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14871g nanoClock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: qw2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.ActionInteractor$dispatchSequentially$1", m100430f = "ActionInteractor.kt", m100431l = {151, 154, 157, 169, 171}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ ActionSequenceFullScreenBehavior f126362E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ ActionSequenceStep f126363F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C30695c f126364G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ List<ActionSequenceStep> f126365H;

        /* JADX INFO: renamed from: w */
        Object f126366w;

        /* JADX INFO: renamed from: x */
        Object f126367x;

        /* JADX INFO: renamed from: y */
        int f126368y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f126369z;

        /* JADX INFO: renamed from: qw2.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f126370w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30695c f126371x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ ActionSequenceStep f126372y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC13062m f126373z;

            public a(C22669g0 c22669g0, C30695c c30695c, ActionSequenceStep actionSequenceStep, InterfaceC13062m interfaceC13062m) {
                this.f126370w = c22669g0;
                this.f126371x = c30695c;
                this.f126372y = actionSequenceStep;
                this.f126373z = interfaceC13062m;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC30694b abstractC30694b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objEmit;
                this.f126370w.f89336w = abstractC30694b;
                return (this.f126371x.m94345n(abstractC30694b, this.f126372y) && (objEmit = this.f126373z.emit(abstractC30694b, interfaceC30057d)) == EnumC31071a.f128113w) ? objEmit : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ActionSequenceFullScreenBehavior actionSequenceFullScreenBehavior, ActionSequenceStep actionSequenceStep, C30695c c30695c, List<ActionSequenceStep> list, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126362E = actionSequenceFullScreenBehavior;
            this.f126363F = actionSequenceStep;
            this.f126364G = c30695c;
            this.f126365H = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f126362E, this.f126363F, this.f126364G, this.f126365H, interfaceC30057d);
            bVar.f126369z = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x008a  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[PHI: r2
          0x00b1: PHI (r2v6 kotlin.jvm.internal.g0) = (r2v5 kotlin.jvm.internal.g0), (r2v9 kotlin.jvm.internal.g0) binds: [B:31:0x00ae, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r10, r9) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r10, r9) == r1) goto L40;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qw2.C30695c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qw2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.ActionInteractor$handleSubActionResult$1", m100430f = "ActionInteractor.kt", m100431l = {216, 217}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List<ActionSequenceStep> f126374E;

        /* JADX INFO: renamed from: w */
        int f126375w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f126376x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ActionSequenceStep f126377y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30695c f126378z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ActionSequenceStep actionSequenceStep, C30695c c30695c, List<ActionSequenceStep> list, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126377y = actionSequenceStep;
            this.f126378z = c30695c;
            this.f126374E = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f126377y, this.f126378z, this.f126374E, interfaceC30057d);
            cVar.f126376x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f126376x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f126375w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L4d
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L39
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                qw2.b$n r6 = new qw2.b$n
                com.whoop.whoopaction.domain.models.ActionSequenceStep r2 = r5.f126377y
                com.whoop.whoopaction.domain.models.Action r2 = r2.getAction()
                r6.<init>(r2)
                r5.f126376x = r0
                r5.f126375w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L39
                goto L4c
            L39:
                qw2.c r6 = r5.f126378z
                java.util.List<com.whoop.whoopaction.domain.models.ActionSequenceStep> r2 = r5.f126374E
                ec3.l r6 = qw2.C30695c.m94334c(r6, r2)
                r2 = 0
                r5.f126376x = r2
                r5.f126375w = r3
                java.lang.Object r6 = ec3.AbstractC13091v.m36613w(r0, r6, r5)
                if (r6 != r1) goto L4d
            L4c:
                return r1
            L4d:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qw2.C30695c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qw2.c$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f126379w;

        /* JADX INFO: renamed from: qw2.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f126380w;

            /* JADX INFO: renamed from: qw2.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.ActionInteractor$interact$$inlined$filter$1$2", m100430f = "ActionInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42244a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f126382F;

                /* JADX INFO: renamed from: G */
                Object f126383G;

                /* JADX INFO: renamed from: H */
                int f126384H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f126385w;

                /* JADX INFO: renamed from: x */
                int f126386x;

                /* JADX INFO: renamed from: y */
                Object f126387y;

                /* JADX INFO: renamed from: z */
                Object f126388z;

                public C42244a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f126385w = obj;
                    this.f126386x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f126380w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42244a c42244a;
                if (interfaceC30057d instanceof C42244a) {
                    c42244a = (C42244a) interfaceC30057d;
                    int i13 = c42244a.f126386x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42244a.f126386x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42244a = new C42244a(interfaceC30057d);
                    }
                } else {
                    c42244a = new C42244a(interfaceC30057d);
                }
                Object obj2 = c42244a.f126385w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42244a.f126386x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f126380w;
                    if (((InterfaceC30693a) obj).getAction() instanceof ActionSequenceAction) {
                        c42244a.f126387y = null;
                        c42244a.f126388z = null;
                        c42244a.f126382F = null;
                        c42244a.f126383G = null;
                        c42244a.f126384H = 0;
                        c42244a.f126386x = 1;
                        if (interfaceC13062m.emit(obj, c42244a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f126379w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f126379w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qw2.c$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.ActionInteractor$interact$handlerResults$1", m100430f = "ActionInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lrw2/a;", "handler", "Lec3/l;", "Lqw2/b;", "<anonymous>", "(Lrw2/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126389w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f126390x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13087t1 f126391y;

        /* JADX INFO: renamed from: qw2.c$e$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f126392w;

            /* JADX INFO: renamed from: qw2.c$e$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42245a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f126393w;

                /* JADX INFO: renamed from: qw2.c$e$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.ActionInteractor$interact$handlerResults$1$invokeSuspend$$inlined$filter$1$2", m100430f = "ActionInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42246a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f126395F;

                    /* JADX INFO: renamed from: G */
                    Object f126396G;

                    /* JADX INFO: renamed from: H */
                    int f126397H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f126398w;

                    /* JADX INFO: renamed from: x */
                    int f126399x;

                    /* JADX INFO: renamed from: y */
                    Object f126400y;

                    /* JADX INFO: renamed from: z */
                    Object f126401z;

                    public C42246a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f126398w = obj;
                        this.f126399x |= Integer.MIN_VALUE;
                        return C42245a.this.emit(null, this);
                    }
                }

                public C42245a(InterfaceC13062m interfaceC13062m) {
                    this.f126393w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42246a c42246a;
                    if (interfaceC30057d instanceof C42246a) {
                        c42246a = (C42246a) interfaceC30057d;
                        int i13 = c42246a.f126399x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42246a.f126399x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42246a = new C42246a(interfaceC30057d);
                        }
                    } else {
                        c42246a = new C42246a(interfaceC30057d);
                    }
                    Object obj2 = c42246a.f126398w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42246a.f126399x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f126393w;
                        if (!(((InterfaceC30693a) obj).getAction() instanceof ActionSequenceAction)) {
                            c42246a.f126400y = null;
                            c42246a.f126401z = null;
                            c42246a.f126395F = null;
                            c42246a.f126396G = null;
                            c42246a.f126397H = 0;
                            c42246a.f126399x = 1;
                            if (interfaceC13062m.emit(obj, c42246a) == enumC31071a) {
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

            public a(InterfaceC13058l interfaceC13058l) {
                this.f126392w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f126392w.collect(new C42245a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13087t1 interfaceC13087t1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126391y = interfaceC13087t1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f126391y, interfaceC30057d);
            eVar.f126390x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC31871a interfaceC31871a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((e) create(interfaceC31871a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC31871a interfaceC31871a = (InterfaceC31871a) this.f126390x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f126389w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return interfaceC31871a.interact(new a(this.f126391y));
        }
    }

    /* JADX INFO: renamed from: qw2.c$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.ActionInteractor$interact$sequenceResults$2", m100430f = "ActionInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqw2/a;", "domainAction", "Lec3/l;", "Lqw2/b;", "<anonymous>", "(Lqw2/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126402w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f126403x;

        /* JADX INFO: renamed from: qw2.c$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.ActionInteractor$interact$sequenceResults$2$1", m100430f = "ActionInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "", "cause", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f126405w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f126406x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C30695c f126407y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ long f126408z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C30695c c30695c, long j7, InterfaceC30057d<? super a> interfaceC30057d) {
                super(3, interfaceC30057d);
                this.f126407y = c30695c;
                this.f126408z = j7;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                a aVar = new a(this.f126407y, this.f126408z, interfaceC30057d);
                aVar.f126406x = th3;
                return aVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                Throwable th3 = (Throwable) this.f126406x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f126405w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f126407y.m94344m(this.f126408z, th3);
                return C23454a0.f92919a;
            }
        }

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C30695c.this.new f(interfaceC30057d);
            fVar.f126403x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30693a interfaceC30693a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((f) create(interfaceC30693a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC30693a interfaceC30693a = (InterfaceC30693a) this.f126403x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f126402w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            long jMo42899a = C30695c.this.nanoClock.mo42899a();
            C30695c c30695c = C30695c.this;
            Action action = interfaceC30693a.getAction();
            AbstractC22676k.m65748h(action, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.ActionSequenceAction");
            return new C13100y(c30695c.m94342k(((ActionSequenceAction) action).getActions()), new a(C30695c.this, jMo42899a, null));
        }
    }

    /* JADX INFO: renamed from: qw2.c$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.ActionInteractor$logUnsupportedActions$1", m100430f = "ActionInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lqw2/a;", "domainAction", "Ll83/a0;", "<anonymous>", "(Lqw2/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126409w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f126410x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C30695c.this.new g(interfaceC30057d);
            gVar.f126410x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30693a interfaceC30693a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC30693a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC30693a interfaceC30693a = (InterfaceC30693a) this.f126410x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f126409w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Map map = C30695c.this.actionHandlerMap;
            Class<?> cls = interfaceC30693a.getAction().getClass();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            if (!map.containsKey(c22673i0.getOrCreateKotlinClass(cls)) && !(interfaceC30693a.getAction() instanceof ActionSequenceAction) && !AbstractC22676k.m65745e(c22673i0.getOrCreateKotlinClass(interfaceC30693a.getAction().getClass()).getSimpleName(), "UnknownAction")) {
                C30695c.this.logger.mo85226q(AbstractC11895b.m31996o("No handler for action type: ", c22673i0.getOrCreateKotlinClass(interfaceC30693a.getAction().getClass()).getSimpleName(), ". Action ignored."), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C30695c(Map<InterfaceC21461d, ? extends InterfaceC31871a> actionHandlerMap, InterfaceC14515a analytics, InterfaceC14871g nanoClock, InterfaceC21030c metricWriter, InterfaceC34116n logger, InterfaceC2994c0 scope, AbstractC0757c json) {
        AbstractC22676k.m65750j(actionHandlerMap, "actionHandlerMap");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(nanoClock, "nanoClock");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(json, "json");
        this.actionHandlerMap = actionHandlerMap;
        this.analytics = analytics;
        this.nanoClock = nanoClock;
        this.metricWriter = metricWriter;
        this.logger = logger;
        this.scope = scope;
        this.json = json;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m94342k(List<ActionSequenceStep> steps) {
        ActionSequenceStep actionSequenceStep = (ActionSequenceStep) AbstractC25265s.m74100H0(steps);
        if (actionSequenceStep == null) {
            return C13054k.f45116w;
        }
        List listM74161z0 = AbstractC25265s.m74161z0(steps, 1);
        Action action = actionSequenceStep.getAction();
        return action instanceof ActionSequenceAction ? m94342k(AbstractC25265s.m74129g1(((ActionSequenceAction) action).getActions(), listM74161z0)) : new C13084s1(new b(actionSequenceStep.getFullScreen(), actionSequenceStep, this, listM74161z0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m94343l(Action action) {
        Map<InterfaceC21461d, InterfaceC31871a> map = this.actionHandlerMap;
        Class<?> cls = action.getClass();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC31871a interfaceC31871a = map.get(c22673i0.getOrCreateKotlinClass(cls));
        if (interfaceC31871a != null) {
            return interfaceC31871a.mo28415b(new C0456u(new C30698f(action), 1));
        }
        if (!(action instanceof UnknownAction)) {
            this.logger.mo85226q(AbstractC11895b.m31996o("No handler for action type: ", c22673i0.getOrCreateKotlinClass(action.getClass()).getSimpleName(), ". Action ignored."), new AbstractC30556a.a[0]);
        }
        return C13054k.f45116w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m94344m(long startNano, Throwable cause) {
        this.metricWriter.mo58701b(new C22047a(0, "mobile.whoop.action_sequence_duration", Double.valueOf((this.nanoClock.mo42899a() - startNano) / 1000000.0d), AbstractC37056f.m118958J("status:".concat(cause == null ? "finished" : "cancelled")), null, 17, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final boolean m94345n(AbstractC30694b abstractC30694b, ActionSequenceStep actionSequenceStep) {
        ActionSequenceFullScreenBehavior fullScreen;
        if (!(abstractC30694b instanceof AbstractC30694b.a) || (fullScreen = actionSequenceStep.getFullScreen()) == null || fullScreen.getShowError()) {
            return m94348q(abstractC30694b) || m94349r(abstractC30694b) || (abstractC30694b instanceof AbstractC30694b.g);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m94346o(AbstractC30694b.b state, ActionSequenceStep step, List<ActionSequenceStep> remaining) {
        Action actionM104670a = AbstractC33054a.m104670a(state.getInteraction(), this.json);
        if (actionM104670a == null) {
            return C13054k.f45116w;
        }
        AnalyticEventModel analyticEventModelM104671b = AbstractC33054a.m104671b(state.getInteraction(), this.json);
        if (analyticEventModelM104671b != null) {
            AbstractC14516b.m41429a(this.analytics, analyticEventModelM104671b);
        }
        ActionSequenceFullScreenBehavior fullScreen = step.getFullScreen();
        return m94342k(AbstractC25265s.m74129g1(AbstractC37056f.m118958J(new ActionSequenceStep(actionM104670a, new ActionSequenceFullScreenBehavior(false, (LoadingTreatment) null, false, fullScreen != null ? fullScreen.getShowSuccess() : false, false, 21, (DefaultConstructorMarker) null))), remaining));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m94347p(AbstractC30694b state, ActionSequenceStep step, List<ActionSequenceStep> remaining) {
        if ((state instanceof AbstractC30694b.m) || (state instanceof AbstractC30694b.l) || (state instanceof AbstractC30694b.k) || (state instanceof AbstractC30694b.j) || (state instanceof AbstractC30694b.n) || (state instanceof AbstractC30694b.f) || (state instanceof AbstractC30694b.g)) {
            ActionSequenceFullScreenBehavior fullScreen = step.getFullScreen();
            return (fullScreen == null || !fullScreen.getShowSuccess()) ? m94342k(remaining) : new C13084s1(new c(step, this, remaining, null));
        }
        if (state instanceof AbstractC30694b.b) {
            return m94346o((AbstractC30694b.b) state, step, remaining);
        }
        boolean z4 = state instanceof AbstractC30694b.a;
        C13054k c13054k = C13054k.f45116w;
        if (z4) {
            ActionSequenceFullScreenBehavior fullScreen2 = step.getFullScreen();
            return (fullScreen2 == null || fullScreen2.getShowError()) ? c13054k : new C0456u(new AbstractC30694b.b(new GenericInteraction((JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, 31, (DefaultConstructorMarker) null), step.getAction()), 1);
        }
        if ((state instanceof AbstractC30694b.c) || (state instanceof AbstractC30694b.i) || (state instanceof AbstractC30694b.d) || (state instanceof AbstractC30694b.e) || (state instanceof AbstractC30694b.h)) {
            return c13054k;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: q */
    private final boolean m94348q(AbstractC30694b abstractC30694b) {
        return (abstractC30694b instanceof AbstractC30694b.m) || (abstractC30694b instanceof AbstractC30694b.l) || (abstractC30694b instanceof AbstractC30694b.k) || (abstractC30694b instanceof AbstractC30694b.j);
    }

    /* JADX INFO: renamed from: r */
    private final boolean m94349r(AbstractC30694b abstractC30694b) {
        if ((abstractC30694b instanceof AbstractC30694b.a) || (abstractC30694b instanceof AbstractC30694b.d) || (abstractC30694b instanceof AbstractC30694b.h) || (abstractC30694b instanceof AbstractC30694b.e)) {
            return true;
        }
        return (abstractC30694b instanceof AbstractC30694b.b) && ((AbstractC30694b.b) abstractC30694b).getInteraction().getAction() == null;
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC13058l m94350s(InterfaceC13058l interfaceC13058l) {
        return new C13052j1(interfaceC13058l, new g(null), 0);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m94350s(upstream), this.scope, C13105z1.m36630a(3, 0L), 0);
        C3383g c3383g = new C3383g(AbstractC25265s.m74159y0(this.actionHandlerMap.values()), 1);
        e eVar = new e(c13078q1M36586L, null);
        int i13 = AbstractC13095w0.f45249a;
        return AbstractC13091v.m36584J(AbstractC13091v.m36579E(i13, eVar, c3383g), AbstractC13091v.m36579E(i13, new f(null), new d(c13078q1M36586L)));
    }

    public /* synthetic */ C30695c(Map map, InterfaceC14515a interfaceC14515a, InterfaceC14871g interfaceC14871g, InterfaceC21030c interfaceC21030c, InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, AbstractC0757c abstractC0757c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, interfaceC14515a, interfaceC14871g, interfaceC21030c, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActionInteractor") : interfaceC34116n, (i13 & 32) != 0 ? AbstractC3006f0.m8708b(AbstractC3006f0.m8710d()) : interfaceC2994c0, (i13 & 64) != 0 ? AbstractC34650k.m109496c() : abstractC0757c);
    }
}
