package com.whoop.whoopaction.domain.models;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.Date;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import u82.C34641b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0019\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJx\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u001b\b\u0002\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001fR3\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010!R3\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b8\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b9\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b:\u0010\u001f¨\u0006="}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;", "Lcom/whoop/whoopaction/domain/models/OSActionParameters;", "", "title", "Ljava/util/Date;", "Lcom/whoop/serialization/Date;", "Lwc3/i;", "with", "Lj93/d;", "startDate", "endDate", "location", "notes", QueryParams.URL, "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Date;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/Date;", "getStartDate", "getStartDate$annotations", "()V", "getEndDate", "getEndDate$annotations", "getLocation", "getNotes", "getUrl", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AddToCalendarParameters implements OSActionParameters {
    private final Date endDate;
    private final String location;
    private final String notes;
    private final Date startDate;
    private final String title;
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AddToCalendarParameters$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AddToCalendarParameters(int i13, String str, Date date, Date date2, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, AddToCalendarParameters$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.startDate = date;
        this.endDate = date2;
        if ((i13 & 8) == 0) {
            this.location = null;
        } else {
            this.location = str2;
        }
        if ((i13 & 16) == 0) {
            this.notes = null;
        } else {
            this.notes = str3;
        }
        if ((i13 & 32) == 0) {
            this.url = null;
        } else {
            this.url = str4;
        }
    }

    public static /* synthetic */ AddToCalendarParameters copy$default(AddToCalendarParameters addToCalendarParameters, String str, Date date, Date date2, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = addToCalendarParameters.title;
        }
        if ((i13 & 2) != 0) {
            date = addToCalendarParameters.startDate;
        }
        if ((i13 & 4) != 0) {
            date2 = addToCalendarParameters.endDate;
        }
        if ((i13 & 8) != 0) {
            str2 = addToCalendarParameters.location;
        }
        if ((i13 & 16) != 0) {
            str3 = addToCalendarParameters.notes;
        }
        if ((i13 & 32) != 0) {
            str4 = addToCalendarParameters.url;
        }
        String str5 = str3;
        String str6 = str4;
        return addToCalendarParameters.copy(str, date, date2, str2, str5, str6);
    }

    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getEndDate$annotations() {
    }

    @InterfaceC37144i(with = C34641b.class)
    public static /* synthetic */ void getStartDate$annotations() {
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(AddToCalendarParameters self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        C34641b c34641b = C34641b.f145940a;
        output.encodeSerializableElement(serialDesc, 1, c34641b, self.startDate);
        output.encodeSerializableElement(serialDesc, 2, c34641b, self.endDate);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.location != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.location);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.notes != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.notes);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.url == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final AddToCalendarParameters copy(String title, Date startDate, Date endDate, String location, String notes, String url) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(startDate, "startDate");
        AbstractC22676k.m65750j(endDate, "endDate");
        return new AddToCalendarParameters(title, startDate, endDate, location, notes, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToCalendarParameters)) {
            return false;
        }
        AddToCalendarParameters addToCalendarParameters = (AddToCalendarParameters) other;
        return AbstractC22676k.m65745e(this.title, addToCalendarParameters.title) && AbstractC22676k.m65745e(this.startDate, addToCalendarParameters.startDate) && AbstractC22676k.m65745e(this.endDate, addToCalendarParameters.endDate) && AbstractC22676k.m65745e(this.location, addToCalendarParameters.location) && AbstractC22676k.m65745e(this.notes, addToCalendarParameters.notes) && AbstractC22676k.m65745e(this.url, addToCalendarParameters.url);
    }

    public final Date getEndDate() {
        return this.endDate;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Date getStartDate() {
        return this.startDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.endDate, AbstractC38963t7.m124373c(this.startDate, this.title.hashCode() * 31, 31), 31);
        String str = this.location;
        int iHashCode = (iM124373c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notes;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        Date date = this.startDate;
        Date date2 = this.endDate;
        String str2 = this.location;
        String str3 = this.notes;
        String str4 = this.url;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("AddToCalendarParameters(title=", str, ", startDate=", date, ", endDate=");
        sbM11830n.append(date2);
        sbM11830n.append(", location=");
        sbM11830n.append(str2);
        sbM11830n.append(", notes=");
        return AbstractC11266d.m30464r(sbM11830n, str3, ", url=", str4, ")");
    }

    public AddToCalendarParameters(String title, Date startDate, Date endDate, String str, String str2, String str3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(startDate, "startDate");
        AbstractC22676k.m65750j(endDate, "endDate");
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = str;
        this.notes = str2;
        this.url = str3;
    }

    public /* synthetic */ AddToCalendarParameters(String str, Date date, Date date2, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, date2, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4);
    }
}
