package mq0;

import android.view.View;
import iq0.C20841t;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mq0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C25879d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102074w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25880e f102075x;

    public /* synthetic */ C25879d(C25880e c25880e, int i13) {
        this.f102074w = i13;
        this.f102075x = c25880e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f102074w) {
            case 0:
                return C25880e.m76494L(this.f102075x, (C20841t) obj);
            case 1:
                return C25880e.m76504V(this.f102075x, (C25885j) obj);
            default:
                return C25880e.m76502T(this.f102075x, (View) obj);
        }
    }
}
