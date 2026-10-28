package kp2;

import c13.AbstractC3855a;
import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kp2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lkp2/b;", "", "<init>", "()V", "e", "i", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "c", "f", "a", "b", "d", "Lkp2/b$a;", "Lkp2/b$b;", "Lkp2/b$c;", "Lkp2/b$d;", "Lkp2/b$e;", "Lkp2/b$f;", "Lkp2/b$g;", "Lkp2/b$h;", "Lkp2/b$i;", "Lkp2/b$j;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22759b {

    /* JADX INFO: renamed from: kp2.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkp2/b$a;", "Lkp2/b;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22759b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String source) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.source, ((a) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("CountryFieldClicked(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: kp2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkp2/b$b;", "Lkp2/b;", "<init>", "()V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22759b {

        /* JADX INFO: renamed from: a */
        public static final b f89574a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: kp2.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkp2/b$c;", "Lkp2/b;", "<init>", "()V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC22759b {

        /* JADX INFO: renamed from: a */
        public static final c f89575a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: kp2.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkp2/b$d;", "Lkp2/b;", "<init>", "()V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC22759b {

        /* JADX INFO: renamed from: a */
        public static final d f89576a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: kp2.b$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lkp2/b$e;", "Lkp2/b;", "", "cartId", "source", "", "manualRefresh", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC22759b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cartId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean manualRefresh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String cartId, String source, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(cartId, "cartId");
            AbstractC22676k.m65750j(source, "source");
            this.cartId = cartId;
            this.source = source;
            this.manualRefresh = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getManualRefresh() {
            return this.manualRefresh;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.cartId, eVar.cartId) && AbstractC22676k.m65745e(this.source, eVar.source) && this.manualRefresh == eVar.manualRefresh;
        }

        public int hashCode() {
            return Boolean.hashCode(this.manualRefresh) + AbstractC11266d.m30450d(this.cartId.hashCode() * 31, 31, this.source);
        }

        public String toString() {
            String str = this.cartId;
            String str2 = this.source;
            return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("Refresh(cartId=", str, ", source=", str2, ", manualRefresh="), this.manualRefresh, ")");
        }
    }

    /* JADX INFO: renamed from: kp2.b$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkp2/b$f;", "Lkp2/b;", "", "fieldType", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC22759b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fieldType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String fieldType, String value) {
            super(null);
            AbstractC22676k.m65750j(fieldType, "fieldType");
            AbstractC22676k.m65750j(value, "value");
            this.fieldType = fieldType;
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFieldType() {
            return this.fieldType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.fieldType, fVar.fieldType) && AbstractC22676k.m65745e(this.value, fVar.value);
        }

        public int hashCode() {
            return this.value.hashCode() + (this.fieldType.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("SelectDropdownOption(fieldType=", this.fieldType, ", value=", this.value, ")");
        }
    }

    /* JADX INFO: renamed from: kp2.b$g */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lkp2/b$g;", "Lkp2/b;", "", "fieldType", "title", "", "Lkp2/h;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC22759b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fieldType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C22765h> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String fieldType, String title, List<C22765h> options) {
            super(null);
            AbstractC22676k.m65750j(fieldType, "fieldType");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(options, "options");
            this.fieldType = fieldType;
            this.title = title;
            this.options = options;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFieldType() {
            return this.fieldType;
        }

        /* JADX INFO: renamed from: b */
        public final List<C22765h> m65901b() {
            return this.options;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.fieldType, gVar.fieldType) && AbstractC22676k.m65745e(this.title, gVar.title) && AbstractC22676k.m65745e(this.options, gVar.options);
        }

        public int hashCode() {
            return this.options.hashCode() + AbstractC11266d.m30450d(this.fieldType.hashCode() * 31, 31, this.title);
        }

        public String toString() {
            String str = this.fieldType;
            String str2 = this.title;
            return AbstractC3855a.m11829m(AbstractC11895b.m32001t("ShowDropdownOptions(fieldType=", str, ", title=", str2, ", options="), this.options, ")");
        }
    }

    /* JADX INFO: renamed from: kp2.b$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lkp2/b$h;", "Lkp2/b;", "", "cartId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC22759b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String cartId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String cartId) {
            super(null);
            AbstractC22676k.m65750j(cartId, "cartId");
            this.cartId = cartId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCartId() {
            return this.cartId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.cartId, ((h) other).cartId);
        }

        public int hashCode() {
            return this.cartId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SubmitForm(cartId=", this.cartId, ")");
        }
    }

    /* JADX INFO: renamed from: kp2.b$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lkp2/b$i;", "Lkp2/b;", "", "fieldType", "value", "", "maxLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC22759b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fieldType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer maxLength;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String fieldType, String value, Integer num) {
            super(null);
            AbstractC22676k.m65750j(fieldType, "fieldType");
            AbstractC22676k.m65750j(value, "value");
            this.fieldType = fieldType;
            this.value = value;
            this.maxLength = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFieldType() {
            return this.fieldType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getMaxLength() {
            return this.maxLength;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.fieldType, iVar.fieldType) && AbstractC22676k.m65745e(this.value, iVar.value) && AbstractC22676k.m65745e(this.maxLength, iVar.maxLength);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.fieldType.hashCode() * 31, 31, this.value);
            Integer num = this.maxLength;
            return iM30450d + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.fieldType;
            String str2 = this.value;
            return AbstractC11478a.m30859k(AbstractC11895b.m32001t("UpdateFieldValue(fieldType=", str, ", value=", str2, ", maxLength="), this.maxLength, ")");
        }
    }

    public /* synthetic */ AbstractC22759b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22759b() {
    }

    /* JADX INFO: renamed from: kp2.b$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lkp2/b$j;", "Lkp2/b;", "", "fieldType", "value", "pattern", "displayLabel", "", "minLength", "example", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "f", "e", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC22759b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String fieldType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String pattern;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String displayLabel;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Integer minLength;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String example;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String fieldType, String value, String str, String displayLabel, Integer num, String str2) {
            super(null);
            AbstractC22676k.m65750j(fieldType, "fieldType");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(displayLabel, "displayLabel");
            this.fieldType = fieldType;
            this.value = value;
            this.pattern = str;
            this.displayLabel = displayLabel;
            this.minLength = num;
            this.example = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDisplayLabel() {
            return this.displayLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getExample() {
            return this.example;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFieldType() {
            return this.fieldType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getMinLength() {
            return this.minLength;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.fieldType, jVar.fieldType) && AbstractC22676k.m65745e(this.value, jVar.value) && AbstractC22676k.m65745e(this.pattern, jVar.pattern) && AbstractC22676k.m65745e(this.displayLabel, jVar.displayLabel) && AbstractC22676k.m65745e(this.minLength, jVar.minLength) && AbstractC22676k.m65745e(this.example, jVar.example);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.fieldType.hashCode() * 31, 31, this.value);
            String str = this.pattern;
            int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.displayLabel);
            Integer num = this.minLength;
            int iHashCode = (iM30450d2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.example;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.fieldType;
            String str2 = this.value;
            String str3 = this.pattern;
            String str4 = this.displayLabel;
            Integer num = this.minLength;
            String str5 = this.example;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ValidateField(fieldType=", str, ", value=", str2, ", pattern=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", displayLabel=", str4, ", minLength=");
            sbM32001t.append(num);
            sbM32001t.append(", example=");
            sbM32001t.append(str5);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public /* synthetic */ j(String str, String str2, String str3, String str4, Integer num, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : str5);
        }
    }
}
