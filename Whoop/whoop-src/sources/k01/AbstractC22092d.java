package k01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import az0.C2158a;
import b11.C2276c;
import b91.C2886a;
import bp0.C3526n;
import c41.C4104r0;
import c41.C4118t0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e61.C12762e;
import e93.AbstractC12889b;
import f01.EnumC13892q1;
import f61.C14143e;
import gb1.AbstractC15673b0;
import gb1.AbstractC15680h;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.IOException;
import java.util.List;
import ji0.C21714b;
import jp1.C21851c;
import jp2.C21875f;
import js1.C21918i;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p108e4.AbstractC12667a;
import p108e4.AbstractC12683q;
import p108e4.AbstractC12686t;
import p108e4.C12668b;
import p108e4.C12671e;
import p108e4.C12672f;
import p108e4.C12677k;
import p108e4.C12679m;
import p108e4.C12680n;
import p108e4.C12681o;
import p108e4.C12684r;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p209i3.AbstractC18032n;
import p209i3.InterfaceC18044z;
import p210i4.C18059a;
import p210i4.C18063e;
import p210i4.C18065g;
import p210i4.C18066h;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p581we.C37199o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: k01.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a9\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#¨\u0006%²\u0006\f\u0010$\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lk01/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/ui/Modifier;Lk01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isFutureIAEnabled", "s", "(Landroidx/compose/ui/Modifier;Lk01/e;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "n", "Lk01/f;", "waketimeLabelStyle", "Li2/x;", "F", "(Lk01/f;Landroidx/compose/runtime/Composer;I)J", "G", "Lcom/whoop/design/util/TextResource;", "I", "(Lk01/e;Landroidx/compose/runtime/Composer;I)Lcom/whoop/design/util/TextResource;", "", "text", "", "icon", "Lkotlin/Function0;", "onClick", "B", "(Ljava/lang/String;Ljava/lang/Integer;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lf01/q1;", "style", "H", "(Landroidx/compose/ui/Modifier;Lf01/q1;)Landroidx/compose/ui/Modifier;", "isPressed", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22092d {

    /* JADX INFO: renamed from: k01.d$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f85646w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f85647x;

        public a(C12672f c12672f, C12672f c12672f2) {
            this.f85646w = c12672f;
            this.f85647x = c12672f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m63201a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, this.f85646w.f43334e, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f85647x.f43333d, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, this.f85646w.f43336g, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, this.f85646w.f43333d, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63201a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f85648w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f85649x;

        public b(C12672f c12672f, C12672f c12672f2) {
            this.f85648w = c12672f;
            this.f85649x = c12672f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m63202a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, constrainAs.f43326c.f43334e, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, this.f85648w.f43335f, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f85649x.f43335f, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, this.f85648w.f43334e, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63202a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f85650w;

        public c(C12672f c12672f) {
            this.f85650w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m63203a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C37199o.m119194J(constrainAs.f43327d, this.f85650w.f43335f, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, this.f85650w.f43336g, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63203a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$d */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f85651w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f85652x;

        public d(C12672f c12672f, C12672f c12672f2) {
            this.f85651w = c12672f;
            this.f85652x = c12672f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m63204a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, this.f85651w.f43336g, 0.0f, 6);
            C37199o c37199o = constrainAs.f43327d;
            C12672f c12672f = constrainAs.f43326c;
            C37199o.m119194J(c37199o, c12672f.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, this.f85652x.f43333d, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, c12672f.f43336g, 0.0f, 6);
            constrainAs.m35473a(new C12680n("preferWrap"));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63204a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f85653w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f85654x;

        public e(C12672f c12672f, C12672f c12672f2) {
            this.f85653w = c12672f;
            this.f85654x = c12672f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m63205a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, this.f85653w.f43334e, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, this.f85653w.f43336g, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f85653w.f43335f, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, this.f85654x.f43333d, 0.0f, 6);
            C12680n c12680n = new C12680n("spread");
            C39174f c39174f = new C39174f(80);
            C0237p c0237p = c12680n.f43365c;
            c0237p.f812x = c39174f;
            c0237p.f813y = null;
            C39174f c39174f2 = new C39174f(50);
            C0237p c0237p2 = c12680n.f43364b;
            c0237p2.f812x = c39174f2;
            c0237p2.f813y = null;
            constrainAs.m35473a(c12680n);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63205a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f85655w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f85656x;

        public f(C12672f c12672f, C12672f c12672f2) {
            this.f85655w = c12672f;
            this.f85656x = c12672f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m63206a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, this.f85655w.f43334e, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, this.f85655w.f43336g, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f85656x.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, this.f85655w.f43333d, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63206a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f85657w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f85658x;

        public g(C12672f c12672f, C12672f c12672f2) {
            this.f85657w = c12672f;
            this.f85658x = c12672f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m63207a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, constrainAs.f43326c.f43334e, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f85657w.f43335f, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, this.f85658x.f43335f, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, this.f85658x.f43334e, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63207a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f85659w;

        public h(C12672f c12672f) {
            this.f85659w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m63208a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C37199o.m119194J(constrainAs.f43327d, this.f85659w.f43335f, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, this.f85659w.f43336g, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63208a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$i */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f85660w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f85661x;

        public i(C12672f c12672f, C12672f c12672f2) {
            this.f85660w = c12672f;
            this.f85661x = c12672f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m63209a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, this.f85660w.f43336g, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f85661x.f43335f, 0.0f, 6);
            C37199o c37199o = constrainAs.f43329f;
            C12672f c12672f = constrainAs.f43326c;
            C37199o.m119194J(c37199o, c12672f.f43335f, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, c12672f.f43336g, 0.0f, 6);
            constrainAs.m35473a(new C12680n("preferWrap"));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63209a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$j */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Ly2/t0;", "", "Ly2/q0;", "measurables", "Ly3/a;", "constraints", "Ly2/s0;", "a", "(Ly2/t0;Ljava/util/List;J)Ly2/s0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j implements InterfaceC39127r0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC28601c1 f85662a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12684r f85663b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C12679m f85664c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f85665d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC28601c1 f85666e;

        /* JADX INFO: renamed from: k01.d$j$a */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ly2/i1;", "Ll83/a0;", "a", "(Ly2/i1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC22680m implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12684r f85667w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ List f85668x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12684r c12684r, List list) {
                super(1);
                this.f85667w = c12684r;
                this.f85668x = list;
            }

            /* JADX INFO: renamed from: a */
            public final void m63210a(AbstractC39101i1 abstractC39101i1) {
                this.f85667w.m35489e(abstractC39101i1, this.f85668x);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m63210a((AbstractC39101i1) obj);
                return C23454a0.f92919a;
            }
        }

        public j(InterfaceC28601c1 interfaceC28601c1, C12684r c12684r, C12679m c12679m, int i13, InterfaceC28601c1 interfaceC28601c2) {
            this.f85662a = interfaceC28601c1;
            this.f85663b = c12684r;
            this.f85664c = c12679m;
            this.f85665d = i13;
            this.f85666e = interfaceC28601c2;
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: a */
        public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List<? extends InterfaceC39124q0> list, long j7) {
            this.f85662a.getValue();
            long jM35490f = this.f85663b.m35490f(j7, interfaceC39133t0.getLayoutDirection(), this.f85664c, list, this.f85665d);
            this.f85666e.getValue();
            return interfaceC39133t0.mo86822W((int) (jM35490f >> 32), (int) (jM35490f & 4294967295L), C25272z.f99163w, new a(this.f85663b, list));
        }
    }

    /* JADX INFO: renamed from: k01.d$k */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f85669w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12679m f85670x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC28601c1 interfaceC28601c1, C12679m c12679m) {
            super(0);
            this.f85669w = interfaceC28601c1;
            this.f85670x = c12679m;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134246invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134246invoke() {
            InterfaceC28601c1 interfaceC28601c1 = this.f85669w;
            interfaceC28601c1.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c1.getValue()).booleanValue()));
            this.f85670x.f43362z = true;
        }
    }

    /* JADX INFO: renamed from: k01.d$l */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Li3/z;", "Ll83/a0;", "a", "(Li3/z;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC22680m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12684r f85671w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C12684r c12684r) {
            super(1);
            this.f85671w = c12684r;
        }

        /* JADX INFO: renamed from: a */
        public final void m63211a(InterfaceC18044z interfaceC18044z) {
            AbstractC12686t.m35496a(interfaceC18044z, this.f85671w);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m63211a((InterfaceC18044z) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$m */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "a", "(Landroidx/compose/runtime/Composer;I)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC22680m implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22093e f85672E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f85673F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f85674w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12677k f85675x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f85676y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22093e f85677z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC28601c1 interfaceC28601c1, C12677k c12677k, InterfaceC4339a interfaceC4339a, C22093e c22093e, C22093e c22093e2, boolean z4) {
            super(2);
            this.f85674w = interfaceC28601c1;
            this.f85675x = c12677k;
            this.f85676y = interfaceC4339a;
            this.f85677z = c22093e;
            this.f85672E = c22093e2;
            this.f85673F = z4;
        }

        /* JADX INFO: renamed from: a */
        public final void m63212a(Composer composer, int i13) throws XmlPullParserException, IOException {
            int i14;
            int i15;
            int i16;
            if ((i13 & 3) == 2) {
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87121F()) {
                    c28655q.m87138X();
                    return;
                }
            }
            this.f85674w.setValue(C23454a0.f92919a);
            C12677k c12677k = this.f85675x;
            int i17 = c12677k.f43349b;
            c12677k.m35480e();
            C12677k c12677k2 = this.f85675x;
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-265267903);
            C12677k c12677k3 = (C12677k) c12677k2.m35479d().f2818x;
            C12672f c12672fM35478c = c12677k3.m35478c();
            C12672f c12672fM35478c2 = c12677k3.m35478c();
            C12672f c12672fM35478c3 = c12677k3.m35478c();
            C12672f c12672fM35478c4 = c12677k3.m35478c();
            C12672f c12672fM35478c5 = c12677k3.m35478c();
            C12672f c12672fM35478c6 = c12677k3.m35478c();
            C12672f c12672fM35478c7 = c12677k3.m35478c();
            C12672f c12672fM35478c8 = c12677k3.m35478c();
            C12672f c12672fM35478c9 = c12677k3.m35478c();
            AbstractC12683q[] abstractC12683qArr = {c12672fM35478c, c12672fM35478c2, c12672fM35478c7, c12672fM35478c4, c12672fM35478c5};
            int i18 = c12677k2.f43351d;
            c12677k2.f43351d = i18 + 1;
            C12681o c12681o = new C12681o(Integer.valueOf(i18));
            C18059a c18059a = new C18059a(new char[0]);
            int i19 = 0;
            while (i19 < 5) {
                AbstractC12683q abstractC12683q = abstractC12683qArr[i19];
                abstractC12683q.f43368b.get(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC12667a.class).getSimpleName());
                c18059a.m51893j(C18066h.m51912j(abstractC12683q.mo35474a().toString()));
                i19++;
                c12672fM35478c4 = c12672fM35478c4;
            }
            C12672f c12672f = c12672fM35478c4;
            C18059a c18059a2 = new C18059a(new char[0]);
            c18059a2.m51893j(C18066h.m51912j("spread"));
            C12668b c12668b = C12668b.f43317b;
            Float f13 = c12668b.f43318a;
            c18059a2.m51893j(new C18063e(f13 != null ? f13.floatValue() : 0.5f));
            C18065g c18065gM35477a = c12677k2.m35477a(c12681o);
            C18066h c18066h = new C18066h("hChain".toCharArray());
            c18066h.f70147x = 0L;
            c18066h.m51910g(5);
            c18065gM35477a.m51891B("type", c18066h);
            c18065gM35477a.m51891B("contains", c18059a);
            c18065gM35477a.m51891B("style", c18059a2);
            c12677k2.f43349b = ((c12677k2.f43349b * MessageListItemViewType.SYSTEM_MESSAGE) + 16) % 1000000007;
            for (int i24 = 0; i24 < 5; i24++) {
                c12677k2.f43349b = ((c12677k2.f43349b * MessageListItemViewType.SYSTEM_MESSAGE) + abstractC12683qArr[i24].hashCode()) % 1000000007;
            }
            c12677k2.f43349b = ((c12677k2.f43349b * MessageListItemViewType.SYSTEM_MESSAGE) + c12668b.hashCode()) % 1000000007;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(this.f85677z.getBedTimeIcon(), c28655q2, 6);
            boolean zM87153g = c28655q2.m87153g(c12672fM35478c2) | c28655q2.m87153g(c12672fM35478c3);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new a(c12672fM35478c2, c12672fM35478c3);
                c28655q2.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM35476b = C12677k.m35476b(c2314t, c12672fM35478c, (Function1) objM87133R);
            float f14 = 1;
            float f15 = 4;
            float f16 = f14 * f15;
            float f17 = f15 * 7;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f17, AbstractC1099a.m3398t(modifierM35476b, 0.0f, 0.0f, f16, 0.0f, 11));
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 48, 0);
            String strM21274h = AbstractC8693b.m21274h(this.f85677z.getBedTimeTimeDisplay(), c28655q2, 0);
            boolean zM87153g2 = c28655q2.m87153g(c12672fM35478c3) | c28655q2.m87153g(c12672fM35478c);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new b(c12672fM35478c3, c12672fM35478c);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC30795n.m94707h(strM21274h, C12677k.m35476b(c2314t, c12672fM35478c2, (Function1) objM87133R2), c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN5(), null, c28655q2, 0, 0, 196088);
            C28655q c28655q3 = c28655q2;
            if (this.f85672E.getBedtimePeriodDisplay() == null || !this.f85673F) {
                i14 = 8;
                i15 = 0;
                c28655q3.m87150e0(-263011538);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-263633863);
                String strM21274h2 = AbstractC8693b.m21274h(this.f85672E.getBedtimePeriodDisplay(), c28655q3, 0);
                boolean zM87153g3 = c28655q3.m87153g(c12672fM35478c2);
                Object objM87133R3 = c28655q3.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new c(c12672fM35478c2);
                    c28655q3.m87172p0(objM87133R3);
                }
                Modifier modifierM35476b2 = C12677k.m35476b(c2314t, c12672fM35478c8, (Function1) objM87133R3);
                float f18 = 8;
                i14 = 8;
                AbstractC30795n.m94707h(strM21274h2, AbstractC1099a.m3398t(modifierM35476b2, ((float) 0.1d) * f18, 0.0f, 0.0f, ((float) 0.5d) * f18, 6), c38072d.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getN8(), null, c28655q3, 0, 0, 196088);
                c28655q3 = c28655q3;
                i15 = 0;
                c28655q3.m87173q(false);
            }
            String strM21274h3 = AbstractC8693b.m21274h(this.f85672E.getBedTimeTitle(), c28655q3, i15);
            boolean zM87153g4 = c28655q3.m87153g(c12672fM35478c2) | c28655q3.m87153g(c12672fM35478c7);
            Object objM87133R4 = c28655q3.m87133R();
            if (zM87153g4 || objM87133R4 == c28676v0) {
                objM87133R4 = new d(c12672fM35478c2, c12672fM35478c7);
                c28655q3.m87172p0(objM87133R4);
            }
            float f19 = i14;
            float f24 = f14 * f19;
            float f25 = ((float) 0.5d) * f19;
            C28655q c28655q4 = c28655q3;
            AbstractC30795n.m94707h(strM21274h3, AbstractC1099a.m3398t(AbstractC1102d.m3427x(C12677k.m35476b(c2314t, c12672fM35478c3, (Function1) objM87133R4), null, 3), f24, f25, f24, 0.0f, 8), c38072d.m121949b(c28655q3, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getH6(), null, c28655q4, 0, 0, 196088);
            boolean zM87153g5 = c28655q4.m87153g(c12672fM35478c2) | c28655q4.m87153g(c12672f);
            Object objM87133R5 = c28655q4.m87133R();
            if (zM87153g5 || objM87133R5 == c28676v0) {
                objM87133R5 = new e(c12672fM35478c2, c12672f);
                c28655q4.m87172p0(objM87133R5);
            }
            AbstractC17755i2.m50938j(AbstractC1099a.m3394p(2 * f19, C12677k.m35476b(c2314t, c12672fM35478c7, (Function1) objM87133R5)), EnumC17744g.DOTTED, null, null, null, 0L, c38072d.m121949b(c28655q4, 6).getWhite30(), null, c28655q4, 48, 188);
            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(this.f85672E.getWakeTimeIcon(), c28655q4, 6);
            boolean zM87153g6 = c28655q4.m87153g(c12672fM35478c5) | c28655q4.m87153g(c12672fM35478c6);
            Object objM87133R6 = c28655q4.m87133R();
            if (zM87153g6 || objM87133R6 == c28676v0) {
                objM87133R6 = new f(c12672fM35478c5, c12672fM35478c6);
                c28655q4.m87172p0(objM87133R6);
            }
            AbstractC15005f3.m43108b(c27430eM107874S2, null, AbstractC1102d.m3419p(f17, AbstractC1099a.m3398t(C12677k.m35476b(c2314t, c12672f, (Function1) objM87133R6), 0.0f, 0.0f, f16, 0.0f, 11)), c38072d.m121949b(c28655q4, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), c28655q4, 48, 0);
            String strM21274h4 = AbstractC8693b.m21274h(this.f85672E.getWakeTimeTimeDisplay(), c28655q4, 0);
            boolean zM87153g7 = c28655q4.m87153g(c12672f) | c28655q4.m87153g(c12672fM35478c6);
            Object objM87133R7 = c28655q4.m87133R();
            if (zM87153g7 || objM87133R7 == c28676v0) {
                objM87133R7 = new g(c12672f, c12672fM35478c6);
                c28655q4.m87172p0(objM87133R7);
            }
            AbstractC30795n.m94707h(strM21274h4, C12677k.m35476b(c2314t, c12672fM35478c5, (Function1) objM87133R7), c38072d.m121949b(c28655q4, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN5(), null, c28655q4, 0, 0, 196088);
            C28655q c28655q5 = c28655q4;
            if (this.f85672E.getWaketimePeriodDisplay() == null || !this.f85673F) {
                i16 = 0;
                c28655q5.m87150e0(-259476050);
                c28655q5.m87173q(false);
            } else {
                c28655q5.m87150e0(-260093570);
                String strM21274h5 = AbstractC8693b.m21274h(this.f85672E.getWaketimePeriodDisplay(), c28655q5, 0);
                boolean zM87153g8 = c28655q5.m87153g(c12672fM35478c5);
                Object objM87133R8 = c28655q5.m87133R();
                if (zM87153g8 || objM87133R8 == c28676v0) {
                    objM87133R8 = new h(c12672fM35478c5);
                    c28655q5.m87172p0(objM87133R8);
                }
                AbstractC30795n.m94707h(strM21274h5, AbstractC1099a.m3398t(C12677k.m35476b(c2314t, c12672fM35478c9, (Function1) objM87133R8), ((float) 0.1d) * f19, 0.0f, 0.0f, f25, 6), c38072d.m121949b(c28655q5, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, 6).getN8(), null, c28655q5, 0, 0, 196088);
                c28655q5 = c28655q5;
                i16 = 0;
                c28655q5.m87173q(false);
            }
            String strM21274h6 = AbstractC8693b.m21274h(this.f85672E.getWakeTimeTitle(), c28655q5, i16);
            boolean zM87153g9 = c28655q5.m87153g(c12672fM35478c5) | c28655q5.m87153g(c12672fM35478c7);
            Object objM87133R9 = c28655q5.m87133R();
            if (zM87153g9 || objM87133R9 == c28676v0) {
                objM87133R9 = new i(c12672fM35478c5, c12672fM35478c7);
                c28655q5.m87172p0(objM87133R9);
            }
            C28655q c28655q6 = c28655q5;
            AbstractC30795n.m94707h(strM21274h6, AbstractC1099a.m3398t(AbstractC1102d.m3427x(C12677k.m35476b(c2314t, c12672fM35478c6, (Function1) objM87133R9), null, 3), f24, f25, f24, 0.0f, 8), c38072d.m121949b(c28655q5, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, 6).getH6(), null, c28655q6, 0, 0, 196088);
            c28655q6.m87173q(false);
            if (this.f85675x.f43349b != i17) {
                AbstractC28683x.m87257k(this.f85676y, c28655q6);
            }
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            m63212a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k01.d$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class n {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f85678a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f85679b;

        static {
            int[] iArr = new int[EnumC22089a.values().length];
            try {
                iArr[EnumC22089a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22089a.COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f85678a = iArr;
            int[] iArr2 = new int[EnumC22094f.values().length];
            try {
                iArr2[EnumC22094f.LOW_BATTERY_WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC22094f.EXACT_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC22094f.SLEEP_GOAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC22094f.IN_THE_GREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC22094f.OFF.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f85679b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m63166A(Modifier modifier, C22093e c22093e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m63197w(modifier, c22093e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    /* JADX WARN: Code duplicated, block: B:73:0x0170  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x021f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0229  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    private static final void m63167B(String str, Integer num, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC21083i interfaceC21083i;
        long jM95628d;
        boolean z13;
        Object objM87133R2;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(488625709);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(num) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R;
                if (m63168C(AbstractC15751g.m44460m(interfaceC21083i, c28655q, 6))) {
                    c28655q.m87150e0(1004628556);
                    jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite30();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1004675180);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                long j7 = jM95628d;
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C12762e(interfaceC4339a, 5);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifier5 = modifier4;
                f13 = 4;
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1092a.m3360e(modifier4, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28), 2, f13), j7, AbstractC17918w0.f69621a);
                float f15 = 8;
                f14 = 1 * f15;
                Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3358c, f14, ((float) 1.5d) * f15);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                if (num == null) {
                    c28655q.m87150e0(-1891042095);
                    c28655q.m87173q(false);
                    i17 = 6;
                } else {
                    c28655q.m87150e0(-1891042094);
                    i17 = 6;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, 6), "", AbstractC1102d.m3419p(5 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                    AbstractC25012a.m73389v(c2314t, f14, c28655q, false);
                }
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c38072d.m121952e(c28655q, i17).getH5(), null, c28655q, i16 & 14, 3120, 186362);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2276c(str, num, interfaceC4339a, modifier3, i13, i14);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R;
            if (m63168C(AbstractC15751g.m44460m(interfaceC21083i, c28655q, 6))) {
                c28655q.m87150e0(1004628556);
                jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite30();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1004675180);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            long j13 = jM95628d;
            if ((i16 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C12762e(interfaceC4339a, 5);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C12762e(interfaceC4339a, 5);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifier6 = modifier4;
            f13 = 4;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1092a.m3360e(modifier4, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28), 2, f13), j13, AbstractC17918w0.f69621a);
            float f16 = 8;
            f14 = 1 * f16;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM3358c2, f14, ((float) 1.5d) * f16);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            if (num == null) {
                c28655q.m87150e0(-1891042095);
                c28655q.m87173q(false);
                i17 = 6;
            } else {
                c28655q.m87150e0(-1891042094);
                i17 = 6;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, 6), "", AbstractC1102d.m3419p(5 * f13, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
                AbstractC25012a.m73389v(c2314t, f14, c28655q, false);
            }
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC30795n.m94707h(str, null, c38072d2.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c38072d2.m121952e(c28655q, i17).getH5(), null, c28655q, i16 & 14, 3120, 186362);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c(str, num, interfaceC4339a, modifier3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m63168C(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m63169D(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m63170E(String str, Integer num, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m63167B(str, num, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final long m63171F(EnumC22094f enumC22094f, Composer composer, int i13) {
        int i14 = enumC22094f == null ? -1 : n.f85679b[enumC22094f.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1365584202);
            long accentAlert = C38072d.f163053a.m121949b(c28655q, 6).getAccentAlert();
            c28655q.m87173q(false);
            return accentAlert;
        }
        if (i14 == 2 || i14 == 3) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1365587467);
            long accentAction = C38072d.f163053a.m121949b(c28655q2, 6).getAccentAction();
            c28655q2.m87173q(false);
            return accentAction;
        }
        if (i14 == 4) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(1365589843);
            long recoveryHighRecovery = C38072d.f163053a.m121949b(c28655q3, 6).getRecoveryHighRecovery();
            c28655q3.m87173q(false);
            return recoveryHighRecovery;
        }
        if (i14 != 5) {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(1365591588);
            long sleep = C38072d.f163053a.m121949b(c28655q4, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
            c28655q4.m87173q(false);
            return sleep;
        }
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87150e0(1365581394);
        long accentNegativeTrend = C38072d.f163053a.m121949b(c28655q5, 6).getAccentNegativeTrend();
        c28655q5.m87173q(false);
        return accentNegativeTrend;
    }

    /* JADX INFO: renamed from: G */
    public static final long m63172G(EnumC22094f enumC22094f, Composer composer, int i13) {
        return m63171F(enumC22094f, composer, i13 & 14);
    }

    /* JADX INFO: renamed from: H */
    private static final Modifier m63173H(Modifier modifier, EnumC13892q1 enumC13892q1) {
        if (enumC13892q1 != EnumC13892q1.ONBOARDING) {
            return modifier;
        }
        float f13 = 3 * 4;
        return AbstractC1092a.m3356a(0.06f, AbstractC15751g.m44456i(1, modifier, AbstractC15673b0.m43985G0(), AbstractC33253j.m105489e(f13)), AbstractC15673b0.m43985G0(), AbstractC33253j.m105489e(f13));
    }

    /* JADX INFO: renamed from: I */
    public static final TextResource m63174I(C22093e viewState, Composer composer, int i13) {
        AbstractC22676k.m65750j(viewState, "viewState");
        EnumC22094f enumC22094fM63227p = viewState.getWakeTimeLabelStyle();
        int i14 = enumC22094fM63227p == null ? -1 : n.f85679b[enumC22094fM63227p.ordinal()];
        if (i14 != 2 && i14 != 3 && i14 != 4) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-777365666);
            c28655q.m87173q(false);
            return viewState.getWakeTimeTitle();
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1671326679);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC8693b.m21273g(AbstractC16277f.f62373r2, c28655q2, 0) + AbstractC8693b.m21274h(viewState.getWakeTimeTitle(), c28655q2, 0));
        c28655q2.m87173q(false);
        return textResourceM21278l;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:109:0x0315  */
    /* JADX WARN: Code duplicated, block: B:112:0x033f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0343  */
    /* JADX WARN: Code duplicated, block: B:118:0x035e  */
    /* JADX WARN: Code duplicated, block: B:124:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:128:0x0541  */
    /* JADX WARN: Code duplicated, block: B:131:0x054a  */
    /* JADX WARN: Code duplicated, block: B:133:0x054e  */
    /* JADX WARN: Code duplicated, block: B:136:0x059e  */
    /* JADX WARN: Code duplicated, block: B:137:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:149:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:154:0x060a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0714  */
    /* JADX WARN: Code duplicated, block: B:163:0x077a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0786  */
    /* JADX WARN: Code duplicated, block: B:168:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:170:0x0803  */
    /* JADX WARN: Code duplicated, block: B:171:0x0805  */
    /* JADX WARN: Code duplicated, block: B:174:0x080d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0812  */
    /* JADX WARN: Code duplicated, block: B:178:0x0815  */
    /* JADX WARN: Code duplicated, block: B:181:0x0845  */
    /* JADX WARN: Code duplicated, block: B:196:0x08af  */
    /* JADX WARN: Code duplicated, block: B:198:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:201:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:67:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x026b  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c8  */
    /* JADX INFO: renamed from: n */
    private static final void m63188n(Modifier modifier, C22093e c22093e, boolean z4, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Function1 function2;
        boolean z13;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        float f13;
        float f14;
        float f15;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        int iHashCode2;
        C38072d c38072d;
        long jM73370c;
        int i16;
        float f16;
        C2314t c2314t2;
        int iHashCode3;
        C0209i c0209i2;
        int iHashCode4;
        int iHashCode5;
        C2314t c2314t3;
        C0209i c0209i3;
        float f17;
        C28655q c28655q;
        C2314t c2314t4;
        int i17;
        C2314t c2314t5;
        C28655q c28655q2;
        float f18;
        int iHashCode6;
        C0209i c0209i4;
        int iHashCode7;
        C28655q c28655q3;
        int i18;
        TextResource textResourceM63228q;
        boolean z14;
        Function1 function6;
        C28676v0 c28676v1;
        int i19;
        boolean z15;
        boolean z16;
        Object objM87133R;
        float f19;
        boolean z17;
        long jM73366B;
        Object objM87133R2;
        C22093e c22093e2 = c22093e;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1431230001);
        if ((i13 & 48) == 0) {
            i15 = (c28655q4.m87157i(c22093e2) ? 32 : 16) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q4.m87155h(z4) ? 256 : 128;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q4.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1169) != 1168) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21714b(14);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                float f24 = 1;
                f13 = 8;
                f14 = f24 * f13;
                f15 = 2 * f13;
                c2314t = C2314t.f9131w;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, f15, f15, 1);
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i5, c23010xM66775a);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, f14, 5));
                function5 = function4;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m2);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N2);
                AbstractC22953f.m66715b(c28655q4, AbstractC1099a.m3394p(f14, c2314t));
                String strM21274h = AbstractC8693b.m21274h(c22093e2.getTitle(), c28655q4, 0);
                c38072d = C38072d.f163053a;
                C2886a c2886aM8414L = c38072d.m121952e(c28655q4, 6).getSh4();
                if (z4) {
                    jM73370c = AbstractC25012a.m73366B(c28655q4, -507337069, c38072d, c28655q4, 6);
                } else {
                    jM73370c = AbstractC25012a.m73370c(c28655q4, -507335984, c38072d, c28655q4, 6);
                }
                c28655q4.m87173q(false);
                i16 = i15;
                AbstractC30795n.m94707h(strM21274h, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q4, 0, 0, 196602);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f16 = Float.MAX_VALUE;
                } else {
                    f16 = 1.0f;
                }
                AbstractC22953f.m66715b(c28655q4, new LayoutWeightElement(f16, true));
                if (c22093e.getDestination() != null || c22093e.getRightIcon() == null) {
                    c2314t2 = c2314t;
                    c28655q4.m87150e0(1453067513);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(1452617765);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(c22093e.getRightIcon().intValue(), c28655q4, 6);
                    String strM21275i = AbstractC8693b.m21275i("navigate", c28655q4, 6);
                    Modifier modifierM44112a = AbstractC15680h.m44112a(c2314t, true);
                    if (z4) {
                        float f25 = 4;
                        f19 = f25 * f25;
                    } else {
                        f19 = 5 * 4;
                    }
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f19, modifierM44112a);
                    if (z4) {
                        jM73366B = AbstractC25012a.m73370c(c28655q4, -507318512, c38072d, c28655q4, 6);
                        z17 = false;
                    } else {
                        z17 = false;
                        jM73366B = AbstractC25012a.m73366B(c28655q4, -507317517, c38072d, c28655q4, 6);
                    }
                    c28655q4.m87173q(z17);
                    c2314t2 = c2314t;
                    AbstractC15005f3.m43108b(c27430eM107874S, strM21275i, modifierM3419p, jM73366B, c28655q4, 0, 0);
                    c28655q4.m87173q(z17);
                }
                c28655q4.m87173q(true);
                c28655q4.m87150e0(-1688584750);
                Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t2), f15, f14, f15, f14);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q4, 6);
                iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3397s);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m3);
                if (c28655q4.f115903S && AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                    c0209i2 = c0209i;
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N3);
                C2305k c2305k = C2299e.f9111N;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 48);
                iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, c2314t2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N4);
                C22961h c22961h = AbstractC22977m.f90654e;
                C2306l c2306l = C2299e.f9109L;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q4, 54);
                iHashCode5 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, c2314t2);
                c28655q4.m87158i0();
                c2314t3 = c2314t2;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m5);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N5);
                float f26 = 4;
                float f27 = f24 * f26;
                float f28 = 24;
                c0209i3 = c0209i2;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c22093e.getBedTimeIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f28, AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, f27, f27, 3)), c38072d.m121949b(c28655q4, 6).getWhite70(), c28655q4, 432, 0);
                f17 = 28 * f26;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22093e.getBedTimeTimeDisplay(), c28655q4, 0), AbstractC1099a.m3398t(AbstractC1102d.m3425v(c2314t3, 0.0f, f17, 1), 0.0f, 0.0f, 0.0f, f26, 7), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN55(), null, c28655q4, 48, 0, 196088);
                c28655q = c28655q4;
                if (c22093e.getBedtimePeriodDisplay() == null && z4) {
                    c28655q.m87150e0(-811282649);
                    c2314t4 = c2314t3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22093e.getBedtimePeriodDisplay(), c28655q, 0), AbstractC1099a.m3398t(c2314t3, ((float) 0.1d) * f13, 0.0f, 0.0f, ((float) 0.8d) * f13, 6), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN8(), null, c28655q, 48, 0, 196088);
                    c28655q = c28655q;
                    i17 = 0;
                    c28655q.m87173q(false);
                } else {
                    c2314t4 = c2314t3;
                    i17 = 0;
                    c28655q.m87150e0(-810814797);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c2314t5 = c2314t4;
                c28655q2 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22093e.getBedTimeTitle(), c28655q, i17), AbstractC1102d.m3425v(c2314t5, 0.0f, 29 * f26, 1), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH6(), null, c28655q2, 48, 0, 196088);
                c28655q2.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f15, AbstractC1102d.m3425v(new LayoutWeightElement(f18, false), 0.0f, 18 * f26, 1)), EnumC17744g.DOTTED, null, null, null, 0L, c38072d.m121949b(c28655q2, 6).getWhite30(), null, c28655q2, 48, 188);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 48);
                iHashCode6 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                    c0209i4 = c0209i3;
                } else {
                    c0209i4 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q2, 54);
                iHashCode7 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, c2314t5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m7);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode7))) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q2, iHashCode7, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N7);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c22093e.getWakeTimeIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(f28, AbstractC1099a.m3398t(c2314t5, 0.0f, 0.0f, f27, f27, 3)), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 432, 0);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22093e.getWakeTimeTimeDisplay(), c28655q2, 0), AbstractC1099a.m3398t(AbstractC1102d.m3425v(c2314t5, 0.0f, f17, 1), 0.0f, 0.0f, 0.0f, f26, 7), c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN55(), null, c28655q2, 48, 0, 196088);
                c28655q3 = c28655q2;
                if (c22093e.getWaketimePeriodDisplay() == null && z4) {
                    c28655q3.m87150e0(-904809891);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22093e.getWaketimePeriodDisplay(), c28655q3, 0), AbstractC1099a.m3398t(c2314t5, ((float) 0.1d) * f13, 0.0f, 0.0f, ((float) 0.8d) * f13, 6), c38072d.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getN8(), null, c28655q3, 48, 0, 196088);
                    c28655q3 = c28655q3;
                    i18 = 0;
                    c28655q3.m87173q(false);
                } else {
                    i18 = 0;
                    c28655q3.m87150e0(-904341078);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(true);
                c22093e2 = c22093e;
                C28655q c28655q5 = c28655q3;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(m63174I(c22093e2, c28655q3, (i16 >> 3) & 14), c28655q3, i18), AbstractC1102d.m3425v(c2314t5, 0.0f, f17, 1), m63172G(c22093e2.getWakeTimeLabelStyle(), c28655q3, i18), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getH6(), null, c28655q5, 48, 0, 196088);
                c28655q4 = c28655q5;
                textResourceM63228q = c22093e2.getWakeTimeSubTitle();
                if (textResourceM63228q == null) {
                    c28655q4.m87150e0(-586362305);
                    z14 = false;
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-586362304);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM63228q, c28655q4, 0), AbstractC1102d.m3425v(c2314t5, 0.0f, f17, 1), c38072d.m121949b(c28655q4, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getH6(), null, c28655q4, 48, 0, 196088);
                    c28655q4 = c28655q4;
                    z14 = false;
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(true);
                c28655q4.m87173q(true);
                c28655q4.m87173q(z14);
                if (c22093e2.getCtaButtonText() != null) {
                    c28655q4.m87150e0(-801096587);
                    String strM63220i = c22093e2.getCtaButtonText();
                    Integer numM63219h = c22093e2.getCtaButtonIcon();
                    boolean zM87157i = c28655q4.m87157i(c22093e2);
                    i19 = i16;
                    if ((i19 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i | z15;
                    objM87133R = c28655q4.m87133R();
                    if (z16) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R == c28676v1) {
                            function6 = function5;
                        }
                        float f29 = ((float) 0.125d) * f13;
                        C28655q c28655q6 = c28655q4;
                        m63167B(strM63220i, numM63219h, (InterfaceC4339a) objM87133R, AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t5), f15, f14, f29, f29), c28655q6, 0, 0);
                        c28655q4 = c28655q6;
                        c28655q4.m87173q(false);
                    }
                    function6 = function5;
                    objM87133R = new C22091c(c22093e2, function6, 1);
                    c28655q4.m87172p0(objM87133R);
                    float f210 = ((float) 0.125d) * f13;
                    C28655q c28655q7 = c28655q4;
                    m63167B(strM63220i, numM63219h, (InterfaceC4339a) objM87133R, AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t5), f15, f14, f210, f210), c28655q7, 0, 0);
                    c28655q4 = c28655q7;
                    c28655q4.m87173q(false);
                } else {
                    function6 = function5;
                    c28676v1 = c28676v0;
                    i19 = i16;
                    c28655q4.m87150e0(-800689123);
                    c28655q4.m87173q(false);
                }
                if (c22093e2.getCtaButtonText() == null || c22093e2.getAlarmStatus() == null) {
                    c28655q4.m87150e0(-800306211);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(-800600277);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1099a.m3394p(f15, c2314t5));
                    C4104r0 c4104r0 = new C4104r0();
                    C4118t0 c4118t0M63213a = c22093e2.getAlarmStatus();
                    boolean zM87157i2 = c28655q4.m87157i(c22093e2) | ((i19 & 7168) == 2048);
                    Object objM87133R3 = c28655q4.m87133R();
                    if (zM87157i2 || objM87133R3 == c28676v1) {
                        objM87133R3 = new C3526n(18, c22093e2, function6);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    c4104r0.Compose(c4118t0M63213a, (Function1) objM87133R3, c28655q4, 0);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1099a.m3394p(((float) 1.5d) * f13, c2314t5));
                    c28655q4.m87173q(false);
                }
                c28655q4.m87173q(true);
                function3 = function6;
            } else {
                c28655q4.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q4.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14143e(i13, i14, 4, modifier, c22093e2, function3, z4);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1169) != 1168) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21714b(14);
                    c28655q4.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            float f211 = 1;
            f13 = 8;
            f14 = f211 * f13;
            f15 = 2 * f13;
            c2314t = C2314t.f9131w;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, f15, f15, 1);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9110M, c28655q4, 0);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i8 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i8, c23010xM66775a4);
            C0209i c0209i9 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i9, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i10, modifierM118962N8);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, f14, 5));
            function5 = function4;
            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierM3409f2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i8, c22994r1M66759a5);
            AbstractC28683x.m87239G(c28655q4, c0209i9, interfaceC28653p1M87165m9);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i10, modifierM118962N9);
            AbstractC22953f.m66715b(c28655q4, AbstractC1099a.m3394p(f14, c2314t));
            String strM21274h2 = AbstractC8693b.m21274h(c22093e2.getTitle(), c28655q4, 0);
            c38072d = C38072d.f163053a;
            C2886a c2886aM8414L2 = c38072d.m121952e(c28655q4, 6).getSh4();
            if (z4) {
                jM73370c = AbstractC25012a.m73366B(c28655q4, -507337069, c38072d, c28655q4, 6);
            } else {
                jM73370c = AbstractC25012a.m73370c(c28655q4, -507335984, c38072d, c28655q4, 6);
            }
            c28655q4.m87173q(false);
            i16 = i15;
            AbstractC30795n.m94707h(strM21274h2, null, jM73370c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L2, null, c28655q4, 0, 0, 196602);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f16 = Float.MAX_VALUE;
            } else {
                f16 = 1.0f;
            }
            AbstractC22953f.m66715b(c28655q4, new LayoutWeightElement(f16, true));
            if (c22093e.getDestination() != null) {
                c2314t2 = c2314t;
                c28655q4.m87150e0(1453067513);
                c28655q4.m87173q(false);
            } else {
                c2314t2 = c2314t;
                c28655q4.m87150e0(1453067513);
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
            c28655q4.m87150e0(-1688584750);
            Modifier modifierM3397s2 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t2), f15, f14, f15, f14);
            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q4, 6);
            iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM3397s2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i8, c22994r1M66759a6);
            AbstractC28683x.m87239G(c28655q4, c0209i9, interfaceC28653p1M87165m10);
            if (c28655q4.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i10, modifierM118962N10);
            C2305k c2305k2 = C2299e.f9111N;
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q4, 48);
            iHashCode4 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, c2314t2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i8, c23010xM66775a5);
            AbstractC28683x.m87239G(c28655q4, c0209i9, interfaceC28653p1M87165m11);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i10, modifierM118962N11);
            C22961h c22961h2 = AbstractC22977m.f90654e;
            C2306l c2306l2 = C2299e.f9109L;
            C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q4, 54);
            iHashCode5 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, c2314t2);
            c28655q4.m87158i0();
            c2314t3 = c2314t2;
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i8, c22994r1M66759a7);
            AbstractC28683x.m87239G(c28655q4, c0209i9, interfaceC28653p1M87165m12);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i10, modifierM118962N12);
            float f212 = 4;
            float f213 = f211 * f212;
            float f214 = 24;
            c0209i3 = c0209i2;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c22093e.getBedTimeIcon(), c28655q4, 6), null, AbstractC1102d.m3419p(f214, AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, f213, f213, 3)), c38072d.m121949b(c28655q4, 6).getWhite70(), c28655q4, 432, 0);
            f17 = 28 * f212;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22093e.getBedTimeTimeDisplay(), c28655q4, 0), AbstractC1099a.m3398t(AbstractC1102d.m3425v(c2314t3, 0.0f, f17, 1), 0.0f, 0.0f, 0.0f, f212, 7), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN55(), null, c28655q4, 48, 0, 196088);
            c28655q = c28655q4;
            if (c22093e.getBedtimePeriodDisplay() == null) {
                c2314t4 = c2314t3;
                i17 = 0;
                c28655q.m87150e0(-810814797);
                c28655q.m87173q(false);
            } else {
                c2314t4 = c2314t3;
                i17 = 0;
                c28655q.m87150e0(-810814797);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c2314t5 = c2314t4;
            c28655q2 = c28655q;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22093e.getBedTimeTitle(), c28655q, i17), AbstractC1102d.m3425v(c2314t5, 0.0f, 29 * f212, 1), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH6(), null, c28655q2, 48, 0, 196088);
            c28655q2.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f18 = Float.MAX_VALUE;
            } else {
                f18 = 1.0f;
            }
            AbstractC17755i2.m50938j(AbstractC1099a.m3394p(f15, AbstractC1102d.m3425v(new LayoutWeightElement(f18, false), 0.0f, 18 * f212, 1)), EnumC17744g.DOTTED, null, null, null, 0L, c38072d.m121949b(c28655q2, 6).getWhite30(), null, c28655q2, 48, 188);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 48);
            iHashCode6 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, c2314t5);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m13);
            if (c28655q2.f115903S) {
                c0209i4 = c0209i3;
                AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i4);
            } else {
                c0209i4 = c0209i3;
                AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N13);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q2, 54);
            iHashCode7 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, c2314t5);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i8, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m14);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode7, c28655q2, iHashCode7, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode7, c28655q2, iHashCode7, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N14);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c22093e.getWakeTimeIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(f214, AbstractC1099a.m3398t(c2314t5, 0.0f, 0.0f, f213, f213, 3)), c38072d.m121949b(c28655q2, 6).getWhite70(), c28655q2, 432, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22093e.getWakeTimeTimeDisplay(), c28655q2, 0), AbstractC1099a.m3398t(AbstractC1102d.m3425v(c2314t5, 0.0f, f17, 1), 0.0f, 0.0f, 0.0f, f212, 7), c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN55(), null, c28655q2, 48, 0, 196088);
            c28655q3 = c28655q2;
            if (c22093e.getWaketimePeriodDisplay() == null) {
                i18 = 0;
                c28655q3.m87150e0(-904341078);
                c28655q3.m87173q(false);
            } else {
                i18 = 0;
                c28655q3.m87150e0(-904341078);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            c22093e2 = c22093e;
            C28655q c28655q8 = c28655q3;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(m63174I(c22093e2, c28655q3, (i16 >> 3) & 14), c28655q3, i18), AbstractC1102d.m3425v(c2314t5, 0.0f, f17, 1), m63172G(c22093e2.getWakeTimeLabelStyle(), c28655q3, i18), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getH6(), null, c28655q8, 48, 0, 196088);
            c28655q4 = c28655q8;
            textResourceM63228q = c22093e2.getWakeTimeSubTitle();
            if (textResourceM63228q == null) {
                c28655q4.m87150e0(-586362305);
                z14 = false;
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(-586362304);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM63228q, c28655q4, 0), AbstractC1102d.m3425v(c2314t5, 0.0f, f17, 1), c38072d.m121949b(c28655q4, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getH6(), null, c28655q4, 48, 0, 196088);
                c28655q4 = c28655q4;
                z14 = false;
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
            c28655q4.m87173q(true);
            c28655q4.m87173q(z14);
            if (c22093e2.getCtaButtonText() != null) {
                c28655q4.m87150e0(-801096587);
                String strM63220i2 = c22093e2.getCtaButtonText();
                Integer numM63219h2 = c22093e2.getCtaButtonIcon();
                boolean zM87157i3 = c28655q4.m87157i(c22093e2);
                i19 = i16;
                if ((i19 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i3 | z15;
                objM87133R = c28655q4.m87133R();
                if (z16) {
                    c28676v1 = c28676v0;
                    if (objM87133R == c28676v1) {
                        function6 = function5;
                    }
                    float f215 = ((float) 0.125d) * f13;
                    C28655q c28655q9 = c28655q4;
                    m63167B(strM63220i2, numM63219h2, (InterfaceC4339a) objM87133R, AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t5), f15, f14, f215, f215), c28655q9, 0, 0);
                    c28655q4 = c28655q9;
                    c28655q4.m87173q(false);
                } else {
                    c28676v1 = c28676v0;
                }
                function6 = function5;
                objM87133R = new C22091c(c22093e2, function6, 1);
                c28655q4.m87172p0(objM87133R);
                float f216 = ((float) 0.125d) * f13;
                C28655q c28655q10 = c28655q4;
                m63167B(strM63220i2, numM63219h2, (InterfaceC4339a) objM87133R, AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t5), f15, f14, f216, f216), c28655q10, 0, 0);
                c28655q4 = c28655q10;
                c28655q4.m87173q(false);
            } else {
                function6 = function5;
                c28676v1 = c28676v0;
                i19 = i16;
                c28655q4.m87150e0(-800689123);
                c28655q4.m87173q(false);
            }
            if (c22093e2.getCtaButtonText() == null) {
                c28655q4.m87150e0(-800306211);
                c28655q4.m87173q(false);
            } else {
                c28655q4.m87150e0(-800306211);
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
            function3 = function6;
        } else {
            c28655q4.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q4.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14143e(i13, i14, 4, modifier, c22093e2, function3, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m63189o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m63190p(C22093e c22093e, Function1 function1) {
        C9598e c9598eM63221j = c22093e.getDestination();
        if (c9598eM63221j != null) {
            function1.invoke(c9598eM63221j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m63191q(C22093e c22093e, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e c9598eM63221j = c22093e.getDestination();
        if (c9598eM63221j != null) {
            function1.invoke(c9598eM63221j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m63192r(Modifier modifier, C22093e c22093e, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m63188n(modifier, c22093e, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:104:0x030b  */
    /* JADX WARN: Code duplicated, block: B:107:0x031e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0330  */
    /* JADX WARN: Code duplicated, block: B:116:0x0359  */
    /* JADX WARN: Code duplicated, block: B:119:0x0373  */
    /* JADX WARN: Code duplicated, block: B:123:0x0389  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:129:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:136:0x0404  */
    /* JADX WARN: Code duplicated, block: B:138:0x0413  */
    /* JADX WARN: Code duplicated, block: B:141:0x041d  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:79:0x0229  */
    /* JADX WARN: Code duplicated, block: B:95:0x029b  */
    /* JADX WARN: Code duplicated, block: B:98:0x02eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r3v17, types: [c41.r0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    private static final void m63193s(Modifier modifier, C22093e c22093e, boolean z4, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Function1 function2;
        int i16;
        boolean z13;
        Function1 function3;
        ?? r10;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        float f13;
        C38072d c38072d;
        Function1 function5;
        float f14;
        C2886a c2886aM8437r;
        ?? r14;
        ?? r15;
        InterfaceC39171c interfaceC39171c;
        Object objM87133R;
        Object obj;
        C12684r c12684r;
        Object objM87133R2;
        Object obj2;
        C12677k c12677k;
        Object objM87133R3;
        Object obj3;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R4;
        Object obj4;
        C12679m c12679m;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87157i;
        Object objM87133R6;
        Object objM87133R7;
        Object obj5;
        boolean zM87157i2;
        Object obj6;
        ?? r16;
        int i17;
        Object obj7;
        float f15;
        boolean z14;
        long jM73366B;
        Object objM87133R8;
        Object obj8;
        C22093e c22093e2 = c22093e;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2119965805);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c22093e2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i16 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj8 = objM87133R8;
                        C21875f c21875f = new C21875f(16);
                        c28655q.m87172p0(c21875f);
                        obj8 = c21875f;
                    }
                    obj8 = objM87133R8;
                    function4 = (Function1) obj8;
                } else {
                    function4 = function2;
                }
                float f16 = 8;
                float f17 = 2 * f16;
                c2314t = C2314t.f9131w;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f17, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * f16, 0.0f, f17, 5));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c22093e.getLeftIcon(), c28655q, 6);
                Modifier modifierM44112a = AbstractC15680h.m44112a(c2314t, true);
                if (z4) {
                    float f18 = 4;
                    f13 = f18 * f18;
                } else {
                    f13 = 6 * 4;
                }
                Modifier modifierM3419p = AbstractC1102d.m3419p(f13, modifierM44112a);
                c38072d = C38072d.f163053a;
                function5 = function4;
                AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 48, 0);
                f14 = 1 * f16;
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(f14, c2314t));
                String strM21274h = AbstractC8693b.m21274h(c22093e.getTitle(), c28655q, 0);
                if (z4) {
                    c28655q.m87150e0(1987808970);
                    c2886aM8437r = c38072d.m121952e(c28655q, 6).getSh4();
                } else {
                    c28655q.m87150e0(1987809961);
                    c2886aM8437r = c38072d.m121952e(c28655q, 6).getH4();
                }
                c28655q.m87173q(false);
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, 0, 196602);
                r14 = c28655q;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(r14, new LayoutWeightElement(1.0f, true));
                if (c22093e.getDestination() != null || c22093e.getRightIcon() == null) {
                    r15 = 0;
                    r14.m87150e0(1493229243);
                    r14.m87173q(false);
                } else {
                    r14.m87150e0(1492779495);
                    C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c22093e.getRightIcon().intValue(), r14, 6);
                    String strM21275i = AbstractC8693b.m21275i("navigate", r14, 6);
                    Modifier modifierM44112a2 = AbstractC15680h.m44112a(c2314t, true);
                    if (z4) {
                        float f19 = 4;
                        f15 = f19 * f19;
                    } else {
                        f15 = 4 * 5;
                    }
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(f15, modifierM44112a2);
                    if (z4) {
                        jM73366B = AbstractC31061c.m95627c(r14, 1987829006, c38072d, r14, 6);
                        z14 = false;
                    } else {
                        z14 = false;
                        jM73366B = AbstractC25012a.m73366B(r14, 1987830001, c38072d, r14, 6);
                    }
                    r14.m87173q(z14);
                    AbstractC15005f3.m43108b(c27430eM107874S2, strM21275i, modifierM3419p2, jM73366B, r14, 0, 0);
                    r14.m87173q(z14);
                    r15 = z14;
                }
                r14.m87173q(true);
                AbstractC22953f.m66715b(r14, AbstractC1099a.m3394p(f14, c2314t));
                r14.m87150e0(806566218);
                Modifier modifierMo3471e = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, f17, 0.0f, 10).mo3471e(modifier);
                r14.m87150e0(-1003410150);
                r14.m87150e0(212064437);
                r14.m87173q(r15);
                interfaceC39171c = (InterfaceC39171c) r14.m87161k(AbstractC2453v1.f9569h);
                objM87133R = r14.m87133R();
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    C12684r c12684r2 = new C12684r(interfaceC39171c);
                    r14.m87172p0(c12684r2);
                    obj = c12684r2;
                }
                c12684r = (C12684r) obj;
                objM87133R2 = r14.m87133R();
                obj2 = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    C12677k c12677k2 = new C12677k();
                    r14.m87172p0(c12677k2);
                    obj2 = c12677k2;
                }
                c12677k = (C12677k) obj2;
                objM87133R3 = r14.m87133R();
                obj3 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(Boolean.FALSE);
                    r14.m87172p0(c28633k1M87272z);
                    obj3 = c28633k1M87272z;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj3;
                objM87133R4 = r14.m87133R();
                obj4 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C12679m c12679m2 = new C12679m(c12677k);
                    r14.m87172p0(c12679m2);
                    obj4 = c12679m2;
                }
                c12679m = (C12679m) obj4;
                objM87133R5 = r14.m87133R();
                if (objM87133R5 == c28676v0) {
                    C28633k1 c28633k1 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                    r14.m87172p0(c28633k1);
                    objM87133R5 = c28633k1;
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
                zM87157i = r14.m87157i(c12684r) | r14.m87149e(257);
                objM87133R6 = r14.m87133R();
                if (zM87157i || objM87133R6 == c28676v0) {
                    j jVar = new j(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    r14.m87172p0(jVar);
                    objM87133R6 = jVar;
                }
                InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R6;
                objM87133R7 = r14.m87133R();
                obj5 = objM87133R7;
                if (objM87133R7 == c28676v0) {
                    k kVar = new k(interfaceC28601c1, c12679m);
                    r14.m87172p0(kVar);
                    obj5 = kVar;
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj5;
                zM87157i2 = r14.m87157i(c12684r);
                Object objM87133R9 = r14.m87133R();
                obj6 = objM87133R9;
                if (zM87157i2 || objM87133R9 == c28676v0) {
                    l lVar = new l(c12684r);
                    r14.m87172p0(lVar);
                    obj6 = lVar;
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifierMo3471e, r15, (Function1) obj6);
                c22093e2 = c22093e;
                AbstractC39125q1.m124655a(modifierM51775c, AbstractC37817c.m121344e(1200550679, r14, new m(interfaceC28601c2, c12677k, interfaceC4339a, c22093e, c22093e, z4)), interfaceC39127r0, r14, 48);
                r14.m87173q(r15);
                r14.m87173q(r15);
                if (c22093e2.getAlarmStatus() != null) {
                    r14.m87150e0(-759334420);
                    AbstractC22953f.m66715b(r14, AbstractC1099a.m3394p(f14, c2314t));
                    ?? c4104r0 = new C4104r0();
                    C4118t0 c4118t0M63213a = c22093e2.getAlarmStatus();
                    boolean zM87157i3 = r14.m87157i(c22093e2);
                    if ((i16 & 7168) == 2048) {
                        r16 = 1;
                    } else {
                        r16 = r15;
                    }
                    i17 = (zM87157i3 ? 1 : 0) | r16;
                    Object objM87133R10 = r14.m87133R();
                    obj7 = objM87133R10;
                    if (i17 == 0 || objM87133R10 == c28676v0) {
                        C21851c c21851c = new C21851c(8, c22093e2, function5);
                        r14.m87172p0(c21851c);
                        obj7 = c21851c;
                    }
                    c4104r0.Compose(c4118t0M63213a, (Function1) obj7, r14, r15);
                    r14.m87173q(r15);
                } else {
                    r14.m87150e0(-759100897);
                    r14.m87173q(r15);
                }
                r14.m87173q(true);
                function3 = function5;
                r10 = r14;
            } else {
                c28655q.m87138X();
                function3 = function2;
                r10 = c28655q;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(modifier, (Object) c22093e2, z4, (InterfaceC23459e) function3, i13, i14, 17);
            }
        }
        i15 |= 3072;
        function2 = function1;
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i16 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    obj8 = objM87133R8;
                    C21875f c21875f2 = new C21875f(16);
                    c28655q.m87172p0(c21875f2);
                    obj8 = c21875f2;
                }
                obj8 = objM87133R8;
                function4 = (Function1) obj8;
            } else {
                function4 = function2;
            }
            float f110 = 8;
            float f111 = 2 * f110;
            c2314t = C2314t.f9131w;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f111, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * f110, 0.0f, f111, 5));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            C27430e c27430eM107874S3 = AbstractC34132o.m107874S(c22093e.getLeftIcon(), c28655q, 6);
            Modifier modifierM44112a3 = AbstractC15680h.m44112a(c2314t, true);
            if (z4) {
                float f112 = 4;
                f13 = f112 * f112;
            } else {
                f13 = 6 * 4;
            }
            Modifier modifierM3419p3 = AbstractC1102d.m3419p(f13, modifierM44112a3);
            c38072d = C38072d.f163053a;
            function5 = function4;
            AbstractC15005f3.m43108b(c27430eM107874S3, null, modifierM3419p3, c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 48, 0);
            f14 = 1 * f110;
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(f14, c2314t));
            String strM21274h2 = AbstractC8693b.m21274h(c22093e.getTitle(), c28655q, 0);
            if (z4) {
                c28655q.m87150e0(1987808970);
                c2886aM8437r = c38072d.m121952e(c28655q, 6).getSh4();
            } else {
                c28655q.m87150e0(1987809961);
                c2886aM8437r = c38072d.m121952e(c28655q, 6).getH4();
            }
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, 0, 196602);
            r14 = c28655q;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(r14, new LayoutWeightElement(1.0f, true));
            if (c22093e.getDestination() != null) {
                r15 = 0;
                r14.m87150e0(1493229243);
                r14.m87173q(false);
            } else {
                r15 = 0;
                r14.m87150e0(1493229243);
                r14.m87173q(false);
            }
            r14.m87173q(true);
            AbstractC22953f.m66715b(r14, AbstractC1099a.m3394p(f14, c2314t));
            r14.m87150e0(806566218);
            Modifier modifierMo3471e2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f111, 0.0f, f111, 0.0f, 10).mo3471e(modifier);
            r14.m87150e0(-1003410150);
            r14.m87150e0(212064437);
            r14.m87173q(r15);
            interfaceC39171c = (InterfaceC39171c) r14.m87161k(AbstractC2453v1.f9569h);
            objM87133R = r14.m87133R();
            obj = objM87133R;
            if (objM87133R == c28676v0) {
                C12684r c12684r3 = new C12684r(interfaceC39171c);
                r14.m87172p0(c12684r3);
                obj = c12684r3;
            }
            c12684r = (C12684r) obj;
            objM87133R2 = r14.m87133R();
            obj2 = objM87133R2;
            if (objM87133R2 == c28676v0) {
                C12677k c12677k3 = new C12677k();
                r14.m87172p0(c12677k3);
                obj2 = c12677k3;
            }
            c12677k = (C12677k) obj2;
            objM87133R3 = r14.m87133R();
            obj3 = objM87133R3;
            if (objM87133R3 == c28676v0) {
                C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(Boolean.FALSE);
                r14.m87172p0(c28633k1M87272z2);
                obj3 = c28633k1M87272z2;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj3;
            objM87133R4 = r14.m87133R();
            obj4 = objM87133R4;
            if (objM87133R4 == c28676v0) {
                C12679m c12679m3 = new C12679m(c12677k);
                r14.m87172p0(c12679m3);
                obj4 = c12679m3;
            }
            c12679m = (C12679m) obj4;
            objM87133R5 = r14.m87133R();
            if (objM87133R5 == c28676v0) {
                C28633k1 c28633k2 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                r14.m87172p0(c28633k2);
                objM87133R5 = c28633k2;
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
            zM87157i = r14.m87157i(c12684r) | r14.m87149e(257);
            objM87133R6 = r14.m87133R();
            if (zM87157i) {
                j jVar2 = new j(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                r14.m87172p0(jVar2);
                objM87133R6 = jVar2;
            } else {
                j jVar3 = new j(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                r14.m87172p0(jVar3);
                objM87133R6 = jVar3;
            }
            InterfaceC39127r0 interfaceC39127r1 = (InterfaceC39127r0) objM87133R6;
            objM87133R7 = r14.m87133R();
            obj5 = objM87133R7;
            if (objM87133R7 == c28676v0) {
                k kVar2 = new k(interfaceC28601c1, c12679m);
                r14.m87172p0(kVar2);
                obj5 = kVar2;
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj5;
            zM87157i2 = r14.m87157i(c12684r);
            Object objM87133R11 = r14.m87133R();
            obj6 = objM87133R11;
            if (zM87157i2) {
                l lVar2 = new l(c12684r);
                r14.m87172p0(lVar2);
                obj6 = lVar2;
            } else {
                l lVar3 = new l(c12684r);
                r14.m87172p0(lVar3);
                obj6 = lVar3;
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierMo3471e2, r15, (Function1) obj6);
            c22093e2 = c22093e;
            AbstractC39125q1.m124655a(modifierM51775c2, AbstractC37817c.m121344e(1200550679, r14, new m(interfaceC28601c2, c12677k, interfaceC4339a2, c22093e, c22093e, z4)), interfaceC39127r1, r14, 48);
            r14.m87173q(r15);
            r14.m87173q(r15);
            if (c22093e2.getAlarmStatus() != null) {
                r14.m87150e0(-759334420);
                AbstractC22953f.m66715b(r14, AbstractC1099a.m3394p(f14, c2314t));
                ?? c4104r1 = new C4104r0();
                C4118t0 c4118t0M63213a2 = c22093e2.getAlarmStatus();
                boolean zM87157i4 = r14.m87157i(c22093e2);
                if ((i16 & 7168) == 2048) {
                    r16 = 1;
                } else {
                    r16 = r15;
                }
                i17 = (zM87157i4 ? 1 : 0) | r16;
                Object objM87133R12 = r14.m87133R();
                obj7 = objM87133R12;
                if (i17 == 0) {
                    C21851c c21851c2 = new C21851c(8, c22093e2, function5);
                    r14.m87172p0(c21851c2);
                    obj7 = c21851c2;
                } else {
                    C21851c c21851c3 = new C21851c(8, c22093e2, function5);
                    r14.m87172p0(c21851c3);
                    obj7 = c21851c3;
                }
                c4104r1.Compose(c4118t0M63213a2, (Function1) obj7, r14, r15);
                r14.m87173q(r15);
            } else {
                r14.m87150e0(-759100897);
                r14.m87173q(r15);
            }
            r14.m87173q(true);
            function3 = function5;
            r10 = r14;
        } else {
            c28655q.m87138X();
            function3 = function2;
            r10 = c28655q;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(modifier, (Object) c22093e2, z4, (InterfaceC23459e) function3, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m63194t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m63195u(C22093e c22093e, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e c9598eM63221j = c22093e.getDestination();
        if (c9598eM63221j != null) {
            function1.invoke(c9598eM63221j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m63196v(Modifier modifier, C22093e c22093e, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m63193s(modifier, c22093e, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public static final void m63197w(Modifier modifier, C22093e viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        FeatureFlagChecker featureFlagChecker;
        boolean z13;
        long white5;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1757242031);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21714b(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                if (z13) {
                    c28655q.m87150e0(-787428328);
                    white5 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-787427337);
                    white5 = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, m63173H(c2314t, viewState.getBackgroundStyle()));
                zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C22091c(viewState, function4, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15).mo3471e(modifier2), c33252iM105489e, white5, null, 0 * f13, AbstractC37817c.m121344e(1682463220, c28655q, new C21918i(viewState, modifier2, z13, function4)), c28655q, 1769472, 24);
                modifier3 = modifier2;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2158a(modifier3, viewState, function3, i13, i14, 6);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21714b(13);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                z13 = true;
            } else {
                z13 = true;
            }
            float f14 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f14);
            if (z13) {
                c28655q.m87150e0(-787428328);
                white5 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-787427337);
                white5 = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, m63173H(c2314t, viewState.getBackgroundStyle()));
            zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C22091c(viewState, function4, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C22091c(viewState, function4, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15).mo3471e(modifier2), c33252iM105489e2, white5, null, 0 * f14, AbstractC37817c.m121344e(1682463220, c28655q, new C21918i(viewState, modifier2, z13, function4)), c28655q, 1769472, 24);
            modifier3 = modifier2;
            function3 = function4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(modifier3, viewState, function3, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m63198x(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m63199y(C22093e c22093e, Function1 function1) {
        C9598e c9598eM63221j = c22093e.getDestination();
        if (c9598eM63221j != null) {
            function1.invoke(c9598eM63221j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m63200z(C22093e c22093e, Modifier modifier, boolean z4, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            int i14 = n.f85678a[c22093e.getHeightStyle().ordinal()];
            if (i14 == 1) {
                c28655q.m87150e0(1939453677);
                m63193s(modifier, c22093e, z4, function1, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                if (i14 != 2) {
                    throw AbstractC11895b.m32003v(1939451798, c28655q, false);
                }
                c28655q.m87150e0(1939458701);
                m63188n(modifier, c22093e, z4, function1, c28655q, 0, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
