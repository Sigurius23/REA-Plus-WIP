package androidx.compose.p018ui.graphics.painter;

import p000.AbstractC11266d;
import p208i2.AbstractC17921y;
import p208i2.C17885g;
import p270k2.InterfaceC22131e;
import p331n2.AbstractC26165a;
import p636y3.C39178j;
import p636y3.C39180l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35744b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Ln2/a;", "ui-graphics_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class BitmapPainter extends AbstractC26165a {

    /* JADX INFO: renamed from: E */
    public final C17885g f4813E;

    /* JADX INFO: renamed from: F */
    public final long f4814F;

    /* JADX INFO: renamed from: G */
    public int f4815G;

    /* JADX INFO: renamed from: H */
    public final long f4816H;

    /* JADX INFO: renamed from: I */
    public float f4817I;

    /* JADX INFO: renamed from: J */
    public AbstractC17921y f4818J;

    public BitmapPainter(C17885g c17885g) {
        this(c17885g, (((long) c17885g.f69577a.getHeight()) & 4294967295L) | (((long) c17885g.f69577a.getWidth()) << 32));
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: b */
    public final void mo3489b(float f13) {
        this.f4817I = f13;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: e */
    public final void mo3490e(AbstractC17921y abstractC17921y) {
        this.f4818J = abstractC17921y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return AbstractC22676k.m65745e(this.f4813E, bitmapPainter.f4813E) && C39178j.m124792b(0L, 0L) && C39180l.m124799a(this.f4814F, bitmapPainter.f4814F) && this.f4815G == bitmapPainter.f4815G;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: h */
    public final long getF4822H() {
        return AbstractC35744b.m113239l(this.f4816H);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4815G) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(this.f4813E.hashCode() * 31, 0L, 31), this.f4814F, 31);
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: i */
    public final void mo3492i(InterfaceC22131e interfaceC22131e) {
        int iRound = Math.round(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)));
        float f13 = this.f4817I;
        AbstractC17921y abstractC17921y = this.f4818J;
        int i13 = this.f4815G;
        InterfaceC22131e.m63377K0(interfaceC22131e, this.f4813E, this.f4814F, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f13, abstractC17921y, i13, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("BitmapPainter(image=");
        sb4.append(this.f4813E);
        sb4.append(", srcOffset=");
        sb4.append((Object) C39178j.m124795e(0L));
        sb4.append(", srcSize=");
        sb4.append((Object) C39180l.m124800b(this.f4814F));
        sb4.append(", filterQuality=");
        int i13 = this.f4815G;
        if (i13 == 0) {
            str = "None";
        } else if (i13 == 1) {
            str = "Low";
        } else if (i13 == 2) {
            str = "Medium";
        } else {
            str = i13 == 3 ? "High" : "Unknown";
        }
        sb4.append((Object) str);
        sb4.append(')');
        return sb4.toString();
    }

    public BitmapPainter(C17885g c17885g, long j7) {
        int i13;
        int i14;
        this.f4813E = c17885g;
        this.f4814F = j7;
        this.f4815G = 1;
        if (((int) 0) >= 0 && ((int) 0) >= 0 && (i13 = (int) (j7 >> 32)) >= 0 && (i14 = (int) (4294967295L & j7)) >= 0 && i13 <= c17885g.f69577a.getWidth() && i14 <= c17885g.f69577a.getHeight()) {
            this.f4816H = j7;
            this.f4817I = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
