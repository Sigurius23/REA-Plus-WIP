package com.whoop.shepherd.feature.detail.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdClearHistoryDialogResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdClearHistoryDialogResponse$$serializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bu\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/Jn\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b2\u0010$J\u0010\u00103\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b?\u0010$R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b@\u0010$R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\bA\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010B\u0012\u0004\bD\u0010<\u001a\u0004\bC\u0010)R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010E\u0012\u0004\bG\u0010<\u001a\u0004\bF\u0010+R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010/¨\u0006N"}, m65681d2 = {"Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "", "Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;", "possibleShepherdTile", "", "icon", "pageTitle", "description", "advise", "Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;", "labradorItemInfo", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;", "historyDetailBox", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;", "clearButton", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;", "clearHistoryDialog", "<init>", "(Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;", "component7", "()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;", "component8", "()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;", "component9", "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;", "copy", "(Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;", "getPossibleShepherdTile", "getPossibleShepherdTile$annotations", "()V", "Ljava/lang/String;", "getIcon", "getPageTitle", "getDescription", "getAdvise", "Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;", "getLabradorItemInfo", "getLabradorItemInfo$annotations", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;", "getHistoryDetailBox", "getHistoryDetailBox$annotations", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;", "getClearButton", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;", "getClearHistoryDialog", "Companion", "$serializer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdHistoryDetailResponse {

    @SerializedName("advise")
    private final String advise;

    @SerializedName("clear_button")
    private final ShepherdHistoryDetailClearButton clearButton;

    @SerializedName("clear_history_dialog")
    private final ShepherdClearHistoryDialogResponse clearHistoryDialog;

    @SerializedName("description")
    private final String description;

    @SerializedName("afib_history_box")
    private final ShepherdHistoryDetailBox historyDetailBox;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("ecg_item_info")
    private final LabradorItemInfo labradorItemInfo;

    @SerializedName("page_title")
    private final String pageTitle;

    @SerializedName("possible_afib_tile")
    private final PossibleShepherdTileResponse possibleShepherdTile;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdHistoryDetailResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdHistoryDetailResponse(int i13, PossibleShepherdTileResponse possibleShepherdTileResponse, String str, String str2, String str3, String str4, LabradorItemInfo labradorItemInfo, ShepherdHistoryDetailBox shepherdHistoryDetailBox, ShepherdHistoryDetailClearButton shepherdHistoryDetailClearButton, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, ShepherdHistoryDetailResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.possibleShepherdTile = possibleShepherdTileResponse;
        this.icon = str;
        this.pageTitle = str2;
        this.description = str3;
        this.advise = str4;
        this.labradorItemInfo = labradorItemInfo;
        this.historyDetailBox = shepherdHistoryDetailBox;
        this.clearButton = shepherdHistoryDetailClearButton;
        this.clearHistoryDialog = shepherdClearHistoryDialogResponse;
    }

    public static /* synthetic */ ShepherdHistoryDetailResponse copy$default(ShepherdHistoryDetailResponse shepherdHistoryDetailResponse, PossibleShepherdTileResponse possibleShepherdTileResponse, String str, String str2, String str3, String str4, LabradorItemInfo labradorItemInfo, ShepherdHistoryDetailBox shepherdHistoryDetailBox, ShepherdHistoryDetailClearButton shepherdHistoryDetailClearButton, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            possibleShepherdTileResponse = shepherdHistoryDetailResponse.possibleShepherdTile;
        }
        if ((i13 & 2) != 0) {
            str = shepherdHistoryDetailResponse.icon;
        }
        if ((i13 & 4) != 0) {
            str2 = shepherdHistoryDetailResponse.pageTitle;
        }
        if ((i13 & 8) != 0) {
            str3 = shepherdHistoryDetailResponse.description;
        }
        if ((i13 & 16) != 0) {
            str4 = shepherdHistoryDetailResponse.advise;
        }
        if ((i13 & 32) != 0) {
            labradorItemInfo = shepherdHistoryDetailResponse.labradorItemInfo;
        }
        if ((i13 & 64) != 0) {
            shepherdHistoryDetailBox = shepherdHistoryDetailResponse.historyDetailBox;
        }
        if ((i13 & 128) != 0) {
            shepherdHistoryDetailClearButton = shepherdHistoryDetailResponse.clearButton;
        }
        if ((i13 & 256) != 0) {
            shepherdClearHistoryDialogResponse = shepherdHistoryDetailResponse.clearHistoryDialog;
        }
        ShepherdHistoryDetailClearButton shepherdHistoryDetailClearButton2 = shepherdHistoryDetailClearButton;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse2 = shepherdClearHistoryDialogResponse;
        LabradorItemInfo labradorItemInfo2 = labradorItemInfo;
        ShepherdHistoryDetailBox shepherdHistoryDetailBox2 = shepherdHistoryDetailBox;
        String str5 = str4;
        String str6 = str2;
        return shepherdHistoryDetailResponse.copy(possibleShepherdTileResponse, str, str6, str3, str5, labradorItemInfo2, shepherdHistoryDetailBox2, shepherdHistoryDetailClearButton2, shepherdClearHistoryDialogResponse2);
    }

    @InterfaceC37143h("afib_history_box")
    public static /* synthetic */ void getHistoryDetailBox$annotations() {
    }

    @InterfaceC37143h("ecg_item_info")
    public static /* synthetic */ void getLabradorItemInfo$annotations() {
    }

    @InterfaceC37143h("possible_afib_tile")
    public static /* synthetic */ void getPossibleShepherdTile$annotations() {
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdHistoryDetailResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, PossibleShepherdTileResponse$$serializer.INSTANCE, self.possibleShepherdTile);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeStringElement(serialDesc, 2, self.pageTitle);
        output.encodeStringElement(serialDesc, 3, self.description);
        output.encodeStringElement(serialDesc, 4, self.advise);
        output.encodeNullableSerializableElement(serialDesc, 5, LabradorItemInfo$$serializer.INSTANCE, self.labradorItemInfo);
        output.encodeSerializableElement(serialDesc, 6, ShepherdHistoryDetailBox$$serializer.INSTANCE, self.historyDetailBox);
        output.encodeSerializableElement(serialDesc, 7, ShepherdHistoryDetailClearButton$$serializer.INSTANCE, self.clearButton);
        output.encodeNullableSerializableElement(serialDesc, 8, ShepherdClearHistoryDialogResponse$$serializer.INSTANCE, self.clearHistoryDialog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PossibleShepherdTileResponse getPossibleShepherdTile() {
        return this.possibleShepherdTile;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAdvise() {
        return this.advise;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LabradorItemInfo getLabradorItemInfo() {
        return this.labradorItemInfo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ShepherdHistoryDetailBox getHistoryDetailBox() {
        return this.historyDetailBox;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ShepherdHistoryDetailClearButton getClearButton() {
        return this.clearButton;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ShepherdClearHistoryDialogResponse getClearHistoryDialog() {
        return this.clearHistoryDialog;
    }

    public final ShepherdHistoryDetailResponse copy(PossibleShepherdTileResponse possibleShepherdTile, String icon, String pageTitle, String description, String advise, LabradorItemInfo labradorItemInfo, ShepherdHistoryDetailBox historyDetailBox, ShepherdHistoryDetailClearButton clearButton, ShepherdClearHistoryDialogResponse clearHistoryDialog) {
        AbstractC22676k.m65750j(possibleShepherdTile, "possibleShepherdTile");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(advise, "advise");
        AbstractC22676k.m65750j(historyDetailBox, "historyDetailBox");
        AbstractC22676k.m65750j(clearButton, "clearButton");
        return new ShepherdHistoryDetailResponse(possibleShepherdTile, icon, pageTitle, description, advise, labradorItemInfo, historyDetailBox, clearButton, clearHistoryDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdHistoryDetailResponse)) {
            return false;
        }
        ShepherdHistoryDetailResponse shepherdHistoryDetailResponse = (ShepherdHistoryDetailResponse) other;
        return AbstractC22676k.m65745e(this.possibleShepherdTile, shepherdHistoryDetailResponse.possibleShepherdTile) && AbstractC22676k.m65745e(this.icon, shepherdHistoryDetailResponse.icon) && AbstractC22676k.m65745e(this.pageTitle, shepherdHistoryDetailResponse.pageTitle) && AbstractC22676k.m65745e(this.description, shepherdHistoryDetailResponse.description) && AbstractC22676k.m65745e(this.advise, shepherdHistoryDetailResponse.advise) && AbstractC22676k.m65745e(this.labradorItemInfo, shepherdHistoryDetailResponse.labradorItemInfo) && AbstractC22676k.m65745e(this.historyDetailBox, shepherdHistoryDetailResponse.historyDetailBox) && AbstractC22676k.m65745e(this.clearButton, shepherdHistoryDetailResponse.clearButton) && AbstractC22676k.m65745e(this.clearHistoryDialog, shepherdHistoryDetailResponse.clearHistoryDialog);
    }

    public final String getAdvise() {
        return this.advise;
    }

    public final ShepherdHistoryDetailClearButton getClearButton() {
        return this.clearButton;
    }

    public final ShepherdClearHistoryDialogResponse getClearHistoryDialog() {
        return this.clearHistoryDialog;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ShepherdHistoryDetailBox getHistoryDetailBox() {
        return this.historyDetailBox;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final LabradorItemInfo getLabradorItemInfo() {
        return this.labradorItemInfo;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final PossibleShepherdTileResponse getPossibleShepherdTile() {
        return this.possibleShepherdTile;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.possibleShepherdTile.hashCode() * 31, 31, this.icon), 31, this.pageTitle), 31, this.description), 31, this.advise);
        LabradorItemInfo labradorItemInfo = this.labradorItemInfo;
        int iHashCode = (this.clearButton.hashCode() + ((this.historyDetailBox.hashCode() + ((iM30450d + (labradorItemInfo == null ? 0 : labradorItemInfo.hashCode())) * 31)) * 31)) * 31;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse = this.clearHistoryDialog;
        return iHashCode + (shepherdClearHistoryDialogResponse != null ? shepherdClearHistoryDialogResponse.hashCode() : 0);
    }

    public String toString() {
        PossibleShepherdTileResponse possibleShepherdTileResponse = this.possibleShepherdTile;
        String str = this.icon;
        String str2 = this.pageTitle;
        String str3 = this.description;
        String str4 = this.advise;
        LabradorItemInfo labradorItemInfo = this.labradorItemInfo;
        ShepherdHistoryDetailBox shepherdHistoryDetailBox = this.historyDetailBox;
        ShepherdHistoryDetailClearButton shepherdHistoryDetailClearButton = this.clearButton;
        ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse = this.clearHistoryDialog;
        StringBuilder sb4 = new StringBuilder("ShepherdHistoryDetailResponse(possibleShepherdTile=");
        sb4.append(possibleShepherdTileResponse);
        sb4.append(", icon=");
        sb4.append(str);
        sb4.append(", pageTitle=");
        AbstractC11266d.m30444B(sb4, str2, ", description=", str3, ", advise=");
        sb4.append(str4);
        sb4.append(", labradorItemInfo=");
        sb4.append(labradorItemInfo);
        sb4.append(", historyDetailBox=");
        sb4.append(shepherdHistoryDetailBox);
        sb4.append(", clearButton=");
        sb4.append(shepherdHistoryDetailClearButton);
        sb4.append(", clearHistoryDialog=");
        sb4.append(shepherdClearHistoryDialogResponse);
        sb4.append(")");
        return sb4.toString();
    }

    public ShepherdHistoryDetailResponse(PossibleShepherdTileResponse possibleShepherdTile, String icon, String pageTitle, String description, String advise, LabradorItemInfo labradorItemInfo, ShepherdHistoryDetailBox historyDetailBox, ShepherdHistoryDetailClearButton clearButton, ShepherdClearHistoryDialogResponse shepherdClearHistoryDialogResponse) {
        AbstractC22676k.m65750j(possibleShepherdTile, "possibleShepherdTile");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(pageTitle, "pageTitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(advise, "advise");
        AbstractC22676k.m65750j(historyDetailBox, "historyDetailBox");
        AbstractC22676k.m65750j(clearButton, "clearButton");
        this.possibleShepherdTile = possibleShepherdTile;
        this.icon = icon;
        this.pageTitle = pageTitle;
        this.description = description;
        this.advise = advise;
        this.labradorItemInfo = labradorItemInfo;
        this.historyDetailBox = historyDetailBox;
        this.clearButton = clearButton;
        this.clearHistoryDialog = shepherdClearHistoryDialogResponse;
    }
}
