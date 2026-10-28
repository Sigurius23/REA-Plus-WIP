package com.whoop.design.models.items.aiactiontile;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xo1.C38492a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJJ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b5\u0010\u001b¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lgz0/m0;", "leftIcon", "", "title", "subtitle", "Lcom/whoop/navigation/e;", "destination", "rightIcon", "<init>", "(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lgz0/m0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lgz0/m0;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/navigation/e;", "component5", "copy", "(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lgz0/m0;)Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgz0/m0;", "getLeftIcon", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "getRightIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiActionTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final EnumC16313m0 leftIcon;
    private final EnumC16313m0 rightIcon;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/aiactiontile/AiActionTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiActionTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C38492a(22)), null, null, AbstractC30060g.m92087G(enumC23463i, new C38492a(23)), AbstractC30060g.m92087G(enumC23463i, new C38492a(24))};
    }

    public AiActionTileModel() {
        this((EnumC16313m0) null, (String) null, (String) null, (C9598e) null, (EnumC16313m0) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ AiActionTileModel copy$default(AiActionTileModel aiActionTileModel, EnumC16313m0 enumC16313m0, String str, String str2, C9598e c9598e, EnumC16313m0 enumC16313m1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = aiActionTileModel.leftIcon;
        }
        if ((i13 & 2) != 0) {
            str = aiActionTileModel.title;
        }
        if ((i13 & 4) != 0) {
            str2 = aiActionTileModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            c9598e = aiActionTileModel.destination;
        }
        if ((i13 & 16) != 0) {
            enumC16313m1 = aiActionTileModel.rightIcon;
        }
        EnumC16313m0 enumC16313m2 = enumC16313m1;
        String str3 = str2;
        return aiActionTileModel.copy(enumC16313m0, str, str3, c9598e, enumC16313m2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(AiActionTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.leftIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.leftIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 1, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.destination);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.rightIcon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.rightIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC16313m0 getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    public final AiActionTileModel copy(EnumC16313m0 leftIcon, String title, String subtitle, C9598e destination, EnumC16313m0 rightIcon) {
        AbstractC22676k.m65750j(title, "title");
        return new AiActionTileModel(leftIcon, title, subtitle, destination, rightIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiActionTileModel)) {
            return false;
        }
        AiActionTileModel aiActionTileModel = (AiActionTileModel) other;
        return this.leftIcon == aiActionTileModel.leftIcon && AbstractC22676k.m65745e(this.title, aiActionTileModel.title) && AbstractC22676k.m65745e(this.subtitle, aiActionTileModel.subtitle) && AbstractC22676k.m65745e(this.destination, aiActionTileModel.destination) && this.rightIcon == aiActionTileModel.rightIcon;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final EnumC16313m0 getLeftIcon() {
        return this.leftIcon;
    }

    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        int iM30450d = AbstractC11266d.m30450d((enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        return iHashCode2 + (enumC16313m1 != null ? enumC16313m1.hashCode() : 0);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.leftIcon;
        String str = this.title;
        String str2 = this.subtitle;
        C9598e c9598e = this.destination;
        EnumC16313m0 enumC16313m1 = this.rightIcon;
        StringBuilder sb4 = new StringBuilder("AiActionTileModel(leftIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", subtitle=");
        AbstractC30007c.m91827B(sb4, str2, ", destination=", c9598e, ", rightIcon=");
        sb4.append(enumC16313m1);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ AiActionTileModel(int i13, EnumC16313m0 enumC16313m0, String str, String str2, C9598e c9598e, EnumC16313m0 enumC16313m1, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.leftIcon = null;
        } else {
            this.leftIcon = enumC16313m0;
        }
        if ((i13 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 8) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 16) == 0) {
            this.rightIcon = null;
        } else {
            this.rightIcon = enumC16313m1;
        }
    }

    public AiActionTileModel(EnumC16313m0 enumC16313m0, String title, String str, C9598e c9598e, EnumC16313m0 enumC16313m1) {
        AbstractC22676k.m65750j(title, "title");
        this.leftIcon = enumC16313m0;
        this.title = title;
        this.subtitle = str;
        this.destination = c9598e;
        this.rightIcon = enumC16313m1;
    }

    public /* synthetic */ AiActionTileModel(EnumC16313m0 enumC16313m0, String str, String str2, C9598e c9598e, EnumC16313m0 enumC16313m1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : enumC16313m0, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : c9598e, (i13 & 16) != 0 ? null : enumC16313m1);
    }
}
