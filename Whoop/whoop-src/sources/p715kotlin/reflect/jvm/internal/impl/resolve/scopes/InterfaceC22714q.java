package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import p715kotlin.jvm.functions.Function1;
import r93.InterfaceC31126h;
import va3.C35850h;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.q */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC22714q {
    InterfaceC31126h getContributedClassifier(C35850h c35850h, InterfaceC40210a interfaceC40210a);

    Collection getContributedDescriptors(C22704g c22704g, Function1 function1);

    Collection getContributedFunctions(C35850h c35850h, InterfaceC40210a interfaceC40210a);

    void recordLookup(C35850h c35850h, InterfaceC40210a interfaceC40210a);
}
