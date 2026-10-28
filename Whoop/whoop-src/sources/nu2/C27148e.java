package nu2;

import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import ek0.C13288m;
import fu2.InterfaceC14786a;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import lt0.AbstractC24726c;
import lt0.AbstractC24734k;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: nu2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m65681d2 = {"Lnu2/e;", "", "Lci2/b;", "whoopStrapProvider", "<init>", "(Lci2/b;)V", "Lec3/l;", "Lfu2/a;", "a", "Lec3/l;", "()Lec3/l;", "strapActions", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27148e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13058l strapActions;

    /* JADX INFO: renamed from: nu2.e$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108614w;

        /* JADX INFO: renamed from: nu2.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42095a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108615w;

            /* JADX INFO: renamed from: nu2.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutStrapListener$special$$inlined$filterIsInstance$1$2", m100430f = "ActiveWorkoutStrapListener.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42096a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f108617F;

                /* JADX INFO: renamed from: G */
                Object f108618G;

                /* JADX INFO: renamed from: H */
                int f108619H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108620w;

                /* JADX INFO: renamed from: x */
                int f108621x;

                /* JADX INFO: renamed from: y */
                Object f108622y;

                /* JADX INFO: renamed from: z */
                Object f108623z;

                public C42096a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108620w = obj;
                    this.f108621x |= Integer.MIN_VALUE;
                    return C42095a.this.emit(null, this);
                }
            }

            public C42095a(InterfaceC13062m interfaceC13062m) {
                this.f108615w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42096a c42096a;
                if (interfaceC30057d instanceof C42096a) {
                    c42096a = (C42096a) interfaceC30057d;
                    int i13 = c42096a.f108621x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42096a.f108621x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42096a = new C42096a(interfaceC30057d);
                    }
                } else {
                    c42096a = new C42096a(interfaceC30057d);
                }
                Object obj2 = c42096a.f108620w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42096a.f108621x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108615w;
                    if (obj instanceof C13288m) {
                        c42096a.f108622y = null;
                        c42096a.f108623z = null;
                        c42096a.f108617F = null;
                        c42096a.f108618G = null;
                        c42096a.f108619H = 0;
                        c42096a.f108621x = 1;
                        if (interfaceC13062m.emit(obj, c42096a) == enumC31071a) {
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
            this.f108614w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108614w.collect(new C42095a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nu2.e$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutStrapListener$special$$inlined$flatMapLatest$1", m100430f = "ActiveWorkoutStrapListener.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f108624w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f108625x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f108626y;

        public b(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f108625x = interfaceC13062m;
            bVar.f108626y = interfaceC21750d;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108624w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f108625x;
                InterfaceC13087t1 interfaceC13087t1Mo24742o0 = ((InterfaceC21750d) this.f108626y).mo24742o0();
                this.f108625x = null;
                this.f108626y = null;
                this.f108624w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13087t1Mo24742o0, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nu2.e$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108627w;

        /* JADX INFO: renamed from: nu2.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108628w;

            /* JADX INFO: renamed from: nu2.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutStrapListener$special$$inlined$map$1$2", m100430f = "ActiveWorkoutStrapListener.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42097a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108629E;

                /* JADX INFO: renamed from: F */
                Object f108630F;

                /* JADX INFO: renamed from: G */
                Object f108631G;

                /* JADX INFO: renamed from: H */
                int f108632H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108633w;

                /* JADX INFO: renamed from: x */
                int f108634x;

                /* JADX INFO: renamed from: y */
                Object f108635y;

                public C42097a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108633w = obj;
                    this.f108634x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f108628w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42097a c42097a;
                if (interfaceC30057d instanceof C42097a) {
                    c42097a = (C42097a) interfaceC30057d;
                    int i13 = c42097a.f108634x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42097a.f108634x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42097a = new C42097a(interfaceC30057d);
                    }
                } else {
                    c42097a = new C42097a(interfaceC30057d);
                }
                Object obj2 = c42097a.f108633w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42097a.f108634x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108628w;
                    AbstractC24726c packet = ((AbstractC24734k) obj).getPacket();
                    c42097a.f108635y = null;
                    c42097a.f108629E = null;
                    c42097a.f108630F = null;
                    c42097a.f108631G = null;
                    c42097a.f108632H = 0;
                    c42097a.f108634x = 1;
                    if (interfaceC13062m.emit(packet, c42097a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f108627w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108627w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nu2.e$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108637w;

        /* JADX INFO: renamed from: nu2.e$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108638w;

            /* JADX INFO: renamed from: nu2.e$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutStrapListener$special$$inlined$map$2$2", m100430f = "ActiveWorkoutStrapListener.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42098a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108639E;

                /* JADX INFO: renamed from: F */
                Object f108640F;

                /* JADX INFO: renamed from: G */
                Object f108641G;

                /* JADX INFO: renamed from: H */
                int f108642H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108643w;

                /* JADX INFO: renamed from: x */
                int f108644x;

                /* JADX INFO: renamed from: y */
                Object f108645y;

                public C42098a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108643w = obj;
                    this.f108644x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f108638w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42098a c42098a;
                if (interfaceC30057d instanceof C42098a) {
                    c42098a = (C42098a) interfaceC30057d;
                    int i13 = c42098a.f108644x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42098a.f108644x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42098a = new C42098a(interfaceC30057d);
                    }
                } else {
                    c42098a = new C42098a(interfaceC30057d);
                }
                Object obj2 = c42098a.f108643w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42098a.f108644x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108638w;
                    InterfaceC14786a.r rVar = new InterfaceC14786a.r(null, 1, null);
                    c42098a.f108645y = null;
                    c42098a.f108639E = null;
                    c42098a.f108640F = null;
                    c42098a.f108641G = null;
                    c42098a.f108642H = 0;
                    c42098a.f108644x = 1;
                    if (interfaceC13062m.emit(rVar, c42098a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f108637w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108637w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C27148e(InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.strapActions = new d(new a(new c(AbstractC13091v.m36590P(new C4588i(whoopStrapProvider.mo14819c(), 2), new b(null)))));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC13058l getStrapActions() {
        return this.strapActions;
    }
}
