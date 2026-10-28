package cd3;

import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: cd3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C4450b extends AbstractC4451c {

    /* JADX INFO: renamed from: a */
    public final Function1 f17952a;

    public C4450b(Function1 function1) {
        this.f17952a = function1;
    }

    @Override // cd3.AbstractC4451c
    /* JADX INFO: renamed from: a */
    public final InterfaceC37138c mo13922a(List typeArgumentsSerializers) {
        AbstractC22676k.m65750j(typeArgumentsSerializers, "typeArgumentsSerializers");
        return (InterfaceC37138c) this.f17952a.invoke(typeArgumentsSerializers);
    }
}
