package mq;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p257jq.AbstractC21885a;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: mq.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C25875c {

    /* JADX INFO: renamed from: a */
    public final C25874b f102053a;

    /* JADX INFO: renamed from: b */
    public final C25874b f102054b = new C25874b();

    /* JADX INFO: renamed from: c */
    public final float f102055c;

    /* JADX INFO: renamed from: d */
    public final float f102056d;

    /* JADX INFO: renamed from: e */
    public final float f102057e;

    /* JADX INFO: renamed from: f */
    public final float f102058f;

    /* JADX INFO: renamed from: g */
    public final float f102059g;

    /* JADX INFO: renamed from: h */
    public final float f102060h;

    /* JADX INFO: renamed from: i */
    public final int f102061i;

    /* JADX INFO: renamed from: j */
    public final int f102062j;

    /* JADX INFO: renamed from: k */
    public final int f102063k;

    public C25875c(Context context) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        C25874b c25874b = new C25874b();
        int i13 = c25874b.f102049w;
        if (i13 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i13);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e5) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i13));
                notFoundException.initCause(e5);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(context, attributeSet, AbstractC21885a.f84543c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f102055c = typedArrayM29873g.getDimensionPixelSize(4, -1);
        this.f102061i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f102062j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f102056d = typedArrayM29873g.getDimensionPixelSize(14, -1);
        this.f102057e = typedArrayM29873g.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f102059g = typedArrayM29873g.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f102058f = typedArrayM29873g.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f102060h = typedArrayM29873g.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f102063k = typedArrayM29873g.getInt(24, 1);
        C25874b c25874b2 = this.f102054b;
        int i14 = c25874b.f102027I;
        c25874b2.f102027I = i14 == -2 ? 255 : i14;
        int i15 = c25874b.f102029K;
        if (i15 != -2) {
            c25874b2.f102029K = i15;
        } else if (typedArrayM29873g.hasValue(23)) {
            this.f102054b.f102029K = typedArrayM29873g.getInt(23, 0);
        } else {
            this.f102054b.f102029K = -1;
        }
        String str = c25874b.f102028J;
        if (str != null) {
            this.f102054b.f102028J = str;
        } else if (typedArrayM29873g.hasValue(7)) {
            this.f102054b.f102028J = typedArrayM29873g.getString(7);
        }
        C25874b c25874b3 = this.f102054b;
        c25874b3.f102033O = c25874b.f102033O;
        CharSequence charSequence = c25874b.f102034P;
        c25874b3.f102034P = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C25874b c25874b4 = this.f102054b;
        int i16 = c25874b.f102035Q;
        c25874b4.f102035Q = i16 == 0 ? R.plurals.mtrl_badge_content_description : i16;
        int i17 = c25874b.f102036R;
        c25874b4.f102036R = i17 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i17;
        Boolean bool = c25874b.f102038T;
        c25874b4.f102038T = Boolean.valueOf(bool == null || bool.booleanValue());
        C25874b c25874b5 = this.f102054b;
        int i18 = c25874b.f102030L;
        c25874b5.f102030L = i18 == -2 ? typedArrayM29873g.getInt(21, -2) : i18;
        C25874b c25874b6 = this.f102054b;
        int i19 = c25874b.f102031M;
        c25874b6.f102031M = i19 == -2 ? typedArrayM29873g.getInt(22, -2) : i19;
        C25874b c25874b7 = this.f102054b;
        Integer num = c25874b.f102023E;
        c25874b7.f102023E = Integer.valueOf(num == null ? typedArrayM29873g.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C25874b c25874b8 = this.f102054b;
        Integer num2 = c25874b.f102024F;
        c25874b8.f102024F = Integer.valueOf(num2 == null ? typedArrayM29873g.getResourceId(6, 0) : num2.intValue());
        C25874b c25874b9 = this.f102054b;
        Integer num3 = c25874b.f102025G;
        c25874b9.f102025G = Integer.valueOf(num3 == null ? typedArrayM29873g.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C25874b c25874b10 = this.f102054b;
        Integer num4 = c25874b.f102026H;
        c25874b10.f102026H = Integer.valueOf(num4 == null ? typedArrayM29873g.getResourceId(16, 0) : num4.intValue());
        C25874b c25874b11 = this.f102054b;
        Integer num5 = c25874b.f102050x;
        c25874b11.f102050x = Integer.valueOf(num5 == null ? AbstractC22674j.m65695C(typedArrayM29873g, context, 1).getDefaultColor() : num5.intValue());
        C25874b c25874b12 = this.f102054b;
        Integer num6 = c25874b.f102052z;
        c25874b12.f102052z = Integer.valueOf(num6 == null ? typedArrayM29873g.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c25874b.f102051y;
        if (num7 != null) {
            this.f102054b.f102051y = num7;
        } else if (typedArrayM29873g.hasValue(9)) {
            this.f102054b.f102051y = Integer.valueOf(AbstractC22674j.m65695C(typedArrayM29873g, context, 9).getDefaultColor());
        } else {
            int iIntValue = this.f102054b.f102052z.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, AbstractC21885a.f84537N);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListM65695C = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 3);
            AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 4);
            AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i24 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i24, 0);
            typedArrayObtainStyledAttributes.getString(i24);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, AbstractC21885a.f84525B);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f102054b.f102051y = Integer.valueOf(colorStateListM65695C.getDefaultColor());
        }
        C25874b c25874b13 = this.f102054b;
        Integer num8 = c25874b.f102037S;
        c25874b13.f102037S = Integer.valueOf(num8 == null ? typedArrayM29873g.getInt(2, 8388661) : num8.intValue());
        C25874b c25874b14 = this.f102054b;
        Integer num9 = c25874b.f102039U;
        c25874b14.f102039U = Integer.valueOf(num9 == null ? typedArrayM29873g.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C25874b c25874b15 = this.f102054b;
        Integer num10 = c25874b.f102040V;
        c25874b15.f102040V = Integer.valueOf(num10 == null ? typedArrayM29873g.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C25874b c25874b16 = this.f102054b;
        Integer num11 = c25874b.f102041W;
        c25874b16.f102041W = Integer.valueOf(num11 == null ? typedArrayM29873g.getDimensionPixelOffset(18, 0) : num11.intValue());
        C25874b c25874b17 = this.f102054b;
        Integer num12 = c25874b.f102042X;
        c25874b17.f102042X = Integer.valueOf(num12 == null ? typedArrayM29873g.getDimensionPixelOffset(25, 0) : num12.intValue());
        C25874b c25874b18 = this.f102054b;
        Integer num13 = c25874b.f102043Y;
        c25874b18.f102043Y = Integer.valueOf(num13 == null ? typedArrayM29873g.getDimensionPixelOffset(19, c25874b18.f102041W.intValue()) : num13.intValue());
        C25874b c25874b19 = this.f102054b;
        Integer num14 = c25874b.f102044Z;
        c25874b19.f102044Z = Integer.valueOf(num14 == null ? typedArrayM29873g.getDimensionPixelOffset(26, c25874b19.f102042X.intValue()) : num14.intValue());
        C25874b c25874b20 = this.f102054b;
        Integer num15 = c25874b.f102047c0;
        c25874b20.f102047c0 = Integer.valueOf(num15 == null ? typedArrayM29873g.getDimensionPixelOffset(20, 0) : num15.intValue());
        C25874b c25874b21 = this.f102054b;
        Integer num16 = c25874b.f102045a0;
        c25874b21.f102045a0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C25874b c25874b22 = this.f102054b;
        Integer num17 = c25874b.f102046b0;
        c25874b22.f102046b0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C25874b c25874b23 = this.f102054b;
        Boolean bool2 = c25874b.f102048d0;
        c25874b23.f102048d0 = Boolean.valueOf(bool2 == null ? typedArrayM29873g.getBoolean(0, false) : bool2.booleanValue());
        typedArrayM29873g.recycle();
        Locale locale = c25874b.f102032N;
        if (locale == null) {
            this.f102054b.f102032N = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f102054b.f102032N = locale;
        }
        this.f102053a = c25874b;
    }
}
