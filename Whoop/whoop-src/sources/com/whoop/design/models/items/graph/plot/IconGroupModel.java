package com.whoop.design.models.items.graph.plot;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import na1.C26511a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/IconGroupModel;", "", "", "x", "y", "", "icon", "Lcom/whoop/design/models/items/graph/plot/IconPointStyle;", "style", "width", "<init>", "(FFLjava/lang/String;Lcom/whoop/design/models/items/graph/plot/IconPointStyle;F)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFLjava/lang/String;Lcom/whoop/design/models/items/graph/plot/IconPointStyle;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/IconGroupModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/design/models/items/graph/plot/IconPointStyle;", "component5", "copy", "(FFLjava/lang/String;Lcom/whoop/design/models/items/graph/plot/IconPointStyle;F)Lcom/whoop/design/models/items/graph/plot/IconGroupModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getX", "getY", "Ljava/lang/String;", "getIcon", "Lcom/whoop/design/models/items/graph/plot/IconPointStyle;", "getStyle", "getWidth", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IconGroupModel {
    public static final int $stable = 0;
    private final String icon;
    private final IconPointStyle style;
    private final float width;
    private final float x;
    private final float y;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26511a(7)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/IconGroupModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/IconGroupModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IconGroupModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public IconGroupModel(float f13, float f14, String str, IconPointStyle style, float f15) {
        AbstractC22676k.m65750j(style, "style");
        this.x = f13;
        this.y = f14;
        this.icon = str;
        this.style = style;
        this.width = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.IconPointStyle", IconPointStyle.values());
    }

    public static /* synthetic */ IconGroupModel copy$default(IconGroupModel iconGroupModel, float f13, float f14, String str, IconPointStyle iconPointStyle, float f15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = iconGroupModel.x;
        }
        if ((i13 & 2) != 0) {
            f14 = iconGroupModel.y;
        }
        if ((i13 & 4) != 0) {
            str = iconGroupModel.icon;
        }
        if ((i13 & 8) != 0) {
            iconPointStyle = iconGroupModel.style;
        }
        if ((i13 & 16) != 0) {
            f15 = iconGroupModel.width;
        }
        float f16 = f15;
        String str2 = str;
        return iconGroupModel.copy(f13, f14, str2, iconPointStyle, f16);
    }

    public static final /* synthetic */ void write$Self$design_models_release(IconGroupModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeFloatElement(serialDesc, 0, self.x);
        output.encodeFloatElement(serialDesc, 1, self.y);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.icon);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        output.encodeFloatElement(serialDesc, 4, self.width);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final IconPointStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final IconGroupModel copy(float x3, float y13, String icon, IconPointStyle style, float width) {
        AbstractC22676k.m65750j(style, "style");
        return new IconGroupModel(x3, y13, icon, style, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconGroupModel)) {
            return false;
        }
        IconGroupModel iconGroupModel = (IconGroupModel) other;
        return Float.compare(this.x, iconGroupModel.x) == 0 && Float.compare(this.y, iconGroupModel.y) == 0 && AbstractC22676k.m65745e(this.icon, iconGroupModel.icon) && this.style == iconGroupModel.style && Float.compare(this.width, iconGroupModel.width) == 0;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final IconPointStyle getStyle() {
        return this.style;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.y, Float.hashCode(this.x) * 31, 31);
        String str = this.icon;
        return Float.hashCode(this.width) + ((this.style.hashCode() + ((iM30447a + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        float f13 = this.x;
        float f14 = this.y;
        String str = this.icon;
        IconPointStyle iconPointStyle = this.style;
        float f15 = this.width;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("IconGroupModel(x=", f13, ", y=", f14, ", icon=");
        sbM8307t.append(str);
        sbM8307t.append(", style=");
        sbM8307t.append(iconPointStyle);
        sbM8307t.append(", width=");
        return AbstractC30007c.m91837g(f15, ")", sbM8307t);
    }

    public /* synthetic */ IconGroupModel(int i13, float f13, float f14, String str, IconPointStyle iconPointStyle, float f15, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, IconGroupModel$$serializer.INSTANCE.getDescriptor());
        }
        this.x = f13;
        this.y = f14;
        this.icon = str;
        this.style = iconPointStyle;
        this.width = f15;
    }
}
