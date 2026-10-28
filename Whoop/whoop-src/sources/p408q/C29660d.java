package p408q;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.whoop.android.R;

/* JADX INFO: renamed from: q.d */
/* JADX INFO: loaded from: classes.dex */
public class C29660d extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f121216f;

    /* JADX INFO: renamed from: a */
    public int f121217a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f121218b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f121219c;

    /* JADX INFO: renamed from: d */
    public Configuration f121220d;

    /* JADX INFO: renamed from: e */
    public Resources f121221e;

    public C29660d(Context context, int i13) {
        super(context);
        this.f121217a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m91071a(Configuration configuration) {
        if (this.f121221e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f121220d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f121220d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m91072b() {
        if (this.f121218b == null) {
            this.f121218b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f121218b.setTo(theme);
            }
        }
        this.f121218b.applyStyle(this.f121217a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f121221e == null) {
            Configuration configuration = this.f121220d;
            if (configuration == null) {
                this.f121221e = super.getResources();
            } else {
                if (f121216f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f121216f = configuration2;
                }
                if (configuration.equals(f121216f)) {
                    this.f121221e = super.getResources();
                } else {
                    this.f121221e = createConfigurationContext(this.f121220d).getResources();
                }
            }
        }
        return this.f121221e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f121219c == null) {
            this.f121219c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f121219c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f121218b;
        if (theme != null) {
            return theme;
        }
        if (this.f121217a == 0) {
            this.f121217a = R.style.Theme_AppCompat_Light;
        }
        m91072b();
        return this.f121218b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i13) {
        if (this.f121217a != i13) {
            this.f121217a = i13;
            m91072b();
        }
    }

    public C29660d(Context context, Resources.Theme theme) {
        super(context);
        this.f121218b = theme;
    }
}
