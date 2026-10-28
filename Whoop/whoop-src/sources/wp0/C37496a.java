package wp0;

import java.io.IOException;
import ne3.AbstractC26604b;
import ne3.C26616h;
import ne3.C26617h0;
import ne3.C26641u;
import ne3.InterfaceC26618i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import ud3.C34818h0;

/* JADX INFO: renamed from: wp0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m65681d2 = {"Lwp0/a;", "", "<init>", "()V", "Lud3/v0;", "requestBody", "b", "(Lud3/v0;)Lud3/v0;", "body", "c", "a", "commons_release"}, m65682k = 1, m65683mv = {1, 5, 1}, m65685xi = 48)
public final class C37496a {

    /* JADX INFO: renamed from: a */
    public static final C37496a f160377a = new C37496a();

    /* JADX INFO: renamed from: wp0.a$a */
    @Metadata(m65680d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"wp0/a$a", "Lud3/v0;", "Lud3/h0;", "contentType", "()Lud3/h0;", "", "contentLength", "()J", "Lne3/i;", "sink", "Ll83/a0;", "writeTo", "(Lne3/i;)V", "commons_release"}, m65682k = 1, m65683mv = {1, 5, 1}, m65685xi = 48)
    public static final class a extends AbstractC34846v0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC34846v0 f160378a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C26616h f160379b;

        public a(AbstractC34846v0 abstractC34846v0, C26616h c26616h) {
            this.f160378a = abstractC34846v0;
            this.f160379b = c26616h;
        }

        @Override // ud3.AbstractC34846v0
        public long contentLength() {
            return this.f160379b.f105866x;
        }

        @Override // ud3.AbstractC34846v0
        /* JADX INFO: renamed from: contentType */
        public C34818h0 getContentType() {
            return this.f160378a.getContentType();
        }

        @Override // ud3.AbstractC34846v0
        public void writeTo(InterfaceC26618i sink) throws IOException {
            AbstractC22676k.m65750j(sink, "sink");
            sink.mo79191Q(this.f160379b.m79197X0());
        }
    }

    /* JADX INFO: renamed from: wp0.a$b */
    @Metadata(m65680d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"wp0/a$b", "Lud3/v0;", "Lud3/h0;", "contentType", "()Lud3/h0;", "", "contentLength", "()J", "Lne3/i;", "sink", "Ll83/a0;", "writeTo", "(Lne3/i;)V", "commons_release"}, m65682k = 1, m65683mv = {1, 5, 1}, m65685xi = 48)
    public static final class b extends AbstractC34846v0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC34846v0 f160380a;

        public b(AbstractC34846v0 abstractC34846v0) {
            this.f160380a = abstractC34846v0;
        }

        @Override // ud3.AbstractC34846v0
        public long contentLength() {
            return -1L;
        }

        @Override // ud3.AbstractC34846v0
        /* JADX INFO: renamed from: contentType */
        public C34818h0 getContentType() {
            return this.f160380a.getContentType();
        }

        @Override // ud3.AbstractC34846v0
        public void writeTo(InterfaceC26618i sink) throws IOException {
            AbstractC22676k.m65750j(sink, "sink");
            C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(new C26641u(sink));
            this.f160380a.writeTo(c26617h0M79157b);
            c26617h0M79157b.close();
        }
    }

    private C37496a() {
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC34846v0 m120177b(AbstractC34846v0 requestBody) {
        C26616h c26616h = new C26616h();
        requestBody.writeTo(c26616h);
        return new a(requestBody, c26616h);
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC34846v0 m120178c(AbstractC34846v0 body) {
        return new b(body);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC34846v0 m120179a(AbstractC34846v0 requestBody) {
        AbstractC22676k.m65750j(requestBody, "requestBody");
        return m120177b(m120178c(requestBody));
    }
}
