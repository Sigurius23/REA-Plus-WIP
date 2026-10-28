package p499t9;

import android.net.Uri;
import androidx.health.platform.client.proto.C1533u;
import bb.C2917d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import la.C23550d;
import ma.C25362d;
import na.C26495h;
import na.C26498k;
import p011aa.C0590a;
import p012ab.C0669b;
import p012ab.C0673d;
import p012ab.C0674d0;
import p012ab.C0675e;
import p012ab.C0679g;
import p012ab.C0686j0;
import p249jc.C21567b;
import p362oa.C27749c;
import p380os.C28301a;
import p389p0.C28539n0;
import p481s6.AbstractC32229a;
import p517u9.C34652a;
import p548v9.C35802b;
import p607x8.C38064s;
import p642y9.C39350b;
import p675z9.C40200b;
import p690zr.AbstractC41023g0;
import p690zr.C41060w0;
import pa.C29035a;

/* JADX INFO: renamed from: t9.l */
/* JADX INFO: loaded from: classes.dex */
public final class C33640l implements InterfaceC33649r {

    /* JADX INFO: renamed from: F */
    public static final int[] f140409F = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: G */
    public static final C28539n0 f140410G = new C28539n0(new C28301a(28));

    /* JADX INFO: renamed from: H */
    public static final C28539n0 f140411H = new C28539n0(new C28301a(29));

    /* JADX INFO: renamed from: E */
    public int f140412E;

    /* JADX INFO: renamed from: w */
    public boolean f140413w;

    /* JADX INFO: renamed from: x */
    public C41060w0 f140414x;

    /* JADX INFO: renamed from: z */
    public C21567b f140416z = new C21567b(19);

    /* JADX INFO: renamed from: y */
    public boolean f140415y = true;

    /* JADX INFO: renamed from: a */
    public final void m106257a(ArrayList arrayList, int i13) {
        switch (i13) {
            case 0:
                arrayList.add(new C0669b());
                break;
            case 1:
                arrayList.add(new C0673d());
                break;
            case 2:
                arrayList.add(new C0675e(this.f140413w ? 1 : 0));
                break;
            case 3:
                arrayList.add(new C34652a(this.f140413w ? 1 : 0));
                break;
            case 4:
                InterfaceC33644n interfaceC33644nM86835e = f140410G.m86835e(0);
                if (interfaceC33644nM86835e == null) {
                    arrayList.add(new C39350b());
                } else {
                    arrayList.add(interfaceC33644nM86835e);
                }
                break;
            case 5:
                arrayList.add(new C40200b());
                break;
            case 6:
                arrayList.add(new C23550d(this.f140416z, this.f140415y ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C25362d(this.f140413w ? 1 : 0));
                break;
            case 8:
                arrayList.add(new C26495h(this.f140416z, this.f140415y ? 0 : 32));
                arrayList.add(new C26498k(this.f140416z, this.f140415y ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C27749c());
                break;
            case 10:
                arrayList.add(new C0674d0());
                break;
            case 11:
                if (this.f140414x == null) {
                    this.f140414x = AbstractC41023g0.m133254p();
                }
                arrayList.add(new C0686j0(!this.f140415y ? 1 : 0, this.f140416z, new C38064s(0L), new C0679g(this.f140414x, 0)));
                break;
            case 12:
                arrayList.add(new C2917d());
                break;
            case 14:
                arrayList.add(new C29035a(this.f140412E));
                break;
            case 15:
                InterfaceC33644n interfaceC33644nM86835e2 = f140411H.m86835e(new Object[0]);
                if (interfaceC33644nM86835e2 != null) {
                    arrayList.add(interfaceC33644nM86835e2);
                }
                break;
            case 16:
                arrayList.add(new C35802b(!this.f140415y ? 1 : 0, this.f140416z));
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                arrayList.add(new C29035a(0, (byte) 0));
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                arrayList.add(new C0590a(1));
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                arrayList.add(new C29035a(1, (byte) 0));
                break;
            case 20:
                arrayList.add(new C0590a(0));
                break;
            case 21:
                arrayList.add(new C0590a(2));
                break;
        }
    }

    @Override // p499t9.InterfaceC33649r
    /* JADX INFO: renamed from: c */
    public final synchronized InterfaceC33644n[] mo106258c(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f140409F;
            arrayList = new ArrayList(21);
            int iM100260g = AbstractC32229a.m100260g(map);
            if (iM100260g != -1) {
                m106257a(arrayList, iM100260g);
            }
            int iM100261h = AbstractC32229a.m100261h(uri);
            if (iM100261h != -1 && iM100261h != iM100260g) {
                m106257a(arrayList, iM100261h);
            }
            for (int i13 = 0; i13 < 21; i13++) {
                int i14 = iArr[i13];
                if (i14 != iM100260g && i14 != iM100261h) {
                    m106257a(arrayList, i14);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (InterfaceC33644n[]) arrayList.toArray(new InterfaceC33644n[arrayList.size()]);
    }

    @Override // p499t9.InterfaceC33649r
    /* JADX INFO: renamed from: d */
    public final synchronized InterfaceC33644n[] mo1656d() {
        return mo106258c(Uri.EMPTY, new HashMap());
    }
}
