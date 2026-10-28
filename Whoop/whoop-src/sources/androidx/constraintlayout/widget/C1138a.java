package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C1138a {

    /* JADX INFO: renamed from: a */
    public boolean f4997a = false;

    /* JADX INFO: renamed from: b */
    public int f4998b;

    /* JADX INFO: renamed from: c */
    public int f4999c;

    /* JADX INFO: renamed from: d */
    public float f5000d;

    /* JADX INFO: renamed from: e */
    public String f5001e;

    /* JADX INFO: renamed from: f */
    public boolean f5002f;

    /* JADX INFO: renamed from: g */
    public int f5003g;

    public C1138a(C1138a c1138a, Object obj) {
        c1138a.getClass();
        this.f4998b = c1138a.f4998b;
        m3614b(obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m3613a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1156s.f5226d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i13 = 0;
        boolean z4 = false;
        Object objValueOf = null;
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            int i15 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z4 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i13 = 6;
            } else {
                int i16 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i16 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i16 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i13 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i15 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i13 = i15;
                            }
                        }
                        i13 = 7;
                    }
                }
                i13 = i16;
            }
        }
        if (string != null && objValueOf != null) {
            C1138a c1138a = new C1138a();
            c1138a.f4998b = i13;
            c1138a.f4997a = z4;
            c1138a.m3614b(objValueOf);
            map.put(string, c1138a);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m3614b(Object obj) {
        switch (AbstractC12682p.m35485e(this.f4998b)) {
            case 0:
            case 7:
                this.f4999c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f5000d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f5003g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f5001e = (String) obj;
                break;
            case 5:
                this.f5002f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f5000d = ((Float) obj).floatValue();
                break;
        }
    }
}
