package i20;

import a30.C0279c;
import android.content.Context;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import b10.C2225c;
import b20.C2327g;
import c00.C3800f;
import e20.C12593a;
import java.util.List;
import kr.C22791j;
import ng3.C26701n;
import o20.C27460e;
import p023ay.C2149w;
import p20.AbstractC28739a;
import p20.C28740b;
import p20.C28747i;
import p499t9.C33623c0;
import p499t9.C33647p;
import p715kotlin.jvm.internal.AbstractC22676k;
import s20.C32077a;
import uy.C35373a;
import v03.C35516c;
import v03.C35518e;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: i20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C17967o implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69784a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f69785b;

    /* JADX INFO: renamed from: c */
    public final Object f69786c;

    public C17967o(C17931c c17931c, C17931c c17931c2) {
        this.f69785b = c17931c;
        this.f69786c = c17931c2;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class modelClass) {
        switch (this.f69784a) {
            case 0:
                AbstractC22676k.m65750j(modelClass, "modelClass");
                Context context = (Context) ((C17931c) this.f69785b).invoke();
                C17946h c17946h = (C17946h) ((C17931c) this.f69786c).invoke();
                C33623c0 c33623c0 = new C33623c0();
                C33647p c33647p = new C33647p(7);
                C26701n c26701n = new C26701n(11);
                C22791j c22791j = new C22791j();
                c22791j.f89754b = c22791j;
                c22791j.f89753a = c17946h;
                c22791j.f89755c = C35516c.m112678b(AbstractC17960l1.f69771a);
                c22791j.f89756d = new C28740b(c22791j, 0);
                c22791j.f89757e = new C28740b(c22791j, 1);
                c22791j.f89758f = C35516c.m112678b(new C12593a(c33647p, C35516c.m112678b(AbstractC28739a.f116323d), 5));
                InterfaceC35521h interfaceC35521hM112678b = C35516c.m112678b(new C35373a(c33623c0, 1));
                c22791j.f89759g = interfaceC35521hM112678b;
                c22791j.f89760h = new C2327g((InterfaceC35521h) c22791j.f89758f, interfaceC35521hM112678b, 11);
                C35518e c35518eM112679a = C35518e.m112679a(context);
                c22791j.f89761i = c35518eM112679a;
                c22791j.f89762j = new C2225c(new C28747i(c35518eM112679a, 0), 8);
                c22791j.f89763k = C35516c.m112678b(new C12593a(c26701n, C35516c.m112678b(new C2149w((C2327g) c22791j.f89760h, new C0279c((C35518e) c22791j.f89761i, (C2225c) c22791j.f89762j, C35516c.m112678b(new C2225c(c26701n, 5)), 2), (InterfaceC35521h) c22791j.f89759g, 3)), 2));
                c22791j.f89764l = C35516c.m112678b(new C3800f(c26701n, (C35518e) c22791j.f89761i, C35518e.m112679a(c17946h)));
                return new C17969p((C17957k1) ((InterfaceC35521h) c22791j.f89755c).get(), (C28740b) c22791j.f89756d, (C28740b) c22791j.f89757e);
            default:
                AbstractC22676k.m65750j(modelClass, "modelClass");
                return new C27460e((List) this.f69785b, (C32077a) this.f69786c);
        }
    }

    public C17967o(List formElements, C32077a formArguments) {
        AbstractC22676k.m65750j(formElements, "formElements");
        AbstractC22676k.m65750j(formArguments, "formArguments");
        this.f69785b = formElements;
        this.f69786c = formArguments;
    }
}
