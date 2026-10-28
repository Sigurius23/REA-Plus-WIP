package zd3;

import java.net.Proxy;

/* JADX INFO: renamed from: zd3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC40558b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f174646a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f174646a = iArr;
    }
}
