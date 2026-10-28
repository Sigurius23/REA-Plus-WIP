package x42;

import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.AbstractC13095w0;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f52.C14103a;
import gt0.AbstractC16185g;
import gt0.InterfaceC16183e;
import gt0.InterfaceC16186h;
import l83.C23454a0;
import l83.C23465k;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
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
import vk0.InterfaceC36079e;
import y42.AbstractC39224f;
import y42.C39228j;
import y42.InterfaceC39219a;

/* JADX INFO: renamed from: x42.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lx42/a;", "", "Ly42/j;", "puffinManager", "Lgt0/e;", "firmwareUpdateApi", "Lf52/a;", "hpsSubmitter", "Ltr2/n;", "logger", "<init>", "(Ly42/j;Lgt0/e;Lf52/a;Ltr2/n;)V", "Lbc3/c0;", "scope", "Ll83/a0;", "d", "(Lbc3/c0;)V", "a", "Ly42/j;", "b", "Lgt0/e;", "c", "Lf52/a;", "Ltr2/n;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37964a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39228j puffinManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC16183e firmwareUpdateApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14103a hpsSubmitter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x42.a$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f162532w;

        /* JADX INFO: renamed from: x42.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42621a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f162533w;

            /* JADX INFO: renamed from: x42.a$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes10.dex */
            @InterfaceC32271e(m100429c = "com.whoop.puffin.BatteryPackHpsMonitor$start$$inlined$filter$1$2", m100430f = "BatteryPackHpsMonitor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42622a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f162535F;

                /* JADX INFO: renamed from: G */
                Object f162536G;

                /* JADX INFO: renamed from: H */
                int f162537H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f162538w;

                /* JADX INFO: renamed from: x */
                int f162539x;

                /* JADX INFO: renamed from: y */
                Object f162540y;

                /* JADX INFO: renamed from: z */
                Object f162541z;

                public C42622a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f162538w = obj;
                    this.f162539x |= Integer.MIN_VALUE;
                    return C42621a.this.emit(null, this);
                }
            }

            public C42621a(InterfaceC13062m interfaceC13062m) {
                this.f162533w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42622a c42622a;
                if (interfaceC30057d instanceof C42622a) {
                    c42622a = (C42622a) interfaceC30057d;
                    int i13 = c42622a.f162539x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42622a.f162539x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42622a = new C42622a(interfaceC30057d);
                    }
                } else {
                    c42622a = new C42622a(interfaceC30057d);
                }
                Object obj2 = c42622a.f162538w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42622a.f162539x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f162533w;
                    Object obj3 = ((C23465k) obj).f92937w;
                    if ((obj3 instanceof InterfaceC16186h.h) || (obj3 instanceof InterfaceC16186h.e) || (obj3 instanceof InterfaceC16186h.b)) {
                        c42622a.f162540y = null;
                        c42622a.f162541z = null;
                        c42622a.f162535F = null;
                        c42622a.f162536G = null;
                        c42622a.f162537H = 0;
                        c42622a.f162539x = 1;
                        if (interfaceC13062m.emit(obj, c42622a) == enumC31071a) {
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
            this.f162532w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f162532w.collect(new C42621a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: x42.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f162542w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37964a f162543x;

        /* JADX INFO: renamed from: x42.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f162544w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37964a f162545x;

            /* JADX INFO: renamed from: x42.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes10.dex */
            @InterfaceC32271e(m100429c = "com.whoop.puffin.BatteryPackHpsMonitor$start$$inlined$map$1$2", m100430f = "BatteryPackHpsMonitor.kt", m100431l = {54, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42623a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f162546E;

                /* JADX INFO: renamed from: F */
                Object f162547F;

                /* JADX INFO: renamed from: G */
                Object f162548G;

                /* JADX INFO: renamed from: H */
                Object f162549H;

                /* JADX INFO: renamed from: I */
                Object f162550I;

                /* JADX INFO: renamed from: J */
                Object f162551J;

                /* JADX INFO: renamed from: K */
                Object f162552K;

                /* JADX INFO: renamed from: L */
                int f162553L;

                /* JADX INFO: renamed from: M */
                int f162554M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f162555w;

                /* JADX INFO: renamed from: x */
                int f162556x;

                /* JADX INFO: renamed from: y */
                Object f162557y;

                public C42623a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f162555w = obj;
                    this.f162556x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37964a c37964a) {
                this.f162544w = interfaceC13062m;
                this.f162545x = c37964a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L30;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, q83.InterfaceC30057d r11) {
                /*
                    Method dump skipped, instruction units count: 241
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: x42.C37964a.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public b(InterfaceC13058l interfaceC13058l, C37964a c37964a) {
            this.f162542w = interfaceC13058l;
            this.f162543x = c37964a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f162542w.collect(new a(interfaceC13062m, this.f162543x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: x42.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.BatteryPackHpsMonitor$start$1", m100430f = "BatteryPackHpsMonitor.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ly42/a;", "it", "Ll83/a0;", "<anonymous>", "(Ly42/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        long f162560w;

        /* JADX INFO: renamed from: x */
        int f162561x;

        /* JADX INFO: renamed from: y */
        int f162562y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f162563z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C37964a.this.new c(interfaceC30057d);
            cVar.f162563z = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC39219a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC39219a interfaceC39219a = (InterfaceC39219a) this.f162563z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f162562y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(60, DurationUnit.SECONDS);
                C37964a.this.logger.mo85228t("got " + interfaceC39219a + ", waiting " + Duration.m134302toStringimpl(duration), new AbstractC30556a.a[0]);
                this.f162563z = null;
                this.f162560w = duration;
                this.f162561x = 0;
                this.f162562y = 1;
                if (AbstractC3034m0.m8783c(duration, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: x42.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.BatteryPackHpsMonitor$start$2", m100430f = "BatteryPackHpsMonitor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ly42/a;", "puffin", "Lec3/l;", "Ll83/k;", "Lgt0/h;", "<anonymous>", "(Ly42/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f162564w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f162565x;

        /* JADX INFO: renamed from: x42.a$d$a */
        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f162567w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37964a f162568x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC39219a f162569y;

            /* JADX INFO: renamed from: x42.a$d$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42624a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f162570w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C37964a f162571x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ InterfaceC39219a f162572y;

                /* JADX INFO: renamed from: x42.a$d$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.puffin.BatteryPackHpsMonitor$start$2$invokeSuspend$$inlined$map$1$2", m100430f = "BatteryPackHpsMonitor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42625a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f162573E;

                    /* JADX INFO: renamed from: F */
                    Object f162574F;

                    /* JADX INFO: renamed from: G */
                    Object f162575G;

                    /* JADX INFO: renamed from: H */
                    int f162576H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f162577w;

                    /* JADX INFO: renamed from: x */
                    int f162578x;

                    /* JADX INFO: renamed from: y */
                    Object f162579y;

                    public C42625a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f162577w = obj;
                        this.f162578x |= Integer.MIN_VALUE;
                        return C42624a.this.emit(null, this);
                    }
                }

                public C42624a(InterfaceC13062m interfaceC13062m, C37964a c37964a, InterfaceC39219a interfaceC39219a) {
                    this.f162570w = interfaceC13062m;
                    this.f162571x = c37964a;
                    this.f162572y = interfaceC39219a;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42625a c42625a;
                    if (interfaceC30057d instanceof C42625a) {
                        c42625a = (C42625a) interfaceC30057d;
                        int i13 = c42625a.f162578x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42625a.f162578x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42625a = new C42625a(interfaceC30057d);
                        }
                    } else {
                        c42625a = new C42625a(interfaceC30057d);
                    }
                    Object obj2 = c42625a.f162577w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42625a.f162578x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f162570w;
                        InterfaceC16186h interfaceC16186h = (InterfaceC16186h) obj;
                        this.f162571x.logger.mo85228t("firmware update observe flow got " + interfaceC16186h, new AbstractC30556a.a[0]);
                        C23465k c23465k = new C23465k(interfaceC16186h, this.f162572y);
                        c42625a.f162579y = null;
                        c42625a.f162573E = null;
                        c42625a.f162574F = null;
                        c42625a.f162575G = null;
                        c42625a.f162576H = 0;
                        c42625a.f162578x = 1;
                        if (interfaceC13062m.emit(c23465k, c42625a) == enumC31071a) {
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

            public a(InterfaceC13058l interfaceC13058l, C37964a c37964a, InterfaceC39219a interfaceC39219a) {
                this.f162567w = interfaceC13058l;
                this.f162568x = c37964a;
                this.f162569y = interfaceC39219a;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f162567w.collect(new C42624a(interfaceC13062m, this.f162568x, this.f162569y), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C37964a.this.new d(interfaceC30057d);
            dVar.f162565x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((d) create(interfaceC39219a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC39219a interfaceC39219a = (InterfaceC39219a) this.f162565x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f162564w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C37964a.this.logger.mo85228t("mapping " + interfaceC39219a + ", to firmware update api observe", new AbstractC30556a.a[0]);
            return new a(C37964a.this.firmwareUpdateApi.mo45721b(new AbstractC16185g.d(AbstractC39224f.m124963a(interfaceC39219a))), C37964a.this, interfaceC39219a);
        }
    }

    /* JADX INFO: renamed from: x42.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.BatteryPackHpsMonitor$start$5", m100430f = "BatteryPackHpsMonitor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lvk0/e;", "response", "Ll83/a0;", "<anonymous>", "(Lvk0/e;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f162581w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f162582x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C37964a.this.new e(interfaceC30057d);
            eVar.f162582x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC36079e interfaceC36079e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC36079e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC36079e interfaceC36079e = (InterfaceC36079e) this.f162582x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f162581w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC36079e != null) {
                C37964a.this.logger.mo85228t("Puffin HPS task resulted in " + interfaceC36079e, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    public C37964a(C39228j puffinManager, InterfaceC16183e firmwareUpdateApi, C14103a hpsSubmitter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(puffinManager, "puffinManager");
        AbstractC22676k.m65750j(firmwareUpdateApi, "firmwareUpdateApi");
        AbstractC22676k.m65750j(hpsSubmitter, "hpsSubmitter");
        AbstractC22676k.m65750j(logger, "logger");
        this.puffinManager = puffinManager;
        this.firmwareUpdateApi = firmwareUpdateApi;
        this.hpsSubmitter = hpsSubmitter;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    public final void m121589d(InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        C13052j1 c13052j1 = new C13052j1(this.puffinManager.m124994e(), new c(null), 0);
        AbstractC13091v.m36582H(new C13052j1(new b(new a(AbstractC13091v.m36579E(AbstractC13095w0.f45249a, new d(null), c13052j1)), this), new e(null), 0), scope);
    }

    public /* synthetic */ C37964a(C39228j c39228j, InterfaceC16183e interfaceC16183e, C14103a c14103a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39228j, interfaceC16183e, c14103a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BatteryPackHpsMonitor") : interfaceC34116n);
    }
}
