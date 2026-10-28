package ua3;

import j93.AbstractC21478l0;
import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ua3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34722b {

    /* JADX INFO: renamed from: a */
    public static final String f146258a = AbstractC25265s.m74110N0(AbstractC37056f.m118959K('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f146259b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM118959K = AbstractC37056f.m118959K("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iM60400F = AbstractC21478l0.m60400F(0, listM118959K.size() - 1, 2);
        if (iM60400F >= 0) {
            int i13 = 0;
            while (true) {
                StringBuilder sb4 = new StringBuilder();
                String str = f146258a;
                sb4.append(str);
                sb4.append('/');
                sb4.append((String) listM118959K.get(i13));
                int i14 = i13 + 1;
                linkedHashMap.put(sb4.toString(), listM118959K.get(i14));
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append('/');
                linkedHashMap.put(AbstractC25012a.m73376i((String) listM118959K.get(i13), "Array", sb5), "[" + ((String) listM118959K.get(i14)));
                if (i13 == iM60400F) {
                    break;
                } else {
                    i13 += 2;
                }
            }
        }
        linkedHashMap.put(f146258a + "/Unit", "V");
        m109646a(linkedHashMap, "Any", "java/lang/Object");
        m109646a(linkedHashMap, "Nothing", "java/lang/Void");
        m109646a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC37056f.m118959K("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m109646a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC37056f.m118959K("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m109646a(linkedHashMap, AbstractC11266d.m30461o("collections/", str3), "java/util/" + str3);
            m109646a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m109646a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m109646a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m109646a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m109646a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i15 = 0; i15 < 23; i15++) {
            String strM8295h = AbstractC2875y.m8295h(i15, "Function");
            StringBuilder sb6 = new StringBuilder();
            String str4 = f146258a;
            sb6.append(str4);
            sb6.append("/jvm/functions/Function");
            sb6.append(i15);
            m109646a(linkedHashMap, strM8295h, sb6.toString());
            m109646a(linkedHashMap, "reflect/KFunction" + i15, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC37056f.m118959K("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m109646a(linkedHashMap, AbstractC2875y.m8299l(str5, ".Companion"), AbstractC11266d.m30464r(new StringBuilder(), f146258a, "/jvm/internal/", str5, "CompanionObject"));
        }
        f146259b = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static final void m109646a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f146258a + '/' + str, "L" + str2 + ';');
    }

    /* JADX INFO: renamed from: b */
    public static final String m109647b(String classId) {
        AbstractC22676k.m65750j(classId, "classId");
        String str = (String) f146259b.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + AbstractC39421y.m125927L(classId, '.', '$') + ';';
    }
}
