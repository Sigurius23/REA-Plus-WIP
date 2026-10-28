package js2;

import android.view.View;
import p390p1.C28624i0;
import p715kotlin.jvm.functions.Function1;
import pj2.AbstractC29321t;
import st1.AbstractC32991l;

/* JADX INFO: renamed from: js2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C21929g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84691w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ View f84692x;

    public /* synthetic */ C21929g(View view, int i13) {
        this.f84691w = i13;
        this.f84692x = view;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84691w) {
            case 0:
                return AbstractC21931i.m62477q(this.f84692x, (C28624i0) obj);
            case 1:
                return AbstractC29321t.m89191B(this.f84692x, (C28624i0) obj);
            default:
                return AbstractC32991l.m104193z(this.f84692x, (C28624i0) obj);
        }
    }
}
