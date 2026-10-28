package com.whoop.design.models.colortheme;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/design/models/colortheme/ColorThemeModel;", "", "Lcom/whoop/design/models/colortheme/ColorValueModel;", "accentColor", "Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "background", "<init>", "(Lcom/whoop/design/models/colortheme/ColorValueModel;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/colortheme/ColorValueModel;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/colortheme/ColorThemeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/colortheme/ColorValueModel;", "component2", "()Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "copy", "(Lcom/whoop/design/models/colortheme/ColorValueModel;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lcom/whoop/design/models/colortheme/ColorThemeModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/colortheme/ColorValueModel;", "getAccentColor", "Lcom/whoop/design/models/colortheme/ColorBackgroundModel;", "getBackground", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ColorThemeModel {
    private final ColorValueModel accentColor;
    private final ColorBackgroundModel background;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/colortheme/ColorThemeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ColorThemeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ColorThemeModel() {
        this((ColorValueModel) null, (ColorBackgroundModel) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ColorThemeModel copy$default(ColorThemeModel colorThemeModel, ColorValueModel colorValueModel, ColorBackgroundModel colorBackgroundModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            colorValueModel = colorThemeModel.accentColor;
        }
        if ((i13 & 2) != 0) {
            colorBackgroundModel = colorThemeModel.background;
        }
        return colorThemeModel.copy(colorValueModel, colorBackgroundModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ColorThemeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.accentColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ColorValueModel$$serializer.INSTANCE, self.accentColor);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.background == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, ColorBackgroundModel$$serializer.INSTANCE, self.background);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ColorValueModel getAccentColor() {
        return this.accentColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ColorBackgroundModel getBackground() {
        return this.background;
    }

    public final ColorThemeModel copy(ColorValueModel accentColor, ColorBackgroundModel background) {
        return new ColorThemeModel(accentColor, background);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorThemeModel)) {
            return false;
        }
        ColorThemeModel colorThemeModel = (ColorThemeModel) other;
        return AbstractC22676k.m65745e(this.accentColor, colorThemeModel.accentColor) && AbstractC22676k.m65745e(this.background, colorThemeModel.background);
    }

    public final ColorValueModel getAccentColor() {
        return this.accentColor;
    }

    public final ColorBackgroundModel getBackground() {
        return this.background;
    }

    public int hashCode() {
        ColorValueModel colorValueModel = this.accentColor;
        int iHashCode = (colorValueModel == null ? 0 : colorValueModel.hashCode()) * 31;
        ColorBackgroundModel colorBackgroundModel = this.background;
        return iHashCode + (colorBackgroundModel != null ? colorBackgroundModel.hashCode() : 0);
    }

    public String toString() {
        return "ColorThemeModel(accentColor=" + this.accentColor + ", background=" + this.background + ")";
    }

    public /* synthetic */ ColorThemeModel(int i13, ColorValueModel colorValueModel, ColorBackgroundModel colorBackgroundModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.accentColor = null;
        } else {
            this.accentColor = colorValueModel;
        }
        if ((i13 & 2) == 0) {
            this.background = null;
        } else {
            this.background = colorBackgroundModel;
        }
    }

    public ColorThemeModel(ColorValueModel colorValueModel, ColorBackgroundModel colorBackgroundModel) {
        this.accentColor = colorValueModel;
        this.background = colorBackgroundModel;
    }

    public /* synthetic */ ColorThemeModel(ColorValueModel colorValueModel, ColorBackgroundModel colorBackgroundModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : colorValueModel, (i13 & 2) != 0 ? null : colorBackgroundModel);
    }
}
