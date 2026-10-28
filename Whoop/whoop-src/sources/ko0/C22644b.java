package ko0;

import ad3.AbstractC0757c;
import androidx.core.app.NotificationCompat;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.models.GenericInteraction;
import j02.InterfaceC21159o0;
import lo0.C24580g;
import lo0.C24582h;
import lo0.InterfaceC24586j;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ko0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lko0/b;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lad3/c;", "json", "<init>", "(Lj02/o0;Leb/a0;Lad3/c;)V", "Ll83/a0;", "a", "()V", "b", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "c", "(Lcom/whoop/navigation/models/GenericInteraction;)V", "Lcom/whoop/navigation/e;", "navAction", "d", "(Lcom/whoop/navigation/e;)V", "Llo0/j;", NotificationCompat.CATEGORY_EVENT, "e", "(Llo0/j;)V", "Lj02/o0;", "Leb/a0;", "Lad3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22644b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC0757c json;

    public C22644b(InterfaceC21159o0 navigator, AbstractC12939a0 navController, AbstractC0757c json) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(json, "json");
        this.navigator = navigator;
        this.navController = navController;
        this.json = json;
    }

    /* JADX INFO: renamed from: a */
    private final void m65590a() {
        if (this.navController.m36410z()) {
            return;
        }
        m65591b();
    }

    /* JADX INFO: renamed from: b */
    private final void m65591b() {
        m65593d(new C9598e(null, new HomeScreenModel((String) null, (AiAction) null, 3, (DefaultConstructorMarker) null), null, 5, null));
    }

    /* JADX INFO: renamed from: c */
    private final void m65592c(GenericInteraction genericInteraction) {
        C9598e navigation;
        m65590a();
        DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(genericInteraction, this.json);
        if (decodedGenericInteraction == null || (navigation = decodedGenericInteraction.getNavigation()) == null) {
            return;
        }
        m65593d(navigation);
    }

    /* JADX INFO: renamed from: d */
    private final void m65593d(C9598e navAction) {
        this.navigator.mo59392a(navAction);
    }

    /* JADX INFO: renamed from: e */
    public final void m65594e(InterfaceC24586j event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(C24582h.f96056a)) {
            m65590a();
        } else {
            if (!(event instanceof C24580g)) {
                throw new NoWhenBranchMatchedException();
            }
            m65592c(((C24580g) event).getGenericInteraction());
        }
    }
}
