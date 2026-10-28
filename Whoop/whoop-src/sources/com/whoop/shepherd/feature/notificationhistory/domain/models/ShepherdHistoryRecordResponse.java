package com.whoop.shepherd.feature.notificationhistory.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, m65681d2 = {"Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;", "", "", "historyDate", "recordDate", "icon", "label", "actionIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHistoryDate", "getRecordDate", "getIcon", "getLabel", "getActionIcon", "Companion", "$serializer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdHistoryRecordResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("action_icon")
    private final String actionIcon;

    @SerializedName("history_date")
    private final String historyDate;

    @SerializedName("icon")
    private final String icon;

    @SerializedName("label")
    private final String label;

    @SerializedName("record_date")
    private final String recordDate;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdHistoryRecordResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdHistoryRecordResponse(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ShepherdHistoryRecordResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.historyDate = str;
        this.recordDate = str2;
        this.icon = str3;
        this.label = str4;
        this.actionIcon = str5;
    }

    public static /* synthetic */ ShepherdHistoryRecordResponse copy$default(ShepherdHistoryRecordResponse shepherdHistoryRecordResponse, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdHistoryRecordResponse.historyDate;
        }
        if ((i13 & 2) != 0) {
            str2 = shepherdHistoryRecordResponse.recordDate;
        }
        if ((i13 & 4) != 0) {
            str3 = shepherdHistoryRecordResponse.icon;
        }
        if ((i13 & 8) != 0) {
            str4 = shepherdHistoryRecordResponse.label;
        }
        if ((i13 & 16) != 0) {
            str5 = shepherdHistoryRecordResponse.actionIcon;
        }
        String str6 = str5;
        String str7 = str3;
        return shepherdHistoryRecordResponse.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdHistoryRecordResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.historyDate);
        output.encodeStringElement(serialDesc, 1, self.recordDate);
        output.encodeStringElement(serialDesc, 2, self.icon);
        output.encodeStringElement(serialDesc, 3, self.label);
        output.encodeStringElement(serialDesc, 4, self.actionIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHistoryDate() {
        return this.historyDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecordDate() {
        return this.recordDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActionIcon() {
        return this.actionIcon;
    }

    public final ShepherdHistoryRecordResponse copy(String historyDate, String recordDate, String icon, String label, String actionIcon) {
        AbstractC22676k.m65750j(historyDate, "historyDate");
        AbstractC22676k.m65750j(recordDate, "recordDate");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(actionIcon, "actionIcon");
        return new ShepherdHistoryRecordResponse(historyDate, recordDate, icon, label, actionIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdHistoryRecordResponse)) {
            return false;
        }
        ShepherdHistoryRecordResponse shepherdHistoryRecordResponse = (ShepherdHistoryRecordResponse) other;
        return AbstractC22676k.m65745e(this.historyDate, shepherdHistoryRecordResponse.historyDate) && AbstractC22676k.m65745e(this.recordDate, shepherdHistoryRecordResponse.recordDate) && AbstractC22676k.m65745e(this.icon, shepherdHistoryRecordResponse.icon) && AbstractC22676k.m65745e(this.label, shepherdHistoryRecordResponse.label) && AbstractC22676k.m65745e(this.actionIcon, shepherdHistoryRecordResponse.actionIcon);
    }

    public final String getActionIcon() {
        return this.actionIcon;
    }

    public final String getHistoryDate() {
        return this.historyDate;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getRecordDate() {
        return this.recordDate;
    }

    public int hashCode() {
        return this.actionIcon.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.historyDate.hashCode() * 31, 31, this.recordDate), 31, this.icon), 31, this.label);
    }

    public String toString() {
        String str = this.historyDate;
        String str2 = this.recordDate;
        String str3 = this.icon;
        String str4 = this.label;
        String str5 = this.actionIcon;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShepherdHistoryRecordResponse(historyDate=", str, ", recordDate=", str2, ", icon=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", label=", str4, ", actionIcon=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public ShepherdHistoryRecordResponse(String historyDate, String recordDate, String icon, String label, String actionIcon) {
        AbstractC22676k.m65750j(historyDate, "historyDate");
        AbstractC22676k.m65750j(recordDate, "recordDate");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(actionIcon, "actionIcon");
        this.historyDate = historyDate;
        this.recordDate = recordDate;
        this.icon = icon;
        this.label = label;
        this.actionIcon = actionIcon;
    }
}
