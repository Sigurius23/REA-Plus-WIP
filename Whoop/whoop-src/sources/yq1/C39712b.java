package yq1;

import android.content.Context;
import com.whoop.data.repositories.C6656c;
import io.sentry.AbstractC20445o4;
import io.sentry.C20456p2;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.InterfaceC20435n4;
import io.sentry.android.core.AbstractC20069d1;
import io.sentry.android.core.AbstractC20118j0;
import io.sentry.android.core.C20073f;
import io.sentry.android.core.C20156t;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yq1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lyq1/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/sentry/n4;", "Lio/sentry/android/core/SentryAndroidOptions;", "configuration", "Ll83/a0;", "a", "(Landroid/content/Context;Lio/sentry/n4;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39712b {
    /* JADX INFO: renamed from: a */
    public final void m127088a(Context context, InterfaceC20435n4 configuration) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(configuration, "configuration");
        C20156t c20156t = new C20156t(3);
        try {
            C20535s c20535sM56711a = AbstractC20069d1.f75386b.m56711a();
            try {
                AbstractC20445o4.m56639c(new C20456p2(), new C20073f(c20156t, context, configuration));
                InterfaceC20308d1 interfaceC20308d1M56638b = AbstractC20445o4.m56638b();
                if (AbstractC20118j0.m56013g()) {
                    if (interfaceC20308d1M56638b.mo56432l().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        interfaceC20308d1M56638b.mo56439s(new C6656c(atomicBoolean, 7));
                        if (!atomicBoolean.get()) {
                            interfaceC20308d1M56638b.mo56441u();
                        }
                    }
                    interfaceC20308d1M56638b.mo56432l().getReplayController().mo56102x();
                }
                c20535sM56711a.close();
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IllegalAccessException e5) {
            c20156t.mo16060j(EnumC20436n5.FATAL, "Fatal error during SentryAndroid.init(...)", e5);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e5);
        } catch (InstantiationException e13) {
            c20156t.mo16060j(EnumC20436n5.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        } catch (NoSuchMethodException e14) {
            c20156t.mo16060j(EnumC20436n5.FATAL, "Fatal error during SentryAndroid.init(...)", e14);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e14);
        } catch (InvocationTargetException e15) {
            c20156t.mo16060j(EnumC20436n5.FATAL, "Fatal error during SentryAndroid.init(...)", e15);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e15);
        }
    }
}
