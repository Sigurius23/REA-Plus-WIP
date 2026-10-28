package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import cq2.C11062a;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fBw\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJr\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010+\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b7\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b8\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b9\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b:\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b;\u0010\u001f¨\u0006>"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/StackedHorizontalBarsStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "title", "", "Lcom/whoop/user/journey/model/yearinreview/Bar;", "stackedBars", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "highlightedTexts", "footerText", "footerSubText", "name", "theme", "themeVariant", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/StackedHorizontalBarsStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/StackedHorizontalBarsStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getStackedBars", "getHighlightedTexts", "getFooterText", "getFooterSubText", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StackedHorizontalBarsStep implements UserJourneyStep {
    private static final InterfaceC23462h[] $childSerializers;
    private final String footerSubText;
    private final String footerText;
    private final List<HighlightedText> highlightedTexts;
    private final String name;
    private final List<Bar> stackedBars;
    private final String theme;
    private final String themeVariant;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/StackedHorizontalBarsStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/StackedHorizontalBarsStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StackedHorizontalBarsStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C11062a(16)), AbstractC30060g.m92087G(enumC23463i, new C11062a(17)), null, null, null, null, null};
    }

    public /* synthetic */ StackedHorizontalBarsStep(int i13, String str, List list, List list2, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (228 != (i13 & 228)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 228, StackedHorizontalBarsStep$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.stackedBars = C25271y.f99162w;
        } else {
            this.stackedBars = list;
        }
        this.highlightedTexts = list2;
        if ((i13 & 8) == 0) {
            this.footerText = null;
        } else {
            this.footerText = str2;
        }
        if ((i13 & 16) == 0) {
            this.footerSubText = null;
        } else {
            this.footerSubText = str3;
        }
        this.name = str4;
        this.theme = str5;
        this.themeVariant = str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Bar$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(HighlightedText$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StackedHorizontalBarsStep copy$default(StackedHorizontalBarsStep stackedHorizontalBarsStep, String str, List list, List list2, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stackedHorizontalBarsStep.title;
        }
        if ((i13 & 2) != 0) {
            list = stackedHorizontalBarsStep.stackedBars;
        }
        if ((i13 & 4) != 0) {
            list2 = stackedHorizontalBarsStep.highlightedTexts;
        }
        if ((i13 & 8) != 0) {
            str2 = stackedHorizontalBarsStep.footerText;
        }
        if ((i13 & 16) != 0) {
            str3 = stackedHorizontalBarsStep.footerSubText;
        }
        if ((i13 & 32) != 0) {
            str4 = stackedHorizontalBarsStep.name;
        }
        if ((i13 & 64) != 0) {
            str5 = stackedHorizontalBarsStep.theme;
        }
        if ((i13 & 128) != 0) {
            str6 = stackedHorizontalBarsStep.themeVariant;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return stackedHorizontalBarsStep.copy(str, list, list2, str2, str9, str10, str7, str8);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(StackedHorizontalBarsStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.stackedBars, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.stackedBars);
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.highlightedTexts);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.footerText != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.footerText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.footerSubText != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.footerSubText);
        }
        output.encodeStringElement(serialDesc, 5, self.name);
        output.encodeStringElement(serialDesc, 6, self.theme);
        output.encodeStringElement(serialDesc, 7, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Bar> component2() {
        return this.stackedBars;
    }

    public final List<HighlightedText> component3() {
        return this.highlightedTexts;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFooterSubText() {
        return this.footerSubText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final StackedHorizontalBarsStep copy(String title, List<Bar> stackedBars, List<HighlightedText> highlightedTexts, String footerText, String footerSubText, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(stackedBars, "stackedBars");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new StackedHorizontalBarsStep(title, stackedBars, highlightedTexts, footerText, footerSubText, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StackedHorizontalBarsStep)) {
            return false;
        }
        StackedHorizontalBarsStep stackedHorizontalBarsStep = (StackedHorizontalBarsStep) other;
        return AbstractC22676k.m65745e(this.title, stackedHorizontalBarsStep.title) && AbstractC22676k.m65745e(this.stackedBars, stackedHorizontalBarsStep.stackedBars) && AbstractC22676k.m65745e(this.highlightedTexts, stackedHorizontalBarsStep.highlightedTexts) && AbstractC22676k.m65745e(this.footerText, stackedHorizontalBarsStep.footerText) && AbstractC22676k.m65745e(this.footerSubText, stackedHorizontalBarsStep.footerSubText) && AbstractC22676k.m65745e(this.name, stackedHorizontalBarsStep.name) && AbstractC22676k.m65745e(this.theme, stackedHorizontalBarsStep.theme) && AbstractC22676k.m65745e(this.themeVariant, stackedHorizontalBarsStep.themeVariant);
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

    public final List<Bar> getStackedBars() {
        return this.stackedBars;
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

    public int hashCode() {
        String str = this.title;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.stackedBars), 31, this.highlightedTexts);
        String str2 = this.footerText;
        int iHashCode = (iM31983b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.footerSubText;
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.name), 31, this.theme);
    }

    public String toString() {
        String str = this.title;
        List<Bar> list = this.stackedBars;
        List<HighlightedText> list2 = this.highlightedTexts;
        String str2 = this.footerText;
        String str3 = this.footerSubText;
        String str4 = this.name;
        String str5 = this.theme;
        String str6 = this.themeVariant;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("StackedHorizontalBarsStep(title=", str, ", stackedBars=", ", highlightedTexts=", list);
        AbstractC17176i.m48511m(", footerText=", str2, ", footerSubText=", sbM94766o, list2);
        AbstractC11266d.m30444B(sbM94766o, str3, ", name=", str4, ", theme=");
        return AbstractC11266d.m30464r(sbM94766o, str5, ", themeVariant=", str6, ")");
    }

    public StackedHorizontalBarsStep(String str, List<Bar> stackedBars, List<HighlightedText> highlightedTexts, String str2, String str3, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(stackedBars, "stackedBars");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.title = str;
        this.stackedBars = stackedBars;
        this.highlightedTexts = highlightedTexts;
        this.footerText = str2;
        this.footerSubText = str3;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }

    public /* synthetic */ StackedHorizontalBarsStep(String str, List list, List list2, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? C25271y.f99162w : list, list2, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, str4, str5, str6);
    }
}
