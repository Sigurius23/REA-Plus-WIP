package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/VowModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "body", "", "icon", "Lcom/whoop/design/models/items/VowCtaModel;", "vowCta", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/items/VowCtaModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/items/VowCtaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/VowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/design/models/items/VowCtaModel;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/items/VowCtaModel;)Lcom/whoop/design/models/items/VowModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getBody", "Ljava/lang/String;", "getIcon", "Lcom/whoop/design/models/items/VowCtaModel;", "getVowCta", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VowModel implements DesignSystemModel {
    private final TextResource body;
    private final String icon;
    private final TextResource title;
    private final VowCtaModel vowCta;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/VowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/VowModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VowModel() {
        this((TextResource) null, (TextResource) null, (String) null, (VowCtaModel) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ VowModel copy$default(VowModel vowModel, TextResource textResource, TextResource textResource2, String str, VowCtaModel vowCtaModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = vowModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = vowModel.body;
        }
        if ((i13 & 4) != 0) {
            str = vowModel.icon;
        }
        if ((i13 & 8) != 0) {
            vowCtaModel = vowModel.vowCta;
        }
        return vowModel.copy(textResource, textResource2, str, vowCtaModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(VowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.body, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.body);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.icon, "")) {
            output.encodeStringElement(serialDesc, 2, self.icon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.vowCta == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, VowCtaModel$$serializer.INSTANCE, self.vowCta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VowCtaModel getVowCta() {
        return this.vowCta;
    }

    public final VowModel copy(TextResource title, TextResource body, String icon, VowCtaModel vowCta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(icon, "icon");
        return new VowModel(title, body, icon, vowCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VowModel)) {
            return false;
        }
        VowModel vowModel = (VowModel) other;
        return AbstractC22676k.m65745e(this.title, vowModel.title) && AbstractC22676k.m65745e(this.body, vowModel.body) && AbstractC22676k.m65745e(this.icon, vowModel.icon) && AbstractC22676k.m65745e(this.vowCta, vowModel.vowCta);
    }

    public final TextResource getBody() {
        return this.body;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final VowCtaModel getVowCta() {
        return this.vowCta;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.body, 31), 31, this.icon);
        VowCtaModel vowCtaModel = this.vowCta;
        return iM30450d + (vowCtaModel == null ? 0 : vowCtaModel.hashCode());
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.body;
        String str = this.icon;
        VowCtaModel vowCtaModel = this.vowCta;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("VowModel(title=", textResource, ", body=", textResource2, ", icon=");
        sbM106658q.append(str);
        sbM106658q.append(", vowCta=");
        sbM106658q.append(vowCtaModel);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ VowModel(int i13, TextResource textResource, TextResource textResource2, String str, VowCtaModel vowCtaModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.body = AbstractC8693b.m21267a();
        } else {
            this.body = textResource2;
        }
        if ((i13 & 4) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
        if ((i13 & 8) == 0) {
            this.vowCta = null;
        } else {
            this.vowCta = vowCtaModel;
        }
    }

    public VowModel(TextResource title, TextResource body, String icon, VowCtaModel vowCtaModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(icon, "icon");
        this.title = title;
        this.body = body;
        this.icon = icon;
        this.vowCta = vowCtaModel;
    }

    public /* synthetic */ VowModel(TextResource textResource, TextResource textResource2, String str, VowCtaModel vowCtaModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? null : vowCtaModel);
    }
}
