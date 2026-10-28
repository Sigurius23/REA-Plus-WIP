package ms;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import io.sentry.okhttp.C20450b;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import ls.C24704a;
import ls.C24706c;
import ls.C24707d;
import p075ct.C11105a;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: ms.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25925a {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f102385a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f102386b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f102387c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f102388d;

    /* JADX INFO: renamed from: e */
    public static final Map f102389e;

    /* JADX INFO: renamed from: f */
    public static final Map f102390f;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.AesSivKey");
        f102385a = new C5085d0(C24707d.class, new C20450b(14));
        f102386b = new C5081b0(c11105aM16079c, new C20450b(15));
        f102387c = new C5102m(C24704a.class, new C20450b(16));
        f102388d = new C5098k(c11105aM16079c, new C20450b(17));
        HashMap map = new HashMap();
        C24706c c24706c = C24706c.f96633d;
        EnumC36362h4 enumC36362h4 = EnumC36362h4.RAW;
        map.put(c24706c, enumC36362h4);
        C24706c c24706c2 = C24706c.f96631b;
        EnumC36362h4 enumC36362h5 = EnumC36362h4.TINK;
        map.put(c24706c2, enumC36362h5);
        C24706c c24706c3 = C24706c.f96632c;
        EnumC36362h4 enumC36362h6 = EnumC36362h4.CRUNCHY;
        map.put(c24706c3, enumC36362h6);
        f102389e = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(EnumC36362h4.class);
        enumMap.put(enumC36362h4, c24706c);
        enumMap.put(enumC36362h5, c24706c2);
        enumMap.put(enumC36362h6, c24706c3);
        enumMap.put(EnumC36362h4.LEGACY, c24706c3);
        f102390f = Collections.unmodifiableMap(enumMap);
    }

    /* JADX INFO: renamed from: a */
    public static EnumC36362h4 m76684a(C24706c c24706c) {
        Map map = f102389e;
        if (map.containsKey(c24706c)) {
            return (EnumC36362h4) map.get(c24706c);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c24706c);
    }

    /* JADX INFO: renamed from: b */
    public static C24706c m76685b(EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        Map map = f102390f;
        if (map.containsKey(enumC36362h4)) {
            return (C24706c) map.get(enumC36362h4);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
    }
}
