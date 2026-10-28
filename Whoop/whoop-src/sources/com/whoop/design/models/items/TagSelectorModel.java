package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JX\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b5\u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006:"}, m65681d2 = {"Lcom/whoop/design/models/items/TagSelectorModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/design/models/items/SelectorModel;", "tags", "", "selectedTag", "", "horizontalPadding", "defaultTag", "", "tagMaps", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TagSelectorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Float;", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/design/models/items/TagSelectorModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTags", "Ljava/lang/String;", "getSelectedTag", "Ljava/lang/Float;", "getHorizontalPadding", "getDefaultTag", "Ljava/util/Map;", "getTagMaps", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TagSelectorModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String defaultTag;
    private final Float horizontalPadding;
    private final String selectedTag;
    private final Map<String, DesignSystemModel> tagMaps;
    private final List<SelectorModel> tags;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TagSelectorModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TagSelectorModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TagSelectorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36964k(9)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(10))};
    }

    public /* synthetic */ TagSelectorModel(int i13, List list, String str, Float f13, String str2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i13 & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 19, TagSelectorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.tags = list;
        this.selectedTag = str;
        if ((i13 & 4) == 0) {
            this.horizontalPadding = null;
        } else {
            this.horizontalPadding = f13;
        }
        if ((i13 & 8) == 0) {
            this.defaultTag = null;
        } else {
            this.defaultTag = str2;
        }
        this.tagMaps = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SelectorModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new LinkedHashMapSerializer(stringSerializer, new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagSelectorModel copy$default(TagSelectorModel tagSelectorModel, List list, String str, Float f13, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = tagSelectorModel.tags;
        }
        if ((i13 & 2) != 0) {
            str = tagSelectorModel.selectedTag;
        }
        if ((i13 & 4) != 0) {
            f13 = tagSelectorModel.horizontalPadding;
        }
        if ((i13 & 8) != 0) {
            str2 = tagSelectorModel.defaultTag;
        }
        if ((i13 & 16) != 0) {
            map = tagSelectorModel.tagMaps;
        }
        Map map2 = map;
        Float f14 = f13;
        return tagSelectorModel.copy(list, str, f14, str2, map2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TagSelectorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.tags);
        output.encodeStringElement(serialDesc, 1, self.selectedTag);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.horizontalPadding != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.horizontalPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.defaultTag != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.defaultTag);
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.tagMaps);
    }

    public final List<SelectorModel> component1() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSelectedTag() {
        return this.selectedTag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDefaultTag() {
        return this.defaultTag;
    }

    public final Map<String, DesignSystemModel> component5() {
        return this.tagMaps;
    }

    public final TagSelectorModel copy(List<SelectorModel> tags, String selectedTag, Float horizontalPadding, String defaultTag, Map<String, ? extends DesignSystemModel> tagMaps) {
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(selectedTag, "selectedTag");
        AbstractC22676k.m65750j(tagMaps, "tagMaps");
        return new TagSelectorModel(tags, selectedTag, horizontalPadding, defaultTag, tagMaps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagSelectorModel)) {
            return false;
        }
        TagSelectorModel tagSelectorModel = (TagSelectorModel) other;
        return AbstractC22676k.m65745e(this.tags, tagSelectorModel.tags) && AbstractC22676k.m65745e(this.selectedTag, tagSelectorModel.selectedTag) && AbstractC22676k.m65745e(this.horizontalPadding, tagSelectorModel.horizontalPadding) && AbstractC22676k.m65745e(this.defaultTag, tagSelectorModel.defaultTag) && AbstractC22676k.m65745e(this.tagMaps, tagSelectorModel.tagMaps);
    }

    public final String getDefaultTag() {
        return this.defaultTag;
    }

    public final Float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final String getSelectedTag() {
        return this.selectedTag;
    }

    public final Map<String, DesignSystemModel> getTagMaps() {
        return this.tagMaps;
    }

    public final List<SelectorModel> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.tags.hashCode() * 31, 31, this.selectedTag);
        Float f13 = this.horizontalPadding;
        int iHashCode = (iM30450d + (f13 == null ? 0 : f13.hashCode())) * 31;
        String str = this.defaultTag;
        return this.tagMaps.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        List<SelectorModel> list = this.tags;
        String str = this.selectedTag;
        Float f13 = this.horizontalPadding;
        String str2 = this.defaultTag;
        Map<String, DesignSystemModel> map = this.tagMaps;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("TagSelectorModel(tags=", ", selectedTag=", str, ", horizontalPadding=", list);
        sbM79507k.append(f13);
        sbM79507k.append(", defaultTag=");
        sbM79507k.append(str2);
        sbM79507k.append(", tagMaps=");
        return AbstractC13673n.m38565l(sbM79507k, map, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TagSelectorModel(List<SelectorModel> tags, String selectedTag, Float f13, String str, Map<String, ? extends DesignSystemModel> tagMaps) {
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(selectedTag, "selectedTag");
        AbstractC22676k.m65750j(tagMaps, "tagMaps");
        this.tags = tags;
        this.selectedTag = selectedTag;
        this.horizontalPadding = f13;
        this.defaultTag = str;
        this.tagMaps = tagMaps;
    }

    public /* synthetic */ TagSelectorModel(List list, String str, Float f13, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i13 & 4) != 0 ? null : f13, (i13 & 8) != 0 ? null : str2, map);
    }
}
