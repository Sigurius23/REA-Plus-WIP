package com.whoop.whooplive.live.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.p069ui.ProgressDial;
import com.whoop.p069ui.views.LiveHeartRateView;
import com.whoop.service.network.model.cycles.Strain;
import com.whoop.whooplive.live.views.LiveOverlayView;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pz2.AbstractC29652e;
import pz2.AbstractC29653f;
import pz2.AbstractC29654g;
import rz2.EnumC31928a;
import vu1.AbstractC36510a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR'\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\b0%j\b\u0012\u0004\u0012\u00020\b`&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lcom/whoop/whooplive/live/views/LiveOverlayView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "onFinishInflate", "()V", "f", "Lcom/whoop/service/network/model/cycles/Strain;", "strain", "c", "(Lcom/whoop/service/network/model/cycles/Strain;)V", "d", "e", "Lrz2/a;", "mode", "i", "(Lrz2/a;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "[I", "getDisplays", "()[I", "displays", "x", "addDisplays", "y", "removeDisplayIcons", "z", "hideDisplayIcons", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "E", "Ljava/util/ArrayList;", "getHideList", "()Ljava/util/ArrayList;", "hideList", "whooplive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class LiveOverlayView extends RelativeLayout {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final ArrayList<Integer> hideList;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int[] displays;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int[] addDisplays;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int[] removeDisplayIcons;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int[] hideDisplayIcons;

    /* JADX INFO: renamed from: com.whoop.whooplive.live.views.LiveOverlayView$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10863a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33378a;

        static {
            int[] iArr = new int[EnumC31928a.values().length];
            try {
                iArr[EnumC31928a.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31928a.Blue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31928a.Grayscale.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33378a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m28633g(LiveOverlayView liveOverlayView, View view) {
        int i13;
        view.setVisibility(8);
        int id4 = view.getId();
        if (id4 == AbstractC29652e.f121121S) {
            i13 = AbstractC29652e.f121120R;
        } else if (id4 == AbstractC29652e.f121115M) {
            i13 = AbstractC29652e.f121114L;
        } else {
            i13 = id4 == AbstractC29652e.f121134c0 ? AbstractC29652e.f121132b0 : AbstractC29652e.f121127Y;
        }
        liveOverlayView.findViewById(i13).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m28634h(LiveOverlayView liveOverlayView, View view) {
        int i13;
        int i14;
        int id4 = view.getId();
        if (id4 == AbstractC29652e.f121122T) {
            i13 = AbstractC29652e.f121121S;
            i14 = AbstractC29652e.f121120R;
        } else if (id4 == AbstractC29652e.f121116N) {
            i13 = AbstractC29652e.f121115M;
            i14 = AbstractC29652e.f121114L;
        } else if (id4 == AbstractC29652e.f121136d0) {
            i13 = AbstractC29652e.f121134c0;
            i14 = AbstractC29652e.f121132b0;
        } else {
            i13 = AbstractC29652e.f121126X;
            i14 = AbstractC29652e.f121127Y;
        }
        liveOverlayView.findViewById(i13).setVisibility(0);
        liveOverlayView.findViewById(i14).setVisibility(8);
    }

    /* JADX INFO: renamed from: c */
    public void m28635c(Strain strain) {
        TextView textView;
        String strM27183h;
        if (strain == null) {
            return;
        }
        double score = strain.getScore();
        if (score != 0.0d) {
            float scorePercent = (float) strain.getScorePercent();
            if (score == 0.0d) {
                strM27183h = getContext().getString(AbstractC29654g.f121195k);
                AbstractC22676k.m65747g(strM27183h);
            } else {
                strM27183h = AbstractC10538f.m27183h(score);
            }
            View viewFindViewById = findViewById(AbstractC29652e.f121120R);
            if (viewFindViewById != null) {
                ProgressDial progressDial = (ProgressDial) viewFindViewById.findViewById(AbstractC29652e.f121144h0);
                if (progressDial != null) {
                    progressDial.setProgress(scorePercent);
                }
                TextView textView2 = (TextView) viewFindViewById.findViewById(AbstractC29652e.f121146i0);
                if (textView2 != null) {
                    textView2.setText(strM27183h);
                }
                TextView textView3 = (TextView) viewFindViewById.findViewById(AbstractC29652e.f121148j0);
                if (textView3 != null) {
                    textView3.setText(viewFindViewById.getResources().getString(AbstractC29654g.f121193i));
                }
            }
        }
        View viewFindViewById2 = findViewById(AbstractC29652e.f121114L);
        if (viewFindViewById2 == null || (textView = (TextView) viewFindViewById2.findViewById(AbstractC29652e.f121118P)) == null) {
            return;
        }
        textView.setText(String.valueOf(strain.getKilocalories()));
    }

    /* JADX INFO: renamed from: d */
    public final void m28636d() {
        for (int i13 : this.removeDisplayIcons) {
            findViewById(i13).setVisibility(8);
        }
        for (int i14 : this.hideDisplayIcons) {
            if (findViewById(i14).isShown()) {
                findViewById(i14).setVisibility(8);
                this.hideList.add(Integer.valueOf(i14));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m28637e() {
        for (int i13 : this.removeDisplayIcons) {
            View viewFindViewById = findViewById(i13);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        }
        Iterator<T> it = this.hideList.iterator();
        while (it.hasNext()) {
            findViewById(((Number) it.next()).intValue()).setVisibility(0);
        }
        this.hideList.clear();
    }

    /* JADX INFO: renamed from: f */
    public void m28638f() {
        for (int i13 : this.addDisplays) {
            View viewFindViewById = findViewById(i13);
            if (viewFindViewById != null) {
                final int i14 = 0;
                viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: tz2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ LiveOverlayView f144026x;

                    {
                        this.f144026x = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                LiveOverlayView.m28633g(this.f144026x, view);
                                break;
                            default:
                                LiveOverlayView.m28634h(this.f144026x, view);
                                break;
                        }
                    }
                });
            }
        }
        for (int i15 : this.removeDisplayIcons) {
            View viewFindViewById2 = findViewById(i15);
            if (viewFindViewById2 != null) {
                final int i16 = 1;
                viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: tz2.a

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ LiveOverlayView f144026x;

                    {
                        this.f144026x = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                LiveOverlayView.m28633g(this.f144026x, view);
                                break;
                            default:
                                LiveOverlayView.m28634h(this.f144026x, view);
                                break;
                        }
                    }
                });
            }
        }
    }

    public final int[] getDisplays() {
        return this.displays;
    }

    public final ArrayList<Integer> getHideList() {
        return this.hideList;
    }

    /* JADX INFO: renamed from: i */
    public void m28639i(EnumC31928a mode) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        AbstractC22676k.m65750j(mode, "mode");
        int i18 = C10863a.f33378a[mode.ordinal()];
        if (i18 != 1) {
            if (i18 == 2) {
                i13 = AbstractC36510a.f156006O;
                i14 = AbstractC36510a.f156009R;
                ((LiveHeartRateView) findViewById(AbstractC29652e.f121130a0)).m27431j();
                i15 = AbstractC36510a.f156042u;
                i16 = AbstractC36510a.f156009R;
            } else {
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = AbstractC36510a.f156020b;
                i14 = AbstractC36510a.f155993B;
                ((LiveHeartRateView) findViewById(AbstractC29652e.f121130a0)).m27432k();
                i15 = AbstractC36510a.f156020b;
                i16 = AbstractC36510a.f155993B;
            }
            i17 = i15;
        } else {
            i13 = AbstractC36510a.f156006O;
            i14 = AbstractC36510a.f156009R;
            ((LiveHeartRateView) findViewById(AbstractC29652e.f121130a0)).m27431j();
            i15 = AbstractC36510a.f156042u;
            i16 = AbstractC36510a.f156009R;
            i17 = AbstractC36510a.f156020b;
        }
        View viewFindViewById = findViewById(AbstractC29652e.f121120R);
        if (viewFindViewById != null) {
            int color = AbstractC32122c.getColor(getContext(), i16);
            int color2 = AbstractC32122c.getColor(getContext(), i15);
            TextView textView = (TextView) viewFindViewById.findViewById(AbstractC29652e.f121146i0);
            if (textView != null) {
                textView.setTextColor(color2);
            }
            TextView textView2 = (TextView) viewFindViewById.findViewById(AbstractC29652e.f121148j0);
            if (textView2 != null) {
                textView2.setTextColor(color);
            }
        }
        View viewFindViewById2 = findViewById(AbstractC29652e.f121114L);
        if (viewFindViewById2 != null) {
            int color3 = AbstractC32122c.getColor(getContext(), i16);
            int color4 = AbstractC32122c.getColor(getContext(), i15);
            ImageView imageView = (ImageView) viewFindViewById2.findViewById(AbstractC29652e.f121117O);
            if (imageView != null) {
                imageView.setColorFilter(color3);
            }
            TextView textView3 = (TextView) viewFindViewById2.findViewById(AbstractC29652e.f121118P);
            if (textView3 != null) {
                textView3.setTextColor(color4);
            }
            TextView textView4 = (TextView) viewFindViewById2.findViewById(AbstractC29652e.f121119Q);
            if (textView4 != null) {
                textView4.setTextColor(color3);
            }
        }
        View viewFindViewById3 = findViewById(AbstractC29652e.f121120R);
        if (viewFindViewById3 != null) {
            int color5 = AbstractC32122c.getColor(getContext(), i17);
            ProgressDial progressDial = (ProgressDial) viewFindViewById3.findViewById(AbstractC29652e.f121144h0);
            if (progressDial != null) {
                progressDial.setFillColor(color5);
            }
        }
        WhoopGraphView whoopGraphView = (WhoopGraphView) findViewById(AbstractC29652e.f121125W);
        if (whoopGraphView != null) {
            whoopGraphView.m28651i(i13, i14);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28638f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveOverlayView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.displays = new int[]{AbstractC29652e.f121120R, AbstractC29652e.f121114L, AbstractC29652e.f121132b0, AbstractC29652e.f121127Y};
        int i14 = AbstractC29652e.f121121S;
        int i15 = AbstractC29652e.f121115M;
        int i16 = AbstractC29652e.f121134c0;
        int i17 = AbstractC29652e.f121126X;
        this.addDisplays = new int[]{i14, i15, i16, i17};
        this.removeDisplayIcons = new int[]{AbstractC29652e.f121122T, AbstractC29652e.f121116N, AbstractC29652e.f121136d0, AbstractC29652e.f121128Z};
        this.hideDisplayIcons = new int[]{i14, i15, i16, i17};
        this.hideList = new ArrayList<>();
        LayoutInflater.from(context).inflate(AbstractC29653f.f121183c, (ViewGroup) this, true);
    }
}
