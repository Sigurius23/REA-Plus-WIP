package bj1;

import a11.C0140r;
import androidx.core.app.NotificationCompat;
import c41.C4046i5;
import cj1.C4749e;
import cj1.InterfaceC4751g;
import com.whoop.navigation.C9598e;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bj1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lbj1/c;", "", "Lj02/o0;", "navigator", "<init>", "(Lj02/o0;)V", "Lm91/u;", "Ll83/a0;", "a", "(Lm91/u;)V", "Lcj1/g$n;", NotificationCompat.CATEGORY_EVENT, "b", "(Lcj1/g$n;)V", "Lj02/o0;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3332c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C3332c(InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    private final void m9638a(InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u instanceof C4749e) {
            C9598e c9598e = ((C4749e) interfaceC25312u).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
            if (c9598e != null) {
                this.navigator.mo59392a(c9598e);
                return;
            }
            return;
        }
        if (interfaceC25312u instanceof C0140r) {
            this.navigator.mo59393b(new AbstractC21155m0.r0(((C0140r) interfaceC25312u).getConnectivityNavType().name()));
            return;
        }
        if (!(interfaceC25312u instanceof C4046i5)) {
            if (interfaceC25312u instanceof C27256h) {
                this.navigator.mo59392a(((C27256h) interfaceC25312u).getDestination());
            }
        } else {
            C9598e destination = ((C4046i5) interfaceC25312u).getDestination();
            if (destination != null) {
                this.navigator.mo59392a(destination);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9639b(InterfaceC4751g.n event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC4751g.c) {
            this.navigator.mo59392a(((InterfaceC4751g.c) event).getNavAction());
        } else {
            if (!(event instanceof InterfaceC4751g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m9638a(((InterfaceC4751g.b) event).getItemViewState());
        }
    }
}
