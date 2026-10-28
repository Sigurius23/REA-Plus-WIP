package ib3;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ib3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C18345d {
    /* JADX INFO: renamed from: a */
    public static InputStream m52853a(String path) throws IOException {
        AbstractC22676k.m65750j(path, "path");
        ClassLoader classLoader = C18345d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(path);
        }
        URL resource = classLoader.getResource(path);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
