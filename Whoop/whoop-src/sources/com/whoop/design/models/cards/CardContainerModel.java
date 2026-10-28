package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.colortheme.ColorBackgroundModel;
import com.whoop.design.models.colortheme.ColorBackgroundModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t42.C33538a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%Jv\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\u001cR \u0010\b\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010B\u0012\u0004\bD\u0010=\u001a\u0004\bC\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\bE\u0010\u0018R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010F\u0012\u0004\bH\u0010=\u001a\u0004\bG\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bL\u0010%¨\u0006O"}, m65681d2 = {"Lcom/whoop/design/models/cards/CardContainerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "endIcon", "Lcom/whoop/design/models/cards/HeaderContentModel;", "headerContent", "item", "cardName", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/cards/HeaderContentModel;", "component5", "()Lcom/whoop/design/models/DesignSystemModel;", "component6", "component7", "()Lcom/whoop/navigation/e;", "component8", "()Lcom/whoop/navigation/models/GenericInteraction;", "component9", "()Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lcom/whoop/design/models/cards/CardContainerModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/CardContainerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getTitle$annotations", "()V", "getEndIcon", "getEndIcon$annotations", "Lcom/whoop/design/models/cards/HeaderContentModel;", "getHeaderContent", "Lcom/whoop/design/models/DesignSystemModel;", "getItem", "getItem$annotations", "getCardName", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "getBackgroundColor", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CardContainerModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final ColorBackgroundModel backgroundColor;
    private final String cardName;
    private final C9598e destination;
    private final String endIcon;
    private final HeaderContentModel headerContent;
    private final String id;
    private final GenericInteraction interaction;
    private final DesignSystemModel item;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/CardContainerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/CardContainerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CardContainerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(7)), null, AbstractC30060g.m92087G(enumC23463i, new C33538a(8)), null, null};
    }

    public /* synthetic */ CardContainerModel(int i13, String str, String str2, String str3, HeaderContentModel headerContentModel, DesignSystemModel designSystemModel, String str4, C9598e c9598e, GenericInteraction genericInteraction, ColorBackgroundModel colorBackgroundModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (403 != (i13 & 403)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 403, CardContainerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        if ((i13 & 4) == 0) {
            this.endIcon = null;
        } else {
            this.endIcon = str3;
        }
        if ((i13 & 8) == 0) {
            this.headerContent = null;
        } else {
            this.headerContent = headerContentModel;
        }
        this.item = designSystemModel;
        if ((i13 & 32) == 0) {
            this.cardName = null;
        } else {
            this.cardName = str4;
        }
        if ((i13 & 64) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        this.interaction = genericInteraction;
        this.backgroundColor = colorBackgroundModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CardContainerModel copy$default(CardContainerModel cardContainerModel, String str, String str2, String str3, HeaderContentModel headerContentModel, DesignSystemModel designSystemModel, String str4, C9598e c9598e, GenericInteraction genericInteraction, ColorBackgroundModel colorBackgroundModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cardContainerModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = cardContainerModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = cardContainerModel.endIcon;
        }
        if ((i13 & 8) != 0) {
            headerContentModel = cardContainerModel.headerContent;
        }
        if ((i13 & 16) != 0) {
            designSystemModel = cardContainerModel.item;
        }
        if ((i13 & 32) != 0) {
            str4 = cardContainerModel.cardName;
        }
        if ((i13 & 64) != 0) {
            c9598e = cardContainerModel.destination;
        }
        if ((i13 & 128) != 0) {
            genericInteraction = cardContainerModel.interaction;
        }
        if ((i13 & 256) != 0) {
            colorBackgroundModel = cardContainerModel.backgroundColor;
        }
        GenericInteraction genericInteraction2 = genericInteraction;
        ColorBackgroundModel colorBackgroundModel2 = colorBackgroundModel;
        String str5 = str4;
        C9598e c9598e2 = c9598e;
        DesignSystemModel designSystemModel2 = designSystemModel;
        String str6 = str3;
        return cardContainerModel.copy(str, str2, str6, headerContentModel, designSystemModel2, str5, c9598e2, genericInteraction2, colorBackgroundModel2);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getEndIcon$annotations() {
    }

    public static /* synthetic */ void getItem$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(CardContainerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.endIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.endIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.headerContent != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, HeaderContentModel$$serializer.INSTANCE, self.headerContent);
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.item);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.cardName != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.cardName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.destination);
        }
        output.encodeNullableSerializableElement(serialDesc, 7, GenericInteraction$$serializer.INSTANCE, self.interaction);
        output.encodeNullableSerializableElement(serialDesc, 8, ColorBackgroundModel$$serializer.INSTANCE, self.backgroundColor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HeaderContentModel getHeaderContent() {
        return this.headerContent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DesignSystemModel getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ColorBackgroundModel getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CardContainerModel copy(String id4, String title, String endIcon, HeaderContentModel headerContent, DesignSystemModel item, String cardName, C9598e destination, GenericInteraction interaction, ColorBackgroundModel backgroundColor) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(item, "item");
        return new CardContainerModel(id4, title, endIcon, headerContent, item, cardName, destination, interaction, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardContainerModel)) {
            return false;
        }
        CardContainerModel cardContainerModel = (CardContainerModel) other;
        return AbstractC22676k.m65745e(this.id, cardContainerModel.id) && AbstractC22676k.m65745e(this.title, cardContainerModel.title) && AbstractC22676k.m65745e(this.endIcon, cardContainerModel.endIcon) && AbstractC22676k.m65745e(this.headerContent, cardContainerModel.headerContent) && AbstractC22676k.m65745e(this.item, cardContainerModel.item) && AbstractC22676k.m65745e(this.cardName, cardContainerModel.cardName) && AbstractC22676k.m65745e(this.destination, cardContainerModel.destination) && AbstractC22676k.m65745e(this.interaction, cardContainerModel.interaction) && AbstractC22676k.m65745e(this.backgroundColor, cardContainerModel.backgroundColor);
    }

    public final ColorBackgroundModel getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final HeaderContentModel getHeaderContent() {
        return this.headerContent;
    }

    public final String getId() {
        return this.id;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final DesignSystemModel getItem() {
        return this.item;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.endIcon;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        HeaderContentModel headerContentModel = this.headerContent;
        int iHashCode2 = (this.item.hashCode() + ((iHashCode + (headerContentModel == null ? 0 : headerContentModel.hashCode())) * 31)) * 31;
        String str2 = this.cardName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode5 = (iHashCode4 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        ColorBackgroundModel colorBackgroundModel = this.backgroundColor;
        return iHashCode5 + (colorBackgroundModel != null ? colorBackgroundModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.endIcon;
        HeaderContentModel headerContentModel = this.headerContent;
        DesignSystemModel designSystemModel = this.item;
        String str4 = this.cardName;
        C9598e c9598e = this.destination;
        GenericInteraction genericInteraction = this.interaction;
        ColorBackgroundModel colorBackgroundModel = this.backgroundColor;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CardContainerModel(id=", str, ", title=", str2, ", endIcon=");
        sbM32001t.append(str3);
        sbM32001t.append(", headerContent=");
        sbM32001t.append(headerContentModel);
        sbM32001t.append(", item=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", cardName=");
        sbM32001t.append(str4);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", backgroundColor=");
        sbM32001t.append(colorBackgroundModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public CardContainerModel(String id4, String title, String str, HeaderContentModel headerContentModel, DesignSystemModel item, String str2, C9598e c9598e, GenericInteraction genericInteraction, ColorBackgroundModel colorBackgroundModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(item, "item");
        this.id = id4;
        this.title = title;
        this.endIcon = str;
        this.headerContent = headerContentModel;
        this.item = item;
        this.cardName = str2;
        this.destination = c9598e;
        this.interaction = genericInteraction;
        this.backgroundColor = colorBackgroundModel;
    }

    public /* synthetic */ CardContainerModel(String str, String str2, String str3, HeaderContentModel headerContentModel, DesignSystemModel designSystemModel, String str4, C9598e c9598e, GenericInteraction genericInteraction, ColorBackgroundModel colorBackgroundModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : headerContentModel, designSystemModel, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : c9598e, genericInteraction, colorBackgroundModel);
    }
}
