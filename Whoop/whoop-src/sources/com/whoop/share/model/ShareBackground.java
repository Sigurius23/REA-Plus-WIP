package com.whoop.share.model;

import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.models.colortheme.ColorThemeModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002*+B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/share/model/ShareBackground;", "", "", "type", "style", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "colors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$share_release", "(Lcom/whoop/share/model/ShareBackground;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/colortheme/ColorThemeModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;)Lcom/whoop/share/model/ShareBackground;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getStyle", "Lcom/whoop/design/models/colortheme/ColorThemeModel;", "getColors", "Companion", "$serializer", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShareBackground {
    private final ColorThemeModel colors;
    private final String style;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ColorThemeModel.$stable;
    private static final ShareBackground none = new ShareBackground("NONE", (String) null, (ColorThemeModel) null, 6, (DefaultConstructorMarker) null);

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/share/model/ShareBackground$Companion;", "", "<init>", "()V", "Lcom/whoop/share/model/RadialGradientStyle;", "style", "Lcom/whoop/share/model/ShareBackground;", "radialGradient", "(Lcom/whoop/share/model/RadialGradientStyle;)Lcom/whoop/share/model/ShareBackground;", "Lwc3/c;", "serializer", "()Lwc3/c;", "none", "Lcom/whoop/share/model/ShareBackground;", "getNone", "()Lcom/whoop/share/model/ShareBackground;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ShareBackground getNone() {
            return ShareBackground.none;
        }

        public final ShareBackground radialGradient(RadialGradientStyle style) {
            AbstractC22676k.m65750j(style, "style");
            return new ShareBackground("RADIAL_GRADIENT", style.name(), (ColorThemeModel) null, 4, (DefaultConstructorMarker) null);
        }

        public final InterfaceC37138c serializer() {
            return ShareBackground$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShareBackground() {
        this((String) null, (String) null, (ColorThemeModel) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShareBackground copy$default(ShareBackground shareBackground, String str, String str2, ColorThemeModel colorThemeModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shareBackground.type;
        }
        if ((i13 & 2) != 0) {
            str2 = shareBackground.style;
        }
        if ((i13 & 4) != 0) {
            colorThemeModel = shareBackground.colors;
        }
        return shareBackground.copy(str, str2, colorThemeModel);
    }

    public static final /* synthetic */ void write$Self$share_release(ShareBackground self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.type, "NONE")) {
            output.encodeStringElement(serialDesc, 0, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.style);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.colors == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, ColorThemeModel$$serializer.INSTANCE, self.colors);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ColorThemeModel getColors() {
        return this.colors;
    }

    public final ShareBackground copy(String type, String style, ColorThemeModel colors) {
        AbstractC22676k.m65750j(type, "type");
        return new ShareBackground(type, style, colors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareBackground)) {
            return false;
        }
        ShareBackground shareBackground = (ShareBackground) other;
        return AbstractC22676k.m65745e(this.type, shareBackground.type) && AbstractC22676k.m65745e(this.style, shareBackground.style) && AbstractC22676k.m65745e(this.colors, shareBackground.colors);
    }

    public final ColorThemeModel getColors() {
        return this.colors;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.style;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ColorThemeModel colorThemeModel = this.colors;
        return iHashCode2 + (colorThemeModel != null ? colorThemeModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.style;
        ColorThemeModel colorThemeModel = this.colors;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShareBackground(type=", str, ", style=", str2, ", colors=");
        sbM32001t.append(colorThemeModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ShareBackground(int i13, String str, String str2, ColorThemeModel colorThemeModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i13 & 1) == 0 ? "NONE" : str;
        if ((i13 & 2) == 0) {
            this.style = null;
        } else {
            this.style = str2;
        }
        if ((i13 & 4) == 0) {
            this.colors = null;
        } else {
            this.colors = colorThemeModel;
        }
    }

    public ShareBackground(String type, String str, ColorThemeModel colorThemeModel) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.style = str;
        this.colors = colorThemeModel;
    }

    public /* synthetic */ ShareBackground(String str, String str2, ColorThemeModel colorThemeModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "NONE" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : colorThemeModel);
    }
}
