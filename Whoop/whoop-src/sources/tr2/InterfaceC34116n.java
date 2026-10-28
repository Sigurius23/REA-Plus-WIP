package tr2;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import or2.C28161f1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;

/* JADX INFO: renamed from: tr2.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0014\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u0011\u0010\fJ5\u0010\u0016\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u0016\u0010\u000fJ3\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u0017\u0010\u0013J=\u0010\u0018\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u0018\u0010\u0015J+\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u0019\u0010\fJ5\u0010\u001a\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u001a\u0010\u000fJ3\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u001b\u0010\u0013J=\u0010\u001c\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u001c\u0010\u0015J+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u001d\u0010\fJ5\u0010\u001e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u001e\u0010\u000fJ3\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\u001f\u0010\u0013J=\u0010 \u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b \u0010\u0015J+\u0010!\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b!\u0010\fJ5\u0010\"\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b\"\u0010\u000fJ3\u0010#\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b#\u0010\u0013J=\u0010$\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH&¢\u0006\u0004\b$\u0010\u0015J3\u0010*\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b*\u0010+¨\u0006,À\u0006\u0003"}, m65681d2 = {"Ltr2/n;", "", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Z", "", NotificationCompat.CATEGORY_MESSAGE, "", "Lqr2/a$a;", "tags", "Ll83/a0;", "j", "(Ljava/lang/String;[Lqr2/a$a;)V", "messageTag", "b", "(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V", "", "t", "s", "(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "x", "i", "o", "g", "k", "a", "n", "q", "p", "c", "l", "m", "e", "v", "f", "", "priority", "tag", "message", "error", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "logging_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC34116n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f143026a;

    /* JADX INFO: renamed from: tr2.n$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Ltr2/n$a;", "", "<init>", "()V", "", "tag", "Ltr2/n;", "a", "(Ljava/lang/String;)Ltr2/n;", "", "vEnabled", "b", "(Ljava/lang/String;Z)Ltr2/n;", "Ltr2/n;", "c", "()Ltr2/n;", "d", "(Ltr2/n;)V", "logger", "logging_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f143026a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static InterfaceC34116n logger = C28161f1.f113863b;

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC34116n m107848a(String tag) {
            AbstractC22676k.m65750j(tag, "tag");
            return new C34117o(logger, tag, null, 4, null);
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC34116n m107849b(String tag, boolean vEnabled) {
            AbstractC22676k.m65750j(tag, "tag");
            return new C34117o(logger, tag, Boolean.valueOf(vEnabled));
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC34116n m107850c() {
            return logger;
        }

        /* JADX INFO: renamed from: d */
        public final void m107851d(InterfaceC34116n interfaceC34116n) {
            AbstractC22676k.m65750j(interfaceC34116n, "<set-?>");
            logger = interfaceC34116n;
        }
    }

    /* JADX INFO: renamed from: d */
    static InterfaceC34116n m107846d(String str) {
        return INSTANCE.m107848a(str);
    }

    /* JADX INFO: renamed from: r */
    static InterfaceC34116n m107847r(String str, boolean z4) {
        return INSTANCE.m107849b(str, z4);
    }

    /* JADX INFO: renamed from: a */
    void mo85211a(String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: b */
    void mo85212b(String messageTag, String msg, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: c */
    void mo85213c(String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: e */
    void mo85214e(String messageTag, String msg, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: f */
    void mo85215f(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: g */
    void mo85216g(String msg, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: h */
    void mo85217h(int priority, String tag, String message, Throwable error);

    /* JADX INFO: renamed from: i */
    void mo85218i(String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: j */
    void mo85219j(String msg, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: k */
    void mo85220k(String messageTag, String msg, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: l */
    void mo85221l(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: m */
    void mo85222m(String msg, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: n */
    void mo85223n(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: o */
    void mo85224o(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: p */
    void mo85225p(String messageTag, String msg, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: q */
    void mo85226q(String msg, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: s */
    void mo85227s(String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: t */
    void mo85228t(String msg, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: u */
    void mo85229u(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: v */
    void mo85230v(String msg, Throwable t14, AbstractC30556a.a... tags);

    /* JADX INFO: renamed from: w */
    boolean mo85231w();

    /* JADX INFO: renamed from: x */
    void mo85232x(String messageTag, String msg, AbstractC30556a.a... tags);
}
