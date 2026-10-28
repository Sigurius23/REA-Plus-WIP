package o63;

import java.util.Map;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: o63.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C27612c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C27612c f111137E;

    /* JADX INFO: renamed from: x */
    public static final C27612c f111138x;

    /* JADX INFO: renamed from: y */
    public static final C27612c f111139y;

    /* JADX INFO: renamed from: z */
    public static final C27612c f111140z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111141w;

    static {
        int i13 = 1;
        f111138x = new C27612c(i13, 0);
        f111139y = new C27612c(i13, 1);
        f111140z = new C27612c(i13, 2);
        f111137E = new C27612c(i13, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27612c(int i13, int i14) {
        super(i13);
        this.f111141w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f111141w) {
            case 0:
                Map.Entry $receiver = (Map.Entry) obj;
                AbstractC22676k.m65750j($receiver, "$this$$receiver");
                return new C27619j(((C27614e) $receiver.getKey()).f111143a, $receiver.getValue());
            case 1:
                Map.Entry $receiver2 = (Map.Entry) obj;
                AbstractC22676k.m65750j($receiver2, "$this$$receiver");
                return new C27619j(AbstractC12350b.m34587h((String) $receiver2.getKey()), $receiver2.getValue());
            case 2:
                C27614e $receiver3 = (C27614e) obj;
                AbstractC22676k.m65750j($receiver3, "$this$$receiver");
                return $receiver3.f111143a;
            default:
                String $receiver4 = (String) obj;
                AbstractC22676k.m65750j($receiver4, "$this$$receiver");
                return AbstractC12350b.m34587h($receiver4);
        }
    }
}
