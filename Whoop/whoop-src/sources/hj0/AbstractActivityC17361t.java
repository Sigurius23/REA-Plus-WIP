package hj0;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import e50.C12723b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC11266d;
import p167g5.C15483b;
import qr2.AbstractC30556a;

/* JADX INFO: renamed from: hj0.t */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"Registered"})
public abstract class AbstractActivityC17361t extends AbstractActivityC17347f {

    /* JADX INFO: renamed from: hj0.t$a */
    /* JADX INFO: loaded from: classes7.dex */
    public class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ String f67279w;

        public a(String str) {
            this.f67279w = str;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
            if (AbstractActivityC17361t.this.m49159G(this.f67279w)) {
                AbstractActivityC17361t.this.getWindow().getDecorView().removeOnLayoutChangeListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: hj0.t$b */
    /* JADX INFO: loaded from: classes7.dex */
    public static abstract class b<S extends c> extends C17358q {
        public b(Context context, Class<?> cls) {
            super(context, cls);
        }

        /* JADX INFO: renamed from: q */
        public C17358q m49162q(ActivityOptionsCompat activityOptionsCompat) {
            m49152k(activityOptionsCompat);
            return this;
        }

        public b(Context context, Intent intent) {
            super(context, intent);
        }
    }

    /* JADX INFO: renamed from: hj0.t$c */
    /* JADX INFO: loaded from: classes7.dex */
    public static class c<I extends b> {

        /* JADX INFO: renamed from: a */
        private I f67281a;

        /* JADX INFO: renamed from: b */
        private Activity f67282b;

        /* JADX INFO: renamed from: c */
        private HashMap<String, View> f67283c = new HashMap<>();

        public c(Activity activity, I i13) {
            this.f67282b = activity;
            this.f67281a = i13;
        }

        /* JADX INFO: renamed from: a */
        public I m49163a() {
            ArrayList arrayList = new ArrayList(this.f67283c.size());
            for (Map.Entry<String, View> entry : this.f67283c.entrySet()) {
                String key = entry.getKey();
                View value = entry.getValue();
                if (value != null) {
                    arrayList.add(new C15483b(value, key));
                } else {
                    C12723b.m35566a().m35569d().mo85215f("Transition Builder", "Null view while building transition", new NullPointerException(AbstractC11266d.m30461o("No view found for name: ", key)), new AbstractC30556a.a[0]);
                }
            }
            return (I) this.f67281a.m49162q(ActivityOptionsCompat.makeSceneTransitionAnimation(this.f67282b, (C15483b[]) arrayList.toArray(new C15483b[arrayList.size()])));
        }

        /* JADX INFO: renamed from: b */
        public void m49164b(String str, View view) {
            this.f67283c.put(str, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public boolean m49159G(String str) {
        View viewM49160E = m49160E();
        if (viewM49160E == null) {
            return false;
        }
        viewM49160E.setTransitionName(str);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public View m49160E() {
        return getWindow().getDecorView().findViewById(R.id.navigationBarBackground);
    }

    /* JADX INFO: renamed from: F */
    public void m49161F(String str) {
        if (m49159G(str)) {
            return;
        }
        getWindow().getDecorView().addOnLayoutChangeListener(new a(str));
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().requestFeature(13);
        getWindow().setSharedElementsUseOverlay(false);
        super.onCreate(bundle);
    }
}
