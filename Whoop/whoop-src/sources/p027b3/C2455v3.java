package p027b3;

import android.view.View;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import d93.InterfaceC11820a;
import d93.InterfaceC11825f;
import java.util.Set;
import l83.C23454a0;
import p004a2.AbstractC0157f;
import p390p1.AbstractC28683x;
import p390p1.C28614f2;
import p390p1.C28626i2;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28675v;
import p390p1.C28676v0;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: b3.v3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2455v3 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9591w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2460w3 f9592x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f9593y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2455v3(C2460w3 c2460w3, InterfaceC4351m interfaceC4351m, int i13) {
        super(2);
        this.f9591w = i13;
        this.f9592x = c2460w3;
        this.f9593y = interfaceC4351m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9591w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.m3595a(this.f9592x.f9604w, this.f9593y, c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C2460w3 c2460w3 = this.f9592x;
                    AndroidComposeView androidComposeView = c2460w3.f9604w;
                    Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
                    InterfaceC30057d interfaceC30057d = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC11820a) && !(tag instanceof InterfaceC11825f))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = androidComposeView.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC11820a) && !(tag2 instanceof InterfaceC11825f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        C28675v c28675v = c28655q2.f115905U;
                        if (c28675v == null) {
                            c28675v = new C28675v(c28655q2.f115913h);
                            c28655q2.f115905U = c28675v;
                        }
                        set.add(c28675v);
                        c28655q2.f115922q = true;
                        c28655q2.f115887C = true;
                        c28655q2.f115908c.m87015c();
                        c28655q2.f115892H.m87015c();
                        C28626i2 c28626i2 = c28655q2.f115893I;
                        C28614f2 c28614f2 = c28626i2.f115781a;
                        c28626i2.f115785e = c28614f2.f115762J;
                        c28626i2.f115786f = c28614f2.f115763K;
                    }
                    boolean zM87157i = c28655q2.m87157i(c2460w3);
                    Object objM87133R = c28655q2.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C2450u3(c2460w3, interfaceC30057d, 0);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, androidComposeView);
                    boolean zM87157i2 = c28655q2.m87157i(c2460w3);
                    Object objM87133R2 = c28655q2.m87133R();
                    if (zM87157i2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C2450u3(c2460w3, interfaceC30057d, 1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, androidComposeView);
                    AbstractC28683x.m87247a(AbstractC0157f.f481a.mo86977a(set), AbstractC37817c.m121344e(-280240369, c28655q2, new C2455v3(c2460w3, this.f9593y, 0)), c28655q2, 56);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
