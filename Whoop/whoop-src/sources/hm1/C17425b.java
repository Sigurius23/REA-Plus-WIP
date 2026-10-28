package hm1;

import bm1.InterfaceC3420c;
import com.whoop.home.domain.models.StreakMetadata;
import com.whoop.navigation.C9598e;
import em1.C13338l;
import fm1.C14605i;
import fm1.EnumC14604h;
import il1.C18637n;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: hm1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lhm1/b;", "", "Lhm1/a;", "streaksAnimationHelper", "<init>", "(Lhm1/a;)V", "Lfm1/h;", "streakState", "Ly81/f;", "a", "(Lfm1/h;)Ly81/f;", "Lil1/n;", "result", "Lem1/l;", "homeDialogViewState", "", "isDateToday", "Lhm1/b$a;", "b", "(Lil1/n;Lem1/l;Z)Lhm1/b$a;", "Lhm1/a;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17425b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17424a streaksAnimationHelper;

    /* JADX INFO: renamed from: hm1.b$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lhm1/b$a;", "", "Lfm1/i;", "streaksHomeViewState", "<init>", "(Lfm1/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfm1/i;", "()Lfm1/i;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14605i streaksHomeViewState;

        public a(C14605i c14605i) {
            this.streaksHomeViewState = c14605i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14605i getStreaksHomeViewState() {
            return this.streaksHomeViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.streaksHomeViewState, ((a) other).streaksHomeViewState);
        }

        public int hashCode() {
            C14605i c14605i = this.streaksHomeViewState;
            if (c14605i == null) {
                return 0;
            }
            return c14605i.hashCode();
        }

        public String toString() {
            return "StreaksReducerResult(streaksHomeViewState=" + this.streaksHomeViewState + ")";
        }
    }

    /* JADX INFO: renamed from: hm1.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f67559a;

        static {
            int[] iArr = new int[EnumC14604h.values().length];
            try {
                iArr[EnumC14604h.FROZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f67559a = iArr;
        }
    }

    public C17425b(C17424a streaksAnimationHelper) {
        AbstractC22676k.m65750j(streaksAnimationHelper, "streaksAnimationHelper");
        this.streaksAnimationHelper = streaksAnimationHelper;
    }

    /* JADX INFO: renamed from: a */
    private final EnumC39333f m49453a(EnumC14604h streakState) {
        return (streakState == null ? -1 : b.f67559a[streakState.ordinal()]) == 1 ? EnumC39333f.STRAIN_ZONE_2 : EnumC39333f.BRAND_WHITE;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX INFO: renamed from: b */
    public final a m49454b(C18637n result, C13338l homeDialogViewState, boolean isDateToday) {
        StreakMetadata currentStreakData;
        EnumC14604h enumC14604h;
        EnumC39333f enumC39333f;
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(homeDialogViewState, "homeDialogViewState");
        InterfaceC3420c streaksDomainState = result.getStreaksDomainState();
        C14605i c14605i = null;
        EnumC39333f enumC39333f2 = null;
        c14605i = null;
        InterfaceC3420c.d dVar = streaksDomainState instanceof InterfaceC3420c.d ? (InterfaceC3420c.d) streaksDomainState : null;
        if (dVar != null && (currentStreakData = dVar.getCurrentStreakData()) != null) {
            boolean zM49452a = this.streaksAnimationHelper.m49452a(result.getStreaksDomainState(), homeDialogViewState, result.getShouldRequestPermissions(), result.getJournalData().getShouldShowJournal(), result.getAutoPopDomainState().getNextDestination() == null);
            String streakState = currentStreakData.getStreakState();
            EnumC14604h[] enumC14604hArrValues = EnumC14604h.values();
            int length = enumC14604hArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC14604h = null;
                    break;
                }
                EnumC14604h enumC14604h2 = enumC14604hArrValues[i13];
                if (AbstractC22676k.m65745e(enumC14604h2.name(), streakState)) {
                    enumC14604h = enumC14604h2;
                    break;
                }
                i13++;
            }
            String streakValue = currentStreakData.getStreakValue();
            EnumC39333f enumC39333fM49453a = m49453a(enumC14604h);
            String lottieUrl = currentStreakData.getLottieUrl();
            String strM113135b = lottieUrl != null ? InterfaceC35689r0.e.m113135b(lottieUrl) : null;
            InterfaceC35689r0.e eVarM113134a = strM113135b != null ? InterfaceC35689r0.e.m113134a(strM113135b) : null;
            String imageUrl = currentStreakData.getImageUrl();
            AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
            boolean z4 = dVar.getIsInTestVariantStreaksAnimation() && zM49452a && enumC14604h != EnumC14604h.FROZEN && enumC14604h != EnumC14604h.PENDING;
            C9598e navigation = currentStreakData.getNavigation();
            String animationAccentColor = currentStreakData.getAnimationAccentColor();
            if (animationAccentColor != null) {
                enumC39333f = EnumC39333f.STRAIN_ZONE_4;
                for (EnumC39333f enumC39333f3 : EnumC39333f.values()) {
                    if (AbstractC22676k.m65745e(enumC39333f3.name(), animationAccentColor)) {
                        enumC39333f2 = enumC39333f3;
                        break;
                    }
                }
                if (enumC39333f2 != null) {
                    enumC39333f = enumC39333f2;
                }
                if (enumC39333f == null) {
                    enumC39333f = EnumC39333f.STRAIN_ZONE_4;
                }
            } else {
                enumC39333f = EnumC39333f.STRAIN_ZONE_4;
            }
            c14605i = new C14605i(isDateToday, streakValue, enumC14604h, enumC39333fM49453a, eVarM113134a, cVar, zM49452a, z4, navigation, enumC39333f);
        }
        return new a(c14605i);
    }
}
