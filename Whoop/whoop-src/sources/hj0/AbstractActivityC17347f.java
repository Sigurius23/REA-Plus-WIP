package hj0;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.whoop.p069ui.C10594l;
import com.whoop.p069ui.ProgressBar;
import com.whoop.p069ui.WhoopToolbar;
import ge3.AbstractC15751g;
import in2.AbstractC18738j;
import nf1.AbstractC26660a;
import nf1.AbstractC26663d;
import p314m.AbstractActivityC24852m;
import p314m.AbstractC24830b;
import vu1.AbstractC36512c;
import vu1.AbstractC36513d;
import xg3.InterfaceC38293t;
import z82.C40191e;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: hj0.f */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractActivityC17347f extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: E */
    private boolean f67227E;

    /* JADX INFO: renamed from: F */
    private final InterfaceC40188b f67228F;

    /* JADX INFO: renamed from: G */
    private final C40191e f67229G;

    /* JADX INFO: renamed from: H */
    private final InterfaceC17346e f67230H;

    /* JADX INFO: renamed from: w */
    private final C10594l f67231w = new C10594l();

    /* JADX INFO: renamed from: x */
    private final C10594l f67232x = new C10594l();

    /* JADX INFO: renamed from: y */
    private WhoopToolbar f67233y;

    /* JADX INFO: renamed from: z */
    private ProgressBar f67234z;

    public AbstractActivityC17347f() {
        InterfaceC40188b interfaceC40188b = (InterfaceC40188b) AbstractC15751g.m44472y(InterfaceC40188b.class, null, null);
        this.f67228F = interfaceC40188b;
        this.f67229G = interfaceC40188b.mo128972l();
        this.f67230H = (InterfaceC17346e) AbstractC15751g.m44472y(InterfaceC17346e.class, null, null);
    }

    /* JADX INFO: renamed from: y */
    public static void m49094y(Intent intent) {
        intent.putExtra("BaseTransitionType", 1);
    }

    /* JADX INFO: renamed from: A */
    public void m49095A(WhoopToolbar whoopToolbar) {
        this.f67233y = whoopToolbar;
        setSupportActionBar(whoopToolbar);
    }

    /* JADX INFO: renamed from: B */
    public void m49096B() {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (m49103w()) {
            overridePendingTransition(AbstractC26660a.f105972q, AbstractC26660a.f105971p);
        }
        if (m49104x()) {
            overridePendingTransition(AbstractC26660a.f105974s, AbstractC26660a.f105973r);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m49097o(InterfaceC38293t interfaceC38293t) {
        this.f67231w.m27330a(interfaceC38293t);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    public void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : m49102v().f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null) {
                abstractComponentCallbacksC1320m0.onActivityResult(i13, i14, intent);
            }
        }
    }

    @Override // p314m.AbstractActivityC24852m, android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        WhoopToolbar whoopToolbar = (WhoopToolbar) findViewById(AbstractC26663d.f105992k);
        if (whoopToolbar != null) {
            m49095A(whoopToolbar);
            for (int i13 = 0; i13 < whoopToolbar.getChildCount(); i13++) {
                View childAt = whoopToolbar.getChildAt(i13);
                if (childAt instanceof TextView) {
                    AbstractC18738j.m54483a((TextView) childAt, AbstractC36513d.f156076a);
                }
            }
        }
        ProgressBar progressBar = (ProgressBar) findViewById(AbstractC26663d.f105995n);
        this.f67234z = progressBar;
        if (progressBar != null) {
            progressBar.m26654a();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f67231w.m27331b();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.f67227E || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f67230H.onActivityPaused(this);
        this.f67232x.m27331b();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f67230H.onActivityResumed(this);
        String strMo19335p = mo19335p();
        if (TextUtils.isEmpty(strMo19335p)) {
            return;
        }
        this.f67228F.mo41425g(strMo19335p);
    }

    /* JADX INFO: renamed from: p */
    public String mo19335p() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public C10594l m49098r() {
        return this.f67231w;
    }

    /* JADX INFO: renamed from: s */
    public C40191e m49099s() {
        return this.f67229G;
    }

    /* JADX INFO: renamed from: t */
    public int m49100t() {
        Intent intent = getIntent();
        if (intent == null) {
            return 0;
        }
        return intent.getIntExtra("BaseTransitionType", 0);
    }

    /* JADX INFO: renamed from: u */
    public AbstractC24830b m49101u() {
        return getSupportActionBar();
    }

    /* JADX INFO: renamed from: v */
    public AbstractC1329o1 m49102v() {
        return getSupportFragmentManager();
    }

    /* JADX INFO: renamed from: w */
    public boolean m49103w() {
        return m49100t() == 1;
    }

    /* JADX INFO: renamed from: x */
    public boolean m49104x() {
        return m49100t() == 2;
    }

    /* JADX INFO: renamed from: z */
    public void m49105z() {
        if (m49101u() != null) {
            m49101u().mo72826o(true);
            m49101u().mo72829r(AbstractC36512c.f156067j);
        }
        this.f67227E = true;
    }
}
