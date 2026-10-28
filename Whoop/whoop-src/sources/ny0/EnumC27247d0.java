package ny0;

import ge3.AbstractC15751g;
import p132f0.C13825t;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import p747z81.Function1;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: ny0.d0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0018\u0010\u000fj\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m65681d2 = {"Lny0/d0;", "", "", "padding", "canvasSize", "toggleSize", "Lf0/t;", "borderStroke", "Ly81/f;", "textColor", "textSpacing", "<init>", "(Ljava/lang/String;IFFFLf0/t;Ly81/f;F)V", "F", "getPadding", "()F", "getCanvasSize", "getToggleSize", "Lf0/t;", "getBorderStroke", "()Lf0/t;", "Ly81/f;", "getTextColor", "()Ly81/f;", "getTextSpacing", "DEFAULT", "COMPACT", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC27247d0 {
    DEFAULT(1.0f, 7.5f, 2.0f, Function1.m128938q().getStroke2Dp(), EnumC39333f.WHITE_70, 3.0f),
    COMPACT(0.0f, 5.5f, 1.5f, Function1.m128938q().getStroke5Dp(), EnumC39333f.BRAND_WHITE, 2.0f);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final C13825t borderStroke;
    private final float canvasSize;
    private final float padding;
    private final EnumC39333f textColor;
    private final float textSpacing;
    private final float toggleSize;

    EnumC27247d0(float f13, float f14, float f15, C13825t c13825t, EnumC39333f enumC39333f, float f16) {
        this.padding = f13;
        this.canvasSize = f14;
        this.toggleSize = f15;
        this.borderStroke = c13825t;
        this.textColor = enumC39333f;
        this.textSpacing = f16;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final C13825t getBorderStroke() {
        return this.borderStroke;
    }

    public final float getCanvasSize() {
        return this.canvasSize;
    }

    public final float getPadding() {
        return this.padding;
    }

    public final EnumC39333f getTextColor() {
        return this.textColor;
    }

    public final float getTextSpacing() {
        return this.textSpacing;
    }

    public final float getToggleSize() {
        return this.toggleSize;
    }
}
