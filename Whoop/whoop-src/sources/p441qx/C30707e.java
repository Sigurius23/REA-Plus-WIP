package p441qx;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import ih0.AbstractC18489d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import p471rx.AbstractC31885f;

/* JADX INFO: renamed from: qx.e */
/* JADX INFO: loaded from: classes.dex */
public final class C30707e implements InterfaceC30735s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126449a;

    /* JADX INFO: renamed from: b */
    public final Object f126450b;

    /* JADX INFO: renamed from: c */
    public final Object f126451c;

    public /* synthetic */ C30707e(int i13, Object obj, Object obj2) {
        this.f126449a = i13;
        this.f126450b = obj;
        this.f126451c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC30705d m94382a(ArrayList arrayList, Type type, Set set) {
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC30705d abstractC30705d = (AbstractC30705d) arrayList.get(i13);
            if (AbstractC1772c1.m5398p(abstractC30705d.f126441a, type) && abstractC30705d.f126442b.equals(set)) {
                return abstractC30705d;
            }
        }
        return null;
    }

    @Override // p441qx.InterfaceC30735s
    public final JsonAdapter create(Type type, Set set, C30722l0 c30722l0) {
        int i13 = this.f126449a;
        JsonAdapter jsonAdapterM94401d = null;
        Object obj = this.f126451c;
        Object obj2 = this.f126450b;
        switch (i13) {
            case 0:
                AbstractC30705d abstractC30705dM94382a = m94382a((ArrayList) obj2, type, set);
                AbstractC30705d abstractC30705dM94382a2 = m94382a((ArrayList) obj, type, set);
                if (abstractC30705dM94382a == null && abstractC30705dM94382a2 == null) {
                    return null;
                }
                if (abstractC30705dM94382a == null || abstractC30705dM94382a2 == null) {
                    try {
                        jsonAdapterM94401d = c30722l0.m94401d(this, type, set);
                    } catch (IllegalArgumentException e5) {
                        StringBuilder sbM53375p = AbstractC18489d0.m53375p("No ", abstractC30705dM94382a == null ? "@ToJson" : "@FromJson", " adapter for ");
                        sbM53375p.append(AbstractC31885f.m99133k(type, set));
                        throw new IllegalArgumentException(sbM53375p.toString(), e5);
                    }
                    break;
                }
                JsonAdapter jsonAdapter = jsonAdapterM94401d;
                if (abstractC30705dM94382a != null) {
                    abstractC30705dM94382a.mo94375a(c30722l0, this);
                }
                if (abstractC30705dM94382a2 != null) {
                    abstractC30705dM94382a2.mo94375a(c30722l0, this);
                }
                return new C30699a(abstractC30705dM94382a, jsonAdapter, c30722l0, abstractC30705dM94382a2, set, type);
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                Set set2 = AbstractC31885f.f132390a;
                if (AbstractC1772c1.m5398p((Type) obj2, type)) {
                    return (JsonAdapter) obj;
                }
                return null;
        }
    }
}
