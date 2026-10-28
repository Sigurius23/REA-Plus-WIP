package w92;

import android.database.sqlite.SQLiteException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao;
import com.whoop.data.local.room.entity.connectivity.CachedMetricsDataDto;
import hk0.EnumC17381p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.AbstractC25267u;
import mu0.InterfaceC25949a;
import nu0.C27136a;
import or2.AbstractC28209v1;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import zr2.AbstractC41071b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: w92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u000eJ(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u001c\u0010\u000eJ8\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\fH\u0086@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lw92/b;", "", "Lmu0/a;", "metricsDataDao", "Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;", "cachedStrapDataDao", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lmu0/a;Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Lzr2/a;)V", "", "packetRevision", "", "e", "(ILq83/d;)Ljava/lang/Object;", "", "Lnu0/a;", "metricsDataDtoList", "Ll83/a0;", "i", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "g", "()I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "versionId", "k", "(IILq83/d;)Ljava/lang/Object;", "seconds", "j", "numRecords", "oldestTimeStamp", "newestTimeStamp", "f", "(JJJIJLq83/d;)Ljava/lang/Object;", "a", "Lmu0/a;", "b", "Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;", "c", "Lzr2/a;", "Ltr2/n;", "d", "Ltr2/n;", "logger", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36967b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25949a metricsDataDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CachedMetricsDataDao cachedStrapDataDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: w92.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataTableRoom", m100430f = "HeartDataTableRoom.kt", m100431l = {53}, m100432m = "count", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f158194w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f158195x;

        /* JADX INFO: renamed from: z */
        int f158197z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f158195x = obj;
            this.f158197z |= Integer.MIN_VALUE;
            return C36967b.this.m118684e(0, this);
        }
    }

    /* JADX INFO: renamed from: w92.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataTableRoom", m100430f = "HeartDataTableRoom.kt", m100431l = {195, 197, 198}, m100432m = "deleteDataByTimeStampsAndVersionId", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f158198E;

        /* JADX INFO: renamed from: F */
        int f158199F;

        /* JADX INFO: renamed from: G */
        Object f158200G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f158201H;

        /* JADX INFO: renamed from: J */
        int f158203J;

        /* JADX INFO: renamed from: w */
        long f158204w;

        /* JADX INFO: renamed from: x */
        long f158205x;

        /* JADX INFO: renamed from: y */
        long f158206y;

        /* JADX INFO: renamed from: z */
        long f158207z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f158201H = obj;
            this.f158203J |= Integer.MIN_VALUE;
            return C36967b.this.m118685f(0L, 0L, 0L, 0, 0L, this);
        }
    }

    /* JADX INFO: renamed from: w92.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataTableRoom$getOldestPacketRevisionType$1", m100430f = "HeartDataTableRoom.kt", m100431l = {91}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)I"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f158208w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36967b.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Integer> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f158208w;
            int iIntValue = -1;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC25949a interfaceC25949a = C36967b.this.metricsDataDao;
                    this.f158208w = 1;
                    obj = interfaceC25949a.getOldestPacketRevision(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    iIntValue = num.intValue();
                }
            } catch (Exception e5) {
                C36967b.this.logger.mo85230v("Caught an exception when trying to get oldest packet revision type from metrics db Room", e5, new AbstractC30556a.a[0]);
            }
            return new Integer(iIntValue);
        }
    }

    /* JADX INFO: renamed from: w92.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataTableRoom$getOldestVersionIdByPacketRevision$2", m100430f = "HeartDataTableRoom.kt", m100431l = {121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)I"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f158210w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f158212y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f158212y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36967b.this.new d(this.f158212y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Integer> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f158210w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC25949a interfaceC25949a = C36967b.this.metricsDataDao;
                    int i14 = this.f158212y;
                    this.f158210w = 1;
                    obj = interfaceC25949a.mo76797h(i14, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return (Integer) obj;
            } catch (Exception e5) {
                C36967b.this.logger.mo85230v(AbstractC2875y.m8295h(this.f158212y, "Caught an exception when trying to get oldest version ID for packet revision "), e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: w92.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataTableRoom", m100430f = "HeartDataTableRoom.kt", m100431l = {62, 63}, m100432m = "insertAll", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f158213w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f158214x;

        /* JADX INFO: renamed from: z */
        int f158216z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f158214x = obj;
            this.f158216z |= Integer.MIN_VALUE;
            return C36967b.this.m118688i(null, this);
        }
    }

    /* JADX INFO: renamed from: w92.b$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataTableRoom$queryCachedRoomDbForData$2", m100430f = "HeartDataTableRoom.kt", m100431l = {158}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lnu0/a;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f158217E;

        /* JADX INFO: renamed from: w */
        long f158218w;

        /* JADX INFO: renamed from: x */
        long f158219x;

        /* JADX INFO: renamed from: y */
        int f158220y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i13, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f158217E = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36967b.this.new f(this.f158217E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<C27136a>> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object packetRevisionThenHeartDataByTimeRanges;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f158220y;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    long millis = AbstractC41071b.m133370c(C36967b.this.dateAndTimeProvider, null, null, null, 7, null).minusSeconds(this.f158217E).getMillis();
                    long millis2 = AbstractC41071b.m133370c(C36967b.this.dateAndTimeProvider, null, null, null, 7, null).getMillis();
                    CachedMetricsDataDao cachedMetricsDataDao = C36967b.this.cachedStrapDataDao;
                    this.f158218w = millis;
                    this.f158219x = millis2;
                    this.f158220y = 1;
                    packetRevisionThenHeartDataByTimeRanges = cachedMetricsDataDao.getPacketRevisionThenHeartDataByTimeRanges(millis, millis2, this);
                    if (packetRevisionThenHeartDataByTimeRanges == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    packetRevisionThenHeartDataByTimeRanges = obj;
                }
                Iterable<CachedMetricsDataDto> iterable = (Iterable) packetRevisionThenHeartDataByTimeRanges;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                for (CachedMetricsDataDto cachedMetricsDataDto : iterable) {
                    arrayList.add(new C27136a(cachedMetricsDataDto.getPacketRevision(), cachedMetricsDataDto.getTimestamp(), cachedMetricsDataDto.getPacketData(), cachedMetricsDataDto.getVersionId(), cachedMetricsDataDto.getPacketRevision() == EnumC17381p.PROCESSED_RESULTS.getValue() ? 2 : 1));
                }
                return arrayList;
            } catch (SQLiteException e5) {
                C36967b.this.logger.mo85230v("Caught a SQLiteException when trying to fetch metrics data from Room", e5, new AbstractC30556a.a[0]);
                return null;
            } catch (Exception e13) {
                C36967b.this.logger.mo85230v("Caught an exception when trying to fetch metrics data from Room", e13, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: w92.b$g */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataTableRoom$queryRoomDbForOldestDataByVersion$2", m100430f = "HeartDataTableRoom.kt", m100431l = {135}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lnu0/a;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f158222w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f158224y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f158225z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i13, int i14, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f158224y = i13;
            this.f158225z = i14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36967b.this.new g(this.f158224y, this.f158225z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<C27136a>> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f158222w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC25949a interfaceC25949a = C36967b.this.metricsDataDao;
                    int i14 = this.f158224y;
                    int i15 = this.f158225z;
                    this.f158222w = 1;
                    obj = interfaceC25949a.mo76799j(i14, i15, 39321, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return (List) obj;
            } catch (SQLiteException e5) {
                C36967b.this.logger.mo85230v(AbstractC25012a.m73372e(this.f158224y, this.f158225z, "Caught a SQLiteException when trying to fetch metrics data (R", " packets with version ", ") from Room"), e5, new AbstractC30556a.a[0]);
                return null;
            } catch (Exception e13) {
                C36967b.this.logger.mo85230v(AbstractC25012a.m73372e(this.f158224y, this.f158225z, "Caught an exception when trying to fetch metrics data (R", " packets with version ", ") from Room"), e13, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    public C36967b(InterfaceC25949a metricsDataDao, CachedMetricsDataDao cachedStrapDataDao, InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(metricsDataDao, "metricsDataDao");
        AbstractC22676k.m65750j(cachedStrapDataDao, "cachedStrapDataDao");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.metricsDataDao = metricsDataDao;
        this.cachedStrapDataDao = cachedStrapDataDao;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("HeartDataTableRoom");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m118684e(int i13, InterfaceC30057d<? super Long> interfaceC30057d) {
        a aVar;
        long jIntValue;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f158197z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f158197z = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo76795f = aVar.f158195x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar.f158197z;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objMo76795f);
                InterfaceC25949a interfaceC25949a = this.metricsDataDao;
                aVar.f158194w = i13;
                aVar.f158197z = 1;
                objMo76795f = interfaceC25949a.mo76795f(i13, aVar);
                if (objMo76795f == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo76795f);
            }
            jIntValue = ((Number) objMo76795f).intValue();
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Caught an exception when trying to count packets in metrics database", e5, new AbstractC30556a.a[0]);
            jIntValue = 0;
        }
        return new Long(jIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0127  */
    /* JADX WARN: Code duplicated, block: B:42:0x0133 A[Catch: Exception -> 0x003e, NullPointerException -> 0x016e, TryCatch #0 {NullPointerException -> 0x016e, blocks: (B:40:0x012e, B:42:0x0133, B:45:0x013f, B:46:0x0147), top: B:52:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x013c  */
    /* JADX WARN: Code duplicated, block: B:45:0x013f A[Catch: Exception -> 0x003e, NullPointerException -> 0x016e, TryCatch #0 {NullPointerException -> 0x016e, blocks: (B:40:0x012e, B:42:0x0133, B:45:0x013f, B:46:0x0147), top: B:52:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: f */
    public final Object m118685f(long j7, long j13, long j14, int i13, long j15, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        EnumC31071a enumC31071a;
        b bVar2;
        long j16;
        long j17;
        long j18;
        Object obj;
        long j19;
        int i14;
        EnumC31071a enumC31071a2;
        long j24;
        long j25;
        int i15;
        int i16;
        long j26;
        long j27;
        Long l7;
        Object objMo76800k;
        Long l12;
        Long l13;
        String strM85388b;
        String str = "Current metrics timestamps in Room DB = ";
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i17 = bVar.f158203J;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                bVar.f158203J = i17 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objMo76796g = bVar.f158201H;
        EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
        int i18 = bVar.f158203J;
        try {
            if (i18 != 0) {
                if (i18 == 1) {
                    long j28 = bVar.f158207z;
                    int i19 = bVar.f158198E;
                    j17 = bVar.f158206y;
                    j16 = bVar.f158205x;
                    long j29 = bVar.f158204w;
                    AbstractC34132o.m107864I(objMo76796g);
                    j18 = j28;
                    j19 = j29;
                    obj = objMo76796g;
                    bVar2 = bVar;
                    enumC31071a = enumC31071a3;
                    i14 = i19;
                } else if (i18 == 2) {
                    i16 = bVar.f158199F;
                    long j34 = bVar.f158207z;
                    i15 = bVar.f158198E;
                    long j35 = bVar.f158206y;
                    j25 = bVar.f158205x;
                    j27 = bVar.f158204w;
                    AbstractC34132o.m107864I(objMo76796g);
                    bVar2 = bVar;
                    j24 = j34;
                    j26 = j35;
                    enumC31071a2 = enumC31071a3;
                    l7 = (Long) objMo76796g;
                    InterfaceC25949a interfaceC25949a = this.metricsDataDao;
                    bVar2.f158200G = l7;
                    bVar2.f158204w = j27;
                    bVar2.f158205x = j25;
                    bVar2.f158206y = j26;
                    bVar2.f158198E = i15;
                    bVar2.f158207z = j24;
                    bVar2.f158199F = i16;
                    bVar2.f158203J = 3;
                    objMo76800k = interfaceC25949a.mo76800k(i15, bVar2);
                    if (objMo76800k == enumC31071a2) {
                        return enumC31071a2;
                    }
                    l12 = l7;
                    objMo76796g = objMo76800k;
                } else {
                    if (i18 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l12 = (Long) bVar.f158200G;
                    AbstractC34132o.m107864I(objMo76796g);
                    str = "Current metrics timestamps in Room DB = ";
                }
                l13 = (Long) objMo76796g;
                try {
                    InterfaceC34116n interfaceC34116n = this.logger;
                    if (l13 != null) {
                        strM85388b = AbstractC28209v1.m85388b(l13.longValue());
                    } else {
                        strM85388b = null;
                    }
                    interfaceC34116n.mo85216g(str + strM85388b + " - " + (l12 != null ? AbstractC28209v1.m85388b(l12.longValue()) : null), new AbstractC30556a.a[0]);
                } catch (NullPointerException unused) {
                }
                return C23454a0.f92919a;
            }
            AbstractC34132o.m107864I(objMo76796g);
            enumC31071a = enumC31071a3;
            bVar.f158204w = j7;
            bVar.f158205x = j13;
            bVar.f158206y = j14;
            bVar.f158198E = i13;
            bVar.f158207z = j15;
            bVar.f158203J = 1;
            b bVar3 = bVar;
            Object objMo76793b = this.metricsDataDao.mo76793b(j7, i13, j13, j14, (int) j15, bVar3);
            bVar2 = bVar3;
            if (objMo76793b == enumC31071a) {
                return enumC31071a;
            }
            j16 = j13;
            j17 = j14;
            j18 = j15;
            obj = objMo76793b;
            j19 = j7;
            i14 = i13;
            int iIntValue = ((Number) obj).intValue();
            EnumC31071a enumC31071a4 = enumC31071a;
            this.logger.mo85216g("Deleted " + iIntValue + " of R" + i14 + " data from Room db", new AbstractC30556a.a[0]);
            InterfaceC25949a interfaceC25949a2 = this.metricsDataDao;
            bVar2.f158204w = j19;
            bVar2.f158205x = j16;
            bVar2.f158206y = j17;
            bVar2.f158198E = i14;
            bVar2.f158207z = j18;
            bVar2.f158199F = iIntValue;
            bVar2.f158203J = 2;
            objMo76796g = interfaceC25949a2.mo76796g(i14, bVar2);
            enumC31071a2 = enumC31071a4;
            if (objMo76796g == enumC31071a2) {
                return enumC31071a2;
            }
            j24 = j18;
            j25 = j16;
            long j36 = j19;
            i15 = i14;
            i16 = iIntValue;
            j26 = j17;
            j27 = j36;
            l7 = (Long) objMo76796g;
            InterfaceC25949a interfaceC25949a3 = this.metricsDataDao;
            bVar2.f158200G = l7;
            bVar2.f158204w = j27;
            bVar2.f158205x = j25;
            bVar2.f158206y = j26;
            bVar2.f158198E = i15;
            bVar2.f158207z = j24;
            bVar2.f158199F = i16;
            bVar2.f158203J = 3;
            objMo76800k = interfaceC25949a3.mo76800k(i15, bVar2);
            if (objMo76800k == enumC31071a2) {
                return enumC31071a2;
            }
            l12 = l7;
            objMo76796g = objMo76800k;
            l13 = (Long) objMo76796g;
            InterfaceC34116n interfaceC34116n2 = this.logger;
            if (l13 != null) {
                strM85388b = AbstractC28209v1.m85388b(l13.longValue());
            } else {
                strM85388b = null;
            }
            if (l12 != null) {
            }
            interfaceC34116n2.mo85216g(str + strM85388b + " - " + (l12 != null ? AbstractC28209v1.m85388b(l12.longValue()) : null), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        } catch (Exception e5) {
            this.logger.mo85230v("Exception when trying to delete metrics data with time range", e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m118686g() {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return ((Number) AbstractC3006f0.m8699E(ExecutorC22364d.f87316w, new c(null))).intValue();
    }

    /* JADX INFO: renamed from: h */
    public final Object m118687h(int i13, InterfaceC30057d<? super Integer> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new d(i13, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (r0.insertAllThenDeleteOldHeartDataByTimeStamp(r2, r5, r14) == r1) goto L35;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m118688i(java.util.List<nu0.C27136a> r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w92.C36967b.m118688i(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    public final Object m118689j(int i13, InterfaceC30057d<? super List<C27136a>> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new f(i13, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: k */
    public final Object m118690k(int i13, int i14, InterfaceC30057d<? super List<C27136a>> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new g(i13, i14, null), interfaceC30057d);
    }
}
