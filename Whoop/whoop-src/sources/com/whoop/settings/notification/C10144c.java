package com.whoop.settings.notification;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.NotificationSettingDto;
import com.whoop.domain.model.UserNotificationSettingsDto;
import com.whoop.entitlements.Entitlement;
import com.whoop.service.network.NotificationApi;
import com.whoop.shepherd.domain.ShepherdApi;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ic2.C18397b;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import we1.InterfaceC37217a;

/* JADX INFO: renamed from: com.whoop.settings.notification.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Lcom/whoop/settings/notification/c;", "", "Lcom/whoop/service/network/NotificationApi;", "api", "Lcom/whoop/shepherd/domain/ShepherdApi;", "shepherdApi", "Lin2/d;", "dispatcher", "Lic2/b;", "analyticsManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwe1/a;", "entitlementChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/NotificationApi;Lcom/whoop/shepherd/domain/ShepherdApi;Lin2/d;Lic2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Ltr2/n;)V", "Lcom/whoop/settings/notification/b;", "k", "(Lq83/d;)Ljava/lang/Object;", "", "namespace", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "i", "", "isDetectionOn", "isNotificationOn", "l", "(ZZLq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lcom/whoop/settings/notification/a;", "upstream", "j", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/service/network/NotificationApi;", "b", "Lcom/whoop/shepherd/domain/ShepherdApi;", "c", "Lin2/d;", "d", "Lic2/b;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "Lwe1/a;", "g", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10144c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final NotificationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ShepherdApi shepherdApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18397b analyticsManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.settings.notification.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationInteractor$disableNotification$2", m100430f = "SettingsNotificationInteractor.kt", m100431l = {76, 79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/settings/notification/b;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/settings/notification/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30627w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f30629y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30629y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10144c.this.new a(this.f30629y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC10143b> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (r6 == r0) goto L18;
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
                int r1 = r5.f30627w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)     // Catch: java.lang.Exception -> L4e
                goto L4b
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)     // Catch: java.lang.Exception -> L4e
                goto L35
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                com.whoop.settings.notification.c r6 = com.whoop.settings.notification.C10144c.this     // Catch: java.lang.Exception -> L4e
                com.whoop.service.network.NotificationApi r6 = com.whoop.settings.notification.C10144c.m25684d(r6)     // Catch: java.lang.Exception -> L4e
                com.whoop.domain.model.NotificationNamespaceBody r1 = new com.whoop.domain.model.NotificationNamespaceBody     // Catch: java.lang.Exception -> L4e
                java.lang.String r4 = r5.f30629y     // Catch: java.lang.Exception -> L4e
                r1.<init>(r4)     // Catch: java.lang.Exception -> L4e
                r5.f30627w = r3     // Catch: java.lang.Exception -> L4e
                java.lang.Object r6 = r6.disableNotification(r1, r5)     // Catch: java.lang.Exception -> L4e
                if (r6 != r0) goto L35
                goto L4a
            L35:
                com.whoop.settings.notification.c r6 = com.whoop.settings.notification.C10144c.this     // Catch: java.lang.Exception -> L4e
                ic2.b r6 = com.whoop.settings.notification.C10144c.m25683c(r6)     // Catch: java.lang.Exception -> L4e
                java.lang.String r1 = r5.f30629y     // Catch: java.lang.Exception -> L4e
                r6.m52902c(r1)     // Catch: java.lang.Exception -> L4e
                com.whoop.settings.notification.c r6 = com.whoop.settings.notification.C10144c.this     // Catch: java.lang.Exception -> L4e
                r5.f30627w = r2     // Catch: java.lang.Exception -> L4e
                java.lang.Object r6 = com.whoop.settings.notification.C10144c.m25686f(r6, r5)     // Catch: java.lang.Exception -> L4e
                if (r6 != r0) goto L4b
            L4a:
                return r0
            L4b:
                com.whoop.settings.notification.b r6 = (com.whoop.settings.notification.AbstractC10143b) r6     // Catch: java.lang.Exception -> L4e
                return r6
            L4e:
                com.whoop.settings.notification.b$a r6 = new com.whoop.settings.notification.b$a
                m83.y r0 = m83.C25271y.f99162w
                r1 = 0
                r6.<init>(r0, r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.notification.C10144c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationInteractor$enableNotification$2", m100430f = "SettingsNotificationInteractor.kt", m100431l = {87, 90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/settings/notification/b;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/settings/notification/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30630w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f30632y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30632y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10144c.this.new b(this.f30632y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC10143b> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            if (r5 == r0) goto L18;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f30630w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)     // Catch: java.lang.Exception -> L49
                goto L46
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)     // Catch: java.lang.Exception -> L49
                goto L30
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                com.whoop.settings.notification.c r5 = com.whoop.settings.notification.C10144c.this     // Catch: java.lang.Exception -> L49
                com.whoop.service.network.NotificationApi r5 = com.whoop.settings.notification.C10144c.m25684d(r5)     // Catch: java.lang.Exception -> L49
                java.lang.String r1 = r4.f30632y     // Catch: java.lang.Exception -> L49
                r4.f30630w = r3     // Catch: java.lang.Exception -> L49
                java.lang.Object r5 = r5.enableNotification(r1, r4)     // Catch: java.lang.Exception -> L49
                if (r5 != r0) goto L30
                goto L45
            L30:
                com.whoop.settings.notification.c r5 = com.whoop.settings.notification.C10144c.this     // Catch: java.lang.Exception -> L49
                ic2.b r5 = com.whoop.settings.notification.C10144c.m25683c(r5)     // Catch: java.lang.Exception -> L49
                java.lang.String r1 = r4.f30632y     // Catch: java.lang.Exception -> L49
                r5.m52903d(r1)     // Catch: java.lang.Exception -> L49
                com.whoop.settings.notification.c r5 = com.whoop.settings.notification.C10144c.this     // Catch: java.lang.Exception -> L49
                r4.f30630w = r2     // Catch: java.lang.Exception -> L49
                java.lang.Object r5 = com.whoop.settings.notification.C10144c.m25686f(r5, r4)     // Catch: java.lang.Exception -> L49
                if (r5 != r0) goto L46
            L45:
                return r0
            L46:
                com.whoop.settings.notification.b r5 = (com.whoop.settings.notification.AbstractC10143b) r5     // Catch: java.lang.Exception -> L49
                return r5
            L49:
                com.whoop.settings.notification.b$a r5 = new com.whoop.settings.notification.b$a
                m83.y r0 = m83.C25271y.f99162w
                r1 = 0
                r5.<init>(r0, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.notification.C10144c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f30633w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10144c f30634x;

        /* JADX INFO: renamed from: com.whoop.settings.notification.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f30635w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10144c f30636x;

            /* JADX INFO: renamed from: com.whoop.settings.notification.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationInteractor$interact$$inlined$map$1$2", m100430f = "SettingsNotificationInteractor.kt", m100431l = {54, 57, 59, 62, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41417a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f30637E;

                /* JADX INFO: renamed from: F */
                Object f30638F;

                /* JADX INFO: renamed from: G */
                Object f30639G;

                /* JADX INFO: renamed from: H */
                Object f30640H;

                /* JADX INFO: renamed from: I */
                Object f30641I;

                /* JADX INFO: renamed from: J */
                Object f30642J;

                /* JADX INFO: renamed from: K */
                int f30643K;

                /* JADX INFO: renamed from: L */
                int f30644L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f30645w;

                /* JADX INFO: renamed from: x */
                int f30646x;

                /* JADX INFO: renamed from: y */
                Object f30647y;

                public C41417a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f30645w = obj;
                    this.f30646x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C10144c c10144c) {
                this.f30635w = interfaceC13062m;
                this.f30636x = c10144c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
            
                if (r12 == r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
            
                r11 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
            
                if (r12 == r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
            
                if (r12 == r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
            
                if (r12 == r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0125, code lost:
            
                if (r2.emit(r12, r0) == r1) goto L42;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, q83.InterfaceC30057d r12) {
                /*
                    Method dump skipped, instruction units count: 305
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.notification.C10144c.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C10144c c10144c) {
            this.f30633w = interfaceC13058l;
            this.f30634x = c10144c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f30633w.collect(new a(interfaceC13062m, this.f30634x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationInteractor", m100430f = "SettingsNotificationInteractor.kt", m100431l = {47, 59}, m100432m = "refresh", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f30649E;

        /* JADX INFO: renamed from: w */
        Object f30650w;

        /* JADX INFO: renamed from: x */
        Object f30651x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f30652y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30652y = obj;
            this.f30649E |= Integer.MIN_VALUE;
            return C10144c.this.m25690k(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationInteractor$refresh$settingsResult$1", m100430f = "SettingsNotificationInteractor.kt", m100431l = {47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/domain/model/UserNotificationSettingsDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f30654w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10144c.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30654w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            NotificationApi notificationApi = C10144c.this.api;
            this.f30654w = 1;
            Object userNotificationSettings = notificationApi.getUserNotificationSettings(this);
            return userNotificationSettings == enumC31071a ? enumC31071a : userNotificationSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UserNotificationSettingsDto> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationInteractor$refresh$shepherdResult$1", m100430f = "SettingsNotificationInteractor.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f30656w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10144c.this.new f(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30656w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C10144c.this.shepherdApi;
            this.f30656w = 1;
            Object shepherdToggleSettings = shepherdApi.getShepherdToggleSettings(this);
            return shepherdToggleSettings == enumC31071a ? enumC31071a : shepherdToggleSettings;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdToggleSettingsResponse> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.notification.c$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationInteractor$updateShepherdNotification$2", m100430f = "SettingsNotificationInteractor.kt", m100431l = {LogPriority.NONE, 102}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/settings/notification/b;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/settings/notification/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C10144c f30658E;

        /* JADX INFO: renamed from: w */
        Object f30659w;

        /* JADX INFO: renamed from: x */
        int f30660x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f30661y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f30662z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z4, boolean z13, C10144c c10144c, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30661y = z4;
            this.f30662z = z13;
            this.f30658E = c10144c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f30661y, this.f30662z, this.f30658E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC10143b> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            if (r7 == r0) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f30660x
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r6.f30659w
                com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsUpdateRequest r0 = (com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsUpdateRequest) r0
                p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Exception -> L5f
                goto L5c
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r1 = r6.f30659w
                com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsUpdateRequest r1 = (com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsUpdateRequest) r1
                p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Exception -> L5f
                goto L42
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsUpdateRequest r7 = new com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsUpdateRequest     // Catch: java.lang.Exception -> L5f
                boolean r1 = r6.f30661y     // Catch: java.lang.Exception -> L5f
                boolean r5 = r6.f30662z     // Catch: java.lang.Exception -> L5f
                r7.<init>(r1, r5)     // Catch: java.lang.Exception -> L5f
                com.whoop.settings.notification.c r1 = r6.f30658E     // Catch: java.lang.Exception -> L5f
                com.whoop.shepherd.domain.ShepherdApi r1 = com.whoop.settings.notification.C10144c.m25685e(r1)     // Catch: java.lang.Exception -> L5f
                r6.f30659w = r4     // Catch: java.lang.Exception -> L5f
                r6.f30660x = r3     // Catch: java.lang.Exception -> L5f
                java.lang.Object r7 = r1.updateShepherdToggleSettings(r7, r6)     // Catch: java.lang.Exception -> L5f
                if (r7 != r0) goto L42
                goto L5b
            L42:
                com.whoop.settings.notification.c r7 = r6.f30658E     // Catch: java.lang.Exception -> L5f
                ic2.b r7 = com.whoop.settings.notification.C10144c.m25683c(r7)     // Catch: java.lang.Exception -> L5f
                java.lang.String r1 = "Arrhythmia Notification"
                boolean r3 = r6.f30662z     // Catch: java.lang.Exception -> L5f
                r7.m52904e(r1, r3)     // Catch: java.lang.Exception -> L5f
                com.whoop.settings.notification.c r7 = r6.f30658E     // Catch: java.lang.Exception -> L5f
                r6.f30659w = r4     // Catch: java.lang.Exception -> L5f
                r6.f30660x = r2     // Catch: java.lang.Exception -> L5f
                java.lang.Object r7 = com.whoop.settings.notification.C10144c.m25686f(r7, r6)     // Catch: java.lang.Exception -> L5f
                if (r7 != r0) goto L5c
            L5b:
                return r0
            L5c:
                com.whoop.settings.notification.b r7 = (com.whoop.settings.notification.AbstractC10143b) r7     // Catch: java.lang.Exception -> L5f
                return r7
            L5f:
                com.whoop.settings.notification.b$a r7 = new com.whoop.settings.notification.b$a
                m83.y r0 = m83.C25271y.f99162w
                r7.<init>(r0, r4)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.settings.notification.C10144c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C10144c(NotificationApi api, ShepherdApi shepherdApi, InterfaceC18732d dispatcher, C18397b analyticsManager, FeatureFlagChecker featureFlagChecker, InterfaceC37217a entitlementChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(shepherdApi, "shepherdApi");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.shepherdApi = shepherdApi;
        this.dispatcher = dispatcher;
        this.analyticsManager = analyticsManager;
        this.featureFlagChecker = featureFlagChecker;
        this.entitlementChecker = entitlementChecker;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final Object m25688h(String str, InterfaceC30057d<? super AbstractC10143b> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher.mo54465b(), new a(str, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Object m25689i(String str, InterfaceC30057d<? super AbstractC10143b> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher.mo54465b(), new b(str, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m25690k(InterfaceC30057d<? super AbstractC10143b> interfaceC30057d) {
        d dVar;
        List<NotificationSettingDto> settings;
        List<NotificationSettingDto> list;
        InterfaceC34385a interfaceC34385a;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f30649E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f30649E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f30652y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f30649E;
        ShepherdToggleSettingsResponse shepherdToggleSettingsResponse = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(null);
            dVar2.f30649E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch settings notifications", eVar, dVar2, 2, null);
            if (objM108729b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objM108729b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) dVar2.f30651x;
            AbstractC34132o.m107864I(objM108729b);
        }
        interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            shepherdToggleSettingsResponse = (ShepherdToggleSettingsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        } else if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        settings = list;
        return new AbstractC10143b.a(settings, shepherdToggleSettingsResponse);
        InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a2 instanceof InterfaceC34385a.c) {
            settings = ((UserNotificationSettingsDto) ((InterfaceC34385a.c) interfaceC34385a2).m108735a()).getSettings();
        } else {
            if (!(interfaceC34385a2 instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            settings = C25271y.f99162w;
        }
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.SHEPHERD_NOTIFICATION_FEATURE_ANDROID) && this.entitlementChecker.mo119272b(Entitlement.SHEPHERD)) {
            InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n2 = this.logger;
            f fVar = new f(null);
            dVar2.f30650w = null;
            dVar2.f30651x = settings;
            dVar2.f30649E = 2;
            Object objM108729b2 = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, "Failed to fetch shepherd settings", fVar, dVar2, 2, null);
            if (objM108729b2 != enumC31071a) {
                list = settings;
                objM108729b = objM108729b2;
                interfaceC34385a = (InterfaceC34385a) objM108729b;
                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                    shepherdToggleSettingsResponse = (ShepherdToggleSettingsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
                } else if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                settings = list;
            }
            return enumC31071a;
        }
        return new AbstractC10143b.a(settings, shepherdToggleSettingsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final Object m25691l(boolean z4, boolean z13, InterfaceC30057d<? super AbstractC10143b> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher.mo54465b(), new g(z4, z13, this, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m25692j(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new c(upstream, this);
    }
}
