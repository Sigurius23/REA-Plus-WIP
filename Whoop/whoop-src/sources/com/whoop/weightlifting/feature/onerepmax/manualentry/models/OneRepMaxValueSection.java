package com.whoop.weightlifting.feature.onerepmax.manualentry.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#JX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;", "", "", "title", "valueTitle", "unit", "", "minValue", "maxValue", "errorMessage", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getValueTitle", "getUnit", "I", "getMinValue", "getMaxValue", "getErrorMessage", "Ljava/lang/Integer;", "getValue", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OneRepMaxValueSection {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String errorMessage;
    private final int maxValue;
    private final int minValue;
    private final String title;
    private final String unit;
    private final Integer value;
    private final String valueTitle;

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxValueSection$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OneRepMaxValueSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OneRepMaxValueSection(int i13, String str, String str2, String str3, int i14, int i15, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, OneRepMaxValueSection$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.valueTitle = str2;
        this.unit = str3;
        this.minValue = i14;
        this.maxValue = i15;
        this.errorMessage = str4;
        this.value = num;
    }

    public static /* synthetic */ OneRepMaxValueSection copy$default(OneRepMaxValueSection oneRepMaxValueSection, String str, String str2, String str3, int i13, int i14, String str4, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = oneRepMaxValueSection.title;
        }
        if ((i15 & 2) != 0) {
            str2 = oneRepMaxValueSection.valueTitle;
        }
        if ((i15 & 4) != 0) {
            str3 = oneRepMaxValueSection.unit;
        }
        if ((i15 & 8) != 0) {
            i13 = oneRepMaxValueSection.minValue;
        }
        if ((i15 & 16) != 0) {
            i14 = oneRepMaxValueSection.maxValue;
        }
        if ((i15 & 32) != 0) {
            str4 = oneRepMaxValueSection.errorMessage;
        }
        if ((i15 & 64) != 0) {
            num = oneRepMaxValueSection.value;
        }
        String str5 = str4;
        Integer num2 = num;
        int i16 = i14;
        String str6 = str3;
        return oneRepMaxValueSection.copy(str, str2, str6, i13, i16, str5, num2);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(OneRepMaxValueSection self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.valueTitle);
        output.encodeStringElement(serialDesc, 2, self.unit);
        output.encodeIntElement(serialDesc, 3, self.minValue);
        output.encodeIntElement(serialDesc, 4, self.maxValue);
        output.encodeStringElement(serialDesc, 5, self.errorMessage);
        output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.value);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValueTitle() {
        return this.valueTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
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
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    public final OneRepMaxValueSection copy(String title, String valueTitle, String unit, int minValue, int maxValue, String errorMessage, Integer value) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(valueTitle, "valueTitle");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        return new OneRepMaxValueSection(title, valueTitle, unit, minValue, maxValue, errorMessage, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneRepMaxValueSection)) {
            return false;
        }
        OneRepMaxValueSection oneRepMaxValueSection = (OneRepMaxValueSection) other;
        return AbstractC22676k.m65745e(this.title, oneRepMaxValueSection.title) && AbstractC22676k.m65745e(this.valueTitle, oneRepMaxValueSection.valueTitle) && AbstractC22676k.m65745e(this.unit, oneRepMaxValueSection.unit) && this.minValue == oneRepMaxValueSection.minValue && this.maxValue == oneRepMaxValueSection.maxValue && AbstractC22676k.m65745e(this.errorMessage, oneRepMaxValueSection.errorMessage) && AbstractC22676k.m65745e(this.value, oneRepMaxValueSection.value);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final Integer getValue() {
        return this.value;
    }

    public final String getValueTitle() {
        return this.valueTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.maxValue, AbstractC11266d.m30448b(this.minValue, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.valueTitle), 31, this.unit), 31), 31), 31, this.errorMessage);
        Integer num = this.value;
        return iM30450d + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.valueTitle;
        String str3 = this.unit;
        int i13 = this.minValue;
        int i14 = this.maxValue;
        String str4 = this.errorMessage;
        Integer num = this.value;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OneRepMaxValueSection(title=", str, ", valueTitle=", str2, ", unit=");
        AbstractC11266d.m30470x(i13, str3, ", minValue=", ", maxValue=", sbM32001t);
        AbstractC11895b.m31979B(i14, ", errorMessage=", str4, ", value=", sbM32001t);
        return AbstractC11478a.m30859k(sbM32001t, num, ")");
    }

    public OneRepMaxValueSection(String title, String valueTitle, String unit, int i13, int i14, String errorMessage, Integer num) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(valueTitle, "valueTitle");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.title = title;
        this.valueTitle = valueTitle;
        this.unit = unit;
        this.minValue = i13;
        this.maxValue = i14;
        this.errorMessage = errorMessage;
        this.value = num;
    }
}
