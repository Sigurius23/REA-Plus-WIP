package i61;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21369c;
import j61.EnumC21367a;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i61.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0016\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001d\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0014\u0010\u001f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\bR\u0014\u0010!\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0014\u0010#\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010¨\u0006$À\u0006\u0003"}, m65681d2 = {"Li61/b;", "", "Lj61/c;", "state", "Lh2/c;", "b", "(Lj61/c;)Lh2/c;", "c", "()Lh2/c;", "gridLineRect", "a", "contentRect", "k", "bottomHorizontalAxisRect", "", "n", "()F", "bottomHorizontalAxisSize", "g", "topHorizontalAxisRect", "i", "topHorizontalAxisSize", "f", "startVerticalAxisRect", "m", "endVerticalAxisRect", "e", "axisDescriptionRect", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "scrubberRect", "j", "scaledInsets", "d", "startVerticalAxisSize", "l", "endVerticalAxisSize", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC18153b {

    /* JADX INFO: renamed from: i61.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70455a;

        static {
            int[] iArr = new int[EnumC21367a.values().length];
            try {
                iArr[EnumC21367a.Y_AXIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21367a.X_AXIS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21367a.X_AND_Y_AXES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70455a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    C16618c mo52120a();

    /* JADX INFO: renamed from: b */
    default C16618c mo52121b(C21369c state) {
        AbstractC22676k.m65750j(state, "state");
        int i13 = a.f70455a[state.getDimension().ordinal()];
        if (i13 == 1) {
            return new C16618c(0.0f, mo52128i() + mo52129j().f63940b, 1.0f, (1.0f - mo52133n()) - mo52129j().f63942d);
        }
        if (i13 == 2) {
            return new C16618c(mo52123d() + mo52129j().f63939a, 0.0f, (1.0f - mo52131l()) - mo52129j().f63941c, 1.0f);
        }
        if (i13 == 3) {
            return mo52120a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    C16618c mo52122c();

    /* JADX INFO: renamed from: d */
    float mo52123d();

    /* JADX INFO: renamed from: e */
    C16618c mo52124e();

    /* JADX INFO: renamed from: f */
    C16618c mo52125f();

    /* JADX INFO: renamed from: g */
    C16618c mo52126g();

    /* JADX INFO: renamed from: h */
    C16618c mo52127h();

    /* JADX INFO: renamed from: i */
    float mo52128i();

    /* JADX INFO: renamed from: j */
    C16618c mo52129j();

    /* JADX INFO: renamed from: k */
    C16618c mo52130k();

    /* JADX INFO: renamed from: l */
    float mo52131l();

    /* JADX INFO: renamed from: m */
    C16618c mo52132m();

    /* JADX INFO: renamed from: n */
    float mo52133n();
}
