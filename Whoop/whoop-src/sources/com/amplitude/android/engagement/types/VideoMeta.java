package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0015¨\u0006&"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/VideoMeta;", "", "", "type", "src", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/VideoMeta;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/VideoMeta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getSrc", "Companion", "$serializer", "com/amplitude/android/engagement/types/m2", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoMeta {
    public static final int $stable = 0;
    public static final C4915m2 Companion = new C4915m2();
    private final String src;
    private final String type;

    @InterfaceC23457c
    public /* synthetic */ VideoMeta(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, VideoMeta$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.src = str2;
    }

    public static /* synthetic */ VideoMeta copy$default(VideoMeta videoMeta, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoMeta.type;
        }
        if ((i13 & 2) != 0) {
            str2 = videoMeta.src;
        }
        return videoMeta.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self(VideoMeta self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.src);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    public final VideoMeta copy(String type, String src) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(src, "src");
        return new VideoMeta(type, src);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoMeta)) {
            return false;
        }
        VideoMeta videoMeta = (VideoMeta) other;
        return AbstractC22676k.m65745e(this.type, videoMeta.type) && AbstractC22676k.m65745e(this.src, videoMeta.src);
    }

    public final String getSrc() {
        return this.src;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.src.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("VideoMeta(type=");
        sb4.append(this.type);
        sb4.append(", src=");
        return AbstractC25012a.m73377j(sb4, this.src, ')');
    }

    public VideoMeta(String type, String src) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(src, "src");
        this.type = type;
        this.src = src;
    }
}
