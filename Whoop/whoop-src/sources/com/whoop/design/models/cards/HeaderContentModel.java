package com.whoop.design.models.cards;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t42.C33538a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/cards/HeaderContentModel;", "", "Lgz0/m0;", "leadingIcon", "", "leadingImage", "title", "trailingIcon", "<init>", "(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgz0/m0;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/HeaderContentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lgz0/m0;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;)Lcom/whoop/design/models/cards/HeaderContentModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgz0/m0;", "getLeadingIcon", "Ljava/lang/String;", "getLeadingImage", "getTitle", "getTrailingIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeaderContentModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EnumC16313m0 leadingIcon;
    private final String leadingImage;
    private final String title;
    private final EnumC16313m0 trailingIcon;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/HeaderContentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/HeaderContentModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeaderContentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C33538a(16)), null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(17))};
    }

    public HeaderContentModel() {
        this((EnumC16313m0) null, (String) null, (String) null, (EnumC16313m0) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ HeaderContentModel copy$default(HeaderContentModel headerContentModel, EnumC16313m0 enumC16313m0, String str, String str2, EnumC16313m0 enumC16313m1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = headerContentModel.leadingIcon;
        }
        if ((i13 & 2) != 0) {
            str = headerContentModel.leadingImage;
        }
        if ((i13 & 4) != 0) {
            str2 = headerContentModel.title;
        }
        if ((i13 & 8) != 0) {
            enumC16313m1 = headerContentModel.trailingIcon;
        }
        return headerContentModel.copy(enumC16313m0, str, str2, enumC16313m1);
    }

    public static final /* synthetic */ void write$Self$design_models_release(HeaderContentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.leadingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.leadingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.leadingImage != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.leadingImage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.title);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.trailingIcon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.trailingIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC16313m0 getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeadingImage() {
        return this.leadingImage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC16313m0 getTrailingIcon() {
        return this.trailingIcon;
    }

    public final HeaderContentModel copy(EnumC16313m0 leadingIcon, String leadingImage, String title, EnumC16313m0 trailingIcon) {
        return new HeaderContentModel(leadingIcon, leadingImage, title, trailingIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderContentModel)) {
            return false;
        }
        HeaderContentModel headerContentModel = (HeaderContentModel) other;
        return this.leadingIcon == headerContentModel.leadingIcon && AbstractC22676k.m65745e(this.leadingImage, headerContentModel.leadingImage) && AbstractC22676k.m65745e(this.title, headerContentModel.title) && this.trailingIcon == headerContentModel.trailingIcon;
    }

    public final EnumC16313m0 getLeadingIcon() {
        return this.leadingIcon;
    }

    public final String getLeadingImage() {
        return this.leadingImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final EnumC16313m0 getTrailingIcon() {
        return this.trailingIcon;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.leadingIcon;
        int iHashCode = (enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31;
        String str = this.leadingImage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.trailingIcon;
        return iHashCode3 + (enumC16313m1 != null ? enumC16313m1.hashCode() : 0);
    }

    public String toString() {
        return "HeaderContentModel(leadingIcon=" + this.leadingIcon + ", leadingImage=" + this.leadingImage + ", title=" + this.title + ", trailingIcon=" + this.trailingIcon + ")";
    }

    public /* synthetic */ HeaderContentModel(int i13, EnumC16313m0 enumC16313m0, String str, String str2, EnumC16313m0 enumC16313m1, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.leadingIcon = null;
        } else {
            this.leadingIcon = enumC16313m0;
        }
        if ((i13 & 2) == 0) {
            this.leadingImage = null;
        } else {
            this.leadingImage = str;
        }
        if ((i13 & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i13 & 8) == 0) {
            this.trailingIcon = null;
        } else {
            this.trailingIcon = enumC16313m1;
        }
    }

    public HeaderContentModel(EnumC16313m0 enumC16313m0, String str, String str2, EnumC16313m0 enumC16313m1) {
        this.leadingIcon = enumC16313m0;
        this.leadingImage = str;
        this.title = str2;
        this.trailingIcon = enumC16313m1;
    }

    public /* synthetic */ HeaderContentModel(EnumC16313m0 enumC16313m0, String str, String str2, EnumC16313m0 enumC16313m1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : enumC16313m0, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : enumC16313m1);
    }
}
