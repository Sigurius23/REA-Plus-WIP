package p026b2;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.gms.common.api.Scope;
import com.squareup.wire.C5575f;
import e10.InterfaceC12551j;
import io.sentry.android.replay.C20213l;
import io.sentry.rrweb.AbstractC20523b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import oe3.C27889i;
import p144fc.C14348d;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p322m7.C25132b1;
import p322m7.C25157l;
import p322m7.C25165p;
import p322m7.C25166p0;
import p322m7.C25167q;
import p322m7.C25177v;
import p322m7.C25180w0;
import p322m7.C25183y;
import p322m7.C25186z0;
import p363ob.C27785h;
import p363ob.C27787j;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: b2.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C2298d implements Comparator {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ C2298d f9100x = new C2298d(27);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9101w;

    public /* synthetic */ C2298d(int i13) {
        this.f9101w = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9101w) {
            case 0:
                return AbstractC30060g.m92127q(((Field) obj).getName(), ((Field) obj2).getName());
            case 1:
                ((C5575f) obj).getClass();
                throw null;
            case 2:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 3:
                return AbstractC30060g.m92127q(((InterfaceC12551j) obj).getKey(), ((InterfaceC12551j) obj2).getKey());
            case 4:
                return ((C14348d) obj).f52400b - ((C14348d) obj2).f52400b;
            case 5:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 6:
                return AbstractC30060g.m92127q(((C25157l) obj).f98649a, ((C25157l) obj2).f98649a);
            case 7:
                return AbstractC30060g.m92127q(((C25165p) obj).f98738a, ((C25165p) obj2).f98738a);
            case 8:
                return AbstractC30060g.m92127q(((C25177v) obj).f98769a, ((C25177v) obj2).f98769a);
            case 9:
                return AbstractC30060g.m92127q(((C25183y) obj).f98811a, ((C25183y) obj2).f98811a);
            case 10:
                return AbstractC30060g.m92127q(((C25166p0) obj).f98741a, ((C25166p0) obj2).f98741a);
            case 11:
                return AbstractC30060g.m92127q(((C25180w0) obj).f98792a, ((C25180w0) obj2).f98792a);
            case 12:
                return AbstractC30060g.m92127q(((C25186z0) obj).f98827a, ((C25186z0) obj2).f98827a);
            case 13:
                return AbstractC30060g.m92127q(((C25132b1) obj).f98517a, ((C25132b1) obj2).f98517a);
            case 14:
                return AbstractC30060g.m92127q(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
            case 15:
                return AbstractC30060g.m92127q(Long.valueOf(((C20213l) obj).f75935b), Long.valueOf(((C20213l) obj2).f75935b));
            case 16:
                return AbstractC30060g.m92127q(Long.valueOf(((AbstractC20523b) obj).f76901x), Long.valueOf(((AbstractC20523b) obj2).f76901x));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                String str = (String) obj;
                String str2 = (String) obj2;
                return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC30060g.m92127q(((C25167q) obj).f98743a, ((C25167q) obj2).f98743a);
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 21:
                return AbstractC30060g.m92127q((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC30060g.m92127q((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC30060g.m92127q(((C27785h) obj).f112020a, ((C27785h) obj2).f112020a);
            case 24:
                return AbstractC30060g.m92127q(((C27787j) obj).f112032a, ((C27787j) obj2).f112032a);
            case 25:
                return AbstractC30060g.m92127q(((C27889i) obj).f112448a, ((C27889i) obj2).f112448a);
            case 26:
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                float fM47512g = AbstractC16877h0.m47512g((View) obj);
                float fM47512g2 = AbstractC16877h0.m47512g((View) obj2);
                if (fM47512g > fM47512g2) {
                    return -1;
                }
                return fM47512g < fM47512g2 ? 1 : 0;
            case 27:
                return ((Scope) obj).f20487x.compareTo(((Scope) obj2).f20487x);
            case 28:
                return ((Scope) obj).f20487x.compareTo(((Scope) obj2).f20487x);
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
