package com.whoop.healthspan.domain;

import com.mapbox.common.HttpHeaders;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.healthspan.domain.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/healthspan/domain/a;", "", "<init>", "()V", "d", "f", "a", "b", "c", "e", "g", "Lcom/whoop/healthspan/domain/a$a;", "Lcom/whoop/healthspan/domain/a$b;", "Lcom/whoop/healthspan/domain/a$c;", "Lcom/whoop/healthspan/domain/a$d;", "Lcom/whoop/healthspan/domain/a$e;", "Lcom/whoop/healthspan/domain/a$f;", "Lcom/whoop/healthspan/domain/a$g;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC8802a {

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/healthspan/domain/a$a;", "Lcom/whoop/healthspan/domain/a;", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC8802a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.date, ((a) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DateChange(date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/healthspan/domain/a$b;", "Lcom/whoop/healthspan/domain/a;", "<init>", "()V", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC8802a {

        /* JADX INFO: renamed from: a */
        public static final b f26242a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/healthspan/domain/a$c;", "Lcom/whoop/healthspan/domain/a;", "<init>", "()V", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC8802a {

        /* JADX INFO: renamed from: a */
        public static final c f26243a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/healthspan/domain/a$d;", "Lcom/whoop/healthspan/domain/a;", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC8802a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.date, ((d) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LoadData(date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/healthspan/domain/a$e;", "Lcom/whoop/healthspan/domain/a;", "<init>", "()V", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC8802a {

        /* JADX INFO: renamed from: a */
        public static final e f26245a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/healthspan/domain/a$f;", "Lcom/whoop/healthspan/domain/a;", "", "step", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC8802a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int step;

        public f(int i13) {
            super(null);
            this.step = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getStep() {
            return this.step;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.step == ((f) other).step;
        }

        public int hashCode() {
            return Integer.hashCode(this.step);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.step, "OnboardingStepCompleted(step=", ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/healthspan/domain/a$g;", "Lcom/whoop/healthspan/domain/a;", "", "id", "", "isExpanded", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC8802a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isExpanded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String id4, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.isExpanded = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.id, gVar.id) && this.isExpanded == gVar.isExpanded;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isExpanded) + (this.id.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("ToggleDrawer(id=", this.id, ", isExpanded=", ")", this.isExpanded);
        }
    }

    public /* synthetic */ AbstractC8802a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC8802a() {
    }
}
