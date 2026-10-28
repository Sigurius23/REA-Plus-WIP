package cw2;

import c93.InterfaceC4339a;
import com.whoop.navigation.models.GenericInteraction;
import i11.AbstractC17862e;
import i31.AbstractC18048c;
import nr0.AbstractC27076i;
import p715kotlin.jvm.functions.Function1;
import p736sz0.AbstractC33174e;
import u01.AbstractC34382d;
import wr0.AbstractC37566z;
import zq0.AbstractC40965f;
import zq0.AbstractC40983x;

/* JADX INFO: renamed from: cw2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C11161b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35721w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f35722x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ GenericInteraction f35723y;

    public /* synthetic */ C11161b(GenericInteraction genericInteraction, Function1 function1, int i13) {
        this.f35721w = i13;
        this.f35723y = genericInteraction;
        this.f35722x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f35721w) {
            case 0:
                return AbstractC11163d.m30255g(this.f35723y, this.f35722x);
            case 1:
                return AbstractC17862e.m51360s(this.f35722x, this.f35723y);
            case 2:
                return AbstractC17862e.m51353l(this.f35722x, this.f35723y);
            case 3:
                return AbstractC18048c.m51830j(this.f35722x, this.f35723y);
            case 4:
                return AbstractC27076i.m81420g(this.f35722x, this.f35723y);
            case 5:
                return AbstractC33174e.m105108o(this.f35722x, this.f35723y);
            case 6:
                return AbstractC34382d.m108700q(this.f35722x, this.f35723y);
            case 7:
                return AbstractC37566z.m120584o(this.f35722x, this.f35723y);
            case 8:
                return AbstractC37566z.m120589t(this.f35722x, this.f35723y);
            case 9:
                return AbstractC40965f.m132930B(this.f35723y, this.f35722x);
            default:
                return AbstractC40983x.m133080j(this.f35722x, this.f35723y);
        }
    }

    public /* synthetic */ C11161b(Function1 function1, GenericInteraction genericInteraction, int i13) {
        this.f35721w = i13;
        this.f35722x = function1;
        this.f35723y = genericInteraction;
    }
}
