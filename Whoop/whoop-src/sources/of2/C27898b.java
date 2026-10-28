package of2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4353o;
import com.whoop.stress.domain.model.StressCustomizationDrawerItem;
import f31.C14044a;
import java.util.List;
import nj2.AbstractC26755b;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import pj2.AbstractC29318q;

/* JADX INFO: renamed from: of2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27898b implements InterfaceC4353o {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112493w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f112494x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f112495y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f112496z;

    public /* synthetic */ C27898b(List list, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f112495y = list;
        this.f112496z = function1;
        this.f112494x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f112493w) {
            case 0:
                int iIntValue = ((Integer) obj5).intValue();
                return AbstractC27899c.m84198f((List) this.f112495y, (Function1) this.f112496z, this.f112494x, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj5).intValue();
                return AbstractC29318q.m89168s0((AbstractC26755b) this.f112495y, this.f112494x, (InterfaceC28601c1) this.f112496z, (InterfaceC1103a) obj, (StressCustomizationDrawerItem) obj2, (C14044a) obj3, (Composer) obj4, iIntValue2);
        }
    }

    public /* synthetic */ C27898b(AbstractC26755b abstractC26755b, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f112495y = abstractC26755b;
        this.f112494x = interfaceC28601c1;
        this.f112496z = interfaceC28601c2;
    }
}
