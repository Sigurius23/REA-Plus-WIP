package qa;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import in.C18715c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import mo.C25721b;
import nh3.AbstractC26725a;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24548f;
import p309lo.C24562t;
import p309lo.InterfaceC24550h;
import p309lo.InterfaceC24551i;
import p440qw.C30679n;
import p440qw.InterfaceC30680o;
import p465rm.AbstractC31530f0;
import p465rm.AbstractC31531f1;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p465rm.C31524d0;
import p465rm.C31527e0;
import p465rm.C31533g0;
import p465rm.C31536h0;
import p465rm.C31540i1;
import p465rm.C31545k0;
import p465rm.C31546k1;
import p465rm.C31548l0;
import p465rm.C31551m0;
import p465rm.C31552m1;
import p465rm.C31555n1;
import p465rm.C31561p1;
import p465rm.C31571u;
import p465rm.C31572u0;
import p465rm.C31580y0;
import p465rm.InterfaceC31526e;
import p465rm.InterfaceC31529f;
import p465rm.InterfaceC31582z0;
import p543v4.C35643b;
import p556vm.C36136c;
import p658yr.InterfaceC39718e;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import sm.C32711d;
import sn.C32766w0;
import tn.C33956b;

/* JADX INFO: renamed from: qa.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C30097b implements InterfaceC39718e, InterfaceC30680o, InterfaceC24550h, InterfaceC24551i, InterfaceC31526e, InterfaceC16915u {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122822w;

    public /* synthetic */ C30097b(int i13) {
        this.f122822w = i13;
    }

    @Override // p309lo.InterfaceC24551i
    /* JADX INFO: renamed from: a */
    public void mo71596a(Object obj, C24548f c24548f) {
        ((InterfaceC31582z0) obj).mo61755k(new C31580y0(c24548f));
    }

    @Override // p658yr.InterfaceC39718e
    public Object apply(Object obj) {
        switch (this.f122822w) {
            case 0:
                long j7 = ((C30096a) obj).f122819b;
                if (j7 == -9223372036854775807L) {
                    j7 = 0;
                }
                return Long.valueOf(j7);
            default:
                return new C32711d((C24562t) obj);
        }
    }

    @Override // p440qw.InterfaceC30680o
    public Object construct() {
        switch (this.f122822w) {
            case 1:
                return new C30679n(true);
            case 2:
                return new ArrayDeque();
            case 3:
                return new LinkedHashMap();
            case 4:
                return new TreeMap();
            case 5:
                return new ConcurrentHashMap();
            case 6:
                return new ConcurrentSkipListMap();
            case 7:
                return new ArrayList();
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeSet();
        }
    }

    @Override // p465rm.InterfaceC31526e
    /* JADX INFO: renamed from: e */
    public InterfaceC31529f mo52217e(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        C32766w0 c32766w0;
        boolean z4 = true;
        switch (this.f122822w) {
            case 15:
                C31521c0 c31521c0 = C31521c0.f130068g0;
                C31518b0 c31518b0 = new C31518b0();
                if (bundle != null) {
                    ClassLoader classLoader = AbstractC24543a.class.getClassLoader();
                    int i13 = AbstractC24567y.f95875a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                String str = c31521c0.f130098w;
                if (string == null) {
                    string = str;
                }
                c31518b0.f130037a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                String str2 = c31521c0.f130099x;
                if (string2 == null) {
                    string2 = str2;
                }
                c31518b0.f130038b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                String str3 = c31521c0.f130100y;
                if (string3 == null) {
                    string3 = str3;
                }
                c31518b0.f130039c = string3;
                c31518b0.f130040d = bundle.getInt(Integer.toString(3, 36), c31521c0.f130101z);
                c31518b0.f130041e = bundle.getInt(Integer.toString(4, 36), c31521c0.f130070E);
                c31518b0.f130042f = bundle.getInt(Integer.toString(5, 36), c31521c0.f130071F);
                c31518b0.f130043g = bundle.getInt(Integer.toString(6, 36), c31521c0.f130072G);
                String string4 = bundle.getString(Integer.toString(7, 36));
                String str4 = c31521c0.f130074I;
                if (string4 == null) {
                    string4 = str4;
                }
                c31518b0.f130044h = string4;
                C18715c c18715c = (C18715c) bundle.getParcelable(Integer.toString(8, 36));
                C18715c c18715c2 = c31521c0.f130075J;
                if (c18715c == null) {
                    c18715c = c18715c2;
                }
                c31518b0.f130045i = c18715c;
                String string5 = bundle.getString(Integer.toString(9, 36));
                String str5 = c31521c0.f130076K;
                if (string5 == null) {
                    string5 = str5;
                }
                c31518b0.f130046j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                String str6 = c31521c0.f130077L;
                if (string6 == null) {
                    string6 = str6;
                }
                c31518b0.f130047k = string6;
                c31518b0.f130048l = bundle.getInt(Integer.toString(11, 36), c31521c0.f130078M);
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                while (true) {
                    String string7 = Integer.toString(12, 36);
                    String string8 = Integer.toString(i14, 36);
                    StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(AbstractC30007c.m91832b(1, string7), string8));
                    sb4.append(string7);
                    sb4.append("_");
                    sb4.append(string8);
                    byte[] byteArray = bundle.getByteArray(sb4.toString());
                    if (byteArray == null) {
                        c31518b0.f130049m = arrayList;
                        c31518b0.f130050n = (C36136c) bundle.getParcelable(Integer.toString(13, 36));
                        c31518b0.f130051o = bundle.getLong(Integer.toString(14, 36), c31521c0.f130081P);
                        c31518b0.f130052p = bundle.getInt(Integer.toString(15, 36), c31521c0.f130082Q);
                        c31518b0.f130053q = bundle.getInt(Integer.toString(16, 36), c31521c0.f130083R);
                        c31518b0.f130054r = bundle.getFloat(Integer.toString(17, 36), c31521c0.f130084S);
                        c31518b0.f130055s = bundle.getInt(Integer.toString(18, 36), c31521c0.f130085T);
                        c31518b0.f130056t = bundle.getFloat(Integer.toString(19, 36), c31521c0.f130086U);
                        c31518b0.f130057u = bundle.getByteArray(Integer.toString(20, 36));
                        c31518b0.f130058v = bundle.getInt(Integer.toString(21, 36), c31521c0.f130088W);
                        Bundle bundle4 = bundle.getBundle(Integer.toString(22, 36));
                        c31518b0.f130059w = bundle4 == null ? null : new C25721b(bundle4.getInt(Integer.toString(0, 36), -1), bundle4.getInt(Integer.toString(1, 36), -1), bundle4.getInt(Integer.toString(2, 36), -1), bundle4.getByteArray(Integer.toString(3, 36)));
                        c31518b0.f130060x = bundle.getInt(Integer.toString(23, 36), c31521c0.f130090Y);
                        c31518b0.f130061y = bundle.getInt(Integer.toString(24, 36), c31521c0.f130091Z);
                        c31518b0.f130062z = bundle.getInt(Integer.toString(25, 36), c31521c0.f130092a0);
                        c31518b0.f130033A = bundle.getInt(Integer.toString(26, 36), c31521c0.f130093b0);
                        c31518b0.f130034B = bundle.getInt(Integer.toString(27, 36), c31521c0.f130094c0);
                        c31518b0.f130035C = bundle.getInt(Integer.toString(28, 36), c31521c0.f130095d0);
                        c31518b0.f130036D = bundle.getInt(Integer.toString(29, 36), c31521c0.f130096e0);
                        return new C31521c0(c31518b0);
                    }
                    arrayList.add(byteArray);
                    i14++;
                }
                break;
            case 16:
                AbstractC24543a.m71569e(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new C31524d0(bundle.getBoolean(Integer.toString(2, 36), false)) : new C31524d0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                String string9 = bundle.getString(Integer.toString(0, 36), "");
                string9.getClass();
                Bundle bundle5 = bundle.getBundle(Integer.toString(1, 36));
                C31536h0 c31536h0 = bundle5 == null ? C31536h0.f130161F : new C31536h0(bundle5.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle5.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle5.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                Bundle bundle6 = bundle.getBundle(Integer.toString(2, 36));
                C31551m0 c31551m0 = bundle6 == null ? C31551m0.f130246h0 : (C31551m0) C31551m0.f130247i0.mo52217e(bundle6);
                Bundle bundle7 = bundle.getBundle(Integer.toString(3, 36));
                return new C31545k0(string9, bundle7 == null ? C31533g0.f130149G : (C31533g0) AbstractC31530f0.f130139F.mo52217e(bundle7), null, c31536h0, c31551m0);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C31527e0 c31527e0 = new C31527e0();
                long j7 = bundle.getLong(Integer.toString(0, 36), 0L);
                AbstractC24543a.m71569e(j7 >= 0);
                c31527e0.f130125a = j7;
                long j13 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j13 != Long.MIN_VALUE && j13 < 0) {
                    z4 = false;
                }
                AbstractC24543a.m71569e(z4);
                c31527e0.f130126b = j13;
                c31527e0.f130127c = bundle.getBoolean(Integer.toString(2, 36), false);
                c31527e0.f130128d = bundle.getBoolean(Integer.toString(3, 36), false);
                c31527e0.f130129e = bundle.getBoolean(Integer.toString(4, 36), false);
                return new C31533g0(c31527e0);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C31536h0(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
            case 20:
                C31548l0 c31548l0 = new C31548l0();
                c31548l0.f130219a = bundle.getCharSequence(Integer.toString(0, 36));
                c31548l0.f130220b = bundle.getCharSequence(Integer.toString(1, 36));
                c31548l0.f130221c = bundle.getCharSequence(Integer.toString(2, 36));
                c31548l0.f130222d = bundle.getCharSequence(Integer.toString(3, 36));
                c31548l0.f130223e = bundle.getCharSequence(Integer.toString(4, 36));
                c31548l0.f130224f = bundle.getCharSequence(Integer.toString(5, 36));
                c31548l0.f130225g = bundle.getCharSequence(Integer.toString(6, 36));
                c31548l0.f130226h = (Uri) bundle.getParcelable(Integer.toString(7, 36));
                byte[] byteArray2 = bundle.getByteArray(Integer.toString(10, 36));
                Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
                c31548l0.f130229k = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                c31548l0.f130230l = numValueOf;
                c31548l0.f130231m = (Uri) bundle.getParcelable(Integer.toString(11, 36));
                c31548l0.f130242x = bundle.getCharSequence(Integer.toString(22, 36));
                c31548l0.f130243y = bundle.getCharSequence(Integer.toString(23, 36));
                c31548l0.f130244z = bundle.getCharSequence(Integer.toString(24, 36));
                c31548l0.f130215C = bundle.getCharSequence(Integer.toString(27, 36));
                c31548l0.f130216D = bundle.getCharSequence(Integer.toString(28, 36));
                c31548l0.f130217E = bundle.getCharSequence(Integer.toString(30, 36));
                c31548l0.f130218F = bundle.getBundle(Integer.toString(1000, 36));
                boolean zContainsKey = bundle.containsKey(Integer.toString(8, 36));
                C30097b c30097b = AbstractC31531f1.f130145w;
                if (zContainsKey && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
                    c31548l0.f130227i = (AbstractC31531f1) c30097b.mo52217e(bundle3);
                }
                if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
                    c31548l0.f130228j = (AbstractC31531f1) c30097b.mo52217e(bundle2);
                }
                if (bundle.containsKey(Integer.toString(12, 36))) {
                    c31548l0.f130232n = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
                }
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    c31548l0.f130233o = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
                }
                if (bundle.containsKey(Integer.toString(14, 36))) {
                    c31548l0.f130234p = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
                }
                if (bundle.containsKey(Integer.toString(15, 36))) {
                    c31548l0.f130235q = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
                }
                if (bundle.containsKey(Integer.toString(16, 36))) {
                    c31548l0.f130236r = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
                }
                if (bundle.containsKey(Integer.toString(17, 36))) {
                    c31548l0.f130237s = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
                }
                if (bundle.containsKey(Integer.toString(18, 36))) {
                    c31548l0.f130238t = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
                }
                if (bundle.containsKey(Integer.toString(19, 36))) {
                    c31548l0.f130239u = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
                }
                if (bundle.containsKey(Integer.toString(20, 36))) {
                    c31548l0.f130240v = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
                }
                if (bundle.containsKey(Integer.toString(21, 36))) {
                    c31548l0.f130241w = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
                }
                if (bundle.containsKey(Integer.toString(25, 36))) {
                    c31548l0.f130213A = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
                }
                if (bundle.containsKey(Integer.toString(26, 36))) {
                    c31548l0.f130214B = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
                }
                return new C31551m0(c31548l0);
            case 21:
                AbstractC24543a.m71569e(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                float f13 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                return f13 == -1.0f ? new C31572u0() : new C31572u0(f13);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int i15 = bundle.getInt(Integer.toString(0, 36), -1);
                if (i15 == 0) {
                    AbstractC24543a.m71569e(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                    return bundle.getBoolean(Integer.toString(1, 36), false) ? new C31524d0(bundle.getBoolean(Integer.toString(2, 36), false)) : new C31524d0();
                }
                if (i15 == 1) {
                    AbstractC24543a.m71569e(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                    float f14 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                    return f14 == -1.0f ? new C31572u0() : new C31572u0(f14);
                }
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalArgumentException(AbstractC31061c.m95634j(31, i15, "Unknown RatingType: "));
                    }
                    AbstractC24543a.m71569e(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                    return bundle.getBoolean(Integer.toString(1, 36), false) ? new C31546k1(bundle.getBoolean(Integer.toString(2, 36), false)) : new C31546k1();
                }
                AbstractC24543a.m71569e(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                int i16 = bundle.getInt(Integer.toString(1, 36), 5);
                float f15 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f15 == -1.0f ? new C31540i1(i16) : new C31540i1(i16, f15);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC24543a.m71569e(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                int i17 = bundle.getInt(Integer.toString(1, 36), 5);
                float f16 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f16 == -1.0f ? new C31540i1(i17) : new C31540i1(i17, f16);
            case 24:
                AbstractC24543a.m71569e(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new C31546k1(bundle.getBoolean(Integer.toString(2, 36), false)) : new C31546k1();
            case 25:
                int i18 = bundle.getInt(Integer.toString(0, 36), 0);
                long j14 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
                long j15 = bundle.getLong(Integer.toString(2, 36), 0L);
                boolean z13 = bundle.getBoolean(Integer.toString(3, 36));
                Bundle bundle8 = bundle.getBundle(Integer.toString(4, 36));
                C33956b c33956b = bundle8 != null ? (C33956b) C33956b.f142380H.mo52217e(bundle8) : C33956b.f142378F;
                C31552m1 c31552m1 = new C31552m1();
                c31552m1.m97157h(null, null, i18, j14, j15, c33956b, z13);
                return c31552m1;
            case 26:
                Bundle bundle9 = bundle.getBundle(Integer.toString(1, 36));
                C31545k0 c31545k0 = bundle9 != null ? (C31545k0) C31545k0.f130203F.mo52217e(bundle9) : null;
                long j16 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
                long j17 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
                long j18 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
                boolean z14 = bundle.getBoolean(Integer.toString(5, 36), false);
                boolean z15 = bundle.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle10 = bundle.getBundle(Integer.toString(7, 36));
                C31536h0 c31536h1 = bundle10 != null ? new C31536h0(bundle10.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle10.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle10.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle10.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle10.getFloat(Integer.toString(4, 36), -3.4028235E38f)) : null;
                boolean z16 = bundle.getBoolean(Integer.toString(8, 36), false);
                long j19 = bundle.getLong(Integer.toString(9, 36), 0L);
                long j24 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
                int i19 = bundle.getInt(Integer.toString(11, 36), 0);
                int i24 = bundle.getInt(Integer.toString(12, 36), 0);
                long j25 = bundle.getLong(Integer.toString(13, 36), 0L);
                C31555n1 c31555n1 = new C31555n1();
                c31555n1.m97167b(C31555n1.f130307S, c31545k0, null, j16, j17, j18, z14, z15, c31536h1, j19, j24, i19, i24, j25);
                c31555n1.f130316L = z16;
                return c31555n1;
            default:
                Bundle bundle11 = bundle.getBundle(Integer.toString(0, 36));
                if (bundle11 == null) {
                    c32766w0 = null;
                } else {
                    C30097b c30097b2 = C31521c0.f130069h0;
                    ArrayList parcelableArrayList = bundle11.getParcelableArrayList(Integer.toString(0, 36));
                    C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                    C41060w0 c41060w0M71581q = C41060w0.f177067E;
                    if (parcelableArrayList != null) {
                        c41060w0M71581q = AbstractC24543a.m71581q(c30097b2, parcelableArrayList);
                    }
                    c32766w0 = new C32766w0(bundle11.getString(Integer.toString(1, 36), ""), (C31521c0[]) c41060w0M71581q.toArray(new C31521c0[0]));
                }
                c32766w0.getClass();
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                int i25 = c32766w0.f136260w;
                int[] iArr = new int[i25];
                if (intArray == null) {
                    intArray = iArr;
                }
                int i26 = bundle.getInt(Integer.toString(2, 36), -1);
                boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
                boolean[] zArr = new boolean[i25];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new C31561p1(c32766w0, intArray, i26, booleanArray);
        }
    }

    @Override // p309lo.InterfaceC24550h
    public void invoke(Object obj) {
        switch (this.f122822w) {
            case 11:
                ((InterfaceC31582z0) obj).mo97312n(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                return;
            case 12:
            default:
                throw AbstractC26725a.m79500d(obj);
            case 13:
                ((InterfaceC31582z0) obj).mo97311m();
                return;
            case 14:
                ((InterfaceC31582z0) obj).onRenderedFirstFrame();
                return;
        }
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        int i13 = PaymentAuthWebViewActivity.f22551E;
        AbstractC22676k.m65750j(view, "view");
        C35643b c35643bMo47530g = c16905q1.f64864a.mo47530g(7);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        view.setPaddingRelative(c35643bMo47530g.f151452d, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        return C16905q1.f64863b;
    }

    public /* synthetic */ C30097b(C31571u c31571u) {
        this.f122822w = 12;
    }
}
