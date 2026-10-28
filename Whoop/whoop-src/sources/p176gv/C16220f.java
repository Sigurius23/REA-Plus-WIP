package p176gv;

import android.animation.TypeEvaluator;
import p157fv.C14803i;
import p157fv.EnumC14804j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gv.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C16220f extends AbstractC16218d {

    /* JADX INFO: renamed from: M */
    public final boolean f61616M;

    /* JADX INFO: renamed from: N */
    public final EnumC14804j f61617N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16220f(TypeEvaluator evaluator, C14803i c14803i, Function1 function1) {
        super(evaluator, c14803i);
        AbstractC22676k.m65750j(evaluator, "evaluator");
        this.f61616M = true;
        if (function1 != null) {
            function1.invoke(this);
        }
        this.f61617N = EnumC14804j.f54960w;
    }

    @Override // p176gv.AbstractC16218d
    /* JADX INFO: renamed from: k */
    public final EnumC14804j mo45908k() {
        return this.f61617N;
    }
}
