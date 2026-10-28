package zu2;

import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zu2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lzu2/c;", "", "", "name", "Lzu2/f;", "nameValidity", "Lzu2/a;", "currentFocusState", "<init>", "(Ljava/lang/String;Lzu2/f;Lzu2/a;)V", "b", "(Ljava/lang/String;Lzu2/f;Lzu2/a;)Lzu2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "Lzu2/f;", "f", "()Lzu2/f;", "c", "Lzu2/a;", "d", "()Lzu2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41156c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f177542e = 8;

    /* JADX INFO: renamed from: f */
    private static final C41156c f177543f = new C41156c("", EnumC41159f.Blank, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC41159f nameValidity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41154a currentFocusState;

    /* JADX INFO: renamed from: zu2.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lzu2/c$a;", "", "<init>", "()V", "Lzu2/c;", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "Lzu2/c;", "a", "()Lzu2/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C41156c m133698a() {
            return C41156c.f177543f;
        }

        private Companion() {
        }
    }

    public C41156c(String name, EnumC41159f nameValidity, InterfaceC41154a interfaceC41154a) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(nameValidity, "nameValidity");
        this.name = name;
        this.nameValidity = nameValidity;
        this.currentFocusState = interfaceC41154a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C41156c m133693c(C41156c c41156c, String str, EnumC41159f enumC41159f, InterfaceC41154a interfaceC41154a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c41156c.name;
        }
        if ((i13 & 2) != 0) {
            enumC41159f = c41156c.nameValidity;
        }
        if ((i13 & 4) != 0) {
            interfaceC41154a = c41156c.currentFocusState;
        }
        return c41156c.m133694b(str, enumC41159f, interfaceC41154a);
    }

    /* JADX INFO: renamed from: b */
    public final C41156c m133694b(String name, EnumC41159f nameValidity, InterfaceC41154a currentFocusState) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(nameValidity, "nameValidity");
        return new C41156c(name, nameValidity, currentFocusState);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC41154a getCurrentFocusState() {
        return this.currentFocusState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41156c)) {
            return false;
        }
        C41156c c41156c = (C41156c) other;
        return AbstractC22676k.m65745e(this.name, c41156c.name) && this.nameValidity == c41156c.nameValidity && AbstractC22676k.m65745e(this.currentFocusState, c41156c.currentFocusState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC41159f getNameValidity() {
        return this.nameValidity;
    }

    public int hashCode() {
        int iHashCode = (this.nameValidity.hashCode() + (this.name.hashCode() * 31)) * 31;
        InterfaceC41154a interfaceC41154a = this.currentFocusState;
        return iHashCode + (interfaceC41154a == null ? 0 : interfaceC41154a.hashCode());
    }

    public String toString() {
        return "InputWorkoutNameDomainState(name=" + this.name + ", nameValidity=" + this.nameValidity + ", currentFocusState=" + this.currentFocusState + ")";
    }
}
