package com.whoop.service.network;

import com.whoop.data.remote.domain.dto.PushNotificationMetricBody;
import com.whoop.domain.model.NotificationNamespaceBody;
import com.whoop.domain.model.UserNotificationSettingsDto;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;
import xg3.C38280g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00182\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/NotificationApi;", "", "", "sourceId", "Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;", "body", "", "userId", "Lpg3/v0;", "Ll83/a0;", "sendNotificationMetricsUpdate", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;ILq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/UserNotificationSettingsDto;", "getUserNotificationSettings", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/NotificationNamespaceBody;", "disableNotification", "(Lcom/whoop/domain/model/NotificationNamespaceBody;Lq83/d;)Ljava/lang/Object;", "namespace", "enableNotification", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deviceId", "type", "application", "Lxg3/g;", "Ljava/lang/Void;", "registerPush", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lxg3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface NotificationApi {
    @InterfaceC37285p("notification-service/v1/notifications/user-settings/block/namespace")
    Object disableNotification(@InterfaceC37270a NotificationNamespaceBody notificationNamespaceBody, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37271b("notification-service/v1/notifications/user-settings/block/namespace/{namespace}")
    Object enableNotification(@InterfaceC37288s("namespace") String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37275f("notification-service/v1/notifications/user-settings/bff")
    Object getUserNotificationSettings(InterfaceC30057d<? super UserNotificationSettingsDto> interfaceC30057d);

    @InterfaceC37285p("notification-service/v0/push/{deviceId}")
    C38280g<C29218v0<Void>> registerPush(@InterfaceC37288s("deviceId") String deviceId, @InterfaceC37289t("type") String type, @InterfaceC37289t("application") String application);

    @InterfaceC37284o("notification-service/v1/notifications/{sourceId}/events")
    Object sendNotificationMetricsUpdate(@InterfaceC37288s("sourceId") String str, @InterfaceC37270a PushNotificationMetricBody pushNotificationMetricBody, @InterfaceC37289t("userId") int i13, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
