package p682zi;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import b30.C2570m;
import dj.AbstractC12064i;
import dj.C12056a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002a0.C0062y;
import p078d1.C11457j;
import p108e4.AbstractC12682p;
import p119ej.C13225b;
import p426qi.C30387i;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p502ti.AbstractC33821d;
import p502ti.C33822e;
import p502ti.C33825h;
import p502ti.C33832o;
import p502ti.C33833p;
import p502ti.C33835r;
import p584wi.C37302b;
import p584wi.C37303c;
import p584wi.C37304d;
import p616xi.C38313a;
import p616xi.C38314b;
import p649yi.C39559n;
import p673z7.C40137a;
import pg3.C29205p;
import si.C32518d;
import so.C32800q;

/* JADX INFO: renamed from: zi.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C40661k extends AbstractC40652b {

    /* JADX INFO: renamed from: D */
    public final StringBuilder f175546D;

    /* JADX INFO: renamed from: E */
    public final RectF f175547E;

    /* JADX INFO: renamed from: F */
    public final Matrix f175548F;

    /* JADX INFO: renamed from: G */
    public final C40659i f175549G;

    /* JADX INFO: renamed from: H */
    public final C40659i f175550H;

    /* JADX INFO: renamed from: I */
    public final HashMap f175551I;

    /* JADX INFO: renamed from: J */
    public final C0062y f175552J;

    /* JADX INFO: renamed from: K */
    public final ArrayList f175553K;

    /* JADX INFO: renamed from: L */
    public final C33833p f175554L;

    /* JADX INFO: renamed from: M */
    public final C30402w f175555M;

    /* JADX INFO: renamed from: N */
    public final C30387i f175556N;

    /* JADX INFO: renamed from: O */
    public final int f175557O;

    /* JADX INFO: renamed from: P */
    public final C33822e f175558P;

    /* JADX INFO: renamed from: Q */
    public C33835r f175559Q;

    /* JADX INFO: renamed from: R */
    public final C33822e f175560R;

    /* JADX INFO: renamed from: S */
    public C33835r f175561S;

    /* JADX INFO: renamed from: T */
    public final C33825h f175562T;

    /* JADX INFO: renamed from: U */
    public C33835r f175563U;

    /* JADX INFO: renamed from: V */
    public final C33825h f175564V;

    /* JADX INFO: renamed from: W */
    public C33835r f175565W;

    /* JADX INFO: renamed from: X */
    public final C33822e f175566X;

    /* JADX INFO: renamed from: Y */
    public C33835r f175567Y;

    /* JADX INFO: renamed from: Z */
    public C33835r f175568Z;

    /* JADX INFO: renamed from: a0 */
    public final C33822e f175569a0;

    /* JADX INFO: renamed from: b0 */
    public final C33822e f175570b0;

    /* JADX INFO: renamed from: c0 */
    public final C33822e f175571c0;

    public C40661k(C30402w c30402w, C40655e c40655e) {
        C40137a c40137a;
        C40137a c40137a2;
        C38313a c38313a;
        C40137a c40137a3;
        C38313a c38313a2;
        C40137a c40137a4;
        C38313a c38313a3;
        C2570m c2570m;
        C38313a c38313a4;
        C2570m c2570m2;
        C38314b c38314b;
        C2570m c2570m3;
        C38314b c38314b2;
        C2570m c2570m4;
        C38313a c38313a5;
        C2570m c2570m5;
        C38313a c38313a6;
        super(c30402w, c40655e);
        this.f175546D = new StringBuilder(2);
        this.f175547E = new RectF();
        this.f175548F = new Matrix();
        C40659i c40659i = new C40659i(1);
        c40659i.setStyle(Paint.Style.FILL);
        this.f175549G = c40659i;
        C40659i c40659i2 = new C40659i(1);
        c40659i2.setStyle(Paint.Style.STROKE);
        this.f175550H = c40659i2;
        this.f175551I = new HashMap();
        this.f175552J = new C0062y((Object) null);
        this.f175553K = new ArrayList();
        this.f175557O = 2;
        this.f175555M = c30402w;
        this.f175556N = c40655e.f175510b;
        C33833p c33833p = new C33833p((List) c40655e.f175525q.f3536x);
        this.f175554L = c33833p;
        c33833p.m106977a(this);
        m131926f(c33833p);
        C32800q c32800q = c40655e.f175526r;
        if (c32800q != null && (c2570m5 = (C2570m) c32800q.f136504w) != null && (c38313a6 = (C38313a) c2570m5.f9987x) != null) {
            AbstractC33821d abstractC33821dMo84473k0 = c38313a6.mo84473k0();
            this.f175558P = (C33822e) abstractC33821dMo84473k0;
            abstractC33821dMo84473k0.m106977a(this);
            m131926f(abstractC33821dMo84473k0);
        }
        if (c32800q != null && (c2570m4 = (C2570m) c32800q.f136504w) != null && (c38313a5 = (C38313a) c2570m4.f9988y) != null) {
            AbstractC33821d abstractC33821dMo84473k1 = c38313a5.mo84473k0();
            this.f175560R = (C33822e) abstractC33821dMo84473k1;
            abstractC33821dMo84473k1.m106977a(this);
            m131926f(abstractC33821dMo84473k1);
        }
        if (c32800q != null && (c2570m3 = (C2570m) c32800q.f136504w) != null && (c38314b2 = (C38314b) c2570m3.f9989z) != null) {
            C33825h c33825hMo84473k0 = c38314b2.mo84473k0();
            this.f175562T = c33825hMo84473k0;
            c33825hMo84473k0.m106977a(this);
            m131926f(c33825hMo84473k0);
        }
        if (c32800q != null && (c2570m2 = (C2570m) c32800q.f136504w) != null && (c38314b = (C38314b) c2570m2.f9984E) != null) {
            C33825h c33825hMo84473k1 = c38314b.mo84473k0();
            this.f175564V = c33825hMo84473k1;
            c33825hMo84473k1.m106977a(this);
            m131926f(c33825hMo84473k1);
        }
        if (c32800q != null && (c2570m = (C2570m) c32800q.f136504w) != null && (c38313a4 = (C38313a) c2570m.f9985F) != null) {
            AbstractC33821d abstractC33821dMo84473k2 = c38313a4.mo84473k0();
            this.f175566X = (C33822e) abstractC33821dMo84473k2;
            abstractC33821dMo84473k2.m106977a(this);
            m131926f(abstractC33821dMo84473k2);
        }
        if (c32800q != null && (c40137a4 = (C40137a) c32800q.f136505x) != null && (c38313a3 = (C38313a) c40137a4.f173193b) != null) {
            AbstractC33821d abstractC33821dMo84473k3 = c38313a3.mo84473k0();
            this.f175569a0 = (C33822e) abstractC33821dMo84473k3;
            abstractC33821dMo84473k3.m106977a(this);
            m131926f(abstractC33821dMo84473k3);
        }
        if (c32800q != null && (c40137a3 = (C40137a) c32800q.f136505x) != null && (c38313a2 = (C38313a) c40137a3.f173194c) != null) {
            AbstractC33821d abstractC33821dMo84473k4 = c38313a2.mo84473k0();
            this.f175570b0 = (C33822e) abstractC33821dMo84473k4;
            abstractC33821dMo84473k4.m106977a(this);
            m131926f(abstractC33821dMo84473k4);
        }
        if (c32800q != null && (c40137a2 = (C40137a) c32800q.f136505x) != null && (c38313a = (C38313a) c40137a2.f173195d) != null) {
            AbstractC33821d abstractC33821dMo84473k5 = c38313a.mo84473k0();
            this.f175571c0 = (C33822e) abstractC33821dMo84473k5;
            abstractC33821dMo84473k5.m106977a(this);
            m131926f(abstractC33821dMo84473k5);
        }
        if (c32800q == null || (c40137a = (C40137a) c32800q.f136505x) == null) {
            return;
        }
        this.f175557O = c40137a.f173192a;
    }

    /* JADX INFO: renamed from: r */
    public static void m131938r(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX INFO: renamed from: s */
    public static void m131939s(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // p682zi.AbstractC40652b, si.InterfaceC32519e
    /* JADX INFO: renamed from: e */
    public final void mo101533e(RectF rectF, Matrix matrix, boolean z4) {
        super.mo101533e(rectF, matrix, z4);
        C30387i c30387i = this.f175556N;
        rectF.set(0.0f, 0.0f, c30387i.f124691k.width(), c30387i.f124691k.height());
    }

    @Override // p682zi.AbstractC40652b, p584wi.InterfaceC37306f
    /* JADX INFO: renamed from: g */
    public final void mo101534g(C11457j c11457j, Object obj) {
        super.mo101534g(c11457j, obj);
        PointF pointF = InterfaceC30372a0.f124620a;
        if (obj == 1) {
            C33835r c33835r = this.f175559Q;
            if (c33835r != null) {
                m131932m(c33835r);
            }
            if (c11457j == null) {
                this.f175559Q = null;
                return;
            }
            C33835r c33835r2 = new C33835r(c11457j, null);
            this.f175559Q = c33835r2;
            c33835r2.m106977a(this);
            m131926f(this.f175559Q);
            return;
        }
        if (obj == 2) {
            C33835r c33835r3 = this.f175561S;
            if (c33835r3 != null) {
                m131932m(c33835r3);
            }
            if (c11457j == null) {
                this.f175561S = null;
                return;
            }
            C33835r c33835r4 = new C33835r(c11457j, null);
            this.f175561S = c33835r4;
            c33835r4.m106977a(this);
            m131926f(this.f175561S);
            return;
        }
        if (obj == InterfaceC30372a0.f124633n) {
            C33835r c33835r5 = this.f175563U;
            if (c33835r5 != null) {
                m131932m(c33835r5);
            }
            if (c11457j == null) {
                this.f175563U = null;
                return;
            }
            C33835r c33835r6 = new C33835r(c11457j, null);
            this.f175563U = c33835r6;
            c33835r6.m106977a(this);
            m131926f(this.f175563U);
            return;
        }
        if (obj == InterfaceC30372a0.f124634o) {
            C33835r c33835r7 = this.f175565W;
            if (c33835r7 != null) {
                m131932m(c33835r7);
            }
            if (c11457j == null) {
                this.f175565W = null;
                return;
            }
            C33835r c33835r8 = new C33835r(c11457j, null);
            this.f175565W = c33835r8;
            c33835r8.m106977a(this);
            m131926f(this.f175565W);
            return;
        }
        if (obj == InterfaceC30372a0.f124609A) {
            C33835r c33835r9 = this.f175567Y;
            if (c33835r9 != null) {
                m131932m(c33835r9);
            }
            if (c11457j == null) {
                this.f175567Y = null;
                return;
            }
            C33835r c33835r10 = new C33835r(c11457j, null);
            this.f175567Y = c33835r10;
            c33835r10.m106977a(this);
            m131926f(this.f175567Y);
            return;
        }
        if (obj != InterfaceC30372a0.f124616H) {
            if (obj == InterfaceC30372a0.f124618J) {
                C33833p c33833p = this.f175554L;
                c33833p.getClass();
                c33833p.m106986j(new C33832o(new C13225b(), c11457j, new C37302b()));
                return;
            }
            return;
        }
        C33835r c33835r11 = this.f175568Z;
        if (c33835r11 != null) {
            m131932m(c33835r11);
        }
        if (c11457j == null) {
            this.f175568Z = null;
            return;
        }
        C33835r c33835r12 = new C33835r(c11457j, null);
        this.f175568Z = c33835r12;
        c33835r12.m106977a(this);
        m131926f(this.f175568Z);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x037a  */
    /* JADX WARN: Code duplicated, block: B:121:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:123:0x0400  */
    /* JADX WARN: Code duplicated, block: B:124:0x0402  */
    /* JADX WARN: Code duplicated, block: B:128:0x0413  */
    /* JADX WARN: Code duplicated, block: B:130:0x042c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0439  */
    /* JADX WARN: Code duplicated, block: B:136:0x0451  */
    /* JADX WARN: Code duplicated, block: B:152:0x049f  */
    /* JADX WARN: Code duplicated, block: B:153:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x04b8 A[LOOP:9: B:154:0x04b6->B:155:0x04b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x04db  */
    /* JADX WARN: Code duplicated, block: B:160:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:163:0x050e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:29:0x0105  */
    /* JADX WARN: Code duplicated, block: B:31:0x0118  */
    /* JADX WARN: Code duplicated, block: B:34:0x0124  */
    /* JADX WARN: Code duplicated, block: B:36:0x0140  */
    /* JADX WARN: Code duplicated, block: B:37:0x0152  */
    /* JADX WARN: Code duplicated, block: B:39:0x015d  */
    /* JADX WARN: Code duplicated, block: B:40:0x016e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0185 A[LOOP:4: B:41:0x0183->B:42:0x0185, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x0251  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p682zi.AbstractC40652b
    /* JADX INFO: renamed from: i */
    public final void mo131928i(Canvas canvas, Matrix matrix, int i13, C12056a c12056a) {
        Typeface typefaceCreateFromAsset;
        int i14;
        float fFloatValue;
        float fM33265c;
        List listAsList;
        int size;
        int i15;
        int length;
        PointF pointF;
        float f13;
        float f14;
        List listM131944w;
        int i16;
        C40660j c40660j;
        int i17;
        String str;
        int length2;
        int iCodePointAt;
        int i18;
        int iCharCount;
        float f15;
        long j7;
        C0062y c0062y;
        StringBuilder sb4;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        Canvas canvas2;
        float fFloatValue2;
        float f16;
        int i19;
        PointF pointF2;
        float f17;
        float f18;
        List listM131944w2;
        int i24;
        C40660j c40660j2;
        int i25;
        String str2;
        int i26;
        float f19;
        C30387i c30387i;
        C37304d c37304d;
        HashMap map;
        ArrayList arrayList;
        int size2;
        ArrayList arrayList2;
        int i27;
        List list;
        int i28;
        C40659i c40659i;
        C40659i c40659i2;
        Path path;
        C40659i c40659i3;
        C40659i c40659i4;
        C37302b c37302b = (C37302b) this.f175554L.mo106981e();
        C30387i c30387i2 = this.f175556N;
        C37303c c37303c = (C37303c) c30387i2.f124686f.get(c37302b.f159496b);
        if (c37303c == null) {
            return;
        }
        String str3 = c37303c.f159510c;
        String str4 = c37303c.f159508a;
        canvas.save();
        canvas.concat(matrix);
        m131940q(c37302b, i13, 0);
        C30402w c30402w = this.f175555M;
        Map map2 = c30402w.f124736J;
        String str5 = "\n";
        int i29 = -1;
        C33825h c33825h = this.f175564V;
        int i34 = 0;
        C40659i c40659i5 = this.f175549G;
        C40659i c40659i6 = this.f175550H;
        if (map2 != null || c30402w.f124769w.f124688h.m58g() <= 0) {
            C33835r c33835r = this.f175568Z;
            if (c33835r == null || (typefaceCreateFromAsset = (Typeface) c33835r.mo106981e()) == null) {
                Map map3 = c30402w.f124736J;
                if (map3 != null) {
                    if (map3.containsKey(str4)) {
                        typefaceCreateFromAsset = (Typeface) map3.get(str4);
                    } else {
                        String str6 = c37303c.f159509b;
                        if (map3.containsKey(str6)) {
                            typefaceCreateFromAsset = (Typeface) map3.get(str6);
                        } else {
                            String str7 = str4 + "-" + str3;
                            if (map3.containsKey(str7)) {
                                typefaceCreateFromAsset = (Typeface) map3.get(str7);
                            }
                        }
                    }
                    str5 = "\n";
                    if (typefaceCreateFromAsset == null) {
                        typefaceCreateFromAsset = c37303c.f159511d;
                    }
                }
                C2570m c2570mM92883j = c30402w.m92883j();
                if (c2570mM92883j != null) {
                    C29205p c29205p = (C29205p) c2570mM92883j.f9987x;
                    c29205p.f118204x = str4;
                    c29205p.f118205y = str3;
                    HashMap map4 = (HashMap) c2570mM92883j.f9988y;
                    Typeface typeface = (Typeface) map4.get(c29205p);
                    if (typeface != null) {
                        typefaceCreateFromAsset = typeface;
                        str5 = "\n";
                    } else {
                        HashMap map5 = (HashMap) c2570mM92883j.f9989z;
                        Typeface typeface2 = (Typeface) map5.get(str4);
                        if (typeface2 != null) {
                            typefaceCreateFromAsset = typeface2;
                        } else {
                            Typeface typeface3 = c37303c.f159511d;
                            if (typeface3 != null) {
                                typefaceCreateFromAsset = typeface3;
                            } else {
                                typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) c2570mM92883j.f9984E, "fonts/" + str4 + ((String) c2570mM92883j.f9985F));
                                map5.put(str4, typefaceCreateFromAsset);
                            }
                        }
                        boolean zContains = str3.contains("Italic");
                        boolean zContains2 = str3.contains("Bold");
                        if (zContains && zContains2) {
                            i14 = 3;
                        } else if (zContains) {
                            i14 = 2;
                        } else {
                            i14 = zContains2 ? 1 : 0;
                        }
                        if (typefaceCreateFromAsset.getStyle() != i14) {
                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i14);
                        }
                        map4.put(c29205p, typefaceCreateFromAsset);
                    }
                } else {
                    str5 = "\n";
                    typefaceCreateFromAsset = null;
                }
                if (typefaceCreateFromAsset == null) {
                    typefaceCreateFromAsset = c37303c.f159511d;
                }
            } else {
                str5 = "\n";
            }
            if (typefaceCreateFromAsset != null) {
                String str8 = c37302b.f159495a;
                c40659i5.setTypeface(typefaceCreateFromAsset);
                C33835r c33835r2 = this.f175567Y;
                float fFloatValue3 = c33835r2 != null ? ((Float) c33835r2.mo106981e()).floatValue() : c37302b.f159497c;
                c40659i5.setTextSize(AbstractC12064i.m33265c() * fFloatValue3);
                c40659i6.setTypeface(c40659i5.getTypeface());
                c40659i6.setTextSize(c40659i5.getTextSize());
                float f24 = c37302b.f159499e / 10.0f;
                C33835r c33835r3 = this.f175565W;
                if (c33835r3 != null) {
                    fFloatValue = ((Float) c33835r3.mo106981e()).floatValue();
                } else {
                    if (c33825h != null) {
                        fFloatValue = ((Float) c33825h.mo106981e()).floatValue();
                    }
                    fM33265c = ((AbstractC12064i.m33265c() * f24) * fFloatValue3) / 100.0f;
                    listAsList = Arrays.asList(str8.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str5, "\r").split("\r"));
                    size = listAsList.size();
                    i15 = 0;
                    length = 0;
                    while (i15 < size) {
                        String str9 = (String) listAsList.get(i15);
                        pointF = c37302b.f159507m;
                        if (pointF == null) {
                            f13 = 0.0f;
                        } else {
                            f13 = pointF.x;
                        }
                        f14 = fM33265c;
                        listM131944w = m131944w(str9, f13, c37303c, 0.0f, f14, false);
                        i16 = 0;
                        while (i16 < listM131944w.size()) {
                            c40660j = (C40660j) listM131944w.get(i16);
                            i17 = i29 + 1;
                            canvas.save();
                            if (m131943v(canvas, c37302b, i17, c40659i5.measureText(c40660j.f175544a))) {
                                str = c40660j.f175544a;
                                length2 = 0;
                                while (length2 < str.length()) {
                                    iCodePointAt = str.codePointAt(length2);
                                    i18 = length2;
                                    iCharCount = Character.charCount(iCodePointAt) + length2;
                                    C37303c c37303c2 = c37303c;
                                    while (true) {
                                        if (iCharCount < str.length()) {
                                            f15 = f14;
                                            break;
                                        }
                                        iCodePointAt2 = str.codePointAt(iCharCount);
                                        f15 = f14;
                                        if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                            break;
                                        }
                                        iCharCount += Character.charCount(iCodePointAt2);
                                        iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                        f14 = f15;
                                    }
                                    j7 = iCodePointAt;
                                    c0062y = this.f175552J;
                                    if (c0062y.m150b(j7)) {
                                        string = (String) c0062y.m151c(j7);
                                    } else {
                                        sb4 = this.f175546D;
                                        sb4.setLength(0);
                                        iCharCount2 = i18;
                                        while (iCharCount2 < iCharCount) {
                                            int i35 = iCharCount;
                                            int iCodePointAt3 = str.codePointAt(iCharCount2);
                                            sb4.appendCodePoint(iCodePointAt3);
                                            iCharCount2 += Character.charCount(iCodePointAt3);
                                            iCharCount = i35;
                                        }
                                        string = sb4.toString();
                                        c0062y.m155g(j7, string);
                                    }
                                    m131940q(c37302b, i13, length + i18);
                                    if (c37302b.f159505k) {
                                        m131938r(string, c40659i5, canvas);
                                        m131938r(string, c40659i6, canvas);
                                    } else {
                                        m131938r(string, c40659i6, canvas);
                                        m131938r(string, c40659i5, canvas);
                                    }
                                    canvas.translate(c40659i5.measureText(string) + f15, 0.0f);
                                    length2 = string.length() + i18;
                                    c37303c = c37303c2;
                                    i17 = i17;
                                    f14 = f15;
                                    listAsList = listAsList;
                                }
                            }
                            C37303c c37303c3 = c37303c;
                            float f25 = f14;
                            int i36 = i17;
                            List list2 = listAsList;
                            length += c40660j.f175544a.length();
                            canvas.restore();
                            i16++;
                            listM131944w = listM131944w;
                            c37303c = c37303c3;
                            i29 = i36;
                            f14 = f25;
                            listAsList = list2;
                        }
                        i15++;
                        c37303c = c37303c;
                        fM33265c = f14;
                    }
                }
                f24 += fFloatValue;
                fM33265c = ((AbstractC12064i.m33265c() * f24) * fFloatValue3) / 100.0f;
                listAsList = Arrays.asList(str8.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str5, "\r").split("\r"));
                size = listAsList.size();
                i15 = 0;
                length = 0;
                while (i15 < size) {
                    String str10 = (String) listAsList.get(i15);
                    pointF = c37302b.f159507m;
                    if (pointF == null) {
                        f13 = 0.0f;
                    } else {
                        f13 = pointF.x;
                    }
                    f14 = fM33265c;
                    listM131944w = m131944w(str10, f13, c37303c, 0.0f, f14, false);
                    i16 = 0;
                    while (i16 < listM131944w.size()) {
                        c40660j = (C40660j) listM131944w.get(i16);
                        i17 = i29 + 1;
                        canvas.save();
                        if (m131943v(canvas, c37302b, i17, c40659i5.measureText(c40660j.f175544a))) {
                            str = c40660j.f175544a;
                            length2 = 0;
                            while (length2 < str.length()) {
                                iCodePointAt = str.codePointAt(length2);
                                i18 = length2;
                                iCharCount = Character.charCount(iCodePointAt) + length2;
                                C37303c c37303c4 = c37303c;
                                while (true) {
                                    if (iCharCount < str.length()) {
                                        f15 = f14;
                                        break;
                                    }
                                    iCodePointAt2 = str.codePointAt(iCharCount);
                                    f15 = f14;
                                    if (Character.getType(iCodePointAt2) == 16) {
                                    }
                                    iCharCount += Character.charCount(iCodePointAt2);
                                    iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                    f14 = f15;
                                }
                                j7 = iCodePointAt;
                                c0062y = this.f175552J;
                                if (c0062y.m150b(j7)) {
                                    string = (String) c0062y.m151c(j7);
                                } else {
                                    sb4 = this.f175546D;
                                    sb4.setLength(0);
                                    iCharCount2 = i18;
                                    while (iCharCount2 < iCharCount) {
                                        int i37 = iCharCount;
                                        int iCodePointAt4 = str.codePointAt(iCharCount2);
                                        sb4.appendCodePoint(iCodePointAt4);
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                        iCharCount = i37;
                                    }
                                    string = sb4.toString();
                                    c0062y.m155g(j7, string);
                                }
                                m131940q(c37302b, i13, length + i18);
                                if (c37302b.f159505k) {
                                    m131938r(string, c40659i5, canvas);
                                    m131938r(string, c40659i6, canvas);
                                } else {
                                    m131938r(string, c40659i6, canvas);
                                    m131938r(string, c40659i5, canvas);
                                }
                                canvas.translate(c40659i5.measureText(string) + f15, 0.0f);
                                length2 = string.length() + i18;
                                c37303c = c37303c4;
                                i17 = i17;
                                f14 = f15;
                                listAsList = listAsList;
                            }
                        }
                        C37303c c37303c5 = c37303c;
                        float f26 = f14;
                        int i38 = i17;
                        List list3 = listAsList;
                        length += c40660j.f175544a.length();
                        canvas.restore();
                        i16++;
                        listM131944w = listM131944w;
                        c37303c = c37303c5;
                        i29 = i38;
                        f14 = f26;
                        listAsList = list3;
                    }
                    i15++;
                    c37303c = c37303c;
                    fM33265c = f14;
                }
            }
            canvas2 = canvas;
        } else {
            C33835r c33835r4 = this.f175567Y;
            float fFloatValue4 = c33835r4 != null ? ((Float) c33835r4.mo106981e()).floatValue() : c37302b.f159497c;
            float f27 = 0.0f;
            float[] fArr = (float[]) AbstractC12064i.f40035e.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f28 = AbstractC12064i.f40036f;
            fArr[2] = f28;
            fArr[3] = f28;
            float f29 = fFloatValue4 / 100.0f;
            matrix.mapPoints(fArr);
            C40659i c40659i7 = c40659i5;
            C30402w c30402w2 = c30402w;
            C30387i c30387i3 = c30387i2;
            String str11 = str3;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList2 = Arrays.asList(c37302b.f159495a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size3 = listAsList2.size();
            float f34 = c37302b.f159499e / 10.0f;
            C33835r c33835r5 = this.f175565W;
            if (c33835r5 != null) {
                fFloatValue2 = ((Float) c33835r5.mo106981e()).floatValue();
            } else {
                if (c33825h != null) {
                    fFloatValue2 = ((Float) c33825h.mo106981e()).floatValue();
                }
                f16 = f34;
                i19 = 0;
                while (i19 < size3) {
                    String str12 = (String) listAsList2.get(i19);
                    pointF2 = c37302b.f159507m;
                    if (pointF2 == null) {
                        f17 = f27;
                    } else {
                        f17 = pointF2.x;
                    }
                    f18 = f29;
                    i24 = i34;
                    for (listM131944w2 = m131944w(str12, f17, c37303c, f18, f16, true); i24 < listM131944w2.size(); listM131944w2 = listM131944w2) {
                        c40660j2 = (C40660j) listM131944w2.get(i24);
                        i25 = i29 + 1;
                        canvas.save();
                        if (m131943v(canvas, c37302b, i25, c40660j2.f175545b)) {
                            str2 = c40660j2.f175544a;
                            i26 = i34;
                            while (i26 < str2.length()) {
                                List list4 = listAsList2;
                                String str13 = str11;
                                int i39 = i24;
                                f19 = f16;
                                c30387i = c30387i3;
                                c37304d = (C37304d) c30387i.f124688h.m55d(C37304d.m119476a(str2.charAt(i26), str4, str13));
                                if (c37304d == null) {
                                    c30387i3 = c30387i;
                                    str2 = str2;
                                    size3 = size3;
                                    i19 = i19;
                                    i25 = i25;
                                    c40659i = c40659i6;
                                    c30402w2 = c30402w2;
                                    c40659i2 = c40659i7;
                                } else {
                                    m131940q(c37302b, i13, i26);
                                    map = this.f175551I;
                                    if (map.containsKey(c37304d)) {
                                        list = (List) map.get(c37304d);
                                    } else {
                                        arrayList = c37304d.f159512a;
                                        size2 = arrayList.size();
                                        arrayList2 = new ArrayList(size2);
                                        i27 = i34;
                                        while (i27 < size2) {
                                            arrayList2.add(new C32518d(c30402w2, this, (C39559n) arrayList.get(i27), c30387i));
                                            size2 = size2;
                                            i27++;
                                            arrayList = arrayList;
                                        }
                                        map.put(c37304d, arrayList2);
                                        list = arrayList2;
                                    }
                                    i28 = i34;
                                    while (i28 < list.size()) {
                                        path = ((C32518d) list.get(i28)).getPath();
                                        C30387i c30387i4 = c30387i;
                                        path.computeBounds(this.f175547E, i34);
                                        Matrix matrix2 = this.f175548F;
                                        matrix2.reset();
                                        List list5 = list;
                                        matrix2.preTranslate(f27, (-c37302b.f159501g) * AbstractC12064i.m33265c());
                                        matrix2.preScale(f18, f18);
                                        path.transform(matrix2);
                                        if (c37302b.f159505k) {
                                            c40659i4 = c40659i7;
                                            m131939s(path, c40659i4, canvas);
                                            c40659i3 = c40659i6;
                                            m131939s(path, c40659i3, canvas);
                                        } else {
                                            c40659i3 = c40659i6;
                                            c40659i4 = c40659i7;
                                            m131939s(path, c40659i3, canvas);
                                            m131939s(path, c40659i4, canvas);
                                        }
                                        i28++;
                                        c40659i6 = c40659i3;
                                        c40659i7 = c40659i4;
                                        list = list5;
                                        c30387i = c30387i4;
                                        i34 = 0;
                                        f27 = 0.0f;
                                    }
                                    c30387i3 = c30387i;
                                    c40659i = c40659i6;
                                    c40659i2 = c40659i7;
                                    canvas.translate((AbstractC12064i.m33265c() * ((float) c37304d.f159514c) * f18) + f19, 0.0f);
                                }
                                i26++;
                                c40659i6 = c40659i;
                                str11 = str13;
                                c40659i7 = c40659i2;
                                c30402w2 = c30402w2;
                                i24 = i39;
                                str2 = str2;
                                f16 = f19;
                                size3 = size3;
                                i19 = i19;
                                i25 = i25;
                                i34 = 0;
                                f27 = 0.0f;
                                listAsList2 = list4;
                            }
                        }
                        int i44 = i24;
                        float f35 = f16;
                        List list6 = listAsList2;
                        int i45 = size3;
                        int i46 = i19;
                        int i47 = i25;
                        C40659i c40659i8 = c40659i6;
                        C30402w c30402w3 = c30402w2;
                        C40659i c40659i9 = c40659i7;
                        String str14 = str11;
                        canvas.restore();
                        c40659i6 = c40659i8;
                        str11 = str14;
                        c40659i7 = c40659i9;
                        c30402w2 = c30402w3;
                        f16 = f35;
                        size3 = i45;
                        i19 = i46;
                        i29 = i47;
                        i34 = 0;
                        f27 = 0.0f;
                        listAsList2 = list6;
                        i24 = i44 + 1;
                    }
                    i34 = 0;
                    f27 = 0.0f;
                    listAsList2 = listAsList2;
                    i19++;
                    f29 = f18;
                }
                canvas2 = canvas;
            }
            f34 += fFloatValue2;
            f16 = f34;
            i19 = 0;
            while (i19 < size3) {
                String str15 = (String) listAsList2.get(i19);
                pointF2 = c37302b.f159507m;
                if (pointF2 == null) {
                    f17 = f27;
                } else {
                    f17 = pointF2.x;
                }
                f18 = f29;
                i24 = i34;
                while (i24 < listM131944w2.size()) {
                    c40660j2 = (C40660j) listM131944w2.get(i24);
                    i25 = i29 + 1;
                    canvas.save();
                    if (m131943v(canvas, c37302b, i25, c40660j2.f175545b)) {
                        str2 = c40660j2.f175544a;
                        i26 = i34;
                        while (i26 < str2.length()) {
                            List list7 = listAsList2;
                            String str16 = str11;
                            int i310 = i24;
                            f19 = f16;
                            c30387i = c30387i3;
                            c37304d = (C37304d) c30387i.f124688h.m55d(C37304d.m119476a(str2.charAt(i26), str4, str16));
                            if (c37304d == null) {
                                c30387i3 = c30387i;
                                str2 = str2;
                                size3 = size3;
                                i19 = i19;
                                i25 = i25;
                                c40659i = c40659i6;
                                c30402w2 = c30402w2;
                                c40659i2 = c40659i7;
                            } else {
                                m131940q(c37302b, i13, i26);
                                map = this.f175551I;
                                if (map.containsKey(c37304d)) {
                                    list = (List) map.get(c37304d);
                                } else {
                                    arrayList = c37304d.f159512a;
                                    size2 = arrayList.size();
                                    arrayList2 = new ArrayList(size2);
                                    i27 = i34;
                                    while (i27 < size2) {
                                        arrayList2.add(new C32518d(c30402w2, this, (C39559n) arrayList.get(i27), c30387i));
                                        size2 = size2;
                                        i27++;
                                        arrayList = arrayList;
                                    }
                                    map.put(c37304d, arrayList2);
                                    list = arrayList2;
                                }
                                i28 = i34;
                                while (i28 < list.size()) {
                                    path = ((C32518d) list.get(i28)).getPath();
                                    C30387i c30387i5 = c30387i;
                                    path.computeBounds(this.f175547E, i34);
                                    Matrix matrix3 = this.f175548F;
                                    matrix3.reset();
                                    List list8 = list;
                                    matrix3.preTranslate(f27, (-c37302b.f159501g) * AbstractC12064i.m33265c());
                                    matrix3.preScale(f18, f18);
                                    path.transform(matrix3);
                                    if (c37302b.f159505k) {
                                        c40659i4 = c40659i7;
                                        m131939s(path, c40659i4, canvas);
                                        c40659i3 = c40659i6;
                                        m131939s(path, c40659i3, canvas);
                                    } else {
                                        c40659i3 = c40659i6;
                                        c40659i4 = c40659i7;
                                        m131939s(path, c40659i3, canvas);
                                        m131939s(path, c40659i4, canvas);
                                    }
                                    i28++;
                                    c40659i6 = c40659i3;
                                    c40659i7 = c40659i4;
                                    list = list8;
                                    c30387i = c30387i5;
                                    i34 = 0;
                                    f27 = 0.0f;
                                }
                                c30387i3 = c30387i;
                                c40659i = c40659i6;
                                c40659i2 = c40659i7;
                                canvas.translate((AbstractC12064i.m33265c() * ((float) c37304d.f159514c) * f18) + f19, 0.0f);
                            }
                            i26++;
                            c40659i6 = c40659i;
                            str11 = str16;
                            c40659i7 = c40659i2;
                            c30402w2 = c30402w2;
                            i24 = i310;
                            str2 = str2;
                            f16 = f19;
                            size3 = size3;
                            i19 = i19;
                            i25 = i25;
                            i34 = 0;
                            f27 = 0.0f;
                            listAsList2 = list7;
                        }
                    }
                    int i48 = i24;
                    float f36 = f16;
                    List list9 = listAsList2;
                    int i49 = size3;
                    int i410 = i19;
                    int i411 = i25;
                    C40659i c40659i10 = c40659i6;
                    C30402w c30402w4 = c30402w2;
                    C40659i c40659i11 = c40659i7;
                    String str17 = str11;
                    canvas.restore();
                    c40659i6 = c40659i10;
                    str11 = str17;
                    c40659i7 = c40659i11;
                    c30402w2 = c30402w4;
                    f16 = f36;
                    size3 = i49;
                    i19 = i410;
                    i29 = i411;
                    i34 = 0;
                    f27 = 0.0f;
                    listAsList2 = list9;
                    i24 = i48 + 1;
                }
                i34 = 0;
                f27 = 0.0f;
                listAsList2 = listAsList2;
                i19++;
                f29 = f18;
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    /* JADX INFO: renamed from: q */
    public final void m131940q(C37302b c37302b, int i13, int i14) {
        C33835r c33835r = this.f175559Q;
        C40659i c40659i = this.f175549G;
        if (c33835r != null) {
            c40659i.setColor(((Integer) c33835r.mo106981e()).intValue());
        } else {
            C33822e c33822e = this.f175558P;
            if (c33822e == null || !m131942u(i14)) {
                c40659i.setColor(c37302b.f159502h);
            } else {
                c40659i.setColor(((Integer) c33822e.mo106981e()).intValue());
            }
        }
        C33835r c33835r2 = this.f175561S;
        C40659i c40659i2 = this.f175550H;
        if (c33835r2 != null) {
            c40659i2.setColor(((Integer) c33835r2.mo106981e()).intValue());
        } else {
            C33822e c33822e2 = this.f175560R;
            if (c33822e2 == null || !m131942u(i14)) {
                c40659i2.setColor(c37302b.f159503i);
            } else {
                c40659i2.setColor(((Integer) c33822e2.mo106981e()).intValue());
            }
        }
        AbstractC33821d abstractC33821d = this.f175485w.f141696j;
        int iIntValue = 100;
        int iIntValue2 = abstractC33821d == null ? 100 : ((Integer) abstractC33821d.mo106981e()).intValue();
        C33822e c33822e3 = this.f175566X;
        if (c33822e3 != null && m131942u(i14)) {
            iIntValue = ((Integer) c33822e3.mo106981e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i13) / 255.0f);
        c40659i.setAlpha(iRound);
        c40659i2.setAlpha(iRound);
        C33835r c33835r3 = this.f175563U;
        if (c33835r3 != null) {
            c40659i2.setStrokeWidth(((Float) c33835r3.mo106981e()).floatValue());
            return;
        }
        C33825h c33825h = this.f175562T;
        if (c33825h == null || !m131942u(i14)) {
            c40659i2.setStrokeWidth(AbstractC12064i.m33265c() * c37302b.f159504j);
        } else {
            c40659i2.setStrokeWidth(((Float) c33825h.mo106981e()).floatValue());
        }
    }

    /* JADX INFO: renamed from: t */
    public final C40660j m131941t(int i13) {
        ArrayList arrayList = this.f175553K;
        for (int size = arrayList.size(); size < i13; size++) {
            C40660j c40660j = new C40660j();
            c40660j.f175544a = "";
            c40660j.f175545b = 0.0f;
            arrayList.add(c40660j);
        }
        return (C40660j) arrayList.get(i13 - 1);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m131942u(int i13) {
        C33822e c33822e;
        int length = ((C37302b) this.f175554L.mo106981e()).f159495a.length();
        C33822e c33822e2 = this.f175569a0;
        if (c33822e2 == null || (c33822e = this.f175570b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) c33822e2.mo106981e()).intValue(), ((Integer) c33822e.mo106981e()).intValue());
        int iMax = Math.max(((Integer) c33822e2.mo106981e()).intValue(), ((Integer) c33822e.mo106981e()).intValue());
        C33822e c33822e3 = this.f175571c0;
        if (c33822e3 != null) {
            int iIntValue = ((Integer) c33822e3.mo106981e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f175557O == 2) {
            return i13 >= iMin && i13 < iMax;
        }
        float f13 = (i13 / length) * 100.0f;
        return f13 >= ((float) iMin) && f13 < ((float) iMax);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m131943v(Canvas canvas, C37302b c37302b, int i13, float f13) {
        PointF pointF = c37302b.f159506l;
        PointF pointF2 = c37302b.f159507m;
        float fM33265c = AbstractC12064i.m33265c();
        float f14 = (i13 * c37302b.f159500f * fM33265c) + (pointF == null ? 0.0f : (c37302b.f159500f * fM33265c) + pointF.y);
        if (this.f175555M.f124747U && pointF2 != null && pointF != null && f14 >= pointF.y + pointF2.y + c37302b.f159497c) {
            return false;
        }
        float f15 = pointF == null ? 0.0f : pointF.x;
        float f16 = pointF2 != null ? pointF2.x : 0.0f;
        int iM35485e = AbstractC12682p.m35485e(c37302b.f159498d);
        if (iM35485e == 0) {
            canvas.translate(f15, f14);
            return true;
        }
        if (iM35485e == 1) {
            canvas.translate((f15 + f16) - f13, f14);
            return true;
        }
        if (iM35485e != 2) {
            return true;
        }
        canvas.translate(((f16 / 2.0f) + f15) - (f13 / 2.0f), f14);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final List m131944w(String str, float f13, C37303c c37303c, float f14, float f15, boolean z4) {
        float fMeasureText;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        int i15 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i16 = 0; i16 < str.length(); i16++) {
            char cCharAt = str.charAt(i16);
            if (z4) {
                C37304d c37304d = (C37304d) this.f175556N.f124688h.m55d(C37304d.m119476a(cCharAt, c37303c.f159508a, c37303c.f159510c));
                if (c37304d != null) {
                    fMeasureText = (AbstractC12064i.m33265c() * ((float) c37304d.f159514c) * f14) + f15;
                }
            } else {
                fMeasureText = this.f175549G.measureText(str.substring(i16, i16 + 1)) + f15;
            }
            if (cCharAt == ' ') {
                z13 = true;
                f18 = fMeasureText;
            } else if (z13) {
                z13 = false;
                i15 = i16;
                f17 = fMeasureText;
            } else {
                f17 += fMeasureText;
            }
            f16 += fMeasureText;
            if (f13 > 0.0f && f16 >= f13 && cCharAt != ' ') {
                i13++;
                C40660j c40660jM131941t = m131941t(i13);
                if (i15 == i14) {
                    String strSubstring = str.substring(i14, i16);
                    String strTrim = strSubstring.trim();
                    float length = (f16 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f18);
                    c40660jM131941t.f175544a = strTrim;
                    c40660jM131941t.f175545b = length;
                    i14 = i16;
                    i15 = i14;
                    f16 = fMeasureText;
                    f17 = f16;
                } else {
                    String strSubstring2 = str.substring(i14, i15 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f16 - f17) - ((strSubstring2.length() - strTrim2.length()) * f18)) - f18;
                    c40660jM131941t.f175544a = strTrim2;
                    c40660jM131941t.f175545b = length2;
                    f16 = f17;
                    i14 = i15;
                }
            }
        }
        if (f16 > 0.0f) {
            i13++;
            C40660j c40660jM131941t2 = m131941t(i13);
            c40660jM131941t2.f175544a = str.substring(i14);
            c40660jM131941t2.f175545b = f16;
        }
        return this.f175553K.subList(0, i13);
    }
}
