package qj0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C2990b0;
import bc3.InterfaceC2994c0;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import ft0.InterfaceC14766b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import mj0.InterfaceC25614c;
import nj0.InterfaceC26750f;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: qj0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%R$\u0010-\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b\u001d\u0010*\"\u0004\b+\u0010,R\"\u00102\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010/\u001a\u0004\b#\u00100\"\u0004\b(\u00101¨\u00063"}, m65681d2 = {"Lqj0/h;", "Lft0/b;", "Lmj0/d;", "id", "Lnj0/f;", "protocol", "Lmj0/c;", "initialState", "Lbc3/z;", "threadSafeDispatcher", "<init>", "(Ljava/lang/String;Lnj0/f;Lmj0/c;Lbc3/z;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "newState", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lmj0/c;)V", "b", "()V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "Lnj0/f;", "getProtocol", "()Lnj0/f;", "Lec3/p1;", "c", "Lec3/p1;", "_state", "Lec3/f2;", "d", "Lec3/f2;", "getState", "()Lec3/f2;", "state", "Lbc3/c0;", "e", "Lbc3/c0;", "()Lbc3/c0;", "scope", "Lqj0/d;", "f", "Lqj0/d;", "()Lqj0/d;", "g", "(Lqj0/d;)V", "session", "", "Z", "()Z", "(Z)V", "isPairing", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30426h implements InterfaceC14766b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26750f protocol;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13075p1 _state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC30422d session;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isPairing;

    public /* synthetic */ AbstractC30426h(String str, InterfaceC26750f interfaceC26750f, InterfaceC25614c interfaceC25614c, AbstractC3076z abstractC3076z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC26750f, interfaceC25614c, abstractC3076z);
    }

    @Override // ft0.InterfaceC14766b
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b */
    public final void m93032b() {
        InterfaceC30422d interfaceC30422d = this.session;
        if (interfaceC30422d != null) {
            interfaceC30422d.close();
        }
        AbstractC3006f0.m8714h(this.scope, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC2994c0 getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC30422d getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsPairing() {
        return this.isPairing;
    }

    /* JADX INFO: renamed from: f */
    public final void m93036f(boolean z4) {
        this.isPairing = z4;
    }

    /* JADX INFO: renamed from: g */
    public final void m93037g(InterfaceC30422d interfaceC30422d) {
        this.session = interfaceC30422d;
    }

    @Override // ft0.InterfaceC14766b
    public InterfaceC26750f getProtocol() {
        return this.protocol;
    }

    @Override // ft0.InterfaceC14766b
    public InterfaceC13037f2 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h */
    public final void m93038h(InterfaceC25614c newState) {
        AbstractC22676k.m65750j(newState, "newState");
        C13045h2 c13045h2 = (C13045h2) this._state;
        c13045h2.getClass();
        c13045h2.m36571k(null, newState);
    }

    private AbstractC30426h(String id4, InterfaceC26750f protocol, InterfaceC25614c initialState, AbstractC3076z threadSafeDispatcher) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(protocol, "protocol");
        AbstractC22676k.m65750j(initialState, "initialState");
        AbstractC22676k.m65750j(threadSafeDispatcher, "threadSafeDispatcher");
        this.id = id4;
        this.protocol = protocol;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(initialState);
        this._state = c13045h2M36593c;
        this.state = AbstractC13091v.m36598h(c13045h2M36593c);
        this.scope = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), threadSafeDispatcher).plus(new C2990b0(AbstractC11266d.m30461o("device-", getId()))));
    }
}
