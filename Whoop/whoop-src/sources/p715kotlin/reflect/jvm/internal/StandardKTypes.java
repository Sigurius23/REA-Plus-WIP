package p715kotlin.reflect.jvm.internal;

import j93.InterfaceC21456a0;
import java.io.Serializable;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/StandardKTypes;", "", "<init>", "()V", "Lj93/a0;", "ANY", "Lj93/a0;", "getANY", "()Lj93/a0;", "NULLABLE_ANY", "getNULLABLE_ANY", "CLONEABLE", "getCLONEABLE", "SERIALIZABLE", "getSERIALIZABLE", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StandardKTypes {
    public static final StandardKTypes INSTANCE = new StandardKTypes();
    private static final InterfaceC21456a0 ANY = AbstractC22671h0.m65691d(Object.class);
    private static final InterfaceC21456a0 NULLABLE_ANY = AbstractC22671h0.m65689b(Object.class);
    private static final InterfaceC21456a0 CLONEABLE = AbstractC22671h0.m65691d(Cloneable.class);
    private static final InterfaceC21456a0 SERIALIZABLE = AbstractC22671h0.m65691d(Serializable.class);

    private StandardKTypes() {
    }

    public final InterfaceC21456a0 getANY() {
        return ANY;
    }

    public final InterfaceC21456a0 getCLONEABLE() {
        return CLONEABLE;
    }

    public final InterfaceC21456a0 getNULLABLE_ANY() {
        return NULLABLE_ANY;
    }

    public final InterfaceC21456a0 getSERIALIZABLE() {
        return SERIALIZABLE;
    }
}
