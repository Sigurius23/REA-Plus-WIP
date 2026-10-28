package v41;

import androidx.core.app.FrameMetricsAggregator;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import sc0.C32355c;
import v01.C35509k;
import v40.C35652d;
import w71.C36901t;
import w71.C36906y;

/* JADX INFO: renamed from: v41.g0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aO\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"R", "Lm91/u;", "Lkotlin/Function1;", "Lw71/y;", "onQuestion", "Lw71/t;", "onSection", "Lkotlin/Function0;", "onOther", "g", "(Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;)Ljava/lang/Object;", "Lv41/f0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lm91/u;)Lv41/f0;", "", "useFilledCard", "l", "(Lm91/u;Z)Lm91/u;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35667g0 {
    /* JADX INFO: renamed from: g */
    private static final <R> R m112965g(InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a) {
        if (interfaceC25312u instanceof C36906y) {
            return (R) function1.invoke(interfaceC25312u);
        }
        return interfaceC25312u instanceof C36901t ? (R) function2.invoke(interfaceC25312u) : (R) interfaceC4339a.invoke();
    }

    /* JADX INFO: renamed from: h */
    public static final EnumC35665f0 m112966h(InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(interfaceC25312u, "<this>");
        return (EnumC35665f0) m112965g(interfaceC25312u, new C35509k(10), new C35509k(11), new C35652d(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final EnumC35665f0 m112967i(C36906y it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getSectionItemSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final EnumC35665f0 m112968j(C36901t it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getSectionItemSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final EnumC35665f0 m112969k() {
        return EnumC35665f0.Default;
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC25312u m112970l(InterfaceC25312u interfaceC25312u, boolean z4) {
        AbstractC22676k.m65750j(interfaceC25312u, "<this>");
        return !z4 ? interfaceC25312u : (InterfaceC25312u) m112965g(interfaceC25312u, new C35509k(8), new C35509k(9), new C32355c(interfaceC25312u, 26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC25312u m112971m(C36906y it) {
        AbstractC22676k.m65750j(it, "it");
        return C36906y.m118507b(it, 0, null, null, null, false, false, null, null, null, EnumC35665f0.FilledCard, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC25312u m112972n(C36901t it) {
        AbstractC22676k.m65750j(it, "it");
        return C36901t.m118482c(it, null, null, false, false, false, EnumC35665f0.FilledCard, null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC25312u m112973o(InterfaceC25312u interfaceC25312u) {
        return interfaceC25312u;
    }
}
