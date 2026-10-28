package qs1;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2619s2;
import b91.C2886a;
import c01.C3804d;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp0.C10941a;
import e81.C12828g;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gz0.EnumC16313m0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.File;
import java.util.List;
import kotlin.C2040y;
import l83.C23454a0;
import l83.C23465k;
import ls1.AbstractC24714a;
import ls1.AbstractC24715b;
import no.nordicsemi.android.dfu.DfuBaseService;
import ns1.AbstractC27104b;
import ny0.AbstractC27271o0;
import ny0.AbstractC27292z;
import o01.AbstractC27348d;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17885g;
import p208i2.C17909s;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p72.C28958a;
import pf.AbstractC29125c;
import q11.C29793c;
import qb0.C30179a;
import qe0.C30301b;
import qo1.C30527b;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qs1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000e2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a=\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lqs1/b;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "onTagClick", "onSecondaryClick", "onPrimaryClick", "onUploadFailure", "y", "(Lqs1/b;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lns1/b;", "processedFiles", "F", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "processedFile", "M", "(Lns1/b;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "K", "(Landroidx/compose/ui/Modifier;Lqs1/b;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "text", "q", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "t", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "v", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "footerHeight", "lab-file-upload_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30574a {

    /* JADX INFO: renamed from: qs1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f125800w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(AbstractC27104b abstractC27104b) {
            return null;
        }
    }

    /* JADX INFO: renamed from: qs1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f125801w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f125802x;

        public b(Function1 function1, List list) {
            this.f125801w = function1;
            this.f125802x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m93778a(int i13) {
            return this.f125801w.invoke(this.f125802x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m93778a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: qs1.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f125803w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f125804x;

        public c(Function1 function1, List list) {
            this.f125803w = function1;
            this.f125804x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m93779a(int i13) {
            return this.f125803w.invoke(this.f125804x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m93779a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: qs1.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f125805w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f125806x;

        public d(List list, InterfaceC4339a interfaceC4339a) {
            this.f125805w = list;
            this.f125806x = interfaceC4339a;
        }

        /* JADX INFO: renamed from: a */
        public final void m93780a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            AbstractC27104b abstractC27104b = (AbstractC27104b) this.f125805w.get(i13);
            c28655q.m87150e0(1976447426);
            AbstractC30574a.m93747M(abstractC27104b, this.f125806x, AbstractC1102d.m3409f(1.0f, C2314t.f9131w), c28655q, 384, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m93780a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final float m93735A(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39174f) interfaceC28601c1.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: B */
    private static final void m93736B(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(new C39174f(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m93737C(C30575b c30575b, InterfaceC4339a interfaceC4339a, InterfaceC39171c interfaceC39171c, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC28601c1 interfaceC28601c1, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            float fM3402c = ((C1101c) BoxWithConstraints).m3402c() - (m93735A(interfaceC28601c1) * 0.7f);
            C2314t c2314t = C2314t.f9131w;
            m93740F(AbstractC1102d.m3411h(fM3402c, AbstractC1102d.m3409f(1.0f, c2314t)), c30575b.m93783c(), interfaceC4339a, c28655q, 0, 0);
            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H);
            boolean zM87153g = c28655q.m87153g(interfaceC39171c);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2619s2(interfaceC39171c, interfaceC28601c1, 8);
                c28655q.m87172p0(objM87133R);
            }
            m93745K(AbstractC1132b.m3502b(modifierMo3400a, (Function1) objM87133R), c30575b, interfaceC4339a2, interfaceC4339a3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m93738D(InterfaceC39171c interfaceC39171c, InterfaceC28601c1 interfaceC28601c1, C39180l c39180l) {
        m93736B(interfaceC28601c1, interfaceC39171c.mo733e0((int) (c39180l.f168422a & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m93739E(C30575b c30575b, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, int i13, int i14, Composer composer, int i15) {
        m93775y(c30575b, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0189  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    private static final void m93740F(Modifier modifier, List<? extends AbstractC27104b> list, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1053454605);
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
            i15 |= c28655q.m87157i(list) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C30527b(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (list.isEmpty()) {
                    c28655q.m87150e0(140290011);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    String strM21273g = AbstractC8693b.m21273g(AbstractC24715b.f96653e, c28655q, 0);
                    C38072d c38072d = C38072d.f163053a;
                    int i18 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM21273g, null, c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    interfaceC4339a5 = interfaceC4339a4;
                } else {
                    c28655q.m87150e0(140646821);
                    float f13 = 8;
                    Modifier modifierM44085i = AbstractC15674c.m44085i(AbstractC1099a.m3396r(modifier4, ((float) 2.5d) * f13, 0.0f, 2), 0.0f, null, 3, null);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 0.5d) * f13);
                    boolean zM87157i = c28655q.m87157i(list);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == c28676v0) {
                        objM87133R = new C29793c(11, list, interfaceC4339a4);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a5 = interfaceC4339a4;
                    AbstractC22674j.m65717c(modifierM44085i, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 494);
                    c28655q.m87173q(false);
                }
                interfaceC4339a3 = interfaceC4339a5;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(modifier3, list, interfaceC4339a3, i13, i14, 10);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C30527b(22);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (list.isEmpty()) {
                c28655q.m87150e0(140290011);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                String strM21273g2 = AbstractC8693b.m21273g(AbstractC24715b.f96653e, c28655q, 0);
                C38072d c38072d2 = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21273g2, null, c38072d2.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i19).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                interfaceC4339a5 = interfaceC4339a4;
            } else {
                c28655q.m87150e0(140646821);
                float f14 = 8;
                Modifier modifierM44085i2 = AbstractC15674c.m44085i(AbstractC1099a.m3396r(modifier4, ((float) 2.5d) * f14, 0.0f, 2), 0.0f, null, 3, null);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(((float) 0.5d) * f14);
                boolean zM87157i2 = c28655q.m87157i(list);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i2 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C29793c(11, list, interfaceC4339a4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C29793c(11, list, interfaceC4339a4);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a5 = interfaceC4339a4;
                AbstractC22674j.m65717c(modifierM44085i2, null, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R, c28655q, 24576, 494);
                c28655q.m87173q(false);
            }
            interfaceC4339a3 = interfaceC4339a5;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(modifier3, list, interfaceC4339a3, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m93741G() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m93742H(List list, InterfaceC4339a interfaceC4339a, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(list.size(), new b(new C30301b(16), list), new c(a.f125800w, list), new C37816b(new d(list, interfaceC4339a), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final Object m93743I(AbstractC27104b it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getFilePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m93744J(Modifier modifier, List list, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m93740F(modifier, list, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final void m93745K(Modifier modifier, C30575b c30575b, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1187127590);
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
            i15 |= c28655q.m87157i(c30575b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            C17909s c17909s = AbstractC17911t.f69612b;
            Float fValueOf = Float.valueOf(0.0f);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifier4 = modifier2;
            Modifier modifierM3357b = AbstractC1092a.m3357b(modifierM3409f, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(C17919x.m51541c(0.0f, c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt()))), new C23465k(Float.valueOf(0.27f), new C17919x(c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt()))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
            float f13 = 8;
            float f14 = ((float) 2.5d) * f13;
            Modifier modifierM3397s = AbstractC1099a.m3397s(modifierM3357b, f14, 4 * f13, f14, 5 * f13);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            m93767q(c30575b.getCoachFooterText(), c28655q, 0);
            m93772v(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13), c30575b.m93783c(), c28655q, 6, 0);
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f13), C2299e.f9107J, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3427x = AbstractC1102d.m3427x(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, 3);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c30575b.getSecondaryButtonText());
            int i18 = TextResource.$stable;
            AbstractC27271o0.m82253b(modifierM3427x, false, textResourceM21278l, null, null, null, null, null, false, null, interfaceC4339a, c28655q, i18 << 6, (i15 >> 6) & 14, MessageListItemViewType.POLL);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC27292z.m82343j(AbstractC1102d.m3427x(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), null, 3), false, false, null, null, null, AbstractC8693b.m21278l(c30575b.getPrimaryButtonText()), null, null, null, 0.0f, null, null, interfaceC4339a2, c28655q, i18 << 18, i15 & 7168, 8126);
            c28655q = c28655q;
            AbstractC25012a.m73392y(c28655q, true, true, true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(modifier3, c30575b, interfaceC4339a, interfaceC4339a2, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m93746L(Modifier modifier, C30575b c30575b, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m93745K(modifier, c30575b, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    /* JADX WARN: Code duplicated, block: B:73:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x01da  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: M */
    public static final void m93747M(AbstractC27104b abstractC27104b, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        Modifier modifier2;
        int i17;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        InterfaceC4339a interfaceC4339a4;
        C2314t c2314t;
        C38072d c38072d;
        int i18;
        C17916v0 c17916v0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        C39077b1 c39077b1;
        Bitmap bitmapM81475b;
        File file;
        File file2;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1462722015);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(abstractC27104b) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    modifier2 = modifier;
                    if (c28655q2.m87153g(modifier2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i19 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C30527b(20);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    c2314t = C2314t.f9131w;
                    if (i16 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier2;
                    }
                    c38072d = C38072d.f163053a;
                    i18 = C38072d.f163054b;
                    long jM125408n = c38072d.m121949b(c28655q2, i18).getBackgroundDarkAlt();
                    c17916v0 = AbstractC17918w0.f69621a;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(modifier3, jM125408n, c17916v0);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    z13 = abstractC27104b instanceof AbstractC27104b.a;
                    c39077b1 = C39102j.f168202d;
                    if (z13) {
                        c28655q2.m87150e0(758775234);
                        file = null;
                        try {
                            file2 = new File(((AbstractC27104b.a) abstractC27104b).getFilePath());
                            if (file2.exists()) {
                                file = file2;
                            }
                        } catch (Exception unused) {
                        }
                        if (file != null) {
                            c28655q2.m87150e0(758991800);
                            c28655q = c28655q2;
                            AbstractC11894a.m31954c(file, AbstractC8693b.m21273g(AbstractC24715b.f96651c, c28655q2, 0), AbstractC1102d.m3409f(1.0f, c2314t), null, c39077b1, 0.0f, c28655q, 1573248, 952);
                            c28655q.m87173q(false);
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87150e0(759331219);
                            interfaceC4339a4.invoke();
                            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC24715b.f96652d);
                            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC24715b.f96650b);
                            int i24 = TextResource.C8688b.f25889c;
                            m93770t(c8688bM21277k, c8688bM21277k2, null, c28655q2, i24 | (i24 << 3), 4);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    } else {
                        c28655q = c28655q2;
                        if (abstractC27104b instanceof AbstractC27104b.b) {
                            throw AbstractC11895b.m32003v(-391166448, c28655q, false);
                        }
                        c28655q.m87150e0(759711341);
                        bitmapM81475b = ((AbstractC27104b.b) abstractC27104b).getPreviewBitmap();
                        if (bitmapM81475b != null) {
                            c28655q.m87150e0(759805767);
                            AbstractC29125c.m88526e(new C17885g(bitmapM81475b), AbstractC8693b.m21273g(AbstractC24715b.f96654f, c28655q, 0), AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i18).getBrandWhite(), c17916v0), c39077b1, c28655q, 24576, 232);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(760253872);
                            interfaceC4339a4.invoke();
                            TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC24715b.f96655g);
                            TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC24715b.f96656h);
                            int i25 = TextResource.C8688b.f25889c;
                            m93770t(c8688bM21277k3, c8688bM21277k4, null, c28655q, i25 | (i25 << 3), 4);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C30179a(abstractC27104b, interfaceC4339a3, modifier3, i13, i14, 11);
                }
            }
            i15 |= 384;
            modifier2 = modifier;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C30527b(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                long jM125408n2 = c38072d.m121949b(c28655q2, i18).getBackgroundDarkAlt();
                c17916v0 = AbstractC17918w0.f69621a;
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifier3, jM125408n2, c17916v0);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3358c2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                z13 = abstractC27104b instanceof AbstractC27104b.a;
                c39077b1 = C39102j.f168202d;
                if (z13) {
                    c28655q2.m87150e0(758775234);
                    file = null;
                    file2 = new File(((AbstractC27104b.a) abstractC27104b).getFilePath());
                    if (file2.exists()) {
                        file = file2;
                    }
                    if (file != null) {
                        c28655q2.m87150e0(758991800);
                        c28655q = c28655q2;
                        AbstractC11894a.m31954c(file, AbstractC8693b.m21273g(AbstractC24715b.f96651c, c28655q2, 0), AbstractC1102d.m3409f(1.0f, c2314t), null, c39077b1, 0.0f, c28655q, 1573248, 952);
                        c28655q.m87173q(false);
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87150e0(759331219);
                        interfaceC4339a4.invoke();
                        TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC24715b.f96652d);
                        TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC24715b.f96650b);
                        int i26 = TextResource.C8688b.f25889c;
                        m93770t(c8688bM21277k5, c8688bM21277k6, null, c28655q2, i26 | (i26 << 3), 4);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q2;
                    if (abstractC27104b instanceof AbstractC27104b.b) {
                        throw AbstractC11895b.m32003v(-391166448, c28655q, false);
                    }
                    c28655q.m87150e0(759711341);
                    bitmapM81475b = ((AbstractC27104b.b) abstractC27104b).getPreviewBitmap();
                    if (bitmapM81475b != null) {
                        c28655q.m87150e0(759805767);
                        AbstractC29125c.m88526e(new C17885g(bitmapM81475b), AbstractC8693b.m21273g(AbstractC24715b.f96654f, c28655q, 0), AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i18).getBrandWhite(), c17916v0), c39077b1, c28655q, 24576, 232);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(760253872);
                        interfaceC4339a4.invoke();
                        TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC24715b.f96655g);
                        TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC24715b.f96656h);
                        int i27 = TextResource.C8688b.f25889c;
                        m93770t(c8688bM21277k7, c8688bM21277k8, null, c28655q, i27 | (i27 << 3), 4);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(abstractC27104b, interfaceC4339a3, modifier3, i13, i14, 11);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                if (c28655q2.m87153g(modifier2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C30527b(20);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                long jM125408n3 = c38072d.m121949b(c28655q2, i18).getBackgroundDarkAlt();
                c17916v0 = AbstractC17918w0.f69621a;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifier3, jM125408n3, c17916v0);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3358c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                z13 = abstractC27104b instanceof AbstractC27104b.a;
                c39077b1 = C39102j.f168202d;
                if (z13) {
                    c28655q2.m87150e0(758775234);
                    file = null;
                    file2 = new File(((AbstractC27104b.a) abstractC27104b).getFilePath());
                    if (file2.exists()) {
                        file = file2;
                    }
                    if (file != null) {
                        c28655q2.m87150e0(758991800);
                        c28655q = c28655q2;
                        AbstractC11894a.m31954c(file, AbstractC8693b.m21273g(AbstractC24715b.f96651c, c28655q2, 0), AbstractC1102d.m3409f(1.0f, c2314t), null, c39077b1, 0.0f, c28655q, 1573248, 952);
                        c28655q.m87173q(false);
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87150e0(759331219);
                        interfaceC4339a4.invoke();
                        TextResource.C8688b c8688bM21277k9 = AbstractC8693b.m21277k(AbstractC24715b.f96652d);
                        TextResource.C8688b c8688bM21277k10 = AbstractC8693b.m21277k(AbstractC24715b.f96650b);
                        int i28 = TextResource.C8688b.f25889c;
                        m93770t(c8688bM21277k9, c8688bM21277k10, null, c28655q2, i28 | (i28 << 3), 4);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q2;
                    if (abstractC27104b instanceof AbstractC27104b.b) {
                        throw AbstractC11895b.m32003v(-391166448, c28655q, false);
                    }
                    c28655q.m87150e0(759711341);
                    bitmapM81475b = ((AbstractC27104b.b) abstractC27104b).getPreviewBitmap();
                    if (bitmapM81475b != null) {
                        c28655q.m87150e0(759805767);
                        AbstractC29125c.m88526e(new C17885g(bitmapM81475b), AbstractC8693b.m21273g(AbstractC24715b.f96654f, c28655q, 0), AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i18).getBrandWhite(), c17916v0), c39077b1, c28655q, 24576, 232);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(760253872);
                        interfaceC4339a4.invoke();
                        TextResource.C8688b c8688bM21277k11 = AbstractC8693b.m21277k(AbstractC24715b.f96655g);
                        TextResource.C8688b c8688bM21277k12 = AbstractC8693b.m21277k(AbstractC24715b.f96656h);
                        int i29 = TextResource.C8688b.f25889c;
                        m93770t(c8688bM21277k11, c8688bM21277k12, null, c28655q, i29 | (i29 << 3), 4);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(abstractC27104b, interfaceC4339a3, modifier3, i13, i14, 11);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C30527b(20);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            c38072d = C38072d.f163053a;
            i18 = C38072d.f163054b;
            long jM125408n4 = c38072d.m121949b(c28655q2, i18).getBackgroundDarkAlt();
            c17916v0 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifier3, jM125408n4, c17916v0);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3358c4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            z13 = abstractC27104b instanceof AbstractC27104b.a;
            c39077b1 = C39102j.f168202d;
            if (z13) {
                c28655q2.m87150e0(758775234);
                file = null;
                file2 = new File(((AbstractC27104b.a) abstractC27104b).getFilePath());
                if (file2.exists()) {
                    file = file2;
                }
                if (file != null) {
                    c28655q2.m87150e0(758991800);
                    c28655q = c28655q2;
                    AbstractC11894a.m31954c(file, AbstractC8693b.m21273g(AbstractC24715b.f96651c, c28655q2, 0), AbstractC1102d.m3409f(1.0f, c2314t), null, c39077b1, 0.0f, c28655q, 1573248, 952);
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q2;
                    c28655q.m87150e0(759331219);
                    interfaceC4339a4.invoke();
                    TextResource.C8688b c8688bM21277k13 = AbstractC8693b.m21277k(AbstractC24715b.f96652d);
                    TextResource.C8688b c8688bM21277k14 = AbstractC8693b.m21277k(AbstractC24715b.f96650b);
                    int i210 = TextResource.C8688b.f25889c;
                    m93770t(c8688bM21277k13, c8688bM21277k14, null, c28655q2, i210 | (i210 << 3), 4);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                if (abstractC27104b instanceof AbstractC27104b.b) {
                    throw AbstractC11895b.m32003v(-391166448, c28655q, false);
                }
                c28655q.m87150e0(759711341);
                bitmapM81475b = ((AbstractC27104b.b) abstractC27104b).getPreviewBitmap();
                if (bitmapM81475b != null) {
                    c28655q.m87150e0(759805767);
                    AbstractC29125c.m88526e(new C17885g(bitmapM81475b), AbstractC8693b.m21273g(AbstractC24715b.f96654f, c28655q, 0), AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i18).getBrandWhite(), c17916v0), c39077b1, c28655q, 24576, 232);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(760253872);
                    interfaceC4339a4.invoke();
                    TextResource.C8688b c8688bM21277k15 = AbstractC8693b.m21277k(AbstractC24715b.f96655g);
                    TextResource.C8688b c8688bM21277k16 = AbstractC8693b.m21277k(AbstractC24715b.f96656h);
                    int i211 = TextResource.C8688b.f25889c;
                    m93770t(c8688bM21277k15, c8688bM21277k16, null, c28655q, i211 | (i211 << 3), 4);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(abstractC27104b, interfaceC4339a3, modifier3, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m93748N() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m93749O(AbstractC27104b abstractC27104b, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93747M(abstractC27104b, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m93767q(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        String str2 = str;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2068704207);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(str2) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q = c28655q2;
            c28655q.m87138X();
        } else {
            if (str2 == null) {
                C28677v1 c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C10941a(str2, i13, 21);
                    return;
                }
                return;
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(12));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3357b(AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q2, i15).getBackgroundDarkAlt(), AbstractC17918w0.f69621a), AbstractC15673b0.m43978D(), null, 0.0f, 6));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            AbstractC27348d.m82519c(null, c28655q2, 0, 1);
            C2886a c2886aM8422c = c38072d.m121952e(c28655q2, i15).getB3();
            long jM125430y = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, ((float) 1.5d) * f13, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            str2 = str;
            AbstractC30795n.m94707h(str2, AbstractC11895b.m31988g(modifierM3398t, true, 1.0f), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, c28655q2, i14 & 14, C2886a.f11498d << 18, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            c28677v1M87180u2.f115982d = new C10941a(str2, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m93768r(String str, int i13, Composer composer, int i14) {
        m93767q(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m93769s(String str, int i13, Composer composer, int i14) {
        m93767q(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    private static final void m93770t(TextResource textResource, TextResource textResource2, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-896856085);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(textResource2) : c28655q2.m87157i(textResource2) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                Modifier modifierM3411h = AbstractC1102d.m3411h(200, AbstractC1102d.m3409f(1.0f, modifier2));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3411h);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, (i15 & 14) | i17);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i18).getH4();
                long jM125430y = c38072d.m121949b(c28655q2, i18).getBrandWhite();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q2, 0, i19, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q2, i17 | ((i15 >> 3) & 14)), AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q2, i18).getGreyL1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB3(), null, c28655q2, 48, i19, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3804d(i13, i14, 3, modifier2, textResource, textResource2);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(200, AbstractC1102d.m3409f(1.0f, modifier2));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3411h2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q2, (i15 & 14) | i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q2, i111).getH4();
            long jM125430y2 = c38072d2.m121949b(c28655q2, i111).getBrandWhite();
            int i112 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q2, 0, i112, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q2, i110 | ((i15 >> 3) & 14)), AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13), c38072d2.m121949b(c28655q2, i111).getGreyL1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i111).getB3(), null, c28655q2, 48, i112, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3804d(i13, i14, 3, modifier2, textResource, textResource2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m93771u(TextResource textResource, TextResource textResource2, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m93770t(textResource, textResource2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m93772v(Modifier modifier, List<? extends AbstractC27104b> processedFiles, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C12828g c12828g;
        int iM81476c;
        AbstractC22676k.m65750j(processedFiles, "processedFiles");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1920848723);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(processedFiles) ? 32 : 16;
        }
        int i17 = 0;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            if (processedFiles.isEmpty()) {
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c12828g = new C12828g(modifier4, processedFiles, i13, i14, 4);
                }
            } else {
                Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                int size = processedFiles.size();
                for (AbstractC27104b abstractC27104b : processedFiles) {
                    if (abstractC27104b instanceof AbstractC27104b.b) {
                        iM81476c = ((AbstractC27104b.b) abstractC27104b).getTotalPages();
                    } else {
                        if (!(abstractC27104b instanceof AbstractC27104b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iM81476c = 1;
                    }
                    i17 += iM81476c;
                }
                String quantityString = context.getResources().getQuantityString(AbstractC24714a.f96647a, size, Integer.valueOf(size));
                AbstractC22676k.m65749i(quantityString, "getQuantityString(...)");
                if (i17 > 0) {
                    String quantityString2 = context.getResources().getQuantityString(AbstractC24714a.f96648b, i17, Integer.valueOf(i17));
                    AbstractC22676k.m65749i(quantityString2, "getQuantityString(...)");
                    quantityString = context.getString(AbstractC24715b.f96649a, quantityString, quantityString2);
                    AbstractC22676k.m65747g(quantityString);
                }
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8421b = c38072d.m121952e(c28655q2, i18).getB2();
                Modifier modifier5 = modifier4;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(quantityString, modifier5, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, (i15 << 3) & 112, C2886a.f11498d << 18, 196088);
                modifier3 = modifier5;
            }
            c28677v1M87180u.f115982d = c12828g;
        }
        c28655q = c28655q2;
        c28655q.m87138X();
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c12828g = new C12828g(modifier3, processedFiles, i13, i14, 5);
            c28677v1M87180u.f115982d = c12828g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m93773w(Modifier modifier, List list, int i13, int i14, Composer composer, int i15) {
        m93772v(modifier, list, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m93774x(Modifier modifier, List list, int i13, int i14, Composer composer, int i15) {
        m93772v(modifier, list, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public static final void m93775y(C30575b state, InterfaceC4339a onBackClick, InterfaceC4339a onTagClick, InterfaceC4339a onSecondaryClick, InterfaceC4339a onPrimaryClick, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a3;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        AbstractC22676k.m65750j(onTagClick, "onTagClick");
        AbstractC22676k.m65750j(onSecondaryClick, "onSecondaryClick");
        AbstractC22676k.m65750j(onPrimaryClick, "onPrimaryClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(487077572);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onBackClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onTagClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onSecondaryClick) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onPrimaryClick) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i16 = i14 & 32;
        if (i16 == 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C30527b(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                float f13 = 8;
                AbstractC6719b.m20143d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * f13, 0.0f, 1 * f13, 5), new AbstractC6721d.a(AbstractC8693b.m21278l(state.getTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, state.getTag(), null, 49146, null), null, onBackClick, null, onTagClick, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168) | ((i15 << 9) & 458752), 20);
                InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
                AbstractC22953f.m66714a(AbstractC1102d.m3407d(1.0f, c2314t), null, false, AbstractC37817c.m121344e(-1955206768, c28655q, new C2040y(state, interfaceC4339a4, interfaceC39171c, onSecondaryClick, onPrimaryClick, interfaceC28601c1)), c28655q, 3078, 6);
                c28655q.m87173q(true);
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(state, onBackClick, onTagClick, onSecondaryClick, onPrimaryClick, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C30527b(21);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66725n2 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66725n2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            float f14 = 8;
            AbstractC6719b.m20143d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 2 * f14, 0.0f, 1 * f14, 5), new AbstractC6721d.a(AbstractC8693b.m21278l(state.getTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, state.getTag(), null, 49146, null), null, onBackClick, null, onTagClick, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | ((i15 << 6) & 7168) | ((i15 << 9) & 458752), 20);
            InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
            AbstractC22953f.m66714a(AbstractC1102d.m3407d(1.0f, c2314t2), null, false, AbstractC37817c.m121344e(-1955206768, c28655q, new C2040y(state, interfaceC4339a5, interfaceC39171c2, onSecondaryClick, onPrimaryClick, interfaceC28601c2)), c28655q, 3078, 6);
            c28655q.m87173q(true);
            interfaceC4339a2 = interfaceC4339a5;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(state, onBackClick, onTagClick, onSecondaryClick, onPrimaryClick, interfaceC4339a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m93776z() {
        return C23454a0.f92919a;
    }
}
