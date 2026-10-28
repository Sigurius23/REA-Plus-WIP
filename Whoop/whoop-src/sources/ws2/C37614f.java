package ws2;

import e93.AbstractC12889b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ws2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lws2/f;", "", "<init>", "()V", "Lws2/g;", "prevState", "", "changeValue", "a", "(Lws2/g;I)Lws2/g;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37614f {
    /* JADX INFO: renamed from: a */
    public final C37615g m120802a(C37615g prevState, int changeValue) {
        AbstractC22676k.m65750j(prevState, "prevState");
        return new C37615g(AbstractC12889b.m36284n(prevState.getCurrentStepIndex() + changeValue, 0, prevState.getStepTotal() - 1), prevState.getStepTotal(), AbstractC12889b.m36284n(prevState.getCurrentStepIndex() + changeValue, 0, prevState.getStepTotal() - 1) == prevState.getStepTotal() - 1);
    }
}
