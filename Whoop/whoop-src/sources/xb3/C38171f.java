package xb3;

import java.util.Iterator;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xb3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C38171f implements InterfaceC38174i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38174i f163470a;

    /* JADX INFO: renamed from: b */
    public final boolean f163471b;

    /* JADX INFO: renamed from: c */
    public final Function1 f163472c;

    public C38171f(InterfaceC38174i interfaceC38174i, boolean z4, Function1 predicate) {
        AbstractC22676k.m65750j(predicate, "predicate");
        this.f163470a = interfaceC38174i;
        this.f163471b = z4;
        this.f163472c = predicate;
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        return new C38170e(this);
    }
}
