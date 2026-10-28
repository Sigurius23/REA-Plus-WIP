package io.getstream.chat.android.client.api.interceptor;

import java.io.OutputStream;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/api/interceptor/StringOutputStream;", "Ljava/io/OutputStream;", "<init>", "()V", "", "b", "Ll83/a0;", "write", "(I)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "stringBuilder", "Ljava/lang/StringBuilder;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class StringOutputStream extends OutputStream {
    private final StringBuilder stringBuilder = new StringBuilder();

    public final String toString() {
        String string = this.stringBuilder.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string.length() == 0 ? "no_body" : string;
    }

    @Override // java.io.OutputStream
    public final void write(int b) {
        this.stringBuilder.append((char) b);
    }
}
