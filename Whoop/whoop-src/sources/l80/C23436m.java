package l80;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.compose.runtime.Composer;
import androidx.room.C1810m1;
import c93.InterfaceC4352n;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p392p3.AbstractC28771i;
import p392p3.C28765d0;
import p392p3.C28772j;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p392p3.InterfaceC28767e0;
import p493t3.C33491c;
import p518ub.InterfaceC34734g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;

/* JADX INFO: renamed from: l80.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23436m implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92856w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f92857x;

    public /* synthetic */ C23436m(Object obj, int i13) {
        this.f92856w = i13;
        this.f92857x = obj;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f92856w) {
            case 0:
                return AbstractC23437n.m67931Q((Function1) this.f92857x, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                C33491c c33491c = (C33491c) this.f92857x;
                InterfaceC28767e0 interfaceC28767e0M87529b = ((C28772j) c33491c.f139823e).m87529b((AbstractC28771i) obj, (C28780r) obj2, ((C28776n) obj3).f116535a, ((C28777o) obj4).f116536a);
                if (interfaceC28767e0M87529b instanceof C28765d0) {
                    Object obj5 = ((C28765d0) interfaceC28767e0M87529b).f116515w;
                    AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                C29938w0 c29938w0 = new C29938w0(interfaceC28767e0M87529b, c33491c.f139828j);
                c33491c.f139828j = c29938w0;
                return c29938w0.m91572v();
            default:
                InterfaceC34734g interfaceC34734g = (InterfaceC34734g) this.f92857x;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                AbstractC22676k.m65747g(sQLiteQuery);
                interfaceC34734g.mo5447i(new C1810m1(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
