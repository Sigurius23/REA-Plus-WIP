package io.getstream.chat.android.p226ui.utils;

import android.R;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import androidx.fragment.app.AbstractActivityC1340r0;
import bs2.C3612e;
import c93.InterfaceC4339a;
import com.mapbox.common.location.C5432a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cx.C11167c;
import cx.C11168d;
import cx.C11175k;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.permissions.Permissions;
import io.getstream.chat.android.p226ui.common.utils.ContextUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import mr.C25908n;
import ou1.C28376a;
import p032bc.C2953i;
import p314m.C24844i;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import zd3.C40580x;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJY\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010 J5\u0010#\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b#\u0010$J5\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b%\u0010$J5\u0010&\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b&\u0010$J3\u0010'\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b'\u0010(J3\u0010)\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b)\u0010(J5\u0010*\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b*\u0010(¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/ui/utils/PermissionChecker;", "", "<init>", "()V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "", "", "permissions", "Lkotlin/Function1;", "", "", "Ll83/a0;", "onPermissionResult", "checkStoragePermissions", "(Landroid/view/View;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "dialogTitle", "dialogMessage", "snackbarMessage", "", "Lkotlin/Function0;", "onPermissionDenied", "onPermissionGranted", "checkPermissions", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc93/a;Lc93/a;)V", "Landroid/content/Context;", "context", "showPermissionRationaleDialog", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "showPermissionDeniedSnackbar", "(Landroid/view/View;Ljava/lang/String;)V", "isGrantedCameraPermissions", "(Landroid/content/Context;)Z", "isGrantedAudioRecordPermission", "isNeededToRequestForCameraPermissions", "checkVisualMediaPermissions", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "checkAudioPermissions", "checkFilesPermissions", "checkWriteStoragePermissions", "(Landroid/view/View;Lc93/a;Lc93/a;)V", "checkCameraPermissions", "checkAudioRecordPermissions", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PermissionChecker {
    public static /* synthetic */ void checkAudioRecordPermissions$default(PermissionChecker permissionChecker, View view, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = new C28376a(7);
        }
        if ((i13 & 4) != 0) {
            interfaceC4339a2 = new C28376a(7);
        }
        permissionChecker.checkAudioRecordPermissions(view, interfaceC4339a, interfaceC4339a2);
    }

    public static /* synthetic */ void checkCameraPermissions$default(PermissionChecker permissionChecker, View view, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = new C28376a(7);
        }
        permissionChecker.checkCameraPermissions(view, interfaceC4339a, interfaceC4339a2);
    }

    private final void checkPermissions(View view, String dialogTitle, String dialogMessage, String snackbarMessage, List<String> permissions, InterfaceC4339a onPermissionDenied, InterfaceC4339a onPermissionGranted) {
        AbstractActivityC1340r0 activity = ViewKt.getActivity(view);
        if (activity == null) {
            return;
        }
        C40580x c40580x = new C40580x();
        c40580x.f174776w = activity;
        C11175k c11175kM131579p = c40580x.m131579p(permissions);
        c11175kM131579p.f35787m = new C19902a(this, view, dialogTitle, dialogMessage, 0);
        c11175kM131579p.f35788n = new C2953i(this, view, snackbarMessage, 5);
        c11175kM131579p.m30284e(new C3612e(onPermissionGranted, onPermissionDenied));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPermissions$lambda$10(PermissionChecker permissionChecker, View view, String str, C11168d c11168d, List list) {
        AbstractC22676k.m65750j(c11168d, "<unused var>");
        AbstractC22676k.m65750j(list, "<unused var>");
        permissionChecker.showPermissionDeniedSnackbar(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPermissions$lambda$11(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z4, List list, List list2) {
        AbstractC22676k.m65750j(list, "<unused var>");
        AbstractC22676k.m65750j(list2, "<unused var>");
        if (z4) {
            interfaceC4339a.invoke();
        } else {
            interfaceC4339a2.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPermissions$lambda$9(PermissionChecker permissionChecker, View view, String str, String str2, C11167c c11167c, List list) {
        AbstractC22676k.m65750j(c11167c, "<unused var>");
        AbstractC22676k.m65750j(list, "<unused var>");
        Context context = view.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        permissionChecker.showPermissionRationaleDialog(context, str, str2);
    }

    private final void checkStoragePermissions(View view, String[] permissions, Function1 onPermissionResult) {
        AbstractActivityC1340r0 activity = ViewKt.getActivity(view);
        if (activity == null) {
            return;
        }
        C40580x c40580x = new C40580x();
        c40580x.f174776w = activity;
        C11175k c11175kM131579p = c40580x.m131579p(AbstractC25260n.m74048W(permissions));
        c11175kM131579p.f35787m = new C19905d(view, this);
        c11175kM131579p.f35788n = new C19905d(view, this);
        c11175kM131579p.m30284e(new C5432a(onPermissionResult, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkStoragePermissions$lambda$0(View view, PermissionChecker permissionChecker, C11167c c11167c, List list) {
        AbstractC22676k.m65750j(c11167c, "<unused var>");
        AbstractC22676k.m65750j(list, "<unused var>");
        String string = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_storage_title);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_storage_message);
        AbstractC22676k.m65749i(string2, "getString(...)");
        Context context = view.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        permissionChecker.showPermissionRationaleDialog(context, string, string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkStoragePermissions$lambda$1(View view, PermissionChecker permissionChecker, C11168d c11168d, List list) {
        AbstractC22676k.m65750j(c11168d, "<unused var>");
        AbstractC22676k.m65750j(list, "<unused var>");
        String string = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_setting_message);
        AbstractC22676k.m65749i(string, "getString(...)");
        permissionChecker.showPermissionDeniedSnackbar(view, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkStoragePermissions$lambda$4(Function1 function1, boolean z4, List granted, List denied) {
        AbstractC22676k.m65750j(granted, "granted");
        AbstractC22676k.m65750j(denied, "denied");
        List list = granted;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list) {
            linkedHashMap.put(obj, Boolean.TRUE);
        }
        List list2 = denied;
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
        for (Object obj2 : list2) {
            linkedHashMap2.put(obj2, Boolean.FALSE);
        }
        function1.invoke(AbstractC25247g0.m73995d0(linkedHashMap, linkedHashMap2));
    }

    public static /* synthetic */ void checkWriteStoragePermissions$default(PermissionChecker permissionChecker, View view, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC4339a = new C28376a(7);
        }
        permissionChecker.checkWriteStoragePermissions(view, interfaceC4339a, interfaceC4339a2);
    }

    private final void showPermissionDeniedSnackbar(View view, String snackbarMessage) {
        C25908n c25908nM76617h = C25908n.m76617h(view, snackbarMessage, 0);
        c25908nM76617h.m76618i(C19470R.string.stream_ui_message_composer_permissions_setting_button, new ViewOnClickListenerC19903b(c25908nM76617h, 0));
        PermissionChecker$showPermissionDeniedSnackbar$1$2 permissionChecker$showPermissionDeniedSnackbar$1$2 = new PermissionChecker$showPermissionDeniedSnackbar$1$2();
        if (c25908nM76617h.f102271u == null) {
            c25908nM76617h.f102271u = new ArrayList();
        }
        c25908nM76617h.f102271u.add(permissionChecker$showPermissionDeniedSnackbar$1$2);
        c25908nM76617h.m76619j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermissionDeniedSnackbar$lambda$14$lambda$13(C25908n c25908n, View view) {
        Context context = c25908n.f102258h;
        AbstractC22676k.m65749i(context, "getContext(...)");
        ContextUtilsKt.openSystemSettings(context);
    }

    private final void showPermissionRationaleDialog(Context context, String dialogTitle, String dialogMessage) {
        C24844i title = new C24844i(context).setTitle(dialogTitle);
        title.f97324a.f97261f = dialogMessage;
        title.setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC19904c(0)).m72850c();
    }

    public final void checkAudioPermissions(View view, Function1 onPermissionResult) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(onPermissionResult, "onPermissionResult");
        checkStoragePermissions(view, Permissions.INSTANCE.audioPermissions(), onPermissionResult);
    }

    public final void checkAudioRecordPermissions(View view, InterfaceC4339a onPermissionDenied, InterfaceC4339a onPermissionGranted) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(onPermissionDenied, "onPermissionDenied");
        AbstractC22676k.m65750j(onPermissionGranted, "onPermissionGranted");
        String string = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_audio_record_title);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_audio_record_message);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_audio_record_message);
        AbstractC22676k.m65749i(string3, "getString(...)");
        checkPermissions(view, string, string2, string3, AbstractC37056f.m118958J("android.permission.RECORD_AUDIO"), onPermissionDenied, onPermissionGranted);
    }

    public final void checkCameraPermissions(View view, InterfaceC4339a onPermissionDenied, InterfaceC4339a onPermissionGranted) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(onPermissionDenied, "onPermissionDenied");
        AbstractC22676k.m65750j(onPermissionGranted, "onPermissionGranted");
        String string = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_camera_title);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_camera_message);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_camera_message);
        AbstractC22676k.m65749i(string3, "getString(...)");
        checkPermissions(view, string, string2, string3, AbstractC37056f.m118958J("android.permission.CAMERA"), onPermissionDenied, onPermissionGranted);
    }

    public final void checkFilesPermissions(View view, Function1 onPermissionResult) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(onPermissionResult, "onPermissionResult");
        checkStoragePermissions(view, Permissions.INSTANCE.filesPermissions(), onPermissionResult);
    }

    public final void checkVisualMediaPermissions(View view, Function1 onPermissionResult) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(onPermissionResult, "onPermissionResult");
        checkStoragePermissions(view, Permissions.INSTANCE.visualMediaPermissions(), onPermissionResult);
    }

    public final void checkWriteStoragePermissions(View view, InterfaceC4339a onPermissionDenied, InterfaceC4339a onPermissionGranted) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(onPermissionDenied, "onPermissionDenied");
        AbstractC22676k.m65750j(onPermissionGranted, "onPermissionGranted");
        if (Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy()) {
            onPermissionGranted.invoke();
            return;
        }
        String string = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_storage_title);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_storage_message);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = view.getContext().getString(C19470R.string.stream_ui_message_composer_permission_setting_message);
        AbstractC22676k.m65749i(string3, "getString(...)");
        checkPermissions(view, string, string2, string3, AbstractC37056f.m118958J("android.permission.WRITE_EXTERNAL_STORAGE"), onPermissionDenied, onPermissionGranted);
    }

    public final boolean isGrantedAudioRecordPermission(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return AbstractC32122c.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
    }

    public final boolean isGrantedCameraPermissions(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return AbstractC32122c.checkSelfPermission(context, "android.permission.CAMERA") == 0;
    }

    public final boolean isNeededToRequestForCameraPermissions(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return ContextUtilsKt.isPermissionDeclared(context, "android.permission.CAMERA") && !isGrantedCameraPermissions(context);
    }
}
