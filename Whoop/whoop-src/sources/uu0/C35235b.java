package uu0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ek0.C13290o;
import et0.InterfaceC13596a;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import p000.AbstractC11266d;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: uu0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0013"}, m65681d2 = {"Luu0/b;", "Let0/a;", "Lci2/b;", "whoopStrapProvider", "Lbc3/c0;", "coroutineScope", "<init>", "(Lci2/b;Lbc3/c0;)V", "Ltr2/n;", "a", "Ltr2/n;", "logger", "Lec3/f2;", "", "b", "Lec3/f2;", "()Lec3/f2;", "isDetected", "c", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35235b implements InterfaceC13596a {

    /* JADX INFO: renamed from: d */
    public static final int f149844d = 8;

    /* JADX INFO: renamed from: e */
    private static final long f149845e;

    /* JADX INFO: renamed from: f */
    private static final long f149846f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13037f2 isDetected;

    /* JADX INFO: renamed from: uu0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.dorset.DorsetDetectionMonitorImpl$isDetected$3", m100430f = "DorsetDetectionMonitorImpl.kt", m100431l = {47, 48, 49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "", "Lek0/o;", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lek0/o;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f149849w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f149850x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13062m interfaceC13062m, C13290o c13290o, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f149850x = interfaceC13062m;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f149850x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f149849w
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L27
                if (r2 == r5) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                p505ts.AbstractC34132o.m107864I(r8)
                goto L54
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L46
            L23:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L37
            L27:
                p505ts.AbstractC34132o.m107864I(r8)
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r7.f149850x = r0
                r7.f149849w = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L37
                goto L53
            L37:
                long r5 = uu0.C35235b.m111614c()
                r7.f149850x = r0
                r7.f149849w = r4
                java.lang.Object r8 = bc3.AbstractC3034m0.m8783c(r5, r7)
                if (r8 != r1) goto L46
                goto L53
            L46:
                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                r2 = 0
                r7.f149850x = r2
                r7.f149849w = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L54
            L53:
                return r1
            L54:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uu0.C35235b.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: uu0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.dorset.DorsetDetectionMonitorImpl$isDetected$4", m100430f = "DorsetDetectionMonitorImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f149851w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ boolean f149852x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C35235b.this.new c(interfaceC30057d);
            cVar.f149852x = ((Boolean) obj).booleanValue();
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.f149852x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f149851w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C35235b.this.logger.mo85216g(AbstractC11266d.m30462p("Dorset detection state changed: isDetected=", z4), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }

        public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(Boolean.valueOf(z4), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: uu0.b$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149854w;

        /* JADX INFO: renamed from: uu0.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149855w;

            /* JADX INFO: renamed from: uu0.b$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes7.dex */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.dorset.DorsetDetectionMonitorImpl$special$$inlined$filter$1$2", m100430f = "DorsetDetectionMonitorImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42510a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f149857F;

                /* JADX INFO: renamed from: G */
                Object f149858G;

                /* JADX INFO: renamed from: H */
                int f149859H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149860w;

                /* JADX INFO: renamed from: x */
                int f149861x;

                /* JADX INFO: renamed from: y */
                Object f149862y;

                /* JADX INFO: renamed from: z */
                Object f149863z;

                public C42510a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149860w = obj;
                    this.f149861x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149855w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42510a c42510a;
                if (interfaceC30057d instanceof C42510a) {
                    c42510a = (C42510a) interfaceC30057d;
                    int i13 = c42510a.f149861x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42510a.f149861x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42510a = new C42510a(interfaceC30057d);
                    }
                } else {
                    c42510a = new C42510a(interfaceC30057d);
                }
                Object obj2 = c42510a.f149860w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42510a.f149861x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149855w;
                    if (((C13290o) obj).getGenericEventId() == C13290o.b.DORSET_DETECTED) {
                        c42510a.f149862y = null;
                        c42510a.f149863z = null;
                        c42510a.f149857F = null;
                        c42510a.f149858G = null;
                        c42510a.f149859H = 0;
                        c42510a.f149861x = 1;
                        if (interfaceC13062m.emit(obj, c42510a) == enumC31071a) {
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
            this.f149854w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149854w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu0.b$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149864w;

        /* JADX INFO: renamed from: uu0.b$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149865w;

            /* JADX INFO: renamed from: uu0.b$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes7.dex */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.dorset.DorsetDetectionMonitorImpl$special$$inlined$filterIsInstance$1$2", m100430f = "DorsetDetectionMonitorImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42511a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f149867F;

                /* JADX INFO: renamed from: G */
                Object f149868G;

                /* JADX INFO: renamed from: H */
                int f149869H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149870w;

                /* JADX INFO: renamed from: x */
                int f149871x;

                /* JADX INFO: renamed from: y */
                Object f149872y;

                /* JADX INFO: renamed from: z */
                Object f149873z;

                public C42511a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149870w = obj;
                    this.f149871x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149865w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42511a c42511a;
                if (interfaceC30057d instanceof C42511a) {
                    c42511a = (C42511a) interfaceC30057d;
                    int i13 = c42511a.f149871x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42511a.f149871x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42511a = new C42511a(interfaceC30057d);
                    }
                } else {
                    c42511a = new C42511a(interfaceC30057d);
                }
                Object obj2 = c42511a.f149870w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42511a.f149871x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149865w;
                    if (obj instanceof C13290o) {
                        c42511a.f149872y = null;
                        c42511a.f149873z = null;
                        c42511a.f149867F = null;
                        c42511a.f149868G = null;
                        c42511a.f149869H = 0;
                        c42511a.f149871x = 1;
                        if (interfaceC13062m.emit(obj, c42511a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f149864w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149864w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu0.b$f */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityNotifications.dorset.DorsetDetectionMonitorImpl$special$$inlined$flatMapLatest$1", m100430f = "DorsetDetectionMonitorImpl.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f149874w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f149875x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f149876y;

        public f(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f149875x = interfaceC13062m;
            fVar.f149876y = interfaceC21750d;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149874w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f149875x;
                InterfaceC13058l interfaceC13058lMo24750v = ((InterfaceC21750d) this.f149876y).mo24750v(AbstractC12350b.m34570S(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13290o.class)));
                this.f149875x = null;
                this.f149876y = null;
                this.f149874w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo24750v, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(10, DurationUnit.MINUTES);
        DurationUnit durationUnit = DurationUnit.SECONDS;
        f149845e = Duration.m134291plusLRDsOJo(duration, DurationKt.toDuration(5, durationUnit));
        f149846f = DurationKt.toDuration(5, durationUnit);
    }

    public C35235b(InterfaceC4733b whoopStrapProvider, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.logger = InterfaceC34116n.INSTANCE.m107848a("DorsetDetectionMonitor");
        this.isDetected = AbstractC13091v.m36587M(new C13052j1(AbstractC13091v.m36610t(AbstractC13091v.m36590P(new d(new e(AbstractC13091v.m36590P(AbstractC13091v.m36610t(new C4588i(whoopStrapProvider.mo14818b(), 2)), new f(null)))), new b(null))), new c(null), 0), coroutineScope, C13105z1.m36630a(2, Duration.m134273getInWholeMillisecondsimpl(f149846f)), Boolean.FALSE);
    }

    @Override // et0.InterfaceC13596a
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC13037f2 getIsDetected() {
        return this.isDetected;
    }
}
