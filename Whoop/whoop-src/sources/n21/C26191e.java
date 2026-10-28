package n21;

import androidx.compose.p018ui.Modifier;
import b91.EnumC2888c;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import l83.C23454a0;
import mx1.C26009o;
import p000.AbstractC30802r;
import p026b2.C2314t;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: n21.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jn\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u00107R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b+\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, m65681d2 = {"Ln21/e;", "Lm91/u;", "Landroidx/compose/ui/Modifier;", "modifier", "Li91/a;", "legendColor", "Lcom/whoop/design/util/TextResource;", "legendText", "Ln21/i;", "shape", "Lgz0/m0;", "icon", "Ly81/f;", "textColor", "Lkotlin/Function1;", "", "Ll83/a0;", "onTextOverflow", "Lb91/c;", "legendTextStyle", "<init>", "(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;)V", "c", "(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;)Ln21/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "j", "()Landroidx/compose/ui/Modifier;", "b", "Li91/a;", "g", "()Li91/a;", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "d", "Ln21/i;", "l", "()Ln21/i;", "e", "Lgz0/m0;", "f", "()Lgz0/m0;", "Ly81/f;", "m", "()Ly81/f;", "Lkotlin/jvm/functions/Function1;", "k", "()Lkotlin/jvm/functions/Function1;", "Lb91/c;", "i", "()Lb91/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26191e implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f103877i = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Modifier modifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC18247a legendColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource legendText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC26195i shape;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f textColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1 onTextOverflow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC2888c legendTextStyle;

    public C26191e(Modifier modifier, AbstractC18247a legendColor, TextResource legendText, EnumC26195i shape, EnumC16313m0 enumC16313m0, EnumC39333f textColor, Function1 onTextOverflow, EnumC2888c legendTextStyle) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(legendColor, "legendColor");
        AbstractC22676k.m65750j(legendText, "legendText");
        AbstractC22676k.m65750j(shape, "shape");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(onTextOverflow, "onTextOverflow");
        AbstractC22676k.m65750j(legendTextStyle, "legendTextStyle");
        this.modifier = modifier;
        this.legendColor = legendColor;
        this.legendText = legendText;
        this.shape = shape;
        this.icon = enumC16313m0;
        this.textColor = textColor;
        this.onTextOverflow = onTextOverflow;
        this.legendTextStyle = legendTextStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m77753b(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C26191e m77754e(C26191e c26191e, Modifier modifier, AbstractC18247a abstractC18247a, TextResource textResource, EnumC26195i enumC26195i, EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f, Function1 function1, EnumC2888c enumC2888c, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            modifier = c26191e.modifier;
        }
        if ((i13 & 2) != 0) {
            abstractC18247a = c26191e.legendColor;
        }
        if ((i13 & 4) != 0) {
            textResource = c26191e.legendText;
        }
        if ((i13 & 8) != 0) {
            enumC26195i = c26191e.shape;
        }
        if ((i13 & 16) != 0) {
            enumC16313m0 = c26191e.icon;
        }
        if ((i13 & 32) != 0) {
            enumC39333f = c26191e.textColor;
        }
        if ((i13 & 64) != 0) {
            function1 = c26191e.onTextOverflow;
        }
        if ((i13 & 128) != 0) {
            enumC2888c = c26191e.legendTextStyle;
        }
        Function1 function2 = function1;
        EnumC2888c enumC2888c2 = enumC2888c;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        EnumC39333f enumC39333f2 = enumC39333f;
        return c26191e.m77755c(modifier, abstractC18247a, textResource, enumC26195i, enumC16313m1, enumC39333f2, function2, enumC2888c2);
    }

    /* JADX INFO: renamed from: c */
    public final C26191e m77755c(Modifier modifier, AbstractC18247a legendColor, TextResource legendText, EnumC26195i shape, EnumC16313m0 icon, EnumC39333f textColor, Function1 onTextOverflow, EnumC2888c legendTextStyle) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(legendColor, "legendColor");
        AbstractC22676k.m65750j(legendText, "legendText");
        AbstractC22676k.m65750j(shape, "shape");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(onTextOverflow, "onTextOverflow");
        AbstractC22676k.m65750j(legendTextStyle, "legendTextStyle");
        return new C26191e(modifier, legendColor, legendText, shape, icon, textColor, onTextOverflow, legendTextStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26191e)) {
            return false;
        }
        C26191e c26191e = (C26191e) other;
        return AbstractC22676k.m65745e(this.modifier, c26191e.modifier) && AbstractC22676k.m65745e(this.legendColor, c26191e.legendColor) && AbstractC22676k.m65745e(this.legendText, c26191e.legendText) && this.shape == c26191e.shape && this.icon == c26191e.icon && this.textColor == c26191e.textColor && AbstractC22676k.m65745e(this.onTextOverflow, c26191e.onTextOverflow) && this.legendTextStyle == c26191e.legendTextStyle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC18247a getLegendColor() {
        return this.legendColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getLegendText() {
        return this.legendText;
    }

    public int hashCode() {
        int iHashCode = (this.shape.hashCode() + AbstractC31061c.m95625a((this.legendColor.hashCode() + (this.modifier.hashCode() * 31)) * 31, this.legendText, 31)) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return this.legendTextStyle.hashCode() + AbstractC30802r.m94756e(this.onTextOverflow, AbstractC21702c.m61132c(this.textColor, (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC2888c getLegendTextStyle() {
        return this.legendTextStyle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Function1 getOnTextOverflow() {
        return this.onTextOverflow;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC26195i getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC39333f getTextColor() {
        return this.textColor;
    }

    public String toString() {
        return "LegendState(modifier=" + this.modifier + ", legendColor=" + this.legendColor + ", legendText=" + this.legendText + ", shape=" + this.shape + ", icon=" + this.icon + ", textColor=" + this.textColor + ", onTextOverflow=" + this.onTextOverflow + ", legendTextStyle=" + this.legendTextStyle + ")";
    }

    public /* synthetic */ C26191e(Modifier modifier, AbstractC18247a abstractC18247a, TextResource textResource, EnumC26195i enumC26195i, EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f, Function1 function1, EnumC2888c enumC2888c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C2314t.f9131w : modifier, abstractC18247a, textResource, (i13 & 8) != 0 ? EnumC26195i.CIRCLE : enumC26195i, (i13 & 16) != 0 ? null : enumC16313m0, (i13 & 32) != 0 ? EnumC39333f.WHITE_20 : enumC39333f, (i13 & 64) != 0 ? new C26009o(12) : function1, (i13 & 128) != 0 ? EnumC2888c.H5 : enumC2888c);
    }
}
