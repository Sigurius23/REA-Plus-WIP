package com.whoop.design.models.items.heightpicker;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J \u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b?\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b@\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\bA\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bD\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bE\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bF\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bG\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bH\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bI\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bJ\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bK\u0010\u0019¨\u0006N"}, m65681d2 = {"Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "label", "", "feetMin", "feetMax", "defaultFeet", "defaultInches", "defaultIn", "feetLabel", "inchesLabel", "cmMin", "cmMax", "defaultCm", "cmLabel", "unitType", "stateUpdateValueKey", "<init>", "(Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getLabel", "I", "getFeetMin", "getFeetMax", "getDefaultFeet", "getDefaultInches", "Ljava/lang/Integer;", "getDefaultIn", "getFeetLabel", "getInchesLabel", "getCmMin", "getCmMax", "getDefaultCm", "getCmLabel", "getUnitType", "getStateUpdateValueKey", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeightPickerModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cmLabel;
    private final int cmMax;
    private final int cmMin;
    private final int defaultCm;
    private final int defaultFeet;
    private final Integer defaultIn;
    private final int defaultInches;
    private final String feetLabel;
    private final int feetMax;
    private final int feetMin;
    private final String inchesLabel;
    private final String label;
    private final String stateUpdateValueKey;
    private final String unitType;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeightPickerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HeightPickerModel(int i13, String str, int i14, int i15, int i16, int i17, Integer num, String str2, String str3, int i18, int i19, int i24, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (16383 != (i13 & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16383, HeightPickerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.feetMin = i14;
        this.feetMax = i15;
        this.defaultFeet = i16;
        this.defaultInches = i17;
        this.defaultIn = num;
        this.feetLabel = str2;
        this.inchesLabel = str3;
        this.cmMin = i18;
        this.cmMax = i19;
        this.defaultCm = i24;
        this.cmLabel = str4;
        this.unitType = str5;
        this.stateUpdateValueKey = str6;
    }

    public static final /* synthetic */ void write$Self$design_models_release(HeightPickerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeIntElement(serialDesc, 1, self.feetMin);
        output.encodeIntElement(serialDesc, 2, self.feetMax);
        output.encodeIntElement(serialDesc, 3, self.defaultFeet);
        output.encodeIntElement(serialDesc, 4, self.defaultInches);
        output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.defaultIn);
        output.encodeStringElement(serialDesc, 6, self.feetLabel);
        output.encodeStringElement(serialDesc, 7, self.inchesLabel);
        output.encodeIntElement(serialDesc, 8, self.cmMin);
        output.encodeIntElement(serialDesc, 9, self.cmMax);
        output.encodeIntElement(serialDesc, 10, self.defaultCm);
        output.encodeStringElement(serialDesc, 11, self.cmLabel);
        output.encodeStringElement(serialDesc, 12, self.unitType);
        output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.stateUpdateValueKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getCmMax() {
        return this.cmMax;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDefaultCm() {
        return this.defaultCm;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCmLabel() {
        return this.cmLabel;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUnitType() {
        return this.unitType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFeetMin() {
        return this.feetMin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFeetMax() {
        return this.feetMax;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDefaultFeet() {
        return this.defaultFeet;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDefaultInches() {
        return this.defaultInches;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getDefaultIn() {
        return this.defaultIn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFeetLabel() {
        return this.feetLabel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInchesLabel() {
        return this.inchesLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCmMin() {
        return this.cmMin;
    }

    public final HeightPickerModel copy(String label, int feetMin, int feetMax, int defaultFeet, int defaultInches, Integer defaultIn, String feetLabel, String inchesLabel, int cmMin, int cmMax, int defaultCm, String cmLabel, String unitType, String stateUpdateValueKey) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(feetLabel, "feetLabel");
        AbstractC22676k.m65750j(inchesLabel, "inchesLabel");
        AbstractC22676k.m65750j(cmLabel, "cmLabel");
        AbstractC22676k.m65750j(unitType, "unitType");
        return new HeightPickerModel(label, feetMin, feetMax, defaultFeet, defaultInches, defaultIn, feetLabel, inchesLabel, cmMin, cmMax, defaultCm, cmLabel, unitType, stateUpdateValueKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeightPickerModel)) {
            return false;
        }
        HeightPickerModel heightPickerModel = (HeightPickerModel) other;
        return AbstractC22676k.m65745e(this.label, heightPickerModel.label) && this.feetMin == heightPickerModel.feetMin && this.feetMax == heightPickerModel.feetMax && this.defaultFeet == heightPickerModel.defaultFeet && this.defaultInches == heightPickerModel.defaultInches && AbstractC22676k.m65745e(this.defaultIn, heightPickerModel.defaultIn) && AbstractC22676k.m65745e(this.feetLabel, heightPickerModel.feetLabel) && AbstractC22676k.m65745e(this.inchesLabel, heightPickerModel.inchesLabel) && this.cmMin == heightPickerModel.cmMin && this.cmMax == heightPickerModel.cmMax && this.defaultCm == heightPickerModel.defaultCm && AbstractC22676k.m65745e(this.cmLabel, heightPickerModel.cmLabel) && AbstractC22676k.m65745e(this.unitType, heightPickerModel.unitType) && AbstractC22676k.m65745e(this.stateUpdateValueKey, heightPickerModel.stateUpdateValueKey);
    }

    public final String getCmLabel() {
        return this.cmLabel;
    }

    public final int getCmMax() {
        return this.cmMax;
    }

    public final int getCmMin() {
        return this.cmMin;
    }

    public final int getDefaultCm() {
        return this.defaultCm;
    }

    public final int getDefaultFeet() {
        return this.defaultFeet;
    }

    public final Integer getDefaultIn() {
        return this.defaultIn;
    }

    public final int getDefaultInches() {
        return this.defaultInches;
    }

    public final String getFeetLabel() {
        return this.feetLabel;
    }

    public final int getFeetMax() {
        return this.feetMax;
    }

    public final int getFeetMin() {
        return this.feetMin;
    }

    public final String getInchesLabel() {
        return this.inchesLabel;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.defaultInches, AbstractC11266d.m30448b(this.defaultFeet, AbstractC11266d.m30448b(this.feetMax, AbstractC11266d.m30448b(this.feetMin, this.label.hashCode() * 31, 31), 31), 31), 31);
        Integer num = this.defaultIn;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.defaultCm, AbstractC11266d.m30448b(this.cmMax, AbstractC11266d.m30448b(this.cmMin, AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30448b + (num == null ? 0 : num.hashCode())) * 31, 31, this.feetLabel), 31, this.inchesLabel), 31), 31), 31), 31, this.cmLabel), 31, this.unitType);
        String str = this.stateUpdateValueKey;
        return iM30450d + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.label;
        int i13 = this.feetMin;
        int i14 = this.feetMax;
        int i15 = this.defaultFeet;
        int i16 = this.defaultInches;
        Integer num = this.defaultIn;
        String str2 = this.feetLabel;
        String str3 = this.inchesLabel;
        int i17 = this.cmMin;
        int i18 = this.cmMax;
        int i19 = this.defaultCm;
        String str4 = this.cmLabel;
        String str5 = this.unitType;
        String str6 = this.stateUpdateValueKey;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "HeightPickerModel(label=", str, ", feetMin=", ", feetMax=");
        AbstractC30802r.m94773v(sbM30467u, i14, ", defaultFeet=", i15, ", defaultInches=");
        sbM30467u.append(i16);
        sbM30467u.append(", defaultIn=");
        sbM30467u.append(num);
        sbM30467u.append(", feetLabel=");
        AbstractC11266d.m30444B(sbM30467u, str2, ", inchesLabel=", str3, ", cmMin=");
        AbstractC30802r.m94773v(sbM30467u, i17, ", cmMax=", i18, ", defaultCm=");
        AbstractC11895b.m31979B(i19, ", cmLabel=", str4, ", unitType=", sbM30467u);
        return AbstractC11266d.m30464r(sbM30467u, str5, ", stateUpdateValueKey=", str6, ")");
    }

    public HeightPickerModel(String label, int i13, int i14, int i15, int i16, Integer num, String feetLabel, String inchesLabel, int i17, int i18, int i19, String cmLabel, String unitType, String str) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(feetLabel, "feetLabel");
        AbstractC22676k.m65750j(inchesLabel, "inchesLabel");
        AbstractC22676k.m65750j(cmLabel, "cmLabel");
        AbstractC22676k.m65750j(unitType, "unitType");
        this.label = label;
        this.feetMin = i13;
        this.feetMax = i14;
        this.defaultFeet = i15;
        this.defaultInches = i16;
        this.defaultIn = num;
        this.feetLabel = feetLabel;
        this.inchesLabel = inchesLabel;
        this.cmMin = i17;
        this.cmMax = i18;
        this.defaultCm = i19;
        this.cmLabel = cmLabel;
        this.unitType = unitType;
        this.stateUpdateValueKey = str;
    }
}
