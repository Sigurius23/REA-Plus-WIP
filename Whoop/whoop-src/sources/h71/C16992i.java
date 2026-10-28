package h71;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b61.C2757l;
import c93.InterfaceC4351m;
import g71.AbstractC15545c;
import g71.C15546d;
import hg3.AbstractC17269i;
import i71.C18204h;
import i71.InterfaceC18203g;
import j71.AbstractC21394b;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p181h2.C16618c;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t61.AbstractC33553c;
import v61.AbstractC35741f;
import x61.C38023a;

/* JADX INFO: renamed from: h71.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J]\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lh71/i;", "", "Lb61/l;", "fixedPlotFactory", "<init>", "(Lb61/l;)V", "Lj71/b;", "plotState", "Landroidx/compose/ui/Modifier;", "plotModifier", "linePlotModifier", "Lkotlin/Function1;", "Ll83/a0;", "onViewEvent", "Li71/g;", "dataScroller", "Li71/h;", "scrollPosition", "Lh2/c;", "xAxisLabelCustomRect", "", "parentWidth", "b", "(Lj71/b;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Li71/g;Li71/h;Lh2/c;FLandroidx/compose/runtime/Composer;I)V", "a", "Lb61/l;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16992i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C2757l fixedPlotFactory;

    public C16992i(C2757l fixedPlotFactory) {
        AbstractC22676k.m65750j(fixedPlotFactory, "fixedPlotFactory");
        this.fixedPlotFactory = fixedPlotFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m47852c(C16992i c16992i, AbstractC21394b abstractC21394b, Modifier modifier, Modifier modifier2, Function1 function1, InterfaceC18203g interfaceC18203g, C18204h c18204h, C16618c c16618c, float f13, int i13, Composer composer, int i14) {
        c16992i.m47853b(abstractC21394b, modifier, modifier2, function1, interfaceC18203g, c18204h, c16618c, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final void m47853b(final AbstractC21394b plotState, final Modifier plotModifier, final Modifier linePlotModifier, final Function1 onViewEvent, final InterfaceC18203g dataScroller, final C18204h scrollPosition, final C16618c c16618c, final float f13, Composer composer, final int i13) {
        int i14;
        C28655q c28655q;
        C16618c c16618cM48894h;
        AbstractC22676k.m65750j(plotState, "plotState");
        AbstractC22676k.m65750j(plotModifier, "plotModifier");
        AbstractC22676k.m65750j(linePlotModifier, "linePlotModifier");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(dataScroller, "dataScroller");
        AbstractC22676k.m65750j(scrollPosition, "scrollPosition");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1987744825);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(plotState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(plotModifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(linePlotModifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q2.m87153g(dataScroller) : c28655q2.m87157i(dataScroller) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87153g(scrollPosition) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87153g(c16618c) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q2.m87147d(f13) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q2.m87153g(this) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q2.m87135U(i14 & 1, (38347923 & i14) != 38347922)) {
            if (plotState instanceof AbstractC21394b.g) {
                c28655q2.m87150e0(2103356205);
                AbstractC33553c.m105959c(linePlotModifier, ((AbstractC21394b.g) plotState).m60076g(), dataScroller, scrollPosition, c28655q2, (i14 >> 6) & 8078, 0);
                c28655q2.m87173q(false);
            } else if (plotState instanceof AbstractC21394b.m) {
                c28655q2.m87150e0(2103638894);
                List<C15546d> listM60090e = ((AbstractC21394b.m) plotState).m60090e();
                if (c16618c == null) {
                    c16618cM48894h = AbstractC17269i.m48894h((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                } else {
                    c16618cM48894h = c16618c;
                }
                AbstractC15545c.m43744b(listM60090e, scrollPosition, null, c16618cM48894h, c28655q2, (i14 >> 12) & 112, 4);
                c28655q2.m87173q(false);
            } else if (plotState instanceof AbstractC21394b.i) {
                c28655q2.m87150e0(2103949762);
                AbstractC35741f.m113220d(null, AbstractC21394b.i.m60083f((AbstractC21394b.i) plotState, null, new C38023a(true, f13), null, false, false, 29, null), null, c28655q2, 0, 5);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(2104136692);
                int i15 = i14 >> 3;
                this.fixedPlotFactory.m7810a(plotState).mo7764a(plotModifier, plotState, onViewEvent, c28655q, (i15 & 896) | ((i14 << 3) & 112) | (i15 & 14));
                c28655q.m87173q(false);
            }
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h71.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return C16992i.m47852c(this.f65280w, plotState, plotModifier, linePlotModifier, onViewEvent, dataScroller, scrollPosition, c16618c, f13, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    public /* synthetic */ C16992i(C2757l c2757l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C2757l() : c2757l);
    }
}
