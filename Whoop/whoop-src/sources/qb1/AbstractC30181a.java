package qb1;

import com.whoop.data.remote.domain.dto.CircularProgressStyle;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.circularprogressindicator.CircularProgressIndicatorModel;
import l83.C23454a0;
import p01.C28582b;
import p01.EnumC28588h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import q80.C30034f;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: qb1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;", "Lp01/b;", "f", "(Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;)Lp01/b;", "Ltr2/n;", "a", "Ltr2/n;", "logger", "Llb1/y0;", "b", "Llb1/y0;", "e", "()Llb1/y0;", "circularProgressIndicatorMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30181a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f123559a = InterfaceC34116n.INSTANCE.m107848a("CircularProgressIndicatorMapper");

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f123560b = Function1.m68251a(new C30034f(10));

    /* JADX INFO: renamed from: qb1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f123561w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f123561w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f123561w.invoke((CircularProgressIndicatorModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m92396c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CircularProgressIndicatorModel.class), new a(new C30034f(11)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C28582b m92397d(CircularProgressIndicatorModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m92399f(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m92398e() {
        return f123560b;
    }

    /* JADX INFO: renamed from: f */
    private static final C28582b m92399f(CircularProgressIndicatorModel circularProgressIndicatorModel) {
        if (circularProgressIndicatorModel.getCurrentProgressSteps() != null) {
            CurrentProgressSteps currentProgressSteps = circularProgressIndicatorModel.getCurrentProgressSteps();
            EnumC28588h enumC28588h = EnumC28588h.STEPS;
            String textDisplay = currentProgressSteps.getTextDisplay();
            return new C28582b(currentProgressSteps.getTotalSteps(), currentProgressSteps.getCurrentStep(), 0.0f, textDisplay, null, null, Boolean.valueOf(currentProgressSteps.getStyle() == CircularProgressStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, enumC28588h, circularProgressIndicatorModel.getId(), 262068, null);
        }
        if (circularProgressIndicatorModel.getCurrentProgressPercentage() == null) {
            f123559a.mo85226q(AbstractC11895b.m31996o("CircularProgressIndicatorModel with id ", circularProgressIndicatorModel.getId(), " has no valid current progress"), new AbstractC30556a.a[0]);
            return new C28582b(0, 0, 0.0f, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, null, circularProgressIndicatorModel.getId(), 524287, null);
        }
        CurrentProgressPercentage currentProgressPercentage = circularProgressIndicatorModel.getCurrentProgressPercentage();
        EnumC28588h enumC28588h2 = EnumC28588h.PERCENTAGE;
        return new C28582b(0, 0, (float) (currentProgressPercentage.getPercentage() / ((double) 100)), currentProgressPercentage.getTextDisplay(), null, null, Boolean.valueOf(currentProgressPercentage.getStyle() == CircularProgressStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, enumC28588h2, circularProgressIndicatorModel.getId(), 262067, null);
    }
}
