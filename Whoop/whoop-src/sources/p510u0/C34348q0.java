package p510u0;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: u0.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34348q0 {

    /* JADX INFO: renamed from: g */
    public static final C34348q0 f144287g = new C34348q0(null, null, null, null, 63);

    /* JADX INFO: renamed from: a */
    public final Function1 f144288a;

    /* JADX INFO: renamed from: b */
    public final Function1 f144289b;

    /* JADX INFO: renamed from: c */
    public final Function1 f144290c;

    /* JADX INFO: renamed from: d */
    public final Function1 f144291d;

    /* JADX INFO: renamed from: e */
    public final Function1 f144292e;

    /* JADX INFO: renamed from: f */
    public final Function1 f144293f;

    public /* synthetic */ C34348q0(Function1 function1, Function1 function2, Function1 function3, Function1 function4, int i13) {
        this((i13 & 1) != 0 ? null : function1, null, (i13 & 4) != 0 ? null : function2, null, (i13 & 16) != 0 ? null : function3, (i13 & 32) != 0 ? null : function4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34348q0)) {
            return false;
        }
        C34348q0 c34348q0 = (C34348q0) obj;
        return this.f144288a == c34348q0.f144288a && this.f144289b == c34348q0.f144289b && this.f144290c == c34348q0.f144290c && this.f144291d == c34348q0.f144291d && this.f144292e == c34348q0.f144292e && this.f144293f == c34348q0.f144293f;
    }

    public final int hashCode() {
        Function1 function1 = this.f144288a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function2 = this.f144289b;
        int iHashCode2 = (iHashCode + (function2 != null ? function2.hashCode() : 0)) * 31;
        Function1 function3 = this.f144290c;
        int iHashCode3 = (iHashCode2 + (function3 != null ? function3.hashCode() : 0)) * 31;
        Function1 function4 = this.f144291d;
        int iHashCode4 = (iHashCode3 + (function4 != null ? function4.hashCode() : 0)) * 31;
        Function1 function5 = this.f144292e;
        int iHashCode5 = (iHashCode4 + (function5 != null ? function5.hashCode() : 0)) * 31;
        Function1 function6 = this.f144293f;
        return iHashCode5 + (function6 != null ? function6.hashCode() : 0);
    }

    public C34348q0(Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6) {
        this.f144288a = function1;
        this.f144289b = function2;
        this.f144290c = function3;
        this.f144291d = function4;
        this.f144292e = function5;
        this.f144293f = function6;
    }
}
