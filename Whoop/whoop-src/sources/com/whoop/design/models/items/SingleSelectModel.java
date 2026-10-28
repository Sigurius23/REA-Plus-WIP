package com.whoop.design.models.items;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36963j;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006."}, m65681d2 = {"Lcom/whoop/design/models/items/SingleSelectModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "selectionId", "", "items", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SingleSelectModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ILjava/util/List;)Lcom/whoop/design/models/items/SingleSelectModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getSelectionId", "Ljava/util/List;", "getItems", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SingleSelectModel implements DesignSystemModel {
    private final String id;
    private final List<DesignSystemModel> items;
    private final int selectionId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36963j(16))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SingleSelectModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SingleSelectModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SingleSelectModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SingleSelectModel() {
        this((String) null, 0, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleSelectModel copy$default(SingleSelectModel singleSelectModel, String str, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = singleSelectModel.id;
        }
        if ((i14 & 2) != 0) {
            i13 = singleSelectModel.selectionId;
        }
        if ((i14 & 4) != 0) {
            list = singleSelectModel.items;
        }
        return singleSelectModel.copy(str, i13, list);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SingleSelectModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.selectionId != 0) {
            output.encodeIntElement(serialDesc, 1, self.selectionId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSelectionId() {
        return this.selectionId;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    public final SingleSelectModel copy(String id4, int selectionId, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        return new SingleSelectModel(id4, selectionId, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleSelectModel)) {
            return false;
        }
        SingleSelectModel singleSelectModel = (SingleSelectModel) other;
        return AbstractC22676k.m65745e(this.id, singleSelectModel.id) && this.selectionId == singleSelectModel.selectionId && AbstractC22676k.m65745e(this.items, singleSelectModel.items);
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final int getSelectionId() {
        return this.selectionId;
    }

    public int hashCode() {
        return this.items.hashCode() + AbstractC11266d.m30448b(this.selectionId, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.id;
        int i13 = this.selectionId;
        return AbstractC3855a.m11829m(AbstractC11266d.m30467u(i13, "SingleSelectModel(id=", str, ", selectionId=", ", items="), this.items, ")");
    }

    public /* synthetic */ SingleSelectModel(int i13, String str, int i14, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.selectionId = 0;
        } else {
            this.selectionId = i14;
        }
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleSelectModel(String id4, int i13, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.selectionId = i13;
        this.items = items;
    }

    public /* synthetic */ SingleSelectModel(String str, int i13, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? C25271y.f99162w : list);
    }
}
