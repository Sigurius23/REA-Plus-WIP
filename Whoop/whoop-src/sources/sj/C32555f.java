package sj;

import android.content.Context;
import android.widget.Toast;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Action;
import com.amplitude.android.engagement.types.ButtonBlock;
import com.amplitude.android.engagement.types.ClickAction;
import com.amplitude.android.engagement.types.StepForwardAction;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import p342nj.AbstractC26736a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sj.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C32555f extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ButtonBlock f134874E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C4861a f134875F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C32561l f134876G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f134877w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f134878x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f134879y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Action f134880z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32555f(boolean z4, Context context, String str, Action action, ButtonBlock buttonBlock, C4861a c4861a, C32561l c32561l) {
        super(1);
        this.f134877w = z4;
        this.f134878x = context;
        this.f134879y = str;
        this.f134880z = action;
        this.f134874E = buttonBlock;
        this.f134875F = c4861a;
        this.f134876G = c32561l;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0054  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Action it = (Action) obj;
        AbstractC22676k.m65750j(it, "it");
        if (this.f134877w) {
            Toast.makeText(this.f134878x, this.f134879y, 0).show();
        } else {
            Action action = this.f134880z;
            boolean z4 = action instanceof ClickAction;
            ButtonBlock buttonBlock = this.f134874E;
            C32561l c32561l = this.f134876G;
            C4861a c4861a = this.f134875F;
            if (z4) {
                String identifier = ((ClickAction) action).getValue();
                ConcurrentHashMap concurrentHashMap = AbstractC26736a.f106344a;
                AbstractC22676k.m65750j(identifier, "identifier");
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) AbstractC26736a.f106344a.get(identifier);
                if (interfaceC4339a != null) {
                    interfaceC4339a.invoke();
                    c4861a.m15517c(c32561l.f134896a.getVariantId(), new StepForwardAction((String) null, 1, (DefaultConstructorMarker) null), buttonBlock.getMeta());
                } else {
                    c4861a.m15517c(c32561l.f134896a.getVariantId(), action, buttonBlock.getMeta());
                }
            } else {
                c4861a.m15517c(c32561l.f134896a.getVariantId(), action, buttonBlock.getMeta());
            }
        }
        return C23454a0.f92919a;
    }
}
