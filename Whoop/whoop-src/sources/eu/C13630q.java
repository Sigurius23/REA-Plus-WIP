package eu;

import android.content.Context;
import androidx.lifecycle.AbstractC1638x;
import com.amplitude.android.engagement.types.SurveyListBlock;
import com.amplitude.android.engagement.types.SurveyResponseMultiSelect;
import java.util.List;
import l83.C23454a0;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p530up.C35147c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C13630q extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f48311E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48312w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f48313x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f48314y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f48315z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13630q(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(1);
        this.f48312w = i13;
        this.f48313x = obj;
        this.f48314y = obj2;
        this.f48315z = obj3;
        this.f48311E = obj4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f48312w) {
            case 0:
                C28624i0 DisposableEffect = (C28624i0) obj;
                AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
                C35147c c35147c = (C35147c) this.f48313x;
                C13620k c13620k = new C13620k(0, (InterfaceC28601c1) this.f48314y, c35147c);
                ComponentCallbacksC13632s componentCallbacksC13632s = new ComponentCallbacksC13632s(c35147c);
                AbstractC1638x abstractC1638x = (AbstractC1638x) this.f48315z;
                abstractC1638x.mo4986a(c13620k);
                Context context = (Context) this.f48311E;
                context.registerComponentCallbacks(componentCallbacksC13632s);
                return new C13629p(abstractC1638x, c13620k, context, componentCallbacksC13632s);
            default:
                String newText = (String) obj;
                AbstractC22676k.m65750j(newText, "newText");
                ((Function1) this.f48313x).invoke(new SurveyResponseMultiSelect(((SurveyListBlock) this.f48314y).getUuid(), (List) this.f48315z, (List) this.f48311E, newText));
                return C23454a0.f92919a;
        }
    }
}
