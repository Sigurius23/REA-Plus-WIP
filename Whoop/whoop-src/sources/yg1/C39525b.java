package yg1;

import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import lt0.EnumC24728e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: yg1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lyg1/b;", "", "Ltr2/n;", "logger", "Lci2/b;", "whoopStrapProvider", "<init>", "(Ltr2/n;Lci2/b;)V", "a", "Ltr2/n;", "Lec3/l;", "Lyg1/a;", "b", "Lec3/l;", "getFirmwareUpdateStatusFlow", "()Lec3/l;", "firmwareUpdateStatusFlow", "firmware-feature-flag_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39525b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13058l firmwareUpdateStatusFlow;

    /* JADX INFO: renamed from: yg1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f169964a;

        static {
            int[] iArr = new int[EnumC24728e.values().length];
            try {
                iArr[EnumC24728e.START_FIRMWARE_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24728e.LOAD_FIRMWARE_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24728e.PROCESS_FIRMWARE_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f169964a = iArr;
        }
    }

    /* JADX INFO: renamed from: yg1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.hooks.FirmwareUpdateStatusHook$firmwareUpdateStatusFlow$3", m100430f = "FirmwareUpdateStatusHook.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lyg1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169965w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f169966x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f169966x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f169966x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169965w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                EnumC39524a enumC39524a = EnumC39524a.NONE;
                this.f169966x = null;
                this.f169965w = 1;
                if (interfaceC13062m.emit(enumC39524a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yg1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.hooks.FirmwareUpdateStatusHook$special$$inlined$flatMapLatest$1", m100430f = "FirmwareUpdateStatusHook.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f169967w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f169968x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f169969y;

        public c(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f169968x = interfaceC13062m;
            cVar.f169969y = interfaceC21750d;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169967w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f169968x;
                InterfaceC13087t1 interfaceC13087t1Mo24754x0 = ((InterfaceC21750d) this.f169969y).mo24754x0();
                this.f169968x = null;
                this.f169969y = null;
                this.f169967w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13087t1Mo24754x0, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yg1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.hooks.FirmwareUpdateStatusHook$special$$inlined$transform$1", m100430f = "FirmwareUpdateStatusHook.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169970w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f169971x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f169972y;

        /* JADX INFO: renamed from: yg1.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f169973w;

            /* JADX INFO: renamed from: yg1.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.firmwarefeatureflag.hooks.FirmwareUpdateStatusHook$special$$inlined$transform$1$1", m100430f = "FirmwareUpdateStatusHook.kt", m100431l = {45, 48, 50, 52, 53}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42694a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f169974E;

                /* JADX INFO: renamed from: F */
                Object f169975F;

                /* JADX INFO: renamed from: G */
                Object f169976G;

                /* JADX INFO: renamed from: H */
                Object f169977H;

                /* JADX INFO: renamed from: I */
                int f169978I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f169979w;

                /* JADX INFO: renamed from: x */
                int f169980x;

                /* JADX INFO: renamed from: z */
                Object f169982z;

                public C42694a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f169979w = obj;
                    this.f169980x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f169973w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
            
                r11 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
            
                if (r2.emit(r12, r0) == r1) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L48;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r11, q83.InterfaceC30057d<? super l83.C23454a0> r12) {
                /*
                    Method dump skipped, instruction units count: 290
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yg1.C39525b.d.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169972y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f169972y, interfaceC30057d);
            dVar.f169971x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169970w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f169971x;
                InterfaceC13058l interfaceC13058l = this.f169972y;
                a aVar = new a(interfaceC13062m);
                this.f169971x = null;
                this.f169970w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    public C39525b(InterfaceC34116n logger, InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.logger = logger;
        this.firmwareUpdateStatusFlow = AbstractC13091v.m36610t(new C13015a0(new b(null), new C13084s1(new d(AbstractC13091v.m36590P(new C4588i(whoopStrapProvider.mo14819c(), 2), new c(null)), null))));
    }
}
