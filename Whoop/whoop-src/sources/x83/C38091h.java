package x83;

import c93.InterfaceC4339a;
import java.io.File;
import java.util.Iterator;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.C38173h;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: x83.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C38091h implements InterfaceC38174i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163137a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f163138b;

    /* JADX INFO: renamed from: c */
    public final Object f163139c;

    public C38091h(File start, EnumC38092i enumC38092i) {
        AbstractC22676k.m65750j(start, "start");
        this.f163138b = start;
        this.f163139c = enumC38092i;
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        switch (this.f163137a) {
            case 0:
                return new C38089f(this);
            default:
                return new C38173h(this);
        }
    }

    public C38091h(InterfaceC4339a interfaceC4339a, Function1 getNextValue) {
        AbstractC22676k.m65750j(getNextValue, "getNextValue");
        this.f163138b = interfaceC4339a;
        this.f163139c = getNextValue;
    }
}
