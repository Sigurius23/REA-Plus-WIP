package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import se.AbstractC32416g;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.q0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5171q0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f21563a;

    static {
        char[] cArr = new char[80];
        f21563a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m16305a(int i13, StringBuilder sb4) {
        while (i13 > 0) {
            int i14 = 80;
            if (i13 <= 80) {
                i14 = i13;
            }
            sb4.append(f21563a, 0, i14);
            i13 -= i14;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16306b(StringBuilder sb4, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m16306b(sb4, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                m16306b(sb4, i13, str, (Map.Entry) it3.next());
            }
            return;
        }
        sb4.append('\n');
        m16305a(i13, sb4);
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
            C5143h c5143h = AbstractC5146i.f21514x;
            sb4.append(AbstractC32416g.m101165v(new C5143h(((String) obj).getBytes(AbstractC5126b0.f21479a))));
            sb4.append('\"');
            return;
        }
        if (obj instanceof AbstractC5146i) {
            sb4.append(": \"");
            sb4.append(AbstractC32416g.m101165v((AbstractC5146i) obj));
            sb4.append('\"');
            return;
        }
        if (obj instanceof AbstractC5184x) {
            sb4.append(" {");
            m16307c((AbstractC5184x) obj, sb4, i13 + 2);
            sb4.append("\n");
            m16305a(i13, sb4);
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
        m16306b(sb4, i15, "key", entry.getKey());
        m16306b(sb4, i15, "value", entry.getValue());
        sb4.append("\n");
        m16305a(i13, sb4);
        sb4.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:108:0x020d  */
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
    public static void m16307c(AbstractC5184x abstractC5184x, StringBuilder sb4, int i13) {
        int i14;
        int i15;
        Method method;
        Method method2;
        Object objM16354n;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC5184x.getClass().getDeclaredMethods();
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
                    m16306b(sb4, i13, strSubstring.substring(0, strSubstring.length() - 4), AbstractC5184x.m16354n(method4, abstractC5184x, new Object[0]));
                }
                i14 = i15;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                m16306b(sb4, i13, strSubstring.substring(0, strSubstring.length() - 3), AbstractC5184x.m16354n(method3, abstractC5184x, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objM16354n = AbstractC5184x.m16354n(method, abstractC5184x, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objM16354n instanceof Boolean) {
                                    zEquals = !((Boolean) objM16354n).booleanValue();
                                } else if (objM16354n instanceof Integer) {
                                    if (((Integer) objM16354n).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM16354n instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM16354n).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM16354n instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM16354n).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM16354n instanceof String) {
                                    zEquals = objM16354n.equals("");
                                } else if (objM16354n instanceof AbstractC5146i) {
                                    zEquals = objM16354n.equals(AbstractC5146i.f21514x);
                                } else if ((objM16354n instanceof AbstractC5122a) ? !((objM16354n instanceof Enum) && ((Enum) objM16354n).ordinal() == 0) : objM16354n != ((AbstractC5122a) objM16354n).mo16299a()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC5184x.m16354n(method2, abstractC5184x, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                m16306b(sb4, i13, strSubstring, objM16354n);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objM16354n = AbstractC5184x.m16354n(method, abstractC5184x, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objM16354n instanceof Boolean) {
                                zEquals = !((Boolean) objM16354n).booleanValue();
                            } else if (objM16354n instanceof Integer) {
                                if (((Integer) objM16354n).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM16354n instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objM16354n).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM16354n instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objM16354n).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM16354n instanceof String) {
                                zEquals = objM16354n.equals("");
                            } else if (objM16354n instanceof AbstractC5146i) {
                                zEquals = objM16354n.equals(AbstractC5146i.f21514x);
                            } else if (objM16354n instanceof AbstractC5122a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC5184x.m16354n(method2, abstractC5184x, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            m16306b(sb4, i13, strSubstring, objM16354n);
                        }
                    }
                }
            }
            i14 = i15;
        }
        C5133d1 c5133d1 = abstractC5184x.unknownFields;
        if (c5133d1 != null) {
            for (int i17 = 0; i17 < c5133d1.f21500a; i17++) {
                m16306b(sb4, i13, String.valueOf(c5133d1.f21501b[i17] >>> 3), c5133d1.f21502c[i17]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m16308d(AbstractC5184x abstractC5184x, String str) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("# ");
        sb4.append(str);
        m16307c(abstractC5184x, sb4, 0);
        return sb4.toString();
    }
}
