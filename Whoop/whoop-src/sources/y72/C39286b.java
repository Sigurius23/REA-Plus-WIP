package y72;

import b01.C2182c;
import b01.C2196q;
import com.whoop.design.models.items.BiomarkerModel;
import com.whoop.sanguine.domain.models.SanguineWaitlistBiomarkersResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.AbstractC16315n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import t72.AbstractC33583b;
import w72.AbstractC36911d;

/* JADX INFO: renamed from: y72.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ly72/b;", "", "<init>", "()V", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;", "response", "Lw72/d$c;", "c", "(Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;)Lw72/d$c;", "Lcom/whoop/design/models/items/BiomarkerModel;", "Lb01/c;", "d", "(Lcom/whoop/design/models/items/BiomarkerModel;)Lb01/c;", "Lec3/l;", "Lt72/b;", "upstream", "Lw72/d;", "b", "(Lec3/l;)Lec3/l;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39286b {

    /* JADX INFO: renamed from: y72.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f169020w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39286b f169021x;

        /* JADX INFO: renamed from: y72.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42684a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f169022w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39286b f169023x;

            /* JADX INFO: renamed from: y72.b$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sanguine.presentation.reducers.SanguineWaitlistBiomarkerListViewStateReducer$reduce$$inlined$map$1$2", m100430f = "SanguineWaitlistBiomarkerListViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42685a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f169024E;

                /* JADX INFO: renamed from: F */
                Object f169025F;

                /* JADX INFO: renamed from: G */
                Object f169026G;

                /* JADX INFO: renamed from: H */
                int f169027H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f169028w;

                /* JADX INFO: renamed from: x */
                int f169029x;

                /* JADX INFO: renamed from: y */
                Object f169030y;

                public C42685a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f169028w = obj;
                    this.f169029x |= Integer.MIN_VALUE;
                    return C42684a.this.emit(null, this);
                }
            }

            public C42684a(InterfaceC13062m interfaceC13062m, C39286b c39286b) {
                this.f169022w = interfaceC13062m;
                this.f169023x = c39286b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42685a c42685a;
                Object objM125260c;
                if (interfaceC30057d instanceof C42685a) {
                    c42685a = (C42685a) interfaceC30057d;
                    int i13 = c42685a.f169029x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42685a.f169029x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42685a = new C42685a(interfaceC30057d);
                    }
                } else {
                    c42685a = new C42685a(interfaceC30057d);
                }
                Object obj2 = c42685a.f169028w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42685a.f169029x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f169022w;
                    AbstractC33583b abstractC33583b = (AbstractC33583b) obj;
                    if (AbstractC22676k.m65745e(abstractC33583b, AbstractC33583b.b.f140101a)) {
                        objM125260c = AbstractC36911d.b.f157922b;
                    } else if (AbstractC22676k.m65745e(abstractC33583b, AbstractC33583b.a.f140100a)) {
                        objM125260c = AbstractC36911d.a.f157921b;
                    } else {
                        if (!(abstractC33583b instanceof AbstractC33583b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM125260c = this.f169023x.m125260c(((AbstractC33583b.c) abstractC33583b).getResponse());
                    }
                    c42685a.f169030y = null;
                    c42685a.f169024E = null;
                    c42685a.f169025F = null;
                    c42685a.f169026G = null;
                    c42685a.f169027H = 0;
                    c42685a.f169029x = 1;
                    if (interfaceC13062m.emit(objM125260c, c42685a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C39286b c39286b) {
            this.f169020w = interfaceC13058l;
            this.f169021x = c39286b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f169020w.collect(new C42684a(interfaceC13062m, this.f169021x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final AbstractC36911d.c m125260c(SanguineWaitlistBiomarkersResponse response) {
        String pageHeader = response.getPageHeader();
        String searchPlaceholder = response.getSearchPlaceholder();
        List<BiomarkerModel> biomarkers = response.getBiomarkers();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(biomarkers, 10));
        Iterator<T> it = biomarkers.iterator();
        while (it.hasNext()) {
            arrayList.add(m125261d((BiomarkerModel) it.next()));
        }
        return new AbstractC36911d.c(pageHeader, new C2196q("", searchPlaceholder, arrayList));
    }

    /* JADX INFO: renamed from: d */
    private final C2182c m125261d(BiomarkerModel biomarkerModel) {
        return new C2182c(biomarkerModel.getId(), biomarkerModel.getName(), AbstractC16315n0.m46377b(biomarkerModel.getTrailingIcon()), biomarkerModel.getModal());
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m125262b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }
}
