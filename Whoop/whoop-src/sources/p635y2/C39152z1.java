package p635y2;

import c93.InterfaceC4351m;
import p479s4.AbstractC32126g;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: y2.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C39152z1 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f168305w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39117o[] f168306x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39152z1(C39117o[] c39117oArr, int i13) {
        super(2);
        this.f168305w = i13;
        this.f168306x = c39117oArr;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f168305w) {
            case 0:
                return Float.valueOf(AbstractC32126g.m100037b((AbstractC39101i1) obj, true, this.f168306x, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC32126g.m100037b((AbstractC39101i1) obj, false, this.f168306x, ((Number) obj2).floatValue()));
        }
    }
}
