package com.whoop.settings.strap;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.google.android.material.textfield.TextInputEditText;
import com.whoop.p069ui.AbstractViewOnTouchListenerC10539g;
import com.whoop.settings.strap.EditDeviceNameActivity;
import hj0.AbstractActivityC17350i;
import ii0.AbstractC18541e;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import sc2.C32365d;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/settings/strap/EditDeviceNameActivity;", "Lhj0/i;", "<init>", "()V", "Ll83/a0;", "S", "M", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "E", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "logTag", "Lii0/e;", "F", "Lii0/e;", "binding", "Lsc2/d;", "G", "Ll83/h;", "L", "()Lsc2/d;", "viewModel", "H", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditDeviceNameActivity extends AbstractActivityC17350i {

    /* JADX INFO: renamed from: I */
    public static final int f30704I = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private AbstractC18541e binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String logTag = "EditDeviceNameFragment";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10155e(this, null, new C10154d(this), null));

    /* JADX INFO: renamed from: com.whoop.settings.strap.EditDeviceNameActivity$b */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"com/whoop/settings/strap/EditDeviceNameActivity$b", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ll83/a0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10152b implements TextWatcher {
        public C10152b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s13) {
            EditDeviceNameActivity.this.m25723L().m100806K(String.valueOf(s13));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.strap.EditDeviceNameActivity$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/settings/strap/EditDeviceNameActivity$c", "Lcom/whoop/ui/g;", "Ll83/a0;", "a", "()V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10153c extends AbstractViewOnTouchListenerC10539g {
        public C10153c() {
            super(EditDeviceNameActivity.this);
        }

        @Override // com.whoop.p069ui.AbstractViewOnTouchListenerC10539g
        /* JADX INFO: renamed from: a */
        public void mo25737a() {
            EditDeviceNameActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.strap.EditDeviceNameActivity$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10154d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30710w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10154d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30710w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30710w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.strap.EditDeviceNameActivity$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10155e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30711w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30712x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30713y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30714z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10155e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30711w = componentCallbacks;
            this.f30712x = interfaceC35951a;
            this.f30713y = interfaceC4339a;
            this.f30714z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, sc2.d] */
        @Override // c93.InterfaceC4339a
        public final C32365d invoke() {
            return AbstractC34132o.m107857B(this.f30711w, this.f30712x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32365d.class), this.f30713y, this.f30714z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final C32365d m25723L() {
        return (C32365d) this.viewModel.getValue();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: M */
    private final void m25724M() {
        AbstractC18541e abstractC18541e = this.binding;
        if (abstractC18541e == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView editDeviceNameSave = abstractC18541e.f72256f;
        AbstractC22676k.m65749i(editDeviceNameSave, "editDeviceNameSave");
        final int i13 = 0;
        AbstractC1953c.m5963a(editDeviceNameSave, new Function1(this) { // from class: sc2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditDeviceNameActivity f133957x;

            {
                this.f133957x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return EditDeviceNameActivity.m25725N(this.f133957x, (View) obj);
                    case 1:
                        return EditDeviceNameActivity.m25726O(this.f133957x, (View) obj);
                    case 2:
                        return EditDeviceNameActivity.m25727P(this.f133957x, (View) obj);
                    default:
                        return EditDeviceNameActivity.m25729R(this.f133957x, (View) obj);
                }
            }
        });
        AbstractC18541e abstractC18541e2 = this.binding;
        if (abstractC18541e2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView editDeviceNameDefault = abstractC18541e2.f72252b;
        AbstractC22676k.m65749i(editDeviceNameDefault, "editDeviceNameDefault");
        final int i14 = 1;
        AbstractC1953c.m5963a(editDeviceNameDefault, new Function1(this) { // from class: sc2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditDeviceNameActivity f133957x;

            {
                this.f133957x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return EditDeviceNameActivity.m25725N(this.f133957x, (View) obj);
                    case 1:
                        return EditDeviceNameActivity.m25726O(this.f133957x, (View) obj);
                    case 2:
                        return EditDeviceNameActivity.m25727P(this.f133957x, (View) obj);
                    default:
                        return EditDeviceNameActivity.m25729R(this.f133957x, (View) obj);
                }
            }
        });
        AbstractC18541e abstractC18541e3 = this.binding;
        if (abstractC18541e3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        View editDeviceNameTransparentToolbarSpace = abstractC18541e3.f72259i;
        AbstractC22676k.m65749i(editDeviceNameTransparentToolbarSpace, "editDeviceNameTransparentToolbarSpace");
        final int i15 = 2;
        AbstractC1953c.m5963a(editDeviceNameTransparentToolbarSpace, new Function1(this) { // from class: sc2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditDeviceNameActivity f133957x;

            {
                this.f133957x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return EditDeviceNameActivity.m25725N(this.f133957x, (View) obj);
                    case 1:
                        return EditDeviceNameActivity.m25726O(this.f133957x, (View) obj);
                    case 2:
                        return EditDeviceNameActivity.m25727P(this.f133957x, (View) obj);
                    default:
                        return EditDeviceNameActivity.m25729R(this.f133957x, (View) obj);
                }
            }
        });
        AbstractC18541e abstractC18541e4 = this.binding;
        if (abstractC18541e4 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18541e4.f72253c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: sc2.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                return EditDeviceNameActivity.m25728Q(this.f133958a, textView, i16, keyEvent);
            }
        });
        AbstractC18541e abstractC18541e5 = this.binding;
        if (abstractC18541e5 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView editDeviceNameSheetHandleIv = abstractC18541e5.f72257g;
        AbstractC22676k.m65749i(editDeviceNameSheetHandleIv, "editDeviceNameSheetHandleIv");
        final int i16 = 3;
        AbstractC1953c.m5963a(editDeviceNameSheetHandleIv, new Function1(this) { // from class: sc2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditDeviceNameActivity f133957x;

            {
                this.f133957x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return EditDeviceNameActivity.m25725N(this.f133957x, (View) obj);
                    case 1:
                        return EditDeviceNameActivity.m25726O(this.f133957x, (View) obj);
                    case 2:
                        return EditDeviceNameActivity.m25727P(this.f133957x, (View) obj);
                    default:
                        return EditDeviceNameActivity.m25729R(this.f133957x, (View) obj);
                }
            }
        });
        AbstractC18541e abstractC18541e6 = this.binding;
        if (abstractC18541e6 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18541e6.f72258h.setOnTouchListener(new C10153c());
        AbstractC18541e abstractC18541e7 = this.binding;
        if (abstractC18541e7 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextInputEditText editDeviceNameInput = abstractC18541e7.f72253c;
        AbstractC22676k.m65749i(editDeviceNameInput, "editDeviceNameInput");
        editDeviceNameInput.addTextChangedListener(new C10152b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m25725N(EditDeviceNameActivity editDeviceNameActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC18541e abstractC18541e = editDeviceNameActivity.binding;
        if (abstractC18541e == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        editDeviceNameActivity.m25723L().m100807L(String.valueOf(abstractC18541e.f72253c.getText()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m25726O(EditDeviceNameActivity editDeviceNameActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        editDeviceNameActivity.m25723L().m100807L("");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m25727P(EditDeviceNameActivity editDeviceNameActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        editDeviceNameActivity.finish();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final boolean m25728Q(EditDeviceNameActivity editDeviceNameActivity, TextView textView, int i13, KeyEvent keyEvent) {
        if (i13 != 4) {
            return false;
        }
        C32365d c32365dM25723L = editDeviceNameActivity.m25723L();
        AbstractC18541e abstractC18541e = editDeviceNameActivity.binding;
        if (abstractC18541e != null) {
            c32365dM25723L.m100807L(String.valueOf(abstractC18541e.f72253c.getText()));
            return true;
        }
        AbstractC22676k.m65757q("binding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m25729R(EditDeviceNameActivity editDeviceNameActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        editDeviceNameActivity.finish();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private final void m25730S() {
        final int i13 = 0;
        m49118y(m25723L().getCurrentDeviceName(), new InterfaceC1633v0(this) { // from class: sc2.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditDeviceNameActivity f133960x;

            {
                this.f133960x = this;
            }

            @Override // androidx.lifecycle.InterfaceC1633v0
            public final void onChanged(Object obj) {
                switch (i13) {
                    case 0:
                        EditDeviceNameActivity.m25731T(this.f133960x, (String) obj);
                        break;
                    case 1:
                        EditDeviceNameActivity.m25732U(this.f133960x, (String) obj);
                        break;
                    case 2:
                        EditDeviceNameActivity.m25733V(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                    case 3:
                        EditDeviceNameActivity.m25734W(this.f133960x, ((Integer) obj).intValue());
                        break;
                    default:
                        EditDeviceNameActivity.m25735X(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        final int i14 = 1;
        m49118y(m25723L().m100800B(), new InterfaceC1633v0(this) { // from class: sc2.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditDeviceNameActivity f133960x;

            {
                this.f133960x = this;
            }

            @Override // androidx.lifecycle.InterfaceC1633v0
            public final void onChanged(Object obj) {
                switch (i14) {
                    case 0:
                        EditDeviceNameActivity.m25731T(this.f133960x, (String) obj);
                        break;
                    case 1:
                        EditDeviceNameActivity.m25732U(this.f133960x, (String) obj);
                        break;
                    case 2:
                        EditDeviceNameActivity.m25733V(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                    case 3:
                        EditDeviceNameActivity.m25734W(this.f133960x, ((Integer) obj).intValue());
                        break;
                    default:
                        EditDeviceNameActivity.m25735X(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        final int i15 = 2;
        m49118y(m25723L().getSaveButtonEnabled(), new InterfaceC1633v0(this) { // from class: sc2.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditDeviceNameActivity f133960x;

            {
                this.f133960x = this;
            }

            @Override // androidx.lifecycle.InterfaceC1633v0
            public final void onChanged(Object obj) {
                switch (i15) {
                    case 0:
                        EditDeviceNameActivity.m25731T(this.f133960x, (String) obj);
                        break;
                    case 1:
                        EditDeviceNameActivity.m25732U(this.f133960x, (String) obj);
                        break;
                    case 2:
                        EditDeviceNameActivity.m25733V(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                    case 3:
                        EditDeviceNameActivity.m25734W(this.f133960x, ((Integer) obj).intValue());
                        break;
                    default:
                        EditDeviceNameActivity.m25735X(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        final int i16 = 3;
        m49118y(m25723L().getErrorMessage(), new InterfaceC1633v0(this) { // from class: sc2.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditDeviceNameActivity f133960x;

            {
                this.f133960x = this;
            }

            @Override // androidx.lifecycle.InterfaceC1633v0
            public final void onChanged(Object obj) {
                switch (i16) {
                    case 0:
                        EditDeviceNameActivity.m25731T(this.f133960x, (String) obj);
                        break;
                    case 1:
                        EditDeviceNameActivity.m25732U(this.f133960x, (String) obj);
                        break;
                    case 2:
                        EditDeviceNameActivity.m25733V(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                    case 3:
                        EditDeviceNameActivity.m25734W(this.f133960x, ((Integer) obj).intValue());
                        break;
                    default:
                        EditDeviceNameActivity.m25735X(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        final int i17 = 4;
        m49118y(m25723L().getShowProgressBar(), new InterfaceC1633v0(this) { // from class: sc2.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditDeviceNameActivity f133960x;

            {
                this.f133960x = this;
            }

            @Override // androidx.lifecycle.InterfaceC1633v0
            public final void onChanged(Object obj) {
                switch (i17) {
                    case 0:
                        EditDeviceNameActivity.m25731T(this.f133960x, (String) obj);
                        break;
                    case 1:
                        EditDeviceNameActivity.m25732U(this.f133960x, (String) obj);
                        break;
                    case 2:
                        EditDeviceNameActivity.m25733V(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                    case 3:
                        EditDeviceNameActivity.m25734W(this.f133960x, ((Integer) obj).intValue());
                        break;
                    default:
                        EditDeviceNameActivity.m25735X(this.f133960x, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final void m25731T(EditDeviceNameActivity editDeviceNameActivity, String it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC18541e abstractC18541e = editDeviceNameActivity.binding;
        if (abstractC18541e != null) {
            abstractC18541e.f72253c.setText(it);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m25732U(EditDeviceNameActivity editDeviceNameActivity, String str) {
        Intent intent = new Intent();
        intent.putExtra("deviceNameExtra", str);
        editDeviceNameActivity.setResult(-1, intent);
        editDeviceNameActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m25733V(EditDeviceNameActivity editDeviceNameActivity, boolean z4) {
        AbstractC18541e abstractC18541e = editDeviceNameActivity.binding;
        if (abstractC18541e == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView textView = abstractC18541e.f72256f;
        if (abstractC18541e == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        Editable text = abstractC18541e.f72253c.getText();
        boolean z13 = false;
        if (text != null && (!AbstractC39414r.m125890i0(text))) {
            z13 = true;
        }
        textView.setEnabled(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final void m25734W(EditDeviceNameActivity editDeviceNameActivity, int i13) {
        String string = i13 != -1 ? editDeviceNameActivity.getString(i13) : "";
        AbstractC22676k.m65747g(string);
        AbstractC18541e abstractC18541e = editDeviceNameActivity.binding;
        if (abstractC18541e != null) {
            abstractC18541e.f72254d.setError(string);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m25735X(EditDeviceNameActivity editDeviceNameActivity, boolean z4) {
        if (z4) {
            AbstractC18541e abstractC18541e = editDeviceNameActivity.binding;
            if (abstractC18541e != null) {
                abstractC18541e.f72255e.setVisibility(0);
                return;
            } else {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
        }
        AbstractC18541e abstractC18541e2 = editDeviceNameActivity.binding;
        if (abstractC18541e2 != null) {
            abstractC18541e2.f72255e.setVisibility(8);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    @Override // hj0.AbstractActivityC17350i, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC18541e abstractC18541eM53757c = AbstractC18541e.m53757c(getLayoutInflater());
        AbstractC22676k.m65749i(abstractC18541eM53757c, "inflate(...)");
        this.binding = abstractC18541eM53757c;
        setContentView(abstractC18541eM53757c.getRoot());
        m25730S();
        m25724M();
        m25723L().m100805I();
    }

    @Override // hj0.AbstractActivityC17350i
    /* JADX INFO: renamed from: v, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
