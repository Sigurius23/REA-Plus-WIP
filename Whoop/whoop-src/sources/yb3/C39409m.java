package yb3;

import e93.AbstractC12889b;
import i93.C18284j;
import java.util.Iterator;
import java.util.regex.Matcher;
import m83.AbstractC25234a;
import m83.AbstractC25265s;
import o63.C27617h;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x30.C37894h1;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: yb3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C39409m extends AbstractC25234a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C39410n f169582w;

    public C39409m(C39410n c39410n) {
        this.f169582w = c39410n;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f169582w.f169583a.groupCount() + 1;
    }

    /* JADX INFO: renamed from: c */
    public final C39406j m125842c(int i13) {
        Matcher matcher = this.f169582w.f169583a;
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(matcher.start(i13), matcher.end(i13));
        if (c18284jM36278i0.f71133w < 0) {
            return null;
        }
        String strGroup = matcher.group(i13);
        AbstractC22676k.m65749i(strGroup, "group(...)");
        return new C39406j(strGroup, c18284jM36278i0);
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof C39406j) {
            return super.contains((C39406j) obj);
        }
        return false;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C27617h(AbstractC38176k.m122272A(AbstractC25265s.m74145r0(AbstractC37056f.m118950B(this)), new C37894h1(this, 9)));
    }
}
