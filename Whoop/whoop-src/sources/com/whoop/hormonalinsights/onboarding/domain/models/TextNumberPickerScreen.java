package com.whoop.hormonalinsights.onboarding.domain.models;

import al0.C0974i;
import androidx.core.app.NotificationCompat;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenContent;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0086\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010\u001cJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b?\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010!R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bD\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010&¨\u0006K"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "title", "descriptionDisplay", "trailingText", "", "minValue", "maxValue", "buttonTitle", "skipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "skipNextId", "nextId", "currentValue", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "component8", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component9", "component10", "()Ljava/lang/Integer;", "component11", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getDescriptionDisplay", "getTrailingText", "I", "getMinValue", "getMaxValue", "getButtonTitle", "getSkipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getSkipNextId", "getNextId", "Ljava/lang/Integer;", "getCurrentValue", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "getProgress", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextNumberPickerScreen implements HormonalScreenContent {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String buttonTitle;
    private final Integer currentValue;
    private final String descriptionDisplay;
    private final int maxValue;
    private final int minValue;
    private final HormonalScreenId nextId;
    private final FlowProgress progress;
    private final HormonalScreenId skipNextId;
    private final String skipTitle;
    private final String title;
    private final String trailingText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextNumberPickerScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C0974i(21)), AbstractC30060g.m92087G(enumC23463i, new C0974i(22)), null, null};
    }

    public /* synthetic */ TextNumberPickerScreen(int i13, String str, String str2, String str3, int i14, int i15, String str4, String str5, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, Integer num, FlowProgress flowProgress, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, TextNumberPickerScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.descriptionDisplay = str2;
        this.trailingText = str3;
        this.minValue = i14;
        this.maxValue = i15;
        this.buttonTitle = str4;
        this.skipTitle = str5;
        this.skipNextId = hormonalScreenId;
        this.nextId = hormonalScreenId2;
        this.currentValue = num;
        this.progress = flowProgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    public static /* synthetic */ TextNumberPickerScreen copy$default(TextNumberPickerScreen textNumberPickerScreen, String str, String str2, String str3, int i13, int i14, String str4, String str5, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, Integer num, FlowProgress flowProgress, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = textNumberPickerScreen.title;
        }
        if ((i15 & 2) != 0) {
            str2 = textNumberPickerScreen.descriptionDisplay;
        }
        if ((i15 & 4) != 0) {
            str3 = textNumberPickerScreen.trailingText;
        }
        if ((i15 & 8) != 0) {
            i13 = textNumberPickerScreen.minValue;
        }
        if ((i15 & 16) != 0) {
            i14 = textNumberPickerScreen.maxValue;
        }
        if ((i15 & 32) != 0) {
            str4 = textNumberPickerScreen.buttonTitle;
        }
        if ((i15 & 64) != 0) {
            str5 = textNumberPickerScreen.skipTitle;
        }
        if ((i15 & 128) != 0) {
            hormonalScreenId = textNumberPickerScreen.skipNextId;
        }
        if ((i15 & 256) != 0) {
            hormonalScreenId2 = textNumberPickerScreen.nextId;
        }
        if ((i15 & 512) != 0) {
            num = textNumberPickerScreen.currentValue;
        }
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            flowProgress = textNumberPickerScreen.progress;
        }
        Integer num2 = num;
        FlowProgress flowProgress2 = flowProgress;
        HormonalScreenId hormonalScreenId3 = hormonalScreenId;
        HormonalScreenId hormonalScreenId4 = hormonalScreenId2;
        String str6 = str4;
        String str7 = str5;
        int i16 = i14;
        String str8 = str3;
        return textNumberPickerScreen.copy(str, str2, str8, i13, i16, str6, str7, hormonalScreenId3, hormonalScreenId4, num2, flowProgress2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(TextNumberPickerScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.descriptionDisplay);
        output.encodeStringElement(serialDesc, 2, self.trailingText);
        output.encodeIntElement(serialDesc, 3, self.minValue);
        output.encodeIntElement(serialDesc, 4, self.maxValue);
        output.encodeStringElement(serialDesc, 5, self.buttonTitle);
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.skipTitle);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.skipNextId);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.nextId);
        output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.currentValue);
        output.encodeNullableSerializableElement(serialDesc, 10, FlowProgress$$serializer.INSTANCE, self.progress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final FlowProgress getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrailingText() {
        return this.trailingText;
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
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSkipTitle() {
        return this.skipTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final TextNumberPickerScreen copy(String title, String descriptionDisplay, String trailingText, int minValue, int maxValue, String buttonTitle, String skipTitle, HormonalScreenId skipNextId, HormonalScreenId nextId, Integer currentValue, FlowProgress progress) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(trailingText, "trailingText");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(nextId, "nextId");
        return new TextNumberPickerScreen(title, descriptionDisplay, trailingText, minValue, maxValue, buttonTitle, skipTitle, skipNextId, nextId, currentValue, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextNumberPickerScreen)) {
            return false;
        }
        TextNumberPickerScreen textNumberPickerScreen = (TextNumberPickerScreen) other;
        return AbstractC22676k.m65745e(this.title, textNumberPickerScreen.title) && AbstractC22676k.m65745e(this.descriptionDisplay, textNumberPickerScreen.descriptionDisplay) && AbstractC22676k.m65745e(this.trailingText, textNumberPickerScreen.trailingText) && this.minValue == textNumberPickerScreen.minValue && this.maxValue == textNumberPickerScreen.maxValue && AbstractC22676k.m65745e(this.buttonTitle, textNumberPickerScreen.buttonTitle) && AbstractC22676k.m65745e(this.skipTitle, textNumberPickerScreen.skipTitle) && this.skipNextId == textNumberPickerScreen.skipNextId && this.nextId == textNumberPickerScreen.nextId && AbstractC22676k.m65745e(this.currentValue, textNumberPickerScreen.currentValue) && AbstractC22676k.m65745e(this.progress, textNumberPickerScreen.progress);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final Integer getCurrentValue() {
        return this.currentValue;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    public final String getSkipTitle() {
        return this.skipTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrailingText() {
        return this.trailingText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.maxValue, AbstractC11266d.m30448b(this.minValue, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.descriptionDisplay), 31, this.trailingText), 31), 31), 31, this.buttonTitle);
        String str = this.skipTitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        HormonalScreenId hormonalScreenId = this.skipNextId;
        int iHashCode2 = (this.nextId.hashCode() + ((iHashCode + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31)) * 31;
        Integer num = this.currentValue;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        FlowProgress flowProgress = this.progress;
        return iHashCode3 + (flowProgress != null ? flowProgress.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.descriptionDisplay;
        String str3 = this.trailingText;
        int i13 = this.minValue;
        int i14 = this.maxValue;
        String str4 = this.buttonTitle;
        String str5 = this.skipTitle;
        HormonalScreenId hormonalScreenId = this.skipNextId;
        HormonalScreenId hormonalScreenId2 = this.nextId;
        Integer num = this.currentValue;
        FlowProgress flowProgress = this.progress;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TextNumberPickerScreen(title=", str, ", descriptionDisplay=", str2, ", trailingText=");
        AbstractC11266d.m30470x(i13, str3, ", minValue=", ", maxValue=", sbM32001t);
        AbstractC11895b.m31979B(i14, ", buttonTitle=", str4, ", skipTitle=", sbM32001t);
        sbM32001t.append(str5);
        sbM32001t.append(", skipNextId=");
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(", nextId=");
        sbM32001t.append(hormonalScreenId2);
        sbM32001t.append(", currentValue=");
        sbM32001t.append(num);
        sbM32001t.append(", progress=");
        sbM32001t.append(flowProgress);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public TextNumberPickerScreen(String title, String descriptionDisplay, String trailingText, int i13, int i14, String buttonTitle, String str, HormonalScreenId hormonalScreenId, HormonalScreenId nextId, Integer num, FlowProgress flowProgress) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(trailingText, "trailingText");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(nextId, "nextId");
        this.title = title;
        this.descriptionDisplay = descriptionDisplay;
        this.trailingText = trailingText;
        this.minValue = i13;
        this.maxValue = i14;
        this.buttonTitle = buttonTitle;
        this.skipTitle = str;
        this.skipNextId = hormonalScreenId;
        this.nextId = nextId;
        this.currentValue = num;
        this.progress = flowProgress;
    }
}
