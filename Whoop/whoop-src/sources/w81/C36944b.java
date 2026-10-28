package w81;

import p190hc.AbstractC17145h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w81.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lw81/b;", "Lhc/h;", "Lkotlin/Function1;", "", "Ll83/a0;", "onStateUpdate", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "state", "onPageScrollStateChanged", "(I)V", "a", "Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C36944b extends AbstractC17145h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onStateUpdate;

    public C36944b(Function1 onStateUpdate) {
        AbstractC22676k.m65750j(onStateUpdate, "onStateUpdate");
        this.onStateUpdate = onStateUpdate;
    }

    @Override // p190hc.AbstractC17145h
    public void onPageScrollStateChanged(int state) {
        this.onStateUpdate.invoke(Integer.valueOf(state));
    }
}
