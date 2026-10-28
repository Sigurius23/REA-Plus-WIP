package hd2;

import c13.AbstractC3855a;
import java.util.List;
import l83.C23465k;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: hd2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR)\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lhd2/a;", "Lm91/u;", "", "activityIconUrl", "", "Ll83/k;", "", "coordinates", "Lm91/o;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17199a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String activityIconUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C23465k> coordinates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C25306o> items;

    public C17199a(String str, List<C23465k> coordinates, List<C25306o> items) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        AbstractC22676k.m65750j(items, "items");
        this.activityIconUrl = str;
        this.coordinates = coordinates;
        this.items = items;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityIconUrl() {
        return this.activityIconUrl;
    }

    /* JADX INFO: renamed from: b */
    public final List<C23465k> m48569b() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: c */
    public final List<C25306o> m48570c() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17199a)) {
            return false;
        }
        C17199a c17199a = (C17199a) other;
        return AbstractC22676k.m65745e(this.activityIconUrl, c17199a.activityIconUrl) && AbstractC22676k.m65745e(this.coordinates, c17199a.coordinates) && AbstractC22676k.m65745e(this.items, c17199a.items);
    }

    public int hashCode() {
        String str = this.activityIconUrl;
        return this.items.hashCode() + AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.coordinates);
    }

    public String toString() {
        String str = this.activityIconUrl;
        List<C23465k> list = this.coordinates;
        return AbstractC3855a.m11829m(AbstractC30802r.m94766o("ShareRouteMapState(activityIconUrl=", str, ", coordinates=", ", items=", list), this.items, ")");
    }
}
