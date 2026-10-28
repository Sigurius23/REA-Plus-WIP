package io.getstream.chat.android.client.audio;

import io.getstream.chat.android.client.api.QueryParams;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/audio/TrackInfo;", "", QueryParams.URL, "", "hash", "", "positionInt", "<init>", "(Ljava/lang/String;II)V", "getUrl", "()Ljava/lang/String;", "getHash", "()I", "compareTo", "other", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TrackInfo implements Comparable<TrackInfo> {
    private final int hash;
    private final int positionInt;
    private final String url;

    public TrackInfo(String url, int i13, int i14) {
        AbstractC22676k.m65750j(url, "url");
        this.url = url;
        this.hash = i13;
        this.positionInt = i14;
    }

    public final int getHash() {
        return this.hash;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // java.lang.Comparable
    public final int compareTo(TrackInfo other) {
        AbstractC22676k.m65750j(other, "other");
        return AbstractC22676k.m65751k(this.positionInt, other.positionInt);
    }
}
