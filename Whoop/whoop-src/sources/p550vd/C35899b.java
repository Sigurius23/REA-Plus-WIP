package p550vd;

import java.util.Iterator;
import l83.C23454a0;
import p194hg.C17250k;
import p194hg.InterfaceC17244e;
import p520ud.AbstractC34786g;
import p520ud.AbstractC34787h;
import p520ud.C34780a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vd.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C35899b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f152834w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34780a f152835x;

    public /* synthetic */ C35899b(C34780a c34780a, int i13) {
        this.f152834w = i13;
        this.f152835x = c34780a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f152834w) {
            case 0:
                InterfaceC17244e listField = (InterfaceC17244e) obj;
                AbstractC22676k.m65750j(listField, "$this$listField");
                Iterator it = this.f152835x.f146459f.iterator();
                while (it.hasNext()) {
                    listField.mo48822j(new C17250k((AbstractC34787h) it.next(), C35898a.f152833w));
                }
                break;
            default:
                InterfaceC17244e listField2 = (InterfaceC17244e) obj;
                AbstractC22676k.m65750j(listField2, "$this$listField");
                Iterator it3 = this.f152835x.f146456c.iterator();
                while (it3.hasNext()) {
                    listField2.mo48822j(new C17250k((AbstractC34786g) it3.next(), C35900c.f152836w));
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
