package com.whoop.weightlifting.data.dto;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel$$serializer;
import com.whoop.design.models.items.CollapsableHeaderModel;
import com.whoop.design.models.items.CollapsableHeaderModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;", "", "Lcom/whoop/design/models/items/CollapsableHeaderModel;", "header", "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "content", "Lcom/whoop/weightlifting/data/dto/MetaData;", "metadata", "Lcom/whoop/design/models/DesignSystemModel;", "emptyStateCard", "<init>", "(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/CollapsableHeaderModel;", "component2", "()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "component3", "()Lcom/whoop/weightlifting/data/dto/MetaData;", "component4", "()Lcom/whoop/design/models/DesignSystemModel;", "copy", "(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/weightlifting/data/dto/MetaData;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/CollapsableHeaderModel;", "getHeader", "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "getContent", "Lcom/whoop/weightlifting/data/dto/MetaData;", "getMetadata", "Lcom/whoop/design/models/DesignSystemModel;", "getEmptyStateCard", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseDetailsModel {
    private final AnchorSelectorModel content;
    private final DesignSystemModel emptyStateCard;
    private final CollapsableHeaderModel header;
    private final MetaData metadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22831a(19))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseDetailsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExerciseDetailsModel(int i13, CollapsableHeaderModel collapsableHeaderModel, AnchorSelectorModel anchorSelectorModel, MetaData metaData, DesignSystemModel designSystemModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ExerciseDetailsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = collapsableHeaderModel;
        this.content = anchorSelectorModel;
        if ((i13 & 4) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
        if ((i13 & 8) == 0) {
            this.emptyStateCard = null;
        } else {
            this.emptyStateCard = designSystemModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ExerciseDetailsModel copy$default(ExerciseDetailsModel exerciseDetailsModel, CollapsableHeaderModel collapsableHeaderModel, AnchorSelectorModel anchorSelectorModel, MetaData metaData, DesignSystemModel designSystemModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            collapsableHeaderModel = exerciseDetailsModel.header;
        }
        if ((i13 & 2) != 0) {
            anchorSelectorModel = exerciseDetailsModel.content;
        }
        if ((i13 & 4) != 0) {
            metaData = exerciseDetailsModel.metadata;
        }
        if ((i13 & 8) != 0) {
            designSystemModel = exerciseDetailsModel.emptyStateCard;
        }
        return exerciseDetailsModel.copy(collapsableHeaderModel, anchorSelectorModel, metaData, designSystemModel);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(ExerciseDetailsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, CollapsableHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 1, AnchorSelectorModel$$serializer.INSTANCE, self.content);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.metadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, MetaData$$serializer.INSTANCE, self.metadata);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.emptyStateCard == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.emptyStateCard);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CollapsableHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnchorSelectorModel getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DesignSystemModel getEmptyStateCard() {
        return this.emptyStateCard;
    }

    public final ExerciseDetailsModel copy(CollapsableHeaderModel header, AnchorSelectorModel content, MetaData metadata, DesignSystemModel emptyStateCard) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(content, "content");
        return new ExerciseDetailsModel(header, content, metadata, emptyStateCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseDetailsModel)) {
            return false;
        }
        ExerciseDetailsModel exerciseDetailsModel = (ExerciseDetailsModel) other;
        return AbstractC22676k.m65745e(this.header, exerciseDetailsModel.header) && AbstractC22676k.m65745e(this.content, exerciseDetailsModel.content) && AbstractC22676k.m65745e(this.metadata, exerciseDetailsModel.metadata) && AbstractC22676k.m65745e(this.emptyStateCard, exerciseDetailsModel.emptyStateCard);
    }

    public final AnchorSelectorModel getContent() {
        return this.content;
    }

    public final DesignSystemModel getEmptyStateCard() {
        return this.emptyStateCard;
    }

    public final CollapsableHeaderModel getHeader() {
        return this.header;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int iHashCode = (this.content.hashCode() + (this.header.hashCode() * 31)) * 31;
        MetaData metaData = this.metadata;
        int iHashCode2 = (iHashCode + (metaData == null ? 0 : metaData.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.emptyStateCard;
        return iHashCode2 + (designSystemModel != null ? designSystemModel.hashCode() : 0);
    }

    public String toString() {
        return "ExerciseDetailsModel(header=" + this.header + ", content=" + this.content + ", metadata=" + this.metadata + ", emptyStateCard=" + this.emptyStateCard + ")";
    }

    public ExerciseDetailsModel(CollapsableHeaderModel header, AnchorSelectorModel content, MetaData metaData, DesignSystemModel designSystemModel) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(content, "content");
        this.header = header;
        this.content = content;
        this.metadata = metaData;
        this.emptyStateCard = designSystemModel;
    }

    public /* synthetic */ ExerciseDetailsModel(CollapsableHeaderModel collapsableHeaderModel, AnchorSelectorModel anchorSelectorModel, MetaData metaData, DesignSystemModel designSystemModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(collapsableHeaderModel, anchorSelectorModel, (i13 & 4) != 0 ? null : metaData, (i13 & 8) != 0 ? null : designSystemModel);
    }
}
