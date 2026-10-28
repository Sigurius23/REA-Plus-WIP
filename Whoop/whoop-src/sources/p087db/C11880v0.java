package p087db;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.iterable.iterableapi.C5332h2;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35902e;
import p576w8.C36932b;
import p576w8.C36935e;
import p576w8.C36937g;
import p576w8.C36938h;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: db.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11880v0 extends FrameLayout implements InterfaceC11868p0 {

    /* JADX INFO: renamed from: E */
    public float f38767E;

    /* JADX INFO: renamed from: F */
    public float f38768F;

    /* JADX INFO: renamed from: w */
    public final C11841c f38769w;

    /* JADX INFO: renamed from: x */
    public final C5332h2 f38770x;

    /* JADX INFO: renamed from: y */
    public List f38771y;

    /* JADX INFO: renamed from: z */
    public C11843d f38772z;

    public C11880v0(Context context) {
        super(context, null);
        this.f38771y = Collections.EMPTY_LIST;
        this.f38772z = C11843d.f38619g;
        this.f38767E = 0.0533f;
        this.f38768F = 0.08f;
        C11841c c11841c = new C11841c(context, 0);
        this.f38769w = c11841c;
        C5332h2 c5332h2 = new C5332h2(context, null, 1);
        this.f38770x = c5332h2;
        c5332h2.setBackgroundColor(0);
        addView(c11841c);
        addView(c5332h2);
    }

    @Override // p087db.InterfaceC11868p0
    /* JADX INFO: renamed from: a */
    public final void mo31783a(List list, C11843d c11843d, float f13, float f14) {
        this.f38772z = c11843d;
        this.f38767E = f13;
        this.f38768F = f14;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            C36932b c36932b = (C36932b) list.get(i13);
            if (c36932b.f158048d != null) {
                arrayList.add(c36932b);
            } else {
                arrayList2.add(c36932b);
            }
        }
        if (!this.f38771y.isEmpty() || !arrayList2.isEmpty()) {
            this.f38771y = arrayList2;
            m31845c();
        }
        this.f38769w.mo31783a(arrayList, c11843d, f13, f14);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final String m31844b(float f13, int i13) {
        float fM113949T = AbstractC35902e.m113949T(f13, i13, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fM113949T == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fM113949T / getContext().getResources().getDisplayMetrics().density)};
        int i14 = AbstractC38065t.f163031a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0242  */
    /* JADX WARN: Code duplicated, block: B:106:0x0248  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:109:0x0275 A[LOOP:2: B:108:0x0273->B:109:0x0275, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0298 A[LOOP:3: B:111:0x0292->B:113:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:121:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x030f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0327  */
    /* JADX WARN: Code duplicated, block: B:126:0x032d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0343  */
    /* JADX WARN: Code duplicated, block: B:129:0x0349  */
    /* JADX WARN: Code duplicated, block: B:130:0x034c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0350  */
    /* JADX WARN: Code duplicated, block: B:134:0x0359  */
    /* JADX WARN: Code duplicated, block: B:135:0x035f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0379  */
    /* JADX WARN: Code duplicated, block: B:139:0x037d  */
    /* JADX WARN: Code duplicated, block: B:140:0x039a  */
    /* JADX WARN: Code duplicated, block: B:142:0x039e  */
    /* JADX WARN: Code duplicated, block: B:144:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:146:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x03da  */
    /* JADX WARN: Code duplicated, block: B:158:0x03de  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:170:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:172:0x0401  */
    /* JADX WARN: Code duplicated, block: B:173:0x0405  */
    /* JADX WARN: Code duplicated, block: B:175:0x0409  */
    /* JADX WARN: Code duplicated, block: B:177:0x041c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0420  */
    /* JADX WARN: Code duplicated, block: B:181:0x0426  */
    /* JADX WARN: Code duplicated, block: B:183:0x042e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0431 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0433  */
    /* JADX WARN: Code duplicated, block: B:188:0x0436  */
    /* JADX WARN: Code duplicated, block: B:189:0x043a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0440  */
    /* JADX WARN: Code duplicated, block: B:191:0x0446  */
    /* JADX WARN: Code duplicated, block: B:192:0x044c  */
    /* JADX WARN: Code duplicated, block: B:195:0x045a  */
    /* JADX WARN: Code duplicated, block: B:196:0x045d  */
    /* JADX WARN: Code duplicated, block: B:199:0x046f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0487  */
    /* JADX WARN: Code duplicated, block: B:241:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:243:0x0502  */
    /* JADX WARN: Code duplicated, block: B:246:0x0517  */
    /* JADX WARN: Code duplicated, block: B:252:0x0546  */
    /* JADX WARN: Code duplicated, block: B:255:0x0572 A[LOOP:6: B:253:0x056c->B:255:0x0572, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x058d A[LOOP:7: B:257:0x0587->B:259:0x058d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:267:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:271:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:275:0x0605  */
    /* JADX WARN: Code duplicated, block: B:277:0x0608  */
    /* JADX WARN: Code duplicated, block: B:281:0x060f  */
    /* JADX WARN: Code duplicated, block: B:284:0x0628  */
    /* JADX WARN: Code duplicated, block: B:287:0x0643  */
    /* JADX WARN: Code duplicated, block: B:289:0x064e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0651  */
    /* JADX WARN: Code duplicated, block: B:292:0x0654  */
    /* JADX WARN: Code duplicated, block: B:293:0x0657  */
    /* JADX WARN: Code duplicated, block: B:295:0x0675  */
    /* JADX WARN: Code duplicated, block: B:313:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:61:0x0197  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0207  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x0298, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m31845c() {
        String strConcat;
        String str;
        String str2;
        int i13;
        float f13;
        String str3;
        Layout.Alignment alignment;
        String str4;
        int i14;
        int i15;
        Object obj;
        int i16;
        String str5;
        int i17;
        String str6;
        String str7;
        Object obj2;
        String str8;
        CharSequence charSequence;
        float f14;
        String str9;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i18;
        HashMap map;
        Iterator it;
        String str10;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i19;
        String str11;
        StringBuilder sb4;
        int i24;
        int i25;
        C11856j0 c11856j0;
        Iterator it3;
        Iterator it4;
        Object obj3;
        boolean z4;
        boolean z13;
        Object[] objArr;
        C36938h c36938h;
        int i26;
        int i27;
        StringBuilder sb5;
        int i28;
        String str12;
        String strM31996o;
        int i29;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str13;
        int spanStart;
        int spanEnd;
        C11862m0 c11862m0;
        C11862m0 c11862m1;
        String str14;
        float f15;
        String str15;
        Layout.Alignment alignment2;
        int i34;
        String str16;
        String str17;
        String str18;
        boolean z14;
        StringBuilder sb6 = new StringBuilder();
        String strM113401X = AbstractC35785b.m113401X(this.f38772z.f38620a);
        int i35 = 0;
        String strM31844b = m31844b(this.f38767E, 0);
        float f16 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        C11843d c11843d = this.f38772z;
        int i36 = c11843d.f38623d;
        int i37 = c11843d.f38624e;
        int i38 = 2;
        int i39 = 1;
        if (i36 == 1) {
            Object[] objArr2 = {AbstractC35785b.m113401X(i37)};
            int i44 = AbstractC38065t.f163031a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i36 == 2) {
            String strM113401X2 = AbstractC35785b.m113401X(i37);
            int i45 = AbstractC38065t.f163031a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strM113401X2);
        } else if (i36 == 3) {
            String strM113401X3 = AbstractC35785b.m113401X(i37);
            int i46 = AbstractC38065t.f163031a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strM113401X3);
        } else if (i36 != 4) {
            strConcat = "unset";
        } else {
            String strM113401X4 = AbstractC35785b.m113401X(i37);
            int i47 = AbstractC38065t.f163031a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strM113401X4);
        }
        Object[] objArr3 = {strM113401X, strM31844b, fValueOf, strConcat};
        int i48 = AbstractC38065t.f163031a;
        sb6.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map2 = new HashMap();
        String strM113401X5 = AbstractC35785b.m113401X(this.f38772z.f38621b);
        String str19 = "background-color:";
        StringBuilder sb7 = new StringBuilder("background-color:");
        sb7.append(strM113401X5);
        String str20 = ";";
        sb7.append(";");
        map2.put(".default_bg,.default_bg *", sb7.toString());
        int i49 = 0;
        while (i49 < this.f38771y.size()) {
            C36932b c36932b = (C36932b) this.f38771y.get(i49);
            float f17 = c36932b.f158052h;
            int i54 = c36932b.f158051g;
            int i55 = c36932b.f158060p;
            float f18 = f17 != -3.4028235E38f ? f17 * 100.0f : 50.0f;
            float f19 = f16;
            int i56 = c36932b.f158053i;
            int i57 = -100;
            int i58 = i56 != i39 ? i56 != i38 ? i35 : -100 : -50;
            float f24 = c36932b.f158049e;
            if (f24 != -3.4028235E38f) {
                if (c36932b.f158050f != i39) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f24 * 100.0f));
                    if (i55 == i39) {
                        i57 = -(i54 != i39 ? i54 != 2 ? 0 : -100 : -50);
                    } else {
                        i57 = i54 != i39 ? i54 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    if (f24 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f24 * f19));
                        i13 = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f24) - 1.0f) * f19));
                        i13 = i39;
                    }
                    i57 = 0;
                }
                f13 = c36932b.f158054j;
                if (f13 != -3.4028235E38f) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f13 * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str21 = str3;
                alignment = c36932b.f158046b;
                str4 = "end";
                if (alignment == null) {
                    i16 = i39;
                    obj = "center";
                    i15 = 2;
                } else {
                    i14 = AbstractC11878u0.f38763a[alignment.ordinal()];
                    if (i14 != i39) {
                        i15 = 2;
                        if (i14 != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i15 = 2;
                        obj = "start";
                    }
                    i16 = 1;
                }
                if (i55 != i16) {
                    str5 = "vertical-rl";
                } else if (i55 != i15) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String str22 = str5;
                String strM31844b2 = m31844b(c36932b.f158059o, c36932b.f158058n);
                if (c36932b.f158056l) {
                    i17 = c36932b.f158057m;
                } else {
                    i17 = this.f38772z.f38622c;
                }
                String strM113401X6 = AbstractC35785b.m113401X(i17);
                if (i55 != 1) {
                    if (i13 != 0) {
                        str6 = "left";
                    } else {
                        str6 = "right";
                    }
                    str7 = str6;
                    obj2 = "top";
                } else if (i55 != 2) {
                    str7 = i13 != 0 ? "bottom" : "top";
                    obj2 = "left";
                } else {
                    if (i13 != 0) {
                        str6 = "right";
                    } else {
                        str6 = "left";
                    }
                    str7 = str6;
                    obj2 = "top";
                }
                if (i55 != 2 || i55 == 1) {
                    str8 = "height";
                    int i59 = i57;
                    i57 = i58;
                    i58 = i59;
                } else {
                    str8 = "width";
                }
                String str23 = str8;
                charSequence = c36932b.f158045a;
                f14 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = AbstractC11864n0.f38700a;
                int i64 = i58;
                int i65 = i49;
                if (charSequence == null) {
                    c11856j0 = new C11856j0("", 0, false);
                    str9 = "";
                } else {
                    str9 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i18 = 0;
                        while (i18 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i18].getBackgroundColor()));
                            i18++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strM8295h = AbstractC2875y.m8295h(iIntValue, "bg_");
                            Iterator it5 = it;
                            String strM8300m = AbstractC2875y.m8300m(".", strM8295h, ",.", strM8295h, " *");
                            String strM113401X7 = AbstractC35785b.m113401X(iIntValue);
                            int i66 = AbstractC38065t.f163031a;
                            Locale locale4 = Locale.US;
                            map.put(strM8300m, str19 + strM113401X7 + str20);
                            it = it5;
                            str4 = str4;
                        }
                        str10 = str4;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i19 = 0;
                        for (length2 = spans.length; i19 < length2; length2 = length2) {
                            obj3 = spans[i19];
                            String str24 = str20;
                            z4 = obj3 instanceof StrikethroughSpan;
                            String str25 = null;
                            if (z4) {
                                z13 = z4;
                                strM31996o = "<span style='text-decoration:line-through;'>";
                            } else {
                                z13 = z4;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strM113401X8 = AbstractC35785b.m113401X(((ForegroundColorSpan) obj3).getForegroundColor());
                                    int i67 = AbstractC38065t.f163031a;
                                    Locale locale5 = Locale.US;
                                    strM31996o = AbstractC11895b.m31996o("<span style='color:", strM113401X8, ";'>");
                                } else {
                                    str19 = str19;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        int i68 = AbstractC38065t.f163031a;
                                        Locale locale6 = Locale.US;
                                        objArr = spans;
                                        strM31996o = AbstractC2875y.m8296i(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        objArr = spans;
                                        if (obj3 instanceof C36935e) {
                                            strM31996o = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f14;
                                            }
                                            Object[] objArr4 = {Float.valueOf(size)};
                                            int i69 = AbstractC38065t.f163031a;
                                            strM31996o = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            int i74 = AbstractC38065t.f163031a;
                                            strM31996o = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                int i75 = AbstractC38065t.f163031a;
                                                Locale locale7 = Locale.US;
                                                strM31996o = AbstractC11895b.m31996o("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strM31996o = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strM31996o = "<b>";
                                            } else if (style != 2) {
                                                strM31996o = "<i>";
                                            } else if (style != 3) {
                                                strM31996o = null;
                                            } else {
                                                strM31996o = "<b><i>";
                                            }
                                        } else if (obj3 instanceof C36937g) {
                                            i29 = ((C36937g) obj3).f158072b;
                                            if (i29 != -1) {
                                                strM31996o = "<ruby style='ruby-position:unset;'>";
                                            } else if (i29 != 1) {
                                                strM31996o = "<ruby style='ruby-position:over;'>";
                                            } else if (i29 != 2) {
                                                strM31996o = null;
                                            } else {
                                                strM31996o = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strM31996o = "<u>";
                                        } else if (obj3 instanceof C36938h) {
                                            c36938h = (C36938h) obj3;
                                            i26 = c36938h.f158076a;
                                            i27 = c36938h.f158077b;
                                            sb5 = new StringBuilder();
                                            if (i27 != 1) {
                                                i28 = 2;
                                                if (i27 == 2) {
                                                    sb5.append("open ");
                                                }
                                            } else {
                                                i28 = 2;
                                                sb5.append("filled ");
                                            }
                                            if (i26 != 0) {
                                                sb5.append("none");
                                            } else if (i26 != 1) {
                                                sb5.append("circle");
                                            } else if (i26 != i28) {
                                                sb5.append("dot");
                                            } else if (i26 != 3) {
                                                sb5.append("unset");
                                            } else {
                                                sb5.append("sesame");
                                            }
                                            String string = sb5.toString();
                                            if (c36938h.f158078c != 2) {
                                                str12 = "over right";
                                            } else {
                                                str12 = "under left";
                                            }
                                            Object[] objArr6 = {string, str12};
                                            int i76 = AbstractC38065t.f163031a;
                                            strM31996o = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                        } else {
                                            strM31996o = null;
                                        }
                                    }
                                }
                                if (z13 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof C36935e) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof C36938h)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str13 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str25 = "</b>";
                                            } else if (style2 == 2) {
                                                str25 = "</i>";
                                            } else if (style2 == 3) {
                                                str25 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof C36937g) {
                                            str25 = "<rt>" + AbstractC11864n0.m31839a(((C36937g) obj3).f158071a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str25 = "</u>";
                                        }
                                        str13 = str25;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strM31996o != null) {
                                    str13.getClass();
                                    C11860l0 c11860l0 = new C11860l0(spanStart, spanEnd, strM31996o, str13);
                                    c11862m0 = (C11862m0) sparseArray.get(spanStart);
                                    if (c11862m0 == null) {
                                        c11862m0 = new C11862m0();
                                        sparseArray.put(spanStart, c11862m0);
                                    }
                                    c11862m0.f38698a.add(c11860l0);
                                    c11862m1 = (C11862m0) sparseArray.get(spanEnd);
                                    if (c11862m1 == null) {
                                        c11862m1 = new C11862m0();
                                        sparseArray.put(spanEnd, c11862m1);
                                    }
                                    c11862m1.f38699b.add(c11860l0);
                                }
                                i19++;
                                str20 = str24;
                                str19 = str19;
                                spans = objArr;
                            }
                            objArr = spans;
                            str13 = z13 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strM31996o != null) {
                                str13.getClass();
                                C11860l0 c11860l1 = new C11860l0(spanStart, spanEnd, strM31996o, str13);
                                c11862m0 = (C11862m0) sparseArray.get(spanStart);
                                if (c11862m0 == null) {
                                    c11862m0 = new C11862m0();
                                    sparseArray.put(spanStart, c11862m0);
                                }
                                c11862m0.f38698a.add(c11860l1);
                                c11862m1 = (C11862m0) sparseArray.get(spanEnd);
                                if (c11862m1 == null) {
                                    c11862m1 = new C11862m0();
                                    sparseArray.put(spanEnd, c11862m1);
                                }
                                c11862m1.f38699b.add(c11860l1);
                            }
                            i19++;
                            str20 = str24;
                            str19 = str19;
                            spans = objArr;
                        }
                        str20 = str20;
                        str11 = str19;
                        sb4 = new StringBuilder(spanned.length());
                        i24 = 0;
                        i25 = 0;
                        while (i24 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i24);
                            sb4.append(AbstractC11864n0.m31839a(spanned.subSequence(i25, iKeyAt)));
                            C11862m0 c11862m2 = (C11862m0) sparseArray.get(iKeyAt);
                            ArrayList arrayList = c11862m2.f38699b;
                            ArrayList arrayList2 = c11862m2.f38698a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, C11860l0.f38692f);
                            it3 = c11862m2.f38699b.iterator();
                            while (it3.hasNext()) {
                                sb4.append(((C11860l0) it3.next()).f38696d);
                            }
                            Collections.sort(arrayList2, C11860l0.f38691e);
                            it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                sb4.append(((C11860l0) it4.next()).f38695c);
                            }
                            i24++;
                            i25 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb4.append(AbstractC11864n0.m31839a(spanned.subSequence(i25, spanned.length())));
                        c11856j0 = new C11856j0(sb4.toString(), 0, false);
                    } else {
                        c11856j0 = new C11856j0(AbstractC11864n0.m31839a(charSequence), 0, false);
                    }
                    str14 = c11856j0.f38685x;
                    for (String str26 : map2.keySet()) {
                        str18 = (String) map2.put(str26, (String) map2.get(str26));
                        if (str18 != null || str18.equals(map2.get(str26))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        AbstractC35849g.m113807i(z14);
                    }
                    Integer numValueOf = Integer.valueOf(i65);
                    Float fValueOf2 = Float.valueOf(f18);
                    Integer numValueOf2 = Integer.valueOf(i64);
                    Integer numValueOf3 = Integer.valueOf(i57);
                    f15 = c36932b.f158061q;
                    if (f15 != 0.0f) {
                        if (i55 != 2 || i55 == 1) {
                            str17 = "skewY";
                        } else {
                            str17 = "skewX";
                        }
                        Object[] objArr7 = {str17, Float.valueOf(f15)};
                        int i77 = AbstractC38065t.f163031a;
                        str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                    } else {
                        str15 = str9;
                    }
                    sb6.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str7, str2, str23, str21, obj, str22, strM31844b2, strM113401X6, numValueOf2, numValueOf3, str15));
                    sb6.append("<span class='default_bg'>");
                    alignment2 = c36932b.f158047c;
                    if (alignment2 != null) {
                        i34 = AbstractC11878u0.f38763a[alignment2.ordinal()];
                        if (i34 != 1) {
                            i38 = 2;
                            if (i34 != 2) {
                                str16 = "center";
                            } else {
                                str16 = str10;
                            }
                        } else {
                            i38 = 2;
                            str16 = "start";
                        }
                        sb6.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                        sb6.append(str14);
                        sb6.append("</span>");
                    } else {
                        i38 = 2;
                        sb6.append(str14);
                    }
                    sb6.append("</span></div>");
                    i49 = i65 + 1;
                    f16 = f19;
                    str20 = str20;
                    str19 = str11;
                    i35 = 0;
                    i39 = 1;
                }
                str11 = str19;
                str10 = "end";
                str14 = c11856j0.f38685x;
                while (r4.hasNext()) {
                    str18 = (String) map2.put(str26, (String) map2.get(str26));
                    if (str18 != null) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    AbstractC35849g.m113807i(z14);
                }
                Integer numValueOf4 = Integer.valueOf(i65);
                Float fValueOf3 = Float.valueOf(f18);
                Integer numValueOf5 = Integer.valueOf(i64);
                Integer numValueOf6 = Integer.valueOf(i57);
                f15 = c36932b.f158061q;
                if (f15 != 0.0f) {
                    if (i55 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr8 = {str17, Float.valueOf(f15)};
                    int i78 = AbstractC38065t.f163031a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr8);
                } else {
                    str15 = str9;
                }
                sb6.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str7, str2, str23, str21, obj, str22, strM31844b2, strM113401X6, numValueOf5, numValueOf6, str15));
                sb6.append("<span class='default_bg'>");
                alignment2 = c36932b.f158047c;
                if (alignment2 != null) {
                    i34 = AbstractC11878u0.f38763a[alignment2.ordinal()];
                    if (i34 != 1) {
                        i38 = 2;
                        if (i34 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str10;
                        }
                    } else {
                        i38 = 2;
                        str16 = "start";
                    }
                    sb6.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb6.append(str14);
                    sb6.append("</span>");
                } else {
                    i38 = 2;
                    sb6.append(str14);
                }
                sb6.append("</span></div>");
                i49 = i65 + 1;
                f16 = f19;
                str20 = str20;
                str19 = str11;
                i35 = 0;
                i39 = 1;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f38768F) * 100.0f));
            }
            str2 = str;
            i13 = 0;
            f13 = c36932b.f158054j;
            if (f13 != -3.4028235E38f) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f13 * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str27 = str3;
            alignment = c36932b.f158046b;
            str4 = "end";
            if (alignment == null) {
                i16 = i39;
                obj = "center";
                i15 = 2;
            } else {
                i14 = AbstractC11878u0.f38763a[alignment.ordinal()];
                if (i14 != i39) {
                    i15 = 2;
                    if (i14 != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i15 = 2;
                    obj = "start";
                }
                i16 = 1;
            }
            if (i55 != i16) {
                str5 = "vertical-rl";
            } else if (i55 != i15) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String str28 = str5;
            String strM31844b3 = m31844b(c36932b.f158059o, c36932b.f158058n);
            if (c36932b.f158056l) {
                i17 = c36932b.f158057m;
            } else {
                i17 = this.f38772z.f38622c;
            }
            String strM113401X9 = AbstractC35785b.m113401X(i17);
            if (i55 != 1) {
                if (i13 != 0) {
                    str6 = "left";
                } else {
                    str6 = "right";
                }
                str7 = str6;
                obj2 = "top";
            } else if (i55 != 2) {
                str7 = i13 != 0 ? "bottom" : "top";
                obj2 = "left";
            } else {
                if (i13 != 0) {
                    str6 = "right";
                } else {
                    str6 = "left";
                }
                str7 = str6;
                obj2 = "top";
            }
            if (i55 != 2) {
                str8 = "height";
                int i510 = i57;
                i57 = i58;
                i58 = i510;
            } else {
                str8 = "height";
                int i511 = i57;
                i57 = i58;
                i58 = i511;
            }
            String str29 = str8;
            charSequence = c36932b.f158045a;
            f14 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = AbstractC11864n0.f38700a;
            int i610 = i58;
            int i611 = i49;
            if (charSequence == null) {
                c11856j0 = new C11856j0("", 0, false);
                str9 = "";
            } else {
                str9 = "";
                if (charSequence instanceof Spanned) {
                    c11856j0 = new C11856j0(AbstractC11864n0.m31839a(charSequence), 0, false);
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i18 = 0;
                    while (i18 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i18].getBackgroundColor()));
                        i18++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strM8295h2 = AbstractC2875y.m8295h(iIntValue2, "bg_");
                        Iterator it6 = it;
                        String strM8300m2 = AbstractC2875y.m8300m(".", strM8295h2, ",.", strM8295h2, " *");
                        String strM113401X10 = AbstractC35785b.m113401X(iIntValue2);
                        int i612 = AbstractC38065t.f163031a;
                        Locale locale8 = Locale.US;
                        map.put(strM8300m2, str19 + strM113401X10 + str20);
                        it = it6;
                        str4 = str4;
                    }
                    str10 = str4;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i19 = 0;
                    while (i19 < length2) {
                        obj3 = spans[i19];
                        String str210 = str20;
                        z4 = obj3 instanceof StrikethroughSpan;
                        String str211 = null;
                        if (z4) {
                            z13 = z4;
                            strM31996o = "<span style='text-decoration:line-through;'>";
                        } else {
                            z13 = z4;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strM113401X11 = AbstractC35785b.m113401X(((ForegroundColorSpan) obj3).getForegroundColor());
                                int i613 = AbstractC38065t.f163031a;
                                Locale locale9 = Locale.US;
                                strM31996o = AbstractC11895b.m31996o("<span style='color:", strM113401X11, ";'>");
                            } else {
                                str19 = str19;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    int i614 = AbstractC38065t.f163031a;
                                    Locale locale10 = Locale.US;
                                    objArr = spans;
                                    strM31996o = AbstractC2875y.m8296i(backgroundColor2, "<span class='bg_", "'>");
                                } else {
                                    objArr = spans;
                                    if (obj3 instanceof C36935e) {
                                        strM31996o = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f14;
                                        }
                                        Object[] objArr9 = {Float.valueOf(size)};
                                        int i615 = AbstractC38065t.f163031a;
                                        strM31996o = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr9);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr10 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        int i79 = AbstractC38065t.f163031a;
                                        strM31996o = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr10);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            int i710 = AbstractC38065t.f163031a;
                                            Locale locale11 = Locale.US;
                                            strM31996o = AbstractC11895b.m31996o("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strM31996o = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strM31996o = "<b>";
                                        } else if (style != 2) {
                                            strM31996o = "<i>";
                                        } else if (style != 3) {
                                            strM31996o = null;
                                        } else {
                                            strM31996o = "<b><i>";
                                        }
                                    } else if (obj3 instanceof C36937g) {
                                        i29 = ((C36937g) obj3).f158072b;
                                        if (i29 != -1) {
                                            strM31996o = "<ruby style='ruby-position:unset;'>";
                                        } else if (i29 != 1) {
                                            strM31996o = "<ruby style='ruby-position:over;'>";
                                        } else if (i29 != 2) {
                                            strM31996o = null;
                                        } else {
                                            strM31996o = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strM31996o = "<u>";
                                    } else if (obj3 instanceof C36938h) {
                                        c36938h = (C36938h) obj3;
                                        i26 = c36938h.f158076a;
                                        i27 = c36938h.f158077b;
                                        sb5 = new StringBuilder();
                                        if (i27 != 1) {
                                            i28 = 2;
                                            if (i27 == 2) {
                                                sb5.append("open ");
                                            }
                                        } else {
                                            i28 = 2;
                                            sb5.append("filled ");
                                        }
                                        if (i26 != 0) {
                                            sb5.append("none");
                                        } else if (i26 != 1) {
                                            sb5.append("circle");
                                        } else if (i26 != i28) {
                                            sb5.append("dot");
                                        } else if (i26 != 3) {
                                            sb5.append("unset");
                                        } else {
                                            sb5.append("sesame");
                                        }
                                        String string2 = sb5.toString();
                                        if (c36938h.f158078c != 2) {
                                            str12 = "over right";
                                        } else {
                                            str12 = "under left";
                                        }
                                        Object[] objArr11 = {string2, str12};
                                        int i711 = AbstractC38065t.f163031a;
                                        strM31996o = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr11);
                                    } else {
                                        strM31996o = null;
                                    }
                                }
                            }
                            if (z13) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strM31996o != null) {
                                str13.getClass();
                                C11860l0 c11860l2 = new C11860l0(spanStart, spanEnd, strM31996o, str13);
                                c11862m0 = (C11862m0) sparseArray.get(spanStart);
                                if (c11862m0 == null) {
                                    c11862m0 = new C11862m0();
                                    sparseArray.put(spanStart, c11862m0);
                                }
                                c11862m0.f38698a.add(c11860l2);
                                c11862m1 = (C11862m0) sparseArray.get(spanEnd);
                                if (c11862m1 == null) {
                                    c11862m1 = new C11862m0();
                                    sparseArray.put(spanEnd, c11862m1);
                                }
                                c11862m1.f38699b.add(c11860l2);
                            }
                            i19++;
                            str20 = str210;
                            str19 = str19;
                            spans = objArr;
                        }
                        objArr = spans;
                        if (z13) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strM31996o != null) {
                            str13.getClass();
                            C11860l0 c11860l3 = new C11860l0(spanStart, spanEnd, strM31996o, str13);
                            c11862m0 = (C11862m0) sparseArray.get(spanStart);
                            if (c11862m0 == null) {
                                c11862m0 = new C11862m0();
                                sparseArray.put(spanStart, c11862m0);
                            }
                            c11862m0.f38698a.add(c11860l3);
                            c11862m1 = (C11862m0) sparseArray.get(spanEnd);
                            if (c11862m1 == null) {
                                c11862m1 = new C11862m0();
                                sparseArray.put(spanEnd, c11862m1);
                            }
                            c11862m1.f38699b.add(c11860l3);
                        }
                        i19++;
                        str20 = str210;
                        str19 = str19;
                        spans = objArr;
                    }
                    str20 = str20;
                    str11 = str19;
                    sb4 = new StringBuilder(spanned.length());
                    i24 = 0;
                    i25 = 0;
                    while (i24 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i24);
                        sb4.append(AbstractC11864n0.m31839a(spanned.subSequence(i25, iKeyAt2)));
                        C11862m0 c11862m3 = (C11862m0) sparseArray.get(iKeyAt2);
                        ArrayList arrayList3 = c11862m3.f38699b;
                        ArrayList arrayList4 = c11862m3.f38698a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList3, C11860l0.f38692f);
                        it3 = c11862m3.f38699b.iterator();
                        while (it3.hasNext()) {
                            sb4.append(((C11860l0) it3.next()).f38696d);
                        }
                        Collections.sort(arrayList4, C11860l0.f38691e);
                        it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            sb4.append(((C11860l0) it4.next()).f38695c);
                        }
                        i24++;
                        i25 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb4.append(AbstractC11864n0.m31839a(spanned.subSequence(i25, spanned.length())));
                    c11856j0 = new C11856j0(sb4.toString(), 0, false);
                }
                str14 = c11856j0.f38685x;
                while (r4.hasNext()) {
                    str18 = (String) map2.put(str26, (String) map2.get(str26));
                    if (str18 != null) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    AbstractC35849g.m113807i(z14);
                }
                Integer numValueOf7 = Integer.valueOf(i611);
                Float fValueOf4 = Float.valueOf(f18);
                Integer numValueOf8 = Integer.valueOf(i610);
                Integer numValueOf9 = Integer.valueOf(i57);
                f15 = c36932b.f158061q;
                if (f15 != 0.0f) {
                    if (i55 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr12 = {str17, Float.valueOf(f15)};
                    int i712 = AbstractC38065t.f163031a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                } else {
                    str15 = str9;
                }
                sb6.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str7, str2, str29, str27, obj, str28, strM31844b3, strM113401X9, numValueOf8, numValueOf9, str15));
                sb6.append("<span class='default_bg'>");
                alignment2 = c36932b.f158047c;
                if (alignment2 != null) {
                    i34 = AbstractC11878u0.f38763a[alignment2.ordinal()];
                    if (i34 != 1) {
                        i38 = 2;
                        if (i34 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str10;
                        }
                    } else {
                        i38 = 2;
                        str16 = "start";
                    }
                    sb6.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb6.append(str14);
                    sb6.append("</span>");
                } else {
                    i38 = 2;
                    sb6.append(str14);
                }
                sb6.append("</span></div>");
                i49 = i611 + 1;
                f16 = f19;
                str20 = str20;
                str19 = str11;
                i35 = 0;
                i39 = 1;
            }
            str11 = str19;
            str10 = "end";
            str14 = c11856j0.f38685x;
            while (r4.hasNext()) {
                str18 = (String) map2.put(str26, (String) map2.get(str26));
                if (str18 != null) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                AbstractC35849g.m113807i(z14);
            }
            Integer numValueOf10 = Integer.valueOf(i611);
            Float fValueOf5 = Float.valueOf(f18);
            Integer numValueOf11 = Integer.valueOf(i610);
            Integer numValueOf12 = Integer.valueOf(i57);
            f15 = c36932b.f158061q;
            if (f15 != 0.0f) {
                if (i55 != 2) {
                    str17 = "skewY";
                } else {
                    str17 = "skewY";
                }
                Object[] objArr13 = {str17, Float.valueOf(f15)};
                int i713 = AbstractC38065t.f163031a;
                str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr13);
            } else {
                str15 = str9;
            }
            sb6.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str7, str2, str29, str27, obj, str28, strM31844b3, strM113401X9, numValueOf11, numValueOf12, str15));
            sb6.append("<span class='default_bg'>");
            alignment2 = c36932b.f158047c;
            if (alignment2 != null) {
                i34 = AbstractC11878u0.f38763a[alignment2.ordinal()];
                if (i34 != 1) {
                    i38 = 2;
                    if (i34 != 2) {
                        str16 = "center";
                    } else {
                        str16 = str10;
                    }
                } else {
                    i38 = 2;
                    str16 = "start";
                }
                sb6.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                sb6.append(str14);
                sb6.append("</span>");
            } else {
                i38 = 2;
                sb6.append(str14);
            }
            sb6.append("</span></div>");
            i49 = i611 + 1;
            f16 = f19;
            str20 = str20;
            str19 = str11;
            i35 = 0;
            i39 = 1;
        }
        sb6.append("</div></body></html>");
        StringBuilder sb8 = new StringBuilder("<html><head><style>");
        for (String str30 : map2.keySet()) {
            sb8.append(str30);
            sb8.append("{");
            sb8.append((String) map2.get(str30));
            sb8.append("}");
        }
        sb8.append("</style></head>");
        sb6.insert(0, sb8.toString());
        this.f38770x.loadData(Base64.encodeToString(sb6.toString().getBytes(StandardCharsets.UTF_8), 1), MimeType.MIME_TYPE_HTML, "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        if (!z4 || this.f38771y.isEmpty()) {
            return;
        }
        m31845c();
    }
}
