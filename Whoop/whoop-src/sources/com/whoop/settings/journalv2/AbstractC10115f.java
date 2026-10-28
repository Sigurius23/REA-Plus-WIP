package com.whoop.settings.journalv2;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.settings.journalv2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/settings/journalv2/f;", "", "<init>", "()V", "c", "d", "a", "b", "Lcom/whoop/settings/journalv2/f$a;", "Lcom/whoop/settings/journalv2/f$b;", "Lcom/whoop/settings/journalv2/f$c;", "Lcom/whoop/settings/journalv2/f$d;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10115f {

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.f$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/settings/journalv2/f$a;", "Lcom/whoop/settings/journalv2/f;", "", "isJournalEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC10115f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isJournalEnabled;

        public a(boolean z4) {
            super(null);
            this.isJournalEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsJournalEnabled() {
            return this.isJournalEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.isJournalEnabled == ((a) other).isJournalEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isJournalEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("OnChecked(isJournalEnabled=", ")", this.isJournalEnabled);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.f$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/settings/journalv2/f$b;", "Lcom/whoop/settings/journalv2/f;", "", "isDismissEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC10115f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isDismissEnabled;

        public b(boolean z4) {
            super(null);
            this.isDismissEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsDismissEnabled() {
            return this.isDismissEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.isDismissEnabled == ((b) other).isDismissEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isDismissEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("OnDoNotShowDismissCheck(isDismissEnabled=", ")", this.isDismissEnabled);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.f$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/settings/journalv2/f$c;", "Lcom/whoop/settings/journalv2/f;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC10115f {

        /* JADX INFO: renamed from: a */
        public static final c f30437a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.f$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/settings/journalv2/f$d;", "Lcom/whoop/settings/journalv2/f;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC10115f {

        /* JADX INFO: renamed from: a */
        public static final d f30438a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10115f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10115f() {
    }
}
