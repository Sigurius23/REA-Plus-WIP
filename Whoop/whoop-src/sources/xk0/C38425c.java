package xk0;

import io.ktor.client.plugins.ResponseException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlinx.serialization.SerializationException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pm0.InterfaceC29354a;
import retrofit2.HttpException;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: xk0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lxk0/c;", "", "<init>", "()V", "", "statusCode", "Lxk0/d;", "d", "(I)Lxk0/d;", "Lpm0/a$b;", "error", "b", "(Lpm0/a$b;)Lxk0/d;", "Lu02/a$b;", "c", "(Lu02/a$b;)Lxk0/d;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "a", "(Ljava/lang/Exception;)Lxk0/d;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38425c {

    /* JADX INFO: renamed from: a */
    public static final C38425c f164569a = new C38425c();

    private C38425c() {
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC38426d m123100d(int statusCode) {
        if (statusCode == 401) {
            return AbstractC38426d.g.f164575b;
        }
        if (statusCode == 429) {
            return AbstractC38426d.d.f164573b;
        }
        if (400 > statusCode || statusCode >= 500) {
            return (500 > statusCode || statusCode >= 600) ? AbstractC38426d.h.f164576b : new AbstractC38426d.e(statusCode);
        }
        return new AbstractC38426d.a(statusCode);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC38426d m123101a(Exception exception) {
        AbstractC22676k.m65750j(exception, "exception");
        if (exception instanceof SerializationException) {
            return AbstractC38426d.c.f164572b;
        }
        if (exception instanceof HttpException) {
            return m123100d(((HttpException) exception).f128920w);
        }
        if (exception instanceof ResponseException) {
            return m123100d(((ResponseException) exception).f74974w.mo13325e().f70530a);
        }
        if (exception instanceof SocketTimeoutException) {
            return AbstractC38426d.f.f164574b;
        }
        if (!(exception instanceof ConnectException) && !(exception instanceof UnknownHostException) && !(exception instanceof IOException)) {
            return AbstractC38426d.h.f164576b;
        }
        return AbstractC38426d.b.f164571b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC38426d m123102b(InterfaceC29354a.b<?> error) {
        AbstractC22676k.m65750j(error, "error");
        return m123100d(error.getHttpStatusCode());
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC38426d m123103c(InterfaceC34385a.b<?> error) {
        AbstractC22676k.m65750j(error, "error");
        if (error instanceof InterfaceC34385a.b.a.C42431a) {
            return AbstractC38426d.c.f164572b;
        }
        if (error instanceof InterfaceC34385a.b.a) {
            return m123100d(((InterfaceC34385a.b.a) error).getErrorCode());
        }
        if (error instanceof InterfaceC34385a.b.C42432b) {
            return m123101a(((InterfaceC34385a.b.C42432b) error).getException());
        }
        throw new NoWhenBranchMatchedException();
    }
}
