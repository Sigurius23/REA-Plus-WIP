package me;

import i93.C18277c;
import j93.AbstractC21478l0;
import java.util.LinkedHashSet;
import java.util.Set;
import m83.AbstractC25265s;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: me.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25468i {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f99712a;

    static {
        LinkedHashSet linkedHashSetM34556E = AbstractC12350b.m34556E(AbstractC25265s.m74103I1(new C18277c('A', 'Z')), AbstractC25265s.m74103I1(new C18277c('a', 'z')));
        Set setM74103I1 = AbstractC25265s.m74103I1(new C18277c('0', '9'));
        LinkedHashSet linkedHashSetM34556E2 = AbstractC12350b.m34556E(AbstractC12350b.m34556E(linkedHashSetM34556E, setM74103I1), AbstractC21478l0.m60443n("-._~"));
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D('%', AbstractC12350b.m34556E(setM74103I1, AbstractC25265s.m74103I1(new C18277c('A', 'F'))));
        f99712a = AbstractC12350b.m34556E(AbstractC12350b.m34556E(linkedHashSetM34556E2, linkedHashSetM34555D), AbstractC21478l0.m60443n("!$&'()*+,;="));
    }
}
