package com.whoop.training.data.network.response.hrsettings;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJV\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b4\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b5\u0010\u001f¨\u00069"}, m65681d2 = {"Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;", "", "", "label", "id", "", "value", "units", "", "editable", "minValue", "maxValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$training_release", "(Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getId", "I", "getValue", "getUnits", "Z", "getEditable", "getMinValue", "getMaxValue", "Companion", "$serializer", "a", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeartRateEntryRow {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("editable")
    private final boolean editable;

    @SerializedName("id")
    private final String id;

    @SerializedName("label")
    private final String label;

    @SerializedName("max_value")
    private final int maxValue;

    @SerializedName("min_value")
    private final int minValue;

    @SerializedName("units")
    private final String units;

    @SerializedName("value")
    private final int value;

    /* JADX INFO: renamed from: com.whoop.training.data.network.response.hrsettings.HeartRateEntryRow$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;", "serializer", "()Lwc3/c;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeartRateEntryRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HeartRateEntryRow(int i13, String str, String str2, int i14, String str3, boolean z4, int i15, int i16, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, HeartRateEntryRow$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.id = str2;
        this.value = i14;
        this.units = str3;
        this.editable = z4;
        this.minValue = i15;
        this.maxValue = i16;
    }

    public static /* synthetic */ HeartRateEntryRow copy$default(HeartRateEntryRow heartRateEntryRow, String str, String str2, int i13, String str3, boolean z4, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = heartRateEntryRow.label;
        }
        if ((i16 & 2) != 0) {
            str2 = heartRateEntryRow.id;
        }
        if ((i16 & 4) != 0) {
            i13 = heartRateEntryRow.value;
        }
        if ((i16 & 8) != 0) {
            str3 = heartRateEntryRow.units;
        }
        if ((i16 & 16) != 0) {
            z4 = heartRateEntryRow.editable;
        }
        if ((i16 & 32) != 0) {
            i14 = heartRateEntryRow.minValue;
        }
        if ((i16 & 64) != 0) {
            i15 = heartRateEntryRow.maxValue;
        }
        int i17 = i14;
        int i18 = i15;
        boolean z13 = z4;
        int i19 = i13;
        return heartRateEntryRow.copy(str, str2, i19, str3, z13, i17, i18);
    }

    public static final /* synthetic */ void write$Self$training_release(HeartRateEntryRow self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeIntElement(serialDesc, 2, self.value);
        output.encodeStringElement(serialDesc, 3, self.units);
        output.encodeBooleanElement(serialDesc, 4, self.editable);
        output.encodeIntElement(serialDesc, 5, self.minValue);
        output.encodeIntElement(serialDesc, 6, self.maxValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    public final HeartRateEntryRow copy(String label, String id4, int value, String units, boolean editable, int minValue, int maxValue) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(units, "units");
        return new HeartRateEntryRow(label, id4, value, units, editable, minValue, maxValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateEntryRow)) {
            return false;
        }
        HeartRateEntryRow heartRateEntryRow = (HeartRateEntryRow) other;
        return AbstractC22676k.m65745e(this.label, heartRateEntryRow.label) && AbstractC22676k.m65745e(this.id, heartRateEntryRow.id) && this.value == heartRateEntryRow.value && AbstractC22676k.m65745e(this.units, heartRateEntryRow.units) && this.editable == heartRateEntryRow.editable && this.minValue == heartRateEntryRow.minValue && this.maxValue == heartRateEntryRow.maxValue;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final String getUnits() {
        return this.units;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxValue) + AbstractC11266d.m30448b(this.minValue, AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.value, AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.id), 31), 31, this.units), 31, this.editable), 31);
    }

    public String toString() {
        String str = this.label;
        String str2 = this.id;
        int i13 = this.value;
        String str3 = this.units;
        boolean z4 = this.editable;
        int i14 = this.minValue;
        int i15 = this.maxValue;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HeartRateEntryRow(label=", str, ", id=", str2, ", value=");
        AbstractC11895b.m31979B(i13, ", units=", str3, ", editable=", sbM32001t);
        AbstractC30802r.m94769r(i14, ", minValue=", ", maxValue=", sbM32001t, z4);
        return AbstractC18489d0.m53371l(sbM32001t, i15, ")");
    }

    public HeartRateEntryRow(String label, String id4, int i13, String units, boolean z4, int i14, int i15) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(units, "units");
        this.label = label;
        this.id = id4;
        this.value = i13;
        this.units = units;
        this.editable = z4;
        this.minValue = i14;
        this.maxValue = i15;
    }
}
