package p314m;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.app.TaskStackBuilder;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.room.AbstractC1772c1;
import androidx.room.ExecutorC1834u1;
import g73.C15553a;
import p002a0.C0062y;
import p029b5.C2728g;
import p408q.AbstractC29658b;
import p408q.C29660d;
import p408q.C29666j;
import p408q.InterfaceC29657a;
import p474s.AbstractC32019v2;
import p474s.C31943c2;
import p474s.C31992p;
import p505ts.AbstractC34132o;
import p513u4.AbstractC34514b;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: m.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC24852m extends AbstractActivityC1340r0 implements InterfaceC24854n, TaskStackBuilder.SupportParentable {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC24858q mDelegate;
    private Resources mResources;

    public AbstractActivityC24852m() {
        getSavedStateRegistry().m88293c(DELEGATE_TAG, new C24848k(this));
        addOnContextAvailableListener(new C24850l(this));
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m72856n();
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) getDelegate();
        layoutInflaterFactory2C24829a0.m72784B();
        ((ViewGroup) layoutInflaterFactory2C24829a0.f97225a0.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C24829a0.f97211M.m72894a(layoutInflaterFactory2C24829a0.f97210L.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0143  */
    /* JADX WARN: Code duplicated, block: B:83:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0162  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        C29660d c29660d;
        float f13;
        float f14;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) getDelegate();
        layoutInflaterFactory2C24829a0.f97239o0 = true;
        int i69 = layoutInflaterFactory2C24829a0.f97243s0;
        if (i69 == -100) {
            i69 = AbstractC24858q.f97383x;
        }
        int iM72789G = layoutInflaterFactory2C24829a0.m72789G(context, i69);
        if (AbstractC24858q.m72882h(context)) {
            AbstractC24858q.m72884r(context);
        }
        C2728g c2728gM72781u = LayoutInflaterFactory2C24829a0.m72781u(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C24829a0.m72782y(context, iM72789G, c2728gM72781u, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof C29660d) {
                    try {
                        ((C29660d) context).m91071a(LayoutInflaterFactory2C24829a0.m72782y(context, iM72789G, c2728gM72781u, null, false));
                    } catch (IllegalStateException unused2) {
                        if (LayoutInflaterFactory2C24829a0.f97200J0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f13 = configuration.fontScale;
                                    f14 = configuration2.fontScale;
                                    if (f13 != f14) {
                                        configuration3.fontScale = f14;
                                    }
                                    i13 = configuration.mcc;
                                    i14 = configuration2.mcc;
                                    if (i13 != i14) {
                                        configuration3.mcc = i14;
                                    }
                                    i15 = configuration.mnc;
                                    i16 = configuration2.mnc;
                                    if (i15 != i16) {
                                        configuration3.mnc = i16;
                                    }
                                    AbstractC24862u.m72887a(configuration, configuration2, configuration3);
                                    i17 = configuration.touchscreen;
                                    i18 = configuration2.touchscreen;
                                    if (i17 != i18) {
                                        configuration3.touchscreen = i18;
                                    }
                                    i19 = configuration.keyboard;
                                    i24 = configuration2.keyboard;
                                    if (i19 != i24) {
                                        configuration3.keyboard = i24;
                                    }
                                    i25 = configuration.keyboardHidden;
                                    i26 = configuration2.keyboardHidden;
                                    if (i25 != i26) {
                                        configuration3.keyboardHidden = i26;
                                    }
                                    i27 = configuration.navigation;
                                    i28 = configuration2.navigation;
                                    if (i27 != i28) {
                                        configuration3.navigation = i28;
                                    }
                                    i29 = configuration.navigationHidden;
                                    i34 = configuration2.navigationHidden;
                                    if (i29 != i34) {
                                        configuration3.navigationHidden = i34;
                                    }
                                    i35 = configuration.orientation;
                                    i36 = configuration2.orientation;
                                    if (i35 != i36) {
                                        configuration3.orientation = i36;
                                    }
                                    i37 = configuration.screenLayout & 15;
                                    i38 = configuration2.screenLayout & 15;
                                    if (i37 != i38) {
                                        configuration3.screenLayout |= i38;
                                    }
                                    i39 = configuration.screenLayout & 192;
                                    i44 = configuration2.screenLayout & 192;
                                    if (i39 != i44) {
                                        configuration3.screenLayout |= i44;
                                    }
                                    i45 = configuration.screenLayout & 48;
                                    i46 = configuration2.screenLayout & 48;
                                    if (i45 != i46) {
                                        configuration3.screenLayout |= i46;
                                    }
                                    i47 = configuration.screenLayout & 768;
                                    i48 = configuration2.screenLayout & 768;
                                    if (i47 != i48) {
                                        configuration3.screenLayout |= i48;
                                    }
                                    AbstractC37978j.m121665z(configuration, configuration2, configuration3);
                                    i49 = configuration.uiMode & 15;
                                    i54 = configuration2.uiMode & 15;
                                    if (i49 != i54) {
                                        configuration3.uiMode |= i54;
                                    }
                                    i55 = configuration.uiMode & 48;
                                    i56 = configuration2.uiMode & 48;
                                    if (i55 != i56) {
                                        configuration3.uiMode |= i56;
                                    }
                                    i57 = configuration.screenWidthDp;
                                    i58 = configuration2.screenWidthDp;
                                    if (i57 != i58) {
                                        configuration3.screenWidthDp = i58;
                                    }
                                    i59 = configuration.screenHeightDp;
                                    i64 = configuration2.screenHeightDp;
                                    if (i59 != i64) {
                                        configuration3.screenHeightDp = i64;
                                    }
                                    i65 = configuration.smallestScreenWidthDp;
                                    i66 = configuration2.smallestScreenWidthDp;
                                    if (i65 != i66) {
                                        configuration3.smallestScreenWidthDp = i66;
                                    }
                                    i67 = configuration.densityDpi;
                                    i68 = configuration2.densityDpi;
                                    if (i67 != i68) {
                                        configuration3.densityDpi = i68;
                                    }
                                }
                            }
                            Configuration configurationM72782y = LayoutInflaterFactory2C24829a0.m72782y(context, iM72789G, c2728gM72781u, configuration3, true);
                            c29660d = new C29660d(context, com.whoop.android.R.style.Theme_AppCompat_Empty);
                            c29660d.m91071a(configurationM72782y);
                            try {
                                if (context.getTheme() != null) {
                                    AbstractC34514b.m109076n(c29660d.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = c29660d;
                        }
                    }
                } else if (LayoutInflaterFactory2C24829a0.f97200J0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f13 = configuration.fontScale;
                            f14 = configuration2.fontScale;
                            if (f13 != f14) {
                                configuration3.fontScale = f14;
                            }
                            i13 = configuration.mcc;
                            i14 = configuration2.mcc;
                            if (i13 != i14) {
                                configuration3.mcc = i14;
                            }
                            i15 = configuration.mnc;
                            i16 = configuration2.mnc;
                            if (i15 != i16) {
                                configuration3.mnc = i16;
                            }
                            AbstractC24862u.m72887a(configuration, configuration2, configuration3);
                            i17 = configuration.touchscreen;
                            i18 = configuration2.touchscreen;
                            if (i17 != i18) {
                                configuration3.touchscreen = i18;
                            }
                            i19 = configuration.keyboard;
                            i24 = configuration2.keyboard;
                            if (i19 != i24) {
                                configuration3.keyboard = i24;
                            }
                            i25 = configuration.keyboardHidden;
                            i26 = configuration2.keyboardHidden;
                            if (i25 != i26) {
                                configuration3.keyboardHidden = i26;
                            }
                            i27 = configuration.navigation;
                            i28 = configuration2.navigation;
                            if (i27 != i28) {
                                configuration3.navigation = i28;
                            }
                            i29 = configuration.navigationHidden;
                            i34 = configuration2.navigationHidden;
                            if (i29 != i34) {
                                configuration3.navigationHidden = i34;
                            }
                            i35 = configuration.orientation;
                            i36 = configuration2.orientation;
                            if (i35 != i36) {
                                configuration3.orientation = i36;
                            }
                            i37 = configuration.screenLayout & 15;
                            i38 = configuration2.screenLayout & 15;
                            if (i37 != i38) {
                                configuration3.screenLayout |= i38;
                            }
                            i39 = configuration.screenLayout & 192;
                            i44 = configuration2.screenLayout & 192;
                            if (i39 != i44) {
                                configuration3.screenLayout |= i44;
                            }
                            i45 = configuration.screenLayout & 48;
                            i46 = configuration2.screenLayout & 48;
                            if (i45 != i46) {
                                configuration3.screenLayout |= i46;
                            }
                            i47 = configuration.screenLayout & 768;
                            i48 = configuration2.screenLayout & 768;
                            if (i47 != i48) {
                                configuration3.screenLayout |= i48;
                            }
                            AbstractC37978j.m121665z(configuration, configuration2, configuration3);
                            i49 = configuration.uiMode & 15;
                            i54 = configuration2.uiMode & 15;
                            if (i49 != i54) {
                                configuration3.uiMode |= i54;
                            }
                            i55 = configuration.uiMode & 48;
                            i56 = configuration2.uiMode & 48;
                            if (i55 != i56) {
                                configuration3.uiMode |= i56;
                            }
                            i57 = configuration.screenWidthDp;
                            i58 = configuration2.screenWidthDp;
                            if (i57 != i58) {
                                configuration3.screenWidthDp = i58;
                            }
                            i59 = configuration.screenHeightDp;
                            i64 = configuration2.screenHeightDp;
                            if (i59 != i64) {
                                configuration3.screenHeightDp = i64;
                            }
                            i65 = configuration.smallestScreenWidthDp;
                            i66 = configuration2.smallestScreenWidthDp;
                            if (i65 != i66) {
                                configuration3.smallestScreenWidthDp = i66;
                            }
                            i67 = configuration.densityDpi;
                            i68 = configuration2.densityDpi;
                            if (i67 != i68) {
                                configuration3.densityDpi = i68;
                            }
                        }
                    }
                    Configuration configurationM72782y2 = LayoutInflaterFactory2C24829a0.m72782y(context, iM72789G, c2728gM72781u, configuration3, true);
                    c29660d = new C29660d(context, com.whoop.android.R.style.Theme_AppCompat_Empty);
                    c29660d.m91071a(configurationM72782y2);
                    if (context.getTheme() != null) {
                        AbstractC34514b.m109076n(c29660d.getTheme());
                    }
                    context = c29660d;
                }
            }
        } else if (context instanceof C29660d) {
            ((C29660d) context).m91071a(LayoutInflaterFactory2C24829a0.m72782y(context, iM72789G, c2728gM72781u, null, false));
        } else if (LayoutInflaterFactory2C24829a0.f97200J0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f13 = configuration.fontScale;
                    f14 = configuration2.fontScale;
                    if (f13 != f14) {
                        configuration3.fontScale = f14;
                    }
                    i13 = configuration.mcc;
                    i14 = configuration2.mcc;
                    if (i13 != i14) {
                        configuration3.mcc = i14;
                    }
                    i15 = configuration.mnc;
                    i16 = configuration2.mnc;
                    if (i15 != i16) {
                        configuration3.mnc = i16;
                    }
                    AbstractC24862u.m72887a(configuration, configuration2, configuration3);
                    i17 = configuration.touchscreen;
                    i18 = configuration2.touchscreen;
                    if (i17 != i18) {
                        configuration3.touchscreen = i18;
                    }
                    i19 = configuration.keyboard;
                    i24 = configuration2.keyboard;
                    if (i19 != i24) {
                        configuration3.keyboard = i24;
                    }
                    i25 = configuration.keyboardHidden;
                    i26 = configuration2.keyboardHidden;
                    if (i25 != i26) {
                        configuration3.keyboardHidden = i26;
                    }
                    i27 = configuration.navigation;
                    i28 = configuration2.navigation;
                    if (i27 != i28) {
                        configuration3.navigation = i28;
                    }
                    i29 = configuration.navigationHidden;
                    i34 = configuration2.navigationHidden;
                    if (i29 != i34) {
                        configuration3.navigationHidden = i34;
                    }
                    i35 = configuration.orientation;
                    i36 = configuration2.orientation;
                    if (i35 != i36) {
                        configuration3.orientation = i36;
                    }
                    i37 = configuration.screenLayout & 15;
                    i38 = configuration2.screenLayout & 15;
                    if (i37 != i38) {
                        configuration3.screenLayout |= i38;
                    }
                    i39 = configuration.screenLayout & 192;
                    i44 = configuration2.screenLayout & 192;
                    if (i39 != i44) {
                        configuration3.screenLayout |= i44;
                    }
                    i45 = configuration.screenLayout & 48;
                    i46 = configuration2.screenLayout & 48;
                    if (i45 != i46) {
                        configuration3.screenLayout |= i46;
                    }
                    i47 = configuration.screenLayout & 768;
                    i48 = configuration2.screenLayout & 768;
                    if (i47 != i48) {
                        configuration3.screenLayout |= i48;
                    }
                    AbstractC37978j.m121665z(configuration, configuration2, configuration3);
                    i49 = configuration.uiMode & 15;
                    i54 = configuration2.uiMode & 15;
                    if (i49 != i54) {
                        configuration3.uiMode |= i54;
                    }
                    i55 = configuration.uiMode & 48;
                    i56 = configuration2.uiMode & 48;
                    if (i55 != i56) {
                        configuration3.uiMode |= i56;
                    }
                    i57 = configuration.screenWidthDp;
                    i58 = configuration2.screenWidthDp;
                    if (i57 != i58) {
                        configuration3.screenWidthDp = i58;
                    }
                    i59 = configuration.screenHeightDp;
                    i64 = configuration2.screenHeightDp;
                    if (i59 != i64) {
                        configuration3.screenHeightDp = i64;
                    }
                    i65 = configuration.smallestScreenWidthDp;
                    i66 = configuration2.smallestScreenWidthDp;
                    if (i65 != i66) {
                        configuration3.smallestScreenWidthDp = i66;
                    }
                    i67 = configuration.densityDpi;
                    i68 = configuration2.densityDpi;
                    if (i67 != i68) {
                        configuration3.densityDpi = i68;
                    }
                }
            }
            Configuration configurationM72782y3 = LayoutInflaterFactory2C24829a0.m72782y(context, iM72789G, c2728gM72781u, configuration3, true);
            c29660d = new C29660d(context, com.whoop.android.R.style.Theme_AppCompat_Empty);
            c29660d.m91071a(configurationM72782y3);
            if (context.getTheme() != null) {
                AbstractC34514b.m109076n(c29660d.getTheme());
            }
            context = c29660d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC24830b supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo72812a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC24830b supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo72821j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i13) {
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) getDelegate();
        layoutInflaterFactory2C24829a0.m72784B();
        return (T) layoutInflaterFactory2C24829a0.f97210L.findViewById(i13);
    }

    public AbstractC24858q getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC1834u1 executorC1834u1 = AbstractC24858q.f97382w;
            this.mDelegate = new LayoutInflaterFactory2C24829a0(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC24832c getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C24829a0) getDelegate()).getClass();
        return new C15553a(23);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) getDelegate();
        if (layoutInflaterFactory2C24829a0.f97214P == null) {
            layoutInflaterFactory2C24829a0.m72787E();
            AbstractC24830b abstractC24830b = layoutInflaterFactory2C24829a0.f97213O;
            layoutInflaterFactory2C24829a0.f97214P = new C29666j(abstractC24830b != null ? abstractC24830b.mo72816e() : layoutInflaterFactory2C24829a0.f97209K);
        }
        return layoutInflaterFactory2C24829a0.f97214P;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i13 = AbstractC32019v2.f132876a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC24830b getSupportActionBar() {
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) getDelegate();
        layoutInflaterFactory2C24829a0.m72787E();
        return layoutInflaterFactory2C24829a0.f97213O;
    }

    @Override // androidx.core.app.TaskStackBuilder.SupportParentable
    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo72797g();
    }

    /* JADX INFO: renamed from: n */
    public final void m72856n() {
        AbstractC1613o1.m5024n(getWindow().getDecorView(), this);
        AbstractC1613o1.m5025o(getWindow().getDecorView(), this);
        AbstractC34132o.m107862G(getWindow().getDecorView(), this);
        AbstractC1772c1.m5376M(getWindow().getDecorView(), this);
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) getDelegate();
        if (layoutInflaterFactory2C24829a0.f97230f0 && layoutInflaterFactory2C24829a0.f97224Z) {
            layoutInflaterFactory2C24829a0.m72787E();
            AbstractC24830b abstractC24830b = layoutInflaterFactory2C24829a0.f97213O;
            if (abstractC24830b != null) {
                abstractC24830b.mo72818g();
            }
        }
        C31992p c31992pM99505a = C31992p.m99505a();
        Context context = layoutInflaterFactory2C24829a0.f97209K;
        synchronized (c31992pM99505a) {
            C31943c2 c31943c2 = c31992pM99505a.f132798a;
            synchronized (c31943c2) {
                C0062y c0062y = (C0062y) c31943c2.f132649b.get(context);
                if (c0062y != null) {
                    c0062y.m149a();
                }
            }
        }
        layoutInflaterFactory2C24829a0.f97242r0 = new Configuration(layoutInflaterFactory2C24829a0.f97209K.getResources().getConfiguration());
        layoutInflaterFactory2C24829a0.m72806s(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.addParentStack(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo72799j();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i13, KeyEvent keyEvent) {
        return super.onKeyDown(i13, keyEvent);
    }

    public void onLocalesChanged(C2728g c2728g) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        if (super.onMenuItemSelected(i13, menuItem)) {
            return true;
        }
        AbstractC24830b supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo72815d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i13, Menu menu) {
        return super.onMenuOpened(i13, menu);
    }

    public void onNightModeChanged(int i13) {
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i13, Menu menu) {
        super.onPanelClosed(i13, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C24829a0) getDelegate()).m72784B();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) getDelegate();
        layoutInflaterFactory2C24829a0.m72787E();
        AbstractC24830b abstractC24830b = layoutInflaterFactory2C24829a0.f97213O;
        if (abstractC24830b != null) {
            abstractC24830b.mo72832u(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C24829a0) getDelegate()).m72806s(true, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) getDelegate();
        layoutInflaterFactory2C24829a0.m72787E();
        AbstractC24830b abstractC24830b = layoutInflaterFactory2C24829a0.f97213O;
        if (abstractC24830b != null) {
            abstractC24830b.mo72832u(false);
        }
    }

    @Override // p314m.InterfaceC24854n
    public void onSupportActionModeFinished(AbstractC29658b abstractC29658b) {
    }

    @Override // p314m.InterfaceC24854n
    public void onSupportActionModeStarted(AbstractC29658b abstractC29658b) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(this);
        onCreateSupportNavigateUpTaskStack(taskStackBuilderCreate);
        onPrepareSupportNavigateUpTaskStack(taskStackBuilderCreate);
        taskStackBuilderCreate.startActivities();
        try {
            ActivityCompat.finishAffinity(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i13) {
        super.onTitleChanged(charSequence, i13);
        getDelegate().mo72804p(charSequence);
    }

    @Override // p314m.InterfaceC24854n
    public AbstractC29658b onWindowStartingSupportActionMode(InterfaceC29657a interfaceC29657a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC24830b supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo72822k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public void setContentView(int i13) {
        m72856n();
        getDelegate().mo72801m(i13);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) getDelegate();
        if (layoutInflaterFactory2C24829a0.f97208J instanceof Activity) {
            layoutInflaterFactory2C24829a0.m72787E();
            AbstractC24830b abstractC24830b = layoutInflaterFactory2C24829a0.f97213O;
            if (abstractC24830b instanceof C24855n0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C24829a0.f97214P = null;
            if (abstractC24830b != null) {
                abstractC24830b.mo72819h();
            }
            layoutInflaterFactory2C24829a0.f97213O = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C24829a0.f97208J;
                C24845i0 c24845i0 = new C24845i0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C24829a0.f97215Q, layoutInflaterFactory2C24829a0.f97211M);
                layoutInflaterFactory2C24829a0.f97213O = c24845i0;
                layoutInflaterFactory2C24829a0.f97211M.f97393x = c24845i0.f97328c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C24829a0.f97211M.f97393x = null;
            }
            layoutInflaterFactory2C24829a0.mo72797g();
        }
    }

    @Deprecated
    public void setSupportProgress(int i13) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z4) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i13) {
        super.setTheme(i13);
        ((LayoutInflaterFactory2C24829a0) getDelegate()).f97244t0 = i13;
    }

    public AbstractC29658b startSupportActionMode(InterfaceC29657a interfaceC29657a) {
        return getDelegate().mo72805q(interfaceC29657a);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo72797g();
    }

    public void supportNavigateUpTo(Intent intent) {
        NavUtils.navigateUpTo(this, intent);
    }

    public boolean supportRequestWindowFeature(int i13) {
        return getDelegate().mo72800l(i13);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return NavUtils.shouldUpRecreateTask(this, intent);
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public void setContentView(View view) {
        m72856n();
        getDelegate().mo72802n(view);
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m72856n();
        getDelegate().mo72803o(view, layoutParams);
    }
}
