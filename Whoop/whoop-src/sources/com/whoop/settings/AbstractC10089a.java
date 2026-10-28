package com.whoop.settings;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.settings.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/settings/a;", "", "<init>", "()V", "d", "c", "a", "b", "Lcom/whoop/settings/a$a;", "Lcom/whoop/settings/a$b;", "Lcom/whoop/settings/a$c;", "Lcom/whoop/settings/a$d;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10089a {

    /* JADX INFO: renamed from: com.whoop.settings.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/settings/a$a;", "Lcom/whoop/settings/a;", "", "brand", "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC10089a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String brand;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String last4;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String brand, String last4) {
            super(null);
            AbstractC22676k.m65750j(brand, "brand");
            AbstractC22676k.m65750j(last4, "last4");
            this.brand = brand;
            this.last4 = last4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.brand, aVar.brand) && AbstractC22676k.m65745e(this.last4, aVar.last4);
        }

        public int hashCode() {
            return this.last4.hashCode() + (this.brand.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("CardExpired(brand=", this.brand, ", last4=", this.last4, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/settings/a$b;", "Lcom/whoop/settings/a;", "", "brand", "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC10089a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String brand;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String last4;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String brand, String last4) {
            super(null);
            AbstractC22676k.m65750j(brand, "brand");
            AbstractC22676k.m65750j(last4, "last4");
            this.brand = brand;
            this.last4 = last4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.brand, bVar.brand) && AbstractC22676k.m65745e(this.last4, bVar.last4);
        }

        public int hashCode() {
            return this.last4.hashCode() + (this.brand.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("CardExpiring(brand=", this.brand, ", last4=", this.last4, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/settings/a$c;", "Lcom/whoop/settings/a;", "<init>", "()V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC10089a {

        /* JADX INFO: renamed from: a */
        public static final c f30332a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/settings/a$d;", "Lcom/whoop/settings/a;", "<init>", "()V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC10089a {

        /* JADX INFO: renamed from: a */
        public static final d f30333a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10089a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10089a() {
    }
}
