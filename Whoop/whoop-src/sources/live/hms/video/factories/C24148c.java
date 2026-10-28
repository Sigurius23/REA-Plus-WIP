package live.hms.video.factories;

import a33.C0352d;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.VibratorManager;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.health.platform.client.proto.C1533u;
import bh3.InterfaceC3260g;
import cg.C4560o;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.whoop.service.network.model.SportList;
import gm.C15981i;
import hms.webrtc.Loggable;
import hms.webrtc.Logging;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import mo.C25721b;
import n23.AbstractC26205h;
import na.C26498k;
import na.C26502o;
import o23.InterfaceC27471a;
import org.webrtc.EglThread;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p188ha.InterfaceC17038g;
import p344nm.InterfaceC26825g;
import p345nn.InterfaceC26856g;
import p362oa.C27749c;
import p377or.C28134h;
import p377or.InterfaceC28139m;
import p430qm.AbstractC30477a;
import p465rm.InterfaceC31526e;
import p465rm.InterfaceC31529f;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33649r;
import p543v4.C35643b;
import p576w8.AbstractC36934d;
import p576w8.C36932b;
import p576w8.C36935e;
import p576w8.C36937g;
import p576w8.C36938h;
import p576w8.C36939i;
import p607x8.InterfaceC38049d;
import p658yr.InterfaceC39718e;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29140r;
import pf.C29138p;
import pf.InterfaceC29142t;
import pg3.C29218v0;
import pq0.C29470e;
import qa.C30096a;
import qa.InterfaceC30105j;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: live.hms.video.factories.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24148c implements Loggable, InterfaceC16915u, InterfaceC17038g, InterfaceC31526e, InterfaceC39718e, InterfaceC33649r, InterfaceC26825g, InterfaceC26856g, InterfaceC27471a, InterfaceC3260g, EglThread.ReleaseMonitor, InterfaceC38049d, InterfaceC29142t, InterfaceC28139m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95219w;

    public /* synthetic */ C24148c(int i13) {
        this.f95219w = i13;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ VibratorManager m71061g(Object obj) {
        return (VibratorManager) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m71062h(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m71063i(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ boolean m71064j(Object obj) {
        return obj instanceof VibratorManager;
    }

    @Override // p188ha.InterfaceC17038g
    /* JADX INFO: renamed from: a */
    public boolean mo16708a(int i13, int i14, int i15, int i16, int i17) {
        switch (this.f95219w) {
            case 12:
                return (i14 == 67 && i15 == 79 && i16 == 77 && (i17 == 77 || i13 == 2)) || (i14 == 77 && i15 == 76 && i16 == 76 && (i17 == 84 || i13 == 2));
            default:
                return false;
        }
    }

    @Override // p607x8.InterfaceC38049d
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0281  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.CharSequence] */
    @Override // p658yr.InterfaceC39718e
    public Object apply(Object obj) {
        ?? r17;
        Bitmap bitmapDecodeByteArray;
        float f13;
        int i13;
        float f14;
        int i14;
        int i15;
        boolean z4 = true;
        switch (this.f95219w) {
            case 14:
                return Long.valueOf(((C30096a) obj).f122819b);
            case 15:
                return Long.valueOf(((C30096a) obj).f122820c);
            case 16:
                return (C26502o) obj;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        C0352d c0352dM45125a = C15981i.m45125a();
                        c0352dM45125a.m928Q(cursorRawQuery.getString(1));
                        c0352dM45125a.f1239z = AbstractC30477a.m93286b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        c0352dM45125a.f1238y = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(c0352dM45125a.m932d());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case 28:
                Bundle bundle = (Bundle) obj;
                ?? charSequence = bundle.getCharSequence(C36932b.f158036r);
                if (charSequence != 0) {
                    ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(C36932b.f158037s);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        for (Bundle bundle2 : parcelableArrayList) {
                            int i16 = bundle2.getInt(AbstractC36934d.f158064a);
                            int i17 = bundle2.getInt(AbstractC36934d.f158065b);
                            int i18 = bundle2.getInt(AbstractC36934d.f158066c);
                            int i19 = bundle2.getInt(AbstractC36934d.f158067d, -1);
                            Bundle bundle3 = bundle2.getBundle(AbstractC36934d.f158068e);
                            if (i19 == 1) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(C36937g.f158069c);
                                string2.getClass();
                                charSequence.setSpan(new C36937g(string2, bundle3.getInt(C36937g.f158070d)), i16, i17, i18);
                            } else if (i19 == 2) {
                                bundle3.getClass();
                                charSequence.setSpan(new C36938h(bundle3.getInt(C36938h.f158073d), bundle3.getInt(C36938h.f158074e), bundle3.getInt(C36938h.f158075f)), i16, i17, i18);
                            } else if (i19 == 3) {
                                charSequence.setSpan(new C36935e(), i16, i17, i18);
                            } else if (i19 == 4) {
                                bundle3.getClass();
                                String string3 = bundle3.getString(C36939i.f158079b);
                                string3.getClass();
                                charSequence.setSpan(new C36939i(string3), i16, i17, i18);
                            }
                        }
                    }
                    r17 = charSequence;
                } else {
                    r17 = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(C36932b.f158038t);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(C36932b.f158039u);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(C36932b.f158040v);
                if (bitmap != null) {
                    bitmapDecodeByteArray = bitmap;
                } else {
                    byte[] byteArray = bundle.getByteArray(C36932b.f158041w);
                    bitmapDecodeByteArray = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length) : null;
                }
                String str = C36932b.f158042x;
                if (bundle.containsKey(str)) {
                    String str2 = C36932b.f158043y;
                    if (bundle.containsKey(str2)) {
                        f13 = bundle.getFloat(str);
                        i13 = bundle.getInt(str2);
                    } else {
                        f13 = -3.4028235E38f;
                        i13 = Integer.MIN_VALUE;
                    }
                } else {
                    f13 = -3.4028235E38f;
                    i13 = Integer.MIN_VALUE;
                }
                String str3 = C36932b.f158044z;
                int i24 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
                String str4 = C36932b.f158026A;
                float f15 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
                String str5 = C36932b.f158027B;
                int i25 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
                String str6 = C36932b.f158029D;
                if (bundle.containsKey(str6)) {
                    String str7 = C36932b.f158028C;
                    if (bundle.containsKey(str7)) {
                        f14 = bundle.getFloat(str6);
                        i14 = bundle.getInt(str7);
                    } else {
                        f14 = -3.4028235E38f;
                        i14 = Integer.MIN_VALUE;
                    }
                } else {
                    f14 = -3.4028235E38f;
                    i14 = Integer.MIN_VALUE;
                }
                String str8 = C36932b.f158030E;
                float f16 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
                String str9 = C36932b.f158031F;
                float f17 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                String str10 = C36932b.f158032G;
                if (bundle.containsKey(str10)) {
                    i15 = bundle.getInt(str10);
                } else {
                    i15 = -16777216;
                    z4 = false;
                }
                int i26 = i15;
                boolean z13 = !bundle.getBoolean(C36932b.f158033H, false) ? false : z4;
                String str11 = C36932b.f158034I;
                int i27 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
                String str12 = C36932b.f158035J;
                return new C36932b(r17, alignment2, alignment4, bitmapDecodeByteArray, f13, i13, i24, f15, i25, i14, f14, f16, f17, z13, i26, i27, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
            default:
                C36932b c36932b = (C36932b) obj;
                Bitmap bitmap2 = c36932b.f158048d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = c36932b.f158045a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(C36932b.f158036r, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str13 = AbstractC36934d.f158064a;
                        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                        for (C36937g c36937g : (C36937g[]) spanned.getSpans(0, spanned.length(), C36937g.class)) {
                            c36937g.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(C36937g.f158069c, c36937g.f158071a);
                            bundle5.putInt(C36937g.f158070d, c36937g.f158072b);
                            arrayList2.add(AbstractC36934d.m118552a(spanned, c36937g, 1, bundle5));
                        }
                        for (C36938h c36938h : (C36938h[]) spanned.getSpans(0, spanned.length(), C36938h.class)) {
                            c36938h.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(C36938h.f158073d, c36938h.f158076a);
                            bundle6.putInt(C36938h.f158074e, c36938h.f158077b);
                            bundle6.putInt(C36938h.f158075f, c36938h.f158078c);
                            arrayList2.add(AbstractC36934d.m118552a(spanned, c36938h, 2, bundle6));
                        }
                        for (C36935e c36935e : (C36935e[]) spanned.getSpans(0, spanned.length(), C36935e.class)) {
                            arrayList2.add(AbstractC36934d.m118552a(spanned, c36935e, 3, null));
                        }
                        for (C36939i c36939i : (C36939i[]) spanned.getSpans(0, spanned.length(), C36939i.class)) {
                            c36939i.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(C36939i.f158079b, c36939i.f158080a);
                            arrayList2.add(AbstractC36934d.m118552a(spanned, c36939i, 4, bundle7));
                        }
                        if (!arrayList2.isEmpty()) {
                            bundle4.putParcelableArrayList(C36932b.f158037s, arrayList2);
                        }
                    }
                }
                bundle4.putSerializable(C36932b.f158038t, c36932b.f158046b);
                bundle4.putSerializable(C36932b.f158039u, c36932b.f158047c);
                bundle4.putFloat(C36932b.f158042x, c36932b.f158049e);
                bundle4.putInt(C36932b.f158043y, c36932b.f158050f);
                bundle4.putInt(C36932b.f158044z, c36932b.f158051g);
                bundle4.putFloat(C36932b.f158026A, c36932b.f158052h);
                bundle4.putInt(C36932b.f158027B, c36932b.f158053i);
                bundle4.putInt(C36932b.f158028C, c36932b.f158058n);
                bundle4.putFloat(C36932b.f158029D, c36932b.f158059o);
                bundle4.putFloat(C36932b.f158030E, c36932b.f158054j);
                bundle4.putFloat(C36932b.f158031F, c36932b.f158055k);
                bundle4.putBoolean(C36932b.f158033H, c36932b.f158056l);
                bundle4.putInt(C36932b.f158032G, c36932b.f158057m);
                bundle4.putInt(C36932b.f158034I, c36932b.f158060p);
                bundle4.putFloat(C36932b.f158035J, c36932b.f158061q);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AbstractC35849g.m113807i(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(C36932b.f158041w, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
        }
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        switch (this.f95219w) {
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Boolean.valueOf(((C29218v0) obj).f118269a.f146788Q);
            default:
                return new SportList((List) obj);
        }
    }

    @Override // p499t9.InterfaceC33649r
    /* JADX INFO: renamed from: d */
    public InterfaceC33644n[] mo1656d() {
        switch (this.f95219w) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new InterfaceC33644n[]{new C26498k(InterfaceC30105j.f122843p, 16)};
            default:
                return new InterfaceC33644n[]{new C27749c()};
        }
    }

    @Override // p465rm.InterfaceC31526e
    /* JADX INFO: renamed from: e */
    public InterfaceC31529f mo52217e(Bundle bundle) {
        return new C25721b(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    @Override // p377or.InterfaceC28139m
    /* JADX INFO: renamed from: f */
    public void mo71065f(C28134h c28134h, int i13) {
        C29470e.m89970c0(c28134h, i13);
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        int i13 = FinancialConnectionsSheetLiteActivity.f22170z;
        AbstractC22676k.m65750j(view, "view");
        C35643b c35643bMo47530g = c16905q1.f64864a.mo47530g(135);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        view.setPadding(c35643bMo47530g.f151449a, c35643bMo47530g.f151450b, c35643bMo47530g.f151451c, c35643bMo47530g.f151452d);
        return c16905q1;
    }

    @Override // hms.webrtc.Loggable
    public void onLogMessage(String str, Logging.Severity severity, String str2) {
        HMSPeerConnectionFactory.initPeerConnectionFactory$lambda$3$lambda$2(str, severity, str2);
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    @Override // o23.InterfaceC27471a
    public void onResult(AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
    }

    @Override // pf.InterfaceC29142t
    /* JADX INFO: renamed from: q */
    public AbstractC29140r mo711q(C4560o c4560o) {
        return C29138p.f117931a;
    }
}
