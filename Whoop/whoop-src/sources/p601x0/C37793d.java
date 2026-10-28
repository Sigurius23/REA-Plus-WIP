package p601x0;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: x0.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C37793d extends AbstractC37791b {

    /* JADX INFO: renamed from: b */
    public final String f161893b;

    /* JADX INFO: renamed from: c */
    public final int f161894c;

    /* JADX INFO: renamed from: d */
    public final Function1 f161895d;

    public C37793d(Object obj, String str, int i13, Function1 function1) {
        super(obj);
        this.f161893b = str;
        this.f161894c = i13;
        this.f161895d = function1;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TextContextMenuItem(key=");
        sb4.append(this.f161890a);
        sb4.append(", label=\"");
        sb4.append(this.f161893b);
        sb4.append("\", leadingIcon=");
        return AbstractC11895b.m31999r(sb4, this.f161894c, ')');
    }
}
