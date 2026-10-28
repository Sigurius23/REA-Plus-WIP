package p035bp;

import a13.C0144b;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2501d2;
import b30.C2646w1;
import b30.C2653x1;
import bc3.C3033m;
import bi.AbstractC3269g;
import c93.InterfaceC4351m;
import g40.InterfaceC15361h1;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.sentry.C20517r2;
import io.sentry.EnumC20436n5;
import io.sentry.config.AbstractC20301a;
import io.sentry.config.C20302b;
import io.sentry.config.C20303c;
import io.sentry.config.C20305e;
import io.sentry.internal.debugmeta.C20378c;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.BreakIterator;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.IntStream;
import l83.C23465k;
import lb.C23562e;
import live.hms.video.utils.AndroidSDKConstants;
import m40.C25046w;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mg.C25525g;
import mg.C25527i;
import mg.InterfaceC25526h;
import na3.EnumC26529p;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C31931s;
import p002a0.C0047q0;
import p002a0.C0057v0;
import p005a3.C0230n0;
import p026b2.C2314t;
import p027b3.AbstractC2399k2;
import p027b3.AbstractC2417o0;
import p027b3.C2356c;
import p032bc.AbstractC2948f0;
import p042c2.C3861f;
import p042c2.C3870o;
import p042c2.C3872q;
import p042c2.InterfaceC3871p;
import p097ds.AbstractC12314q;
import p097ds.C12320w;
import p097ds.EnumC12315r;
import p097ds.RunnableC12316s;
import p108e4.AbstractC12682p;
import p133f1.C13968p1;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18039u;
import p209i3.C18027i;
import p209i3.C18030l;
import p209i3.C18043y;
import p241j3.C21265b;
import p271k3.EnumC22167a;
import p291l0.AbstractC22953f;
import p292l1.AbstractC23149o4;
import p294l3.C23254g;
import p294l3.C23283u0;
import p319m4.AbstractC25012a;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p335n6.InterfaceC26398o;
import p355o2.C27430e;
import p370oj.C27971r;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p395p6.C28884h1;
import p412q3.C29891y;
import p416q7.C30008a;
import p446r1.C30848b;
import p479s4.AbstractC32128i;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p525uj.AbstractC35029g;
import p602x1.AbstractC37817c;
import p696zy.C41210b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29810c;
import q83.InterfaceC30063j;
import r30.C30903h;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import u00.C34378f;
import va3.AbstractC35846d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: bp.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3511b {

    /* JADX INFO: renamed from: E */
    public static Boolean f13983E = null;

    /* JADX INFO: renamed from: w */
    public static Context f13984w = null;

    /* JADX INFO: renamed from: x */
    public static Boolean f13985x = null;

    /* JADX INFO: renamed from: y */
    public static boolean f13986y = true;

    /* JADX INFO: renamed from: z */
    public static C27430e f13987z;

    /* JADX INFO: renamed from: A */
    public static final boolean m10361A(InterfaceC26398o interfaceC26398o) {
        return interfaceC26398o.mo78099c(new C28884h1(1));
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m10362B(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        for (int i13 = 0; i13 < str.length(); i13++) {
            if (AbstractC35846d.m113784i(str.charAt(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static final void m10363C(Exception exc, String str, int i13) {
        if (AbstractC12682p.m35482b(i13, 1) > 0) {
            return;
        }
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e == 1) {
            Log.e("MFLT-SDK", str, exc);
            return;
        }
        if (iM35485e == 2) {
            Log.w("MFLT-SDK", str, exc);
            return;
        }
        if (iM35485e == 3) {
            Log.i("MFLT-SDK", str, exc);
        } else if (iM35485e == 4) {
            Log.d("MFLT-SDK", str, exc);
        } else {
            if (iM35485e != 5) {
                return;
            }
            Log.v("MFLT-SDK", str, exc);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final C23562e m10364D(C20378c c20378c, String fileName, int i13) {
        AbstractC22676k.m65750j(fileName, "fileName");
        return new C23562e(c20378c, fileName, i13);
    }

    /* JADX INFO: renamed from: E */
    public static final C23562e m10365E(C20378c c20378c) {
        return new C23562e(c20378c);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0299  */
    /* JADX WARN: Code duplicated, block: B:193:0x018f A[EDGE_INSN: B:193:0x018f->B:66:0x018f BREAK  A[LOOP:0: B:9:0x003f->B:64:0x016f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x016d A[DONT_INVERT, PHI: r20 r21 r22 r23 r24 r25 r26 r27 r28
      0x016d: PHI (r20v6 c2.f) = (r20v5 c2.f), (r20v7 c2.f) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r21v6 boolean) = (r21v5 boolean), (r21v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r22v13 k3.a) = (r22v12 k3.a), (r22v14 k3.a) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r23v6 c2.p) = (r23v5 c2.p), (r23v7 c2.p) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r24v6 java.lang.Boolean) = (r24v5 java.lang.Boolean), (r24v7 java.lang.Boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r25v11 i3.i) = (r25v10 i3.i), (r25v12 i3.i) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r27v6 java.lang.Integer) = (r27v5 java.lang.Integer), (r27v7 java.lang.Integer) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r28v12 l3.g) = (r28v11 l3.g), (r28v13 l3.g) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x016f A[LOOP:0: B:9:0x003f->B:64:0x016f, LOOP_END] */
    /* JADX INFO: renamed from: F */
    public static final void m10366F(ViewStructure viewStructure, C0230n0 c0230n0, AutofillId autofillId, String str, C21265b c21265b) {
        long j7;
        long j13;
        char c3;
        long j14;
        EnumC22167a enumC22167a;
        C18027i c18027i;
        C23254g c23254g;
        C3861f c3861f;
        boolean z4;
        InterfaceC3871p interfaceC3871p;
        Boolean bool;
        boolean z13;
        Integer num;
        Integer num2;
        List list;
        String strM7424p;
        String[] strArrM9477E;
        String[] strArrM9477E2;
        C0057v0 c0057v0;
        long[] jArr;
        Object[] objArr;
        Integer num3;
        long[] jArr2;
        Object[] objArr2;
        C0057v0 c0057v1;
        EnumC22167a enumC22167a2;
        C18027i c18027i2;
        C23254g c23254g2;
        int i13;
        Integer num4 = 1;
        C18043y c18043y = AbstractC18039u.f70034a;
        C18043y c18043y2 = AbstractC18029k.f69954a;
        C18030l c18030lM591I = c0230n0.m591I();
        int i14 = 8;
        if (c18030lM591I == null || (c0057v1 = c18030lM591I.f69980w) == null) {
            j7 = 128;
            j13 = 255;
            c3 = 7;
            j14 = -9187201950435737472L;
            enumC22167a = null;
            c18027i = null;
            c23254g = null;
            c3861f = null;
            z4 = false;
            interfaceC3871p = null;
            bool = null;
            z13 = false;
            num = null;
        } else {
            j7 = 128;
            Object[] objArr3 = c0057v1.f171b;
            Object[] objArr4 = c0057v1.f172c;
            long[] jArr3 = c0057v1.f170a;
            j13 = 255;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                c3861f = null;
                z4 = false;
                enumC22167a2 = null;
                interfaceC3871p = null;
                bool = null;
                c18027i2 = null;
                z13 = false;
                num = null;
                c23254g2 = null;
                c3 = 7;
                while (true) {
                    long j15 = jArr3[i15];
                    j14 = -9187201950435737472L;
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j15 & 255) < 128) {
                                int i18 = (i15 << 3) + i17;
                                Object obj = objArr3[i18];
                                Object obj2 = objArr4[i18];
                                C18043y c18043y3 = (C18043y) obj;
                                i13 = i14;
                                if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70051r)) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    c3861f = (C3861f) obj2;
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70034a)) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) AbstractC25265s.m74100H0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70050q)) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    interfaceC3871p = (InterfaceC3871p) obj2;
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70023E)) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    c23254g2 = (C23254g) obj2;
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70044k)) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70032N)) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70028J)) {
                                    z13 = true;
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70057x)) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    c18027i2 = (C18027i) obj2;
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70026H)) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18039u.f70027I)) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    enumC22167a2 = (EnumC22167a) obj2;
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18029k.f69955b)) {
                                    viewStructure.setClickable(true);
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18029k.f69956c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18029k.f69975v)) {
                                    viewStructure.setFocusable(true);
                                } else if (AbstractC22676k.m65745e(c18043y3, AbstractC18029k.f69963j)) {
                                    z4 = true;
                                }
                            } else {
                                i13 = i14;
                            }
                            j15 >>= i13;
                            i17++;
                            i14 = i13;
                        }
                        if (i16 != i14) {
                            break;
                        }
                        if (i15 != length) {
                            break;
                        }
                        i15++;
                        i14 = 8;
                    } else if (i15 != length) {
                        break;
                        break;
                    } else {
                        i15++;
                        i14 = 8;
                    }
                }
            } else {
                c3 = 7;
                j14 = -9187201950435737472L;
                c3861f = null;
                z4 = false;
                enumC22167a2 = null;
                interfaceC3871p = null;
                bool = null;
                c18027i2 = null;
                z13 = false;
                num = null;
                c23254g2 = null;
            }
            enumC22167a = enumC22167a2;
            c18027i = c18027i2;
            c23254g = c23254g2;
        }
        C18030l c18030lM591I2 = c0230n0.m591I();
        if (c18030lM591I2 != null && c18030lM591I2.f69982y && !c18030lM591I2.f69983z) {
            c18030lM591I2 = c18030lM591I2.m51769a();
            C0047q0 c0047q0 = new C0047q0(((C30848b) c0230n0.m637q()).f127226w.f127229y);
            c0047q0.m99b(c0230n0.m637q());
            while (c0047q0.m105h()) {
                C0230n0 c0230n1 = (C0230n0) c0047q0.m107j(c0047q0.f137b - 1);
                C18030l c18030lM591I3 = c0230n1.m591I();
                if (c18030lM591I3 != null && !c18030lM591I3.f69982y) {
                    c18030lM591I2.m51771d(c18030lM591I3);
                    if (!c18030lM591I3.f69983z) {
                        c0047q0.m99b(c0230n1.m637q());
                    }
                }
            }
        }
        if (c18030lM591I2 == null || (c0057v0 = c18030lM591I2.f69980w) == null) {
            num2 = num4;
            list = null;
        } else {
            Object[] objArr5 = c0057v0.f171b;
            Object[] objArr6 = c0057v0.f172c;
            long[] jArr4 = c0057v0.f170a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i19 = 0;
                list = null;
                while (true) {
                    long j16 = jArr4[i19];
                    if ((((~j16) << c3) & j16 & j14) != j14) {
                        int i24 = 8 - ((~(i19 - length2)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j16 & j13) < j7) {
                                int i26 = (i19 << 3) + i25;
                                Object obj3 = objArr5[i26];
                                num3 = num4;
                                Object obj4 = objArr6[i26];
                                jArr2 = jArr4;
                                C18043y c18043y4 = (C18043y) obj3;
                                objArr2 = objArr5;
                                if (AbstractC22676k.m65745e(c18043y4, AbstractC18039u.f70042i)) {
                                    viewStructure.setEnabled(false);
                                } else if (AbstractC22676k.m65745e(c18043y4, AbstractC18039u.f70019A)) {
                                    AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                num3 = num4;
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j16 >>= 8;
                            i25++;
                            jArr4 = jArr2;
                            objArr5 = objArr2;
                            num4 = num3;
                        }
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                    }
                    if (i19 == length2) {
                        break;
                    }
                    i19++;
                    jArr4 = jArr;
                    objArr5 = objArr;
                    num4 = num2;
                }
            } else {
                num2 = num4;
                list = null;
            }
        }
        Integer numValueOf = Integer.valueOf(c0230n0.f795x);
        if (c0230n0.m588G() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer num5 = (c3861f == null && !z4) ? enumC22167a != null ? 2 : null : num2;
        if (num5 != null) {
            viewStructure.setAutofillType(num5.intValue());
        }
        if (interfaceC3871p != null && (strArrM9477E2 = AbstractC3269g.m9477E(interfaceC3871p)) != null) {
            viewStructure.setAutofillHints(strArrM9477E2);
        }
        c21265b.f81183a.m1949g(c0230n0.f795x, new C3872q(viewStructure, 0));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (enumC22167a != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(enumC22167a == EnumC22167a.f85977w);
        } else if (bool != null && (c18027i == null || c18027i.f69949a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        InterfaceC3871p.f15846a.getClass();
        boolean z14 = z13 || (interfaceC3871p != null && (strArrM9477E = AbstractC3269g.m9477E(interfaceC3871p)) != null && AbstractC25260n.m74056a0(strArrM9477E, (String) AbstractC25260n.m74078s0(AbstractC3269g.m9477E(C3870o.f15843b))));
        if (z14) {
            viewStructure.setDataIsSensitive(true);
        }
        viewStructure.setVisibility(((NodeCoordinator) c0230n0.f783e0.f741e).m3544o1() ? 4 : 0);
        if (list != null) {
            int size = list.size();
            String strM73377j = "";
            for (int i27 = 0; i27 < size; i27++) {
                strM73377j = AbstractC25012a.m73377j(AbstractC18489d0.m53374o(strM73377j), ((C23254g) list.get(i27)).f92135x, '\n');
            }
            viewStructure.setText(strM73377j);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (((C30848b) c0230n0.m637q()).isEmpty() && c18027i != null && (strM7424p = AbstractC2417o0.m7424p(c18027i.f69949a)) != null) {
            viewStructure.setClassName(strM7424p);
        }
        if (z4) {
            viewStructure.setClassName("android.widget.EditText");
            if (num != null) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (c23254g != null) {
                viewStructure.setAutofillValue(AutofillValue.forText(c23254g.f92135x));
            }
            if (z14) {
                viewStructure.setInputType(129);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m10367G(EnumC26529p enumC26529p) {
        return enumC26529p != EnumC26529p.f105466y;
    }

    /* JADX INFO: renamed from: H */
    public static final C23465k m10368H(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        List listM125905x0 = AbstractC39414r.m125905x0(str, new char[]{'='}, 2, 2);
        return new C23465k(AbstractC39414r.m125869O0((String) listM125905x0.get(0)).toString(), AbstractC39414r.m125869O0((String) listM125905x0.get(1)).toString());
    }

    /* JADX INFO: renamed from: I */
    public static final String m10369I(String str, String str2) {
        return (String) AbstractC39414r.m125906y0(str, new String[]{str2}, 2).get(0);
    }

    /* JADX INFO: renamed from: J */
    public static void m10370J(ViewGroup viewGroup, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2948f0.m8607b(viewGroup, z4);
        } else if (f13986y) {
            try {
                AbstractC2948f0.m8607b(viewGroup, z4);
            } catch (NoSuchMethodError unused) {
                f13986y = false;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static JSONArray m10371K(List list) throws JSONException {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30903h c30903h = (C30903h) it.next();
            c30903h.getClass();
            JSONObject jSONObjectPut = new JSONObject().put("name", c30903h.f127446w).put("id", c30903h.f127447x).put("criticalityIndicator", c30903h.f127448y).put("data", new JSONObject(c30903h.f127449z));
            AbstractC22676k.m65749i(jSONObjectPut, "put(...)");
            jSONArray.put(jSONObjectPut);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: L */
    public static void m10372L(Parcel parcel, Parcelable parcelable, int i13) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10373b(List paymentMethods, int i13, boolean z4, C29810c c29810c, Function1 onItemSelectedListener, C25046w imageLoader, Modifier modifier, Function1 function1, C26068u c26068u, Composer composer, int i14) {
        int i15;
        boolean z13;
        Function1 function2;
        C26068u c26068uM77569a;
        int i16;
        C26068u c26068u2;
        C28655q c28655q;
        AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
        AbstractC22676k.m65750j(onItemSelectedListener, "onItemSelectedListener");
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1410539934);
        if ((i14 & 6) == 0) {
            i15 = (c28655q2.m87157i(paymentMethods) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            z13 = z4;
            i15 |= c28655q2.m87155h(z13) ? 256 : 128;
        } else {
            z13 = z4;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? c28655q2.m87153g(c29810c) : c28655q2.m87157i(c29810c) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q2.m87157i(onItemSelectedListener) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= (262144 & i14) == 0 ? c28655q2.m87153g(imageLoader) : c28655q2.m87157i(imageLoader) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i15 |= c28655q2.m87153g(modifier) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            function2 = function1;
            i15 |= c28655q2.m87157i(function2) ? 8388608 : 4194304;
        } else {
            function2 = function1;
        }
        if ((100663296 & i14) == 0) {
            i15 |= AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((38347923 & i15) == 38347922 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c26068u2 = c26068u;
            c28655q = c28655q2;
        } else {
            c28655q2.m87140Z();
            if ((i14 & 1) == 0 || c28655q2.m87118C()) {
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
                i16 = i15 & (-234881025);
            } else {
                c28655q2.m87138X();
                i16 = i15 & (-234881025);
                c26068uM77569a = c26068u;
            }
            c28655q2.m87175r();
            boolean zBooleanValue = ((Boolean) c28655q2.m87161k(AbstractC2399k2.f9451a)).booleanValue();
            Integer numValueOf = Integer.valueOf(i13);
            c28655q2.m87150e0(-132443209);
            boolean zM87155h = ((i16 & 112) == 32) | c28655q2.m87155h(zBooleanValue) | c28655q2.m87153g(c26068uM77569a);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87155h || objM87133R == c28676v0) {
                objM87133R = new C2653x1(zBooleanValue, c26068uM77569a, i13, null);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, numValueOf);
            c28655q2.m87150e0(-132437137);
            boolean zM87153g = c28655q2.m87153g(paymentMethods);
            Object objM87133R2 = c28655q2.m87133R();
            Object obj = objM87133R2;
            if (zM87153g || objM87133R2 == c28676v0) {
                List list = paymentMethods;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C34378f) it.next()).f144467a);
                }
                c28655q2.m87172p0(arrayList);
                obj = arrayList;
            }
            c28655q2.m87173q(false);
            Function1 function3 = function2;
            C26068u c26068u3 = c26068uM77569a;
            c26068u2 = c26068u3;
            C28655q c28655q3 = c28655q2;
            AbstractC22953f.m66714a(AbstractC1136a.m3599a(modifier, "PaymentMethodsUITestTag1"), null, false, AbstractC37817c.m121344e(1114993800, c28655q2, new C2501d2(paymentMethods, (List) obj, function3, c26068u3, z13, i13, c29810c, imageLoader, onItemSelectedListener)), c28655q3, 3072, 6);
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2646w1(paymentMethods, i13, z4, c29810c, onItemSelectedListener, imageLoader, modifier, function1, c26068u2, i14);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10374c(String text, Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Modifier modifier2;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1398506401);
        if ((i13 & 14) == 0) {
            i14 = i13 | (c28655q2.m87153g(text) ? 4 : 2);
        } else {
            i14 = i13;
        }
        int i15 = i14 | 48;
        if ((i15 & 91) == 18 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
            modifier2 = modifier;
        } else {
            long j7 = AbstractC35029g.f148260i;
            long j13 = AbstractC35029g.f148254c;
            long j14 = AbstractC35029g.f148256e;
            float f13 = AbstractC35029g.f148252a;
            float f14 = f13 / 2;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
            C2314t c2314t = C2314t.f9131w;
            c28655q = c28655q2;
            AbstractC23149o4.m67127b(text, AbstractC1099a.m3395q(AbstractC1092a.m3358c(c2314t, j14, c33252iM105489e), f13, f14), j7, j13, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q, (i15 & 14) | 3456, 0, 131056);
            modifier2 = c2314t;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27971r(text, modifier2, i13, 0);
    }

    /* JADX INFO: renamed from: d */
    public static Object m10375d(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final ExtractedText m10376e(C29891y c29891y) {
        ExtractedText extractedText = new ExtractedText();
        String str = c29891y.f122125a.f92135x;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j7 = c29891y.f122126b;
        extractedText.selectionStart = C23283u0.m67360f(j7);
        extractedText.selectionEnd = C23283u0.m67359e(j7);
        extractedText.flags = !AbstractC39414r.m125875T(c29891y.f122125a.f92135x, '\n', false) ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m10377f(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p035bp.AbstractC3511b.m10377f(int, int, int, boolean):int");
    }

    /* JADX INFO: renamed from: g */
    public static final Object m10378g(C12320w c12320w, AbstractC32269c abstractC32269c) throws Throwable {
        try {
            if (c12320w.isDone()) {
                return m10395x(c12320w);
            }
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(abstractC32269c));
            c3033m.m8774s();
            c12320w.mo31061a(new RunnableC12316s(8, c12320w, c3033m), EnumC12315r.f41243w);
            c3033m.m8776u(new C31931s(c12320w, 6));
            Object objM8773r = c3033m.m8773r();
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            return objM8773r;
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            AbstractC22676k.m65747g(cause);
            throw cause;
        }
    }

    /* JADX INFO: renamed from: h */
    public static C30008a m10379h(Instant startTime, Instant endTime) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        if (startTime.isBefore(endTime)) {
            return new C30008a(startTime, endTime);
        }
        throw new IllegalArgumentException("end time needs be after start time");
    }

    /* JADX INFO: renamed from: i */
    public static IntStream m10380i(CharSequence charSequence) {
        return charSequence.chars();
    }

    /* JADX INFO: renamed from: j */
    public static IntStream m10381j(CharSequence charSequence) {
        return charSequence.codePoints();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m10382k(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m10383l(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m10384m(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m10385n(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    /* JADX INFO: renamed from: o */
    public static final String m10386o(Integer num, String message) {
        AbstractC22676k.m65750j(message, "message");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(message);
        sb4.append(" on line " + num.intValue() + '.');
        sb4.append(" See https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html for file format details.");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: p */
    public static final BoringLayout m10387p(CharSequence charSequence, TextPaint textPaint, int i13, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z4, TextUtils.TruncateAt truncateAt, int i14) {
        return new BoringLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, metrics, z4, truncateAt, i14);
    }

    /* JADX INFO: renamed from: q */
    public static C20302b m10388q() {
        Properties propertiesM39759q;
        Properties propertiesM39759q2;
        C20517r2 c20517r2 = new C20517r2();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C20305e("sentry.", System.getProperties()));
        arrayList.add(new C20303c());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesM39759q2 = new C13968p1(property, c20517r2, true).m39759q()) != null) {
            arrayList.add(new C20305e(propertiesM39759q2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesM39759q = new C13968p1(str, c20517r2, true).m39759q()) != null) {
            arrayList.add(new C20305e(propertiesM39759q));
        }
        Properties properties = null;
        try {
            InputStream resourceAsStream = AbstractC12314q.m34337q(AbstractC20301a.class.getClassLoader()).getResourceAsStream("sentry.properties");
            if (resourceAsStream != null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        bufferedInputStream.close();
                        resourceAsStream.close();
                        properties = properties2;
                    } catch (Throwable th3) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } else if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException e5) {
            c20517r2.mo16058i(EnumC20436n5.ERROR, e5, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
        }
        if (properties != null) {
            arrayList.add(new C20305e(properties));
        }
        Properties propertiesM39759q3 = new C13968p1("sentry.properties", c20517r2, false).m39759q();
        if (propertiesM39759q3 != null) {
            arrayList.add(new C20305e(propertiesM39759q3));
        }
        return new C20302b(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public static C0144b m10389r(Application application) {
        C0144b c0144b = new C0144b();
        application.registerActivityLifecycleCallbacks(c0144b);
        return c0144b;
    }

    /* JADX INFO: renamed from: s */
    public static final void m10390s(AbstractC26632p abstractC26632p, C26611e0 c26611e0) throws IOException {
        try {
            IOException iOException = null;
            for (C26611e0 c26611e1 : abstractC26632p.mo79147J(c26611e0)) {
                try {
                    if (abstractC26632p.m79271T(c26611e1).f104373c) {
                        m10390s(abstractC26632p, c26611e1);
                    }
                    abstractC26632p.mo79153m(c26611e1);
                } catch (IOException e5) {
                    if (iOException == null) {
                        iOException = e5;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public static final String m10391t(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '\"' || cCharAt == '\\' || (cCharAt >= 0 && cCharAt < ' ')) {
                StringBuilder sb4 = new StringBuilder(str.length() + 1);
                for (int i14 = 0; i14 < str.length(); i14++) {
                    char cCharAt2 = str.charAt(i14);
                    if (cCharAt2 == '\"') {
                        sb4.append("\\\"");
                    } else if (cCharAt2 == '\\') {
                        sb4.append("\\\\");
                    } else if (cCharAt2 == '\n') {
                        sb4.append("\\n");
                    } else if (cCharAt2 == '\r') {
                        sb4.append("\\r");
                    } else if (cCharAt2 == '\t') {
                        sb4.append("\\t");
                    } else if (cCharAt2 == '\b') {
                        sb4.append("\\b");
                    } else if (cCharAt2 == '\f') {
                        sb4.append("\\f");
                    } else if (cCharAt2 < 0 || cCharAt2 >= ' ') {
                        sb4.append(cCharAt2);
                    } else {
                        AbstractC35846d.m113779c(16);
                        String string = Integer.toString(cCharAt2, 16);
                        AbstractC22676k.m65749i(string, "toString(...)");
                        sb4.append("\\u");
                        sb4.append(AbstractC39414r.m125895n0(4, string));
                    }
                }
                return sb4.toString();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: u */
    public static C2356c m10392u(Locale locale) {
        if (C2356c.f9309g == null) {
            C2356c c2356c = new C2356c(1);
            c2356c.f9311e = BreakIterator.getWordInstance(locale);
            C2356c.f9309g = c2356c;
        }
        C2356c c2356c2 = C2356c.f9309g;
        AbstractC22676k.m65748h(c2356c2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
        return c2356c2;
    }

    /* JADX INFO: renamed from: v */
    public static C41210b m10393v(InterfaceC15361h1 interfaceC15361h1) {
        Object[] array;
        List listMo43555a = interfaceC15361h1.mo43555a();
        if (listMo43555a == null || (array = listMo43555a.toArray(new Object[0])) == null) {
            array = new Object[0];
        }
        return AbstractC32128i.m100064s(interfaceC15361h1.getMessage(), Arrays.copyOf(array, array.length), C25271y.f99162w);
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC25526h m10394w(InterfaceC30063j interfaceC30063j) {
        InterfaceC25526h interfaceC25526h;
        AbstractC22676k.m65750j(interfaceC30063j, "<this>");
        C25527i c25527i = (C25527i) interfaceC30063j.get(C25527i.f99938x);
        if (c25527i != null && (interfaceC25526h = c25527i.f99939w) != null) {
            return interfaceC25526h;
        }
        InterfaceC25526h.f99937a.getClass();
        return C25525g.f99936b;
    }

    /* JADX INFO: renamed from: x */
    public static Object m10395x(Future future) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th3) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: y */
    public static final BoringLayout.Metrics m10396y(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }

    /* JADX INFO: renamed from: z */
    public static synchronized boolean m10397z(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f13984w;
        if (context2 != null && (bool = f13985x) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f13985x = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f13985x = boolValueOf;
        f13984w = applicationContext;
        return boolValueOf.booleanValue();
    }
}
