package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;
import p471rx.AbstractC31885f;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: qx.l */
/* JADX INFO: loaded from: classes.dex */
public final class C30721l extends JsonAdapter {

    /* JADX INFO: renamed from: d */
    public static final C30709f f126501d = new C30709f(1);

    /* JADX INFO: renamed from: a */
    public final AbstractC34235f f126502a;

    /* JADX INFO: renamed from: b */
    public final C30719k[] f126503b;

    /* JADX INFO: renamed from: c */
    public final C30740v f126504c;

    public C30721l(AbstractC34235f abstractC34235f, TreeMap treeMap) {
        this.f126502a = abstractC34235f;
        this.f126503b = (C30719k[]) treeMap.values().toArray(new C30719k[treeMap.size()]);
        this.f126504c = C30740v.m94403a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        try {
            Object objMo94384U = this.f126502a.mo94384U();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    int iMo16725T = jsonReader.mo16725T(this.f126504c);
                    if (iMo16725T == -1) {
                        jsonReader.mo16728b0();
                        jsonReader.skipValue();
                    } else {
                        this.f126503b[iMo16725T].m94394a(jsonReader, objMo94384U);
                    }
                }
                jsonReader.endObject();
                return objMo94384U;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e13) {
            AbstractC31885f.m99132j(e13);
            throw null;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        try {
            abstractC30704c0.mo94368h();
            for (C30719k c30719k : this.f126503b) {
                abstractC30704c0.mo94373x(c30719k.f126494a);
                c30719k.m94395b(abstractC30704c0, obj);
            }
            abstractC30704c0.mo94370m();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f126502a + ")";
    }
}
