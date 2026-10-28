package com.whoop.shepherd.feature.notificationhistory.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010!¨\u00069"}, m65681d2 = {"Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;", "", "", "title", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;", "shepherdHistoryClearAll", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;", "shepherdEmptyHistory", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;", "shepherdPaginatedHistory", "<init>", "(Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;", "component3", "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;", "component4", "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;", "copy", "(Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;", "getShepherdHistoryClearAll", "getShepherdHistoryClearAll$annotations", "()V", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;", "getShepherdEmptyHistory", "getShepherdEmptyHistory$annotations", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;", "getShepherdPaginatedHistory", "getShepherdPaginatedHistory$annotations", "Companion", "$serializer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdHistoryResponse {

    @SerializedName("afib_empty_history")
    private final ShepherdEmptyHistoryResponse shepherdEmptyHistory;

    @SerializedName("afib_history_clear_all_box")
    private final ShepherdHistoryClearAllResponse shepherdHistoryClearAll;

    @SerializedName("paginated_afib_history")
    private final ShepherdPaginatedHistoryResponse shepherdPaginatedHistory;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdHistoryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdHistoryResponse(int i13, String str, ShepherdHistoryClearAllResponse shepherdHistoryClearAllResponse, ShepherdEmptyHistoryResponse shepherdEmptyHistoryResponse, ShepherdPaginatedHistoryResponse shepherdPaginatedHistoryResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ShepherdHistoryResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.shepherdHistoryClearAll = shepherdHistoryClearAllResponse;
        this.shepherdEmptyHistory = shepherdEmptyHistoryResponse;
        this.shepherdPaginatedHistory = shepherdPaginatedHistoryResponse;
    }

    public static /* synthetic */ ShepherdHistoryResponse copy$default(ShepherdHistoryResponse shepherdHistoryResponse, String str, ShepherdHistoryClearAllResponse shepherdHistoryClearAllResponse, ShepherdEmptyHistoryResponse shepherdEmptyHistoryResponse, ShepherdPaginatedHistoryResponse shepherdPaginatedHistoryResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdHistoryResponse.title;
        }
        if ((i13 & 2) != 0) {
            shepherdHistoryClearAllResponse = shepherdHistoryResponse.shepherdHistoryClearAll;
        }
        if ((i13 & 4) != 0) {
            shepherdEmptyHistoryResponse = shepherdHistoryResponse.shepherdEmptyHistory;
        }
        if ((i13 & 8) != 0) {
            shepherdPaginatedHistoryResponse = shepherdHistoryResponse.shepherdPaginatedHistory;
        }
        return shepherdHistoryResponse.copy(str, shepherdHistoryClearAllResponse, shepherdEmptyHistoryResponse, shepherdPaginatedHistoryResponse);
    }

    @InterfaceC37143h("afib_empty_history")
    public static /* synthetic */ void getShepherdEmptyHistory$annotations() {
    }

    @InterfaceC37143h("afib_history_clear_all_box")
    public static /* synthetic */ void getShepherdHistoryClearAll$annotations() {
    }

    @InterfaceC37143h("paginated_afib_history")
    public static /* synthetic */ void getShepherdPaginatedHistory$annotations() {
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdHistoryResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, ShepherdHistoryClearAllResponse$$serializer.INSTANCE, self.shepherdHistoryClearAll);
        output.encodeNullableSerializableElement(serialDesc, 2, ShepherdEmptyHistoryResponse$$serializer.INSTANCE, self.shepherdEmptyHistory);
        output.encodeNullableSerializableElement(serialDesc, 3, ShepherdPaginatedHistoryResponse$$serializer.INSTANCE, self.shepherdPaginatedHistory);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ShepherdHistoryClearAllResponse getShepherdHistoryClearAll() {
        return this.shepherdHistoryClearAll;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ShepherdEmptyHistoryResponse getShepherdEmptyHistory() {
        return this.shepherdEmptyHistory;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ShepherdPaginatedHistoryResponse getShepherdPaginatedHistory() {
        return this.shepherdPaginatedHistory;
    }

    public final ShepherdHistoryResponse copy(String title, ShepherdHistoryClearAllResponse shepherdHistoryClearAll, ShepherdEmptyHistoryResponse shepherdEmptyHistory, ShepherdPaginatedHistoryResponse shepherdPaginatedHistory) {
        AbstractC22676k.m65750j(title, "title");
        return new ShepherdHistoryResponse(title, shepherdHistoryClearAll, shepherdEmptyHistory, shepherdPaginatedHistory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdHistoryResponse)) {
            return false;
        }
        ShepherdHistoryResponse shepherdHistoryResponse = (ShepherdHistoryResponse) other;
        return AbstractC22676k.m65745e(this.title, shepherdHistoryResponse.title) && AbstractC22676k.m65745e(this.shepherdHistoryClearAll, shepherdHistoryResponse.shepherdHistoryClearAll) && AbstractC22676k.m65745e(this.shepherdEmptyHistory, shepherdHistoryResponse.shepherdEmptyHistory) && AbstractC22676k.m65745e(this.shepherdPaginatedHistory, shepherdHistoryResponse.shepherdPaginatedHistory);
    }

    public final ShepherdEmptyHistoryResponse getShepherdEmptyHistory() {
        return this.shepherdEmptyHistory;
    }

    public final ShepherdHistoryClearAllResponse getShepherdHistoryClearAll() {
        return this.shepherdHistoryClearAll;
    }

    public final ShepherdPaginatedHistoryResponse getShepherdPaginatedHistory() {
        return this.shepherdPaginatedHistory;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        ShepherdHistoryClearAllResponse shepherdHistoryClearAllResponse = this.shepherdHistoryClearAll;
        int iHashCode2 = (iHashCode + (shepherdHistoryClearAllResponse == null ? 0 : shepherdHistoryClearAllResponse.hashCode())) * 31;
        ShepherdEmptyHistoryResponse shepherdEmptyHistoryResponse = this.shepherdEmptyHistory;
        int iHashCode3 = (iHashCode2 + (shepherdEmptyHistoryResponse == null ? 0 : shepherdEmptyHistoryResponse.hashCode())) * 31;
        ShepherdPaginatedHistoryResponse shepherdPaginatedHistoryResponse = this.shepherdPaginatedHistory;
        return iHashCode3 + (shepherdPaginatedHistoryResponse != null ? shepherdPaginatedHistoryResponse.hashCode() : 0);
    }

    public String toString() {
        return "ShepherdHistoryResponse(title=" + this.title + ", shepherdHistoryClearAll=" + this.shepherdHistoryClearAll + ", shepherdEmptyHistory=" + this.shepherdEmptyHistory + ", shepherdPaginatedHistory=" + this.shepherdPaginatedHistory + ")";
    }

    public ShepherdHistoryResponse(String title, ShepherdHistoryClearAllResponse shepherdHistoryClearAllResponse, ShepherdEmptyHistoryResponse shepherdEmptyHistoryResponse, ShepherdPaginatedHistoryResponse shepherdPaginatedHistoryResponse) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.shepherdHistoryClearAll = shepherdHistoryClearAllResponse;
        this.shepherdEmptyHistory = shepherdEmptyHistoryResponse;
        this.shepherdPaginatedHistory = shepherdPaginatedHistoryResponse;
    }
}
