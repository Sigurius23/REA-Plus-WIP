package com.whoop.design.models.items.weightpicker;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B}\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0080\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b;\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b<\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b=\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b>\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b?\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b@\u0010\u0016¨\u0006C"}, m65681d2 = {"Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "label", "", "lbsMin", "lbsMax", "defaultLbs", "lbsLabel", "kgMin", "kgMax", "defaultKg", "kgLabel", "unitType", "stateUpdateValueKey", "<init>", "(Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getLabel", "I", "getLbsMin", "getLbsMax", "getDefaultLbs", "getLbsLabel", "getKgMin", "getKgMax", "getDefaultKg", "getKgLabel", "getUnitType", "getStateUpdateValueKey", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeightPickerModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int defaultKg;
    private final int defaultLbs;
    private final String kgLabel;
    private final int kgMax;
    private final int kgMin;
    private final String label;
    private final String lbsLabel;
    private final int lbsMax;
    private final int lbsMin;
    private final String stateUpdateValueKey;
    private final String unitType;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeightPickerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeightPickerModel(int i13, String str, int i14, int i15, int i16, String str2, int i17, int i18, int i19, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, WeightPickerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.lbsMin = i14;
        this.lbsMax = i15;
        this.defaultLbs = i16;
        this.lbsLabel = str2;
        this.kgMin = i17;
        this.kgMax = i18;
        this.defaultKg = i19;
        this.kgLabel = str3;
        this.unitType = str4;
        this.stateUpdateValueKey = str5;
    }

    public static /* synthetic */ WeightPickerModel copy$default(WeightPickerModel weightPickerModel, String str, int i13, int i14, int i15, String str2, int i16, int i17, int i18, String str3, String str4, String str5, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            str = weightPickerModel.label;
        }
        if ((i19 & 2) != 0) {
            i13 = weightPickerModel.lbsMin;
        }
        if ((i19 & 4) != 0) {
            i14 = weightPickerModel.lbsMax;
        }
        if ((i19 & 8) != 0) {
            i15 = weightPickerModel.defaultLbs;
        }
        if ((i19 & 16) != 0) {
            str2 = weightPickerModel.lbsLabel;
        }
        if ((i19 & 32) != 0) {
            i16 = weightPickerModel.kgMin;
        }
        if ((i19 & 64) != 0) {
            i17 = weightPickerModel.kgMax;
        }
        if ((i19 & 128) != 0) {
            i18 = weightPickerModel.defaultKg;
        }
        if ((i19 & 256) != 0) {
            str3 = weightPickerModel.kgLabel;
        }
        if ((i19 & 512) != 0) {
            str4 = weightPickerModel.unitType;
        }
        if ((i19 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str5 = weightPickerModel.stateUpdateValueKey;
        }
        String str6 = str4;
        String str7 = str5;
        int i24 = i18;
        String str8 = str3;
        int i25 = i16;
        int i26 = i17;
        String str9 = str2;
        int i27 = i14;
        return weightPickerModel.copy(str, i13, i27, i15, str9, i25, i26, i24, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$design_models_release(WeightPickerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeIntElement(serialDesc, 1, self.lbsMin);
        output.encodeIntElement(serialDesc, 2, self.lbsMax);
        output.encodeIntElement(serialDesc, 3, self.defaultLbs);
        output.encodeStringElement(serialDesc, 4, self.lbsLabel);
        output.encodeIntElement(serialDesc, 5, self.kgMin);
        output.encodeIntElement(serialDesc, 6, self.kgMax);
        output.encodeIntElement(serialDesc, 7, self.defaultKg);
        output.encodeStringElement(serialDesc, 8, self.kgLabel);
        output.encodeStringElement(serialDesc, 9, self.unitType);
        output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.stateUpdateValueKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUnitType() {
        return this.unitType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLbsMin() {
        return this.lbsMin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLbsMax() {
        return this.lbsMax;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDefaultLbs() {
        return this.defaultLbs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLbsLabel() {
        return this.lbsLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getKgMin() {
        return this.kgMin;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getKgMax() {
        return this.kgMax;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDefaultKg() {
        return this.defaultKg;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getKgLabel() {
        return this.kgLabel;
    }

    public final WeightPickerModel copy(String label, int lbsMin, int lbsMax, int defaultLbs, String lbsLabel, int kgMin, int kgMax, int defaultKg, String kgLabel, String unitType, String stateUpdateValueKey) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(lbsLabel, "lbsLabel");
        AbstractC22676k.m65750j(kgLabel, "kgLabel");
        AbstractC22676k.m65750j(unitType, "unitType");
        return new WeightPickerModel(label, lbsMin, lbsMax, defaultLbs, lbsLabel, kgMin, kgMax, defaultKg, kgLabel, unitType, stateUpdateValueKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightPickerModel)) {
            return false;
        }
        WeightPickerModel weightPickerModel = (WeightPickerModel) other;
        return AbstractC22676k.m65745e(this.label, weightPickerModel.label) && this.lbsMin == weightPickerModel.lbsMin && this.lbsMax == weightPickerModel.lbsMax && this.defaultLbs == weightPickerModel.defaultLbs && AbstractC22676k.m65745e(this.lbsLabel, weightPickerModel.lbsLabel) && this.kgMin == weightPickerModel.kgMin && this.kgMax == weightPickerModel.kgMax && this.defaultKg == weightPickerModel.defaultKg && AbstractC22676k.m65745e(this.kgLabel, weightPickerModel.kgLabel) && AbstractC22676k.m65745e(this.unitType, weightPickerModel.unitType) && AbstractC22676k.m65745e(this.stateUpdateValueKey, weightPickerModel.stateUpdateValueKey);
    }

    public final int getDefaultKg() {
        return this.defaultKg;
    }

    public final int getDefaultLbs() {
        return this.defaultLbs;
    }

    public final String getKgLabel() {
        return this.kgLabel;
    }

    public final int getKgMax() {
        return this.kgMax;
    }

    public final int getKgMin() {
        return this.kgMin;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLbsLabel() {
        return this.lbsLabel;
    }

    public final int getLbsMax() {
        return this.lbsMax;
    }

    public final int getLbsMin() {
        return this.lbsMin;
    }

    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.defaultKg, AbstractC11266d.m30448b(this.kgMax, AbstractC11266d.m30448b(this.kgMin, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.defaultLbs, AbstractC11266d.m30448b(this.lbsMax, AbstractC11266d.m30448b(this.lbsMin, this.label.hashCode() * 31, 31), 31), 31), 31, this.lbsLabel), 31), 31), 31), 31, this.kgLabel), 31, this.unitType);
        String str = this.stateUpdateValueKey;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.label;
        int i13 = this.lbsMin;
        int i14 = this.lbsMax;
        int i15 = this.defaultLbs;
        String str2 = this.lbsLabel;
        int i16 = this.kgMin;
        int i17 = this.kgMax;
        int i18 = this.defaultKg;
        String str3 = this.kgLabel;
        String str4 = this.unitType;
        String str5 = this.stateUpdateValueKey;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "WeightPickerModel(label=", str, ", lbsMin=", ", lbsMax=");
        AbstractC30802r.m94773v(sbM30467u, i14, ", defaultLbs=", i15, ", lbsLabel=");
        AbstractC11266d.m30470x(i16, str2, ", kgMin=", ", kgMax=", sbM30467u);
        AbstractC30802r.m94773v(sbM30467u, i17, ", defaultKg=", i18, ", kgLabel=");
        AbstractC11266d.m30444B(sbM30467u, str3, ", unitType=", str4, ", stateUpdateValueKey=");
        return AbstractC25012a.m73376i(str5, ")", sbM30467u);
    }

    public WeightPickerModel(String label, int i13, int i14, int i15, String lbsLabel, int i16, int i17, int i18, String kgLabel, String unitType, String str) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(lbsLabel, "lbsLabel");
        AbstractC22676k.m65750j(kgLabel, "kgLabel");
        AbstractC22676k.m65750j(unitType, "unitType");
        this.label = label;
        this.lbsMin = i13;
        this.lbsMax = i14;
        this.defaultLbs = i15;
        this.lbsLabel = lbsLabel;
        this.kgMin = i16;
        this.kgMax = i17;
        this.defaultKg = i18;
        this.kgLabel = kgLabel;
        this.unitType = unitType;
        this.stateUpdateValueKey = str;
    }
}
