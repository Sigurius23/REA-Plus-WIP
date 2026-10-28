package com.whoop.puffin.sync;

import a52.C0396c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import f52.InterfaceC14108f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import l83.C23468n;
import p218ic.AbstractC18377p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vk0.InterfaceC36083i;
import x42.C37965b;
import y42.InterfaceC39219a;

/* JADX INFO: renamed from: com.whoop.puffin.sync.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0018\u0010\u0012J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lcom/whoop/puffin/sync/c;", "", "Ltr2/n;", "logger", "Lf52/f;", "batterySyncInteractor", "Lic/p0;", "workManager", "Lx42/b;", "metricWriter", "Ljava/time/Clock;", "clock", "<init>", "(Ltr2/n;Lf52/f;Lic/p0;Lx42/b;Ljava/time/Clock;)V", "Ly42/a;", "puffin", "Lcom/whoop/puffin/sync/f$b;", "i", "(Ly42/a;Lq83/d;)Ljava/lang/Object;", "Lvk0/i;", "gattService", "Ll83/a0;", "a", "(Lvk0/i;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "Ltr2/n;", "b", "Lf52/f;", "c", "Lic/p0;", "d", "Lx42/b;", "e", "Ljava/time/Clock;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9820c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14108f batterySyncInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37965b metricWriter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: com.whoop.puffin.sync.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncHolder", m100430f = "BatterySyncHolder.kt", m100431l = {130}, m100432m = "abortHistorySync", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f28596w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f28597x;

        /* JADX INFO: renamed from: z */
        int f28599z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28597x = obj;
            this.f28599z |= Integer.MIN_VALUE;
            return C9820c.this.m23656a(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncHolder$doWork$2", m100430f = "BatterySyncHolder.kt", m100431l = {43, 45, 46, 48, 54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/puffin/sync/f$b;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/puffin/sync/f$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f28600E;

        /* JADX INFO: renamed from: F */
        Object f28601F;

        /* JADX INFO: renamed from: G */
        long f28602G;

        /* JADX INFO: renamed from: H */
        long f28603H;

        /* JADX INFO: renamed from: I */
        int f28604I;

        /* JADX INFO: renamed from: J */
        int f28605J;

        /* JADX INFO: renamed from: K */
        private /* synthetic */ Object f28606K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC39219a f28607L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ C9820c f28608M;

        /* JADX INFO: renamed from: w */
        Object f28609w;

        /* JADX INFO: renamed from: x */
        Object f28610x;

        /* JADX INFO: renamed from: y */
        Object f28611y;

        /* JADX INFO: renamed from: z */
        Object f28612z;

        /* JADX INFO: renamed from: com.whoop.puffin.sync.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncHolder$doWork$2$kickOffHistorySyncJob$1", m100430f = "BatterySyncHolder.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/puffin/sync/f$b;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/puffin/sync/f$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f28613w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C9820c f28614x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC39219a f28615y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C9820c c9820c, InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f28614x = c9820c;
                this.f28615y = interfaceC39219a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f28614x, this.f28615y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC9823f.b> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f28613w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C9820c c9820c = this.f28614x;
                InterfaceC39219a interfaceC39219a = this.f28615y;
                this.f28613w = 1;
                Object objM23663i = c9820c.m23663i(interfaceC39219a, this);
                return objM23663i == enumC31071a ? enumC31071a : objM23663i;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC39219a interfaceC39219a, C9820c c9820c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f28607L = interfaceC39219a;
            this.f28608M = c9820c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f28607L, this.f28608M, interfaceC30057d);
            bVar.f28606K = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC9823f.b> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0127  */
        /* JADX WARN: Code duplicated, block: B:38:0x016a  */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x019e, code lost:
        
            if (r2.m121595b(r19) == r8) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v8, types: [bc3.i0] */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.puffin.sync.C9820c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncHolder", m100430f = "BatterySyncHolder.kt", m100431l = {111, 117}, m100432m = "invokeAndGetTerminalState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f28616E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f28617F;

        /* JADX INFO: renamed from: H */
        int f28619H;

        /* JADX INFO: renamed from: w */
        Object f28620w;

        /* JADX INFO: renamed from: x */
        Object f28621x;

        /* JADX INFO: renamed from: y */
        Object f28622y;

        /* JADX INFO: renamed from: z */
        Object f28623z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28617F = obj;
            this.f28619H |= Integer.MIN_VALUE;
            return C9820c.this.m23663i(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncHolder$invokeAndGetTerminalState$2", m100430f = "BatterySyncHolder.kt", m100431l = {69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/puffin/sync/f;", "", "cause", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f28624w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f28625x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28626y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22669g0 f28627z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C22669g0 c22669g0, InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f28627z = c22669g0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(this.f28627z, interfaceC30057d);
            dVar.f28625x = interfaceC13062m;
            dVar.f28626y = th3;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f28625x;
            Throwable th3 = (Throwable) this.f28626y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28624w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof TimeoutCancellationException)) {
                    throw th3;
                }
                InterfaceC9823f.b.d dVarM23699b = AbstractC9824g.m23699b((InterfaceC9823f) this.f28627z.f89336w);
                this.f28625x = null;
                this.f28626y = null;
                this.f28624w = 1;
                if (interfaceC13062m.emit(dVarM23699b, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncHolder$invokeAndGetTerminalState$3", m100430f = "BatterySyncHolder.kt", m100431l = {81, 93, 102, 104}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/puffin/sync/f;", "historicalPullState", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/puffin/sync/f;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC36083i f28628E;

        /* JADX INFO: renamed from: w */
        Object f28629w;

        /* JADX INFO: renamed from: x */
        int f28630x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28631y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f28628E = interfaceC36083i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C9820c.this.new e(this.f28628E, interfaceC30057d);
            eVar.f28631y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9823f interfaceC9823f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC9823f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
        
            if (r0 == r8) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
        
            if (r0 == r8) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
        
            if (r0.m23656a(r1, r12) == r8) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x013d, code lost:
        
            if (r0.m23656a(r1, r12) == r8) goto L46;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.puffin.sync.C9820c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.sync.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatterySyncHolder$invokeAndGetTerminalState$4", m100430f = "BatterySyncHolder.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/puffin/sync/f;", "state", "", "<anonymous>", "(Lec3/m;Lcom/whoop/puffin/sync/f;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f28633w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f28634x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28635y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22669g0 f28636z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C22669g0 c22669g0, InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f28636z = c22669g0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC9823f interfaceC9823f, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            f fVar = new f(this.f28636z, interfaceC30057d);
            fVar.f28634x = interfaceC13062m;
            fVar.f28635y = interfaceC9823f;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f28634x;
            InterfaceC9823f interfaceC9823f = (InterfaceC9823f) this.f28635y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28633w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f28634x = null;
                this.f28635y = interfaceC9823f;
                this.f28633w = 1;
                if (interfaceC13062m.emit(interfaceC9823f, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f28636z.f89336w = interfaceC9823f;
            return Boolean.valueOf(!(interfaceC9823f instanceof InterfaceC9823f.b));
        }
    }

    public C9820c(InterfaceC34116n logger, InterfaceC14108f batterySyncInteractor, AbstractC18377p0 workManager, C37965b metricWriter, Clock clock) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(batterySyncInteractor, "batterySyncInteractor");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(clock, "clock");
        this.logger = logger;
        this.batterySyncInteractor = batterySyncInteractor;
        this.workManager = workManager;
        this.metricWriter = metricWriter;
        this.clock = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: a */
    public final Object m23656a(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        Object objM114608r0;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f28599z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f28599z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f28597x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f28599z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C0396c c0396c = new C0396c();
                aVar2.f28596w = null;
                aVar2.f28599z = 1;
                objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i, c0396c, 0L, false, aVar2, 6, null);
                if (objM114608r0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM114608r0 = ((C23468n) obj).f92940w;
            }
            this.logger.mo85228t("AbortHistorySync puffin response - " + C23468n.m68038b(objM114608r0), new AbstractC30556a.a[0]);
        } catch (TimeoutCancellationException e5) {
            this.logger.mo85230v("Timeout while aborting history sync", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        if (m23656a(r2, r0) == r1) goto L56;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m23663i(y42.InterfaceC39219a r11, q83.InterfaceC30057d<? super com.whoop.puffin.sync.InterfaceC9823f.b> r12) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.puffin.sync.C9820c.m23663i(y42.a, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    public final Object m23664h(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super InterfaceC9823f.b> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new b(interfaceC39219a, this, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: j */
    public final Object m23665j(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM23656a = m23656a(interfaceC36083i, interfaceC30057d);
        return objM23656a == EnumC31071a.f128113w ? objM23656a : C23454a0.f92919a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C9820c(InterfaceC34116n interfaceC34116n, InterfaceC14108f interfaceC14108f, AbstractC18377p0 abstractC18377p0, C37965b c37965b, Clock clock, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC34116n = (i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BatterySyncHolder") : interfaceC34116n;
        if ((i13 & 16) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(interfaceC34116n, interfaceC14108f, abstractC18377p0, c37965b, clock);
    }
}
