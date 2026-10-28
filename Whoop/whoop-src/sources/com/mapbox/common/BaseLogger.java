package com.mapbox.common;

import l83.InterfaceC23462h;
import p438qu.InterfaceC30621a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import ru.C31815a;
import ru.C31816b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\tR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lcom/mapbox/common/BaseLogger;", "", "<init>", "()V", "", "tag", "message", "Ll83/a0;", "debug", "(Ljava/lang/String;Ljava/lang/String;)V", "info", "warning", "error", "Lqu/a;", "loggerInstance$delegate", "Ll83/h;", "getLoggerInstance", "()Lqu/a;", "loggerInstance", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class BaseLogger {
    public static final BaseLogger INSTANCE = new BaseLogger();

    /* JADX INFO: renamed from: loggerInstance$delegate, reason: from kotlin metadata */
    private static final InterfaceC23462h loggerInstance = AbstractC30060g.m92088H(BaseLogger$loggerInstance$2.INSTANCE);

    private BaseLogger() {
    }

    public static final void debug(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        INSTANCE.getLoggerInstance().mo16596d(new C31816b(tag), new C31815a(message), null);
    }

    public static final void error(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        INSTANCE.getLoggerInstance().mo16600e(new C31816b(tag), new C31815a(message), null);
    }

    private final InterfaceC30621a getLoggerInstance() {
        return (InterfaceC30621a) loggerInstance.getValue();
    }

    public static final void info(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        INSTANCE.getLoggerInstance().mo16604i(new C31816b(tag), new C31815a(message), null);
    }

    public static final void warning(String tag, String message) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        INSTANCE.getLoggerInstance().mo16612w(new C31816b(tag), new C31815a(message), null);
    }
}
