package com.whoop.training.p068ui.activitysettings;

import al2.AbstractC0986b;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.training.p068ui.activitysettings.ActivitySettingsFragment;
import d13.AbstractC11478a;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import nf1.AbstractC26660a;
import or2.AbstractC28152c1;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p731rl2.Function0;
import qr2.AbstractC30556a;
import r12.C30856a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "J", "K", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ActivitySettingsFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: x */
    public static final int f31460x = AbstractC17354m.$stable;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "ActivitySettingsFragment";

    /* JADX INFO: renamed from: J */
    private final void m26558J() {
        Uri uri = Uri.parse("android-app://com.whoop/activityDetectionFragment");
        C12969k0 c12969k0M30854f = AbstractC11478a.m30854f(uri, "uri", uri, null, null);
        if (AbstractC5583n.m16799z(this).m36396k().mo36468j(new C12969k0(uri, null, null)) == null) {
            getLog().mo85222m("Can't find uri for activityDetectionFragment", new AbstractC30556a.a[0]);
            return;
        }
        C12997x0 c12997x0 = new C12997x0(false, false, -1, false, false, AbstractC26660a.f105967l, -1, -1, -1);
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(this);
        abstractC12939a0M16799z.getClass();
        abstractC12939a0M16799z.m36409x(c12969k0M30854f, c12997x0);
    }

    /* JADX INFO: renamed from: K */
    private final void m26559K() {
        Uri uri = Uri.parse("android-app://com.whoop/locationSettingsFragment");
        C12969k0 c12969k0M30854f = AbstractC11478a.m30854f(uri, "uri", uri, null, null);
        C12997x0 c12997x0M36508a = AbstractC28152c1.m85188f(new C12995w0()).m36508a();
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(this);
        abstractC12939a0M16799z.getClass();
        abstractC12939a0M16799z.m36409x(c12969k0M30854f, c12997x0M36508a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m26560L(final ActivitySettingsFragment activitySettingsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(activitySettingsFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new InterfaceC4339a(activitySettingsFragment) { // from class: rl2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ActivitySettingsFragment f130015x;

                    {
                        this.f130015x = activitySettingsFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return ActivitySettingsFragment.m26561M(this.f130015x);
                            case 1:
                                return ActivitySettingsFragment.m26562N(this.f130015x);
                            case 2:
                                return ActivitySettingsFragment.m26563O(this.f130015x);
                            default:
                                return ActivitySettingsFragment.m26564P(this.f130015x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(activitySettingsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new InterfaceC4339a(activitySettingsFragment) { // from class: rl2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ActivitySettingsFragment f130015x;

                    {
                        this.f130015x = activitySettingsFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return ActivitySettingsFragment.m26561M(this.f130015x);
                            case 1:
                                return ActivitySettingsFragment.m26562N(this.f130015x);
                            case 2:
                                return ActivitySettingsFragment.m26563O(this.f130015x);
                            default:
                                return ActivitySettingsFragment.m26564P(this.f130015x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(activitySettingsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i16 = 2;
                objM87133R3 = new InterfaceC4339a(activitySettingsFragment) { // from class: rl2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ActivitySettingsFragment f130015x;

                    {
                        this.f130015x = activitySettingsFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return ActivitySettingsFragment.m26561M(this.f130015x);
                            case 1:
                                return ActivitySettingsFragment.m26562N(this.f130015x);
                            case 2:
                                return ActivitySettingsFragment.m26563O(this.f130015x);
                            default:
                                return ActivitySettingsFragment.m26564P(this.f130015x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(activitySettingsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i17 = 3;
                objM87133R4 = new InterfaceC4339a(activitySettingsFragment) { // from class: rl2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ActivitySettingsFragment f130015x;

                    {
                        this.f130015x = activitySettingsFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return ActivitySettingsFragment.m26561M(this.f130015x);
                            case 1:
                                return ActivitySettingsFragment.m26562N(this.f130015x);
                            case 2:
                                return ActivitySettingsFragment.m26563O(this.f130015x);
                            default:
                                return ActivitySettingsFragment.m26564P(this.f130015x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function0.m97104m(interfaceC4339a, interfaceC4339a2, interfaceC4339a3, (InterfaceC4339a) objM87133R4, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m26561M(ActivitySettingsFragment activitySettingsFragment) {
        AbstractC5583n.m16799z(activitySettingsFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m26562N(ActivitySettingsFragment activitySettingsFragment) {
        activitySettingsFragment.m26558J();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m26563O(ActivitySettingsFragment activitySettingsFragment) {
        AbstractC28163g0.m85259o(activitySettingsFragment).m85336b(AbstractC0986b.f3644g);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m26564P(ActivitySettingsFragment activitySettingsFragment) {
        activitySettingsFragment.m26559K();
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 3), true, 1003847475));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }
}
