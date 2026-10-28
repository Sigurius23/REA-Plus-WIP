package com.whoop.shepherd.feature.togglesettings.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.items.CtaSupplementalInfo;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
import com.whoop.design.models.items.TileBorderStyle;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)*B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, m65681d2 = {"Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "", "", "icon", "pageTitle", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;", "shepherdDetectionToggle", "shepherdNotificationToggle", "Lcom/whoop/design/models/items/CtaTileModel;", "ctaTile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;Lcom/whoop/design/models/items/CtaTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;Lcom/whoop/design/models/items/CtaTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "getPageTitle", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;", "getShepherdDetectionToggle", "()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleResponse;", "getShepherdDetectionToggle$annotations", "()V", "getShepherdNotificationToggle", "getShepherdNotificationToggle$annotations", "Lcom/whoop/design/models/items/CtaTileModel;", "getCtaTile", "()Lcom/whoop/design/models/items/CtaTileModel;", "Companion", "$serializer", "a", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class ShepherdToggleSettingsResponse {

    @SerializedName("cta_tile")
    private final CtaTileModel ctaTile;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("page_title")
    private final String pageTitle;

    @SerializedName("anf_detection_toggle")
    private final ShepherdToggleResponse shepherdDetectionToggle;

    @SerializedName("anf_notification_toggle")
    private final ShepherdToggleResponse shepherdNotificationToggle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CtaTileModel.$stable;

    /* JADX INFO: renamed from: com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdToggleSettingsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShepherdToggleSettingsResponse() {
        this((String) null, (String) null, (ShepherdToggleResponse) null, (ShepherdToggleResponse) null, (CtaTileModel) null, 31, (DefaultConstructorMarker) null);
    }

    @InterfaceC37143h("anf_detection_toggle")
    public static /* synthetic */ void getShepherdDetectionToggle$annotations() {
    }

    @InterfaceC37143h("anf_notification_toggle")
    public static /* synthetic */ void getShepherdNotificationToggle$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdToggleSettingsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.pageTitle, "")) {
            output.encodeStringElement(serialDesc, 1, self.pageTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2)) {
            output.encodeSerializableElement(serialDesc, 2, ShepherdToggleResponse$$serializer.INSTANCE, self.shepherdDetectionToggle);
        } else {
            if (!AbstractC22676k.m65745e(self.shepherdDetectionToggle, new ShepherdToggleResponse((String) null, (String) null, false, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 2, ShepherdToggleResponse$$serializer.INSTANCE, self.shepherdDetectionToggle);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3)) {
            output.encodeSerializableElement(serialDesc, 3, ShepherdToggleResponse$$serializer.INSTANCE, self.shepherdNotificationToggle);
        } else {
            if (!AbstractC22676k.m65745e(self.shepherdNotificationToggle, new ShepherdToggleResponse((String) null, (String) null, false, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 3, ShepherdToggleResponse$$serializer.INSTANCE, self.shepherdNotificationToggle);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4)) {
            if (AbstractC22676k.m65745e(self.ctaTile, new CtaTileModel((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, (C9598e) null, 65535, (DefaultConstructorMarker) null))) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 4, CtaTileModel$$serializer.INSTANCE, self.ctaTile);
    }

    public final CtaTileModel getCtaTile() {
        return this.ctaTile;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final ShepherdToggleResponse getShepherdDetectionToggle() {
        return this.shepherdDetectionToggle;
    }

    public final ShepherdToggleResponse getShepherdNotificationToggle() {
        return this.shepherdNotificationToggle;
    }

    public /* synthetic */ ShepherdToggleSettingsResponse(int i13, String str, String str2, ShepherdToggleResponse shepherdToggleResponse, ShepherdToggleResponse shepherdToggleResponse2, CtaTileModel ctaTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.icon = (i13 & 1) == 0 ? null : str;
        this.pageTitle = (i13 & 2) == 0 ? "" : str2;
        if ((i13 & 4) == 0) {
            this.shepherdDetectionToggle = new ShepherdToggleResponse((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
        } else {
            this.shepherdDetectionToggle = shepherdToggleResponse;
        }
        if ((i13 & 8) == 0) {
            this.shepherdNotificationToggle = new ShepherdToggleResponse((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
        } else {
            this.shepherdNotificationToggle = shepherdToggleResponse2;
        }
        if ((i13 & 16) == 0) {
            this.ctaTile = new CtaTileModel((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, (C9598e) null, 65535, (DefaultConstructorMarker) null);
        } else {
            this.ctaTile = ctaTileModel;
        }
    }

    public ShepherdToggleSettingsResponse(String str, String pageTitle, ShepherdToggleResponse shepherdDetectionToggle, ShepherdToggleResponse shepherdNotificationToggle, CtaTileModel ctaTile) {
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(shepherdDetectionToggle, "shepherdDetectionToggle");
        AbstractC22676k.m65750j(shepherdNotificationToggle, "shepherdNotificationToggle");
        AbstractC22676k.m65750j(ctaTile, "ctaTile");
        this.icon = str;
        this.pageTitle = pageTitle;
        this.shepherdDetectionToggle = shepherdDetectionToggle;
        this.shepherdNotificationToggle = shepherdNotificationToggle;
        this.ctaTile = ctaTile;
    }

    public /* synthetic */ ShepherdToggleSettingsResponse(String str, String str2, ShepherdToggleResponse shepherdToggleResponse, ShepherdToggleResponse shepherdToggleResponse2, CtaTileModel ctaTileModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? new ShepherdToggleResponse((String) null, (String) null, false, 7, (DefaultConstructorMarker) null) : shepherdToggleResponse, (i13 & 8) != 0 ? new ShepherdToggleResponse((String) null, (String) null, false, 7, (DefaultConstructorMarker) null) : shepherdToggleResponse2, (i13 & 16) != 0 ? new CtaTileModel((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, (C9598e) null, 65535, (DefaultConstructorMarker) null) : ctaTileModel);
    }
}
