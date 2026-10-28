package io.getstream.chat.android.client.uploader;

import i93.C18277c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/uploader/FilenameSanitizer;", "", "<init>", "()V", "allowedChars", "", "", "sanitize", "", "filename", "sanitizeInternal", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class FilenameSanitizer {
    private static final String EMPTY = "";
    private static final int MAX_NAME_LEN = 255;
    private final List<Character> allowedChars = AbstractC25265s.m74128f1('_', AbstractC25265s.m74128f1('-', AbstractC25265s.m74129g1(AbstractC25265s.m74126d1(new C18277c('a', 'z'), new C18277c('A', 'Z')), new C18277c('0', '9'))));

    private final String sanitizeInternal(String filename) {
        String strM125860F0 = AbstractC39414r.m125860F0('.', filename, "");
        if (strM125860F0.length() > 0) {
            filename = AbstractC39414r.m125900s0(filename, ".".concat(strM125860F0));
        }
        ArrayList arrayList = new ArrayList(filename.length());
        for (int i13 = 0; i13 < filename.length(); i13++) {
            char cCharAt = filename.charAt(i13);
            if (!this.allowedChars.contains(Character.valueOf(cCharAt))) {
                cCharAt = '_';
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        String strM74110N0 = AbstractC25265s.m74110N0(arrayList, "", null, null, null, 62);
        int length = 254 - strM125860F0.length();
        if (strM74110N0.length() > length) {
            strM74110N0 = strM74110N0.substring(0, length);
            AbstractC22676k.m65749i(strM74110N0, "substring(...)");
        }
        return strM125860F0.length() > 0 ? AbstractC18489d0.m53370k(strM74110N0, ".", strM125860F0) : strM74110N0;
    }

    public final String sanitize(String filename) {
        AbstractC22676k.m65750j(filename, "filename");
        try {
            return sanitizeInternal(filename);
        } catch (Throwable unused) {
            return filename;
        }
    }
}
