package com.whoop.shepherd.feature.notificationhistory.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.items.CtaSupplementalInfo;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
import com.whoop.design.models.items.TileBorderStyle;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012Bs\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b/\u0010.Jn\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\"J\u0010\u00103\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010(R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010*R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bH\u0010.¨\u0006K"}, m65681d2 = {"Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "", "", "icon", "pageTitle", "body", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;", "pageHeader", "Lcom/whoop/design/models/items/CtaTileModel;", "settingsCta", "", "detectionOn", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;", "shepherdHistory", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;", "clearHistoryDialog", "clearRecordDialog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;", "component5", "()Lcom/whoop/design/models/items/CtaTileModel;", "component6", "()Z", "component7", "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;", "component8", "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getPageTitle", "getBody", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;", "getPageHeader", "Lcom/whoop/design/models/items/CtaTileModel;", "getSettingsCta", "Z", "getDetectionOn", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;", "getShepherdHistory", "getShepherdHistory$annotations", "()V", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;", "getClearHistoryDialog", "getClearRecordDialog", "Companion", "$serializer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdNotificationHistoryResponse {

    @SerializedName("body")
    private final String body;

    @SerializedName("clear_history_dialog")
    private final ShepherdClearHistoryDialogResponse clearHistoryDialog;

    @SerializedName("clear_record_dialog")
    private final ShepherdClearHistoryDialogResponse clearRecordDialog;

    @SerializedName("detection_on")
    private final boolean detectionOn;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("page_header")
    private final PageHeaderResponse pageHeader;

    @SerializedName("page_title")
    private final String pageTitle;

    @SerializedName("settings_cta")
    private final CtaTileModel settingsCta;

    @SerializedName("afib_history_box")
    private final ShepherdHistoryResponse shepherdHistory;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdNotificationHistoryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdNotificationHistoryResponse(int i13, String str, String str2, String str3, PageHeaderResponse pageHeaderResponse, CtaTileModel ctaTileModel, boolean z4, ShepherdHistoryResponse shepherdHistoryResponse, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse2, SerializationConstructorMarker serializationConstructorMarker) {
        if (495 != (i13 & 495)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 495, ShepherdNotificationHistoryResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.pageTitle = str2;
        this.body = str3;
        this.pageHeader = pageHeaderResponse;
        if ((i13 & 16) == 0) {
            this.settingsCta = new CtaTileModel((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, (C9598e) null, 65535, (DefaultConstructorMarker) null);
        } else {
            this.settingsCta = ctaTileModel;
        }
        this.detectionOn = z4;
        this.shepherdHistory = shepherdHistoryResponse;
        this.clearHistoryDialog = shepherdClearHistoryDialogResponse;
        this.clearRecordDialog = shepherdClearHistoryDialogResponse2;
    }

    public static /* synthetic */ ShepherdNotificationHistoryResponse copy$default(ShepherdNotificationHistoryResponse shepherdNotificationHistoryResponse, String str, String str2, String str3, PageHeaderResponse pageHeaderResponse, CtaTileModel ctaTileModel, boolean z4, ShepherdHistoryResponse shepherdHistoryResponse, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdNotificationHistoryResponse.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = shepherdNotificationHistoryResponse.pageTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = shepherdNotificationHistoryResponse.body;
        }
        if ((i13 & 8) != 0) {
            pageHeaderResponse = shepherdNotificationHistoryResponse.pageHeader;
        }
        if ((i13 & 16) != 0) {
            ctaTileModel = shepherdNotificationHistoryResponse.settingsCta;
        }
        if ((i13 & 32) != 0) {
            z4 = shepherdNotificationHistoryResponse.detectionOn;
        }
        if ((i13 & 64) != 0) {
            shepherdHistoryResponse = shepherdNotificationHistoryResponse.shepherdHistory;
        }
        if ((i13 & 128) != 0) {
            shepherdClearHistoryDialogResponse = shepherdNotificationHistoryResponse.clearHistoryDialog;
        }
        if ((i13 & 256) != 0) {
            shepherdClearHistoryDialogResponse2 = shepherdNotificationHistoryResponse.clearRecordDialog;
        }
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse3 = shepherdClearHistoryDialogResponse;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse4 = shepherdClearHistoryDialogResponse2;
        boolean z13 = z4;
        ShepherdHistoryResponse shepherdHistoryResponse2 = shepherdHistoryResponse;
        CtaTileModel ctaTileModel2 = ctaTileModel;
        String str4 = str3;
        return shepherdNotificationHistoryResponse.copy(str, str2, str4, pageHeaderResponse, ctaTileModel2, z13, shepherdHistoryResponse2, shepherdClearHistoryDialogResponse3, shepherdClearHistoryDialogResponse4);
    }

    @InterfaceC37143h("afib_history_box")
    public static /* synthetic */ void getShepherdHistory$annotations() {
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdNotificationHistoryResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.pageTitle);
        output.encodeStringElement(serialDesc, 2, self.body);
        output.encodeSerializableElement(serialDesc, 3, PageHeaderResponse$$serializer.INSTANCE, self.pageHeader);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.settingsCta, new CtaTileModel((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, (C9598e) null, 65535, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 4, CtaTileModel$$serializer.INSTANCE, self.settingsCta);
        }
        output.encodeBooleanElement(serialDesc, 5, self.detectionOn);
        output.encodeSerializableElement(serialDesc, 6, ShepherdHistoryResponse$$serializer.INSTANCE, self.shepherdHistory);
        ShepherdClearHistoryDialogResponse$$serializer shepherdClearHistoryDialogResponse$$serializer = ShepherdClearHistoryDialogResponse$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 7, shepherdClearHistoryDialogResponse$$serializer, self.clearHistoryDialog);
        output.encodeNullableSerializableElement(serialDesc, 8, shepherdClearHistoryDialogResponse$$serializer, self.clearRecordDialog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PageHeaderResponse getPageHeader() {
        return this.pageHeader;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CtaTileModel getSettingsCta() {
        return this.settingsCta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDetectionOn() {
        return this.detectionOn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ShepherdHistoryResponse getShepherdHistory() {
        return this.shepherdHistory;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ShepherdClearHistoryDialogResponse getClearHistoryDialog() {
        return this.clearHistoryDialog;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ShepherdClearHistoryDialogResponse getClearRecordDialog() {
        return this.clearRecordDialog;
    }

    public final ShepherdNotificationHistoryResponse copy(String icon, String pageTitle, String body, PageHeaderResponse pageHeader, CtaTileModel settingsCta, boolean detectionOn, ShepherdHistoryResponse shepherdHistory, ShepherdClearHistoryDialogResponse clearHistoryDialog, ShepherdClearHistoryDialogResponse clearRecordDialog) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(pageHeader, "pageHeader");
        AbstractC22676k.m65750j(settingsCta, "settingsCta");
        AbstractC22676k.m65750j(shepherdHistory, "shepherdHistory");
        return new ShepherdNotificationHistoryResponse(icon, pageTitle, body, pageHeader, settingsCta, detectionOn, shepherdHistory, clearHistoryDialog, clearRecordDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdNotificationHistoryResponse)) {
            return false;
        }
        ShepherdNotificationHistoryResponse shepherdNotificationHistoryResponse = (ShepherdNotificationHistoryResponse) other;
        return AbstractC22676k.m65745e(this.icon, shepherdNotificationHistoryResponse.icon) && AbstractC22676k.m65745e(this.pageTitle, shepherdNotificationHistoryResponse.pageTitle) && AbstractC22676k.m65745e(this.body, shepherdNotificationHistoryResponse.body) && AbstractC22676k.m65745e(this.pageHeader, shepherdNotificationHistoryResponse.pageHeader) && AbstractC22676k.m65745e(this.settingsCta, shepherdNotificationHistoryResponse.settingsCta) && this.detectionOn == shepherdNotificationHistoryResponse.detectionOn && AbstractC22676k.m65745e(this.shepherdHistory, shepherdNotificationHistoryResponse.shepherdHistory) && AbstractC22676k.m65745e(this.clearHistoryDialog, shepherdNotificationHistoryResponse.clearHistoryDialog) && AbstractC22676k.m65745e(this.clearRecordDialog, shepherdNotificationHistoryResponse.clearRecordDialog);
    }

    public final String getBody() {
        return this.body;
    }

    public final ShepherdClearHistoryDialogResponse getClearHistoryDialog() {
        return this.clearHistoryDialog;
    }

    public final ShepherdClearHistoryDialogResponse getClearRecordDialog() {
        return this.clearRecordDialog;
    }

    public final boolean getDetectionOn() {
        return this.detectionOn;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final PageHeaderResponse getPageHeader() {
        return this.pageHeader;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final CtaTileModel getSettingsCta() {
        return this.settingsCta;
    }

    public final ShepherdHistoryResponse getShepherdHistory() {
        return this.shepherdHistory;
    }

    public int hashCode() {
        int iHashCode = (this.shepherdHistory.hashCode() + AbstractC2875y.m8289b((this.settingsCta.hashCode() + ((this.pageHeader.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.pageTitle), 31, this.body)) * 31)) * 31, 31, this.detectionOn)) * 31;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse = this.clearHistoryDialog;
        int iHashCode2 = (iHashCode + (shepherdClearHistoryDialogResponse == null ? 0 : shepherdClearHistoryDialogResponse.hashCode())) * 31;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse2 = this.clearRecordDialog;
        return iHashCode2 + (shepherdClearHistoryDialogResponse2 != null ? shepherdClearHistoryDialogResponse2.hashCode() : 0);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.pageTitle;
        String str3 = this.body;
        PageHeaderResponse pageHeaderResponse = this.pageHeader;
        CtaTileModel ctaTileModel = this.settingsCta;
        boolean z4 = this.detectionOn;
        ShepherdHistoryResponse shepherdHistoryResponse = this.shepherdHistory;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse = this.clearHistoryDialog;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse2 = this.clearRecordDialog;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShepherdNotificationHistoryResponse(icon=", str, ", pageTitle=", str2, ", body=");
        sbM32001t.append(str3);
        sbM32001t.append(", pageHeader=");
        sbM32001t.append(pageHeaderResponse);
        sbM32001t.append(", settingsCta=");
        sbM32001t.append(ctaTileModel);
        sbM32001t.append(", detectionOn=");
        sbM32001t.append(z4);
        sbM32001t.append(", shepherdHistory=");
        sbM32001t.append(shepherdHistoryResponse);
        sbM32001t.append(", clearHistoryDialog=");
        sbM32001t.append(shepherdClearHistoryDialogResponse);
        sbM32001t.append(", clearRecordDialog=");
        sbM32001t.append(shepherdClearHistoryDialogResponse2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ShepherdNotificationHistoryResponse(String icon, String pageTitle, String body, PageHeaderResponse pageHeader, CtaTileModel settingsCta, boolean z4, ShepherdHistoryResponse shepherdHistory, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse2) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(pageHeader, "pageHeader");
        AbstractC22676k.m65750j(settingsCta, "settingsCta");
        AbstractC22676k.m65750j(shepherdHistory, "shepherdHistory");
        this.icon = icon;
        this.pageTitle = pageTitle;
        this.body = body;
        this.pageHeader = pageHeader;
        this.settingsCta = settingsCta;
        this.detectionOn = z4;
        this.shepherdHistory = shepherdHistory;
        this.clearHistoryDialog = shepherdClearHistoryDialogResponse;
        this.clearRecordDialog = shepherdClearHistoryDialogResponse2;
    }

    public /* synthetic */ ShepherdNotificationHistoryResponse(String str, String str2, String str3, PageHeaderResponse pageHeaderResponse, CtaTileModel ctaTileModel, boolean z4, ShepherdHistoryResponse shepherdHistoryResponse, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, pageHeaderResponse, (i13 & 16) != 0 ? new CtaTileModel((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, (C9598e) null, 65535, (DefaultConstructorMarker) null) : ctaTileModel, z4, shepherdHistoryResponse, shepherdClearHistoryDialogResponse, shepherdClearHistoryDialogResponse2);
    }
}
