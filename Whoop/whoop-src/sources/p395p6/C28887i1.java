package p395p6;

import p335n6.InterfaceC26388e;
import p335n6.InterfaceC26397n;
import p358o6.C27594b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p6.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28887i1 implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C28887i1 f116928x = new C28887i1(0);

    /* JADX INFO: renamed from: y */
    public static final C28887i1 f116929y = new C28887i1(1);

    /* JADX INFO: renamed from: z */
    public static final C28887i1 f116930z = new C28887i1(2);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116931w;

    public /* synthetic */ C28887i1(int i13) {
        this.f116931w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116931w) {
            case 0:
                return Boolean.valueOf(((InterfaceC26397n) obj) instanceof C27594b);
            case 1:
                return Boolean.valueOf(((InterfaceC26397n) obj) instanceof InterfaceC26388e);
            default:
                return Boolean.valueOf(((InterfaceC26397n) obj) instanceof C27594b);
        }
    }
}
