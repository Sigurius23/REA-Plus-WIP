package ae3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.app.FrameMetricsAggregator;
import bd3.C3139r;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import eg.C13162k;
import io.sentry.android.core.util.C20162a;
import java.io.IOException;
import java.util.Arrays;
import m83.AbstractC25260n;
import org.xmlpull.v1.XmlPullParserException;
import p148fg.C14441k;
import p148fg.InterfaceC14444n;
import p513u4.AbstractC34514b;
import p513u4.AbstractC34515c;
import p526ul.AbstractC35057c;
import p561vt.C36481b;
import p715kotlin.jvm.internal.AbstractC22676k;
import u93.C34671d0;
import ud3.EnumC34828m0;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ae3.k */
/* JADX INFO: loaded from: classes5.dex */
public class C0803k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2963a;

    /* JADX INFO: renamed from: b */
    public int f2964b;

    /* JADX INFO: renamed from: c */
    public Object f2965c;

    /* JADX INFO: renamed from: d */
    public Object f2966d;

    public /* synthetic */ C0803k(int i13) {
        this.f2963a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static C0803k m1943b(Resources resources, int i13, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i13);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return new C0803k(AbstractC34514b.m109067c(resources, xml, attributeSetAsAttributeSet, theme), (ColorStateList) null, 0);
        }
        if (name.equals("selector")) {
            ColorStateList colorStateListM109082b = AbstractC34515c.m109082b(resources, xml, attributeSetAsAttributeSet, theme);
            return new C0803k((Shader) null, colorStateListM109082b, colorStateListM109082b.getDefaultColor());
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: a */
    public C36481b m1944a() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        return new C36481b(this.f2964b, (String) this.f2966d, ((Long) this.f2965c).longValue());
    }

    /* JADX INFO: renamed from: c */
    public String m1945c() {
        StringBuilder sb4 = new StringBuilder("$");
        int i13 = this.f2964b + 1;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = ((Object[]) this.f2965c)[i14];
            if (obj instanceof InterfaceC39443g) {
                InterfaceC39443g interfaceC39443g = (InterfaceC39443g) obj;
                if (!AbstractC22676k.m65745e(interfaceC39443g.getKind(), C39448l.f169714b)) {
                    int i15 = ((int[]) this.f2966d)[i14];
                    if (i15 >= 0) {
                        sb4.append(".");
                        sb4.append(interfaceC39443g.getElementName(i15));
                    }
                } else if (((int[]) this.f2966d)[i14] != -1) {
                    sb4.append("[");
                    sb4.append(((int[]) this.f2966d)[i14]);
                    sb4.append("]");
                }
            } else if (obj != C3139r.f12298a) {
                sb4.append("['");
                sb4.append(obj);
                sb4.append("']");
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: d */
    public void m1946d(int i13, int i14, int i15, int i16, int i17, int i18, boolean z4, boolean z13) {
        long[] jArr = (long[]) this.f2965c;
        int i19 = this.f2964b;
        int i24 = i19 + 3;
        this.f2964b = i24;
        int length = jArr.length;
        if (length <= i24) {
            int iMax = Math.max(length * 2, i24);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            AbstractC22676k.m65749i(jArrCopyOf, "copyOf(...)");
            this.f2965c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.f2966d, iMax);
            AbstractC22676k.m65749i(jArrCopyOf2, "copyOf(...)");
            this.f2966d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.f2965c;
        jArr2[i19] = (((long) i14) << 32) | (((long) i15) & 4294967295L);
        jArr2[i19 + 1] = (((long) i16) << 32) | (((long) i17) & 4294967295L);
        int i25 = i18 & 67108863;
        jArr2[i19 + 2] = ((z13 ? 1L : 0L) << 63) | ((z4 ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i25) << 26) | ((long) (i13 & 67108863));
        if (i18 < 0) {
            return;
        }
        for (int i26 = i19 - 3; i26 >= 0; i26 -= 3) {
            int i27 = i26 + 2;
            long j7 = jArr2[i27];
            if ((((int) j7) & 67108863) == i25) {
                jArr2[i27] = (j7 & (-2301339409586323457L)) | (((long) ((i19 - i26) & FrameMetricsAggregator.EVERY_DURATION)) << 52);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m1947e() {
        ColorStateList colorStateList;
        return ((Shader) this.f2965c) == null && (colorStateList = (ColorStateList) this.f2966d) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: f */
    public void m1948f() {
        int i13 = this.f2964b * 2;
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f2965c, i13);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        this.f2965c = objArrCopyOf;
        int[] iArr = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i14] = -1;
        }
        AbstractC25260n.m74069j0(0, 0, (int[]) this.f2966d, iArr, 14);
        this.f2966d = iArr;
    }

    /* JADX INFO: renamed from: g */
    public void m1949g(int i13, InterfaceC4352n interfaceC4352n) {
        int i14 = i13 & 67108863;
        long[] jArr = (long[]) this.f2965c;
        int i15 = this.f2964b;
        for (int i16 = 0; i16 < jArr.length - 2 && i16 < i15; i16 += 3) {
            if ((((int) jArr[i16 + 2]) & 67108863) == i14) {
                long j7 = jArr[i16];
                long j13 = jArr[i16 + 1];
                interfaceC4352n.invoke(Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) j7), Integer.valueOf((int) (j13 >> 32)), Integer.valueOf((int) j13));
                return;
            }
        }
    }

    public String toString() {
        switch (this.f2963a) {
            case 0:
                StringBuilder sb4 = new StringBuilder();
                if (((EnumC34828m0) this.f2965c) == EnumC34828m0.HTTP_1_0) {
                    sb4.append("HTTP/1.0");
                } else {
                    sb4.append("HTTP/1.1");
                }
                sb4.append(' ');
                sb4.append(this.f2964b);
                sb4.append(' ');
                sb4.append((String) this.f2966d);
                return sb4.toString();
            case 1:
                return m1945c();
            default:
                return super.toString();
        }
    }

    public C0803k(EnumC34828m0 enumC34828m0, int i13, String str) {
        this.f2963a = 0;
        this.f2965c = enumC34828m0;
        this.f2964b = i13;
        this.f2966d = str;
    }

    public C0803k(Shader shader, ColorStateList colorStateList, int i13) {
        this.f2963a = 4;
        this.f2965c = shader;
        this.f2966d = colorStateList;
        this.f2964b = i13;
    }

    public C0803k(C13162k c13162k) {
        this.f2963a = 2;
        this.f2965c = (C14441k) ((InterfaceC4339a) c13162k.f45588a.f82717g).invoke();
        this.f2964b = c13162k.f45589b;
        this.f2966d = (InterfaceC14444n) ((InterfaceC4339a) c13162k.f45590c.f82717g).invoke();
    }

    public C0803k(C20162a c20162a) {
        this.f2963a = 7;
        this.f2966d = AbstractC35057c.m110829a(150, new C34671d0(this));
        this.f2965c = c20162a;
    }
}
