package na3;

import cb3.AbstractC4393e;
import java.util.Map;
import lb3.AbstractC23811y;
import nb3.C26555l;
import r93.InterfaceC31117e;
import r93.InterfaceC31155s0;
import s93.InterfaceC32300b;
import va3.C35847e;

/* JADX INFO: renamed from: na3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C26516c implements InterfaceC32300b {

    /* JADX INFO: renamed from: a */
    public static final C26516c f105425a = new C26516c();

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: a */
    public final Map mo43952a() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: b */
    public final C35847e mo43953b() {
        InterfaceC31117e interfaceC31117eM13806d = AbstractC4393e.m13806d(this);
        if (interfaceC31117eM13806d != null) {
            if (C26555l.m78685f(interfaceC31117eM13806d)) {
                interfaceC31117eM13806d = null;
            }
            if (interfaceC31117eM13806d != null) {
                return AbstractC4393e.m13805c(interfaceC31117eM13806d);
            }
        }
        return null;
    }

    @Override // s93.InterfaceC32300b
    public final InterfaceC31155s0 getSource() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // s93.InterfaceC32300b
    public final AbstractC23811y getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
