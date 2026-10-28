package com.whoop.communityfollowercontainer.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cq2.C11062a;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;", "", "Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;", "filters", "sorts", "Lcom/whoop/design/models/DesignSystemModel;", "cta", "<init>", "(Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/communityfollowercontainer/domain/model/OptionSection;Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_follower_container_arch_mini_release", "(Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;", "component2", "component3", "()Lcom/whoop/design/models/DesignSystemModel;", "copy", "(Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/communityfollowercontainer/domain/model/OptionSection;", "getFilters", "getSorts", "Lcom/whoop/design/models/DesignSystemModel;", "getCta", "Companion", "$serializer", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityFilterBottomSheetModel {
    private final DesignSystemModel cta;
    private final OptionSection filters;
    private final OptionSection sorts;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11062a(26))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;", "serializer", "()Lwc3/c;", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityFilterBottomSheetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CommunityFilterBottomSheetModel() {
        this((OptionSection) null, (OptionSection) null, (DesignSystemModel) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CommunityFilterBottomSheetModel copy$default(CommunityFilterBottomSheetModel communityFilterBottomSheetModel, OptionSection optionSection, OptionSection optionSection2, DesignSystemModel designSystemModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            optionSection = communityFilterBottomSheetModel.filters;
        }
        if ((i13 & 2) != 0) {
            optionSection2 = communityFilterBottomSheetModel.sorts;
        }
        if ((i13 & 4) != 0) {
            designSystemModel = communityFilterBottomSheetModel.cta;
        }
        return communityFilterBottomSheetModel.copy(optionSection, optionSection2, designSystemModel);
    }

    public static final /* synthetic */ void write$Self$community_follower_container_arch_mini_release(CommunityFilterBottomSheetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.filters != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, OptionSection$$serializer.INSTANCE, self.filters);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sorts != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, OptionSection$$serializer.INSTANCE, self.sorts);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.cta == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OptionSection getFilters() {
        return this.filters;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OptionSection getSorts() {
        return this.sorts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DesignSystemModel getCta() {
        return this.cta;
    }

    public final CommunityFilterBottomSheetModel copy(OptionSection filters, OptionSection sorts, DesignSystemModel cta) {
        return new CommunityFilterBottomSheetModel(filters, sorts, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityFilterBottomSheetModel)) {
            return false;
        }
        CommunityFilterBottomSheetModel communityFilterBottomSheetModel = (CommunityFilterBottomSheetModel) other;
        return AbstractC22676k.m65745e(this.filters, communityFilterBottomSheetModel.filters) && AbstractC22676k.m65745e(this.sorts, communityFilterBottomSheetModel.sorts) && AbstractC22676k.m65745e(this.cta, communityFilterBottomSheetModel.cta);
    }

    public final DesignSystemModel getCta() {
        return this.cta;
    }

    public final OptionSection getFilters() {
        return this.filters;
    }

    public final OptionSection getSorts() {
        return this.sorts;
    }

    public int hashCode() {
        OptionSection optionSection = this.filters;
        int iHashCode = (optionSection == null ? 0 : optionSection.hashCode()) * 31;
        OptionSection optionSection2 = this.sorts;
        int iHashCode2 = (iHashCode + (optionSection2 == null ? 0 : optionSection2.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.cta;
        return iHashCode2 + (designSystemModel != null ? designSystemModel.hashCode() : 0);
    }

    public String toString() {
        return "CommunityFilterBottomSheetModel(filters=" + this.filters + ", sorts=" + this.sorts + ", cta=" + this.cta + ")";
    }

    public /* synthetic */ CommunityFilterBottomSheetModel(int i13, OptionSection optionSection, OptionSection optionSection2, DesignSystemModel designSystemModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.filters = null;
        } else {
            this.filters = optionSection;
        }
        if ((i13 & 2) == 0) {
            this.sorts = null;
        } else {
            this.sorts = optionSection2;
        }
        if ((i13 & 4) == 0) {
            this.cta = null;
        } else {
            this.cta = designSystemModel;
        }
    }

    public CommunityFilterBottomSheetModel(OptionSection optionSection, OptionSection optionSection2, DesignSystemModel designSystemModel) {
        this.filters = optionSection;
        this.sorts = optionSection2;
        this.cta = designSystemModel;
    }

    public /* synthetic */ CommunityFilterBottomSheetModel(OptionSection optionSection, OptionSection optionSection2, DesignSystemModel designSystemModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : optionSection, (i13 & 2) != 0 ? null : optionSection2, (i13 & 4) != 0 ? null : designSystemModel);
    }
}
