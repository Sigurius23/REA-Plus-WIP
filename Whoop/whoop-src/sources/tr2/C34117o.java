package tr2;

import androidx.core.app.NotificationCompat;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;

/* JADX INFO: renamed from: tr2.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J5\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J3\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0018J=\u0010\u001d\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ+\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J5\u0010\u001f\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0014J3\u0010 \u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b \u0010\u0018J=\u0010!\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u001aJ+\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0011J5\u0010#\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u0014J3\u0010$\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u0018J=\u0010%\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u001aJ+\u0010&\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0011J5\u0010'\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b'\u0010\u0014J3\u0010(\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0018J=\u0010)\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u001aJ3\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00102R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Ltr2/o;", "Ltr2/n;", "logger", "", "tagPrefix", "", "vEnabled", "<init>", "(Ltr2/n;Ljava/lang/String;Ljava/lang/Boolean;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Z", NotificationCompat.CATEGORY_MESSAGE, "", "Lqr2/a$a;", "tags", "Ll83/a0;", "j", "(Ljava/lang/String;[Lqr2/a$a;)V", "messageTag", "b", "(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V", "", "t", "s", "(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V", "x", "i", "o", "g", "k", "a", "n", "q", "p", "c", "l", "m", "e", "v", "f", "", "priority", "tag", "message", "error", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ltr2/n;", "Ljava/lang/String;", "d", "Ljava/lang/Boolean;", "logging_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34117o implements InterfaceC34116n {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String tagPrefix;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Boolean vEnabled;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34117o(InterfaceC34116n logger, String tagPrefix) {
        this(logger, tagPrefix, null, 4, null);
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(tagPrefix, "tagPrefix");
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: a */
    public void mo85211a(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85223n(this.tagPrefix, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: b */
    public void mo85212b(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85212b(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: c */
    public void mo85213c(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85221l(this.tagPrefix, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: e */
    public void mo85214e(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85214e(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: f */
    public void mo85215f(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85215f(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: g */
    public void mo85216g(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85220k(this.tagPrefix, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: h */
    public void mo85217h(int priority, String tag, String message, Throwable error) {
        AbstractC22676k.m65750j(message, "message");
        this.logger.mo85217h(priority, tag, message, error);
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: i */
    public void mo85218i(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85224o(this.tagPrefix, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: j */
    public void mo85219j(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85212b(this.tagPrefix, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: k */
    public void mo85220k(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85220k(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: l */
    public void mo85221l(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85221l(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: m */
    public void mo85222m(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85214e(this.tagPrefix, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: n */
    public void mo85223n(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85223n(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: o */
    public void mo85224o(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85224o(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: p */
    public void mo85225p(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85225p(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: q */
    public void mo85226q(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85225p(this.tagPrefix, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: s */
    public void mo85227s(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85229u(this.tagPrefix, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: t */
    public void mo85228t(String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85232x(this.tagPrefix, msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: u */
    public void mo85229u(String messageTag, String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85229u(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: v */
    public void mo85230v(String msg, Throwable t14, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(t14, "t");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85215f(this.tagPrefix, msg, t14, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: w */
    public boolean mo85231w() {
        Boolean bool = this.vEnabled;
        return bool != null ? bool.booleanValue() : this.logger.mo85231w();
    }

    @Override // tr2.InterfaceC34116n
    /* JADX INFO: renamed from: x */
    public void mo85232x(String messageTag, String msg, AbstractC30556a.a... tags) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tags, "tags");
        this.logger.mo85232x(AbstractC18489d0.m53370k(this.tagPrefix, ":", messageTag), msg, (AbstractC30556a.a[]) Arrays.copyOf(tags, tags.length));
    }

    public C34117o(InterfaceC34116n logger, String tagPrefix, Boolean bool) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(tagPrefix, "tagPrefix");
        this.logger = logger;
        this.tagPrefix = tagPrefix;
        this.vEnabled = bool;
    }

    public /* synthetic */ C34117o(InterfaceC34116n interfaceC34116n, String str, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34116n, str, (i13 & 4) != 0 ? null : bool);
    }
}
