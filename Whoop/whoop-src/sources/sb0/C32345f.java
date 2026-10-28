package sb0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.design.models.items.MenuItemModel;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.C17919x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s32.C32112d;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import y71.AbstractC39279l;
import y71.C39282o;

/* JADX INFO: renamed from: sb0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lsb0/f;", "", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "advancedLabsApi", "Ljb1/a;", "reducer", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ljb1/a;Ltr2/n;)V", "Ly71/o;", "d", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ljb1/a;", "c", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32345f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi advancedLabsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: sb0.f$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsRepository", m100430f = "AdvancedLabsRepository.kt", m100431l = {C1533u.AVG_FIELD_NUMBER}, m100432m = "getMoreTabMenuItem", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f133905w;

        /* JADX INFO: renamed from: y */
        int f133907y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f133905w = obj;
            this.f133907y |= Integer.MIN_VALUE;
            return C32345f.this.m100664d(this);
        }
    }

    /* JADX INFO: renamed from: sb0.f$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f133908w = new b();

        /* JADX INFO: renamed from: a */
        public final long m100665a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m100665a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: sb0.f$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f133909w = new c();

        /* JADX INFO: renamed from: a */
        public final long m100666a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m100666a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: sb0.f$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.domain.AdvancedLabsRepository$getMoreTabMenuItem$response$1", m100430f = "AdvancedLabsRepository.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/design/models/items/MenuItemModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f133910w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C32345f.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f133910w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C32345f.this.advancedLabsApi;
            this.f133910w = 1;
            Object advancedLabsMoreMenuItem = advancedLabsApi.getAdvancedLabsMoreMenuItem(this);
            return advancedLabsMoreMenuItem == enumC31071a ? enumC31071a : advancedLabsMoreMenuItem;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MenuItemModel> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C32345f(AdvancedLabsApi advancedLabsApi, C21535a reducer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(advancedLabsApi, "advancedLabsApi");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(logger, "logger");
        this.advancedLabsApi = advancedLabsApi;
        this.reducer = reducer;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m100662b(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public final Object m100664d(InterfaceC30057d<? super C39282o> interfaceC30057d) {
        a aVar;
        MenuItemModel menuItemModel;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f133907y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f133907y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f133905w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f133907y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(null);
            aVar2.f133907y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            menuItemModel = (MenuItemModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            menuItemModel = null;
        }
        if (menuItemModel == null) {
            return null;
        }
        InterfaceC25312u interfaceC25312uM60544l = this.reducer.m60544l(menuItemModel);
        C39282o c39282oM125211a = interfaceC25312uM60544l instanceof C39282o ? (C39282o) interfaceC25312uM60544l : null;
        if (c39282oM125211a == null) {
            return null;
        }
        AbstractC39279l alignment = c39282oM125211a.getAlignment();
        if (alignment instanceof AbstractC39279l.b) {
            c39282oM125211a = c39282oM125211a.m125211a((32735 & 1) != 0 ? c39282oM125211a.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282oM125211a.title : null, (32735 & 4) != 0 ? c39282oM125211a.titleColor : null, (32735 & 8) != 0 ? c39282oM125211a.enabled : false, (32735 & 16) != 0 ? c39282oM125211a.selected : false, (32735 & 32) != 0 ? c39282oM125211a.alignment : AbstractC39279l.b.m125162b((AbstractC39279l.b) alignment, null, p745y81.Function1.m125323a(c.f133909w), null, p745y81.Function1.m125323a(b.f133908w), null, null, null, null, null, null, null, false, 4085, null), (32735 & 64) != 0 ? c39282oM125211a.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282oM125211a.background : null, (32735 & 256) != 0 ? c39282oM125211a.border : null, (32735 & 512) != 0 ? c39282oM125211a.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282oM125211a.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282oM125211a.menuItemStyle : null, (32735 & 4096) != 0 ? c39282oM125211a.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282oM125211a.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282oM125211a.analyticEvent : null);
        }
        C39282o c39282o = c39282oM125211a;
        return c39282o.m125211a((32735 & 1) != 0 ? c39282o.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282o.title : null, (32735 & 4) != 0 ? c39282o.titleColor : null, (32735 & 8) != 0 ? c39282o.enabled : false, (32735 & 16) != 0 ? c39282o.selected : false, (32735 & 32) != 0 ? c39282o.alignment : null, (32735 & 64) != 0 ? c39282o.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282o.background : null, (32735 & 256) != 0 ? c39282o.border : null, (32735 & 512) != 0 ? c39282o.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282o.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282o.menuItemStyle : null, (32735 & 4096) != 0 ? c39282o.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282o.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282o.analyticEvent : null);
    }

    public /* synthetic */ C32345f(AdvancedLabsApi advancedLabsApi, C21535a c21535a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? AbstractC21537c.m60554d(new C32112d(22)) : c21535a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AdvancedLabsRepository") : interfaceC34116n);
    }
}
