package cc;

import ae3.C0803k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import e93.AbstractC12889b;
import org.xmlpull.v1.XmlPullParser;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: cc.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C4402i extends AbstractC4405l {

    /* JADX INFO: renamed from: d */
    public C0803k f17756d;

    /* JADX INFO: renamed from: f */
    public C0803k f17758f;

    /* JADX INFO: renamed from: e */
    public float f17757e = 0.0f;

    /* JADX INFO: renamed from: g */
    public float f17759g = 1.0f;

    /* JADX INFO: renamed from: h */
    public float f17760h = 1.0f;

    /* JADX INFO: renamed from: i */
    public float f17761i = 0.0f;

    /* JADX INFO: renamed from: j */
    public float f17762j = 1.0f;

    /* JADX INFO: renamed from: k */
    public float f17763k = 0.0f;

    /* JADX INFO: renamed from: l */
    public Paint.Cap f17764l = Paint.Cap.BUTT;

    /* JADX INFO: renamed from: m */
    public Paint.Join f17765m = Paint.Join.MITER;

    /* JADX INFO: renamed from: n */
    public float f17766n = 4.0f;

    @Override // cc.AbstractC4404k
    /* JADX INFO: renamed from: a */
    public final boolean mo13820a() {
        return this.f17758f.m1947e() || this.f17756d.m1947e();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // cc.AbstractC4404k
    /* JADX INFO: renamed from: b */
    public final boolean mo13821b(int[] iArr) {
        boolean z4;
        C0803k c0803k = this.f17758f;
        boolean z13 = true;
        if (c0803k.m1947e()) {
            ColorStateList colorStateList = (ColorStateList) c0803k.f2966d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0803k.f2964b) {
                c0803k.f2964b = colorForState;
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        C0803k c0803k2 = this.f17756d;
        if (c0803k2.m1947e()) {
            ColorStateList colorStateList2 = (ColorStateList) c0803k2.f2966d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0803k2.f2964b) {
                c0803k2.f2964b = colorForState2;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        return z4 | z13;
    }

    /* JADX INFO: renamed from: c */
    public final void m13822c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayM36252R = AbstractC12889b.m36252R(resources, theme, attributeSet, AbstractC4394a.f17740c);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String string = typedArrayM36252R.getString(0);
            if (string != null) {
                this.f17779b = string;
            }
            String string2 = typedArrayM36252R.getString(2);
            if (string2 != null) {
                this.f17778a = AbstractC31484o.m96964p(string2);
            }
            this.f17758f = AbstractC12889b.m36243I(typedArrayM36252R, xmlPullParser, theme, "fillColor", 1);
            float f13 = this.f17760h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                f13 = typedArrayM36252R.getFloat(12, f13);
            }
            this.f17760h = f13;
            int i13 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM36252R.getInt(8, -1) : -1;
            Paint.Cap cap = this.f17764l;
            if (i13 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i13 == 1) {
                cap = Paint.Cap.ROUND;
            } else if (i13 == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.f17764l = cap;
            int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM36252R.getInt(9, -1) : -1;
            Paint.Join join = this.f17765m;
            if (i14 == 0) {
                join = Paint.Join.MITER;
            } else if (i14 == 1) {
                join = Paint.Join.ROUND;
            } else if (i14 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.f17765m = join;
            float f14 = this.f17766n;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                f14 = typedArrayM36252R.getFloat(10, f14);
            }
            this.f17766n = f14;
            this.f17756d = AbstractC12889b.m36243I(typedArrayM36252R, xmlPullParser, theme, "strokeColor", 3);
            float f15 = this.f17759g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                f15 = typedArrayM36252R.getFloat(11, f15);
            }
            this.f17759g = f15;
            float f16 = this.f17757e;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                f16 = typedArrayM36252R.getFloat(4, f16);
            }
            this.f17757e = f16;
            float f17 = this.f17762j;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                f17 = typedArrayM36252R.getFloat(6, f17);
            }
            this.f17762j = f17;
            float f18 = this.f17763k;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                f18 = typedArrayM36252R.getFloat(7, f18);
            }
            this.f17763k = f18;
            float f19 = this.f17761i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                f19 = typedArrayM36252R.getFloat(5, f19);
            }
            this.f17761i = f19;
            int i15 = this.f17780c;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                i15 = typedArrayM36252R.getInt(13, i15);
            }
            this.f17780c = i15;
        }
        typedArrayM36252R.recycle();
    }

    public float getFillAlpha() {
        return this.f17760h;
    }

    public int getFillColor() {
        return this.f17758f.f2964b;
    }

    public float getStrokeAlpha() {
        return this.f17759g;
    }

    public int getStrokeColor() {
        return this.f17756d.f2964b;
    }

    public float getStrokeWidth() {
        return this.f17757e;
    }

    public float getTrimPathEnd() {
        return this.f17762j;
    }

    public float getTrimPathOffset() {
        return this.f17763k;
    }

    public float getTrimPathStart() {
        return this.f17761i;
    }

    public void setFillAlpha(float f13) {
        this.f17760h = f13;
    }

    public void setFillColor(int i13) {
        this.f17758f.f2964b = i13;
    }

    public void setStrokeAlpha(float f13) {
        this.f17759g = f13;
    }

    public void setStrokeColor(int i13) {
        this.f17756d.f2964b = i13;
    }

    public void setStrokeWidth(float f13) {
        this.f17757e = f13;
    }

    public void setTrimPathEnd(float f13) {
        this.f17762j = f13;
    }

    public void setTrimPathOffset(float f13) {
        this.f17763k = f13;
    }

    public void setTrimPathStart(float f13) {
        this.f17761i = f13;
    }
}
