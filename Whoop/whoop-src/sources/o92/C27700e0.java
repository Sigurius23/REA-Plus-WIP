package o92;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import java.util.Map;
import l83.C23454a0;
import m92.AbstractC25319b;
import m92.C25323f;
import or2.C28169i0;
import org.joda.time.DateTime;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: o92.e0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lo92/e0;", "Lm92/b;", "Lo92/s;", "pushContext", "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;", "smartAlarmTriggerRepository", "<init>", "(Lo92/s;Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;", "", "J", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "logTag", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27700e0 extends AbstractC25319b {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final SmartAlarmTriggerRepository smartAlarmTriggerRepository;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.e0$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.SmartAlarmTriggeredPushNotification$perform$1", m100430f = "SmartAlarmTriggeredPushNotification.kt", m100431l = {28, 30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ DateTime f111551E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C25323f f111552F;

        /* JADX INFO: renamed from: w */
        Object f111553w;

        /* JADX INFO: renamed from: x */
        int f111554x;

        /* JADX INFO: renamed from: y */
        int f111555y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DateTime dateTime, C25323f c25323f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111551E = dateTime;
            this.f111552F = c25323f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27700e0.this.new a(this.f111551E, this.f111552F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            if (r1.sendPushNotificationMetric(r3, r6, r5) == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f111555y
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.f111553w
                java.lang.String r0 = (java.lang.String) r0
                p505ts.AbstractC34132o.m107864I(r6)
                goto L5b
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L34
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                o92.e0 r6 = o92.C27700e0.this
                com.whoop.data.repositories.SmartAlarmTriggerRepository r6 = o92.C27700e0.m83727A(r6)
                org.joda.time.DateTime r1 = r5.f111551E
                r5.f111555y = r3
                java.lang.Object r6 = r6.triggerSmartAlarmFromPush(r1, r5)
                if (r6 != r0) goto L34
                goto L5a
            L34:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5b
                m92.f r6 = r5.f111552F
                java.lang.String r6 = r6.m74370d()
                if (r6 == 0) goto L5b
                o92.e0 r1 = o92.C27700e0.this
                com.whoop.data.repositories.NotificationRepository r1 = o92.C27700e0.m83728z(r1)
                com.whoop.data.remote.domain.dto.PushNotificationMetricType r3 = com.whoop.data.remote.domain.dto.PushNotificationMetricType.FailedToOpen
                r4 = 0
                r5.f111553w = r4
                r4 = 0
                r5.f111554x = r4
                r5.f111555y = r2
                java.lang.Object r6 = r1.sendPushNotificationMetric(r3, r6, r5)
                if (r6 != r0) goto L5b
            L5a:
                return r0
            L5b:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o92.C27700e0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: o92.e0$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.notifications.SmartAlarmTriggeredPushNotification$perform$2", m100430f = "SmartAlarmTriggeredPushNotification.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C27700e0 f111557E;

        /* JADX INFO: renamed from: w */
        Object f111558w;

        /* JADX INFO: renamed from: x */
        int f111559x;

        /* JADX INFO: renamed from: y */
        int f111560y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25323f f111561z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C25323f c25323f, C27700e0 c27700e0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111561z = c25323f;
            this.f111557E = c27700e0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f111561z, this.f111557E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111560y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM74370d = this.f111561z.m74370d();
                if (strM74370d != null) {
                    NotificationRepository notificationRepository = this.f111557E.getNotificationRepository();
                    PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.FailedToOpen;
                    this.f111558w = null;
                    this.f111559x = 0;
                    this.f111560y = 1;
                    if (notificationRepository.sendPushNotificationMetric(pushNotificationMetricType, strM74370d, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27700e0(C27721s pushContext, SmartAlarmTriggerRepository smartAlarmTriggerRepository) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(smartAlarmTriggerRepository, "smartAlarmTriggerRepository");
        this.smartAlarmTriggerRepository = smartAlarmTriggerRepository;
        this.logTag = "SmartAlarmTriggeredPushNotification";
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        try {
            Object obj = ((Map) C28169i0.m85276f(dataMap.m74368b("data_payload"), Map.class)).get("alarm_triggered_time");
            DateTime dateTime = obj instanceof DateTime ? (DateTime) obj : null;
            m74350l().mo85216g("SmartAlarmTriggeredNotificationReceived", new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(getScope(), null, null, new a(dateTime, dataMap, null), 3);
        } catch (Exception unused) {
            AbstractC3006f0.m8732z(getScope(), null, null, new b(dataMap, this, null), 3);
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
