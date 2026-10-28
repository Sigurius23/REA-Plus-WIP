package com.whoop.advancedlabs.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.DividerModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33690a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/LabsTestSelectionItemModel;", "", "", "id", "Lcom/whoop/design/models/items/DividerModel;", "header", "", "Lcom/whoop/advancedlabs/domain/models/LabsTestItemModel;", "tests", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/LabsTestSelectionItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/DividerModel;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;)Lcom/whoop/advancedlabs/domain/models/LabsTestSelectionItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/items/DividerModel;", "getHeader", "Ljava/util/List;", "getTests", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabsTestSelectionItemModel {
    private final DividerModel header;
    private final String id;
    private final List<LabsTestItemModel> tests;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(11))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/LabsTestSelectionItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/LabsTestSelectionItemModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabsTestSelectionItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LabsTestSelectionItemModel(int i13, String str, DividerModel dividerModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, LabsTestSelectionItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.header = dividerModel;
        this.tests = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LabsTestItemModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabsTestSelectionItemModel copy$default(LabsTestSelectionItemModel labsTestSelectionItemModel, String str, DividerModel dividerModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = labsTestSelectionItemModel.id;
        }
        if ((i13 & 2) != 0) {
            dividerModel = labsTestSelectionItemModel.header;
        }
        if ((i13 & 4) != 0) {
            list = labsTestSelectionItemModel.tests;
        }
        return labsTestSelectionItemModel.copy(str, dividerModel, list);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(LabsTestSelectionItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, DividerModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.tests);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DividerModel getHeader() {
        return this.header;
    }

    public final List<LabsTestItemModel> component3() {
        return this.tests;
    }

    public final LabsTestSelectionItemModel copy(String id4, DividerModel header, List<LabsTestItemModel> tests) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(tests, "tests");
        return new LabsTestSelectionItemModel(id4, header, tests);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabsTestSelectionItemModel)) {
            return false;
        }
        LabsTestSelectionItemModel labsTestSelectionItemModel = (LabsTestSelectionItemModel) other;
        return AbstractC22676k.m65745e(this.id, labsTestSelectionItemModel.id) && AbstractC22676k.m65745e(this.header, labsTestSelectionItemModel.header) && AbstractC22676k.m65745e(this.tests, labsTestSelectionItemModel.tests);
    }

    public final DividerModel getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final List<LabsTestItemModel> getTests() {
        return this.tests;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DividerModel dividerModel = this.header;
        return this.tests.hashCode() + ((iHashCode + (dividerModel == null ? 0 : dividerModel.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        DividerModel dividerModel = this.header;
        List<LabsTestItemModel> list = this.tests;
        StringBuilder sb4 = new StringBuilder("LabsTestSelectionItemModel(id=");
        sb4.append(str);
        sb4.append(", header=");
        sb4.append(dividerModel);
        sb4.append(", tests=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public LabsTestSelectionItemModel(String id4, DividerModel dividerModel, List<LabsTestItemModel> tests) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(tests, "tests");
        this.id = id4;
        this.header = dividerModel;
        this.tests = tests;
    }
}
