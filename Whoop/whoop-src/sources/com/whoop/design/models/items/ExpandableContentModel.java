package com.whoop.design.models.items;

import b91.EnumC2888c;
import com.whoop.design.atomic.organism.expandablecontent.ExpandableContentHeaderPosition;
import com.whoop.design.atomic.organism.expandablecontent.ExpandableContentLayout;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36957d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHB_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bo\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&Jl\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010$R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010&¨\u0006J"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableContentModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "Lb91/c;", "titleTypography", "Lcom/whoop/design/models/items/TagModel;", "tag", "", "initiallyExpanded", "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;", "itemLayout", "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;", "headerPosition", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lb91/c;", "component4", "()Lcom/whoop/design/models/items/TagModel;", "component5", "()Z", "component6", "()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;", "component7", "()Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lcom/whoop/design/models/items/TagModel;ZLcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;)Lcom/whoop/design/models/items/ExpandableContentModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ExpandableContentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "Lb91/c;", "getTitleTypography", "Lcom/whoop/design/models/items/TagModel;", "getTag", "Z", "getInitiallyExpanded", "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;", "getItemLayout", "Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;", "getHeaderPosition", "Ljava/util/List;", "getItems", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExpandableContentModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final ExpandableContentHeaderPosition headerPosition;
    private final String id;
    private final boolean initiallyExpanded;
    private final ExpandableContentLayout itemLayout;
    private final List<DesignSystemModel> items;
    private final TagModel tag;
    private final String title;
    private final EnumC2888c titleTypography;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableContentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ExpandableContentModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExpandableContentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36957d(0)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36957d(1)), AbstractC30060g.m92087G(enumC23463i, new C36957d(2)), AbstractC30060g.m92087G(enumC23463i, new C36957d(3))};
    }

    public /* synthetic */ ExpandableContentModel(int i13, String str, String str2, EnumC2888c enumC2888c, TagModel tagModel, boolean z4, ExpandableContentLayout expandableContentLayout, ExpandableContentHeaderPosition expandableContentHeaderPosition, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, ExpandableContentModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.title = str2;
        this.titleTypography = enumC2888c;
        if ((i13 & 8) == 0) {
            this.tag = null;
        } else {
            this.tag = tagModel;
        }
        if ((i13 & 16) == 0) {
            this.initiallyExpanded = true;
        } else {
            this.initiallyExpanded = z4;
        }
        if ((i13 & 32) == 0) {
            this.itemLayout = ExpandableContentLayout.HORIZONTAL;
        } else {
            this.itemLayout = expandableContentLayout;
        }
        if ((i13 & 64) == 0) {
            this.headerPosition = ExpandableContentHeaderPosition.TOP;
        } else {
            this.headerPosition = expandableContentHeaderPosition;
        }
        if ((i13 & 128) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.typography.WhoopTextStyle", EnumC2888c.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return ExpandableContentLayout.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return ExpandableContentHeaderPosition.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandableContentModel copy$default(ExpandableContentModel expandableContentModel, String str, String str2, EnumC2888c enumC2888c, TagModel tagModel, boolean z4, ExpandableContentLayout expandableContentLayout, ExpandableContentHeaderPosition expandableContentHeaderPosition, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expandableContentModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = expandableContentModel.title;
        }
        if ((i13 & 4) != 0) {
            enumC2888c = expandableContentModel.titleTypography;
        }
        if ((i13 & 8) != 0) {
            tagModel = expandableContentModel.tag;
        }
        if ((i13 & 16) != 0) {
            z4 = expandableContentModel.initiallyExpanded;
        }
        if ((i13 & 32) != 0) {
            expandableContentLayout = expandableContentModel.itemLayout;
        }
        if ((i13 & 64) != 0) {
            expandableContentHeaderPosition = expandableContentModel.headerPosition;
        }
        if ((i13 & 128) != 0) {
            list = expandableContentModel.items;
        }
        ExpandableContentHeaderPosition expandableContentHeaderPosition2 = expandableContentHeaderPosition;
        List list2 = list;
        boolean z13 = z4;
        ExpandableContentLayout expandableContentLayout2 = expandableContentLayout;
        return expandableContentModel.copy(str, str2, enumC2888c, tagModel, z13, expandableContentLayout2, expandableContentHeaderPosition2, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExpandableContentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.titleTypography);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.tag != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, TagModel$$serializer.INSTANCE, self.tag);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !self.initiallyExpanded) {
            output.encodeBooleanElement(serialDesc, 4, self.initiallyExpanded);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.itemLayout != ExpandableContentLayout.HORIZONTAL) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.itemLayout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.headerPosition != ExpandableContentHeaderPosition.TOP) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.headerPosition);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.items);
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
    public final EnumC2888c getTitleTypography() {
        return this.titleTypography;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getInitiallyExpanded() {
        return this.initiallyExpanded;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ExpandableContentLayout getItemLayout() {
        return this.itemLayout;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ExpandableContentHeaderPosition getHeaderPosition() {
        return this.headerPosition;
    }

    public final List<DesignSystemModel> component8() {
        return this.items;
    }

    public final ExpandableContentModel copy(String id4, String title, EnumC2888c titleTypography, TagModel tag, boolean initiallyExpanded, ExpandableContentLayout itemLayout, ExpandableContentHeaderPosition headerPosition, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(itemLayout, "itemLayout");
        AbstractC22676k.m65750j(headerPosition, "headerPosition");
        AbstractC22676k.m65750j(items, "items");
        return new ExpandableContentModel(id4, title, titleTypography, tag, initiallyExpanded, itemLayout, headerPosition, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableContentModel)) {
            return false;
        }
        ExpandableContentModel expandableContentModel = (ExpandableContentModel) other;
        return AbstractC22676k.m65745e(this.id, expandableContentModel.id) && AbstractC22676k.m65745e(this.title, expandableContentModel.title) && this.titleTypography == expandableContentModel.titleTypography && AbstractC22676k.m65745e(this.tag, expandableContentModel.tag) && this.initiallyExpanded == expandableContentModel.initiallyExpanded && this.itemLayout == expandableContentModel.itemLayout && this.headerPosition == expandableContentModel.headerPosition && AbstractC22676k.m65745e(this.items, expandableContentModel.items);
    }

    public final ExpandableContentHeaderPosition getHeaderPosition() {
        return this.headerPosition;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInitiallyExpanded() {
        return this.initiallyExpanded;
    }

    public final ExpandableContentLayout getItemLayout() {
        return this.itemLayout;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final EnumC2888c getTitleTypography() {
        return this.titleTypography;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        EnumC2888c enumC2888c = this.titleTypography;
        int iHashCode = (iM30450d + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31;
        TagModel tagModel = this.tag;
        return this.items.hashCode() + ((this.headerPosition.hashCode() + ((this.itemLayout.hashCode() + AbstractC2875y.m8289b((iHashCode + (tagModel != null ? tagModel.hashCode() : 0)) * 31, 31, this.initiallyExpanded)) * 31)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        EnumC2888c enumC2888c = this.titleTypography;
        TagModel tagModel = this.tag;
        boolean z4 = this.initiallyExpanded;
        ExpandableContentLayout expandableContentLayout = this.itemLayout;
        ExpandableContentHeaderPosition expandableContentHeaderPosition = this.headerPosition;
        List<DesignSystemModel> list = this.items;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExpandableContentModel(id=", str, ", title=", str2, ", titleTypography=");
        sbM32001t.append(enumC2888c);
        sbM32001t.append(", tag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(", initiallyExpanded=");
        sbM32001t.append(z4);
        sbM32001t.append(", itemLayout=");
        sbM32001t.append(expandableContentLayout);
        sbM32001t.append(", headerPosition=");
        sbM32001t.append(expandableContentHeaderPosition);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableContentModel(String str, String title, EnumC2888c enumC2888c, TagModel tagModel, boolean z4, ExpandableContentLayout itemLayout, ExpandableContentHeaderPosition headerPosition, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(itemLayout, "itemLayout");
        AbstractC22676k.m65750j(headerPosition, "headerPosition");
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.title = title;
        this.titleTypography = enumC2888c;
        this.tag = tagModel;
        this.initiallyExpanded = z4;
        this.itemLayout = itemLayout;
        this.headerPosition = headerPosition;
        this.items = items;
    }

    public /* synthetic */ ExpandableContentModel(String str, String str2, EnumC2888c enumC2888c, TagModel tagModel, boolean z4, ExpandableContentLayout expandableContentLayout, ExpandableContentHeaderPosition expandableContentHeaderPosition, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, enumC2888c, (i13 & 8) != 0 ? null : tagModel, (i13 & 16) != 0 ? true : z4, (i13 & 32) != 0 ? ExpandableContentLayout.HORIZONTAL : expandableContentLayout, (i13 & 64) != 0 ? ExpandableContentHeaderPosition.TOP : expandableContentHeaderPosition, (i13 & 128) != 0 ? C25271y.f99162w : list);
    }
}
