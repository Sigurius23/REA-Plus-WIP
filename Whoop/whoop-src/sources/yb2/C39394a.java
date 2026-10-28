package yb2;

import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yb2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lyb2/a;", "", "", "Lyb2/c;", "items", "", "debugInfo", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39394a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C39396c> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String debugInfo;

    public C39394a(List<C39396c> items, String debugInfo) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(debugInfo, "debugInfo");
        this.items = items;
        this.debugInfo = debugInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDebugInfo() {
        return this.debugInfo;
    }

    /* JADX INFO: renamed from: b */
    public final List<C39396c> m125815b() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39394a)) {
            return false;
        }
        C39394a c39394a = (C39394a) other;
        return AbstractC22676k.m65745e(this.items, c39394a.items) && AbstractC22676k.m65745e(this.debugInfo, c39394a.debugInfo);
    }

    public int hashCode() {
        return this.debugInfo.hashCode() + (this.items.hashCode() * 31);
    }

    public String toString() {
        return AbstractC30802r.m94761j("LanguagePrefsDomainState(items=", ", debugInfo=", this.debugInfo, ")", this.items);
    }

    public /* synthetic */ C39394a(List list, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? "" : str);
    }
}
