package com.whoop.advancedlabsjoin.feature.updatetests.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eb1.C13005a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;", "", "", "text", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;", "dialog", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_join_release", "(Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;)Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getItems", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;", "getDialog", "Companion", "$serializer", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AdvanceLabsUpdateTestsStickyModel {
    private final UpdateTestsDialogModel dialog;
    private final List<DesignSystemModel> items;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13005a(17)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;", "serializer", "()Lwc3/c;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AdvanceLabsUpdateTestsStickyModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdvanceLabsUpdateTestsStickyModel(int i13, String str, List list, UpdateTestsDialogModel updateTestsDialogModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, AdvanceLabsUpdateTestsStickyModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.items = list;
        this.dialog = updateTestsDialogModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvanceLabsUpdateTestsStickyModel copy$default(AdvanceLabsUpdateTestsStickyModel advanceLabsUpdateTestsStickyModel, String str, List list, UpdateTestsDialogModel updateTestsDialogModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = advanceLabsUpdateTestsStickyModel.text;
        }
        if ((i13 & 2) != 0) {
            list = advanceLabsUpdateTestsStickyModel.items;
        }
        if ((i13 & 4) != 0) {
            updateTestsDialogModel = advanceLabsUpdateTestsStickyModel.dialog;
        }
        return advanceLabsUpdateTestsStickyModel.copy(str, list, updateTestsDialogModel);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_join_release(AdvanceLabsUpdateTestsStickyModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.text);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 2, UpdateTestsDialogModel$$serializer.INSTANCE, self.dialog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UpdateTestsDialogModel getDialog() {
        return this.dialog;
    }

    public final AdvanceLabsUpdateTestsStickyModel copy(String text, List<? extends DesignSystemModel> items, UpdateTestsDialogModel dialog) {
        AbstractC22676k.m65750j(items, "items");
        return new AdvanceLabsUpdateTestsStickyModel(text, items, dialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvanceLabsUpdateTestsStickyModel)) {
            return false;
        }
        AdvanceLabsUpdateTestsStickyModel advanceLabsUpdateTestsStickyModel = (AdvanceLabsUpdateTestsStickyModel) other;
        return AbstractC22676k.m65745e(this.text, advanceLabsUpdateTestsStickyModel.text) && AbstractC22676k.m65745e(this.items, advanceLabsUpdateTestsStickyModel.items) && AbstractC22676k.m65745e(this.dialog, advanceLabsUpdateTestsStickyModel.dialog);
    }

    public final UpdateTestsDialogModel getDialog() {
        return this.dialog;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.items);
        UpdateTestsDialogModel updateTestsDialogModel = this.dialog;
        return iM31983b + (updateTestsDialogModel != null ? updateTestsDialogModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        List<DesignSystemModel> list = this.items;
        UpdateTestsDialogModel updateTestsDialogModel = this.dialog;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("AdvanceLabsUpdateTestsStickyModel(text=", str, ", items=", ", dialog=", list);
        sbM94766o.append(updateTestsDialogModel);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvanceLabsUpdateTestsStickyModel(String str, List<? extends DesignSystemModel> items, UpdateTestsDialogModel updateTestsDialogModel) {
        AbstractC22676k.m65750j(items, "items");
        this.text = str;
        this.items = items;
        this.dialog = updateTestsDialogModel;
    }
}
