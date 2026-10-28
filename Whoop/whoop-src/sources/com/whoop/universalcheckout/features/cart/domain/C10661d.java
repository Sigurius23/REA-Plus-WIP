package com.whoop.universalcheckout.features.cart.domain;

import ao2.C1876a;
import bm.C3383g;
import com.whoop.universalcheckout.features.cart.domain.models.AddCartItemRequest;
import com.whoop.universalcheckout.features.cart.domain.models.AddPackToCartRequest;
import com.whoop.universalcheckout.features.cart.domain.models.AddWhoopYourWayToCartRequest;
import com.whoop.universalcheckout.features.cart.domain.models.CartErrorResponse;
import com.whoop.universalcheckout.features.cart.domain.models.CartResponse;
import com.whoop.universalcheckout.features.cart.domain.models.UpdateCartQuantityRequest;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import w02.C36684a;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b \u0010!J2\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\"\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b#\u0010$J2\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b%\u0010&J@\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010'\u001a\u00020\u00172\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170(2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b*\u0010+J2\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\"\u001a\u00020,2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b-\u0010.J,\u00102\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010/\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b2\u00103J \u00104\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b4\u00105J#\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000206H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/d;", "Lod1/g;", "Lcom/whoop/universalcheckout/features/cart/domain/a;", "Lcom/whoop/universalcheckout/features/cart/domain/c;", "Lcom/whoop/universalcheckout/features/cart/domain/CartApi;", "api", "Lao2/a;", "cartIndicatorRepository", "Lw02/a;", "errorBodyParser", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "<init>", "(Lcom/whoop/universalcheckout/features/cart/domain/CartApi;Lao2/a;Lw02/a;Ltr2/n;Lrr2/c;)V", "state", "Lcom/whoop/universalcheckout/features/cart/domain/e$a;", "action", "l", "(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$a;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "addIntent", "", "sku", "cartId", "storeDomain", "Lu02/a;", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;", "m", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/universalcheckout/features/cart/domain/e$d;", "n", "(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e$d;Lq83/d;)Ljava/lang/Object;", "intent", "g", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "packSku", "", "childItemSkus", "i", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;", "j", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "lineItemId", "", "quantity", "o", "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "k", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/universalcheckout/features/cart/domain/CartApi;", "b", "Lao2/a;", "c", "Lw02/a;", "d", "Ltr2/n;", "e", "Lrr2/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10661d implements InterfaceC27844g<AbstractC10658a, C10660c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CartApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C1876a cartIndicatorRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C36684a errorBodyParser;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor$addItem$2", m100430f = "CartInteractor.kt", m100431l = {137}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f32478E;

        /* JADX INFO: renamed from: w */
        int f32479w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f32481y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f32482z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f32481y = str;
            this.f32482z = str2;
            this.f32478E = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10661d.this.new a(this.f32481y, this.f32482z, this.f32478E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32479w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CartApi cartApi = C10661d.this.api;
            String str = this.f32481y;
            String str2 = this.f32482z;
            String str3 = this.f32478E;
            if (str3 == null) {
                str3 = "SHOP";
            }
            AddCartItemRequest addCartItemRequest = new AddCartItemRequest(str, str2, str3);
            this.f32479w = 1;
            Object objAddItem = cartApi.addItem(addCartItemRequest, this);
            return objAddItem == enumC31071a ? enumC31071a : objAddItem;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CartResponse> interfaceC30057d) {
            return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor$addPack$2", m100430f = "CartInteractor.kt", m100431l = {150}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List<String> f32483E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f32484F;

        /* JADX INFO: renamed from: w */
        int f32485w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f32487y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f32488z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, List<String> list, String str3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f32487y = str;
            this.f32488z = str2;
            this.f32483E = list;
            this.f32484F = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10661d.this.new b(this.f32487y, this.f32488z, this.f32483E, this.f32484F, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32485w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CartApi cartApi = C10661d.this.api;
            String str = this.f32487y;
            String str2 = this.f32488z;
            List<String> list = this.f32483E;
            String str3 = this.f32484F;
            if (str3 == null) {
                str3 = "SHOP";
            }
            AddPackToCartRequest addPackToCartRequest = new AddPackToCartRequest(str, str2, list, str3);
            this.f32485w = 1;
            Object objAddPack = cartApi.addPack(addPackToCartRequest, this);
            return objAddPack == enumC31071a ? enumC31071a : objAddPack;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CartResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor$addWyw$2", m100430f = "CartInteractor.kt", m100431l = {169}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f32489E;

        /* JADX INFO: renamed from: w */
        int f32490w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f32492y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ CartAddIntent.Wyw f32493z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, CartAddIntent.Wyw wyw, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f32492y = str;
            this.f32493z = wyw;
            this.f32489E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10661d.this.new c(this.f32492y, this.f32493z, this.f32489E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32490w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CartApi cartApi = C10661d.this.api;
            String str = this.f32492y;
            String wywSku = this.f32493z.getWywSku();
            String bandSku = this.f32493z.getBandSku();
            String claspSku = this.f32493z.getClaspSku();
            String hookSku = this.f32493z.getHookSku();
            String fastLinkSku = this.f32493z.getFastLinkSku();
            String str2 = this.f32489E;
            if (str2 == null) {
                str2 = "SHOP";
            }
            AddWhoopYourWayToCartRequest addWhoopYourWayToCartRequest = new AddWhoopYourWayToCartRequest(str, wywSku, bandSku, claspSku, hookSku, fastLinkSku, str2);
            this.f32490w = 1;
            Object objAddWyw = cartApi.addWyw(addWhoopYourWayToCartRequest, this);
            return objAddWyw == enumC31071a ? enumC31071a : objAddWyw;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CartResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor$getCart$2", m100430f = "CartInteractor.kt", m100431l = {195}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f32494w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f32496y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f32496y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10661d.this.new d(this.f32496y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32494w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CartApi cartApi = C10661d.this.api;
            String str = this.f32496y;
            this.f32494w = 1;
            Object cart = cartApi.getCart(str, this);
            return cart == enumC31071a ? enumC31071a : cart;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CartResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CartInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f32497w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f32498x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f32499y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC10658a abstractC10658a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f32498x = interfaceC13062m;
            eVar.f32499y = abstractC10658a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C3383g c3383g;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32497w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f32498x;
                AbstractC10658a abstractC10658a = (AbstractC10658a) this.f32499y;
                if (abstractC10658a instanceof AbstractC10658a.a) {
                    AbstractC10658a.a aVar = (AbstractC10658a.a) abstractC10658a;
                    c3383g = new C3383g(new AbstractC10662e[]{AbstractC10662e.b.f32536a, new AbstractC10662e.a(aVar.getCartId(), aVar.getSku(), aVar.getStoreDomain(), aVar.getAddIntent())}, 3);
                } else if (abstractC10658a instanceof AbstractC10658a.c) {
                    AbstractC10658a.c cVar = (AbstractC10658a.c) abstractC10658a;
                    c3383g = new C3383g(new AbstractC10662e[]{AbstractC10662e.c.f32537a, new AbstractC10662e.d(cVar.getLineItemId(), cVar.getQuantity())}, 3);
                } else {
                    if (!(abstractC10658a instanceof AbstractC10658a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c3383g = new C3383g(new AbstractC10662e[]{AbstractC10662e.c.f32537a, new AbstractC10662e.d(((AbstractC10658a.b) abstractC10658a).getLineItemId(), 0)}, 3);
                }
                this.f32498x = null;
                this.f32499y = null;
                this.f32497w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c3383g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC10658a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor$interact$2", m100430f = "CartInteractor.kt", m100431l = {55, 56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/domain/c;", "state", "Lcom/whoop/universalcheckout/features/cart/domain/e;", "action", "<anonymous>", "(Lcom/whoop/universalcheckout/features/cart/domain/c;Lcom/whoop/universalcheckout/features/cart/domain/e;)Lcom/whoop/universalcheckout/features/cart/domain/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f32500w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f32501x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f32502y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C10660c c10660c, AbstractC10662e abstractC10662e, InterfaceC30057d<? super C10660c> interfaceC30057d) {
            f fVar = C10661d.this.new f(interfaceC30057d);
            fVar.f32501x = c10660c;
            fVar.f32502y = abstractC10662e;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (r9 == r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        
            if (r9 == r2) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f32501x
                r1 = r0
                com.whoop.universalcheckout.features.cart.domain.c r1 = (com.whoop.universalcheckout.features.cart.domain.C10660c) r1
                java.lang.Object r0 = r8.f32502y
                com.whoop.universalcheckout.features.cart.domain.e r0 = (com.whoop.universalcheckout.features.cart.domain.AbstractC10662e) r0
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r8.f32500w
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L25
                if (r3 == r5) goto L21
                if (r3 != r4) goto L19
                p505ts.AbstractC34132o.m107864I(r9)
                goto L7f
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L67
            L25:
                p505ts.AbstractC34132o.m107864I(r9)
                com.whoop.universalcheckout.features.cart.domain.e$b r9 = com.whoop.universalcheckout.features.cart.domain.AbstractC10662e.b.f32536a
                boolean r9 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r0, r9)
                if (r9 == 0) goto L3d
                com.whoop.universalcheckout.features.cart.domain.b$c r2 = com.whoop.universalcheckout.features.cart.domain.AbstractC10659b.c.f32468a
                r6 = 14
                r7 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                com.whoop.universalcheckout.features.cart.domain.c r9 = com.whoop.universalcheckout.features.cart.domain.C10660c.m27620b(r1, r2, r3, r4, r5, r6, r7)
                return r9
            L3d:
                com.whoop.universalcheckout.features.cart.domain.e$c r9 = com.whoop.universalcheckout.features.cart.domain.AbstractC10662e.c.f32537a
                boolean r9 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r0, r9)
                if (r9 == 0) goto L51
                r6 = 13
                r7 = 0
                r2 = 0
                r3 = 1
                r4 = 0
                r5 = 0
                com.whoop.universalcheckout.features.cart.domain.c r9 = com.whoop.universalcheckout.features.cart.domain.C10660c.m27620b(r1, r2, r3, r4, r5, r6, r7)
                return r9
            L51:
                boolean r9 = r0 instanceof com.whoop.universalcheckout.features.cart.domain.AbstractC10662e.a
                r3 = 0
                if (r9 == 0) goto L6a
                com.whoop.universalcheckout.features.cart.domain.d r9 = com.whoop.universalcheckout.features.cart.domain.C10661d.this
                com.whoop.universalcheckout.features.cart.domain.e$a r0 = (com.whoop.universalcheckout.features.cart.domain.AbstractC10662e.a) r0
                r8.f32501x = r3
                r8.f32502y = r3
                r8.f32500w = r5
                java.lang.Object r9 = com.whoop.universalcheckout.features.cart.domain.C10661d.m27627d(r9, r1, r0, r8)
                if (r9 != r2) goto L67
                goto L7e
            L67:
                com.whoop.universalcheckout.features.cart.domain.c r9 = (com.whoop.universalcheckout.features.cart.domain.C10660c) r9
                return r9
            L6a:
                boolean r9 = r0 instanceof com.whoop.universalcheckout.features.cart.domain.AbstractC10662e.d
                if (r9 == 0) goto L82
                com.whoop.universalcheckout.features.cart.domain.d r9 = com.whoop.universalcheckout.features.cart.domain.C10661d.this
                com.whoop.universalcheckout.features.cart.domain.e$d r0 = (com.whoop.universalcheckout.features.cart.domain.AbstractC10662e.d) r0
                r8.f32501x = r3
                r8.f32502y = r3
                r8.f32500w = r4
                java.lang.Object r9 = com.whoop.universalcheckout.features.cart.domain.C10661d.m27628e(r9, r1, r0, r8)
                if (r9 != r2) goto L7f
            L7e:
                return r2
            L7f:
                com.whoop.universalcheckout.features.cart.domain.c r9 = (com.whoop.universalcheckout.features.cart.domain.C10660c) r9
                return r9
            L82:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.universalcheckout.features.cart.domain.C10661d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor", m100430f = "CartInteractor.kt", m100431l = {64, 79}, m100432m = "loadAndReduce", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f32504E;

        /* JADX INFO: renamed from: F */
        Object f32505F;

        /* JADX INFO: renamed from: G */
        Object f32506G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f32507H;

        /* JADX INFO: renamed from: J */
        int f32509J;

        /* JADX INFO: renamed from: w */
        Object f32510w;

        /* JADX INFO: renamed from: x */
        Object f32511x;

        /* JADX INFO: renamed from: y */
        Object f32512y;

        /* JADX INFO: renamed from: z */
        Object f32513z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32507H = obj;
            this.f32509J |= Integer.MIN_VALUE;
            return C10661d.this.m27635l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor", m100430f = "CartInteractor.kt", m100431l = {95, 105}, m100432m = "updateAndReduce", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f32514E;

        /* JADX INFO: renamed from: G */
        int f32516G;

        /* JADX INFO: renamed from: w */
        Object f32517w;

        /* JADX INFO: renamed from: x */
        Object f32518x;

        /* JADX INFO: renamed from: y */
        Object f32519y;

        /* JADX INFO: renamed from: z */
        Object f32520z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32514E = obj;
            this.f32516G |= Integer.MIN_VALUE;
            return C10661d.this.m27637n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor", m100430f = "CartInteractor.kt", m100431l = {182}, m100432m = "updateQuantity", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f32522F;

        /* JADX INFO: renamed from: w */
        Object f32523w;

        /* JADX INFO: renamed from: x */
        Object f32524x;

        /* JADX INFO: renamed from: y */
        int f32525y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f32526z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32526z = obj;
            this.f32522F |= Integer.MIN_VALUE;
            return C10661d.this.m27638o(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.domain.d$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor$updateQuantity$2", m100430f = "CartInteractor.kt", m100431l = {187}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f32527E;

        /* JADX INFO: renamed from: w */
        int f32528w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f32530y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f32531z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, int i13, InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f32530y = str;
            this.f32531z = str2;
            this.f32527E = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10661d.this.new j(this.f32530y, this.f32531z, this.f32527E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32528w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CartApi cartApi = C10661d.this.api;
            UpdateCartQuantityRequest updateCartQuantityRequest = new UpdateCartQuantityRequest(this.f32530y, this.f32531z, this.f32527E);
            this.f32528w = 1;
            Object objUpdateQuantity = cartApi.updateQuantity(updateCartQuantityRequest, this);
            return objUpdateQuantity == enumC31071a ? enumC31071a : objUpdateQuantity;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CartResponse> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C10661d(CartApi api, C1876a cartIndicatorRepository, C36684a errorBodyParser, InterfaceC34116n logger, InterfaceC31766c interfaceC31766c) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(cartIndicatorRepository, "cartIndicatorRepository");
        AbstractC22676k.m65750j(errorBodyParser, "errorBodyParser");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.cartIndicatorRepository = cartIndicatorRepository;
        this.errorBodyParser = errorBodyParser;
        this.logger = logger;
        this.crashReporter = interfaceC31766c;
    }

    /* JADX INFO: renamed from: g */
    private final Object m27630g(CartAddIntent cartAddIntent, String str, String str2, InterfaceC30057d<? super InterfaceC34385a<CartResponse>> interfaceC30057d) {
        if (cartAddIntent instanceof CartAddIntent.Standalone) {
            return m27631h(((CartAddIntent.Standalone) cartAddIntent).getSku(), str, str2, interfaceC30057d);
        }
        if (cartAddIntent instanceof CartAddIntent.Pack) {
            CartAddIntent.Pack pack = (CartAddIntent.Pack) cartAddIntent;
            return m27632i(pack.getPackSku(), pack.getChildItemSkus(), str, str2, interfaceC30057d);
        }
        if (cartAddIntent instanceof CartAddIntent.Wyw) {
            return m27633j((CartAddIntent.Wyw) cartAddIntent, str, str2, interfaceC30057d);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    private final Object m27631h(String str, String str2, String str3, InterfaceC30057d<? super InterfaceC34385a<CartResponse>> interfaceC30057d) {
        return InterfaceC34385a.INSTANCE.m108730a(this.logger, this.crashReporter, AbstractC25012a.m73376i(str3 == null ? "SHOP" : str3, ")", AbstractC11895b.m32001t("cart addItem failed (sku=", str, ", cartId=", str2, ", storeDomain=")), new a(str, str2, str3, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    private final Object m27632i(String str, List<String> list, String str2, String str3, InterfaceC30057d<? super InterfaceC34385a<CartResponse>> interfaceC30057d) {
        return InterfaceC34385a.INSTANCE.m108730a(this.logger, this.crashReporter, AbstractC25012a.m73376i(str3 == null ? "SHOP" : str3, ")", AbstractC11895b.m32001t("cart addPack failed (packSku=", str, ", cartId=", str2, ", storeDomain=")), new b(str2, str, list, str3, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: j */
    private final Object m27633j(CartAddIntent.Wyw wyw, String str, String str2, InterfaceC30057d<? super InterfaceC34385a<CartResponse>> interfaceC30057d) {
        return InterfaceC34385a.INSTANCE.m108730a(this.logger, this.crashReporter, AbstractC25012a.m73376i(str2 == null ? "SHOP" : str2, ")", AbstractC11895b.m32001t("cart addWyw failed (wywSku=", wyw.getWywSku(), ", cartId=", str, ", storeDomain=")), new c(str, wyw, str2, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: k */
    private final Object m27634k(String str, InterfaceC30057d<? super InterfaceC34385a<CartResponse>> interfaceC30057d) {
        return InterfaceC34385a.INSTANCE.m108730a(this.logger, this.crashReporter, AbstractC11895b.m31996o("cart getCart failed (cartId=", str, ")"), new d(str, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: l */
    public final Object m27635l(C10660c c10660c, AbstractC10662e.a aVar, InterfaceC30057d<? super C10660c> interfaceC30057d) {
        g gVar;
        String str;
        String str2;
        C10660c c10660c2;
        C10660c c10660c3;
        AbstractC10659b.a.EnumC41432a enumC41432a;
        String str3;
        String str4;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f32509J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f32509J = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objM27636m = gVar2.f32507H;
        Object obj = EnumC31071a.f128113w;
        int i14 = gVar2.f32509J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM27636m);
            String cartId = aVar.getCartId();
            if (cartId == null) {
                cartId = c10660c.getCartId();
            }
            String storeDomain = aVar.getStoreDomain();
            if (storeDomain == null) {
                storeDomain = c10660c.getStoreDomain();
            }
            String str5 = storeDomain;
            CartAddIntent addIntent = aVar.getAddIntent();
            String sku = aVar.getSku();
            gVar2.f32510w = c10660c;
            gVar2.f32511x = null;
            gVar2.f32512y = cartId;
            gVar2.f32513z = str5;
            gVar2.f32509J = 1;
            str = cartId;
            objM27636m = m27636m(addIntent, sku, str, str5, gVar2);
            if (objM27636m != obj) {
                str2 = str5;
                c10660c2 = c10660c;
            }
            return obj;
        }
        if (i14 == 1) {
            str2 = (String) gVar2.f32513z;
            str = (String) gVar2.f32512y;
            c10660c2 = (C10660c) gVar2.f32510w;
            AbstractC34132o.m107864I(objM27636m);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC10659b.a.EnumC41432a enumC41432a2 = (AbstractC10659b.a.EnumC41432a) gVar2.f32506G;
            C10660c c10660c4 = (C10660c) gVar2.f32505F;
            String str6 = (String) gVar2.f32513z;
            String str7 = (String) gVar2.f32512y;
            AbstractC34132o.m107864I(objM27636m);
            c10660c3 = c10660c4;
            str3 = str6;
            str4 = str7;
            enumC41432a = enumC41432a2;
        }
        CartErrorResponse cartErrorResponse = (CartErrorResponse) objM27636m;
        return C10660c.m27620b(c10660c3, new AbstractC10659b.a(null, enumC41432a, cartErrorResponse != null ? cartErrorResponse.getSubtitle() : null, 1, null), false, str4, str3, 2, null);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM27636m;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            CartResponse cartResponse = (CartResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
            String cartId2 = cartResponse.getCartId();
            if (cartId2 != null) {
                str = cartId2;
            }
            this.cartIndicatorRepository.m5653i(str);
            return c10660c2.m27621a(new AbstractC10659b.b(cartResponse), false, str, str2);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC10659b.a.EnumC41432a enumC41432a3 = AbstractC10659b.a.EnumC41432a.Load;
        C36684a c36684a = this.errorBodyParser;
        Exception exception = ((InterfaceC34385a.b) interfaceC34385a).getException();
        InterfaceC37138c interfaceC37138cSerializer = CartErrorResponse.INSTANCE.serializer();
        gVar2.f32510w = null;
        gVar2.f32511x = null;
        gVar2.f32512y = str;
        gVar2.f32513z = str2;
        gVar2.f32504E = null;
        gVar2.f32505F = c10660c2;
        gVar2.f32506G = enumC41432a3;
        gVar2.f32509J = 2;
        objM27636m = c36684a.m117757a(exception, interfaceC37138cSerializer, gVar2);
        if (objM27636m != obj) {
            c10660c3 = c10660c2;
            enumC41432a = enumC41432a3;
            str3 = str2;
            str4 = str;
            CartErrorResponse cartErrorResponse2 = (CartErrorResponse) objM27636m;
            return C10660c.m27620b(c10660c3, new AbstractC10659b.a(null, enumC41432a, cartErrorResponse2 != null ? cartErrorResponse2.getSubtitle() : null, 1, null), false, str4, str3, 2, null);
        }
        return obj;
    }

    /* JADX INFO: renamed from: m */
    private final Object m27636m(CartAddIntent cartAddIntent, String str, String str2, String str3, InterfaceC30057d<? super InterfaceC34385a<CartResponse>> interfaceC30057d) {
        if (cartAddIntent != null) {
            return m27630g(cartAddIntent, str2, str3, interfaceC30057d);
        }
        return str != null ? m27631h(str, str2, str3, interfaceC30057d) : m27634k(str2, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: n */
    public final Object m27637n(C10660c c10660c, AbstractC10662e.d dVar, InterfaceC30057d<? super C10660c> interfaceC30057d) throws Exception {
        h hVar;
        C10660c c10660c2;
        String str;
        C10660c c10660c3;
        CartResponse cartResponse;
        String cartId;
        String str2;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f32516G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f32516G = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM27634k = hVar.f32514E;
        Object obj = EnumC31071a.f128113w;
        int i14 = hVar.f32516G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM27634k);
            String cartId2 = c10660c.getCartId();
            String lineItemId = dVar.getLineItemId();
            int quantity = dVar.getQuantity();
            hVar.f32517w = c10660c;
            hVar.f32518x = null;
            hVar.f32519y = cartId2;
            hVar.f32516G = 1;
            Object objM27638o = m27638o(cartId2, lineItemId, quantity, hVar);
            if (objM27638o != obj) {
                c10660c2 = c10660c;
                str = cartId2;
                objM27634k = objM27638o;
            }
            return obj;
        }
        if (i14 == 1) {
            str = (String) hVar.f32519y;
            C10660c c10660c4 = (C10660c) hVar.f32517w;
            AbstractC34132o.m107864I(objM27634k);
            c10660c2 = c10660c4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) hVar.f32519y;
            c10660c3 = (C10660c) hVar.f32517w;
            AbstractC34132o.m107864I(objM27634k);
        }
        cartResponse = (CartResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM27634k);
        if (cartResponse != null) {
            return C10660c.m27620b(c10660c3, new AbstractC10659b.a(null, AbstractC10659b.a.EnumC41432a.Mutation, null, 5, null), false, null, null, 12, null);
        }
        AbstractC10659b.a aVar = new AbstractC10659b.a(cartResponse, AbstractC10659b.a.EnumC41432a.Mutation, null, 4, null);
        cartId = cartResponse.getCartId();
        if (cartId == null) {
            str2 = str;
        } else {
            str2 = cartId;
        }
        return C10660c.m27620b(c10660c3, aVar, false, str2, null, 8, null);
        CartResponse cartResponse2 = (CartResponse) objM27634k;
        if (cartResponse2 != null) {
            String cartId3 = cartResponse2.getCartId();
            String str3 = cartId3 == null ? str : cartId3;
            this.cartIndicatorRepository.m5653i(str3);
            return C10660c.m27620b(c10660c2, new AbstractC10659b.b(cartResponse2), false, str3, null, 8, null);
        }
        hVar.f32517w = c10660c2;
        hVar.f32518x = null;
        hVar.f32519y = str;
        hVar.f32520z = null;
        hVar.f32516G = 2;
        objM27634k = m27634k(str, hVar);
        if (objM27634k != obj) {
            c10660c3 = c10660c2;
            cartResponse = (CartResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM27634k);
            if (cartResponse != null) {
                return C10660c.m27620b(c10660c3, new AbstractC10659b.a(null, AbstractC10659b.a.EnumC41432a.Mutation, null, 5, null), false, null, null, 12, null);
            }
            AbstractC10659b.a aVar2 = new AbstractC10659b.a(cartResponse, AbstractC10659b.a.EnumC41432a.Mutation, null, 4, null);
            cartId = cartResponse.getCartId();
            if (cartId == null) {
                str2 = str;
            } else {
                str2 = cartId;
            }
            return C10660c.m27620b(c10660c3, aVar2, false, str2, null, 8, null);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: o */
    public final Object m27638o(String str, String str2, int i13, InterfaceC30057d<? super CartResponse> interfaceC30057d) throws Exception {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i14 = iVar.f32522F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f32522F = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM108730a = iVar2.f32526z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = iVar2.f32522F;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM108730a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            InterfaceC31766c interfaceC31766c = this.crashReporter;
            String strM73376i = AbstractC25012a.m73376i(str, ")", AbstractC11266d.m30467u(i13, "cart updateQuantity failed (lineItemId=", str2, ", quantity=", ", cartId="));
            j jVar = new j(str, str2, i13, null);
            iVar2.f32523w = null;
            iVar2.f32524x = null;
            iVar2.f32525y = i13;
            iVar2.f32522F = 1;
            objM108730a = companion.m108730a(interfaceC34116n, interfaceC31766c, strM73376i, jVar, iVar2);
            if (objM108730a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108730a);
        }
        return AbstractC34386b.m108737b((InterfaceC34385a) objM108730a);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new C10660c(null, false, null, null, 15, null), AbstractC13091v.m36590P(upstream, new e(null)), new f(null)), 1);
    }

    public /* synthetic */ C10661d(CartApi cartApi, C1876a c1876a, C36684a c36684a, InterfaceC34116n interfaceC34116n, InterfaceC31766c interfaceC31766c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(cartApi, c1876a, c36684a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CartInteractor") : interfaceC34116n, (i13 & 16) != 0 ? null : interfaceC31766c);
    }
}
