package rb3;

import java.util.Arrays;
import java.util.Collection;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;
import yb3.C39412p;

/* JADX INFO: renamed from: rb3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C31201i {

    /* JADX INFO: renamed from: a */
    public final C35850h f128535a;

    /* JADX INFO: renamed from: b */
    public final C39412p f128536b;

    /* JADX INFO: renamed from: c */
    public final Collection f128537c;

    /* JADX INFO: renamed from: d */
    public final Function1 f128538d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC31197e[] f128539e;

    public C31201i(C35850h c35850h, C39412p c39412p, Collection collection, Function1 function1, InterfaceC31197e... interfaceC31197eArr) {
        this.f128535a = c35850h;
        this.f128536b = c39412p;
        this.f128537c = collection;
        this.f128538d = function1;
        this.f128539e = interfaceC31197eArr;
    }

    public /* synthetic */ C31201i(C35850h c35850h, InterfaceC31197e[] interfaceC31197eArr) {
        this(c35850h, interfaceC31197eArr, C31200h.f128531x);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31201i(C35850h name, InterfaceC31197e[] interfaceC31197eArr, Function1 function1) {
        this(name, null, null, function1, (InterfaceC31197e[]) Arrays.copyOf(interfaceC31197eArr, interfaceC31197eArr.length));
        AbstractC22676k.m65750j(name, "name");
    }

    public /* synthetic */ C31201i(Collection collection, InterfaceC31197e[] interfaceC31197eArr) {
        this(collection, interfaceC31197eArr, C31200h.f128533z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31201i(Collection nameList, InterfaceC31197e[] interfaceC31197eArr, Function1 function1) {
        this(null, null, nameList, function1, (InterfaceC31197e[]) Arrays.copyOf(interfaceC31197eArr, interfaceC31197eArr.length));
        AbstractC22676k.m65750j(nameList, "nameList");
    }
}
