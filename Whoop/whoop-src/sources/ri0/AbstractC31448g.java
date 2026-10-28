package ri0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import j02.C21166s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ri0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lri0/h;", "Lri0/b;", "d", "(Lri0/h;)Lri0/b;", "Lkotlin/Function1;", "Ll83/a0;", "onEvent", "a", "(Lri0/h;Lkotlin/jvm/functions/Function1;)V", "fallback", "b", "(Lri0/h;Lkotlin/jvm/functions/Function1;Lri0/b;)V", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31448g {
    /* JADX INFO: renamed from: a */
    public static final void m96843a(InterfaceC31449h interfaceC31449h, Function1 onEvent) {
        AbstractC22676k.m65750j(interfaceC31449h, "<this>");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AnalyticEventModel analyticEventModelMo96848b = interfaceC31449h.getAnalyticEvent();
        if (analyticEventModelMo96848b != null) {
            onEvent.invoke(new InterfaceC31443b.g(analyticEventModelMo96848b));
        }
        InterfaceC31443b interfaceC31443bM96846d = m96846d(interfaceC31449h);
        if (interfaceC31443bM96846d != null) {
            onEvent.invoke(interfaceC31443bM96846d);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m96844b(InterfaceC31449h interfaceC31449h, Function1 onEvent, InterfaceC31443b fallback) {
        AbstractC22676k.m65750j(interfaceC31449h, "<this>");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(fallback, "fallback");
        AnalyticEventModel analyticEventModelMo96848b = interfaceC31449h.getAnalyticEvent();
        if (analyticEventModelMo96848b != null) {
            onEvent.invoke(new InterfaceC31443b.g(analyticEventModelMo96848b));
        }
        InterfaceC31443b interfaceC31443bM96846d = m96846d(interfaceC31449h);
        if (interfaceC31443bM96846d != null) {
            fallback = interfaceC31443bM96846d;
        }
        onEvent.invoke(fallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m96845c(InterfaceC31449h interfaceC31449h, Function1 function1, InterfaceC31443b interfaceC31443b, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC31443b = new InterfaceC31443b.h(null, 1, 0 == true ? 1 : 0);
        }
        m96844b(interfaceC31449h, function1, interfaceC31443b);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC31443b m96846d(InterfaceC31449h interfaceC31449h) {
        AbstractC22676k.m65750j(interfaceC31449h, "<this>");
        Action actionMo96847a = interfaceC31449h.getAction();
        if (actionMo96847a != null) {
            return new InterfaceC31443b.p(actionMo96847a);
        }
        C9598e c9598eMo96851e = interfaceC31449h.getDestination();
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c9598eMo96851e != null) {
            return new InterfaceC31443b.c(c9598eMo96851e, false, 2, defaultConstructorMarker);
        }
        AnyModal anyModalMo96850d = interfaceC31449h.getDismissModal();
        InterfaceC31443b.s sVar = anyModalMo96850d != null ? new InterfaceC31443b.s(anyModalMo96850d) : null;
        if (sVar != null) {
            return sVar;
        }
        C21166s c21166sMo96849c = interfaceC31449h.getDismissAction();
        if (c21166sMo96849c != null) {
            return new InterfaceC31443b.h(c21166sMo96849c);
        }
        return null;
    }
}
