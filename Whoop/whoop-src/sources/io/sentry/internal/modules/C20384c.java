package io.sentry.internal.modules;

import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p097ds.AbstractC12314q;

/* JADX INFO: renamed from: io.sentry.internal.modules.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20384c extends AbstractC20385d {

    /* JADX INFO: renamed from: e */
    public final Pattern f76431e;

    /* JADX INFO: renamed from: f */
    public final Pattern f76432f;

    /* JADX INFO: renamed from: g */
    public final ClassLoader f76433g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20384c(InterfaceC20602v0 interfaceC20602v0) {
        super(interfaceC20602v0);
        ClassLoader classLoader = C20384c.class.getClassLoader();
        this.f76431e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f76432f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f76433g = AbstractC12314q.m34337q(classLoader);
    }

    @Override // io.sentry.internal.modules.AbstractC20385d
    /* JADX INFO: renamed from: b */
    public final Map mo55973b() {
        HashMap map = new HashMap();
        ArrayList<C20383b> arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f76433g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.f76431e.matcher(resources.nextElement().toString());
                C20383b c20383b = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.f76432f.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        c20383b = new C20383b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (c20383b != null) {
                    arrayList.add(c20383b);
                }
            }
        } catch (Throwable th3) {
            this.f76435a.mo16060j(EnumC20436n5.ERROR, "Unable to detect modules via manifest files.", th3);
        }
        for (C20383b c20383b2 : arrayList) {
            map.put(c20383b2.f76429a, c20383b2.f76430b);
        }
        return map;
    }
}
