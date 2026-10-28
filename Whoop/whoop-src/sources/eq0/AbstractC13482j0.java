package eq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.DataBinderMapperImpl;
import com.whoop.community.presentation.chat.view.ChatImageView;
import com.whoop.community.presentation.chat.view.ChatReactionView;
import com.whoop.community.presentation.chat.view.ChatRichTextLinkView;
import de.hdodenhof.circleimageview.CircleImageView;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.j0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13482j0 extends AbstractC1168a0 {

    /* JADX INFO: renamed from: a */
    public final Barrier f47362a;

    /* JADX INFO: renamed from: b */
    public final CircleImageView f47363b;

    /* JADX INFO: renamed from: c */
    public final Barrier f47364c;

    /* JADX INFO: renamed from: d */
    public final Barrier f47365d;

    /* JADX INFO: renamed from: e */
    public final Barrier f47366e;

    /* JADX INFO: renamed from: f */
    public final ChatImageView f47367f;

    /* JADX INFO: renamed from: g */
    public final TextView f47368g;

    /* JADX INFO: renamed from: h */
    public final TextView f47369h;

    /* JADX INFO: renamed from: i */
    public final ConstraintLayout f47370i;

    /* JADX INFO: renamed from: j */
    public final TextView f47371j;

    /* JADX INFO: renamed from: k */
    public final TextView f47372k;

    /* JADX INFO: renamed from: l */
    public final TextView f47373l;

    /* JADX INFO: renamed from: m */
    public final ChatReactionView f47374m;

    /* JADX INFO: renamed from: n */
    public final ChatReactionView f47375n;

    /* JADX INFO: renamed from: o */
    public final ChatReactionView f47376o;

    /* JADX INFO: renamed from: p */
    public final ChatReactionView f47377p;

    /* JADX INFO: renamed from: q */
    public final ChatReactionView f47378q;

    /* JADX INFO: renamed from: r */
    public final ChatReactionView f47379r;

    /* JADX INFO: renamed from: s */
    public final ChatReactionView f47380s;

    /* JADX INFO: renamed from: t */
    public final ChatRichTextLinkView f47381t;

    /* JADX INFO: renamed from: u */
    public final Space f47382u;

    public AbstractC13482j0(Object obj, View view, int i13, Barrier barrier, CircleImageView circleImageView, Barrier barrier2, Barrier barrier3, Barrier barrier4, ChatImageView chatImageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4, TextView textView5, ChatReactionView chatReactionView, ChatReactionView chatReactionView2, ChatReactionView chatReactionView3, ChatReactionView chatReactionView4, ChatReactionView chatReactionView5, ChatReactionView chatReactionView6, ChatReactionView chatReactionView7, ChatRichTextLinkView chatRichTextLinkView, Space space) {
        super(view, i13, obj);
        this.f47362a = barrier;
        this.f47363b = circleImageView;
        this.f47364c = barrier2;
        this.f47365d = barrier3;
        this.f47366e = barrier4;
        this.f47367f = chatImageView;
        this.f47368g = textView;
        this.f47369h = textView2;
        this.f47370i = constraintLayout;
        this.f47371j = textView3;
        this.f47372k = textView4;
        this.f47373l = textView5;
        this.f47374m = chatReactionView;
        this.f47375n = chatReactionView2;
        this.f47376o = chatReactionView3;
        this.f47377p = chatReactionView4;
        this.f47378q = chatReactionView5;
        this.f47379r = chatReactionView6;
        this.f47380s = chatReactionView7;
        this.f47381t = chatRichTextLinkView;
        this.f47382u = space;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC13482j0 m38202c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4) {
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC1177g.f5333a;
        return m38203d(layoutInflater, viewGroup, z4, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static AbstractC13482j0 m38203d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, Object obj) {
        return (AbstractC13482j0) AbstractC1168a0.inflateInternal(layoutInflater, AbstractC38501b0.f165555z, viewGroup, z4, obj);
    }
}
