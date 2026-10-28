package i32;

import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.payments.stripebottomsheettile.model.PaymentMethodMenuTileModel;
import com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel;
import com.whoop.payments.stripepaymentsheettileminiarch.domain.MiniArchStripePaymentSheetTileApi;
import com.whoop.payments.stripepaymentsheettileminiarch.model.StripePaymentSheetTileUpdateResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: i32.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Li32/c;", "Lod1/g;", "Li32/a;", "Li32/b;", "Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;Ltr2/n;)V", "", "path", "screenName", "Lec3/l;", "Li32/c$a;", "g", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "updatePath", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/payments/stripepaymentsheettileminiarch/domain/MiniArchStripePaymentSheetTileApi;", "b", "Ltr2/n;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18056c implements InterfaceC27844g<AbstractC18054a, C18055b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MiniArchStripePaymentSheetTileApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: i32.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Li32/c$a;", "", "<init>", "()V", "d", "e", "a", "c", "b", "Li32/c$a$a;", "Li32/c$a$b;", "Li32/c$a$c;", "Li32/c$a$d;", "Li32/c$a$e;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: i32.c$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Li32/c$a$a;", "Li32/c$a;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41726a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41726a(String error) {
                super(null);
                AbstractC22676k.m65750j(error, "error");
                this.error = error;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41726a) && AbstractC22676k.m65745e(this.error, ((C41726a) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("LoadFailed(error=", this.error, ")");
            }
        }

        /* JADX INFO: renamed from: i32.c$a$b */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Li32/c$a$b;", "Li32/c$a;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public static final b f70111a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: i32.c$a$c */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Li32/c$a$c;", "Li32/c$a;", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "tile", "<init>", "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "()Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: b */
            public static final int f70112b = C9598e.f28134d;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final PaymentMethodMenuTileModel tile;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(PaymentMethodMenuTileModel tile) {
                super(null);
                AbstractC22676k.m65750j(tile, "tile");
                this.tile = tile;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PaymentMethodMenuTileModel getTile() {
                return this.tile;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.tile, ((c) other).tile);
            }

            public int hashCode() {
                return this.tile.hashCode();
            }

            public String toString() {
                return "PaymentMethodTileUpdated(tile=" + this.tile + ")";
            }
        }

        /* JADX INFO: renamed from: i32.c$a$d */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Li32/c$a$d;", "Li32/c$a;", "", "screenName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String screenName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String screenName) {
                super(null);
                AbstractC22676k.m65750j(screenName, "screenName");
                this.screenName = screenName;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getScreenName() {
                return this.screenName;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof d) && AbstractC22676k.m65745e(this.screenName, ((d) other).screenName);
            }

            public int hashCode() {
                return this.screenName.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("SetLoading(screenName=", this.screenName, ")");
            }
        }

        /* JADX INFO: renamed from: i32.c$a$e */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Li32/c$a$e;", "Li32/c$a;", "Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;", "model", "<init>", "(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;", "()Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final StripeBottomSheetTileModel model;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(StripeBottomSheetTileModel model) {
                super(null);
                AbstractC22676k.m65750j(model, "model");
                this.model = model;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final StripeBottomSheetTileModel getModel() {
                return this.model;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && AbstractC22676k.m65745e(this.model, ((e) other).model);
            }

            public int hashCode() {
                return this.model.hashCode();
            }

            public String toString() {
                return "TileLoaded(model=" + this.model + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: i32.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripepaymentsheettileminiarch.domain.MiniArchStripePaymentSheetTileInteractor$fetchTile$1", m100430f = "MiniArchStripePaymentSheetTileInteractor.kt", m100431l = {54, 55, 56, 57}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Li32/c$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C18056c f70116E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f70117F;

        /* JADX INFO: renamed from: w */
        Object f70118w;

        /* JADX INFO: renamed from: x */
        int f70119x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f70120y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f70121z;

        /* JADX INFO: renamed from: i32.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.payments.stripepaymentsheettileminiarch.domain.MiniArchStripePaymentSheetTileInteractor$fetchTile$1$result$1", m100430f = "MiniArchStripePaymentSheetTileInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f70122w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18056c f70123x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f70124y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C18056c c18056c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f70123x = c18056c;
                this.f70124y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f70123x, this.f70124y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f70122w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                MiniArchStripePaymentSheetTileApi miniArchStripePaymentSheetTileApi = this.f70123x.api;
                String str = this.f70124y;
                this.f70122w = 1;
                Object objFetchTile = miniArchStripePaymentSheetTileApi.fetchTile(str, this);
                return objFetchTile == enumC31071a ? enumC31071a : objFetchTile;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super StripeBottomSheetTileModel> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, C18056c c18056c, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f70121z = str;
            this.f70116E = c18056c;
            this.f70117F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f70121z, this.f70116E, this.f70117F, interfaceC30057d);
            bVar.f70120y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0071  */
        /* JADX WARN: Code duplicated, block: B:25:0x008b  */
        /* JADX WARN: Code duplicated, block: B:27:0x008f  */
        /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f70120y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f70119x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L2a
                if (r0 == r11) goto L21
                if (r0 != r10) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r13.f70118w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto La7
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L6b
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L48
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                i32.c$a$d r0 = new i32.c$a$d
                java.lang.String r3 = r13.f70121z
                r0.<init>(r3)
                r13.f70120y = r8
                r13.f70119x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L48
                goto La6
            L48:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                i32.c r2 = r13.f70116E
                tr2.n r2 = i32.C18056c.m51881e(r2)
                i32.c$b$a r4 = new i32.c$b$a
                i32.c r3 = r13.f70116E
                java.lang.String r6 = r13.f70117F
                r4.<init>(r3, r6, r12)
                r13.f70120y = r8
                r13.f70119x = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "fetchTile failed"
                r6 = 2
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L6b
                goto La6
            L6b:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L8b
                i32.c$a$e r1 = new i32.c$a$e
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel r0 = (com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel) r0
                r1.<init>(r0)
                r13.f70120y = r12
                r13.f70118w = r12
                r13.f70119x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto La7
                goto La6
            L8b:
                boolean r1 = r0 instanceof u02.InterfaceC34385a.b
                if (r1 == 0) goto Laa
                i32.c$a$a r1 = new i32.c$a$a
                u02.a$b r0 = (u02.InterfaceC34385a.b) r0
                java.lang.String r0 = r0.getErrorMessage()
                r1.<init>(r0)
                r13.f70120y = r12
                r13.f70118w = r12
                r13.f70119x = r10
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto La7
            La6:
                return r9
            La7:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            Laa:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i32.C18056c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: i32.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripepaymentsheettileminiarch.domain.MiniArchStripePaymentSheetTileInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MiniArchStripePaymentSheetTileInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f70125w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f70126x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f70127y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C18056c f70128z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C18056c c18056c) {
            super(3, interfaceC30057d);
            this.f70128z = c18056c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC18054a abstractC18054a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f70128z);
            cVar.f70126x = interfaceC13062m;
            cVar.f70127y = abstractC18054a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM51884h;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f70125w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f70126x;
                AbstractC18054a abstractC18054a = (AbstractC18054a) this.f70127y;
                if (abstractC18054a instanceof AbstractC18054a.a) {
                    AbstractC18054a.a aVar = (AbstractC18054a.a) abstractC18054a;
                    interfaceC13058lM51884h = this.f70128z.m51883g(aVar.getPath(), aVar.getScreenName());
                } else {
                    if (!(abstractC18054a instanceof AbstractC18054a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC18054a.b bVar = (AbstractC18054a.b) abstractC18054a;
                    interfaceC13058lM51884h = this.f70128z.m51884h(bVar.getUpdatePath(), bVar.getScreenName());
                }
                this.f70126x = null;
                this.f70127y = null;
                this.f70125w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM51884h, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC18054a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: i32.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripepaymentsheettileminiarch.domain.MiniArchStripePaymentSheetTileInteractor$interact$2", m100430f = "MiniArchStripePaymentSheetTileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Li32/b;", "state", "Li32/c$a;", "internalAction", "<anonymous>", "(Li32/b;Li32/c$a;)Li32/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f70129w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f70130x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f70131y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C18055b c18055b, a aVar, InterfaceC30057d<? super C18055b> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f70130x = c18055b;
            dVar.f70131y = aVar;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C18055b c18055b = (C18055b) this.f70130x;
            a aVar = (a) this.f70131y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f70129w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.d) {
                return C18055b.m51871b(c18055b, true, null, null, null, ((a.d) aVar).getScreenName(), false, 38, null);
            }
            if (aVar instanceof a.e) {
                a.e eVar = (a.e) aVar;
                return C18055b.m51871b(c18055b, false, eVar.getModel(), null, null, null, c18055b.getHasSelectedPaymentMethod() || eVar.getModel().getDefaultPaymentMethodOnFile(), 20, null);
            }
            if (aVar instanceof a.C41726a) {
                return C18055b.m51871b(c18055b, false, null, null, ((a.C41726a) aVar).getError(), null, false, 54, null);
            }
            if (aVar instanceof a.c) {
                return C18055b.m51871b(c18055b, false, null, ((a.c) aVar).getTile(), null, null, false, 58, null);
            }
            if (aVar instanceof a.b) {
                return C18055b.m51871b(c18055b, false, null, null, null, null, true, 31, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: i32.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripepaymentsheettileminiarch.domain.MiniArchStripePaymentSheetTileInteractor$refreshPaymentMethodTile$1", m100430f = "MiniArchStripePaymentSheetTileInteractor.kt", m100431l = {62, 65, 67, 71, 72}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Li32/c$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C18056c f70132E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f70133F;

        /* JADX INFO: renamed from: w */
        Object f70134w;

        /* JADX INFO: renamed from: x */
        int f70135x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f70136y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f70137z;

        /* JADX INFO: renamed from: i32.c$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.payments.stripepaymentsheettileminiarch.domain.MiniArchStripePaymentSheetTileInteractor$refreshPaymentMethodTile$1$result$1", m100430f = "MiniArchStripePaymentSheetTileInteractor.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/payments/stripepaymentsheettileminiarch/model/StripePaymentSheetTileUpdateResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f70138w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18056c f70139x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f70140y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C18056c c18056c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f70139x = c18056c;
                this.f70140y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f70139x, this.f70140y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f70138w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                MiniArchStripePaymentSheetTileApi miniArchStripePaymentSheetTileApi = this.f70139x.api;
                String str = this.f70140y;
                this.f70138w = 1;
                Object objFetchUpdatedTile = miniArchStripePaymentSheetTileApi.fetchUpdatedTile(str, this);
                return objFetchUpdatedTile == enumC31071a ? enumC31071a : objFetchUpdatedTile;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super StripePaymentSheetTileUpdateResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, C18056c c18056c, String str2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f70137z = str;
            this.f70132E = c18056c;
            this.f70133F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f70137z, this.f70132E, this.f70133F, interfaceC30057d);
            eVar.f70136y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0080 A[PHI: r0
          0x0080: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v20 java.lang.Object) binds: [B:23:0x007d, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x0086  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L34;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i32.C18056c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C18056c(MiniArchStripePaymentSheetTileApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m51883g(String path, String screenName) {
        return new C13084s1(new b(screenName, this, path, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m51884h(String updatePath, String screenName) {
        return new C13084s1(new e(screenName, this, updatePath, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C18055b(false, null, null, null, null, false, 63, null), AbstractC13091v.m36590P(upstream, new c(null, this)), new d(null));
    }

    public /* synthetic */ C18056c(MiniArchStripePaymentSheetTileApi miniArchStripePaymentSheetTileApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(miniArchStripePaymentSheetTileApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MiniArchStripePaymentSheetTileInteractor") : interfaceC34116n);
    }
}
