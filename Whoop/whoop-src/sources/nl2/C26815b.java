package nl2;

import al2.AbstractC0988d;
import com.whoop.design.util.AbstractC8693b;
import gy0.AbstractC16277f;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import p715kotlin.Metadata;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;

/* JADX INFO: renamed from: nl2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lnl2/b;", "", "<init>", "()V", "Lsz0/q0;", "b", "Lsz0/q0;", "a", "()Lsz0/q0;", "loading", "c", "saving", "d", "e", "success", "networkError", "f", "serverError", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26815b {

    /* JADX INFO: renamed from: a */
    public static final C26815b f106900a = new C26815b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C33211q0 loading = new C33211q0(null, AbstractC33208p0.c.f138471e, null, null, null, false, false, null, false, false, 1021, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C33211q0 saving = new C33211q0(null, AbstractC33208p0.f.f138478e, null, null, null, false, false, null, false, false, 1021, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C33211q0 success = new C33211q0(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC0988d.f3668W), 0, null, 6, null), AbstractC8693b.m21277k(AbstractC0988d.f3669X), null, null, false, false, null, false, false, MessageListItemViewType.START_OF_THE_CHANNEL, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C33211q0 networkError = new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC0988d.f3685g0), false, null, 6, null), AbstractC8693b.m21277k(AbstractC0988d.f3664S), null, AbstractC8693b.m21277k(AbstractC0988d.f3670Y), true, false, AbstractC8693b.m21277k(AbstractC0988d.f3674b), false, false, 841, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C33211q0 serverError = new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC0988d.f3687h0), false, null, 6, null), AbstractC8693b.m21277k(AbstractC16277f.f62259L1), null, AbstractC8693b.m21277k(AbstractC16277f.f62292W1), true, false, AbstractC8693b.m21277k(AbstractC0988d.f3676c), false, false, 841, null);

    /* JADX INFO: renamed from: g */
    public static final int f106906g = C33211q0.f138501k;

    private C26815b() {
    }

    /* JADX INFO: renamed from: a */
    public final C33211q0 m79999a() {
        return loading;
    }

    /* JADX INFO: renamed from: b */
    public final C33211q0 m80000b() {
        return networkError;
    }

    /* JADX INFO: renamed from: c */
    public final C33211q0 m80001c() {
        return saving;
    }

    /* JADX INFO: renamed from: d */
    public final C33211q0 m80002d() {
        return serverError;
    }

    /* JADX INFO: renamed from: e */
    public final C33211q0 m80003e() {
        return success;
    }
}
