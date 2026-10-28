package com.whoop.settings.notification;

import com.whoop.domain.model.NotificationSettingDto;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsResponse;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.settings.notification.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/settings/notification/b;", "", "<init>", "()V", "a", "Lcom/whoop/settings/notification/b$a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10143b {

    /* JADX INFO: renamed from: com.whoop.settings.notification.b$a */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/settings/notification/b$a;", "Lcom/whoop/settings/notification/b;", "", "Lcom/whoop/domain/model/NotificationSettingDto;", "settings", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "shepherdSetting", "<init>", "(Ljava/util/List;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC10143b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<NotificationSettingDto> settings;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ShepherdToggleSettingsResponse shepherdSetting;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<NotificationSettingDto> settings, ShepherdToggleSettingsResponse shepherdToggleSettingsResponse) {
            super(null);
            AbstractC22676k.m65750j(settings, "settings");
            this.settings = settings;
            this.shepherdSetting = shepherdToggleSettingsResponse;
        }

        /* JADX INFO: renamed from: a */
        public final List<NotificationSettingDto> m25679a() {
            return this.settings;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ShepherdToggleSettingsResponse getShepherdSetting() {
            return this.shepherdSetting;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.settings, aVar.settings) && AbstractC22676k.m65745e(this.shepherdSetting, aVar.shepherdSetting);
        }

        public int hashCode() {
            int iHashCode = this.settings.hashCode() * 31;
            ShepherdToggleSettingsResponse shepherdToggleSettingsResponse = this.shepherdSetting;
            return iHashCode + (shepherdToggleSettingsResponse == null ? 0 : shepherdToggleSettingsResponse.hashCode());
        }

        public String toString() {
            return "Success(settings=" + this.settings + ", shepherdSetting=" + this.shepherdSetting + ")";
        }
    }

    public /* synthetic */ AbstractC10143b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10143b() {
    }
}
