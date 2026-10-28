package com.whoop.design.models.items;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import w91.C36955b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JJ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b4\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010!¨\u0006:"}, m65681d2 = {"Lcom/whoop/design/models/items/CurrentPlanTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "subtitleDisplay", "", "leadingIcon", "trailingIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CurrentPlanTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/whoop/navigation/e;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/CurrentPlanTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitleDisplay", "getTitleDisplay$annotations", "()V", "getSubtitleDisplay", "getSubtitleDisplay$annotations", "Ljava/lang/String;", "getLeadingIcon", "getTrailingIcon", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CurrentPlanTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final C9598e destination;
    private final String leadingIcon;

    @SerializedName("subtitle_display")
    private final TextResource subtitleDisplay;

    @SerializedName("title_display")
    private final TextResource titleDisplay;
    private final String trailingIcon;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CurrentPlanTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CurrentPlanTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CurrentPlanTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        $stable = i13 | i14 | i14;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36955b(25))};
    }

    public /* synthetic */ CurrentPlanTileModel(int i13, TextResource textResource, TextResource textResource2, String str, String str2, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, CurrentPlanTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = textResource;
        this.subtitleDisplay = textResource2;
        this.leadingIcon = str;
        if ((i13 & 8) == 0) {
            this.trailingIcon = null;
        } else {
            this.trailingIcon = str2;
        }
        if ((i13 & 16) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CurrentPlanTileModel copy$default(CurrentPlanTileModel currentPlanTileModel, TextResource textResource, TextResource textResource2, String str, String str2, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = currentPlanTileModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            textResource2 = currentPlanTileModel.subtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            str = currentPlanTileModel.leadingIcon;
        }
        if ((i13 & 8) != 0) {
            str2 = currentPlanTileModel.trailingIcon;
        }
        if ((i13 & 16) != 0) {
            c9598e = currentPlanTileModel.destination;
        }
        C9598e c9598e2 = c9598e;
        String str3 = str;
        return currentPlanTileModel.copy(textResource, textResource2, str3, str2, c9598e2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC37143h("subtitle_display")
    public static /* synthetic */ void getSubtitleDisplay$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitleDisplay$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(CurrentPlanTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeNullableSerializableElement(serialDesc, 0, c25452a, self.titleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.subtitleDisplay);
        output.encodeStringElement(serialDesc, 2, self.leadingIcon);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.trailingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.trailingIcon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrailingIcon() {
        return this.trailingIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final CurrentPlanTileModel copy(TextResource titleDisplay, TextResource subtitleDisplay, String leadingIcon, String trailingIcon, C9598e destination) {
        AbstractC22676k.m65750j(leadingIcon, "leadingIcon");
        return new CurrentPlanTileModel(titleDisplay, subtitleDisplay, leadingIcon, trailingIcon, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentPlanTileModel)) {
            return false;
        }
        CurrentPlanTileModel currentPlanTileModel = (CurrentPlanTileModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, currentPlanTileModel.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, currentPlanTileModel.subtitleDisplay) && AbstractC22676k.m65745e(this.leadingIcon, currentPlanTileModel.leadingIcon) && AbstractC22676k.m65745e(this.trailingIcon, currentPlanTileModel.trailingIcon) && AbstractC22676k.m65745e(this.destination, currentPlanTileModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    public final TextResource getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getTrailingIcon() {
        return this.trailingIcon;
    }

    public int hashCode() {
        TextResource textResource = this.titleDisplay;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.subtitleDisplay;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.leadingIcon);
        String str = this.trailingIcon;
        int iHashCode2 = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.subtitleDisplay;
        String str = this.leadingIcon;
        String str2 = this.trailingIcon;
        C9598e c9598e = this.destination;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CurrentPlanTileModel(titleDisplay=", textResource, ", subtitleDisplay=", textResource2, ", leadingIcon=");
        AbstractC11266d.m30444B(sbM106658q, str, ", trailingIcon=", str2, ", destination=");
        return AbstractC33745d.m106656o(sbM106658q, c9598e, ")");
    }

    public CurrentPlanTileModel(TextResource textResource, TextResource textResource2, String leadingIcon, String str, C9598e c9598e) {
        AbstractC22676k.m65750j(leadingIcon, "leadingIcon");
        this.titleDisplay = textResource;
        this.subtitleDisplay = textResource2;
        this.leadingIcon = leadingIcon;
        this.trailingIcon = str;
        this.destination = c9598e;
    }

    public /* synthetic */ CurrentPlanTileModel(TextResource textResource, TextResource textResource2, String str, String str2, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : c9598e);
    }
}
