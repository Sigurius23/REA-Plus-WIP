package xb3;

import java.util.Iterator;
import o63.C27617h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xb3.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C38184s implements InterfaceC38174i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38174i f163498a;

    /* JADX INFO: renamed from: b */
    public final Function1 f163499b;

    public C38184s(InterfaceC38174i sequence, Function1 transformer) {
        AbstractC22676k.m65750j(sequence, "sequence");
        AbstractC22676k.m65750j(transformer, "transformer");
        this.f163498a = sequence;
        this.f163499b = transformer;
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        return new C27617h(this);
    }
}
