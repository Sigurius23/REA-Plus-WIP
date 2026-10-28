package a81;

import bj0.AbstractC3329b;
import com.whoop.profile.view.ProfileScreenContentKt;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25306o;
import p739ui0.AbstractC35005g;
import p739ui0.AbstractC35009k;
import p739ui0.AbstractC35014p;
import zi0.AbstractC40662a;

/* JADX INFO: renamed from: a81.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0559j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1940w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f1941x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C25306o f1942y;

    public /* synthetic */ C0559j(Function1 function1, C25306o c25306o, int i13) {
        this.f1940w = i13;
        this.f1941x = function1;
        this.f1942y = c25306o;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1940w) {
            case 0:
                return AbstractC0564o.m1392N(this.f1941x, this.f1942y, obj);
            case 1:
                return AbstractC0564o.m1379A(this.f1941x, this.f1942y, obj);
            case 2:
                return AbstractC3329b.m9631i(this.f1941x, this.f1942y, obj);
            case 3:
                return ProfileScreenContentKt.ProfileContentArea$lambda$4$0$1$0$0$0$0$0(this.f1941x, this.f1942y, obj);
            case 4:
                return AbstractC35005g.m110532i(this.f1941x, this.f1942y, obj);
            case 5:
                return AbstractC35009k.m110553t(this.f1941x, this.f1942y, obj);
            case 6:
                return AbstractC35014p.m110626q(this.f1941x, this.f1942y, obj);
            default:
                return AbstractC40662a.m131953I(this.f1941x, this.f1942y, obj);
        }
    }
}
