package g60;

import c31.C3927k;
import com.whoop.access.reconfirmlabs.domain.models.ReconfirmLabsScreenResponse;
import com.whoop.design.models.InfoCalloutTileModel;
import d60.C11729c;
import d60.InterfaceC11727a;
import d60.InterfaceC11731e;
import f60.C14138c;
import f60.InterfaceC14136a;
import k11.C22123f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23645i1;
import p716lb1.AbstractC23653j2;
import p716lb1.AbstractC23716t3;
import p736sz0.AbstractC33208p0;
import p736sz0.C33205o0;
import p736sz0.C33211q0;

/* JADX INFO: renamed from: g60.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lg60/a;", "", "<init>", "()V", "Ld60/a$a;", "Lf60/c;", "b", "(Ld60/a$a;)Lf60/c;", "Ld60/c;", "e", "(Ld60/c;)Lf60/c;", "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "Lf60/c$c;", "d", "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;)Lf60/c$c;", "domainState", "Lf60/c$b;", "c", "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ld60/c;)Lf60/c$b;", "a", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15527a {
    /* JADX INFO: renamed from: b */
    private final C14138c m43713b(InterfaceC11727a.a aVar) {
        if (aVar instanceof InterfaceC11727a.b) {
            return new C14138c(new C14138c.a(C33205o0.f138451a.m105288b(), null, null, 6, null), null, null, 6, null);
        }
        if (aVar instanceof InterfaceC11727a.c) {
            return new C14138c(new C14138c.a(C33205o0.f138451a.m105289c(), new InterfaceC14136a.g(null, 1, null), InterfaceC14136a.c.f50841a), null, null, 6, null);
        }
        if (aVar instanceof InterfaceC11727a.d) {
            return new C14138c(new C14138c.a(C33205o0.f138451a.m105291e(), new InterfaceC14136a.g(null, 1, null), InterfaceC14136a.c.f50841a), null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final C14138c.b m43714c(ReconfirmLabsScreenResponse reconfirmLabsScreenResponse, C11729c c11729c) {
        return new C14138c.b(reconfirmLabsScreenResponse.getTitle(), c11729c.m31337d());
    }

    /* JADX INFO: renamed from: d */
    private final C14138c.c m43715d(ReconfirmLabsScreenResponse reconfirmLabsScreenResponse) {
        String imageUrl = reconfirmLabsScreenResponse.getImageUrl();
        String title = reconfirmLabsScreenResponse.getTitle();
        String subtitle = reconfirmLabsScreenResponse.getSubtitle();
        C22123f c22123fM68864c = AbstractC23645i1.m68864c(reconfirmLabsScreenResponse.getTile());
        C3927k c3927kM69429g = AbstractC23716t3.m69429g(reconfirmLabsScreenResponse.getProgressButton());
        InfoCalloutTileModel callout = reconfirmLabsScreenResponse.getCallout();
        return new C14138c.c(imageUrl, title, subtitle, c22123fM68864c, c3927kM69429g, callout != null ? AbstractC23653j2.m68922b(callout) : null, null);
    }

    /* JADX INFO: renamed from: e */
    private final C14138c m43716e(C11729c c11729c) {
        ReconfirmLabsScreenResponse response = c11729c.getResponse();
        if (response != null && !(c11729c.getUploadStatus() instanceof InterfaceC11731e.d)) {
            if (!(c11729c.getUploadStatus() instanceof InterfaceC11731e.c)) {
                return !c11729c.m31337d().isEmpty() ? new C14138c(null, null, m43714c(response, c11729c), 3, null) : new C14138c(null, m43715d(response), null, 5, null);
            }
            C33211q0 c33211q0 = new C33211q0(null, new AbstractC33208p0.h(null, 0L, null, 7, null), null, null, null, false, false, null, false, false, 1021, null);
            String pipeline = ((InterfaceC11731e.c) c11729c.getUploadStatus()).getPipeline();
            return new C14138c(new C14138c.a(c33211q0, pipeline != null ? new InterfaceC14136a.e(pipeline) : InterfaceC14136a.c.f50841a, null, 4, null), null, null, 6, null);
        }
        return new C14138c(new C14138c.a(C33205o0.f138451a.m105288b(), null, null, 6, null), null, null, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public final C14138c m43717a(C11729c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return domainState.getCurrentDialogType() instanceof InterfaceC11727a.a ? m43713b((InterfaceC11727a.a) domainState.getCurrentDialogType()) : m43716e(domainState);
    }
}
