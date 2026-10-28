package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ft0.InterfaceC14766b;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import vx0.AbstractC36555c;
import yq2.AbstractC39713a;

/* JADX INFO: renamed from: g40.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15418s0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f57926E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f57927F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57928w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f57929x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f57930y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f57931z;

    public /* synthetic */ C15418s0(C15413r0 c15413r0, boolean z4, Modifier modifier, boolean z13, int i13) {
        this.f57928w = 0;
        this.f57926E = c15413r0;
        this.f57929x = z4;
        this.f57927F = modifier;
        this.f57930y = z13;
        this.f57931z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57928w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC15448y0.m43610a((C15413r0) this.f57926E, this.f57929x, (Modifier) this.f57927F, this.f57930y, (Composer) obj, AbstractC28683x.m87244L(this.f57931z | 1));
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC36555c.m117238r((InterfaceC14766b) this.f57926E, this.f57929x, this.f57930y, (InterfaceC4339a) this.f57927F, this.f57931z, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39713a.m127092d((String) this.f57926E, this.f57929x, this.f57930y, (String) this.f57927F, this.f57931z, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C15418s0(Object obj, boolean z4, boolean z13, Object obj2, int i13, int i14) {
        this.f57928w = i14;
        this.f57926E = obj;
        this.f57929x = z4;
        this.f57930y = z13;
        this.f57927F = obj2;
        this.f57931z = i13;
    }
}
