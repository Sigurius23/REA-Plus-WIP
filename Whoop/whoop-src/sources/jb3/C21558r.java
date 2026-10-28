package jb3;

import c93.InterfaceC4339a;
import hb3.C17119i;
import hb3.C17122k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.C25235a0;
import oa3.C27765h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import pf.AbstractC29125c;
import qa3.C30123c1;
import qa3.C30134g0;
import qa3.C30144j1;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import sa3.AbstractC32327a;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;
import t93.InterfaceC33667c;
import u93.AbstractC34677g0;
import va3.AbstractC35844b;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import z93.EnumC40212c;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: jb3.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C21558r extends AbstractC21557q {

    /* JADX INFO: renamed from: g */
    public final InterfaceC31124g0 f82676g;

    /* JADX INFO: renamed from: h */
    public final C30134g0 f82677h;

    /* JADX INFO: renamed from: i */
    public final String f82678i;

    /* JADX INFO: renamed from: j */
    public final C35847e f82679j;

    public C21558r(InterfaceC31124g0 interfaceC31124g0, C30134g0 proto, InterfaceC32332f nameResolver, AbstractC32327a metadataVersion, C27765h c27765h, C17119i components, String debugName, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(metadataVersion, "metadataVersion");
        AbstractC22676k.m65750j(components, "components");
        AbstractC22676k.m65750j(debugName, "debugName");
        C30123c1 c30123c1 = proto.f123155G;
        AbstractC22676k.m65749i(c30123c1, "getTypeTable(...)");
        C32334h c32334h = new C32334h(c30123c1);
        C32336j c32336j = C32336j.f133837b;
        C30144j1 c30144j1 = proto.f123156H;
        AbstractC22676k.m65749i(c30144j1, "getVersionRequirementTable(...)");
        C17122k c17122kM48363a = components.m48363a(interfaceC31124g0, nameResolver, c32334h, AbstractC29125c.m88541r(c30144j1), metadataVersion, c27765h);
        List list = proto.f123161z;
        AbstractC22676k.m65749i(list, "getFunctionList(...)");
        List list2 = proto.f123153E;
        AbstractC22676k.m65749i(list2, "getPropertyList(...)");
        List list3 = proto.f123154F;
        AbstractC22676k.m65749i(list3, "getTypeAliasList(...)");
        super(c17122kM48363a, list, list2, list3, interfaceC4339a);
        this.f82676g = interfaceC31124g0;
        this.f82677h = proto;
        this.f82678i = debugName;
        this.f82679j = ((AbstractC34677g0) interfaceC31124g0).f146067F;
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: a */
    public final void mo60570a(ArrayList arrayList, Function1 function1) {
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: e */
    public final C35845c mo60573e(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return new C35845c(this.f82679j, name);
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: g */
    public final Set mo60574g() {
        return C25235a0.f99113w;
    }

    @Override // jb3.AbstractC21557q, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        recordLookup(name, location);
        return super.getContributedClassifier(name, location);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        EnumC40212c enumC40212c = EnumC40212c.f173637w;
        Collection collectionM60586b = m60586b(kindFilter, function1);
        Iterable iterable = this.f82672b.f65760a.f65745k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((InterfaceC33667c) it.next()).mo88259a(this.f82679j));
        }
        return AbstractC25265s.m74129g1(collectionM60586b, arrayList);
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: h */
    public final Set mo60575h() {
        return C25235a0.f99113w;
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: i */
    public final Set mo60576i() {
        return C25235a0.f99113w;
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: j */
    public final boolean mo60588j(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        if (super.mo60588j(name)) {
            return true;
        }
        Iterable iterable = this.f82672b.f65760a.f65745k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InterfaceC33667c) it.next()).mo88260b(this.f82679j, name)) {
                return true;
            }
        }
        return false;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final void recordLookup(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        AbstractC35844b.m113769j(this.f82672b.f65760a.f65743i, location, this.f82676g, name);
    }

    public final String toString() {
        return this.f82678i;
    }
}
