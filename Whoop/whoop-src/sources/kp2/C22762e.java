package kp2;

import c93.InterfaceC4351m;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.design.util.TextResource;
import com.whoop.universalcheckout.features.shippingaddress.domain.GetShippingAddressRequest;
import com.whoop.universalcheckout.features.shippingaddress.domain.PostShippingAddressRequest;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.DropdownLookup;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressModels;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressRequestBody;
import ec3.AbstractC13091v;
import ec3.AbstractC13095w0;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14380k;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23454a0;
import ln2.AbstractC24541a;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25272z;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.C21567b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import va3.AbstractC35849g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39410n;
import yb3.C39412p;
import yb3.EnumC39413q;

/* JADX INFO: renamed from: kp2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020!2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0018H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010(\u001a\u00020\u00032\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0018\u00010%j\u0002`&0$H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b5\u0010.J\u0017\u00106\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u0010.J/\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00162\b\b\u0002\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J)\u0010<\u001a\u00020\u00032\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0$2\b\b\u0002\u00107\u001a\u00020\u0016H\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160>*\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b?\u0010@J!\u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020\u00162\b\u0010B\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006K"}, m65681d2 = {"Lkp2/e;", "Lod1/g;", "Lkp2/b;", "Lkp2/c;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "previousState", "action", "v", "(Lkp2/c;Lkp2/b;)Lkp2/c;", "Lkp2/b$i;", "y", "(Lkp2/c;Lkp2/b$i;)Lkp2/c;", "Lkp2/b$j;", "z", "(Lkp2/c;Lkp2/b$j;)Lkp2/c;", "", "cartId", "", "userInput", "Lkp2/f;", "E", "(Ljava/lang/String;Ljava/util/Map;)Lec3/l;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;", "response", "o", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;)Ljava/util/Map;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;", "m", "(Ljava/util/Map;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;", "Lpm0/a$c;", "Ll83/a0;", "Lcom/whoop/network/request/NoRequestBody;", "cacheResult", "B", "(Lpm0/a$c;)Lkp2/c;", "Lkp2/b$g;", "A", "(Lkp2/c;Lkp2/b$g;)Lkp2/c;", "t", "(Lkp2/c;)Lkp2/c;", "Lkp2/b$f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lkp2/c;Lkp2/b$f;)Lkp2/c;", "Lkp2/b$a;", "r", "(Lkp2/c;Lkp2/b$a;)Lkp2/c;", "s", "u", "source", "", "manualRefresh", "D", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "x", "(Lpm0/a$c;Ljava/lang/String;)Lkp2/c;", "", "q", "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;)Ljava/util/Set;", "displayLabel", "example", "Lcom/whoop/design/util/TextResource$b;", "p", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource$b;", "a", "Lnm0/e;", "b", "Lkp2/c;", "currentState", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22762e implements InterfaceC27844g<AbstractC22759b, C22760c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C22760c currentState;

    /* JADX INFO: renamed from: kp2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$interact$1", m100430f = "ShippingAddressInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkp2/b;", "action", "Lec3/l;", "Lkp2/f;", "<anonymous>", "(Lkp2/b;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89613w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f89614x;

        /* JADX INFO: renamed from: kp2.e$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$interact$1$1", m100430f = "ShippingAddressInteractor.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lkp2/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41920a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f89616w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f89617x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC22759b f89618y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41920a(AbstractC22759b abstractC22759b, InterfaceC30057d<? super C41920a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f89618y = abstractC22759b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41920a c41920a = new C41920a(this.f89618y, interfaceC30057d);
                c41920a.f89617x = obj;
                return c41920a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41920a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89617x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f89616w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC22763f.b bVar = new AbstractC22763f.b(this.f89618y);
                    this.f89617x = null;
                    this.f89616w = 1;
                    if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C22762e.this.new a(interfaceC30057d);
            aVar.f89614x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC22759b abstractC22759b, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((a) create(abstractC22759b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC22759b abstractC22759b = (AbstractC22759b) this.f89614x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f89613w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(abstractC22759b instanceof AbstractC22759b.e)) {
                return abstractC22759b instanceof AbstractC22759b.h ? C22762e.this.m65933E(((AbstractC22759b.h) abstractC22759b).getCartId(), C22762e.this.currentState.m65926n()) : new C13084s1(new C41920a(abstractC22759b, null));
            }
            AbstractC22759b.e eVar = (AbstractC22759b.e) abstractC22759b;
            return C22762e.this.m65932D(eVar.getCartId(), eVar.getSource(), eVar.getManualRefresh());
        }
    }

    /* JADX INFO: renamed from: kp2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$interact$2", m100430f = "ShippingAddressInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkp2/c;", "previousState", "Lkp2/f;", "action", "<anonymous>", "(Lkp2/c;Lkp2/f;)Lkp2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89619w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f89620x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89621y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22760c c22760c, AbstractC22763f abstractC22763f, InterfaceC30057d<? super C22760c> interfaceC30057d) {
            b bVar = C22762e.this.new b(interfaceC30057d);
            bVar.f89620x = c22760c;
            bVar.f89621y = abstractC22763f;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22760c domainState;
            C22760c c22760c = (C22760c) this.f89620x;
            AbstractC22763f abstractC22763f = (AbstractC22763f) this.f89621y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f89619w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC22763f instanceof AbstractC22763f.b) {
                domainState = C22762e.this.m65953v(c22760c, ((AbstractC22763f.b) abstractC22763f).getDomainAction());
            } else if (abstractC22763f instanceof AbstractC22763f.a) {
                domainState = ((AbstractC22763f.a) abstractC22763f).getDomainState();
            } else {
                if (!(abstractC22763f instanceof AbstractC22763f.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                domainState = ((AbstractC22763f.c) abstractC22763f).getDomainState();
            }
            C22762e.this.currentState = domainState;
            return domainState;
        }
    }

    /* JADX INFO: renamed from: kp2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f89623w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f89624x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22762e f89625y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f89626z;

        /* JADX INFO: renamed from: kp2.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f89627w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f89628x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C22762e f89629y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ boolean f89630z;

            /* JADX INFO: renamed from: kp2.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$loadShippingAddressCache$$inlined$map$1$2", m100430f = "ShippingAddressInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41921a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f89631E;

                /* JADX INFO: renamed from: F */
                Object f89632F;

                /* JADX INFO: renamed from: G */
                Object f89633G;

                /* JADX INFO: renamed from: H */
                int f89634H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f89635w;

                /* JADX INFO: renamed from: x */
                int f89636x;

                /* JADX INFO: renamed from: y */
                Object f89637y;

                public C41921a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f89635w = obj;
                    this.f89636x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, C22762e c22762e, boolean z4) {
                this.f89627w = interfaceC13062m;
                this.f89628x = str;
                this.f89629y = c22762e;
                this.f89630z = z4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41921a c41921a;
                C22760c c22760cM65955x;
                if (interfaceC30057d instanceof C41921a) {
                    c41921a = (C41921a) interfaceC30057d;
                    int i13 = c41921a.f89636x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41921a.f89636x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41921a = new C41921a(interfaceC30057d);
                    }
                } else {
                    c41921a = new C41921a(interfaceC30057d);
                }
                Object obj2 = c41921a.f89635w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41921a.f89636x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f89627w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c22760cM65955x = new C22760c(InterfaceC22758a.d.f89568a, null, null, null, null, null, false, false, null, null, null, null, 0L, null, this.f89628x, 16382, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                        c22760cM65955x = new C22760c(null, (ShippingAddressModels) bVar.getData(), this.f89629y.m65946o((ShippingAddressModels) bVar.getData()), null, null, null, this.f89630z, true, null, null, null, null, 0L, this.f89629y.m65948q((ShippingAddressModels) bVar.getData()), this.f89628x, 7993, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        c22760cM65955x = new C22760c(null, (ShippingAddressModels) c42173a.getData(), this.f89629y.m65946o((ShippingAddressModels) c42173a.getData()), null, null, null, false, false, null, null, null, null, 0L, this.f89629y.m65948q((ShippingAddressModels) c42173a.getData()), this.f89628x, 8185, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                        c22760cM65955x = new C22760c(null, (ShippingAddressModels) dVar.getData(), this.f89629y.m65946o((ShippingAddressModels) dVar.getData()), null, null, null, false, false, null, null, null, null, 0L, this.f89629y.m65948q((ShippingAddressModels) dVar.getData()), this.f89628x, 8185, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c22760cM65955x = this.f89629y.m65955x((InterfaceC29354a.c) interfaceC29354a, this.f89628x);
                    }
                    AbstractC22763f.a aVar = new AbstractC22763f.a(c22760cM65955x);
                    c41921a.f89637y = null;
                    c41921a.f89631E = null;
                    c41921a.f89632F = null;
                    c41921a.f89633G = null;
                    c41921a.f89634H = 0;
                    c41921a.f89636x = 1;
                    if (interfaceC13062m.emit(aVar, c41921a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, String str, C22762e c22762e, boolean z4) {
            this.f89623w = interfaceC13058l;
            this.f89624x = str;
            this.f89625y = c22762e;
            this.f89626z = z4;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f89623w.collect(new a(interfaceC13062m, this.f89624x, this.f89625y, this.f89626z), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kp2.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$loadShippingAddressCache$1", m100430f = "ShippingAddressInteractor.kt", m100431l = {448}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "Lpm0/a;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f89639E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C22762e f89640F;

        /* JADX INFO: renamed from: w */
        Object f89641w;

        /* JADX INFO: renamed from: x */
        int f89642x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f89643y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f89644z;

        /* JADX INFO: renamed from: kp2.e$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$loadShippingAddressCache$1$invokeSuspend$$inlined$cacheAPI$1", m100430f = "ShippingAddressInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f89645w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f89646x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f89647y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC26834e f89648z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
                super(3, interfaceC30057d);
                this.f89648z = interfaceC26834e;
            }

            public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                a aVar = new a(interfaceC30057d, this.f89648z);
                aVar.f89646x = interfaceC13062m;
                aVar.f89647y = c26832c;
                return aVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f89645w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89646x;
                    C26832c c26832c = (C26832c) this.f89647y;
                    InterfaceC26834e interfaceC26834e = this.f89648z;
                    InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                    Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                    C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                    C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                    InterfaceC21456a0 interfaceC21456a0M65689b2 = AbstractC22671h0.m65689b(ShippingAddressModels.class);
                    InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ShippingAddressModels.class), interfaceC21456a0M65689b2, AbstractC21478l0.m60396B(interfaceC21456a0M65689b2)));
                    this.f89646x = null;
                    this.f89647y = null;
                    this.f89645w = 1;
                    if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z4, String str, C22762e c22762e, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f89644z = z4;
            this.f89639E = str;
            this.f89640F = c22762e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f89644z, this.f89639E, this.f89640F, interfaceC30057d);
            dVar.f89643y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89643y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89642x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f89644z) {
                    str = "shipping-address-" + this.f89639E + "-" + System.currentTimeMillis();
                } else {
                    str = null;
                }
                C14380k c14380kM36590P = AbstractC13091v.m36590P(AbstractC32714a.m102669a(new C0456u(new GetShippingAddressRequest(this.f89639E), 1), AbstractC12350b.m34570S("ShippingAddressRefreshScope"), str), new a(null, this.f89640F.cachedApiSource));
                this.f89643y = null;
                this.f89641w = null;
                this.f89642x = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c14380kM36590P, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kp2.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$submitShippingAddress$$inlined$cacheAPI$1", m100430f = "ShippingAddressInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89649w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89650x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89651y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f89652z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f89652z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<ShippingAddressRequestBody> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f89652z);
            eVar.f89650x = interfaceC13062m;
            eVar.f89651y = c26832c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89649w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89650x;
                C26832c c26832c = (C26832c) this.f89651y;
                InterfaceC26834e interfaceC26834e = this.f89652z;
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ShippingAddressRequestBody.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65691d);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ShippingAddressRequestBody.class), interfaceC21456a0M65691d, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b)));
                this.f89650x = null;
                this.f89651y = null;
                this.f89649w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<ShippingAddressRequestBody>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kp2.e$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f89653w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22762e f89654x;

        /* JADX INFO: renamed from: kp2.e$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f89655w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22762e f89656x;

            /* JADX INFO: renamed from: kp2.e$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.domain.ShippingAddressInteractor$submitShippingAddress$$inlined$map$1$2", m100430f = "ShippingAddressInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41922a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f89657E;

                /* JADX INFO: renamed from: F */
                Object f89658F;

                /* JADX INFO: renamed from: G */
                Object f89659G;

                /* JADX INFO: renamed from: H */
                int f89660H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f89661w;

                /* JADX INFO: renamed from: x */
                int f89662x;

                /* JADX INFO: renamed from: y */
                Object f89663y;

                public C41922a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f89661w = obj;
                    this.f89662x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22762e c22762e) {
                this.f89655w = interfaceC13062m;
                this.f89656x = c22762e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41922a c41922a;
                C22760c c22760cM65930B;
                C22760c c22760c;
                if (interfaceC30057d instanceof C41922a) {
                    c41922a = (C41922a) interfaceC30057d;
                    int i13 = c41922a.f89662x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41922a.f89662x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41922a = new C41922a(interfaceC30057d);
                    }
                } else {
                    c41922a = new C41922a(interfaceC30057d);
                }
                Object obj2 = c41922a.f89661w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41922a.f89662x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f89655w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        C22760c c22760c2 = this.f89656x.currentState;
                        c22760cM65930B = c22760c2.m65914a((32734 & 1) != 0 ? c22760c2.currentDialogType : InterfaceC22758a.b.f89567a, (32734 & 2) != 0 ? c22760c2.response : null, (32734 & 4) != 0 ? c22760c2.userInput : null, (32734 & 8) != 0 ? c22760c2.validationErrors : null, (32734 & 16) != 0 ? c22760c2.interactedFields : null, (32734 & 32) != 0 ? c22760c2.backendErrorMessage : null, (32734 & 64) != 0 ? c22760c2.manualRefresh : false, (32734 & 128) != 0 ? c22760c2.displayRefreshingSpinner : false, (32734 & 256) != 0 ? c22760c2.bottomSheetFieldType : null, (32734 & 512) != 0 ? c22760c2.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22760c2.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22760c2.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? c22760c2.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c22760c2.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c22760c2.source : null);
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            c22760c = new C22760c(InterfaceC22758a.i.f89572a, null, null, null, null, null, false, false, null, null, null, null, 0L, null, null, 32766, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            C22760c c22760c3 = this.f89656x.currentState;
                            c22760cM65930B = c22760c3.m65914a((32734 & 1) != 0 ? c22760c3.currentDialogType : InterfaceC22758a.b.f89567a, (32734 & 2) != 0 ? c22760c3.response : null, (32734 & 4) != 0 ? c22760c3.userInput : null, (32734 & 8) != 0 ? c22760c3.validationErrors : null, (32734 & 16) != 0 ? c22760c3.interactedFields : null, (32734 & 32) != 0 ? c22760c3.backendErrorMessage : null, (32734 & 64) != 0 ? c22760c3.manualRefresh : false, (32734 & 128) != 0 ? c22760c3.displayRefreshingSpinner : false, (32734 & 256) != 0 ? c22760c3.bottomSheetFieldType : null, (32734 & 512) != 0 ? c22760c3.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22760c3.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22760c3.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? c22760c3.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c22760c3.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c22760c3.source : null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            c22760c = new C22760c(InterfaceC22758a.g.f89570a, null, null, null, null, null, false, false, null, null, null, null, 0L, null, null, 32766, null);
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c22760cM65930B = this.f89656x.m65930B((InterfaceC29354a.c) interfaceC29354a);
                        }
                        c22760cM65930B = c22760c;
                    }
                    AbstractC22763f.c cVar = new AbstractC22763f.c(c22760cM65930B);
                    c41922a.f89663y = null;
                    c41922a.f89657E = null;
                    c41922a.f89658F = null;
                    c41922a.f89659G = null;
                    c41922a.f89660H = 0;
                    c41922a.f89662x = 1;
                    if (interfaceC13062m.emit(cVar, c41922a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C22762e c22762e) {
            this.f89653w = interfaceC13058l;
            this.f89654x = c22762e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f89653w.collect(new a(interfaceC13062m, this.f89654x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C22762e(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
        this.currentState = new C22760c(null, null, null, null, null, null, false, false, null, null, null, null, 0L, null, null, 32767, null);
    }

    /* JADX INFO: renamed from: A */
    private final C22760c m65929A(C22760c previousState, AbstractC22759b.g action) {
        return previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : null, (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : null, (32734 & 8) != 0 ? previousState.validationErrors : null, (32734 & 16) != 0 ? previousState.interactedFields : null, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : action.getFieldType(), (32734 & 512) != 0 ? previousState.bottomSheetTitle : action.getTitle(), (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : action.m65901b(), (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : System.currentTimeMillis(), (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final C22760c m65930B(InterfaceC29354a.c<C23454a0> cacheResult) {
        C22760c c22760c;
        C22760c c22760cM65914a;
        int httpStatusCode = cacheResult.getHttpStatusCode();
        if (400 > httpStatusCode || httpStatusCode >= 500) {
            return httpStatusCode == 500 ? new C22760c(InterfaceC22758a.h.f89571a, null, null, null, null, null, false, false, null, null, null, null, 0L, null, null, 32766, null) : new C22760c(InterfaceC22758a.e.f89569a, null, null, null, null, null, false, false, null, null, null, null, 0L, null, null, 32766, null);
        }
        String strM65931C = m65931C(cacheResult.getErrorMessage());
        return (strM65931C == null || (c22760cM65914a = (c22760c = this.currentState).m65914a((32734 & 1) != 0 ? c22760c.currentDialogType : null, (32734 & 2) != 0 ? c22760c.response : null, (32734 & 4) != 0 ? c22760c.userInput : null, (32734 & 8) != 0 ? c22760c.validationErrors : null, (32734 & 16) != 0 ? c22760c.interactedFields : null, (32734 & 32) != 0 ? c22760c.backendErrorMessage : strM65931C, (32734 & 64) != 0 ? c22760c.manualRefresh : false, (32734 & 128) != 0 ? c22760c.displayRefreshingSpinner : false, (32734 & 256) != 0 ? c22760c.bottomSheetFieldType : null, (32734 & 512) != 0 ? c22760c.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22760c.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22760c.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? c22760c.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c22760c.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c22760c.source : null)) == null) ? new C22760c(InterfaceC22758a.e.f89569a, null, null, null, null, null, false, false, null, null, null, null, 0L, null, null, 32766, null) : c22760cM65914a;
    }

    /* JADX INFO: renamed from: C */
    private static final String m65931C(String str) {
        String str2;
        String str3;
        int iM60604j = C21567b.m60604j(2);
        List<String> listM118959K = AbstractC37056f.m118959K("ERROR_MESSAGE", ShippingAddressField.TEXT_FIELD_TYPE);
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return null;
        }
        for (String str4 : listM118959K) {
            String pattern = AbstractC2875y.m8299l(str4, "[\"\\s]*:\\s*\"([^\"]*)\"");
            EnumC39413q enumC39413q = EnumC39413q.IGNORE_CASE;
            AbstractC22676k.m65750j(pattern, "pattern");
            Pattern patternCompile = Pattern.compile(pattern, iM60604j);
            AbstractC22676k.m65749i(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(str);
            AbstractC22676k.m65749i(matcher, "matcher(...)");
            C39410n c39410nM113800b = AbstractC35849g.m113800b(matcher, 0, str);
            if (c39410nM113800b != null && (str3 = (String) AbstractC25265s.m74102I0(1, c39410nM113800b.m125843a())) != null && str3.length() > 0) {
                return str3;
            }
            String pattern2 = str4 + "[\"\\s]*:\\s*([^,}\\s]+)";
            AbstractC22676k.m65750j(pattern2, "pattern");
            Pattern patternCompile2 = Pattern.compile(pattern2, iM60604j);
            AbstractC22676k.m65749i(patternCompile2, "compile(...)");
            Matcher matcher2 = patternCompile2.matcher(str);
            AbstractC22676k.m65749i(matcher2, "matcher(...)");
            C39410n c39410nM113800b2 = AbstractC35849g.m113800b(matcher2, 0, str);
            if (c39410nM113800b2 != null && (str2 = (String) AbstractC25265s.m74102I0(1, c39410nM113800b2.m125843a())) != null && str2.length() > 0) {
                return str2;
            }
        }
        if (AbstractC39414r.m125890i0(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final InterfaceC13058l m65932D(String cartId, String source, boolean manualRefresh) {
        return new c(new C13084s1(new d(manualRefresh, cartId, this, null)), source, this, manualRefresh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final InterfaceC13058l m65933E(String cartId, Map<String, String> userInput) {
        return new f(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new PostShippingAddressRequest(cartId, m65944m(userInput)), 1), AbstractC12350b.m34570S(SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE), null, 2, null), new e(null, this.cachedApiSource)), this);
    }

    /* JADX INFO: renamed from: m */
    private final ShippingAddressRequestBody m65944m(Map<String, String> userInput) {
        String strM65945n = m65945n(userInput, "first_name");
        if (strM65945n == null) {
            strM65945n = "";
        }
        String strM65945n2 = m65945n(userInput, "last_name");
        if (strM65945n2 == null) {
            strM65945n2 = "";
        }
        String strM65945n3 = m65945n(userInput, "line1");
        if (strM65945n3 == null) {
            strM65945n3 = "";
        }
        String strM65945n4 = m65945n(userInput, "line2");
        String strM65945n5 = m65945n(userInput, "line3");
        String strM65945n6 = m65945n(userInput, "country");
        if (strM65945n6 == null) {
            strM65945n6 = "";
        }
        String strM65945n7 = m65945n(userInput, "city");
        if (strM65945n7 == null) {
            strM65945n7 = "";
        }
        String strM65945n8 = m65945n(userInput, "province");
        if (strM65945n8 == null) {
            strM65945n8 = "";
        }
        String strM65945n9 = m65945n(userInput, "state");
        String strM65945n10 = m65945n(userInput, "postal_code");
        if (strM65945n10 == null) {
            strM65945n10 = "";
        }
        String strM65945n11 = m65945n(userInput, "phone");
        return new ShippingAddressRequestBody(strM65945n, strM65945n2, strM65945n3, strM65945n4, strM65945n5, strM65945n6, strM65945n7, strM65945n8, strM65945n9, strM65945n10, strM65945n11 != null ? strM65945n11 : "", m65945n(userInput, "identification_number"), m65945n(userInput, "short_code"));
    }

    /* JADX INFO: renamed from: n */
    private static final String m65945n(Map<String, String> map, String str) {
        String strM65963a = AbstractC22764g.m65963a(map, str);
        if (!AbstractC22764g.m65964b(strM65963a)) {
            return strM65963a;
        }
        return AbstractC22764g.m65963a(map, str + "_other_input");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final Map<String, String> m65946o(ShippingAddressModels response) {
        List<ShippingAddressField> fields;
        if (response == null || (fields = response.getFields()) == null) {
            return C25272z.f99163w;
        }
        ArrayList<ShippingAddressField> arrayList = new ArrayList();
        for (Object obj : fields) {
            String prefillText = ((ShippingAddressField) obj).getPrefillText();
            if (!(prefillText == null || AbstractC39414r.m125890i0(prefillText))) {
                arrayList.add(obj);
            }
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (ShippingAddressField shippingAddressField : arrayList) {
            String lowerCase = shippingAddressField.getType().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            String prefillText2 = shippingAddressField.getPrefillText();
            if (prefillText2 == null) {
                prefillText2 = "";
            }
            linkedHashMap.put(lowerCase, prefillText2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: p */
    private final TextResource.C8688b m65947p(String displayLabel, String example) {
        return (example == null || AbstractC39414r.m125890i0(example)) ? new TextResource.C8688b(AbstractC24541a.f95788t, new TextResource.AbstractC8690d.a(displayLabel)) : new TextResource.C8688b(AbstractC24541a.f95789u, new TextResource.AbstractC8690d.a(displayLabel), new TextResource.AbstractC8690d.a(example));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final Set<String> m65948q(ShippingAddressModels shippingAddressModels) {
        List<ShippingAddressField> fields;
        if (shippingAddressModels == null || (fields = shippingAddressModels.getFields()) == null) {
            return C25235a0.f99113w;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (AbstractC22676k.m65745e(((ShippingAddressField) obj).isRequired(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((ShippingAddressField) it.next()).getType().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            arrayList2.add(lowerCase);
        }
        return AbstractC25265s.m74103I1(arrayList2);
    }

    /* JADX INFO: renamed from: r */
    private final C22760c m65949r(C22760c previousState, AbstractC22759b.a action) {
        return previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : new InterfaceC22758a.a(action.getSource()), (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : null, (32734 & 8) != 0 ? previousState.validationErrors : null, (32734 & 16) != 0 ? previousState.interactedFields : null, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : null, (32734 & 512) != 0 ? previousState.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
    }

    /* JADX INFO: renamed from: s */
    private final C22760c m65950s(C22760c previousState) {
        return previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : null, (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : null, (32734 & 8) != 0 ? previousState.validationErrors : null, (32734 & 16) != 0 ? previousState.interactedFields : null, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : null, (32734 & 512) != 0 ? previousState.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX INFO: renamed from: t */
    private final C22760c m65951t(C22760c previousState) {
        Set<String> setM65922j;
        ShippingAddressField shippingAddressField;
        String label;
        List<ShippingAddressField> fields;
        Object next;
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(previousState.m65927o());
        String bottomSheetFieldType = previousState.getBottomSheetFieldType();
        if (bottomSheetFieldType != null) {
            Set<String> setM65922j2 = previousState.m65922j();
            String lowerCase = bottomSheetFieldType.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            setM65922j = AbstractC12350b.m34555D(lowerCase, setM65922j2);
        } else {
            setM65922j = previousState.m65922j();
        }
        Set<String> set = setM65922j;
        if (bottomSheetFieldType != null) {
            String lowerCase2 = bottomSheetFieldType.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            boolean zContains = previousState.m65923k().contains(lowerCase2);
            String strM65963a = AbstractC22764g.m65963a(previousState.m65926n(), bottomSheetFieldType);
            if (zContains && (strM65963a == null || AbstractC39414r.m125890i0(strM65963a))) {
                ShippingAddressModels response = previousState.getResponse();
                if (response == null || (fields = response.getFields()) == null) {
                    shippingAddressField = null;
                } else {
                    Iterator<T> it = fields.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC39421y.m125921F(((ShippingAddressField) next).getType(), bottomSheetFieldType, true));
                    shippingAddressField = (ShippingAddressField) next;
                }
                if (shippingAddressField != null && (label = shippingAddressField.getLabel()) != null) {
                    bottomSheetFieldType = label;
                }
                linkedHashMapM74003l0.put(lowerCase2, m65947p(bottomSheetFieldType, shippingAddressField != null ? shippingAddressField.getExample() : null));
            }
        }
        return previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : null, (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : null, (32734 & 8) != 0 ? previousState.validationErrors : linkedHashMapM74003l0, (32734 & 16) != 0 ? previousState.interactedFields : set, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : null, (32734 & 512) != 0 ? previousState.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
    }

    /* JADX INFO: renamed from: u */
    private final C22760c m65952u(C22760c previousState) {
        return previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : null, (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : null, (32734 & 8) != 0 ? previousState.validationErrors : null, (32734 & 16) != 0 ? previousState.interactedFields : null, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : null, (32734 & 512) != 0 ? previousState.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final C22760c m65953v(C22760c previousState, AbstractC22759b action) {
        if (action instanceof AbstractC22759b.e) {
            return previousState;
        }
        if (action instanceof AbstractC22759b.i) {
            return m65956y(previousState, (AbstractC22759b.i) action);
        }
        if (action instanceof AbstractC22759b.j) {
            return m65957z(previousState, (AbstractC22759b.j) action);
        }
        if (action instanceof AbstractC22759b.g) {
            return m65929A(previousState, (AbstractC22759b.g) action);
        }
        if (action instanceof AbstractC22759b.c) {
            return m65951t(previousState);
        }
        if (action instanceof AbstractC22759b.f) {
            return m65954w(previousState, (AbstractC22759b.f) action);
        }
        if (action instanceof AbstractC22759b.a) {
            return m65949r(previousState, (AbstractC22759b.a) action);
        }
        if (action instanceof AbstractC22759b.b) {
            return m65950s(previousState);
        }
        return action instanceof AbstractC22759b.d ? m65952u(previousState) : previousState;
    }

    /* JADX INFO: renamed from: w */
    private final C22760c m65954w(C22760c previousState, AbstractC22759b.f action) {
        List<ShippingAddressField> fields;
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(previousState.m65926n());
        String lowerCase = action.getFieldType().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        linkedHashMapM74003l0.put(lowerCase, action.getValue());
        if (AbstractC22764g.m65964b(AbstractC22764g.m65963a(previousState.m65926n(), lowerCase)) && !AbstractC22764g.m65964b(action.getValue())) {
            linkedHashMapM74003l0.remove(lowerCase.concat("_other_input"));
        }
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(lowerCase, previousState.m65922j());
        LinkedHashMap linkedHashMapM74003l1 = AbstractC25247g0.m74003l0(previousState.m65927o());
        linkedHashMapM74003l1.remove(lowerCase);
        ShippingAddressModels response = previousState.getResponse();
        if (response != null && (fields = response.getFields()) != null) {
            for (ShippingAddressField shippingAddressField : fields) {
                DropdownLookup dropdownLookup = shippingAddressField.getDropdownLookup();
                if (dropdownLookup != null && AbstractC39421y.m125921F(dropdownLookup.getDropdownKey(), action.getFieldType(), true) && !AbstractC39421y.m125921F(shippingAddressField.getType(), action.getFieldType(), true)) {
                    String lowerCase2 = shippingAddressField.getType().toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                    linkedHashMapM74003l0.remove(lowerCase2);
                    linkedHashMapM74003l0.remove(lowerCase2.concat("_other_input"));
                }
            }
        }
        return previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : null, (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : linkedHashMapM74003l0, (32734 & 8) != 0 ? previousState.validationErrors : linkedHashMapM74003l1, (32734 & 16) != 0 ? previousState.interactedFields : linkedHashSetM34555D, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : null, (32734 & 512) != 0 ? previousState.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : action.getValue(), (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final C22760c m65955x(InterfaceC29354a.c<ShippingAddressModels> cacheResult, String source) {
        return AbstractC29355b.m89462a(cacheResult) ? new C22760c(InterfaceC22758a.g.f89570a, null, null, null, null, null, false, false, null, null, null, null, 0L, null, source, 16382, null) : new C22760c(InterfaceC22758a.e.f89569a, null, null, null, null, null, false, false, null, null, null, null, 0L, null, source, 16382, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    private final C22760c m65956y(C22760c previousState, AbstractC22759b.i action) {
        List<ShippingAddressField> fields;
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(previousState.m65926n());
        if (action.getMaxLength() == null || action.getValue().length() <= action.getMaxLength().intValue()) {
            String lowerCase = action.getFieldType().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            linkedHashMapM74003l0.put(lowerCase, action.getValue());
        }
        Set<String> setM65922j = previousState.m65922j();
        String lowerCase2 = action.getFieldType().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(lowerCase2, setM65922j);
        ShippingAddressModels response = previousState.getResponse();
        Object obj = null;
        if (response != null && (fields = response.getFields()) != null) {
            for (Object obj2 : fields) {
                if (AbstractC39421y.m125921F(((ShippingAddressField) obj2).getType(), action.getFieldType(), true)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (ShippingAddressField) obj;
        }
        ShippingAddressField shippingAddressField = obj;
        C22760c c22760cM65914a = previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : null, (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : linkedHashMapM74003l0, (32734 & 8) != 0 ? previousState.validationErrors : null, (32734 & 16) != 0 ? previousState.interactedFields : linkedHashSetM34555D, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : null, (32734 & 512) != 0 ? previousState.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
        if (shippingAddressField != 0 && (shippingAddressField.getPattern() != null || shippingAddressField.getMinLength() != null)) {
            String lowerCase3 = action.getFieldType().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
            if (linkedHashSetM34555D.contains(lowerCase3)) {
                return m65957z(c22760cM65914a, new AbstractC22759b.j(action.getFieldType(), action.getValue(), shippingAddressField.getPattern(), shippingAddressField.getLabel(), shippingAddressField.getMinLength(), shippingAddressField.getExample()));
            }
        }
        return c22760cM65914a;
    }

    /* JADX INFO: renamed from: z */
    private final C22760c m65957z(C22760c previousState, AbstractC22759b.j action) {
        C39412p c39412p;
        List<ShippingAddressField> fields;
        Object next;
        List<ShippingAddressField> fields2;
        Object next2;
        String lowerCase = action.getFieldType().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(lowerCase, previousState.m65922j());
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(previousState.m65927o());
        if (action.getMinLength() != null && action.getValue().length() < action.getMinLength().intValue()) {
            linkedHashMapM74003l0.put(lowerCase, new TextResource.C8688b(AbstractC24541a.f95792x, new TextResource.AbstractC8690d.a(action.getDisplayLabel()), new TextResource.AbstractC8690d.a(String.valueOf(action.getMinLength().intValue()))));
            return previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : null, (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : null, (32734 & 8) != 0 ? previousState.validationErrors : linkedHashMapM74003l0, (32734 & 16) != 0 ? previousState.interactedFields : linkedHashSetM34555D, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : null, (32734 & 512) != 0 ? previousState.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
        }
        String example = null;
        if (previousState.m65923k().contains(lowerCase) && AbstractC39414r.m125890i0(action.getValue())) {
            String example2 = action.getExample();
            if (example2 == null) {
                ShippingAddressModels response = previousState.getResponse();
                if (response != null && (fields2 = response.getFields()) != null) {
                    Iterator<T> it = fields2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!AbstractC39421y.m125921F(((ShippingAddressField) next2).getType(), action.getFieldType(), true));
                    ShippingAddressField shippingAddressField = (ShippingAddressField) next2;
                    if (shippingAddressField != null) {
                        example = shippingAddressField.getExample();
                    }
                }
            } else {
                example = example2;
            }
            linkedHashMapM74003l0.put(lowerCase, m65947p(action.getDisplayLabel(), example));
            return previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : null, (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : null, (32734 & 8) != 0 ? previousState.validationErrors : linkedHashMapM74003l0, (32734 & 16) != 0 ? previousState.interactedFields : linkedHashSetM34555D, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : null, (32734 & 512) != 0 ? previousState.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
        }
        if (action.getPattern() != null) {
            try {
                c39412p = new C39412p(action.getPattern());
            } catch (Exception unused) {
                c39412p = null;
            }
            if (c39412p == null || c39412p.m125851e(action.getValue())) {
                linkedHashMapM74003l0.remove(lowerCase);
            } else {
                String example3 = action.getExample();
                if (example3 == null) {
                    ShippingAddressModels response2 = previousState.getResponse();
                    if (response2 != null && (fields = response2.getFields()) != null) {
                        Iterator<T> it3 = fields.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!AbstractC39421y.m125921F(((ShippingAddressField) next).getType(), action.getFieldType(), true));
                        ShippingAddressField shippingAddressField2 = (ShippingAddressField) next;
                        if (shippingAddressField2 != null) {
                            example = shippingAddressField2.getExample();
                        }
                    }
                } else {
                    example = example3;
                }
                linkedHashMapM74003l0.put(lowerCase, m65947p(action.getDisplayLabel(), example));
            }
        } else {
            linkedHashMapM74003l0.remove(lowerCase);
        }
        return previousState.m65914a((32734 & 1) != 0 ? previousState.currentDialogType : null, (32734 & 2) != 0 ? previousState.response : null, (32734 & 4) != 0 ? previousState.userInput : null, (32734 & 8) != 0 ? previousState.validationErrors : linkedHashMapM74003l0, (32734 & 16) != 0 ? previousState.interactedFields : linkedHashSetM34555D, (32734 & 32) != 0 ? previousState.backendErrorMessage : null, (32734 & 64) != 0 ? previousState.manualRefresh : false, (32734 & 128) != 0 ? previousState.displayRefreshingSpinner : false, (32734 & 256) != 0 ? previousState.bottomSheetFieldType : null, (32734 & 512) != 0 ? previousState.bottomSheetTitle : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? previousState.bottomSheetOptions : null, (32734 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? previousState.bottomSheetSelectedValue : null, (32734 & 4096) != 0 ? previousState.bottomSheetOpenTimestamp : 0L, (32734 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? previousState.requiredFields : null, (32734 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? previousState.source : null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C22760c(null, null, null, null, null, null, false, false, null, null, null, null, 0L, null, null, 32767, null), AbstractC13091v.m36579E(AbstractC13095w0.f45249a, new a(null), upstream), new b(null));
    }
}
