package zq0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p390p1.C28617g1;
import p390p1.InterfaceC28690z0;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: zq0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b\"\u0010#J9\u0010'\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u0003J\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\u0003J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\u0003R+\u00101\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u001eR$\u00104\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\b3\u0010/R$\u00107\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010 R$\u00109\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b8\u0010 R$\u0010;\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\b:\u0010 R$\u0010@\u001a\u00020<2\u0006\u0010\u001c\u001a\u00020<8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b:\u0010=\u001a\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00105R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00105R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00105R\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105¨\u0006E"}, m65681d2 = {"Lzq0/p;", "", "<init>", "()V", "", "isAtTop", "ownedByHeader", "Ll83/a0;", "s", "(ZZ)V", "", "dy", "a", "(F)F", "c", "n", "j", "(Z)V", "k", "d", "dx", "startedAtTop", "l", "(FFZZ)V", "Lh2/b;", "available", "b", "(J)J", "value", "u", "(F)V", "t", "()Z", "thresholdPx", "r", "(F)Z", "velocityX", "velocityY", "velocityThresholdPx", "e", "(FFZFF)Z", "i", "p", "o", "<set-?>", "Lp1/z0;", "g", "()F", "q", "pullPx", "F", "getTotalAbsX", "totalAbsX", "Z", "getArmed", "armed", "getConsumed", "consumed", "f", "headerOwnsGesture", "", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()I", "snapGeneration", "gestureActive", "finishHandled", "snapBackPending", "dismissedOffsetLocked", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40975p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28690z0 pullPx = new C28617g1(0.0f);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float totalAbsX;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean armed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean consumed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean headerOwnsGesture;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int snapGeneration;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean gestureActive;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean finishHandled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean snapBackPending;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean dismissedOffsetLocked;

    /* JADX INFO: renamed from: a */
    private final float m133032a(float dy3) {
        float fM133042g = m133042g() + dy3;
        if (fM133042g < 0.0f) {
            fM133042g = 0.0f;
        }
        float fM133042g2 = fM133042g - m133042g();
        m133036q(fM133042g);
        return fM133042g2;
    }

    /* JADX INFO: renamed from: c */
    private final void m133033c() {
        this.totalAbsX = 0.0f;
        this.armed = false;
        this.gestureActive = false;
        this.headerOwnsGesture = false;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m133034m(C40975p c40975p, float f13, float f14, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z13 = z4;
        }
        c40975p.m133047l(f13, f14, z4, z13);
    }

    /* JADX INFO: renamed from: n */
    private final void m133035n() {
        if (this.dismissedOffsetLocked) {
            m133049p();
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m133036q(float f13) {
        ((C28617g1) this.pullPx).m87023y(f13);
    }

    /* JADX INFO: renamed from: s */
    private final void m133037s(boolean isAtTop, boolean ownedByHeader) {
        this.snapGeneration++;
        m133036q(0.0f);
        this.totalAbsX = 0.0f;
        this.consumed = false;
        this.finishHandled = false;
        this.snapBackPending = false;
        this.dismissedOffsetLocked = false;
        this.gestureActive = true;
        this.armed = isAtTop;
        this.headerOwnsGesture = ownedByHeader;
    }

    /* JADX INFO: renamed from: b */
    public final long m133038b(long available) {
        if (this.consumed || !this.armed || m133042g() <= 0.0f) {
            return 0L;
        }
        this.totalAbsX = Math.abs(Float.intBitsToFloat((int) (available >> 32))) + this.totalAbsX;
        return (((long) Float.floatToRawIntBits(m133032a(Float.intBitsToFloat((int) (available & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX INFO: renamed from: d */
    public final void m133039d(boolean isAtTop) {
        m133035n();
        if (this.consumed || this.gestureActive) {
            return;
        }
        m133045j(isAtTop);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m133040e(float velocityX, float velocityY, boolean isAtTop, float thresholdPx, float velocityThresholdPx) {
        if (this.consumed || this.finishHandled) {
            return false;
        }
        if (!this.gestureActive) {
            this.gestureActive = true;
            this.armed = isAtTop;
        }
        boolean z4 = m133050r(thresholdPx) || (this.armed && isAtTop && ((Math.abs(velocityY) > Math.abs(velocityX) ? 1 : (Math.abs(velocityY) == Math.abs(velocityX) ? 0 : -1)) > 0) && (velocityY > velocityThresholdPx ? 1 : (velocityY == velocityThresholdPx ? 0 : -1)) > 0);
        this.finishHandled = true;
        if (z4) {
            this.consumed = true;
            this.dismissedOffsetLocked = true;
        } else {
            this.snapBackPending = m133042g() > 0.0f;
        }
        m133033c();
        return z4;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHeaderOwnsGesture() {
        return this.headerOwnsGesture;
    }

    /* JADX INFO: renamed from: g */
    public final float m133042g() {
        return ((C28617g1) this.pullPx).m87022x();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSnapGeneration() {
        return this.snapGeneration;
    }

    /* JADX INFO: renamed from: i */
    public final void m133044i() {
        this.snapGeneration++;
        m133036q(0.0f);
        this.snapBackPending = false;
        this.dismissedOffsetLocked = false;
        m133033c();
        this.finishHandled = false;
    }

    /* JADX INFO: renamed from: j */
    public final void m133045j(boolean isAtTop) {
        m133037s(isAtTop, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m133046k(boolean isAtTop) {
        m133037s(isAtTop, true);
    }

    /* JADX INFO: renamed from: l */
    public final void m133047l(float dx3, float dy3, boolean isAtTop, boolean startedAtTop) {
        if (this.consumed) {
            return;
        }
        if (!this.gestureActive) {
            m133045j(startedAtTop);
        }
        if (!isAtTop) {
            this.armed = false;
            m133036q(0.0f);
        }
        this.totalAbsX = Math.abs(dx3) + this.totalAbsX;
        if (this.armed) {
            m133032a(dy3);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m133048o() {
        if (this.dismissedOffsetLocked) {
            return;
        }
        this.consumed = false;
    }

    /* JADX INFO: renamed from: p */
    public final void m133049p() {
        m133044i();
        this.consumed = false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m133050r(float thresholdPx) {
        return this.armed && m133042g() >= thresholdPx && m133042g() > this.totalAbsX;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m133051t() {
        boolean z4 = this.snapBackPending;
        this.snapBackPending = false;
        return z4;
    }

    /* JADX INFO: renamed from: u */
    public final void m133052u(float value) {
        if (value < 0.0f) {
            value = 0.0f;
        }
        m133036q(value);
    }
}
