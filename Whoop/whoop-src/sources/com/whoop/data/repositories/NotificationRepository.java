package com.whoop.data.repositories;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.service.network.NotificationApi;
import in2.InterfaceC18732d;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import od1.C27858u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/data/repositories/NotificationRepository;", "", "Lcom/whoop/service/network/NotificationApi;", "remoteService", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "Lod1/u;", "userContext", "<init>", "(Lcom/whoop/service/network/NotificationApi;Ltr2/n;Lrr2/c;Lin2/d;Lod1/u;)V", "Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;", "type", "", "sourceId", "", "sendPushNotificationMetric", "(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/service/network/NotificationApi;", "Ltr2/n;", "Lrr2/c;", "Lin2/d;", "Lod1/u;", "", "notificationStatusList", "Ljava/util/List;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NotificationRepository {
    private final InterfaceC31766c crashReporter;
    private final InterfaceC18732d dispatcherFactory;
    private final InterfaceC34116n logger;
    private final List<String> notificationStatusList;
    private final NotificationApi remoteService;
    private final C27858u userContext;

    /* JADX INFO: renamed from: com.whoop.data.repositories.NotificationRepository$sendPushNotificationMetric$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.NotificationRepository$sendPushNotificationMetric$2", m100430f = "NotificationRepository.kt", m100431l = {34, 40, 50, 60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66062 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $sourceId;
        final /* synthetic */ PushNotificationMetricType $type;
        int label;
        final /* synthetic */ NotificationRepository this$0;

        /* JADX INFO: renamed from: com.whoop.data.repositories.NotificationRepository$sendPushNotificationMetric$2$WhenMappings */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PushNotificationMetricType.values().length];
                try {
                    iArr[PushNotificationMetricType.Delivered.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PushNotificationMetricType.Opened.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PushNotificationMetricType.FailedToDisplay.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PushNotificationMetricType.FailedToOpen.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66062(PushNotificationMetricType pushNotificationMetricType, NotificationRepository notificationRepository, String str, InterfaceC30057d<? super C66062> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$type = pushNotificationMetricType;
            this.this$0 = notificationRepository;
            this.$sourceId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C66062(this.$type, this.this$0, this.$sourceId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C66062) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0149, code lost:
        
            if (r8.sendNotificationMetricsUpdate(r1, r2, r3, r7) == r0) goto L43;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.NotificationRepository.C66062.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public NotificationRepository(NotificationApi remoteService, InterfaceC34116n logger, InterfaceC31766c crashReporter, InterfaceC18732d dispatcherFactory, C27858u userContext) {
        AbstractC22676k.m65750j(remoteService, "remoteService");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(userContext, "userContext");
        this.remoteService = remoteService;
        this.logger = logger;
        this.crashReporter = crashReporter;
        this.dispatcherFactory = dispatcherFactory;
        this.userContext = userContext;
        this.notificationStatusList = new ArrayList();
    }

    public final Object sendPushNotificationMetric(PushNotificationMetricType pushNotificationMetricType, String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C66062(pushNotificationMetricType, this, str, null), interfaceC30057d);
    }
}
