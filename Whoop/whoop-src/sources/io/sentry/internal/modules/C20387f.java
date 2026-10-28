package io.sentry.internal.modules;

import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p097ds.AbstractC12314q;

/* JADX INFO: renamed from: io.sentry.internal.modules.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20387f extends AbstractC20385d {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f76439e = 0;

    /* JADX INFO: renamed from: f */
    public final Object f76440f;

    public C20387f(List list, InterfaceC20602v0 interfaceC20602v0) {
        super(interfaceC20602v0);
        this.f76440f = list;
    }

    @Override // io.sentry.internal.modules.AbstractC20385d
    /* JADX INFO: renamed from: b */
    public final Map mo55973b() {
        switch (this.f76439e) {
            case 0:
                InterfaceC20602v0 interfaceC20602v0 = this.f76435a;
                TreeMap treeMap = new TreeMap();
                try {
                    InputStream resourceAsStream = ((ClassLoader) this.f76440f).getResourceAsStream("sentry-external-modules.txt");
                    try {
                        if (resourceAsStream == null) {
                            interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "%s file was not found.", "sentry-external-modules.txt");
                            if (resourceAsStream != null) {
                                resourceAsStream.close();
                            }
                        } else {
                            TreeMap treeMapM56603c = m56603c(resourceAsStream);
                            resourceAsStream.close();
                            treeMap = treeMapM56603c;
                        }
                    } catch (Throwable th3) {
                        if (resourceAsStream != null) {
                            try {
                                resourceAsStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            break;
                        }
                        throw th3;
                    }
                    break;
                } catch (IOException e5) {
                    interfaceC20602v0.mo16060j(EnumC20436n5.INFO, "Access to resources failed.", e5);
                } catch (SecurityException e13) {
                    interfaceC20602v0.mo16060j(EnumC20436n5.INFO, "Access to resources denied.", e13);
                }
                return treeMap;
            default:
                TreeMap treeMap2 = new TreeMap();
                Iterator it = ((List) this.f76440f).iterator();
                while (it.hasNext()) {
                    Map mapMo56602a = ((InterfaceC20382a) it.next()).mo56602a();
                    if (mapMo56602a != null) {
                        treeMap2.putAll(mapMo56602a);
                    }
                }
                return treeMap2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20387f(InterfaceC20602v0 interfaceC20602v0) {
        super(interfaceC20602v0);
        ClassLoader classLoader = C20387f.class.getClassLoader();
        this.f76440f = AbstractC12314q.m34337q(classLoader);
    }
}
