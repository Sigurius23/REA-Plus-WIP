package yg0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.IntegrationsScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yg0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lyg0/a;", "", "Lj02/o0;", "navigator", "<init>", "(Lj02/o0;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "b", "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;", "Lyg0/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lyg0/b;)V", "Lj02/o0;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39522a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C39522a(InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: b */
    private final NavigationScreenModel m126248b(NavigationScreenModel navigationScreenModel) {
        return navigationScreenModel instanceof IntegrationsScreenModel ? IntegrationsScreenModel.copy$default((IntegrationsScreenModel) navigationScreenModel, null, "COACH", null, 5, null) : navigationScreenModel;
    }

    /* JADX INFO: renamed from: a */
    public final void m126249a(AbstractC39523b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC39523b.a) {
            C9598e action = ((AbstractC39523b.a) event).getAction();
            this.navigator.mo59392a(C9598e.m23127b(action, null, m126248b(action.getParameters()), null, 5, null));
            return;
        }
        if (event instanceof AbstractC39523b.c) {
            String destination = ((AbstractC39523b.c) event).getDestination();
            if (destination == null) {
                destination = "WHOOP_COACH_RELEASE_NOTES";
            }
            this.navigator.mo59393b(new AbstractC21155m0.v1(destination, "AI Coach"));
            return;
        }
        if (event instanceof AbstractC39523b.d) {
            this.navigator.mo59393b(new AbstractC21155m0.m1(new ApiRequest(((AbstractC39523b.d) event).getPage(), (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 1022, null));
        } else {
            if (!(event instanceof AbstractC39523b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59393b(new AbstractC21155m0.m1(new ApiRequest(((AbstractC39523b.b) event).getPath(), (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 1022, null));
        }
    }
}
