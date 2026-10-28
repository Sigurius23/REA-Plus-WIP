package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36965l;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/design/models/items/WaitlistBiomarkerListPreviewModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "searchPlaceholder", "", "Lcom/whoop/design/models/items/BiomarkerModel;", "biomarkers", "Lcom/whoop/design/models/items/WaitlistBiomarkerListCtaModel;", "cta", "Lcom/whoop/design/models/items/CardButtonModel;", "button", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/WaitlistBiomarkerListCtaModel;Lcom/whoop/design/models/items/CardButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/WaitlistBiomarkerListCtaModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/WaitlistBiomarkerListPreviewModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/WaitlistBiomarkerListCtaModel;", "component4", "()Lcom/whoop/design/models/items/CardButtonModel;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/WaitlistBiomarkerListCtaModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/WaitlistBiomarkerListPreviewModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSearchPlaceholder", "Ljava/util/List;", "getBiomarkers", "Lcom/whoop/design/models/items/WaitlistBiomarkerListCtaModel;", "getCta", "Lcom/whoop/design/models/items/CardButtonModel;", "getButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WaitlistBiomarkerListPreviewModel implements DesignSystemModel {
    private final List<BiomarkerModel> biomarkers;
    private final CardButtonModel button;
    private final WaitlistBiomarkerListCtaModel cta;
    private final String searchPlaceholder;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36965l(5)), null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/WaitlistBiomarkerListPreviewModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/WaitlistBiomarkerListPreviewModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WaitlistBiomarkerListPreviewModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WaitlistBiomarkerListPreviewModel(int i13, String str, List list, WaitlistBiomarkerListCtaModel waitlistBiomarkerListCtaModel, CardButtonModel cardButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, WaitlistBiomarkerListPreviewModel$$serializer.INSTANCE.getDescriptor());
        }
        this.searchPlaceholder = str;
        this.biomarkers = list;
        this.cta = waitlistBiomarkerListCtaModel;
        this.button = cardButtonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BiomarkerModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WaitlistBiomarkerListPreviewModel copy$default(WaitlistBiomarkerListPreviewModel waitlistBiomarkerListPreviewModel, String str, List list, WaitlistBiomarkerListCtaModel waitlistBiomarkerListCtaModel, CardButtonModel cardButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = waitlistBiomarkerListPreviewModel.searchPlaceholder;
        }
        if ((i13 & 2) != 0) {
            list = waitlistBiomarkerListPreviewModel.biomarkers;
        }
        if ((i13 & 4) != 0) {
            waitlistBiomarkerListCtaModel = waitlistBiomarkerListPreviewModel.cta;
        }
        if ((i13 & 8) != 0) {
            cardButtonModel = waitlistBiomarkerListPreviewModel.button;
        }
        return waitlistBiomarkerListPreviewModel.copy(str, list, waitlistBiomarkerListCtaModel, cardButtonModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(WaitlistBiomarkerListPreviewModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.searchPlaceholder);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.biomarkers);
        output.encodeSerializableElement(serialDesc, 2, WaitlistBiomarkerListCtaModel$$serializer.INSTANCE, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 3, CardButtonModel$$serializer.INSTANCE, self.button);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    public final List<BiomarkerModel> component2() {
        return this.biomarkers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WaitlistBiomarkerListCtaModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CardButtonModel getButton() {
        return this.button;
    }

    public final WaitlistBiomarkerListPreviewModel copy(String searchPlaceholder, List<BiomarkerModel> biomarkers, WaitlistBiomarkerListCtaModel cta, CardButtonModel button) {
        AbstractC22676k.m65750j(searchPlaceholder, "searchPlaceholder");
        AbstractC22676k.m65750j(biomarkers, "biomarkers");
        AbstractC22676k.m65750j(cta, "cta");
        return new WaitlistBiomarkerListPreviewModel(searchPlaceholder, biomarkers, cta, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaitlistBiomarkerListPreviewModel)) {
            return false;
        }
        WaitlistBiomarkerListPreviewModel waitlistBiomarkerListPreviewModel = (WaitlistBiomarkerListPreviewModel) other;
        return AbstractC22676k.m65745e(this.searchPlaceholder, waitlistBiomarkerListPreviewModel.searchPlaceholder) && AbstractC22676k.m65745e(this.biomarkers, waitlistBiomarkerListPreviewModel.biomarkers) && AbstractC22676k.m65745e(this.cta, waitlistBiomarkerListPreviewModel.cta) && AbstractC22676k.m65745e(this.button, waitlistBiomarkerListPreviewModel.button);
    }

    public final List<BiomarkerModel> getBiomarkers() {
        return this.biomarkers;
    }

    public final CardButtonModel getButton() {
        return this.button;
    }

    public final WaitlistBiomarkerListCtaModel getCta() {
        return this.cta;
    }

    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    public int hashCode() {
        int iHashCode = (this.cta.hashCode() + AbstractC11895b.m31983b(this.searchPlaceholder.hashCode() * 31, 31, this.biomarkers)) * 31;
        CardButtonModel cardButtonModel = this.button;
        return iHashCode + (cardButtonModel == null ? 0 : cardButtonModel.hashCode());
    }

    public String toString() {
        String str = this.searchPlaceholder;
        List<BiomarkerModel> list = this.biomarkers;
        WaitlistBiomarkerListCtaModel waitlistBiomarkerListCtaModel = this.cta;
        CardButtonModel cardButtonModel = this.button;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("WaitlistBiomarkerListPreviewModel(searchPlaceholder=", str, ", biomarkers=", ", cta=", list);
        sbM94766o.append(waitlistBiomarkerListCtaModel);
        sbM94766o.append(", button=");
        sbM94766o.append(cardButtonModel);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public WaitlistBiomarkerListPreviewModel(String searchPlaceholder, List<BiomarkerModel> biomarkers, WaitlistBiomarkerListCtaModel cta, CardButtonModel cardButtonModel) {
        AbstractC22676k.m65750j(searchPlaceholder, "searchPlaceholder");
        AbstractC22676k.m65750j(biomarkers, "biomarkers");
        AbstractC22676k.m65750j(cta, "cta");
        this.searchPlaceholder = searchPlaceholder;
        this.biomarkers = biomarkers;
        this.cta = cta;
        this.button = cardButtonModel;
    }
}
