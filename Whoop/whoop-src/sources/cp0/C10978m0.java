package cp0;

import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.coacheverywherecommon.models.CoachSurfaceType;
import com.whoop.navigation.DrawerPresentation;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p181h2.C16617b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cp0.m0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b$\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001 B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b.\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b6\u0010#R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b7\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\"\u00109\u001a\u0004\b \u0010:R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b2\u0010#¨\u0006<"}, m65681d2 = {"Lcp0/m0;", "", "", "visible", "Lh2/b;", "fabPosition", "Lep0/j;", "screenContext", "", "fabSize", "Lcp0/u1;", "initialSheetState", "initialHeightFraction", "Lcp0/h;", "toolbarContent", "isPrefetchEnabled", "", "imeHeightPx", "shouldOpenFullSize", "Lcom/whoop/navigation/DrawerPresentation;", "customDrawerPresentation", "readOnlyHalfSheet", "<init>", "(ZJLep0/j;FLcp0/u1;FLcp0/h;ZIZLcom/whoop/navigation/DrawerPresentation;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "k", "()Z", "b", "J", "()J", "c", "Lep0/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lep0/j;", "d", "F", "()F", "e", "Lcp0/u1;", "f", "()Lcp0/u1;", "g", "Lcp0/h;", "j", "()Lcp0/h;", "l", "i", "I", "Lcom/whoop/navigation/DrawerPresentation;", "()Lcom/whoop/navigation/DrawerPresentation;", "m", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C10978m0 {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    public static final int f34173n = C13404j.f46947x;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean visible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long fabPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C13404j screenContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float fabSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC11003u1 initialSheetState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float initialHeightFraction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C10962h toolbarContent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isPrefetchEnabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int imeHeightPx;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean shouldOpenFullSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final DrawerPresentation customDrawerPresentation;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean readOnlyHalfSheet;

    /* JADX INFO: renamed from: cp0.m0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00178\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0014\u0010!\u001a\u00020 8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, m65681d2 = {"Lcp0/m0$a;", "", "<init>", "()V", "Lcom/whoop/navigation/DrawerPresentation;", "presentation", "", "a", "(Lcom/whoop/navigation/DrawerPresentation;)F", "Lep0/j;", "screenContext", "", "c", "(Lep0/j;)Z", "shouldOpenFullSize", "isEducationTypeDayZero", "readOnlyHalfSheet", "b", "(Lcom/whoop/navigation/DrawerPresentation;ZZZ)Z", "PARTIAL_HEIGHT_FRACTION", "F", "HOME_GAUGE_HEIGHT_FRACTION", "EXPANDED_HEIGHT_FRACTION", "", "TOOLBAR_HEIGHT_SIZE_DP", "I", "CONTENT_FADE_START", "SMALL_DRAG_THRESHOLD_FRACTION", "MEDIUM_DRAG_THRESHOLD_FRACTION", "LARGE_DRAG_THRESHOLD_FRACTION", "THROW_THRESHOLD_FRACTION", "BIG_THROW_THRESHOLD_FRACTION", "", "INITIAL_OPEN_DELAY_MS", "J", "ANIMATION_DURATION_MS", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: cp0.m0$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C41441a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f34186a;

            static {
                int[] iArr = new int[DrawerPresentation.values().length];
                try {
                    iArr[DrawerPresentation.HOME_GAUGE_LEVEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DrawerPresentation.INLINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DrawerPresentation.HALF_SCREEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DrawerPresentation.FULL_SCREEN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f34186a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final float m29245a(DrawerPresentation presentation) {
            int i13 = presentation == null ? -1 : C41441a.f34186a[presentation.ordinal()];
            if (i13 == -1) {
                return 0.45f;
            }
            if (i13 == 1) {
                return 0.6f;
            }
            if (i13 == 2 || i13 == 3 || i13 == 4) {
                return 0.45f;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m29246b(DrawerPresentation presentation, boolean shouldOpenFullSize, boolean isEducationTypeDayZero, boolean readOnlyHalfSheet) {
            if (readOnlyHalfSheet) {
                return false;
            }
            if (isEducationTypeDayZero) {
                return true;
            }
            if (presentation != null) {
                return presentation == DrawerPresentation.FULL_SCREEN;
            }
            return shouldOpenFullSize;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m29247c(C13404j screenContext) {
            CoachEntry coachEntry;
            CoachSurfaceType type;
            if ((screenContext != null ? screenContext.getEducationType() : null) == CoachEducationType.COACH_EVERYWHERE_DAY_ZERO) {
                return screenContext == null || (coachEntry = screenContext.getCoachEntry()) == null || (type = coachEntry.getType()) == null || !type.isBar();
            }
            return false;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C10978m0(boolean z4, long j7, C13404j c13404j, float f13, EnumC11003u1 enumC11003u1, float f14, C10962h c10962h, boolean z13, int i13, boolean z14, DrawerPresentation drawerPresentation, boolean z15, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, j7, c13404j, f13, enumC11003u1, f14, c10962h, z13, i13, z14, drawerPresentation, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DrawerPresentation getCustomDrawerPresentation() {
        return this.customDrawerPresentation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFabPosition() {
        return this.fabPosition;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getFabSize() {
        return this.fabSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getImeHeightPx() {
        return this.imeHeightPx;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getInitialHeightFraction() {
        return this.initialHeightFraction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10978m0)) {
            return false;
        }
        C10978m0 c10978m0 = (C10978m0) other;
        return this.visible == c10978m0.visible && C16617b.m47187c(this.fabPosition, c10978m0.fabPosition) && AbstractC22676k.m65745e(this.screenContext, c10978m0.screenContext) && Float.compare(this.fabSize, c10978m0.fabSize) == 0 && this.initialSheetState == c10978m0.initialSheetState && Float.compare(this.initialHeightFraction, c10978m0.initialHeightFraction) == 0 && AbstractC22676k.m65745e(this.toolbarContent, c10978m0.toolbarContent) && this.isPrefetchEnabled == c10978m0.isPrefetchEnabled && this.imeHeightPx == c10978m0.imeHeightPx && this.shouldOpenFullSize == c10978m0.shouldOpenFullSize && this.customDrawerPresentation == c10978m0.customDrawerPresentation && this.readOnlyHalfSheet == c10978m0.readOnlyHalfSheet;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC11003u1 getInitialSheetState() {
        return this.initialSheetState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getReadOnlyHalfSheet() {
        return this.readOnlyHalfSheet;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C13404j getScreenContext() {
        return this.screenContext;
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(Boolean.hashCode(this.visible) * 31, this.fabPosition, 31);
        C13404j c13404j = this.screenContext;
        int iM30447a = AbstractC11266d.m30447a(this.initialHeightFraction, (this.initialSheetState.hashCode() + AbstractC11266d.m30447a(this.fabSize, (iM30451e + (c13404j == null ? 0 : c13404j.hashCode())) * 31, 31)) * 31, 31);
        C10962h c10962h = this.toolbarContent;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.imeHeightPx, AbstractC2875y.m8289b((iM30447a + (c10962h == null ? 0 : c10962h.hashCode())) * 31, 31, this.isPrefetchEnabled), 31), 31, this.shouldOpenFullSize);
        DrawerPresentation drawerPresentation = this.customDrawerPresentation;
        return Boolean.hashCode(this.readOnlyHalfSheet) + ((iM8289b + (drawerPresentation != null ? drawerPresentation.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShouldOpenFullSize() {
        return this.shouldOpenFullSize;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C10962h getToolbarContent() {
        return this.toolbarContent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsPrefetchEnabled() {
        return this.isPrefetchEnabled;
    }

    public String toString() {
        boolean z4 = this.visible;
        String strM47194j = C16617b.m47194j(this.fabPosition);
        C13404j c13404j = this.screenContext;
        float f13 = this.fabSize;
        EnumC11003u1 enumC11003u1 = this.initialSheetState;
        float f14 = this.initialHeightFraction;
        C10962h c10962h = this.toolbarContent;
        boolean z13 = this.isPrefetchEnabled;
        int i13 = this.imeHeightPx;
        boolean z14 = this.shouldOpenFullSize;
        DrawerPresentation drawerPresentation = this.customDrawerPresentation;
        boolean z15 = this.readOnlyHalfSheet;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("CoachEverywhereBottomSheetState(visible=", ", fabPosition=", strM47194j, ", screenContext=", z4);
        sbM38567n.append(c13404j);
        sbM38567n.append(", fabSize=");
        sbM38567n.append(f13);
        sbM38567n.append(", initialSheetState=");
        sbM38567n.append(enumC11003u1);
        sbM38567n.append(", initialHeightFraction=");
        sbM38567n.append(f14);
        sbM38567n.append(", toolbarContent=");
        sbM38567n.append(c10962h);
        sbM38567n.append(", isPrefetchEnabled=");
        sbM38567n.append(z13);
        sbM38567n.append(", imeHeightPx=");
        AbstractC13673n.m38573t(i13, ", shouldOpenFullSize=", ", customDrawerPresentation=", sbM38567n, z14);
        sbM38567n.append(drawerPresentation);
        sbM38567n.append(", readOnlyHalfSheet=");
        sbM38567n.append(z15);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    private C10978m0(boolean z4, long j7, C13404j c13404j, float f13, EnumC11003u1 initialSheetState, float f14, C10962h c10962h, boolean z13, int i13, boolean z14, DrawerPresentation drawerPresentation, boolean z15) {
        AbstractC22676k.m65750j(initialSheetState, "initialSheetState");
        this.visible = z4;
        this.fabPosition = j7;
        this.screenContext = c13404j;
        this.fabSize = f13;
        this.initialSheetState = initialSheetState;
        this.initialHeightFraction = f14;
        this.toolbarContent = c10962h;
        this.isPrefetchEnabled = z13;
        this.imeHeightPx = i13;
        this.shouldOpenFullSize = z14;
        this.customDrawerPresentation = drawerPresentation;
        this.readOnlyHalfSheet = z15;
    }

    public /* synthetic */ C10978m0(boolean z4, long j7, C13404j c13404j, float f13, EnumC11003u1 enumC11003u1, float f14, C10962h c10962h, boolean z13, int i13, boolean z14, DrawerPresentation drawerPresentation, boolean z15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, j7, c13404j, (i14 & 8) != 0 ? 0.0f : f13, (i14 & 16) != 0 ? EnumC11003u1.Hidden : enumC11003u1, (i14 & 32) != 0 ? 0.0f : f14, (i14 & 64) != 0 ? null : c10962h, (i14 & 128) != 0 ? false : z13, (i14 & 256) != 0 ? 0 : i13, (i14 & 512) != 0 ? false : z14, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : drawerPresentation, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z15, null);
    }
}
