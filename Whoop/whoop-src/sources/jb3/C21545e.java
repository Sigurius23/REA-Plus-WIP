package jb3;

import c93.InterfaceC4339a;
import java.util.Collection;
import lb3.AbstractC23771f;
import mb3.C25389f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22709l;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import z93.EnumC40212c;

/* JADX INFO: renamed from: jb3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C21545e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82622w;

    /* JADX INFO: renamed from: x */
    public final C21547g f82623x;

    public /* synthetic */ C21545e(C21547g c21547g, int i13) {
        this.f82622w = i13;
        this.f82623x = c21547g;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f82622w;
        C21547g c21547g = this.f82623x;
        switch (i13) {
            case 0:
                C22704g c22704g = C22704g.f89363m;
                InterfaceC22712o.f89379a.getClass();
                EnumC40212c enumC40212c = EnumC40212c.f173637w;
                return c21547g.m60586b(c22704g, C22709l.f89376w);
            default:
                C25389f c25389f = c21547g.f82625g;
                C21548h classDescriptor = c21547g.f82628j;
                c25389f.getClass();
                AbstractC22676k.m65750j(classDescriptor, "classDescriptor");
                Collection supertypes = ((AbstractC23771f) classDescriptor.mo60496e()).getSupertypes();
                AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
                return supertypes;
        }
    }
}
