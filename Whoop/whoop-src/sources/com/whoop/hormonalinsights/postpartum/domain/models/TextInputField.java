package com.whoop.hormonalinsights.postpartum.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010 ¨\u00065"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;", "", "", "title", "firstTextFieldUnits", "secondTextFieldUnits", "errorMessage", "", "minValueG", "maxValueG", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()D", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getFirstTextFieldUnits", "getSecondTextFieldUnits", "getErrorMessage", "D", "getMinValueG", "getMaxValueG", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextInputField {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String errorMessage;
    private final String firstTextFieldUnits;
    private final double maxValueG;
    private final double minValueG;
    private final String secondTextFieldUnits;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextInputField$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextInputField(int i13, String str, String str2, String str3, String str4, double d3, double d14, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, TextInputField$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.firstTextFieldUnits = str2;
        this.secondTextFieldUnits = str3;
        this.errorMessage = str4;
        this.minValueG = d3;
        this.maxValueG = d14;
    }

    public static /* synthetic */ TextInputField copy$default(TextInputField textInputField, String str, String str2, String str3, String str4, double d3, double d14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = textInputField.title;
        }
        if ((i13 & 2) != 0) {
            str2 = textInputField.firstTextFieldUnits;
        }
        if ((i13 & 4) != 0) {
            str3 = textInputField.secondTextFieldUnits;
        }
        if ((i13 & 8) != 0) {
            str4 = textInputField.errorMessage;
        }
        if ((i13 & 16) != 0) {
            d3 = textInputField.minValueG;
        }
        if ((i13 & 32) != 0) {
            d14 = textInputField.maxValueG;
        }
        double d15 = d14;
        double d16 = d3;
        return textInputField.copy(str, str2, str3, str4, d16, d15);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(TextInputField self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.firstTextFieldUnits);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.secondTextFieldUnits);
        output.encodeStringElement(serialDesc, 3, self.errorMessage);
        output.encodeDoubleElement(serialDesc, 4, self.minValueG);
        output.encodeDoubleElement(serialDesc, 5, self.maxValueG);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstTextFieldUnits() {
        return this.firstTextFieldUnits;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecondTextFieldUnits() {
        return this.secondTextFieldUnits;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMinValueG() {
        return this.minValueG;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getMaxValueG() {
        return this.maxValueG;
    }

    public final TextInputField copy(String title, String firstTextFieldUnits, String secondTextFieldUnits, String errorMessage, double minValueG, double maxValueG) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(firstTextFieldUnits, "firstTextFieldUnits");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        return new TextInputField(title, firstTextFieldUnits, secondTextFieldUnits, errorMessage, minValueG, maxValueG);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputField)) {
            return false;
        }
        TextInputField textInputField = (TextInputField) other;
        return AbstractC22676k.m65745e(this.title, textInputField.title) && AbstractC22676k.m65745e(this.firstTextFieldUnits, textInputField.firstTextFieldUnits) && AbstractC22676k.m65745e(this.secondTextFieldUnits, textInputField.secondTextFieldUnits) && AbstractC22676k.m65745e(this.errorMessage, textInputField.errorMessage) && Double.compare(this.minValueG, textInputField.minValueG) == 0 && Double.compare(this.maxValueG, textInputField.maxValueG) == 0;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getFirstTextFieldUnits() {
        return this.firstTextFieldUnits;
    }

    public final double getMaxValueG() {
        return this.maxValueG;
    }

    public final double getMinValueG() {
        return this.minValueG;
    }

    public final String getSecondTextFieldUnits() {
        return this.secondTextFieldUnits;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.firstTextFieldUnits);
        String str = this.secondTextFieldUnits;
        return Double.hashCode(this.maxValueG) + AbstractC17176i.m48499a(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.errorMessage), 31, this.minValueG);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.firstTextFieldUnits;
        String str3 = this.secondTextFieldUnits;
        String str4 = this.errorMessage;
        double d3 = this.minValueG;
        double d14 = this.maxValueG;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TextInputField(title=", str, ", firstTextFieldUnits=", str2, ", secondTextFieldUnits=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", errorMessage=", str4, ", minValueG=");
        sbM32001t.append(d3);
        sbM32001t.append(", maxValueG=");
        sbM32001t.append(d14);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public TextInputField(String title, String firstTextFieldUnits, String str, String errorMessage, double d3, double d14) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(firstTextFieldUnits, "firstTextFieldUnits");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.title = title;
        this.firstTextFieldUnits = firstTextFieldUnits;
        this.secondTextFieldUnits = str;
        this.errorMessage = errorMessage;
        this.minValueG = d3;
        this.maxValueG = d14;
    }
}
