package t23;

import ad3.C0764g;
import io.getstream.android.video.generated.models.EgressHLSResponse;
import io.getstream.android.video.generated.models.EgressResponse;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import org.webrtc.AudioTrack;
import org.webrtc.VideoTrack;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import sc3.AbstractC32398l;
import v33.C35630o;
import v43.C35698a;

/* JADX INFO: renamed from: t23.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33415l0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C33415l0 f139518E;

    /* JADX INFO: renamed from: F */
    public static final C33415l0 f139519F;

    /* JADX INFO: renamed from: G */
    public static final C33415l0 f139520G;

    /* JADX INFO: renamed from: H */
    public static final C33415l0 f139521H;

    /* JADX INFO: renamed from: I */
    public static final C33415l0 f139522I;

    /* JADX INFO: renamed from: J */
    public static final C33415l0 f139523J;

    /* JADX INFO: renamed from: K */
    public static final C33415l0 f139524K;

    /* JADX INFO: renamed from: L */
    public static final C33415l0 f139525L;

    /* JADX INFO: renamed from: M */
    public static final C33415l0 f139526M;

    /* JADX INFO: renamed from: N */
    public static final C33415l0 f139527N;

    /* JADX INFO: renamed from: O */
    public static final C33415l0 f139528O;

    /* JADX INFO: renamed from: P */
    public static final C33415l0 f139529P;

    /* JADX INFO: renamed from: Q */
    public static final C33415l0 f139530Q;

    /* JADX INFO: renamed from: R */
    public static final C33415l0 f139531R;

    /* JADX INFO: renamed from: S */
    public static final C33415l0 f139532S;

    /* JADX INFO: renamed from: x */
    public static final C33415l0 f139533x;

    /* JADX INFO: renamed from: y */
    public static final C33415l0 f139534y;

    /* JADX INFO: renamed from: z */
    public static final C33415l0 f139535z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139536w;

    static {
        int i13 = 1;
        f139533x = new C33415l0(i13, 0);
        f139534y = new C33415l0(i13, 1);
        f139535z = new C33415l0(i13, 2);
        f139518E = new C33415l0(i13, 3);
        f139519F = new C33415l0(i13, 4);
        f139520G = new C33415l0(i13, 5);
        f139521H = new C33415l0(i13, 6);
        f139522I = new C33415l0(i13, 7);
        f139523J = new C33415l0(i13, 8);
        f139524K = new C33415l0(i13, 9);
        f139525L = new C33415l0(i13, 10);
        f139526M = new C33415l0(i13, 11);
        f139527N = new C33415l0(i13, 12);
        f139528O = new C33415l0(i13, 13);
        f139529P = new C33415l0(i13, 14);
        f139530Q = new C33415l0(i13, 15);
        f139531R = new C33415l0(i13, 16);
        f139532S = new C33415l0(i13, 17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33415l0(int i13, int i14) {
        super(i13);
        this.f139536w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EgressHLSResponse hls;
        switch (this.f139536w) {
            case 0:
                Map detailed = (Map) obj;
                AbstractC22676k.m65750j(detailed, "detailed");
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(detailed.size()));
                for (Map.Entry entry : detailed.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((C35698a) entry.getValue()).f151896b);
                }
                return linkedHashMap;
            case 1:
                Long l7 = (Long) obj;
                if (l7 == null) {
                    return null;
                }
                return new SimpleDateFormat("HH:MM:SS", Locale.US).format(new Date(l7.longValue()));
            case 2:
                EgressResponse egressResponse = (EgressResponse) obj;
                if (egressResponse == null || (hls = egressResponse.getHls()) == null) {
                    return null;
                }
                return hls.getPlaylistUrl();
            case 3:
                InterfaceC33442q2 it = (InterfaceC33442q2) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(it instanceof C33432o2);
            case 4:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 5:
                Long l12 = (Long) obj;
                if (l12 == null) {
                    return null;
                }
                if (l12.longValue() < 1000) {
                    l12 = null;
                }
                if (l12 != null) {
                    return Duration.m134260boximpl(DurationKt.toDuration(l12.longValue() / ((long) 1000), DurationUnit.SECONDS));
                }
                return null;
            case 6:
                SortedMap it3 = (SortedMap) obj;
                AbstractC22676k.m65750j(it3, "it");
                Collection collectionValues = it3.values();
                AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                return AbstractC25265s.m74093D1(collectionValues);
            case 7:
                C35630o c35630o = (C35630o) obj;
                return Integer.valueOf(c35630o != null ? c35630o.f151428a : 0);
            case 8:
                String it4 = (String) obj;
                AbstractC22676k.m65750j(it4, "it");
                return it4.concat("\n");
            case 9:
                List participants = (List) obj;
                AbstractC22676k.m65750j(participants, "participants");
                List<C33392g2> list = participants;
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W);
                for (C33392g2 c33392g2 : list) {
                    linkedHashMap2.put(c33392g2.f139446y.getValue(), c33392g2.f139422a);
                }
                return linkedHashMap2;
            case 10:
                VideoTrack it5 = (VideoTrack) obj;
                AbstractC22676k.m65750j(it5, "it");
                AbstractC32398l.m100981n(it5, false);
                return C23454a0.f92919a;
            case 11:
                VideoTrack it6 = (VideoTrack) obj;
                AbstractC22676k.m65750j(it6, "it");
                AbstractC32398l.m100981n(it6, true);
                return C23454a0.f92919a;
            case 12:
                return C23454a0.f92919a;
            case 13:
                AudioTrack it7 = (AudioTrack) obj;
                AbstractC22676k.m65750j(it7, "it");
                AbstractC32398l.m100981n(it7, false);
                return C23454a0.f92919a;
            case 14:
                AudioTrack it8 = (AudioTrack) obj;
                AbstractC22676k.m65750j(it8, "it");
                AbstractC32398l.m100981n(it8, true);
                return C23454a0.f92919a;
            case 15:
                AbstractC33441q1 it9 = (AbstractC33441q1) obj;
                AbstractC22676k.m65750j(it9, "it");
                return Boolean.valueOf(it9 instanceof C33431o1);
            case 16:
                AbstractC33441q1 it10 = (AbstractC33441q1) obj;
                AbstractC22676k.m65750j(it10, "it");
                return Boolean.valueOf(it10 instanceof C33431o1);
            default:
                C0764g Json = (C0764g) obj;
                AbstractC22676k.m65750j(Json, "$this$Json");
                Json.f2778e = true;
                Json.f2776c = true;
                return C23454a0.f92919a;
        }
    }
}
