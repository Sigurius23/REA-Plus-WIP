package ji2;

import com.whoop.strava.domain.models.StravaAuthorizeRequest;
import gi2.AbstractC15896b;
import hi2.C17317b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ji2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lji2/i;", "Lgi2/b;", "a", "(Lji2/i;)Lgi2/b;", "strava_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21732k {
    /* JADX INFO: renamed from: a */
    public static final AbstractC15896b m61293a(InterfaceC21730i interfaceC21730i) {
        AbstractC22676k.m65750j(interfaceC21730i, "<this>");
        if (interfaceC21730i instanceof InterfaceC21730i.f) {
            InterfaceC21730i.f fVar = (InterfaceC21730i.f) interfaceC21730i;
            return (fVar.getCode() == null || fVar.getScope() == null || fVar.getState() == null) ? new AbstractC15896b.b(fVar.getNavBack()) : new AbstractC15896b.a(new StravaAuthorizeRequest(fVar.getCode(), fVar.getState(), fVar.getScope()));
        }
        if (interfaceC21730i.equals(InterfaceC21730i.c.f83508a)) {
            return AbstractC15896b.c.f60024a;
        }
        if (interfaceC21730i instanceof InterfaceC21730i.o) {
            InterfaceC21730i.o oVar = (InterfaceC21730i.o) interfaceC21730i;
            return new AbstractC15896b.i(oVar.getUpdateSettingsData().getShareToStrava(), oVar.getUpdateSettingsData().getShareAllActivities(), oVar.getUpdateSettingsData().getTemplateName(), oVar.getUpdateSettingsData().m61305e(), oVar.getUpdateSettingsData().getNavBack(), oVar.getUpdateSettingsData().getImportActivities());
        }
        if (interfaceC21730i instanceof InterfaceC21730i.l) {
            InterfaceC21730i.l lVar = (InterfaceC21730i.l) interfaceC21730i;
            return new AbstractC15896b.f(new C17317b(lVar.getTitleDisplay(), null, false, lVar.getSearchPlaceHolder(), lVar.getDescription(), lVar.getAllTextDisplay(), lVar.getAllActivities(), lVar.getPopularTitle(), lVar.getOtherTitle(), lVar.m61274b(), lVar.getSaveSelectionDisplay(), lVar.getTemplateName(), lVar.getAutomaticallyImportEnabled(), 6, null));
        }
        if (interfaceC21730i instanceof InterfaceC21730i.g) {
            return new AbstractC15896b.e(((InterfaceC21730i.g) interfaceC21730i).getNewText());
        }
        if (interfaceC21730i instanceof InterfaceC21730i.i) {
            InterfaceC21730i.i iVar = (InterfaceC21730i.i) interfaceC21730i;
            return new AbstractC15896b.h(iVar.getName(), iVar.getChecked());
        }
        if (interfaceC21730i instanceof InterfaceC21730i.h) {
            return new AbstractC15896b.g(((InterfaceC21730i.h) interfaceC21730i).getChecked());
        }
        if (interfaceC21730i instanceof InterfaceC21730i.b) {
            return new AbstractC15896b.d(((InterfaceC21730i.b) interfaceC21730i).getDisconnectConfirmationData());
        }
        if (!(interfaceC21730i instanceof InterfaceC21730i.a) && !(interfaceC21730i instanceof InterfaceC21730i.e) && !(interfaceC21730i instanceof InterfaceC21730i.j)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Cannot send the event " + interfaceC21730i);
    }
}
