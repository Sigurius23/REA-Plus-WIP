package p342nj;

import android.graphics.Rect;
import p553vj.C36065b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: nj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C26737b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106345w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Rect f106346x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26737b(int i13, Rect rect) {
        super(1);
        this.f106345w = i13;
        this.f106346x = rect;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f106345w) {
            case 0:
                C36065b withDensity = (C36065b) obj;
                AbstractC22676k.m65750j(withDensity, "$this$withDensity");
                return withDensity.m114535b(this.f106346x);
            default:
                C36065b withDensity2 = (C36065b) obj;
                AbstractC22676k.m65750j(withDensity2, "$this$withDensity");
                return withDensity2.m114535b(this.f106346x);
        }
    }
}
