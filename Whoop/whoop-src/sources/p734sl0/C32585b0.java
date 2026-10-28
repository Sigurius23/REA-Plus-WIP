package p734sl0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import nl0.C26804f;
import ny0.AbstractC27274q;
import p163g1.C15199y3;
import p208i2.AbstractC17911t;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import v41.AbstractC35660d;
import v41.AbstractC35662e;
import v41.C35666g;

/* JADX INFO: renamed from: sl0.b0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32585b0 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f135026E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f135027F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f135028G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f135029H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135030w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f135031x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f135032y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f135033z;

    public /* synthetic */ C32585b0(AbstractC17911t abstractC17911t, Modifier modifier, boolean z4, C35666g c35666g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function3 function3) {
        this.f135032y = abstractC17911t;
        this.f135033z = modifier;
        this.f135031x = z4;
        this.f135026E = c35666g;
        this.f135027F = interfaceC4339a;
        this.f135028G = interfaceC4339a2;
        this.f135029H = function3;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f135030w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC32600e0.m101724g(this.f135031x, (String) this.f135032y, (AiMessageFeedback) this.f135033z, (InterfaceC2994c0) this.f135026E, (C15199y3) this.f135027F, (Function1) this.f135028G, (C26804f) this.f135029H, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC35660d.m112876r((AbstractC17911t) this.f135032y, (Modifier) this.f135033z, this.f135031x, (C35666g) this.f135026E, (InterfaceC4339a) this.f135027F, (InterfaceC4339a) this.f135028G, (Function3) this.f135029H, (InterfaceC23013y) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC35662e.m112948l((AbstractC17911t) this.f135032y, this.f135031x, (C35666g) this.f135033z, (InterfaceC4339a) this.f135026E, (InterfaceC4339a) this.f135027F, (AbstractC27274q) this.f135028G, (Function3) this.f135029H, (InterfaceC23013y) obj, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ C32585b0(AbstractC17911t abstractC17911t, boolean z4, C35666g c35666g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, AbstractC27274q abstractC27274q, Function3 function3) {
        this.f135032y = abstractC17911t;
        this.f135031x = z4;
        this.f135033z = c35666g;
        this.f135026E = interfaceC4339a;
        this.f135027F = interfaceC4339a2;
        this.f135028G = abstractC27274q;
        this.f135029H = function3;
    }

    public /* synthetic */ C32585b0(boolean z4, String str, AiMessageFeedback aiMessageFeedback, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, C26804f c26804f) {
        this.f135031x = z4;
        this.f135032y = str;
        this.f135033z = aiMessageFeedback;
        this.f135026E = interfaceC2994c0;
        this.f135027F = c15199y3;
        this.f135028G = function1;
        this.f135029H = c26804f;
    }
}
