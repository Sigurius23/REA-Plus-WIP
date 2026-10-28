package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p097ds.AbstractC12313p;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.r0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1416r0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f5959a;

    static {
        char[] cArr = new char[80];
        f5959a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m4509a(int i13, StringBuilder sb4) {
        while (i13 > 0) {
            int i14 = 80;
            if (i13 <= 80) {
                i14 = i13;
            }
            sb4.append(f5959a, 0, i14);
            i13 -= i14;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4510b(StringBuilder sb4, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m4510b(sb4, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                m4510b(sb4, i13, str, (Map.Entry) it3.next());
            }
            return;
        }
        sb4.append('\n');
        m4509a(i13, sb4);
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
            C1388h c1388h = AbstractC1391i.f5905x;
            sb4.append(AbstractC12313p.m34250B(new C1388h(((String) obj).getBytes(AbstractC1383f0.f5887a))));
            sb4.append('\"');
            return;
        }
        if (obj instanceof AbstractC1391i) {
            sb4.append(": \"");
            sb4.append(AbstractC12313p.m34250B((AbstractC1391i) obj));
            sb4.append('\"');
            return;
        }
        if (obj instanceof AbstractC1368a0) {
            sb4.append(" {");
            m4511c((AbstractC1368a0) obj, sb4, i13 + 2);
            sb4.append("\n");
            m4509a(i13, sb4);
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
        m4510b(sb4, i15, "key", entry.getKey());
        m4510b(sb4, i15, "value", entry.getValue());
        sb4.append("\n");
        m4509a(i13, sb4);
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
    public static void m4511c(AbstractC1368a0 abstractC1368a0, StringBuilder sb4, int i13) {
        int i14;
        int i15;
        Method method;
        Method method2;
        Object objM4271f;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC1368a0.getClass().getDeclaredMethods();
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
                    m4510b(sb4, i13, strSubstring.substring(0, strSubstring.length() - 4), AbstractC1368a0.m4271f(method4, abstractC1368a0, new Object[0]));
                }
                i14 = i15;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                m4510b(sb4, i13, strSubstring.substring(0, strSubstring.length() - 3), AbstractC1368a0.m4271f(method3, abstractC1368a0, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objM4271f = AbstractC1368a0.m4271f(method, abstractC1368a0, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objM4271f instanceof Boolean) {
                                    zEquals = !((Boolean) objM4271f).booleanValue();
                                } else if (objM4271f instanceof Integer) {
                                    if (((Integer) objM4271f).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM4271f instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM4271f).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM4271f instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM4271f).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM4271f instanceof String) {
                                    zEquals = objM4271f.equals("");
                                } else if (objM4271f instanceof AbstractC1391i) {
                                    zEquals = objM4271f.equals(AbstractC1391i.f5905x);
                                } else if ((objM4271f instanceof AbstractC1367a) ? !((objM4271f instanceof Enum) && ((Enum) objM4271f).ordinal() == 0) : objM4271f != ((AbstractC1368a0) ((AbstractC1368a0) ((AbstractC1367a) objM4271f)).mo4275d(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC1368a0.m4271f(method2, abstractC1368a0, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                m4510b(sb4, i13, strSubstring, objM4271f);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objM4271f = AbstractC1368a0.m4271f(method, abstractC1368a0, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objM4271f instanceof Boolean) {
                                zEquals = !((Boolean) objM4271f).booleanValue();
                            } else if (objM4271f instanceof Integer) {
                                if (((Integer) objM4271f).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM4271f instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objM4271f).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM4271f instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objM4271f).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM4271f instanceof String) {
                                zEquals = objM4271f.equals("");
                            } else if (objM4271f instanceof AbstractC1391i) {
                                zEquals = objM4271f.equals(AbstractC1391i.f5905x);
                            } else if (objM4271f instanceof AbstractC1367a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC1368a0.m4271f(method2, abstractC1368a0, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            m4510b(sb4, i13, strSubstring, objM4271f);
                        }
                    }
                }
            }
            i14 = i15;
        }
        C1381e1 c1381e1 = abstractC1368a0.unknownFields;
        if (c1381e1 != null) {
            for (int i17 = 0; i17 < c1381e1.f5881a; i17++) {
                m4510b(sb4, i13, String.valueOf(c1381e1.f5882b[i17] >>> 3), c1381e1.f5883c[i17]);
            }
        }
    }
}
