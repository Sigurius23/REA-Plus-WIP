package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SearchBarKeyboardType;
import com.whoop.design.models.items.SearchBarModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16315n0;
import l83.C23454a0;
import o31.C27514e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.b4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/SearchBarKeyboardType;", "Lq3/n;", "f", "(Lcom/whoop/design/models/items/SearchBarKeyboardType;)I", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "searchBarMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23599b4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93685a = Function1.m68251a(new C23740x3(5));

    /* JADX INFO: renamed from: lb1.b4$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93686a;

        static {
            int[] iArr = new int[SearchBarKeyboardType.values().length];
            try {
                iArr[SearchBarKeyboardType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchBarKeyboardType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchBarKeyboardType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93686a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.b4$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93687w;

        public b(Function1 function1) {
            this.f93687w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93687w.invoke((SearchBarModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68542c() {
        return f93685a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68543d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(SearchBarModel.class), new b(new C23740x3(6)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C27514e m68544e(SearchBarModel model) {
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(model, "model");
        String stateUpdateSearchKey = model.getStateUpdateSearchKey();
        Integer numM46376a = AbstractC16315n0.m46376a(model.getIcon());
        String placeholderText = model.getPlaceholderText();
        if (placeholderText == null || (textResourceM21267a = AbstractC8693b.m21278l(placeholderText)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        return new C27514e(stateUpdateSearchKey, numM46376a, textResourceM21267a, model.getStateUpdateSearchKey(), m68545f(model.getKeyboardType()), model.getMaxLength(), model.getOnTapAnalyticEvent(), null);
    }

    /* JADX INFO: renamed from: f */
    private static final int m68545f(SearchBarKeyboardType searchBarKeyboardType) {
        int i13 = a.f93686a[searchBarKeyboardType.ordinal()];
        if (i13 == 1) {
            return 3;
        }
        if (i13 == 2) {
            return 4;
        }
        if (i13 == 3) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
