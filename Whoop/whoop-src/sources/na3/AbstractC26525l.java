package na3;

import bi.C3278p;
import com.mapbox.common.HttpHeaders;
import io.sentry.internal.debugmeta.C20378c;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: na3.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC26525l {

    /* JADX INFO: renamed from: a */
    public static final C26517d f105448a = new C26517d(EnumC26520g.f105436x, false);

    /* JADX INFO: renamed from: b */
    public static final C26517d f105449b;

    /* JADX INFO: renamed from: c */
    public static final C26517d f105450c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f105451d;

    static {
        EnumC26520g enumC26520g = EnumC26520g.f105437y;
        f105449b = new C26517d(enumC26520g, false);
        f105450c = new C26517d(enumC26520g, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        C3278p c3278p = new C3278p(2);
        new C20378c(c3278p, "java/util/".concat("Iterator")).m56588q("forEachRemaining", null, new C26522i(strConcat4, 0));
        new C20378c(c3278p, "java/lang/".concat("Iterable")).m56588q("spliterator", null, new C26527n(4));
        C20378c c20378c = new C20378c(c3278p, "java/util/".concat("Collection"));
        c20378c.m56588q("removeIf", null, new C26522i(strConcat2, 17));
        c20378c.m56588q("stream", null, new C26522i(strConcat8, 26));
        c20378c.m56588q("parallelStream", null, new C26524k(strConcat8, 1));
        C20378c c20378c2 = new C20378c(c3278p, "java/util/".concat("List"));
        c20378c2.m56588q("replaceAll", null, new C26524k(strConcat7, 2));
        c20378c2.m56588q("addFirst", "2.1", new C26524k(strConcat, 3));
        c20378c2.m56588q("addLast", "2.1", new C26524k(strConcat, 4));
        c20378c2.m56588q("removeFirst", "2.1", new C26524k(strConcat, 5));
        c20378c2.m56588q("removeLast", "2.1", new C26524k(strConcat, 6));
        C20378c c20378c3 = new C20378c(c3278p, "java/util/".concat("LinkedList"));
        c20378c3.m56588q("addFirst", "2.1", new C26522i(strConcat, 1));
        c20378c3.m56588q("addLast", "2.1", new C26522i(strConcat, 2));
        c20378c3.m56588q("removeFirst", "2.1", new C26522i(strConcat, 3));
        c20378c3.m56588q("removeLast", "2.1", new C26522i(strConcat, 4));
        C20378c c20378c4 = new C20378c(c3278p, "java/util/".concat("LinkedHashSet"));
        c20378c4.m56588q("addFirst", "2.2", new C26522i(strConcat, 5));
        c20378c4.m56588q("addLast", "2.2", new C26522i(strConcat, 6));
        c20378c4.m56588q("removeFirst", "2.2", new C26522i(strConcat, 7));
        c20378c4.m56588q("removeLast", "2.2", new C26522i(strConcat, 8));
        c20378c4.m56588q("getFirst", "2.2", new C26522i(strConcat, 9));
        c20378c4.m56588q("getLast", "2.2", new C26522i(strConcat, 10));
        C20378c c20378c5 = new C20378c(c3278p, "java/util/".concat("Map"));
        c20378c5.m56588q("forEach", null, new C26522i(strConcat6, 11));
        c20378c5.m56588q("putIfAbsent", null, new C26522i(strConcat, 12));
        c20378c5.m56588q("replace", null, new C26522i(strConcat, 13));
        c20378c5.m56588q("replace", null, new C26522i(strConcat, 14));
        c20378c5.m56588q("replaceAll", null, new C26522i(strConcat5, 15));
        c20378c5.m56588q("compute", null, new C26523j(strConcat, strConcat5, 0));
        c20378c5.m56588q("computeIfAbsent", null, new C26523j(strConcat, strConcat3, 1));
        c20378c5.m56588q("computeIfPresent", null, new C26523j(strConcat, strConcat5, 2));
        c20378c5.m56588q("merge", null, new C26523j(strConcat, strConcat5, 3));
        C20378c c20378c6 = new C20378c(c3278p, "java/util/".concat("LinkedHashMap"));
        c20378c6.m56588q("putFirst", "2.2", new C26522i(strConcat, 16));
        c20378c6.m56588q("putLast", "2.2", new C26522i(strConcat, 18));
        C20378c c20378c7 = new C20378c(c3278p, strConcat9);
        c20378c7.m56588q("empty", null, new C26522i(strConcat9, 19));
        c20378c7.m56588q("of", null, new C26523j(strConcat, strConcat9, 4));
        c20378c7.m56588q("ofNullable", null, new C26523j(strConcat, strConcat9, 5));
        c20378c7.m56588q("get", null, new C26522i(strConcat, 20));
        c20378c7.m56588q("ifPresent", null, new C26522i(strConcat4, 21));
        new C20378c(c3278p, "java/lang/".concat("ref/Reference")).m56588q("get", null, new C26522i(strConcat, 22));
        new C20378c(c3278p, strConcat2).m56588q("test", null, new C26522i(strConcat, 23));
        new C20378c(c3278p, "java/util/function/".concat("BiPredicate")).m56588q("test", null, new C26522i(strConcat, 24));
        new C20378c(c3278p, strConcat4).m56588q(HttpHeaders.ACCEPT, null, new C26522i(strConcat, 25));
        new C20378c(c3278p, strConcat6).m56588q(HttpHeaders.ACCEPT, null, new C26522i(strConcat, 27));
        new C20378c(c3278p, strConcat3).m56588q("apply", null, new C26522i(strConcat, 28));
        new C20378c(c3278p, strConcat5).m56588q("apply", null, new C26522i(strConcat, 29));
        new C20378c(c3278p, "java/util/function/".concat("Supplier")).m56588q("get", null, new C26524k(strConcat, 0));
        f105451d = c3278p.f12803a;
    }

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m78596a() {
        return f105451d;
    }
}
