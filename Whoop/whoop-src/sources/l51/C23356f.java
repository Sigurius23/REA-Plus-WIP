package l51;

import e93.AbstractC12889b;
import p329n0.C26068u;
import p390p1.C28621h1;
import p390p1.InterfaceC28593a1;
import p492t2.InterfaceC33313a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l51.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Ll51/f;", "", "Ln0/u;", "listState", "Lt2/a;", "nestedScrollConnection", "Lp1/a1;", "consumedOffsetPx", "", "maxConsumePx", "<init>", "(Ln0/u;Lt2/a;Lp1/a1;I)V", "Ll51/g;", "base", "a", "(Ll51/g;)Ll51/g;", "Ln0/u;", "c", "()Ln0/u;", "b", "Lt2/a;", "d", "()Lt2/a;", "Lp1/a1;", "I", "", "()F", "collapseProgress", "", "e", "()Z", "isCollapsed", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23356f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C26068u listState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC33313a nestedScrollConnection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28593a1 consumedOffsetPx;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int maxConsumePx;

    public C23356f(C26068u listState, InterfaceC33313a nestedScrollConnection, InterfaceC28593a1 consumedOffsetPx, int i13) {
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(nestedScrollConnection, "nestedScrollConnection");
        AbstractC22676k.m65750j(consumedOffsetPx, "consumedOffsetPx");
        this.listState = listState;
        this.nestedScrollConnection = nestedScrollConnection;
        this.consumedOffsetPx = consumedOffsetPx;
        this.maxConsumePx = i13;
    }

    /* JADX INFO: renamed from: a */
    public final C23357g m67621a(C23357g base) {
        AbstractC22676k.m65750j(base, "base");
        return C23357g.m67632i(base, null, null, null, null, null, null, false, m67625e(), Float.valueOf(m67622b()), 127, null);
    }

    /* JADX INFO: renamed from: b */
    public final float m67622b() {
        return AbstractC12889b.m36283m(((C28621h1) this.consumedOffsetPx).m87024x() / this.maxConsumePx, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C26068u getListState() {
        return this.listState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC33313a getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m67625e() {
        return m67622b() >= 0.99f;
    }
}
