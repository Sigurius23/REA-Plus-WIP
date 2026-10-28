package rr2;

import com.mapbox.common.location.C5432a;
import com.whoop.data.repositories.C6656c;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.AbstractC20445o4;
import io.sentry.C20315e;
import io.sentry.C20337g0;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20308d1;
import io.sentry.protocol.C20481h0;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rr2.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lrr2/m;", "Lrr2/l;", "<init>", "()V", "Lkotlin/Function1;", "Lio/sentry/b1;", "Ll83/a0;", "scopeCallback", "i", "(Lkotlin/jvm/functions/Function1;)V", "Lio/sentry/e;", "breadcrumb", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lio/sentry/e;)V", "Lio/sentry/protocol/h0;", UserState.Sources.USER, "e", "(Lio/sentry/protocol/h0;)V", "", "tag", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "", "throwable", "g", "(Ljava/lang/Throwable;)V", "a", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "", "f", "()Ljava/lang/Boolean;", "crashedLastRun", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31776m implements InterfaceC31775l {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m98666m(Function1 function1, InterfaceC20259b1 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        function1.invoke(scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m98667n(Function1 function1, InterfaceC20259b1 it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: a */
    public void mo98654a(Throwable throwable, Function1 scopeCallback) {
        AbstractC22676k.m65750j(throwable, "throwable");
        AbstractC22676k.m65750j(scopeCallback, "scopeCallback");
        C5432a c5432a = new C5432a(scopeCallback, 8);
        InterfaceC20308d1 interfaceC20308d1M56638b = AbstractC20445o4.m56638b();
        interfaceC20308d1M56638b.getClass();
        interfaceC20308d1M56638b.mo56438r(throwable, new C20337g0(), c5432a);
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: b */
    public void mo98655b(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC20445o4.m56644h(tag);
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: c */
    public void mo98656c(String tag, String value) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(value, "value");
        AbstractC20445o4.m56645i(tag, value);
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: d */
    public /* bridge */ void mo98657d(String str, Map<String, String> map) {
        super.mo98657d(str, map);
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: e */
    public void mo98658e(C20481h0 user) {
        AbstractC20445o4.m56646j(user);
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: f */
    public Boolean mo98659f() {
        return AbstractC20445o4.m56642f();
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: g */
    public void mo98660g(Throwable throwable) {
        AbstractC22676k.m65750j(throwable, "throwable");
        InterfaceC20308d1 interfaceC20308d1M56638b = AbstractC20445o4.m56638b();
        interfaceC20308d1M56638b.getClass();
        interfaceC20308d1M56638b.mo56417B(throwable, new C20337g0());
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: h */
    public void mo98661h(C20315e breadcrumb) {
        AbstractC22676k.m65750j(breadcrumb, "breadcrumb");
        AbstractC20445o4.m56638b().mo56428h(breadcrumb);
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: i */
    public void mo98662i(Function1 scopeCallback) {
        AbstractC22676k.m65750j(scopeCallback, "scopeCallback");
        AbstractC20445o4.m56638b().mo56439s(new C6656c(scopeCallback, 25));
    }

    @Override // rr2.InterfaceC31775l
    /* JADX INFO: renamed from: j */
    public /* bridge */ void mo98663j(String str, String str2, Map<String, ? extends Object> map) {
        super.mo98663j(str, str2, map);
    }
}
