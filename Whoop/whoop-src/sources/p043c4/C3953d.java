package p043c4;

import j93.InterfaceC21493z;
import l83.C23454a0;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c4.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C3953d extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C3953d f16104E;

    /* JADX INFO: renamed from: F */
    public static final C3953d f16105F;

    /* JADX INFO: renamed from: G */
    public static final C3953d f16106G;

    /* JADX INFO: renamed from: x */
    public static final C3953d f16107x;

    /* JADX INFO: renamed from: y */
    public static final C3953d f16108y;

    /* JADX INFO: renamed from: z */
    public static final C3953d f16109z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16110w;

    static {
        int i13 = 1;
        f16107x = new C3953d(i13, 0);
        f16108y = new C3953d(i13, 1);
        f16109z = new C3953d(i13, 2);
        f16104E = new C3953d(i13, 3);
        f16105F = new C3953d(i13, 4);
        f16106G = new C3953d(i13, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3953d(int i13, int i14) {
        super(i13);
        this.f16110w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f16110w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                ((C18030l) ((InterfaceC18044z) obj)).m51772e(AbstractC18039u.f70056w, c23454a0);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                InterfaceC21493z[] interfaceC21493zArr2 = AbstractC18041w.f70062a;
                ((C18030l) ((InterfaceC18044z) obj)).m51772e(AbstractC18039u.f70055v, c23454a0);
                break;
            case 4:
                break;
            default:
                C3958f0 c3958f0 = (C3958f0) obj;
                if (c3958f0.isAttachedToWindow()) {
                    c3958f0.m12002n();
                }
                break;
        }
        return c23454a0;
    }
}
