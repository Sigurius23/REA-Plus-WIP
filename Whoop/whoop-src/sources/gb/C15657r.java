package gb;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.ContentBlock;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p026b2.C2320z;
import p098dt.AbstractC12350b;
import p114eb.C12982q;
import p305lj.AbstractC24425e0;
import p328mj.C25607n;
import p390p1.AbstractC28683x;
import p463rj.AbstractC31479j;
import p547v8.AbstractC35785b;
import p602x1.C37816b;
import p634y1.InterfaceC39030c;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import x30.AbstractC37926s0;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: gb.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C15657r extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58757w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23459e f58758x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f58759y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f58760z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15657r(int i13, String str, String str2, Function1 function1) {
        super(2);
        this.f58757w = 4;
        this.f58759y = str;
        this.f58760z = str2;
        this.f58758x = (AbstractC22680m) function1;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f58757w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                AbstractC12350b.m34580b((C12982q) this.f58759y, (InterfaceC39030c) this.f58760z, (C37816b) this.f58758x, composer, AbstractC28683x.m87244L(385));
                break;
            case 1:
                AbstractC37926s0.m121464b((String) this.f58759y, (DebugStatus) this.f58760z, (C37816b) this.f58758x, composer, AbstractC28683x.m87244L(391));
                break;
            case 2:
                AbstractC37978j.m121645f((C4861a) this.f58759y, (C2320z) this.f58760z, (InterfaceC4339a) this.f58758x, composer, AbstractC28683x.m87244L(9));
                break;
            case 3:
                AbstractC35785b.m113408c((Nudge) this.f58759y, (NudgeStep) this.f58760z, (C25607n) this.f58758x, composer, AbstractC28683x.m87244L(73));
                break;
            case 4:
                AbstractC31479j.m96923b((String) this.f58759y, (String) this.f58760z, (AbstractC22680m) this.f58758x, composer, AbstractC28683x.m87244L(1));
                break;
            case 5:
                AbstractC31479j.m96924c((ContentBlock) this.f58759y, (AbstractC24425e0) this.f58760z, (Function1) this.f58758x, composer, AbstractC28683x.m87244L(1));
                break;
            default:
                AbstractC39125q1.m124655a((Modifier) this.f58759y, (C37816b) this.f58758x, (InterfaceC39127r0) this.f58760z, composer, AbstractC28683x.m87244L(49));
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15657r(Modifier modifier, C37816b c37816b, InterfaceC39127r0 interfaceC39127r0, int i13) {
        super(2);
        this.f58757w = 6;
        this.f58759y = modifier;
        this.f58758x = c37816b;
        this.f58760z = interfaceC39127r0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15657r(Object obj, Object obj2, InterfaceC23459e interfaceC23459e, int i13, int i14) {
        super(2);
        this.f58757w = i14;
        this.f58759y = obj;
        this.f58760z = obj2;
        this.f58758x = interfaceC23459e;
    }
}
