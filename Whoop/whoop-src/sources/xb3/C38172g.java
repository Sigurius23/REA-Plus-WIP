package xb3;

import java.util.Iterator;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xb3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C38172g implements InterfaceC38174i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38174i f163473a;

    /* JADX INFO: renamed from: b */
    public final Function1 f163474b;

    /* JADX INFO: renamed from: c */
    public final Function1 f163475c;

    public C38172g(InterfaceC38174i sequence, Function1 transformer, Function1 function1) {
        AbstractC22676k.m65750j(sequence, "sequence");
        AbstractC22676k.m65750j(transformer, "transformer");
        this.f163473a = sequence;
        this.f163474b = transformer;
        this.f163475c = function1;
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        return new C38170e(this);
    }
}
