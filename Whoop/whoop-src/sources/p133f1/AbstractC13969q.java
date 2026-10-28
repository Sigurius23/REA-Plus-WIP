package p133f1;

import android.app.RemoteAction;
import android.content.Context;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import d30.C11520c;
import ej1.C13228a;
import java.util.List;
import mc3.C25437c;
import p294l3.C23283u0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p478s3.C32096b;
import p539v0.AbstractC35452b;
import p568w0.C36625a;
import p601x0.C37797h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: f1.q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13969q {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f49810a = new C28674u2(new C13228a(28));

    /* JADX INFO: renamed from: b */
    public static final C11520c f49811b = new C11520c(1);

    /* JADX INFO: renamed from: a */
    public static final void m39766a(C36625a c36625a, Context context, boolean z4, CharSequence charSequence, C23283u0 c23283u0, C13966p c13966p, Function1 function1) {
        if (charSequence == null || c23283u0 == null || c13966p == null || !(c13966p instanceof C13966p)) {
            function1.invoke(c36625a);
            if (charSequence == null || c23283u0 == null) {
                return;
            }
            AbstractC35452b.m112524a(c36625a, context, z4, charSequence, c23283u0.f92253a);
            return;
        }
        long j7 = c23283u0.f92253a;
        Object obj = c13966p.f49802h;
        C25437c c25437c = c13966p.f49799e;
        TextClassification textClassification = null;
        if (c25437c.tryLock()) {
            C13938f1 c13938f1 = (C13938f1) c13966p.f49801g.getValue();
            TextClassification textClassification2 = (c13938f1 != null && C23283u0.m67356b(j7, c13938f1.f49688b) && AbstractC22676k.m65745e(charSequence, c13938f1.f49687a)) ? c13938f1.f49689c : null;
            c25437c.mo68214i(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            function1.invoke(c36625a);
        } else {
            if (!textClassification.getActions().isEmpty()) {
                c36625a.f156939a.m98a(new C37797h(obj, textClassification, 0));
            } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                c36625a.f156939a.m98a(new C37797h(obj, textClassification, -1));
            }
            function1.invoke(c36625a);
            List<RemoteAction> actions = textClassification.getActions();
            int size = actions.size();
            for (int i13 = 0; i13 < size; i13++) {
                actions.get(i13);
                if (i13 > 0) {
                    c36625a.f156939a.m98a(new C37797h(obj, textClassification, i13));
                }
            }
        }
        AbstractC35452b.m112524a(c36625a, context, z4, charSequence, c23283u0.f92253a);
    }

    /* JADX INFO: renamed from: b */
    public static final C13966p m39767b(EnumC13975s enumC13975s, C32096b c32096b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(430530635);
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        InterfaceC30063j interfaceC30063j = (InterfaceC30063j) c28655q.m87161k(f49810a);
        boolean zM87153g = ((((i13 & 112) ^ 48) > 32 && c28655q.m87153g(c32096b)) || (i13 & 48) == 32) | c28655q.m87153g(interfaceC30063j) | c28655q.m87153g(context);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            f49811b.getClass();
            objM87133R = new C13966p(interfaceC30063j, context, enumC13975s, c32096b);
            c28655q.m87172p0(objM87133R);
        }
        C13966p c13966p = (C13966p) objM87133R;
        c28655q.m87173q(false);
        return c13966p;
    }
}
