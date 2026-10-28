package fb3;

import lb3.AbstractC23811y;
import p004a2.AbstractC0152a;
import r93.InterfaceC31108b;
import u93.AbstractC34692o;

/* JADX INFO: renamed from: fb3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14341b extends AbstractC0152a {

    /* JADX INFO: renamed from: y */
    public final AbstractC34692o f52394y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14341b(InterfaceC31108b interfaceC31108b, AbstractC23811y abstractC23811y) {
        super(abstractC23811y);
        if (abstractC23811y == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f52394y = (AbstractC34692o) interfaceC31108b;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f52394y + "}";
    }
}
