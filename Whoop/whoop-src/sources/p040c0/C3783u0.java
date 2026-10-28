package p040c0;

import c93.InterfaceC4339a;
import i63.AbstractC18157a;
import l83.C23454a0;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3783u0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15427w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f15428x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f15429y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3783u0(InterfaceC4339a interfaceC4339a, boolean z4) {
        super(1);
        this.f15428x = z4;
        this.f15429y = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15427w) {
            case 0:
                ((C17920x0) ((InterfaceC17886g0) obj)).m51554e(!this.f15428x && ((Boolean) ((InterfaceC4339a) this.f15429y).invoke()).booleanValue());
                break;
            default:
                byte bByteValue = ((Number) obj).byteValue();
                StringBuilder sb4 = (StringBuilder) this.f15429y;
                if (AbstractC18157a.f70461a.contains(Byte.valueOf(bByteValue)) || AbstractC18157a.f70466f.contains(Byte.valueOf(bByteValue))) {
                    sb4.append((char) bByteValue);
                } else if (this.f15428x && bByteValue == 32) {
                    sb4.append('+');
                } else {
                    sb4.append(AbstractC18157a.m52151a(bByteValue));
                }
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3783u0(StringBuilder sb4, boolean z4) {
        super(1);
        this.f15429y = sb4;
        this.f15428x = z4;
    }
}
