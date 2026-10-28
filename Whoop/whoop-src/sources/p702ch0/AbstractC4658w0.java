package p702ch0;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1579e2;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.ChatEntrypointExperience;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf3.C21647a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ld1.C23862a;
import m83.AbstractC25267u;
import nf3.C26669a;
import p337n8.C26444a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p734sl0.AbstractC32662q2;
import p734sl0.C32645n0;
import p734sl0.Function1;
import p734sl0.Function2;
import p734sl0.InterfaceC32647n2;
import p734sl0.InterfaceC32666r1;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg0.C31381b;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import va3.AbstractC35854l;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vg0.C35993i0;
import x81.AbstractC38073e;
import xf3.C38266c;
import yg0.C39522a;
import zg0.AbstractC40624g;
import zg0.C40625h;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ch0.w0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0019²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroid/content/Context;", "context", "Lsl0/n0;", "screenArgs", "Lch0/v0;", "i", "(Landroid/content/Context;Lsl0/n0;Landroidx/compose/runtime/Composer;I)Lch0/v0;", "Landroid/net/Uri;", "uri", "", "u", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", "", "v", "(Landroid/content/Context;Landroid/net/Uri;)J", "Lyg0/a;", "navigationRouter", "Lrg0/b;", "analyticsHelper", "Lfi0/a;", "analytics", "Lzr2/a;", "dateAndTimeProvider", "Lvg0/i0;", "markTurnAsSeenOrchestrator", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4658w0 {

    /* JADX INFO: renamed from: ch0.w0$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f19015w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f19016x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f19017y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f19015w = c38266c;
            this.f19016x = interfaceC35951a;
            this.f19017y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yg0.a] */
        @Override // c93.InterfaceC4339a
        public final C39522a invoke() {
            return this.f19015w.m122602a(this.f19017y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39522a.class), this.f19016x);
        }
    }

    /* JADX INFO: renamed from: ch0.w0$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f19018w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f19019x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f19020y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f19018w = c38266c;
            this.f19019x = interfaceC35951a;
            this.f19020y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rg0.b] */
        @Override // c93.InterfaceC4339a
        public final C31381b invoke() {
            return this.f19018w.m122602a(this.f19020y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31381b.class), this.f19019x);
        }
    }

    /* JADX INFO: renamed from: ch0.w0$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f19021w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f19022x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f19023y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f19021w = c38266c;
            this.f19022x = interfaceC35951a;
            this.f19023y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            return this.f19021w.m122602a(this.f19023y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), this.f19022x);
        }
    }

    /* JADX INFO: renamed from: ch0.w0$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f19024w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f19025x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f19026y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f19024w = c38266c;
            this.f19025x = interfaceC35951a;
            this.f19026y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            return this.f19024w.m122602a(this.f19026y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), this.f19025x);
        }
    }

    /* JADX INFO: renamed from: ch0.w0$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f19027w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f19028x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f19029y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f19027w = c38266c;
            this.f19028x = interfaceC35951a;
            this.f19029y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, vg0.i0] */
        @Override // c93.InterfaceC4339a
        public final C35993i0 invoke() {
            return this.f19027w.m122602a(this.f19029y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35993i0.class), this.f19028x);
        }
    }

    /* JADX INFO: renamed from: ch0.w0$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C23862a f19030w;

        public f(C23862a c23862a) {
            this.f19030w = c23862a;
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21647a invoke() {
            C23862a storeOwner = this.f19030w;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, null);
        }
    }

    /* JADX INFO: renamed from: ch0.w0$g */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenCoordinatorKt$rememberAiChatWrapperScreenCoordinator$filePicker$1$1$1", m100430f = "AiChatWrapperScreenCoordinator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f19031w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List<Uri> f19032x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C40625h f19033y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Context f19034z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(List<? extends Uri> list, C40625h c40625h, Context context, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f19032x = list;
            this.f19033y = c40625h;
            this.f19034z = context;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f19032x, this.f19033y, this.f19034z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f19031w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            List<Uri> list = this.f19032x;
            Context context = this.f19034z;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC4658w0.m14724u(context, (Uri) it.next()));
            }
            List<Uri> list2 = this.f19032x;
            Context context2 = this.f19034z;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new Long(AbstractC4658w0.m14725v(context2, (Uri) it3.next())));
            }
            this.f19033y.mo1216g(new AbstractC40624g.v(this.f19032x, arrayList, arrayList2));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.w0$h */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenCoordinatorKt$rememberAiChatWrapperScreenCoordinator$mediaPickerLauncher$1$1$1$1", m100430f = "AiChatWrapperScreenCoordinator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Context f19035E;

        /* JADX INFO: renamed from: w */
        int f19036w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List<Uri> f19037x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C40625h f19038y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f19039z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(List<? extends Uri> list, C40625h c40625h, String str, Context context, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f19037x = list;
            this.f19038y = c40625h;
            this.f19039z = str;
            this.f19035E = context;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f19037x, this.f19038y, this.f19039z, this.f19035E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f19036w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            List<Uri> list = this.f19037x;
            Context context = this.f19035E;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(AbstractC4658w0.m14725v(context, (Uri) it.next())));
            }
            this.f19038y.mo1216g(new AbstractC40624g.w(this.f19037x, this.f19039z, arrayList));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final C4656v0 m14712i(Context context, C32645n0 screenArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        C35953c c35953c = new C35953c("AI_CHAT_NAVIGATION_ROUTER");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(context);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C4641o(context, 2);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        c28655q.m87152f0(1903845737);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c = c26669a.f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g = c28655q.m87153g(c35953c) | c28655q.m87153g(interfaceC4339a);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, c35953c, interfaceC4339a));
            c28655q.m87172p0(objM87133R2);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R2;
        c28655q.m87173q(false);
        C35953c c35953c2 = new C35953c("AI_CHAT_ANALYTICS_HELPER");
        boolean zM87157i2 = c28655q.m87157i(screenArgs);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = new C4641o(screenArgs, 3);
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
        c28655q.m87152f0(1903845737);
        C26669a c26669a2 = C29155a.f118017b;
        if (c26669a2 == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c2 = c26669a2.f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g2 = c28655q.m87153g(c35953c2) | c28655q.m87153g(interfaceC4339a2);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87153g2 || objM87133R4 == c28676v0) {
            objM87133R4 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c2, c35953c2, interfaceC4339a2));
            c28655q.m87172p0(objM87133R4);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h2 = (InterfaceC23462h) objM87133R4;
        c28655q.m87173q(false);
        c28655q.m87152f0(1903845737);
        C26669a c26669a3 = C29155a.f118017b;
        if (c26669a3 == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c3 = c26669a3.f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87153g3 || objM87133R5 == c28676v0) {
            objM87133R5 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(c38266c3, null, null));
            c28655q.m87172p0(objM87133R5);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h3 = (InterfaceC23462h) objM87133R5;
        c28655q.m87173q(false);
        c28655q.m87152f0(1903845737);
        C26669a c26669a4 = C29155a.f118017b;
        if (c26669a4 == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c4 = c26669a4.f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g4 = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87153g4 || objM87133R6 == c28676v0) {
            objM87133R6 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c4, null, null));
            c28655q.m87172p0(objM87133R6);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h4 = (InterfaceC23462h) objM87133R6;
        c28655q.m87173q(false);
        c28655q.m87152f0(1903845737);
        C26669a c26669a5 = C29155a.f118017b;
        if (c26669a5 == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c5 = c26669a5.f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g5 = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R7 = c28655q.m87133R();
        if (zM87153g5 || objM87133R7 == c28676v0) {
            objM87133R7 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new e(c38266c5, null, null));
            c28655q.m87172p0(objM87133R7);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h5 = (InterfaceC23462h) objM87133R7;
        c28655q.m87173q(false);
        Object objM87133R8 = c28655q.m87133R();
        if (objM87133R8 == c28676v0) {
            objM87133R8 = AbstractC28683x.m87272z(null);
            c28655q.m87172p0(objM87133R8);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R8;
        boolean zM87157i3 = c28655q.m87157i(screenArgs) | c28655q.m87157i(interfaceC23462h5);
        Object objM87133R9 = c28655q.m87133R();
        if (zM87157i3 || objM87133R9 == c28676v0) {
            objM87133R9 = new C4637m(4, screenArgs, interfaceC23462h5);
            c28655q.m87172p0(objM87133R9);
        }
        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R9;
        Context applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
        AbstractC22676k.m65748h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        boolean zM87153g6 = c28655q.m87153g(screenArgs);
        Object objM87133R10 = c28655q.m87133R();
        if (zM87153g6 || objM87133R10 == c28676v0) {
            objM87133R10 = new C23862a();
            c28655q.m87172p0(objM87133R10);
        }
        C23862a c23862a = (C23862a) objM87133R10;
        boolean zM87153g7 = c28655q.m87153g(c23862a);
        Object objM87133R11 = c28655q.m87133R();
        if (zM87153g7 || objM87133R11 == c28676v0) {
            objM87133R11 = AbstractC34132o.m107857B(application, null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40625h.class), new f(c23862a), interfaceC4339a3);
            c28655q.m87172p0(objM87133R11);
        }
        C40625h c40625h = (C40625h) ((AbstractC1637w1) objM87133R11);
        boolean zM87157i4 = c28655q.m87157i(c40625h) | c28655q.m87157i(context);
        Object objM87133R12 = c28655q.m87133R();
        if (zM87157i4 || objM87133R12 == c28676v0) {
            objM87133R12 = new C4630j0(1, c40625h, context);
            c28655q.m87172p0(objM87133R12);
        }
        InterfaceC32647n2 interfaceC32647n2M102168h = Function2.m102168h((InterfaceC4351m) objM87133R12, c28655q, 0);
        boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("whoop-coach-file-upload");
        boolean zM87157i5 = c28655q.m87157i(c40625h) | c28655q.m87157i(context);
        Object objM87133R13 = c28655q.m87133R();
        if (zM87157i5 || objM87133R13 == c28676v0) {
            objM87133R13 = new C4626i(2, c40625h, context);
            c28655q.m87172p0(objM87133R13);
        }
        InterfaceC32666r1 interfaceC32666r1M102294a = Function1.m102294a((p715kotlin.jvm.functions.Function1) objM87133R13, c28655q, 0);
        boolean zM87153g8 = c28655q.m87153g(c40625h) | c28655q.m87153g(interfaceC32647n2M102168h) | c28655q.m87153g(interfaceC32666r1M102294a) | c28655q.m87155h(zIsFeatureEnabled);
        Object objM87133R14 = c28655q.m87133R();
        if (zM87153g8 || objM87133R14 == c28676v0) {
            C39522a c39522aM14714k = m14714k(interfaceC23462h);
            C35993i0 c35993i0M14721r = m14721r(interfaceC23462h5);
            C4656v0 c4656v0 = new C4656v0(c40625h, c39522aM14714k, m14718o(interfaceC23462h2), m14719p(interfaceC23462h3), interfaceC32647n2M102168h, interfaceC32666r1M102294a, zIsFeatureEnabled, interfaceC28601c1, new C4608c(context, 1), c35993i0M14721r, m14720q(interfaceC23462h4));
            c28655q.m87172p0(c4656v0);
            objM87133R14 = c4656v0;
        }
        return (C4656v0) objM87133R14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C34911a m14713j(Context context) {
        return AbstractC15751g.m44431K(context);
    }

    /* JADX INFO: renamed from: k */
    private static final C39522a m14714k(InterfaceC23462h interfaceC23462h) {
        return (C39522a) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m14715l(C40625h c40625h, Context context, List uris) {
        AbstractC22676k.m65750j(uris, "uris");
        if (!uris.isEmpty()) {
            C26444a c26444aM5043b = AbstractC1640x1.m5043b(c40625h);
            C22365e c22365e = AbstractC3050q0.f12077a;
            AbstractC3006f0.m8732z(c26444aM5043b, ExecutorC22364d.f87316w, null, new g(uris, c40625h, context, null), 2);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final long m14716m(Context context, Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        return m14725v(context, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C34911a m14717n(C32645n0 c32645n0) {
        String strM102028m = c32645n0.getSourcePillar();
        String strM102029n = c32645n0.getSourceType();
        String strM102024i = c32645n0.getPresetQuestion();
        String strM102027l = c32645n0.getSourceId();
        String strM102026k = c32645n0.getSource();
        ChatEntrypointExperience chatEntrypointExperienceM102020e = c32645n0.getEntrypointExperience();
        return AbstractC15751g.m44431K(strM102028m, strM102029n, strM102024i, strM102027l, strM102026k, chatEntrypointExperienceM102020e != null ? chatEntrypointExperienceM102020e.name() : null);
    }

    /* JADX INFO: renamed from: o */
    private static final C31381b m14718o(InterfaceC23462h interfaceC23462h) {
        return (C31381b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: p */
    private static final InterfaceC14515a m14719p(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC14515a) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: q */
    private static final InterfaceC41070a m14720q(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC41070a) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final C35993i0 m14721r(InterfaceC23462h interfaceC23462h) {
        return (C35993i0) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C34911a m14722s(C32645n0 c32645n0, InterfaceC23462h interfaceC23462h) {
        return AbstractC15751g.m44431K(c32645n0, m14721r(interfaceC23462h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m14723t(C40625h c40625h, Context context, List list, AbstractC32662q2 abstractC32662q2) {
        if (list != null && !list.isEmpty()) {
            String str = ((abstractC32662q2 instanceof AbstractC32662q2.a) || (abstractC32662q2 instanceof AbstractC32662q2.b)) ? "camera" : "camera_roll";
            C26444a c26444aM5043b = AbstractC1640x1.m5043b(c40625h);
            C22365e c22365e = AbstractC3050q0.f12077a;
            AbstractC3006f0.m8732z(c26444aM5043b, ExecutorC22364d.f87316w, null, new h(list, c40625h, str, context, null), 2);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final String m14724u(Context context, Uri uri) throws IOException {
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                if (columnIndex >= 0 && cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(columnIndex);
                    AbstractC22676k.m65749i(string, "getString(...)");
                    cursorQuery.close();
                    return string;
                }
                cursorQuery.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(cursorQuery, th3);
                    throw th4;
                }
            }
        }
        String lastPathSegment = uri.getLastPathSegment();
        return lastPathSegment == null ? "document.pdf" : lastPathSegment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final long m14725v(Context context, Uri uri) throws IOException {
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return 0L;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("_size");
            if (columnIndex < 0 || !cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return 0L;
            }
            long j7 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j7;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(cursorQuery, th3);
                throw th4;
            }
        }
    }
}
