package cx;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.RunnableC1319m;
import ax.InterfaceC2116a;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Map;
import p005a3.C0271z0;
import p236j.AbstractC21065d;
import p236j.InterfaceC21063b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cx.j */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcx/j;", "Landroidx/fragment/app/m0;", "<init>", "()V", "permissionx_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class C11174j extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E */
    public final AbstractC21065d f35764E;

    /* JADX INFO: renamed from: F */
    public final AbstractC21065d f35765F;

    /* JADX INFO: renamed from: G */
    public final AbstractC21065d f35766G;

    /* JADX INFO: renamed from: H */
    public final AbstractC21065d f35767H;

    /* JADX INFO: renamed from: I */
    public final AbstractC21065d f35768I;

    /* JADX INFO: renamed from: J */
    public final AbstractC21065d f35769J;

    /* JADX INFO: renamed from: K */
    public final AbstractC21065d f35770K;

    /* JADX INFO: renamed from: w */
    public final Handler f35771w = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: x */
    public C11175k f35772x;

    /* JADX INFO: renamed from: y */
    public InterfaceC11166b f35773y;

    /* JADX INFO: renamed from: z */
    public final AbstractC21065d f35774z;

    public C11174j() {
        final int i13 = 0;
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$RequestMultiplePermissions(), new InterfaceC21063b(this) { // from class: cx.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11174j f35754x;

            {
                this.f35754x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i13) {
                    case 0:
                        C11174j c11174j = this.f35754x;
                        c11174j.m30276A(new C0271z0(4, c11174j, (Map) obj));
                        return;
                    case 1:
                        C11174j c11174j2 = this.f35754x;
                        c11174j2.m30276A(new C11173i(c11174j2, (Boolean) obj, 0));
                        return;
                    case 2:
                        C11174j c11174j3 = this.f35754x;
                        c11174j3.m30276A(new C11171g(c11174j3, 6));
                        return;
                    case 3:
                        C11174j c11174j4 = this.f35754x;
                        c11174j4.m30276A(new C11171g(c11174j4, 7));
                        return;
                    case 4:
                        C11174j c11174j5 = this.f35754x;
                        c11174j5.m30276A(new C11171g(c11174j5, 4));
                        return;
                    case 5:
                        C11174j c11174j6 = this.f35754x;
                        c11174j6.m30276A(new C11171g(c11174j6, 3));
                        return;
                    case 6:
                        C11174j c11174j7 = this.f35754x;
                        c11174j7.m30276A(new C11171g(c11174j7, 5));
                        return;
                    case 7:
                        C11174j c11174j8 = this.f35754x;
                        c11174j8.m30276A(new C11173i(c11174j8, (Boolean) obj, 1));
                        return;
                    default:
                        C11174j c11174j9 = this.f35754x;
                        if (c11174j9.m30278y()) {
                            InterfaceC11166b interfaceC11166b = c11174j9.f35773y;
                            if (interfaceC11166b == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            C11175k c11175k = c11174j9.f35772x;
                            if (c11175k != null) {
                                interfaceC11166b.mo30275n(new ArrayList(c11175k.f35785k));
                                return;
                            } else {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.f35774z = abstractC21065dRegisterForActivityResult;
        final int i14 = 1;
        AbstractC21065d abstractC21065dRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new InterfaceC21063b(this) { // from class: cx.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11174j f35754x;

            {
                this.f35754x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i14) {
                    case 0:
                        C11174j c11174j = this.f35754x;
                        c11174j.m30276A(new C0271z0(4, c11174j, (Map) obj));
                        return;
                    case 1:
                        C11174j c11174j2 = this.f35754x;
                        c11174j2.m30276A(new C11173i(c11174j2, (Boolean) obj, 0));
                        return;
                    case 2:
                        C11174j c11174j3 = this.f35754x;
                        c11174j3.m30276A(new C11171g(c11174j3, 6));
                        return;
                    case 3:
                        C11174j c11174j4 = this.f35754x;
                        c11174j4.m30276A(new C11171g(c11174j4, 7));
                        return;
                    case 4:
                        C11174j c11174j5 = this.f35754x;
                        c11174j5.m30276A(new C11171g(c11174j5, 4));
                        return;
                    case 5:
                        C11174j c11174j6 = this.f35754x;
                        c11174j6.m30276A(new C11171g(c11174j6, 3));
                        return;
                    case 6:
                        C11174j c11174j7 = this.f35754x;
                        c11174j7.m30276A(new C11171g(c11174j7, 5));
                        return;
                    case 7:
                        C11174j c11174j8 = this.f35754x;
                        c11174j8.m30276A(new C11173i(c11174j8, (Boolean) obj, 1));
                        return;
                    default:
                        C11174j c11174j9 = this.f35754x;
                        if (c11174j9.m30278y()) {
                            InterfaceC11166b interfaceC11166b = c11174j9.f35773y;
                            if (interfaceC11166b == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            C11175k c11175k = c11174j9.f35772x;
                            if (c11175k != null) {
                                interfaceC11166b.mo30275n(new ArrayList(c11175k.f35785k));
                                return;
                            } else {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f35764E = abstractC21065dRegisterForActivityResult2;
        final int i15 = 2;
        AbstractC21065d abstractC21065dRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new InterfaceC21063b(this) { // from class: cx.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11174j f35754x;

            {
                this.f35754x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i15) {
                    case 0:
                        C11174j c11174j = this.f35754x;
                        c11174j.m30276A(new C0271z0(4, c11174j, (Map) obj));
                        return;
                    case 1:
                        C11174j c11174j2 = this.f35754x;
                        c11174j2.m30276A(new C11173i(c11174j2, (Boolean) obj, 0));
                        return;
                    case 2:
                        C11174j c11174j3 = this.f35754x;
                        c11174j3.m30276A(new C11171g(c11174j3, 6));
                        return;
                    case 3:
                        C11174j c11174j4 = this.f35754x;
                        c11174j4.m30276A(new C11171g(c11174j4, 7));
                        return;
                    case 4:
                        C11174j c11174j5 = this.f35754x;
                        c11174j5.m30276A(new C11171g(c11174j5, 4));
                        return;
                    case 5:
                        C11174j c11174j6 = this.f35754x;
                        c11174j6.m30276A(new C11171g(c11174j6, 3));
                        return;
                    case 6:
                        C11174j c11174j7 = this.f35754x;
                        c11174j7.m30276A(new C11171g(c11174j7, 5));
                        return;
                    case 7:
                        C11174j c11174j8 = this.f35754x;
                        c11174j8.m30276A(new C11173i(c11174j8, (Boolean) obj, 1));
                        return;
                    default:
                        C11174j c11174j9 = this.f35754x;
                        if (c11174j9.m30278y()) {
                            InterfaceC11166b interfaceC11166b = c11174j9.f35773y;
                            if (interfaceC11166b == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            C11175k c11175k = c11174j9.f35772x;
                            if (c11175k != null) {
                                interfaceC11166b.mo30275n(new ArrayList(c11175k.f35785k));
                                return;
                            } else {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult3, "registerForActivityResult(...)");
        this.f35765F = abstractC21065dRegisterForActivityResult3;
        final int i16 = 3;
        AbstractC21065d abstractC21065dRegisterForActivityResult4 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new InterfaceC21063b(this) { // from class: cx.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11174j f35754x;

            {
                this.f35754x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i16) {
                    case 0:
                        C11174j c11174j = this.f35754x;
                        c11174j.m30276A(new C0271z0(4, c11174j, (Map) obj));
                        return;
                    case 1:
                        C11174j c11174j2 = this.f35754x;
                        c11174j2.m30276A(new C11173i(c11174j2, (Boolean) obj, 0));
                        return;
                    case 2:
                        C11174j c11174j3 = this.f35754x;
                        c11174j3.m30276A(new C11171g(c11174j3, 6));
                        return;
                    case 3:
                        C11174j c11174j4 = this.f35754x;
                        c11174j4.m30276A(new C11171g(c11174j4, 7));
                        return;
                    case 4:
                        C11174j c11174j5 = this.f35754x;
                        c11174j5.m30276A(new C11171g(c11174j5, 4));
                        return;
                    case 5:
                        C11174j c11174j6 = this.f35754x;
                        c11174j6.m30276A(new C11171g(c11174j6, 3));
                        return;
                    case 6:
                        C11174j c11174j7 = this.f35754x;
                        c11174j7.m30276A(new C11171g(c11174j7, 5));
                        return;
                    case 7:
                        C11174j c11174j8 = this.f35754x;
                        c11174j8.m30276A(new C11173i(c11174j8, (Boolean) obj, 1));
                        return;
                    default:
                        C11174j c11174j9 = this.f35754x;
                        if (c11174j9.m30278y()) {
                            InterfaceC11166b interfaceC11166b = c11174j9.f35773y;
                            if (interfaceC11166b == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            C11175k c11175k = c11174j9.f35772x;
                            if (c11175k != null) {
                                interfaceC11166b.mo30275n(new ArrayList(c11175k.f35785k));
                                return;
                            } else {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult4, "registerForActivityResult(...)");
        this.f35766G = abstractC21065dRegisterForActivityResult4;
        final int i17 = 4;
        AbstractC21065d abstractC21065dRegisterForActivityResult5 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new InterfaceC21063b(this) { // from class: cx.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11174j f35754x;

            {
                this.f35754x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i17) {
                    case 0:
                        C11174j c11174j = this.f35754x;
                        c11174j.m30276A(new C0271z0(4, c11174j, (Map) obj));
                        return;
                    case 1:
                        C11174j c11174j2 = this.f35754x;
                        c11174j2.m30276A(new C11173i(c11174j2, (Boolean) obj, 0));
                        return;
                    case 2:
                        C11174j c11174j3 = this.f35754x;
                        c11174j3.m30276A(new C11171g(c11174j3, 6));
                        return;
                    case 3:
                        C11174j c11174j4 = this.f35754x;
                        c11174j4.m30276A(new C11171g(c11174j4, 7));
                        return;
                    case 4:
                        C11174j c11174j5 = this.f35754x;
                        c11174j5.m30276A(new C11171g(c11174j5, 4));
                        return;
                    case 5:
                        C11174j c11174j6 = this.f35754x;
                        c11174j6.m30276A(new C11171g(c11174j6, 3));
                        return;
                    case 6:
                        C11174j c11174j7 = this.f35754x;
                        c11174j7.m30276A(new C11171g(c11174j7, 5));
                        return;
                    case 7:
                        C11174j c11174j8 = this.f35754x;
                        c11174j8.m30276A(new C11173i(c11174j8, (Boolean) obj, 1));
                        return;
                    default:
                        C11174j c11174j9 = this.f35754x;
                        if (c11174j9.m30278y()) {
                            InterfaceC11166b interfaceC11166b = c11174j9.f35773y;
                            if (interfaceC11166b == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            C11175k c11175k = c11174j9.f35772x;
                            if (c11175k != null) {
                                interfaceC11166b.mo30275n(new ArrayList(c11175k.f35785k));
                                return;
                            } else {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult5, "registerForActivityResult(...)");
        this.f35767H = abstractC21065dRegisterForActivityResult5;
        final int i18 = 5;
        AbstractC21065d abstractC21065dRegisterForActivityResult6 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new InterfaceC21063b(this) { // from class: cx.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11174j f35754x;

            {
                this.f35754x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i18) {
                    case 0:
                        C11174j c11174j = this.f35754x;
                        c11174j.m30276A(new C0271z0(4, c11174j, (Map) obj));
                        return;
                    case 1:
                        C11174j c11174j2 = this.f35754x;
                        c11174j2.m30276A(new C11173i(c11174j2, (Boolean) obj, 0));
                        return;
                    case 2:
                        C11174j c11174j3 = this.f35754x;
                        c11174j3.m30276A(new C11171g(c11174j3, 6));
                        return;
                    case 3:
                        C11174j c11174j4 = this.f35754x;
                        c11174j4.m30276A(new C11171g(c11174j4, 7));
                        return;
                    case 4:
                        C11174j c11174j5 = this.f35754x;
                        c11174j5.m30276A(new C11171g(c11174j5, 4));
                        return;
                    case 5:
                        C11174j c11174j6 = this.f35754x;
                        c11174j6.m30276A(new C11171g(c11174j6, 3));
                        return;
                    case 6:
                        C11174j c11174j7 = this.f35754x;
                        c11174j7.m30276A(new C11171g(c11174j7, 5));
                        return;
                    case 7:
                        C11174j c11174j8 = this.f35754x;
                        c11174j8.m30276A(new C11173i(c11174j8, (Boolean) obj, 1));
                        return;
                    default:
                        C11174j c11174j9 = this.f35754x;
                        if (c11174j9.m30278y()) {
                            InterfaceC11166b interfaceC11166b = c11174j9.f35773y;
                            if (interfaceC11166b == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            C11175k c11175k = c11174j9.f35772x;
                            if (c11175k != null) {
                                interfaceC11166b.mo30275n(new ArrayList(c11175k.f35785k));
                                return;
                            } else {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult6, "registerForActivityResult(...)");
        this.f35768I = abstractC21065dRegisterForActivityResult6;
        final int i19 = 6;
        AbstractC21065d abstractC21065dRegisterForActivityResult7 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new InterfaceC21063b(this) { // from class: cx.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11174j f35754x;

            {
                this.f35754x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i19) {
                    case 0:
                        C11174j c11174j = this.f35754x;
                        c11174j.m30276A(new C0271z0(4, c11174j, (Map) obj));
                        return;
                    case 1:
                        C11174j c11174j2 = this.f35754x;
                        c11174j2.m30276A(new C11173i(c11174j2, (Boolean) obj, 0));
                        return;
                    case 2:
                        C11174j c11174j3 = this.f35754x;
                        c11174j3.m30276A(new C11171g(c11174j3, 6));
                        return;
                    case 3:
                        C11174j c11174j4 = this.f35754x;
                        c11174j4.m30276A(new C11171g(c11174j4, 7));
                        return;
                    case 4:
                        C11174j c11174j5 = this.f35754x;
                        c11174j5.m30276A(new C11171g(c11174j5, 4));
                        return;
                    case 5:
                        C11174j c11174j6 = this.f35754x;
                        c11174j6.m30276A(new C11171g(c11174j6, 3));
                        return;
                    case 6:
                        C11174j c11174j7 = this.f35754x;
                        c11174j7.m30276A(new C11171g(c11174j7, 5));
                        return;
                    case 7:
                        C11174j c11174j8 = this.f35754x;
                        c11174j8.m30276A(new C11173i(c11174j8, (Boolean) obj, 1));
                        return;
                    default:
                        C11174j c11174j9 = this.f35754x;
                        if (c11174j9.m30278y()) {
                            InterfaceC11166b interfaceC11166b = c11174j9.f35773y;
                            if (interfaceC11166b == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            C11175k c11175k = c11174j9.f35772x;
                            if (c11175k != null) {
                                interfaceC11166b.mo30275n(new ArrayList(c11175k.f35785k));
                                return;
                            } else {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult7, "registerForActivityResult(...)");
        this.f35769J = abstractC21065dRegisterForActivityResult7;
        final int i24 = 7;
        AbstractC21065d abstractC21065dRegisterForActivityResult8 = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new InterfaceC21063b(this) { // from class: cx.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11174j f35754x;

            {
                this.f35754x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i24) {
                    case 0:
                        C11174j c11174j = this.f35754x;
                        c11174j.m30276A(new C0271z0(4, c11174j, (Map) obj));
                        return;
                    case 1:
                        C11174j c11174j2 = this.f35754x;
                        c11174j2.m30276A(new C11173i(c11174j2, (Boolean) obj, 0));
                        return;
                    case 2:
                        C11174j c11174j3 = this.f35754x;
                        c11174j3.m30276A(new C11171g(c11174j3, 6));
                        return;
                    case 3:
                        C11174j c11174j4 = this.f35754x;
                        c11174j4.m30276A(new C11171g(c11174j4, 7));
                        return;
                    case 4:
                        C11174j c11174j5 = this.f35754x;
                        c11174j5.m30276A(new C11171g(c11174j5, 4));
                        return;
                    case 5:
                        C11174j c11174j6 = this.f35754x;
                        c11174j6.m30276A(new C11171g(c11174j6, 3));
                        return;
                    case 6:
                        C11174j c11174j7 = this.f35754x;
                        c11174j7.m30276A(new C11171g(c11174j7, 5));
                        return;
                    case 7:
                        C11174j c11174j8 = this.f35754x;
                        c11174j8.m30276A(new C11173i(c11174j8, (Boolean) obj, 1));
                        return;
                    default:
                        C11174j c11174j9 = this.f35754x;
                        if (c11174j9.m30278y()) {
                            InterfaceC11166b interfaceC11166b = c11174j9.f35773y;
                            if (interfaceC11166b == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            C11175k c11175k = c11174j9.f35772x;
                            if (c11175k != null) {
                                interfaceC11166b.mo30275n(new ArrayList(c11175k.f35785k));
                                return;
                            } else {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult8, "registerForActivityResult(...)");
        this.f35770K = abstractC21065dRegisterForActivityResult8;
        final int i25 = 8;
        AbstractC22676k.m65749i(registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new InterfaceC21063b(this) { // from class: cx.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11174j f35754x;

            {
                this.f35754x = this;
            }

            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i25) {
                    case 0:
                        C11174j c11174j = this.f35754x;
                        c11174j.m30276A(new C0271z0(4, c11174j, (Map) obj));
                        return;
                    case 1:
                        C11174j c11174j2 = this.f35754x;
                        c11174j2.m30276A(new C11173i(c11174j2, (Boolean) obj, 0));
                        return;
                    case 2:
                        C11174j c11174j3 = this.f35754x;
                        c11174j3.m30276A(new C11171g(c11174j3, 6));
                        return;
                    case 3:
                        C11174j c11174j4 = this.f35754x;
                        c11174j4.m30276A(new C11171g(c11174j4, 7));
                        return;
                    case 4:
                        C11174j c11174j5 = this.f35754x;
                        c11174j5.m30276A(new C11171g(c11174j5, 4));
                        return;
                    case 5:
                        C11174j c11174j6 = this.f35754x;
                        c11174j6.m30276A(new C11171g(c11174j6, 3));
                        return;
                    case 6:
                        C11174j c11174j7 = this.f35754x;
                        c11174j7.m30276A(new C11171g(c11174j7, 5));
                        return;
                    case 7:
                        C11174j c11174j8 = this.f35754x;
                        c11174j8.m30276A(new C11173i(c11174j8, (Boolean) obj, 1));
                        return;
                    default:
                        C11174j c11174j9 = this.f35754x;
                        if (c11174j9.m30278y()) {
                            InterfaceC11166b interfaceC11166b = c11174j9.f35773y;
                            if (interfaceC11166b == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            C11175k c11175k = c11174j9.f35772x;
                            if (c11175k != null) {
                                interfaceC11166b.mo30275n(new ArrayList(c11175k.f35785k));
                                return;
                            } else {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }), "registerForActivityResult(...)");
    }

    /* JADX INFO: renamed from: A */
    public final void m30276A(InterfaceC4339a interfaceC4339a) {
        this.f35771w.post(new RunnableC1319m(interfaceC4339a));
    }

    /* JADX INFO: renamed from: B */
    public final void m30277B(C11175k c11175k, C11177m c11177m) {
        this.f35772x = c11175k;
        this.f35773y = c11177m;
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager()) {
            if (m30278y()) {
                m30276A(new C11172h(this));
                return;
            }
            return;
        }
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(Uri.parse("package:" + requireActivity().getPackageName()));
        if (intent.resolveActivity(requireActivity().getPackageManager()) == null) {
            intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
        }
        this.f35767H.mo4052a(intent, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroy() {
        super.onDestroy();
        if (m30278y() && this.f35772x == null) {
            AbstractC22676k.m65757q("pb");
            throw null;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m30278y() {
        if (this.f35772x != null && this.f35773y != null && getContext() != null) {
            return true;
        }
        Log.w("PermissionX", "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case.");
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final void m30279z() {
        if (m30278y()) {
            if (Settings.canDrawOverlays(requireContext())) {
                InterfaceC11166b interfaceC11166b = this.f35773y;
                if (interfaceC11166b != null) {
                    ((AbstractC11165a) interfaceC11166b).m30273a();
                    return;
                } else {
                    AbstractC22676k.m65757q("task");
                    throw null;
                }
            }
            C11175k c11175k = this.f35772x;
            if (c11175k == null) {
                AbstractC22676k.m65757q("pb");
                throw null;
            }
            InterfaceC2116a interfaceC2116a = c11175k.f35787m;
            if (interfaceC2116a == null) {
                return;
            }
            if (c11175k == null) {
                AbstractC22676k.m65757q("pb");
                throw null;
            }
            AbstractC22676k.m65747g(interfaceC2116a);
            InterfaceC11166b interfaceC11166b2 = this.f35773y;
            if (interfaceC11166b2 != null) {
                interfaceC2116a.mo6682a(((AbstractC11165a) interfaceC11166b2).f35751c, AbstractC37056f.m118958J("android.permission.SYSTEM_ALERT_WINDOW"));
            } else {
                AbstractC22676k.m65757q("task");
                throw null;
            }
        }
    }
}
