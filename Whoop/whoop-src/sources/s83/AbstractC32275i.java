package s83;

import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22668g;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: s83.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32275i extends AbstractC32269c implements InterfaceC22668g {
    private final int arity;

    public AbstractC32275i(int i13, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.arity = i13;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22668g
    public int getArity() {
        return this.arity;
    }

    @Override // s83.AbstractC32267a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = AbstractC22671h0.f89337a.renderLambdaToString(this);
        AbstractC22676k.m65749i(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }
}
