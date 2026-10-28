package p294l3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import kk1.C22541b;
import m83.C25271y;
import p002a0.C0030i1;
import p027b3.AbstractC2378g1;
import p095dp.AbstractC12240d;
import p181h2.C16618c;
import p181h2.C16620e;
import p208i2.AbstractC17876d;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17924z0;
import p208i2.InterfaceC17915v;
import p213i7.C18194g;
import p270k2.AbstractC22132f;
import p318m3.AbstractC24980j;
import p318m3.AbstractC24984n;
import p318m3.C24978h;
import p318m3.C24982l;
import p318m3.C24983m;
import p356o3.C27492b;
import p356o3.C27498h;
import p448r3.AbstractC30895a;
import p493t3.AbstractC33490b;
import p493t3.C33489a;
import p493t3.C33491c;
import p493t3.C33492d;
import p542v3.C35591d;
import p571w3.C36776l;
import p571w3.EnumC36774j;
import p636y3.C39169a;
import p636y3.C39183o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: l3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C23242a {

    /* JADX INFO: renamed from: a */
    public final C33491c f92098a;

    /* JADX INFO: renamed from: b */
    public final int f92099b;

    /* JADX INFO: renamed from: c */
    public final long f92100c;

    /* JADX INFO: renamed from: d */
    public final C24983m f92101d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f92102e;

    /* JADX INFO: renamed from: f */
    public final Object f92103f;

    /* JADX WARN: Code duplicated, block: B:102:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0198  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:140:0x020f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0211  */
    /* JADX WARN: Code duplicated, block: B:143:0x022d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0247  */
    /* JADX WARN: Code duplicated, block: B:148:0x0251 A[LOOP:1: B:146:0x024b->B:148:0x0251, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x027e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0282  */
    /* JADX WARN: Code duplicated, block: B:154:0x029a  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:160:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:163:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0119  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:96:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    public C23242a(C33491c c33491c, int i13, int i14, long j7) {
        int i15;
        CharSequence charSequence;
        int i16;
        int i17;
        int i18;
        char c3;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        C24983m c24983mM67289a;
        int i19;
        int i24;
        C23242a c23242a;
        int i25;
        int i26;
        int i27;
        Layout layout;
        Spanned spanned;
        C35591d[] c35591dArr;
        CharSequence charSequence2;
        Spanned spanned2;
        Object[] spans;
        ArrayList arrayList;
        int length;
        int i28;
        Object obj;
        int spanEnd;
        int lineForOffset;
        boolean z4;
        boolean z13;
        boolean z14;
        C16618c c16618c;
        float fM73314h;
        float fM73310d;
        int iM82918b;
        float fM73313g;
        float fM82918b;
        float fM73310d2;
        C0030i1 c0030i1M65777h;
        int i29;
        this.f92098a = c33491c;
        this.f92099b = i13;
        this.f92100c = j7;
        if (C39169a.m124766j(j7) != 0 || C39169a.m124767k(j7) != 0) {
            AbstractC30895a.m95015a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i13 < 1) {
            AbstractC30895a.m95015a("maxLines should be greater than 0");
        }
        C23285v0 c23285v0 = c33491c.f139820b;
        CharSequence charSequence3 = c33491c.f139826h;
        if (i14 == 2) {
            i15 = 0;
            if (!C39183o.m124803a(c23285v0.f92255a.f92198h, AbstractC35745c.m113246h(0)) && !C39183o.m124803a(c23285v0.f92255a.f92198h, C39183o.f168428c) && (i29 = c23285v0.f92256b.f92104a) != Integer.MIN_VALUE && i29 != 5 && i29 != 4 && charSequence3.length() != 0) {
                Spannable spannableString = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                if (spannableString == null) {
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    spannableString = new SpannableString(charSequence3);
                }
                charSequence = charSequence3;
                charSequence = charSequence3;
                Spannable spannable = spannableString;
                boolean zM73306b = AbstractC24980j.m73306b(spannable, C27492b.class);
                charSequence = spannable;
                if (!zM73306b) {
                    spannable.setSpan(new C27492b(), spannable.length() - 1, spannable.length() - 1, 33);
                    charSequence = spannable;
                }
            }
        } else {
            i15 = 0;
            charSequence = charSequence3;
        }
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        CharSequence charSequence4 = charSequence;
        this.f92102e = charSequence4;
        C23245b0 c23245b0 = c23285v0.f92256b;
        C23267m0 c23267m0 = c23285v0.f92255a;
        int i34 = c23245b0.f92104a;
        int i35 = 3;
        int i36 = i34 == 1 ? 3 : i34 == 2 ? 4 : i34 == 3 ? 2 : (i34 != 5 && i34 == 6) ? 1 : i15;
        int i37 = i34 == 4 ? 1 : i15;
        int i38 = c23245b0.f92111h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i15;
        int i39 = c23245b0.f92110g;
        int i44 = i39 & 255;
        if (i44 == 1) {
            i16 = i15;
        } else if (i44 == 2) {
            i16 = 1;
        } else if (i44 == 3) {
            i16 = 2;
        } else {
            i16 = i15;
        }
        int i45 = (i39 >> 8) & 255;
        if (i45 == 1) {
            i35 = i15;
        } else if (i45 == 2) {
            i35 = 1;
        } else if (i45 == 3) {
            i35 = 2;
        } else if (i45 != 4) {
            i35 = i15;
        }
        int i46 = (i39 >> 16) & 255;
        if (i46 != 1) {
            i17 = 2;
            i18 = i46 == 2 ? 1 : i18;
            if (i14 == i17) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i14 == 5) {
                    if (i14 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c3 = ' ';
                        truncateAt = null;
                    }
                    c24983mM67289a = m67289a(i36, i37, truncateAt, i13, i38, i16, i35, i18, charSequence4);
                    Layout layout2 = c24983mM67289a.f97768f;
                    i19 = i36;
                    if (Build.VERSION.SDK_INT < 35 || c33491c.f139825g.getLetterSpacing() == 0.0f || (!(i14 == 4 || i14 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        i24 = 2;
                        c23242a = this;
                        i25 = i13;
                        i26 = i19;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i24 = 2;
                        CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                        C23242a c23242a2 = this;
                        i25 = i13;
                        i26 = i19;
                        c24983mM67289a = c23242a2.m67289a(i26, i37, truncateAt, i25, i38, i16, i35, i18, TextUtils.concat(charSequenceArr));
                        c23242a = c23242a2;
                    }
                    int i47 = c24983mM67289a.f97769g;
                    if (i14 == i24) {
                        i27 = i24;
                        if (c24983mM67289a.m73307a() <= C39169a.m124764h(j7) && i25 > 1) {
                            int iM124764h = C39169a.m124764h(j7);
                            int i48 = 0;
                            while (true) {
                                if (i48 >= i47) {
                                    i48 = i47;
                                    break;
                                } else if (c24983mM67289a.m73311e(i48) > iM124764h) {
                                    break;
                                } else {
                                    i48++;
                                }
                            }
                            if (i48 >= 0 && i48 != c23242a.f92099b) {
                                c24983mM67289a = c23242a.m67289a(i26, i37, truncateAt, i48 < 1 ? 1 : i48, i38, i16, i35, i18, c23242a.f92102e);
                            }
                            c23242a.f92101d = c24983mM67289a;
                        }
                        c23242a.f92098a.f139825g.m105879c(c23267m0.f92191a.mo117876c(), (((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3), c23267m0.f92191a.mo117874a());
                        layout = c23242a.f92101d.f97768f;
                        if (layout.getText() instanceof Spanned) {
                            CharSequence text = layout.getText();
                            AbstractC22676k.m65748h(text, "null cannot be cast to non-null type android.text.Spanned");
                            spanned = (Spanned) text;
                            if (spanned.nextSpanTransition(-1, spanned.length(), C35591d.class) != spanned.length()) {
                                CharSequence text2 = layout.getText();
                                AbstractC22676k.m65748h(text2, "null cannot be cast to non-null type android.text.Spanned");
                                c35591dArr = (C35591d[]) ((Spanned) text2).getSpans(0, layout.getText().length(), C35591d.class);
                            } else {
                                c35591dArr = null;
                            }
                        } else {
                            c35591dArr = null;
                        }
                        if (c35591dArr != null) {
                            c0030i1M65777h = AbstractC22681m0.m65777h(c35591dArr);
                            while (c0030i1M65777h.hasNext()) {
                                ((C35591d) c0030i1M65777h.next()).f151358y.setValue(new C16620e((((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3)));
                            }
                        }
                        charSequence2 = c23242a.f92102e;
                        if (charSequence2 instanceof Spanned) {
                            spanned2 = (Spanned) charSequence2;
                            spans = spanned2.getSpans(0, charSequence2.length(), C27498h.class);
                            arrayList = new ArrayList(spans.length);
                            length = spans.length;
                            i28 = 0;
                            while (i28 < length) {
                                C27498h c27498h = (C27498h) spans[i28];
                                int spanStart = spanned2.getSpanStart(c27498h);
                                spanEnd = spanned2.getSpanEnd(c27498h);
                                lineForOffset = c23242a.f92101d.f97768f.getLineForOffset(spanStart);
                                if (lineForOffset >= c23242a.f92099b) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (c23242a.f92101d.f97768f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= c23242a.f92101d.f97768f.getEllipsisStart(lineForOffset)) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (spanEnd > c23242a.f92101d.m73312f(lineForOffset)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (!z13 || z14 || z4) {
                                    i27 = i27;
                                    c16618c = null;
                                } else {
                                    int iOrdinal = (c23242a.f92101d.f97768f.isRtlCharAt(spanStart) ? EnumC36774j.f157348x : EnumC36774j.f157347w).ordinal();
                                    if (iOrdinal == 0) {
                                        fM73314h = c23242a.f92101d.m73314h(spanStart, false);
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        float fM73314h2 = c23242a.f92101d.m73314h(spanStart, false);
                                        if (!c27498h.f110755J) {
                                            AbstractC30895a.m95017c("PlaceholderSpan is not laid out yet.");
                                        }
                                        fM73314h = fM73314h2 - c27498h.f110753H;
                                    }
                                    if (!c27498h.f110755J) {
                                        AbstractC30895a.m95017c("PlaceholderSpan is not laid out yet.");
                                    }
                                    float f13 = c27498h.f110753H + fM73314h;
                                    C24983m c24983m = c23242a.f92101d;
                                    switch (c27498h.f110751F) {
                                        case 0:
                                            fM73310d = c24983m.m73310d(lineForOffset);
                                            iM82918b = c27498h.m82918b();
                                            fM73313g = fM73310d - iM82918b;
                                            c16618c = new C16618c(fM73314h, fM73313g, f13, c27498h.m82918b() + fM73313g);
                                            break;
                                        case 1:
                                            i27 = i27;
                                            fM73313g = c24983m.m73313g(lineForOffset);
                                            c16618c = new C16618c(fM73314h, fM73313g, f13, c27498h.m82918b() + fM73313g);
                                            break;
                                        case 2:
                                            fM73310d = c24983m.m73311e(lineForOffset);
                                            iM82918b = c27498h.m82918b();
                                            fM73313g = fM73310d - iM82918b;
                                            c16618c = new C16618c(fM73314h, fM73313g, f13, c27498h.m82918b() + fM73313g);
                                            break;
                                        case 3:
                                            i27 = i27;
                                            fM73313g = ((c24983m.m73311e(lineForOffset) + c24983m.m73313g(lineForOffset)) - c27498h.m82918b()) / i27;
                                            c16618c = new C16618c(fM73314h, fM73313g, f13, c27498h.m82918b() + fM73313g);
                                            break;
                                        case 4:
                                            fM82918b = c27498h.m82917a().ascent;
                                            fM73310d2 = c24983m.m73310d(lineForOffset);
                                            fM73313g = fM73310d2 + fM82918b;
                                            i27 = i27;
                                            c16618c = new C16618c(fM73314h, fM73313g, f13, c27498h.m82918b() + fM73313g);
                                            break;
                                        case 5:
                                            fM73313g = (c24983m.m73310d(lineForOffset) + c27498h.m82917a().descent) - c27498h.m82918b();
                                            i27 = i27;
                                            c16618c = new C16618c(fM73314h, fM73313g, f13, c27498h.m82918b() + fM73313g);
                                            break;
                                        case 6:
                                            Paint.FontMetricsInt fontMetricsIntM82917a = c27498h.m82917a();
                                            fM82918b = ((fontMetricsIntM82917a.ascent + fontMetricsIntM82917a.descent) - c27498h.m82918b()) / 2;
                                            fM73310d2 = c24983m.m73310d(lineForOffset);
                                            fM73313g = fM73310d2 + fM82918b;
                                            i27 = i27;
                                            c16618c = new C16618c(fM73314h, fM73313g, f13, c27498h.m82918b() + fM73313g);
                                            break;
                                        default:
                                            throw new IllegalStateException("unexpected verticalAlignment");
                                    }
                                }
                                arrayList.add(c16618c);
                                i28++;
                                i27 = i27;
                            }
                            obj = arrayList;
                        } else {
                            obj = C25271y.f99162w;
                        }
                        c23242a.f92103f = obj;
                    }
                    i27 = i24;
                    c23242a.f92101d = c24983mM67289a;
                    c23242a.f92098a.f139825g.m105879c(c23267m0.f92191a.mo117876c(), (((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3), c23267m0.f92191a.mo117874a());
                    layout = c23242a.f92101d.f97768f;
                    if (layout.getText() instanceof Spanned) {
                        c35591dArr = null;
                    } else {
                        CharSequence text3 = layout.getText();
                        AbstractC22676k.m65748h(text3, "null cannot be cast to non-null type android.text.Spanned");
                        spanned = (Spanned) text3;
                        if (spanned.nextSpanTransition(-1, spanned.length(), C35591d.class) != spanned.length()) {
                            CharSequence text4 = layout.getText();
                            AbstractC22676k.m65748h(text4, "null cannot be cast to non-null type android.text.Spanned");
                            c35591dArr = (C35591d[]) ((Spanned) text4).getSpans(0, layout.getText().length(), C35591d.class);
                        } else {
                            c35591dArr = null;
                        }
                    }
                    if (c35591dArr != null) {
                        c0030i1M65777h = AbstractC22681m0.m65777h(c35591dArr);
                        while (c0030i1M65777h.hasNext()) {
                            ((C35591d) c0030i1M65777h.next()).f151358y.setValue(new C16620e((((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3)));
                        }
                    }
                    charSequence2 = c23242a.f92102e;
                    if (charSequence2 instanceof Spanned) {
                        obj = C25271y.f99162w;
                    } else {
                        spanned2 = (Spanned) charSequence2;
                        spans = spanned2.getSpans(0, charSequence2.length(), C27498h.class);
                        arrayList = new ArrayList(spans.length);
                        length = spans.length;
                        i28 = 0;
                        while (i28 < length) {
                            C27498h c27498h2 = (C27498h) spans[i28];
                            int spanStart2 = spanned2.getSpanStart(c27498h2);
                            spanEnd = spanned2.getSpanEnd(c27498h2);
                            lineForOffset = c23242a.f92101d.f97768f.getLineForOffset(spanStart2);
                            if (lineForOffset >= c23242a.f92099b) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (c23242a.f92101d.f97768f.getEllipsisCount(lineForOffset) > 0) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (spanEnd > c23242a.f92101d.m73312f(lineForOffset)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z13) {
                                i27 = i27;
                                c16618c = null;
                            } else {
                                i27 = i27;
                                c16618c = null;
                            }
                            arrayList.add(c16618c);
                            i28++;
                            i27 = i27;
                        }
                        obj = arrayList;
                    }
                    c23242a.f92103f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c3 = ' ';
            truncateAt = truncateAt2;
            c24983mM67289a = m67289a(i36, i37, truncateAt, i13, i38, i16, i35, i18, charSequence4);
            Layout layout3 = c24983mM67289a.f97768f;
            i19 = i36;
            if (Build.VERSION.SDK_INT < 35) {
                i24 = 2;
                c23242a = this;
                i25 = i13;
                i26 = i19;
            } else {
                i24 = 2;
                c23242a = this;
                i25 = i13;
                i26 = i19;
            }
            int i49 = c24983mM67289a.f97769g;
            if (i14 == i24) {
                i27 = i24;
                if (c24983mM67289a.m73307a() <= C39169a.m124764h(j7)) {
                }
                c23242a.f92098a.f139825g.m105879c(c23267m0.f92191a.mo117876c(), (((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3), c23267m0.f92191a.mo117874a());
                layout = c23242a.f92101d.f97768f;
                if (layout.getText() instanceof Spanned) {
                    c35591dArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    AbstractC22676k.m65748h(text5, "null cannot be cast to non-null type android.text.Spanned");
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), C35591d.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        AbstractC22676k.m65748h(text6, "null cannot be cast to non-null type android.text.Spanned");
                        c35591dArr = (C35591d[]) ((Spanned) text6).getSpans(0, layout.getText().length(), C35591d.class);
                    } else {
                        c35591dArr = null;
                    }
                }
                if (c35591dArr != null) {
                    c0030i1M65777h = AbstractC22681m0.m65777h(c35591dArr);
                    while (c0030i1M65777h.hasNext()) {
                        ((C35591d) c0030i1M65777h.next()).f151358y.setValue(new C16620e((((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3)));
                    }
                }
                charSequence2 = c23242a.f92102e;
                if (charSequence2 instanceof Spanned) {
                    obj = C25271y.f99162w;
                } else {
                    spanned2 = (Spanned) charSequence2;
                    spans = spanned2.getSpans(0, charSequence2.length(), C27498h.class);
                    arrayList = new ArrayList(spans.length);
                    length = spans.length;
                    i28 = 0;
                    while (i28 < length) {
                        C27498h c27498h3 = (C27498h) spans[i28];
                        int spanStart3 = spanned2.getSpanStart(c27498h3);
                        spanEnd = spanned2.getSpanEnd(c27498h3);
                        lineForOffset = c23242a.f92101d.f97768f.getLineForOffset(spanStart3);
                        if (lineForOffset >= c23242a.f92099b) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c23242a.f92101d.f97768f.getEllipsisCount(lineForOffset) > 0) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (spanEnd > c23242a.f92101d.m73312f(lineForOffset)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z13) {
                            i27 = i27;
                            c16618c = null;
                        } else {
                            i27 = i27;
                            c16618c = null;
                        }
                        arrayList.add(c16618c);
                        i28++;
                        i27 = i27;
                    }
                    obj = arrayList;
                }
                c23242a.f92103f = obj;
            }
            i27 = i24;
            c23242a.f92101d = c24983mM67289a;
            c23242a.f92098a.f139825g.m105879c(c23267m0.f92191a.mo117876c(), (((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3), c23267m0.f92191a.mo117874a());
            layout = c23242a.f92101d.f97768f;
            if (layout.getText() instanceof Spanned) {
                c35591dArr = null;
            } else {
                CharSequence text7 = layout.getText();
                AbstractC22676k.m65748h(text7, "null cannot be cast to non-null type android.text.Spanned");
                spanned = (Spanned) text7;
                if (spanned.nextSpanTransition(-1, spanned.length(), C35591d.class) != spanned.length()) {
                    CharSequence text8 = layout.getText();
                    AbstractC22676k.m65748h(text8, "null cannot be cast to non-null type android.text.Spanned");
                    c35591dArr = (C35591d[]) ((Spanned) text8).getSpans(0, layout.getText().length(), C35591d.class);
                } else {
                    c35591dArr = null;
                }
            }
            if (c35591dArr != null) {
                c0030i1M65777h = AbstractC22681m0.m65777h(c35591dArr);
                while (c0030i1M65777h.hasNext()) {
                    ((C35591d) c0030i1M65777h.next()).f151358y.setValue(new C16620e((((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3)));
                }
            }
            charSequence2 = c23242a.f92102e;
            if (charSequence2 instanceof Spanned) {
                obj = C25271y.f99162w;
            } else {
                spanned2 = (Spanned) charSequence2;
                spans = spanned2.getSpans(0, charSequence2.length(), C27498h.class);
                arrayList = new ArrayList(spans.length);
                length = spans.length;
                i28 = 0;
                while (i28 < length) {
                    C27498h c27498h4 = (C27498h) spans[i28];
                    int spanStart4 = spanned2.getSpanStart(c27498h4);
                    spanEnd = spanned2.getSpanEnd(c27498h4);
                    lineForOffset = c23242a.f92101d.f97768f.getLineForOffset(spanStart4);
                    if (lineForOffset >= c23242a.f92099b) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c23242a.f92101d.f97768f.getEllipsisCount(lineForOffset) > 0) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (spanEnd > c23242a.f92101d.m73312f(lineForOffset)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z13) {
                        i27 = i27;
                        c16618c = null;
                    } else {
                        i27 = i27;
                        c16618c = null;
                    }
                    arrayList.add(c16618c);
                    i28++;
                    i27 = i27;
                }
                obj = arrayList;
            }
            c23242a.f92103f = obj;
        }
        i17 = 2;
        i18 = i15;
        if (i14 == i17) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i14 == 5) {
                if (i14 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c3 = ' ';
                    truncateAt = null;
                }
                c24983mM67289a = m67289a(i36, i37, truncateAt, i13, i38, i16, i35, i18, charSequence4);
                Layout layout4 = c24983mM67289a.f97768f;
                i19 = i36;
                if (Build.VERSION.SDK_INT < 35) {
                    i24 = 2;
                    c23242a = this;
                    i25 = i13;
                    i26 = i19;
                } else {
                    i24 = 2;
                    c23242a = this;
                    i25 = i13;
                    i26 = i19;
                }
                int i410 = c24983mM67289a.f97769g;
                if (i14 == i24) {
                    i27 = i24;
                    if (c24983mM67289a.m73307a() <= C39169a.m124764h(j7)) {
                    }
                    c23242a.f92098a.f139825g.m105879c(c23267m0.f92191a.mo117876c(), (((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3), c23267m0.f92191a.mo117874a());
                    layout = c23242a.f92101d.f97768f;
                    if (layout.getText() instanceof Spanned) {
                        c35591dArr = null;
                    } else {
                        CharSequence text9 = layout.getText();
                        AbstractC22676k.m65748h(text9, "null cannot be cast to non-null type android.text.Spanned");
                        spanned = (Spanned) text9;
                        if (spanned.nextSpanTransition(-1, spanned.length(), C35591d.class) != spanned.length()) {
                            CharSequence text10 = layout.getText();
                            AbstractC22676k.m65748h(text10, "null cannot be cast to non-null type android.text.Spanned");
                            c35591dArr = (C35591d[]) ((Spanned) text10).getSpans(0, layout.getText().length(), C35591d.class);
                        } else {
                            c35591dArr = null;
                        }
                    }
                    if (c35591dArr != null) {
                        c0030i1M65777h = AbstractC22681m0.m65777h(c35591dArr);
                        while (c0030i1M65777h.hasNext()) {
                            ((C35591d) c0030i1M65777h.next()).f151358y.setValue(new C16620e((((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3)));
                        }
                    }
                    charSequence2 = c23242a.f92102e;
                    if (charSequence2 instanceof Spanned) {
                        obj = C25271y.f99162w;
                    } else {
                        spanned2 = (Spanned) charSequence2;
                        spans = spanned2.getSpans(0, charSequence2.length(), C27498h.class);
                        arrayList = new ArrayList(spans.length);
                        length = spans.length;
                        i28 = 0;
                        while (i28 < length) {
                            C27498h c27498h5 = (C27498h) spans[i28];
                            int spanStart5 = spanned2.getSpanStart(c27498h5);
                            spanEnd = spanned2.getSpanEnd(c27498h5);
                            lineForOffset = c23242a.f92101d.f97768f.getLineForOffset(spanStart5);
                            if (lineForOffset >= c23242a.f92099b) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (c23242a.f92101d.f97768f.getEllipsisCount(lineForOffset) > 0) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (spanEnd > c23242a.f92101d.m73312f(lineForOffset)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z13) {
                                i27 = i27;
                                c16618c = null;
                            } else {
                                i27 = i27;
                                c16618c = null;
                            }
                            arrayList.add(c16618c);
                            i28++;
                            i27 = i27;
                        }
                        obj = arrayList;
                    }
                    c23242a.f92103f = obj;
                }
                i27 = i24;
                c23242a.f92101d = c24983mM67289a;
                c23242a.f92098a.f139825g.m105879c(c23267m0.f92191a.mo117876c(), (((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3), c23267m0.f92191a.mo117874a());
                layout = c23242a.f92101d.f97768f;
                if (layout.getText() instanceof Spanned) {
                    c35591dArr = null;
                } else {
                    CharSequence text11 = layout.getText();
                    AbstractC22676k.m65748h(text11, "null cannot be cast to non-null type android.text.Spanned");
                    spanned = (Spanned) text11;
                    if (spanned.nextSpanTransition(-1, spanned.length(), C35591d.class) != spanned.length()) {
                        CharSequence text12 = layout.getText();
                        AbstractC22676k.m65748h(text12, "null cannot be cast to non-null type android.text.Spanned");
                        c35591dArr = (C35591d[]) ((Spanned) text12).getSpans(0, layout.getText().length(), C35591d.class);
                    } else {
                        c35591dArr = null;
                    }
                }
                if (c35591dArr != null) {
                    c0030i1M65777h = AbstractC22681m0.m65777h(c35591dArr);
                    while (c0030i1M65777h.hasNext()) {
                        ((C35591d) c0030i1M65777h.next()).f151358y.setValue(new C16620e((((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3)));
                    }
                }
                charSequence2 = c23242a.f92102e;
                if (charSequence2 instanceof Spanned) {
                    obj = C25271y.f99162w;
                } else {
                    spanned2 = (Spanned) charSequence2;
                    spans = spanned2.getSpans(0, charSequence2.length(), C27498h.class);
                    arrayList = new ArrayList(spans.length);
                    length = spans.length;
                    i28 = 0;
                    while (i28 < length) {
                        C27498h c27498h6 = (C27498h) spans[i28];
                        int spanStart6 = spanned2.getSpanStart(c27498h6);
                        spanEnd = spanned2.getSpanEnd(c27498h6);
                        lineForOffset = c23242a.f92101d.f97768f.getLineForOffset(spanStart6);
                        if (lineForOffset >= c23242a.f92099b) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c23242a.f92101d.f97768f.getEllipsisCount(lineForOffset) > 0) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (spanEnd > c23242a.f92101d.m73312f(lineForOffset)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z13) {
                            i27 = i27;
                            c16618c = null;
                        } else {
                            i27 = i27;
                            c16618c = null;
                        }
                        arrayList.add(c16618c);
                        i28++;
                        i27 = i27;
                    }
                    obj = arrayList;
                }
                c23242a.f92103f = obj;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c3 = ' ';
        truncateAt = truncateAt2;
        c24983mM67289a = m67289a(i36, i37, truncateAt, i13, i38, i16, i35, i18, charSequence4);
        Layout layout5 = c24983mM67289a.f97768f;
        i19 = i36;
        if (Build.VERSION.SDK_INT < 35) {
            i24 = 2;
            c23242a = this;
            i25 = i13;
            i26 = i19;
        } else {
            i24 = 2;
            c23242a = this;
            i25 = i13;
            i26 = i19;
        }
        int i411 = c24983mM67289a.f97769g;
        if (i14 == i24) {
            i27 = i24;
            if (c24983mM67289a.m73307a() <= C39169a.m124764h(j7)) {
            }
            c23242a.f92098a.f139825g.m105879c(c23267m0.f92191a.mo117876c(), (((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3), c23267m0.f92191a.mo117874a());
            layout = c23242a.f92101d.f97768f;
            if (layout.getText() instanceof Spanned) {
                c35591dArr = null;
            } else {
                CharSequence text13 = layout.getText();
                AbstractC22676k.m65748h(text13, "null cannot be cast to non-null type android.text.Spanned");
                spanned = (Spanned) text13;
                if (spanned.nextSpanTransition(-1, spanned.length(), C35591d.class) != spanned.length()) {
                    CharSequence text14 = layout.getText();
                    AbstractC22676k.m65748h(text14, "null cannot be cast to non-null type android.text.Spanned");
                    c35591dArr = (C35591d[]) ((Spanned) text14).getSpans(0, layout.getText().length(), C35591d.class);
                } else {
                    c35591dArr = null;
                }
            }
            if (c35591dArr != null) {
                c0030i1M65777h = AbstractC22681m0.m65777h(c35591dArr);
                while (c0030i1M65777h.hasNext()) {
                    ((C35591d) c0030i1M65777h.next()).f151358y.setValue(new C16620e((((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3)));
                }
            }
            charSequence2 = c23242a.f92102e;
            if (charSequence2 instanceof Spanned) {
                obj = C25271y.f99162w;
            } else {
                spanned2 = (Spanned) charSequence2;
                spans = spanned2.getSpans(0, charSequence2.length(), C27498h.class);
                arrayList = new ArrayList(spans.length);
                length = spans.length;
                i28 = 0;
                while (i28 < length) {
                    C27498h c27498h7 = (C27498h) spans[i28];
                    int spanStart7 = spanned2.getSpanStart(c27498h7);
                    spanEnd = spanned2.getSpanEnd(c27498h7);
                    lineForOffset = c23242a.f92101d.f97768f.getLineForOffset(spanStart7);
                    if (lineForOffset >= c23242a.f92099b) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c23242a.f92101d.f97768f.getEllipsisCount(lineForOffset) > 0) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (spanEnd > c23242a.f92101d.m73312f(lineForOffset)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z13) {
                        i27 = i27;
                        c16618c = null;
                    } else {
                        i27 = i27;
                        c16618c = null;
                    }
                    arrayList.add(c16618c);
                    i28++;
                    i27 = i27;
                }
                obj = arrayList;
            }
            c23242a.f92103f = obj;
        }
        i27 = i24;
        c23242a.f92101d = c24983mM67289a;
        c23242a.f92098a.f139825g.m105879c(c23267m0.f92191a.mo117876c(), (((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3), c23267m0.f92191a.mo117874a());
        layout = c23242a.f92101d.f97768f;
        if (layout.getText() instanceof Spanned) {
            c35591dArr = null;
        } else {
            CharSequence text15 = layout.getText();
            AbstractC22676k.m65748h(text15, "null cannot be cast to non-null type android.text.Spanned");
            spanned = (Spanned) text15;
            if (spanned.nextSpanTransition(-1, spanned.length(), C35591d.class) != spanned.length()) {
                CharSequence text16 = layout.getText();
                AbstractC22676k.m65748h(text16, "null cannot be cast to non-null type android.text.Spanned");
                c35591dArr = (C35591d[]) ((Spanned) text16).getSpans(0, layout.getText().length(), C35591d.class);
            } else {
                c35591dArr = null;
            }
        }
        if (c35591dArr != null) {
            c0030i1M65777h = AbstractC22681m0.m65777h(c35591dArr);
            while (c0030i1M65777h.hasNext()) {
                ((C35591d) c0030i1M65777h.next()).f151358y.setValue(new C16620e((((long) Float.floatToRawIntBits(c23242a.m67290b())) & 4294967295L) | (((long) Float.floatToRawIntBits(c23242a.m67292d())) << c3)));
            }
        }
        charSequence2 = c23242a.f92102e;
        if (charSequence2 instanceof Spanned) {
            obj = C25271y.f99162w;
        } else {
            spanned2 = (Spanned) charSequence2;
            spans = spanned2.getSpans(0, charSequence2.length(), C27498h.class);
            arrayList = new ArrayList(spans.length);
            length = spans.length;
            i28 = 0;
            while (i28 < length) {
                C27498h c27498h8 = (C27498h) spans[i28];
                int spanStart8 = spanned2.getSpanStart(c27498h8);
                spanEnd = spanned2.getSpanEnd(c27498h8);
                lineForOffset = c23242a.f92101d.f97768f.getLineForOffset(spanStart8);
                if (lineForOffset >= c23242a.f92099b) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c23242a.f92101d.f97768f.getEllipsisCount(lineForOffset) > 0) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (spanEnd > c23242a.f92101d.m73312f(lineForOffset)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z13) {
                    i27 = i27;
                    c16618c = null;
                } else {
                    i27 = i27;
                    c16618c = null;
                }
                arrayList.add(c16618c);
                i28++;
                i27 = i27;
            }
            obj = arrayList;
        }
        c23242a.f92103f = obj;
    }

    /* JADX INFO: renamed from: a */
    public final C24983m m67289a(int i13, int i14, TextUtils.TruncateAt truncateAt, int i15, int i16, int i17, int i18, int i19, CharSequence charSequence) {
        C23251e0 c23251e0;
        float fM67292d = m67292d();
        C33491c c33491c = this.f92098a;
        C33492d c33492d = c33491c.f139825g;
        int i24 = c33491c.f139830l;
        C24978h c24978h = c33491c.f139827i;
        C23285v0 c23285v0 = c33491c.f139820b;
        C33489a c33489a = AbstractC33490b.f139818a;
        C23255g0 c23255g0 = c23285v0.f92257c;
        return new C24983m(charSequence, fM67292d, c33492d, i13, truncateAt, i24, (c23255g0 == null || (c23251e0 = c23255g0.f92139b) == null) ? false : c23251e0.f92130a, i15, i17, i18, i19, i16, i14, c24978h);
    }

    /* JADX INFO: renamed from: b */
    public final float m67290b() {
        return this.f92101d.m73307a();
    }

    /* JADX INFO: renamed from: c */
    public final long m67291c(C16618c c16618c, int i13, C18194g c18194g) {
        int[] iArrM34046L;
        RectF rectFM51504F = AbstractC17918w0.m51504F(c16618c);
        int i14 = (!AbstractC23278s.m67345b(i13, 0) && AbstractC23278s.m67345b(i13, 1)) ? 1 : 0;
        C22541b c22541b = new C22541b(c18194g, 11);
        int i15 = Build.VERSION.SDK_INT;
        C24983m c24983m = this.f92101d;
        if (i15 >= 34) {
            c24983m.getClass();
            iArrM34046L = AbstractC2378g1.m7331f(c24983m, rectFM51504F, i14, c22541b);
        } else {
            iArrM34046L = AbstractC12240d.m34046L(c24983m, c24983m.f97768f, c24983m.m73309c(), rectFM51504F, i14, c22541b);
        }
        return iArrM34046L == null ? C23283u0.f92251b : AbstractC21478l0.m60431f(iArrM34046L[0], iArrM34046L[1]);
    }

    /* JADX INFO: renamed from: d */
    public final float m67292d() {
        return C39169a.m124765i(this.f92100c);
    }

    /* JADX INFO: renamed from: e */
    public final void m67293e(InterfaceC17915v interfaceC17915v) {
        Canvas canvasM51433a = AbstractC17876d.m51433a(interfaceC17915v);
        C24983m c24983m = this.f92101d;
        if (c24983m.f97766d) {
            canvasM51433a.save();
            canvasM51433a.clipRect(0.0f, 0.0f, m67292d(), m67290b());
        }
        int i13 = c24983m.f97770h;
        if (canvasM51433a.getClipBounds(c24983m.f97778p)) {
            if (i13 != 0) {
                canvasM51433a.translate(0.0f, i13);
            }
            C24982l c24982l = AbstractC24984n.f97780a;
            c24982l.f97762a = canvasM51433a;
            c24983m.f97768f.draw(c24982l);
            if (i13 != 0) {
                canvasM51433a.translate(0.0f, (-1) * i13);
            }
        }
        if (c24983m.f97766d) {
            canvasM51433a.restore();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m67294f(InterfaceC17915v interfaceC17915v, long j7, C17924z0 c17924z0, C36776l c36776l, AbstractC22132f abstractC22132f) {
        C33492d c33492d = this.f92098a.f139825g;
        int i13 = c33492d.f139833c;
        c33492d.m105880d(j7);
        c33492d.m105882f(c17924z0);
        c33492d.m105883g(c36776l);
        c33492d.m105881e(abstractC22132f);
        c33492d.m105878b(3);
        m67293e(interfaceC17915v);
        c33492d.m105878b(i13);
    }

    /* JADX INFO: renamed from: g */
    public final void m67295g(InterfaceC17915v interfaceC17915v, AbstractC17911t abstractC17911t, float f13, C17924z0 c17924z0, C36776l c36776l, AbstractC22132f abstractC22132f) {
        C33492d c33492d = this.f92098a.f139825g;
        int i13 = c33492d.f139833c;
        float fM67292d = m67292d();
        c33492d.m105879c(abstractC17911t, (((long) Float.floatToRawIntBits(m67290b())) & 4294967295L) | (Float.floatToRawIntBits(fM67292d) << 32), f13);
        c33492d.m105882f(c17924z0);
        c33492d.m105883g(c36776l);
        c33492d.m105881e(abstractC22132f);
        c33492d.m105878b(3);
        m67293e(interfaceC17915v);
        c33492d.m105878b(i13);
    }
}
