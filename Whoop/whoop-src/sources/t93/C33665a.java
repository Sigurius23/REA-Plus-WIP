package t93;

import java.util.Collection;
import jb3.C21560t;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31117e;
import va3.C35850h;

/* JADX INFO: renamed from: t93.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C33665a implements InterfaceC33666b, InterfaceC33668d {

    /* JADX INFO: renamed from: b */
    public static final C33665a f140610b = new C33665a(0);

    /* JADX INFO: renamed from: c */
    public static final C33665a f140611c = new C33665a(1);

    /* JADX INFO: renamed from: d */
    public static final C33665a f140612d = new C33665a(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140613a;

    public /* synthetic */ C33665a(int i13) {
        this.f140613a = i13;
    }

    @Override // t93.InterfaceC33666b
    /* JADX INFO: renamed from: a */
    public Collection mo92216a(C35850h name, InterfaceC31117e classDescriptor) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(classDescriptor, "classDescriptor");
        return C25271y.f99162w;
    }

    @Override // t93.InterfaceC33666b
    /* JADX INFO: renamed from: b */
    public Collection mo92217b(InterfaceC31117e interfaceC31117e) {
        return C25271y.f99162w;
    }

    @Override // t93.InterfaceC33666b
    /* JADX INFO: renamed from: c */
    public Collection mo92218c(InterfaceC31117e interfaceC31117e) {
        return C25271y.f99162w;
    }

    @Override // t93.InterfaceC33666b
    /* JADX INFO: renamed from: d */
    public Collection mo92219d(InterfaceC31117e classDescriptor) {
        AbstractC22676k.m65750j(classDescriptor, "classDescriptor");
        return C25271y.f99162w;
    }

    @Override // t93.InterfaceC33668d
    /* JADX INFO: renamed from: e */
    public boolean mo92220e(InterfaceC31117e classDescriptor, C21560t c21560t) {
        switch (this.f140613a) {
            case 1:
                AbstractC22676k.m65750j(classDescriptor, "classDescriptor");
                return true;
            default:
                AbstractC22676k.m65750j(classDescriptor, "classDescriptor");
                return !c21560t.getAnnotations().mo52688J(AbstractC33669e.f140614a);
        }
    }
}
