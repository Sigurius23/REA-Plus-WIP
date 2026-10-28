package com.whoop.p069ui.main;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.app.TaskStackBuilder;
import bf2.C3201a;
import c93.InterfaceC4339a;
import com.whoop.domain.model.WhoopUri;
import com.whoop.domain.model.WhoopUriKt;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import com.whoop.realtime.service.C9907b;
import g12.C15224b;
import ge3.AbstractC15751g;
import h92.C17029a;
import hi0.AbstractC17312j;
import hj0.AbstractActivityC17350i;
import hj0.C17358q;
import ii0.AbstractC18550i0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import od1.InterfaceC27837a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29020i;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0003R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0014X\u0094D¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u00101¨\u00064"}, m65681d2 = {"Lcom/whoop/ui/main/LinkingActivity;", "Lhj0/i;", "<init>", "()V", "", "preserveIntentData", "Ll83/a0;", "G", "(Z)V", "Lcom/whoop/domain/model/WhoopUri;", "deeplinkUri", "F", "(Lcom/whoop/domain/model/WhoopUri;)V", "show", "K", "Landroid/content/Intent;", "intent", "I", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lod1/a0;", "E", "Ll83/h;", "()Lod1/a0;", "userSessionManager", "", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "logTag", "Lii0/i0;", "Lii0/i0;", "binding", "Lh92/a;", "H", "A", "()Lh92/a;", "deepLinkParser", "Lcom/whoop/ui/main/a;", "B", "()Lcom/whoop/ui/main/a;", "linkingRoutingHelper", "Lg12/b;", "J", "D", "()Lg12/b;", "oAuthCallbackBus", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LinkingActivity extends AbstractActivityC17350i {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: L */
    public static final int f32198L = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h userSessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private AbstractC18550i0 binding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h deepLinkParser;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h linkingRoutingHelper;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h oAuthCallbackBus;

    /* JADX INFO: renamed from: com.whoop.ui.main.LinkingActivity$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/ui/main/LinkingActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/whoop/domain/model/WhoopUri;", "uri", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "a", "(Landroid/content/Context;Lcom/whoop/domain/model/WhoopUri;)Landroid/content/Intent;", "Lh92/a;", "deepLinkParser", "", "b", "(Landroid/content/Context;Lcom/whoop/domain/model/WhoopUri;Lh92/a;)[Landroid/content/Intent;", "", "EXTERNAL_AUTH_PATH", "Ljava/lang/String;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final Intent m27346a(Context context, WhoopUri uri) {
            C17358q c17358q = new C17358q(context, (Class<?>) MainActivity.class);
            c17358q.m49156o(WhoopUriKt.asUri(uri));
            return c17358q.mo23852f();
        }

        /* JADX INFO: renamed from: b */
        public final Intent[] m27347b(Context context, WhoopUri uri, C17029a deepLinkParser) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(deepLinkParser, "deepLinkParser");
            TaskStackBuilder taskStackBuilderAddNextIntent = TaskStackBuilder.create(context).addNextIntent(new C17358q(context, (Class<?>) MainActivity.class).mo23852f());
            AbstractC22676k.m65749i(taskStackBuilderAddNextIntent, "addNextIntent(...)");
            WhoopUri whoopUriM48092a = deepLinkParser.m48092a(uri);
            if (whoopUriM48092a != null) {
                Intent[] intents = TaskStackBuilder.create(context).addNextIntent(m27346a(context, whoopUriM48092a)).getIntents();
                AbstractC22676k.m65747g(intents);
                return intents;
            }
            Intent[] intents2 = taskStackBuilderAddNextIntent.getIntents();
            AbstractC22676k.m65747g(intents2);
            return intents2;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.main.LinkingActivity$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10598b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32205w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32206x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32207y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10598b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32205w = componentCallbacks;
            this.f32206x = interfaceC35951a;
            this.f32207y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od1.a0] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27837a0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32205w;
            InterfaceC35951a interfaceC35951a = this.f32206x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32207y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27837a0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.main.LinkingActivity$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10599c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32208w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32209x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32210y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10599c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32208w = componentCallbacks;
            this.f32209x = interfaceC35951a;
            this.f32210y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [h92.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17029a invoke() {
            ComponentCallbacks componentCallbacks = this.f32208w;
            InterfaceC35951a interfaceC35951a = this.f32209x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32210y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17029a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.main.LinkingActivity$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10600d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32211w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32212x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32213y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10600d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32211w = componentCallbacks;
            this.f32212x = interfaceC35951a;
            this.f32213y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.ui.main.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C10602a invoke() {
            ComponentCallbacks componentCallbacks = this.f32211w;
            InterfaceC35951a interfaceC35951a = this.f32212x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32213y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10602a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.main.LinkingActivity$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10601e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32214w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32215x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32216y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10601e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32214w = componentCallbacks;
            this.f32215x = interfaceC35951a;
            this.f32216y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [g12.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C15224b invoke() {
            ComponentCallbacks componentCallbacks = this.f32214w;
            InterfaceC35951a interfaceC35951a = this.f32215x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32216y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15224b.class), interfaceC35951a);
        }
    }

    public LinkingActivity() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.userSessionManager = AbstractC30060g.m92087G(enumC23463i, new C10598b(this, null, null));
        this.logTag = "LinkingActivity";
        this.deepLinkParser = AbstractC30060g.m92087G(enumC23463i, new C10599c(this, null, null));
        this.linkingRoutingHelper = AbstractC30060g.m92087G(enumC23463i, new C10600d(this, null, null));
        this.oAuthCallbackBus = AbstractC30060g.m92087G(enumC23463i, new C10601e(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C17029a m27335A() {
        return (C17029a) this.deepLinkParser.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C10602a m27336B() {
        return (C10602a) this.linkingRoutingHelper.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C15224b m27337D() {
        return (C15224b) this.oAuthCallbackBus.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final InterfaceC27837a0 m27338E() {
        return (InterfaceC27837a0) this.userSessionManager.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final void m27339F(WhoopUri deeplinkUri) {
        m49116t().mo85228t("goToDeeplinkedScreens: " + deeplinkUri, new AbstractC30556a.a[0]);
        startActivities(INSTANCE.m27347b(this, deeplinkUri, m27335A()));
        getIntent().setData(null);
        finish();
    }

    /* JADX INFO: renamed from: G */
    private final void m27340G(boolean preserveIntentData) {
        Uri data;
        m49116t().mo85228t("going to activation flow".concat(preserveIntentData ? " with intent data" : ""), new AbstractC30556a.a[0]);
        C17358q c17358q = new C17358q(this, (Class<?>) MainActivity.class);
        if (preserveIntentData && (data = getIntent().getData()) != null) {
            c17358q.m49156o(data);
        }
        c17358q.m49145b().m49154m();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m27341H(LinkingActivity linkingActivity, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        linkingActivity.m27340G(z4);
    }

    /* JADX INFO: renamed from: I */
    private final void m27342I(Intent intent) {
        String strValueOf = String.valueOf(intent.getData());
        intent.setData(null);
        m27337D().m43290c(strValueOf);
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C34911a m27343J() {
        return AbstractC15751g.m44431K(54);
    }

    /* JADX INFO: renamed from: K */
    private final void m27344K(boolean show) {
        if (show) {
            AbstractC18550i0 abstractC18550i0 = this.binding;
            if (abstractC18550i0 != null) {
                abstractC18550i0.f72290a.m26663f();
                return;
            } else {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
        }
        AbstractC18550i0 abstractC18550i1 = this.binding;
        if (abstractC18550i1 != null) {
            abstractC18550i1.f72290a.m26664g();
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    @Override // hj0.AbstractActivityC17350i, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        m49116t().mo85228t(AbstractC31061c.m95637m(getIntent().getData(), "onCreate with data "), new AbstractC30556a.a[0]);
        super.onCreate(savedInstanceState);
        if (C9907b.m24265x(this)) {
            RealTimeRecordActivity.INSTANCE.m23843b(this, (C29020i) AbstractC15751g.m44472y(C29020i.class, null, new C3201a(26))).m49154m();
            finish();
        } else {
            AbstractC18550i0 abstractC18550i0M53763c = AbstractC18550i0.m53763c(getLayoutInflater());
            AbstractC22676k.m65749i(abstractC18550i0M53763c, "inflate(...)");
            this.binding = abstractC18550i0M53763c;
            setContentView(abstractC18550i0M53763c.getRoot());
        }
    }

    @Override // hj0.AbstractActivityC17350i, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onResume() {
        Uri data;
        String path;
        super.onResume();
        m27344K(true);
        WhoopUri whoopUriM48092a = m27335A().m48092a(WhoopUri.INSTANCE.parse(getIntent().getData()));
        boolean z4 = m27338E().mo83921q() != null;
        C10602a.a aVarM27348a = m27336B().m27348a(whoopUriM48092a);
        if (aVarM27348a instanceof C10602a.a.b) {
            m27340G(true);
            finish();
            return;
        }
        if (aVarM27348a instanceof C10602a.a.c) {
            m49116t().mo85228t("password reset detected. Displaying \"Copy and paste the link into your browser\" message to user", new AbstractC30556a.a[0]);
            Toast.makeText(this, AbstractC17312j.f66935K0, 1).show();
            finish();
        } else {
            if (!(aVarM27348a instanceof C10602a.a.C41431a)) {
                throw new NoWhenBranchMatchedException();
            }
            Intent intent = getIntent();
            if (intent != null && (data = intent.getData()) != null && (path = data.getPath()) != null && AbstractC39414r.m125876U(path, "/external_auth", false)) {
                Intent intent2 = getIntent();
                AbstractC22676k.m65749i(intent2, "getIntent(...)");
                m27342I(intent2);
            } else if (z4) {
                m27339F(whoopUriM48092a);
            } else {
                m27341H(this, false, 1, null);
            }
            m27344K(false);
        }
    }

    @Override // hj0.AbstractActivityC17350i
    /* JADX INFO: renamed from: v, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
