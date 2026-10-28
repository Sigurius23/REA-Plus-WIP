package com.whoop.deepdive.domain.models;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlin.C2012k;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/deepdive/domain/models/DeepDiveModels;", "", "Lcom/whoop/deepdive/domain/models/MetaData;", "metadata", "Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;", "header", "", "Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;", "sections", "<init>", "(Lcom/whoop/deepdive/domain/models/MetaData;Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/deepdive/domain/models/MetaData;Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$deep_dive_release", "(Lcom/whoop/deepdive/domain/models/DeepDiveModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/deepdive/domain/models/MetaData;", "component2", "()Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;", "component3", "()Ljava/util/List;", "copy", "(Lcom/whoop/deepdive/domain/models/MetaData;Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;Ljava/util/List;)Lcom/whoop/deepdive/domain/models/DeepDiveModels;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/deepdive/domain/models/MetaData;", "getMetadata", "Lcom/whoop/deepdive/domain/models/DeepDiveHeaderModel;", "getHeader", "Ljava/util/List;", "getSections", "Companion", "$serializer", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DeepDiveModels {
    private final DeepDiveHeaderModel header;
    private final MetaData metadata;
    private final List<DeepDiveSectionModel> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C2012k(19))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/deepdive/domain/models/DeepDiveModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/deepdive/domain/models/DeepDiveModels;", "serializer", "()Lwc3/c;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DeepDiveModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeepDiveModels(int i13, MetaData metaData, DeepDiveHeaderModel deepDiveHeaderModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, DeepDiveModels$$serializer.INSTANCE.getDescriptor());
        }
        this.metadata = metaData;
        this.header = deepDiveHeaderModel;
        this.sections = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(DeepDiveSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeepDiveModels copy$default(DeepDiveModels deepDiveModels, MetaData metaData, DeepDiveHeaderModel deepDiveHeaderModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            metaData = deepDiveModels.metadata;
        }
        if ((i13 & 2) != 0) {
            deepDiveHeaderModel = deepDiveModels.header;
        }
        if ((i13 & 4) != 0) {
            list = deepDiveModels.sections;
        }
        return deepDiveModels.copy(metaData, deepDiveHeaderModel, list);
    }

    public static final /* synthetic */ void write$Self$deep_dive_release(DeepDiveModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, MetaData$$serializer.INSTANCE, self.metadata);
        output.encodeSerializableElement(serialDesc, 1, DeepDiveHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeepDiveHeaderModel getHeader() {
        return this.header;
    }

    public final List<DeepDiveSectionModel> component3() {
        return this.sections;
    }

    public final DeepDiveModels copy(MetaData metadata, DeepDiveHeaderModel header, List<DeepDiveSectionModel> sections) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(sections, "sections");
        return new DeepDiveModels(metadata, header, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepDiveModels)) {
            return false;
        }
        DeepDiveModels deepDiveModels = (DeepDiveModels) other;
        return AbstractC22676k.m65745e(this.metadata, deepDiveModels.metadata) && AbstractC22676k.m65745e(this.header, deepDiveModels.header) && AbstractC22676k.m65745e(this.sections, deepDiveModels.sections);
    }

    public final DeepDiveHeaderModel getHeader() {
        return this.header;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final List<DeepDiveSectionModel> getSections() {
        return this.sections;
    }

    public int hashCode() {
        MetaData metaData = this.metadata;
        return this.sections.hashCode() + ((this.header.hashCode() + ((metaData == null ? 0 : metaData.hashCode()) * 31)) * 31);
    }

    public String toString() {
        MetaData metaData = this.metadata;
        DeepDiveHeaderModel deepDiveHeaderModel = this.header;
        List<DeepDiveSectionModel> list = this.sections;
        StringBuilder sb4 = new StringBuilder("DeepDiveModels(metadata=");
        sb4.append(metaData);
        sb4.append(", header=");
        sb4.append(deepDiveHeaderModel);
        sb4.append(", sections=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public DeepDiveModels(MetaData metaData, DeepDiveHeaderModel header, List<DeepDiveSectionModel> sections) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(sections, "sections");
        this.metadata = metaData;
        this.header = header;
        this.sections = sections;
    }
}
