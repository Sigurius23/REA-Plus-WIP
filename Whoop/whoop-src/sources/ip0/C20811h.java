package ip0;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge0.C15728c;
import gf2.C15792a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p314m.C24844i;
import p314m.DialogInterfaceC24846j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qe2.AbstractC30314g;

/* JADX INFO: renamed from: ip0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0015\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\nJ'\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJO\u0010\u001f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Lip0/h;", "", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Ll83/a0;", "onCancelCallback", "<init>", "(Landroid/content/Context;Lc93/a;)V", "e", "()V", "", "header", "body", "j", "(Ljava/lang/String;Ljava/lang/String;)V", "negativeAction", "positiveAction", "Lkotlin/Function1;", "", "callback", "k", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "text", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroid/widget/TextView;", "textView", "o", "(Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;)V", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "g", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lc93/a;", "Lm/j;", "c", "Lm/j;", "dialog", "Lgf2/a;", "d", "Lgf2/a;", "alertDialogBinding", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20811h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a onCancelCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private DialogInterfaceC24846j dialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C15792a alertDialogBinding;

    public C20811h(Context context, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.onCancelCallback = interfaceC4339a;
        m57379h();
        m57377e();
    }

    /* JADX INFO: renamed from: e */
    private final void m57377e() {
        C24844i c24844i = new C24844i(this.context);
        C15792a c15792a = this.alertDialogBinding;
        if (c15792a == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        c24844i.setView(c15792a.getRoot());
        c24844i.f97324a.f97269n = new DialogInterfaceOnCancelListenerC20809f(this, 0);
        DialogInterfaceC24846j dialogInterfaceC24846jCreate = c24844i.create();
        AbstractC22676k.m65749i(dialogInterfaceC24846jCreate, "create(...)");
        this.dialog = dialogInterfaceC24846jCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m57378f(C20811h c20811h, DialogInterface dialogInterface) {
        InterfaceC4339a interfaceC4339a = c20811h.onCancelCallback;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m57379h() {
        Object systemService = this.context.getSystemService("layout_inflater");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        C15792a c15792aM44556c = C15792a.m44556c((LayoutInflater) systemService, null, false);
        AbstractC22676k.m65749i(c15792aM44556c, "inflate(...)");
        this.alertDialogBinding = c15792aM44556c;
    }

    /* JADX INFO: renamed from: j */
    private final void m57380j(String header, String body) {
        if (header.length() <= 0) {
            throw new IllegalStateException("Header cannot be empty");
        }
        if (body.length() <= 0) {
            throw new IllegalStateException("Body cannot be empty");
        }
        C15792a c15792a = this.alertDialogBinding;
        if (c15792a == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        TextView dialogTitle = c15792a.f59513d;
        AbstractC22676k.m65749i(dialogTitle, "dialogTitle");
        C15792a c15792a2 = this.alertDialogBinding;
        if (c15792a2 == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        TextView dialogTitle2 = c15792a2.f59513d;
        AbstractC22676k.m65749i(dialogTitle2, "dialogTitle");
        m57385o(header, dialogTitle, dialogTitle2);
        C15792a c15792a3 = this.alertDialogBinding;
        if (c15792a3 == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        TextView dialogBody = c15792a3.f59512c;
        AbstractC22676k.m65749i(dialogBody, "dialogBody");
        C15792a c15792a4 = this.alertDialogBinding;
        if (c15792a4 == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        TextView dialogBody2 = c15792a4.f59512c;
        AbstractC22676k.m65749i(dialogBody2, "dialogBody");
        m57385o(body, dialogBody, dialogBody2);
    }

    /* JADX INFO: renamed from: k */
    private final void m57381k(String negativeAction, String positiveAction, final Function1 callback) {
        C15792a c15792a = this.alertDialogBinding;
        if (c15792a == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        TextView textView = c15792a.f59514e;
        if (negativeAction == null) {
            negativeAction = this.context.getResources().getString(AbstractC30314g.f124245E0);
            AbstractC22676k.m65749i(negativeAction, "getString(...)");
        }
        textView.setText(negativeAction);
        final int i13 = 0;
        c15792a.f59514e.setOnClickListener(new View.OnClickListener() { // from class: ip0.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        C20811h.m57382l(callback, this, view);
                        break;
                    default:
                        C20811h.m57384n(callback, this, view);
                        break;
                }
            }
        });
        ImageView closeButton = c15792a.f59511b;
        AbstractC22676k.m65749i(closeButton, "closeButton");
        AbstractC1953c.m5963a(closeButton, new C15728c(callback, 28));
        StrokedPillButton strokedPillButton = c15792a.f59515f;
        if (positiveAction == null) {
            positiveAction = this.context.getResources().getString(AbstractC30314g.f124291Z);
            AbstractC22676k.m65749i(positiveAction, "getString(...)");
        }
        strokedPillButton.setText(positiveAction);
        StrokedPillButton strokedPillButton2 = c15792a.f59515f;
        final int i14 = 1;
        strokedPillButton2.setOnClickListener(new View.OnClickListener() { // from class: ip0.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        C20811h.m57382l(callback, this, view);
                        break;
                    default:
                        C20811h.m57384n(callback, this, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m57382l(Function1 function1, C20811h c20811h, View view) {
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        c20811h.m57386g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m57383m(Function1 function1, View it) {
        AbstractC22676k.m65750j(it, "it");
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m57384n(Function1 function1, C20811h c20811h, View view) {
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        c20811h.m57386g();
    }

    /* JADX INFO: renamed from: o */
    private final void m57385o(String text, View view, TextView textView) {
        if (TextUtils.isEmpty(text)) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            textView.setText(text);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m57386g() {
        DialogInterfaceC24846j dialogInterfaceC24846j = this.dialog;
        if (dialogInterfaceC24846j != null) {
            dialogInterfaceC24846j.dismiss();
        } else {
            AbstractC22676k.m65757q("dialog");
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m57387i(String header, String body, String negativeAction, String positiveAction, Function1 callback) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        m57380j(header, body);
        m57381k(negativeAction, positiveAction, callback);
        DialogInterfaceC24846j dialogInterfaceC24846j = this.dialog;
        if (dialogInterfaceC24846j == null) {
            AbstractC22676k.m65757q("dialog");
            throw null;
        }
        Window window = dialogInterfaceC24846j.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        DialogInterfaceC24846j dialogInterfaceC24846j2 = this.dialog;
        if (dialogInterfaceC24846j2 != null) {
            dialogInterfaceC24846j2.show();
        } else {
            AbstractC22676k.m65757q("dialog");
            throw null;
        }
    }
}
