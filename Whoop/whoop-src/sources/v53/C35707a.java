package v53;

import a63.C0477b;
import a63.C0479c;
import a63.C0493j;
import e63.C12777f;
import f63.C14154b;
import hc3.C17191x;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import z53.C40110b;

/* JADX INFO: renamed from: v53.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C35707a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C35707a f151917x;

    /* JADX INFO: renamed from: y */
    public static final C35707a f151918y;

    /* JADX INFO: renamed from: z */
    public static final C35707a f151919z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151920w;

    static {
        int i13 = 1;
        f151917x = new C35707a(i13, 0);
        f151918y = new C35707a(i13, 1);
        f151919z = new C35707a(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35707a(int i13, int i14) {
        super(i13);
        this.f151920w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f151920w) {
            case 0:
                C35709c install = (C35709c) obj;
                AbstractC22676k.m65750j(install, "$this$install");
                int i13 = 3;
                InterfaceC30057d interfaceC30057d = null;
                install.f151925E.m95533f(C12777f.f43725j, new C0477b(i13, 1, interfaceC30057d));
                C14154b c14154b = install.f151926F;
                C17191x c17191x = C14154b.f50999k;
                c14154b.m95533f(c17191x, new C0493j(i13, interfaceC30057d));
                c14154b.m95533f(c17191x, new C0479c(i13, 1, interfaceC30057d));
                break;
            case 1:
                AbstractC22676k.m65750j((C40110b) obj, "$this$null");
                break;
            default:
                AbstractC22676k.m65750j(obj, "$this$null");
                break;
        }
        return C23454a0.f92919a;
    }
}
