package com.whoop.whooplabs.feature.navigation;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0007\b\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "b", "c", "Lcom/whoop/whooplabs/feature/navigation/a$a;", "Lcom/whoop/whooplabs/feature/navigation/a$b;", "Lcom/whoop/whooplabs/feature/navigation/a$c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10838a {

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/a$a;", "Lcom/whoop/whooplabs/feature/navigation/a;", "", "campaignFilter", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC10838a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String campaignFilter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String campaignFilter) {
            super(null);
            AbstractC22676k.m65750j(campaignFilter, "campaignFilter");
            this.campaignFilter = campaignFilter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCampaignFilter() {
            return this.campaignFilter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.campaignFilter, ((a) other).campaignFilter);
        }

        public int hashCode() {
            return this.campaignFilter.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Completed(campaignFilter=", this.campaignFilter, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/a$b;", "Lcom/whoop/whooplabs/feature/navigation/a;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC10838a {

        /* JADX INFO: renamed from: a */
        public static final b f33250a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.feature.navigation.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/a$c;", "Lcom/whoop/whooplabs/feature/navigation/a;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC10838a {

        /* JADX INFO: renamed from: a */
        public static final c f33251a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10838a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public final String m28560a() {
        if (equals(b.f33250a)) {
            return WhoopLabsNavHostDestination.C10836g.f33245a.getBaseRoute();
        }
        if (equals(c.f33251a)) {
            return WhoopLabsNavHostDestination.C10837h.f33247a.getBaseRoute();
        }
        if (this instanceof a) {
            return WhoopLabsNavHostDestination.C10835f.f33243a.m28559a(((a) this).getCampaignFilter());
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC10838a() {
    }
}
