package com.whoop.hormonalinsights.onboarding.domain.models;

import al0.C0974i;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenContent;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011By\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#Jt\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b?\u0010\u001eR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010#¨\u0006F"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "title", "descriptionDisplay", "", "maxMonths", "buttonTitle", "skipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "skipNextId", "", "selectedDays", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/util/List;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/util/List;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component7", "component8", "()Ljava/util/List;", "component9", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/util/List;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getDescriptionDisplay", "I", "getMaxMonths", "getButtonTitle", "getSkipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getNextId", "getSkipNextId", "Ljava/util/List;", "getSelectedDays", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "getProgress", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MciDateInputScreen implements HormonalScreenContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final String buttonTitle;
    private final String descriptionDisplay;
    private final int maxMonths;
    private final HormonalScreenId nextId;
    private final FlowProgress progress;
    private final List<String> selectedDays;
    private final HormonalScreenId skipNextId;
    private final String skipTitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MciDateInputScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C0974i(9)), AbstractC30060g.m92087G(enumC23463i, new C0974i(10)), AbstractC30060g.m92087G(enumC23463i, new C0974i(11)), null};
    }

    public /* synthetic */ MciDateInputScreen(int i13, String str, String str2, int i14, String str3, String str4, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, List list, FlowProgress flowProgress, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, MciDateInputScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.descriptionDisplay = str2;
        this.maxMonths = i14;
        this.buttonTitle = str3;
        this.skipTitle = str4;
        this.nextId = hormonalScreenId;
        this.skipNextId = hormonalScreenId2;
        this.selectedDays = list;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MciDateInputScreen copy$default(MciDateInputScreen mciDateInputScreen, String str, String str2, int i13, String str3, String str4, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, List list, FlowProgress flowProgress, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = mciDateInputScreen.title;
        }
        if ((i14 & 2) != 0) {
            str2 = mciDateInputScreen.descriptionDisplay;
        }
        if ((i14 & 4) != 0) {
            i13 = mciDateInputScreen.maxMonths;
        }
        if ((i14 & 8) != 0) {
            str3 = mciDateInputScreen.buttonTitle;
        }
        if ((i14 & 16) != 0) {
            str4 = mciDateInputScreen.skipTitle;
        }
        if ((i14 & 32) != 0) {
            hormonalScreenId = mciDateInputScreen.nextId;
        }
        if ((i14 & 64) != 0) {
            hormonalScreenId2 = mciDateInputScreen.skipNextId;
        }
        if ((i14 & 128) != 0) {
            list = mciDateInputScreen.selectedDays;
        }
        if ((i14 & 256) != 0) {
            flowProgress = mciDateInputScreen.progress;
        }
        List list2 = list;
        FlowProgress flowProgress2 = flowProgress;
        HormonalScreenId hormonalScreenId3 = hormonalScreenId;
        HormonalScreenId hormonalScreenId4 = hormonalScreenId2;
        String str5 = str4;
        int i15 = i13;
        return mciDateInputScreen.copy(str, str2, i15, str3, str5, hormonalScreenId3, hormonalScreenId4, list2, flowProgress2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MciDateInputScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.descriptionDisplay);
        output.encodeIntElement(serialDesc, 2, self.maxMonths);
        output.encodeStringElement(serialDesc, 3, self.buttonTitle);
        output.encodeStringElement(serialDesc, 4, self.skipTitle);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.nextId);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.skipNextId);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.selectedDays);
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
    public final int getMaxMonths() {
        return this.maxMonths;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSkipTitle() {
        return this.skipTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    public final List<String> component8() {
        return this.selectedDays;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final MciDateInputScreen copy(String title, String descriptionDisplay, int maxMonths, String buttonTitle, String skipTitle, HormonalScreenId nextId, HormonalScreenId skipNextId, List<String> selectedDays, FlowProgress progress) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(skipTitle, "skipTitle");
        AbstractC22676k.m65750j(nextId, "nextId");
        AbstractC22676k.m65750j(skipNextId, "skipNextId");
        return new MciDateInputScreen(title, descriptionDisplay, maxMonths, buttonTitle, skipTitle, nextId, skipNextId, selectedDays, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MciDateInputScreen)) {
            return false;
        }
        MciDateInputScreen mciDateInputScreen = (MciDateInputScreen) other;
        return AbstractC22676k.m65745e(this.title, mciDateInputScreen.title) && AbstractC22676k.m65745e(this.descriptionDisplay, mciDateInputScreen.descriptionDisplay) && this.maxMonths == mciDateInputScreen.maxMonths && AbstractC22676k.m65745e(this.buttonTitle, mciDateInputScreen.buttonTitle) && AbstractC22676k.m65745e(this.skipTitle, mciDateInputScreen.skipTitle) && this.nextId == mciDateInputScreen.nextId && this.skipNextId == mciDateInputScreen.skipNextId && AbstractC22676k.m65745e(this.selectedDays, mciDateInputScreen.selectedDays) && AbstractC22676k.m65745e(this.progress, mciDateInputScreen.progress);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final int getMaxMonths() {
        return this.maxMonths;
    }

    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final List<String> getSelectedDays() {
        return this.selectedDays;
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
        int iHashCode = (this.skipNextId.hashCode() + ((this.nextId.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.maxMonths, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.descriptionDisplay), 31), 31, this.buttonTitle), 31, this.skipTitle)) * 31)) * 31;
        List<String> list = this.selectedDays;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        FlowProgress flowProgress = this.progress;
        return iHashCode2 + (flowProgress != null ? flowProgress.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.descriptionDisplay;
        int i13 = this.maxMonths;
        String str3 = this.buttonTitle;
        String str4 = this.skipTitle;
        HormonalScreenId hormonalScreenId = this.nextId;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        List<String> list = this.selectedDays;
        FlowProgress flowProgress = this.progress;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MciDateInputScreen(title=", str, ", descriptionDisplay=", str2, ", maxMonths=");
        AbstractC11895b.m31979B(i13, ", buttonTitle=", str3, ", skipTitle=", sbM32001t);
        sbM32001t.append(str4);
        sbM32001t.append(", nextId=");
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(", skipNextId=");
        sbM32001t.append(hormonalScreenId2);
        sbM32001t.append(", selectedDays=");
        sbM32001t.append(list);
        sbM32001t.append(", progress=");
        sbM32001t.append(flowProgress);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MciDateInputScreen(String title, String descriptionDisplay, int i13, String buttonTitle, String skipTitle, HormonalScreenId nextId, HormonalScreenId skipNextId, List<String> list, FlowProgress flowProgress) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(skipTitle, "skipTitle");
        AbstractC22676k.m65750j(nextId, "nextId");
        AbstractC22676k.m65750j(skipNextId, "skipNextId");
        this.title = title;
        this.descriptionDisplay = descriptionDisplay;
        this.maxMonths = i13;
        this.buttonTitle = buttonTitle;
        this.skipTitle = skipTitle;
        this.nextId = nextId;
        this.skipNextId = skipNextId;
        this.selectedDays = list;
        this.progress = flowProgress;
    }
}
