package com.whoop.universalcheckout.features.cart.domain;

import com.whoop.universalcheckout.features.cart.domain.models.CartResponse;
import ge3.AbstractC15751g;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/b;", "", "<init>", "()V", "c", "b", "a", "Lcom/whoop/universalcheckout/features/cart/domain/b$a;", "Lcom/whoop/universalcheckout/features/cart/domain/b$b;", "Lcom/whoop/universalcheckout/features/cart/domain/b$c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10659b {

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/b$b;", "Lcom/whoop/universalcheckout/features/cart/domain/b;", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "response", "<init>", "(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "()Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC10659b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CartResponse response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CartResponse response) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CartResponse getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.response, ((b) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "Loaded(response=" + this.response + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/b$c;", "Lcom/whoop/universalcheckout/features/cart/domain/b;", "<init>", "()V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC10659b {

        /* JADX INFO: renamed from: a */
        public static final c f32468a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC10659b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10659b() {
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.b$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/b$a;", "Lcom/whoop/universalcheckout/features/cart/domain/b;", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "response", "Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;", "kind", "", "supportText", "<init>", "(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "b", "()Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;", "()Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;", "c", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC10659b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CartResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC41432a kind;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String supportText;

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.b$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "Load", "Mutation", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public enum EnumC41432a {
            Load,
            Mutation;

            private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

            public static InterfaceC33616a getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CartResponse cartResponse, EnumC41432a kind, String str) {
            super(null);
            AbstractC22676k.m65750j(kind, "kind");
            this.response = cartResponse;
            this.kind = kind;
            this.supportText = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC41432a getKind() {
            return this.kind;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CartResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSupportText() {
            return this.supportText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.response, aVar.response) && this.kind == aVar.kind && AbstractC22676k.m65745e(this.supportText, aVar.supportText);
        }

        public int hashCode() {
            CartResponse cartResponse = this.response;
            int iHashCode = (this.kind.hashCode() + ((cartResponse == null ? 0 : cartResponse.hashCode()) * 31)) * 31;
            String str = this.supportText;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            CartResponse cartResponse = this.response;
            EnumC41432a enumC41432a = this.kind;
            String str = this.supportText;
            StringBuilder sb4 = new StringBuilder("Error(response=");
            sb4.append(cartResponse);
            sb4.append(", kind=");
            sb4.append(enumC41432a);
            sb4.append(", supportText=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ a(CartResponse cartResponse, EnumC41432a enumC41432a, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : cartResponse, (i13 & 2) != 0 ? EnumC41432a.Load : enumC41432a, (i13 & 4) != 0 ? null : str);
        }
    }
}
