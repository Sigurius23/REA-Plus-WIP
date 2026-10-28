package p715kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22680m implements InterfaceC22668g, Serializable {
    private final int arity;

    public AbstractC22680m(int i13) {
        this.arity = i13;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22668g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strRenderLambdaToString = AbstractC22671h0.f89337a.renderLambdaToString(this);
        AbstractC22676k.m65749i(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }
}
