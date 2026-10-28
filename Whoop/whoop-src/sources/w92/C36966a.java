package w92;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import bi2.AbstractC3289e;
import bi2.InterfaceC3287c;
import bi2.InterfaceC3288d;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import lt0.InterfaceC24730g;
import m83.AbstractC25265s;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import mh2.C25561a;
import nu0.C27136a;
import oh2.C27938a;
import oh2.C27941d;
import or2.AbstractC28209v1;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vt0.C36484a;
import vt0.C36485b;
import yh2.C39543b;

/* JADX INFO: renamed from: w92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u00017BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b)\u0010*J8\u00103\u001a\u0002022\u001e\u0010/\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,0+2\u0006\u00101\u001a\u000200H\u0096@¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00142\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006Q"}, m65681d2 = {"Lw92/a;", "Lbi2/d;", "Lbc3/c0;", "Ljava/io/File;", "filesDir", "Lmh2/a;", "strapMetadataDaoInteractor", "Lw92/b;", "heartDataTableRoom", "Lin2/d;", "dispatcherFactory", "Lvt0/a;", "uploadFileWriter", "Lmc3/a;", "mutex", "stressMonitorMutex", "Ltr2/n;", "logger", "<init>", "(Ljava/io/File;Lmh2/a;Lw92/b;Lin2/d;Lvt0/a;Lmc3/a;Lmc3/a;Ltr2/n;)V", "", "maxFileSize", "", "packetRevision", "Lyh2/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(JILq83/d;)Ljava/lang/Object;", "numRecords", "oldestTimeStamp", "newestTimeStamp", "versionId", "Ll83/a0;", "g", "(JJJIJLq83/d;)Ljava/lang/Object;", "Lbi2/c;", "b", "(Lq83/d;)Ljava/lang/Object;", "seconds", "c", "(ILq83/d;)Ljava/lang/Object;", "exportedHeartData", "e", "(Lyh2/b;Lq83/d;)Ljava/lang/Object;", "", "Ll83/k;", "Ljava/nio/ByteBuffer;", "Llt0/g;", "data", "Loh2/a;", "info", "", "d", "(Ljava/util/Map;Loh2/a;Lq83/d;)Ljava/lang/Object;", "Loh2/d;", "version", "a", "(Loh2/d;)J", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/io/File;", "x", "Lmh2/a;", "y", "Lw92/b;", "z", "Lin2/d;", "E", "Lvt0/a;", "F", "Lmc3/a;", "G", "H", "Ltr2/n;", "Lbc3/u;", "I", "Lbc3/u;", "job", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "J", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36966a implements InterfaceC3288d, InterfaceC2994c0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C36484a uploadFileWriter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC25435a stressMonitorMutex;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC3061u job;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final File filesDir;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25561a strapMetadataDaoInteractor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C36967b heartDataTableRoom;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: w92.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataStoreImpl", m100430f = "HeartDataStoreImpl.kt", m100431l = {305, 72, 79}, m100432m = "getHeartDataFromTable", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f158144E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f158145F;

        /* JADX INFO: renamed from: H */
        int f158147H;

        /* JADX INFO: renamed from: w */
        Object f158148w;

        /* JADX INFO: renamed from: x */
        int f158149x;

        /* JADX INFO: renamed from: y */
        int f158150y;

        /* JADX INFO: renamed from: z */
        int f158151z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f158145F = obj;
            this.f158147H |= Integer.MIN_VALUE;
            return C36966a.this.mo9569b(this);
        }
    }

    /* JADX INFO: renamed from: w92.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataStoreImpl", m100430f = "HeartDataStoreImpl.kt", m100431l = {305, 145, 158}, m100432m = "getRecentHeartDataForStressMonitor", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f158152E;

        /* JADX INFO: renamed from: F */
        Object f158153F;

        /* JADX INFO: renamed from: G */
        Object f158154G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f158155H;

        /* JADX INFO: renamed from: J */
        int f158157J;

        /* JADX INFO: renamed from: w */
        int f158158w;

        /* JADX INFO: renamed from: x */
        int f158159x;

        /* JADX INFO: renamed from: y */
        int f158160y;

        /* JADX INFO: renamed from: z */
        int f158161z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f158155H = obj;
            this.f158157J |= Integer.MIN_VALUE;
            return C36966a.this.mo9570c(0, this);
        }
    }

    /* JADX INFO: renamed from: w92.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataStoreImpl", m100430f = "HeartDataStoreImpl.kt", m100431l = {105, 107, 114}, m100432m = "newExportOldestToFileFromDb", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f158162E;

        /* JADX INFO: renamed from: F */
        Object f158163F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f158164G;

        /* JADX INFO: renamed from: I */
        int f158166I;

        /* JADX INFO: renamed from: w */
        long f158167w;

        /* JADX INFO: renamed from: x */
        int f158168x;

        /* JADX INFO: renamed from: y */
        int f158169y;

        /* JADX INFO: renamed from: z */
        int f158170z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f158164G = obj;
            this.f158166I |= Integer.MIN_VALUE;
            return C36966a.this.m118679h(0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: w92.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataStoreImpl", m100430f = "HeartDataStoreImpl.kt", m100431l = {305, 199}, m100432m = "removeHeartDataFromTable", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f158171E;

        /* JADX INFO: renamed from: G */
        int f158173G;

        /* JADX INFO: renamed from: w */
        Object f158174w;

        /* JADX INFO: renamed from: x */
        Object f158175x;

        /* JADX INFO: renamed from: y */
        int f158176y;

        /* JADX INFO: renamed from: z */
        int f158177z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f158171E = obj;
            this.f158173G |= Integer.MIN_VALUE;
            return C36966a.this.mo9572e(null, this);
        }
    }

    /* JADX INFO: renamed from: w92.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.heartdata.HeartDataStoreImpl", m100430f = "HeartDataStoreImpl.kt", m100431l = {275}, m100432m = "savePacketsInRoomDbBatchInsert", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f158178E;

        /* JADX INFO: renamed from: F */
        Object f158179F;

        /* JADX INFO: renamed from: G */
        Object f158180G;

        /* JADX INFO: renamed from: H */
        int f158181H;

        /* JADX INFO: renamed from: I */
        int f158182I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f158183J;

        /* JADX INFO: renamed from: L */
        int f158185L;

        /* JADX INFO: renamed from: w */
        Object f158186w;

        /* JADX INFO: renamed from: x */
        Object f158187x;

        /* JADX INFO: renamed from: y */
        Object f158188y;

        /* JADX INFO: renamed from: z */
        Object f158189z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f158183J = obj;
            this.f158185L |= Integer.MIN_VALUE;
            return C36966a.this.mo9571d(null, null, this);
        }
    }

    public C36966a(File filesDir, C25561a strapMetadataDaoInteractor, C36967b heartDataTableRoom, InterfaceC18732d dispatcherFactory, C36484a uploadFileWriter, InterfaceC25435a mutex, InterfaceC25435a stressMonitorMutex, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(filesDir, "filesDir");
        AbstractC22676k.m65750j(strapMetadataDaoInteractor, "strapMetadataDaoInteractor");
        AbstractC22676k.m65750j(heartDataTableRoom, "heartDataTableRoom");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(uploadFileWriter, "uploadFileWriter");
        AbstractC22676k.m65750j(mutex, "mutex");
        AbstractC22676k.m65750j(stressMonitorMutex, "stressMonitorMutex");
        AbstractC22676k.m65750j(logger, "logger");
        this.filesDir = filesDir;
        this.strapMetadataDaoInteractor = strapMetadataDaoInteractor;
        this.heartDataTableRoom = heartDataTableRoom;
        this.dispatcherFactory = dispatcherFactory;
        this.uploadFileWriter = uploadFileWriter;
        this.mutex = mutex;
        this.stressMonitorMutex = stressMonitorMutex;
        this.logger = logger;
        this.job = AbstractC3006f0.m8710d();
    }

    /* JADX INFO: renamed from: g */
    private final Object m118678g(long j7, long j13, long j14, int i13, long j15, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        InterfaceC34116n interfaceC34116n = this.logger;
        String strM85388b = AbstractC28209v1.m85388b(j13);
        String strM85388b2 = AbstractC28209v1.m85388b(j14);
        StringBuilder sb4 = new StringBuilder("Deleting metrics data from Room db {NumOfRecords: ");
        sb4.append(j7);
        sb4.append("; PacketRevision: R");
        sb4.append(i13);
        AbstractC2875y.m8285A(sb4, "; VersionId: ", j15, "; TimeRange: ");
        interfaceC34116n.mo85228t(AbstractC11266d.m30464r(sb4, strM85388b, " - ", strM85388b2, "}"), new AbstractC30556a.a[0]);
        Object objM118685f = this.heartDataTableRoom.m118685f(j7, j13, j14, i13, j15, interfaceC30057d);
        return objM118685f == EnumC31071a.f128113w ? objM118685f : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2 A[PHI: r1 r4 r7
      0x00d2: PHI (r1v2 int) = (r1v1 int), (r1v5 int) binds: [B:31:0x00af, B:37:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r4v10 java.io.File) = (r4v9 java.io.File), (r4v14 java.io.File) binds: [B:31:0x00af, B:37:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r7v4 long) = (r7v3 long), (r7v7 long) binds: [B:31:0x00af, B:37:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        if (r2 == r3) goto L46;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m118679h(long r28, int r30, q83.InterfaceC30057d<? super yh2.C39543b> r31) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w92.C36966a.m118679h(long, int, q83.d):java.lang.Object");
    }

    @Override // bi2.InterfaceC3288d
    /* JADX INFO: renamed from: a */
    public long mo9568a(C27941d version) {
        AbstractC22676k.m65750j(version, "version");
        return this.strapMetadataDaoInteractor.m75172j(version);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #1 {all -> 0x0099, blocks: (B:41:0x00b4, B:43:0x00c0, B:46:0x00de, B:30:0x0081, B:32:0x008a, B:37:0x009d), top: B:64:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00de A[Catch: all -> 0x0099, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0099, blocks: (B:41:0x00b4, B:43:0x00c0, B:46:0x00de, B:30:0x0081, B:32:0x008a, B:37:0x009d), top: B:64:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:50:0x0111, B:52:0x0115, B:53:0x0118, B:55:0x0120, B:57:0x014c), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0118 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:50:0x0111, B:52:0x0115, B:53:0x0118, B:55:0x0120, B:57:0x014c), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:50:0x0111, B:52:0x0115, B:53:0x0118, B:55:0x0120, B:57:0x014c), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x014c A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:50:0x0111, B:52:0x0115, B:53:0x0118, B:55:0x0120, B:57:0x014c), top: B:63:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00c0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00de, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0120, please report this as an issue */
    @Override // bi2.InterfaceC3288d
    /* JADX INFO: renamed from: b */
    public Object mo9569b(InterfaceC30057d<? super InterfaceC3287c> interfaceC30057d) throws Throwable {
        b bVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        int i14;
        int i15;
        int i16;
        long jLongValue;
        long j7;
        C39543b c39543b;
        Object aVar;
        Object obj;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i17 = bVar.f158147H;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                bVar.f158147H = i17 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM118679h = bVar.f158145F;
        Object obj2 = EnumC31071a.f128113w;
        int i18 = bVar.f158147H;
        try {
            if (i18 == 0) {
                AbstractC34132o.m107864I(objM118679h);
                InterfaceC25435a interfaceC25435a3 = this.mutex;
                bVar.f158148w = interfaceC25435a3;
                bVar.f158149x = 0;
                bVar.f158147H = 1;
                if (interfaceC25435a3.mo68211b(bVar) != obj2) {
                    interfaceC25435a = interfaceC25435a3;
                    i13 = 0;
                }
                return obj2;
            }
            if (i18 != 1) {
                if (i18 == 2) {
                    i15 = bVar.f158151z;
                    i16 = bVar.f158150y;
                    int i19 = bVar.f158149x;
                    InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) bVar.f158148w;
                    try {
                        AbstractC34132o.m107864I(objM118679h);
                        i14 = i19;
                        interfaceC25435a = interfaceC25435a4;
                        jLongValue = ((Number) objM118679h).longValue();
                        if (jLongValue == 0) {
                            this.logger.mo85216g("No R" + i15 + " found in the Room db. Skipping upload.", new AbstractC30556a.a[0]);
                            InterfaceC3287c.b bVar2 = InterfaceC3287c.b.f12830a;
                            interfaceC25435a.mo68214i(null);
                            return bVar2;
                        }
                        this.logger.mo85228t("Count of data packets being exported (R" + i15 + "): " + jLongValue, new AbstractC30556a.a[0]);
                        bVar.f158148w = interfaceC25435a;
                        bVar.f158149x = i14;
                        bVar.f158150y = i16;
                        bVar.f158151z = i15;
                        bVar.f158144E = jLongValue;
                        bVar.f158147H = 3;
                        objM118679h = m118679h(3145728L, i15, bVar);
                        if (objM118679h != obj2) {
                            interfaceC25435a2 = interfaceC25435a;
                            j7 = jLongValue;
                            c39543b = (C39543b) objM118679h;
                            if (c39543b == null) {
                                obj = InterfaceC3287c.b.f12830a;
                            } else {
                                if (j7 > c39543b.getRecordCount()) {
                                    this.logger.mo85228t("Backlog count has more data to upload, count: " + j7 + ", ExportedHeartData: " + c39543b.getRecordCount(), new AbstractC30556a.a[0]);
                                    aVar = new InterfaceC3287c.c(c39543b, (int) (j7 / c39543b.getRecordCount()));
                                } else {
                                    aVar = new InterfaceC3287c.a(c39543b);
                                }
                                obj = aVar;
                            }
                            interfaceC25435a2.mo68214i(null);
                            return obj;
                        }
                        return obj2;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC25435a2 = interfaceC25435a4;
                    }
                } else {
                    if (i18 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j7 = bVar.f158144E;
                    interfaceC25435a2 = (InterfaceC25435a) bVar.f158148w;
                    try {
                        AbstractC34132o.m107864I(objM118679h);
                        c39543b = (C39543b) objM118679h;
                        if (c39543b == null) {
                            obj = InterfaceC3287c.b.f12830a;
                        } else {
                            if (j7 > c39543b.getRecordCount()) {
                                this.logger.mo85228t("Backlog count has more data to upload, count: " + j7 + ", ExportedHeartData: " + c39543b.getRecordCount(), new AbstractC30556a.a[0]);
                                aVar = new InterfaceC3287c.c(c39543b, (int) (j7 / c39543b.getRecordCount()));
                            } else {
                                aVar = new InterfaceC3287c.a(c39543b);
                            }
                            obj = aVar;
                        }
                        interfaceC25435a2.mo68214i(null);
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                interfaceC25435a2.mo68214i(null);
                throw th;
            }
            i13 = bVar.f158149x;
            interfaceC25435a = (InterfaceC25435a) bVar.f158148w;
            AbstractC34132o.m107864I(objM118679h);
            int iM118686g = this.heartDataTableRoom.m118686g();
            if (iM118686g == -1) {
                this.logger.mo85222m("Could not find the oldest packet revision in the Room db! Skipping metrics data upload from new flow!!", new AbstractC30556a.a[0]);
                InterfaceC3287c.b bVar3 = InterfaceC3287c.b.f12830a;
                interfaceC25435a.mo68214i(null);
                return bVar3;
            }
            C36967b c36967b = this.heartDataTableRoom;
            bVar.f158148w = interfaceC25435a;
            bVar.f158149x = i13;
            bVar.f158150y = 0;
            bVar.f158151z = iM118686g;
            bVar.f158147H = 2;
            Object objM118684e = c36967b.m118684e(iM118686g, bVar);
            if (objM118684e != obj2) {
                i14 = i13;
                i15 = iM118686g;
                objM118679h = objM118684e;
                i16 = 0;
                jLongValue = ((Number) objM118679h).longValue();
                if (jLongValue == 0) {
                    this.logger.mo85216g("No R" + i15 + " found in the Room db. Skipping upload.", new AbstractC30556a.a[0]);
                    InterfaceC3287c.b bVar4 = InterfaceC3287c.b.f12830a;
                    interfaceC25435a.mo68214i(null);
                    return bVar4;
                }
                this.logger.mo85228t("Count of data packets being exported (R" + i15 + "): " + jLongValue, new AbstractC30556a.a[0]);
                bVar.f158148w = interfaceC25435a;
                bVar.f158149x = i14;
                bVar.f158150y = i16;
                bVar.f158151z = i15;
                bVar.f158144E = jLongValue;
                bVar.f158147H = 3;
                objM118679h = m118679h(3145728L, i15, bVar);
                if (objM118679h != obj2) {
                    interfaceC25435a2 = interfaceC25435a;
                    j7 = jLongValue;
                    c39543b = (C39543b) objM118679h;
                    if (c39543b == null) {
                        obj = InterfaceC3287c.b.f12830a;
                    } else {
                        if (j7 > c39543b.getRecordCount()) {
                            this.logger.mo85228t("Backlog count has more data to upload, count: " + j7 + ", ExportedHeartData: " + c39543b.getRecordCount(), new AbstractC30556a.a[0]);
                            aVar = new InterfaceC3287c.c(c39543b, (int) (j7 / c39543b.getRecordCount()));
                        } else {
                            aVar = new InterfaceC3287c.a(c39543b);
                        }
                        obj = aVar;
                    }
                    interfaceC25435a2.mo68214i(null);
                    return obj;
                }
            }
            return obj2;
        } catch (Throwable th5) {
            th = th5;
            interfaceC25435a2 = interfaceC25435a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x013b A[Catch: all -> 0x014d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x014d, blocks: (B:57:0x013b, B:65:0x015c), top: B:128:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0151 A[Catch: all -> 0x01d4, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x01d4, blocks: (B:55:0x0137, B:62:0x0151), top: B:137:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x015c A[Catch: all -> 0x014d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x014d, blocks: (B:57:0x013b, B:65:0x015c), top: B:128:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0168  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // bi2.InterfaceC3288d
    /* JADX INFO: renamed from: c */
    public Object mo9570c(int i13, InterfaceC30057d<? super InterfaceC3287c> interfaceC30057d) throws Throwable {
        c cVar;
        int i14;
        InterfaceC25435a interfaceC25435a;
        int i15;
        ?? r10;
        int i16;
        int i17;
        InterfaceC25435a interfaceC25435a2;
        ?? r14;
        List list;
        int i18;
        ?? r15;
        File file;
        C36485b c36485b;
        C27941d c27941dM75171h;
        ?? r16;
        Object aVar;
        ?? r17;
        ?? r18;
        ?? r19;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i19 = cVar.f158157J;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                cVar.f158157J = i19 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM116916b = cVar2.f158155H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i24 = cVar2.f158157J;
        try {
            if (i24 == 0) {
                AbstractC34132o.m107864I(objM116916b);
                InterfaceC25435a interfaceC25435a3 = this.stressMonitorMutex;
                cVar2.f158152E = interfaceC25435a3;
                i14 = i13;
                cVar2.f158158w = i14;
                cVar2.f158159x = 0;
                cVar2.f158157J = 1;
                if (interfaceC25435a3.mo68211b(cVar2) != enumC31071a) {
                    interfaceC25435a = interfaceC25435a3;
                    i15 = 0;
                }
                return enumC31071a;
            }
            if (i24 != 1) {
                if (i24 == 2) {
                    int i25 = cVar2.f158160y;
                    int i26 = cVar2.f158159x;
                    int i27 = cVar2.f158158w;
                    InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) cVar2.f158152E;
                    try {
                        AbstractC34132o.m107864I(objM116916b);
                        i16 = i26;
                        interfaceC25435a2 = interfaceC25435a4;
                        i17 = i27;
                        r14 = i25;
                        try {
                            List list2 = (List) objM116916b;
                            list = list2;
                            try {
                                if (list != null || list.isEmpty()) {
                                    InterfaceC25435a interfaceC25435a5 = interfaceC25435a2;
                                    this.logger.mo85222m("No cached records found for the last " + i17 + " seconds", new AbstractC30556a.a[0]);
                                    InterfaceC3287c.b bVar = InterfaceC3287c.b.f12830a;
                                    interfaceC25435a5.mo68214i(null);
                                    return bVar;
                                }
                                int packetRevision = ((C27136a) AbstractC25265s.m74096F0(list2)).getPacketRevision();
                                File file2 = new File(this.filesDir, "heart_data_stress_monitor");
                                File parentFile = file2.getParentFile();
                                if (parentFile != null) {
                                    try {
                                        parentFile.mkdirs();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r10 = interfaceC25435a2;
                                    }
                                }
                                if (file2.exists()) {
                                    file2.delete();
                                }
                                C36484a c36484a = this.uploadFileWriter;
                                Integer num = new Integer(packetRevision);
                                Long l7 = new Long(3145728L);
                                cVar2.f158152E = interfaceC25435a2;
                                cVar2.f158153F = null;
                                cVar2.f158154G = file2;
                                cVar2.f158158w = i17;
                                cVar2.f158159x = i16;
                                cVar2.f158160y = r14;
                                cVar2.f158161z = packetRevision;
                                cVar2.f158157J = 3;
                                InterfaceC25435a interfaceC25435a6 = interfaceC25435a2;
                                objM116916b = C36484a.m116916b(c36484a, file2, list2, num, l7, null, cVar2, 16, null);
                                if (objM116916b != enumC31071a) {
                                    i18 = packetRevision;
                                    r15 = interfaceC25435a6;
                                    file = file2;
                                    c36485b = (C36485b) objM116916b;
                                    if (c36485b == null) {
                                        this.logger.mo85222m("Failed to write cached heart data to file", new AbstractC30556a.a[0]);
                                        file.delete();
                                        InterfaceC3287c.b bVar2 = InterfaceC3287c.b.f12830a;
                                        r15.mo68214i(null);
                                        return bVar2;
                                    }
                                    if (c36485b.getVersion() != -1) {
                                        c27941dM75171h = this.strapMetadataDaoInteractor.m75171h(c36485b.getVersion());
                                    } else {
                                        c27941dM75171h = null;
                                    }
                                    if (c27941dM75171h != null) {
                                        r17 = r15;
                                        r10 = r17;
                                        r16 = r10;
                                        aVar = new InterfaceC3287c.a(new C39543b(c36485b.getOutputFile(), c36485b.getNewestTimestamp(), c36485b.getOldestTimestamp(), c36485b.getPacketCount(), c36485b.getVersion(), c27941dM75171h, i18));
                                        r18 = r16;
                                    } else {
                                        r19 = r15;
                                        this.logger.mo85226q("Version missing for cached heart data export", new AbstractC30556a.a[0]);
                                        file.delete();
                                        aVar = InterfaceC3287c.b.f12830a;
                                        r18 = r19;
                                    }
                                    r18.mo68214i(null);
                                    return aVar;
                                }
                                return enumC31071a;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r14 = interfaceC25435a2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r10 = interfaceC25435a4;
                    }
                    r10 = r14;
                } else {
                    if (i24 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i28 = cVar2.f158161z;
                    file = (File) cVar2.f158154G;
                    r10 = (InterfaceC25435a) cVar2.f158152E;
                    try {
                        AbstractC34132o.m107864I(objM116916b);
                        i18 = i28;
                        r15 = r10;
                        try {
                            c36485b = (C36485b) objM116916b;
                            try {
                                if (c36485b == null) {
                                    this.logger.mo85222m("Failed to write cached heart data to file", new AbstractC30556a.a[0]);
                                    file.delete();
                                    InterfaceC3287c.b bVar3 = InterfaceC3287c.b.f12830a;
                                    r15.mo68214i(null);
                                    return bVar3;
                                }
                                if (c36485b.getVersion() != -1) {
                                    c27941dM75171h = this.strapMetadataDaoInteractor.m75171h(c36485b.getVersion());
                                } else {
                                    c27941dM75171h = null;
                                }
                                if (c27941dM75171h != null) {
                                    try {
                                        r17 = r15;
                                        try {
                                            r10 = r17;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            r16 = r10;
                                                            try {
                                                                aVar = new InterfaceC3287c.a(new C39543b(c36485b.getOutputFile(), c36485b.getNewestTimestamp(), c36485b.getOldestTimestamp(), c36485b.getPacketCount(), c36485b.getVersion(), c27941dM75171h, i18));
                                                                r18 = r16;
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                r10 = r16;
                                                                r10.mo68214i(null);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            r16 = r10;
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        r16 = r10;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    r16 = r10;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            r16 = r17;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        r16 = r15;
                                    }
                                } else {
                                    r19 = r15;
                                    try {
                                        this.logger.mo85226q("Version missing for cached heart data export", new AbstractC30556a.a[0]);
                                        file.delete();
                                        aVar = InterfaceC3287c.b.f12830a;
                                        r18 = r19;
                                    } catch (Throwable th14) {
                                        th = th14;
                                        r14 = r19;
                                    }
                                }
                                r18.mo68214i(null);
                                return aVar;
                            } catch (Throwable th15) {
                                th = th15;
                                r10 = r15;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            r14 = r15;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                    }
                    r10 = r14;
                }
                r10.mo68214i(null);
                throw th;
            }
            int i29 = cVar2.f158159x;
            int i34 = cVar2.f158158w;
            interfaceC25435a = (InterfaceC25435a) cVar2.f158152E;
            AbstractC34132o.m107864I(objM116916b);
            i15 = i29;
            i14 = i34;
            this.logger.mo85216g("Exporting cached heart data from Room Db to file for last " + i14 + " seconds", new AbstractC30556a.a[0]);
            C36967b c36967b = this.heartDataTableRoom;
            cVar2.f158152E = interfaceC25435a;
            cVar2.f158158w = i14;
            cVar2.f158159x = i15;
            cVar2.f158160y = 0;
            cVar2.f158157J = 2;
            Object objM118689j = c36967b.m118689j(i14, cVar2);
            if (objM118689j != enumC31071a) {
                i16 = i15;
                objM116916b = objM118689j;
                i17 = i14;
                interfaceC25435a2 = interfaceC25435a;
                r14 = 0;
                List list3 = (List) objM116916b;
                list = list3;
                if (list != null) {
                }
                InterfaceC25435a interfaceC25435a7 = interfaceC25435a2;
                this.logger.mo85222m("No cached records found for the last " + i17 + " seconds", new AbstractC30556a.a[0]);
                InterfaceC3287c.b bVar4 = InterfaceC3287c.b.f12830a;
                interfaceC25435a7.mo68214i(null);
                return bVar4;
            }
            return enumC31071a;
        } catch (Throwable th18) {
            th = th18;
            r10 = interfaceC25435a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // bi2.InterfaceC3288d
    /* JADX INFO: renamed from: d */
    public Object mo9571d(Map<Long, ? extends C23465k> map, C27938a c27938a, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        f fVar;
        InterfaceC24730g interfaceC24730g;
        boolean z4;
        int i13;
        Map<Long, ? extends C23465k> map2;
        byte[] bArr;
        byte[] bArrArray;
        boolean z13;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i14 = fVar.f158185L;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f158185L = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f158183J;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = fVar.f158185L;
        int i16 = 0;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            ArrayList arrayList = new ArrayList();
            C27941d c27941dM84350c = C27941d.m84339b().m84352e(c27938a.getHardwareVersion()).m84351d(c27938a.getFirmwareVersion()).m84353f(c27938a.getSigProcVersion()).m84349b(c27938a.getVersion()).m84348a((byte) 0).m84354g(c27938a.getStrapId()).m84350c();
            try {
                C25561a c25561a = this.strapMetadataDaoInteractor;
                AbstractC22676k.m65747g(c27941dM84350c);
                int iM75172j = c25561a.m75172j(c27941dM84350c);
                this.logger.mo85219j("VersionId received from database - " + iM75172j + " for " + c27941dM84350c.m84344e().mo84319a(), new AbstractC30556a.a[0]);
                int i17 = 0;
                InterfaceC24730g interfaceC24730g2 = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                for (Map.Entry<Long, ? extends C23465k> entry : map.entrySet()) {
                    try {
                        long jLongValue = entry.getKey().longValue();
                        C23465k value = entry.getValue();
                        ByteBuffer byteBuffer = (ByteBuffer) value.f92937w;
                        InterfaceC24730g interfaceC24730g3 = (InterfaceC24730g) value.f92938x;
                        try {
                            if (AbstractC3289e.m9573a().contains(interfaceC24730g3)) {
                                int iLimit = byteBuffer.limit();
                                if (byteBuffer.arrayOffset() == 0 && iLimit == byteBuffer.array().length) {
                                    byte[] bArr4 = bArr2;
                                    bArrArray = byteBuffer.array();
                                    bArr = bArr4;
                                } else if (bArr2 == null || iLimit != bArr2.length) {
                                    bArr = new byte[iLimit];
                                    bArrArray = bArr;
                                } else {
                                    bArr = bArr2;
                                    bArrArray = bArr3;
                                }
                                System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArrArray, i16, iLimit);
                                byte[] bArr5 = bArrArray;
                                int iMo72406a = interfaceC24730g3.mo72406a();
                                interfaceC24730g2 = interfaceC24730g3;
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr5);
                                AbstractC22676k.m65749i(byteBufferWrap, "wrap(...)");
                                arrayList.add(new C27136a(iMo72406a, jLongValue, byteBufferWrap, iM75172j, interfaceC24730g2.mo72407b()));
                                bArr3 = bArr5;
                                bArr2 = bArr;
                                i16 = 0;
                            } else {
                                try {
                                    this.logger.mo85222m("Expected a processed data packet (R9, R12, R18, R24 or Rev2 processed results), but found " + interfaceC24730g3 + ". Dropping packet.", new AbstractC30556a.a[i16]);
                                    i17++;
                                    interfaceC24730g2 = interfaceC24730g3;
                                } catch (Exception e5) {
                                    e = e5;
                                    interfaceC24730g = interfaceC24730g3;
                                    this.logger.mo85230v("Caught an exception when trying to batch insert " + interfaceC24730g + " packets in Room db", e, new AbstractC30556a.a[0]);
                                    z13 = false;
                                    return Boolean.valueOf(z13);
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            interfaceC24730g2 = interfaceC24730g3;
                            interfaceC24730g = interfaceC24730g2;
                            this.logger.mo85230v("Caught an exception when trying to batch insert " + interfaceC24730g + " packets in Room db", e, new AbstractC30556a.a[0]);
                            z13 = false;
                            return Boolean.valueOf(z13);
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                }
                C36967b c36967b = this.heartDataTableRoom;
                fVar.f158186w = map;
                fVar.f158187x = null;
                fVar.f158188y = null;
                fVar.f158189z = null;
                fVar.f158178E = interfaceC24730g2;
                fVar.f158179F = null;
                fVar.f158180G = null;
                fVar.f158181H = iM75172j;
                fVar.f158182I = i17;
                z4 = true;
                fVar.f158185L = 1;
                if (c36967b.m118688i(arrayList, fVar) == enumC31071a) {
                    return enumC31071a;
                }
                i13 = i17;
                map2 = map;
                interfaceC24730g = interfaceC24730g2;
            } catch (Exception e15) {
                e = e15;
                interfaceC24730g = null;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = fVar.f158182I;
            interfaceC24730g = (InterfaceC24730g) fVar.f158178E;
            map2 = (Map) fVar.f158186w;
            try {
                AbstractC34132o.m107864I(obj);
                z4 = true;
            } catch (Exception e16) {
                e = e16;
                this.logger.mo85230v("Caught an exception when trying to batch insert " + interfaceC24730g + " packets in Room db", e, new AbstractC30556a.a[0]);
                z13 = false;
            }
        }
        this.logger.mo85219j("Batch inserted " + (map2.size() - i13) + " packets into the Room db. Dropped " + i13 + " packet(s) due to unexpected packet revision", new AbstractC30556a.a[0]);
        z13 = z4;
        return Boolean.valueOf(z13);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // bi2.InterfaceC3288d
    /* JADX INFO: renamed from: e */
    public Object mo9572e(C39543b c39543b, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        e eVar;
        InterfaceC25435a interfaceC25435a;
        C39543b c39543b2;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        C39543b c39543b3;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i14 = eVar.f158173G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f158173G = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f158171E;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = eVar2.f158173G;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC25435a interfaceC25435a3 = this.mutex;
                eVar2.f158174w = c39543b;
                eVar2.f158175x = interfaceC25435a3;
                eVar2.f158176y = 0;
                eVar2.f158173G = 1;
                if (interfaceC25435a3.mo68211b(eVar2) != obj2) {
                    interfaceC25435a = interfaceC25435a3;
                    c39543b2 = c39543b;
                    i13 = 0;
                }
                return obj2;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) eVar2.f158175x;
                c39543b3 = (C39543b) eVar2.f158174w;
                try {
                    AbstractC34132o.m107864I(obj);
                    c39543b3.getExportedFile().delete();
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC25435a2.mo68214i(null);
                    throw th;
                }
            }
            i13 = eVar2.f158176y;
            InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) eVar2.f158175x;
            C39543b c39543b4 = (C39543b) eVar2.f158174w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a4;
            c39543b2 = c39543b4;
            this.logger.mo85228t("Removing exported data from database", new AbstractC30556a.a[0]);
            long recordCount = c39543b2.getRecordCount();
            long oldestTimestamp = c39543b2.getOldestTimestamp();
            long newestTimestamp = c39543b2.getNewestTimestamp();
            int packetRevision = c39543b2.getPacketRevision();
            long versionId = c39543b2.getVersionId();
            eVar2.f158174w = c39543b2;
            eVar2.f158175x = interfaceC25435a;
            eVar2.f158176y = i13;
            eVar2.f158177z = 0;
            eVar2.f158173G = 2;
            if (m118678g(recordCount, oldestTimestamp, newestTimestamp, packetRevision, versionId, eVar2) != obj2) {
                c39543b3 = c39543b2;
                interfaceC25435a2 = interfaceC25435a;
                c39543b3.getExportedFile().delete();
                interfaceC25435a2.mo68214i(null);
                return C23454a0.f92919a;
            }
            return obj2;
        } catch (Throwable th4) {
            th = th4;
            interfaceC25435a2 = interfaceC25435a;
            interfaceC25435a2.mo68214i(null);
            throw th;
        }
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.dispatcherFactory.mo54465b().plus(this.job);
    }

    public /* synthetic */ C36966a(File file, C25561a c25561a, C36967b c36967b, InterfaceC18732d interfaceC18732d, C36484a c36484a, InterfaceC25435a interfaceC25435a, InterfaceC25435a interfaceC25435a2, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, c25561a, c36967b, interfaceC18732d, c36484a, (i13 & 32) != 0 ? AbstractC25438d.m74669a() : interfaceC25435a, (i13 & 64) != 0 ? AbstractC25438d.m74669a() : interfaceC25435a2, (i13 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HeartData") : interfaceC34116n);
    }
}
