package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.OptionInfoModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.C17777p0;
import hy0.EnumC17774o0;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.o3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/OptionInfoModel;", "Lhy0/p0;", "d", "(Lcom/whoop/design/models/items/OptionInfoModel;)Lhy0/p0;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "optionInfoMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23686o3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93899a = Function1.m68251a(new C23654j3(11));

    /* JADX INFO: renamed from: lb1.o3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93900w;

        public a(Function1 function1) {
            this.f93900w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93900w.invoke((OptionInfoModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69193c() {
        return f93899a;
    }

    /* JADX INFO: renamed from: d */
    public static final C17777p0 m69194d(OptionInfoModel optionInfoModel) {
        EnumC17774o0 enumC17774o0;
        AbstractC22676k.m65750j(optionInfoModel, "<this>");
        String id4 = optionInfoModel.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(optionInfoModel.getLabel());
        boolean zIsChecked = optionInfoModel.isChecked();
        String style = optionInfoModel.getStyle();
        EnumC17774o0 enumC17774o1 = EnumC17774o0.CHECKBOX;
        EnumC17774o0[] enumC17774o0ArrValues = EnumC17774o0.values();
        int length = enumC17774o0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC17774o0 = null;
                break;
            }
            enumC17774o0 = enumC17774o0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC17774o0.name(), style)) {
                break;
            }
            i13++;
        }
        if (enumC17774o0 != null) {
            enumC17774o1 = enumC17774o0;
        }
        return new C17777p0(id4, textResourceM21278l, zIsChecked, enumC17774o1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69195e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(OptionInfoModel.class), new a(new C23654j3(12)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C17777p0 m69196f(OptionInfoModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69194d(model);
    }
}
