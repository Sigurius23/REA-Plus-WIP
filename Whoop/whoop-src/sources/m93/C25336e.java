package m93;

import java.util.Arrays;
import java.util.Map;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C25336e implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C25336e f99362w = new C25336e();

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        AbstractC22676k.m65750j(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            AbstractC22676k.m65749i(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            AbstractC22676k.m65749i(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            AbstractC22676k.m65749i(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            AbstractC22676k.m65749i(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            AbstractC22676k.m65749i(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            AbstractC22676k.m65749i(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            AbstractC22676k.m65749i(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            AbstractC22676k.m65749i(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            AbstractC22676k.m65749i(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return AbstractC11895b.m31992k('=', str, string);
    }
}
