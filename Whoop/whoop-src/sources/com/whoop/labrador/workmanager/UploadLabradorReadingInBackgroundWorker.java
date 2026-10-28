package com.whoop.labrador.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.labrador.domain.LabradorApi;
import com.whoop.labrador.feature.reading.domain.models.LabradorReadingSymptomsUpdateRequest;
import com.whoop.metrics.worker.BaseReportingWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import of3.InterfaceC27903a;
import p024b0.C2178b;
import p088dc.AbstractC11895b;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p218ic.InterfaceC18355e0;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u02.InterfaceC34385a;
import us1.InterfaceC35218a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m65681d2 = {"Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;", "requestBody", "Lu02/a;", "n", "(Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)Ljava/lang/Object;", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lcom/whoop/labrador/domain/LabradorApi;", "z", "Ll83/h;", "l", "()Lcom/whoop/labrador/domain/LabradorApi;", "labradorApi", "Lus1/a;", "E", "m", "()Lus1/a;", "labradorDao", "F", "a", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UploadLabradorReadingInBackgroundWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: G */
    public static final int f27063G = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h labradorDao;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h labradorApi;

    /* JADX INFO: renamed from: com.whoop.labrador.workmanager.UploadLabradorReadingInBackgroundWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;", "", "<init>", "()V", "", "timestamp", "", "strapSerial", "Lic/a0;", "b", "(JLjava/lang/String;)Lic/a0;", "a", "(J)Ljava/lang/String;", "Lic/p0;", "workManager", "Lic/e0;", "c", "(Lic/p0;JLjava/lang/String;)Lic/e0;", "TAG", "Ljava/lang/String;", "KEY_READING_TRAILING_TIMESTAMP", "KEY_STRAP_SERIAL", "DEFAULT_STRAP_SERIAL", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final String m22533a(long timestamp) {
            return AbstractC11895b.m31994m(timestamp, "UploadLabradorReadingInBackgroundWorker");
        }

        /* JADX INFO: renamed from: b */
        private final C18347a0 m22534b(long timestamp, String strapSerial) {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            C18354e c18354e = new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(new LinkedHashSet()));
            C18392z c18392z = new C18392z(UploadLabradorReadingInBackgroundWorker.class);
            C23465k[] c23465kArr = {new C23465k("trailingTimestamp", Long.valueOf(timestamp)), new C23465k("strapSerial", strapSerial)};
            C2178b c2178b = new C2178b(1);
            for (int i13 = 0; i13 < 2; i13++) {
                C23465k c23465k = c23465kArr[i13];
                c2178b.m6858d(c23465k.f92938x, (String) c23465k.f92937w);
            }
            return (C18347a0) ((C18392z) ((C18392z) ((C18392z) ((C18392z) ((C18392z) c18392z.m52882h(c2178b.m6856b())).m52877a("UploadLabradorReadingInBackgroundWorker")).m52877a("UploadLabradorReadingInBackgroundWorker" + timestamp)).m52880f(c18354e)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC18355e0 m22535c(AbstractC18377p0 workManager, long timestamp, String strapSerial) {
            AbstractC22676k.m65750j(workManager, "workManager");
            AbstractC22676k.m65750j(strapSerial, "strapSerial");
            return workManager.m52876e(m22533a(timestamp), EnumC18368l.f71504x, m22534b(timestamp, strapSerial));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.workmanager.UploadLabradorReadingInBackgroundWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9039b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f27067w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27068x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27069y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9039b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27067w = interfaceC27903a;
            this.f27068x = interfaceC35951a;
            this.f27069y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.labrador.domain.LabradorApi, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final LabradorApi invoke() {
            InterfaceC27903a interfaceC27903a = this.f27067w;
            InterfaceC35951a interfaceC35951a = this.f27068x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f27069y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LabradorApi.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.workmanager.UploadLabradorReadingInBackgroundWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9040c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f27070w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27071x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27072y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9040c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27070w = interfaceC27903a;
            this.f27071x = interfaceC35951a;
            this.f27072y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, us1.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC35218a invoke() {
            InterfaceC27903a interfaceC27903a = this.f27070w;
            InterfaceC35951a interfaceC35951a = this.f27071x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f27072y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC35218a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.workmanager.UploadLabradorReadingInBackgroundWorker$d */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.workmanager.UploadLabradorReadingInBackgroundWorker$uploadReadingInBackground$2", m100430f = "UploadLabradorReadingInBackgroundWorker.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9041d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f27073w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LabradorReadingSymptomsUpdateRequest f27075y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9041d(LabradorReadingSymptomsUpdateRequest labradorReadingSymptomsUpdateRequest, InterfaceC30057d<? super C9041d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f27075y = labradorReadingSymptomsUpdateRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return UploadLabradorReadingInBackgroundWorker.this.new C9041d(this.f27075y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f27073w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            LabradorApi labradorApiM22530l = UploadLabradorReadingInBackgroundWorker.this.m22530l();
            LabradorReadingSymptomsUpdateRequest labradorReadingSymptomsUpdateRequest = this.f27075y;
            this.f27073w = 1;
            Object objUpdateLabradorReadingSymptoms = labradorApiM22530l.updateLabradorReadingSymptoms(labradorReadingSymptomsUpdateRequest, this);
            return objUpdateLabradorReadingSymptoms == enumC31071a ? enumC31071a : objUpdateLabradorReadingSymptoms;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((C9041d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.workmanager.UploadLabradorReadingInBackgroundWorker$e */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.workmanager.UploadLabradorReadingInBackgroundWorker", m100430f = "UploadLabradorReadingInBackgroundWorker.kt", m100431l = {37, 53, 55}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9042e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f27076E;

        /* JADX INFO: renamed from: F */
        Object f27077F;

        /* JADX INFO: renamed from: G */
        Object f27078G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f27079H;

        /* JADX INFO: renamed from: J */
        int f27081J;

        /* JADX INFO: renamed from: w */
        long f27082w;

        /* JADX INFO: renamed from: x */
        Object f27083x;

        /* JADX INFO: renamed from: y */
        Object f27084y;

        /* JADX INFO: renamed from: z */
        Object f27085z;

        public C9042e(InterfaceC30057d<? super C9042e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f27079H = obj;
            this.f27081J |= Integer.MIN_VALUE;
            return UploadLabradorReadingInBackgroundWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadLabradorReadingInBackgroundWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "UploadLabradorReadingInBackgroundWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.labradorApi = AbstractC30060g.m92087G(enumC23463i, new C9039b(this, null, null));
        this.labradorDao = AbstractC30060g.m92087G(enumC23463i, new C9040c(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final LabradorApi m22530l() {
        return (LabradorApi) this.labradorApi.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC35218a m22531m() {
        return (InterfaceC35218a) this.labradorDao.getValue();
    }

    /* JADX INFO: renamed from: n */
    private final Object m22532n(LabradorReadingSymptomsUpdateRequest labradorReadingSymptomsUpdateRequest, InterfaceC30057d<? super InterfaceC34385a<?>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, m22895c(), null, "Failed to post new offline Labrador reading in background", new C9041d(labradorReadingSymptomsUpdateRequest, null), interfaceC30057d, 2, null);
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:48:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0122, code lost:
    
        if (r13.mo111567f(r7, true, r0) == r1) goto L43;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r13) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.labrador.workmanager.UploadLabradorReadingInBackgroundWorker.mo18568j(q83.d):java.lang.Object");
    }
}
