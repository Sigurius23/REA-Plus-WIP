package h31;

import ad3.AbstractC0757c;
import ad3.C0764g;
import androidx.core.app.NotificationCompat;
import cd3.C4455g;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.json.C9602a;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.UpdateAction;
import h00.C16497d0;
import h00.C16513l0;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import sw2.AbstractC33054a;
import u82.AbstractC34650k;

/* JADX INFO: renamed from: h31.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "d", "(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/UpdateAction;", "Lad3/c;", "a", "Ll83/h;", "c", "()Lad3/c;", "recommendationActionJson", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16827t {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f64641a = AbstractC30060g.m92088H(new C16497d0(7));

    /* JADX INFO: renamed from: c */
    private static final AbstractC0757c m47421c() {
        return (AbstractC0757c) f64641a.getValue();
    }

    /* JADX INFO: renamed from: d */
    public static final UpdateAction m47422d(Object event) {
        AbstractC22676k.m65750j(event, "event");
        GenericInteraction genericInteraction = event instanceof GenericInteraction ? (GenericInteraction) event : null;
        Action actionM104670a = genericInteraction != null ? AbstractC33054a.m104670a(genericInteraction, m47421c()) : null;
        if (actionM104670a instanceof UpdateAction) {
            return (UpdateAction) actionM104670a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final AbstractC0757c m47423e() {
        return AbstractC34132o.m107878b(AbstractC34650k.m109496c(), new C16513l0(14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m47424f(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        C4455g c4455g = new C4455g();
        c4455g.mo2325k(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), new C9602a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        Json.f2788o = c4455g.m13953r();
        return C23454a0.f92919a;
    }
}
