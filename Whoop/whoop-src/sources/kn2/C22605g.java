package kn2;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import c93.InterfaceC4339a;
import com.whoop.p069ui.pills.StrokedPillFrameLayout;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ip0.DialogInterfaceOnCancelListenerC20809f;
import p314m.C24836e;
import p314m.C24844i;
import p314m.DialogInterfaceC24846j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wu1.C37644a;

/* JADX INFO: renamed from: kn2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\fJ+\u0010\u001f\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J[\u0010!\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u00101¨\u00063"}, m65681d2 = {"Lkn2/g;", "", "Landroid/content/Context;", "context", "", "isCancellable", "Lkotlin/Function0;", "Ll83/a0;", "onCancelCallback", "<init>", "(Landroid/content/Context;ZLc93/a;)V", "e", "()V", "", "header", "body", "k", "(Ljava/lang/String;Ljava/lang/String;)V", "singleAction", "negativeAction", "positiveAction", "Lkotlin/Function1;", "callback", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "text", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroid/widget/TextView;", "textView", "p", "(Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;)V", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "g", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Z", "c", "Lc93/a;", "Lm/j;", "d", "Lm/j;", "dialog", "Lwu1/a;", "Lwu1/a;", "alertDialogBinding", "legacy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22605g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isCancellable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4339a onCancelCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private DialogInterfaceC24846j dialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C37644a alertDialogBinding;

    public C22605g(Context context, boolean z4, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.isCancellable = z4;
        this.onCancelCallback = interfaceC4339a;
        m65539h();
        m65537e();
    }

    /* JADX INFO: renamed from: e */
    private final void m65537e() {
        C24844i c24844i = new C24844i(this.context);
        C37644a c37644a = this.alertDialogBinding;
        if (c37644a == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        c24844i.setView(c37644a.getRoot());
        boolean z4 = this.isCancellable;
        C24836e c24836e = c24844i.f97324a;
        c24836e.f97268m = z4;
        c24836e.f97269n = new DialogInterfaceOnCancelListenerC20809f(this, 1);
        DialogInterfaceC24846j dialogInterfaceC24846jCreate = c24844i.create();
        AbstractC22676k.m65749i(dialogInterfaceC24846jCreate, "create(...)");
        this.dialog = dialogInterfaceC24846jCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m65538f(C22605g c22605g, DialogInterface dialogInterface) {
        InterfaceC4339a interfaceC4339a = c22605g.onCancelCallback;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m65539h() {
        Object systemService = this.context.getSystemService("layout_inflater");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        C37644a c37644aM120974c = C37644a.m120974c((LayoutInflater) systemService, null, false);
        AbstractC22676k.m65749i(c37644aM120974c, "inflate(...)");
        this.alertDialogBinding = c37644aM120974c;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m65540j(C22605g c22605g, String str, String str2, String str3, String str4, String str5, Function1 function1, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        if ((i13 & 32) != 0) {
            function1 = null;
        }
        c22605g.m65548i(str, str2, str3, str4, str5, function1);
    }

    /* JADX INFO: renamed from: k */
    private final void m65541k(String header, String body) {
        if (header.length() <= 0) {
            throw new IllegalStateException("Header cannot be empty");
        }
        if (body.length() <= 0) {
            throw new IllegalStateException("Body cannot be empty");
        }
        C37644a c37644a = this.alertDialogBinding;
        if (c37644a == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        TextView whoopAlertDialogHeaderText = c37644a.f161246c;
        AbstractC22676k.m65749i(whoopAlertDialogHeaderText, "whoopAlertDialogHeaderText");
        m65546p(header, null, whoopAlertDialogHeaderText);
        C37644a c37644a2 = this.alertDialogBinding;
        if (c37644a2 == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        TextView whoopAlertDialogBodyHeaderText = c37644a2.f161245b;
        AbstractC22676k.m65749i(whoopAlertDialogBodyHeaderText, "whoopAlertDialogBodyHeaderText");
        m65546p(body, null, whoopAlertDialogBodyHeaderText);
    }

    /* JADX INFO: renamed from: l */
    private final void m65542l(String singleAction, String negativeAction, String positiveAction, final Function1 callback) {
        C37644a c37644a = this.alertDialogBinding;
        if (c37644a == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        StrokedPillFrameLayout strokedPillFrameLayout = c37644a.f161251h;
        TextView whoopAlertDialogSingleActionTv = c37644a.f161252i;
        AbstractC22676k.m65749i(whoopAlertDialogSingleActionTv, "whoopAlertDialogSingleActionTv");
        m65546p(singleAction, strokedPillFrameLayout, whoopAlertDialogSingleActionTv);
        C37644a c37644a2 = this.alertDialogBinding;
        if (c37644a2 == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        StrokedPillFrameLayout strokedPillFrameLayout2 = c37644a2.f161247d;
        TextView whoopAlertDialogNegativeActionTv = c37644a2.f161248e;
        AbstractC22676k.m65749i(whoopAlertDialogNegativeActionTv, "whoopAlertDialogNegativeActionTv");
        m65546p(negativeAction, strokedPillFrameLayout2, whoopAlertDialogNegativeActionTv);
        C37644a c37644a3 = this.alertDialogBinding;
        if (c37644a3 == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        StrokedPillFrameLayout strokedPillFrameLayout3 = c37644a3.f161249f;
        TextView whoopAlertDialogPositiveActionTv = c37644a3.f161250g;
        AbstractC22676k.m65749i(whoopAlertDialogPositiveActionTv, "whoopAlertDialogPositiveActionTv");
        m65546p(positiveAction, strokedPillFrameLayout3, whoopAlertDialogPositiveActionTv);
        C37644a c37644a4 = this.alertDialogBinding;
        if (c37644a4 == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        final int i13 = 0;
        c37644a4.f161247d.setOnClickListener(new View.OnClickListener() { // from class: kn2.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        C22605g.m65543m(callback, this, view);
                        break;
                    case 1:
                        C22605g.m65544n(callback, this, view);
                        break;
                    default:
                        C22605g.m65545o(callback, this, view);
                        break;
                }
            }
        });
        C37644a c37644a5 = this.alertDialogBinding;
        if (c37644a5 == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        final int i14 = 1;
        c37644a5.f161249f.setOnClickListener(new View.OnClickListener() { // from class: kn2.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        C22605g.m65543m(callback, this, view);
                        break;
                    case 1:
                        C22605g.m65544n(callback, this, view);
                        break;
                    default:
                        C22605g.m65545o(callback, this, view);
                        break;
                }
            }
        });
        C37644a c37644a6 = this.alertDialogBinding;
        if (c37644a6 == null) {
            AbstractC22676k.m65757q("alertDialogBinding");
            throw null;
        }
        final int i15 = 2;
        c37644a6.f161251h.setOnClickListener(new View.OnClickListener() { // from class: kn2.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        C22605g.m65543m(callback, this, view);
                        break;
                    case 1:
                        C22605g.m65544n(callback, this, view);
                        break;
                    default:
                        C22605g.m65545o(callback, this, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m65543m(Function1 function1, C22605g c22605g, View view) {
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        c22605g.m65547g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m65544n(Function1 function1, C22605g c22605g, View view) {
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        c22605g.m65547g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m65545o(Function1 function1, C22605g c22605g, View view) {
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        c22605g.m65547g();
    }

    /* JADX INFO: renamed from: p */
    private final void m65546p(String text, View view, TextView textView) {
        if (TextUtils.isEmpty(text) || text == null) {
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            if (view != null) {
                view.setVisibility(0);
            }
            textView.setText(text);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m65547g() {
        DialogInterfaceC24846j dialogInterfaceC24846j = this.dialog;
        if (dialogInterfaceC24846j != null) {
            dialogInterfaceC24846j.dismiss();
        } else {
            AbstractC22676k.m65757q("dialog");
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m65548i(String header, String body, String singleAction, String negativeAction, String positiveAction, Function1 callback) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        m65541k(header, body);
        m65542l(singleAction, negativeAction, positiveAction, callback);
        DialogInterfaceC24846j dialogInterfaceC24846j = this.dialog;
        if (dialogInterfaceC24846j != null) {
            dialogInterfaceC24846j.show();
        } else {
            AbstractC22676k.m65757q("dialog");
            throw null;
        }
    }

    public /* synthetic */ C22605g(Context context, boolean z4, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : interfaceC4339a);
    }
}
