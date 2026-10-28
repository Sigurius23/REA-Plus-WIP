package com.whoop.universalcheckout.features.cart.domain.models.items;

import cj0.C4744f;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import kotlinx.serialization.internal.EnumsKt;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lgz0/m0;", "icon", "", "text", "<init>", "(Lgz0/m0;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgz0/m0;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lgz0/m0;", "component2", "()Ljava/lang/String;", "copy", "(Lgz0/m0;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgz0/m0;", "getIcon", "Ljava/lang/String;", "getText", "Companion", "$serializer", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EmptyCartContentModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final EnumC16313m0 icon;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4744f(11)), null};

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.models.items.EmptyCartContentModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EmptyCartContentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyCartContentModel() {
        this((EnumC16313m0) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ EmptyCartContentModel copy$default(EmptyCartContentModel emptyCartContentModel, EnumC16313m0 enumC16313m0, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = emptyCartContentModel.icon;
        }
        if ((i13 & 2) != 0) {
            str = emptyCartContentModel.text;
        }
        return emptyCartContentModel.copy(enumC16313m0, str);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(EmptyCartContentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.icon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.text, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final EmptyCartContentModel copy(EnumC16313m0 icon, String text) {
        AbstractC22676k.m65750j(text, "text");
        return new EmptyCartContentModel(icon, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyCartContentModel)) {
            return false;
        }
        EmptyCartContentModel emptyCartContentModel = (EmptyCartContentModel) other;
        return this.icon == emptyCartContentModel.icon && AbstractC22676k.m65745e(this.text, emptyCartContentModel.text);
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.icon;
        return this.text.hashCode() + ((enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31);
    }

    public String toString() {
        return "EmptyCartContentModel(icon=" + this.icon + ", text=" + this.text + ")";
    }

    public /* synthetic */ EmptyCartContentModel(int i13, EnumC16313m0 enumC16313m0, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.icon = (i13 & 1) == 0 ? null : enumC16313m0;
        if ((i13 & 2) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
    }

    public EmptyCartContentModel(EnumC16313m0 enumC16313m0, String text) {
        AbstractC22676k.m65750j(text, "text");
        this.icon = enumC16313m0;
        this.text = text;
    }

    public /* synthetic */ EmptyCartContentModel(EnumC16313m0 enumC16313m0, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : enumC16313m0, (i13 & 2) != 0 ? "" : str);
    }
}
