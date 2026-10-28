package b03;

import dn0.AbstractC12216p;
import h31.AbstractC16826s;
import i31.AbstractC18053h;
import ld1.AbstractC23864c;
import n31.AbstractC26223h;
import nr0.AbstractC27073f;
import p715kotlin.jvm.functions.Function1;
import u11.AbstractC34443i;
import v01.AbstractC35510l;
import w01.AbstractC36682g;
import wr0.AbstractC37528g;
import zl0.AbstractC40878j;

/* JADX INFO: renamed from: b03.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2205b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8779w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f8780x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC23864c f8781y;

    public /* synthetic */ C2205b(Function1 function1, AbstractC23864c abstractC23864c, int i13) {
        this.f8779w = i13;
        this.f8780x = function1;
        this.f8781y = abstractC23864c;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8779w) {
            case 0:
                return AbstractC2207d.m7041i(this.f8781y, this.f8780x, obj);
            case 1:
                return AbstractC12216p.m33877D(this.f8780x, this.f8781y, obj);
            case 2:
                return AbstractC16826s.m47416l(this.f8780x, this.f8781y, obj);
            case 3:
                return AbstractC18053h.m51865n(this.f8780x, this.f8781y, obj);
            case 4:
                return AbstractC26223h.m77883j(this.f8781y, this.f8780x, obj);
            case 5:
                return AbstractC27073f.m81376A(this.f8781y, this.f8780x, obj);
            case 6:
                return AbstractC34443i.m108840Y(this.f8781y, this.f8780x, obj);
            case 7:
                return AbstractC35510l.m112628D(this.f8781y, this.f8780x, obj);
            case 8:
                return AbstractC36682g.m117717E(this.f8781y, this.f8780x, obj);
            case 9:
                return AbstractC37528g.m120359u(this.f8781y, this.f8780x, obj);
            default:
                return AbstractC40878j.m132487g(this.f8781y, this.f8780x, obj);
        }
    }

    public /* synthetic */ C2205b(AbstractC23864c abstractC23864c, Function1 function1, int i13) {
        this.f8779w = i13;
        this.f8781y = abstractC23864c;
        this.f8780x = function1;
    }
}
