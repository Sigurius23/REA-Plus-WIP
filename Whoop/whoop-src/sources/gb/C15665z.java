package gb;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyResponseMultiSelect;
import hg3.AbstractC17269i;
import java.util.List;
import l83.C23454a0;
import p114eb.C12991u0;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p463rj.AbstractC31479j;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gb.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C15665z extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f58786E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f58787F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58788w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f58789x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f58790y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f58791z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15665z(int i13, int i14, Object obj, Object obj2, Object obj3, Function1 function1) {
        super(2);
        this.f58788w = i14;
        this.f58786E = obj;
        this.f58789x = obj2;
        this.f58790y = obj3;
        this.f58787F = function1;
        this.f58791z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58788w) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC17269i.m48888e((C12991u0) this.f58786E, (String) this.f58789x, (Modifier) this.f58790y, (Function1) this.f58787F, (Composer) obj, AbstractC28683x.m87244L(this.f58791z | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC36259c.m115681b((InterfaceC4339a) this.f58786E, (C27430e) this.f58787F, (String) this.f58789x, (Modifier) this.f58790y, (Composer) obj, AbstractC28683x.m87244L(this.f58791z | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC31479j.m96927f((SurveyListBlock) this.f58786E, (List) this.f58789x, (SurveyResponseMultiSelect) this.f58790y, (Function1) this.f58787F, (Composer) obj, AbstractC28683x.m87244L(this.f58791z | 1));
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15665z(InterfaceC4339a interfaceC4339a, C27430e c27430e, String str, Modifier modifier, int i13) {
        super(2);
        this.f58788w = 1;
        this.f58786E = interfaceC4339a;
        this.f58787F = c27430e;
        this.f58789x = str;
        this.f58790y = modifier;
        this.f58791z = i13;
    }
}
