package rq0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1717o2;
import b13.ViewOnClickListenerC2292a;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.domain.model.teams.PrivacyType;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamUserListing;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.p069ui.ProgressDial;
import com.whoop.p069ui.ProgressDialLayout;
import com.whoop.p069ui.ScoreContext;
import com.whoop.p069ui.teams.LeaderActivityDto;
import de.hdodenhof.circleimageview.CircleImageView;
import gy0.AbstractC16273b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.text.NumberFormat;
import java.util.Arrays;
import or2.C28204u;
import org.joda.time.LocalDate;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vq0.C36278b;
import vu1.AbstractC36510a;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;
import yb3.AbstractC39414r;
import yb3.AbstractC39419w;

/* JADX INFO: renamed from: rq0.d1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 m2\u00020\u0001:\u0001>B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010&\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b&\u0010'JY\u0010.\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u001a2\b\u0010*\u001a\u0004\u0018\u00010\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u001a2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/Jm\u0010<\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u00101\u001a\u0002002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u00102\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002002\b\u00107\u001a\u0004\u0018\u0001062\u0006\u00109\u001a\u0002082\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0:¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010B\u001a\n @*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010AR\u001c\u0010F\u001a\n @*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010J\u001a\n @*\u0004\u0018\u00010G0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010N\u001a\n @*\u0004\u0018\u00010K0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010P\u001a\n @*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010AR\u001c\u0010Q\u001a\n @*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010AR\u001c\u0010S\u001a\n @*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010AR\u001c\u0010T\u001a\n @*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010AR\u001c\u0010U\u001a\n @*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010AR\u001c\u0010X\u001a\n @*\u0004\u0018\u00010V0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010WR\u001c\u0010Y\u001a\n @*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010AR\u001c\u0010]\u001a\n @*\u0004\u0018\u00010Z0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001c\u0010_\u001a\n @*\u0004\u0018\u00010G0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010IR\u0017\u0010d\u001a\u00020`8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bO\u0010cR\u0017\u0010g\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\be\u0010A\u001a\u0004\bH\u0010fR\u0017\u0010i\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bh\u0010A\u001a\u0004\bL\u0010fR\u0014\u0010l\u001a\u00020,8\u0002X\u0082D¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006n"}, m65681d2 = {"Lrq0/d1;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "", "isFloating", "<init>", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V", "Landroid/widget/TextView;", "Lcom/whoop/domain/model/teams/TeamUserListing;", "item", "Lrq0/v0;", "sortOption", "Ll83/a0;", "i", "(Landroid/widget/TextView;Lcom/whoop/domain/model/teams/TeamUserListing;Lrq0/v0;)V", "Lcom/whoop/ui/teams/LeaderActivityDto;", "peakActivity", "Landroid/content/res/Resources;", "res", "l", "(Landroid/widget/TextView;Lcom/whoop/ui/teams/LeaderActivityDto;Landroid/content/res/Resources;Lrq0/v0;)V", "", "text", "", "endOfSpan", "bold", "g", "(Landroid/widget/TextView;Ljava/lang/CharSequence;IZ)V", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "", "dayStrain", "", "recovery", "sleepPerf", "k", "(Lcom/whoop/ui/ScoreContext;Lrq0/v0;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;)V", "showDetails", "calories", "hrv", "rhr", "", "sleepDurationString", "j", "(ZLcom/whoop/ui/ScoreContext;Landroid/content/res/Resources;Lrq0/v0;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriod", "rank", "Lcom/whoop/domain/model/teams/Team;", "team", "selectedTimePeriod", "Lorg/joda/time/LocalDate;", "selectedDate", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lkotlin/Function1;", "onClick", "b", "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;Lrq0/v0;ILcom/whoop/domain/model/teams/TeamUserListing;Lcom/whoop/domain/model/teams/Team;Lcom/whoop/community/domain/model/teams/TimePeriod;Lorg/joda/time/LocalDate;Lcom/whoop/data/repositories/FeatureFlagRepository;Lkotlin/jvm/functions/Function1;)V", "a", "Z", "kotlin.jvm.PlatformType", "Landroid/widget/TextView;", "itemName", "Lde/hdodenhof/circleimageview/CircleImageView;", "c", "Lde/hdodenhof/circleimageview/CircleImageView;", "itemImage", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "itemImageHidden", "Lcom/whoop/ui/ProgressDialLayout;", "e", "Lcom/whoop/ui/ProgressDialLayout;", "itemDial", "f", "itemData1", "itemActivities", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "itemData2", "itemData2B", "itemData2Comma", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "overlayLayout", "waitForData", "Landroid/widget/LinearLayout;", "m", "Landroid/widget/LinearLayout;", "listItemLayout", "n", "nonCompliantIcon", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "lastNonCompliantLayout", "p", "()Landroid/widget/TextView;", "compliantCount", "q", "compliantCountDescription", "r", "Ljava/lang/String;", "EMPTY_STRING", "s", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31659d1 extends AbstractC1717o2 {

    /* JADX INFO: renamed from: t */
    public static final int f130938t = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isFloating;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextView itemName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CircleImageView itemImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ImageView itemImageHidden;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ProgressDialLayout itemDial;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextView itemData1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextView itemActivities;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextView itemData2;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextView itemData2B;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextView itemData2Comma;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final FrameLayout overlayLayout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextView waitForData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final LinearLayout listItemLayout;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final ImageView nonCompliantIcon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final ConstraintLayout lastNonCompliantLayout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final TextView compliantCount;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final TextView compliantCountDescription;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final String EMPTY_STRING;

    /* JADX INFO: renamed from: rq0.d1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f130957a;

        static {
            int[] iArr = new int[ScoreContext.values().length];
            try {
                iArr[ScoreContext.STRAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScoreContext.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScoreContext.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f130957a = iArr;
        }
    }

    public /* synthetic */ C31659d1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutInflater, viewGroup, (i13 & 4) != 0 ? false : z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m97923c(Function1 function1, TeamUserListing teamUserListing, View view) {
        function1.invoke(teamUserListing);
    }

    /* JADX INFO: renamed from: g */
    private final void m97924g(TextView textView, CharSequence charSequence, int i13, boolean z4) {
        Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
        textView.setTextColor(AbstractC32122c.getColor(this.itemView.getContext(), AbstractC36510a.f156030i));
        spannableNewSpannable.setSpan(new ForegroundColorSpan(AbstractC32122c.getColor(this.itemView.getContext(), AbstractC36510a.f156020b)), 0, i13, 33);
        Typeface typefaceM109098b = AbstractC34523k.m109098b(this.itemView.getContext(), AbstractC16273b.f62203d);
        if (typefaceM109098b != null) {
            spannableNewSpannable.setSpan(new C36278b(typefaceM109098b, 0.0f, 2, null), 0, i13, 33);
        }
        textView.setText(spannableNewSpannable, TextView.BufferType.SPANNABLE);
        textView.setTypeface(z4 ? AbstractC34523k.m109098b(this.itemView.getContext(), AbstractC16273b.f62203d) : AbstractC34523k.m109098b(this.itemView.getContext(), AbstractC16273b.f62204e));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m97925h(C31659d1 c31659d1, TextView textView, CharSequence charSequence, int i13, boolean z4, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            z4 = true;
        }
        c31659d1.m97924g(textView, charSequence, i13, z4);
    }

    /* JADX INFO: renamed from: i */
    private final void m97926i(TextView textView, TeamUserListing teamUserListing, C31700v0 c31700v0) {
        textView.setVisibility(0);
        textView.setText(teamUserListing.getActivityString());
        if (c31700v0 == null || c31700v0.getSortType() != 1) {
            textView.setTextColor(AbstractC32122c.getColor(this.itemView.getContext(), AbstractC36510a.f156030i));
            textView.setTypeface(AbstractC34523k.m109098b(this.itemView.getContext(), AbstractC16273b.f62204e));
            return;
        }
        int length = textView.getText().length();
        CharSequence text = textView.getText();
        AbstractC22676k.m65749i(text, "getText(...)");
        if (AbstractC39414r.m125876U(text, ",", false)) {
            CharSequence text2 = textView.getText();
            AbstractC22676k.m65749i(text2, "getText(...)");
            length = !(text2 instanceof String) ? AbstractC39414r.m125889h0(text2, new char[]{DateTimeRange.lowerUpperDelimiter}, 0, false) : ((String) text2).indexOf(44, 0);
        }
        CharSequence text3 = textView.getText();
        AbstractC22676k.m65749i(text3, "getText(...)");
        m97925h(this, textView, text3, length, false, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:95:0x0180  */
    /* JADX INFO: renamed from: j */
    private final void m97927j(boolean showDetails, ScoreContext scoreContext, Resources res, C31700v0 sortOption, Integer calories, Integer hrv, Integer rhr, String sleepDurationString) {
        String str;
        String string;
        int i13;
        TextView textView = this.itemData2;
        int i14 = 8;
        if (showDetails) {
            textView.setVisibility(0);
            int i15 = b.f130957a[scoreContext.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalArgumentException();
                    }
                    if (sleepDurationString == null) {
                        string = this.EMPTY_STRING;
                    } else {
                        if (sleepDurationString.equals(this.EMPTY_STRING)) {
                            string = this.EMPTY_STRING;
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            AbstractC39419w.m125911u(sb4, sleepDurationString, " ", res.getString(AbstractC38505d0.f165593K));
                            string = sb4.toString();
                            AbstractC22676k.m65747g(string);
                        }
                        if (string == null) {
                            string = this.EMPTY_STRING;
                        }
                    }
                } else if (hrv == null) {
                    string = this.EMPTY_STRING;
                } else {
                    int iIntValue = hrv.intValue();
                    if (iIntValue <= 0) {
                        string = this.EMPTY_STRING;
                    } else {
                        String string2 = res.getString(AbstractC38505d0.f165627V0);
                        AbstractC22676k.m65749i(string2, "getString(...)");
                        string = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
                    }
                    if (string == null) {
                        string = this.EMPTY_STRING;
                    }
                }
            } else if (calories == null) {
                string = this.EMPTY_STRING;
            } else {
                int iIntValue2 = calories.intValue();
                if (iIntValue2 <= 0) {
                    string = this.EMPTY_STRING;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    AbstractC39419w.m125911u(sb5, NumberFormat.getIntegerInstance().format(Integer.valueOf(iIntValue2)), " ", res.getString(AbstractC38505d0.f165722v));
                    string = sb5.toString();
                    AbstractC22676k.m65747g(string);
                }
                if (string == null) {
                    string = this.EMPTY_STRING;
                }
            }
            textView.setText(string);
            Context context = this.itemView.getContext();
            Integer numValueOf = sortOption != null ? Integer.valueOf(sortOption.getSortType()) : null;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                i13 = AbstractC36510a.f156020b;
            } else if (numValueOf != null && numValueOf.intValue() == 4) {
                i13 = AbstractC36510a.f156042u;
            } else {
                i13 = (numValueOf != null && numValueOf.intValue() == 7) ? AbstractC36510a.f156024d : AbstractC36510a.f156030i;
            }
            textView.setTextColor(AbstractC32122c.getColor(context, i13));
            Context context2 = this.itemView.getContext();
            Integer numValueOf2 = sortOption != null ? Integer.valueOf(sortOption.getSortType()) : null;
            textView.setTypeface(AbstractC34523k.m109098b(context2, ((numValueOf2 != null && numValueOf2.intValue() == 2) || (numValueOf2 != null && numValueOf2.intValue() == 4) || (numValueOf2 != null && numValueOf2.intValue() == 7)) ? AbstractC16273b.f62203d : AbstractC16273b.f62204e));
        } else {
            textView.setVisibility(8);
        }
        if (!showDetails || scoreContext != ScoreContext.RECOVERY) {
            this.itemData2Comma.setVisibility(8);
            this.itemData2B.setVisibility(8);
            return;
        }
        TextView textView2 = this.itemData2Comma;
        if ((rhr != null ? rhr.intValue() : 0) > 0) {
            if ((rhr != null ? rhr.intValue() : 0) > 0) {
                i14 = 0;
            }
        }
        textView2.setVisibility(i14);
        TextView textView3 = this.itemData2B;
        textView3.setVisibility(0);
        if (rhr == null) {
            str = this.EMPTY_STRING;
        } else {
            int iIntValue3 = rhr.intValue();
            if (iIntValue3 <= 0) {
                str = this.EMPTY_STRING;
            } else {
                String string3 = res.getString(AbstractC38505d0.f165633X0);
                AbstractC22676k.m65749i(string3, "getString(...)");
                str = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue3)}, 1));
            }
            if (str == null) {
                str = this.EMPTY_STRING;
            }
        }
        textView3.setText(str);
        textView3.setTextColor(AbstractC32122c.getColor(this.itemView.getContext(), sortOption != null && sortOption.getSortType() == 5 ? AbstractC36510a.f156042u : AbstractC36510a.f156030i));
        Context context3 = this.itemView.getContext();
        Integer numValueOf3 = sortOption != null ? Integer.valueOf(sortOption.getSortType()) : null;
        textView3.setTypeface(AbstractC34523k.m109098b(context3, (numValueOf3 != null && numValueOf3.intValue() == 5) ? AbstractC16273b.f62203d : AbstractC16273b.f62204e));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX INFO: renamed from: k */
    private final void m97928k(ScoreContext scoreContext, C31700v0 sortOption, Float dayStrain, Double recovery, Double sleepPerf) {
        int i13;
        float fDoubleValue;
        int i14;
        String strM27183h;
        double dDoubleValue;
        if (recovery != null) {
            double dDoubleValue2 = recovery.doubleValue();
            if (dDoubleValue2 <= 33.0d) {
                i13 = AbstractC36510a.f156040s;
            } else {
                i13 = dDoubleValue2 <= 66.0d ? AbstractC36510a.f156025d0 : AbstractC36510a.f156036o;
            }
        } else {
            i13 = AbstractC36510a.f156042u;
        }
        ProgressDial progressDial = this.itemDial.getProgressDial();
        int[] iArr = b.f130957a;
        int i15 = iArr[scoreContext.ordinal()];
        if (i15 != 1) {
            float f13 = 0.0f;
            if (i15 != 2) {
                if (i15 != 3) {
                    throw new IllegalArgumentException();
                }
                if (sleepPerf != null) {
                    dDoubleValue = sleepPerf.doubleValue();
                    f13 = (float) dDoubleValue;
                }
            } else if (recovery != null) {
                dDoubleValue = recovery.doubleValue();
                f13 = (float) dDoubleValue;
            }
            fDoubleValue = f13 / 100.0f;
        } else {
            fDoubleValue = (float) (dayStrain != null ? Double.valueOf(((double) dayStrain.floatValue()) / 21.0d).doubleValue() : 0.0d);
        }
        progressDial.setProgress(fDoubleValue);
        Context context = this.itemView.getContext();
        int i16 = iArr[scoreContext.ordinal()];
        if (i16 == 1) {
            i14 = AbstractC36510a.f156020b;
        } else if (i16 == 2) {
            i14 = i13;
        } else {
            if (i16 != 3) {
                throw new IllegalArgumentException();
            }
            i14 = AbstractC36510a.f156024d;
        }
        progressDial.setFillColor(AbstractC32122c.getColor(context, i14));
        TextView textView = this.itemData1;
        int i17 = iArr[scoreContext.ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    throw new IllegalArgumentException();
                }
                if (sleepPerf != null) {
                    double dDoubleValue3 = sleepPerf.doubleValue();
                    strM27183h = dDoubleValue3 <= 0.0d ? this.EMPTY_STRING : AbstractC10538f.m27182g(dDoubleValue3);
                    if (strM27183h == null) {
                        strM27183h = this.EMPTY_STRING;
                    }
                } else {
                    strM27183h = this.EMPTY_STRING;
                }
            } else if (recovery != null) {
                double dDoubleValue4 = recovery.doubleValue();
                strM27183h = dDoubleValue4 <= 0.0d ? this.EMPTY_STRING : AbstractC10538f.m27182g(dDoubleValue4);
                if (strM27183h == null) {
                    strM27183h = this.EMPTY_STRING;
                }
            } else {
                strM27183h = this.EMPTY_STRING;
            }
        } else if (dayStrain == null || (strM27183h = AbstractC10538f.m27183h(dayStrain.floatValue())) == null) {
            strM27183h = this.EMPTY_STRING;
        }
        textView.setText(strM27183h);
        Context context2 = this.itemView.getContext();
        if (sortOption == null || sortOption.getIndex() != 0) {
            i13 = AbstractC36510a.f156030i;
        } else {
            int i18 = iArr[scoreContext.ordinal()];
            if (i18 == 1) {
                i13 = AbstractC36510a.f156020b;
            } else if (i18 != 2) {
                if (i18 != 3) {
                    throw new IllegalArgumentException();
                }
                i13 = AbstractC36510a.f156024d;
            }
        }
        textView.setTextColor(AbstractC32122c.getColor(context2, i13));
        textView.setTypeface(AbstractC34523k.m109098b(this.itemView.getContext(), (sortOption == null || sortOption.getIndex() != 0) ? AbstractC16273b.f62204e : AbstractC16273b.f62203d));
    }

    /* JADX INFO: renamed from: l */
    private final void m97929l(TextView textView, LeaderActivityDto leaderActivityDto, Resources resources, C31700v0 c31700v0) {
        textView.setVisibility(0);
        String name = leaderActivityDto.getName();
        if (name == null) {
            textView.setVisibility(8);
            return;
        }
        String strM27183h = AbstractC10538f.m27183h(leaderActivityDto.getStrain());
        if (leaderActivityDto.getCycleDay() == null) {
            textView.setVisibility(8);
            return;
        }
        C28204u.Companion companion = C28204u.INSTANCE;
        LocalDate localDate = LocalDate.parse(leaderActivityDto.getCycleDay());
        AbstractC22676k.m65749i(localDate, "parse(...)");
        textView.setText(resources.getString(AbstractC38505d0.f165646b0, name, strM27183h, companion.m85358a(localDate, "M/d")));
        if (c31700v0 == null || c31700v0.getSortType() != 1) {
            textView.setTextColor(AbstractC32122c.getColor(this.itemView.getContext(), AbstractC36510a.f156030i));
            textView.setTypeface(AbstractC34523k.m109098b(this.itemView.getContext(), AbstractC16273b.f62204e));
        } else {
            CharSequence text = textView.getText();
            AbstractC22676k.m65749i(text, "getText(...)");
            m97924g(textView, text, strM27183h.length() + name.length() + 1, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0086  */
    /* JADX INFO: renamed from: b */
    public final void m97930b(ScoreContext scoreContext, TimePeriod timePeriod, C31700v0 sortOption, int rank, TeamUserListing item, Team team, TimePeriod selectedTimePeriod, LocalDate selectedDate, FeatureFlagRepository featureFlagRepository, Function1 onClick) {
        boolean z4;
        PrivacyType overview;
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        AbstractC22676k.m65750j(timePeriod, "timePeriod");
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(selectedTimePeriod, "selectedTimePeriod");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(onClick, "onClick");
        Resources resources = this.itemView.getContext().getResources();
        PrivacyType privacyTypeForContext = item.getPrivacyProfile().forContext(scoreContext);
        PrivacyType privacyType = PrivacyType.DETAIL;
        boolean z13 = privacyTypeForContext.isAtLeast(privacyType) && team.getPrivacyProfile().forContext(scoreContext).isAtLeast(privacyType);
        PrivacyType overview2 = item.getPrivacyProfile().getOverview();
        if (overview2 != null) {
            PrivacyType privacyType2 = PrivacyType.SUMMARY;
            if (overview2.isAtLeast(privacyType2) && (overview = team.getPrivacyProfile().getOverview()) != null && overview.isAtLeast(privacyType2)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        TimePeriod timePeriod2 = TimePeriod.DAILY;
        if (selectedTimePeriod == timePeriod2 || !AbstractC22676k.m65745e(item.getCompliant(), Boolean.FALSE)) {
            TextView textView = this.itemName;
            String string = resources.getString(AbstractC38505d0.f165630W0);
            AbstractC22676k.m65749i(string, "getString(...)");
            textView.setText(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(rank), item.getFullName()}, 2)));
        } else {
            this.itemName.setText(item.getFullName());
        }
        if (this.isFloating) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, 0, 0, 0);
            this.itemView.setLayoutParams(layoutParams2);
        }
        ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(item.getAvatarUrl()).m89314d(C40786k.f175891b)).m89319j(AbstractC36512c.f156071n)).m15537y(this.itemImage);
        if (z4) {
            this.itemView.setOnClickListener(new ViewOnClickListenerC2292a(11, onClick, item));
            this.itemImage.setColorFilter((ColorFilter) null);
            this.itemImageHidden.setVisibility(8);
        } else {
            this.itemImage.setColorFilter(Color.argb(127, 0, 0, 0));
            this.itemImageHidden.setVisibility(0);
        }
        m97928k(scoreContext, sortOption, item.getDayStrain(), item.getRecovery(), item.getSleepPerf());
        AbstractC22676k.m65747g(resources);
        boolean z14 = z13;
        m97927j(z14, scoreContext, resources, sortOption, item.getCalories(), item.getHRV(), item.getRHR(), item.getSleepDurationString());
        TextView textView2 = this.itemActivities;
        if (scoreContext != ScoreContext.STRAIN || !z14) {
            textView2.setVisibility(8);
        } else if (timePeriod != timePeriod2 && item.getPeakActivity() != null) {
            AbstractC22676k.m65747g(textView2);
            LeaderActivityDto peakActivity = item.getPeakActivity();
            AbstractC22676k.m65747g(peakActivity);
            m97929l(textView2, peakActivity, resources, sortOption);
        } else if (AbstractC22676k.m65745e(item.getActivityString(), this.EMPTY_STRING)) {
            textView2.setVisibility(8);
        } else {
            AbstractC22676k.m65747g(textView2);
            m97926i(textView2, item, sortOption);
        }
        if (selectedTimePeriod == timePeriod2 && AbstractC22676k.m65745e(item.getWaitingForData(), Boolean.TRUE) && AbstractC22676k.m65745e(item.getHasData(), Boolean.FALSE) && selectedDate != null && selectedDate.equals(LocalDate.now())) {
            this.overlayLayout.setVisibility(0);
            this.waitForData.setVisibility(0);
            this.itemImage.setColorFilter(AbstractC32122c.getColor(this.itemView.getContext(), AbstractC36510a.f156047z));
        } else {
            this.overlayLayout.setVisibility(8);
            this.waitForData.setVisibility(8);
        }
        if (selectedTimePeriod != timePeriod2) {
            ImageView nonCompliantIcon = this.nonCompliantIcon;
            AbstractC22676k.m65749i(nonCompliantIcon, "nonCompliantIcon");
            nonCompliantIcon.setVisibility(AbstractC22676k.m65745e(item.getCompliant(), Boolean.FALSE) ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextView getCompliantCount() {
        return this.compliantCount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextView getCompliantCountDescription() {
        return this.compliantCountDescription;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ConstraintLayout getLastNonCompliantLayout() {
        return this.lastNonCompliantLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31659d1(LayoutInflater inflater, ViewGroup viewGroup, boolean z4) {
        super(inflater.inflate(AbstractC38501b0.f165526k0, viewGroup, false));
        AbstractC22676k.m65750j(inflater, "inflater");
        this.isFloating = z4;
        this.itemName = (TextView) this.itemView.findViewById(AbstractC38499a0.f165226Y3);
        this.itemImage = (CircleImageView) this.itemView.findViewById(AbstractC38499a0.f165210W3);
        this.itemImageHidden = (ImageView) this.itemView.findViewById(AbstractC38499a0.f165218X3);
        this.itemDial = (ProgressDialLayout) this.itemView.findViewById(AbstractC38499a0.f165202V3);
        this.itemData1 = (TextView) this.itemView.findViewById(AbstractC38499a0.f165170R3);
        this.itemActivities = (TextView) this.itemView.findViewById(AbstractC38499a0.f165161Q3);
        this.itemData2 = (TextView) this.itemView.findViewById(AbstractC38499a0.f165178S3);
        this.itemData2B = (TextView) this.itemView.findViewById(AbstractC38499a0.f165194U3);
        this.itemData2Comma = (TextView) this.itemView.findViewById(AbstractC38499a0.f165186T3);
        this.overlayLayout = (FrameLayout) this.itemView.findViewById(AbstractC38499a0.f165019A5);
        this.waitForData = (TextView) this.itemView.findViewById(AbstractC38499a0.f165129M7);
        this.listItemLayout = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165378p4);
        this.nonCompliantIcon = (ImageView) this.itemView.findViewById(AbstractC38499a0.f165352m5);
        View viewFindViewById = this.itemView.findViewById(AbstractC38499a0.f165351m4);
        AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
        this.lastNonCompliantLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(AbstractC38499a0.f165334k5);
        AbstractC22676k.m65749i(viewFindViewById2, "findViewById(...)");
        this.compliantCount = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(AbstractC38499a0.f165343l5);
        AbstractC22676k.m65749i(viewFindViewById3, "findViewById(...)");
        this.compliantCountDescription = (TextView) viewFindViewById3;
        this.EMPTY_STRING = "";
    }
}
