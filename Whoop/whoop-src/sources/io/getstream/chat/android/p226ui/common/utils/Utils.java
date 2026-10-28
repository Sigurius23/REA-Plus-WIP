package io.getstream.chat.android.p226ui.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import com.whoop.data.repositories.LanguageRepositoryKt;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class Utils {
    public static final Locale locale = new Locale(LanguageRepositoryKt.DEFAULT_LANGUAGE, "US", "POSIX");

    public static int dpToPx(int i13) {
        return (int) (i13 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static String getMimeType(File file) {
        return getMimeType(file.getPath());
    }

    public static void hideSoftKeyboard(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void showSoftKeyboard(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager.isAcceptingText()) {
            return;
        }
        inputMethodManager.toggleSoftInput(2, 0);
    }

    public static String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        return fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : "";
    }

    public static void showSoftKeyboard(View view) {
        showSoftKeyboard(view.getContext());
    }
}
