package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.NotificationCardModel;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/items/UnknownNotificationCard;", "Lcom/whoop/design/models/NotificationCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "androidFeatureFlagName", "getAndroidFeatureFlagName", "appNotificationType", "getAppNotificationType", "templateName", "getTemplateName", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UnknownNotificationCard implements NotificationCardModel, DesignSystemModel {
    public static final int $stable = 0;
    public static final UnknownNotificationCard INSTANCE = new UnknownNotificationCard();

    private UnknownNotificationCard() {
    }

    @Override // com.whoop.design.models.NotificationCardModel
    public String getAndroidFeatureFlagName() {
        return null;
    }

    @Override // com.whoop.design.models.NotificationCardModel
    public String getAppNotificationType() {
        return "unknown";
    }

    @Override // com.whoop.design.models.NotificationCardModel
    public String getId() {
        return "unknown";
    }

    @Override // com.whoop.design.models.NotificationCardModel
    public String getTemplateName() {
        return null;
    }
}
