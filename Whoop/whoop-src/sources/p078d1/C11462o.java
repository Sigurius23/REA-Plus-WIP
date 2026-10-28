package p078d1;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.whoop.profile.view.edit.form.C9779c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import l83.EnumC23463i;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p027b3.AbstractC2378g1;
import p027b3.InterfaceC2395j3;
import p029b5.AbstractC2723b;
import p041c1.AbstractC3817b;
import p133f1.C13977s1;
import p185h6.C16955j;
import p243j5.AbstractC21327a;
import p294l3.C23283u0;
import p412q3.C29878l;
import p412q3.C29891y;
import p478s3.C32095a;
import p478s3.C32096b;
import p510u0.C34354s0;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import ro.C31624i;

/* JADX INFO: renamed from: d1.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C11462o {

    /* JADX INFO: renamed from: a */
    public final View f36778a;

    /* JADX INFO: renamed from: b */
    public final C11457j f36779b;

    /* JADX INFO: renamed from: e */
    public C34354s0 f36782e;

    /* JADX INFO: renamed from: f */
    public C13977s1 f36783f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2395j3 f36784g;

    /* JADX INFO: renamed from: l */
    public Rect f36789l;

    /* JADX INFO: renamed from: m */
    public final C11459l f36790m;

    /* JADX INFO: renamed from: c */
    public Function1 f36780c = new C9779c(27);

    /* JADX INFO: renamed from: d */
    public Function1 f36781d = new C9779c(28);

    /* JADX INFO: renamed from: h */
    public C29891y f36785h = new C29891y(4, "", C23283u0.f92251b);

    /* JADX INFO: renamed from: i */
    public C29878l f36786i = C29878l.f122098g;

    /* JADX INFO: renamed from: j */
    public final ArrayList f36787j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final Object f36788k = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C11456i(this, 1));

    public C11462o(View view, C11448a c11448a, C11457j c11457j) {
        this.f36778a = view;
        this.f36779b = c11457j;
        this.f36790m = new C11459l(c11448a, c11457j);
    }

    /* JADX INFO: renamed from: a */
    public final InputConnectionC11463p m30757a(EditorInfo editorInfo) {
        int i13;
        int i14;
        C29891y c29891y = this.f36785h;
        String str = c29891y.f122125a.f92135x;
        long j7 = c29891y.f122126b;
        C29878l c29878l = this.f36786i;
        int i15 = c29878l.f122103e;
        int i16 = c29878l.f122102d;
        boolean z4 = c29878l.f122099a;
        if (i15 == 1) {
            i13 = z4 ? 6 : 0;
        } else if (i15 == 0) {
            i13 = 1;
        } else if (i15 == 2) {
            i13 = 2;
        } else if (i15 == 6) {
            i13 = 5;
        } else if (i15 == 5) {
            i13 = 7;
        } else if (i15 == 3) {
            i13 = 3;
        } else if (i15 == 4) {
            i13 = 4;
        } else {
            if (i15 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i13;
        C32096b c32096b = c29878l.f122104f;
        if (AbstractC22676k.m65745e(c32096b, C32096b.f133098y)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c32096b, 10));
            Iterator it = c32096b.f133099w.iterator();
            while (it.hasNext()) {
                arrayList.add(((C32095a) it.next()).f133097a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i16 == 1) {
            i14 = 1;
        } else if (i16 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i14 = 1;
        } else if (i16 == 3) {
            i14 = 2;
        } else if (i16 == 4) {
            i14 = 3;
        } else if (i16 == 5) {
            i14 = 17;
        } else if (i16 == 6) {
            i14 = 33;
        } else if (i16 == 7) {
            i14 = 129;
        } else if (i16 == 8) {
            i14 = 18;
        } else {
            if (i16 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i14 = 8194;
        }
        editorInfo.inputType = i14;
        if (!z4 && (i14 & 1) == 1) {
            editorInfo.inputType = 131072 | i14;
            if (c29878l.f122103e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i17 = editorInfo.inputType;
        if ((i17 & 1) == 1) {
            int i18 = c29878l.f122100b;
            if (i18 == 1) {
                editorInfo.inputType = i17 | 4096;
            } else if (i18 == 2) {
                editorInfo.inputType = i17 | DfuBaseService.ERROR_REMOTE_MASK;
            } else if (i18 == 3) {
                editorInfo.inputType = i17 | DfuBaseService.ERROR_CONNECTION_MASK;
            }
            if (c29878l.f122101c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i19 = C23283u0.f92252c;
        editorInfo.initialSelStart = (int) (j7 >> 32);
        editorInfo.initialSelEnd = (int) (j7 & 4294967295L);
        AbstractC35902e.m113956a0(editorInfo, str);
        editorInfo.imeOptions |= AndroidSDKConstants.FLAG_MUTABLE;
        if (!AbstractC3817b.f15656a || i16 == 7 || i16 == 8) {
            if (AbstractC2723b.m7688a()) {
                AbstractC21327a.m59857b(editorInfo, false);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (AbstractC2723b.m7688a()) {
                AbstractC21327a.m59857b(editorInfo, true);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            AbstractC2378g1.m7344s(editorInfo);
        }
        C11460m c11460m = AbstractC11461n.f36777a;
        if (C16955j.m47709d()) {
            C16955j.m47708a().m47716i(editorInfo);
        }
        InputConnectionC11463p inputConnectionC11463p = new InputConnectionC11463p(this.f36785h, new C31624i(this, 21), this.f36786i.f122101c, this.f36782e, this.f36783f, this.f36784g);
        this.f36787j.add(new WeakReference(inputConnectionC11463p));
        return inputConnectionC11463p;
    }
}
