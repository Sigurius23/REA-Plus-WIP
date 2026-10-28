package b30;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import e10.C12554k0;
import e93.AbstractC12889b;
import fu2.C14789d;
import g40.C15399o1;
import gd0.AbstractC15713c;
import i93.C18283i;
import id0.AbstractC18409c;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioRecordingAttachmentsGroupView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ky2.AbstractC22894c;
import ky2.C22900i;
import ky2.InterfaceC22898g;
import l83.C23454a0;
import m83.AbstractC25243e0;
import of2.AbstractC27899c;
import p072cp.BinderC10935b;
import p095dp.C12238b;
import p126eq.C13434c;
import p164g2.InterfaceC15237i;
import p180h0.EnumC16377d2;
import p209i3.InterfaceC18044z;
import p294l3.C23254g;
import p390p1.InterfaceC28601c1;
import p412q3.C29869e0;
import p412q3.C29891y;
import p510u0.AbstractC34339n0;
import p510u0.C34324i0;
import p510u0.C34340n1;
import p510u0.C34346p1;
import p522uf.AbstractC34870c0;
import p529uo.AbstractC35135w;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39133t0;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pb0.AbstractC29052c;
import pb0.AbstractC29053d;
import wr0.AbstractC37557u0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: b30.o1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2588o1 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10069E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10070w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f10071x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10072y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10073z;

    public /* synthetic */ C2588o1(int i13, String str, List list, Function1 function1) {
        this.f10070w = 8;
        this.f10069E = str;
        this.f10071x = i13;
        this.f10072y = list;
        this.f10073z = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13434c c13434c;
        String strSubstring;
        switch (this.f10070w) {
            case 0:
                EnumC2586o enumC2586o = (EnumC2586o) this.f10072y;
                EnumC2594p enumC2594p = (EnumC2594p) this.f10073z;
                String str = (String) this.f10069E;
                Context context = (Context) obj;
                AbstractC22676k.m65750j(context, "context");
                View view = null;
                PayButton payButton = new PayButton(context, null);
                C12554k0 c12554k0M15642b = ButtonOptions.m15642b();
                int i13 = enumC2586o.f10065w;
                ButtonOptions buttonOptions = (ButtonOptions) c12554k0M15642b.f42881x;
                buttonOptions.f20651x = i13;
                int i14 = enumC2594p.f10089w;
                buttonOptions.f20650w = i14;
                int i15 = this.f10071x;
                buttonOptions.f20652y = i15;
                buttonOptions.f20653z = str;
                C12554k0 c12554k0 = payButton.f20655x;
                if (i14 != 0) {
                    ((ButtonOptions) c12554k0.f42881x).f20650w = i14;
                }
                if (i13 != 0) {
                    ((ButtonOptions) c12554k0.f42881x).f20651x = i13;
                }
                ((ButtonOptions) c12554k0.f42881x).f20652y = i15;
                if (str != null) {
                    ((ButtonOptions) c12554k0.f42881x).f20653z = str;
                }
                if (payButton.isInEditMode()) {
                    payButton.m15643a((ButtonOptions) c12554k0.f42881x);
                } else {
                    payButton.removeAllViews();
                    ButtonOptions buttonOptions2 = (ButtonOptions) c12554k0.f42881x;
                    if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(payButton.getContext(), 232100000) != 0) {
                        payButton.m15643a(buttonOptions2);
                        Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
                    } else if (TextUtils.isEmpty(buttonOptions2.f20653z)) {
                        Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
                    } else {
                        Context context2 = payButton.getContext();
                        AbstractC35135w.m111094f(context2);
                        try {
                            C12238b c12238bM34029c = C12238b.m34029c(context2, C12238b.f40940b, "com.google.android.gms.wallet_dynamite");
                            try {
                                IBinder iBinderM34034b = c12238bM34029c.m34034b();
                                if (iBinderM34034b == null) {
                                    c13434c = null;
                                } else {
                                    IInterface iInterfaceQueryLocalInterface = iBinderM34034b.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                                    c13434c = iInterfaceQueryLocalInterface instanceof C13434c ? (C13434c) iInterfaceQueryLocalInterface : new C13434c(iBinderM34034b, "com.google.android.gms.wallet.button.IPayButtonCreator", 4);
                                }
                                if (c13434c != null) {
                                    view = (View) BinderC10935b.m28987c0(c13434c.m38168m0(new BinderC10935b(new Context[]{c12238bM34029c.f40951a, context2}), buttonOptions2));
                                } else {
                                    Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
                                }
                            } catch (RemoteException e5) {
                                e = e5;
                                Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
                            } catch (DynamiteModule$LoadingException e13) {
                                e = e13;
                                Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
                            }
                            payButton.f20656y = view;
                            if (view == null) {
                                Log.e("PayButton", "Failed to create buttonView");
                            } else {
                                payButton.addView(view);
                                payButton.f20656y.setOnClickListener(payButton);
                            }
                        } catch (DynamiteModule$LoadingException e14) {
                            throw new IllegalStateException(e14);
                        }
                    }
                }
                return payButton;
            case 1:
                return C14789d.m42483K(this.f10071x, (Set) this.f10072y, (Set) this.f10073z, (Function1) this.f10069E, (WorkoutExercise) obj);
            case 2:
                String str2 = (String) this.f10069E;
                C15399o1 c15399o1 = (C15399o1) this.f10072y;
                InterfaceC15237i interfaceC15237i = (InterfaceC15237i) this.f10073z;
                C29891y it = (C29891y) obj;
                AbstractC22676k.m65750j(it, "it");
                C23254g c23254g = it.f122125a;
                if (AbstractC39414r.m125890i0(str2) || AbstractC39414r.m125890i0(c23254g.f92135x)) {
                    strSubstring = c23254g.f92135x;
                } else {
                    strSubstring = c23254g.f92135x.substring(1);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                }
                Iterator it3 = AbstractC12889b.m36278i0(0, c15399o1.f57854b.m43596a(this.f10071x, strSubstring)).iterator();
                while (((C18283i) it3).f71138y) {
                    ((AbstractC25243e0) it3).nextInt();
                    AbstractC34870c0.m109993c0(interfaceC15237i, 1);
                }
                return C23454a0.f92919a;
            case 3:
                return AbstractC18409c.m52954B((AbstractC29053d.a) this.f10072y, (Function1) this.f10073z, this.f10071x, (AbstractC15713c.e) this.f10069E, (AbstractC29052c) obj);
            case 4:
                AudioRecordingAttachmentsGroupView.registerButtonsListeners$lambda$38((Attachment) this.f10072y, (AudioRecordingAttachmentsGroupView) this.f10073z, (AudioPlayer) this.f10069E, this.f10071x, ((Integer) obj).intValue());
                return C23454a0.f92919a;
            case 5:
                return AbstractC22894c.m66552h((Function1) this.f10072y, (InterfaceC22898g.a.b) this.f10073z, this.f10071x, (C22900i) this.f10069E, ((Boolean) obj).booleanValue());
            case 6:
                return AbstractC27899c.m84199g((InterfaceC28601c1) this.f10072y, this.f10071x, (Function1) this.f10073z, (List) this.f10069E, ((Boolean) obj).booleanValue());
            case 7:
                C34324i0 c34324i0 = (C34324i0) this.f10072y;
                InterfaceC39133t0 interfaceC39133t0 = (InterfaceC39133t0) this.f10073z;
                AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) this.f10069E;
                AbstractC39101i1 abstractC39101i1 = (AbstractC39101i1) obj;
                int i16 = c34324i0.f144128x;
                C34340n1 c34340n1 = c34324i0.f144127w;
                C29869e0 c29869e0 = c34324i0.f144129y;
                C34346p1 c34346p1 = (C34346p1) c34324i0.f144130z.invoke();
                c34340n1.m108644a(EnumC16377d2.f62972x, AbstractC34339n0.m108630h(abstractC39101i1, i16, c29869e0, c34346p1 != null ? c34346p1.f144282a : null, interfaceC39133t0.getLayoutDirection() == EnumC39181m.f168424x, abstractC39104j1.f168211w), this.f10071x, abstractC39104j1.f168211w);
                AbstractC39101i1.m124624n(abstractC39104j1, Math.round(-c34340n1.f144248a.m87022x()), 0, abstractC39101i1);
                return C23454a0.f92919a;
            default:
                return AbstractC37557u0.m120492N((String) this.f10069E, this.f10071x, (List) this.f10072y, (Function1) this.f10073z, (InterfaceC18044z) obj);
        }
    }

    public /* synthetic */ C2588o1(int i13, Set set, Set set2, Function1 function1) {
        this.f10070w = 1;
        this.f10071x = i13;
        this.f10072y = set;
        this.f10073z = set2;
        this.f10069E = function1;
    }

    public /* synthetic */ C2588o1(Object obj, Object obj2, int i13, Object obj3, int i14) {
        this.f10070w = i14;
        this.f10072y = obj;
        this.f10073z = obj2;
        this.f10071x = i13;
        this.f10069E = obj3;
    }

    public /* synthetic */ C2588o1(Object obj, Object obj2, Object obj3, int i13, int i14) {
        this.f10070w = i14;
        this.f10072y = obj;
        this.f10073z = obj2;
        this.f10069E = obj3;
        this.f10071x = i13;
    }

    public /* synthetic */ C2588o1(String str, C15399o1 c15399o1, int i13, InterfaceC15237i interfaceC15237i) {
        this.f10070w = 2;
        this.f10069E = str;
        this.f10072y = c15399o1;
        this.f10071x = i13;
        this.f10073z = interfaceC15237i;
    }

    public /* synthetic */ C2588o1(InterfaceC28601c1 interfaceC28601c1, int i13, Function1 function1, List list) {
        this.f10070w = 6;
        this.f10072y = interfaceC28601c1;
        this.f10071x = i13;
        this.f10073z = function1;
        this.f10069E = list;
    }
}
