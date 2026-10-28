package cc;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e93.AbstractC12889b;
import org.xmlpull.v1.XmlPullParser;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: cc.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C4401h extends AbstractC4405l {
    /* JADX INFO: renamed from: c */
    public final void m13819c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            TypedArray typedArrayM36252R = AbstractC12889b.m36252R(resources, theme, attributeSet, AbstractC4394a.f17741d);
            String string = typedArrayM36252R.getString(0);
            if (string != null) {
                this.f17779b = string;
            }
            String string2 = typedArrayM36252R.getString(1);
            if (string2 != null) {
                this.f17778a = AbstractC31484o.m96964p(string2);
            }
            this.f17780c = AbstractC12889b.m36246L(xmlPullParser, "fillType") ? typedArrayM36252R.getInt(2, 0) : 0;
            typedArrayM36252R.recycle();
        }
    }
}
