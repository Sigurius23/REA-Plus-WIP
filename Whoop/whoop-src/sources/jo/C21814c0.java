package jo;

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
import bo.C3499a;
import bo.C3501c;
import bo.C3502d;
import com.iterable.iterableapi.C5332h2;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p031b9.AbstractC2875y;
import p087db.C11856j0;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12314q;
import p108e4.AbstractC12667a;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p621xn.C38465b;
import p658yr.AbstractC39717d;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: jo.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C21814c0 extends FrameLayout implements InterfaceC21837z {

    /* JADX INFO: renamed from: E */
    public float f84077E;

    /* JADX INFO: renamed from: F */
    public float f84078F;

    /* JADX INFO: renamed from: w */
    public final C21813c f84079w;

    /* JADX INFO: renamed from: x */
    public final C5332h2 f84080x;

    /* JADX INFO: renamed from: y */
    public List f84081y;

    /* JADX INFO: renamed from: z */
    public C21815d f84082z;

    public C21814c0(Context context) {
        super(context, null);
        this.f84081y = Collections.EMPTY_LIST;
        this.f84082z = C21815d.f84083g;
        this.f84077E = 0.0533f;
        this.f84078F = 0.08f;
        C21813c c21813c = new C21813c(context, 0);
        this.f84079w = c21813c;
        C5332h2 c5332h2 = new C5332h2(context, null, 2);
        this.f84080x = c5332h2;
        c5332h2.setBackgroundColor(0);
        addView(c21813c);
        addView(c5332h2);
    }

    @Override // jo.InterfaceC21837z
    /* JADX INFO: renamed from: a */
    public final void mo61742a(List list, C21815d c21815d, float f13, float f14) {
        this.f84082z = c21815d;
        this.f84077E = f13;
        this.f84078F = f14;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            C38465b c38465b = (C38465b) list.get(i13);
            if (c38465b.f164741z != null) {
                arrayList.add(c38465b);
            } else {
                arrayList2.add(c38465b);
            }
        }
        if (!this.f84081y.isEmpty() || !arrayList2.isEmpty()) {
            this.f84081y = arrayList2;
            m61744c();
        }
        this.f84079w.mo61742a(arrayList, c21815d, f13, f14);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final String m61743b(float f13, int i13) {
        float fM35445Q = AbstractC12667a.m35445Q(f13, i13, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fM35445Q == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fM35445Q / getContext().getResources().getDisplayMetrics().density)};
        int i14 = AbstractC24567y.f95875a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0245  */
    /* JADX WARN: Code duplicated, block: B:106:0x024e  */
    /* JADX WARN: Code duplicated, block: B:107:0x025c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0277 A[LOOP:2: B:108:0x0275->B:109:0x0277, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x029a A[LOOP:3: B:111:0x0294->B:113:0x029a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:121:0x030c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0312  */
    /* JADX WARN: Code duplicated, block: B:124:0x032a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0330  */
    /* JADX WARN: Code duplicated, block: B:127:0x0346  */
    /* JADX WARN: Code duplicated, block: B:129:0x034c  */
    /* JADX WARN: Code duplicated, block: B:130:0x034f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0353  */
    /* JADX WARN: Code duplicated, block: B:134:0x035c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0362  */
    /* JADX WARN: Code duplicated, block: B:137:0x037c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0380  */
    /* JADX WARN: Code duplicated, block: B:140:0x039d  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:144:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:169:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0400  */
    /* JADX WARN: Code duplicated, block: B:172:0x0404  */
    /* JADX WARN: Code duplicated, block: B:173:0x0408  */
    /* JADX WARN: Code duplicated, block: B:175:0x040c  */
    /* JADX WARN: Code duplicated, block: B:177:0x041f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0423  */
    /* JADX WARN: Code duplicated, block: B:181:0x0429  */
    /* JADX WARN: Code duplicated, block: B:183:0x0431  */
    /* JADX WARN: Code duplicated, block: B:185:0x0434 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0436  */
    /* JADX WARN: Code duplicated, block: B:188:0x0439  */
    /* JADX WARN: Code duplicated, block: B:189:0x043d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0443  */
    /* JADX WARN: Code duplicated, block: B:191:0x0449  */
    /* JADX WARN: Code duplicated, block: B:192:0x044f  */
    /* JADX WARN: Code duplicated, block: B:195:0x045d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0460  */
    /* JADX WARN: Code duplicated, block: B:199:0x0472  */
    /* JADX WARN: Code duplicated, block: B:211:0x048a  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:243:0x050f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0524  */
    /* JADX WARN: Code duplicated, block: B:252:0x0557  */
    /* JADX WARN: Code duplicated, block: B:255:0x0583 A[LOOP:6: B:253:0x057d->B:255:0x0583, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x059e A[LOOP:7: B:257:0x0598->B:259:0x059e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x05db  */
    /* JADX WARN: Code duplicated, block: B:267:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:271:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:275:0x0617  */
    /* JADX WARN: Code duplicated, block: B:277:0x061a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0621  */
    /* JADX WARN: Code duplicated, block: B:284:0x063c  */
    /* JADX WARN: Code duplicated, block: B:287:0x0657  */
    /* JADX WARN: Code duplicated, block: B:289:0x0662  */
    /* JADX WARN: Code duplicated, block: B:291:0x0665  */
    /* JADX WARN: Code duplicated, block: B:292:0x0668  */
    /* JADX WARN: Code duplicated, block: B:293:0x066b  */
    /* JADX WARN: Code duplicated, block: B:295:0x0689  */
    /* JADX WARN: Code duplicated, block: B:313:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0176  */
    /* JADX WARN: Code duplicated, block: B:57:0x0189  */
    /* JADX WARN: Code duplicated, block: B:60:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x019b  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0209  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x029a, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m61744c() {
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
        int i18;
        String str10;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i19;
        HashMap map;
        Iterator it;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i24;
        String str11;
        String str12;
        String str13;
        StringBuilder sb4;
        int i25;
        int i26;
        C11856j0 c11856j0;
        Iterator it3;
        Iterator it4;
        Object obj3;
        boolean z4;
        boolean z13;
        int i27;
        C3502d c3502d;
        int i28;
        int i29;
        StringBuilder sb5;
        int i34;
        String str14;
        String strM31996o;
        int i35;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str15;
        int spanStart;
        int spanEnd;
        C21819h c21819h;
        C21819h c21819h2;
        String str16;
        float f15;
        String str17;
        Layout.Alignment alignment2;
        int i36;
        String str18;
        String str19;
        String str20;
        boolean z14;
        StringBuilder sb6 = new StringBuilder();
        String strM34320L = AbstractC12314q.m34320L(this.f84082z.f84084a);
        int i37 = 0;
        String strM61743b = m61743b(this.f84077E, 0);
        float f16 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        C21815d c21815d = this.f84082z;
        int i38 = c21815d.f84087d;
        int i39 = c21815d.f84088e;
        int i44 = 2;
        int i45 = 1;
        if (i38 == 1) {
            Object[] objArr = {AbstractC12314q.m34320L(i39)};
            int i46 = AbstractC24567y.f95875a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        } else if (i38 == 2) {
            String strM34320L2 = AbstractC12314q.m34320L(i39);
            int i47 = AbstractC24567y.f95875a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strM34320L2);
        } else if (i38 == 3) {
            String strM34320L3 = AbstractC12314q.m34320L(i39);
            int i48 = AbstractC24567y.f95875a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strM34320L3);
        } else if (i38 != 4) {
            strConcat = "unset";
        } else {
            String strM34320L4 = AbstractC12314q.m34320L(i39);
            int i49 = AbstractC24567y.f95875a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strM34320L4);
        }
        Object[] objArr2 = {strM34320L, strM61743b, fValueOf, strConcat};
        int i54 = AbstractC24567y.f95875a;
        sb6.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap map2 = new HashMap();
        String strM34339s = AbstractC12314q.m34339s("default_bg");
        String strM34320L5 = AbstractC12314q.m34320L(this.f84082z.f84085b);
        String str21 = "background-color:";
        StringBuilder sb7 = new StringBuilder("background-color:");
        sb7.append(strM34320L5);
        String str22 = ";";
        sb7.append(";");
        map2.put(strM34339s, sb7.toString());
        int i55 = 0;
        while (i55 < this.f84081y.size()) {
            C38465b c38465b = (C38465b) this.f84081y.get(i55);
            float f17 = c38465b.f164728H;
            int i56 = c38465b.f164727G;
            int i57 = c38465b.f164736P;
            float f18 = f17 != -3.4028235E38f ? f17 * 100.0f : 50.0f;
            float f19 = f16;
            int i58 = c38465b.f164729I;
            int i59 = -100;
            int i64 = i58 != i45 ? i58 != i44 ? i37 : -100 : -50;
            float f24 = c38465b.f164725E;
            if (f24 != -3.4028235E38f) {
                if (c38465b.f164726F != i45) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f24 * 100.0f));
                    if (i57 == i45) {
                        i59 = -(i56 != i45 ? i56 != 2 ? 0 : -100 : -50);
                    } else {
                        i59 = i56 != i45 ? i56 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    if (f24 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f24 * f19));
                        i13 = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f24) - 1.0f) * f19));
                        i13 = i45;
                    }
                    i59 = 0;
                }
                f13 = c38465b.f164730J;
                if (f13 != -3.4028235E38f) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f13 * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str23 = str3;
                alignment = c38465b.f164739x;
                str4 = "end";
                if (alignment == null) {
                    i16 = i45;
                    obj = "center";
                    i15 = 2;
                } else {
                    i14 = AbstractC21812b0.f84071a[alignment.ordinal()];
                    if (i14 != i45) {
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
                if (i57 != i16) {
                    str5 = "vertical-rl";
                } else if (i57 != i15) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String str24 = str5;
                String strM61743b2 = m61743b(c38465b.f164735O, c38465b.f164734N);
                if (c38465b.f164732L) {
                    i17 = c38465b.f164733M;
                } else {
                    i17 = this.f84082z.f84086c;
                }
                String strM34320L6 = AbstractC12314q.m34320L(i17);
                str6 = "right";
                int i65 = i55;
                if (i57 != 1) {
                    if (i13 != 0) {
                        str6 = "left";
                    }
                    str7 = str6;
                    obj2 = "top";
                } else if (i57 != 2) {
                    str7 = i13 != 0 ? "bottom" : "top";
                    obj2 = "left";
                } else {
                    if (i13 == 0) {
                        str6 = "left";
                    }
                    str7 = str6;
                    obj2 = "top";
                }
                if (i57 != 2 || i57 == 1) {
                    str8 = "height";
                    int i66 = i59;
                    i59 = i64;
                    i64 = i66;
                } else {
                    str8 = "width";
                }
                String str25 = str8;
                charSequence = c38465b.f164738w;
                f14 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = AbstractC21820i.f84140a;
                str9 = "";
                if (charSequence == null) {
                    i18 = i64;
                    str10 = "start";
                    c11856j0 = new C11856j0("", 5, false);
                } else {
                    i18 = i64;
                    str10 = "start";
                    if (charSequence instanceof Spanned) {
                        str9 = "";
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i19 = 0;
                        while (i19 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i19].getBackgroundColor()));
                            i19++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            Iterator it5 = it;
                            StringBuilder sb8 = new StringBuilder(14);
                            sb8.append("bg_");
                            sb8.append(iIntValue);
                            String strM34339s2 = AbstractC12314q.m34339s(sb8.toString());
                            String strM34320L7 = AbstractC12314q.m34320L(iIntValue);
                            int i67 = AbstractC24567y.f95875a;
                            Locale locale4 = Locale.US;
                            map.put(strM34339s2, str21 + strM34320L7 + str22);
                            it = it5;
                        }
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        length2 = spans.length;
                        i24 = 0;
                        while (i24 < length2) {
                            Object[] objArr3 = spans;
                            obj3 = objArr3[i24];
                            String str26 = str22;
                            z4 = obj3 instanceof StrikethroughSpan;
                            String string = null;
                            if (z4) {
                                z13 = z4;
                                strM31996o = "<span style='text-decoration:line-through;'>";
                            } else {
                                z13 = z4;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strM34320L8 = AbstractC12314q.m34320L(((ForegroundColorSpan) obj3).getForegroundColor());
                                    int i68 = AbstractC24567y.f95875a;
                                    Locale locale5 = Locale.US;
                                    strM31996o = AbstractC11895b.m31996o("<span style='color:", strM34320L8, ";'>");
                                } else {
                                    str21 = str21;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        int i69 = AbstractC24567y.f95875a;
                                        Locale locale6 = Locale.US;
                                        i27 = length2;
                                        strM31996o = AbstractC2875y.m8296i(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        i27 = length2;
                                        if (obj3 instanceof C3499a) {
                                            strM31996o = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f14;
                                            }
                                            Object[] objArr4 = {Float.valueOf(size)};
                                            int i74 = AbstractC24567y.f95875a;
                                            strM31996o = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            int i75 = AbstractC24567y.f95875a;
                                            strM31996o = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                int i76 = AbstractC24567y.f95875a;
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
                                        } else if (obj3 instanceof C3501c) {
                                            i35 = ((C3501c) obj3).f13900b;
                                            if (i35 != -1) {
                                                strM31996o = "<ruby style='ruby-position:unset;'>";
                                            } else if (i35 != 1) {
                                                strM31996o = "<ruby style='ruby-position:over;'>";
                                            } else if (i35 != 2) {
                                                strM31996o = null;
                                            } else {
                                                strM31996o = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strM31996o = "<u>";
                                        } else if (obj3 instanceof C3502d) {
                                            c3502d = (C3502d) obj3;
                                            i28 = c3502d.f13901a;
                                            i29 = c3502d.f13902b;
                                            sb5 = new StringBuilder();
                                            if (i29 != 1) {
                                                i34 = 2;
                                                if (i29 == 2) {
                                                    sb5.append("open ");
                                                }
                                            } else {
                                                i34 = 2;
                                                sb5.append("filled ");
                                            }
                                            if (i28 != 0) {
                                                sb5.append("none");
                                            } else if (i28 != 1) {
                                                sb5.append("circle");
                                            } else if (i28 != i34) {
                                                sb5.append("dot");
                                            } else if (i28 != 3) {
                                                sb5.append("unset");
                                            } else {
                                                sb5.append("sesame");
                                            }
                                            String string2 = sb5.toString();
                                            if (c3502d.f13903c != 2) {
                                                str14 = "over right";
                                            } else {
                                                str14 = "under left";
                                            }
                                            Object[] objArr6 = {string2, str14};
                                            int i77 = AbstractC24567y.f95875a;
                                            strM31996o = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                        } else {
                                            strM31996o = null;
                                        }
                                    }
                                }
                                if (z13 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof C3499a) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof C3502d)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str15 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                string = "</b>";
                                            } else if (style2 == 2) {
                                                string = "</i>";
                                            } else if (style2 == 3) {
                                                string = "</i></b>";
                                            }
                                        } else if (obj3 instanceof C3501c) {
                                            String strM61751a = AbstractC21820i.m61751a(((C3501c) obj3).f13899a);
                                            StringBuilder sb9 = new StringBuilder(AbstractC30007c.m91832b(16, strM61751a));
                                            sb9.append("<rt>");
                                            sb9.append(strM61751a);
                                            sb9.append("</rt></ruby>");
                                            string = sb9.toString();
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            string = "</u>";
                                        }
                                        str15 = string;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strM31996o != null) {
                                    str15.getClass();
                                    C21818g c21818g = new C21818g(spanStart, spanEnd, strM31996o, str15);
                                    c21819h = (C21819h) sparseArray.get(spanStart);
                                    if (c21819h == null) {
                                        c21819h = new C21819h();
                                        sparseArray.put(spanStart, c21819h);
                                    }
                                    c21819h.f84138a.add(c21818g);
                                    c21819h2 = (C21819h) sparseArray.get(spanEnd);
                                    if (c21819h2 == null) {
                                        c21819h2 = new C21819h();
                                        sparseArray.put(spanEnd, c21819h2);
                                    }
                                    c21819h2.f84139b.add(c21818g);
                                }
                                i24++;
                                spans = objArr3;
                                str22 = str26;
                                str21 = str21;
                                length2 = i27;
                                str4 = str4;
                            }
                            i27 = length2;
                            str15 = z13 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strM31996o != null) {
                                str15.getClass();
                                C21818g c21818g2 = new C21818g(spanStart, spanEnd, strM31996o, str15);
                                c21819h = (C21819h) sparseArray.get(spanStart);
                                if (c21819h == null) {
                                    c21819h = new C21819h();
                                    sparseArray.put(spanStart, c21819h);
                                }
                                c21819h.f84138a.add(c21818g2);
                                c21819h2 = (C21819h) sparseArray.get(spanEnd);
                                if (c21819h2 == null) {
                                    c21819h2 = new C21819h();
                                    sparseArray.put(spanEnd, c21819h2);
                                }
                                c21819h2.f84139b.add(c21818g2);
                            }
                            i24++;
                            spans = objArr3;
                            str22 = str26;
                            str21 = str21;
                            length2 = i27;
                            str4 = str4;
                        }
                        str11 = str22;
                        str12 = str21;
                        str13 = str4;
                        sb4 = new StringBuilder(spanned.length());
                        i25 = 0;
                        i26 = 0;
                        while (i25 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i25);
                            sb4.append(AbstractC21820i.m61751a(spanned.subSequence(i26, iKeyAt)));
                            C21819h c21819h3 = (C21819h) sparseArray.get(iKeyAt);
                            ArrayList arrayList = c21819h3.f84139b;
                            ArrayList arrayList2 = c21819h3.f84138a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, C21818g.f84133f);
                            it3 = c21819h3.f84139b.iterator();
                            while (it3.hasNext()) {
                                sb4.append(((C21818g) it3.next()).f84137d);
                            }
                            Collections.sort(arrayList2, C21818g.f84132e);
                            it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                sb4.append(((C21818g) it4.next()).f84136c);
                            }
                            i25++;
                            i26 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb4.append(AbstractC21820i.m61751a(spanned.subSequence(i26, spanned.length())));
                        c11856j0 = new C11856j0(sb4.toString(), 5, false);
                    } else {
                        c11856j0 = new C11856j0(AbstractC21820i.m61751a(charSequence), 5, false);
                    }
                    str16 = c11856j0.f38685x;
                    for (String str27 : map2.keySet()) {
                        str20 = (String) map2.put(str27, (String) map2.get(str27));
                        if (str20 != null || str20.equals(map2.get(str27))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        AbstractC24543a.m71573i(z14);
                    }
                    Integer numValueOf = Integer.valueOf(i65);
                    Float fValueOf2 = Float.valueOf(f18);
                    Integer numValueOf2 = Integer.valueOf(i18);
                    Integer numValueOf3 = Integer.valueOf(i59);
                    f15 = c38465b.f164737Q;
                    if (f15 != 0.0f) {
                        if (i57 != 2 || i57 == 1) {
                            str19 = "skewY";
                        } else {
                            str19 = "skewX";
                        }
                        Object[] objArr7 = {str19, Float.valueOf(f15)};
                        int i78 = AbstractC24567y.f95875a;
                        str17 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                    } else {
                        str17 = str9;
                    }
                    sb6.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str7, str2, str25, str23, obj, str24, strM61743b2, strM34320L6, numValueOf2, numValueOf3, str17));
                    sb6.append("<span class='default_bg'>");
                    alignment2 = c38465b.f164740y;
                    if (alignment2 != null) {
                        i36 = AbstractC21812b0.f84071a[alignment2.ordinal()];
                        if (i36 != 1) {
                            i44 = 2;
                            if (i36 != 2) {
                                str18 = "center";
                            } else {
                                str18 = str13;
                            }
                        } else {
                            i44 = 2;
                            str18 = str10;
                        }
                        sb6.append("<span style='display:inline-block; text-align:" + str18 + ";'>");
                        sb6.append(str16);
                        sb6.append("</span>");
                    } else {
                        i44 = 2;
                        sb6.append(str16);
                    }
                    sb6.append("</span></div>");
                    i55 = i65 + 1;
                    f16 = f19;
                    str22 = str11;
                    str21 = str12;
                    i37 = 0;
                    i45 = 1;
                }
                str11 = str22;
                str12 = str21;
                str13 = "end";
                str16 = c11856j0.f38685x;
                while (r4.hasNext()) {
                    str20 = (String) map2.put(str27, (String) map2.get(str27));
                    if (str20 != null) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    AbstractC24543a.m71573i(z14);
                }
                Integer numValueOf4 = Integer.valueOf(i65);
                Float fValueOf3 = Float.valueOf(f18);
                Integer numValueOf5 = Integer.valueOf(i18);
                Integer numValueOf6 = Integer.valueOf(i59);
                f15 = c38465b.f164737Q;
                if (f15 != 0.0f) {
                    if (i57 != 2) {
                        str19 = "skewY";
                    } else {
                        str19 = "skewY";
                    }
                    Object[] objArr8 = {str19, Float.valueOf(f15)};
                    int i79 = AbstractC24567y.f95875a;
                    str17 = String.format(Locale.US, "%s(%.2fdeg)", objArr8);
                } else {
                    str17 = str9;
                }
                sb6.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str7, str2, str25, str23, obj, str24, strM61743b2, strM34320L6, numValueOf5, numValueOf6, str17));
                sb6.append("<span class='default_bg'>");
                alignment2 = c38465b.f164740y;
                if (alignment2 != null) {
                    i36 = AbstractC21812b0.f84071a[alignment2.ordinal()];
                    if (i36 != 1) {
                        i44 = 2;
                        if (i36 != 2) {
                            str18 = "center";
                        } else {
                            str18 = str13;
                        }
                    } else {
                        i44 = 2;
                        str18 = str10;
                    }
                    sb6.append("<span style='display:inline-block; text-align:" + str18 + ";'>");
                    sb6.append(str16);
                    sb6.append("</span>");
                } else {
                    i44 = 2;
                    sb6.append(str16);
                }
                sb6.append("</span></div>");
                i55 = i65 + 1;
                f16 = f19;
                str22 = str11;
                str21 = str12;
                i37 = 0;
                i45 = 1;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f84078F) * 100.0f));
            }
            str2 = str;
            i13 = 0;
            f13 = c38465b.f164730J;
            if (f13 != -3.4028235E38f) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f13 * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str28 = str3;
            alignment = c38465b.f164739x;
            str4 = "end";
            if (alignment == null) {
                i16 = i45;
                obj = "center";
                i15 = 2;
            } else {
                i14 = AbstractC21812b0.f84071a[alignment.ordinal()];
                if (i14 != i45) {
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
            if (i57 != i16) {
                str5 = "vertical-rl";
            } else if (i57 != i15) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String str29 = str5;
            String strM61743b3 = m61743b(c38465b.f164735O, c38465b.f164734N);
            if (c38465b.f164732L) {
                i17 = c38465b.f164733M;
            } else {
                i17 = this.f84082z.f84086c;
            }
            String strM34320L9 = AbstractC12314q.m34320L(i17);
            str6 = "right";
            int i610 = i55;
            if (i57 != 1) {
                if (i13 != 0) {
                    str6 = "left";
                }
                str7 = str6;
                obj2 = "top";
            } else if (i57 != 2) {
                str7 = i13 != 0 ? "bottom" : "top";
                obj2 = "left";
            } else {
                if (i13 == 0) {
                    str6 = "left";
                }
                str7 = str6;
                obj2 = "top";
            }
            if (i57 != 2) {
                str8 = "height";
                int i611 = i59;
                i59 = i64;
                i64 = i611;
            } else {
                str8 = "height";
                int i612 = i59;
                i59 = i64;
                i64 = i612;
            }
            String str210 = str8;
            charSequence = c38465b.f164738w;
            f14 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = AbstractC21820i.f84140a;
            str9 = "";
            if (charSequence == null) {
                i18 = i64;
                str10 = "start";
                c11856j0 = new C11856j0("", 5, false);
            } else {
                i18 = i64;
                str10 = "start";
                if (charSequence instanceof Spanned) {
                    c11856j0 = new C11856j0(AbstractC21820i.m61751a(charSequence), 5, false);
                } else {
                    str9 = "";
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i19 = 0;
                    while (i19 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i19].getBackgroundColor()));
                        i19++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        Iterator it6 = it;
                        StringBuilder sb10 = new StringBuilder(14);
                        sb10.append("bg_");
                        sb10.append(iIntValue2);
                        String strM34339s3 = AbstractC12314q.m34339s(sb10.toString());
                        String strM34320L10 = AbstractC12314q.m34320L(iIntValue2);
                        int i613 = AbstractC24567y.f95875a;
                        Locale locale8 = Locale.US;
                        map.put(strM34339s3, str21 + strM34320L10 + str22);
                        it = it6;
                    }
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    length2 = spans.length;
                    i24 = 0;
                    while (i24 < length2) {
                        Object[] objArr9 = spans;
                        obj3 = objArr9[i24];
                        String str211 = str22;
                        z4 = obj3 instanceof StrikethroughSpan;
                        String string3 = null;
                        if (z4) {
                            z13 = z4;
                            strM31996o = "<span style='text-decoration:line-through;'>";
                        } else {
                            z13 = z4;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strM34320L11 = AbstractC12314q.m34320L(((ForegroundColorSpan) obj3).getForegroundColor());
                                int i614 = AbstractC24567y.f95875a;
                                Locale locale9 = Locale.US;
                                strM31996o = AbstractC11895b.m31996o("<span style='color:", strM34320L11, ";'>");
                            } else {
                                str21 = str21;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    int i615 = AbstractC24567y.f95875a;
                                    Locale locale10 = Locale.US;
                                    i27 = length2;
                                    strM31996o = AbstractC2875y.m8296i(backgroundColor2, "<span class='bg_", "'>");
                                } else {
                                    i27 = length2;
                                    if (obj3 instanceof C3499a) {
                                        strM31996o = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f14;
                                        }
                                        Object[] objArr10 = {Float.valueOf(size)};
                                        int i710 = AbstractC24567y.f95875a;
                                        strM31996o = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr10);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr11 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        int i711 = AbstractC24567y.f95875a;
                                        strM31996o = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr11);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            int i712 = AbstractC24567y.f95875a;
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
                                    } else if (obj3 instanceof C3501c) {
                                        i35 = ((C3501c) obj3).f13900b;
                                        if (i35 != -1) {
                                            strM31996o = "<ruby style='ruby-position:unset;'>";
                                        } else if (i35 != 1) {
                                            strM31996o = "<ruby style='ruby-position:over;'>";
                                        } else if (i35 != 2) {
                                            strM31996o = null;
                                        } else {
                                            strM31996o = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strM31996o = "<u>";
                                    } else if (obj3 instanceof C3502d) {
                                        c3502d = (C3502d) obj3;
                                        i28 = c3502d.f13901a;
                                        i29 = c3502d.f13902b;
                                        sb5 = new StringBuilder();
                                        if (i29 != 1) {
                                            i34 = 2;
                                            if (i29 == 2) {
                                                sb5.append("open ");
                                            }
                                        } else {
                                            i34 = 2;
                                            sb5.append("filled ");
                                        }
                                        if (i28 != 0) {
                                            sb5.append("none");
                                        } else if (i28 != 1) {
                                            sb5.append("circle");
                                        } else if (i28 != i34) {
                                            sb5.append("dot");
                                        } else if (i28 != 3) {
                                            sb5.append("unset");
                                        } else {
                                            sb5.append("sesame");
                                        }
                                        String string4 = sb5.toString();
                                        if (c3502d.f13903c != 2) {
                                            str14 = "over right";
                                        } else {
                                            str14 = "under left";
                                        }
                                        Object[] objArr12 = {string4, str14};
                                        int i713 = AbstractC24567y.f95875a;
                                        strM31996o = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr12);
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
                                str15.getClass();
                                C21818g c21818g3 = new C21818g(spanStart, spanEnd, strM31996o, str15);
                                c21819h = (C21819h) sparseArray.get(spanStart);
                                if (c21819h == null) {
                                    c21819h = new C21819h();
                                    sparseArray.put(spanStart, c21819h);
                                }
                                c21819h.f84138a.add(c21818g3);
                                c21819h2 = (C21819h) sparseArray.get(spanEnd);
                                if (c21819h2 == null) {
                                    c21819h2 = new C21819h();
                                    sparseArray.put(spanEnd, c21819h2);
                                }
                                c21819h2.f84139b.add(c21818g3);
                            }
                            i24++;
                            spans = objArr9;
                            str22 = str211;
                            str21 = str21;
                            length2 = i27;
                            str4 = str4;
                        }
                        i27 = length2;
                        if (z13) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strM31996o != null) {
                            str15.getClass();
                            C21818g c21818g4 = new C21818g(spanStart, spanEnd, strM31996o, str15);
                            c21819h = (C21819h) sparseArray.get(spanStart);
                            if (c21819h == null) {
                                c21819h = new C21819h();
                                sparseArray.put(spanStart, c21819h);
                            }
                            c21819h.f84138a.add(c21818g4);
                            c21819h2 = (C21819h) sparseArray.get(spanEnd);
                            if (c21819h2 == null) {
                                c21819h2 = new C21819h();
                                sparseArray.put(spanEnd, c21819h2);
                            }
                            c21819h2.f84139b.add(c21818g4);
                        }
                        i24++;
                        spans = objArr9;
                        str22 = str211;
                        str21 = str21;
                        length2 = i27;
                        str4 = str4;
                    }
                    str11 = str22;
                    str12 = str21;
                    str13 = str4;
                    sb4 = new StringBuilder(spanned.length());
                    i25 = 0;
                    i26 = 0;
                    while (i25 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i25);
                        sb4.append(AbstractC21820i.m61751a(spanned.subSequence(i26, iKeyAt2)));
                        C21819h c21819h4 = (C21819h) sparseArray.get(iKeyAt2);
                        ArrayList arrayList3 = c21819h4.f84139b;
                        ArrayList arrayList4 = c21819h4.f84138a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList3, C21818g.f84133f);
                        it3 = c21819h4.f84139b.iterator();
                        while (it3.hasNext()) {
                            sb4.append(((C21818g) it3.next()).f84137d);
                        }
                        Collections.sort(arrayList4, C21818g.f84132e);
                        it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            sb4.append(((C21818g) it4.next()).f84136c);
                        }
                        i25++;
                        i26 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb4.append(AbstractC21820i.m61751a(spanned.subSequence(i26, spanned.length())));
                    c11856j0 = new C11856j0(sb4.toString(), 5, false);
                }
                str16 = c11856j0.f38685x;
                while (r4.hasNext()) {
                    str20 = (String) map2.put(str27, (String) map2.get(str27));
                    if (str20 != null) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    AbstractC24543a.m71573i(z14);
                }
                Integer numValueOf7 = Integer.valueOf(i610);
                Float fValueOf4 = Float.valueOf(f18);
                Integer numValueOf8 = Integer.valueOf(i18);
                Integer numValueOf9 = Integer.valueOf(i59);
                f15 = c38465b.f164737Q;
                if (f15 != 0.0f) {
                    if (i57 != 2) {
                        str19 = "skewY";
                    } else {
                        str19 = "skewY";
                    }
                    Object[] objArr13 = {str19, Float.valueOf(f15)};
                    int i714 = AbstractC24567y.f95875a;
                    str17 = String.format(Locale.US, "%s(%.2fdeg)", objArr13);
                } else {
                    str17 = str9;
                }
                sb6.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str7, str2, str210, str28, obj, str29, strM61743b3, strM34320L9, numValueOf8, numValueOf9, str17));
                sb6.append("<span class='default_bg'>");
                alignment2 = c38465b.f164740y;
                if (alignment2 != null) {
                    i36 = AbstractC21812b0.f84071a[alignment2.ordinal()];
                    if (i36 != 1) {
                        i44 = 2;
                        if (i36 != 2) {
                            str18 = "center";
                        } else {
                            str18 = str13;
                        }
                    } else {
                        i44 = 2;
                        str18 = str10;
                    }
                    sb6.append("<span style='display:inline-block; text-align:" + str18 + ";'>");
                    sb6.append(str16);
                    sb6.append("</span>");
                } else {
                    i44 = 2;
                    sb6.append(str16);
                }
                sb6.append("</span></div>");
                i55 = i610 + 1;
                f16 = f19;
                str22 = str11;
                str21 = str12;
                i37 = 0;
                i45 = 1;
            }
            str11 = str22;
            str12 = str21;
            str13 = "end";
            str16 = c11856j0.f38685x;
            while (r4.hasNext()) {
                str20 = (String) map2.put(str27, (String) map2.get(str27));
                if (str20 != null) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                AbstractC24543a.m71573i(z14);
            }
            Integer numValueOf10 = Integer.valueOf(i610);
            Float fValueOf5 = Float.valueOf(f18);
            Integer numValueOf11 = Integer.valueOf(i18);
            Integer numValueOf12 = Integer.valueOf(i59);
            f15 = c38465b.f164737Q;
            if (f15 != 0.0f) {
                if (i57 != 2) {
                    str19 = "skewY";
                } else {
                    str19 = "skewY";
                }
                Object[] objArr14 = {str19, Float.valueOf(f15)};
                int i715 = AbstractC24567y.f95875a;
                str17 = String.format(Locale.US, "%s(%.2fdeg)", objArr14);
            } else {
                str17 = str9;
            }
            sb6.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str7, str2, str210, str28, obj, str29, strM61743b3, strM34320L9, numValueOf11, numValueOf12, str17));
            sb6.append("<span class='default_bg'>");
            alignment2 = c38465b.f164740y;
            if (alignment2 != null) {
                i36 = AbstractC21812b0.f84071a[alignment2.ordinal()];
                if (i36 != 1) {
                    i44 = 2;
                    if (i36 != 2) {
                        str18 = "center";
                    } else {
                        str18 = str13;
                    }
                } else {
                    i44 = 2;
                    str18 = str10;
                }
                sb6.append("<span style='display:inline-block; text-align:" + str18 + ";'>");
                sb6.append(str16);
                sb6.append("</span>");
            } else {
                i44 = 2;
                sb6.append(str16);
            }
            sb6.append("</span></div>");
            i55 = i610 + 1;
            f16 = f19;
            str22 = str11;
            str21 = str12;
            i37 = 0;
            i45 = 1;
        }
        sb6.append("</div></body></html>");
        StringBuilder sb11 = new StringBuilder("<html><head><style>");
        for (String str30 : map2.keySet()) {
            sb11.append(str30);
            sb11.append("{");
            sb11.append((String) map2.get(str30));
            sb11.append("}");
        }
        sb11.append("</style></head>");
        sb6.insert(0, sb11.toString());
        this.f84080x.loadData(Base64.encodeToString(sb6.toString().getBytes(AbstractC39717d.f170958c), 1), MimeType.MIME_TYPE_HTML, "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        if (!z4 || this.f84081y.isEmpty()) {
            return;
        }
        m61744c();
    }
}
