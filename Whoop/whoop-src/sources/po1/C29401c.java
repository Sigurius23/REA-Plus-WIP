package po1;

import bc3.AbstractC3006f0;
import bc3.C3022j0;
import bc3.InterfaceC2994c0;
import bm.C3383g;
import c93.InterfaceC4351m;
import com.whoop.hormonalinsights.api.HideCycleRequest;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciCycleResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: po1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lpo1/c;", "Lod1/g;", "Lpo1/a;", "Lpo1/b;", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;Lbc3/c0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lq83/d;)Ljava/lang/Object;", "", "", "dates", "i", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "ids", "j", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "b", "Ltr2/n;", "c", "Lbc3/c0;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29401c implements InterfaceC27844g<AbstractC29399a, AbstractC29400b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: po1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor", m100430f = "MciCyclesInteractor.kt", m100431l = {52}, m100432m = "getCyclesResponse", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f119259w;

        /* JADX INFO: renamed from: y */
        int f119261y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119259w = obj;
            this.f119261y |= Integer.MIN_VALUE;
            return C29401c.this.m89585h(this);
        }
    }

    /* JADX INFO: renamed from: po1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor$getCyclesResponse$response$1", m100430f = "MciCyclesInteractor.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f119262w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C29401c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119262w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C29401c.this.api;
            this.f119262w = 1;
            Object cycles = hormonalInsightsApi.getCycles(this);
            return cycles == enumC31071a ? enumC31071a : cycles;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MciCycleResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: po1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor", m100430f = "MciCyclesInteractor.kt", m100431l = {65}, m100432m = "hideCycle", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f119264E;

        /* JADX INFO: renamed from: w */
        Object f119265w;

        /* JADX INFO: renamed from: x */
        Object f119266x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f119267y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119267y = obj;
            this.f119264E |= Integer.MIN_VALUE;
            return C29401c.this.m89586i(null, this);
        }
    }

    /* JADX INFO: renamed from: po1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor$hideCycle$response$1", m100430f = "MciCyclesInteractor.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f119269w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f119271y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f119271y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C29401c.this.new d(this.f119271y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119269w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C29401c.this.api;
            HideCycleRequest hideCycleRequest = new HideCycleRequest(this.f119271y);
            this.f119269w = 1;
            Object objHideCycle = hormonalInsightsApi.hideCycle(hideCycleRequest, this);
            return objHideCycle == enumC31071a ? enumC31071a : objHideCycle;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: po1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MciCyclesInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f119272w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f119273x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f119274y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC29399a abstractC29399a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f119273x = interfaceC13062m;
            eVar.f119274y = abstractC29399a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119272w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f119273x;
                AbstractC29399a abstractC29399a = (AbstractC29399a) this.f119274y;
                InterfaceC13058l c3383g = ((abstractC29399a instanceof AbstractC29399a.a) || (abstractC29399a instanceof AbstractC29399a.d)) ? new C3383g(new AbstractC29399a[]{AbstractC29399a.c.f119248a, abstractC29399a}, 3) : new C0456u(abstractC29399a, 1);
                this.f119273x = null;
                this.f119274y = null;
                this.f119272w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c3383g, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC29399a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: po1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor$interact$2", m100430f = "MciCyclesInteractor.kt", m100431l = {33, 40, 43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpo1/b;", "previousState", "Lpo1/a;", "domainAction", "<anonymous>", "(Lpo1/b;Lpo1/a;)Lpo1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f119275w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119276x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC29400b abstractC29400b, AbstractC29399a abstractC29399a, InterfaceC30057d<? super AbstractC29400b> interfaceC30057d) {
            f fVar = C29401c.this.new f(interfaceC30057d);
            fVar.f119276x = abstractC29399a;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            if (r7 == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            if (r7 == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        
            if (r7 == r1) goto L30;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f119276x
                po1.a r0 = (po1.AbstractC29399a) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f119275w
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L27
                if (r2 == r5) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                p505ts.AbstractC34132o.m107864I(r7)
                goto L70
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L56
            L23:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3c
            L27:
                p505ts.AbstractC34132o.m107864I(r7)
                boolean r7 = r0 instanceof po1.AbstractC29399a.b
                r2 = 0
                if (r7 == 0) goto L3f
                po1.c r7 = po1.C29401c.this
                r6.f119276x = r2
                r6.f119275w = r5
                java.lang.Object r7 = po1.C29401c.m89581d(r7, r6)
                if (r7 != r1) goto L3c
                goto L6f
            L3c:
                po1.b r7 = (po1.AbstractC29400b) r7
                return r7
            L3f:
                boolean r7 = r0 instanceof po1.AbstractC29399a.a
                if (r7 == 0) goto L59
                po1.c r7 = po1.C29401c.this
                po1.a$a r0 = (po1.AbstractC29399a.a) r0
                java.util.List r0 = r0.m89577a()
                r6.f119276x = r2
                r6.f119275w = r4
                java.lang.Object r7 = po1.C29401c.m89583f(r7, r0, r6)
                if (r7 != r1) goto L56
                goto L6f
            L56:
                po1.b r7 = (po1.AbstractC29400b) r7
                return r7
            L59:
                boolean r7 = r0 instanceof po1.AbstractC29399a.d
                if (r7 == 0) goto L73
                po1.c r7 = po1.C29401c.this
                po1.a$d r0 = (po1.AbstractC29399a.d) r0
                java.util.List r0 = r0.m89578a()
                r6.f119276x = r2
                r6.f119275w = r3
                java.lang.Object r7 = po1.C29401c.m89584g(r7, r0, r6)
                if (r7 != r1) goto L70
            L6f:
                return r1
            L70:
                po1.b r7 = (po1.AbstractC29400b) r7
                return r7
            L73:
                po1.a$c r7 = po1.AbstractC29399a.c.f119248a
                boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r0, r7)
                if (r7 == 0) goto L7e
                po1.b$c r7 = po1.AbstractC29400b.c.f119252a
                return r7
            L7e:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: po1.C29401c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: po1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor", m100430f = "MciCyclesInteractor.kt", m100431l = {85}, m100432m = "unHideCycle", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f119278w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119279x;

        /* JADX INFO: renamed from: z */
        int f119281z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119279x = obj;
            this.f119281z |= Integer.MIN_VALUE;
            return C29401c.this.m89587j(null, this);
        }
    }

    /* JADX INFO: renamed from: po1.c$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor$unHideCycle$responses$1", m100430f = "MciCyclesInteractor.kt", m100431l = {84}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lbc3/c0;", "", "Lu02/a;", "Lpg3/v0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119282w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f119283x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<String> f119284y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C29401c f119285z;

        /* JADX INFO: renamed from: po1.c$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor$unHideCycle$responses$1$1$1", m100430f = "MciCyclesInteractor.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Lu02/a;", "Lpg3/v0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lu02/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f119286w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29401c f119287x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f119288y;

            /* JADX INFO: renamed from: po1.c$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.cycle.MciCyclesInteractor$unHideCycle$responses$1$1$1$1", m100430f = "MciCyclesInteractor.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C42178a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f119289w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C29401c f119290x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ String f119291y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42178a(C29401c c29401c, String str, InterfaceC30057d<? super C42178a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f119290x = c29401c;
                    this.f119291y = str;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C42178a(this.f119290x, this.f119291y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f119289w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    HormonalInsightsApi hormonalInsightsApi = this.f119290x.api;
                    String str = this.f119291y;
                    this.f119289w = 1;
                    Object objUnhideCycle = hormonalInsightsApi.unhideCycle(str, this);
                    return objUnhideCycle == enumC31071a ? enumC31071a : objUnhideCycle;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                    return ((C42178a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C29401c c29401c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f119287x = c29401c;
                this.f119288y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f119287x, this.f119288y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC34385a<C29218v0<C23454a0>>> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f119286w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.f119287x.logger;
                C42178a c42178a = new C42178a(this.f119287x, this.f119288y, null);
                this.f119286w = 1;
                Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, c42178a, this, 6, null);
                return objM108729b == enumC31071a ? enumC31071a : objM108729b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<String> list, C29401c c29401c, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119284y = list;
            this.f119285z = c29401c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f119284y, this.f119285z, interfaceC30057d);
            hVar.f119283x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<? extends InterfaceC34385a<C29218v0<C23454a0>>>> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f119283x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119282w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            List<String> list = this.f119284y;
            C29401c c29401c = this.f119285z;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3006f0.m8711e(interfaceC2994c0, null, new a(c29401c, (String) it.next(), null), 3));
            }
            this.f119283x = null;
            this.f119282w = 1;
            Object objM8712f = AbstractC3006f0.m8712f(arrayList, this);
            return objM8712f == enumC31071a ? enumC31071a : objM8712f;
        }
    }

    public C29401c(HormonalInsightsApi api, InterfaceC34116n logger, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.api = api;
        this.logger = logger;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m89585h(InterfaceC30057d<? super AbstractC29400b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f119261y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f119261y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f119259w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f119261y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f119261y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC29400b.f((MciCycleResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC29400b.a.f119250a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m89586i(List<String> list, InterfaceC30057d<? super AbstractC29400b> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f119264E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f119264E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f119267y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f119264E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            String strM31996o = AbstractC11895b.m31996o("[", AbstractC25265s.m74110N0(list, ",", null, null, null, 62), "]");
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(strM31996o, null);
            cVar2.f119265w = null;
            cVar2.f119266x = null;
            cVar2.f119264E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return AbstractC29400b.e.f119254a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC29400b.d.f119253a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m89587j(List<String> list, InterfaceC30057d<? super AbstractC29400b> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f119281z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f119281z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM8817m = gVar.f119279x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f119281z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8817m);
                C3022j0 c3022j0M8711e = AbstractC3006f0.m8711e(this.coroutineScope, null, new h(list, this, null), 3);
                gVar.f119278w = null;
                gVar.f119281z = 1;
                objM8817m = c3022j0M8711e.m8817m(gVar);
                if (objM8817m == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8817m);
            }
            List list2 = (List) objM8817m;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC34385a) it.next()) instanceof InterfaceC34385a.b) {
                        return AbstractC29400b.d.f119253a;
                    }
                }
            }
            return AbstractC29400b.e.f119254a;
        } catch (Exception unused) {
            return AbstractC29400b.d.f119253a;
        }
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC29400b.b.f119251a, AbstractC13091v.m36590P(upstream, new e(null)), new f(null));
    }

    public /* synthetic */ C29401c(HormonalInsightsApi hormonalInsightsApi, InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hormonalInsightsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CycleInteractor") : interfaceC34116n, interfaceC2994c0);
    }
}
