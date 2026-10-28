package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.p069ui.ThrobberView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.n0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13502n0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final ThrobberView f47479a;

    /* JADX INFO: renamed from: b */
    public final AbstractC13557y2 f47480b;

    /* JADX INFO: renamed from: c */
    public final AbstractC13531t f47481c;

    /* JADX INFO: renamed from: d */
    public final AbstractC13462f0 f47482d;

    /* JADX INFO: renamed from: e */
    public final AbstractC13452d0 f47483e;

    /* JADX INFO: renamed from: f */
    public final MessageListView f47484f;

    /* JADX INFO: renamed from: g */
    public final View f47485g;

    /* JADX INFO: renamed from: h */
    public final AbstractC13550x f47486h;

    /* JADX INFO: renamed from: i */
    public final ImageView f47487i;

    /* JADX INFO: renamed from: j */
    public final TextView f47488j;

    public AbstractC13502n0(Object obj, View view, int i13, ThrobberView throbberView, AbstractC13557y2 abstractC13557y2, AbstractC13531t abstractC13531t, AbstractC13462f0 abstractC13462f0, AbstractC13452d0 abstractC13452d0, MessageListView messageListView, View view2, AbstractC13550x abstractC13550x, ImageView imageView, TextView textView) {
        super(view, i13, obj);
        this.f47479a = throbberView;
        this.f47480b = abstractC13557y2;
        this.f47481c = abstractC13531t;
        this.f47482d = abstractC13462f0;
        this.f47483e = abstractC13452d0;
        this.f47484f = messageListView;
        this.f47485g = view2;
        this.f47486h = abstractC13550x;
        this.f47487i = imageView;
        this.f47488j = textView;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13502n0 m38215c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38216d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13502n0 m38216d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13502n0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165476B, viewGroup, z4, obj);
    }
}
