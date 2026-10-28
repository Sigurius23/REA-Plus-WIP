package a63;

import o63.C27610a;
import o63.C27615f;
import p715kotlin.jvm.internal.AbstractC22676k;
import v53.C35709c;

/* JADX INFO: renamed from: a63.r */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0501r {

    /* JADX INFO: renamed from: a */
    public static final C27610a f1685a = new C27610a("ApplicationPluginRegistry");

    /* JADX INFO: renamed from: a */
    public static final Object m1207a(C35709c c35709c) {
        C0475a c0475a = C0484e0.f1639b;
        AbstractC22676k.m65750j(c35709c, "<this>");
        Object objM1208b = m1208b(c35709c, c0475a);
        if (objM1208b != null) {
            return objM1208b;
        }
        throw new IllegalStateException("Plugin " + c0475a + " is not installed. Consider using `install(" + C0484e0.f1640c + ")` in client config first.");
    }

    /* JADX INFO: renamed from: b */
    public static final Object m1208b(C35709c c35709c, InterfaceC0500q plugin) {
        AbstractC22676k.m65750j(c35709c, "<this>");
        AbstractC22676k.m65750j(plugin, "plugin");
        C27615f c27615f = (C27615f) c35709c.f151929I.m83376d(f1685a);
        if (c27615f != null) {
            return c27615f.m83376d(plugin.getKey());
        }
        return null;
    }
}
