package com.whoop.design.models.items;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%Jb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00100\u0012\u0004\b5\u00103\u001a\u0004\b4\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b7\u00103\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b:\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b;\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010%¨\u0006@"}, m65681d2 = {"Lcom/whoop/design/models/items/DateSelectorModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "nextDateTime", "prevDateTime", "currentDateRange", "Lcom/whoop/navigation/models/GenericInteraction;", "previousInteraction", "nextInteraction", "labelInteraction", "Lcom/whoop/design/models/items/DateStripModel;", "dateStrip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DateSelectorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/navigation/models/GenericInteraction;", "component5", "component6", "component7", "()Lcom/whoop/design/models/items/DateStripModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;)Lcom/whoop/design/models/items/DateSelectorModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNextDateTime", "getNextDateTime$annotations", "()V", "getPrevDateTime", "getPrevDateTime$annotations", "getCurrentDateRange", "getCurrentDateRange$annotations", "Lcom/whoop/navigation/models/GenericInteraction;", "getPreviousInteraction", "getNextInteraction", "getLabelInteraction", "Lcom/whoop/design/models/items/DateStripModel;", "getDateStrip", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DateSelectorModel implements DesignSystemModel {

    @SerializedName("current_date_range_display")
    private final String currentDateRange;
    private final DateStripModel dateStrip;
    private final GenericInteraction labelInteraction;

    @SerializedName("next_date_time")
    private final String nextDateTime;
    private final GenericInteraction nextInteraction;

    @SerializedName("previous_date_time")
    private final String prevDateTime;
    private final GenericInteraction previousInteraction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DateSelectorModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DateSelectorModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DateSelectorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DateSelectorModel(int i13, String str, String str2, String str3, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, DateStripModel dateStripModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, DateSelectorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.nextDateTime = str;
        this.prevDateTime = str2;
        this.currentDateRange = str3;
        if ((i13 & 8) == 0) {
            this.previousInteraction = null;
        } else {
            this.previousInteraction = genericInteraction;
        }
        if ((i13 & 16) == 0) {
            this.nextInteraction = null;
        } else {
            this.nextInteraction = genericInteraction2;
        }
        if ((i13 & 32) == 0) {
            this.labelInteraction = null;
        } else {
            this.labelInteraction = genericInteraction3;
        }
        if ((i13 & 64) == 0) {
            this.dateStrip = null;
        } else {
            this.dateStrip = dateStripModel;
        }
    }

    public static /* synthetic */ DateSelectorModel copy$default(DateSelectorModel dateSelectorModel, String str, String str2, String str3, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, DateStripModel dateStripModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dateSelectorModel.nextDateTime;
        }
        if ((i13 & 2) != 0) {
            str2 = dateSelectorModel.prevDateTime;
        }
        if ((i13 & 4) != 0) {
            str3 = dateSelectorModel.currentDateRange;
        }
        if ((i13 & 8) != 0) {
            genericInteraction = dateSelectorModel.previousInteraction;
        }
        if ((i13 & 16) != 0) {
            genericInteraction2 = dateSelectorModel.nextInteraction;
        }
        if ((i13 & 32) != 0) {
            genericInteraction3 = dateSelectorModel.labelInteraction;
        }
        if ((i13 & 64) != 0) {
            dateStripModel = dateSelectorModel.dateStrip;
        }
        GenericInteraction genericInteraction4 = genericInteraction3;
        DateStripModel dateStripModel2 = dateStripModel;
        GenericInteraction genericInteraction5 = genericInteraction2;
        String str4 = str3;
        return dateSelectorModel.copy(str, str2, str4, genericInteraction, genericInteraction5, genericInteraction4, dateStripModel2);
    }

    @InterfaceC37143h("current_date_range_display")
    public static /* synthetic */ void getCurrentDateRange$annotations() {
    }

    @InterfaceC37143h("next_date_time")
    public static /* synthetic */ void getNextDateTime$annotations() {
    }

    @InterfaceC37143h("previous_date_time")
    public static /* synthetic */ void getPrevDateTime$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(DateSelectorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.nextDateTime);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.prevDateTime);
        output.encodeStringElement(serialDesc, 2, self.currentDateRange);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.previousInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, GenericInteraction$$serializer.INSTANCE, self.previousInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.nextInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.nextInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.labelInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, GenericInteraction$$serializer.INSTANCE, self.labelInteraction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.dateStrip == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, DateStripModel$$serializer.INSTANCE, self.dateStrip);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNextDateTime() {
        return this.nextDateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrevDateTime() {
        return this.prevDateTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentDateRange() {
        return this.currentDateRange;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenericInteraction getPreviousInteraction() {
        return this.previousInteraction;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenericInteraction getNextInteraction() {
        return this.nextInteraction;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GenericInteraction getLabelInteraction() {
        return this.labelInteraction;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DateStripModel getDateStrip() {
        return this.dateStrip;
    }

    public final DateSelectorModel copy(String nextDateTime, String prevDateTime, String currentDateRange, GenericInteraction previousInteraction, GenericInteraction nextInteraction, GenericInteraction labelInteraction, DateStripModel dateStrip) {
        AbstractC22676k.m65750j(currentDateRange, "currentDateRange");
        return new DateSelectorModel(nextDateTime, prevDateTime, currentDateRange, previousInteraction, nextInteraction, labelInteraction, dateStrip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateSelectorModel)) {
            return false;
        }
        DateSelectorModel dateSelectorModel = (DateSelectorModel) other;
        return AbstractC22676k.m65745e(this.nextDateTime, dateSelectorModel.nextDateTime) && AbstractC22676k.m65745e(this.prevDateTime, dateSelectorModel.prevDateTime) && AbstractC22676k.m65745e(this.currentDateRange, dateSelectorModel.currentDateRange) && AbstractC22676k.m65745e(this.previousInteraction, dateSelectorModel.previousInteraction) && AbstractC22676k.m65745e(this.nextInteraction, dateSelectorModel.nextInteraction) && AbstractC22676k.m65745e(this.labelInteraction, dateSelectorModel.labelInteraction) && AbstractC22676k.m65745e(this.dateStrip, dateSelectorModel.dateStrip);
    }

    public final String getCurrentDateRange() {
        return this.currentDateRange;
    }

    public final DateStripModel getDateStrip() {
        return this.dateStrip;
    }

    public final GenericInteraction getLabelInteraction() {
        return this.labelInteraction;
    }

    public final String getNextDateTime() {
        return this.nextDateTime;
    }

    public final GenericInteraction getNextInteraction() {
        return this.nextInteraction;
    }

    public final String getPrevDateTime() {
        return this.prevDateTime;
    }

    public final GenericInteraction getPreviousInteraction() {
        return this.previousInteraction;
    }

    public int hashCode() {
        String str = this.nextDateTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.prevDateTime;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.currentDateRange);
        GenericInteraction genericInteraction = this.previousInteraction;
        int iHashCode2 = (iM30450d + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.nextInteraction;
        int iHashCode3 = (iHashCode2 + (genericInteraction2 == null ? 0 : genericInteraction2.hashCode())) * 31;
        GenericInteraction genericInteraction3 = this.labelInteraction;
        int iHashCode4 = (iHashCode3 + (genericInteraction3 == null ? 0 : genericInteraction3.hashCode())) * 31;
        DateStripModel dateStripModel = this.dateStrip;
        return iHashCode4 + (dateStripModel != null ? dateStripModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.nextDateTime;
        String str2 = this.prevDateTime;
        String str3 = this.currentDateRange;
        GenericInteraction genericInteraction = this.previousInteraction;
        GenericInteraction genericInteraction2 = this.nextInteraction;
        GenericInteraction genericInteraction3 = this.labelInteraction;
        DateStripModel dateStripModel = this.dateStrip;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DateSelectorModel(nextDateTime=", str, ", prevDateTime=", str2, ", currentDateRange=");
        sbM32001t.append(str3);
        sbM32001t.append(", previousInteraction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", nextInteraction=");
        sbM32001t.append(genericInteraction2);
        sbM32001t.append(", labelInteraction=");
        sbM32001t.append(genericInteraction3);
        sbM32001t.append(", dateStrip=");
        sbM32001t.append(dateStripModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public DateSelectorModel(String str, String str2, String currentDateRange, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, DateStripModel dateStripModel) {
        AbstractC22676k.m65750j(currentDateRange, "currentDateRange");
        this.nextDateTime = str;
        this.prevDateTime = str2;
        this.currentDateRange = currentDateRange;
        this.previousInteraction = genericInteraction;
        this.nextInteraction = genericInteraction2;
        this.labelInteraction = genericInteraction3;
        this.dateStrip = dateStripModel;
    }

    public /* synthetic */ DateSelectorModel(String str, String str2, String str3, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, DateStripModel dateStripModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : genericInteraction, (i13 & 16) != 0 ? null : genericInteraction2, (i13 & 32) != 0 ? null : genericInteraction3, (i13 & 64) != 0 ? null : dateStripModel);
    }
}
