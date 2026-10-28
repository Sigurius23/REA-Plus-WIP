package m83;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m83.w */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25269w extends AbstractC25268v {
    /* JADX INFO: renamed from: k0 */
    public static void m74165k0(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m74166l0(List list, Comparator comparator) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
