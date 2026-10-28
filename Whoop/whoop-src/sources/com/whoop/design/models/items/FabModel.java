package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kd1.EnumC22400l;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36957d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b\u0007\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010!¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/FabModel;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "icon", "", "isHighlighted", "Lkd1/l;", "cta", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/Boolean;Lkd1/l;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/Boolean;Lkd1/l;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/FabModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "component4", "()Lkd1/l;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/Boolean;Lkd1/l;)Lcom/whoop/design/models/items/FabModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getIcon", "Ljava/lang/Boolean;", "Lkd1/l;", "getCta", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FabModel {
    private final EnumC22400l cta;
    private final String icon;
    private final Boolean isHighlighted;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36957d(10))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/FabModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/FabModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FabModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FabModel(int i13, TextResource textResource, String str, Boolean bool, EnumC22400l enumC22400l, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, FabModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.icon = str;
        this.isHighlighted = bool;
        this.cta = enumC22400l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.util.HomeCtaType", EnumC22400l.values());
    }

    public static /* synthetic */ FabModel copy$default(FabModel fabModel, TextResource textResource, String str, Boolean bool, EnumC22400l enumC22400l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = fabModel.title;
        }
        if ((i13 & 2) != 0) {
            str = fabModel.icon;
        }
        if ((i13 & 4) != 0) {
            bool = fabModel.isHighlighted;
        }
        if ((i13 & 8) != 0) {
            enumC22400l = fabModel.cta;
        }
        return fabModel.copy(textResource, str, bool, enumC22400l);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FabModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.isHighlighted);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsHighlighted() {
        return this.isHighlighted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC22400l getCta() {
        return this.cta;
    }

    public final FabModel copy(TextResource title, String icon, Boolean isHighlighted, EnumC22400l cta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(cta, "cta");
        return new FabModel(title, icon, isHighlighted, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FabModel)) {
            return false;
        }
        FabModel fabModel = (FabModel) other;
        return AbstractC22676k.m65745e(this.title, fabModel.title) && AbstractC22676k.m65745e(this.icon, fabModel.icon) && AbstractC22676k.m65745e(this.isHighlighted, fabModel.isHighlighted) && this.cta == fabModel.cta;
    }

    public final EnumC22400l getCta() {
        return this.cta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.icon);
        Boolean bool = this.isHighlighted;
        return this.cta.hashCode() + ((iM30450d + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final Boolean isHighlighted() {
        return this.isHighlighted;
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.icon;
        Boolean bool = this.isHighlighted;
        EnumC22400l enumC22400l = this.cta;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("FabModel(title=", textResource, ", icon=", str, ", isHighlighted=");
        sbM91845o.append(bool);
        sbM91845o.append(", cta=");
        sbM91845o.append(enumC22400l);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    public FabModel(TextResource title, String icon, Boolean bool, EnumC22400l cta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(cta, "cta");
        this.title = title;
        this.icon = icon;
        this.isHighlighted = bool;
        this.cta = cta;
    }
}
