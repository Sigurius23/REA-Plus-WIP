package com.whoop.straphistorysync.sync;

import androidx.core.app.NotificationCompat;
import bi2.C3295k;
import bi2.C3296l;
import bi2.EnumC3285a;
import bi2.InterfaceC3292h;
import c93.InterfaceC4351m;
import ca2.InterfaceC4368h;
import com.whoop.domain.model.WhoopStrapInfo;
import dk0.InterfaceC12101a;
import dk0.InterfaceC12103c;
import dk0.InterfaceC12105e;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fk2.C14554a;
import hk0.AbstractC17369d;
import hk0.EnumC17381p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23454a0;
import lt0.AbstractC24734k;
import lt0.C24725b;
import lt0.C24736m;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
import m83.AbstractC25247g0;
import nt0.AbstractC27120h;
import oh2.C27938a;
import ot0.InterfaceC28324b;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import wh2.C37300a;
import xj0.AbstractC38379r;
import xj0.C38377q;
import ze1.AbstractC40586b;
import zh2.C40644a;
import zh2.C40645b;
import zh2.C40646c;
import zh2.InterfaceC40647d;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 42\u00020\u0001:\u0001DB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J1\u0010*\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u0002072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00106\u001a\u00020#H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020%2\u0006\u0010;\u001a\u00020:2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020%2\u0006\u0010;\u001a\u00020:2\u0006\u0010/\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J#\u0010D\u001a\b\u0012\u0004\u0012\u00020C0A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100AH\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010L¨\u0006M"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/j;", "Lbi2/h;", "Lzh2/d;", "packetSink", "Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "Lwh2/a;", "analytics", "Lca2/h;", "rawDataTrackingService", "Ltr2/n;", "logger", "<init>", "(Lzh2/d;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;Lca2/h;Ltr2/n;)V", "Lcom/whoop/straphistorysync/sync/b;", "state", "Llt0/k;", "parsedPacket", "l", "(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lq83/d;)Ljava/lang/Object;", "Ldk0/e;", "packet", "j", "(Lcom/whoop/straphistorysync/sync/b;Ldk0/e;)Lcom/whoop/straphistorysync/sync/b;", "Ldk0/c;", "i", "(Lcom/whoop/straphistorysync/sync/b;Ldk0/c;Lq83/d;)Ljava/lang/Object;", "", "isSuccess", "", "burstDurationMs", "expectedCount", "actualCount", "", "consecutiveFailures", "Lzh2/b;", "sequenceInfo", "Ll83/a0;", "d", "(ZJLjava/lang/Long;JILzh2/b;)V", "Loh2/a;", "metadata", "g", "(Lcom/whoop/straphistorysync/sync/b;Loh2/a;Ljava/lang/Long;J)Lcom/whoop/straphistorysync/sync/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/straphistorysync/sync/b;)Lcom/whoop/straphistorysync/sync/b;", "Llt0/f;", "dataPacket", "e", "(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Llt0/f;)Lcom/whoop/straphistorysync/sync/b;", "Lot0/b;", "eventPacket", "f", "(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lot0/b;)Lcom/whoop/straphistorysync/sync/b;", "burstInfo", "Lbi2/k;", "k", "(Lcom/whoop/straphistorysync/sync/b;Lzh2/b;)Lbi2/k;", "Llt0/m;", "receivedPacket", "m", "(Llt0/m;Llt0/f;)V", "Llt0/b;", "n", "(Llt0/m;Llt0/b;)V", "Lec3/l;", "upstream", "Lcom/whoop/straphistorysync/sync/f;", "a", "(Lec3/l;)Lec3/l;", "Lzh2/d;", "b", "Lcom/whoop/domain/model/WhoopStrapInfo;", "c", "Lwh2/a;", "Lca2/h;", "Ltr2/n;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10282j implements InterfaceC3292h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40647d packetSink;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WhoopStrapInfo strapInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C37300a analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4368h rawDataTrackingService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.j$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31200a;

        static {
            int[] iArr = new int[EnumC17381p.values().length];
            try {
                iArr[EnumC17381p.RAW_DATA_STREAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17381p.PROCESSED_RESULTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31200a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.j$c */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncProcessorImpl", m100430f = "SensorSyncProcessor.kt", m100431l = {152}, m100432m = "handleHistoryEnd", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f31201E;

        /* JADX INFO: renamed from: F */
        long f31202F;

        /* JADX INFO: renamed from: G */
        long f31203G;

        /* JADX INFO: renamed from: H */
        long f31204H;

        /* JADX INFO: renamed from: I */
        int f31205I;

        /* JADX INFO: renamed from: J */
        int f31206J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f31207K;

        /* JADX INFO: renamed from: M */
        int f31209M;

        /* JADX INFO: renamed from: w */
        Object f31210w;

        /* JADX INFO: renamed from: x */
        Object f31211x;

        /* JADX INFO: renamed from: y */
        Object f31212y;

        /* JADX INFO: renamed from: z */
        Object f31213z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31207K = obj;
            this.f31209M |= Integer.MIN_VALUE;
            return C10282j.this.m26310i(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.j$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f31214w;

        /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.j$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f31215w;

            /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.j$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncProcessorImpl$processPackets$$inlined$map$1$2", m100430f = "SensorSyncProcessor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41423a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f31216E;

                /* JADX INFO: renamed from: F */
                Object f31217F;

                /* JADX INFO: renamed from: G */
                Object f31218G;

                /* JADX INFO: renamed from: H */
                int f31219H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f31220w;

                /* JADX INFO: renamed from: x */
                int f31221x;

                /* JADX INFO: renamed from: y */
                Object f31222y;

                public C41423a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f31220w = obj;
                    this.f31221x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f31215w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41423a c41423a;
                if (interfaceC30057d instanceof C41423a) {
                    c41423a = (C41423a) interfaceC30057d;
                    int i13 = c41423a.f31221x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41423a.f31221x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41423a = new C41423a(interfaceC30057d);
                    }
                } else {
                    c41423a = new C41423a(interfaceC30057d);
                }
                Object obj2 = c41423a.f31220w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41423a.f31221x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f31215w;
                    InterfaceC10278f emittedState = ((C10274b) obj).getEmittedState();
                    c41423a.f31222y = null;
                    c41423a.f31216E = null;
                    c41423a.f31217F = null;
                    c41423a.f31218G = null;
                    c41423a.f31219H = 0;
                    c41423a.f31221x = 1;
                    if (interfaceC13062m.emit(emittedState, c41423a) == enumC31071a) {
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
            this.f31214w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f31214w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.j$e */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncProcessorImpl$processPackets$1", m100430f = "SensorSyncProcessor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Llt0/k;", "it", "", "<anonymous>", "(Llt0/k;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31224w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f31225x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f31225x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC24734k abstractC24734k, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((e) create(abstractC24734k, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC24734k abstractC24734k = (AbstractC24734k) this.f31225x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f31224w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(!(abstractC24734k.getPacket() instanceof InterfaceC12105e));
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.j$f */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorSyncProcessorImpl$processPackets$2", m100430f = "SensorSyncProcessor.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/b;", "acc", "Llt0/k;", "parsedPacket", "<anonymous>", "(Lcom/whoop/straphistorysync/sync/b;Llt0/k;)Lcom/whoop/straphistorysync/sync/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f31226w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f31227x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f31228y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C10274b c10274b, AbstractC24734k abstractC24734k, InterfaceC30057d<? super C10274b> interfaceC30057d) {
            f fVar = C10282j.this.new f(interfaceC30057d);
            fVar.f31227x = c10274b;
            fVar.f31228y = abstractC24734k;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C10274b c10274b = (C10274b) this.f31227x;
            AbstractC24734k abstractC24734k = (AbstractC24734k) this.f31228y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31226w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C10282j c10282j = C10282j.this;
            this.f31227x = null;
            this.f31228y = null;
            this.f31226w = 1;
            Object objM26313l = c10282j.m26313l(c10274b, abstractC24734k, this);
            return objM26313l == enumC31071a ? enumC31071a : objM26313l;
        }
    }

    public C10282j(InterfaceC40647d packetSink, WhoopStrapInfo strapInfo, C37300a analytics, InterfaceC4368h rawDataTrackingService, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(packetSink, "packetSink");
        AbstractC22676k.m65750j(strapInfo, "strapInfo");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(rawDataTrackingService, "rawDataTrackingService");
        AbstractC22676k.m65750j(logger, "logger");
        this.packetSink = packetSink;
        this.strapInfo = strapInfo;
        this.analytics = analytics;
        this.rawDataTrackingService = rawDataTrackingService;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    private final void m26305d(boolean isSuccess, long burstDurationMs, Long expectedCount, long actualCount, int consecutiveFailures, C40645b sequenceInfo) {
        this.analytics.m119466t(isSuccess, consecutiveFailures);
        this.analytics.m119463q(isSuccess, burstDurationMs);
        if (expectedCount != null) {
            this.analytics.m119465s(isSuccess, expectedCount.longValue(), actualCount);
        }
        this.analytics.m119464r(isSuccess, sequenceInfo);
    }

    /* JADX INFO: renamed from: e */
    private final C10274b m26306e(C10274b state, AbstractC24734k parsedPacket, InterfaceC24729f dataPacket) {
        if (dataPacket instanceof C24725b) {
            C24725b c24725b = (C24725b) dataPacket;
            if (c24725b.m72397Z() != 47) {
                this.logger.mo85226q(AbstractC2875y.m8296i(c24725b.m72397Z(), "Dropping non-historical packet (type=", "); skipping HPS pipeline"), new AbstractC30556a.a[0]);
                return state;
            }
        }
        if (!state.getIsSyncing()) {
            this.logger.mo85226q("Data packet received while not syncing", new AbstractC30556a.a[0]);
            this.analytics.m119468v("data");
            return state.m26247a(new InterfaceC10278f.b.c(state.getSavedPacketCounts(), state.getSuccessfulBurstCount(), state.getSessionGapSummary()));
        }
        C24736m c24736m = parsedPacket instanceof C24736m ? (C24736m) parsedPacket : null;
        if (c24736m == null) {
            return state;
        }
        this.analytics.m119454e(c24736m.getFramedPacket().m76710f().limit());
        m26314m(c24736m, dataPacket);
        this.packetSink.mo131905c(c24736m, dataPacket);
        return state;
    }

    /* JADX INFO: renamed from: f */
    private final C10274b m26307f(C10274b state, AbstractC24734k parsedPacket, InterfaceC28324b eventPacket) {
        if (!state.getIsSyncing()) {
            this.logger.mo85226q("Event packet received while not syncing", new AbstractC30556a.a[0]);
            this.analytics.m119468v(NotificationCompat.CATEGORY_EVENT);
            return state.m26247a(new InterfaceC10278f.b.c(state.getSavedPacketCounts(), state.getSuccessfulBurstCount(), state.getSessionGapSummary()));
        }
        C24736m c24736m = parsedPacket instanceof C24736m ? (C24736m) parsedPacket : null;
        if (c24736m == null) {
            return state;
        }
        this.analytics.m119454e(c24736m.getFramedPacket().m76710f().limit());
        this.packetSink.mo131909g(c24736m, eventPacket);
        return state;
    }

    /* JADX INFO: renamed from: g */
    private final C10274b m26308g(C10274b state, C27938a metadata, Long expectedCount, long actualCount) {
        int consecutiveFailures = state.getConsecutiveFailures() + 1;
        this.logger.mo85226q("Burst validation failed (attempt " + consecutiveFailures + "): expected=" + expectedCount + ", actual=" + actualCount + ", breakdown=" + this.packetSink.mo131906d(), new AbstractC30556a.a[0]);
        this.packetSink.reset();
        if (consecutiveFailures < 15) {
            return C10274b.m26246c(state, new InterfaceC10278f.a(new InterfaceC10275c.a(metadata, AbstractC38379r.m122939c(this.strapInfo.getWhoopDeviceType())), state.getSavedPacketCounts(), state.getSuccessfulBurstCount(), state.getSessionGapSummary()), null, 0, false, null, consecutiveFailures, null, null, 198, null);
        }
        this.logger.mo85222m(AbstractC2875y.m8296i(consecutiveFailures, "Stuck: ", " consecutive burst validation failures"), new AbstractC30556a.a[0]);
        this.analytics.m119450A();
        return state.m26247a(new InterfaceC10278f.b.C41422b(EnumC3285a.Stuck, state.getSavedPacketCounts(), state.getSuccessfulBurstCount(), state.getSessionGapSummary()));
    }

    /* JADX INFO: renamed from: h */
    private final C10274b m26309h(C10274b state) {
        this.logger.mo85216g("HistoryComplete received: successfulBurstCount=" + state.getSuccessfulBurstCount() + ", totalSaved=" + state.getSavedPacketCounts() + ", gaps=" + state.getSessionGapSummary(), new AbstractC30556a.a[0]);
        if (state.getSuccessfulBurstCount() == 0) {
            this.analytics.m119453D();
        }
        return state.m26247a(new InterfaceC10278f.b.d(state.getSavedPacketCounts(), state.getSuccessfulBurstCount(), state.getSessionGapSummary()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: i */
    public final Object m26310i(C10274b c10274b, InterfaceC12103c interfaceC12103c, InterfaceC30057d<? super C10274b> interfaceC30057d) {
        c cVar;
        long j7;
        C10274b c10274b2;
        long j13;
        C27938a c27938a;
        C40645b c40645b;
        Long l7;
        long j14;
        long j15;
        C10274b c10274b3;
        InterfaceC12103c interfaceC12103c2;
        Long l12;
        C40645b c40645b2;
        long j16;
        C38377q c38377qM122940d;
        String str;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f31209M;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f31209M = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f31207K;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f31209M;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!c10274b.getIsSyncing()) {
                this.logger.mo85226q("HistoryEnd received while not syncing, dropping duplicate", new AbstractC30556a.a[0]);
                this.analytics.m119468v("history_end");
                return c10274b;
            }
            long jM119455f = this.analytics.m119455f();
            C40645b c40645bMo131908f = this.packetSink.mo131908f();
            C27938a currentBurstMetadata = c10274b.getCurrentBurstMetadata();
            if (currentBurstMetadata == null) {
                currentBurstMetadata = C27938a.INSTANCE.m84311a().m84313b();
            }
            C27938a c27938a2 = currentBurstMetadata;
            Long lMo33433J = interfaceC12103c.mo33433J();
            long jMo131907e = this.packetSink.mo131907e();
            InterfaceC34116n interfaceC34116n = this.logger;
            C40646c c40646cMo131906d = this.packetSink.mo131906d();
            String strM131618c = AbstractC40586b.m131618c(interfaceC12103c.mo33437z());
            String strM131618c2 = AbstractC40586b.m131618c(interfaceC12103c.mo33435n());
            StringBuilder sb4 = new StringBuilder("HistoryEnd received: expected=");
            sb4.append(lMo33433J);
            sb4.append(", actual=");
            sb4.append(jMo131907e);
            sb4.append(", breakdown=");
            sb4.append(c40646cMo131906d);
            sb4.append(", trim=");
            sb4.append(strM131618c);
            interfaceC34116n.mo85216g(AbstractC25012a.m73376i(":", strM131618c2, sb4), new AbstractC30556a.a[0]);
            int i15 = c10274b.getConsecutiveFailures() >= 3 ? 2 : 0;
            int i16 = (lMo33433J == null || lMo33433J.longValue() - ((long) i15) > jMo131907e) ? 0 : 1;
            if (i16 != 0) {
                long jM119457j = this.analytics.m119457j();
                InterfaceC40647d interfaceC40647d = this.packetSink;
                cVar.f31210w = c10274b;
                cVar.f31211x = interfaceC12103c;
                cVar.f31212y = c40645bMo131908f;
                cVar.f31213z = c27938a2;
                cVar.f31201E = lMo33433J;
                cVar.f31202F = jM119455f;
                cVar.f31203G = jMo131907e;
                cVar.f31205I = i15;
                cVar.f31206J = i16;
                cVar.f31204H = jM119457j;
                cVar.f31209M = 1;
                Object objMo131903a = interfaceC40647d.mo131903a(cVar);
                if (objMo131903a == enumC31071a) {
                    return enumC31071a;
                }
                c27938a = c27938a2;
                j14 = jMo131907e;
                j15 = jM119457j;
                c10274b3 = c10274b;
                interfaceC12103c2 = interfaceC12103c;
                l12 = lMo33433J;
                obj = objMo131903a;
                c40645b2 = c40645bMo131908f;
                j16 = jM119455f;
            } else {
                j7 = jM119455f;
                c10274b2 = c10274b;
                j13 = jMo131907e;
                c27938a = c27938a2;
                c40645b = c40645bMo131908f;
                l7 = lMo33433J;
            }
            long j17 = j13;
            Long l13 = l7;
            m26305d(false, j7, l13, j17, c10274b2.getConsecutiveFailures(), c40645b);
            return m26308g(c10274b2, c27938a, l13, j17);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j18 = cVar.f31204H;
        long j19 = cVar.f31203G;
        long j24 = cVar.f31202F;
        Long l14 = (Long) cVar.f31201E;
        C27938a c27938a3 = (C27938a) cVar.f31213z;
        C40645b c40645b3 = (C40645b) cVar.f31212y;
        interfaceC12103c2 = (InterfaceC12103c) cVar.f31211x;
        C10274b c10274b4 = (C10274b) cVar.f31210w;
        AbstractC34132o.m107864I(obj);
        l12 = l14;
        c40645b2 = c40645b3;
        j16 = j24;
        c27938a = c27938a3;
        j14 = j19;
        j15 = j18;
        c10274b3 = c10274b4;
        C40644a c40644a = (C40644a) obj;
        long jM119457j2 = this.analytics.m119457j() - j15;
        C40645b c40645b4 = c40645b2;
        this.analytics.m119467u(jM119457j2 >= 0 ? jM119457j2 : 0L, c40644a.getSuccess());
        if (!c40644a.getSuccess() || (c38377qM122940d = AbstractC38379r.m122940d(interfaceC12103c2, this.strapInfo.getWhoopDeviceType())) == null) {
            c10274b2 = c10274b3;
            c40645b = c40645b4;
            j7 = j16;
            l7 = l12;
            j13 = j14;
            long j110 = j13;
            Long l15 = l7;
            m26305d(false, j7, l15, j110, c10274b2.getConsecutiveFailures(), c40645b);
            return m26308g(c10274b2, c27938a, l15, j110);
        }
        long j25 = j14;
        m26305d(true, j16, l12, j25, c10274b3.getConsecutiveFailures(), c40645b4);
        C3295k c3295kM26312k = m26312k(c10274b3, c40644a.getSequenceInfo());
        InterfaceC34116n interfaceC34116n2 = this.logger;
        int successfulBurstCount = c10274b3.getSuccessfulBurstCount() + 1;
        C40646c c40646cMo131906d2 = this.packetSink.mo131906d();
        if (c40644a.getSequenceInfo().m131897e()) {
            str = ", sequenceGaps=" + c40644a.getSequenceInfo();
        } else {
            str = "";
        }
        interfaceC34116n2.mo85216g("Burst validation succeeded (burst " + successfulBurstCount + "): expected=" + l12 + ", actual=" + j25 + ", breakdown=" + c40646cMo131906d2 + str, new AbstractC30556a.a[0]);
        C3296l c3296lM9598d = c10274b3.getSavedPacketCounts().m9598d(c40644a);
        int successfulBurstCount2 = c10274b3.getSuccessfulBurstCount() + 1;
        return c10274b3.m26248b(new InterfaceC10278f.a(new InterfaceC10275c.c(c27938a, c38377qM122940d), c3296lM9598d, successfulBurstCount2, c3295kM26312k), c3296lM9598d, successfulBurstCount2, false, null, 0, AbstractC25247g0.m73995d0(c10274b3.m26252g(), c40644a.getSequenceInfo().m131898f()), c3295kM26312k);
    }

    /* JADX INFO: renamed from: j */
    private final C10274b m26311j(C10274b state, InterfaceC12105e packet) {
        if (state.getIsSyncing()) {
            this.logger.mo85226q("HistoryStart received during active burst, discarding partial burst", new AbstractC30556a.a[0]);
        }
        C27938a c27938aM84313b = C27938a.INSTANCE.m84311a().m84315d(packet.mo33439a()).m84314c(packet.mo33440d()).m84316e(packet.mo33441f()).m84312a(this.strapInfo.getBluetoothVersion()).m84317f(this.strapInfo.getSerialNumber()).m84318g(EnumC32978v.INSTANCE.m104091d(this.strapInfo.getWhoopDeviceType())).m84313b();
        this.logger.mo85216g(AbstractC2875y.m8296i(state.getSuccessfulBurstCount() + 1, "HistoryStart received, beginning burst (burst ", ")"), new AbstractC30556a.a[0]);
        this.analytics.m119460m();
        this.analytics.m119458k();
        this.packetSink.mo131904b(c27938aM84313b);
        return C10274b.m26246c(state, new InterfaceC10278f.a(new InterfaceC10275c.b(c27938aM84313b), state.getSavedPacketCounts(), state.getSuccessfulBurstCount(), state.getSessionGapSummary()), null, 0, true, c27938aM84313b, 0, null, null, 230, null);
    }

    /* JADX INFO: renamed from: k */
    private final C3295k m26312k(C10274b state, C40645b burstInfo) {
        int i13 = 0;
        long j7 = 0;
        for (Map.Entry<Short, Long> entry : burstInfo.m131895c().entrySet()) {
            short sShortValue = entry.getKey().shortValue();
            long jLongValue = entry.getValue().longValue();
            Long l7 = state.m26252g().get(Short.valueOf(sShortValue));
            if (l7 != null) {
                long jLongValue2 = l7.longValue();
                if (jLongValue > jLongValue2 + 1) {
                    i13++;
                    j7 += (jLongValue - jLongValue2) - 1;
                }
            }
        }
        return state.getSessionGapSummary().m9588a(burstInfo.getGapCount() + state.getSessionGapSummary().getIntraBurstGapCount(), state.getSessionGapSummary().getCrossBurstGapCount() + i13, burstInfo.getEstimatedMissingPackets() + state.getSessionGapSummary().getEstimatedMissingPackets() + j7, burstInfo.getBackwardPacketCount() + state.getSessionGapSummary().getBackwardPacketCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final Object m26313l(C10274b c10274b, AbstractC24734k abstractC24734k, InterfaceC30057d<? super C10274b> interfaceC30057d) {
        Object packet = abstractC24734k.getPacket();
        if (packet instanceof InterfaceC12105e) {
            return m26311j(c10274b, (InterfaceC12105e) packet);
        }
        if (packet instanceof InterfaceC12103c) {
            return m26310i(c10274b, (InterfaceC12103c) packet, interfaceC30057d);
        }
        if (packet instanceof InterfaceC12101a) {
            return m26309h(c10274b);
        }
        if (packet instanceof InterfaceC24729f) {
            return m26306e(c10274b, abstractC24734k, (InterfaceC24729f) packet);
        }
        return packet instanceof InterfaceC28324b ? m26307f(c10274b, abstractC24734k, (InterfaceC28324b) packet) : c10274b;
    }

    /* JADX INFO: renamed from: m */
    private final void m26314m(C24736m receivedPacket, InterfaceC24729f dataPacket) {
        C14554a c14554aM49180X;
        InterfaceC24730g interfaceC24730gMo49181g = dataPacket.mo49181g();
        if (interfaceC24730gMo49181g instanceof InterfaceC24730g.b) {
            C24725b c24725b = dataPacket instanceof C24725b ? (C24725b) dataPacket : null;
            if (c24725b == null) {
                return;
            }
            m26315n(receivedPacket, c24725b);
            return;
        }
        if (!(interfaceC24730gMo49181g instanceof InterfaceC24730g.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC17369d abstractC17369d = dataPacket instanceof AbstractC17369d ? (AbstractC17369d) dataPacket : null;
        if (abstractC17369d == null || (c14554aM49180X = abstractC17369d.m49180X()) == null) {
            return;
        }
        long jM41583j = c14554aM49180X.m41583j();
        int i13 = b.f31200a[((InterfaceC24730g.c) interfaceC24730gMo49181g).getType().ordinal()];
        if (i13 == 1) {
            this.rawDataTrackingService.mo13759a(jM41583j);
        } else {
            if (i13 != 2) {
                return;
            }
            this.rawDataTrackingService.mo13760b(jM41583j);
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m26315n(C24736m receivedPacket, C24725b dataPacket) {
        try {
            AbstractC27120h abstractC27120hM81509a = AbstractC27120h.INSTANCE.m81509a(this.strapInfo.getWhoopDeviceType(), receivedPacket, dataPacket);
            if (abstractC27120hM81509a != null && abstractC27120hM81509a.m81508f0() && dataPacket.m72397Z() == 47) {
                this.rawDataTrackingService.mo13759a(abstractC27120hM81509a.m81507e0());
            } else {
                this.rawDataTrackingService.mo13760b(dataPacket.m72396Y().m41583j());
            }
        } catch (Exception e5) {
            this.logger.mo85213c("Failed to parse raw data packet for tracking", e5, new AbstractC30556a.a[0]);
            this.rawDataTrackingService.mo13760b(dataPacket.m72396Y().m41583j());
        }
    }

    @Override // bi2.InterfaceC3292h
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo9581a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new d(new C13060l1(new C10274b(null, null, 0, false, null, 0, null, null, 255, null), new C13015a0(3, new e(null), upstream), new f(null)));
    }

    public /* synthetic */ C10282j(InterfaceC40647d interfaceC40647d, WhoopStrapInfo whoopStrapInfo, C37300a c37300a, InterfaceC4368h interfaceC4368h, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC40647d, whoopStrapInfo, c37300a, interfaceC4368h, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SensorSyncProcessor") : interfaceC34116n);
    }
}
