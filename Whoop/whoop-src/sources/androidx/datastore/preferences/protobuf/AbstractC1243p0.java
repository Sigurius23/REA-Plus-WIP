package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p048ce.AbstractC4482w;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1243p0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f5449a;

    static {
        char[] cArr = new char[80];
        f5449a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m3964a(int i13, StringBuilder sb4) {
        while (i13 > 0) {
            int i14 = 80;
            if (i13 <= 80) {
                i14 = i13;
            }
            sb4.append(f5449a, 0, i14);
            i13 -= i14;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3965b(StringBuilder sb4, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m3965b(sb4, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                m3965b(sb4, i13, str, (Map.Entry) it3.next());
            }
            return;
        }
        sb4.append('\n');
        m3964a(i13, sb4);
        if (!str.isEmpty()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(Character.toLowerCase(str.charAt(0)));
            for (int i14 = 1; i14 < str.length(); i14++) {
                char cCharAt = str.charAt(i14);
                if (Character.isUpperCase(cCharAt)) {
                    sb5.append("_");
                }
                sb5.append(Character.toLowerCase(cCharAt));
            }
            str = sb5.toString();
        }
        sb4.append(str);
        if (obj instanceof String) {
            sb4.append(": \"");
            C1218h c1218h = C1218h.f5398y;
            sb4.append(AbstractC4482w.m13972H(new C1218h(((String) obj).getBytes(AbstractC1204c0.f5362a))));
            sb4.append('\"');
            return;
        }
        if (obj instanceof C1218h) {
            sb4.append(": \"");
            sb4.append(AbstractC4482w.m13972H((C1218h) obj));
            sb4.append('\"');
            return;
        }
        if (obj instanceof AbstractC1269z) {
            sb4.append(" {");
            m3966c((AbstractC1269z) obj, sb4, i13 + 2);
            sb4.append("\n");
            m3964a(i13, sb4);
            sb4.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb4.append(": ");
            sb4.append(obj);
            return;
        }
        sb4.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i15 = i13 + 2;
        m3965b(sb4, i15, "key", entry.getKey());
        m3965b(sb4, i15, "value", entry.getValue());
        sb4.append("\n");
        m3964a(i13, sb4);
        sb4.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0202  */
    /* JADX WARN: Code duplicated, block: B:106:0x0204  */
    /* JADX WARN: Code duplicated, block: B:108:0x0212  */
    /* JADX WARN: Code duplicated, block: B:127:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01de  */
    /* JADX INFO: renamed from: c */
    public static void m3966c(AbstractC1269z abstractC1269z, StringBuilder sb4, int i13) {
        int i14;
        int i15;
        Method method;
        Method method2;
        Object objM4021e;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC1269z.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i16 = 0;
        while (true) {
            i14 = 3;
            if (i16 >= length) {
                break;
            }
            Method method5 = declaredMethods[i16];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i16++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i14);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i15 = i14;
            } else {
                i15 = i14;
                if (method4.getReturnType().equals(List.class)) {
                    m3965b(sb4, i13, strSubstring.substring(0, strSubstring.length() - 4), AbstractC1269z.m4021e(method4, abstractC1269z, new Object[0]));
                }
                i14 = i15;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                m3965b(sb4, i13, strSubstring.substring(0, strSubstring.length() - 3), AbstractC1269z.m4021e(method3, abstractC1269z, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objM4021e = AbstractC1269z.m4021e(method, abstractC1269z, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objM4021e instanceof Boolean) {
                                    zEquals = !((Boolean) objM4021e).booleanValue();
                                } else if (objM4021e instanceof Integer) {
                                    if (((Integer) objM4021e).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM4021e instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM4021e).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM4021e instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM4021e).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM4021e instanceof String) {
                                    zEquals = objM4021e.equals("");
                                } else if (objM4021e instanceof C1218h) {
                                    zEquals = objM4021e.equals(C1218h.f5398y);
                                } else if ((objM4021e instanceof AbstractC1197a) ? !((objM4021e instanceof Enum) && ((Enum) objM4021e).ordinal() == 0) : objM4021e != ((AbstractC1269z) ((AbstractC1269z) ((AbstractC1197a) objM4021e)).mo4024c(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC1269z.m4021e(method2, abstractC1269z, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                m3965b(sb4, i13, strSubstring, objM4021e);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objM4021e = AbstractC1269z.m4021e(method, abstractC1269z, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objM4021e instanceof Boolean) {
                                zEquals = !((Boolean) objM4021e).booleanValue();
                            } else if (objM4021e instanceof Integer) {
                                if (((Integer) objM4021e).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM4021e instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objM4021e).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM4021e instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objM4021e).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM4021e instanceof String) {
                                zEquals = objM4021e.equals("");
                            } else if (objM4021e instanceof C1218h) {
                                zEquals = objM4021e.equals(C1218h.f5398y);
                            } else if (objM4021e instanceof AbstractC1197a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC1269z.m4021e(method2, abstractC1269z, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            m3965b(sb4, i13, strSubstring, objM4021e);
                        }
                    }
                }
            }
            i14 = i15;
        }
        C1214f1 c1214f1 = abstractC1269z.unknownFields;
        if (c1214f1 != null) {
            for (int i17 = 0; i17 < c1214f1.f5391a; i17++) {
                m3965b(sb4, i13, String.valueOf(c1214f1.f5392b[i17] >>> 3), c1214f1.f5393c[i17]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m3967d(AbstractC1269z abstractC1269z, String str) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("# ");
        sb4.append(str);
        m3966c(abstractC1269z, sb4, 0);
        return sb4.toString();
    }
}
