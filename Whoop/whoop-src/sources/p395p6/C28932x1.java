package p395p6;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p636y3.C39176h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p6.x1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28932x1 {

    /* JADX INFO: renamed from: a */
    public final Context f117049a;

    /* JADX INFO: renamed from: b */
    public final int f117050b;

    /* JADX INFO: renamed from: c */
    public final boolean f117051c;

    /* JADX INFO: renamed from: d */
    public final C28936z0 f117052d;

    /* JADX INFO: renamed from: e */
    public final int f117053e;

    /* JADX INFO: renamed from: f */
    public final boolean f117054f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f117055g;

    /* JADX INFO: renamed from: h */
    public final C28931x0 f117056h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f117057i;

    /* JADX INFO: renamed from: j */
    public final long f117058j;

    /* JADX INFO: renamed from: k */
    public final int f117059k;

    /* JADX INFO: renamed from: l */
    public final boolean f117060l;

    /* JADX INFO: renamed from: m */
    public final Integer f117061m;

    /* JADX INFO: renamed from: n */
    public final ComponentName f117062n;

    /* JADX INFO: renamed from: o */
    public final C28919t0 f117063o;

    public C28932x1(Context context, int i13, boolean z4, C28936z0 c28936z0, int i14, boolean z13, AtomicInteger atomicInteger, C28931x0 c28931x0, AtomicBoolean atomicBoolean, long j7, int i15, boolean z14, Integer num, ComponentName componentName, C28919t0 c28919t0) {
        this.f117049a = context;
        this.f117050b = i13;
        this.f117051c = z4;
        this.f117052d = c28936z0;
        this.f117053e = i14;
        this.f117054f = z13;
        this.f117055g = atomicInteger;
        this.f117056h = c28931x0;
        this.f117057i = atomicBoolean;
        this.f117058j = j7;
        this.f117059k = i15;
        this.f117060l = z14;
        this.f117061m = num;
        this.f117062n = componentName;
        this.f117063o = c28919t0;
    }

    /* JADX INFO: renamed from: a */
    public static C28932x1 m87840a(C28932x1 c28932x1, int i13, AtomicInteger atomicInteger, C28931x0 c28931x0, AtomicBoolean atomicBoolean, long j7, Integer num, int i14) {
        return new C28932x1(c28932x1.f117049a, c28932x1.f117050b, c28932x1.f117051c, c28932x1.f117052d, (i14 & 16) != 0 ? c28932x1.f117053e : i13, (i14 & 32) != 0 ? c28932x1.f117054f : true, (i14 & 64) != 0 ? c28932x1.f117055g : atomicInteger, (i14 & 128) != 0 ? c28932x1.f117056h : c28931x0, (i14 & 256) != 0 ? c28932x1.f117057i : atomicBoolean, (i14 & 512) != 0 ? c28932x1.f117058j : j7, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c28932x1.f117059k : 0, (i14 & 4096) != 0 ? c28932x1.f117060l : true, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c28932x1.f117061m : num, c28932x1.f117062n, c28932x1.f117063o);
    }

    /* JADX INFO: renamed from: b */
    public final C28932x1 m87841b(C28931x0 c28931x0, int i13) {
        return m87840a(this, i13, null, c28931x0, null, 0L, null, 65391);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28932x1)) {
            return false;
        }
        C28932x1 c28932x1 = (C28932x1) obj;
        return this.f117049a.equals(c28932x1.f117049a) && this.f117050b == c28932x1.f117050b && this.f117051c == c28932x1.f117051c && this.f117052d.equals(c28932x1.f117052d) && this.f117053e == c28932x1.f117053e && this.f117054f == c28932x1.f117054f && AbstractC22676k.m65745e(this.f117055g, c28932x1.f117055g) && AbstractC22676k.m65745e(this.f117056h, c28932x1.f117056h) && AbstractC22676k.m65745e(this.f117057i, c28932x1.f117057i) && C39176h.m124785a(this.f117058j, c28932x1.f117058j) && this.f117059k == c28932x1.f117059k && this.f117060l == c28932x1.f117060l && AbstractC22676k.m65745e(this.f117061m, c28932x1.f117061m) && AbstractC22676k.m65745e(this.f117062n, c28932x1.f117062n) && this.f117063o.equals(c28932x1.f117063o);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(-1, AbstractC11266d.m30448b(this.f117059k, AbstractC11266d.m30451e((this.f117057i.hashCode() + ((this.f117056h.hashCode() + ((this.f117055g.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.f117053e, (this.f117052d.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.f117050b, this.f117049a.hashCode() * 31, 31), 31, this.f117051c)) * 31, 31), 31, this.f117054f)) * 31)) * 31)) * 31, this.f117058j, 31), 31), 31), 31, this.f117060l);
        Integer num = this.f117061m;
        int iHashCode = (iM8289b + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.f117062n;
        return this.f117063o.hashCode() + ((iHashCode + (componentName != null ? componentName.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.f117049a + ", appWidgetId=" + this.f117050b + ", isRtl=" + this.f117051c + ", layoutConfiguration=" + this.f117052d + ", itemPosition=" + this.f117053e + ", isLazyCollectionDescendant=" + this.f117054f + ", lastViewId=" + this.f117055g + ", parentContext=" + this.f117056h + ", isBackgroundSpecified=" + this.f117057i + ", layoutSize=" + ((Object) C39176h.m124788d(this.f117058j)) + ", layoutCollectionViewId=" + this.f117059k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.f117060l + ", actionTargetId=" + this.f117061m + ", actionBroadcastReceiver=" + this.f117062n + ", glanceComponents=" + this.f117063o + ')';
    }
}
