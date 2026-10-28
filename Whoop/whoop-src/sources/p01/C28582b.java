package p01;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import b91.AbstractC2890e;
import b91.C2886a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: p01.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002BÛ\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010\"Jä\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\b.\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b8\u0010?R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\bD\u0010?R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010=\u001a\u0004\bE\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bD\u0010F\u001a\u0004\b1\u0010GR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\bH\u0010GR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\bI\u00104R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bJ\u00104R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bK\u00104R\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bO\u0010NR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bJ\u0010P\u001a\u0004\b<\u0010QR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b.\u0010R\u001a\u0004\b@\u0010SR\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u00106\u001a\u0004\bT\u0010&¨\u0006U"}, m65681d2 = {"Lp01/b;", "Lm91/u;", "Lm91/n;", "", "", "totalSteps", "stepsCompleted", "", NotificationCompat.CATEGORY_PROGRESS, "labelText", "Lb91/a;", "labelTextStyle", "Ly81/f;", "labelTextColor", "", "isCompleted", "completedColor", "partialCompletedColor", "remainingColor", "Li2/t;", "completedBrush", "partiallyCompletedBrush", "Ly3/f;", "size", "strokeWidth", "stepsSpacing", "triggerHapticOnCompletion", "triggerCompletionAnimation", "", "completionAnimationDuration", "Lp01/h;", "displayMode", "id", "<init>", "(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;)Lp01/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "s", "b", "p", "c", "F", "m", "()F", "d", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "Lb91/a;", "j", "()Lb91/a;", "f", "Ly81/f;", "i", "()Ly81/f;", "g", "Ljava/lang/Boolean;", "v", "()Ljava/lang/Boolean;", "k", "n", "Li2/t;", "()Li2/t;", "l", "o", "r", "q", "Z", "u", "()Z", "t", "J", "()J", "Lp01/h;", "()Lp01/h;", "getId", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28582b implements InterfaceC25312u, InterfaceC25305n<String> {

    /* JADX INFO: renamed from: u */
    public static final int f115652u = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int totalSteps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int stepsCompleted;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float progress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String labelText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C2886a labelTextStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f labelTextColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Boolean isCompleted;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC39333f completedColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC39333f partialCompletedColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC39333f remainingColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final AbstractC17911t completedBrush;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final AbstractC17911t partiallyCompletedBrush;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float strokeWidth;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float stepsSpacing;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean triggerHapticOnCompletion;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean triggerCompletionAnimation;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final long completionAnimationDuration;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final EnumC28588h displayMode;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final String id;

    public /* synthetic */ C28582b(int i13, int i14, float f13, String str, C2886a c2886a, EnumC39333f enumC39333f, Boolean bool, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, EnumC39333f enumC39333f4, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, float f14, float f15, float f16, boolean z4, boolean z13, long j7, EnumC28588h enumC28588h, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, f13, str, c2886a, enumC39333f, bool, enumC39333f2, enumC39333f3, enumC39333f4, abstractC17911t, abstractC17911t2, f14, f15, f16, z4, z13, j7, enumC28588h, str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C28582b m86915b(C28582b c28582b, int i13, int i14, float f13, String str, C2886a c2886a, EnumC39333f enumC39333f, Boolean bool, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, EnumC39333f enumC39333f4, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, float f14, float f15, float f16, boolean z4, boolean z13, long j7, EnumC28588h enumC28588h, String str2, int i15, Object obj) {
        int i16 = (i15 & 1) != 0 ? c28582b.totalSteps : i13;
        return c28582b.m86916a(i16, (i15 & 2) != 0 ? c28582b.stepsCompleted : i14, (i15 & 4) != 0 ? c28582b.progress : f13, (i15 & 8) != 0 ? c28582b.labelText : str, (i15 & 16) != 0 ? c28582b.labelTextStyle : c2886a, (i15 & 32) != 0 ? c28582b.labelTextColor : enumC39333f, (i15 & 64) != 0 ? c28582b.isCompleted : bool, (i15 & 128) != 0 ? c28582b.completedColor : enumC39333f2, (i15 & 256) != 0 ? c28582b.partialCompletedColor : enumC39333f3, (i15 & 512) != 0 ? c28582b.remainingColor : enumC39333f4, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c28582b.completedBrush : abstractC17911t, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c28582b.partiallyCompletedBrush : abstractC17911t2, (i15 & 4096) != 0 ? c28582b.size : f14, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c28582b.strokeWidth : f15, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c28582b.stepsSpacing : f16, (i15 & 32768) != 0 ? c28582b.triggerHapticOnCompletion : z4, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c28582b.triggerCompletionAnimation : z13, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c28582b.completionAnimationDuration : j7, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c28582b.displayMode : enumC28588h, (i15 & 524288) != 0 ? c28582b.id : str2);
    }

    /* JADX INFO: renamed from: a */
    public final C28582b m86916a(int totalSteps, int stepsCompleted, float progress, String labelText, C2886a labelTextStyle, EnumC39333f labelTextColor, Boolean isCompleted, EnumC39333f completedColor, EnumC39333f partialCompletedColor, EnumC39333f remainingColor, AbstractC17911t completedBrush, AbstractC17911t partiallyCompletedBrush, float size, float strokeWidth, float stepsSpacing, boolean triggerHapticOnCompletion, boolean triggerCompletionAnimation, long completionAnimationDuration, EnumC28588h displayMode, String id4) {
        AbstractC22676k.m65750j(labelTextStyle, "labelTextStyle");
        AbstractC22676k.m65750j(completedColor, "completedColor");
        AbstractC22676k.m65750j(partialCompletedColor, "partialCompletedColor");
        AbstractC22676k.m65750j(remainingColor, "remainingColor");
        AbstractC22676k.m65750j(displayMode, "displayMode");
        return new C28582b(totalSteps, stepsCompleted, progress, labelText, labelTextStyle, labelTextColor, isCompleted, completedColor, partialCompletedColor, remainingColor, completedBrush, partiallyCompletedBrush, size, strokeWidth, stepsSpacing, triggerHapticOnCompletion, triggerCompletionAnimation, completionAnimationDuration, displayMode, id4, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC17911t getCompletedBrush() {
        return this.completedBrush;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getCompletedColor() {
        return this.completedColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28582b)) {
            return false;
        }
        C28582b c28582b = (C28582b) other;
        return this.totalSteps == c28582b.totalSteps && this.stepsCompleted == c28582b.stepsCompleted && Float.compare(this.progress, c28582b.progress) == 0 && AbstractC22676k.m65745e(this.labelText, c28582b.labelText) && AbstractC22676k.m65745e(this.labelTextStyle, c28582b.labelTextStyle) && this.labelTextColor == c28582b.labelTextColor && AbstractC22676k.m65745e(this.isCompleted, c28582b.isCompleted) && this.completedColor == c28582b.completedColor && this.partialCompletedColor == c28582b.partialCompletedColor && this.remainingColor == c28582b.remainingColor && AbstractC22676k.m65745e(this.completedBrush, c28582b.completedBrush) && AbstractC22676k.m65745e(this.partiallyCompletedBrush, c28582b.partiallyCompletedBrush) && C39174f.m124782b(this.size, c28582b.size) && Float.compare(this.strokeWidth, c28582b.strokeWidth) == 0 && Float.compare(this.stepsSpacing, c28582b.stepsSpacing) == 0 && this.triggerHapticOnCompletion == c28582b.triggerHapticOnCompletion && this.triggerCompletionAnimation == c28582b.triggerCompletionAnimation && this.completionAnimationDuration == c28582b.completionAnimationDuration && this.displayMode == c28582b.displayMode && AbstractC22676k.m65745e(this.id, c28582b.id);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCompletionAnimationDuration() {
        return this.completionAnimationDuration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC28588h getDisplayMode() {
        return this.displayMode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.progress, AbstractC11266d.m30448b(this.stepsCompleted, Integer.hashCode(this.totalSteps) * 31, 31), 31);
        String str = this.labelText;
        int iM31984c = AbstractC11895b.m31984c(this.labelTextStyle, (iM30447a + (str == null ? 0 : str.hashCode())) * 31, 31);
        EnumC39333f enumC39333f = this.labelTextColor;
        int iHashCode = (iM31984c + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        Boolean bool = this.isCompleted;
        int iM61132c = AbstractC21702c.m61132c(this.remainingColor, AbstractC21702c.m61132c(this.partialCompletedColor, AbstractC21702c.m61132c(this.completedColor, (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), 31);
        AbstractC17911t abstractC17911t = this.completedBrush;
        int iHashCode2 = (iM61132c + (abstractC17911t == null ? 0 : abstractC17911t.hashCode())) * 31;
        AbstractC17911t abstractC17911t2 = this.partiallyCompletedBrush;
        int iHashCode3 = (this.displayMode.hashCode() + AbstractC11266d.m30451e(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.stepsSpacing, AbstractC11266d.m30447a(this.strokeWidth, AbstractC11266d.m30447a(this.size, (iHashCode2 + (abstractC17911t2 == null ? 0 : abstractC17911t2.hashCode())) * 31, 31), 31), 31), 31, this.triggerHapticOnCompletion), 31, this.triggerCompletionAnimation), this.completionAnimationDuration, 31)) * 31;
        String str2 = this.id;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC39333f getLabelTextColor() {
        return this.labelTextColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C2886a getLabelTextStyle() {
        return this.labelTextStyle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC39333f getPartialCompletedColor() {
        return this.partialCompletedColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final AbstractC17911t getPartiallyCompletedBrush() {
        return this.partiallyCompletedBrush;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final EnumC39333f getRemainingColor() {
        return this.remainingColor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getStepsCompleted() {
        return this.stepsCompleted;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getStepsSpacing() {
        return this.stepsSpacing;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getTriggerCompletionAnimation() {
        return this.triggerCompletionAnimation;
    }

    public String toString() {
        int i13 = this.totalSteps;
        int i14 = this.stepsCompleted;
        float f13 = this.progress;
        String str = this.labelText;
        C2886a c2886a = this.labelTextStyle;
        EnumC39333f enumC39333f = this.labelTextColor;
        Boolean bool = this.isCompleted;
        EnumC39333f enumC39333f2 = this.completedColor;
        EnumC39333f enumC39333f3 = this.partialCompletedColor;
        EnumC39333f enumC39333f4 = this.remainingColor;
        AbstractC17911t abstractC17911t = this.completedBrush;
        AbstractC17911t abstractC17911t2 = this.partiallyCompletedBrush;
        String strM124783c = C39174f.m124783c(this.size);
        float f14 = this.strokeWidth;
        float f15 = this.stepsSpacing;
        boolean z4 = this.triggerHapticOnCompletion;
        boolean z13 = this.triggerCompletionAnimation;
        long j7 = this.completionAnimationDuration;
        EnumC28588h enumC28588h = this.displayMode;
        String str2 = this.id;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "CircularProgressIndicatorItemState(totalSteps=", ", stepsCompleted=", ", progress=");
        sbM30465s.append(f13);
        sbM30465s.append(", labelText=");
        sbM30465s.append(str);
        sbM30465s.append(", labelTextStyle=");
        sbM30465s.append(c2886a);
        sbM30465s.append(", labelTextColor=");
        sbM30465s.append(enumC39333f);
        sbM30465s.append(", isCompleted=");
        sbM30465s.append(bool);
        sbM30465s.append(", completedColor=");
        sbM30465s.append(enumC39333f2);
        sbM30465s.append(", partialCompletedColor=");
        sbM30465s.append(enumC39333f3);
        sbM30465s.append(", remainingColor=");
        sbM30465s.append(enumC39333f4);
        sbM30465s.append(", completedBrush=");
        sbM30465s.append(abstractC17911t);
        sbM30465s.append(", partiallyCompletedBrush=");
        sbM30465s.append(abstractC17911t2);
        sbM30465s.append(", size=");
        sbM30465s.append(strM124783c);
        sbM30465s.append(", strokeWidth=");
        sbM30465s.append(f14);
        sbM30465s.append(", stepsSpacing=");
        sbM30465s.append(f15);
        sbM30465s.append(", triggerHapticOnCompletion=");
        sbM30465s.append(z4);
        sbM30465s.append(", triggerCompletionAnimation=");
        sbM30465s.append(z13);
        sbM30465s.append(", completionAnimationDuration=");
        sbM30465s.append(j7);
        sbM30465s.append(", displayMode=");
        sbM30465s.append(enumC28588h);
        sbM30465s.append(", id=");
        sbM30465s.append(str2);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getTriggerHapticOnCompletion() {
        return this.triggerHapticOnCompletion;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Boolean getIsCompleted() {
        return this.isCompleted;
    }

    private C28582b(int i13, int i14, float f13, String str, C2886a labelTextStyle, EnumC39333f enumC39333f, Boolean bool, EnumC39333f completedColor, EnumC39333f partialCompletedColor, EnumC39333f remainingColor, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, float f14, float f15, float f16, boolean z4, boolean z13, long j7, EnumC28588h displayMode, String str2) {
        AbstractC22676k.m65750j(labelTextStyle, "labelTextStyle");
        AbstractC22676k.m65750j(completedColor, "completedColor");
        AbstractC22676k.m65750j(partialCompletedColor, "partialCompletedColor");
        AbstractC22676k.m65750j(remainingColor, "remainingColor");
        AbstractC22676k.m65750j(displayMode, "displayMode");
        this.totalSteps = i13;
        this.stepsCompleted = i14;
        this.progress = f13;
        this.labelText = str;
        this.labelTextStyle = labelTextStyle;
        this.labelTextColor = enumC39333f;
        this.isCompleted = bool;
        this.completedColor = completedColor;
        this.partialCompletedColor = partialCompletedColor;
        this.remainingColor = remainingColor;
        this.completedBrush = abstractC17911t;
        this.partiallyCompletedBrush = abstractC17911t2;
        this.size = f14;
        this.strokeWidth = f15;
        this.stepsSpacing = f16;
        this.triggerHapticOnCompletion = z4;
        this.triggerCompletionAnimation = z13;
        this.completionAnimationDuration = j7;
        this.displayMode = displayMode;
        this.id = str2;
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }

    public C28582b(int i13, int i14, float f13, String str, C2886a c2886a, EnumC39333f enumC39333f, Boolean bool, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, EnumC39333f enumC39333f4, AbstractC17911t abstractC17911t, AbstractC17911t abstractC17911t2, float f14, float f15, float f16, boolean z4, boolean z13, long j7, EnumC28588h enumC28588h, String str2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 7 : i13, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? 0.0f : f13, (i15 & 8) != 0 ? null : str, (i15 & 16) != 0 ? AbstractC2890e.m8450e().getN9() : c2886a, (i15 & 32) != 0 ? null : enumC39333f, (i15 & 64) != 0 ? null : bool, (i15 & 128) != 0 ? EnumC39333f.ACCENT_ACTION : enumC39333f2, (i15 & 256) != 0 ? EnumC39333f.ACCENT_ACTION : enumC39333f3, (i15 & 512) != 0 ? EnumC39333f.WHITE_10 : enumC39333f4, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : abstractC17911t, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : abstractC17911t2, (i15 & 4096) != 0 ? 34 : f14, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 7.0f : f15, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 16.0f : f16, (i15 & 32768) != 0 ? true : z4, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0 ? z13 : true, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? 1300L : j7, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? EnumC28588h.STEPS : enumC28588h, (i15 & 524288) != 0 ? null : str2, null);
    }
}
