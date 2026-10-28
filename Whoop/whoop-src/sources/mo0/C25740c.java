package mo0;

import c31.C3927k;
import com.whoop.clinicianintheloop.api.SchedulingConfirmationResponse;
import io0.C20716c;
import io0.C20717d;
import io0.C20719f;
import io0.InterfaceC20715b;
import java.util.List;
import jb1.C21535a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import lo0.AbstractC24594n;
import lo0.C24590l;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23716t3;
import p720m91.InterfaceC25312u;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: mo0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lmo0/c;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lio0/f;", "domainState", "Llo0/n;", "d", "(Lio0/f;)Llo0/n;", "Lio0/b;", "modal", "b", "(Lio0/b;)Llo0/n;", "Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "Llo0/l;", "c", "(Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)Llo0/l;", "a", "Ljb1/a;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25740c {

    /* JADX INFO: renamed from: b */
    public static final int f101444b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C25740c(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC24594n m75921b(InterfaceC20715b modal) {
        if (AbstractC22676k.m65745e(modal, C20716c.f77588a)) {
            return AbstractC24594n.b.f96129b;
        }
        if (AbstractC22676k.m65745e(modal, C20717d.f77589a)) {
            return AbstractC24594n.a.f96128b;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX INFO: renamed from: c */
    private final C24590l m75922c(SchedulingConfirmationResponse schedulingConfirmationResponse) {
        AbstractC22403o abstractC22403oM64503l;
        List<InterfaceC25312u> listM60545m = this.designItemReducer.m60545m(schedulingConfirmationResponse.getItems());
        C3927k c3927kM69429g = AbstractC23716t3.m69429g(schedulingConfirmationResponse.getProgressButton());
        String backgroundImageUrl = schedulingConfirmationResponse.getBackgroundImageUrl();
        if (backgroundImageUrl == null) {
            abstractC22403oM64503l = AbstractC22403o.b.f87641b;
        } else {
            if (AbstractC39414r.m125890i0(backgroundImageUrl)) {
                backgroundImageUrl = null;
            }
            if (backgroundImageUrl == null || (abstractC22403oM64503l = AbstractC22404p.m64503l(backgroundImageUrl)) == null) {
                abstractC22403oM64503l = AbstractC22403o.b.f87641b;
            }
        }
        return new C24590l(listM60545m, c3927kM69429g, abstractC22403oM64503l, schedulingConfirmationResponse.getGradientColor());
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC24594n m75923d(C20719f domainState) {
        SchedulingConfirmationResponse response = domainState.getResponse();
        return response == null ? AbstractC24594n.b.f96129b : new AbstractC24594n.c(m75922c(response));
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC24594n m75924a(C20719f domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        InterfaceC20715b fullScreenModal = domainState.getFullScreenModal();
        return fullScreenModal == null ? m75923d(domainState) : m75921b(fullScreenModal);
    }
}
