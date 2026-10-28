package vl2;

import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import or2.EnumC28166h0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: vl2.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lvl2/l;", "", "<init>", "()V", "Lec3/l;", "Lvl2/x;", "upstream", "Lvl2/y;", "a", "(Lec3/l;)Lec3/l;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36119l {

    /* JADX INFO: renamed from: vl2.l$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.trends.data.domain.TrendLocalStateInteractor$interact$1", m100430f = "TrendLocalStateInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lvl2/y;", "localSate", "Lvl2/x;", "domainAction", "Lvl2/y$a;", "<anonymous>", "(Lvl2/y;Lvl2/x;)Lvl2/y$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f154395w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f154396x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC36132y abstractC36132y, AbstractC36131x abstractC36131x, InterfaceC30057d<? super AbstractC36132y.a> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f154396x = abstractC36131x;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC36131x abstractC36131x = (AbstractC36131x) this.f154396x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f154395w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC36131x instanceof AbstractC36131x.a) {
                AbstractC36131x.a aVar = (AbstractC36131x.a) abstractC36131x;
                return (AbstractC37056f.m118959K(EnumC28166h0.WHOOP_AGE, EnumC28166h0.PACE_OF_AGING).contains(aVar.getGraphKey()) && aVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String() == EnumC36106a.WEEKLY) ? new AbstractC36132y.a(EnumC36106a.MONTHLY, aVar.getGraphKey(), aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), null, 8, null) : new AbstractC36132y.a(aVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), aVar.getGraphKey(), aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), null, 8, null);
            }
            if (!(abstractC36131x instanceof AbstractC36131x.b)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC36131x.b bVar = (AbstractC36131x.b) abstractC36131x;
            return new AbstractC36132y.a(bVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), bVar.getGraphKey(), bVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), bVar.m114951d());
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m114786a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new AbstractC36132y.a(EnumC36106a.MONTHLY, EnumC28166h0.NONE, "", null, 8, null), upstream, new a(null)), 1);
    }
}
