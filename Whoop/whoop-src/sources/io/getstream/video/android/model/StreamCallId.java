package io.getstream.video.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e43.AbstractC12721m;
import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import mn.C25704b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010&J \u0010/\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b\u0007\u0010!¨\u00069"}, m65681d2 = {"Lio/getstream/video/android/model/StreamCallId;", "Landroid/os/Parcelable;", "", "type", "id", "cid", "", "isValid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stream_video_android_core_release", "(Lio/getstream/video/android/model/StreamCallId;Lzc3/c;Lyc3/g;)V", "write$Self", "Le43/m;", "notificationType", "getNotificationId", "(Le43/m;)I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/video/android/model/StreamCallId;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getId", "getCid", "Z", "Companion", "$serializer", "io/getstream/video/android/model/b", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StreamCallId implements Parcelable {
    private final String cid;
    private final String id;
    private final boolean isValid;
    private final String type;
    public static final C19971b Companion = new C19971b();
    public static final Parcelable.Creator<StreamCallId> CREATOR = new C25704b(22);

    @InterfaceC23457c
    public /* synthetic */ StreamCallId(int i13, String str, String str2, String str3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, StreamCallId$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.id = str2;
        if ((i13 & 4) == 0) {
            if (str.length() > 0 && str2.length() > 0) {
                str3 = AbstractC18489d0.m53370k(str, ":", str2);
            } else {
                if (str2.length() <= 0) {
                    throw new IllegalStateException(("[StreamCallId] invalid arguments; type=" + str + ", id=" + str2).toString());
                }
                str3 = str2;
            }
        }
        this.cid = str3;
        if ((i13 & 8) == 0) {
            this.isValid = str.length() > 0 || str2.length() > 0;
        } else {
            this.isValid = z4;
        }
    }

    public static /* synthetic */ StreamCallId copy$default(StreamCallId streamCallId, String str, String str2, String str3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = streamCallId.type;
        }
        if ((i13 & 2) != 0) {
            str2 = streamCallId.id;
        }
        if ((i13 & 4) != 0) {
            str3 = streamCallId.cid;
        }
        if ((i13 & 8) != 0) {
            z4 = streamCallId.isValid;
        }
        return streamCallId.copy(str, str2, str3, z4);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    public static final /* synthetic */ void write$Self$stream_video_android_core_release(StreamCallId self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        String strM53370k;
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeStringElement(serialDesc, 1, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 2)) {
            output.encodeStringElement(serialDesc, 2, self.cid);
        } else {
            String str = self.cid;
            if (self.type.length() > 0 && self.id.length() > 0) {
                strM53370k = AbstractC18489d0.m53370k(self.type, ":", self.id);
            } else {
                if (self.id.length() <= 0) {
                    throw new IllegalStateException(("[StreamCallId] invalid arguments; type=" + self.type + ", id=" + self.id).toString());
                }
                strM53370k = self.id;
            }
            if (!AbstractC22676k.m65745e(str, strM53370k)) {
                output.encodeStringElement(serialDesc, 2, self.cid);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3)) {
            if (self.isValid == (self.type.length() > 0 || self.id.length() > 0)) {
                return;
            }
        }
        output.encodeBooleanElement(serialDesc, 3, self.isValid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public final StreamCallId copy(String type, String id4, String cid, boolean isValid) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        return new StreamCallId(type, id4, cid, isValid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamCallId)) {
            return false;
        }
        StreamCallId streamCallId = (StreamCallId) other;
        return AbstractC22676k.m65745e(this.type, streamCallId.type) && AbstractC22676k.m65745e(this.id, streamCallId.id) && AbstractC22676k.m65745e(this.cid, streamCallId.cid) && this.isValid == streamCallId.isValid;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getId() {
        return this.id;
    }

    public final int getNotificationId(AbstractC12721m notificationType) {
        AbstractC22676k.m65750j(notificationType, "notificationType");
        return (notificationType.f43516a + this.cid).hashCode();
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isValid) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.id), 31, this.cid);
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.id;
        return AbstractC21702c.m61137h(AbstractC11895b.m32001t("StreamCallId(type=", str, ", id=", str2, ", cid="), this.cid, ", isValid=", this.isValid, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC22676k.m65750j(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.id);
        parcel.writeString(this.cid);
        parcel.writeInt(this.isValid ? 1 : 0);
    }

    public StreamCallId(String type, String id4, String cid, boolean z4) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        this.type = type;
        this.id = id4;
        this.cid = cid;
        this.isValid = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StreamCallId(String str, String str2, String str3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            if (str.length() > 0 && str2.length() > 0) {
                str3 = AbstractC18489d0.m53370k(str, ":", str2);
            } else {
                if (str2.length() <= 0) {
                    throw new IllegalStateException(("[StreamCallId] invalid arguments; type=" + str + ", id=" + str2).toString());
                }
                str3 = str2;
            }
        }
        this(str, str2, str3, (i13 & 8) != 0 ? str.length() > 0 || str2.length() > 0 : z4);
    }
}
