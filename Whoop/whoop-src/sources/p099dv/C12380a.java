package p099dv;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import vu.C36500a;
import vu.C36503d;

/* JADX INFO: renamed from: dv.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12380a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f41841w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ double f41842x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12380a(int i13, double d3) {
        super(1);
        this.f41841w = i13;
        this.f41842x = d3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C36500a rgba = (C36500a) obj;
        AbstractC22676k.m65750j(rgba, "$this$rgba");
        int i13 = this.f41841w;
        ArrayList arrayList = rgba.f155939b;
        arrayList.add(new C36503d((i13 >> 16) & 255));
        arrayList.add(new C36503d((i13 >> 8) & 255));
        arrayList.add(new C36503d(i13 & 255));
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        AbstractC22676k.m65748h(numberInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        decimalFormat.applyPattern("#.########");
        String str = decimalFormat.format(this.f41842x);
        AbstractC22676k.m65749i(str, "decimalFormat.format(alpha)");
        rgba.m117000c(Double.parseDouble(str));
        return C23454a0.f92919a;
    }
}
