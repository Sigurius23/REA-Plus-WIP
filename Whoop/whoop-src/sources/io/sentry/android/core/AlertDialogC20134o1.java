package io.sentry.android.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.profileinstaller.ProfileVerifier;
import b30.ViewOnClickListenerC2558k3;
import com.whoop.android.R;
import io.sentry.AbstractC20445o4;
import io.sentry.C20372i5;
import io.sentry.C20412l5;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20501v;
import java.lang.ref.WeakReference;
import p047c9.C4312c;

/* JADX INFO: renamed from: io.sentry.android.core.o1 */
/* JADX INFO: loaded from: classes3.dex */
public final class AlertDialogC20134o1 extends AlertDialog {

    /* JADX INFO: renamed from: E */
    public C20122k1 f75628E;

    /* JADX INFO: renamed from: F */
    public C20131n1 f75629F;

    /* JADX INFO: renamed from: w */
    public boolean f75630w;

    /* JADX INFO: renamed from: x */
    public C20501v f75631x;

    /* JADX INFO: renamed from: y */
    public DialogInterface.OnDismissListener f75632y;

    /* JADX INFO: renamed from: z */
    public final C20372i5 f75633z;

    public AlertDialogC20134o1(Context context) {
        Activity activity;
        super(context, 0);
        this.f75630w = false;
        C20372i5 feedbackOptions = AbstractC20445o4.m56638b().mo56432l().getFeedbackOptions();
        C20372i5 c20372i5 = new C20372i5();
        c20372i5.f76403a = false;
        c20372i5.f76404b = true;
        c20372i5.f76405c = false;
        c20372i5.f76406d = true;
        c20372i5.f76407e = true;
        c20372i5.f76408f = true;
        c20372i5.f76409g = false;
        c20372i5.f76403a = feedbackOptions.f76403a;
        c20372i5.f76404b = feedbackOptions.f76404b;
        c20372i5.f76405c = feedbackOptions.f76405c;
        c20372i5.f76406d = feedbackOptions.f76406d;
        c20372i5.f76407e = feedbackOptions.f76407e;
        c20372i5.f76408f = feedbackOptions.f76408f;
        c20372i5.f76409g = feedbackOptions.f76409g;
        c20372i5.f76410h = feedbackOptions.f76410h;
        this.f75633z = c20372i5;
        C20412l5.m56626d().m56627a("UserFeedbackWidget");
        C20372i5 feedbackOptions2 = AbstractC20445o4.m56638b().mo56432l().getFeedbackOptions();
        if (!c20372i5.f76409g || feedbackOptions2.f76409g) {
            return;
        }
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            return;
        }
        this.f75628E = new C20122k1(AbstractC20445o4.m56638b().mo56432l().getLogger());
        WeakReference weakReference = new WeakReference(activity);
        this.f75628E.m56024b(activity, new C4312c(17, this, weakReference));
        Application application = activity.getApplication();
        C20131n1 c20131n1 = new C20131n1(this, weakReference);
        this.f75629F = c20131n1;
        application.registerActivityLifecycleCallbacks(c20131n1);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        C20481h0 user;
        super.onCreate(bundle);
        setContentView(R.layout.sentry_dialog_user_feedback);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ);
        }
        setCancelable(this.f75630w);
        TextView textView = (TextView) findViewById(R.id.sentry_dialog_user_feedback_title);
        ImageView imageView = (ImageView) findViewById(R.id.sentry_dialog_user_feedback_logo);
        final TextView textView2 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_name);
        final EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_name);
        final TextView textView3 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_email);
        final EditText editText2 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_email);
        final TextView textView4 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_description);
        final EditText editText3 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        Button button = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_send);
        Button button2 = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_cancel);
        final C20372i5 c20372i5 = this.f75633z;
        if (c20372i5.f76408f) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (c20372i5.f76404b || c20372i5.f76403a) {
            textView2.setVisibility(0);
            editText.setVisibility(0);
            textView2.setText("Name");
            editText.setHint("Your Name");
            if (c20372i5.f76403a) {
                textView2.append(" (Required)");
            }
        } else {
            textView2.setVisibility(8);
            editText.setVisibility(8);
        }
        if (c20372i5.f76406d || c20372i5.f76405c) {
            textView3.setVisibility(0);
            editText2.setVisibility(0);
            textView3.setText("Email");
            editText2.setHint("your.email@example.org");
            if (c20372i5.f76405c) {
                textView3.append(" (Required)");
            }
        } else {
            textView3.setVisibility(8);
            editText2.setVisibility(8);
        }
        if (c20372i5.f76407e && (user = AbstractC20445o4.m56638b().mo56446z().getUser()) != null) {
            editText.setText(user.f76689y);
            editText2.setText(user.f76687w);
        }
        textView4.setText("Description");
        textView4.append(" (Required)");
        editText3.setHint("What's the bug? What did you expect?");
        textView.setText("Report a Bug");
        button.setText("Send Bug Report");
        button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText4 = editText;
                String strTrim = editText4.getText().toString().trim();
                EditText editText5 = editText2;
                String strTrim2 = editText5.getText().toString().trim();
                EditText editText6 = editText3;
                String strTrim3 = editText6.getText().toString().trim();
                boolean zIsEmpty = strTrim.isEmpty();
                C20372i5 c20372i6 = c20372i5;
                if (zIsEmpty && c20372i6.f76403a) {
                    editText4.setError(textView2.getText());
                    return;
                }
                if (strTrim2.isEmpty() && c20372i6.f76405c) {
                    editText5.setError(textView3.getText());
                    return;
                }
                if (strTrim3.isEmpty()) {
                    editText6.setError(textView4.getText());
                    return;
                }
                C20484j c20484j = new C20484j(strTrim3);
                c20484j.f76699y = strTrim;
                c20484j.f76698x = strTrim2;
                AlertDialogC20134o1 alertDialogC20134o1 = this.f75607w;
                C20501v c20501v = alertDialogC20134o1.f75631x;
                if (c20501v != null) {
                    c20484j.f76694E = c20501v;
                }
                if (AbstractC20445o4.m56638b().mo56416A().mo1859c(c20484j).equals(C20501v.f76802x)) {
                    c20372i6.getClass();
                } else {
                    Context context = alertDialogC20134o1.getContext();
                    c20372i6.getClass();
                    Toast.makeText(context, "Thank you for your report!", 0).show();
                }
                alertDialogC20134o1.cancel();
            }
        });
        button2.setText("Cancel");
        button2.setOnClickListener(new ViewOnClickListenerC2558k3(this, 28));
        setOnDismissListener(this.f75632y);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        editText.getText().clear();
        editText.setError(null);
        C20513q6 c20513q6Mo56432l = AbstractC20445o4.m56638b().mo56432l();
        c20513q6Mo56432l.getFeedbackOptions().getClass();
        c20513q6Mo56432l.getReplayController().mo56098i(Boolean.FALSE);
        this.f75631x = c20513q6Mo56432l.getReplayController().mo56101s();
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z4) {
        super.setCancelable(z4);
        this.f75630w = z4;
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f75632y = onDismissListener;
        final Runnable runnable = AbstractC20445o4.m56638b().mo56432l().getFeedbackOptions().f76410h;
        if (runnable != null) {
            super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.sentry.android.core.m1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AlertDialogC20134o1 alertDialogC20134o1 = this.f75612w;
                    alertDialogC20134o1.getClass();
                    runnable.run();
                    alertDialogC20134o1.f75631x = null;
                    DialogInterface.OnDismissListener onDismissListener2 = alertDialogC20134o1.f75632y;
                    if (onDismissListener2 != null) {
                        onDismissListener2.onDismiss(dialogInterface);
                    }
                }
            });
        } else {
            super.setOnDismissListener(this.f75632y);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        InterfaceC20308d1 interfaceC20308d1M56638b = AbstractC20445o4.m56638b();
        C20513q6 c20513q6Mo56432l = interfaceC20308d1M56638b.mo56432l();
        if (interfaceC20308d1M56638b.isEnabled() && c20513q6Mo56432l.isEnabled()) {
            super.show();
        } else {
            c20513q6Mo56432l.getLogger().mo16066m(EnumC20436n5.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
        }
    }
}
