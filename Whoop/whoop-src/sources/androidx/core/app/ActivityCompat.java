package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p184h5.C16879i;
import p319m4.AbstractC25012a;
import p479s4.AbstractC32122c;
import p479s4.C32127h;

/* JADX INFO: loaded from: classes.dex */
public class ActivityCompat extends AbstractC32122c {
    private static PermissionCompatDelegate sDelegate;

    /* JADX INFO: renamed from: androidx.core.app.ActivityCompat$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public class RunnableC11591 implements Runnable {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ String[] val$permissionsArray;
        final /* synthetic */ int val$requestCode;

        public RunnableC11591(String[] strArr, Activity activity, int i13) {
            this.val$permissionsArray = strArr;
            this.val$activity = activity;
            this.val$requestCode = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.val$permissionsArray.length];
            PackageManager packageManager = this.val$activity.getPackageManager();
            String packageName = this.val$activity.getPackageName();
            int length = this.val$permissionsArray.length;
            for (int i13 = 0; i13 < length; i13++) {
                iArr[i13] = packageManager.checkPermission(this.val$permissionsArray[i13], packageName);
            }
            ((OnRequestPermissionsResultCallback) this.val$activity).onRequestPermissionsResult(this.val$requestCode, this.val$permissionsArray, iArr);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static void finishAfterTransition(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void postponeEnterTransition(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void setEnterSharedElementCallback(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void setExitSharedElementCallback(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void startPostponedEnterTransition(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class Api22Impl {
        private Api22Impl() {
        }

        public static Uri getReferrer(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void onSharedElementsReady(Object obj) {
            ((android.app.SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void requestPermissions(Activity activity, String[] strArr, int i13) {
            activity.requestPermissions(strArr, i13);
        }

        public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static class Api28Impl {
        private Api28Impl() {
        }

        public static <T> T requireViewById(Activity activity, int i13) {
            return (T) activity.requireViewById(i13);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static Display getDisplay(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        public static void setLocusContext(Activity activity, C32127h c32127h, Bundle bundle) {
            activity.setLocusContext(c32127h == null ? null : c32127h.f133152b, bundle);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static boolean isLaunchedFromBubble(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class Api32Impl {
        private Api32Impl() {
        }

        public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i13, String[] strArr, int[] iArr);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface PermissionCompatDelegate {
        boolean onActivityResult(Activity activity, int i13, int i14, Intent intent);

        boolean requestPermissions(Activity activity, String[] strArr, int i13);
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i13);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class SharedElementCallback21Impl extends android.app.SharedElementCallback {
        private final SharedElementCallback mCallback;

        public SharedElementCallback21Impl(SharedElementCallback sharedElementCallback) {
            this.mCallback = sharedElementCallback;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.mCallback.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.mCallback.onCreateSnapshotView(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.mCallback.onMapSharedElements(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.mCallback.onRejectSharedElements(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.mCallback.onSharedElementEnd(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.mCallback.onSharedElementStart(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final android.app.SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.mCallback.onSharedElementsArrived(list, list2, new SharedElementCallback.OnSharedElementsReadyListener() { // from class: androidx.core.app.a
                @Override // androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
                public final void onSharedElementsReady() {
                    ActivityCompat.Api23Impl.onSharedElementsReady(onSharedElementsReadyListener);
                }
            });
        }
    }

    public static void finishAffinity(Activity activity) {
        activity.finishAffinity();
    }

    public static void finishAfterTransition(Activity activity) {
        Api21Impl.finishAfterTransition(activity);
    }

    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return sDelegate;
    }

    public static Uri getReferrer(Activity activity) {
        return Api22Impl.getReferrer(activity);
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean isLaunchedFromBubble(Activity activity) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            return Api31Impl.isLaunchedFromBubble(activity);
        }
        if (i13 == 30) {
            return (Api30Impl.getDisplay(activity) == null || Api30Impl.getDisplay(activity).getDisplayId() == 0) ? false : true;
        }
        return (i13 != 29 || activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
    }

    private static /* synthetic */ void lambda$recreate$0(Activity activity) {
        if (activity.isFinishing() || ActivityRecreator.recreate(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void postponeEnterTransition(Activity activity) {
        Api21Impl.postponeEnterTransition(activity);
    }

    public static void recreate(Activity activity) {
        activity.recreate();
    }

    public static C16879i requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
        return C16879i.m47521a(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(Activity activity, String[] strArr, int i13) {
        PermissionCompatDelegate permissionCompatDelegate = sDelegate;
        if (permissionCompatDelegate == null || !permissionCompatDelegate.requestPermissions(activity, strArr, i13)) {
            HashSet hashSet = new HashSet();
            for (int i14 = 0; i14 < strArr.length; i14++) {
                if (TextUtils.isEmpty(strArr[i14])) {
                    throw new IllegalArgumentException(AbstractC25012a.m73376i(Arrays.toString(strArr), " must not contain null or empty values", new StringBuilder("Permission request for permissions ")));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i14], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i14));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i15 = 0;
                for (int i16 = 0; i16 < strArr.length; i16++) {
                    if (!hashSet.contains(Integer.valueOf(i16))) {
                        strArr2[i15] = strArr[i16];
                        i15++;
                    }
                }
            }
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i13);
            }
            Api23Impl.requestPermissions(activity, strArr, i13);
        }
    }

    public static <T extends View> T requireViewById(Activity activity, int i13) {
        return (T) Api28Impl.requireViewById(activity, i13);
    }

    public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        Api21Impl.setEnterSharedElementCallback(activity, sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static void setExitSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        Api21Impl.setExitSharedElementCallback(activity, sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static void setLocusContext(Activity activity, C32127h c32127h, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setLocusContext(activity, c32127h, bundle);
        }
    }

    public static void setPermissionCompatDelegate(PermissionCompatDelegate permissionCompatDelegate) {
        sDelegate = permissionCompatDelegate;
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i13 >= 32) {
            return Api32Impl.shouldShowRequestPermissionRationale(activity, str);
        }
        return i13 == 31 ? Api31Impl.shouldShowRequestPermissionRationale(activity, str) : Api23Impl.shouldShowRequestPermissionRationale(activity, str);
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i13, Bundle bundle) {
        activity.startActivityForResult(intent, i13, bundle);
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16, bundle);
    }

    public static void startPostponedEnterTransition(Activity activity) {
        Api21Impl.startPostponedEnterTransition(activity);
    }
}
