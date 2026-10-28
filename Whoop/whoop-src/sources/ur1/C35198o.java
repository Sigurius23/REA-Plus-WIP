package ur1;

import com.whoop.data.remote.domain.dto.JournalBounds;
import com.whoop.data.remote.domain.dto.SubtitleCallout;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr1.C32915g;
import tr1.C34098b;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ur1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b&\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b\u001f\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b'\u00100¨\u00061"}, m65681d2 = {"Lur1/o;", "", "", "Ltr1/b;", "behaviors", "", "notes", "", "isOnToday", "headerText", "Lcom/whoop/data/remote/domain/dto/JournalBounds;", "journalBounds", "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "subtitleCallout", "Lur1/d;", "datePickerDomainState", "Lsr1/g;", "navigationButton", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lsr1/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "f", "c", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "d", "e", "Lcom/whoop/data/remote/domain/dto/JournalBounds;", "()Lcom/whoop/data/remote/domain/dto/JournalBounds;", "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "g", "()Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "Lur1/d;", "()Lur1/d;", "Lsr1/g;", "()Lsr1/g;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35198o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C34098b> behaviors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String notes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isOnToday;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String headerText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final JournalBounds journalBounds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final SubtitleCallout subtitleCallout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C35187d datePickerDomainState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C32915g navigationButton;

    public C35198o(List<C34098b> behaviors, String notes, boolean z4, String headerText, JournalBounds journalBounds, SubtitleCallout subtitleCallout, C35187d c35187d, C32915g c32915g) {
        AbstractC22676k.m65750j(behaviors, "behaviors");
        AbstractC22676k.m65750j(notes, "notes");
        AbstractC22676k.m65750j(headerText, "headerText");
        this.behaviors = behaviors;
        this.notes = notes;
        this.isOnToday = z4;
        this.headerText = headerText;
        this.journalBounds = journalBounds;
        this.subtitleCallout = subtitleCallout;
        this.datePickerDomainState = c35187d;
        this.navigationButton = c32915g;
    }

    /* JADX INFO: renamed from: a */
    public final List<C34098b> m111511a() {
        return this.behaviors;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C35187d getDatePickerDomainState() {
        return this.datePickerDomainState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final JournalBounds getJournalBounds() {
        return this.journalBounds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C32915g getNavigationButton() {
        return this.navigationButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35198o)) {
            return false;
        }
        C35198o c35198o = (C35198o) other;
        return AbstractC22676k.m65745e(this.behaviors, c35198o.behaviors) && AbstractC22676k.m65745e(this.notes, c35198o.notes) && this.isOnToday == c35198o.isOnToday && AbstractC22676k.m65745e(this.headerText, c35198o.headerText) && AbstractC22676k.m65745e(this.journalBounds, c35198o.journalBounds) && AbstractC22676k.m65745e(this.subtitleCallout, c35198o.subtitleCallout) && AbstractC22676k.m65745e(this.datePickerDomainState, c35198o.datePickerDomainState) && AbstractC22676k.m65745e(this.navigationButton, c35198o.navigationButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final SubtitleCallout getSubtitleCallout() {
        return this.subtitleCallout;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsOnToday() {
        return this.isOnToday;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.behaviors.hashCode() * 31, 31, this.notes), 31, this.isOnToday), 31, this.headerText);
        JournalBounds journalBounds = this.journalBounds;
        int iHashCode = (iM30450d + (journalBounds == null ? 0 : journalBounds.hashCode())) * 31;
        SubtitleCallout subtitleCallout = this.subtitleCallout;
        int iHashCode2 = (iHashCode + (subtitleCallout == null ? 0 : subtitleCallout.hashCode())) * 31;
        C35187d c35187d = this.datePickerDomainState;
        int iHashCode3 = (iHashCode2 + (c35187d == null ? 0 : c35187d.hashCode())) * 31;
        C32915g c32915g = this.navigationButton;
        return iHashCode3 + (c32915g != null ? c32915g.hashCode() : 0);
    }

    public String toString() {
        List<C34098b> list = this.behaviors;
        String str = this.notes;
        boolean z4 = this.isOnToday;
        String str2 = this.headerText;
        JournalBounds journalBounds = this.journalBounds;
        SubtitleCallout subtitleCallout = this.subtitleCallout;
        C35187d c35187d = this.datePickerDomainState;
        C32915g c32915g = this.navigationButton;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("OtherJournalData(behaviors=", ", notes=", str, ", isOnToday=", list);
        AbstractC38963t7.m124391u(sbM79507k, z4, ", headerText=", str2, ", journalBounds=");
        sbM79507k.append(journalBounds);
        sbM79507k.append(", subtitleCallout=");
        sbM79507k.append(subtitleCallout);
        sbM79507k.append(", datePickerDomainState=");
        sbM79507k.append(c35187d);
        sbM79507k.append(", navigationButton=");
        sbM79507k.append(c32915g);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }
}
