package tr2;

import androidx.core.app.NotificationCompat;
import com.whoop.domain.model.event.LoggableEvent;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.joda.time.DateTimeUtils;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;

/* JADX INFO: renamed from: tr2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001a\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J5\u0010\u001c\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0015J3\u0010\u001d\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0019J=\u0010\u001e\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ+\u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J5\u0010 \u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0015J3\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u0019J=\u0010\"\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010\u001bJ+\u0010#\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u0012J5\u0010$\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u0015J3\u0010%\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u0019J=\u0010&\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u001bJ+\u0010'\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010\u0012J5\u0010\u0005\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b\u0005\u0010\u0015J3\u0010(\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0019J=\u0010)\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\u001bJ3\u0010/\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\f2\u0006\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000201058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00106R\u001c\u00109\u001a\b\u0012\u0004\u0012\u0002010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00108R\u0014\u0010=\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006?"}, m65681d2 = {"Ltr2/e;", "Ltr2/n;", "<init>", "()V", "Lcom/whoop/domain/model/event/LoggableEvent;", "e", "Ll83/a0;", "A", "(Lcom/whoop/domain/model/event/LoggableEvent;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Z", "", NotificationCompat.CATEGORY_MESSAGE, "", "Lqr2/a$a;", "tags", "j", "(Ljava/lang/String;[Lqr2/a$a;)V", "messageTag", "b", "(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V", "", "t", "s", "(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "x", "i", "o", "g", "k", "a", "n", "q", "p", "c", "l", "m", "v", "f", "", "priority", "tag", "message", "error", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ltr2/k;", "listener", "y", "(Ltr2/k;)V", "", "Ljava/util/Set;", "listeners", "[Ltr2/k;", "listenerArray", "", "z", "()J", "time", "d", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34107e implements InterfaceC34116n {

    /* JADX INFO: renamed from: e */
    private static final InterfaceC34113k[] f143010e = new InterfaceC34113k[0];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<InterfaceC34113k> listeners = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private volatile InterfaceC34113k[] listenerArray = f143010e;

    /* JADX INFO: renamed from: A */
    private final void m107804A(LoggableEvent e5) {
        for (InterfaceC34113k interfaceC34113k : this.listenerArray) {
            interfaceC34113k.mo107800a(e5);
        }
    }

    /* JADX INFO: renamed from: z */
    private final long m107805z() {
        return DateTimeUtils.currentTimeMillis();
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: a */
    public void mo85211a(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        mo85223n(null, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: b */
    public void mo85212b(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        m107804A(new LoggableEvent(1, messageTag, msg, null, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: c */
    public void mo85213c(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        mo85221l(null, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: e */
    public void mo85214e(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        m107804A(new LoggableEvent(16, messageTag, msg, null, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: f */
    public void mo85215f(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        m107804A(new LoggableEvent(16, messageTag, msg, t14, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: g */
    public void mo85216g(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        mo85220k(null, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: h */
    public void mo85217h(int priority, String tag, String message, Throwable error) {
        AbstractC22676k.m65750j(message, "message");
        int i13 = 16;
        switch (priority) {
            case 2:
                i13 = 1;
                break;
            case 3:
                i13 = 2;
                break;
            case 4:
                i13 = 4;
                break;
            case 5:
                i13 = 8;
                break;
        }
        m107804A(new LoggableEvent(i13, tag, message, error, m107805z(), new AbstractC30556a.a[0]));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: i */
    public void mo85218i(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        mo85224o(null, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: j */
    public void mo85219j(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        mo85212b(null, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: k */
    public void mo85220k(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        m107804A(new LoggableEvent(4, messageTag, msg, null, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: l */
    public void mo85221l(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        m107804A(new LoggableEvent(8, messageTag, msg, t14, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: m */
    public void mo85222m(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        mo85214e(null, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: n */
    public void mo85223n(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        m107804A(new LoggableEvent(4, messageTag, msg, t14, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: o */
    public void mo85224o(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        m107804A(new LoggableEvent(2, messageTag, msg, t14, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: p */
    public void mo85225p(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        m107804A(new LoggableEvent(8, messageTag, msg, null, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: q */
    public void mo85226q(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        mo85225p(null, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: s */
    public void mo85227s(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        mo85229u(null, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: t */
    public void mo85228t(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        mo85232x(null, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: u */
    public void mo85229u(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        m107804A(new LoggableEvent(1, messageTag, msg, t14, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: v */
    public void mo85230v(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        mo85215f(null, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
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
        m107804A(new LoggableEvent(2, messageTag, msg, null, m107805z(), (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length)));
    }

    /* JADX INFO: renamed from: y */
    public final void m107806y(InterfaceC34113k listener) {
        AbstractC22676k.m65750j(listener, "listener");
        synchronized (this.listeners) {
            this.listeners.add(listener);
            this.listenerArray = (InterfaceC34113k[]) this.listeners.toArray(new InterfaceC34113k[0]);
        }
    }
}
