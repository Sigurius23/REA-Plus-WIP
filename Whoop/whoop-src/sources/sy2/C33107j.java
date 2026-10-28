package sy2;

import c93.InterfaceC4339a;
import lz2.C24826b;
import p291l0.InterfaceC22940b2;
import p390p1.InterfaceC28601c1;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import ty2.AbstractC34268a;
import ty2.C34271d;

/* JADX INFO: renamed from: sy2.j */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33107j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138089w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f138090x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f138091y;

    public /* synthetic */ C33107j(int i13, Object obj, Object obj2) {
        this.f138089w = i13;
        this.f138090x = obj;
        this.f138091y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f138089w) {
            case 0:
                return Integer.valueOf(AbstractC33108k.a.m104925h((InterfaceC22940b2) this.f138090x, (InterfaceC39171c) this.f138091y));
            case 1:
                return AbstractC33099b.m104865e((Function1) this.f138090x, (C24826b) this.f138091y);
            case 2:
                return AbstractC33102e.m104892x((AbstractC34268a.a.b) this.f138090x, (String) this.f138091y);
            case 3:
                return AbstractC33111n.m104943e((Function1) this.f138090x, (C34271d) this.f138091y);
            case 4:
                return AbstractC33117t.m105003q((Function1) this.f138090x, (AbstractC34268a.a.i) this.f138091y);
            default:
                return AbstractC33117t.m105010x((InterfaceC28601c1) this.f138090x, (Function1) this.f138091y);
        }
    }
}
