package qj1;

import com.whoop.healthconnect.domain.HealthConnectApi;
import com.whoop.healthconnect.domain.models.HealthConnectBodyMeasurementModelKt;
import com.whoop.healthconnect.domain.models.HealthConnectBodyMeasurementRequestBody;
import com.whoop.healthconnect.domain.models.HealthConnectDeletedRecordModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p322m7.C25149h0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rj1.AbstractC31488b;
import rj1.C31487a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;

/* JADX INFO: renamed from: qj1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u0016\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lqj1/e;", "Lqj1/a;", "Lm7/h0;", "Lu92/d;", "sharedPreferences", "Ljava/time/Clock;", "clock", "Lcom/whoop/healthconnect/domain/HealthConnectApi;", "healthConnectApi", "Ltr2/n;", "logger", "Lrj1/a;", "healthConnectIntentActivityMatcher", "<init>", "(Lu92/d;Ljava/time/Clock;Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lrj1/a;)V", "", "records", "", "deletions", "", "isInitialImport", "isTokenRefreshImport", "g", "(Ljava/util/List;Ljava/util/List;ZZLq83/d;)Ljava/lang/Object;", "f", "Lcom/whoop/healthconnect/domain/HealthConnectApi;", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lrj1/a;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30432e extends AbstractC30428a<C25149h0> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final HealthConnectApi healthConnectApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C31487a healthConnectIntentActivityMatcher;

    /* JADX INFO: renamed from: qj1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.recordmanagers.HealthConnectLeanBodyMassManager$handleRecords$2", m100430f = "HealthConnectLeanBodyMassManager.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"", "Lm7/h0;", "recordsChunk", "", "deletionsChunk", "Lpg3/v0;", "Ll83/a0;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f125027E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f125028F;

        /* JADX INFO: renamed from: w */
        int f125029w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f125030x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125031y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, boolean z13, InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f125027E = z4;
            this.f125028F = z13;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<C25149h0> list, List<String> list2, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            a aVar = C30432e.this.new a(this.f125027E, this.f125028F, interfaceC30057d);
            aVar.f125030x = list;
            aVar.f125031y = list2;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f125030x;
            List list2 = (List) this.f125031y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125029w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HealthConnectApi healthConnectApi = C30432e.this.healthConnectApi;
            List list3 = list;
            C30432e c30432e = C30432e.this;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(HealthConnectBodyMeasurementModelKt.toModel((C25149h0) it.next(), c30432e.healthConnectIntentActivityMatcher));
            }
            List list4 = list2;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new HealthConnectDeletedRecordModel((String) it3.next(), "LeanBodyMassRecord"));
            }
            HealthConnectBodyMeasurementRequestBody healthConnectBodyMeasurementRequestBody = new HealthConnectBodyMeasurementRequestBody(arrayList, arrayList2, this.f125027E, this.f125028F);
            this.f125030x = null;
            this.f125031y = null;
            this.f125029w = 1;
            Object objSendBodyMeasurementRecords = healthConnectApi.sendBodyMeasurementRecords(healthConnectBodyMeasurementRequestBody, this);
            return objSendBodyMeasurementRecords == enumC31071a ? enumC31071a : objSendBodyMeasurementRecords;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30432e(C34660d sharedPreferences, Clock clock, HealthConnectApi healthConnectApi, InterfaceC34116n logger, C31487a healthConnectIntentActivityMatcher) {
        super(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25149h0.class), "lean_body_mass_records", sharedPreferences, clock, logger);
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(healthConnectApi, "healthConnectApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(healthConnectIntentActivityMatcher, "healthConnectIntentActivityMatcher");
        this.healthConnectApi = healthConnectApi;
        this.logger = logger;
        this.healthConnectIntentActivityMatcher = healthConnectIntentActivityMatcher;
    }

    @Override // qj1.AbstractC30428a
    /* JADX INFO: renamed from: g */
    public Object mo93049g(List<C25149h0> list, List<String> list2, boolean z4, boolean z13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC31488b.INSTANCE.m96984a(list, list2, this.logger, new a(z4, z13, null), interfaceC30057d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C30432e(C34660d c34660d, Clock clock, HealthConnectApi healthConnectApi, InterfaceC34116n interfaceC34116n, C31487a c31487a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(c34660d, clock, healthConnectApi, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HealthConnectLeanBodyMassManager") : interfaceC34116n, c31487a);
    }
}
