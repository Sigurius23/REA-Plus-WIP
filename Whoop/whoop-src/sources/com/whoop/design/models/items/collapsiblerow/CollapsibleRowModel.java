package com.whoop.design.models.items.collapsiblerow;

import androidx.core.app.NotificationCompat;
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
import p025b1.C2217h;
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
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&JV\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010&¨\u0006>"}, m65681d2 = {"Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "leadingItem", "Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;", NotificationCompat.CATEGORY_STATUS, "", "collapsibleContent", "body", "Lcom/whoop/design/models/items/collapsiblerow/EndItem;", "endItem", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/collapsiblerow/EndItem;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/collapsiblerow/EndItem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/DesignSystemModel;", "component3", "()Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/whoop/design/models/items/collapsiblerow/EndItem;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/collapsiblerow/EndItem;)Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/design/models/DesignSystemModel;", "getLeadingItem", "Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;", "getStatus", "Ljava/util/List;", "getCollapsibleContent", "getBody", "Lcom/whoop/design/models/items/collapsiblerow/EndItem;", "getEndItem", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CollapsibleRowModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final DesignSystemModel body;
    private final List<DesignSystemModel> collapsibleContent;
    private final EndItem endItem;
    private final DesignSystemModel leadingItem;
    private final CollapsibleStatus status;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CollapsibleRowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C2217h(12)), AbstractC30060g.m92087G(enumC23463i, new C2217h(13)), AbstractC30060g.m92087G(enumC23463i, new C2217h(14)), AbstractC30060g.m92087G(enumC23463i, new C2217h(15)), null};
    }

    public /* synthetic */ CollapsibleRowModel(int i13, String str, DesignSystemModel designSystemModel, CollapsibleStatus collapsibleStatus, List list, DesignSystemModel designSystemModel2, EndItem endItem, SerializationConstructorMarker serializationConstructorMarker) {
        if (37 != (i13 & 37)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 37, CollapsibleRowModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.leadingItem = null;
        } else {
            this.leadingItem = designSystemModel;
        }
        this.status = collapsibleStatus;
        if ((i13 & 8) == 0) {
            this.collapsibleContent = C25271y.f99162w;
        } else {
            this.collapsibleContent = list;
        }
        if ((i13 & 16) == 0) {
            this.body = null;
        } else {
            this.body = designSystemModel2;
        }
        this.endItem = endItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return CollapsibleStatus.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollapsibleRowModel copy$default(CollapsibleRowModel collapsibleRowModel, String str, DesignSystemModel designSystemModel, CollapsibleStatus collapsibleStatus, List list, DesignSystemModel designSystemModel2, EndItem endItem, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = collapsibleRowModel.title;
        }
        if ((i13 & 2) != 0) {
            designSystemModel = collapsibleRowModel.leadingItem;
        }
        if ((i13 & 4) != 0) {
            collapsibleStatus = collapsibleRowModel.status;
        }
        if ((i13 & 8) != 0) {
            list = collapsibleRowModel.collapsibleContent;
        }
        if ((i13 & 16) != 0) {
            designSystemModel2 = collapsibleRowModel.body;
        }
        if ((i13 & 32) != 0) {
            endItem = collapsibleRowModel.endItem;
        }
        DesignSystemModel designSystemModel3 = designSystemModel2;
        EndItem endItem2 = endItem;
        return collapsibleRowModel.copy(str, designSystemModel, collapsibleStatus, list, designSystemModel3, endItem2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CollapsibleRowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.leadingItem != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.leadingItem);
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.collapsibleContent, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.collapsibleContent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.body != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.body);
        }
        output.encodeSerializableElement(serialDesc, 5, EndItem$$serializer.INSTANCE, self.endItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DesignSystemModel getLeadingItem() {
        return this.leadingItem;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CollapsibleStatus getStatus() {
        return this.status;
    }

    public final List<DesignSystemModel> component4() {
        return this.collapsibleContent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DesignSystemModel getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EndItem getEndItem() {
        return this.endItem;
    }

    public final CollapsibleRowModel copy(String title, DesignSystemModel leadingItem, CollapsibleStatus status, List<? extends DesignSystemModel> collapsibleContent, DesignSystemModel body, EndItem endItem) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(collapsibleContent, "collapsibleContent");
        AbstractC22676k.m65750j(endItem, "endItem");
        return new CollapsibleRowModel(title, leadingItem, status, collapsibleContent, body, endItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollapsibleRowModel)) {
            return false;
        }
        CollapsibleRowModel collapsibleRowModel = (CollapsibleRowModel) other;
        return AbstractC22676k.m65745e(this.title, collapsibleRowModel.title) && AbstractC22676k.m65745e(this.leadingItem, collapsibleRowModel.leadingItem) && this.status == collapsibleRowModel.status && AbstractC22676k.m65745e(this.collapsibleContent, collapsibleRowModel.collapsibleContent) && AbstractC22676k.m65745e(this.body, collapsibleRowModel.body) && AbstractC22676k.m65745e(this.endItem, collapsibleRowModel.endItem);
    }

    public final DesignSystemModel getBody() {
        return this.body;
    }

    public final List<DesignSystemModel> getCollapsibleContent() {
        return this.collapsibleContent;
    }

    public final EndItem getEndItem() {
        return this.endItem;
    }

    public final DesignSystemModel getLeadingItem() {
        return this.leadingItem;
    }

    public final CollapsibleStatus getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        DesignSystemModel designSystemModel = this.leadingItem;
        int iM31983b = AbstractC11895b.m31983b((this.status.hashCode() + ((iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31)) * 31, 31, this.collapsibleContent);
        DesignSystemModel designSystemModel2 = this.body;
        return this.endItem.hashCode() + ((iM31983b + (designSystemModel2 != null ? designSystemModel2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "CollapsibleRowModel(title=" + this.title + ", leadingItem=" + this.leadingItem + ", status=" + this.status + ", collapsibleContent=" + this.collapsibleContent + ", body=" + this.body + ", endItem=" + this.endItem + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollapsibleRowModel(String title, DesignSystemModel designSystemModel, CollapsibleStatus status, List<? extends DesignSystemModel> collapsibleContent, DesignSystemModel designSystemModel2, EndItem endItem) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(collapsibleContent, "collapsibleContent");
        AbstractC22676k.m65750j(endItem, "endItem");
        this.title = title;
        this.leadingItem = designSystemModel;
        this.status = status;
        this.collapsibleContent = collapsibleContent;
        this.body = designSystemModel2;
        this.endItem = endItem;
    }

    public /* synthetic */ CollapsibleRowModel(String str, DesignSystemModel designSystemModel, CollapsibleStatus collapsibleStatus, List list, DesignSystemModel designSystemModel2, EndItem endItem, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : designSystemModel, collapsibleStatus, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? null : designSystemModel2, endItem);
    }
}
