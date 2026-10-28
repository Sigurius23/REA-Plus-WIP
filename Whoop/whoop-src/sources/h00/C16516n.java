package h00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import g00.AbstractC14930a;
import g00.AbstractC14933d;
import g00.AbstractC14936g;
import g00.C14931b;
import h20.EnumC16701n1;
import l83.C23454a0;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h00.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C16516n implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63505w;

    public /* synthetic */ C16516n(int i13) {
        this.f63505w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f63505w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
                    AbstractC16518o.m46685i(composer);
                    AbstractC16518o.m46678b(R.drawable.stripe_link_logo_bw, composer, 0);
                } else {
                    C28655q c28655q = (C28655q) composer;
                    if (!c28655q.m87121F()) {
                        EnumC16701n1 enumC16701n2 = EnumC16701n1.f64226w;
                        AbstractC16518o.m46685i(composer);
                        AbstractC16518o.m46678b(R.drawable.stripe_link_logo_bw, composer, 0);
                    } else {
                        c28655q.m87138X();
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    EnumC16701n1 enumC16701n3 = EnumC16701n1.f64226w;
                    C28655q c28655q2 = (C28655q) composer2;
                    c28655q2.m87150e0(-1663985890);
                    c28655q2.m87150e0(-1814699758);
                    C14931b c14931b = AbstractC14933d.f55692a;
                    c28655q2.m87150e0(-443512897);
                    C14931b separatorOnPrimaryButton = (C14931b) c28655q2.m87161k(AbstractC14936g.f55706c);
                    c28655q2.m87173q(false);
                    AbstractC22676k.m65750j(separatorOnPrimaryButton, "$this$separatorOnPrimaryButton");
                    long j7 = AbstractC14930a.f55656k;
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(false);
                    AbstractC16518o.m46679c(j7, composer2, 0);
                } else {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (!c28655q3.m87121F()) {
                        EnumC16701n1 enumC16701n4 = EnumC16701n1.f64226w;
                        C28655q c28655q4 = (C28655q) composer2;
                        c28655q4.m87150e0(-1663985890);
                        c28655q4.m87150e0(-1814699758);
                        C14931b c14931b2 = AbstractC14933d.f55692a;
                        c28655q4.m87150e0(-443512897);
                        C14931b separatorOnPrimaryButton2 = (C14931b) c28655q4.m87161k(AbstractC14936g.f55706c);
                        c28655q4.m87173q(false);
                        AbstractC22676k.m65750j(separatorOnPrimaryButton2, "$this$separatorOnPrimaryButton");
                        long j13 = AbstractC14930a.f55656k;
                        c28655q4.m87173q(false);
                        c28655q4.m87173q(false);
                        AbstractC16518o.m46679c(j13, composer2, 0);
                    } else {
                        c28655q3.m87138X();
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    EnumC16701n1 enumC16701n5 = EnumC16701n1.f64226w;
                    AbstractC16518o.m46685i(composer3);
                    AbstractC16518o.m46678b(R.drawable.stripe_link_logo_bw, composer3, 0);
                } else {
                    C28655q c28655q5 = (C28655q) composer3;
                    if (!c28655q5.m87121F()) {
                        EnumC16701n1 enumC16701n6 = EnumC16701n1.f64226w;
                        AbstractC16518o.m46685i(composer3);
                        AbstractC16518o.m46678b(R.drawable.stripe_link_logo_bw, composer3, 0);
                    } else {
                        c28655q5.m87138X();
                    }
                }
                break;
        }
        return c23454a0;
    }
}
