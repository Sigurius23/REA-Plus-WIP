package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#Jp\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010>\u0012\u0004\b@\u0010;\u001a\u0004\b?\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010A\u0012\u0004\bC\u0010;\u001a\u0004\bB\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\bG\u0010;\u001a\u0004\bF\u0010\u001bR&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010H\u0012\u0004\bJ\u0010;\u001a\u0004\bI\u0010!R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010K\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010#¨\u0006P"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;", "", "Lcom/whoop/design/util/TextResource;", "headline", "subtext", "Lcom/whoop/design/models/DesignSystemModel;", "aiChatCallout", "Lcom/whoop/weightlifting/data/dto/AddTileModel;", "addTile", "builderCta", "divider", "", "Lcom/whoop/weightlifting/data/dto/MenuItemModel;", "templates", "Lcom/whoop/weightlifting/data/dto/MetaData;", "metadata", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Lcom/whoop/design/models/DesignSystemModel;", "component4", "()Lcom/whoop/weightlifting/data/dto/AddTileModel;", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/whoop/weightlifting/data/dto/MetaData;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getHeadline", "getHeadline$annotations", "()V", "getSubtext", "getSubtext$annotations", "Lcom/whoop/design/models/DesignSystemModel;", "getAiChatCallout", "getAiChatCallout$annotations", "Lcom/whoop/weightlifting/data/dto/AddTileModel;", "getAddTile", "getAddTile$annotations", "getBuilderCta", "getBuilderCta$annotations", "getDivider", "getDivider$annotations", "Ljava/util/List;", "getTemplates", "getTemplates$annotations", "Lcom/whoop/weightlifting/data/dto/MetaData;", "getMetadata", "getMetadata$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LinkWorkoutScreenContentModel {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("add_tile")
    private final AddTileModel addTile;

    @SerializedName("ai_chat_callout")
    private final DesignSystemModel aiChatCallout;

    @SerializedName("builder_cta")
    private final DesignSystemModel builderCta;

    @SerializedName("divider")
    private final DesignSystemModel divider;

    @SerializedName("headline")
    private final TextResource headline;

    @SerializedName("metadata")
    private final MetaData metadata;

    @SerializedName("subtext")
    private final TextResource subtext;

    @SerializedName("templates")
    private final List<MenuItemModel> templates;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LinkWorkoutScreenContentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C22831a(23)), null, AbstractC30060g.m92087G(enumC23463i, new C22831a(24)), AbstractC30060g.m92087G(enumC23463i, new C22831a(25)), AbstractC30060g.m92087G(enumC23463i, new C22831a(26)), null};
    }

    public /* synthetic */ LinkWorkoutScreenContentModel(int i13, TextResource textResource, TextResource textResource2, DesignSystemModel designSystemModel, AddTileModel addTileModel, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, List list, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, LinkWorkoutScreenContentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.headline = textResource;
        this.subtext = textResource2;
        this.aiChatCallout = designSystemModel;
        this.addTile = addTileModel;
        this.builderCta = designSystemModel2;
        this.divider = designSystemModel3;
        this.templates = list;
        if ((i13 & 128) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(MenuItemModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkWorkoutScreenContentModel copy$default(LinkWorkoutScreenContentModel linkWorkoutScreenContentModel, TextResource textResource, TextResource textResource2, DesignSystemModel designSystemModel, AddTileModel addTileModel, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, List list, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = linkWorkoutScreenContentModel.headline;
        }
        if ((i13 & 2) != 0) {
            textResource2 = linkWorkoutScreenContentModel.subtext;
        }
        if ((i13 & 4) != 0) {
            designSystemModel = linkWorkoutScreenContentModel.aiChatCallout;
        }
        if ((i13 & 8) != 0) {
            addTileModel = linkWorkoutScreenContentModel.addTile;
        }
        if ((i13 & 16) != 0) {
            designSystemModel2 = linkWorkoutScreenContentModel.builderCta;
        }
        if ((i13 & 32) != 0) {
            designSystemModel3 = linkWorkoutScreenContentModel.divider;
        }
        if ((i13 & 64) != 0) {
            list = linkWorkoutScreenContentModel.templates;
        }
        if ((i13 & 128) != 0) {
            metaData = linkWorkoutScreenContentModel.metadata;
        }
        List list2 = list;
        MetaData metaData2 = metaData;
        DesignSystemModel designSystemModel4 = designSystemModel2;
        DesignSystemModel designSystemModel5 = designSystemModel3;
        return linkWorkoutScreenContentModel.copy(textResource, textResource2, designSystemModel, addTileModel, designSystemModel4, designSystemModel5, list2, metaData2);
    }

    @InterfaceC37143h("add_tile")
    public static /* synthetic */ void getAddTile$annotations() {
    }

    @InterfaceC37143h("ai_chat_callout")
    public static /* synthetic */ void getAiChatCallout$annotations() {
    }

    @InterfaceC37143h("builder_cta")
    public static /* synthetic */ void getBuilderCta$annotations() {
    }

    @InterfaceC37143h("divider")
    public static /* synthetic */ void getDivider$annotations() {
    }

    @InterfaceC37143h("headline")
    public static /* synthetic */ void getHeadline$annotations() {
    }

    @InterfaceC37143h("metadata")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @InterfaceC37143h("subtext")
    public static /* synthetic */ void getSubtext$annotations() {
    }

    @InterfaceC37143h("templates")
    public static /* synthetic */ void getTemplates$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(LinkWorkoutScreenContentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.headline);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.subtext);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.aiChatCallout);
        output.encodeNullableSerializableElement(serialDesc, 3, AddTileModel$$serializer.INSTANCE, self.addTile);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.builderCta);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.divider);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.templates);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getHeadline() {
        return this.headline;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtext() {
        return this.subtext;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DesignSystemModel getAiChatCallout() {
        return this.aiChatCallout;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AddTileModel getAddTile() {
        return this.addTile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DesignSystemModel getBuilderCta() {
        return this.builderCta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DesignSystemModel getDivider() {
        return this.divider;
    }

    public final List<MenuItemModel> component7() {
        return this.templates;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final LinkWorkoutScreenContentModel copy(TextResource headline, TextResource subtext, DesignSystemModel aiChatCallout, AddTileModel addTile, DesignSystemModel builderCta, DesignSystemModel divider, List<MenuItemModel> templates, MetaData metadata) {
        AbstractC22676k.m65750j(headline, "headline");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(templates, "templates");
        return new LinkWorkoutScreenContentModel(headline, subtext, aiChatCallout, addTile, builderCta, divider, templates, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkWorkoutScreenContentModel)) {
            return false;
        }
        LinkWorkoutScreenContentModel linkWorkoutScreenContentModel = (LinkWorkoutScreenContentModel) other;
        return AbstractC22676k.m65745e(this.headline, linkWorkoutScreenContentModel.headline) && AbstractC22676k.m65745e(this.subtext, linkWorkoutScreenContentModel.subtext) && AbstractC22676k.m65745e(this.aiChatCallout, linkWorkoutScreenContentModel.aiChatCallout) && AbstractC22676k.m65745e(this.addTile, linkWorkoutScreenContentModel.addTile) && AbstractC22676k.m65745e(this.builderCta, linkWorkoutScreenContentModel.builderCta) && AbstractC22676k.m65745e(this.divider, linkWorkoutScreenContentModel.divider) && AbstractC22676k.m65745e(this.templates, linkWorkoutScreenContentModel.templates) && AbstractC22676k.m65745e(this.metadata, linkWorkoutScreenContentModel.metadata);
    }

    public final AddTileModel getAddTile() {
        return this.addTile;
    }

    public final DesignSystemModel getAiChatCallout() {
        return this.aiChatCallout;
    }

    public final DesignSystemModel getBuilderCta() {
        return this.builderCta;
    }

    public final DesignSystemModel getDivider() {
        return this.divider;
    }

    public final TextResource getHeadline() {
        return this.headline;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final TextResource getSubtext() {
        return this.subtext;
    }

    public final List<MenuItemModel> getTemplates() {
        return this.templates;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.headline.hashCode() * 31, this.subtext, 31);
        DesignSystemModel designSystemModel = this.aiChatCallout;
        int iHashCode = (iM95625a + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        AddTileModel addTileModel = this.addTile;
        int iHashCode2 = (iHashCode + (addTileModel == null ? 0 : addTileModel.hashCode())) * 31;
        DesignSystemModel designSystemModel2 = this.builderCta;
        int iHashCode3 = (iHashCode2 + (designSystemModel2 == null ? 0 : designSystemModel2.hashCode())) * 31;
        DesignSystemModel designSystemModel3 = this.divider;
        int iM31983b = AbstractC11895b.m31983b((iHashCode3 + (designSystemModel3 == null ? 0 : designSystemModel3.hashCode())) * 31, 31, this.templates);
        MetaData metaData = this.metadata;
        return iM31983b + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.headline;
        TextResource textResource2 = this.subtext;
        DesignSystemModel designSystemModel = this.aiChatCallout;
        AddTileModel addTileModel = this.addTile;
        DesignSystemModel designSystemModel2 = this.builderCta;
        DesignSystemModel designSystemModel3 = this.divider;
        List<MenuItemModel> list = this.templates;
        MetaData metaData = this.metadata;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("LinkWorkoutScreenContentModel(headline=", textResource, ", subtext=", textResource2, ", aiChatCallout=");
        sbM106658q.append(designSystemModel);
        sbM106658q.append(", addTile=");
        sbM106658q.append(addTileModel);
        sbM106658q.append(", builderCta=");
        sbM106658q.append(designSystemModel2);
        sbM106658q.append(", divider=");
        sbM106658q.append(designSystemModel3);
        sbM106658q.append(", templates=");
        sbM106658q.append(list);
        sbM106658q.append(", metadata=");
        sbM106658q.append(metaData);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public LinkWorkoutScreenContentModel(TextResource headline, TextResource subtext, DesignSystemModel designSystemModel, AddTileModel addTileModel, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, List<MenuItemModel> templates, MetaData metaData) {
        AbstractC22676k.m65750j(headline, "headline");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(templates, "templates");
        this.headline = headline;
        this.subtext = subtext;
        this.aiChatCallout = designSystemModel;
        this.addTile = addTileModel;
        this.builderCta = designSystemModel2;
        this.divider = designSystemModel3;
        this.templates = templates;
        this.metadata = metaData;
    }

    public /* synthetic */ LinkWorkoutScreenContentModel(TextResource textResource, TextResource textResource2, DesignSystemModel designSystemModel, AddTileModel addTileModel, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, List list, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, designSystemModel, addTileModel, designSystemModel2, designSystemModel3, list, (i13 & 128) != 0 ? null : metaData);
    }
}
