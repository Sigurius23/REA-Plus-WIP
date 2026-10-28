package p350nw;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: nw.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27189j {

    /* JADX INFO: renamed from: a */
    public static final Map f108839a;

    static {
        HashMap map = new HashMap();
        map.put(C27188i.f108836x, new HashSet(Arrays.asList(EnumC27184e.SIGN, EnumC27184e.VERIFY)));
        map.put(C27188i.f108837y, new HashSet(Arrays.asList(EnumC27184e.ENCRYPT, EnumC27184e.DECRYPT, EnumC27184e.WRAP_KEY, EnumC27184e.UNWRAP_KEY)));
        f108839a = Collections.unmodifiableMap(map);
    }
}
