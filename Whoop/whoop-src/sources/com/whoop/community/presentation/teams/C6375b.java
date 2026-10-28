package com.whoop.community.presentation.teams;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia;
import androidx.fragment.app.AbstractActivityC1340r0;
import aq0.C1904o;
import com.whoop.community.presentation.teams.C6375b;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13503n1;
import j93.InterfaceC21493z;
import java.io.File;
import java.util.ArrayList;
import p236j.AbstractC21065d;
import p267k.C22083d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rq0.AbstractC31685o;
import rq0.C31707z;
import rq0.EnumC31701w;
import rq0.InterfaceC31687p;
import se.AbstractC32416g;
import se.AbstractC32417h;
import vq0.C36280d;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: com.whoop.community.presentation.teams.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0003R+\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u001a\u0010+\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b,\u0010*R\u001a\u0010.\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b(\u0010*R\u001a\u00104\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00067"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/b;", "Lrq0/o;", "<init>", "()V", "Ll83/a0;", "Z", "", "G", "()Ljava/lang/String;", "H", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lrq0/z;", "state", "N", "(Lrq0/z;)V", "O", "Leq0/n1;", "<set-?>", "Lcom/whoop/ui/b;", "V", "()Leq0/n1;", "a0", "(Leq0/n1;)V", "fragmentTeamCreateBannerBinding", "Lj/d;", "Lj/m;", "Lj/d;", "pickMedia", "", "I", "K", "()I", "titleRes", "J", "nextButtonRes", "layoutRes", "Lrq0/w;", "L", "Lrq0/w;", "getStep", "()Lrq0/w;", "step", "M", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6375b extends AbstractC31685o {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private AbstractC21065d pickMedia;

    /* JADX INFO: renamed from: N */
    static final /* synthetic */ InterfaceC21493z[] f25090N = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C6375b.class, "fragmentTeamCreateBannerBinding", "getFragmentTeamCreateBannerBinding()Lcom/whoop/community/databinding/FragmentTeamCreateBannerBinding;", 0))};

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O */
    public static final int f25091O = 8;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C10462b fragmentTeamCreateBannerBinding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int titleRes = AbstractC38505d0.f165631W1;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int nextButtonRes = AbstractC38505d0.f165705q;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final int layoutRes = AbstractC38501b0.f165493O;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final EnumC31701w step = EnumC31701w.BANNER;

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/b$a;", "", "<init>", "()V", "Lcom/whoop/community/presentation/teams/b;", "a", "()Lcom/whoop/community/presentation/teams/b;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6375b m19490a() {
            return new C6375b();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: V */
    private final AbstractC13503n1 m19477V() {
        return (AbstractC13503n1) this.fragmentTeamCreateBannerBinding.getValue(this, f25090N[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final void m19478W(C6375b c6375b, Uri uri) {
        if (uri != null) {
            File filesDir = c6375b.requireContext().getFilesDir();
            AbstractC22676k.m65749i(filesDir, "getFilesDir(...)");
            ContentResolver contentResolver = c6375b.requireContext().getContentResolver();
            AbstractC22676k.m65749i(contentResolver, "getContentResolver(...)");
            Bitmap bitmapM115968a = new C36280d(filesDir, contentResolver, uri).m115968a();
            c6375b.m98185L().m98308U(true);
            c6375b.m98185L().m98299F(bitmapM115968a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m19479X(C6375b c6375b, View view) {
        AbstractC21065d abstractC21065d = c6375b.pickMedia;
        if (abstractC21065d != null) {
            abstractC21065d.mo4052a(AbstractC32416g.m101149f(C22083d.f85640a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m19480Y(C6375b c6375b, View view) {
        AbstractActivityC1340r0 activity = c6375b.getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity");
        BitmapDrawable bitmapDrawableM19437F = ((TeamCreateActivity) activity).m19437F();
        if (bitmapDrawableM19437F != null) {
            c6375b.m98185L().m98305Q(bitmapDrawableM19437F);
        }
    }

    /* JADX INFO: renamed from: Z */
    private final void m19481Z() {
        C31707z c31707zM98187Q = m98187Q();
        if (c31707zM98187Q == null || c31707zM98187Q.getBannerCropping() == null) {
            return;
        }
        AbstractActivityC1340r0 activity = getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity");
        BitmapDrawable bitmapDrawableM19437F = ((TeamCreateActivity) activity).m19437F();
        if (bitmapDrawableM19437F != null) {
            m98185L().m98305Q(bitmapDrawableM19437F);
        }
    }

    /* JADX INFO: renamed from: a0 */
    private final void m19482a0(AbstractC13503n1 abstractC13503n1) {
        this.fragmentTeamCreateBannerBinding.setValue(this, f25090N[0], abstractC13503n1);
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: G */
    public String mo19483G() {
        return "Confirm Banner";
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: H */
    public String mo19484H() {
        int size;
        ArrayList<InterfaceC31687p> arrayListM98322g;
        C31707z c31707zM98187Q = m98187Q();
        if (c31707zM98187Q != null) {
            size = c31707zM98187Q.getBannerIndex();
        } else {
            C31707z c31707zM98187Q2 = m98187Q();
            size = 0 % ((c31707zM98187Q2 == null || (arrayListM98322g = c31707zM98187Q2.m98322g()) == null) ? 1 : arrayListM98322g.size());
        }
        if (size == 0) {
            return "Default";
        }
        C31707z c31707zM98187Q3 = m98187Q();
        return (c31707zM98187Q3 != null ? c31707zM98187Q3.getBannerCropping() : null) != null ? "Uploaded" : "Selected";
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: I, reason: from getter */
    public int getLayoutRes() {
        return this.layoutRes;
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: J, reason: from getter */
    public int getNextButtonRes() {
        return this.nextButtonRes;
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: K, reason: from getter */
    public int getTitleRes() {
        return this.titleRes;
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: N */
    public void mo19488N(C31707z state) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC13503n1 abstractC13503n1M19477V = m19477V();
        abstractC13503n1M19477V.f47490b.setText(state.getName());
        m98186P(true);
        abstractC13503n1M19477V.f47489a.f47470d.setVisibility(8);
        AbstractC32417h.m101189T(abstractC13503n1M19477V.f47491c.getRoot(), state.getBannerCropping() != null);
        AbstractC32417h.m101189T(abstractC13503n1M19477V.f47489a.getRoot(), state.getBannerCropping() == null);
    }

    @Override // rq0.AbstractC31685o
    /* JADX INFO: renamed from: O */
    public void mo19489O() {
        m19481Z();
    }

    @Override // rq0.AbstractC31685o, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13503n1 abstractC13503n1M38217c = AbstractC13503n1.m38217c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13503n1M38217c, "inflate(...)");
        m19482a0(abstractC13503n1M38217c);
        this.pickMedia = registerForActivityResult(new ActivityResultContracts$PickVisualMedia(), new C1904o(this, 13));
        View root = m19477V().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final int i13 = 0;
        m19477V().f47489a.f47468b.setOnClickListener(new View.OnClickListener(this) { // from class: rq0.n

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6375b f131194x;

            {
                this.f131194x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        C6375b.m19479X(this.f131194x, view2);
                        break;
                    default:
                        C6375b.m19480Y(this.f131194x, view2);
                        break;
                }
            }
        });
        final int i14 = 1;
        m19477V().f47491c.f47566a.setOnClickListener(new View.OnClickListener(this) { // from class: rq0.n

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6375b f131194x;

            {
                this.f131194x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        C6375b.m19479X(this.f131194x, view2);
                        break;
                    default:
                        C6375b.m19480Y(this.f131194x, view2);
                        break;
                }
            }
        });
    }
}
