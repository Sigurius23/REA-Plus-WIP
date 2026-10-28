package kx0;

import au0.InterfaceC2050a;
import com.whoop.data.local.room.dao.persistent.RawDataDao;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fu0.InterfaceC14776a;
import fu0.InterfaceC14779d;
import hu1.InterfaceC17647d;
import l83.C23454a0;
import mu0.InterfaceC25949a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import yh2.EnumC39542a;
import yh2.InterfaceC39545d;
import yt0.InterfaceC39765d;

/* JADX INFO: renamed from: kx0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lkx0/f;", "Lyh2/d;", "Lmu0/a;", "metricsDataDao", "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;", "rawDataDao", "Lau0/a;", "strapFirmwareEventsDao", "Lfu0/d;", "rev2RawDataDao", "Lfu0/a;", "rev2DataSettingsDao", "Lhu1/d;", "labradorPacketsDao", "Lyt0/d;", "newConsolePacketsDao", "<init>", "(Lmu0/a;Lcom/whoop/data/local/room/dao/persistent/RawDataDao;Lau0/a;Lfu0/d;Lfu0/a;Lhu1/d;Lyt0/d;)V", "Lyh2/a;", "type", "Lec3/l;", "", "a", "(Lyh2/a;)Lec3/l;", "Lmu0/a;", "b", "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;", "c", "Lau0/a;", "d", "Lfu0/d;", "e", "Lfu0/a;", "f", "Lhu1/d;", "g", "Lyt0/d;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22879f implements InterfaceC39545d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25949a metricsDataDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final RawDataDao rawDataDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2050a strapFirmwareEventsDao;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14779d rev2RawDataDao;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC14776a rev2DataSettingsDao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC17647d labradorPacketsDao;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC39765d newConsolePacketsDao;

    /* JADX INFO: renamed from: kx0.f$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90255a;

        static {
            int[] iArr = new int[EnumC39542a.values().length];
            try {
                iArr[EnumC39542a.Metrics.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC39542a.Raw.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC39542a.Rev2Raw.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC39542a.DataSettings.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC39542a.Console.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC39542a.Events.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC39542a.Ecg.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f90255a = iArr;
        }
    }

    /* JADX INFO: renamed from: kx0.f$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90256w;

        /* JADX INFO: renamed from: kx0.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90257w;

            /* JADX INFO: renamed from: kx0.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.WatermarkDatabaseProviderImpl$observeLatestWatermark$$inlined$map$1$2", m100430f = "WatermarkDatabaseProviderImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41932a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f90258E;

                /* JADX INFO: renamed from: F */
                Object f90259F;

                /* JADX INFO: renamed from: G */
                Object f90260G;

                /* JADX INFO: renamed from: H */
                int f90261H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90262w;

                /* JADX INFO: renamed from: x */
                int f90263x;

                /* JADX INFO: renamed from: y */
                Object f90264y;

                public C41932a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90262w = obj;
                    this.f90263x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90257w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41932a c41932a;
                if (interfaceC30057d instanceof C41932a) {
                    c41932a = (C41932a) interfaceC30057d;
                    int i13 = c41932a.f90263x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41932a.f90263x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41932a = new C41932a(interfaceC30057d);
                    }
                } else {
                    c41932a = new C41932a(interfaceC30057d);
                }
                Object obj2 = c41932a.f90262w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41932a.f90263x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90257w;
                    Long l7 = (Long) obj;
                    Long l12 = new Long(l7 != null ? l7.longValue() : 0L);
                    c41932a.f90264y = null;
                    c41932a.f90258E = null;
                    c41932a.f90259F = null;
                    c41932a.f90260G = null;
                    c41932a.f90261H = 0;
                    c41932a.f90263x = 1;
                    if (interfaceC13062m.emit(l12, c41932a) == enumC31071a) {
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
            this.f90256w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90256w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.f$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90266w;

        /* JADX INFO: renamed from: kx0.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90267w;

            /* JADX INFO: renamed from: kx0.f$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.WatermarkDatabaseProviderImpl$observeLatestWatermark$$inlined$map$2$2", m100430f = "WatermarkDatabaseProviderImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41933a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f90268E;

                /* JADX INFO: renamed from: F */
                Object f90269F;

                /* JADX INFO: renamed from: G */
                Object f90270G;

                /* JADX INFO: renamed from: H */
                int f90271H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90272w;

                /* JADX INFO: renamed from: x */
                int f90273x;

                /* JADX INFO: renamed from: y */
                Object f90274y;

                public C41933a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90272w = obj;
                    this.f90273x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90267w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41933a c41933a;
                if (interfaceC30057d instanceof C41933a) {
                    c41933a = (C41933a) interfaceC30057d;
                    int i13 = c41933a.f90273x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41933a.f90273x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41933a = new C41933a(interfaceC30057d);
                    }
                } else {
                    c41933a = new C41933a(interfaceC30057d);
                }
                Object obj2 = c41933a.f90272w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41933a.f90273x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90267w;
                    Long l7 = (Long) obj;
                    Long l12 = new Long(l7 != null ? l7.longValue() : 0L);
                    c41933a.f90274y = null;
                    c41933a.f90268E = null;
                    c41933a.f90269F = null;
                    c41933a.f90270G = null;
                    c41933a.f90271H = 0;
                    c41933a.f90273x = 1;
                    if (interfaceC13062m.emit(l12, c41933a) == enumC31071a) {
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
            this.f90266w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90266w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.f$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90276w;

        /* JADX INFO: renamed from: kx0.f$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90277w;

            /* JADX INFO: renamed from: kx0.f$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.WatermarkDatabaseProviderImpl$observeLatestWatermark$$inlined$map$3$2", m100430f = "WatermarkDatabaseProviderImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41934a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f90278E;

                /* JADX INFO: renamed from: F */
                Object f90279F;

                /* JADX INFO: renamed from: G */
                Object f90280G;

                /* JADX INFO: renamed from: H */
                int f90281H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90282w;

                /* JADX INFO: renamed from: x */
                int f90283x;

                /* JADX INFO: renamed from: y */
                Object f90284y;

                public C41934a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90282w = obj;
                    this.f90283x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90277w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41934a c41934a;
                if (interfaceC30057d instanceof C41934a) {
                    c41934a = (C41934a) interfaceC30057d;
                    int i13 = c41934a.f90283x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41934a.f90283x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41934a = new C41934a(interfaceC30057d);
                    }
                } else {
                    c41934a = new C41934a(interfaceC30057d);
                }
                Object obj2 = c41934a.f90282w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41934a.f90283x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90277w;
                    Long l7 = (Long) obj;
                    Long l12 = new Long(l7 != null ? l7.longValue() : 0L);
                    c41934a.f90284y = null;
                    c41934a.f90278E = null;
                    c41934a.f90279F = null;
                    c41934a.f90280G = null;
                    c41934a.f90281H = 0;
                    c41934a.f90283x = 1;
                    if (interfaceC13062m.emit(l12, c41934a) == enumC31071a) {
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
            this.f90276w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90276w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.f$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90286w;

        /* JADX INFO: renamed from: kx0.f$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90287w;

            /* JADX INFO: renamed from: kx0.f$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.WatermarkDatabaseProviderImpl$observeLatestWatermark$$inlined$map$4$2", m100430f = "WatermarkDatabaseProviderImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41935a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f90288E;

                /* JADX INFO: renamed from: F */
                Object f90289F;

                /* JADX INFO: renamed from: G */
                Object f90290G;

                /* JADX INFO: renamed from: H */
                int f90291H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90292w;

                /* JADX INFO: renamed from: x */
                int f90293x;

                /* JADX INFO: renamed from: y */
                Object f90294y;

                public C41935a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90292w = obj;
                    this.f90293x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90287w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41935a c41935a;
                if (interfaceC30057d instanceof C41935a) {
                    c41935a = (C41935a) interfaceC30057d;
                    int i13 = c41935a.f90293x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41935a.f90293x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41935a = new C41935a(interfaceC30057d);
                    }
                } else {
                    c41935a = new C41935a(interfaceC30057d);
                }
                Object obj2 = c41935a.f90292w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41935a.f90293x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90287w;
                    Long l7 = (Long) obj;
                    Long l12 = new Long(l7 != null ? l7.longValue() : 0L);
                    c41935a.f90294y = null;
                    c41935a.f90288E = null;
                    c41935a.f90289F = null;
                    c41935a.f90290G = null;
                    c41935a.f90291H = 0;
                    c41935a.f90293x = 1;
                    if (interfaceC13062m.emit(l12, c41935a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f90286w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90286w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.f$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90296w;

        /* JADX INFO: renamed from: kx0.f$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90297w;

            /* JADX INFO: renamed from: kx0.f$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.WatermarkDatabaseProviderImpl$observeLatestWatermark$$inlined$map$5$2", m100430f = "WatermarkDatabaseProviderImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41936a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f90298E;

                /* JADX INFO: renamed from: F */
                Object f90299F;

                /* JADX INFO: renamed from: G */
                Object f90300G;

                /* JADX INFO: renamed from: H */
                int f90301H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90302w;

                /* JADX INFO: renamed from: x */
                int f90303x;

                /* JADX INFO: renamed from: y */
                Object f90304y;

                public C41936a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90302w = obj;
                    this.f90303x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90297w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41936a c41936a;
                if (interfaceC30057d instanceof C41936a) {
                    c41936a = (C41936a) interfaceC30057d;
                    int i13 = c41936a.f90303x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41936a.f90303x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41936a = new C41936a(interfaceC30057d);
                    }
                } else {
                    c41936a = new C41936a(interfaceC30057d);
                }
                Object obj2 = c41936a.f90302w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41936a.f90303x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90297w;
                    Long l7 = (Long) obj;
                    Long l12 = new Long(l7 != null ? l7.longValue() : 0L);
                    c41936a.f90304y = null;
                    c41936a.f90298E = null;
                    c41936a.f90299F = null;
                    c41936a.f90300G = null;
                    c41936a.f90301H = 0;
                    c41936a.f90303x = 1;
                    if (interfaceC13062m.emit(l12, c41936a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f90296w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90296w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.f$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90306w;

        /* JADX INFO: renamed from: kx0.f$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90307w;

            /* JADX INFO: renamed from: kx0.f$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.WatermarkDatabaseProviderImpl$observeLatestWatermark$$inlined$map$6$2", m100430f = "WatermarkDatabaseProviderImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41937a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f90308E;

                /* JADX INFO: renamed from: F */
                Object f90309F;

                /* JADX INFO: renamed from: G */
                Object f90310G;

                /* JADX INFO: renamed from: H */
                int f90311H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90312w;

                /* JADX INFO: renamed from: x */
                int f90313x;

                /* JADX INFO: renamed from: y */
                Object f90314y;

                public C41937a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90312w = obj;
                    this.f90313x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90307w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41937a c41937a;
                if (interfaceC30057d instanceof C41937a) {
                    c41937a = (C41937a) interfaceC30057d;
                    int i13 = c41937a.f90313x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41937a.f90313x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41937a = new C41937a(interfaceC30057d);
                    }
                } else {
                    c41937a = new C41937a(interfaceC30057d);
                }
                Object obj2 = c41937a.f90312w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41937a.f90313x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90307w;
                    Long l7 = (Long) obj;
                    Long l12 = new Long((l7 != null ? l7.longValue() : 0L) * 1000);
                    c41937a.f90314y = null;
                    c41937a.f90308E = null;
                    c41937a.f90309F = null;
                    c41937a.f90310G = null;
                    c41937a.f90311H = 0;
                    c41937a.f90313x = 1;
                    if (interfaceC13062m.emit(l12, c41937a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f90306w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90306w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.f$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90316w;

        /* JADX INFO: renamed from: kx0.f$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90317w;

            /* JADX INFO: renamed from: kx0.f$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.WatermarkDatabaseProviderImpl$observeLatestWatermark$$inlined$map$7$2", m100430f = "WatermarkDatabaseProviderImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41938a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f90318E;

                /* JADX INFO: renamed from: F */
                Object f90319F;

                /* JADX INFO: renamed from: G */
                Object f90320G;

                /* JADX INFO: renamed from: H */
                int f90321H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90322w;

                /* JADX INFO: renamed from: x */
                int f90323x;

                /* JADX INFO: renamed from: y */
                Object f90324y;

                public C41938a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90322w = obj;
                    this.f90323x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90317w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41938a c41938a;
                if (interfaceC30057d instanceof C41938a) {
                    c41938a = (C41938a) interfaceC30057d;
                    int i13 = c41938a.f90323x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41938a.f90323x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41938a = new C41938a(interfaceC30057d);
                    }
                } else {
                    c41938a = new C41938a(interfaceC30057d);
                }
                Object obj2 = c41938a.f90322w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41938a.f90323x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90317w;
                    Long l7 = (Long) obj;
                    Long l12 = new Long(l7 != null ? l7.longValue() : 0L);
                    c41938a.f90324y = null;
                    c41938a.f90318E = null;
                    c41938a.f90319F = null;
                    c41938a.f90320G = null;
                    c41938a.f90321H = 0;
                    c41938a.f90323x = 1;
                    if (interfaceC13062m.emit(l12, c41938a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l) {
            this.f90316w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90316w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C22879f(InterfaceC25949a metricsDataDao, RawDataDao rawDataDao, InterfaceC2050a strapFirmwareEventsDao, InterfaceC14779d rev2RawDataDao, InterfaceC14776a rev2DataSettingsDao, InterfaceC17647d labradorPacketsDao, InterfaceC39765d newConsolePacketsDao) {
        AbstractC22676k.m65750j(metricsDataDao, "metricsDataDao");
        AbstractC22676k.m65750j(rawDataDao, "rawDataDao");
        AbstractC22676k.m65750j(strapFirmwareEventsDao, "strapFirmwareEventsDao");
        AbstractC22676k.m65750j(rev2RawDataDao, "rev2RawDataDao");
        AbstractC22676k.m65750j(rev2DataSettingsDao, "rev2DataSettingsDao");
        AbstractC22676k.m65750j(labradorPacketsDao, "labradorPacketsDao");
        AbstractC22676k.m65750j(newConsolePacketsDao, "newConsolePacketsDao");
        this.metricsDataDao = metricsDataDao;
        this.rawDataDao = rawDataDao;
        this.strapFirmwareEventsDao = strapFirmwareEventsDao;
        this.rev2RawDataDao = rev2RawDataDao;
        this.rev2DataSettingsDao = rev2DataSettingsDao;
        this.labradorPacketsDao = labradorPacketsDao;
        this.newConsolePacketsDao = newConsolePacketsDao;
    }

    @Override // yh2.InterfaceC39545d
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo66479a(EnumC39542a type) {
        AbstractC22676k.m65750j(type, "type");
        switch (a.f90255a[type.ordinal()]) {
            case 1:
                return new b(this.metricsDataDao.observeNewestTimestamp());
            case 2:
                return new c(this.rawDataDao.observeNewestTimestamp());
            case 3:
                return new d(this.rev2RawDataDao.observeNewestTimestamp());
            case 4:
                return new e(this.rev2DataSettingsDao.observeNewestTimestamp());
            case 5:
                return new f(this.newConsolePacketsDao.observeNewestTimestamp());
            case 6:
                return new g(this.strapFirmwareEventsDao.observeNewestTimestamp());
            case 7:
                return new h(this.labradorPacketsDao.observeNewestTimestamp());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
