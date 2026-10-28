package p537ux;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.text.Layout;
import android.view.View;
import b23.C2343i;
import b23.EnumC2341g;
import bz.C3709h;
import com.google.android.gms.tasks.Task;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.whoop.community.CommunityLandingHostFragment;
import k83.InterfaceC22297a;
import me3.InterfaceC25479b;
import p073cq.InterfaceC11033b;
import p170g8.C15557a;
import p170g8.InterfaceC15559c;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p465rm.InterfaceC31526e;
import p465rm.InterfaceC31529f;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33649r;
import p543v4.C35643b;
import p621xn.C38465b;
import p642y9.C39350b;
import p675z9.C40200b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y33.C39200c;

/* JADX INFO: renamed from: ux.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C35331f0 implements InterfaceC16915u, InterfaceC31526e, InterfaceC25479b, InterfaceC33649r, InterfaceC22297a, InterfaceC11033b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150533w;

    public /* synthetic */ C35331f0(int i13) {
        this.f150533w = i13;
    }

    /* JADX INFO: renamed from: b */
    public static Integer m112187b(IInterface iInterface) {
        C15557a c15557a = (C15557a) ((InterfaceC15559c) iInterface);
        c15557a.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
            c15557a.f58385f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return Integer.valueOf(parcelObtain2.readInt());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p073cq.InterfaceC11033b
    /* JADX INFO: renamed from: a */
    public Object mo11178a(Task task) {
        return 403;
    }

    @Override // p499t9.InterfaceC33649r
    /* JADX INFO: renamed from: d */
    public InterfaceC33644n[] mo1656d() {
        switch (this.f150533w) {
            case 12:
                return new InterfaceC33644n[]{new C39350b()};
            default:
                return new InterfaceC33644n[]{new C40200b()};
        }
    }

    @Override // p465rm.InterfaceC31526e
    /* JADX INFO: renamed from: e */
    public InterfaceC31529f mo52217e(Bundle bundle) {
        float f13;
        int i13;
        float f14;
        int i14;
        int i15;
        boolean z4;
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            f13 = bundle.getFloat(Integer.toString(4, 36));
            i13 = bundle.getInt(Integer.toString(5, 36));
        } else {
            f13 = -3.4028235E38f;
            i13 = Integer.MIN_VALUE;
        }
        int i16 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
        float f15 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i17 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            f14 = bundle.getFloat(Integer.toString(10, 36));
            i14 = bundle.getInt(Integer.toString(9, 36));
        } else {
            f14 = -3.4028235E38f;
            i14 = Integer.MIN_VALUE;
        }
        float f16 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f17 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle.containsKey(Integer.toString(13, 36))) {
            i15 = bundle.getInt(Integer.toString(13, 36));
            z4 = true;
        } else {
            i15 = -16777216;
            z4 = false;
        }
        return new C38465b(charSequence2, alignment2, alignment4, bitmap2, f13, i13, i16, f15, i17, i14, f14, f16, f17, !bundle.getBoolean(Integer.toString(14, 36), false) ? false : z4, i15, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public boolean m112188f() {
        return false;
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        return C3709h.f15162a;
    }

    @Override // me3.InterfaceC25479b
    public void log(String it) {
        AbstractC22676k.m65750j(it, "it");
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        C2343i c2343i = C2343i.f9269a;
        if (C2343i.f9272d.isLoggable(enumC2341g, "Video:Http")) {
            C2343i.f9271c.log(enumC2341g, "Video:Http", it, null);
        }
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        switch (this.f150533w) {
            case 1:
                int i13 = StripeBrowserLauncherActivity.f22350x;
                AbstractC22676k.m65750j(view, "view");
                C35643b c35643bMo47530g = c16905q1.f64864a.mo47530g(7);
                AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
                view.setPaddingRelative(c35643bMo47530g.f151452d, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
                return C16905q1.f64863b;
            default:
                return CommunityLandingHostFragment.m18906E1(view, c16905q1);
        }
    }

    public /* synthetic */ C35331f0(C39200c c39200c) {
        this.f150533w = 11;
    }
}
