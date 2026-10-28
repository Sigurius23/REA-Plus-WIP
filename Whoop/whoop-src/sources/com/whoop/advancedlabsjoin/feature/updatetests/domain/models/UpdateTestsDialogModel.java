package com.whoop.advancedlabsjoin.feature.updatetests.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eb1.C13005a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionModel;", "sections", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_join_release", "(Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;)Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/util/List;", "getSections", "Companion", "$serializer", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpdateTestsDialogModel {
    private final String id;
    private final List<UpdateTestsSectionModel> sections;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13005a(18))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsDialogModel;", "serializer", "()Lwc3/c;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpdateTestsDialogModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpdateTestsDialogModel(int i13, String str, TextResource textResource, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, UpdateTestsDialogModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = textResource;
        this.sections = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(UpdateTestsSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateTestsDialogModel copy$default(UpdateTestsDialogModel updateTestsDialogModel, String str, TextResource textResource, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updateTestsDialogModel.id;
        }
        if ((i13 & 2) != 0) {
            textResource = updateTestsDialogModel.title;
        }
        if ((i13 & 4) != 0) {
            list = updateTestsDialogModel.sections;
        }
        return updateTestsDialogModel.copy(str, textResource, list);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_join_release(UpdateTestsDialogModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.title);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final List<UpdateTestsSectionModel> component3() {
        return this.sections;
    }

    public final UpdateTestsDialogModel copy(String id4, TextResource title, List<UpdateTestsSectionModel> sections) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        return new UpdateTestsDialogModel(id4, title, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateTestsDialogModel)) {
            return false;
        }
        UpdateTestsDialogModel updateTestsDialogModel = (UpdateTestsDialogModel) other;
        return AbstractC22676k.m65745e(this.id, updateTestsDialogModel.id) && AbstractC22676k.m65745e(this.title, updateTestsDialogModel.title) && AbstractC22676k.m65745e(this.sections, updateTestsDialogModel.sections);
    }

    public final String getId() {
        return this.id;
    }

    public final List<UpdateTestsSectionModel> getSections() {
        return this.sections;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.sections.hashCode() + AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        return AbstractC3855a.m11829m(AbstractC30007c.m91847q("UpdateTestsDialogModel(id=", str, ", title=", textResource, ", sections="), this.sections, ")");
    }

    public UpdateTestsDialogModel(String id4, TextResource title, List<UpdateTestsSectionModel> sections) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        this.id = id4;
        this.title = title;
        this.sections = sections;
    }
}
