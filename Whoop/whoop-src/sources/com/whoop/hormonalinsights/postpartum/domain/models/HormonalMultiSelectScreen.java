package com.whoop.hormonalinsights.postpartum.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import com.whoop.hormonalinsights.onboarding.domain.models.FlowProgress;
import com.whoop.hormonalinsights.onboarding.domain.models.FlowProgress$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
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
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J|\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\u0018R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b@\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bC\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010$¨\u0006H"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "title", "descriptionDisplay", "", "optionLimit", "buttonTitle", "", "Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;", "options", "skipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "skipNextId", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component8", "component9", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getDescriptionDisplay", "Ljava/lang/Integer;", "getOptionLimit", "getButtonTitle", "Ljava/util/List;", "getOptions", "getSkipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getNextId", "getSkipNextId", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "getProgress", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalMultiSelectScreen implements HormonalScreenContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final String buttonTitle;
    private final String descriptionDisplay;
    private final HormonalScreenId nextId;
    private final Integer optionLimit;
    private final List<MultiSelectOption> options;
    private final FlowProgress progress;
    private final HormonalScreenId skipNextId;
    private final String skipTitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalMultiSelectScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C15999a(26)), null, AbstractC30060g.m92087G(enumC23463i, new C15999a(27)), AbstractC30060g.m92087G(enumC23463i, new C15999a(28)), null};
    }

    public /* synthetic */ HormonalMultiSelectScreen(int i13, String str, String str2, Integer num, String str3, List list, String str4, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, FlowProgress flowProgress, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, HormonalMultiSelectScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.descriptionDisplay = str2;
        this.optionLimit = num;
        this.buttonTitle = str3;
        this.options = list;
        this.skipTitle = str4;
        this.nextId = hormonalScreenId;
        this.skipNextId = hormonalScreenId2;
        this.progress = flowProgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MultiSelectOption$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HormonalMultiSelectScreen copy$default(HormonalMultiSelectScreen hormonalMultiSelectScreen, String str, String str2, Integer num, String str3, List list, String str4, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, FlowProgress flowProgress, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalMultiSelectScreen.title;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalMultiSelectScreen.descriptionDisplay;
        }
        if ((i13 & 4) != 0) {
            num = hormonalMultiSelectScreen.optionLimit;
        }
        if ((i13 & 8) != 0) {
            str3 = hormonalMultiSelectScreen.buttonTitle;
        }
        if ((i13 & 16) != 0) {
            list = hormonalMultiSelectScreen.options;
        }
        if ((i13 & 32) != 0) {
            str4 = hormonalMultiSelectScreen.skipTitle;
        }
        if ((i13 & 64) != 0) {
            hormonalScreenId = hormonalMultiSelectScreen.nextId;
        }
        if ((i13 & 128) != 0) {
            hormonalScreenId2 = hormonalMultiSelectScreen.skipNextId;
        }
        if ((i13 & 256) != 0) {
            flowProgress = hormonalMultiSelectScreen.progress;
        }
        HormonalScreenId hormonalScreenId3 = hormonalScreenId2;
        FlowProgress flowProgress2 = flowProgress;
        String str5 = str4;
        HormonalScreenId hormonalScreenId4 = hormonalScreenId;
        List list2 = list;
        Integer num2 = num;
        return hormonalMultiSelectScreen.copy(str, str2, num2, str3, list2, str5, hormonalScreenId4, hormonalScreenId3, flowProgress2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(HormonalMultiSelectScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.descriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.optionLimit);
        output.encodeStringElement(serialDesc, 3, self.buttonTitle);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.options);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.skipTitle);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.nextId);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.skipNextId);
        output.encodeNullableSerializableElement(serialDesc, 8, FlowProgress$$serializer.INSTANCE, self.progress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getOptionLimit() {
        return this.optionLimit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<MultiSelectOption> component5() {
        return this.options;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSkipTitle() {
        return this.skipTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final HormonalMultiSelectScreen copy(String title, String descriptionDisplay, Integer optionLimit, String buttonTitle, List<MultiSelectOption> options, String skipTitle, HormonalScreenId nextId, HormonalScreenId skipNextId, FlowProgress progress) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(options, "options");
        return new HormonalMultiSelectScreen(title, descriptionDisplay, optionLimit, buttonTitle, options, skipTitle, nextId, skipNextId, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalMultiSelectScreen)) {
            return false;
        }
        HormonalMultiSelectScreen hormonalMultiSelectScreen = (HormonalMultiSelectScreen) other;
        return AbstractC22676k.m65745e(this.title, hormonalMultiSelectScreen.title) && AbstractC22676k.m65745e(this.descriptionDisplay, hormonalMultiSelectScreen.descriptionDisplay) && AbstractC22676k.m65745e(this.optionLimit, hormonalMultiSelectScreen.optionLimit) && AbstractC22676k.m65745e(this.buttonTitle, hormonalMultiSelectScreen.buttonTitle) && AbstractC22676k.m65745e(this.options, hormonalMultiSelectScreen.options) && AbstractC22676k.m65745e(this.skipTitle, hormonalMultiSelectScreen.skipTitle) && this.nextId == hormonalMultiSelectScreen.nextId && this.skipNextId == hormonalMultiSelectScreen.skipNextId && AbstractC22676k.m65745e(this.progress, hormonalMultiSelectScreen.progress);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final Integer getOptionLimit() {
        return this.optionLimit;
    }

    public final List<MultiSelectOption> getOptions() {
        return this.options;
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

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.descriptionDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.optionLimit;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.buttonTitle), 31, this.options);
        String str2 = this.skipTitle;
        int iHashCode3 = (iM31983b + (str2 == null ? 0 : str2.hashCode())) * 31;
        HormonalScreenId hormonalScreenId = this.nextId;
        int iHashCode4 = (iHashCode3 + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        int iHashCode5 = (iHashCode4 + (hormonalScreenId2 == null ? 0 : hormonalScreenId2.hashCode())) * 31;
        FlowProgress flowProgress = this.progress;
        return iHashCode5 + (flowProgress != null ? flowProgress.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.descriptionDisplay;
        Integer num = this.optionLimit;
        String str3 = this.buttonTitle;
        List<MultiSelectOption> list = this.options;
        String str4 = this.skipTitle;
        HormonalScreenId hormonalScreenId = this.nextId;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        FlowProgress flowProgress = this.progress;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalMultiSelectScreen(title=", str, ", descriptionDisplay=", str2, ", optionLimit=");
        AbstractC13673n.m38577x(num, ", buttonTitle=", str3, ", options=", sbM32001t);
        AbstractC17176i.m48511m(", skipTitle=", str4, ", nextId=", sbM32001t, list);
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(", skipNextId=");
        sbM32001t.append(hormonalScreenId2);
        sbM32001t.append(", progress=");
        sbM32001t.append(flowProgress);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HormonalMultiSelectScreen(String title, String str, Integer num, String buttonTitle, List<MultiSelectOption> options, String str2, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, FlowProgress flowProgress) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(options, "options");
        this.title = title;
        this.descriptionDisplay = str;
        this.optionLimit = num;
        this.buttonTitle = buttonTitle;
        this.options = options;
        this.skipTitle = str2;
        this.nextId = hormonalScreenId;
        this.skipNextId = hormonalScreenId2;
        this.progress = flowProgress;
    }
}
