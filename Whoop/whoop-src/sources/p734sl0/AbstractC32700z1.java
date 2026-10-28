package p734sl0;

import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import com.whoop.p057ai.chat.models.AttachmentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25267u;
import m83.C25271y;
import nl0.C26810l;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p164g2.InterfaceC15250v;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import x81.AbstractC38073e;
import zg0.C40628k;

/* JADX INFO: renamed from: sl0.z1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aË\u0002\u0010)\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n24\u0010\u0011\u001a0\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u001a\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u00182\b\u0010\"\u001a\u0004\u0018\u00010!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010%\u001a\u00020$2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\b\b\u0002\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"", "sendFieldIcon", "Ly81/e;", "sendFieldColor", "Lcom/whoop/design/util/TextResource;", "placeholderMessage", "", "isEnabled", "shouldShowStopGenerating", "enableNewConversation", "Ln0/u;", "listState", "Lkotlin/Function4;", "", "", "Landroid/net/Uri;", "Ll83/a0;", "onSendMessageClicked", "Lkotlin/Function1;", "retryImageUpload", "Lnl0/l;", "imageUploadState", "Lkotlin/Function0;", "onStopIconClicked", "Lkotlin/Function2;", "removeImage", "onChatIconClicked", "showKeyboard", "Lnl0/m;", "state", "isMessageListEmpty", "Lxk0/a$a;", "keyboardEvent", "Lg2/v;", "focusState", "updateFocusState", "Lsl0/n2;", "mediaPickerLauncher", "onDisabledInputTapped", "Lsl0/x1;", "autoLaunch", "e", "(ILy81/e;Lcom/whoop/design/util/TextResource;ZZZLn0/u;Lc93/n;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/m;Lc93/a;ZLnl0/m;ZLc93/m;Lg2/v;Lkotlin/jvm/functions/Function1;Lsl0/n2;Lc93/a;Lsl0/x1;Landroidx/compose/runtime/Composer;IIII)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32700z1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v9, types: [java.util.List] */
    /* JADX INFO: renamed from: e */
    public static final void m102618e(final int i13, final InterfaceC39332e sendFieldColor, final TextResource placeholderMessage, final boolean z4, final boolean z13, final boolean z14, final C26068u listState, final InterfaceC4352n onSendMessageClicked, final Function1 retryImageUpload, final List<C26810l> list, final InterfaceC4339a onStopIconClicked, final InterfaceC4351m removeImage, final InterfaceC4339a onChatIconClicked, final boolean z15, final EnumC26811m state, final boolean z16, final InterfaceC4351m keyboardEvent, final InterfaceC15250v interfaceC15250v, final Function1 updateFocusState, final InterfaceC32647n2 mediaPickerLauncher, InterfaceC4339a interfaceC4339a, EnumC32692x1 enumC32692x1, Composer composer, final int i14, final int i15, final int i16, final int i17) {
        int i18;
        int i19;
        int i24;
        C28655q c28655q;
        final InterfaceC4339a interfaceC4339a2;
        final EnumC32692x1 enumC32692x2;
        InterfaceC4339a interfaceC4339a3;
        int i25;
        ?? arrayList;
        Object objM64488a;
        String string;
        AbstractC22676k.m65750j(sendFieldColor, "sendFieldColor");
        AbstractC22676k.m65750j(placeholderMessage, "placeholderMessage");
        AbstractC22676k.m65750j(listState, "listState");
        AbstractC22676k.m65750j(onSendMessageClicked, "onSendMessageClicked");
        AbstractC22676k.m65750j(retryImageUpload, "retryImageUpload");
        AbstractC22676k.m65750j(onStopIconClicked, "onStopIconClicked");
        AbstractC22676k.m65750j(removeImage, "removeImage");
        AbstractC22676k.m65750j(onChatIconClicked, "onChatIconClicked");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(keyboardEvent, "keyboardEvent");
        AbstractC22676k.m65750j(updateFocusState, "updateFocusState");
        AbstractC22676k.m65750j(mediaPickerLauncher, "mediaPickerLauncher");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1020645163);
        if ((i14 & 6) == 0) {
            i18 = i14 | (c28655q2.m87149e(i13) ? 4 : 2);
        } else {
            i18 = i14;
        }
        if ((i14 & 48) == 0) {
            i18 |= c28655q2.m87157i(sendFieldColor) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i18 |= (i14 & 512) == 0 ? c28655q2.m87153g(placeholderMessage) : c28655q2.m87157i(placeholderMessage) ? 256 : 128;
        }
        int i26 = i14 & 3072;
        int i27 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i26 == 0) {
            i18 |= c28655q2.m87155h(z4) ? 2048 : 1024;
        }
        int i28 = i14 & 24576;
        int i29 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i28 == 0) {
            i18 |= c28655q2.m87155h(z13) ? 16384 : 8192;
        }
        int i34 = i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i34 == 0) {
            i18 |= c28655q2.m87155h(z14) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i18 |= c28655q2.m87153g(listState) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i18 |= c28655q2.m87157i(onSendMessageClicked) ? 8388608 : 4194304;
        }
        int i36 = i14 & 100663296;
        int i37 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i36 == 0) {
            i18 |= c28655q2.m87157i(retryImageUpload) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i18 |= c28655q2.m87157i(list) ? 536870912 : 268435456;
        }
        int i38 = i18;
        if ((i15 & 6) == 0) {
            i19 = i15 | (c28655q2.m87157i(onStopIconClicked) ? 4 : 2);
        } else {
            i19 = i15;
        }
        if ((i15 & 48) == 0) {
            i19 |= c28655q2.m87157i(removeImage) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i19 |= c28655q2.m87157i(onChatIconClicked) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            if (c28655q2.m87155h(z15)) {
                i27 = 2048;
            }
            i19 |= i27;
        }
        if ((i15 & 24576) == 0) {
            if (c28655q2.m87149e(state.ordinal())) {
                i29 = 16384;
            }
            i19 |= i29;
        }
        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87155h(z16)) {
                i35 = 131072;
            }
            i19 |= i35;
        }
        if ((i15 & 1572864) == 0) {
            i19 |= c28655q2.m87157i(keyboardEvent) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i19 |= c28655q2.m87157i(interfaceC15250v) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            if (c28655q2.m87157i(updateFocusState)) {
                i37 = 67108864;
            }
            i19 |= i37;
        }
        if ((i15 & 805306368) == 0) {
            i19 |= (i15 & 1073741824) == 0 ? c28655q2.m87153g(mediaPickerLauncher) : c28655q2.m87157i(mediaPickerLauncher) ? 536870912 : 268435456;
        }
        int i39 = i17 & 1048576;
        if (i39 != 0) {
            i24 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            i24 = i16 | (c28655q2.m87157i(interfaceC4339a) ? 4 : 2);
        } else {
            i24 = i16;
        }
        int i44 = i17 & 2097152;
        if (i44 != 0) {
            i24 |= 48;
        } else if ((i16 & 48) == 0) {
            i24 |= c28655q2.m87149e(enumC32692x1 == null ? -1 : enumC32692x1.ordinal()) ? 32 : 16;
        }
        if (c28655q2.m87135U(i38 & 1, ((i38 & 306783379) == 306783378 && (i19 & 306783379) == 306783378 && (i24 & 19) == 18) ? false : true)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i39 != 0) {
                Object objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32581a1(6);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            EnumC32692x1 enumC32692x3 = i44 != 0 ? EnumC32692x1.NONE : enumC32692x1;
            if (((FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("whoop-coach-message-send-toolbar")) {
                c28655q2.m87150e0(-1965509105);
                if (list != null) {
                    List<C26810l> list2 = list;
                    i25 = 458752;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        C26810l c26810l = (C26810l) it.next();
                        AttachmentType attachmentType = AttachmentType.IMAGE;
                        boolean zM79983d = c26810l.getIsUploading();
                        boolean zM79982c = c26810l.getIsError();
                        Iterator it3 = it;
                        AbstractC22403o abstractC22403oM79981b = c26810l.getImageSource();
                        Uri uri = null;
                        AbstractC22403o.c cVar = abstractC22403oM79981b instanceof AbstractC22403o.c ? (AbstractC22403o.c) abstractC22403oM79981b : null;
                        if (cVar != null && (objM64488a = cVar.getData()) != null && (string = objM64488a.toString()) != null) {
                            uri = Uri.parse(string);
                        }
                        arrayList.add(new C40628k(attachmentType, zM79983d, zM79982c, uri, null, c26810l.getFileId(), c26810l.getImageSource(), 16, null));
                        it = it3;
                    }
                } else {
                    i25 = 458752;
                    arrayList = C25271y.f99162w;
                }
                Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 5 * 4, 1);
                boolean z17 = (i38 & 234881024) == 67108864;
                Object objM87133R2 = c28655q2.m87133R();
                if (z17 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C32639m(retryImageUpload, 2);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i45 = i38 >> 6;
                int i46 = (i38 & 14) | 100663296 | (i45 & 112) | (i45 & 896) | (i45 & 7168);
                int i47 = i19 << 3;
                AbstractC32597d2.m101712u(i13, z4, z13, z14, false, state, mediaPickerLauncher, null, modifierM3396r, onChatIconClicked, onStopIconClicked, onSendMessageClicked, null, null, null, arrayList, removeImage, (InterfaceC4351m) objM87133R2, interfaceC15250v, keyboardEvent, interfaceC4339a3, enumC32692x3, c28655q2, i46 | (i47 & i25) | ((i19 >> 9) & 3670016) | ((i19 << 21) & 1879048192), ((i38 >> 18) & 112) | (i19 & 14) | ((i19 << 15) & 3670016) | (i47 & 234881024) | ((i19 << 9) & 1879048192), i24 & 126, 28816);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(-1964117887);
                boolean z18 = (i38 & 29360128) == 8388608;
                Object objM87133R3 = c28655q2.m87133R();
                if (z18 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C32665r0(onSendMessageClicked, 2);
                    c28655q2.m87172p0(objM87133R3);
                }
                int i48 = i19 << 12;
                AbstractC32619i.m101851w(i13, sendFieldColor, placeholderMessage, z4, z13, z14, listState, z15, state, z16, mediaPickerLauncher, onChatIconClicked, onStopIconClicked, (Function3) objM87133R3, retryImageUpload, removeImage, list, interfaceC15250v, updateFocusState, keyboardEvent, interfaceC4339a3, c28655q2, (i38 & 126) | (TextResource.$stable << 6) | (i38 & 896) | (i38 & 7168) | (57344 & i38) | (i38 & 458752) | (i38 & 3670016) | (i48 & 29360128) | (i48 & 234881024) | (i48 & 1879048192), ((i38 >> 9) & 3670016) | ((i19 >> 27) & 14) | ((i19 >> 3) & 112) | ((i19 << 6) & 896) | ((i38 >> 12) & 57344) | (i48 & 458752) | (i19 & 29360128) | (i19 & 234881024) | ((i19 << 9) & 1879048192), i24 & 14, 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            interfaceC4339a2 = interfaceC4339a3;
            enumC32692x2 = enumC32692x3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a2 = interfaceC4339a;
            enumC32692x2 = enumC32692x1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.y1
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC32700z1.m102622i(i13, sendFieldColor, placeholderMessage, z4, z13, z14, listState, onSendMessageClicked, retryImageUpload, list, onStopIconClicked, removeImage, onChatIconClicked, z15, state, z16, keyboardEvent, interfaceC15250v, updateFocusState, mediaPickerLauncher, interfaceC4339a2, enumC32692x2, i14, i15, i16, i17, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m102619f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m102620g(Function1 function1, Uri uri, String str) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(str, "<unused var>");
        function1.invoke(uri);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m102621h(InterfaceC4352n interfaceC4352n, String message, List list, List list2) {
        AbstractC22676k.m65750j(message, "message");
        interfaceC4352n.invoke(message, list, list2, Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m102622i(int i13, InterfaceC39332e interfaceC39332e, TextResource textResource, boolean z4, boolean z13, boolean z14, C26068u c26068u, InterfaceC4352n interfaceC4352n, Function1 function1, List list, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a2, boolean z15, EnumC26811m enumC26811m, boolean z16, InterfaceC4351m interfaceC4351m2, InterfaceC15250v interfaceC15250v, Function1 function2, InterfaceC32647n2 interfaceC32647n2, InterfaceC4339a interfaceC4339a3, EnumC32692x1 enumC32692x1, int i14, int i15, int i16, int i17, Composer composer, int i18) {
        m102618e(i13, interfaceC39332e, textResource, z4, z13, z14, c26068u, interfaceC4352n, function1, list, interfaceC4339a, interfaceC4351m, interfaceC4339a2, z15, enumC26811m, z16, interfaceC4351m2, interfaceC15250v, function2, interfaceC32647n2, interfaceC4339a3, enumC32692x1, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), AbstractC28683x.m87244L(i16), i17);
        return C23454a0.f92919a;
    }
}
