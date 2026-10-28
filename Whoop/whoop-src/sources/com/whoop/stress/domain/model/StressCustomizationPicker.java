package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import nh3.AbstractC26725a;
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

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001eJN\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010\u001eR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001eR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b7\u0010,\u001a\u0004\b6\u0010\u001e¨\u0006;"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressCustomizationPicker;", "", "", "suffix", "pickerTitle", "button", "", "minValue", "maxValue", "initialValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressCustomizationPicker;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lcom/whoop/stress/domain/model/StressCustomizationPicker;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSuffix", "getSuffix$annotations", "()V", "getPickerTitle", "getPickerTitle$annotations", "getButton", "getButton$annotations", "I", "getMinValue", "getMinValue$annotations", "getMaxValue", "getMaxValue$annotations", "getInitialValue", "getInitialValue$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressCustomizationPicker {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("button_display")
    private final String button;

    @SerializedName("initial_picker_value")
    private final int initialValue;

    @SerializedName("maximum_picker_value")
    private final int maxValue;

    @SerializedName("minimum_picker_value")
    private final int minValue;

    @SerializedName("title_display")
    private final String pickerTitle;

    @SerializedName("suffix")
    private final String suffix;

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressCustomizationPicker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressCustomizationPicker$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressCustomizationPicker;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressCustomizationPicker$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StressCustomizationPicker(int i13, String str, String str2, String str3, int i14, int i15, int i16, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, StressCustomizationPicker$$serializer.INSTANCE.getDescriptor());
        }
        this.suffix = str;
        this.pickerTitle = str2;
        this.button = str3;
        this.minValue = i14;
        this.maxValue = i15;
        this.initialValue = i16;
    }

    public static /* synthetic */ StressCustomizationPicker copy$default(StressCustomizationPicker stressCustomizationPicker, String str, String str2, String str3, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = stressCustomizationPicker.suffix;
        }
        if ((i16 & 2) != 0) {
            str2 = stressCustomizationPicker.pickerTitle;
        }
        if ((i16 & 4) != 0) {
            str3 = stressCustomizationPicker.button;
        }
        if ((i16 & 8) != 0) {
            i13 = stressCustomizationPicker.minValue;
        }
        if ((i16 & 16) != 0) {
            i14 = stressCustomizationPicker.maxValue;
        }
        if ((i16 & 32) != 0) {
            i15 = stressCustomizationPicker.initialValue;
        }
        int i17 = i14;
        int i18 = i15;
        return stressCustomizationPicker.copy(str, str2, str3, i13, i17, i18);
    }

    @InterfaceC37143h("button_display")
    public static /* synthetic */ void getButton$annotations() {
    }

    @InterfaceC37143h("initial_picker_value")
    public static /* synthetic */ void getInitialValue$annotations() {
    }

    @InterfaceC37143h("maximum_picker_value")
    public static /* synthetic */ void getMaxValue$annotations() {
    }

    @InterfaceC37143h("minimum_picker_value")
    public static /* synthetic */ void getMinValue$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getPickerTitle$annotations() {
    }

    @InterfaceC37143h("suffix")
    public static /* synthetic */ void getSuffix$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressCustomizationPicker self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.suffix);
        output.encodeStringElement(serialDesc, 1, self.pickerTitle);
        output.encodeStringElement(serialDesc, 2, self.button);
        output.encodeIntElement(serialDesc, 3, self.minValue);
        output.encodeIntElement(serialDesc, 4, self.maxValue);
        output.encodeIntElement(serialDesc, 5, self.initialValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPickerTitle() {
        return this.pickerTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getInitialValue() {
        return this.initialValue;
    }

    public final StressCustomizationPicker copy(String suffix, String pickerTitle, String button, int minValue, int maxValue, int initialValue) {
        AbstractC22676k.m65750j(pickerTitle, "pickerTitle");
        AbstractC22676k.m65750j(button, "button");
        return new StressCustomizationPicker(suffix, pickerTitle, button, minValue, maxValue, initialValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressCustomizationPicker)) {
            return false;
        }
        StressCustomizationPicker stressCustomizationPicker = (StressCustomizationPicker) other;
        return AbstractC22676k.m65745e(this.suffix, stressCustomizationPicker.suffix) && AbstractC22676k.m65745e(this.pickerTitle, stressCustomizationPicker.pickerTitle) && AbstractC22676k.m65745e(this.button, stressCustomizationPicker.button) && this.minValue == stressCustomizationPicker.minValue && this.maxValue == stressCustomizationPicker.maxValue && this.initialValue == stressCustomizationPicker.initialValue;
    }

    public final String getButton() {
        return this.button;
    }

    public final int getInitialValue() {
        return this.initialValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final String getPickerTitle() {
        return this.pickerTitle;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        String str = this.suffix;
        return Integer.hashCode(this.initialValue) + AbstractC11266d.m30448b(this.maxValue, AbstractC11266d.m30448b(this.minValue, AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.pickerTitle), 31, this.button), 31), 31);
    }

    public String toString() {
        String str = this.suffix;
        String str2 = this.pickerTitle;
        String str3 = this.button;
        int i13 = this.minValue;
        int i14 = this.maxValue;
        int i15 = this.initialValue;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StressCustomizationPicker(suffix=", str, ", pickerTitle=", str2, ", button=");
        AbstractC11266d.m30470x(i13, str3, ", minValue=", ", maxValue=", sbM32001t);
        return AbstractC26725a.m79505i(sbM32001t, i14, ", initialValue=", i15, ")");
    }

    public StressCustomizationPicker(String str, String pickerTitle, String button, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(pickerTitle, "pickerTitle");
        AbstractC22676k.m65750j(button, "button");
        this.suffix = str;
        this.pickerTitle = pickerTitle;
        this.button = button;
        this.minValue = i13;
        this.maxValue = i14;
        this.initialValue = i15;
    }
}
