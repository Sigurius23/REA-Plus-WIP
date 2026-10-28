package cd3;

import j93.InterfaceC21461d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cd3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4453e extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4453e(String msg) {
        super(msg);
        AbstractC22676k.m65750j(msg, "msg");
    }

    public C4453e(InterfaceC21461d interfaceC21461d, InterfaceC21461d interfaceC21461d2) {
        this("Serializer for " + interfaceC21461d2 + " already registered in the scope of " + interfaceC21461d);
    }
}
