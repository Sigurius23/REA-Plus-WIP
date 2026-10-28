package p342nj;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ch.C4582c;
import com.amplitude.android.engagement.types.SurveyListBlock;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p238j0.InterfaceC21083i;
import p291l0.InterfaceC22997s1;
import p292l1.AbstractC23149o4;
import p294l3.C23285v0;
import p328mj.C25603j;
import p328mj.C25607n;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p392p3.C28780r;
import p463rj.C31485p;
import p490t0.C33252i;
import p525uj.AbstractC35027e;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p571w3.C36775k;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: nj.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C26741f extends AbstractC22680m implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106353w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f106354x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26741f(InterfaceC4339a interfaceC4339a, int i13) {
        super(3);
        this.f106353w = 0;
        this.f106354x = interfaceC4339a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0086  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f106353w) {
            case 0:
                Modifier conditional = (Modifier) obj;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(conditional, "$this$conditional");
                C28655q c28655q = (C28655q) ((Composer) obj2);
                c28655q.m87152f0(-2138871049);
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f106354x;
                boolean zM87153g = c28655q.m87153g(interfaceC4339a);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C4582c(interfaceC4339a, 5);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3361f = AbstractC1092a.m3361f(conditional, false, null, (InterfaceC4339a) objM87133R, 7);
                c28655q.m87173q(false);
                return modifierM3361f;
            case 1:
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j((Modifier) obj, "$this$conditional");
                C28655q c28655q2 = (C28655q) ((Composer) obj2);
                c28655q2.m87152f0(216189402);
                Object objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == C28635l.f115821a) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q2);
                }
                Modifier modifierM3360e = AbstractC1092a.m3360e(C2314t.f9131w, (InterfaceC21083i) objM87133R2, null, false, null, (C25607n) this.f106354x, 28);
                c28655q2.m87173q(false);
                return modifierM3360e;
            case 2:
                InterfaceC22997s1 Button = (InterfaceC22997s1) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(Button, "$this$Button");
                if ((iIntValue & 81) == 16) {
                    C28655q c28655q3 = (C28655q) composer;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        String str = (String) this.f106354x;
                        C28655q c28655q4 = (C28655q) composer;
                        c28655q4.m87152f0(-604941450);
                        float f13 = ((C39174f) c28655q4.m87161k(AbstractC35027e.f148223i)).f168413w;
                        c28655q4.m87173q(false);
                        Modifier modifierM3394p = AbstractC1099a.m3394p(f13, C2314t.f9131w);
                        C36775k c36775k = new C36775k(3);
                        c28655q4.m87152f0(-412521741);
                        C35035m c35035m = (C35035m) c28655q4.m87161k(AbstractC35033k.f148295a);
                        c28655q4.m87173q(false);
                        c35035m.getClass();
                        c28655q4.m87152f0(-870974278);
                        C23285v0 c23285v0 = new C23285v0(0L, AbstractC35745c.m113248j(c35035m.f148336d, 4294967296L), new C28780r(c35035m.f148346i), null, c35035m.m110713c(c28655q4), 0L, null, null, 0, 0L, 16777177);
                        c28655q4.m87173q(false);
                        AbstractC23149o4.m67127b(str, modifierM3394p, 0L, 0L, null, 0L, c36775k, 0L, 0, false, 0, 0, c23285v0, composer, 0, 0, 65020);
                    }
                } else {
                    String str2 = (String) this.f106354x;
                    C28655q c28655q5 = (C28655q) composer;
                    c28655q5.m87152f0(-604941450);
                    float f14 = ((C39174f) c28655q5.m87161k(AbstractC35027e.f148223i)).f168413w;
                    c28655q5.m87173q(false);
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, C2314t.f9131w);
                    C36775k c36775k2 = new C36775k(3);
                    c28655q5.m87152f0(-412521741);
                    C35035m c35035m2 = (C35035m) c28655q5.m87161k(AbstractC35033k.f148295a);
                    c28655q5.m87173q(false);
                    c35035m2.getClass();
                    c28655q5.m87152f0(-870974278);
                    C23285v0 c23285v1 = new C23285v0(0L, AbstractC35745c.m113248j(c35035m2.f148336d, 4294967296L), new C28780r(c35035m2.f148346i), null, c35035m2.m110713c(c28655q5), 0L, null, null, 0, 0L, 16777177);
                    c28655q5.m87173q(false);
                    AbstractC23149o4.m67127b(str2, modifierM3394p2, 0L, 0L, null, 0L, c36775k2, 0L, 0, false, 0, 0, c23285v1, composer, 0, 0, 65020);
                }
                return C23454a0.f92919a;
            case 3:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(null, "$this$ExposedDropdownMenuBox");
                throw null;
            default:
                Modifier conditional2 = (Modifier) obj;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(conditional2, "$this$conditional");
                C28655q c28655q6 = (C28655q) ((Composer) obj2);
                c28655q6.m87152f0(-477424015);
                float f15 = 3;
                Modifier modifierM3486a = AbstractC1127a.m3486a(conditional2, new C25603j(f15, 1, 0, (C33252i) this.f106354x, AbstractC17918w0.m51515c(1023410176)));
                c28655q6.m87173q(false);
                return modifierM3486a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26741f(Object obj, int i13) {
        super(3);
        this.f106353w = i13;
        this.f106354x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26741f(C31485p c31485p, InterfaceC28601c1 interfaceC28601c1, List list, Function1 function1, SurveyListBlock surveyListBlock, InterfaceC28601c1 interfaceC28601c2) {
        super(3);
        this.f106353w = 3;
        this.f106354x = function1;
    }
}
