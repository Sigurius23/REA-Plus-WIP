package com.google.android.gms.oss.licenses;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.C1271a;
import com.whoop.android.R;
import java.io.IOException;
import java.io.InputStream;
import p000.AbstractC30802r;
import p314m.AbstractActivityC24852m;
import p460rg.AbstractC31366a;
import p499t9.C33652u;
import p656yp.C39695b;
import p656yp.C39699f;
import so.C32800q;

/* JADX INFO: loaded from: classes6.dex */
public final class OssLicensesMenuActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: y */
    public static String f20625y;

    /* JADX INFO: renamed from: w */
    public boolean f20626w;

    /* JADX INFO: renamed from: x */
    public C33652u f20627x;

    /* JADX INFO: renamed from: o */
    public static boolean m15635o(OssLicensesMenuActivity ossLicensesMenuActivity, String str) {
        InputStream inputStreamOpenRawResource = null;
        try {
            Resources resources = ossLicensesMenuActivity.getResources();
            inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.license_list)));
            boolean z4 = inputStreamOpenRawResource.available() > 0;
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
            return z4;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th3) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused4) {
                }
            }
            throw th3;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20627x = C33652u.m106280i(this);
        AbstractC31366a.m96482v(this);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        boolean z4 = false;
        if (m15635o(this, "third_party_licenses") && m15635o(this, "third_party_license_metadata")) {
            z4 = true;
        }
        this.f20626w = z4;
        if (f20625y == null) {
            Intent intent = getIntent();
            if (intent.hasExtra("title")) {
                f20625y = intent.getStringExtra("title");
                Log.w("OssLicensesMenuActivity", "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead.");
            }
        }
        String str = f20625y;
        if (str != null) {
            setTitle(str);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo72826o(true);
        }
        String strM106287l = this.f20627x.m106287l(getPackageName());
        C32800q c32800qM106281j = C33652u.m106281j(this, strM106287l);
        String str2 = (String) c32800qM106281j.f136505x;
        Resources resources = (Resources) c32800qM106281j.f136504w;
        if (!this.f20626w) {
            if (bundle == null) {
                C33652u.m106280i(this);
                int identifier = resources.getIdentifier("license_fragment_container", "id", str2);
                if (((C39695b) getSupportFragmentManager().m4139D(identifier)) == null) {
                    C39695b c39695b = new C39695b();
                    AbstractC1329o1 supportFragmentManager = getSupportFragmentManager();
                    C1271a c1271aM94758g = AbstractC30802r.m94758g(supportFragmentManager, supportFragmentManager);
                    c1271aM94758g.mo4042d(identifier, c39695b, null, 1);
                    c1271aM94758g.m4048l();
                    return;
                }
                return;
            }
            return;
        }
        if (bundle == null) {
            C33652u.m106280i(this);
            int identifier2 = resources.getIdentifier("license_fragment_container", "id", str2);
            if (((C39699f) getSupportFragmentManager().m4139D(identifier2)) == null) {
                C39699f c39699f = new C39699f();
                if (strM106287l != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("license_activity_package_name", strM106287l);
                    c39699f.setArguments(bundle2);
                }
                AbstractC1329o1 supportFragmentManager2 = getSupportFragmentManager();
                C1271a c1271aM94758g2 = AbstractC30802r.m94758g(supportFragmentManager2, supportFragmentManager2);
                c1271aM94758g2.mo4042d(identifier2, c39699f, null, 1);
                c1271aM94758g2.m4048l();
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
