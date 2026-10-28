package io2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: io2.n0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lio2/n0;", "", "<init>", "()V", "b", "c", "a", "Lio2/n0$a;", "Lio2/n0$b;", "Lio2/n0$c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20775n0 {

    /* JADX INFO: renamed from: io2.n0$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lio2/n0$a;", "Lio2/n0;", "Lcom/whoop/design/util/TextResource;", "errorMessage", "Ly81/f;", "color", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "()Ly81/f;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC20775n0 {

        /* JADX INFO: renamed from: c */
        public static final int f78013c = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource errorMessage;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC39333f color;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource errorMessage, EnumC39333f color) {
            super(null);
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            AbstractC22676k.m65750j(color, "color");
            this.errorMessage = errorMessage;
            this.color = color;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC39333f getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getErrorMessage() {
            return this.errorMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.errorMessage, aVar.errorMessage) && this.color == aVar.color;
        }

        public int hashCode() {
            return this.color.hashCode() + (this.errorMessage.hashCode() * 31);
        }

        public String toString() {
            return "InvalidCode(errorMessage=" + this.errorMessage + ", color=" + this.color + ")";
        }
    }

    /* JADX INFO: renamed from: io2.n0$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio2/n0$b;", "Lio2/n0;", "<init>", "()V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC20775n0 {

        /* JADX INFO: renamed from: a */
        public static final b f78016a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: io2.n0$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio2/n0$c;", "Lio2/n0;", "<init>", "()V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC20775n0 {

        /* JADX INFO: renamed from: a */
        public static final c f78017a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC20775n0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC20775n0() {
    }
}
