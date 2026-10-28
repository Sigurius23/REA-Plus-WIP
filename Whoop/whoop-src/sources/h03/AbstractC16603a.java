package h03;

import android.content.Context;
import c93.InterfaceC4339a;
import e03.C12513a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j03.EnumC21182a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p395p6.AbstractC28916s0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: h03.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\n\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lh03/a;", "Lp6/s0;", "Lof3/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Ll83/a0;", "onEnabled", "(Landroid/content/Context;)V", "onDisabled", "Le03/a;", "y", "Ll83/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Le03/a;", "analyticsManager", "Lh03/b;", "z", "i", "()Lh03/b;", "widgetRefreshScheduler", "Lj03/a;", "j", "()Lj03/a;", "widgetType", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16603a extends AbstractC28916s0 implements InterfaceC27903a {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h widgetRefreshScheduler;

    /* JADX INFO: renamed from: h03.a$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f63869w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f63870x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f63871y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f63869w = interfaceC27903a;
            this.f63870x = interfaceC35951a;
            this.f63871y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [e03.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C12513a invoke() {
            InterfaceC27903a interfaceC27903a = this.f63869w;
            InterfaceC35951a interfaceC35951a = this.f63870x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f63871y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12513a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: h03.a$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f63872w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f63873x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f63874y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f63872w = interfaceC27903a;
            this.f63873x = interfaceC35951a;
            this.f63874y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [h03.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C16604b invoke() {
            InterfaceC27903a interfaceC27903a = this.f63872w;
            InterfaceC35951a interfaceC35951a = this.f63873x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f63874y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16604b.class), interfaceC35951a);
        }
    }

    public AbstractC16603a() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsManager = AbstractC30060g.m92087G(enumC23463i, new a(this, null, null));
        this.widgetRefreshScheduler = AbstractC30060g.m92087G(enumC23463i, new b(this, null, null));
    }

    /* JADX INFO: renamed from: h */
    private final C12513a m47116h() {
        return (C12513a) this.analyticsManager.getValue();
    }

    /* JADX INFO: renamed from: i */
    private final C16604b m47117i() {
        return (C16604b) this.widgetRefreshScheduler.getValue();
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract EnumC21182a mo28931j();

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        super.onDisabled(context);
        m47116h().m35160a(mo28931j().getSegmentName());
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        super.onEnabled(context);
        m47116h().m35161b(mo28931j().getSegmentName());
        m47117i().m47120c();
    }
}
