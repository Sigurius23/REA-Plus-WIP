package cc;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import e93.AbstractC12889b;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p002a0.C0022g;

/* JADX INFO: renamed from: cc.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C4403j extends AbstractC4404k {

    /* JADX INFO: renamed from: a */
    public final Matrix f17767a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f17768b;

    /* JADX INFO: renamed from: c */
    public float f17769c;

    /* JADX INFO: renamed from: d */
    public float f17770d;

    /* JADX INFO: renamed from: e */
    public float f17771e;

    /* JADX INFO: renamed from: f */
    public float f17772f;

    /* JADX INFO: renamed from: g */
    public float f17773g;

    /* JADX INFO: renamed from: h */
    public float f17774h;

    /* JADX INFO: renamed from: i */
    public float f17775i;

    /* JADX INFO: renamed from: j */
    public final Matrix f17776j;

    /* JADX INFO: renamed from: k */
    public String f17777k;

    public C4403j() {
        this.f17767a = new Matrix();
        this.f17768b = new ArrayList();
        this.f17769c = 0.0f;
        this.f17770d = 0.0f;
        this.f17771e = 0.0f;
        this.f17772f = 1.0f;
        this.f17773g = 1.0f;
        this.f17774h = 0.0f;
        this.f17775i = 0.0f;
        this.f17776j = new Matrix();
        this.f17777k = null;
    }

    @Override // cc.AbstractC4404k
    /* JADX INFO: renamed from: a */
    public final boolean mo13820a() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f17768b;
            if (i13 >= arrayList.size()) {
                return false;
            }
            if (((AbstractC4404k) arrayList.get(i13)).mo13820a()) {
                return true;
            }
            i13++;
        }
    }

    @Override // cc.AbstractC4404k
    /* JADX INFO: renamed from: b */
    public final boolean mo13821b(int[] iArr) {
        int i13 = 0;
        boolean zMo13821b = false;
        while (true) {
            ArrayList arrayList = this.f17768b;
            if (i13 >= arrayList.size()) {
                return zMo13821b;
            }
            zMo13821b |= ((AbstractC4404k) arrayList.get(i13)).mo13821b(iArr);
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13823c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayM36252R = AbstractC12889b.m36252R(resources, theme, attributeSet, AbstractC4394a.f17739b);
        float f13 = this.f17769c;
        if (AbstractC12889b.m36246L(xmlPullParser, "rotation")) {
            f13 = typedArrayM36252R.getFloat(5, f13);
        }
        this.f17769c = f13;
        this.f17770d = typedArrayM36252R.getFloat(1, this.f17770d);
        this.f17771e = typedArrayM36252R.getFloat(2, this.f17771e);
        float f14 = this.f17772f;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
            f14 = typedArrayM36252R.getFloat(3, f14);
        }
        this.f17772f = f14;
        float f15 = this.f17773g;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
            f15 = typedArrayM36252R.getFloat(4, f15);
        }
        this.f17773g = f15;
        float f16 = this.f17774h;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
            f16 = typedArrayM36252R.getFloat(6, f16);
        }
        this.f17774h = f16;
        float f17 = this.f17775i;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
            f17 = typedArrayM36252R.getFloat(7, f17);
        }
        this.f17775i = f17;
        String string = typedArrayM36252R.getString(0);
        if (string != null) {
            this.f17777k = string;
        }
        m13824d();
        typedArrayM36252R.recycle();
    }

    /* JADX INFO: renamed from: d */
    public final void m13824d() {
        Matrix matrix = this.f17776j;
        matrix.reset();
        matrix.postTranslate(-this.f17770d, -this.f17771e);
        matrix.postScale(this.f17772f, this.f17773g);
        matrix.postRotate(this.f17769c, 0.0f, 0.0f);
        matrix.postTranslate(this.f17774h + this.f17770d, this.f17775i + this.f17771e);
    }

    public String getGroupName() {
        return this.f17777k;
    }

    public Matrix getLocalMatrix() {
        return this.f17776j;
    }

    public float getPivotX() {
        return this.f17770d;
    }

    public float getPivotY() {
        return this.f17771e;
    }

    public float getRotation() {
        return this.f17769c;
    }

    public float getScaleX() {
        return this.f17772f;
    }

    public float getScaleY() {
        return this.f17773g;
    }

    public float getTranslateX() {
        return this.f17774h;
    }

    public float getTranslateY() {
        return this.f17775i;
    }

    public void setPivotX(float f13) {
        if (f13 != this.f17770d) {
            this.f17770d = f13;
            m13824d();
        }
    }

    public void setPivotY(float f13) {
        if (f13 != this.f17771e) {
            this.f17771e = f13;
            m13824d();
        }
    }

    public void setRotation(float f13) {
        if (f13 != this.f17769c) {
            this.f17769c = f13;
            m13824d();
        }
    }

    public void setScaleX(float f13) {
        if (f13 != this.f17772f) {
            this.f17772f = f13;
            m13824d();
        }
    }

    public void setScaleY(float f13) {
        if (f13 != this.f17773g) {
            this.f17773g = f13;
            m13824d();
        }
    }

    public void setTranslateX(float f13) {
        if (f13 != this.f17774h) {
            this.f17774h = f13;
            m13824d();
        }
    }

    public void setTranslateY(float f13) {
        if (f13 != this.f17775i) {
            this.f17775i = f13;
            m13824d();
        }
    }

    public C4403j(C4403j c4403j, C0022g c0022g) {
        AbstractC4405l c4401h;
        this.f17767a = new Matrix();
        this.f17768b = new ArrayList();
        this.f17769c = 0.0f;
        this.f17770d = 0.0f;
        this.f17771e = 0.0f;
        this.f17772f = 1.0f;
        this.f17773g = 1.0f;
        this.f17774h = 0.0f;
        this.f17775i = 0.0f;
        Matrix matrix = new Matrix();
        this.f17776j = matrix;
        this.f17777k = null;
        this.f17769c = c4403j.f17769c;
        this.f17770d = c4403j.f17770d;
        this.f17771e = c4403j.f17771e;
        this.f17772f = c4403j.f17772f;
        this.f17773g = c4403j.f17773g;
        this.f17774h = c4403j.f17774h;
        this.f17775i = c4403j.f17775i;
        String str = c4403j.f17777k;
        this.f17777k = str;
        if (str != null) {
            c0022g.put(str, this);
        }
        matrix.set(c4403j.f17776j);
        ArrayList arrayList = c4403j.f17768b;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof C4403j) {
                this.f17768b.add(new C4403j((C4403j) obj, c0022g));
            } else {
                if (obj instanceof C4402i) {
                    C4402i c4402i = (C4402i) obj;
                    C4402i c4402i2 = new C4402i(c4402i);
                    c4402i2.f17757e = 0.0f;
                    c4402i2.f17759g = 1.0f;
                    c4402i2.f17760h = 1.0f;
                    c4402i2.f17761i = 0.0f;
                    c4402i2.f17762j = 1.0f;
                    c4402i2.f17763k = 0.0f;
                    c4402i2.f17764l = Paint.Cap.BUTT;
                    c4402i2.f17765m = Paint.Join.MITER;
                    c4402i2.f17766n = 4.0f;
                    c4402i2.f17756d = c4402i.f17756d;
                    c4402i2.f17757e = c4402i.f17757e;
                    c4402i2.f17759g = c4402i.f17759g;
                    c4402i2.f17758f = c4402i.f17758f;
                    c4402i2.f17780c = c4402i.f17780c;
                    c4402i2.f17760h = c4402i.f17760h;
                    c4402i2.f17761i = c4402i.f17761i;
                    c4402i2.f17762j = c4402i.f17762j;
                    c4402i2.f17763k = c4402i.f17763k;
                    c4402i2.f17764l = c4402i.f17764l;
                    c4402i2.f17765m = c4402i.f17765m;
                    c4402i2.f17766n = c4402i.f17766n;
                    c4401h = c4402i2;
                } else if (obj instanceof C4401h) {
                    c4401h = new C4401h((C4401h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f17768b.add(c4401h);
                Object obj2 = c4401h.f17779b;
                if (obj2 != null) {
                    c0022g.put(obj2, c4401h);
                }
            }
        }
    }
}
