package com.whoop.settings.journalv2;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.settings.journalv2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/settings/journalv2/a;", "", "<init>", "()V", "a", "b", "d", "c", "Lcom/whoop/settings/journalv2/a$a;", "Lcom/whoop/settings/journalv2/a$b;", "Lcom/whoop/settings/journalv2/a$c;", "Lcom/whoop/settings/journalv2/a$d;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10110a {

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/settings/journalv2/a$a;", "Lcom/whoop/settings/journalv2/a;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC10110a {

        /* JADX INFO: renamed from: a */
        public static final a f30397a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/settings/journalv2/a$b;", "Lcom/whoop/settings/journalv2/a;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC10110a {

        /* JADX INFO: renamed from: a */
        public static final b f30398a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.a$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/settings/journalv2/a$c;", "Lcom/whoop/settings/journalv2/a;", "", "doNotShowDismissIsChecked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC10110a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean doNotShowDismissIsChecked;

        public c(boolean z4) {
            super(null);
            this.doNotShowDismissIsChecked = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDoNotShowDismissIsChecked() {
            return this.doNotShowDismissIsChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.doNotShowDismissIsChecked == ((c) other).doNotShowDismissIsChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.doNotShowDismissIsChecked);
        }

        public String toString() {
            return AbstractC3855a.m11827k("UpdateDismissDialog(doNotShowDismissIsChecked=", ")", this.doNotShowDismissIsChecked);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.a$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/settings/journalv2/a$d;", "Lcom/whoop/settings/journalv2/a;", "", "isChecked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC10110a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isChecked;

        public d(boolean z4) {
            super(null);
            this.isChecked = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.isChecked == ((d) other).isChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return AbstractC3855a.m11827k("UpdateJournalEnabled(isChecked=", ")", this.isChecked);
        }
    }

    public /* synthetic */ AbstractC10110a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10110a() {
    }
}
