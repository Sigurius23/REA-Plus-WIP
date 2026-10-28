package ag3;

import j93.InterfaceC21461d;
import java.util.concurrent.ConcurrentHashMap;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ag3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0865a {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f3157a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final String m2111a(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        ConcurrentHashMap concurrentHashMap = f3157a;
        String str = (String) concurrentHashMap.get(interfaceC21461d);
        if (str != null) {
            return str;
        }
        String name = AbstractC21598x.m60663S(interfaceC21461d).getName();
        concurrentHashMap.put(interfaceC21461d, name);
        return name;
    }
}
