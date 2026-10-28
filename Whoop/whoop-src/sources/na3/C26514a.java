package na3;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.List;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lg3.C24055q;
import ob3.InterfaceC27797g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: na3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C26514a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f105420w = 1;

    /* JADX INFO: renamed from: x */
    public final List f105421x;

    public C26514a(List list, C24055q c24055q) {
        this.f105421x = list;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f105420w) {
            case 0:
                List<InterfaceC27797g> list = this.f105421x;
                ArrayList arrayList = new ArrayList();
                for (InterfaceC27797g interfaceC27797g : list) {
                    AbstractC22676k.m65750j(interfaceC27797g, "<this>");
                    AbstractC23811y abstractC23811yM69884c = AbstractC23791o.m69884c((AbstractC23811y) interfaceC27797g);
                    if (abstractC23811yM69884c != null) {
                        arrayList.add(abstractC23811yM69884c);
                    }
                }
                return arrayList;
            default:
                return this.f105421x;
        }
    }

    public C26514a(List list) {
        this.f105421x = list;
    }
}
