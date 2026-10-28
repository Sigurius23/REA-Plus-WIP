package p395p6;

import p088dc.AbstractC11895b;
import p335n6.InterfaceC26395l;

/* JADX INFO: renamed from: p6.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C28864b implements InterfaceC26395l {

    /* JADX INFO: renamed from: a */
    public final int f116802a;

    public C28864b(int i13) {
        this.f116802a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m87784a() {
        return this.f116802a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28864b) && this.f116802a == ((C28864b) obj).f116802a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116802a);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("AppWidgetId(appWidgetId="), this.f116802a, ')');
    }
}
