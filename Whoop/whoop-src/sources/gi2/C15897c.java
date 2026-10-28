package gi2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hi2.C17317b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import ji2.C21724c;
import l83.C23454a0;
import m83.AbstractC25265s;
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

/* JADX INFO: renamed from: gi2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\t\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lgi2/c;", "Lod1/g;", "Lgi2/b;", "Lgi2/d;", "Lgi2/e;", "stravaInteractor", "<init>", "(Lgi2/e;)V", "Lgi2/b$f;", "domainAction", "Lec3/l;", "j", "(Lgi2/b$f;)Lec3/l;", "Lgi2/b$e;", "i", "(Lgi2/b$e;)Lec3/l;", "Lgi2/b$h;", "m", "(Lgi2/b$h;)Lec3/l;", "Lgi2/b$g;", "l", "(Lgi2/b$g;)Lec3/l;", "Lgi2/b$d;", "Lgi2/d$b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lgi2/b$d;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lgi2/e;", "k", "()Lgi2/e;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15897c implements InterfaceC27844g<AbstractC15896b, AbstractC15898d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C15899e stravaInteractor;

    /* JADX INFO: renamed from: gi2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaDomainInteractor$interact$$inlined$flatMapLatest$1", m100430f = "StravaDomainInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f60039w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f60040x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f60041y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15897c f60042z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C15897c c15897c) {
            super(3, interfaceC30057d);
            this.f60042z = c15897c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC15896b abstractC15896b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f60042z);
            aVar.f60040x = interfaceC13062m;
            aVar.f60041y = abstractC15896b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60039w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f60040x;
                AbstractC15896b abstractC15896b = (AbstractC15896b) this.f60041y;
                if (abstractC15896b instanceof AbstractC15896b.a) {
                    c13084s1 = new C13084s1(this.f60042z.new c(abstractC15896b, null));
                } else if (abstractC15896b instanceof AbstractC15896b.b) {
                    c13084s1 = new C13084s1(new d(abstractC15896b, this.f60042z, null));
                } else if (AbstractC22676k.m65745e(abstractC15896b, AbstractC15896b.c.f60024a)) {
                    c13084s1 = new C13084s1(this.f60042z.new e(abstractC15896b, null));
                } else if (abstractC15896b instanceof AbstractC15896b.d) {
                    c13084s1 = this.f60042z.m44852h((AbstractC15896b.d) abstractC15896b);
                } else if (abstractC15896b instanceof AbstractC15896b.e) {
                    c13084s1 = this.f60042z.m44853i((AbstractC15896b.e) abstractC15896b);
                } else if (abstractC15896b instanceof AbstractC15896b.f) {
                    c13084s1 = this.f60042z.m44854j((AbstractC15896b.f) abstractC15896b);
                } else if (abstractC15896b instanceof AbstractC15896b.g) {
                    c13084s1 = this.f60042z.m44855l((AbstractC15896b.g) abstractC15896b);
                } else if (abstractC15896b instanceof AbstractC15896b.h) {
                    c13084s1 = this.f60042z.m44856m((AbstractC15896b.h) abstractC15896b);
                } else {
                    if (!(abstractC15896b instanceof AbstractC15896b.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(new f(abstractC15896b, this.f60042z, null));
                }
                this.f60040x = null;
                this.f60041y = null;
                this.f60039w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC15896b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: gi2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f60043w;

        /* JADX INFO: renamed from: gi2.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f60044w;

            /* JADX INFO: renamed from: gi2.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaDomainInteractor$interact$$inlined$map$1$2", m100430f = "StravaDomainInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41655a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f60045E;

                /* JADX INFO: renamed from: F */
                Object f60046F;

                /* JADX INFO: renamed from: G */
                Object f60047G;

                /* JADX INFO: renamed from: H */
                int f60048H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f60049w;

                /* JADX INFO: renamed from: x */
                int f60050x;

                /* JADX INFO: renamed from: y */
                Object f60051y;

                public C41655a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f60049w = obj;
                    this.f60050x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f60044w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41655a c41655a;
                if (interfaceC30057d instanceof C41655a) {
                    c41655a = (C41655a) interfaceC30057d;
                    int i13 = c41655a.f60050x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41655a.f60050x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41655a = new C41655a(interfaceC30057d);
                    }
                } else {
                    c41655a = new C41655a(interfaceC30057d);
                }
                Object obj2 = c41655a.f60049w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41655a.f60050x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f60044w;
                    AbstractC15898d domainResult = ((C15895a) obj).getDomainResult();
                    c41655a.f60051y = null;
                    c41655a.f60045E = null;
                    c41655a.f60046F = null;
                    c41655a.f60047G = null;
                    c41655a.f60048H = 0;
                    c41655a.f60050x = 1;
                    if (interfaceC13062m.emit(domainResult, c41655a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f60043w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f60043w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gi2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaDomainInteractor$interact$1$1", m100430f = "StravaDomainInteractor.kt", m100431l = {26, 27, 28, 32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lgi2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f60053E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ AbstractC15896b f60055G;

        /* JADX INFO: renamed from: w */
        Object f60056w;

        /* JADX INFO: renamed from: x */
        Object f60057x;

        /* JADX INFO: renamed from: y */
        int f60058y;

        /* JADX INFO: renamed from: z */
        int f60059z;

        /* JADX INFO: renamed from: gi2.c$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaDomainInteractor$interact$1$1$1$1", m100430f = "StravaDomainInteractor.kt", m100431l = {29, 29}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            Object f60060w;

            /* JADX INFO: renamed from: x */
            int f60061x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f60062y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C15897c f60063z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C15897c c15897c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f60062y = interfaceC13062m;
                this.f60063z = c15897c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f60062y, this.f60063z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
            
                if (r1.emit(r8, r7) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r7.f60061x
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L21
                    if (r1 == r4) goto L19
                    if (r1 != r3) goto L11
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L48
                L11:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L19:
                    java.lang.Object r1 = r7.f60060w
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L3d
                L21:
                    p505ts.AbstractC34132o.m107864I(r8)
                    ec3.m r1 = r7.f60062y
                    gi2.c r8 = r7.f60063z
                    gi2.e r8 = r8.getStravaInteractor()
                    gi2.b$b r5 = new gi2.b$b
                    r6 = 0
                    r5.<init>(r6, r4, r2)
                    r7.f60060w = r1
                    r7.f60061x = r4
                    java.lang.Object r8 = r8.m44877i(r5, r7)
                    if (r8 != r0) goto L3d
                    goto L47
                L3d:
                    r7.f60060w = r2
                    r7.f60061x = r3
                    java.lang.Object r8 = r1.emit(r8, r7)
                    if (r8 != r0) goto L48
                L47:
                    return r0
                L48:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: gi2.C15897c.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC15896b abstractC15896b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60055G = abstractC15896b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C15897c.this.new c(this.f60055G, interfaceC30057d);
            cVar.f60053E = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1500, r9, r8) == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L32;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f60053E
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f60059z
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L3f
                if (r2 == r6) goto L3b
                if (r2 == r5) goto L2d
                if (r2 == r4) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r0 = r8.f60056w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                goto L28
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                java.lang.Object r0 = r8.f60056w
                gi2.d$a r0 = (gi2.AbstractC15898d.a) r0
            L28:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L9c
            L2d:
                int r2 = r8.f60058y
                java.lang.Object r3 = r8.f60057x
                gi2.d$a r3 = (gi2.AbstractC15898d.a) r3
                java.lang.Object r3 = r8.f60056w
                gi2.c r3 = (gi2.C15897c) r3
                p505ts.AbstractC34132o.m107864I(r9)
                goto L73
            L3b:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L55
            L3f:
                p505ts.AbstractC34132o.m107864I(r9)
                gi2.c r9 = gi2.C15897c.this
                gi2.e r9 = r9.getStravaInteractor()
                gi2.b r2 = r8.f60055G
                r8.f60053E = r0
                r8.f60059z = r6
                java.lang.Object r9 = r9.m44877i(r2, r8)
                if (r9 != r1) goto L55
                goto L9b
            L55:
                boolean r2 = r9 instanceof gi2.AbstractC15898d.a
                if (r2 == 0) goto L5c
                gi2.d$a r9 = (gi2.AbstractC15898d.a) r9
                goto L5d
            L5c:
                r9 = r7
            L5d:
                r2 = 0
                if (r9 == 0) goto L8b
                gi2.c r3 = gi2.C15897c.this
                r8.f60053E = r0
                r8.f60056w = r3
                r8.f60057x = r7
                r8.f60058y = r2
                r8.f60059z = r5
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L73
                goto L9b
            L73:
                gi2.c$c$a r9 = new gi2.c$c$a
                r9.<init>(r0, r3, r7)
                r8.f60053E = r0
                r8.f60056w = r7
                r8.f60057x = r7
                r8.f60058y = r2
                r8.f60059z = r4
                r2 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r9 = or2.AbstractC28190p0.m85321a(r2, r9, r8)
                if (r9 != r1) goto L9c
                goto L9b
            L8b:
                gi2.d$c r9 = gi2.AbstractC15898d.c.f60085a
                r8.f60053E = r7
                r8.f60056w = r7
                r8.f60058y = r2
                r8.f60059z = r3
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L9c
            L9b:
                return r1
            L9c:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: gi2.C15897c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gi2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaDomainInteractor$interact$1$2", m100430f = "StravaDomainInteractor.kt", m100431l = {37, 39, 41, 41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lgi2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C15897c f60064E;

        /* JADX INFO: renamed from: w */
        Object f60065w;

        /* JADX INFO: renamed from: x */
        int f60066x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f60067y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC15896b f60068z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC15896b abstractC15896b, C15897c c15897c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60068z = abstractC15896b;
            this.f60064E = c15897c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f60068z, this.f60064E, interfaceC30057d);
            dVar.f60067y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f60067y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f60066x
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L2f
                if (r2 == r6) goto L2b
                if (r2 == r5) goto L2b
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                p505ts.AbstractC34132o.m107864I(r9)
                goto L78
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r0 = r8.f60065w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L6b
            L2b:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L56
            L2f:
                p505ts.AbstractC34132o.m107864I(r9)
                gi2.b r9 = r8.f60068z
                gi2.b$b r9 = (gi2.AbstractC15896b.b) r9
                boolean r9 = r9.getNavBack()
                if (r9 == 0) goto L49
                gi2.d$d r9 = gi2.AbstractC15898d.d.f60086a
                r8.f60067y = r0
                r8.f60066x = r6
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L56
                goto L77
            L49:
                gi2.d$h r9 = gi2.AbstractC15898d.h.f60090a
                r8.f60067y = r0
                r8.f60066x = r5
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L56
                goto L77
            L56:
                gi2.c r9 = r8.f60064E
                gi2.e r9 = r9.getStravaInteractor()
                gi2.b r2 = r8.f60068z
                r8.f60067y = r7
                r8.f60065w = r0
                r8.f60066x = r4
                java.lang.Object r9 = r9.m44877i(r2, r8)
                if (r9 != r1) goto L6b
                goto L77
            L6b:
                r8.f60067y = r7
                r8.f60065w = r7
                r8.f60066x = r3
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L78
            L77:
                return r1
            L78:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: gi2.C15897c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gi2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaDomainInteractor$interact$1$3", m100430f = "StravaDomainInteractor.kt", m100431l = {44, 45, 45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lgi2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC15896b f60069E;

        /* JADX INFO: renamed from: w */
        Object f60070w;

        /* JADX INFO: renamed from: x */
        int f60071x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f60072y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC15896b abstractC15896b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60069E = abstractC15896b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C15897c.this.new e(this.f60069E, interfaceC30057d);
            eVar.f60072y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
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
                java.lang.Object r0 = r7.f60072y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f60071x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5e
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f60070w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L51
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                gi2.d$h r8 = gi2.AbstractC15898d.h.f60090a
                r7.f60072y = r0
                r7.f60071x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3c
                goto L5d
            L3c:
                gi2.c r8 = gi2.C15897c.this
                gi2.e r8 = r8.getStravaInteractor()
                gi2.b r2 = r7.f60069E
                r7.f60072y = r6
                r7.f60070w = r0
                r7.f60071x = r4
                java.lang.Object r8 = r8.m44877i(r2, r7)
                if (r8 != r1) goto L51
                goto L5d
            L51:
                r7.f60072y = r6
                r7.f60070w = r6
                r7.f60071x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L5e
            L5d:
                return r1
            L5e:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: gi2.C15897c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gi2.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaDomainInteractor$interact$1$4", m100430f = "StravaDomainInteractor.kt", m100431l = {53, 54, 54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lgi2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C15897c f60074E;

        /* JADX INFO: renamed from: w */
        Object f60075w;

        /* JADX INFO: renamed from: x */
        int f60076x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f60077y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC15896b f60078z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC15896b abstractC15896b, C15897c c15897c, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60078z = abstractC15896b;
            this.f60074E = c15897c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f60078z, this.f60074E, interfaceC30057d);
            fVar.f60077y = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L22;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f60077y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f60076x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r8)
                goto L68
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f60075w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5b
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L46
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                gi2.b r8 = r7.f60078z
                gi2.b$i r8 = (gi2.AbstractC15896b.i) r8
                boolean r8 = r8.getNavBack()
                if (r8 == 0) goto L46
                gi2.d$d r8 = gi2.AbstractC15898d.d.f60086a
                r7.f60077y = r0
                r7.f60076x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L46
                goto L67
            L46:
                gi2.c r8 = r7.f60074E
                gi2.e r8 = r8.getStravaInteractor()
                gi2.b r2 = r7.f60078z
                r7.f60077y = r6
                r7.f60075w = r0
                r7.f60076x = r4
                java.lang.Object r8 = r8.m44877i(r2, r7)
                if (r8 != r1) goto L5b
                goto L67
            L5b:
                r7.f60077y = r6
                r7.f60075w = r6
                r7.f60076x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L68
            L67:
                return r1
            L68:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: gi2.C15897c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gi2.c$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strava.domain.StravaDomainInteractor$interact$2", m100430f = "StravaDomainInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lgi2/a;", "accumulator", "Lgi2/d;", "currentDomainResult", "<anonymous>", "(Lgi2/a;Lgi2/d;)Lgi2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f60079w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f60080x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f60081y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C15895a c15895a, AbstractC15898d abstractC15898d, InterfaceC30057d<? super C15895a> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f60080x = c15895a;
            gVar.f60081y = abstractC15898d;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC15898d domainResult;
            C15895a c15895a = (C15895a) this.f60080x;
            AbstractC15898d abstractC15898d = (AbstractC15898d) this.f60081y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f60079w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(abstractC15898d instanceof AbstractC15898d.a) && !(abstractC15898d instanceof AbstractC15898d.b) && !AbstractC22676k.m65745e(abstractC15898d, AbstractC15898d.c.f60085a) && !AbstractC22676k.m65745e(abstractC15898d, AbstractC15898d.d.f60086a) && !(abstractC15898d instanceof AbstractC15898d.g) && !AbstractC22676k.m65745e(abstractC15898d, AbstractC15898d.h.f60090a)) {
                if (abstractC15898d instanceof AbstractC15898d.f) {
                    return new C15895a(AbstractC25265s.m74097F1(((AbstractC15898d.f) abstractC15898d).getSelectedActivitiesData().m49069c()), abstractC15898d);
                }
                if (abstractC15898d instanceof AbstractC15898d.e) {
                    if (c15895a.getDomainResult() instanceof AbstractC15898d.f) {
                        AbstractC15898d.e eVar = (AbstractC15898d.e) abstractC15898d;
                        domainResult = ((AbstractC15898d.f) c15895a.getDomainResult()).m44862a(C17317b.m49067b(((AbstractC15898d.f) c15895a.getDomainResult()).getSelectedActivitiesData(), null, AbstractC8693b.m21278l(eVar.getNewText()), eVar.getNewText().length() > 0, null, null, null, false, null, null, null, null, null, false, 8185, null));
                    } else {
                        domainResult = c15895a.getDomainResult();
                    }
                    return new C15895a(c15895a.m44832d(), domainResult);
                }
                if (!(abstractC15898d instanceof AbstractC15898d.j)) {
                    if (!(abstractC15898d instanceof AbstractC15898d.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = c15895a.m44832d().iterator();
                    while (it.hasNext()) {
                        arrayList.add(C21724c.m61204b((C21724c) it.next(), null, null, null, null, ((AbstractC15898d.i) abstractC15898d).getChecked(), false, 47, null));
                    }
                    return new C15895a(arrayList, c15895a.getDomainResult() instanceof AbstractC15898d.f ? ((AbstractC15898d.f) c15895a.getDomainResult()).m44862a(C17317b.m49067b(((AbstractC15898d.f) c15895a.getDomainResult()).getSelectedActivitiesData(), null, null, false, null, null, null, ((AbstractC15898d.i) abstractC15898d).getChecked(), null, null, arrayList, null, null, false, 7611, null)) : c15895a.getDomainResult());
                }
                ArrayList arrayList2 = new ArrayList();
                for (C21724c c21724c : c15895a.m44832d()) {
                    AbstractC15898d.j jVar = (AbstractC15898d.j) abstractC15898d;
                    if (AbstractC22676k.m65745e(c21724c.getActivityNameInternal(), jVar.getName())) {
                        arrayList2.add(C21724c.m61204b(c21724c, null, null, null, null, jVar.getChecked(), false, 47, null));
                    } else {
                        arrayList2.add(c21724c);
                    }
                }
                return new C15895a(arrayList2, c15895a.getDomainResult() instanceof AbstractC15898d.f ? ((AbstractC15898d.f) c15895a.getDomainResult()).m44862a(C17317b.m49067b(((AbstractC15898d.f) c15895a.getDomainResult()).getSelectedActivitiesData(), null, null, false, null, null, null, false, null, null, arrayList2, null, null, false, 7675, null)) : c15895a.getDomainResult());
            }
            return C15895a.m44829b(c15895a, null, abstractC15898d, 1, null);
        }
    }

    public C15897c(C15899e stravaInteractor) {
        AbstractC22676k.m65750j(stravaInteractor, "stravaInteractor");
        this.stravaInteractor = stravaInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m44852h(AbstractC15896b.d domainAction) {
        return new C0456u(new AbstractC15898d.b(domainAction.getDisconnectConfirmationData()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m44853i(AbstractC15896b.e domainAction) {
        return new C0456u(new AbstractC15898d.e(domainAction.getNewText()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m44854j(AbstractC15896b.f domainAction) {
        return new C0456u(new AbstractC15898d.f(domainAction.getSelectedActivitiesData()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m44855l(AbstractC15896b.g domainAction) {
        return new C0456u(new AbstractC15898d.i(domainAction.getChecked()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m44856m(AbstractC15896b.h domainAction) {
        return new C0456u(new AbstractC15898d.j(domainAction.getName(), domainAction.getChecked()), 1);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(new C13060l1(new C15895a(null, null, 3, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new g(null)));
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C15899e getStravaInteractor() {
        return this.stravaInteractor;
    }
}
