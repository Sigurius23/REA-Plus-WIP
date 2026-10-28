package d01;

import c93.InterfaceC4339a;
import e41.AbstractC12702g;
import e41.AbstractC12705j;
import fo2.AbstractC14665c;
import ny0.AbstractC27265l0;
import o11.AbstractC27401g;
import o11.AbstractC27406l;
import p077d0.C11362i1;
import p163g1.AbstractC14987d7;
import p163g1.C15093n7;
import p715kotlin.jvm.functions.Function1;
import u01.AbstractC34382d;

/* JADX INFO: renamed from: d01.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11439d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36678w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f36679x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f36680y;

    public /* synthetic */ C11439d(Object obj, Function1 function1) {
        this.f36678w = 4;
        C11362i1 c11362i1 = AbstractC14987d7.f56024a;
        this.f36680y = obj;
        this.f36679x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f36678w;
        Object obj = this.f36680y;
        Function1 function1 = this.f36679x;
        switch (i13) {
            case 0:
                return AbstractC11440e.m30697e(obj, function1);
            case 1:
                return AbstractC12702g.m35524p(function1, obj);
            case 2:
                return AbstractC12705j.m35548d(function1, obj);
            case 3:
                return AbstractC14665c.m41901o(function1, obj);
            case 4:
                C11362i1 c11362i1 = AbstractC14987d7.f56024a;
                return new C15093n7(obj, function1);
            case 5:
                return AbstractC27265l0.m82219k(function1, obj);
            case 6:
                return AbstractC27401g.m82593s(obj, function1);
            case 7:
                return AbstractC27401g.m82594t(function1, obj);
            case 8:
                return AbstractC27401g.m82564G(function1, obj);
            case 9:
                return AbstractC27406l.m82645F(function1, obj);
            case 10:
                return AbstractC27406l.m82674u(function1, obj);
            default:
                return AbstractC34382d.m108683A(function1, obj);
        }
    }

    public /* synthetic */ C11439d(Object obj, Function1 function1, int i13) {
        this.f36678w = i13;
        this.f36680y = obj;
        this.f36679x = function1;
    }

    public /* synthetic */ C11439d(Function1 function1, Object obj, int i13) {
        this.f36678w = i13;
        this.f36679x = function1;
        this.f36680y = obj;
    }
}
