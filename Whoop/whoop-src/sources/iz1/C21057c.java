package iz1;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz1.InterfaceC16330a;
import gz1.InterfaceC16331b;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: iz1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Liz1/c;", "Lod1/g;", "Liz1/a;", "Liz1/b;", "Lgz1/a;", "detectionSource", "<init>", "(Lgz1/a;)V", "Lec3/l;", "Liz1/d;", "e", "()Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lgz1/a;", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21057c implements InterfaceC27844g<InterfaceC21055a, C21056b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC16330a detectionSource;

    /* JADX INFO: renamed from: iz1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.motiontrackingsandbox.domain.MotionTrackingSandboxInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MotionTrackingSandboxInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f79857w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f79858x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f79859y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21057c f79860z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C21057c c21057c) {
            super(3, interfaceC30057d);
            this.f79860z = c21057c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21055a interfaceC21055a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f79860z);
            aVar.f79858x = interfaceC13062m;
            aVar.f79859y = interfaceC21055a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79857w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f79858x;
                InterfaceC21055a interfaceC21055a = (InterfaceC21055a) this.f79859y;
                if (AbstractC22676k.m65745e(interfaceC21055a, InterfaceC21055a.a.f79852a)) {
                    c0456u = this.f79860z.m58904e();
                } else {
                    if (!AbstractC22676k.m65745e(interfaceC21055a, InterfaceC21055a.b.f79853a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = new C0456u(InterfaceC21058d.c.f79879a, 1);
                }
                this.f79858x = null;
                this.f79859y = null;
                this.f79857w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21055a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: iz1.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.motiontrackingsandbox.domain.MotionTrackingSandboxInteractor$interact$2", m100430f = "MotionTrackingSandboxInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Liz1/b;", "state", "Liz1/d;", NotificationCompat.CATEGORY_EVENT, "<anonymous>", "(Liz1/b;Liz1/d;)Liz1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f79861w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f79862x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f79863y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C21056b c21056b, InterfaceC21058d interfaceC21058d, InterfaceC30057d<? super C21056b> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f79862x = c21056b;
            bVar.f79863y = interfaceC21058d;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C21056b c21056b = (C21056b) this.f79862x;
            InterfaceC21058d interfaceC21058d = (InterfaceC21058d) this.f79863y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f79861w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return interfaceC21058d.mo58906a(c21056b);
        }
    }

    /* JADX INFO: renamed from: iz1.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.motiontrackingsandbox.domain.MotionTrackingSandboxInteractor$startSession$1", m100430f = "MotionTrackingSandboxInteractor.kt", m100431l = {30, 31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Liz1/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79864w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f79865x;

        /* JADX INFO: renamed from: iz1.c$c$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f79867w;

            /* JADX INFO: renamed from: iz1.c$c$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41812a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f79868w;

                /* JADX INFO: renamed from: iz1.c$c$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.motiontrackingsandbox.domain.MotionTrackingSandboxInteractor$startSession$1$invokeSuspend$$inlined$map$1$2", m100430f = "MotionTrackingSandboxInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41813a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f79869E;

                    /* JADX INFO: renamed from: F */
                    Object f79870F;

                    /* JADX INFO: renamed from: G */
                    Object f79871G;

                    /* JADX INFO: renamed from: H */
                    int f79872H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f79873w;

                    /* JADX INFO: renamed from: x */
                    int f79874x;

                    /* JADX INFO: renamed from: y */
                    Object f79875y;

                    public C41813a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f79873w = obj;
                        this.f79874x |= Integer.MIN_VALUE;
                        return C41812a.this.emit(null, this);
                    }
                }

                public C41812a(InterfaceC13062m interfaceC13062m) {
                    this.f79868w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41813a c41813a;
                    if (interfaceC30057d instanceof C41813a) {
                        c41813a = (C41813a) interfaceC30057d;
                        int i13 = c41813a.f79874x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41813a.f79874x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41813a = new C41813a(interfaceC30057d);
                        }
                    } else {
                        c41813a = new C41813a(interfaceC30057d);
                    }
                    Object obj2 = c41813a.f79873w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41813a.f79874x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f79868w;
                        InterfaceC21058d.a aVar = new InterfaceC21058d.a((InterfaceC16331b) obj);
                        c41813a.f79875y = null;
                        c41813a.f79869E = null;
                        c41813a.f79870F = null;
                        c41813a.f79871G = null;
                        c41813a.f79872H = 0;
                        c41813a.f79874x = 1;
                        if (interfaceC13062m.emit(aVar, c41813a) == enumC31071a) {
                            return enumC31071a;
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
                this.f79867w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f79867w.collect(new C41812a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C21057c.this.new c(interfaceC30057d);
            cVar.f79865x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r2, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f79865x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f79864w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L4b
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                iz1.d$b r6 = iz1.InterfaceC21058d.b.f79878a
                r5.f79865x = r0
                r5.f79864w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L4a
            L30:
                iz1.c r6 = iz1.C21057c.this
                gz1.a r6 = iz1.C21057c.m58902c(r6)
                ec3.l r6 = r6.mo46522a()
                iz1.c$c$a r2 = new iz1.c$c$a
                r2.<init>(r6)
                r6 = 0
                r5.f79865x = r6
                r5.f79864w = r3
                java.lang.Object r6 = ec3.AbstractC13091v.m36613w(r0, r2, r5)
                if (r6 != r1) goto L4b
            L4a:
                return r1
            L4b:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: iz1.C21057c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C21057c(InterfaceC16330a detectionSource) {
        AbstractC22676k.m65750j(detectionSource, "detectionSource");
        this.detectionSource = detectionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m58904e() {
        return new C13084s1(new c(null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C21056b(null, null, 3, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new b(null));
    }
}
