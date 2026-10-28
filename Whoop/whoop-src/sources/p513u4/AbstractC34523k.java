package p513u4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p002a0.C0005a0;
import p543v4.AbstractC35646e;

/* JADX INFO: renamed from: u4.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34523k {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f145117a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f145118b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f145119c = new Object();

    /* JADX INFO: renamed from: a */
    public static float m109097a(Resources resources, int i13) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC34520h.m109095a(resources, i13);
        }
        ThreadLocal threadLocal = f145117a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i13, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i13) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m109098b(Context context, int i13) {
        if (context.isRestricted()) {
            return null;
        }
        return m109099c(context, i13, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX INFO: renamed from: c */
    public static Typeface m109099c(Context context, int i13, TypedValue typedValue, int i14, AbstractC34514b abstractC34514b, boolean z4, boolean z13) {
        Resources resources = context.getResources();
        resources.getValue(i13, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i13) + "\" (" + Integer.toHexString(i13) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM112845a = null;
        if (string.startsWith("res/")) {
            int i15 = typedValue.assetCookie;
            C0005a0 c0005a0 = AbstractC35646e.f151457b;
            Typeface typeface = (Typeface) c0005a0.m2c(AbstractC35646e.m112846b(resources, i13, string, i15, i14));
            if (typeface != null) {
                if (abstractC34514b != null) {
                    abstractC34514b.m109080b(typeface);
                }
                typefaceM112845a = typeface;
            } else if (!z13) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC34516d interfaceC34516dM109074l = AbstractC34514b.m109074l(resources.getXml(i13), resources);
                        if (interfaceC34516dM109074l == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC34514b != null) {
                                abstractC34514b.m109079a(-3);
                            }
                        } else {
                            typefaceM112845a = AbstractC35646e.m112845a(context, interfaceC34516dM109074l, resources, i13, string, typedValue.assetCookie, i14, abstractC34514b, z4);
                        }
                    } else {
                        int i16 = typedValue.assetCookie;
                        Typeface typefaceMo107900p = AbstractC35646e.f151456a.mo107900p(context, resources, i13, string, i14);
                        if (typefaceMo107900p != null) {
                            c0005a0.m3d(AbstractC35646e.m112846b(resources, i13, string, i16, i14), typefaceMo107900p);
                        }
                        if (abstractC34514b != null) {
                            if (typefaceMo107900p != null) {
                                abstractC34514b.m109080b(typefaceMo107900p);
                            } else {
                                abstractC34514b.m109079a(-3);
                            }
                        }
                        typefaceM112845a = typefaceMo107900p;
                    }
                } catch (IOException e5) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e5);
                    if (abstractC34514b != null) {
                        abstractC34514b.m109079a(-3);
                    }
                } catch (XmlPullParserException e13) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e13);
                    if (abstractC34514b != null) {
                        abstractC34514b.m109079a(-3);
                    }
                }
            }
        } else if (abstractC34514b != null) {
            abstractC34514b.m109079a(-3);
        }
        if (typefaceM112845a != null || abstractC34514b != null || z13) {
            return typefaceM112845a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i13) + " could not be retrieved.");
    }
}
