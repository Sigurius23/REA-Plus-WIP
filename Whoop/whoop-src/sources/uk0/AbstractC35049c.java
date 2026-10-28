package uk0;

import java.util.ArrayList;
import java.util.Arrays;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uk0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00020\u0000\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\u0010\u0006\u001a\u00020\u0000\"\u00020\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "", "values", "", "b", "([J)Ljava/lang/String;", "vals", "", "a", "([J)[Ljava/lang/String;", "connectivity-data-packets-model_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35049c {
    /* JADX INFO: renamed from: a */
    public static final String[] m110787a(long... vals) {
        AbstractC22676k.m65750j(vals, "vals");
        ArrayList arrayList = new ArrayList();
        for (long j7 : vals) {
            arrayList.add(String.valueOf(j7));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: b */
    public static final String m110788b(long... values) {
        AbstractC22676k.m65750j(values, "values");
        return AbstractC25260n.m74028D0(m110787a(Arrays.copyOf(values, values.length)), ".", null, null, null, 62);
    }
}
