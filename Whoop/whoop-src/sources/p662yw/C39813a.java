package p662yw;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p384ow.C28417m;
import p628xw.AbstractC38673c;
import p628xw.AbstractC38674d;

/* JADX INFO: renamed from: yw.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39813a implements Serializable {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f171575x = 0;

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f171576w;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        Collections.unmodifiableSet(hashSet);
    }

    public C39813a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.f171576w = linkedHashMap2;
        linkedHashMap2.putAll(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public final List m127646a() throws ParseException {
        List list;
        String[] strArr;
        LinkedHashMap linkedHashMap = this.f171576w;
        if (linkedHashMap.get("aud") == null) {
            list = null;
        } else {
            try {
                list = (List) linkedHashMap.get("aud");
            } catch (ClassCastException unused) {
                throw new ParseException("The aud claim is not a list / JSON array", 0);
            }
        }
        if (list == null) {
            strArr = null;
        } else {
            int size = list.size();
            strArr = new String[size];
            for (int i13 = 0; i13 < size; i13++) {
                try {
                    strArr[i13] = (String) list.get(i13);
                } catch (ClassCastException unused2) {
                    throw new ParseException("The aud claim is not a list / JSON array of strings", 0);
                }
            }
        }
        if (strArr == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39813a) {
            return Objects.equals(this.f171576w, ((C39813a) obj).f171576w);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f171576w);
    }

    public final String toString() {
        List listM127646a;
        C28417m c28417m = AbstractC38674d.f166478a;
        HashMap map = new HashMap();
        LinkedHashMap linkedHashMap = this.f171576w;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getValue() instanceof Date) {
                map.put(entry.getKey(), Long.valueOf(((Date) entry.getValue()).getTime() / 1000));
            } else if ("aud".equals(entry.getKey())) {
                Object obj = linkedHashMap.get("aud");
                if (obj instanceof String) {
                    listM127646a = Collections.singletonList((String) obj);
                } else {
                    try {
                        listM127646a = m127646a();
                        if (listM127646a == null) {
                            listM127646a = Collections.EMPTY_LIST;
                        }
                    } catch (ParseException unused) {
                        listM127646a = Collections.EMPTY_LIST;
                    }
                }
                if (listM127646a != null && !listM127646a.isEmpty()) {
                    if (listM127646a.size() == 1) {
                        map.put("aud", listM127646a.get(0));
                    } else {
                        int i13 = AbstractC38673c.f166477a;
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(listM127646a);
                        map.put("aud", arrayList);
                    }
                }
            } else if (entry.getValue() != null) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC38674d.m124060j(map);
    }
}
