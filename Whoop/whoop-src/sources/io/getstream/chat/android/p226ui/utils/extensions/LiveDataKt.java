package io.getstream.chat.android.p226ui.utils.extensions;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1596j;
import androidx.lifecycle.C1627t0;
import androidx.lifecycle.InterfaceC1633v0;
import bc3.C3023j1;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a]\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\n2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"T", "K", "R", "Landroidx/lifecycle/p0;", "liveData", "Lkotlin/Function2;", "block", "combineWith", "(Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Lc93/m;)Landroidx/lifecycle/p0;", "S", "Landroidx/lifecycle/t0;", "Lq83/j;", "context", "Lec3/l;", "source", "Landroidx/lifecycle/v0;", "onChanged", "Ll83/a0;", "addFlow", "(Landroidx/lifecycle/t0;Lq83/j;Lec3/l;Landroidx/lifecycle/v0;)V", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LiveDataKt {
    public static final <T, S> void addFlow(C1627t0 c1627t0, InterfaceC30063j context, InterfaceC13058l source, InterfaceC1633v0 onChanged) {
        AbstractC22676k.m65750j(c1627t0, "<this>");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(onChanged, "onChanged");
        C1596j c1596jM5012b = AbstractC1613o1.m5012b(source, context, 2);
        c1627t0.m5035b(c1596jM5012b, onChanged);
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) context.get(C3023j1.f12041w);
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.invokeOnCompletion(new C19223a(20, c1627t0, c1596jM5012b));
        }
    }

    public static /* synthetic */ void addFlow$default(C1627t0 c1627t0, InterfaceC30063j interfaceC30063j, InterfaceC13058l interfaceC13058l, InterfaceC1633v0 interfaceC1633v0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC30063j = C30064k.f122676w;
        }
        addFlow(c1627t0, interfaceC30063j, interfaceC13058l, interfaceC1633v0);
    }

    private static final C23454a0 addFlow$lambda$3$lambda$2(C1627t0 c1627t0, AbstractC1615p0 abstractC1615p0, Throwable th3) {
        c1627t0.m5036c(abstractC1615p0);
        return C23454a0.f92919a;
    }

    public static final <T, K, R> AbstractC1615p0 combineWith(final AbstractC1615p0 abstractC1615p0, final AbstractC1615p0 liveData, final InterfaceC4351m block) {
        AbstractC22676k.m65750j(abstractC1615p0, "<this>");
        AbstractC22676k.m65750j(liveData, "liveData");
        AbstractC22676k.m65750j(block, "block");
        final C1627t0 c1627t0 = new C1627t0();
        final int i13 = 0;
        c1627t0.m5035b(abstractC1615p0, new LiveDataKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.utils.extensions.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        LiveDataKt.combineWith$lambda$0(c1627t0, block, abstractC1615p0, liveData, obj);
                        break;
                    default:
                        LiveDataKt.combineWith$lambda$1(c1627t0, block, abstractC1615p0, liveData, obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i14 = 1;
        c1627t0.m5035b(liveData, new LiveDataKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.utils.extensions.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        LiveDataKt.combineWith$lambda$0(c1627t0, block, abstractC1615p0, liveData, obj);
                        break;
                    default:
                        LiveDataKt.combineWith$lambda$1(c1627t0, block, abstractC1615p0, liveData, obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        return c1627t0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 combineWith$lambda$0(C1627t0 c1627t0, InterfaceC4351m interfaceC4351m, AbstractC1615p0 abstractC1615p0, AbstractC1615p0 abstractC1615p1, Object obj) {
        c1627t0.setValue(interfaceC4351m.invoke(abstractC1615p0.getValue(), abstractC1615p1.getValue()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 combineWith$lambda$1(C1627t0 c1627t0, InterfaceC4351m interfaceC4351m, AbstractC1615p0 abstractC1615p0, AbstractC1615p0 abstractC1615p1, Object obj) {
        c1627t0.setValue(interfaceC4351m.invoke(abstractC1615p0.getValue(), abstractC1615p1.getValue()));
        return C23454a0.f92919a;
    }
}
