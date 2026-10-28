package com.google.android.gms.oss.licenses;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.whoop.android.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import la.C23548b;
import o73.C27648a;
import p314m.AbstractActivityC24852m;
import p403pp.C29406b;
import p403pp.C29408d;
import p403pp.EnumC29422r;
import p460rg.AbstractC31366a;
import p499t9.C33652u;
import p656yp.C39697d;
import p656yp.RunnableC39696c;
import so.C32800q;
import to.C33980j0;

/* JADX INFO: loaded from: classes6.dex */
public final class OssLicensesActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: F */
    public C33652u f20619F;

    /* JADX INFO: renamed from: G */
    public C32800q f20620G;

    /* JADX INFO: renamed from: w */
    public C29408d f20621w;

    /* JADX INFO: renamed from: x */
    public String f20622x = "";

    /* JADX INFO: renamed from: y */
    public ScrollView f20623y = null;

    /* JADX INFO: renamed from: z */
    public TextView f20624z = null;

    /* JADX INFO: renamed from: E */
    public int f20618E = 0;

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        AbstractC31366a.m96482v(this);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        this.f20624z = textView;
        textView.setText(getString(R.string.license_is_loading));
        this.f20619F = C33652u.m106280i(this);
        this.f20621w = (C29408d) getIntent().getParcelableExtra("license");
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo72834w(this.f20621w.f119430w);
            getSupportActionBar().mo72828q();
            getSupportActionBar().mo72826o(true);
            getSupportActionBar().mo72831t();
        }
        C32800q c32800qM106281j = C33652u.m106281j(this, this.f20619F.m106287l(getPackageName()));
        this.f20620G = c32800qM106281j;
        this.f20623y = (ScrollView) findViewById(((Resources) c32800qM106281j.f136504w).getIdentifier("license_activity_scrollview", "id", (String) c32800qM106281j.f136505x));
        C32800q c32800q = this.f20620G;
        this.f20624z = (TextView) findViewById(((Resources) c32800q.f136504w).getIdentifier("license_activity_textview", "id", (String) c32800q.f136505x));
        C33652u c33652u = this.f20619F;
        C29408d c29408d = this.f20621w;
        c33652u.getClass();
        try {
            C39697d c39697d = (C39697d) c33652u.f140441w;
            Task taskDoRead = c39697d.doRead(new C33980j0(c39697d, c29408d));
            C29406b c29406b = new C29406b();
            c29406b.f119429M = taskDoRead;
            taskDoRead.addOnCompleteListener(EnumC29422r.f119461w, new C23548b(c29406b, 26));
            str = (String) c29406b.get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            Log.w("OssLicenses", "Failed to get license detail from OssLicensesClient", e5);
            str = "";
        }
        this.f20622x = str;
        if (str == null || str.isEmpty()) {
            C29408d c29408d2 = this.f20621w;
            this.f20622x = C27648a.m83579b0(this, "third_party_licenses", c29408d2.f119431x, c29408d2.f119432y);
        }
        if (this.f20622x == null) {
            this.f20622x = getString(R.string.license_content_error);
        }
        this.f20624z.setText(this.f20622x);
        if (this.f20618E == 0) {
            return;
        }
        this.f20623y.post(new RunnableC39696c(this, 0));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f20618E = bundle.getInt("scroll_pos");
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.f20624z;
        if (textView == null || this.f20623y == null) {
            return;
        }
        bundle.putInt("scroll_pos", this.f20624z.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.f20623y.getScrollY())));
    }
}
