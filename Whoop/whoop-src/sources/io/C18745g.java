package io;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p309lo.AbstractC24567y;
import p690zr.AbstractC41023g0;

/* JADX INFO: renamed from: io.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C18745g extends C20710v {

    /* JADX INFO: renamed from: A */
    public boolean f73671A;

    /* JADX INFO: renamed from: B */
    public boolean f73672B;

    /* JADX INFO: renamed from: C */
    public boolean f73673C;

    /* JADX INFO: renamed from: D */
    public boolean f73674D;

    /* JADX INFO: renamed from: E */
    public boolean f73675E;

    /* JADX INFO: renamed from: F */
    public boolean f73676F;

    /* JADX INFO: renamed from: G */
    public boolean f73677G;

    /* JADX INFO: renamed from: H */
    public boolean f73678H;

    /* JADX INFO: renamed from: I */
    public int f73679I;

    /* JADX INFO: renamed from: J */
    public boolean f73680J;

    /* JADX INFO: renamed from: K */
    public boolean f73681K;

    /* JADX INFO: renamed from: L */
    public boolean f73682L;

    /* JADX INFO: renamed from: M */
    public final SparseArray f73683M;

    /* JADX INFO: renamed from: N */
    public final SparseBooleanArray f73684N;

    /* JADX INFO: renamed from: z */
    public boolean f73685z;

    public C18745g() {
        this.f73683M = new SparseArray();
        this.f73684N = new SparseBooleanArray();
        m54516g();
    }

    @Override // io.C20710v
    /* JADX INFO: renamed from: a */
    public final C20711w mo54511a() {
        return new C18744f(this);
    }

    @Override // io.C20710v
    /* JADX INFO: renamed from: c */
    public final C20710v mo54512c(Set set) {
        super.mo54512c(set);
        return this;
    }

    @Override // io.C20710v
    /* JADX INFO: renamed from: d */
    public final void mo54513d() {
        this.f77531a = 720;
        this.f77532b = 1280;
    }

    @Override // io.C20710v
    /* JADX INFO: renamed from: e */
    public final void mo54514e() {
        this.f77535e = 720;
        this.f77536f = 1280;
    }

    @Override // io.C20710v
    /* JADX INFO: renamed from: f */
    public final C20710v mo54515f(int i13, int i14) {
        super.mo54515f(i13, i14);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final void m54516g() {
        this.f73685z = true;
        this.f73671A = false;
        this.f73672B = true;
        this.f73673C = false;
        this.f73674D = true;
        this.f73675E = false;
        this.f73676F = false;
        this.f73677G = false;
        this.f73678H = false;
        this.f73679I = 0;
        this.f73680J = true;
        this.f73681K = false;
        this.f73682L = true;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0111  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    public C18745g(Context context) {
        Point point;
        Point point2;
        String strM71691v;
        DisplayManager displayManager;
        CaptioningManager captioningManager;
        String string;
        int i13 = AbstractC24567y.f95875a;
        if (i13 >= 19 && ((i13 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f77550t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                if (i13 >= 21) {
                    string = locale.toLanguageTag();
                } else {
                    string = locale.toString();
                }
                this.f77549s = AbstractC41023g0.m133256r(string);
            }
        }
        Display display = (i13 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && AbstractC24567y.m71694y(context)) {
            if (i13 < 28) {
                strM71691v = AbstractC24567y.m71691v("sys.display-size");
            } else {
                strM71691v = AbstractC24567y.m71691v("vendor.display-size");
            }
            if (!TextUtils.isEmpty(strM71691v)) {
                try {
                    String[] strArrSplit = strM71691v.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i14 = Integer.parseInt(strArrSplit[0]);
                        int i15 = Integer.parseInt(strArrSplit[1]);
                        if (i14 > 0 && i15 > 0) {
                            point2 = new Point(i14, i15);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String strValueOf = String.valueOf(strM71691v);
                Log.e("Util", strValueOf.length() != 0 ? "Invalid display size: ".concat(strValueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(AbstractC24567y.f95877c) && AbstractC24567y.f95878d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
            } else {
                point = new Point();
                if (i13 >= 23) {
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                } else if (i13 >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
            }
            point2 = point;
        } else {
            point = new Point();
            if (i13 >= 23) {
                Display.Mode mode2 = display.getMode();
                point.x = mode2.getPhysicalWidth();
                point.y = mode2.getPhysicalHeight();
            } else if (i13 >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
            point2 = point;
        }
        mo54515f(point2.x, point2.y);
        this.f73683M = new SparseArray();
        this.f73684N = new SparseBooleanArray();
        m54516g();
    }

    public C18745g(C18744f c18744f) {
        m56899b(c18744f);
        this.f73679I = c18744f.f73656Z;
        this.f73685z = c18744f.f73657a0;
        this.f73671A = c18744f.f73658b0;
        this.f73672B = c18744f.f73659c0;
        this.f73673C = c18744f.f73660d0;
        this.f73674D = c18744f.f73661e0;
        this.f73675E = c18744f.f73662f0;
        this.f73676F = c18744f.f73663g0;
        this.f73677G = c18744f.f73664h0;
        this.f73678H = c18744f.f73665i0;
        this.f73680J = c18744f.f73666j0;
        this.f73681K = c18744f.f73667k0;
        this.f73682L = c18744f.f73668l0;
        SparseArray sparseArray = c18744f.f73669m0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            sparseArray2.put(sparseArray.keyAt(i13), new HashMap((Map) sparseArray.valueAt(i13)));
        }
        this.f73683M = sparseArray2;
        this.f73684N = c18744f.f73670n0.clone();
    }
}
