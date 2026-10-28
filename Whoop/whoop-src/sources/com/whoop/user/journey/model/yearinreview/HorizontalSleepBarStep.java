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
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u009f\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0098\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\bA\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bB\u0010\u0019R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bC\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bD\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bE\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bF\u0010\u0019¨\u0006I"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/HorizontalSleepBarStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "subtitle", "wakeTimeText", "bedtimeText", "sleepFillPercentageLower", "sleepFillPercentageHigher", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "highlightedTexts", "footerText", "footerSubText", "axisLabels", "name", "theme", "themeVariant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/HorizontalSleepBarStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/HorizontalSleepBarStep;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getSubtitle", "getWakeTimeText", "getBedtimeText", "getSleepFillPercentageLower", "getSleepFillPercentageHigher", "Ljava/util/List;", "getHighlightedTexts", "getFooterText", "getFooterSubText", "getAxisLabels", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalSleepBarStep implements UserJourneyStep {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<String> axisLabels;
    private final String bedtimeText;
    private final String footerSubText;
    private final String footerText;
    private final List<HighlightedText> highlightedTexts;
    private final String name;
    private final String sleepFillPercentageHigher;
    private final String sleepFillPercentageLower;
    private final String subtitle;
    private final String theme;
    private final String themeVariant;
    private final String wakeTimeText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/HorizontalSleepBarStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/HorizontalSleepBarStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalSleepBarStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C11062a(2)), null, null, AbstractC30060g.m92087G(enumC23463i, new C11062a(3)), null, null, null};
    }

    public /* synthetic */ HorizontalSleepBarStep(int i13, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, List list2, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (3903 != (i13 & 3903)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3903, HorizontalSleepBarStep$$serializer.INSTANCE.getDescriptor());
        }
        this.subtitle = str;
        this.wakeTimeText = str2;
        this.bedtimeText = str3;
        this.sleepFillPercentageLower = str4;
        this.sleepFillPercentageHigher = str5;
        this.highlightedTexts = list;
        if ((i13 & 64) == 0) {
            this.footerText = null;
        } else {
            this.footerText = str6;
        }
        if ((i13 & 128) == 0) {
            this.footerSubText = null;
        } else {
            this.footerSubText = str7;
        }
        this.axisLabels = list2;
        this.name = str8;
        this.theme = str9;
        this.themeVariant = str10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HighlightedText$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HorizontalSleepBarStep copy$default(HorizontalSleepBarStep horizontalSleepBarStep, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, List list2, String str8, String str9, String str10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = horizontalSleepBarStep.subtitle;
        }
        if ((i13 & 2) != 0) {
            str2 = horizontalSleepBarStep.wakeTimeText;
        }
        if ((i13 & 4) != 0) {
            str3 = horizontalSleepBarStep.bedtimeText;
        }
        if ((i13 & 8) != 0) {
            str4 = horizontalSleepBarStep.sleepFillPercentageLower;
        }
        if ((i13 & 16) != 0) {
            str5 = horizontalSleepBarStep.sleepFillPercentageHigher;
        }
        if ((i13 & 32) != 0) {
            list = horizontalSleepBarStep.highlightedTexts;
        }
        if ((i13 & 64) != 0) {
            str6 = horizontalSleepBarStep.footerText;
        }
        if ((i13 & 128) != 0) {
            str7 = horizontalSleepBarStep.footerSubText;
        }
        if ((i13 & 256) != 0) {
            list2 = horizontalSleepBarStep.axisLabels;
        }
        if ((i13 & 512) != 0) {
            str8 = horizontalSleepBarStep.name;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str9 = horizontalSleepBarStep.theme;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str10 = horizontalSleepBarStep.themeVariant;
        }
        String str11 = str9;
        String str12 = str10;
        List list3 = list2;
        String str13 = str8;
        String str14 = str6;
        String str15 = str7;
        String str16 = str5;
        List list4 = list;
        return horizontalSleepBarStep.copy(str, str2, str3, str4, str16, list4, str14, str15, list3, str13, str11, str12);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(HorizontalSleepBarStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.subtitle);
        output.encodeStringElement(serialDesc, 1, self.wakeTimeText);
        output.encodeStringElement(serialDesc, 2, self.bedtimeText);
        output.encodeStringElement(serialDesc, 3, self.sleepFillPercentageLower);
        output.encodeStringElement(serialDesc, 4, self.sleepFillPercentageHigher);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.highlightedTexts);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.footerText != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.footerText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.footerSubText != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.footerSubText);
        }
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.axisLabels);
        output.encodeStringElement(serialDesc, 9, self.name);
        output.encodeStringElement(serialDesc, 10, self.theme);
        output.encodeStringElement(serialDesc, 11, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWakeTimeText() {
        return this.wakeTimeText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBedtimeText() {
        return this.bedtimeText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSleepFillPercentageLower() {
        return this.sleepFillPercentageLower;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSleepFillPercentageHigher() {
        return this.sleepFillPercentageHigher;
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

    public final List<String> component9() {
        return this.axisLabels;
    }

    public final HorizontalSleepBarStep copy(String subtitle, String wakeTimeText, String bedtimeText, String sleepFillPercentageLower, String sleepFillPercentageHigher, List<HighlightedText> highlightedTexts, String footerText, String footerSubText, List<String> axisLabels, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(wakeTimeText, "wakeTimeText");
        AbstractC22676k.m65750j(bedtimeText, "bedtimeText");
        AbstractC22676k.m65750j(sleepFillPercentageLower, "sleepFillPercentageLower");
        AbstractC22676k.m65750j(sleepFillPercentageHigher, "sleepFillPercentageHigher");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(axisLabels, "axisLabels");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new HorizontalSleepBarStep(subtitle, wakeTimeText, bedtimeText, sleepFillPercentageLower, sleepFillPercentageHigher, highlightedTexts, footerText, footerSubText, axisLabels, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalSleepBarStep)) {
            return false;
        }
        HorizontalSleepBarStep horizontalSleepBarStep = (HorizontalSleepBarStep) other;
        return AbstractC22676k.m65745e(this.subtitle, horizontalSleepBarStep.subtitle) && AbstractC22676k.m65745e(this.wakeTimeText, horizontalSleepBarStep.wakeTimeText) && AbstractC22676k.m65745e(this.bedtimeText, horizontalSleepBarStep.bedtimeText) && AbstractC22676k.m65745e(this.sleepFillPercentageLower, horizontalSleepBarStep.sleepFillPercentageLower) && AbstractC22676k.m65745e(this.sleepFillPercentageHigher, horizontalSleepBarStep.sleepFillPercentageHigher) && AbstractC22676k.m65745e(this.highlightedTexts, horizontalSleepBarStep.highlightedTexts) && AbstractC22676k.m65745e(this.footerText, horizontalSleepBarStep.footerText) && AbstractC22676k.m65745e(this.footerSubText, horizontalSleepBarStep.footerSubText) && AbstractC22676k.m65745e(this.axisLabels, horizontalSleepBarStep.axisLabels) && AbstractC22676k.m65745e(this.name, horizontalSleepBarStep.name) && AbstractC22676k.m65745e(this.theme, horizontalSleepBarStep.theme) && AbstractC22676k.m65745e(this.themeVariant, horizontalSleepBarStep.themeVariant);
    }

    public final List<String> getAxisLabels() {
        return this.axisLabels;
    }

    public final String getBedtimeText() {
        return this.bedtimeText;
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

    public final String getSleepFillPercentageHigher() {
        return this.sleepFillPercentageHigher;
    }

    public final String getSleepFillPercentageLower() {
        return this.sleepFillPercentageLower;
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

    public final String getWakeTimeText() {
        return this.wakeTimeText;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.subtitle.hashCode() * 31, 31, this.wakeTimeText), 31, this.bedtimeText), 31, this.sleepFillPercentageLower), 31, this.sleepFillPercentageHigher), 31, this.highlightedTexts);
        String str = this.footerText;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.footerSubText;
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.axisLabels), 31, this.name), 31, this.theme);
    }

    public String toString() {
        String str = this.subtitle;
        String str2 = this.wakeTimeText;
        String str3 = this.bedtimeText;
        String str4 = this.sleepFillPercentageLower;
        String str5 = this.sleepFillPercentageHigher;
        List<HighlightedText> list = this.highlightedTexts;
        String str6 = this.footerText;
        String str7 = this.footerSubText;
        List<String> list2 = this.axisLabels;
        String str8 = this.name;
        String str9 = this.theme;
        String str10 = this.themeVariant;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HorizontalSleepBarStep(subtitle=", str, ", wakeTimeText=", str2, ", bedtimeText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", sleepFillPercentageLower=", str4, ", sleepFillPercentageHigher=");
        AbstractC36095b.m114694v(str5, ", highlightedTexts=", ", footerText=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str6, ", footerSubText=", str7, ", axisLabels=");
        AbstractC17176i.m48511m(", name=", str8, ", theme=", sbM32001t, list2);
        return AbstractC11266d.m30464r(sbM32001t, str9, ", themeVariant=", str10, ")");
    }

    public HorizontalSleepBarStep(String subtitle, String wakeTimeText, String bedtimeText, String sleepFillPercentageLower, String sleepFillPercentageHigher, List<HighlightedText> highlightedTexts, String str, String str2, List<String> axisLabels, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(wakeTimeText, "wakeTimeText");
        AbstractC22676k.m65750j(bedtimeText, "bedtimeText");
        AbstractC22676k.m65750j(sleepFillPercentageLower, "sleepFillPercentageLower");
        AbstractC22676k.m65750j(sleepFillPercentageHigher, "sleepFillPercentageHigher");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(axisLabels, "axisLabels");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.subtitle = subtitle;
        this.wakeTimeText = wakeTimeText;
        this.bedtimeText = bedtimeText;
        this.sleepFillPercentageLower = sleepFillPercentageLower;
        this.sleepFillPercentageHigher = sleepFillPercentageHigher;
        this.highlightedTexts = highlightedTexts;
        this.footerText = str;
        this.footerSubText = str2;
        this.axisLabels = axisLabels;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }

    public /* synthetic */ HorizontalSleepBarStep(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, List list2, String str8, String str9, String str10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, list, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? null : str7, list2, str8, str9, str10);
    }
}
