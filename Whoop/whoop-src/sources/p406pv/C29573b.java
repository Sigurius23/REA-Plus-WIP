package p406pv;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.ScreenCoordinate;
import ih0.AbstractC18489d0;
import java.util.Objects;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: pv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29573b implements Parcelable {
    public static final Parcelable.Creator<C29573b> CREATOR = new C29367a(16);

    /* JADX INFO: renamed from: E */
    public final boolean f120660E;

    /* JADX INFO: renamed from: F */
    public final int f120661F;

    /* JADX INFO: renamed from: G */
    public final boolean f120662G;

    /* JADX INFO: renamed from: H */
    public final boolean f120663H;

    /* JADX INFO: renamed from: I */
    public final boolean f120664I;

    /* JADX INFO: renamed from: J */
    public final ScreenCoordinate f120665J;

    /* JADX INFO: renamed from: K */
    public final boolean f120666K;

    /* JADX INFO: renamed from: L */
    public final boolean f120667L;

    /* JADX INFO: renamed from: M */
    public final boolean f120668M;

    /* JADX INFO: renamed from: N */
    public final boolean f120669N;

    /* JADX INFO: renamed from: O */
    public final boolean f120670O;

    /* JADX INFO: renamed from: P */
    public final float f120671P;

    /* JADX INFO: renamed from: Q */
    public final boolean f120672Q;

    /* JADX INFO: renamed from: w */
    public final boolean f120673w;

    /* JADX INFO: renamed from: x */
    public final boolean f120674x;

    /* JADX INFO: renamed from: y */
    public final boolean f120675y;

    /* JADX INFO: renamed from: z */
    public final boolean f120676z;

    public C29573b(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, int i13, boolean z17, boolean z18, boolean z19, ScreenCoordinate screenCoordinate, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, float f13, boolean z29) {
        this.f120673w = z4;
        this.f120674x = z13;
        this.f120675y = z14;
        this.f120676z = z15;
        this.f120660E = z16;
        this.f120661F = i13;
        this.f120662G = z17;
        this.f120663H = z18;
        this.f120664I = z19;
        this.f120665J = screenCoordinate;
        this.f120666K = z24;
        this.f120667L = z25;
        this.f120668M = z26;
        this.f120669N = z27;
        this.f120670O = z28;
        this.f120671P = f13;
        this.f120672Q = z29;
    }

    /* JADX INFO: renamed from: b */
    public final C29572a m90661b() {
        C29572a c29572a = new C29572a();
        c29572a.f120643a = this.f120673w;
        c29572a.f120644b = this.f120674x;
        c29572a.f120645c = this.f120675y;
        c29572a.f120646d = this.f120676z;
        c29572a.f120647e = this.f120660E;
        int i13 = this.f120661F;
        AbstractC18489d0.m53382w(i13, "scrollMode");
        c29572a.f120648f = i13;
        c29572a.f120649g = this.f120662G;
        c29572a.f120650h = this.f120663H;
        c29572a.f120651i = this.f120664I;
        c29572a.f120652j = this.f120665J;
        c29572a.f120653k = this.f120666K;
        c29572a.f120654l = this.f120667L;
        c29572a.f120655m = this.f120668M;
        c29572a.f120656n = this.f120669N;
        c29572a.f120657o = this.f120670O;
        c29572a.f120658p = this.f120671P;
        c29572a.f120659q = this.f120672Q;
        return c29572a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C29573b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.gestures.generated.GesturesSettings");
        C29573b c29573b = (C29573b) obj;
        return this.f120673w == c29573b.f120673w && this.f120674x == c29573b.f120674x && this.f120675y == c29573b.f120675y && this.f120676z == c29573b.f120676z && this.f120660E == c29573b.f120660E && this.f120661F == c29573b.f120661F && this.f120662G == c29573b.f120662G && this.f120663H == c29573b.f120663H && this.f120664I == c29573b.f120664I && AbstractC22676k.m65745e(this.f120665J, c29573b.f120665J) && this.f120666K == c29573b.f120666K && this.f120667L == c29573b.f120667L && this.f120668M == c29573b.f120668M && this.f120669N == c29573b.f120669N && this.f120670O == c29573b.f120670O && Float.compare(this.f120671P, c29573b.f120671P) == 0 && this.f120672Q == c29573b.f120672Q;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f120673w), Boolean.valueOf(this.f120674x), Boolean.valueOf(this.f120675y), Boolean.valueOf(this.f120676z), Boolean.valueOf(this.f120660E), AbstractC12682p.m35481a(this.f120661F), Boolean.valueOf(this.f120662G), Boolean.valueOf(this.f120663H), Boolean.valueOf(this.f120664I), this.f120665J, Boolean.valueOf(this.f120666K), Boolean.valueOf(this.f120667L), Boolean.valueOf(this.f120668M), Boolean.valueOf(this.f120669N), Boolean.valueOf(this.f120670O), Float.valueOf(this.f120671P), Boolean.valueOf(this.f120672Q));
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("GesturesSettings(rotateEnabled=");
        sb4.append(this.f120673w);
        sb4.append(",\n      pinchToZoomEnabled=");
        sb4.append(this.f120674x);
        sb4.append(", scrollEnabled=");
        sb4.append(this.f120675y);
        sb4.append(",\n      simultaneousRotateAndPinchToZoomEnabled=");
        sb4.append(this.f120676z);
        sb4.append(",\n      pitchEnabled=");
        sb4.append(this.f120660E);
        sb4.append(", scrollMode=");
        int i13 = this.f120661F;
        if (i13 == 1) {
            str = "HORIZONTAL";
        } else if (i13 != 2) {
            str = i13 != 3 ? "null" : "HORIZONTAL_AND_VERTICAL";
        } else {
            str = "VERTICAL";
        }
        sb4.append(str);
        sb4.append(",\n      doubleTapToZoomInEnabled=");
        sb4.append(this.f120662G);
        sb4.append(",\n      doubleTouchToZoomOutEnabled=");
        sb4.append(this.f120663H);
        sb4.append(", quickZoomEnabled=");
        sb4.append(this.f120664I);
        sb4.append(",\n      focalPoint=");
        sb4.append(this.f120665J);
        sb4.append(", pinchToZoomDecelerationEnabled=");
        sb4.append(this.f120666K);
        sb4.append(",\n      rotateDecelerationEnabled=");
        sb4.append(this.f120667L);
        sb4.append(",\n      scrollDecelerationEnabled=");
        sb4.append(this.f120668M);
        sb4.append(",\n      increaseRotateThresholdWhenPinchingToZoom=");
        sb4.append(this.f120669N);
        sb4.append(",\n      increasePinchToZoomThresholdWhenRotating=");
        sb4.append(this.f120670O);
        sb4.append(",\n      zoomAnimationAmount=");
        sb4.append(this.f120671P);
        sb4.append(",\n      pinchScrollEnabled=");
        sb4.append(this.f120672Q);
        sb4.append(')');
        return AbstractC39415s.m125909s(sb4.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        String str;
        AbstractC22676k.m65750j(out, "out");
        out.writeInt(this.f120673w ? 1 : 0);
        out.writeInt(this.f120674x ? 1 : 0);
        out.writeInt(this.f120675y ? 1 : 0);
        out.writeInt(this.f120676z ? 1 : 0);
        out.writeInt(this.f120660E ? 1 : 0);
        int i14 = this.f120661F;
        if (i14 == 1) {
            str = "HORIZONTAL";
        } else if (i14 == 2) {
            str = "VERTICAL";
        } else {
            if (i14 != 3) {
                throw null;
            }
            str = "HORIZONTAL_AND_VERTICAL";
        }
        out.writeString(str);
        out.writeInt(this.f120662G ? 1 : 0);
        out.writeInt(this.f120663H ? 1 : 0);
        out.writeInt(this.f120664I ? 1 : 0);
        out.writeSerializable(this.f120665J);
        out.writeInt(this.f120666K ? 1 : 0);
        out.writeInt(this.f120667L ? 1 : 0);
        out.writeInt(this.f120668M ? 1 : 0);
        out.writeInt(this.f120669N ? 1 : 0);
        out.writeInt(this.f120670O ? 1 : 0);
        out.writeFloat(this.f120671P);
        out.writeInt(this.f120672Q ? 1 : 0);
    }
}
