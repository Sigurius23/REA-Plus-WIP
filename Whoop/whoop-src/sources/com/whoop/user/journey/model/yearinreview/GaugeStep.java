package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import cq2.C11062a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010By\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\"Jt\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010\"J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b<\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b=\u0010\"R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b>\u0010\"R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b?\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b@\u0010\"¨\u0006C"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/GaugeStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "gaugeFillPercentage", "", "gaugeDisplayDate", "gaugeDisplayValue", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "highlightedTexts", "footerText", "footerSubText", "name", "theme", "themeVariant", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/GaugeStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "copy", "(FLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/GaugeStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getGaugeFillPercentage", "Ljava/lang/String;", "getGaugeDisplayDate", "getGaugeDisplayValue", "Ljava/util/List;", "getHighlightedTexts", "getFooterText", "getFooterSubText", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GaugeStep implements UserJourneyStep {
    private final String footerSubText;
    private final String footerText;
    private final String gaugeDisplayDate;
    private final String gaugeDisplayValue;
    private final float gaugeFillPercentage;
    private final List<HighlightedText> highlightedTexts;
    private final String name;
    private final String theme;
    private final String themeVariant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11062a(0)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/GaugeStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/GaugeStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GaugeStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public GaugeStep(float f13, String gaugeDisplayDate, String gaugeDisplayValue, List<HighlightedText> highlightedTexts, String str, String str2, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(gaugeDisplayDate, "gaugeDisplayDate");
        AbstractC22676k.m65750j(gaugeDisplayValue, "gaugeDisplayValue");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.gaugeFillPercentage = f13;
        this.gaugeDisplayDate = gaugeDisplayDate;
        this.gaugeDisplayValue = gaugeDisplayValue;
        this.highlightedTexts = highlightedTexts;
        this.footerText = str;
        this.footerSubText = str2;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HighlightedText$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GaugeStep copy$default(GaugeStep gaugeStep, float f13, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = gaugeStep.gaugeFillPercentage;
        }
        if ((i13 & 2) != 0) {
            str = gaugeStep.gaugeDisplayDate;
        }
        if ((i13 & 4) != 0) {
            str2 = gaugeStep.gaugeDisplayValue;
        }
        if ((i13 & 8) != 0) {
            list = gaugeStep.highlightedTexts;
        }
        if ((i13 & 16) != 0) {
            str3 = gaugeStep.footerText;
        }
        if ((i13 & 32) != 0) {
            str4 = gaugeStep.footerSubText;
        }
        if ((i13 & 64) != 0) {
            str5 = gaugeStep.name;
        }
        if ((i13 & 128) != 0) {
            str6 = gaugeStep.theme;
        }
        if ((i13 & 256) != 0) {
            str7 = gaugeStep.themeVariant;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        String str13 = str2;
        return gaugeStep.copy(f13, str, str13, list, str12, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(GaugeStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeFloatElement(serialDesc, 0, self.gaugeFillPercentage);
        output.encodeStringElement(serialDesc, 1, self.gaugeDisplayDate);
        output.encodeStringElement(serialDesc, 2, self.gaugeDisplayValue);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.highlightedTexts);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.footerText != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.footerText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.footerSubText != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.footerSubText);
        }
        output.encodeStringElement(serialDesc, 6, self.name);
        output.encodeStringElement(serialDesc, 7, self.theme);
        output.encodeStringElement(serialDesc, 8, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGaugeDisplayDate() {
        return this.gaugeDisplayDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGaugeDisplayValue() {
        return this.gaugeDisplayValue;
    }

    public final List<HighlightedText> component4() {
        return this.highlightedTexts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFooterSubText() {
        return this.footerSubText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final GaugeStep copy(float gaugeFillPercentage, String gaugeDisplayDate, String gaugeDisplayValue, List<HighlightedText> highlightedTexts, String footerText, String footerSubText, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(gaugeDisplayDate, "gaugeDisplayDate");
        AbstractC22676k.m65750j(gaugeDisplayValue, "gaugeDisplayValue");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new GaugeStep(gaugeFillPercentage, gaugeDisplayDate, gaugeDisplayValue, highlightedTexts, footerText, footerSubText, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GaugeStep)) {
            return false;
        }
        GaugeStep gaugeStep = (GaugeStep) other;
        return Float.compare(this.gaugeFillPercentage, gaugeStep.gaugeFillPercentage) == 0 && AbstractC22676k.m65745e(this.gaugeDisplayDate, gaugeStep.gaugeDisplayDate) && AbstractC22676k.m65745e(this.gaugeDisplayValue, gaugeStep.gaugeDisplayValue) && AbstractC22676k.m65745e(this.highlightedTexts, gaugeStep.highlightedTexts) && AbstractC22676k.m65745e(this.footerText, gaugeStep.footerText) && AbstractC22676k.m65745e(this.footerSubText, gaugeStep.footerSubText) && AbstractC22676k.m65745e(this.name, gaugeStep.name) && AbstractC22676k.m65745e(this.theme, gaugeStep.theme) && AbstractC22676k.m65745e(this.themeVariant, gaugeStep.themeVariant);
    }

    public final String getFooterSubText() {
        return this.footerSubText;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getGaugeDisplayDate() {
        return this.gaugeDisplayDate;
    }

    public final String getGaugeDisplayValue() {
        return this.gaugeDisplayValue;
    }

    public final float getGaugeFillPercentage() {
        return this.gaugeFillPercentage;
    }

    public final List<HighlightedText> getHighlightedTexts() {
        return this.highlightedTexts;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Float.hashCode(this.gaugeFillPercentage) * 31, 31, this.gaugeDisplayDate), 31, this.gaugeDisplayValue), 31, this.highlightedTexts);
        String str = this.footerText;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.footerSubText;
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.name), 31, this.theme);
    }

    public String toString() {
        float f13 = this.gaugeFillPercentage;
        String str = this.gaugeDisplayDate;
        String str2 = this.gaugeDisplayValue;
        List<HighlightedText> list = this.highlightedTexts;
        String str3 = this.footerText;
        String str4 = this.footerSubText;
        String str5 = this.name;
        String str6 = this.theme;
        String str7 = this.themeVariant;
        StringBuilder sb4 = new StringBuilder("GaugeStep(gaugeFillPercentage=");
        sb4.append(f13);
        sb4.append(", gaugeDisplayDate=");
        sb4.append(str);
        sb4.append(", gaugeDisplayValue=");
        AbstractC36095b.m114694v(str2, ", highlightedTexts=", ", footerText=", sb4, list);
        AbstractC11266d.m30444B(sb4, str3, ", footerSubText=", str4, ", name=");
        AbstractC11266d.m30444B(sb4, str5, ", theme=", str6, ", themeVariant=");
        return AbstractC25012a.m73376i(str7, ")", sb4);
    }

    public /* synthetic */ GaugeStep(int i13, float f13, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (463 != (i13 & 463)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 463, GaugeStep$$serializer.INSTANCE.getDescriptor());
        }
        this.gaugeFillPercentage = f13;
        this.gaugeDisplayDate = str;
        this.gaugeDisplayValue = str2;
        this.highlightedTexts = list;
        if ((i13 & 16) == 0) {
            this.footerText = null;
        } else {
            this.footerText = str3;
        }
        if ((i13 & 32) == 0) {
            this.footerSubText = null;
        } else {
            this.footerSubText = str4;
        }
        this.name = str5;
        this.theme = str6;
        this.themeVariant = str7;
    }

    public /* synthetic */ GaugeStep(float f13, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, str, str2, list, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, str5, str6, str7);
    }
}
