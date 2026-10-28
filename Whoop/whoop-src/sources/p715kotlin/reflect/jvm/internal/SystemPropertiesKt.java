package p715kotlin.reflect.jvm.internal;

import l83.C23467m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m65681d2 = {"useK1Implementation", "", "getUseK1Implementation", "()Z", "loadMetadataDirectly", "getLoadMetadataDirectly", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SystemPropertiesKt {
    private static final boolean loadMetadataDirectly;
    private static final boolean useK1Implementation;

    static {
        Object objM107888l;
        Object objM107888l2;
        try {
            objM107888l = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        String str = (String) objM107888l;
        boolean z4 = false;
        useK1Implementation = str != null && Boolean.parseBoolean(str);
        try {
            objM107888l2 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th4) {
            objM107888l2 = AbstractC34132o.m107888l(th4);
        }
        String str2 = (String) (objM107888l2 instanceof C23467m ? null : objM107888l2);
        if (str2 != null && Boolean.parseBoolean(str2)) {
            z4 = true;
        }
        loadMetadataDirectly = z4;
    }

    public static final boolean getLoadMetadataDirectly() {
        return loadMetadataDirectly;
    }

    public static final boolean getUseK1Implementation() {
        return useK1Implementation;
    }
}
