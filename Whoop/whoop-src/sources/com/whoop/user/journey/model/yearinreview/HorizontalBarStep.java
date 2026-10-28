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
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
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
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0088\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bB\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bC\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bD\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bE\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bF\u0010\u0019¨\u0006I"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/HorizontalBarStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "title", "value", "valueSuffix", "subtitle", "", "barFillPercentage", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "highlightedTexts", "footerText", "footerSubText", "name", "theme", "themeVariant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()F", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/HorizontalBarStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/HorizontalBarStep;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getValue", "getValueSuffix", "getSubtitle", "F", "getBarFillPercentage", "Ljava/util/List;", "getHighlightedTexts", "getFooterText", "getFooterSubText", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalBarStep implements UserJourneyStep {
    private final float barFillPercentage;
    private final String footerSubText;
    private final String footerText;
    private final List<HighlightedText> highlightedTexts;
    private final String name;
    private final String subtitle;
    private final String theme;
    private final String themeVariant;
    private final String title;
    private final String value;
    private final String valueSuffix;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11062a(1)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/HorizontalBarStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/HorizontalBarStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalBarStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HorizontalBarStep(int i13, String str, String str2, String str3, String str4, float f13, List list, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (1855 != (i13 & 1855)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1855, HorizontalBarStep$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.value = str2;
        this.valueSuffix = str3;
        this.subtitle = str4;
        this.barFillPercentage = f13;
        this.highlightedTexts = list;
        if ((i13 & 64) == 0) {
            this.footerText = null;
        } else {
            this.footerText = str5;
        }
        if ((i13 & 128) == 0) {
            this.footerSubText = null;
        } else {
            this.footerSubText = str6;
        }
        this.name = str7;
        this.theme = str8;
        this.themeVariant = str9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HighlightedText$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HorizontalBarStep copy$default(HorizontalBarStep horizontalBarStep, String str, String str2, String str3, String str4, float f13, List list, String str5, String str6, String str7, String str8, String str9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = horizontalBarStep.title;
        }
        if ((i13 & 2) != 0) {
            str2 = horizontalBarStep.value;
        }
        if ((i13 & 4) != 0) {
            str3 = horizontalBarStep.valueSuffix;
        }
        if ((i13 & 8) != 0) {
            str4 = horizontalBarStep.subtitle;
        }
        if ((i13 & 16) != 0) {
            f13 = horizontalBarStep.barFillPercentage;
        }
        if ((i13 & 32) != 0) {
            list = horizontalBarStep.highlightedTexts;
        }
        if ((i13 & 64) != 0) {
            str5 = horizontalBarStep.footerText;
        }
        if ((i13 & 128) != 0) {
            str6 = horizontalBarStep.footerSubText;
        }
        if ((i13 & 256) != 0) {
            str7 = horizontalBarStep.name;
        }
        if ((i13 & 512) != 0) {
            str8 = horizontalBarStep.theme;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str9 = horizontalBarStep.themeVariant;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        List list2 = list;
        String str14 = str5;
        float f14 = f13;
        String str15 = str3;
        return horizontalBarStep.copy(str, str2, str15, str4, f14, list2, str14, str12, str13, str10, str11);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(HorizontalBarStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.value);
        output.encodeStringElement(serialDesc, 2, self.valueSuffix);
        output.encodeStringElement(serialDesc, 3, self.subtitle);
        output.encodeFloatElement(serialDesc, 4, self.barFillPercentage);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.highlightedTexts);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.footerText != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.footerText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.footerSubText != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.footerSubText);
        }
        output.encodeStringElement(serialDesc, 8, self.name);
        output.encodeStringElement(serialDesc, 9, self.theme);
        output.encodeStringElement(serialDesc, 10, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getBarFillPercentage() {
        return this.barFillPercentage;
    }

    public final List<HighlightedText> component6() {
        return this.highlightedTexts;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFooterSubText() {
        return this.footerSubText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final HorizontalBarStep copy(String title, String value, String valueSuffix, String subtitle, float barFillPercentage, List<HighlightedText> highlightedTexts, String footerText, String footerSubText, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(valueSuffix, "valueSuffix");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new HorizontalBarStep(title, value, valueSuffix, subtitle, barFillPercentage, highlightedTexts, footerText, footerSubText, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalBarStep)) {
            return false;
        }
        HorizontalBarStep horizontalBarStep = (HorizontalBarStep) other;
        return AbstractC22676k.m65745e(this.title, horizontalBarStep.title) && AbstractC22676k.m65745e(this.value, horizontalBarStep.value) && AbstractC22676k.m65745e(this.valueSuffix, horizontalBarStep.valueSuffix) && AbstractC22676k.m65745e(this.subtitle, horizontalBarStep.subtitle) && Float.compare(this.barFillPercentage, horizontalBarStep.barFillPercentage) == 0 && AbstractC22676k.m65745e(this.highlightedTexts, horizontalBarStep.highlightedTexts) && AbstractC22676k.m65745e(this.footerText, horizontalBarStep.footerText) && AbstractC22676k.m65745e(this.footerSubText, horizontalBarStep.footerSubText) && AbstractC22676k.m65745e(this.name, horizontalBarStep.name) && AbstractC22676k.m65745e(this.theme, horizontalBarStep.theme) && AbstractC22676k.m65745e(this.themeVariant, horizontalBarStep.themeVariant);
    }

    public final float getBarFillPercentage() {
        return this.barFillPercentage;
    }

    public final String getFooterSubText() {
        return this.footerSubText;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final List<HighlightedText> getHighlightedTexts() {
        return this.highlightedTexts;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30447a(this.barFillPercentage, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.value), 31, this.valueSuffix), 31, this.subtitle), 31), 31, this.highlightedTexts);
        String str = this.footerText;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.footerSubText;
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.name), 31, this.theme);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.value;
        String str3 = this.valueSuffix;
        String str4 = this.subtitle;
        float f13 = this.barFillPercentage;
        List<HighlightedText> list = this.highlightedTexts;
        String str5 = this.footerText;
        String str6 = this.footerSubText;
        String str7 = this.name;
        String str8 = this.theme;
        String str9 = this.themeVariant;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HorizontalBarStep(title=", str, ", value=", str2, ", valueSuffix=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", barFillPercentage=");
        sbM32001t.append(f13);
        sbM32001t.append(", highlightedTexts=");
        sbM32001t.append(list);
        sbM32001t.append(", footerText=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", footerSubText=", str6, ", name=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", theme=", str8, ", themeVariant=");
        return AbstractC25012a.m73376i(str9, ")", sbM32001t);
    }

    public HorizontalBarStep(String title, String value, String valueSuffix, String subtitle, float f13, List<HighlightedText> highlightedTexts, String str, String str2, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(valueSuffix, "valueSuffix");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.title = title;
        this.value = value;
        this.valueSuffix = valueSuffix;
        this.subtitle = subtitle;
        this.barFillPercentage = f13;
        this.highlightedTexts = highlightedTexts;
        this.footerText = str;
        this.footerSubText = str2;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }

    public /* synthetic */ HorizontalBarStep(String str, String str2, String str3, String str4, float f13, List list, String str5, String str6, String str7, String str8, String str9, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, f13, list, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : str6, str7, str8, str9);
    }
}
