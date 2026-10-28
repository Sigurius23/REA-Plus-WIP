package w02;

import com.whoop.network.exception.DeserializationException;
import io.ktor.client.plugins.ResponseException;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.SerializationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import retrofit2.HttpException;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: w02.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "e", "", "baseMessage", "Ltr2/n;", "log", "Lrr2/c;", "crashReporter", "a", "(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;", "network_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36685b {
    /* JADX INFO: renamed from: a */
    public static final String m117759a(Throwable e5, String baseMessage, InterfaceC34116n log, InterfaceC31766c interfaceC31766c) {
        AbstractC22676k.m65750j(e5, "e");
        AbstractC22676k.m65750j(baseMessage, "baseMessage");
        AbstractC22676k.m65750j(log, "log");
        String strConcat = AbstractC39414r.m125890i0(baseMessage) ? "" : baseMessage.concat(":");
        if (e5 instanceof CancellationException) {
            String string = AbstractC39414r.m125869O0(strConcat + " request cancelled, likely due to user navigation").toString();
            log.mo85222m(string, new AbstractC30556a.a[0]);
            return string;
        }
        if (e5 instanceof HttpException) {
            String string2 = AbstractC39414r.m125869O0(strConcat + " " + e5.getMessage()).toString();
            log.mo85222m(string2, new AbstractC30556a.a[0]);
            return string2;
        }
        if (e5 instanceof ResponseException) {
            String string3 = AbstractC39414r.m125869O0(strConcat + " " + ((ResponseException) e5).f74974w.mo13325e()).toString();
            log.mo85222m(string3, new AbstractC30556a.a[0]);
            return string3;
        }
        if (e5 instanceof IOException) {
            String message = e5.getMessage();
            String string4 = AbstractC39414r.m125869O0(strConcat + " Network IO error " + (message != null ? message : "")).toString();
            log.mo85222m(string4, new AbstractC30556a.a[0]);
            return string4;
        }
        if (e5 instanceof NullPointerException) {
            String string5 = AbstractC39414r.m125869O0(strConcat + " deserialization error").toString();
            log.mo85230v(string5, e5, new AbstractC30556a.a[0]);
            if (interfaceC31766c != null) {
                InterfaceC31766c.m98634e(interfaceC31766c, e5, null, 2, null);
            }
            return string5;
        }
        if (e5 instanceof DeserializationException) {
            String string6 = AbstractC39414r.m125869O0(strConcat + " deserialization error (" + ((DeserializationException) e5).getMessage() + ")").toString();
            log.mo85230v(string6, e5, new AbstractC30556a.a[0]);
            if (interfaceC31766c != null) {
                InterfaceC31766c.m98634e(interfaceC31766c, e5, null, 2, null);
            }
            return string6;
        }
        if (!(e5 instanceof SerializationException)) {
            String string7 = AbstractC39414r.m125869O0(strConcat + " unknown error").toString();
            log.mo85230v(string7, e5, new AbstractC30556a.a[0]);
            return string7;
        }
        String string8 = AbstractC39414r.m125869O0(strConcat + " kotlinx.serialization error (" + e5.getMessage() + ")").toString();
        log.mo85230v(string8, e5, new AbstractC30556a.a[0]);
        if (interfaceC31766c != null) {
            interfaceC31766c.mo98631p(e5);
        }
        return string8;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m117760b(Throwable th3, String str, InterfaceC34116n interfaceC34116n, InterfaceC31766c interfaceC31766c, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "";
        }
        if ((i13 & 8) != 0) {
            interfaceC31766c = null;
        }
        return m117759a(th3, str, interfaceC34116n, interfaceC31766c);
    }
}
