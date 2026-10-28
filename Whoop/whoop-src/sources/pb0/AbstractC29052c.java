package pb0;

import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pb0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lpb0/c;", "", "<init>", "()V", "b", "a", "Lpb0/c$a;", "Lpb0/c$b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29052c {

    /* JADX INFO: renamed from: pb0.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpb0/c$a;", "Lpb0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC29052c {

        /* JADX INFO: renamed from: a */
        public static final a f117557a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: pb0.c$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lpb0/c$b;", "Lpb0/c;", "", "checkboxText", "", "isChecked", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC29052c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String checkboxText;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isChecked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String checkboxText, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(checkboxText, "checkboxText");
            this.checkboxText = checkboxText;
            this.isChecked = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCheckboxText() {
            return this.checkboxText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.checkboxText, bVar.checkboxText) && this.isChecked == bVar.isChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked) + (this.checkboxText.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("ToggleCheckbox(checkboxText=", this.checkboxText, ", isChecked=", ")", this.isChecked);
        }
    }

    public /* synthetic */ AbstractC29052c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29052c() {
    }
}
