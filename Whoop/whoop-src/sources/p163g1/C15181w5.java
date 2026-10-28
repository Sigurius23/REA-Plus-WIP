package p163g1;

import e93.AbstractC12889b;
import i93.InterfaceC18280f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: g1.w5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15181w5 extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC18280f f56979w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22663d0 f56980x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22663d0 f56981y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15181w5(InterfaceC18280f interfaceC18280f, C22663d0 c22663d0, C22663d0 c22663d1) {
        super(1, AbstractC22674j.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f56979w = interfaceC18280f;
        this.f56980x = c22663d0;
        this.f56981y = c22663d1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        InterfaceC18280f interfaceC18280f = this.f56979w;
        float fFloatValue2 = ((Number) interfaceC18280f.getStart()).floatValue();
        float fFloatValue3 = ((Number) interfaceC18280f.mo52651d()).floatValue();
        float f13 = this.f56980x.f89331w;
        float f14 = this.f56981y.f89331w;
        float f15 = AbstractC15019g6.f56199a;
        float f16 = fFloatValue3 - fFloatValue2;
        float f17 = f16 == 0.0f ? 0.0f : (fFloatValue - fFloatValue2) / f16;
        float f18 = f17 >= 0.0f ? f17 : 0.0f;
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        return Float.valueOf(AbstractC12889b.m36249O(f13, f14, f18));
    }
}
