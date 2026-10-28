package m23;

import android.view.MotionEvent;
import f23.EnumC14035a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m23.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24968b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97715w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24970d f97716x;

    public /* synthetic */ C24968b(C24970d c24970d, int i13) {
        this.f97715w = i13;
        this.f97716x = c24970d;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f97715w) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                Function1 function1 = this.f97716x.f97742z;
                if (function1 != null) {
                    function1.invoke(num);
                }
                return C23454a0.f92919a;
            case 1:
                EnumC14035a it = (EnumC14035a) obj;
                C24970d this$0 = this.f97716x;
                AbstractC22676k.m65750j(this$0, "this$0");
                AbstractC22676k.m65750j(it, "it");
                this$0.f97734U = it;
                return C23454a0.f92919a;
            case 2:
                C24970d.m73290a(this.f97716x, (MotionEvent) obj);
                return Boolean.FALSE;
            default:
                C24970d this$1 = this.f97716x;
                AbstractC22676k.m65750j(this$1, "this$0");
                AbstractC22676k.m65750j((MotionEvent) obj, "it");
                this$1.f97732S = !this$1.m73294e();
                return Boolean.FALSE;
        }
    }
}
