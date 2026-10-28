package com.whoop.realtime.presentation.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k52.AbstractC22207c;
import m52.AbstractC25103w;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import vu1.AbstractC36510a;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002+,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, m65681d2 = {"Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;", "value", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;", "getState", "()Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;", "setState", "(Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;)V", "state", "x", "I", "position", "", "y", "Ljava/lang/String;", "rangeText", "Lm52/w;", "z", "Lm52/w;", "binding", "Landroid/graphics/drawable/Drawable;", "E", "Landroid/graphics/drawable/Drawable;", "barDrawable", "Landroid/widget/ImageView;", "F", "Landroid/widget/ImageView;", "barView", "Landroid/widget/TextView;", "G", "Landroid/widget/TextView;", "percentRange", "H", "a", "b", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RealTimeStrainRangeSegment extends LinearLayout {

    /* JADX INFO: renamed from: I */
    public static final int f29113I = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Drawable barDrawable;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final ImageView barView;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final TextView percentRange;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private EnumC9895b state;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int position;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private String rangeText;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final AbstractC25103w binding;

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.RealTimeStrainRangeSegment$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/realtime/presentation/views/RealTimeStrainRangeSegment$b;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "PREV", "NYR", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum EnumC9895b {
        ACTIVE,
        PREV,
        NYR;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.RealTimeStrainRangeSegment$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9896c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29121a;

        static {
            int[] iArr = new int[EnumC9895b.values().length];
            try {
                iArr[EnumC9895b.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9895b.PREV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9895b.NYR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29121a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealTimeStrainRangeSegment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    public final EnumC9895b getState() {
        return this.state;
    }

    public final void setState(EnumC9895b value) {
        AbstractC22676k.m65750j(value, "value");
        this.state = value;
        int i13 = C9896c.f29121a[value.ordinal()];
        if (i13 == 1) {
            this.barDrawable.setTint(getResources().getColor(AbstractC36510a.f156020b, null));
            this.barView.setImageDrawable(this.barDrawable);
            this.percentRange.setTextColor(getResources().getColor(AbstractC36510a.f156020b, null));
        } else if (i13 == 2) {
            this.barDrawable.setTint(getResources().getColor(AbstractC36510a.f156022c, null));
            this.barView.setImageDrawable(this.barDrawable);
            this.percentRange.setTextColor(getResources().getColor(AbstractC36510a.f156022c, null));
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.barDrawable.setTint(getResources().getColor(AbstractC36510a.f156043v, null));
            this.barView.setImageDrawable(this.barDrawable);
            this.percentRange.setTextColor(getResources().getColor(AbstractC36510a.f156043v, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeStrainRangeSegment(Context context, AttributeSet attributeSet, int i13) {
        Drawable drawable;
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.state = EnumC9895b.NYR;
        this.position = 1;
        AbstractC25103w abstractC25103wM73596c = AbstractC25103w.m73596c(LayoutInflater.from(context), this, true);
        AbstractC22676k.m65749i(abstractC25103wM73596c, "inflate(...)");
        this.binding = abstractC25103wM73596c;
        ImageView viewRtstrainRangeBar = abstractC25103wM73596c.f98389a;
        AbstractC22676k.m65749i(viewRtstrainRangeBar, "viewRtstrainRangeBar");
        this.barView = viewRtstrainRangeBar;
        TextView viewRtstrainRangePercent = abstractC25103wM73596c.f98390b;
        AbstractC22676k.m65749i(viewRtstrainRangePercent, "viewRtstrainRangePercent");
        this.percentRange = viewRtstrainRangePercent;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156177Y);
            this.position = typedArrayObtainStyledAttributes.getInt(AbstractC36519j.f156179Z, 1);
            this.rangeText = typedArrayObtainStyledAttributes.getString(AbstractC36519j.f156182a0);
            typedArrayObtainStyledAttributes.recycle();
        }
        setOrientation(1);
        int i14 = this.position;
        if (i14 == 0) {
            drawable = getResources().getDrawable(AbstractC22207c.f86273n, null);
            AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        } else if (i14 == 1) {
            drawable = getResources().getDrawable(AbstractC22207c.f86272m, null);
            AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        } else if (i14 != 2) {
            drawable = getResources().getDrawable(AbstractC22207c.f86272m, null);
            AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        } else {
            drawable = getResources().getDrawable(AbstractC22207c.f86271l, null);
            AbstractC22676k.m65749i(drawable, "getDrawable(...)");
        }
        this.barDrawable = drawable;
        viewRtstrainRangeBar.setImageDrawable(drawable);
        viewRtstrainRangePercent.setText(this.rangeText);
    }

    public /* synthetic */ RealTimeStrainRangeSegment(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
