package bc3;

import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bc3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C3064v {

    /* JADX INFO: renamed from: a */
    public final Object f12095a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3021j f12096b;

    /* JADX INFO: renamed from: c */
    public final Function3 f12097c;

    /* JADX INFO: renamed from: d */
    public final Object f12098d;

    /* JADX INFO: renamed from: e */
    public final Throwable f12099e;

    public C3064v(Object obj, InterfaceC3021j interfaceC3021j, Function3 function3, Object obj2, Throwable th3) {
        this.f12095a = obj;
        this.f12096b = interfaceC3021j;
        this.f12097c = function3;
        this.f12098d = obj2;
        this.f12099e = th3;
    }

    /* JADX INFO: renamed from: a */
    public static C3064v m8824a(C3064v c3064v, InterfaceC3021j interfaceC3021j, Throwable th3, int i13) {
        Object obj = c3064v.f12095a;
        if ((i13 & 2) != 0) {
            interfaceC3021j = c3064v.f12096b;
        }
        InterfaceC3021j interfaceC3021j2 = interfaceC3021j;
        Function3 function3 = c3064v.f12097c;
        Object obj2 = c3064v.f12098d;
        if ((i13 & 16) != 0) {
            th3 = c3064v.f12099e;
        }
        return new C3064v(obj, interfaceC3021j2, function3, obj2, th3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3064v)) {
            return false;
        }
        C3064v c3064v = (C3064v) obj;
        return AbstractC22676k.m65745e(this.f12095a, c3064v.f12095a) && AbstractC22676k.m65745e(this.f12096b, c3064v.f12096b) && AbstractC22676k.m65745e(this.f12097c, c3064v.f12097c) && AbstractC22676k.m65745e(this.f12098d, c3064v.f12098d) && AbstractC22676k.m65745e(this.f12099e, c3064v.f12099e);
    }

    public final int hashCode() {
        Object obj = this.f12095a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC3021j interfaceC3021j = this.f12096b;
        int iHashCode2 = (iHashCode + (interfaceC3021j == null ? 0 : interfaceC3021j.hashCode())) * 31;
        Function3 function3 = this.f12097c;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj2 = this.f12098d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th3 = this.f12099e;
        return iHashCode4 + (th3 != null ? th3.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f12095a + ", cancelHandler=" + this.f12096b + ", onCancellation=" + this.f12097c + ", idempotentResume=" + this.f12098d + ", cancelCause=" + this.f12099e + ')';
    }

    public /* synthetic */ C3064v(Object obj, InterfaceC3021j interfaceC3021j, Function3 function3, Throwable th3, int i13) {
        this(obj, (i13 & 2) != 0 ? null : interfaceC3021j, (i13 & 4) != 0 ? null : function3, (Object) null, (i13 & 16) != 0 ? null : th3);
    }
}
