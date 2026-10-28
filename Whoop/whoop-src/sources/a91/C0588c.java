package a91;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p668z1.C39970s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a91.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"La91/c;", "La91/b;", "<init>", "()V", "", "windowKey", "", "c", "(Ljava/lang/Object;)Z", "token", "Ll83/a0;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)V", "b", "Lz1/s;", "", "Lz1/s;", "darkSystemBarIconRequests", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0588c implements InterfaceC0587b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39970s darkSystemBarIconRequests = new C39970s();

    @Override // a91.InterfaceC0587b
    /* JADX INFO: renamed from: a */
    public void mo1521a(Object windowKey, Object token) {
        AbstractC22676k.m65750j(windowKey, "windowKey");
        AbstractC22676k.m65750j(token, "token");
        C39970s c39970s = this.darkSystemBarIconRequests;
        Set set = (Set) c39970s.get(windowKey);
        if (set == null) {
            set = C25235a0.f99113w;
        }
        c39970s.put(windowKey, AbstractC12350b.m34555D(token, set));
    }

    @Override // a91.InterfaceC0587b
    /* JADX INFO: renamed from: b */
    public void mo1522b(Object windowKey, Object token) {
        AbstractC22676k.m65750j(windowKey, "windowKey");
        AbstractC22676k.m65750j(token, "token");
        Set set = (Set) this.darkSystemBarIconRequests.get(windowKey);
        if (set == null) {
            set = C25235a0.f99113w;
        }
        LinkedHashSet linkedHashSetM34604y = AbstractC12350b.m34604y(token, set);
        if (linkedHashSetM34604y.isEmpty()) {
            this.darkSystemBarIconRequests.remove(windowKey);
        } else {
            this.darkSystemBarIconRequests.put(windowKey, linkedHashSetM34604y);
        }
    }

    @Override // a91.InterfaceC0587b
    /* JADX INFO: renamed from: c */
    public boolean mo1523c(Object windowKey) {
        AbstractC22676k.m65750j(windowKey, "windowKey");
        Collection collection = (Collection) this.darkSystemBarIconRequests.get(windowKey);
        return !(collection == null || collection.isEmpty());
    }
}
