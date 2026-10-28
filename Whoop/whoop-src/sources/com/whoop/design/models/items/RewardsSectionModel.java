package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.MarkdownTextModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
import w91.C36962i;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJB\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001a¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/RewardsSectionModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/models/MarkdownTextModel;", "title", "", "items", "style", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/RewardsSectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/MarkdownTextModel;", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/models/items/RewardsSectionModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/MarkdownTextModel;", "getTitle", "Ljava/util/List;", "getItems", "getStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RewardsSectionModel implements DesignSystemModel {
    private final String id;
    private final List<DesignSystemModel> items;
    private final String style;
    private final MarkdownTextModel title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36962i(12)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/RewardsSectionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/RewardsSectionModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RewardsSectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RewardsSectionModel(int i13, String str, MarkdownTextModel markdownTextModel, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, RewardsSectionModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.title = markdownTextModel;
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 8) == 0) {
            this.style = null;
        } else {
            this.style = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardsSectionModel copy$default(RewardsSectionModel rewardsSectionModel, String str, MarkdownTextModel markdownTextModel, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = rewardsSectionModel.id;
        }
        if ((i13 & 2) != 0) {
            markdownTextModel = rewardsSectionModel.title;
        }
        if ((i13 & 4) != 0) {
            list = rewardsSectionModel.items;
        }
        if ((i13 & 8) != 0) {
            str2 = rewardsSectionModel.style;
        }
        return rewardsSectionModel.copy(str, markdownTextModel, list, str2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RewardsSectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        output.encodeSerializableElement(serialDesc, 1, MarkdownTextModel$$serializer.INSTANCE, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.style == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarkdownTextModel getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final RewardsSectionModel copy(String id4, MarkdownTextModel title, List<? extends DesignSystemModel> items, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        return new RewardsSectionModel(id4, title, items, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsSectionModel)) {
            return false;
        }
        RewardsSectionModel rewardsSectionModel = (RewardsSectionModel) other;
        return AbstractC22676k.m65745e(this.id, rewardsSectionModel.id) && AbstractC22676k.m65745e(this.title, rewardsSectionModel.title) && AbstractC22676k.m65745e(this.items, rewardsSectionModel.items) && AbstractC22676k.m65745e(this.style, rewardsSectionModel.style);
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getStyle() {
        return this.style;
    }

    public final MarkdownTextModel getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iM31983b = AbstractC11895b.m31983b((this.title.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.items);
        String str2 = this.style;
        return iM31983b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        MarkdownTextModel markdownTextModel = this.title;
        List<DesignSystemModel> list = this.items;
        String str2 = this.style;
        StringBuilder sb4 = new StringBuilder("RewardsSectionModel(id=");
        sb4.append(str);
        sb4.append(", title=");
        sb4.append(markdownTextModel);
        sb4.append(", items=");
        return AbstractC38963t7.m124377g(", style=", str2, ")", sb4, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RewardsSectionModel(String str, MarkdownTextModel title, List<? extends DesignSystemModel> items, String str2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.title = title;
        this.items = items;
        this.style = str2;
    }

    public /* synthetic */ RewardsSectionModel(String str, MarkdownTextModel markdownTextModel, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, markdownTextModel, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : str2);
    }
}
