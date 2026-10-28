package vy0;

import com.whoop.navigation.models.GenericInteraction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vy0.y */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lvy0/y;", "", "<init>", "()V", "a", "Lvy0/y$a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36597y {

    /* JADX INFO: renamed from: a */
    public static final int f156776a = 0;

    /* JADX INFO: renamed from: vy0.y$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lvy0/y$a;", "Lvy0/y;", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/navigation/models/GenericInteraction;", "a", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC36597y {

        /* JADX INFO: renamed from: c */
        public static final int f156777c = GenericInteraction.$stable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final GenericInteraction interaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GenericInteraction interaction) {
            super(null);
            AbstractC22676k.m65750j(interaction, "interaction");
            this.interaction = interaction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GenericInteraction getInteraction() {
            return this.interaction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.interaction, ((a) other).interaction);
        }

        public int hashCode() {
            return this.interaction.hashCode();
        }

        public String toString() {
            return "ItemClicked(interaction=" + this.interaction + ")";
        }
    }

    public /* synthetic */ AbstractC36597y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36597y() {
    }
}
