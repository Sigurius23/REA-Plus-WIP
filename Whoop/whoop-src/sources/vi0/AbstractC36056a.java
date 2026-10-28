package vi0;

import a81.AbstractC0564o;
import a81.C0565p;
import a81.InterfaceC0569t;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import be1.C3172f;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.ModalAnalyticEventModel;
import com.whoop.design.models.modal.ModalTrackingKt;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.AbstractC35017s;
import ri0.InterfaceC31443b;
import ti0.C33840e;
import v41.C35657b0;
import zi0.AbstractC40662a;

/* JADX INFO: renamed from: vi0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lti0/e;", "contentState", "Lcom/whoop/design/models/modal/AnyModal;", "nestedModal", "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;", "modalAnalyticEvents", "Lfi0/a;", "analyticsWriter", "Liy1/c;", "metricWriter", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "onEvent", "d", "(Lti0/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Liy1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "genericEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lri0/b;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;)V", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36056a {
    /* JADX INFO: renamed from: d */
    public static final void m114478d(C33840e contentState, AnyModal anyModal, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, InterfaceC21030c interfaceC21030c, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(contentState, "contentState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(569365085);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(contentState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(anyModal) : c28655q.m87157i(anyModal) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(modalAnalyticEventModel) : c28655q.m87157i(modalAnalyticEventModel) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC14515a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC21030c) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            int i16 = 458752 & i15;
            boolean zM87157i = ((i15 & 896) == 256 || ((i15 & 512) != 0 && c28655q.m87157i(modalAnalyticEventModel))) | c28655q.m87157i(interfaceC14515a) | (i16 == 131072);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C0565p(modalAnalyticEventModel, interfaceC14515a, onEvent, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC40662a.m131974r(contentState, (Function1) objM87133R, AbstractC22953f.m66720i(C2314t.f9131w), c28655q, i15 & 14, 0);
            boolean z4 = i16 == 131072;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C35657b0(onEvent, 3);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC0564o.m1394P(anyModal, (Function1) objM87133R2, interfaceC21030c, interfaceC14515a, null, null, c28655q, AnyModal.$stable | ((i15 >> 3) & 14) | ((i15 >> 6) & 896) | (i15 & 7168), 48);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f((Object) contentState, (Object) anyModal, (Object) modalAnalyticEventModel, (Object) interfaceC14515a, (Object) interfaceC21030c, onEvent, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m114479e(ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 function1, InterfaceC31443b genericEvent) {
        AbstractC22676k.m65750j(genericEvent, "genericEvent");
        m114482h(genericEvent, modalAnalyticEventModel, interfaceC14515a, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m114480f(Function1 function1, InterfaceC0569t modalEvent) {
        AbstractC22676k.m65750j(modalEvent, "modalEvent");
        function1.invoke(modalEvent instanceof InterfaceC0569t.f ? new InterfaceC31443b.t(((InterfaceC0569t.f) modalEvent).getModal()) : AbstractC35017s.m110650a(modalEvent));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m114481g(C33840e c33840e, AnyModal anyModal, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, InterfaceC21030c interfaceC21030c, Function1 function1, int i13, Composer composer, int i14) {
        m114478d(c33840e, anyModal, modalAnalyticEventModel, interfaceC14515a, interfaceC21030c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m114482h(InterfaceC31443b genericEvent, ModalAnalyticEventModel modalAnalyticEventModel, InterfaceC14515a interfaceC14515a, Function1 onEvent) {
        AbstractC22676k.m65750j(genericEvent, "genericEvent");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        InterfaceC0569t interfaceC0569tM114483a = AbstractC36057b.m114483a(genericEvent);
        if (interfaceC0569tM114483a == null) {
            return;
        }
        if (interfaceC0569tM114483a instanceof InterfaceC0569t.f) {
            onEvent.invoke(new InterfaceC31443b.t(((InterfaceC0569t.f) interfaceC0569tM114483a).getModal()));
        } else if (!(interfaceC0569tM114483a instanceof InterfaceC0569t.a)) {
            onEvent.invoke(AbstractC35017s.m110650a(interfaceC0569tM114483a));
        } else {
            ModalTrackingKt.trackModalDismissed(modalAnalyticEventModel, interfaceC14515a);
            onEvent.invoke(InterfaceC31443b.e.f129346a);
        }
    }
}
