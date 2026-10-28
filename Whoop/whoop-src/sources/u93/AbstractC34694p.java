package u93;

import r93.InterfaceC31107a1;
import r93.InterfaceC31109b0;
import r93.InterfaceC31110b1;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31136k0;
import r93.InterfaceC31141m;
import r93.InterfaceC31147o0;
import r93.InterfaceC31149p0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31163w0;
import r93.InterfaceC31165x0;

/* JADX INFO: renamed from: u93.p */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34694p implements InterfaceC31141m {
    @Override // r93.InterfaceC31141m
    public Object visitClassDescriptor(InterfaceC31117e interfaceC31117e, Object obj) {
        return visitDeclarationDescriptor(interfaceC31117e, obj);
    }

    @Override // r93.InterfaceC31141m
    public Object visitConstructorDescriptor(InterfaceC31132j interfaceC31132j, Object obj) {
        return visitFunctionDescriptor(interfaceC31132j, obj);
    }

    public Object visitDeclarationDescriptor(InterfaceC31135k interfaceC31135k, Object obj) {
        return null;
    }

    @Override // r93.InterfaceC31141m
    public Object visitModuleDeclaration(InterfaceC31109b0 interfaceC31109b0, Object obj) {
        return visitDeclarationDescriptor(interfaceC31109b0, obj);
    }

    @Override // r93.InterfaceC31141m
    public Object visitPackageFragmentDescriptor(InterfaceC31124g0 interfaceC31124g0, Object obj) {
        return visitDeclarationDescriptor(interfaceC31124g0, obj);
    }

    @Override // r93.InterfaceC31141m
    public Object visitPackageViewDescriptor(InterfaceC31136k0 interfaceC31136k0, Object obj) {
        return visitDeclarationDescriptor(interfaceC31136k0, obj);
    }

    @Override // r93.InterfaceC31141m
    public Object visitPropertyGetterDescriptor(InterfaceC31147o0 interfaceC31147o0, Object obj) {
        return visitFunctionDescriptor(interfaceC31147o0, obj);
    }

    @Override // r93.InterfaceC31141m
    public Object visitPropertySetterDescriptor(InterfaceC31149p0 interfaceC31149p0, Object obj) {
        return visitFunctionDescriptor(interfaceC31149p0, obj);
    }

    @Override // r93.InterfaceC31141m
    public Object visitReceiverParameterDescriptor(InterfaceC31151q0 interfaceC31151q0, Object obj) {
        return visitDeclarationDescriptor(interfaceC31151q0, obj);
    }

    @Override // r93.InterfaceC31141m
    public Object visitTypeAliasDescriptor(InterfaceC31163w0 interfaceC31163w0, Object obj) {
        return visitDeclarationDescriptor(interfaceC31163w0, obj);
    }

    @Override // r93.InterfaceC31141m
    public Object visitTypeParameterDescriptor(InterfaceC31165x0 interfaceC31165x0, Object obj) {
        return visitDeclarationDescriptor(interfaceC31165x0, obj);
    }

    @Override // r93.InterfaceC31141m
    public Object visitValueParameterDescriptor(InterfaceC31107a1 interfaceC31107a1, Object obj) {
        return visitVariableDescriptor(interfaceC31107a1, obj);
    }

    public Object visitVariableDescriptor(InterfaceC31110b1 interfaceC31110b1, Object obj) {
        return visitDeclarationDescriptor(interfaceC31110b1, obj);
    }
}
