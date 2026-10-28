package h53;

import c93.InterfaceC4351m;
import i53.C18129a;
import i53.C18130b;
import i53.C18131c;
import i53.C18132d;
import i53.C18133e;
import i53.C18134f;
import i53.C18135g;
import i53.C18136h;
import i53.C18139k;
import i53.C18140l;
import i53.C18141m;
import i53.C18142n;
import i53.C18143o;
import i53.C18145q;
import i53.C18146r;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h53.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C16945j extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public static final C16945j f65057E;

    /* JADX INFO: renamed from: F */
    public static final C16945j f65058F;

    /* JADX INFO: renamed from: G */
    public static final C16945j f65059G;

    /* JADX INFO: renamed from: H */
    public static final C16945j f65060H;

    /* JADX INFO: renamed from: I */
    public static final C16945j f65061I;

    /* JADX INFO: renamed from: J */
    public static final C16945j f65062J;

    /* JADX INFO: renamed from: K */
    public static final C16945j f65063K;

    /* JADX INFO: renamed from: x */
    public static final C16945j f65064x;

    /* JADX INFO: renamed from: y */
    public static final C16945j f65065y;

    /* JADX INFO: renamed from: z */
    public static final C16945j f65066z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65067w;

    static {
        int i13 = 2;
        f65064x = new C16945j(i13, 0);
        f65065y = new C16945j(i13, 1);
        f65066z = new C16945j(i13, 2);
        f65057E = new C16945j(i13, 3);
        f65058F = new C16945j(i13, 4);
        f65059G = new C16945j(i13, 5);
        f65060H = new C16945j(i13, 6);
        f65061I = new C16945j(i13, 7);
        f65062J = new C16945j(i13, 8);
        f65063K = new C16945j(i13, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16945j(int i13, int i14) {
        super(i13);
        this.f65067w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f65067w) {
            case 0:
                C18133e onEvent = (C18133e) obj;
                C18139k it = (C18139k) obj2;
                AbstractC22676k.m65750j(onEvent, "$this$onEvent");
                AbstractC22676k.m65750j(it, "it");
                return new C18130b(it.f70434a, it.f70435b);
            case 1:
                C18133e onEvent2 = (C18133e) obj;
                C18140l it3 = (C18140l) obj2;
                AbstractC22676k.m65750j(onEvent2, "$this$onEvent");
                AbstractC22676k.m65750j(it3, "it");
                return new C18129a(it3.f70436a);
            case 2:
                C18133e onEvent3 = (C18133e) obj;
                AbstractC22676k.m65750j(onEvent3, "$this$onEvent");
                AbstractC22676k.m65750j((C18142n) obj2, "it");
                return C18134f.f70431a;
            case 3:
                C18133e onEvent4 = (C18133e) obj;
                AbstractC22676k.m65750j(onEvent4, "$this$onEvent");
                AbstractC22676k.m65750j((C18146r) obj2, "it");
                return C18136h.f70433a;
            case 4:
                C18133e onEvent5 = (C18133e) obj;
                C18145q it4 = (C18145q) obj2;
                AbstractC22676k.m65750j(onEvent5, "$this$onEvent");
                AbstractC22676k.m65750j(it4, "it");
                return new C18132d(it4.f70441a);
            case 5:
                C18133e onEvent6 = (C18133e) obj;
                C18141m it5 = (C18141m) obj2;
                AbstractC22676k.m65750j(onEvent6, "$this$onEvent");
                AbstractC22676k.m65750j(it5, "it");
                return new C18133e(it5.f70437a, it5.f70438b);
            case 6:
                C18133e onEvent7 = (C18133e) obj;
                AbstractC22676k.m65750j(onEvent7, "$this$onEvent");
                AbstractC22676k.m65750j((C18143o) obj2, "it");
                return C18131c.f70427a;
            case 7:
                C18133e onEvent8 = (C18133e) obj;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                AbstractC22676k.m65750j(onEvent8, "$this$onEvent");
                AbstractC22676k.m65750j(null, "it");
                return C18135g.f70432a;
            case 8:
                C18132d onEvent9 = (C18132d) obj;
                C18139k it6 = (C18139k) obj2;
                AbstractC22676k.m65750j(onEvent9, "$this$onEvent");
                AbstractC22676k.m65750j(it6, "it");
                return new C18130b(it6.f70434a, it6.f70435b);
            default:
                C18132d onEvent10 = (C18132d) obj;
                AbstractC22676k.m65750j(onEvent10, "$this$onEvent");
                AbstractC22676k.m65750j((C18143o) obj2, "it");
                return C18131c.f70427a;
        }
    }
}
