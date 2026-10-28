package p085d9;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.List;
import p006a4.AbstractC0354a;
import p012ab.C0682h0;
import p043c4.AbstractC3979v;
import p516u8.AbstractC34587d0;
import p516u8.C34586d;
import p516u8.C34610p;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41032j0;
import p690zr.AbstractC41047q;
import p690zr.C41009b1;
import p690zr.C41014d0;
import p690zr.C41029i0;
import p690zr.C41060w0;
import ro.C31624i;

/* JADX INFO: renamed from: d9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C11781b {

    /* JADX INFO: renamed from: c */
    public static final C11781b f38191c = new C11781b(AbstractC41023g0.m133256r(C11779a.f38173d));

    /* JADX INFO: renamed from: d */
    public static final C41060w0 f38192d;

    /* JADX INFO: renamed from: e */
    public static final C41009b1 f38193e;

    /* JADX INFO: renamed from: a */
    public final SparseArray f38194a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final int f38195b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC41047q.m133272b(3, objArr);
        f38192d = AbstractC41023g0.m133250j(3, objArr);
        C0682h0 c0682h0 = new C0682h0(4);
        c0682h0.m1704t(5, 6);
        c0682h0.m1704t(17, 6);
        c0682h0.m1704t(7, 6);
        c0682h0.m1704t(30, 10);
        c0682h0.m1704t(18, 6);
        c0682h0.m1704t(6, 8);
        c0682h0.m1704t(8, 8);
        c0682h0.m1704t(14, 8);
        f38193e = c0682h0.m1694i();
    }

    public C11781b(C41060w0 c41060w0) {
        for (int i13 = 0; i13 < c41060w0.f177069z; i13++) {
            C11779a c11779a = (C11779a) c41060w0.get(i13);
            this.f38194a.put(c11779a.f38174a, c11779a);
        }
        int iMax = 0;
        for (int i14 = 0; i14 < this.f38194a.size(); i14++) {
            iMax = Math.max(iMax, ((C11779a) this.f38194a.valueAt(i14)).f38175b);
        }
        this.f38195b = iMax;
    }

    /* JADX INFO: renamed from: a */
    public static C41060w0 m31591a(int[] iArr, int i13) {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i14 : iArr) {
            c41014d0M133251l.m133222a(new C11779a(i14, i13));
        }
        return c41014d0M133251l.m133239f();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x012a  */
    /* JADX INFO: renamed from: b */
    public static C11781b m31592b(Context context, Intent intent, C34586d c34586d, C31624i c31624i) {
        AudioManager audioManagerM113423r = AbstractC35785b.m113423r(context);
        if (c31624i == null) {
            c31624i = AbstractC38065t.f163031a >= 33 ? AbstractC3979v.m12011b(audioManagerM113423r, c34586d) : null;
        }
        int i13 = AbstractC38065t.f163031a;
        if (i13 >= 33 && (AbstractC38065t.m121895I(context) || (i13 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return AbstractC3979v.m12010a(audioManagerM113423r, c34586d);
        }
        if (i13 >= 23) {
            AudioDeviceInfo[] devices = c31624i == null ? audioManagerM113423r.getDevices(2) : new AudioDeviceInfo[]{(AudioDeviceInfo) c31624i.f130665x};
            C41029i0 c41029i0 = new C41029i0(4);
            Integer[] numArr = {8, 7};
            AbstractC41047q.m133272b(2, numArr);
            c41029i0.m133225d(2);
            System.arraycopy(numArr, 0, c41029i0.f176951a, c41029i0.f176952b, 2);
            c41029i0.f176952b += 2;
            if (i13 >= 31) {
                Integer[] numArr2 = {26, 27};
                AbstractC41047q.m133272b(2, numArr2);
                c41029i0.m133225d(2);
                System.arraycopy(numArr2, 0, c41029i0.f176951a, c41029i0.f176952b, 2);
                c41029i0.f176952b += 2;
            }
            if (i13 >= 33) {
                c41029i0.m133222a(30);
            }
            AbstractC41032j0 abstractC41032j0M133261f = c41029i0.m133261f();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (abstractC41032j0M133261f.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f38191c;
                }
            }
        }
        C41029i0 c41029i1 = new C41029i0(4);
        c41029i1.m133222a(2);
        int i14 = AbstractC38065t.f163031a;
        if (i14 >= 29 && (AbstractC38065t.m121895I(context) || (i14 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            C41060w0 c41060w0M977q = AbstractC0354a.m977q(c34586d);
            c41060w0M977q.getClass();
            c41029i1.m133224c(c41060w0M977q);
            return new C11781b(m31591a(AbstractC35903f.m113999S(c41029i1.m133261f()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z4 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z4) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    C41060w0 c41060w0 = f38192d;
                    c41060w0.getClass();
                    c41029i1.m133224c(c41060w0);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            C41060w0 c41060w1 = f38192d;
            c41060w1.getClass();
            c41029i1.m133224c(c41060w1);
        }
        if (intent == null || z4 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C11781b(m31591a(AbstractC35903f.m113999S(c41029i1.m133261f()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listM114014i = AbstractC35903f.m114014i(intArrayExtra);
            listM114014i.getClass();
            c41029i1.m133224c(listM114014i);
        }
        return new C11781b(m31591a(AbstractC35903f.m113999S(c41029i1.m133261f()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX INFO: renamed from: c */
    public static C11781b m31593c(Context context, C34586d c34586d, C31624i c31624i) {
        return m31592b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c34586d, c31624i);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX INFO: renamed from: d */
    public final Pair m31594d(C34586d c34586d, C34610p c34610p) {
        String str = c34610p.f145783n;
        str.getClass();
        int iM109371d = AbstractC34587d0.m109371d(str, c34610p.f145780k);
        Integer numValueOf = Integer.valueOf(iM109371d);
        C41009b1 c41009b1 = f38193e;
        if (!c41009b1.containsKey(numValueOf)) {
            return null;
        }
        int i13 = 6;
        SparseArray sparseArray = this.f38194a;
        if (iM109371d == 18 && !AbstractC38065t.m121916i(sparseArray, 18)) {
            iM109371d = 6;
        } else if ((iM109371d == 8 && !AbstractC38065t.m121916i(sparseArray, 8)) || (iM109371d == 30 && !AbstractC38065t.m121916i(sparseArray, 30))) {
            iM109371d = 7;
        }
        if (!AbstractC38065t.m121916i(sparseArray, iM109371d)) {
            return null;
        }
        C11779a c11779a = (C11779a) sparseArray.get(iM109371d);
        c11779a.getClass();
        int iIntValue = c11779a.f38175b;
        AbstractC41032j0 abstractC41032j0 = c11779a.f38176c;
        int i14 = c34610p.f145759D;
        boolean zContains = false;
        if (i14 == -1 || iM109371d == 18) {
            int i15 = c34610p.f145760E;
            if (i15 == -1) {
                i15 = 48000;
            }
            int i16 = c11779a.f38174a;
            if (abstractC41032j0 == null) {
                if (AbstractC38065t.f163031a >= 29) {
                    iIntValue = AbstractC0354a.m979s(i16, i15, c34586d);
                } else {
                    Object obj = c41009b1.get(Integer.valueOf(i16));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i14 = iIntValue;
        } else if (!c34610p.f145783n.equals("audio/vnd.dts.uhd;profile=p2") || AbstractC38065t.f163031a >= 33) {
            if (abstractC41032j0 != null) {
                int iM121924q = AbstractC38065t.m121924q(i14);
                if (iM121924q != 0) {
                    zContains = abstractC41032j0.contains(Integer.valueOf(iM121924q));
                }
            } else if (i14 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i14 > 10) {
            return null;
        }
        int i17 = AbstractC38065t.f163031a;
        if (i17 > 28) {
            i13 = i14;
        } else if (i14 == 7) {
            i13 = 8;
        } else if (i14 != 3 && i14 != 4 && i14 != 5) {
            i13 = i14;
        }
        if (i17 <= 26 && "fugu".equals(Build.DEVICE) && i13 == 1) {
            i13 = 2;
        }
        int iM121924q2 = AbstractC38065t.m121924q(i13);
        if (iM121924q2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM109371d), Integer.valueOf(iM121924q2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11781b)) {
            return false;
        }
        C11781b c11781b = (C11781b) obj;
        return AbstractC38065t.m121917j(this.f38194a, c11781b.f38194a) && this.f38195b == c11781b.f38195b;
    }

    public final int hashCode() {
        return (AbstractC38065t.m121918k(this.f38194a) * 31) + this.f38195b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f38195b + ", audioProfiles=" + this.f38194a + "]";
    }
}
