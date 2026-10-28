package d51;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11333b0;
import p077d0.InterfaceC11419z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d51.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Ld51/b;", "", "", "time", "value", "Ld0/z;", "easing", "<init>", "(FFLd0/z;)V", "a", "(FFLd0/z;)Ld51/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "d", "()F", "b", "e", "c", "Ld0/z;", "()Ld0/z;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11714b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC11419z easing;

    public C11714b(float f13, float f14, InterfaceC11419z interfaceC11419z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, (i13 & 4) != 0 ? AbstractC11333b0.f36312c : interfaceC11419z);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C11714b m31299b(C11714b c11714b, float f13, float f14, InterfaceC11419z interfaceC11419z, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c11714b.time;
        }
        if ((i13 & 2) != 0) {
            f14 = c11714b.value;
        }
        if ((i13 & 4) != 0) {
            interfaceC11419z = c11714b.easing;
        }
        return c11714b.m31300a(f13, f14, interfaceC11419z);
    }

    /* JADX INFO: renamed from: a */
    public final C11714b m31300a(float time, float value, InterfaceC11419z easing) {
        AbstractC22676k.m65750j(easing, "easing");
        return new C11714b(time, value, easing);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC11419z getEasing() {
        return this.easing;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11714b)) {
            return false;
        }
        C11714b c11714b = (C11714b) other;
        return Float.compare(this.time, c11714b.time) == 0 && Float.compare(this.value, c11714b.value) == 0 && AbstractC22676k.m65745e(this.easing, c11714b.easing);
    }

    public int hashCode() {
        return this.easing.hashCode() + AbstractC11266d.m30447a(this.value, Float.hashCode(this.time) * 31, 31);
    }

    public String toString() {
        float f13 = this.time;
        float f14 = this.value;
        InterfaceC11419z interfaceC11419z = this.easing;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("AnimationKey(time=", f13, ", value=", f14, ", easing=");
        sbM8307t.append(interfaceC11419z);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    public C11714b(float f13, float f14, InterfaceC11419z easing) {
        AbstractC22676k.m65750j(easing, "easing");
        this.time = f13;
        this.value = f14;
        this.easing = easing;
    }
}
