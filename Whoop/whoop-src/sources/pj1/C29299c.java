package pj1;

import com.mapbox.common.logger.LogPriority;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.healthconnect.domain.HealthConnectApi;
import com.whoop.healthconnect.domain.models.HealthConnectEventsResponse;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: pj1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&¨\u0006'"}, m65681d2 = {"Lpj1/c;", "", "Lcom/whoop/healthconnect/domain/HealthConnectApi;", "healthConnectApi", "Ltr2/n;", "logger", "Lu92/d;", "sharedPreferences", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;", "records", "Lb7/b;", "client", "Lpj1/e;", "g", "(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lb7/b;Lq83/d;)Ljava/lang/Object;", "", "", "permissions", "", "d", "(Ljava/util/Set;)Ljava/util/List;", "f", "(Ljava/util/List;)Ljava/lang/String;", "healthConnectClient", "grantedPermissions", "Ll83/a0;", "e", "(Lb7/b;Ljava/util/Set;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/healthconnect/domain/HealthConnectApi;", "b", "Ltr2/n;", "c", "Lu92/d;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29299c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HealthConnectApi healthConnectApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: pj1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectWhoopRecordsWriter", m100430f = "HealthConnectWhoopRecordsWriter.kt", m100431l = {43, 54}, m100432m = "fetchAndMutateWhoopRecords", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f118617E;

        /* JADX INFO: renamed from: F */
        Object f118618F;

        /* JADX INFO: renamed from: G */
        Object f118619G;

        /* JADX INFO: renamed from: H */
        int f118620H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f118621I;

        /* JADX INFO: renamed from: K */
        int f118623K;

        /* JADX INFO: renamed from: w */
        Object f118624w;

        /* JADX INFO: renamed from: x */
        Object f118625x;

        /* JADX INFO: renamed from: y */
        Object f118626y;

        /* JADX INFO: renamed from: z */
        Object f118627z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118621I = obj;
            this.f118623K |= Integer.MIN_VALUE;
            return C29299c.this.m88943e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: pj1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectWhoopRecordsWriter$fetchAndMutateWhoopRecords$result$1", m100430f = "HealthConnectWhoopRecordsWriter.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f118628w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f118630y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<String> f118631z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, List<String> list, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f118630y = str;
            this.f118631z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C29299c.this.new b(this.f118630y, this.f118631z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118628w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HealthConnectApi healthConnectApi = C29299c.this.healthConnectApi;
            String str = this.f118630y;
            String strM88941f = C29299c.this.m88941f(this.f118631z);
            this.f118628w = 1;
            Object objFetchWhoopEvents = healthConnectApi.fetchWhoopEvents(str, strM88941f, this);
            return objFetchWhoopEvents == enumC31071a ? enumC31071a : objFetchWhoopEvents;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HealthConnectEventsResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: pj1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectWhoopRecordsWriter", m100430f = "HealthConnectWhoopRecordsWriter.kt", m100431l = {78, 79, 80, 81, 82, 83, 84, 85, 92, 93, 94, 95, 96, 97, 98, LogPriority.NONE, AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "mutateHealthConnectRecords", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f118632E;

        /* JADX INFO: renamed from: G */
        int f118634G;

        /* JADX INFO: renamed from: w */
        Object f118635w;

        /* JADX INFO: renamed from: x */
        Object f118636x;

        /* JADX INFO: renamed from: y */
        Object f118637y;

        /* JADX INFO: renamed from: z */
        int f118638z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f118632E = obj;
            this.f118634G |= Integer.MIN_VALUE;
            return C29299c.this.m88942g(null, null, this);
        }
    }

    public C29299c(HealthConnectApi healthConnectApi, InterfaceC34116n logger, C34660d sharedPreferences, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(healthConnectApi, "healthConnectApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.healthConnectApi = healthConnectApi;
        this.logger = logger;
        this.sharedPreferences = sharedPreferences;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: d */
    private final List<String> m88940d(Set<String> permissions) {
        Set<String> set = permissions;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) AbstractC25265s.m74112P0(AbstractC39414r.m125906y0((String) it.next(), new String[]{"."}, 6)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final String m88941f(List<String> permissions) {
        Iterator<T> it = permissions.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = AbstractC18489d0.m53370k((String) next, ",", (String) it.next());
        }
        return (String) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c3 A[Catch: Exception -> 0x01d7, PHI: r0 r5 r14 r16 r17
      0x02c3: PHI (r0v14 int) = (r0v12 int), (r0v15 int) binds: [B:100:0x02bf, B:57:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r5v25 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse) = 
      (r5v22 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
      (r5v27 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
     binds: [B:100:0x02bf, B:57:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r14v11 b7.b) = (r14v8 b7.b), (r14v13 b7.b) binds: [B:100:0x02bf, B:57:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r16v5 java.lang.Class<m7.a>) = (r16v3 java.lang.Class<m7.a>), (r16v6 java.lang.Class<m7.a>) binds: [B:100:0x02bf, B:57:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r17v5 java.lang.Class<m7.w>) = (r17v3 java.lang.Class<m7.w>), (r17v6 java.lang.Class<m7.w>) binds: [B:100:0x02bf, B:57:0x015e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02e4 A[Catch: Exception -> 0x01d7, LOOP:3: B:103:0x02de->B:105:0x02e4, LOOP_END, TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0304  */
    /* JADX WARN: Code duplicated, block: B:109:0x0306 A[Catch: Exception -> 0x01d7, PHI: r0 r5 r14 r16 r17
      0x0306: PHI (r0v16 int) = (r0v14 int), (r0v17 int) binds: [B:107:0x0302, B:54:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r5v28 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse) = 
      (r5v25 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
      (r5v30 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
     binds: [B:107:0x0302, B:54:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r14v14 b7.b) = (r14v11 b7.b), (r14v16 b7.b) binds: [B:107:0x0302, B:54:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r16v7 java.lang.Class<m7.a>) = (r16v5 java.lang.Class<m7.a>), (r16v8 java.lang.Class<m7.a>) binds: [B:107:0x0302, B:54:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r17v7 java.lang.Class<m7.w>) = (r17v5 java.lang.Class<m7.w>), (r17v8 java.lang.Class<m7.w>) binds: [B:107:0x0302, B:54:0x0147] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0327 A[Catch: Exception -> 0x01d7, LOOP:2: B:110:0x0321->B:112:0x0327, LOOP_END, TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0347  */
    /* JADX WARN: Code duplicated, block: B:116:0x0349 A[Catch: Exception -> 0x01d7, PHI: r0 r5 r14 r16 r17
      0x0349: PHI (r0v18 int) = (r0v16 int), (r0v19 int) binds: [B:114:0x0345, B:51:0x0130] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r5v31 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse) = 
      (r5v28 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
      (r5v33 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
     binds: [B:114:0x0345, B:51:0x0130] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r14v17 b7.b) = (r14v14 b7.b), (r14v19 b7.b) binds: [B:114:0x0345, B:51:0x0130] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r16v9 java.lang.Class<m7.a>) = (r16v7 java.lang.Class<m7.a>), (r16v10 java.lang.Class<m7.a>) binds: [B:114:0x0345, B:51:0x0130] A[DONT_GENERATE, DONT_INLINE]
      0x0349: PHI (r17v9 java.lang.Class<m7.w>) = (r17v7 java.lang.Class<m7.w>), (r17v10 java.lang.Class<m7.w>) binds: [B:114:0x0345, B:51:0x0130] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x036a A[Catch: Exception -> 0x01d7, LOOP:1: B:117:0x0364->B:119:0x036a, LOOP_END, TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x038a  */
    /* JADX WARN: Code duplicated, block: B:123:0x038c A[Catch: Exception -> 0x01d7, PHI: r0 r5 r14 r16 r17
      0x038c: PHI (r0v21 int) = (r0v18 int), (r0v22 int) binds: [B:121:0x0388, B:48:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r5v34 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse) = 
      (r5v31 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
      (r5v36 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
     binds: [B:121:0x0388, B:48:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r14v20 b7.b) = (r14v17 b7.b), (r14v22 b7.b) binds: [B:121:0x0388, B:48:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r16v11 java.lang.Class<m7.a>) = (r16v9 java.lang.Class<m7.a>), (r16v12 java.lang.Class<m7.a>) binds: [B:121:0x0388, B:48:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x038c: PHI (r17v11 java.lang.Class<m7.w>) = (r17v9 java.lang.Class<m7.w>), (r17v12 java.lang.Class<m7.w>) binds: [B:121:0x0388, B:48:0x0119] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x03ad A[Catch: Exception -> 0x01d7, LOOP:0: B:124:0x03a7->B:126:0x03ad, LOOP_END, TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:133:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:136:0x0411  */
    /* JADX WARN: Code duplicated, block: B:137:0x0413 A[Catch: Exception -> 0x04f2, PHI: r0 r5 r12
      0x0413: PHI (r0v27 int) = (r0v25 int), (r0v28 int) binds: [B:135:0x040f, B:36:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x0413: PHI (r5v43 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse) = 
      (r5v40 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
      (r5v45 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
     binds: [B:135:0x040f, B:36:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x0413: PHI (r12v17 b7.b) = (r12v15 b7.b), (r12v19 b7.b) binds: [B:135:0x040f, B:36:0x00d3] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x04f2, blocks: (B:160:0x04d1, B:156:0x04b2, B:152:0x0493, B:148:0x0474, B:144:0x0454, B:141:0x0433, B:137:0x0413, B:134:0x03f2, B:130:0x03d0), top: B:174:0x03d0 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0430  */
    /* JADX WARN: Code duplicated, block: B:140:0x0432  */
    /* JADX WARN: Code duplicated, block: B:143:0x0452  */
    /* JADX WARN: Code duplicated, block: B:144:0x0454 A[Catch: Exception -> 0x04f2, PHI: r0 r5 r11
      0x0454: PHI (r0v31 int) = (r0v29 int), (r0v32 int) binds: [B:142:0x0450, B:30:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r5v49 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse) = 
      (r5v46 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
      (r5v51 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
     binds: [B:142:0x0450, B:30:0x00ad] A[DONT_GENERATE, DONT_INLINE]
      0x0454: PHI (r11v6 b7.b) = (r11v3 b7.b), (r11v8 b7.b) binds: [B:142:0x0450, B:30:0x00ad] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x04f2, blocks: (B:160:0x04d1, B:156:0x04b2, B:152:0x0493, B:148:0x0474, B:144:0x0454, B:141:0x0433, B:137:0x0413, B:134:0x03f2, B:130:0x03d0), top: B:174:0x03d0 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0471  */
    /* JADX WARN: Code duplicated, block: B:147:0x0473  */
    /* JADX WARN: Code duplicated, block: B:150:0x0491  */
    /* JADX WARN: Code duplicated, block: B:151:0x0492  */
    /* JADX WARN: Code duplicated, block: B:154:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:155:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:158:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:174:0x03d0 A[EXC_TOP_SPLITTER, PHI: r0 r5 r14 r16 r17
      0x03d0: PHI (r0v23 int) = (r0v21 int), (r0v24 int) binds: [B:128:0x03cc, B:43:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x03d0: PHI (r5v37 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse) = 
      (r5v34 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
      (r5v39 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
     binds: [B:128:0x03cc, B:43:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x03d0: PHI (r14v23 b7.b) = (r14v20 b7.b), (r14v25 b7.b) binds: [B:128:0x03cc, B:43:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x03d0: PHI (r16v13 java.lang.Class<m7.a>) = (r16v11 java.lang.Class<m7.a>), (r16v14 java.lang.Class<m7.a>) binds: [B:128:0x03cc, B:43:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x03d0: PHI (r17v13 java.lang.Class<m7.w>) = (r17v11 java.lang.Class<m7.w>), (r17v14 java.lang.Class<m7.w>) binds: [B:128:0x03cc, B:43:0x00ff] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x021a A[Catch: Exception -> 0x01d7, LOOP:6: B:81:0x0214->B:83:0x021a, LOOP_END, TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x023a  */
    /* JADX WARN: Code duplicated, block: B:87:0x023c  */
    /* JADX WARN: Code duplicated, block: B:91:0x025e A[Catch: Exception -> 0x01d7, LOOP:5: B:89:0x0258->B:91:0x025e, LOOP_END, TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x027e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0280 A[Catch: Exception -> 0x01d7, PHI: r0 r5 r14 r16 r17
      0x0280: PHI (r0v12 int) = (r0v10 int), (r0v13 int) binds: [B:93:0x027c, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r5v22 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse) = 
      (r5v19 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
      (r5v24 com.whoop.healthconnect.domain.models.HealthConnectEventsResponse)
     binds: [B:93:0x027c, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r14v8 b7.b) = (r14v5 b7.b), (r14v10 b7.b) binds: [B:93:0x027c, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r16v3 java.lang.Class<m7.a>) = (r12v0 java.lang.Class<m7.a>), (r16v4 java.lang.Class<m7.a>) binds: [B:93:0x027c, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r17v3 java.lang.Class<m7.w>) = (r13v0 java.lang.Class<m7.w>), (r17v4 java.lang.Class<m7.w>) binds: [B:93:0x027c, B:60:0x0175] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02a1 A[Catch: Exception -> 0x01d7, LOOP:4: B:96:0x029b->B:98:0x02a1, LOOP_END, TryCatch #1 {Exception -> 0x01d7, blocks: (B:123:0x038c, B:124:0x03a7, B:126:0x03ad, B:127:0x03bb, B:116:0x0349, B:117:0x0364, B:119:0x036a, B:120:0x0378, B:109:0x0306, B:110:0x0321, B:112:0x0327, B:113:0x0335, B:102:0x02c3, B:103:0x02de, B:105:0x02e4, B:106:0x02f2, B:95:0x0280, B:96:0x029b, B:98:0x02a1, B:99:0x02af, B:88:0x023d, B:89:0x0258, B:91:0x025e, B:92:0x026c, B:80:0x01f5, B:81:0x0214, B:83:0x021a, B:84:0x0228, B:70:0x01b8, B:71:0x01c3, B:73:0x01c9, B:76:0x01dc), top: B:172:0x01b8 }] */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04ec, code lost:
    
        if (pj1.AbstractC29300d.m88946c(r7, r1, r2, r3) == r4) goto L162;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m88942g(com.whoop.healthconnect.domain.models.HealthConnectEventsResponse r19, p030b7.InterfaceC2773b r20, q83.InterfaceC30057d<? super pj1.EnumC29301e> r21) {
        /*
            Method dump skipped, instruction units count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pj1.C29299c.m88942g(com.whoop.healthconnect.domain.models.HealthConnectEventsResponse, b7.b, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:33:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c9 -> B:31:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ee -> B:28:0x00f1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public final java.lang.Object m88943e(p030b7.InterfaceC2773b r19, java.util.Set<java.lang.String> r20, q83.InterfaceC30057d<? super l83.C23454a0> r21) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pj1.C29299c.m88943e(b7.b, java.util.Set, q83.d):java.lang.Object");
    }

    public /* synthetic */ C29299c(HealthConnectApi healthConnectApi, InterfaceC34116n interfaceC34116n, C34660d c34660d, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(healthConnectApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HealthConnectWhoopRecordsWriter") : interfaceC34116n, c34660d, featureFlagChecker);
    }
}
