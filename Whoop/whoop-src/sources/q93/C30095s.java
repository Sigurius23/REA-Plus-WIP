package q93;

import db3.EnumC11891c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import m83.AbstractC25265s;
import oa3.C27764g;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q93.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C30095s {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f122811a = AbstractC12350b.m34555D("java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;", C27764g.m83870e("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"));

    /* JADX INFO: renamed from: b */
    public static final LinkedHashSet f122812b;

    /* JADX INFO: renamed from: c */
    public static final LinkedHashSet f122813c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashSet f122814d;

    /* JADX INFO: renamed from: e */
    public static final LinkedHashSet f122815e;

    /* JADX INFO: renamed from: f */
    public static final LinkedHashSet f122816f;

    /* JADX INFO: renamed from: g */
    public static final LinkedHashSet f122817g;

    static {
        List<EnumC11891c> listM118959K = AbstractC37056f.m118959K(EnumC11891c.BOOLEAN, EnumC11891c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC11891c enumC11891c : listM118959K) {
            C35847e c35847e = enumC11891c.f38879z;
            if (c35847e == null) {
                EnumC11891c.m31929a(15);
                throw null;
            }
            String strM113817b = c35847e.f152613a.m113796g().m113817b();
            AbstractC22676k.m65749i(strM113817b, "asString(...)");
            AbstractC25265s.m74141p0(linkedHashSet, C27764g.m83869d(strM113817b, enumC11891c.f38877x + "Value()" + enumC11891c.m31931c()));
        }
        f122812b = AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(linkedHashSet, C27764g.m83870e("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), C27764g.m83869d("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C27764g.m83869d("Double", "isInfinite()Z", "isNaN()Z")), C27764g.m83869d("Float", "isInfinite()Z", "isNaN()Z")), C27764g.m83869d("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C27764g.m83869d("CharSequence", "isEmpty()Z"));
        f122813c = C27764g.m83870e("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f122814d = AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(AbstractC12350b.m34556E(C27764g.m83869d("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C27764g.m83870e("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C27764g.m83869d("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C27764g.m83869d("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C27764g.m83870e("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C27764g.m83870e("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C27764g.m83870e("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f122815e = AbstractC12350b.m34556E(AbstractC12350b.m34556E(C27764g.m83870e("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C27764g.m83870e("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C27764g.m83870e("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC11891c enumC11891c2 = EnumC11891c.BOOLEAN;
        EnumC11891c enumC11891c3 = EnumC11891c.BYTE;
        List listM118959K2 = AbstractC37056f.m118959K(enumC11891c2, enumC11891c3, EnumC11891c.DOUBLE, EnumC11891c.FLOAT, enumC11891c3, EnumC11891c.INT, EnumC11891c.LONG, EnumC11891c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listM118959K2.iterator();
        while (it.hasNext()) {
            C35847e c35847e2 = ((EnumC11891c) it.next()).f38879z;
            if (c35847e2 == null) {
                EnumC11891c.m31929a(15);
                throw null;
            }
            String strM113817b2 = c35847e2.f152613a.m113796g().m113817b();
            AbstractC22676k.m65749i(strM113817b2, "asString(...)");
            String[] strArrM83867a = C27764g.m83867a("Ljava/lang/String;");
            AbstractC25265s.m74141p0(linkedHashSet2, C27764g.m83869d(strM113817b2, (String[]) Arrays.copyOf(strArrM83867a, strArrM83867a.length)));
        }
        String[] strArrM83867a2 = C27764g.m83867a("D");
        LinkedHashSet linkedHashSetM34556E = AbstractC12350b.m34556E(linkedHashSet2, C27764g.m83869d("Float", (String[]) Arrays.copyOf(strArrM83867a2, strArrM83867a2.length)));
        String[] strArrM83867a3 = C27764g.m83867a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f122816f = AbstractC12350b.m34556E(linkedHashSetM34556E, C27764g.m83869d("String", (String[]) Arrays.copyOf(strArrM83867a3, strArrM83867a3.length)));
        String[] strArrM83867a4 = C27764g.m83867a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f122817g = C27764g.m83869d("Throwable", (String[]) Arrays.copyOf(strArrM83867a4, strArrM83867a4.length));
    }
}
