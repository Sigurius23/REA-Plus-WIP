package pp1;

import android.content.Context;
import p715kotlin.jvm.functions.Function1;
import v01.AbstractC35501c;
import zo2.AbstractC40935f;

/* JADX INFO: renamed from: pp1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29433f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119500w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f119501x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f119502y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f119503z;

    public /* synthetic */ C29433f(int i13, String str, String str2, Function1 function1) {
        this.f119500w = i13;
        this.f119501x = function1;
        this.f119502y = str;
        this.f119503z = str2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119500w) {
            case 0:
                return AbstractC29436i.m89756Z(this.f119501x, this.f119502y, this.f119503z, obj);
            case 1:
                return AbstractC35501c.m112572G(this.f119501x, this.f119502y, this.f119503z, obj);
            default:
                return AbstractC40935f.m132821j(this.f119502y, this.f119501x, this.f119503z, (Context) obj);
        }
    }

    public /* synthetic */ C29433f(String str, String str2, Function1 function1) {
        this.f119500w = 2;
        this.f119502y = str;
        this.f119501x = function1;
        this.f119503z = str2;
    }
}
