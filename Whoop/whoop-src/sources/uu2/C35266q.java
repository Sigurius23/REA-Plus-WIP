package uu2;

import a12.AbstractC0142b;
import a81.InterfaceC0569t;
import ad3.AbstractC0770m;
import androidx.core.app.NotificationCompat;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.EditCustomExerciseModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.UpdateAction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import qi0.C30406a;
import ri0.InterfaceC31443b;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: uu2.q */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ_\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010 \u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u0004\u0018\u00010%2\b\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b&\u0010'JU\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010%2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b)\u0010*J]\u0010+\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b+\u0010,J]\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b/\u00100¨\u00061"}, m65681d2 = {"Luu2/q;", "", "<init>", "()V", "", "path", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Ljava/util/List;", "payload", "Lqi0/a;", "actionRouter", "Lkotlin/Function1;", "Lcom/whoop/design/models/modal/AnyModal;", "Ll83/a0;", "setPresentedModal", "Luu2/p;", "onEvent", "Lcom/whoop/navigation/e;", "onNavigationAction", "e", "(Ljava/lang/Object;Lqi0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "destination", "f", "(Lcom/whoop/navigation/e;)Ljava/lang/String;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "b", "(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/String;", "", "g", "(Lcom/whoop/whoopaction/domain/models/Action;)Z", "k", "(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "d", "(Lcom/whoop/whoopaction/domain/models/Action;Lkotlin/jvm/functions/Function1;)V", "router", "Lri0/b;", "i", "(Lqi0/a;Ljava/lang/Object;)Lri0/b;", "result", "a", "(Lri0/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "j", "(Lqi0/a;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "La81/t;", NotificationCompat.CATEGORY_EVENT, "c", "(La81/t;Lqi0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35266q {

    /* JADX INFO: renamed from: a */
    public static final C35266q f150053a = new C35266q();

    /* JADX INFO: renamed from: uu2.q$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Luu2/q$a;", "Lm91/u;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC25312u {

        /* JADX INFO: renamed from: a */
        public static final a f150054a = new a();

        private a() {
        }
    }

    private C35266q() {
    }

    /* JADX INFO: renamed from: e */
    private final void m111841e(Object payload, C30406a actionRouter, Function1 setPresentedModal, Function1 onEvent, Function1 onNavigationAction) {
        if (payload instanceof Action) {
            m111846d((Action) payload, onEvent);
        } else if ((payload instanceof C9598e) || (payload instanceof GenericInteraction) || (payload instanceof DesignItemInteraction)) {
            m111850j(actionRouter, payload, setPresentedModal, onEvent, onNavigationAction);
        }
    }

    /* JADX INFO: renamed from: h */
    private final List<String> m111842h(String path) {
        try {
            String string = AbstractC39414r.m125869O0(path).toString();
            if (string.length() == 0) {
                return null;
            }
            String strM125874S0 = AbstractC39414r.m125874S0(AbstractC39414r.m125869O0(AbstractC0142b.m360e(string).getBasePath()).toString(), '/');
            if (strM125874S0.length() == 0) {
                return null;
            }
            List listM125905x0 = AbstractC39414r.m125905x0(strM125874S0, new char[]{'/'}, 0, 6);
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125905x0, 10));
            Iterator it = listM125905x0.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC39414r.m125869O0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m111843a(InterfaceC31443b result, Function1 setPresentedModal, Function1 onEvent, Function1 onNavigationAction) {
        AbstractC22676k.m65750j(setPresentedModal, "setPresentedModal");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onNavigationAction, "onNavigationAction");
        if (result instanceof InterfaceC31443b.s) {
            setPresentedModal.invoke(((InterfaceC31443b.s) result).getModal());
            return;
        }
        if (result instanceof InterfaceC31443b.p) {
            m111846d(((InterfaceC31443b.p) result).getAction(), onEvent);
            return;
        }
        if (result instanceof InterfaceC31443b.c) {
            m111851k(((InterfaceC31443b.c) result).getNavAction(), onNavigationAction, onEvent);
            return;
        }
        if ((result instanceof InterfaceC31443b.f) || (result instanceof InterfaceC31443b.q)) {
            setPresentedModal.invoke(null);
        } else if (result instanceof InterfaceC31443b.h) {
            onEvent.invoke(InterfaceC35265p.c.f150047a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m111844b(Action action) {
        List<String> listM111842h;
        int iNextIndex;
        AbstractC22676k.m65750j(action, "action");
        UpdateAction updateAction = action instanceof UpdateAction ? (UpdateAction) action : null;
        if (updateAction == null) {
            return null;
        }
        Request request = updateAction.getRequest();
        if (!AbstractC39421y.m125921F(request.getMethod(), "DELETE", true) || (listM111842h = m111842h(request.getPath())) == null) {
            return null;
        }
        ListIterator<String> listIterator = listM111842h.listIterator(listM111842h.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (AbstractC39421y.m125921F(listIterator.previous(), "custom-exercise", true)) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex < 0 || iNextIndex >= AbstractC37056f.m118951C(listM111842h)) {
            return null;
        }
        String str = listM111842h.get(iNextIndex + 1);
        return AbstractC39414r.m125890i0(str) ? null : str;
    }

    /* JADX INFO: renamed from: c */
    public final void m111845c(InterfaceC0569t event, C30406a actionRouter, Function1 setPresentedModal, Function1 onEvent, Function1 onNavigationAction) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(setPresentedModal, "setPresentedModal");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onNavigationAction, "onNavigationAction");
        if (event.equals(InterfaceC0569t.a.f2023a) || (event instanceof InterfaceC0569t.e)) {
            setPresentedModal.invoke(null);
            return;
        }
        if (event instanceof InterfaceC0569t.f) {
            setPresentedModal.invoke(((InterfaceC0569t.f) event).getModal());
            return;
        }
        if (event instanceof InterfaceC0569t.c) {
            m111851k(((InterfaceC0569t.c) event).getDestination(), onNavigationAction, onEvent);
        } else if (event instanceof InterfaceC0569t.d) {
            m111846d(((InterfaceC0569t.d) event).getAction(), onEvent);
        } else {
            if (!(event instanceof InterfaceC0569t.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m111841e(((InterfaceC0569t.b) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), actionRouter, setPresentedModal, onEvent, onNavigationAction);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m111846d(Action action, Function1 onEvent) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        String strM111844b = m111844b(action);
        if (strM111844b != null) {
            onEvent.invoke(new InterfaceC35265p.b(strM111844b));
        } else if (m111848g(action)) {
            onEvent.invoke(new InterfaceC35265p.f(action));
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m111847f(C9598e destination) {
        String strM1844f;
        AbstractC22676k.m65750j(destination, "destination");
        NavigationScreenModel parameters = destination.getParameters();
        if (parameters instanceof EditCustomExerciseModel) {
            String exerciseId = ((EditCustomExerciseModel) parameters).getExerciseId();
            if (AbstractC39414r.m125890i0(exerciseId)) {
                return null;
            }
            return exerciseId;
        }
        if (parameters instanceof NavigationScreenModel.DeserializationError) {
            NavigationScreenModel.DeserializationError deserializationError = (NavigationScreenModel.DeserializationError) parameters;
            if (!AbstractC39421y.m125921F(deserializationError.getUnrecognizedScreen(), "EDIT_CUSTOM_EXERCISE", true)) {
                return null;
            }
            Object obj = deserializationError.getRawParameters().get((Object) "exercise_id");
            JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            if (jsonPrimitive != null && (strM1844f = AbstractC0770m.m1844f(jsonPrimitive)) != null && !AbstractC39414r.m125890i0(strM1844f)) {
                return strM1844f;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m111848g(Action action) {
        List<String> listM111842h;
        AbstractC22676k.m65750j(action, "action");
        UpdateAction updateAction = action instanceof UpdateAction ? (UpdateAction) action : null;
        if (updateAction == null) {
            return false;
        }
        String method = updateAction.getRequest().getMethod();
        if ((!AbstractC39421y.m125921F(method, "PUT", true) && !AbstractC39421y.m125921F(method, "DELETE", true)) || (listM111842h = m111842h(updateAction.getRequest().getPath())) == null) {
            return false;
        }
        List<String> list = listM111842h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC39421y.m125921F((String) it.next(), "one-rep-max", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC31443b m111849i(C30406a router, Object payload) {
        AbstractC22676k.m65750j(payload, "payload");
        if (router != null) {
            return router.m92912i(new InterfaceC31443b.j(payload, a.f150054a));
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m111850j(C30406a actionRouter, Object payload, Function1 setPresentedModal, Function1 onEvent, Function1 onNavigationAction) {
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(setPresentedModal, "setPresentedModal");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onNavigationAction, "onNavigationAction");
        m111843a(m111849i(actionRouter, payload), setPresentedModal, onEvent, onNavigationAction);
    }

    /* JADX INFO: renamed from: k */
    public final void m111851k(C9598e destination, Function1 onNavigationAction, Function1 onEvent) {
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(onNavigationAction, "onNavigationAction");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        String strM111847f = m111847f(destination);
        if (strM111847f != null) {
            onEvent.invoke(new InterfaceC35265p.e(strM111847f));
        } else {
            onNavigationAction.invoke(destination);
        }
    }
}
