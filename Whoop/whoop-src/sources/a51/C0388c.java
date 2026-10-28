package a51;

import d51.AbstractC11717e;
import d51.C11716d;
import i93.InterfaceC18280f;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import m83.C25271y;
import p077d0.AbstractC11333b0;
import p077d0.InterfaceC11419z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a51.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"La51/c;", "", "", "baseValue", "Li93/f;", AttachmentExtensionsKt.EXTRA_DURATION, "Ld51/d;", "multiplierOvertime", "Ld0/z;", "easing", "<init>", "(FLi93/f;Ld51/d;Ld0/z;)V", "emitterAge", "a", "(F)Ljava/lang/Float;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getBaseValue", "()F", "b", "Li93/f;", "getDuration", "()Li93/f;", "c", "Ld51/d;", "getMultiplierOvertime", "()Ld51/d;", "d", "Ld0/z;", "getEasing", "()Ld0/z;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0388c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float baseValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC18280f duration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11716d multiplierOvertime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC11419z easing;

    public C0388c(float f13, InterfaceC18280f duration, C11716d multiplierOvertime, InterfaceC11419z easing) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(multiplierOvertime, "multiplierOvertime");
        AbstractC22676k.m65750j(easing, "easing");
        this.baseValue = f13;
        this.duration = duration;
        this.multiplierOvertime = multiplierOvertime;
        this.easing = easing;
    }

    /* JADX INFO: renamed from: a */
    public final Float m1062a(float emitterAge) {
        if (!this.duration.mo52654c(Float.valueOf(emitterAge))) {
            return null;
        }
        InterfaceC18280f interfaceC18280f = this.duration;
        float fMo7226i = this.easing.mo7226i(AbstractC11717e.m31312a(interfaceC18280f, emitterAge - ((Number) interfaceC18280f.getStart()).floatValue()));
        return Float.valueOf(this.multiplierOvertime.m31309d(fMo7226i) * this.baseValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0388c)) {
            return false;
        }
        C0388c c0388c = (C0388c) other;
        return Float.compare(this.baseValue, c0388c.baseValue) == 0 && AbstractC22676k.m65745e(this.duration, c0388c.duration) && AbstractC22676k.m65745e(this.multiplierOvertime, c0388c.multiplierOvertime) && AbstractC22676k.m65745e(this.easing, c0388c.easing);
    }

    public int hashCode() {
        return this.easing.hashCode() + ((this.multiplierOvertime.hashCode() + ((this.duration.hashCode() + (Float.hashCode(this.baseValue) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "EmitterAnimationAttribute(baseValue=" + this.baseValue + ", duration=" + this.duration + ", multiplierOvertime=" + this.multiplierOvertime + ", easing=" + this.easing + ")";
    }

    public C0388c(float f13, InterfaceC18280f interfaceC18280f, C11716d c11716d, InterfaceC11419z interfaceC11419z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, interfaceC18280f, (i13 & 4) != 0 ? new C11716d(1.0f, C25271y.f99162w, 1.0f, null, 8, null) : c11716d, (i13 & 8) != 0 ? AbstractC11333b0.f36312c : interfaceC11419z);
    }
}
