package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DatePillModel;
import com.whoop.design.models.items.DatePillStatus;
import h11.C16606a;
import h11.C16613h;
import h11.EnumC16612g;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.v0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/items/DatePillModel;", "Lh11/h;", "g", "(Lcom/whoop/design/models/items/DatePillModel;)Lh11/h;", "Lcom/whoop/design/models/items/DatePillStatus;", "Lh11/g;", "f", "(Lcom/whoop/design/models/items/DatePillStatus;)Lh11/g;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "datePillMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23725v0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94019a = Function1.m68251a(new C23670m(10));

    /* JADX INFO: renamed from: lb1.v0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94020a;

        static {
            int[] iArr = new int[DatePillStatus.values().length];
            try {
                iArr[DatePillStatus.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DatePillStatus.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DatePillStatus.INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94020a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.v0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94021w;

        public b(Function1 function1) {
            this.f94021w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94021w.invoke((DatePillModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69568c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DatePillModel.class), new b(new C23670m(11)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C16613h m69569d(DatePillModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69572g(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69570e() {
        return f94019a;
    }

    /* JADX INFO: renamed from: f */
    private static final EnumC16612g m69571f(DatePillStatus datePillStatus) {
        int i13 = a.f94020a[datePillStatus.ordinal()];
        if (i13 == 1) {
            return EnumC16612g.HAS_APPOINTMENT;
        }
        if (i13 == 2) {
            return EnumC16612g.NO_APPOINTMENTS;
        }
        if (i13 == 3) {
            return EnumC16612g.INVALID;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    private static final C16613h m69572g(DatePillModel datePillModel) {
        C16606a c16606a = new C16606a(datePillModel.getDisplay().getDay(), String.valueOf(datePillModel.getDisplay().getDate()));
        boolean zIsSelected = datePillModel.isSelected();
        EnumC16612g enumC16612gM69571f = m69571f(datePillModel.getStatus());
        String date = datePillModel.getDate();
        if (date == null) {
            date = String.valueOf(datePillModel.getDisplay().getDate());
        }
        return new C16613h(c16606a, null, zIsSelected, enumC16612gM69571f, date, null, null, false, false, datePillModel.getSelectedColor(), null, datePillModel.getInteraction(), false, null, 13794, null);
    }
}
