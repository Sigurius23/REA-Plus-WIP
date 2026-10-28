package or2;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.f1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0016\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ5\u0010\u0018\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J3\u0010\u0019\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0015J=\u0010\u001a\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0017J+\u0010\u001b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u000eJ5\u0010\u001c\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J3\u0010\u001d\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0015J=\u0010\u001e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u0017J+\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ5\u0010 \u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0011J3\u0010!\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u0015J=\u0010\"\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0017J+\u0010#\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000eJ5\u0010$\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u0011J3\u0010%\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u0015J=\u0010&\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u0017J3\u0010,\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010\u00072\u0006\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lor2/f1;", "Ltr2/n;", "<init>", "()V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Z", "", NotificationCompat.CATEGORY_MESSAGE, "", "Lqr2/a$a;", "tags", "Ll83/a0;", "j", "(Ljava/lang/String;[Lqr2/a$a;)V", "messageTag", "b", "(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V", "", "t", "s", "(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "x", "i", "o", "g", "k", "a", "n", "q", "p", "c", "l", "m", "e", "v", "f", "", "priority", "tag", "message", "error", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "logging_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28161f1 implements InterfaceC34116n {

    /* JADX INFO: renamed from: b */
    public static final C28161f1 f113863b = new C28161f1();

    private C28161f1() {
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: a */
    public void mo85211a(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: b */
    public void mo85212b(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: c */
    public void mo85213c(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: e */
    public void mo85214e(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: f */
    public void mo85215f(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: g */
    public void mo85216g(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: h */
    public void mo85217h(int priority, String tag, String message, Throwable error) {
        AbstractC22676k.m65750j(message, "message");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: i */
    public void mo85218i(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: j */
    public void mo85219j(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: k */
    public void mo85220k(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: l */
    public void mo85221l(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: m */
    public void mo85222m(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: n */
    public void mo85223n(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: o */
    public void mo85224o(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: p */
    public void mo85225p(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: q */
    public void mo85226q(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: s */
    public void mo85227s(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: t */
    public void mo85228t(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: u */
    public void mo85229u(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: v */
    public void mo85230v(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: w */
    public boolean mo85231w() {
        return false;
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: x */
    public void mo85232x(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
    }
}
