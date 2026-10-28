package com.whoop.design.models.items.recommendationtile;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import z91.C40204a;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010\u001b¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "header", "", "items", "footer", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/DesignSystemModel;", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/DesignSystemModel;", "getHeader", "Ljava/util/List;", "getItems", "getFooter", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecommendationTileGroupModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final DesignSystemModel footer;
    private final DesignSystemModel header;
    private final String id;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileGroupModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecommendationTileGroupModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C40204a(7)), AbstractC30060g.m92087G(enumC23463i, new C40204a(8)), AbstractC30060g.m92087G(enumC23463i, new C40204a(9))};
    }

    public /* synthetic */ RecommendationTileGroupModel(int i13, String str, DesignSystemModel designSystemModel, List list, DesignSystemModel designSystemModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i13 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 11, RecommendationTileGroupModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.header = designSystemModel;
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        this.footer = designSystemModel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationTileGroupModel copy$default(RecommendationTileGroupModel recommendationTileGroupModel, String str, DesignSystemModel designSystemModel, List list, DesignSystemModel designSystemModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = recommendationTileGroupModel.id;
        }
        if ((i13 & 2) != 0) {
            designSystemModel = recommendationTileGroupModel.header;
        }
        if ((i13 & 4) != 0) {
            list = recommendationTileGroupModel.items;
        }
        if ((i13 & 8) != 0) {
            designSystemModel2 = recommendationTileGroupModel.footer;
        }
        return recommendationTileGroupModel.copy(str, designSystemModel, list, designSystemModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RecommendationTileGroupModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.header);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.footer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DesignSystemModel getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    public final RecommendationTileGroupModel copy(String id4, DesignSystemModel header, List<? extends DesignSystemModel> items, DesignSystemModel footer) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        return new RecommendationTileGroupModel(id4, header, items, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationTileGroupModel)) {
            return false;
        }
        RecommendationTileGroupModel recommendationTileGroupModel = (RecommendationTileGroupModel) other;
        return AbstractC22676k.m65745e(this.id, recommendationTileGroupModel.id) && AbstractC22676k.m65745e(this.header, recommendationTileGroupModel.header) && AbstractC22676k.m65745e(this.items, recommendationTileGroupModel.items) && AbstractC22676k.m65745e(this.footer, recommendationTileGroupModel.footer);
    }

    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    public final DesignSystemModel getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DesignSystemModel designSystemModel = this.header;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31, 31, this.items);
        DesignSystemModel designSystemModel2 = this.footer;
        return iM31983b + (designSystemModel2 != null ? designSystemModel2.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationTileGroupModel(id=" + this.id + ", header=" + this.header + ", items=" + this.items + ", footer=" + this.footer + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationTileGroupModel(String id4, DesignSystemModel designSystemModel, List<? extends DesignSystemModel> items, DesignSystemModel designSystemModel2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.header = designSystemModel;
        this.items = items;
        this.footer = designSystemModel2;
    }

    public /* synthetic */ RecommendationTileGroupModel(String str, DesignSystemModel designSystemModel, List list, DesignSystemModel designSystemModel2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, designSystemModel, (i13 & 4) != 0 ? C25271y.f99162w : list, designSystemModel2);
    }
}
