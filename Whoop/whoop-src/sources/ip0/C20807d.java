package ip0;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whoop.p069ui.DotProgressIndicator;
import com.whoop.p069ui.views.ColoredImageView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gf2.AbstractC15812u;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qe2.AbstractC30311d;
import vu1.AbstractC36510a;
import vu1.AbstractC36511b;
import vu1.AbstractC36512c;
import vu1.AbstractC36515f;

/* JADX INFO: renamed from: ip0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001JB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010-\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00104R\u0018\u00108\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00107R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010>R\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010'R\u0016\u0010G\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010'R\u0016\u0010I\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010>¨\u0006K"}, m65681d2 = {"Lip0/d;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "u", "()V", "Landroid/widget/TextView;", ProfileAnalyticsKt.VIEW, "", "text", "y", "(Landroid/widget/TextView;Ljava/lang/String;)V", "fixedPopupWidth", "Ll83/k;", "t", "(I)Ll83/k;", "Landroid/view/View;", "anchor", "tooltipWidth", "Lip0/a;", "attachMode", "v", "(Landroid/view/View;ILip0/a;)V", "s", "Lgf2/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lgf2/u;", "binding", "Landroid/widget/PopupWindow;", "x", "Landroid/widget/PopupWindow;", "popup", "I", "spaceForArrow", "z", "defaultMargin", "E", "Ljava/lang/String;", "title", "F", "description", "G", "ctaLabel", "Landroid/view/View$OnClickListener;", "H", "Landroid/view/View$OnClickListener;", "onTooltipClick", "onCtaClick", "J", "onAnchorClick", "", "K", "fadeInDurationMls", "", "L", "Z", "isOutsideTouchable", "M", "isDarkTheme", "N", "isCtaIndicatorEnabled", "O", "progressPageCount", "P", "currentPageCount", "Q", "isDotProgressIndicatorVisible", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20807d extends FrameLayout {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private String title;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private String description;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String ctaLabel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private View.OnClickListener onTooltipClick;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private View.OnClickListener onCtaClick;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private View.OnClickListener onAnchorClick;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private long fadeInDurationMls;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean isOutsideTouchable;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean isDarkTheme;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private boolean isCtaIndicatorEnabled;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private int progressPageCount;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private int currentPageCount;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean isDotProgressIndicatorVisible;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private AbstractC15812u binding;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private PopupWindow popup;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int spaceForArrow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int defaultMargin;

    /* JADX INFO: renamed from: ip0.d$a */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001a¢\u0006\u0004\b!\u0010\u001dJ\u001d\u0010$\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010/\u001a\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00104R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00104R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00102R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010/R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010/R\u0016\u0010@\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00102¨\u0006A"}, m65681d2 = {"Lip0/d$a;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "j", "(Ljava/lang/String;)Lip0/d$a;", "description", "e", "ctaLabel", "b", "Landroid/view/View$OnClickListener;", "onCtaClick", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/view/View$OnClickListener;)Lip0/d$a;", "", "fadeInDurationMls", "g", "(J)Lip0/d$a;", "", "isOutsideTouchable", "i", "(Z)Lip0/d$a;", "darkThemeEnabled", "d", "ctaIndicatorEnabled", "c", "progressPageCount", "currentPageCount", "f", "(II)Lip0/d$a;", "Lip0/d;", "a", "()Lip0/d;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "I", "getDefStyleAttr", "()I", "Z", "isCtaIndicatorEnabled", "Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "onTooltipClick", "k", "onAnchorClick", "l", "J", "m", "isDarkTheme", "n", "o", "p", "isDotProgressIndicatorVisible", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AttributeSet attrs;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int defStyleAttr;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean isCtaIndicatorEnabled;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private boolean isOutsideTouchable;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private String title;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private String description;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private String ctaLabel;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private View.OnClickListener onTooltipClick;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private View.OnClickListener onCtaClick;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private View.OnClickListener onAnchorClick;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private long fadeInDurationMls;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private boolean isDarkTheme;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private int progressPageCount;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private int currentPageCount;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private boolean isDotProgressIndicatorVisible;

        public a(Context context, AttributeSet attributeSet, int i13) {
            AbstractC22676k.m65750j(context, "context");
            this.context = context;
            this.attrs = attributeSet;
            this.defStyleAttr = i13;
            this.isOutsideTouchable = true;
            this.fadeInDurationMls = context.getResources().getInteger(AbstractC36515f.f156109a);
        }

        /* JADX INFO: renamed from: a */
        public final C20807d m57363a() {
            C20807d c20807d = new C20807d(this.context, this.attrs, this.defStyleAttr);
            c20807d.title = this.title;
            c20807d.description = this.description;
            c20807d.ctaLabel = this.ctaLabel;
            c20807d.onTooltipClick = this.onTooltipClick;
            c20807d.onCtaClick = this.onCtaClick;
            c20807d.getClass();
            c20807d.onAnchorClick = this.onAnchorClick;
            c20807d.fadeInDurationMls = this.fadeInDurationMls;
            c20807d.isOutsideTouchable = this.isOutsideTouchable;
            c20807d.isDarkTheme = this.isDarkTheme;
            c20807d.isCtaIndicatorEnabled = this.isCtaIndicatorEnabled;
            c20807d.isDotProgressIndicatorVisible = this.isDotProgressIndicatorVisible;
            c20807d.progressPageCount = this.progressPageCount;
            c20807d.currentPageCount = this.currentPageCount;
            return c20807d;
        }

        /* JADX INFO: renamed from: b */
        public final a m57364b(String ctaLabel) {
            this.ctaLabel = ctaLabel;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m57365c(boolean ctaIndicatorEnabled) {
            this.isCtaIndicatorEnabled = ctaIndicatorEnabled;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final a m57366d(boolean darkThemeEnabled) {
            this.isDarkTheme = darkThemeEnabled;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final a m57367e(String description) {
            this.description = description;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public final a m57368f(int progressPageCount, int currentPageCount) {
            this.isDotProgressIndicatorVisible = true;
            this.progressPageCount = progressPageCount;
            this.currentPageCount = currentPageCount;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final a m57369g(long fadeInDurationMls) {
            this.fadeInDurationMls = fadeInDurationMls;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final a m57370h(View.OnClickListener onCtaClick) {
            this.onCtaClick = onCtaClick;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public final a m57371i(boolean isOutsideTouchable) {
            this.isOutsideTouchable = isOutsideTouchable;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final a m57372j(String title) {
            this.title = title;
            return this;
        }
    }

    /* JADX INFO: renamed from: ip0.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78127a;

        static {
            int[] iArr = new int[EnumC20804a.values().length];
            try {
                iArr[EnumC20804a.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC20804a.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC20804a.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC20804a.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f78127a = iArr;
        }
    }

    /* JADX INFO: renamed from: ip0.d$c */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"ip0/d$c", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Ll83/a0;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ View f78128w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC20804a f78129x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C20807d f78130y;

        public c(View view, EnumC20804a enumC20804a, C20807d c20807d) {
            this.f78128w = view;
            this.f78129x = enumC20804a;
            this.f78130y = c20807d;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            int i13;
            int width;
            int i14;
            int width2;
            view.removeOnLayoutChangeListener(this);
            int[] iArr = new int[2];
            this.f78128w.getLocationOnScreen(iArr);
            EnumC20804a enumC20804a = this.f78129x;
            EnumC20804a enumC20804a2 = EnumC20804a.BOTTOM;
            if (enumC20804a == enumC20804a2 || enumC20804a == EnumC20804a.TOP) {
                i13 = iArr[0];
                width = this.f78128w.getWidth() / 2;
            } else {
                i13 = iArr[1];
                width = this.f78128w.getHeight() / 2;
            }
            int i15 = width + i13;
            this.f78130y.binding.f59697e.getLocationOnScreen(iArr);
            EnumC20804a enumC20804a3 = this.f78129x;
            if (enumC20804a3 == enumC20804a2 || enumC20804a3 == EnumC20804a.TOP) {
                i14 = iArr[0];
                width2 = this.f78130y.binding.f59697e.getWidth() / 2;
            } else {
                i14 = iArr[1];
                width2 = this.f78130y.binding.f59697e.getHeight() / 2;
            }
            int i16 = i15 - (width2 + i14);
            EnumC20804a enumC20804a4 = this.f78129x;
            int i17 = enumC20804a4 == null ? -1 : b.f78127a[enumC20804a4.ordinal()];
            if (i17 != -1) {
                if (i17 == 1) {
                    this.f78130y.binding.f59697e.setRotation(180.0f);
                    ColoredImageView coloredImageView = this.f78130y.binding.f59697e;
                    coloredImageView.setTranslationX(coloredImageView.getTranslationX() + i16);
                    ColoredImageView coloredImageView2 = this.f78130y.binding.f59697e;
                    coloredImageView2.setTranslationY(coloredImageView2.getTranslationY() + (this.f78130y.binding.getRoot().getHeight() - this.f78130y.binding.f59697e.getHeight()));
                    return;
                }
                if (i17 == 2) {
                    this.f78130y.binding.f59697e.setRotation(0.0f);
                    ColoredImageView coloredImageView3 = this.f78130y.binding.f59697e;
                    coloredImageView3.setTranslationX(coloredImageView3.getTranslationX() + i16);
                } else {
                    if (i17 == 3) {
                        this.f78130y.binding.f59697e.setRotation(90.0f);
                        ColoredImageView coloredImageView4 = this.f78130y.binding.f59697e;
                        coloredImageView4.setTranslationX(coloredImageView4.getTranslationX() + ((this.f78130y.binding.getRoot().getWidth() - (this.f78130y.binding.f59697e.getHeight() / 2)) - this.f78130y.spaceForArrow));
                        ColoredImageView coloredImageView5 = this.f78130y.binding.f59697e;
                        coloredImageView5.setTranslationY(coloredImageView5.getTranslationY() + i16);
                        return;
                    }
                    if (i17 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f78130y.binding.f59697e.setRotation(270.0f);
                    ColoredImageView coloredImageView6 = this.f78130y.binding.f59697e;
                    coloredImageView6.setTranslationX(coloredImageView6.getTranslationX() - (this.f78130y.binding.f59697e.getHeight() / 2));
                    ColoredImageView coloredImageView7 = this.f78130y.binding.f59697e;
                    coloredImageView7.setTranslationY(coloredImageView7.getTranslationY() + i16);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20807d(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        AbstractC15812u abstractC15812uM44617c = AbstractC15812u.m44617c(LayoutInflater.from(context), this, true);
        AbstractC22676k.m65749i(abstractC15812uM44617c, "inflate(...)");
        this.binding = abstractC15812uM44617c;
        this.popup = new PopupWindow();
        this.spaceForArrow = getResources().getDimensionPixelSize(AbstractC36511b.f156054g);
        this.defaultMargin = getResources().getDimensionPixelSize(AbstractC36511b.f156053f);
        this.fadeInDurationMls = getResources().getInteger(AbstractC36515f.f156109a);
        this.isOutsideTouchable = true;
    }

    /* JADX INFO: renamed from: t */
    private final C23465k m57356t(int fixedPopupWidth) {
        measure(View.MeasureSpec.makeMeasureSpec(fixedPopupWidth, 1073741824), 0);
        return new C23465k(Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: u */
    private final void m57357u() {
        AbstractC15812u abstractC15812u = this.binding;
        TextView viewTooltipTitle = abstractC15812u.f59701i;
        AbstractC22676k.m65749i(viewTooltipTitle, "viewTooltipTitle");
        m57360y(viewTooltipTitle, this.title);
        TextView viewTooltipDescription = abstractC15812u.f59699g;
        AbstractC22676k.m65749i(viewTooltipDescription, "viewTooltipDescription");
        m57360y(viewTooltipDescription, this.description);
        TextView viewTooltipCtaButton = abstractC15812u.f59698f;
        AbstractC22676k.m65749i(viewTooltipCtaButton, "viewTooltipCtaButton");
        m57360y(viewTooltipCtaButton, this.ctaLabel);
        abstractC15812u.f59700h.setOnClickListener(this.onTooltipClick);
        abstractC15812u.f59693a.setOnClickListener(this.onCtaClick);
        ImageView ctaIndicator = abstractC15812u.f59694b;
        AbstractC22676k.m65749i(ctaIndicator, "ctaIndicator");
        ctaIndicator.setVisibility(this.isCtaIndicatorEnabled ? 0 : 8);
        if (this.isDarkTheme) {
            abstractC15812u.f59697e.setImageResource(AbstractC30311d.f124047r);
            abstractC15812u.f59700h.setBackground(getResources().getDrawable(AbstractC30311d.f124031b, null));
            abstractC15812u.f59701i.setTextColor(getResources().getColor(AbstractC36510a.f155999H, null));
            abstractC15812u.f59699g.setTextColor(getResources().getColor(AbstractC36510a.f155997F, null));
            abstractC15812u.f59698f.setTextColor(getResources().getColor(AbstractC36510a.f155995D, null));
            abstractC15812u.f59694b.setImageResource(AbstractC30311d.f124046q);
            return;
        }
        abstractC15812u.f59697e.setImageResource(AbstractC30311d.f124048s);
        abstractC15812u.f59700h.setBackground(getResources().getDrawable(AbstractC30311d.f124030a, null));
        abstractC15812u.f59701i.setTextColor(getResources().getColor(AbstractC36510a.f155998G, null));
        abstractC15812u.f59699g.setTextColor(getResources().getColor(AbstractC36510a.f155996E, null));
        abstractC15812u.f59698f.setTextColor(getResources().getColor(AbstractC36510a.f155994C, null));
        abstractC15812u.f59694b.setImageResource(AbstractC36512c.f156066i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m57358w(InterfaceC20808e interfaceC20808e) {
        if (interfaceC20808e != null) {
            interfaceC20808e.onDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final boolean m57359x(View view, C20807d c20807d, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (iArr[0] < motionEvent.getRawX()) {
                if (motionEvent.getRawX() < view.getWidth() + iArr[0] && iArr[1] < motionEvent.getRawY()) {
                    if (motionEvent.getRawY() < view.getHeight() + iArr[1]) {
                        View.OnClickListener onClickListener = c20807d.onAnchorClick;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        view.performClick();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    private final void m57360y(TextView view, String text) {
        if (text == null) {
            view.setVisibility(8);
        } else {
            view.setText(text);
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m57361s() {
        this.popup.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public final void m57362v(final View anchor, int tooltipWidth, EnumC20804a attachMode) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        AbstractC22676k.m65750j(anchor, "anchor");
        this.popup.dismiss();
        setAlpha(0.0f);
        m57357u();
        if (this.isDotProgressIndicatorVisible) {
            DotProgressIndicator dotProgressIndicator = this.binding.f59695c;
            dotProgressIndicator.setDotProgressPageCount(this.progressPageCount);
            dotProgressIndicator.setDotProgressCurrentPageCount(this.currentPageCount);
        }
        DotProgressIndicator dotProgressIndicator2 = this.binding.f59695c;
        AbstractC22676k.m65749i(dotProgressIndicator2, "dotProgressIndicator");
        dotProgressIndicator2.setVisibility(this.isDotProgressIndicatorVisible ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = this.binding.f59700h.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.binding.f59696d.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        int i18 = attachMode == null ? -1 : b.f78127a[attachMode.ordinal()];
        if (i18 != -1) {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 == 3) {
                        layoutParams2.setMarginEnd(this.spaceForArrow);
                        layoutParams4.setMarginEnd(0);
                        i16 = this.defaultMargin;
                        i17 = this.spaceForArrow;
                    } else {
                        if (i18 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        layoutParams2.setMarginStart(this.spaceForArrow);
                        layoutParams4.setMarginStart(0);
                        i16 = this.defaultMargin;
                        i17 = this.spaceForArrow;
                    }
                    i13 = i16 + i17;
                } else {
                    layoutParams2.topMargin = this.spaceForArrow;
                    layoutParams4.topMargin = 0;
                    i13 = this.defaultMargin * 2;
                    tooltipWidth += i13;
                    if (tooltipWidth == -1) {
                        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                        AbstractC22676k.m65749i(displayMetrics, "getDisplayMetrics(...)");
                        i14 = displayMetrics.widthPixels;
                        i15 = this.defaultMargin;
                        tooltipWidth = i14 - i15;
                    }
                }
                tooltipWidth += i13;
            } else {
                layoutParams2.bottomMargin = this.spaceForArrow;
                layoutParams4.bottomMargin = 0;
                if (tooltipWidth == -1) {
                    DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
                    AbstractC22676k.m65749i(displayMetrics2, "getDisplayMetrics(...)");
                    i14 = displayMetrics2.widthPixels;
                    i15 = this.defaultMargin;
                    tooltipWidth = i14 - i15;
                } else {
                    i13 = this.defaultMargin * 2;
                    tooltipWidth += i13;
                }
            }
        }
        PopupWindow popupWindow = new PopupWindow(this, tooltipWidth, -2, this.isOutsideTouchable);
        this.popup = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.popup.setOutsideTouchable(this.isOutsideTouchable);
        this.popup.setFocusable(this.isOutsideTouchable);
        this.popup.setOnDismissListener(new C20805b());
        if (this.onAnchorClick != null) {
            this.popup.setTouchInterceptor(new View.OnTouchListener() { // from class: ip0.c
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C20807d.m57359x(anchor, this, view, motionEvent);
                }
            });
        }
        addOnLayoutChangeListener(new c(anchor, attachMode, this));
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        C23465k c23465kM57356t = m57356t(tooltipWidth);
        int i19 = attachMode == null ? -1 : b.f78127a[attachMode.ordinal()];
        if (i19 != -1) {
            if (i19 == 1) {
                iArr[0] = iArr[0] - ((tooltipWidth / 2) - (anchor.getWidth() / 2));
                iArr[1] = iArr[1] - ((Number) c23465kM57356t.f92938x).intValue();
            } else if (i19 == 2) {
                iArr[0] = iArr[0] - ((tooltipWidth / 2) - (anchor.getWidth() / 2));
                iArr[1] = anchor.getHeight() + iArr[1];
            } else if (i19 == 3) {
                iArr[0] = iArr[0] - tooltipWidth;
                iArr[1] = iArr[1] - ((((Number) c23465kM57356t.f92938x).intValue() / 2) - (anchor.getHeight() / 2));
            } else {
                if (i19 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                iArr[0] = anchor.getWidth() + iArr[0];
                iArr[1] = iArr[1] - ((((Number) c23465kM57356t.f92938x).intValue() / 2) - (anchor.getHeight() / 2));
            }
        }
        this.popup.showAtLocation(anchor, 0, iArr[0], iArr[1]);
        ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f).setDuration(this.fadeInDurationMls).start();
    }
}
