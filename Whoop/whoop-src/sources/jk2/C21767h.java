package jk2;

import android.content.Intent;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import fm1.C14605i;
import l80.AbstractC23437n;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jk2.h */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21767h implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f83747w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f83748x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f83749y;

    public /* synthetic */ C21767h(int i13, Object obj, Object obj2) {
        this.f83747w = i13;
        this.f83748x = obj;
        this.f83749y = obj2;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f83747w) {
            case 0:
                return AbstractC21768i.m61500C((C14605i) this.f83748x, (Modifier) this.f83749y, (InterfaceC3764o) obj, (String) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return AbstractC23437n.m67948d0((Function1) this.f83748x, (InterfaceC28670t2) this.f83749y, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return AbstractC23437n.m67925K((Intent) this.f83748x, (Function1) this.f83749y, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    }
}
