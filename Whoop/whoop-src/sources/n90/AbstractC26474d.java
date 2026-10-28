package n90;

import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: n90.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Ln90/d;", "", "<init>", "()V", "a", "Ln90/d$a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26474d {

    /* JADX INFO: renamed from: n90.d$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ln90/d$a;", "Ln90/d;", "Lkotlin/Function0;", "Ll83/a0;", "onNext", "<init>", "(Lc93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc93/a;", "()Lc93/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC26474d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC4339a onNext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4339a onNext) {
            super(null);
            AbstractC22676k.m65750j(onNext, "onNext");
            this.onNext = onNext;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC4339a getOnNext() {
            return this.onNext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.onNext, ((a) other).onNext);
        }

        public int hashCode() {
            return this.onNext.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106653l("AskForNotificationsPermissions(onNext=", ")", this.onNext);
        }
    }

    public /* synthetic */ AbstractC26474d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC26474d() {
    }
}
