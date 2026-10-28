package l31;

import b91.EnumC2888c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import p715kotlin.Metadata;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: l31.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u001d\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\u0010\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0004\"\u0017\u0010\u0013\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\"\u0017\u0010\u0016\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0004\"\u0017\u0010\u0019\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0004\"\u0017\u0010\u001c\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001d"}, m65681d2 = {"Lsz0/c0;", "a", "Lsz0/c0;", "b", "()Lsz0/c0;", "markdownTextStateCenter", "c", "markdownTextStateEnd", "d", "markdownTextStateStart", "markdownTextSateCombined", "e", "getMarkdownTextStateMaxLines", "markdownTextStateMaxLines", "f", "getMarkdownTextStateMinLines", "markdownTextStateMinLines", "g", "getMarkdownTextStateTrailingNewline", "markdownTextStateTrailingNewline", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getMarkdownTextStateZeroMaxLines", "markdownTextStateZeroMaxLines", "i", "getMarkdownTextStateNegativeMaxLines", "markdownTextStateNegativeMaxLines", "j", "getMarkdownTextStateMinAboveMax", "markdownTextStateMinAboveMax", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23317k {

    /* JADX INFO: renamed from: a */
    private static final C33169c0 f92433a;

    /* JADX INFO: renamed from: b */
    private static final C33169c0 f92434b;

    /* JADX INFO: renamed from: c */
    private static final C33169c0 f92435c;

    /* JADX INFO: renamed from: d */
    private static final C33169c0 f92436d;

    /* JADX INFO: renamed from: e */
    private static final C33169c0 f92437e;

    /* JADX INFO: renamed from: f */
    private static final C33169c0 f92438f;

    /* JADX INFO: renamed from: g */
    private static final C33169c0 f92439g;

    /* JADX INFO: renamed from: h */
    private static final C33169c0 f92440h;

    /* JADX INFO: renamed from: i */
    private static final C33169c0 f92441i;

    /* JADX INFO: renamed from: j */
    private static final C33169c0 f92442j;

    static {
        EnumC2888c enumC2888c = EnumC2888c.B1;
        EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
        f92433a = new C33169c0("`Charlie sent you 4 Advance Labs tests!`", enumC2888c, enumC39333f, 3, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null);
        f92434b = new C33169c0("~~Charlie sent you 4 Advance Labs tests!~~", EnumC2888c.H5, EnumC39333f.BRAND_PRIMARY, 6, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null);
        f92435c = new C33169c0("*Charlie sent you 4 Advance Labs tests!*", EnumC2888c.T3, EnumC39333f.ACCENT_ACTION, 5, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null);
        f92436d = new C33169c0("~~Charlie~~ sent you **25** `Advanced Labs Test!` worth ~~1500~~ / 600", enumC2888c, enumC39333f, 3, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null);
        f92437e = new C33169c0("This is a **long** markdown paragraph that keeps going well beyond two lines so that the maxLines limit truncates it with an ellipsis at the end of the second line.", enumC2888c, enumC39333f, 5, null, 2, null, null, false, null, 976, null);
        f92438f = new C33169c0("Short line", enumC2888c, enumC39333f, 5, null, null, 3, null, false, null, 944, null);
        f92439g = new C33169c0("This paragraph ends with a trailing newline to verify truncation is unaffected.\n", enumC2888c, enumC39333f, 5, null, 2, null, null, false, null, 976, null);
        f92440h = new C33169c0("maxLines is zero, which is invalid and should be clamped to a single line.", enumC2888c, enumC39333f, 5, null, 0, null, null, false, null, 976, null);
        f92441i = new C33169c0("maxLines is negative, which is invalid and should be clamped to a single line.", enumC2888c, enumC39333f, 5, null, -3, null, null, false, null, 976, null);
        f92442j = new C33169c0("minLines exceeds maxLines, which is invalid and should be clamped down to maxLines.", enumC2888c, enumC39333f, 5, null, 2, 5, null, false, null, 912, null);
    }

    /* JADX INFO: renamed from: a */
    public static final C33169c0 m67503a() {
        return f92436d;
    }

    /* JADX INFO: renamed from: b */
    public static final C33169c0 m67504b() {
        return f92433a;
    }

    /* JADX INFO: renamed from: c */
    public static final C33169c0 m67505c() {
        return f92434b;
    }

    /* JADX INFO: renamed from: d */
    public static final C33169c0 m67506d() {
        return f92435c;
    }
}
