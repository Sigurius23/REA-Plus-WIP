package com.whoop.whooplabs.data.room.entity;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Date;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import u82.C34641b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002)*B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;", "", "", "tagText", "Ljava/util/Date;", "tagTime", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Date;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Date;", "copy", "(Ljava/lang/String;Ljava/util/Date;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTagText", "Ljava/util/Date;", "getTagTime", "getTagTime$annotations", "()V", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopLabsStudyTagDto {
    private final String tagText;
    private final Date tagTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$Companion;", "", "<init>", "()V", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;", "timestamp", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;", "fromWhoopLabsStudyTag", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;", "Lwc3/c;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WhoopLabsStudyTagDto fromWhoopLabsStudyTag(WhoopLabsStudyTag timestamp) {
            AbstractC22676k.m65750j(timestamp, "timestamp");
            return new WhoopLabsStudyTagDto(timestamp.getNote(), timestamp.getTimestamp().toDate());
        }

        public final InterfaceC37138c serializer() {
            return WhoopLabsStudyTagDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WhoopLabsStudyTagDto(int i13, String str, Date date, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, WhoopLabsStudyTagDto$$serializer.INSTANCE.getDescriptor());
        }
        this.tagText = str;
        this.tagTime = date;
    }

    public static /* synthetic */ WhoopLabsStudyTagDto copy$default(WhoopLabsStudyTagDto whoopLabsStudyTagDto, String str, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = whoopLabsStudyTagDto.tagText;
        }
        if ((i13 & 2) != 0) {
            date = whoopLabsStudyTagDto.tagTime;
        }
        return whoopLabsStudyTagDto.copy(str, date);
    }

    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getTagTime$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(WhoopLabsStudyTagDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.tagText);
        output.encodeNullableSerializableElement(serialDesc, 1, C34641b.f145940a, self.tagTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTagText() {
        return this.tagText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getTagTime() {
        return this.tagTime;
    }

    public final WhoopLabsStudyTagDto copy(String tagText, Date tagTime) {
        return new WhoopLabsStudyTagDto(tagText, tagTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopLabsStudyTagDto)) {
            return false;
        }
        WhoopLabsStudyTagDto whoopLabsStudyTagDto = (WhoopLabsStudyTagDto) other;
        return AbstractC22676k.m65745e(this.tagText, whoopLabsStudyTagDto.tagText) && AbstractC22676k.m65745e(this.tagTime, whoopLabsStudyTagDto.tagTime);
    }

    public final String getTagText() {
        return this.tagText;
    }

    public final Date getTagTime() {
        return this.tagTime;
    }

    public int hashCode() {
        String str = this.tagText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.tagTime;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        return "WhoopLabsStudyTagDto(tagText=" + this.tagText + ", tagTime=" + this.tagTime + ")";
    }

    public WhoopLabsStudyTagDto(String str, Date date) {
        this.tagText = str;
        this.tagTime = date;
    }
}
