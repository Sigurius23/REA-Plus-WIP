package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import l83.C23454a0;
import p026b2.C2314t;
import p048ce.AbstractC4482w;
import p209i3.AbstractC18032n;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: g40.g4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15358g4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f57732w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f57733x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f57734y;

    public C15358g4(String str, boolean z4, boolean z13) {
        this.f57732w = z4;
        this.f57733x = str;
        this.f57734y = z13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        boolean z4;
        String strM92102X;
        boolean z13;
        Modifier modifierM51774b;
        Object objM87133R;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-771944865);
                z4 = this.f57732w;
                strM92102X = this.f57733x;
                if (z4) {
                    strM92102X = AbstractC30060g.m92102X(R.string.stripe_form_label_optional, new Object[]{strM92102X}, c28655q);
                }
                c28655q.m87173q(false);
                c28655q.m87150e0(-771935337);
                z13 = this.f57734y;
                modifierM51774b = C2314t.f9131w;
                if (!z13) {
                    c28655q.m87150e0(-771933198);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C15449y1(8);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    modifierM51774b = AbstractC18032n.m51774b(modifierM51774b, (Function1) objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC4482w.m14005o(strM92102X, modifierM51774b, c28655q, 0, 0);
            }
        } else {
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-771944865);
            z4 = this.f57732w;
            strM92102X = this.f57733x;
            if (z4) {
                strM92102X = AbstractC30060g.m92102X(R.string.stripe_form_label_optional, new Object[]{strM92102X}, c28655q);
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(-771935337);
            z13 = this.f57734y;
            modifierM51774b = C2314t.f9131w;
            if (!z13) {
                c28655q.m87150e0(-771933198);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C15449y1(8);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                modifierM51774b = AbstractC18032n.m51774b(modifierM51774b, (Function1) objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC4482w.m14005o(strM92102X, modifierM51774b, c28655q, 0, 0);
        }
        return C23454a0.f92919a;
    }
}
