package y50;

import com.whoop.access.omronauth.domain.models.OmronAuthModel;
import com.whoop.design.models.items.ImageUrlModel;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import u50.C34538b;
import u50.InterfaceC34541e;
import x50.InterfaceC37988c;

/* JADX INFO: renamed from: y50.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ly50/a;", "", "<init>", "()V", "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;", "Lx50/c$c;", "b", "(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;)Lx50/c$c;", "Lu50/b;", "domainState", "Lx50/c;", "a", "(Lu50/b;)Lx50/c;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39232a {
    /* JADX INFO: renamed from: b */
    private final InterfaceC37988c.c m124996b(OmronAuthModel omronAuthModel) {
        ImageUrlModel image = omronAuthModel.getImage();
        return new InterfaceC37988c.c(new AbstractC22403o.c(image != null ? image.getImageUrl() : null, 0, 0, 0, 14, null), omronAuthModel.getContent().getTitle(), omronAuthModel.getContent().getSubtitle(), omronAuthModel.getFeaturesList(), omronAuthModel.getButton(), omronAuthModel.getOmronUrl(), omronAuthModel.getNavigateOnSuccess());
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC37988c m124997a(C34538b domainState) {
        InterfaceC37988c.c cVarM124996b;
        AbstractC22676k.m65750j(domainState, "domainState");
        InterfaceC34541e interfaceC34541e = domainState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String();
        if (interfaceC34541e instanceof InterfaceC34541e.e) {
            return InterfaceC37988c.e.f162703b;
        }
        if (interfaceC34541e instanceof InterfaceC34541e.d) {
            return InterfaceC37988c.d.f162701b;
        }
        if (interfaceC34541e instanceof InterfaceC34541e.b) {
            return InterfaceC37988c.b.f162690b;
        }
        if (interfaceC34541e instanceof InterfaceC34541e.a) {
            return new InterfaceC37988c.a(((InterfaceC34541e.a) interfaceC34541e).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String());
        }
        if (!(interfaceC34541e instanceof InterfaceC34541e.c)) {
            throw new NoWhenBranchMatchedException();
        }
        OmronAuthModel model = domainState.getModel();
        return (model == null || (cVarM124996b = m124996b(model)) == null) ? InterfaceC37988c.e.f162703b : cVarM124996b;
    }
}
