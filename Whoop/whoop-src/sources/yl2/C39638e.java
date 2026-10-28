package yl2;

import al1.C0982c;
import androidx.compose.runtime.Composer;
import cm2.AbstractC4813a0;
import p114eb.C12982q;
import p114eb.C12987s0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import zk1.AbstractC40837a;
import zk1.C40839c;

/* JADX INFO: renamed from: yl2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39638e implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f170538E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f170539w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f170540x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f170541y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f170542z;

    public /* synthetic */ C39638e(C0982c c0982c, C40839c c40839c, Function1 function1, C12987s0 c12987s0) {
        this.f170541y = c0982c;
        this.f170542z = c40839c;
        this.f170538E = c12987s0;
        this.f170540x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f170539w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC39639f.m126719m((AbstractC4813a0) this.f170541y, this.f170540x, (Function1) this.f170542z, (Function1) this.f170538E, (C12982q) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC40837a.m132340l((C0982c) this.f170541y, (C40839c) this.f170542z, (C12987s0) this.f170538E, this.f170540x, (C12982q) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C39638e(AbstractC4813a0 abstractC4813a0, Function1 function1, Function1 function2, Function1 function3) {
        this.f170541y = abstractC4813a0;
        this.f170540x = function1;
        this.f170542z = function2;
        this.f170538E = function3;
    }
}
