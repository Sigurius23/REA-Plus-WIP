package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import va3.C35850h;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.o */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC22712o extends InterfaceC22714q {

    /* JADX INFO: renamed from: a */
    public static final C22710m f89379a = C22710m.f89377a;

    Set getClassifierNames();

    Collection getContributedVariables(C35850h c35850h, InterfaceC40210a interfaceC40210a);

    Set getFunctionNames();

    Set getVariableNames();
}
