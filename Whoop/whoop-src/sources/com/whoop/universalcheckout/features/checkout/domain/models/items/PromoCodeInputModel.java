package com.whoop.universalcheckout.features.checkout.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no2.C26995a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eB[\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b%\u0010&JV\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010&¨\u0006>"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "placeholder", "expandedTitle", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;", "cta", "", "promoCodeApplied", "", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;", "promoCodeTags", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;", "component5", "()Z", "component6", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getPlaceholder", "getExpandedTitle", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;", "getCta", "Z", "getPromoCodeApplied", "Ljava/util/List;", "getPromoCodeTags", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PromoCodeInputModel implements DesignSystemModel {
    private final PromoCodeInputCtaModel cta;
    private final TextResource expandedTitle;
    private final TextResource placeholder;
    private final boolean promoCodeApplied;
    private final List<PromoCodeTagModel> promoCodeTags;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26995a(9))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PromoCodeInputModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PromoCodeInputModel(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, PromoCodeInputCtaModel promoCodeInputCtaModel, boolean z4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, PromoCodeInputModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.placeholder = textResource2;
        this.expandedTitle = textResource3;
        this.cta = promoCodeInputCtaModel;
        this.promoCodeApplied = z4;
        this.promoCodeTags = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(PromoCodeTagModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoCodeInputModel copy$default(PromoCodeInputModel promoCodeInputModel, TextResource textResource, TextResource textResource2, TextResource textResource3, PromoCodeInputCtaModel promoCodeInputCtaModel, boolean z4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = promoCodeInputModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = promoCodeInputModel.placeholder;
        }
        if ((i13 & 4) != 0) {
            textResource3 = promoCodeInputModel.expandedTitle;
        }
        if ((i13 & 8) != 0) {
            promoCodeInputCtaModel = promoCodeInputModel.cta;
        }
        if ((i13 & 16) != 0) {
            z4 = promoCodeInputModel.promoCodeApplied;
        }
        if ((i13 & 32) != 0) {
            list = promoCodeInputModel.promoCodeTags;
        }
        boolean z13 = z4;
        List list2 = list;
        return promoCodeInputModel.copy(textResource, textResource2, textResource3, promoCodeInputCtaModel, z13, list2);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(PromoCodeInputModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.placeholder);
        output.encodeNullableSerializableElement(serialDesc, 2, c25452a, self.expandedTitle);
        output.encodeSerializableElement(serialDesc, 3, PromoCodeInputCtaModel$$serializer.INSTANCE, self.cta);
        output.encodeBooleanElement(serialDesc, 4, self.promoCodeApplied);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.promoCodeTags);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getExpandedTitle() {
        return this.expandedTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PromoCodeInputCtaModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPromoCodeApplied() {
        return this.promoCodeApplied;
    }

    public final List<PromoCodeTagModel> component6() {
        return this.promoCodeTags;
    }

    public final PromoCodeInputModel copy(TextResource title, TextResource placeholder, TextResource expandedTitle, PromoCodeInputCtaModel cta, boolean promoCodeApplied, List<PromoCodeTagModel> promoCodeTags) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(promoCodeTags, "promoCodeTags");
        return new PromoCodeInputModel(title, placeholder, expandedTitle, cta, promoCodeApplied, promoCodeTags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCodeInputModel)) {
            return false;
        }
        PromoCodeInputModel promoCodeInputModel = (PromoCodeInputModel) other;
        return AbstractC22676k.m65745e(this.title, promoCodeInputModel.title) && AbstractC22676k.m65745e(this.placeholder, promoCodeInputModel.placeholder) && AbstractC22676k.m65745e(this.expandedTitle, promoCodeInputModel.expandedTitle) && AbstractC22676k.m65745e(this.cta, promoCodeInputModel.cta) && this.promoCodeApplied == promoCodeInputModel.promoCodeApplied && AbstractC22676k.m65745e(this.promoCodeTags, promoCodeInputModel.promoCodeTags);
    }

    public final PromoCodeInputCtaModel getCta() {
        return this.cta;
    }

    public final TextResource getExpandedTitle() {
        return this.expandedTitle;
    }

    public final TextResource getPlaceholder() {
        return this.placeholder;
    }

    public final boolean getPromoCodeApplied() {
        return this.promoCodeApplied;
    }

    public final List<PromoCodeTagModel> getPromoCodeTags() {
        return this.promoCodeTags;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.placeholder;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.expandedTitle;
        return this.promoCodeTags.hashCode() + AbstractC2875y.m8289b((this.cta.hashCode() + ((iHashCode2 + (textResource2 != null ? textResource2.hashCode() : 0)) * 31)) * 31, 31, this.promoCodeApplied);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.placeholder;
        TextResource textResource3 = this.expandedTitle;
        PromoCodeInputCtaModel promoCodeInputCtaModel = this.cta;
        boolean z4 = this.promoCodeApplied;
        List<PromoCodeTagModel> list = this.promoCodeTags;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("PromoCodeInputModel(title=", textResource, ", placeholder=", textResource2, ", expandedTitle=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", cta=");
        sbM106658q.append(promoCodeInputCtaModel);
        sbM106658q.append(", promoCodeApplied=");
        sbM106658q.append(z4);
        sbM106658q.append(", promoCodeTags=");
        sbM106658q.append(list);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public PromoCodeInputModel(TextResource title, TextResource textResource, TextResource textResource2, PromoCodeInputCtaModel cta, boolean z4, List<PromoCodeTagModel> promoCodeTags) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(promoCodeTags, "promoCodeTags");
        this.title = title;
        this.placeholder = textResource;
        this.expandedTitle = textResource2;
        this.cta = cta;
        this.promoCodeApplied = z4;
        this.promoCodeTags = promoCodeTags;
    }
}
