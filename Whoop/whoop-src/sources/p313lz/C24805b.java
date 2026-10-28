package p313lz;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.C1646z1;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.room.ServiceConnectionC1767b0;
import b10.C2222b;
import com.whoop.android.R;
import gm.C15990r;
import kc3.ExecutorC22364d;
import l83.C23467m;
import m83.C25235a0;
import mz.C26035a;
import p012ab.C0684i0;
import p298l8.AbstractC23420c;
import p442qy.C30765d;
import p472ry.EnumC31905a;
import p505ts.AbstractC34132o;
import p530up.AbstractC35148d;
import p537ux.C35362x;
import p537ux.C35363y;
import p619xl.C38445a;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import v10.C35542r;

/* JADX INFO: renamed from: lz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C24805b implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97122a;

    public /* synthetic */ C24805b(int i13) {
        this.f97122a = i13;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class cls, AbstractC23420c extras) {
        Object objM107888l;
        int i13 = this.f97122a;
        AbstractC22676k.m65750j(extras, "extras");
        switch (i13) {
            case 0:
                C1601k1 c1601k1M5015e = AbstractC1613o1.m5015e(extras);
                Object objMo67910a = extras.mo67910a(C1646z1.f6353d);
                AbstractC22676k.m65748h(objMo67910a, "null cannot be cast to non-null type android.content.Context");
                String packageName = ((Context) objMo67910a).getPackageName();
                AbstractC22676k.m65749i(packageName, "getPackageName(...)");
                C29938w0 c29938w0 = C26035a.f103013a;
                C30765d c30765d = C26035a.f103016d;
                ExecutorC22364d executorC22364d = C26035a.f103015c;
                return new C24812i(c30765d, c1601k1M5015e, new C38445a(new C15990r(new C0684i0(executorC22364d, c30765d, 14), C26035a.f103014b, c30765d), C26035a.f103013a), executorC22364d, packageName);
            default:
                Application applicationM111160K = AbstractC35148d.m111160K(extras);
                C1601k1 c1601k1M5015e2 = AbstractC1613o1.m5015e(extras);
                C35363y c35363y = C35363y.f150632y;
                if (c35363y == null) {
                    SharedPreferences sharedPreferences = new C35362x(applicationM111160K).f150631a;
                    String string = sharedPreferences.getString("key_publishable_key", null);
                    c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                    if (c35363y == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y;
                }
                C39865j c39865j = new C39865j();
                C2222b c2222b = new C2222b(applicationM111160K, C25235a0.f99113w, c35363y.f150633w);
                try {
                    ServiceConnectionC1767b0 serviceConnectionC1767b0 = new ServiceConnectionC1767b0();
                    serviceConnectionC1767b0.f6963x = applicationM111160K.getApplicationContext();
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty("com.android.chrome")) {
                        intent.setPackage("com.android.chrome");
                    }
                    objM107888l = Boolean.valueOf(applicationM111160K.bindService(intent, serviceConnectionC1767b0, 33));
                    break;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                Object obj = Boolean.FALSE;
                if (objM107888l instanceof C23467m) {
                    objM107888l = obj;
                }
                EnumC31905a enumC31905a = ((Boolean) objM107888l).booleanValue() ? EnumC31905a.f132445w : EnumC31905a.f132446x;
                String string2 = applicationM111160K.getString(R.string.stripe_failure_reason_authentication);
                AbstractC22676k.m65749i(string2, "getString(...)");
                return new C35542r(c39865j, c2222b, enumC31905a, string2, c1601k1M5015e2);
        }
    }
}
