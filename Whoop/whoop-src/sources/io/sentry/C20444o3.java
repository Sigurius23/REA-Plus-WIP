package io.sentry;

import io.sentry.protocol.C20501v;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.o3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20444o3 {

    /* JADX INFO: renamed from: a */
    public final C20501v f76526a;

    /* JADX INFO: renamed from: b */
    public final C20501v f76527b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f76528c;

    /* JADX INFO: renamed from: d */
    public final File f76529d;

    /* JADX INFO: renamed from: e */
    public final double f76530e;

    /* JADX INFO: renamed from: f */
    public final String f76531f = "android";

    public C20444o3(C20501v c20501v, C20501v c20501v2, Map map, File file, AbstractC20576u4 abstractC20576u4) {
        this.f76526a = c20501v;
        this.f76527b = c20501v2;
        this.f76528c = new ConcurrentHashMap(map);
        this.f76529d = file;
        this.f76530e = abstractC20576u4.mo56606d() / 1.0E9d;
    }
}
