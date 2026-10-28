package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DesignItemGridModel;
import com.whoop.design.models.items.DesignItemGridVerticalAlignment;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import p026b2.C2299e;
import p026b2.InterfaceC2301g;
import p291l0.C22976l1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import t51.C33544c;

/* JADX INFO: renamed from: lb1.x0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/items/DesignItemGridModel;", "model", "Lt51/c;", "d", "(Lcom/whoop/design/models/items/DesignItemGridModel;)Lt51/c;", "Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;", "Lb2/g;", "i", "(Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;)Lb2/g;", "Llb1/y0;", "a", "Llb1/y0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Llb1/y0;", "designItemGridMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23737x0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94049a = Function1.m68251a(new C23644i0(23));

    /* JADX INFO: renamed from: lb1.x0$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94050a;

        static {
            int[] iArr = new int[DesignItemGridVerticalAlignment.values().length];
            try {
                iArr[DesignItemGridVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DesignItemGridVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DesignItemGridVerticalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94050a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.x0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94051w;

        public b(Function1 function1) {
            this.f94051w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94051w.invoke((DesignItemGridModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C33544c m69637d(DesignItemGridModel model) {
        AbstractC22676k.m65750j(model, "model");
        List listM60536k = C21535a.m60536k(AbstractC21537c.m60554d(new C23670m(12)), model.getItems(), null, 2, null);
        String id4 = model.getId();
        float columnWidth = (float) model.getColumnWidth();
        float minHorizontalSpacing = (float) model.getMinHorizontalSpacing();
        float minVerticalSpacing = (float) model.getMinVerticalSpacing();
        float minHorizontalPadding = (float) model.getMinHorizontalPadding();
        float minVerticalPadding = (float) model.getMinVerticalPadding();
        C22976l1 c22976l1 = new C22976l1(minHorizontalPadding, minVerticalPadding, minHorizontalPadding, minVerticalPadding);
        DesignItemGridVerticalAlignment verticalAlignment = model.getVerticalAlignment();
        if (verticalAlignment == null) {
            verticalAlignment = DesignItemGridVerticalAlignment.CENTER;
        }
        return new C33544c(id4, columnWidth, listM60536k, minHorizontalSpacing, minVerticalSpacing, c22976l1, m69642i(verticalAlignment), model.getNumberOfColumns(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69638e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignItemGridModel.class), new b(new C23644i0(24)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C33544c m69639f(DesignItemGridModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69637d(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m69640g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final C23743y0 m69641h() {
        return f94049a;
    }

    /* JADX INFO: renamed from: i */
    private static final InterfaceC2301g m69642i(DesignItemGridVerticalAlignment designItemGridVerticalAlignment) {
        int i13 = a.f94050a[designItemGridVerticalAlignment.ordinal()];
        if (i13 == 1) {
            return C2299e.f9107J;
        }
        if (i13 == 2) {
            return C2299e.f9109L;
        }
        if (i13 == 3) {
            return C2299e.f9108K;
        }
        throw new NoWhenBranchMatchedException();
    }
}
