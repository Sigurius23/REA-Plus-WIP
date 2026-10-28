package d71;

import a71.C0520a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b61.AbstractC2756k;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.preview.C9809a;
import com.whoop.service.network.model.UserSessionDto;
import dp0.C12253i;
import e61.AbstractC12766i;
import e71.C12800a;
import e71.C12801b;
import e93.AbstractC12889b;
import fy1.C14873i;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21374h;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import u61.C34555d;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: d71.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0018\u0010\n\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\n\u001aE\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0003¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'\u001a)\u0010(\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Ll83/a0;", "c", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lj71/c;", "state", "e", "(Landroidx/compose/ui/Modifier;Lj71/c;Landroidx/compose/runtime/Composer;I)V", "k", "(Landroidx/compose/runtime/Composer;I)Lj71/c;", "", "Lj71/b$b;", "l", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "", "xIndex", "", "value", "Lcom/whoop/design/util/TextResource;", "topText", "bottomText", "j", "(IFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)Lj71/b$b;", "n", "Le71/a;", "o", "(IFLandroidx/compose/runtime/Composer;I)Le71/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "yPercent", "heightPercent", "Ly3/f;", "cornerRadius", "g", "(IFFFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)Lj71/b$b;", "Li2/x;", "color", "Le71/b;", "m", "(FJ)Le71/b;", "i", "(FFFLandroidx/compose/runtime/Composer;II)Le71/b;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11759e {

    /* JADX INFO: renamed from: d71.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m31481a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(1111758229);
            AbstractC11759e.m31470e(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), AbstractC11759e.m31479n(c28655q, 0), c28655q, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m31481a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d71.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f38033w = new b();

        /* JADX INFO: renamed from: a */
        public final long m31482a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m31482a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: d71.e$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f38034w = new c();

        /* JADX INFO: renamed from: a */
        public final long m31483a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m31483a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m31468c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(864518650);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m31469d(int i13, Composer composer, int i14) {
        m31468c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m31470e(Modifier modifier, C21395c state, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C21395c c21395c;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1173362546);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            modifier2 = modifier;
            c21395c = state;
            AbstractC2756k.m7799p(modifier2, c21395c, null, null, false, null, null, c28655q, i14 & 126, 124);
        } else {
            modifier2 = modifier;
            c21395c = state;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(modifier2, c21395c, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m31471f(Modifier modifier, C21395c c21395c, int i13, Composer composer, int i14) {
        m31470e(modifier, c21395c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final AbstractC21394b.b m31472g(int i13, float f13, float f14, float f15, TextResource textResource, TextResource textResource2, Composer composer, int i14, int i15) {
        float f16 = (i15 & 8) != 0 ? 1 * 4 : f15;
        TextResource textResourceM21267a = (i15 & 16) != 0 ? AbstractC8693b.m21267a() : textResource;
        TextResource textResourceM21267a2 = (i15 & 32) != 0 ? AbstractC8693b.m21267a() : textResource2;
        List listM118958J = AbstractC37056f.m118958J(m31474i(f13, f14, f16, composer, (i14 >> 3) & 1022, 0));
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Day " + i13 + " - Value is " + f14);
        float f17 = ((float) i13) / 8.0f;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = b.f38033w;
            c28655q.m87172p0(objM87133R);
        }
        C34555d c34555d = new C34555d(textResourceM21267a, p745y81.Function1.m125323a((Function1) objM87133R), true, false, 8, null);
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = c.f38034w;
            c28655q.m87172p0(objM87133R2);
        }
        return new AbstractC21394b.b(AbstractC37056f.m118958J(new C12800a(textResourceM21278l, listM118958J, f17, 0.075f, null, new C34555d(textResourceM21267a2, p745y81.Function1.m125323a((Function1) objM87133R2), false, false, 12, null), c34555d, null, false, 400, null)), "id", false, false, 12, null);
    }

    /* JADX INFO: renamed from: h */
    public static final C21395c m31473h(Composer composer, int i13) {
        C21374h c21374hM35763s = AbstractC12766i.m35763s("Floating Graph", false, false, false, false, 28, null);
        return new C21395c(c21374hM35763s.m59985a((8187 & 1) != 0 ? c21374hM35763s.startVerticalAxis : null, (8187 & 2) != 0 ? c21374hM35763s.endVerticalAxis : null, (8187 & 4) != 0 ? c21374hM35763s.bottomHorizontalAxis : null, (8187 & 8) != 0 ? c21374hM35763s.topHorizontalAxis : null, (8187 & 16) != 0 ? c21374hM35763s.insets : null, (8187 & 32) != 0 ? c21374hM35763s.lines : null, (8187 & 64) != 0 ? c21374hM35763s.graphAnnotations : null, (8187 & 128) != 0 ? c21374hM35763s.accessibilityState : null, (8187 & 256) != 0 ? c21374hM35763s.scrubberEnabled : false, (8187 & 512) != 0 ? c21374hM35763s.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21374hM35763s.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21374hM35763s.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? c21374hM35763s.horizontalGridLinePadding : 0.0f), AbstractC37056f.m118959K(m31472g(1, 0.1f, 0.1f, 0.0f, AbstractC8693b.m21278l("1000"), AbstractC8693b.m21278l("2"), composer, 438, 8), m31472g(2, 0.25f, 0.5f, 0.0f, AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), AbstractC8693b.m21278l("200"), composer, 438, 8), m31472g(3, 0.6f, 0.3f, 0.0f, AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), AbstractC8693b.m21278l("23"), composer, 438, 8), m31472g(4, 0.1f, 0.8f, 0.0f, AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), AbstractC8693b.m21278l("2"), composer, 438, 8), m31472g(5, 0.0f, 1.0f, 0.0f, null, null, composer, 438, 56), m31472g(6, 0.25f, 0.3f, 0.0f, AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), AbstractC8693b.m21278l("21"), composer, 438, 8), m31472g(7, 0.1f, 0.5f, 2 * 4, AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), AbstractC8693b.m21278l("2"), composer, 3510, 0)), null, null, 12, null);
    }

    /* JADX INFO: renamed from: i */
    private static final C12801b m31474i(float f13, float f14, float f15, Composer composer, int i13, int i14) {
        float f16;
        if ((i14 & 4) != 0) {
            f16 = 4 * 1;
        } else {
            f16 = f15;
        }
        C17909s c17909s = AbstractC17911t.f69612b;
        C38072d c38072d = C38072d.f163053a;
        return new C12801b(f13, f14, AbstractC18249c.m52570h(C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(composer, 6).getStrainZone1()), new C17919x(c38072d.m121949b(composer, 6).getStrainZone2()), new C17919x(c38072d.m121949b(composer, 6).getStrainZone3()), new C17919x(c38072d.m121949b(composer, 6).getStrainZone4()), new C17919x(c38072d.m121949b(composer, 6).getStrainZone5())), 0L, 0L, 14)), f16, 0.0f, null, false, 112, null);
    }

    /* JADX INFO: renamed from: j */
    private static final AbstractC21394b.b m31475j(int i13, float f13, TextResource textResource, TextResource textResource2, Composer composer, int i14, int i15) {
        long jM125384c0;
        EnumC39333f enumC39333f;
        TextResource textResourceM21267a = (i15 & 4) != 0 ? AbstractC8693b.m21267a() : textResource;
        TextResource textResourceM21267a2 = (i15 & 8) != 0 ? AbstractC8693b.m21267a() : textResource2;
        if (f13 < 0.34f) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(750612075);
            jM125384c0 = C38072d.f163053a.m121949b(c28655q, 6).getRecoveryLowRecovery();
            c28655q.m87173q(false);
        } else if (f13 > 0.66f) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(750614060);
            jM125384c0 = C38072d.f163053a.m121949b(c28655q2, 6).getRecoveryHighRecovery();
            c28655q2.m87173q(false);
        } else {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(750615822);
            jM125384c0 = C38072d.f163053a.m121949b(c28655q3, 6).getRecoveryMediumRecovery();
            c28655q3.m87173q(false);
        }
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87150e0(750617757);
        C38072d c38072d = C38072d.f163053a;
        if (C17919x.m51542d(jM125384c0, c38072d.m121949b(c28655q4, 6).getRecoveryLowRecovery())) {
            enumC39333f = EnumC39333f.RECOVERY_LOW_RECOVERY;
        } else if (C17919x.m51542d(jM125384c0, c38072d.m121949b(c28655q4, 6).getRecoveryHighRecovery())) {
            enumC39333f = EnumC39333f.RECOVERY_HIGH_RECOVERY;
        } else {
            enumC39333f = C17919x.m51542d(jM125384c0, c38072d.m121949b(c28655q4, 6).getRecoveryMediumRecovery()) ? EnumC39333f.RECOVERY_MEDIUM_RECOVERY : EnumC39333f.BRAND_WHITE;
        }
        c28655q4.m87173q(false);
        int iM36258X = AbstractC12889b.m36258X(100 * f13);
        List listM118958J = AbstractC37056f.m118958J(m31478m(f13, jM125384c0));
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Day " + i13 + " - " + iM36258X + "% recovery");
        int i16 = 12;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z4 = false;
        EnumC39333f enumC39333f2 = enumC39333f;
        return new AbstractC21394b.b(AbstractC37056f.m118958J(new C12800a(textResourceM21278l, listM118958J, i13 / 8.0f, 0.075f, null, new C34555d(textResourceM21267a2, enumC39333f2, false, z4, i16, defaultConstructorMarker), new C34555d(textResourceM21267a, enumC39333f2, z4, false, i16, defaultConstructorMarker), null, false, 400, null)), "id", z4, false, 12, null);
    }

    /* JADX INFO: renamed from: k */
    public static final C21395c m31476k(Composer composer, int i13) {
        return new C21395c(AbstractC12766i.m35763s("Recovery Graph", false, false, true, false, 20, null), m31477l(composer, 0), null, null, 12, null);
    }

    /* JADX INFO: renamed from: l */
    private static final List<AbstractC21394b.b> m31477l(Composer composer, int i13) {
        return AbstractC37056f.m118959K(m31475j(1, 0.9f, AbstractC8693b.m21278l("90"), null, composer, 54, 8), m31475j(2, 0.25f, AbstractC8693b.m21278l("25"), null, composer, 54, 8), m31475j(3, 0.6f, AbstractC8693b.m21278l("60"), null, composer, 54, 8), m31475j(4, 1.0f, null, null, composer, 54, 12), m31475j(5, 0.5f, AbstractC8693b.m21278l("50"), null, composer, 54, 8), m31475j(6, 0.75f, AbstractC8693b.m21278l("75"), null, composer, 54, 8), m31475j(7, 0.1f, AbstractC8693b.m21278l("10"), null, composer, 54, 8));
    }

    /* JADX INFO: renamed from: m */
    private static final C12801b m31478m(float f13, long j7) {
        return new C12801b(0.0f, f13, AbstractC18249c.m52577o(j7), 0.0f, 0.0f, null, false, 121, null);
    }

    /* JADX INFO: renamed from: n */
    public static final C21395c m31479n(Composer composer, int i13) {
        C21374h c21374hM35763s = AbstractC12766i.m35763s("Stacked Graph", false, false, false, false, 28, null);
        return new C21395c(c21374hM35763s.m59985a((8187 & 1) != 0 ? c21374hM35763s.startVerticalAxis : null, (8187 & 2) != 0 ? c21374hM35763s.endVerticalAxis : null, (8187 & 4) != 0 ? c21374hM35763s.bottomHorizontalAxis : null, (8187 & 8) != 0 ? c21374hM35763s.topHorizontalAxis : null, (8187 & 16) != 0 ? c21374hM35763s.insets : null, (8187 & 32) != 0 ? c21374hM35763s.lines : null, (8187 & 64) != 0 ? c21374hM35763s.graphAnnotations : null, (8187 & 128) != 0 ? c21374hM35763s.accessibilityState : null, (8187 & 256) != 0 ? c21374hM35763s.scrubberEnabled : false, (8187 & 512) != 0 ? c21374hM35763s.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21374hM35763s.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21374hM35763s.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? c21374hM35763s.horizontalGridLinePadding : 0.0f), AbstractC37056f.m118958J(new AbstractC21394b.b(AbstractC37056f.m118959K(m31480o(1, 0.9f, composer, 54), m31480o(2, 0.25f, composer, 54), m31480o(3, 0.6f, composer, 54), m31480o(4, 1.0f, composer, 54), m31480o(5, 0.5f, composer, 54), m31480o(6, 0.75f, composer, 54), m31480o(7, 0.1f, composer, 54)), "stacked bar plot", false, false, 12, null)), null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    private static final C12800a m31480o(int i13, float f13, Composer composer, int i14) {
        int iM36258X = AbstractC12889b.m36258X(21 * f13);
        List listM118958J = AbstractC37056f.m118958J(m31478m(f13, C38072d.f163053a.m121949b(composer, 6).getStrain()));
        return new C12800a(AbstractC8693b.m21278l("Day " + i13 + " strain is " + iM36258X), listM118958J, ((float) i13) / 8.0f, 0.075f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, new C0520a(null, null, AbstractC8693b.m21278l(iM36258X + " strain"), null, null, null, null, false, null, null, null, null, 4091, null), false, 368, 0 == true ? 1 : 0);
    }
}
