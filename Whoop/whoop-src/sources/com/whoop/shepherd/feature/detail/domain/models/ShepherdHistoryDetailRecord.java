package com.whoop.shepherd.feature.detail.domain.models;

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
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006)"}, m65681d2 = {"Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailRecord;", "", "", "icon", "label", "timeRange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailRecord;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailRecord;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getLabel", "getTimeRange", "Companion", "$serializer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdHistoryDetailRecord {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("icon")
    private final String icon;

    @SerializedName("label")
    private final String label;

    @SerializedName("time_range")
    private final String timeRange;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailRecord$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailRecord;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdHistoryDetailRecord$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdHistoryDetailRecord(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ShepherdHistoryDetailRecord$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.label = str2;
        this.timeRange = str3;
    }

    public static /* synthetic */ ShepherdHistoryDetailRecord copy$default(ShepherdHistoryDetailRecord shepherdHistoryDetailRecord, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdHistoryDetailRecord.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = shepherdHistoryDetailRecord.label;
        }
        if ((i13 & 4) != 0) {
            str3 = shepherdHistoryDetailRecord.timeRange;
        }
        return shepherdHistoryDetailRecord.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdHistoryDetailRecord self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeStringElement(serialDesc, 2, self.timeRange);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimeRange() {
        return this.timeRange;
    }

    public final ShepherdHistoryDetailRecord copy(String icon, String label, String timeRange) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(timeRange, "timeRange");
        return new ShepherdHistoryDetailRecord(icon, label, timeRange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdHistoryDetailRecord)) {
            return false;
        }
        ShepherdHistoryDetailRecord shepherdHistoryDetailRecord = (ShepherdHistoryDetailRecord) other;
        return AbstractC22676k.m65745e(this.icon, shepherdHistoryDetailRecord.icon) && AbstractC22676k.m65745e(this.label, shepherdHistoryDetailRecord.label) && AbstractC22676k.m65745e(this.timeRange, shepherdHistoryDetailRecord.timeRange);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getTimeRange() {
        return this.timeRange;
    }

    public int hashCode() {
        return this.timeRange.hashCode() + AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.label);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.timeRange, ")", AbstractC11895b.m32001t("ShepherdHistoryDetailRecord(icon=", this.icon, ", label=", this.label, ", timeRange="));
    }

    public ShepherdHistoryDetailRecord(String icon, String label, String timeRange) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(timeRange, "timeRange");
        this.icon = icon;
        this.label = label;
        this.timeRange = timeRange;
    }
}
