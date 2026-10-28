package com.whoop.settings.journalv2;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.settings.journalv2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/settings/journalv2/d;", "", "b", "a", "d", "c", "Lcom/whoop/settings/journalv2/d$a;", "Lcom/whoop/settings/journalv2/d$b;", "Lcom/whoop/settings/journalv2/d$c;", "Lcom/whoop/settings/journalv2/d$d;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC10113d {

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.d$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/settings/journalv2/d$a;", "Lcom/whoop/settings/journalv2/d;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getErrorMessage", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC10113d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String errorMessage;

        public a(String errorMessage) {
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.errorMessage, ((a) other).errorMessage);
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(errorMessage=", this.errorMessage, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.d$b */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/settings/journalv2/d$b;", "Lcom/whoop/settings/journalv2/d;", "", "isJournalEnabled", "isShowDismissDialogChecked", "", "cycleId", "<init>", "(ZZLjava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC10113d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isJournalEnabled;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isShowDismissDialogChecked;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Long cycleId;

        public b(boolean z4, boolean z13, Long l7) {
            this.isJournalEnabled = z4;
            this.isShowDismissDialogChecked = z13;
            this.cycleId = l7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsJournalEnabled() {
            return this.isJournalEnabled;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsShowDismissDialogChecked() {
            return this.isShowDismissDialogChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.isJournalEnabled == bVar.isJournalEnabled && this.isShowDismissDialogChecked == bVar.isShowDismissDialogChecked && AbstractC22676k.m65745e(this.cycleId, bVar.cycleId);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isJournalEnabled) * 31, 31, this.isShowDismissDialogChecked);
            Long l7 = this.cycleId;
            return iM8289b + (l7 == null ? 0 : l7.hashCode());
        }

        public String toString() {
            boolean z4 = this.isJournalEnabled;
            boolean z13 = this.isShowDismissDialogChecked;
            Long l7 = this.cycleId;
            StringBuilder sbM32002u = AbstractC11895b.m32002u("Result(isJournalEnabled=", ", isShowDismissDialogChecked=", ", cycleId=", z4, z13);
            sbM32002u.append(l7);
            sbM32002u.append(")");
            return sbM32002u.toString();
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.d$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/settings/journalv2/d$c;", "Lcom/whoop/settings/journalv2/d;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC10113d {

        /* JADX INFO: renamed from: a */
        public static final c f30423a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/settings/journalv2/d$d;", "Lcom/whoop/settings/journalv2/d;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC10113d {

        /* JADX INFO: renamed from: a */
        public static final d f30424a = new d();

        private d() {
        }
    }
}
