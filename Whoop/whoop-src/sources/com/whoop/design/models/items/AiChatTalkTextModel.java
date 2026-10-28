package com.whoop.design.models.items;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\rHÆ\u0003¢\u0006\u0004\b \u0010!Jx\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0017R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001eR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b=\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b\u000e\u0010!¨\u0006A"}, m65681d2 = {"Lcom/whoop/design/models/items/AiChatTalkTextModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "headerImage", "title", "titleTextAlignment", "titleIcon", "subtitle", "subtitleTextAlignment", "", "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;", "smallButtons", "largeButtons", "", "isCenterAligned", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)Lcom/whoop/design/models/items/AiChatTalkTextModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getHeaderImage", "getTitle", "getTitleTextAlignment", "getTitleIcon", "getSubtitle", "getSubtitleTextAlignment", "Ljava/util/List;", "getSmallButtons", "getLargeButtons", "Z", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiChatTalkTextModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String headerImage;
    private final boolean isCenterAligned;
    private final List<AiChatTalkTextButtonModel> largeButtons;
    private final List<AiChatTalkTextButtonModel> smallButtons;
    private final String subtitle;
    private final String subtitleTextAlignment;
    private final String title;
    private final String titleIcon;
    private final String titleTextAlignment;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AiChatTalkTextModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AiChatTalkTextModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiChatTalkTextModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36870a(12)), AbstractC30060g.m92087G(enumC23463i, new C36870a(13)), null};
    }

    public AiChatTalkTextModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, false, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AiChatTalkTextButtonModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(AiChatTalkTextButtonModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiChatTalkTextModel copy$default(AiChatTalkTextModel aiChatTalkTextModel, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiChatTalkTextModel.headerImage;
        }
        if ((i13 & 2) != 0) {
            str2 = aiChatTalkTextModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = aiChatTalkTextModel.titleTextAlignment;
        }
        if ((i13 & 8) != 0) {
            str4 = aiChatTalkTextModel.titleIcon;
        }
        if ((i13 & 16) != 0) {
            str5 = aiChatTalkTextModel.subtitle;
        }
        if ((i13 & 32) != 0) {
            str6 = aiChatTalkTextModel.subtitleTextAlignment;
        }
        if ((i13 & 64) != 0) {
            list = aiChatTalkTextModel.smallButtons;
        }
        if ((i13 & 128) != 0) {
            list2 = aiChatTalkTextModel.largeButtons;
        }
        if ((i13 & 256) != 0) {
            z4 = aiChatTalkTextModel.isCenterAligned;
        }
        List list3 = list2;
        boolean z13 = z4;
        String str7 = str6;
        List list4 = list;
        String str8 = str5;
        String str9 = str3;
        return aiChatTalkTextModel.copy(str, str2, str9, str4, str8, str7, list4, list3, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AiChatTalkTextModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.headerImage, "")) {
            output.encodeStringElement(serialDesc, 0, self.headerImage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 1, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.titleTextAlignment, "")) {
            output.encodeStringElement(serialDesc, 2, self.titleTextAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.titleIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.titleIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.subtitle, "")) {
            output.encodeStringElement(serialDesc, 4, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.subtitleTextAlignment, "")) {
            output.encodeStringElement(serialDesc, 5, self.subtitleTextAlignment);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 6);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.smallButtons, c25271y)) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.smallButtons);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !AbstractC22676k.m65745e(self.largeButtons, c25271y)) {
            output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.largeButtons);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.isCenterAligned) {
            output.encodeBooleanElement(serialDesc, 8, self.isCenterAligned);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderImage() {
        return this.headerImage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleTextAlignment() {
        return this.titleTextAlignment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitleTextAlignment() {
        return this.subtitleTextAlignment;
    }

    public final List<AiChatTalkTextButtonModel> component7() {
        return this.smallButtons;
    }

    public final List<AiChatTalkTextButtonModel> component8() {
        return this.largeButtons;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsCenterAligned() {
        return this.isCenterAligned;
    }

    public final AiChatTalkTextModel copy(String headerImage, String title, String titleTextAlignment, String titleIcon, String subtitle, String subtitleTextAlignment, List<AiChatTalkTextButtonModel> smallButtons, List<AiChatTalkTextButtonModel> largeButtons, boolean isCenterAligned) {
        AbstractC22676k.m65750j(headerImage, "headerImage");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleTextAlignment, "titleTextAlignment");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleTextAlignment, "subtitleTextAlignment");
        AbstractC22676k.m65750j(smallButtons, "smallButtons");
        AbstractC22676k.m65750j(largeButtons, "largeButtons");
        return new AiChatTalkTextModel(headerImage, title, titleTextAlignment, titleIcon, subtitle, subtitleTextAlignment, smallButtons, largeButtons, isCenterAligned);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatTalkTextModel)) {
            return false;
        }
        AiChatTalkTextModel aiChatTalkTextModel = (AiChatTalkTextModel) other;
        return AbstractC22676k.m65745e(this.headerImage, aiChatTalkTextModel.headerImage) && AbstractC22676k.m65745e(this.title, aiChatTalkTextModel.title) && AbstractC22676k.m65745e(this.titleTextAlignment, aiChatTalkTextModel.titleTextAlignment) && AbstractC22676k.m65745e(this.titleIcon, aiChatTalkTextModel.titleIcon) && AbstractC22676k.m65745e(this.subtitle, aiChatTalkTextModel.subtitle) && AbstractC22676k.m65745e(this.subtitleTextAlignment, aiChatTalkTextModel.subtitleTextAlignment) && AbstractC22676k.m65745e(this.smallButtons, aiChatTalkTextModel.smallButtons) && AbstractC22676k.m65745e(this.largeButtons, aiChatTalkTextModel.largeButtons) && this.isCenterAligned == aiChatTalkTextModel.isCenterAligned;
    }

    public final String getHeaderImage() {
        return this.headerImage;
    }

    public final List<AiChatTalkTextButtonModel> getLargeButtons() {
        return this.largeButtons;
    }

    public final List<AiChatTalkTextButtonModel> getSmallButtons() {
        return this.smallButtons;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleTextAlignment() {
        return this.subtitleTextAlignment;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public final String getTitleTextAlignment() {
        return this.titleTextAlignment;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.headerImage.hashCode() * 31, 31, this.title), 31, this.titleTextAlignment);
        String str = this.titleIcon;
        return Boolean.hashCode(this.isCenterAligned) + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.subtitle), 31, this.subtitleTextAlignment), 31, this.smallButtons), 31, this.largeButtons);
    }

    public final boolean isCenterAligned() {
        return this.isCenterAligned;
    }

    public String toString() {
        String str = this.headerImage;
        String str2 = this.title;
        String str3 = this.titleTextAlignment;
        String str4 = this.titleIcon;
        String str5 = this.subtitle;
        String str6 = this.subtitleTextAlignment;
        List<AiChatTalkTextButtonModel> list = this.smallButtons;
        List<AiChatTalkTextButtonModel> list2 = this.largeButtons;
        boolean z4 = this.isCenterAligned;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiChatTalkTextModel(headerImage=", str, ", title=", str2, ", titleTextAlignment=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", titleIcon=", str4, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", subtitleTextAlignment=", str6, ", smallButtons=");
        AbstractC21702c.m61148s(sbM32001t, list, ", largeButtons=", list2, ", isCenterAligned=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public /* synthetic */ AiChatTalkTextModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.headerImage = "";
        } else {
            this.headerImage = str;
        }
        if ((i13 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.titleTextAlignment = "";
        } else {
            this.titleTextAlignment = str3;
        }
        if ((i13 & 8) == 0) {
            this.titleIcon = null;
        } else {
            this.titleIcon = str4;
        }
        if ((i13 & 16) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str5;
        }
        if ((i13 & 32) == 0) {
            this.subtitleTextAlignment = "";
        } else {
            this.subtitleTextAlignment = str6;
        }
        int i14 = i13 & 64;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.smallButtons = c25271y;
        } else {
            this.smallButtons = list;
        }
        if ((i13 & 128) == 0) {
            this.largeButtons = c25271y;
        } else {
            this.largeButtons = list2;
        }
        if ((i13 & 256) == 0) {
            this.isCenterAligned = false;
        } else {
            this.isCenterAligned = z4;
        }
    }

    public AiChatTalkTextModel(String headerImage, String title, String titleTextAlignment, String str, String subtitle, String subtitleTextAlignment, List<AiChatTalkTextButtonModel> smallButtons, List<AiChatTalkTextButtonModel> largeButtons, boolean z4) {
        AbstractC22676k.m65750j(headerImage, "headerImage");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleTextAlignment, "titleTextAlignment");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleTextAlignment, "subtitleTextAlignment");
        AbstractC22676k.m65750j(smallButtons, "smallButtons");
        AbstractC22676k.m65750j(largeButtons, "largeButtons");
        this.headerImage = headerImage;
        this.title = title;
        this.titleTextAlignment = titleTextAlignment;
        this.titleIcon = str;
        this.subtitle = subtitle;
        this.subtitleTextAlignment = subtitleTextAlignment;
        this.smallButtons = smallButtons;
        this.largeButtons = largeButtons;
        this.isCenterAligned = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AiChatTalkTextModel(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        str2 = (i13 & 2) != 0 ? "" : str2;
        str3 = (i13 & 4) != 0 ? "" : str3;
        str4 = (i13 & 8) != 0 ? null : str4;
        str5 = (i13 & 16) != 0 ? "" : str5;
        str6 = (i13 & 32) != 0 ? "" : str6;
        int i14 = i13 & 64;
        C25271y c25271y = C25271y.f99162w;
        this(str, str2, str3, str4, str5, str6, i14 != 0 ? c25271y : list, (i13 & 128) != 0 ? c25271y : list2, (i13 & 256) != 0 ? false : z4);
    }
}
