package com.whoop.design.models.colortheme;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import v40.C35652d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "", "Lcom/whoop/design/models/colortheme/ColorBackgroundType;", "type", "", "Lcom/whoop/design/models/colortheme/ColorValueModel;", "colors", "", "opacity", "<init>", "(Lcom/whoop/design/models/colortheme/ColorBackgroundType;Ljava/util/List;Ljava/lang/Float;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/colortheme/ColorBackgroundType;Ljava/util/List;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/colortheme/ColorBackgroundModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/colortheme/ColorBackgroundType;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Float;", "copy", "(Lcom/whoop/design/models/colortheme/ColorBackgroundType;Ljava/util/List;Ljava/lang/Float;)Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/colortheme/ColorBackgroundType;", "getType", "Ljava/util/List;", "getColors", "Ljava/lang/Float;", "getOpacity", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ColorBackgroundModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<ColorValueModel> colors;
    private final Float opacity;
    private final ColorBackgroundType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/colortheme/ColorBackgroundModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ColorBackgroundModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C35652d(18)), AbstractC30060g.m92087G(enumC23463i, new C35652d(19)), null};
    }

    public ColorBackgroundModel() {
        this((ColorBackgroundType) null, (List) null, (Float) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ColorBackgroundType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ColorValueModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColorBackgroundModel copy$default(ColorBackgroundModel colorBackgroundModel, ColorBackgroundType colorBackgroundType, List list, Float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            colorBackgroundType = colorBackgroundModel.type;
        }
        if ((i13 & 2) != 0) {
            list = colorBackgroundModel.colors;
        }
        if ((i13 & 4) != 0) {
            f13 = colorBackgroundModel.opacity;
        }
        return colorBackgroundModel.copy(colorBackgroundType, list, f13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ColorBackgroundModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.type != ColorBackgroundType.RADIAL) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.colors, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.colors);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.opacity == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.opacity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ColorBackgroundType getType() {
        return this.type;
    }

    public final List<ColorValueModel> component2() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getOpacity() {
        return this.opacity;
    }

    public final ColorBackgroundModel copy(ColorBackgroundType type, List<ColorValueModel> colors, Float opacity) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(colors, "colors");
        return new ColorBackgroundModel(type, colors, opacity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorBackgroundModel)) {
            return false;
        }
        ColorBackgroundModel colorBackgroundModel = (ColorBackgroundModel) other;
        return this.type == colorBackgroundModel.type && AbstractC22676k.m65745e(this.colors, colorBackgroundModel.colors) && AbstractC22676k.m65745e(this.opacity, colorBackgroundModel.opacity);
    }

    public final List<ColorValueModel> getColors() {
        return this.colors;
    }

    public final Float getOpacity() {
        return this.opacity;
    }

    public final ColorBackgroundType getType() {
        return this.type;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.type.hashCode() * 31, 31, this.colors);
        Float f13 = this.opacity;
        return iM31983b + (f13 == null ? 0 : f13.hashCode());
    }

    public String toString() {
        return "ColorBackgroundModel(type=" + this.type + ", colors=" + this.colors + ", opacity=" + this.opacity + ")";
    }

    public /* synthetic */ ColorBackgroundModel(int i13, ColorBackgroundType colorBackgroundType, List list, Float f13, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i13 & 1) == 0 ? ColorBackgroundType.RADIAL : colorBackgroundType;
        if ((i13 & 2) == 0) {
            this.colors = C25271y.f99162w;
        } else {
            this.colors = list;
        }
        if ((i13 & 4) == 0) {
            this.opacity = null;
        } else {
            this.opacity = f13;
        }
    }

    public ColorBackgroundModel(ColorBackgroundType type, List<ColorValueModel> colors, Float f13) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(colors, "colors");
        this.type = type;
        this.colors = colors;
        this.opacity = f13;
    }

    public /* synthetic */ ColorBackgroundModel(ColorBackgroundType colorBackgroundType, List list, Float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ColorBackgroundType.RADIAL : colorBackgroundType, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : f13);
    }
}
