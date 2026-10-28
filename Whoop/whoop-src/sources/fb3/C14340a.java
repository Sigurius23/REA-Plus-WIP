package fb3;

import lb3.AbstractC23811y;
import p004a2.AbstractC0152a;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31108b;
import r93.InterfaceC31117e;
import va3.C35850h;

/* JADX INFO: renamed from: fb3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14340a extends AbstractC0152a implements InterfaceC14343d {

    /* JADX INFO: renamed from: E */
    public final Object f52391E;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f52392y = 1;

    /* JADX INFO: renamed from: z */
    public final C35850h f52393z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14340a(InterfaceC31108b declarationDescriptor, AbstractC23811y receiverType, C35850h c35850h) {
        super(receiverType);
        AbstractC22676k.m65750j(declarationDescriptor, "declarationDescriptor");
        AbstractC22676k.m65750j(receiverType, "receiverType");
        this.f52391E = declarationDescriptor;
        this.f52393z = c35850h;
    }

    /* JADX INFO: renamed from: Q */
    public final C35850h m40963Q() {
        switch (this.f52392y) {
            case 0:
                break;
        }
        return this.f52393z;
    }

    public final String toString() {
        switch (this.f52392y) {
            case 0:
                return getType() + ": Ctx { " + ((InterfaceC31117e) this.f52391E) + " }";
            default:
                return "Cxt { " + ((InterfaceC31108b) this.f52391E) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14340a(InterfaceC31117e interfaceC31117e, AbstractC23811y receiverType, C35850h c35850h) {
        super(receiverType);
        AbstractC22676k.m65750j(receiverType, "receiverType");
        this.f52391E = interfaceC31117e;
        this.f52393z = c35850h;
    }
}
