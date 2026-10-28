package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jp\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "titleIcon", "subtitle", "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;", "smallButton", "", "largeButtons", "imageUrl", "bottomNavText", "Lcom/whoop/navigation/e;", "bottomNavDestination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitleIcon", "getSubtitle", "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;", "getSmallButton", "Ljava/util/List;", "getLargeButtons", "getImageUrl", "getBottomNavText", "Lcom/whoop/navigation/e;", "getBottomNavDestination", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiChatTalkTextEmptyStateModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e bottomNavDestination;
    private final String bottomNavText;
    private final String imageUrl;
    private final List<AiChatTalkTextButtonModel> largeButtons;
    private final AiChatTalkTextButtonModel smallButton;
    private final String subtitle;
    private final String title;
    private final String titleIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiChatTalkTextEmptyStateModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36870a(10)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36870a(11))};
    }

    public AiChatTalkTextEmptyStateModel() {
        this((String) null, (String) null, (String) null, (AiChatTalkTextButtonModel) null, (List) null, (String) null, (String) null, (C9598e) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AiChatTalkTextButtonModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiChatTalkTextEmptyStateModel copy$default(AiChatTalkTextEmptyStateModel aiChatTalkTextEmptyStateModel, String str, String str2, String str3, AiChatTalkTextButtonModel aiChatTalkTextButtonModel, List list, String str4, String str5, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiChatTalkTextEmptyStateModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = aiChatTalkTextEmptyStateModel.titleIcon;
        }
        if ((i13 & 4) != 0) {
            str3 = aiChatTalkTextEmptyStateModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            aiChatTalkTextButtonModel = aiChatTalkTextEmptyStateModel.smallButton;
        }
        if ((i13 & 16) != 0) {
            list = aiChatTalkTextEmptyStateModel.largeButtons;
        }
        if ((i13 & 32) != 0) {
            str4 = aiChatTalkTextEmptyStateModel.imageUrl;
        }
        if ((i13 & 64) != 0) {
            str5 = aiChatTalkTextEmptyStateModel.bottomNavText;
        }
        if ((i13 & 128) != 0) {
            c9598e = aiChatTalkTextEmptyStateModel.bottomNavDestination;
        }
        String str6 = str5;
        C9598e c9598e2 = c9598e;
        List list2 = list;
        String str7 = str4;
        return aiChatTalkTextEmptyStateModel.copy(str, str2, str3, aiChatTalkTextButtonModel, list2, str7, str6, c9598e2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AiChatTalkTextEmptyStateModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.titleIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.titleIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.subtitle, "")) {
            output.encodeStringElement(serialDesc, 2, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.smallButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, AiChatTalkTextButtonModel$$serializer.INSTANCE, self.smallButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.largeButtons, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.largeButtons);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.bottomNavText != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.bottomNavText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.bottomNavDestination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.bottomNavDestination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AiChatTalkTextButtonModel getSmallButton() {
        return this.smallButton;
    }

    public final List<AiChatTalkTextButtonModel> component5() {
        return this.largeButtons;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBottomNavText() {
        return this.bottomNavText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C9598e getBottomNavDestination() {
        return this.bottomNavDestination;
    }

    public final AiChatTalkTextEmptyStateModel copy(String title, String titleIcon, String subtitle, AiChatTalkTextButtonModel smallButton, List<AiChatTalkTextButtonModel> largeButtons, String imageUrl, String bottomNavText, C9598e bottomNavDestination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(largeButtons, "largeButtons");
        return new AiChatTalkTextEmptyStateModel(title, titleIcon, subtitle, smallButton, largeButtons, imageUrl, bottomNavText, bottomNavDestination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatTalkTextEmptyStateModel)) {
            return false;
        }
        AiChatTalkTextEmptyStateModel aiChatTalkTextEmptyStateModel = (AiChatTalkTextEmptyStateModel) other;
        return AbstractC22676k.m65745e(this.title, aiChatTalkTextEmptyStateModel.title) && AbstractC22676k.m65745e(this.titleIcon, aiChatTalkTextEmptyStateModel.titleIcon) && AbstractC22676k.m65745e(this.subtitle, aiChatTalkTextEmptyStateModel.subtitle) && AbstractC22676k.m65745e(this.smallButton, aiChatTalkTextEmptyStateModel.smallButton) && AbstractC22676k.m65745e(this.largeButtons, aiChatTalkTextEmptyStateModel.largeButtons) && AbstractC22676k.m65745e(this.imageUrl, aiChatTalkTextEmptyStateModel.imageUrl) && AbstractC22676k.m65745e(this.bottomNavText, aiChatTalkTextEmptyStateModel.bottomNavText) && AbstractC22676k.m65745e(this.bottomNavDestination, aiChatTalkTextEmptyStateModel.bottomNavDestination);
    }

    public final C9598e getBottomNavDestination() {
        return this.bottomNavDestination;
    }

    public final String getBottomNavText() {
        return this.bottomNavText;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<AiChatTalkTextButtonModel> getLargeButtons() {
        return this.largeButtons;
    }

    public final AiChatTalkTextButtonModel getSmallButton() {
        return this.smallButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.titleIcon;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.subtitle);
        AiChatTalkTextButtonModel aiChatTalkTextButtonModel = this.smallButton;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (aiChatTalkTextButtonModel == null ? 0 : aiChatTalkTextButtonModel.hashCode())) * 31, 31, this.largeButtons);
        String str2 = this.imageUrl;
        int iHashCode2 = (iM31983b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottomNavText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C9598e c9598e = this.bottomNavDestination;
        return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.titleIcon;
        String str3 = this.subtitle;
        AiChatTalkTextButtonModel aiChatTalkTextButtonModel = this.smallButton;
        List<AiChatTalkTextButtonModel> list = this.largeButtons;
        String str4 = this.imageUrl;
        String str5 = this.bottomNavText;
        C9598e c9598e = this.bottomNavDestination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiChatTalkTextEmptyStateModel(title=", str, ", titleIcon=", str2, ", subtitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", smallButton=");
        sbM32001t.append(aiChatTalkTextButtonModel);
        sbM32001t.append(", largeButtons=");
        AbstractC17176i.m48511m(", imageUrl=", str4, ", bottomNavText=", sbM32001t, list);
        return AbstractC13673n.m38563j(sbM32001t, str5, ", bottomNavDestination=", c9598e, ")");
    }

    public /* synthetic */ AiChatTalkTextEmptyStateModel(int i13, String str, String str2, String str3, AiChatTalkTextButtonModel aiChatTalkTextButtonModel, List list, String str4, String str5, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.titleIcon = null;
        } else {
            this.titleIcon = str2;
        }
        if ((i13 & 4) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str3;
        }
        if ((i13 & 8) == 0) {
            this.smallButton = null;
        } else {
            this.smallButton = aiChatTalkTextButtonModel;
        }
        if ((i13 & 16) == 0) {
            this.largeButtons = C25271y.f99162w;
        } else {
            this.largeButtons = list;
        }
        if ((i13 & 32) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str4;
        }
        if ((i13 & 64) == 0) {
            this.bottomNavText = null;
        } else {
            this.bottomNavText = str5;
        }
        if ((i13 & 128) == 0) {
            this.bottomNavDestination = null;
        } else {
            this.bottomNavDestination = c9598e;
        }
    }

    public AiChatTalkTextEmptyStateModel(String title, String str, String subtitle, AiChatTalkTextButtonModel aiChatTalkTextButtonModel, List<AiChatTalkTextButtonModel> largeButtons, String str2, String str3, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(largeButtons, "largeButtons");
        this.title = title;
        this.titleIcon = str;
        this.subtitle = subtitle;
        this.smallButton = aiChatTalkTextButtonModel;
        this.largeButtons = largeButtons;
        this.imageUrl = str2;
        this.bottomNavText = str3;
        this.bottomNavDestination = c9598e;
    }

    public /* synthetic */ AiChatTalkTextEmptyStateModel(String str, String str2, String str3, AiChatTalkTextButtonModel aiChatTalkTextButtonModel, List list, String str4, String str5, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : aiChatTalkTextButtonModel, (i13 & 16) != 0 ? C25271y.f99162w : list, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : c9598e);
    }
}
