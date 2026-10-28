package p734sl0;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.p057ai.chat.models.AttachmentType;
import d30.C11520c;
import dn0.C12211k;
import ge3.AbstractC15751g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import nl0.C26810l;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p490t0.AbstractC33253j;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import ql0.C30469d;
import ql0.InterfaceC30468c;
import re1.C31314a;
import sc2.C32375n;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import xk0.C38423a;
import yb3.AbstractC39414r;
import zg0.C40628k;

/* JADX INFO: renamed from: sl0.d2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0003\u0010)\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f26\b\u0002\u0010\u0017\u001a0\u0012\u0004\u0012\u00020\u0014\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00152\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u001a2\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u001c2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u001c2\u001a\b\u0002\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u001c2\b\u0010#\u001a\u0004\u0018\u00010\"2\u001a\b\u0002\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u001c2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b)\u0010*¨\u0006/²\u0006\u000e\u0010+\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, m65681d2 = {"", "sendFieldIcon", "", "isEnabled", "shouldShowStopGenerating", "enableNewConversation", "isFileUploadEnabled", "Lnl0/m;", "state", "Lsl0/n2;", "mediaPickerLauncher", "Lsl0/r1;", "filePickerLauncher", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ll83/a0;", "onChatIconClicked", "onStopIconClicked", "Lkotlin/Function4;", "", "", "Landroid/net/Uri;", "onSendMessageClicked", "Lnl0/l;", "imageUploadState", "Lkotlin/Function1;", "retryImageUpload", "Lkotlin/Function2;", "removeImage", "Lzg0/k;", "attachmentUploadStates", "removeAttachment", "retryAttachmentUpload", "Lg2/v;", "focusState", "Lxk0/a$a;", "keyboardEvent", "onDisabledInputTapped", "Lsl0/x1;", "autoLaunch", "u", "(IZZZZLnl0/m;Lsl0/n2;Lsl0/r1;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/n;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/m;Ljava/util/List;Lc93/m;Lc93/m;Lg2/v;Lc93/m;Lc93/a;Lsl0/x1;Landroidx/compose/runtime/Composer;IIII)V", "isVoiceInput", "Lq3/y;", "textFieldValue", "isListening", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32597d2 {
    /* JADX INFO: renamed from: A */
    private static final C29891y m101672A(InterfaceC28601c1 interfaceC28601c1) {
        return (C29891y) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: B */
    private static final void m101673B(InterfaceC28601c1 interfaceC28601c1, C29891y c29891y) {
        interfaceC28601c1.setValue(c29891y);
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m101674C(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m101675D(String str, List list, List list2, boolean z4) {
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m101676E(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m101677F(InterfaceC32647n2 interfaceC32647n2) {
        interfaceC32647n2.mo102038a(AbstractC32662q2.c.f135511a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m101678G(InterfaceC32666r1 interfaceC32666r1) {
        if (interfaceC32666r1 != null) {
            interfaceC32666r1.mo102243a();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m101679H(InterfaceC32647n2 interfaceC32647n2) {
        interfaceC32647n2.mo102038a(AbstractC32662q2.a.f135509a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m101680I(boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, boolean z14, boolean z15, boolean z16, List list, List list2, InterfaceC4352n interfaceC4352n, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        if (z4) {
            interfaceC4339a.invoke();
        } else if ((z13 || !AbstractC39414r.m125890i0(m101672A(interfaceC28601c1).f122125a.f92135x)) && z14 && !z15 && !z16) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM131850b = ((C40628k) it.next()).getFileId();
                if (strM131850b != null) {
                    arrayList.add(strM131850b);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                Uri uriM131853e = ((C40628k) it3.next()).getUri();
                if (uriM131853e != null) {
                    arrayList2.add(uriM131853e);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            interfaceC4352n.invoke(m101672A(interfaceC28601c1).f122125a.f92135x, arrayList2, arrayList, Boolean.valueOf(m101715x(interfaceC28601c2)));
            m101673B(interfaceC28601c1, new C29891y(7, (String) null, 0L));
            m101716y(interfaceC28601c2, false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m101681J(boolean z4, C40628k c40628k, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2) {
        if (z4) {
            Uri uriM131853e = c40628k.getUri();
            if (uriM131853e != null) {
                interfaceC4351m.invoke(c40628k.getFileId(), uriM131853e);
            }
        } else {
            Uri uriM131853e2 = c40628k.getUri();
            if (uriM131853e2 != null) {
                interfaceC4351m2.invoke(c40628k.getFileId(), uriM131853e2);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m101682K(boolean z4, C40628k c40628k, Function1 function1, InterfaceC4351m interfaceC4351m) {
        if (z4) {
            Uri uriM131853e = c40628k.getUri();
            if (uriM131853e != null) {
                function1.invoke(uriM131853e);
            }
        } else {
            Uri uriM131853e2 = c40628k.getUri();
            if (uriM131853e2 != null) {
                interfaceC4351m.invoke(uriM131853e2, c40628k.getDisplayName());
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m101683L(InterfaceC28601c1 interfaceC28601c1, C29891y it) {
        AbstractC22676k.m65750j(it, "it");
        m101673B(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m101684M(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m101685N(int i13, boolean z4, boolean z13, boolean z14, boolean z15, EnumC26811m enumC26811m, InterfaceC32647n2 interfaceC32647n2, InterfaceC32666r1 interfaceC32666r1, Modifier modifier, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4352n interfaceC4352n, List list, Function1 function1, InterfaceC4351m interfaceC4351m, List list2, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, InterfaceC15250v interfaceC15250v, InterfaceC4351m interfaceC4351m4, InterfaceC4339a interfaceC4339a3, EnumC32692x1 enumC32692x1, int i14, int i15, int i16, int i17, Composer composer, int i18) throws XmlPullParserException, IOException {
        m101712u(i13, z4, z13, z14, z15, enumC26811m, interfaceC32647n2, interfaceC32666r1, modifier, interfaceC4339a, interfaceC4339a2, interfaceC4352n, list, function1, interfaceC4351m, list2, interfaceC4351m2, interfaceC4351m3, interfaceC15250v, interfaceC4351m4, interfaceC4339a3, enumC32692x1, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), AbstractC28683x.m87244L(i16), i17);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m101686O(Uri it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m101687P(String str, Uri uri) {
        AbstractC22676k.m65750j(uri, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m101688Q(String str, Uri uri) {
        AbstractC22676k.m65750j(uri, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m101689R(Uri uri, String str) {
        AbstractC22676k.m65750j(uri, "<unused var>");
        AbstractC22676k.m65750j(str, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m101690S(C38423a.a aVar, boolean z4) {
        AbstractC22676k.m65750j(aVar, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m101691T() {
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015a  */
    /* JADX WARN: Code duplicated, block: B:102:0x015d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0162  */
    /* JADX WARN: Code duplicated, block: B:107:0x016c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0173  */
    /* JADX WARN: Code duplicated, block: B:111:0x0177  */
    /* JADX WARN: Code duplicated, block: B:113:0x0181  */
    /* JADX WARN: Code duplicated, block: B:114:0x0184  */
    /* JADX WARN: Code duplicated, block: B:116:0x0189  */
    /* JADX WARN: Code duplicated, block: B:119:0x0192  */
    /* JADX WARN: Code duplicated, block: B:120:0x0195  */
    /* JADX WARN: Code duplicated, block: B:122:0x019b  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:150:0x0200  */
    /* JADX WARN: Code duplicated, block: B:152:0x0206  */
    /* JADX WARN: Code duplicated, block: B:154:0x020c  */
    /* JADX WARN: Code duplicated, block: B:155:0x020f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0217  */
    /* JADX WARN: Code duplicated, block: B:160:0x021c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0222  */
    /* JADX WARN: Code duplicated, block: B:164:0x0228  */
    /* JADX WARN: Code duplicated, block: B:165:0x022b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0233  */
    /* JADX WARN: Code duplicated, block: B:170:0x0238  */
    /* JADX WARN: Code duplicated, block: B:172:0x023e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0244  */
    /* JADX WARN: Code duplicated, block: B:178:0x024c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0252  */
    /* JADX WARN: Code duplicated, block: B:184:0x025a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0261  */
    /* JADX WARN: Code duplicated, block: B:188:0x0267  */
    /* JADX WARN: Code duplicated, block: B:190:0x026d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0276  */
    /* JADX WARN: Code duplicated, block: B:195:0x027b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0281  */
    /* JADX WARN: Code duplicated, block: B:199:0x0287  */
    /* JADX WARN: Code duplicated, block: B:200:0x028a  */
    /* JADX WARN: Code duplicated, block: B:202:0x028f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0295  */
    /* JADX WARN: Code duplicated, block: B:206:0x0298  */
    /* JADX WARN: Code duplicated, block: B:208:0x029c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x029e  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:215:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:228:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:231:0x02da  */
    /* JADX WARN: Code duplicated, block: B:232:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:235:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:236:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:239:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:241:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:243:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:245:0x0300  */
    /* JADX WARN: Code duplicated, block: B:247:0x0306  */
    /* JADX WARN: Code duplicated, block: B:248:0x0313  */
    /* JADX WARN: Code duplicated, block: B:250:0x0318  */
    /* JADX WARN: Code duplicated, block: B:252:0x031e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0324  */
    /* JADX WARN: Code duplicated, block: B:255:0x0330  */
    /* JADX WARN: Code duplicated, block: B:257:0x033b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0342  */
    /* JADX WARN: Code duplicated, block: B:260:0x0345  */
    /* JADX WARN: Code duplicated, block: B:262:0x0349  */
    /* JADX WARN: Code duplicated, block: B:264:0x034f  */
    /* JADX WARN: Code duplicated, block: B:265:0x035c  */
    /* JADX WARN: Code duplicated, block: B:267:0x0364  */
    /* JADX WARN: Code duplicated, block: B:269:0x036a  */
    /* JADX WARN: Code duplicated, block: B:271:0x0370  */
    /* JADX WARN: Code duplicated, block: B:273:0x037f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0383  */
    /* JADX WARN: Code duplicated, block: B:276:0x0388  */
    /* JADX WARN: Code duplicated, block: B:278:0x038c  */
    /* JADX WARN: Code duplicated, block: B:280:0x0392  */
    /* JADX WARN: Code duplicated, block: B:282:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:284:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:286:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:288:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:290:0x03be  */
    /* JADX WARN: Code duplicated, block: B:292:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:294:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:296:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:298:0x03da  */
    /* JADX WARN: Code duplicated, block: B:299:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:301:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:303:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:304:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:307:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:310:0x0412  */
    /* JADX WARN: Code duplicated, block: B:313:0x0420  */
    /* JADX WARN: Code duplicated, block: B:316:0x043e  */
    /* JADX WARN: Code duplicated, block: B:320:0x044c  */
    /* JADX WARN: Code duplicated, block: B:322:0x044f  */
    /* JADX WARN: Code duplicated, block: B:325:0x045f  */
    /* JADX WARN: Code duplicated, block: B:326:0x046c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0482  */
    /* JADX WARN: Code duplicated, block: B:332:0x049a  */
    /* JADX WARN: Code duplicated, block: B:335:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:337:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:338:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:343:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:345:0x0514  */
    /* JADX WARN: Code duplicated, block: B:348:0x052d A[EDGE_INSN: B:348:0x052d->B:355:0x0546 BREAK  A[LOOP:3: B:350:0x0533->B:562:?]] */
    /* JADX WARN: Code duplicated, block: B:349:0x052f  */
    /* JADX WARN: Code duplicated, block: B:352:0x0539  */
    /* JADX WARN: Code duplicated, block: B:357:0x054c A[EDGE_INSN: B:357:0x054c->B:364:0x0569 BREAK  A[LOOP:2: B:359:0x0554->B:559:?]] */
    /* JADX WARN: Code duplicated, block: B:358:0x0550  */
    /* JADX WARN: Code duplicated, block: B:361:0x055a  */
    /* JADX WARN: Code duplicated, block: B:366:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:367:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:370:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:373:0x05db  */
    /* JADX WARN: Code duplicated, block: B:377:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:378:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:381:0x05f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:382:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:385:0x060a  */
    /* JADX WARN: Code duplicated, block: B:392:0x0619  */
    /* JADX WARN: Code duplicated, block: B:395:0x0621 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:396:0x0623  */
    /* JADX WARN: Code duplicated, block: B:399:0x0637  */
    /* JADX WARN: Code duplicated, block: B:405:0x0644  */
    /* JADX WARN: Code duplicated, block: B:408:0x064b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:409:0x064d  */
    /* JADX WARN: Code duplicated, block: B:412:0x065c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0669  */
    /* JADX WARN: Code duplicated, block: B:421:0x0670 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:422:0x0672  */
    /* JADX WARN: Code duplicated, block: B:425:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:426:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:429:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:430:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:433:0x06be  */
    /* JADX WARN: Code duplicated, block: B:434:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:437:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:438:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:441:0x06ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:442:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:447:0x0759  */
    /* JADX WARN: Code duplicated, block: B:450:0x0848  */
    /* JADX WARN: Code duplicated, block: B:452:0x0850  */
    /* JADX WARN: Code duplicated, block: B:455:0x0862  */
    /* JADX WARN: Code duplicated, block: B:457:0x0870  */
    /* JADX WARN: Code duplicated, block: B:463:0x0885  */
    /* JADX WARN: Code duplicated, block: B:465:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:466:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:469:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:471:0x08db  */
    /* JADX WARN: Code duplicated, block: B:475:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:477:0x090d  */
    /* JADX WARN: Code duplicated, block: B:478:0x090f  */
    /* JADX WARN: Code duplicated, block: B:481:0x0919  */
    /* JADX WARN: Code duplicated, block: B:482:0x091b  */
    /* JADX WARN: Code duplicated, block: B:485:0x0925 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:488:0x092d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:491:0x095b  */
    /* JADX WARN: Code duplicated, block: B:492:0x095d  */
    /* JADX WARN: Code duplicated, block: B:495:0x0966  */
    /* JADX WARN: Code duplicated, block: B:496:0x0968  */
    /* JADX WARN: Code duplicated, block: B:499:0x0970 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:502:0x0978  */
    /* JADX WARN: Code duplicated, block: B:505:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:508:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:509:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:512:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:514:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:517:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a58 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:526:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:531:0x0aa0  */
    /* JADX WARN: Code duplicated, block: B:534:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:535:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:538:0x0ab3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:541:0x0ab9  */
    /* JADX WARN: Code duplicated, block: B:544:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:546:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:549:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:557:0x054c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[LOOP:2: B:359:0x0554->B:559:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:560:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x052d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[LOOP:3: B:350:0x0533->B:562:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x0105  */
    /* JADX WARN: Code duplicated, block: B:77:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x0119  */
    /* JADX WARN: Code duplicated, block: B:86:0x0127  */
    /* JADX WARN: Code duplicated, block: B:87:0x012c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x0138  */
    /* JADX WARN: Code duplicated, block: B:92:0x013b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0143  */
    /* JADX WARN: Code duplicated, block: B:97:0x014c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v3, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r46v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v89, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r65v7, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: u */
    public static final void m101712u(final int i13, final boolean z4, final boolean z13, final boolean z14, boolean z15, final EnumC26811m state, final InterfaceC32647n2 mediaPickerLauncher, InterfaceC32666r1 interfaceC32666r1, Modifier modifier, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4352n interfaceC4352n, List<C26810l> list, Function1 function1, InterfaceC4351m interfaceC4351m, List<C40628k> list2, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, final InterfaceC15250v interfaceC15250v, InterfaceC4351m interfaceC4351m4, InterfaceC4339a interfaceC4339a3, EnumC32692x1 enumC32692x1, Composer composer, final int i14, final int i15, final int i16, final int i17) throws XmlPullParserException, IOException {
        boolean z16;
        int i18;
        boolean zM87157i;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int iOrdinal;
        int i74;
        boolean z17;
        final InterfaceC32666r1 interfaceC32666r2;
        final Modifier modifier2;
        final InterfaceC4339a interfaceC4339a4;
        final InterfaceC4352n interfaceC4352n2;
        final List<C26810l> list3;
        final Function1 function2;
        final InterfaceC4351m interfaceC4351m5;
        final List<C40628k> list4;
        final InterfaceC4351m interfaceC4351m6;
        final InterfaceC4351m interfaceC4351m7;
        final InterfaceC4351m interfaceC4351m8;
        final InterfaceC4339a interfaceC4339a5;
        final EnumC32692x1 enumC32692x2;
        final boolean z18;
        ?? r10;
        final InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        InterfaceC32666r1 interfaceC32666r3;
        C2314t c2314t;
        Modifier modifier3;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        C2314t c2314t2;
        InterfaceC4352n interfaceC4352n3;
        List<C26810l> list5;
        Function1 function3;
        InterfaceC4351m interfaceC4351m9;
        List<C40628k> list6;
        InterfaceC4351m interfaceC4351m10;
        InterfaceC4351m interfaceC4351m11;
        InterfaceC4351m interfaceC4351m12;
        InterfaceC4339a interfaceC4339a9;
        EnumC32692x1 enumC32692x3;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a10;
        Object objM87133R2;
        InterfaceC21083i interfaceC21083i;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c1;
        int i75;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c1M124460f;
        Context context;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c1M87261o;
        ?? arrayList;
        ArrayList arrayListM74129g1;
        boolean zIsEmpty;
        final boolean z19;
        Iterator it;
        boolean z24;
        Iterator it3;
        boolean z25;
        float f13;
        int iHashCode;
        ?? r46;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C0209i c0209i5;
        boolean z26;
        Object objM87133R6;
        int i76;
        boolean z27;
        Object objM87133R7;
        boolean z28;
        Object objM87133R8;
        boolean z29;
        Object objM87133R9;
        boolean z34;
        boolean z35;
        boolean z36;
        final ArrayList<C40628k> arrayList2;
        boolean z37;
        boolean z38;
        Object obj;
        final InterfaceC28601c1 interfaceC28601c2;
        char c3;
        final InterfaceC28601c1 interfaceC28601c3;
        InterfaceC4352n interfaceC4352n4;
        ?? r14;
        ?? r15;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i6;
        C0209i c0209i7;
        Object obj2;
        InterfaceC4351m interfaceC4351m13;
        InterfaceC4351m interfaceC4351m14;
        InterfaceC4351m interfaceC4351m15;
        Function1 function4;
        boolean z39;
        int iHashCode3;
        C0213j c0213j3;
        C0209i c0209i8;
        int i77;
        boolean zM87153g;
        Object objM87133R10;
        ?? r16;
        InterfaceC4339a interfaceC4339a11;
        Object objM87133R11;
        boolean z44;
        Object objM87133R12;
        int iHashCode4;
        boolean zContains;
        boolean z45;
        boolean z46;
        boolean z47;
        Object objM87133R13;
        InterfaceC4351m interfaceC4351m16;
        InterfaceC4351m interfaceC4351m17;
        int i78;
        boolean z48;
        boolean z49;
        boolean z52;
        Object objM87133R14;
        Function1 function5;
        InterfaceC4351m interfaceC4351m18;
        Iterator it4;
        AbstractC22403o abstractC22403oM79981b;
        AbstractC22403o.c cVar;
        Uri uri;
        Object objM64488a;
        boolean z54;
        Object objM87133R15;
        Object objM87133R16;
        Object objM87133R17;
        Object objM87133R18;
        Object objM87133R19;
        Object objM87133R20;
        Object objM87133R21;
        Object objM87133R22;
        Object objM87133R23;
        boolean zM87157i2;
        int i79;
        int i83;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(mediaPickerLauncher, "mediaPickerLauncher");
        ?? r17 = (C28655q) composer;
        r17.m87154g0(441674155);
        int i84 = (i14 & 6) == 0 ? (r17.m87149e(i13) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i84 |= r17.m87155h(z4) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i84 |= r17.m87155h(z13) ? 256 : 128;
        }
        int i85 = i14 & 3072;
        int i86 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i85 == 0) {
            i84 |= r17.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i87 = i17 & 16;
        int i88 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i87 == 0) {
            if ((i14 & 24576) == 0) {
                z16 = z15;
                i84 |= r17.m87155h(z16) ? DfuBaseService.ERROR_CONNECTION_MASK : 8192;
            }
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (r17.m87149e(state.ordinal())) {
                    i83 = 131072;
                } else {
                    i83 = 65536;
                }
                i84 |= i83;
            }
            if ((i14 & 1572864) == 0) {
                if ((i14 & 2097152) == 0) {
                    zM87157i2 = r17.m87153g(mediaPickerLauncher);
                } else {
                    zM87157i2 = r17.m87157i(mediaPickerLauncher);
                }
                if (zM87157i2) {
                    i79 = 1048576;
                } else {
                    i79 = 524288;
                }
                i84 |= i79;
            }
            i18 = i17 & 128;
            if (i18 != 0) {
                i84 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if ((i14 & 16777216) == 0) {
                    zM87157i = r17.m87153g(interfaceC32666r1);
                } else {
                    zM87157i = r17.m87157i(interfaceC32666r1);
                }
                if (zM87157i) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i84 |= i19;
            }
            i24 = i17 & 256;
            i25 = AndroidSDKConstants.FLAG_MUTABLE;
            if (i24 != 0) {
                i84 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (r17.m87153g(modifier)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i84 |= i26;
            }
            i27 = i17 & 512;
            if (i27 != 0) {
                i84 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                if (r17.m87157i(interfaceC4339a)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i84 |= i28;
            }
            i29 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i29 != 0) {
                i34 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (r17.m87157i(interfaceC4339a2)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i34 = i15 | i35;
            } else {
                i34 = i15;
            }
            i36 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i36 != 0) {
                i34 |= 48;
            } else if ((i15 & 48) != 0) {
                if (r17.m87157i(interfaceC4352n)) {
                    i37 = 32;
                } else {
                    i37 = 16;
                }
                i34 |= i37;
            }
            i38 = i34;
            i39 = i17 & 4096;
            if (i39 != 0) {
                i44 = i38 | 384;
            } else if ((i15 & 384) == 0) {
                i44 = i38 | (r17.m87157i(list) ? 256 : 128);
            } else {
                i44 = i38;
            }
            i45 = i17 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i45 != 0) {
                i47 = i44 | 3072;
            } else {
                i46 = i44;
                if ((i15 & 3072) == 0) {
                    if (r17.m87157i(function1)) {
                        i86 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i47 = i46 | i86;
                } else {
                    i47 = i46;
                }
            }
            i48 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i48 != 0) {
                i54 = i47 | 24576;
            } else {
                i49 = i47;
                if ((i15 & 24576) == 0) {
                    if (r17.m87157i(interfaceC4351m)) {
                        i88 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i54 = i49 | i88;
                } else {
                    i54 = i49;
                }
            }
            i55 = i17 & 32768;
            if (i55 != 0) {
                i54 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (r17.m87157i(list2)) {
                    i56 = 131072;
                } else {
                    i56 = 65536;
                }
                i54 |= i56;
            }
            i57 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i57 != 0) {
                i54 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (r17.m87157i(interfaceC4351m2)) {
                    i58 = 1048576;
                } else {
                    i58 = 524288;
                }
                i54 |= i58;
            }
            i59 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            if (i59 != 0) {
                i54 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                i54 |= r17.m87157i(interfaceC4351m3) ? 8388608 : 4194304;
            }
            if ((i15 & 100663296) == 0) {
                if (r17.m87157i(interfaceC15250v)) {
                    i25 = 67108864;
                }
                i54 |= i25;
            }
            i64 = i17 & 524288;
            if (i64 != 0) {
                i54 |= 805306368;
            } else if ((i15 & 805306368) == 0) {
                i54 |= r17.m87157i(interfaceC4351m4) ? 536870912 : 268435456;
            }
            i65 = i54;
            i66 = i17 & 1048576;
            if (i66 != 0) {
                i67 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (r17.m87157i(interfaceC4339a3)) {
                    i68 = 4;
                } else {
                    i68 = 2;
                }
                i67 = i16 | i68;
            } else {
                i67 = i16;
            }
            i69 = i17 & 2097152;
            if (i69 != 0) {
                i67 |= 48;
            } else if ((i16 & 48) == 0) {
                if (enumC32692x1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC32692x1.ordinal();
                }
                if (r17.m87149e(iOrdinal)) {
                    i74 = 32;
                } else {
                    i74 = 16;
                }
                i67 |= i74;
            }
            if ((i84 & 306783379) != 306783378 && (i65 & 306783379) == 306783378 && (i67 & 19) == 18) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (r17.m87135U(i84 & 1, z17)) {
                if (i87 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    interfaceC32666r3 = null;
                } else {
                    interfaceC32666r3 = interfaceC32666r1;
                }
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R23 = r17.m87133R();
                    if (objM87133R23 == c28676v0) {
                        objM87133R23 = new C32581a1(7);
                        r17.m87172p0(objM87133R23);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R23;
                } else {
                    interfaceC4339a7 = interfaceC4339a;
                }
                if (i29 != 0) {
                    objM87133R22 = r17.m87133R();
                    if (objM87133R22 == c28676v0) {
                        objM87133R22 = new C32581a1(8);
                        r17.m87172p0(objM87133R22);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R22;
                } else {
                    i48 = i48;
                    interfaceC4339a8 = interfaceC4339a2;
                }
                if (i36 != 0) {
                    objM87133R21 = r17.m87133R();
                    if (objM87133R21 == c28676v0) {
                        objM87133R21 = new C11520c(5);
                        r17.m87172p0(objM87133R21);
                    }
                    interfaceC4352n3 = (InterfaceC4352n) objM87133R21;
                    c2314t2 = c2314t;
                } else {
                    interfaceC4339a8 = interfaceC4339a8;
                    c2314t2 = c2314t;
                    interfaceC4352n3 = interfaceC4352n;
                }
                if (i39 != 0) {
                    list5 = null;
                } else {
                    list5 = list;
                }
                if (i45 != 0) {
                    objM87133R20 = r17.m87133R();
                    if (objM87133R20 == c28676v0) {
                        objM87133R20 = new C32375n(26);
                        r17.m87172p0(objM87133R20);
                    }
                    function3 = (Function1) objM87133R20;
                } else {
                    c2314t2 = c2314t2;
                    function3 = function1;
                }
                if (i48 != 0) {
                    objM87133R19 = r17.m87133R();
                    if (objM87133R19 == c28676v0) {
                        objM87133R19 = new C31314a(27);
                        r17.m87172p0(objM87133R19);
                    }
                    interfaceC4351m9 = (InterfaceC4351m) objM87133R19;
                } else {
                    interfaceC4351m9 = interfaceC4351m;
                }
                if (i55 != 0) {
                    list6 = C25271y.f99162w;
                } else {
                    list6 = list2;
                }
                if (i57 != 0) {
                    objM87133R18 = r17.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C31314a(28);
                        r17.m87172p0(objM87133R18);
                    }
                    interfaceC4351m10 = (InterfaceC4351m) objM87133R18;
                } else {
                    interfaceC4351m10 = interfaceC4351m2;
                }
                if (i59 != 0) {
                    objM87133R17 = r17.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C31314a(29);
                        r17.m87172p0(objM87133R17);
                    }
                    interfaceC4351m11 = (InterfaceC4351m) objM87133R17;
                } else {
                    interfaceC4351m11 = interfaceC4351m3;
                }
                if (i64 != 0) {
                    objM87133R16 = r17.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C32587b2(0);
                        r17.m87172p0(objM87133R16);
                    }
                    interfaceC4351m12 = (InterfaceC4351m) objM87133R16;
                } else {
                    interfaceC4351m12 = interfaceC4351m4;
                }
                if (i66 != 0) {
                    objM87133R15 = r17.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C32581a1(9);
                        r17.m87172p0(objM87133R15);
                    }
                    interfaceC4339a9 = (InterfaceC4339a) objM87133R15;
                } else {
                    z16 = z16;
                    interfaceC4339a9 = interfaceC4339a3;
                }
                if (i69 != 0) {
                    enumC32692x3 = EnumC32692x1.NONE;
                } else {
                    enumC32692x3 = enumC32692x1;
                }
                objM87133R = r17.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    r17.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R;
                interfaceC4339a10 = interfaceC4339a9;
                objM87133R2 = r17.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(r17);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R2;
                objM87133R3 = r17.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    r17.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                i75 = i65;
                if (((Boolean) AbstractC15751g.m44460m(interfaceC21083i, r17, 6).getValue()).booleanValue()) {
                    if (interfaceC15250v != null || ((EnumC15251w) interfaceC15250v).m43353a()) {
                        z54 = false;
                    } else {
                        z54 = true;
                    }
                    if (z54) {
                        interfaceC4351m12.invoke(C38423a.a.OPEN, Boolean.TRUE);
                    }
                }
                Object[] objArr = new Object[0];
                objM87133R4 = r17.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C32581a1(10);
                    r17.m87172p0(objM87133R4);
                }
                interfaceC28601c1M124460f = AbstractC39038k.m124460f(objArr, (InterfaceC4339a) objM87133R4, r17);
                context = (Context) r17.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                objM87133R5 = r17.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = C30469d.f125195w.m93232a(context);
                    r17.m87172p0(objM87133R5);
                }
                InterfaceC30468c interfaceC30468c = (InterfaceC30468c) objM87133R5;
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(interfaceC30468c.getIsListening(), r17, 0);
                if (list5 != null) {
                    List<C26810l> list7 = list5;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list7, 10));
                    it4 = list7.iterator();
                    while (it4.hasNext()) {
                        C26810l c26810l = (C26810l) it4.next();
                        AttachmentType attachmentType = AttachmentType.IMAGE;
                        boolean zM79983d = c26810l.getIsUploading();
                        boolean zM79982c = c26810l.getIsError();
                        Iterator it5 = it4;
                        abstractC22403oM79981b = c26810l.getImageSource();
                        if (abstractC22403oM79981b instanceof AbstractC22403o.c) {
                            cVar = (AbstractC22403o.c) abstractC22403oM79981b;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null || (objM64488a = cVar.getData()) == null) {
                            uri = null;
                        } else {
                            uri = Uri.parse(objM64488a.toString());
                        }
                        arrayList.add(new C40628k(attachmentType, zM79983d, zM79982c, uri, null, c26810l.getFileId(), c26810l.getImageSource(), 16, null));
                        it4 = it5;
                    }
                } else {
                    arrayList = C25271y.f99162w;
                }
                arrayListM74129g1 = AbstractC25265s.m74129g1((Collection) arrayList, list6);
                zIsEmpty = arrayListM74129g1.isEmpty();
                z19 = !zIsEmpty;
                if (arrayListM74129g1.isEmpty()) {
                    z24 = false;
                    break;
                }
                it = arrayListM74129g1.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C40628k) it.next()).getIsError()) {
                            z24 = true;
                            break;
                        }
                    } else {
                        z24 = false;
                        break;
                    }
                }
                if (arrayListM74129g1.isEmpty()) {
                    z25 = false;
                    break;
                }
                it3 = arrayListM74129g1.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (((C40628k) it3.next()).getIsUploading()) {
                            z25 = true;
                            break;
                        }
                    } else {
                        z25 = false;
                        break;
                    }
                }
                float f14 = 4;
                Modifier modifierM3396r = AbstractC1099a.m3396r(modifier3, 5 * f14, 0.0f, 2);
                f13 = 1;
                Modifier modifier4 = modifier3;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f14), C2299e.f9108K, r17, 54);
                iHashCode = Long.hashCode(r17.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = r17.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(r17, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                r46 = arrayList;
                c0213j = C0217k.f724b;
                r17.m87158i0();
                if (r17.f115903S) {
                    r17.m87163l(c0213j);
                } else {
                    r17.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(r17, c0209i, c22994r1M66759a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (r17.f115903S) {
                    c0209i4 = c0209i2;
                } else {
                    c0209i4 = c0209i2;
                    if (!AbstractC22676k.m65745e(r17.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(r17, c0209i5, modifierM118962N);
                    if ((1879048192 & i84) == 536870912) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R6 = r17.m87133R();
                    if (z26 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C32579a(interfaceC4339a7, 11);
                        r17.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                    i76 = 3670016 & i84;
                    if (i76 != 1048576 || ((i84 & 2097152) != 0 && r17.m87157i(mediaPickerLauncher))) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    InterfaceC4339a interfaceC4339a13 = interfaceC4339a7;
                    objM87133R7 = r17.m87133R();
                    if (z27 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C32589c(mediaPickerLauncher, 1);
                        r17.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R7;
                    if ((29360128 & i84) != 8388608 || ((i84 & 16777216) != 0 && r17.m87157i(interfaceC32666r3))) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R8 = r17.m87133R();
                    if (z28 || objM87133R8 == c28676v0) {
                        objM87133R8 = new C32683v0(interfaceC32666r3, 4);
                        r17.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R8;
                    if (i76 != 1048576 || ((i84 & 2097152) != 0 && r17.m87157i(mediaPickerLauncher))) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    objM87133R9 = r17.m87133R();
                    if (z29 || objM87133R9 == c28676v0) {
                        objM87133R9 = new C32589c(mediaPickerLauncher, 2);
                        r17.m87172p0(objM87133R9);
                    }
                    AbstractC32613g3.m101771A(z14, z16, interfaceC4339a12, interfaceC4339a14, interfaceC4339a15, (InterfaceC4339a) objM87133R9, null, r17, (i84 >> 9) & 126, 64);
                    if ((i84 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    if ((i75 & 14) == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean zM87155h = z34 | z35 | r17.m87155h(z19) | r17.m87153g(interfaceC28601c1M124460f);
                    if ((i84 & 112) == 32) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean zM87155h2 = zM87155h | z36 | r17.m87155h(z24) | r17.m87155h(z25);
                    arrayList2 = arrayListM74129g1;
                    boolean zM87157i3 = zM87155h2 | r17.m87157i(arrayList2) | r17.m87157i(r46);
                    if ((i75 & 112) == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    z38 = zM87157i3 | z37;
                    Object objM87133R24 = r17.m87133R();
                    if (!z38 || objM87133R24 == c28676v0) {
                        ?? r18 = r17;
                        interfaceC28601c2 = interfaceC28601c1;
                        c3 = ' ';
                        final boolean z55 = z24;
                        final boolean z56 = z25;
                        final ?? r19 = r46;
                        final InterfaceC4352n interfaceC4352n5 = interfaceC4352n3;
                        interfaceC28601c3 = interfaceC28601c1M124460f;
                        final InterfaceC4339a interfaceC4339a16 = interfaceC4339a8;
                        obj = new InterfaceC4339a() { // from class: sl0.c2
                            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC32597d2.m101680I(z13, interfaceC4339a16, z19, z4, z55, z56, arrayList2, r19, interfaceC4352n5, interfaceC28601c3, interfaceC28601c2);
                            }
                        };
                        arrayList2 = arrayList2;
                        interfaceC4352n4 = interfaceC4352n5;
                        r18.m87172p0(obj);
                        r15 = r19;
                        r14 = r18;
                    } else {
                        interfaceC4352n4 = interfaceC4352n3;
                        r14 = r17;
                        c3 = ' ';
                        r15 = r46;
                        obj = objM87133R24;
                        interfaceC28601c2 = interfaceC28601c1;
                        interfaceC28601c3 = interfaceC28601c1M124460f;
                    }
                    InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) obj;
                    AbstractC32619i.m101827S(state, interfaceC28601c4, r14, ((i84 >> 15) & 14) | 48);
                    if (m101674C(interfaceC28601c1M87261o)) {
                        m101716y(interfaceC28601c2, true);
                    }
                    C17909s c17909s = AbstractC17911t.f69612b;
                    float f15 = 3 * f14;
                    Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC15751g.m44456i(f13, c2314t2, C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(3213583103L)), new C17919x(AbstractC17918w0.m51515c(1062262271)), new C17919x(AbstractC17918w0.m51515c(441505279)), new C17919x(AbstractC17918w0.m51515c(223401471)), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(0.0f)) << c3) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(100.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(10.0f)) << c3), 8), AbstractC33253j.m105489e(f15)), C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4279636265L)), new C17919x(AbstractC17918w0.m51517e(4279050279L))), 0L, 0L, 14), AbstractC33253j.m105489e(f15), 0.0f, 4);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r14, 0);
                    iHashCode2 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = r14.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(r14, modifierM3357b);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        c0213j2 = c0213j;
                        r14.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        r14.m87178s0();
                    }
                    AbstractC28683x.m87239G(r14, c0209i, c23010xM66775a);
                    c0209i6 = c0209i4;
                    AbstractC28683x.m87239G(r14, c0209i6, interfaceC28653p1M87165m2);
                    if (r14.f115903S && AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i7 = c0209i3;
                    } else {
                        c0209i7 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i7);
                    }
                    AbstractC28683x.m87239G(r14, c0209i5, modifierM118962N2);
                    if (arrayList2.isEmpty()) {
                        obj2 = c28676v0;
                        interfaceC4351m13 = interfaceC4351m9;
                        interfaceC4351m14 = interfaceC4351m10;
                        interfaceC4351m15 = interfaceC4351m11;
                        function4 = function3;
                        z39 = false;
                        r14.m87150e0(1885591229);
                        r14.m87173q(false);
                    } else {
                        r14.m87150e0(1884399155);
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(f13 * 8);
                        Modifier modifierM92100V = AbstractC30060g.m92100V(c2314t2, AbstractC30060g.m92099U(0, r14, 1), true, false);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, r14, 6);
                        iHashCode4 = Long.hashCode(r14.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = r14.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(r14, modifierM92100V);
                        r14.m87158i0();
                        if (r14.f115903S) {
                            r14.m87163l(c0213j2);
                        } else {
                            r14.m87178s0();
                        }
                        AbstractC28683x.m87239G(r14, c0209i, c22994r1M66759a2);
                        AbstractC28683x.m87239G(r14, c0209i6, interfaceC28653p1M87165m3);
                        if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i7);
                        }
                        AbstractC28683x.m87239G(r14, c0209i5, modifierM118962N3);
                        r14.m87150e0(-1701707135);
                        for (C40628k c40628k : arrayList2) {
                            zContains = r15.contains(c40628k);
                            boolean zM87155h3 = r14.m87155h(zContains) | r14.m87157i(c40628k);
                            if ((i75 & 57344) == 16384) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            boolean z57 = zM87155h3 | z45;
                            if ((i75 & 3670016) == 1048576) {
                                z46 = true;
                            } else {
                                z46 = false;
                            }
                            z47 = z57 | z46;
                            objM87133R13 = r14.m87133R();
                            C28676v0 c28676v1 = c28676v0;
                            if (!z47 || objM87133R13 == c28676v1) {
                                InterfaceC4351m interfaceC4351m19 = interfaceC4351m9;
                                InterfaceC4351m interfaceC4351m20 = interfaceC4351m10;
                                objM87133R13 = new C12211k(zContains, c40628k, interfaceC4351m19, interfaceC4351m20, 6);
                                interfaceC4351m16 = interfaceC4351m19;
                                interfaceC4351m17 = interfaceC4351m20;
                                r14.m87172p0(objM87133R13);
                            } else {
                                interfaceC4351m16 = interfaceC4351m9;
                                interfaceC4351m17 = interfaceC4351m10;
                            }
                            InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R13;
                            boolean zM87155h4 = r14.m87155h(zContains) | r14.m87157i(c40628k);
                            i78 = i75;
                            if ((i78 & 7168) == 2048) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                            boolean z58 = zM87155h4 | z48;
                            if ((29360128 & i78) == 8388608) {
                                z49 = true;
                            } else {
                                z49 = false;
                            }
                            z52 = z58 | z49;
                            objM87133R14 = r14.m87133R();
                            if (!z52 || objM87133R14 == c28676v1) {
                                InterfaceC4351m interfaceC4351m21 = interfaceC4351m11;
                                Function1 function6 = function3;
                                objM87133R14 = new C12211k(zContains, c40628k, function6, interfaceC4351m21, 7);
                                function5 = function6;
                                interfaceC4351m18 = interfaceC4351m21;
                                r14.m87172p0(objM87133R14);
                            } else {
                                interfaceC4351m18 = interfaceC4351m11;
                                function5 = function3;
                            }
                            AbstractC32591c1.m101655j(c40628k, interfaceC4339a18, (InterfaceC4339a) objM87133R14, null, r14, 0, 8);
                            i75 = i78;
                            c28676v0 = c28676v1;
                            interfaceC4351m10 = interfaceC4351m17;
                            function3 = function5;
                            interfaceC4351m11 = interfaceC4351m18;
                            interfaceC4351m9 = interfaceC4351m16;
                        }
                        obj2 = c28676v0;
                        interfaceC4351m13 = interfaceC4351m9;
                        interfaceC4351m14 = interfaceC4351m10;
                        interfaceC4351m15 = interfaceC4351m11;
                        function4 = function3;
                        z39 = false;
                        AbstractC25012a.m73392y(r14, false, true, false);
                    }
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z39);
                    iHashCode3 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = r14.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(r14, c2314t2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    r14.m87158i0();
                    if (r14.f115903S) {
                        r14.m87163l(c0213j3);
                    } else {
                        r14.m87178s0();
                    }
                    AbstractC28683x.m87239G(r14, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(r14, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i8 = C0217k.f732j;
                    if (r14.f115903S || !AbstractC22676k.m65745e(r14.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i8);
                    }
                    AbstractC28683x.m87239G(r14, C0217k.f726d, modifierM118962N4);
                    C29891y c29891yM101672A = m101672A(interfaceC28601c3);
                    if (!zIsEmpty && AbstractC39414r.m125890i0(m101672A(interfaceC28601c3).f122125a.f92135x) && interfaceC30468c.isAvailable()) {
                        i77 = AbstractC37335a.f159606h;
                    } else {
                        i77 = i13;
                    }
                    zM87153g = r14.m87153g(interfaceC28601c3);
                    objM87133R10 = r14.m87133R();
                    if (zM87153g || objM87133R10 == obj2) {
                        objM87133R10 = new C32614h(4, interfaceC28601c3);
                        r14.m87172p0(objM87133R10);
                    }
                    r16 = r14;
                    EnumC32692x1 enumC32692x4 = enumC32692x3;
                    AbstractC32658p3.m102225y(i77, (Function1) objM87133R10, c29891yM101672A, interfaceC4339a17, z19, z13, interfaceC30468c, false, z4, enumC32692x4, r16, ((i84 << 9) & 458752) | ((i84 << 21) & 234881024) | ((i67 << 24) & 1879048192), 128);
                    if (z4) {
                        interfaceC4339a11 = interfaceC4339a10;
                        r16.m87150e0(1952979927);
                        r16.m87173q(false);
                    } else {
                        r16.m87150e0(1952597449);
                        Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t2);
                        objM87133R11 = r16.m87133R();
                        if (objM87133R11 == obj2) {
                            objM87133R11 = AbstractC11266d.m30453g(r16);
                        }
                        InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R11;
                        if ((i67 & 14) == 4) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = r16.m87133R();
                        if (!z44 || objM87133R12 == obj2) {
                            interfaceC4339a11 = interfaceC4339a10;
                            objM87133R12 = new C32579a(interfaceC4339a11, 12);
                            r16.m87172p0(objM87133R12);
                        } else {
                            interfaceC4339a11 = interfaceC4339a10;
                        }
                        AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R12, 28), r16, 0);
                        r16.m87173q(false);
                    }
                    AbstractC25012a.m73392y(r16, true, true, true);
                    r10 = r16;
                    list3 = list5;
                    interfaceC32666r2 = interfaceC32666r3;
                    interfaceC4351m5 = interfaceC4351m13;
                    interfaceC4351m6 = interfaceC4351m14;
                    z18 = z16;
                    function2 = function4;
                    interfaceC4351m7 = interfaceC4351m15;
                    interfaceC4352n2 = interfaceC4352n4;
                    interfaceC4339a4 = interfaceC4339a8;
                    list4 = list6;
                    interfaceC4351m8 = interfaceC4351m12;
                    interfaceC4339a6 = interfaceC4339a13;
                    interfaceC4339a5 = interfaceC4339a11;
                    enumC32692x2 = enumC32692x4;
                    modifier2 = modifier4;
                }
                AbstractC11266d.m30471y(iHashCode, r17, iHashCode, c0209i3);
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(r17, c0209i5, modifierM118962N);
                if ((1879048192 & i84) == 536870912) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R6 = r17.m87133R();
                if (z26) {
                    objM87133R6 = new C32579a(interfaceC4339a7, 11);
                    r17.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C32579a(interfaceC4339a7, 11);
                    r17.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R6;
                i76 = 3670016 & i84;
                if (i76 != 1048576) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                InterfaceC4339a interfaceC4339a110 = interfaceC4339a7;
                objM87133R7 = r17.m87133R();
                if (z27) {
                    objM87133R7 = new C32589c(mediaPickerLauncher, 1);
                    r17.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C32589c(mediaPickerLauncher, 1);
                    r17.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R7;
                if ((29360128 & i84) != 8388608) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                objM87133R8 = r17.m87133R();
                if (z28) {
                    objM87133R8 = new C32683v0(interfaceC32666r3, 4);
                    r17.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C32683v0(interfaceC32666r3, 4);
                    r17.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R8;
                if (i76 != 1048576) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                objM87133R9 = r17.m87133R();
                if (z29) {
                    objM87133R9 = new C32589c(mediaPickerLauncher, 2);
                    r17.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C32589c(mediaPickerLauncher, 2);
                    r17.m87172p0(objM87133R9);
                }
                AbstractC32613g3.m101771A(z14, z16, interfaceC4339a19, interfaceC4339a111, interfaceC4339a112, (InterfaceC4339a) objM87133R9, null, r17, (i84 >> 9) & 126, 64);
                if ((i84 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if ((i75 & 14) == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean zM87155h5 = z34 | z35 | r17.m87155h(z19) | r17.m87153g(interfaceC28601c1M124460f);
                if ((i84 & 112) == 32) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean zM87155h6 = zM87155h5 | z36 | r17.m87155h(z24) | r17.m87155h(z25);
                arrayList2 = arrayListM74129g1;
                boolean zM87157i4 = zM87155h6 | r17.m87157i(arrayList2) | r17.m87157i(r46);
                if ((i75 & 112) == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = zM87157i4 | z37;
                Object objM87133R25 = r17.m87133R();
                if (z38) {
                    ?? r110 = r17;
                    interfaceC28601c2 = interfaceC28601c1;
                    c3 = ' ';
                    final boolean z59 = z24;
                    final boolean z510 = z25;
                    final List r111 = r46;
                    final InterfaceC4352n interfaceC4352n6 = interfaceC4352n3;
                    interfaceC28601c3 = interfaceC28601c1M124460f;
                    final InterfaceC4339a interfaceC4339a113 = interfaceC4339a8;
                    obj = new InterfaceC4339a() { // from class: sl0.c2
                        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32597d2.m101680I(z13, interfaceC4339a113, z19, z4, z59, z510, arrayList2, r111, interfaceC4352n6, interfaceC28601c3, interfaceC28601c2);
                        }
                    };
                    arrayList2 = arrayList2;
                    interfaceC4352n4 = interfaceC4352n6;
                    r110.m87172p0(obj);
                    r15 = r111;
                    r14 = r110;
                } else {
                    ?? r112 = r17;
                    interfaceC28601c2 = interfaceC28601c1;
                    c3 = ' ';
                    final boolean z511 = z24;
                    final boolean z512 = z25;
                    final List r113 = r46;
                    final InterfaceC4352n interfaceC4352n7 = interfaceC4352n3;
                    interfaceC28601c3 = interfaceC28601c1M124460f;
                    final InterfaceC4339a interfaceC4339a114 = interfaceC4339a8;
                    obj = new InterfaceC4339a() { // from class: sl0.c2
                        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32597d2.m101680I(z13, interfaceC4339a114, z19, z4, z511, z512, arrayList2, r113, interfaceC4352n7, interfaceC28601c3, interfaceC28601c2);
                        }
                    };
                    arrayList2 = arrayList2;
                    interfaceC4352n4 = interfaceC4352n7;
                    r112.m87172p0(obj);
                    r15 = r113;
                    r14 = r112;
                }
                InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) obj;
                AbstractC32619i.m101827S(state, interfaceC28601c4, r14, ((i84 >> 15) & 14) | 48);
                if (m101674C(interfaceC28601c1M87261o)) {
                    m101716y(interfaceC28601c2, true);
                }
                C17909s c17909s2 = AbstractC17911t.f69612b;
                float f16 = 3 * f14;
                Modifier modifierM3357b2 = AbstractC1092a.m3357b(AbstractC15751g.m44456i(f13, c2314t2, C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(3213583103L)), new C17919x(AbstractC17918w0.m51515c(1062262271)), new C17919x(AbstractC17918w0.m51515c(441505279)), new C17919x(AbstractC17918w0.m51515c(223401471)), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(0.0f)) << c3) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(100.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(10.0f)) << c3), 8), AbstractC33253j.m105489e(f16)), C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4279636265L)), new C17919x(AbstractC17918w0.m51517e(4279050279L))), 0L, 0L, 14), AbstractC33253j.m105489e(f16), 0.0f, 4);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r14, 0);
                iHashCode2 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = r14.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(r14, modifierM3357b2);
                r14.m87158i0();
                if (r14.f115903S) {
                    c0213j2 = c0213j;
                    r14.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, c0209i, c23010xM66775a2);
                c0209i6 = c0209i4;
                AbstractC28683x.m87239G(r14, c0209i6, interfaceC28653p1M87165m5);
                if (r14.f115903S) {
                    c0209i7 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i7);
                } else {
                    c0209i7 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i7);
                }
                AbstractC28683x.m87239G(r14, c0209i5, modifierM118962N5);
                if (arrayList2.isEmpty()) {
                    r14.m87150e0(1884399155);
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f13 * 8);
                    Modifier modifierM92100V2 = AbstractC30060g.m92100V(c2314t2, AbstractC30060g.m92099U(0, r14, 1), true, false);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22971kM66746i2, C2299e.f9107J, r14, 6);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = r14.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(r14, modifierM92100V2);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        r14.m87163l(c0213j2);
                    } else {
                        r14.m87178s0();
                    }
                    AbstractC28683x.m87239G(r14, c0209i, c22994r1M66759a3);
                    AbstractC28683x.m87239G(r14, c0209i6, interfaceC28653p1M87165m6);
                    if (r14.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(r14, c0209i5, modifierM118962N6);
                    r14.m87150e0(-1701707135);
                    while (r0.hasNext()) {
                        zContains = r15.contains(c40628k);
                        boolean zM87155h7 = r14.m87155h(zContains) | r14.m87157i(c40628k);
                        if ((i75 & 57344) == 16384) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        boolean z513 = zM87155h7 | z45;
                        if ((i75 & 3670016) == 1048576) {
                            z46 = true;
                        } else {
                            z46 = false;
                        }
                        z47 = z513 | z46;
                        objM87133R13 = r14.m87133R();
                        C28676v0 c28676v2 = c28676v0;
                        if (z47) {
                            InterfaceC4351m interfaceC4351m110 = interfaceC4351m9;
                            InterfaceC4351m interfaceC4351m22 = interfaceC4351m10;
                            objM87133R13 = new C12211k(zContains, c40628k, interfaceC4351m110, interfaceC4351m22, 6);
                            interfaceC4351m16 = interfaceC4351m110;
                            interfaceC4351m17 = interfaceC4351m22;
                            r14.m87172p0(objM87133R13);
                        } else {
                            InterfaceC4351m interfaceC4351m111 = interfaceC4351m9;
                            InterfaceC4351m interfaceC4351m23 = interfaceC4351m10;
                            objM87133R13 = new C12211k(zContains, c40628k, interfaceC4351m111, interfaceC4351m23, 6);
                            interfaceC4351m16 = interfaceC4351m111;
                            interfaceC4351m17 = interfaceC4351m23;
                            r14.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a116 = (InterfaceC4339a) objM87133R13;
                        boolean zM87155h8 = r14.m87155h(zContains) | r14.m87157i(c40628k);
                        i78 = i75;
                        if ((i78 & 7168) == 2048) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        boolean z514 = zM87155h8 | z48;
                        if ((29360128 & i78) == 8388608) {
                            z49 = true;
                        } else {
                            z49 = false;
                        }
                        z52 = z514 | z49;
                        objM87133R14 = r14.m87133R();
                        if (z52) {
                            InterfaceC4351m interfaceC4351m24 = interfaceC4351m11;
                            Function1 function7 = function3;
                            objM87133R14 = new C12211k(zContains, c40628k, function7, interfaceC4351m24, 7);
                            function5 = function7;
                            interfaceC4351m18 = interfaceC4351m24;
                            r14.m87172p0(objM87133R14);
                        } else {
                            InterfaceC4351m interfaceC4351m25 = interfaceC4351m11;
                            Function1 function8 = function3;
                            objM87133R14 = new C12211k(zContains, c40628k, function8, interfaceC4351m25, 7);
                            function5 = function8;
                            interfaceC4351m18 = interfaceC4351m25;
                            r14.m87172p0(objM87133R14);
                        }
                        AbstractC32591c1.m101655j(c40628k, interfaceC4339a116, (InterfaceC4339a) objM87133R14, null, r14, 0, 8);
                        i75 = i78;
                        c28676v0 = c28676v2;
                        interfaceC4351m10 = interfaceC4351m17;
                        function3 = function5;
                        interfaceC4351m11 = interfaceC4351m18;
                        interfaceC4351m9 = interfaceC4351m16;
                    }
                    obj2 = c28676v0;
                    interfaceC4351m13 = interfaceC4351m9;
                    interfaceC4351m14 = interfaceC4351m10;
                    interfaceC4351m15 = interfaceC4351m11;
                    function4 = function3;
                    z39 = false;
                    AbstractC25012a.m73392y(r14, false, true, false);
                } else {
                    obj2 = c28676v0;
                    interfaceC4351m13 = interfaceC4351m9;
                    interfaceC4351m14 = interfaceC4351m10;
                    interfaceC4351m15 = interfaceC4351m11;
                    function4 = function3;
                    z39 = false;
                    r14.m87150e0(1885591229);
                    r14.m87173q(false);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z39);
                iHashCode3 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = r14.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(r14, c2314t2);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                r14.m87158i0();
                if (r14.f115903S) {
                    r14.m87163l(c0213j3);
                } else {
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(r14, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i8 = C0217k.f732j;
                if (r14.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i8);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i8);
                }
                AbstractC28683x.m87239G(r14, C0217k.f726d, modifierM118962N7);
                C29891y c29891yM101672A2 = m101672A(interfaceC28601c3);
                if (!zIsEmpty) {
                    i77 = i13;
                } else {
                    i77 = i13;
                }
                zM87153g = r14.m87153g(interfaceC28601c3);
                objM87133R10 = r14.m87133R();
                if (zM87153g) {
                    objM87133R10 = new C32614h(4, interfaceC28601c3);
                    r14.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C32614h(4, interfaceC28601c3);
                    r14.m87172p0(objM87133R10);
                }
                r16 = r14;
                EnumC32692x1 enumC32692x5 = enumC32692x3;
                AbstractC32658p3.m102225y(i77, (Function1) objM87133R10, c29891yM101672A2, interfaceC4339a115, z19, z13, interfaceC30468c, false, z4, enumC32692x5, r16, ((i84 << 9) & 458752) | ((i84 << 21) & 234881024) | ((i67 << 24) & 1879048192), 128);
                if (z4) {
                    r16.m87150e0(1952597449);
                    Modifier modifierMo3401b2 = C1100b.f4583a.mo3401b(c2314t2);
                    objM87133R11 = r16.m87133R();
                    if (objM87133R11 == obj2) {
                        objM87133R11 = AbstractC11266d.m30453g(r16);
                    }
                    InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R11;
                    if ((i67 & 14) == 4) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R12 = r16.m87133R();
                    if (z44) {
                        interfaceC4339a11 = interfaceC4339a10;
                        objM87133R12 = new C32579a(interfaceC4339a11, 12);
                        r16.m87172p0(objM87133R12);
                    } else {
                        interfaceC4339a11 = interfaceC4339a10;
                        objM87133R12 = new C32579a(interfaceC4339a11, 12);
                        r16.m87172p0(objM87133R12);
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b2, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R12, 28), r16, 0);
                    r16.m87173q(false);
                } else {
                    interfaceC4339a11 = interfaceC4339a10;
                    r16.m87150e0(1952979927);
                    r16.m87173q(false);
                }
                AbstractC25012a.m73392y(r16, true, true, true);
                r10 = r16;
                list3 = list5;
                interfaceC32666r2 = interfaceC32666r3;
                interfaceC4351m5 = interfaceC4351m13;
                interfaceC4351m6 = interfaceC4351m14;
                z18 = z16;
                function2 = function4;
                interfaceC4351m7 = interfaceC4351m15;
                interfaceC4352n2 = interfaceC4352n4;
                interfaceC4339a4 = interfaceC4339a8;
                list4 = list6;
                interfaceC4351m8 = interfaceC4351m12;
                interfaceC4339a6 = interfaceC4339a110;
                interfaceC4339a5 = interfaceC4339a11;
                enumC32692x2 = enumC32692x5;
                modifier2 = modifier4;
            } else {
                r17.m87138X();
                interfaceC32666r2 = interfaceC32666r1;
                modifier2 = modifier;
                interfaceC4339a4 = interfaceC4339a2;
                interfaceC4352n2 = interfaceC4352n;
                list3 = list;
                function2 = function1;
                interfaceC4351m5 = interfaceC4351m;
                list4 = list2;
                interfaceC4351m6 = interfaceC4351m2;
                interfaceC4351m7 = interfaceC4351m3;
                interfaceC4351m8 = interfaceC4351m4;
                interfaceC4339a5 = interfaceC4339a3;
                enumC32692x2 = enumC32692x1;
                z18 = z16;
                r10 = r17;
                interfaceC4339a6 = interfaceC4339a;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.a2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC32597d2.m101685N(i13, z4, z13, z14, z18, state, mediaPickerLauncher, interfaceC32666r2, modifier2, interfaceC4339a6, interfaceC4339a4, interfaceC4352n2, list3, function2, interfaceC4351m5, list4, interfaceC4351m6, interfaceC4351m7, interfaceC15250v, interfaceC4351m8, interfaceC4339a5, enumC32692x2, i14, i15, i16, i17, (Composer) obj3, iIntValue);
                    }
                };
            }
        }
        i84 |= 24576;
        z16 = z15;
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (r17.m87149e(state.ordinal())) {
                i83 = 131072;
            } else {
                i83 = 65536;
            }
            i84 |= i83;
        }
        if ((i14 & 1572864) == 0) {
            if ((i14 & 2097152) == 0) {
                zM87157i2 = r17.m87153g(mediaPickerLauncher);
            } else {
                zM87157i2 = r17.m87157i(mediaPickerLauncher);
            }
            if (zM87157i2) {
                i79 = 1048576;
            } else {
                i79 = 524288;
            }
            i84 |= i79;
        }
        i18 = i17 & 128;
        if (i18 != 0) {
            i84 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if ((i14 & 16777216) == 0) {
                zM87157i = r17.m87153g(interfaceC32666r1);
            } else {
                zM87157i = r17.m87157i(interfaceC32666r1);
            }
            if (zM87157i) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i84 |= i19;
        }
        i24 = i17 & 256;
        i25 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i24 != 0) {
            i84 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (r17.m87153g(modifier)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i84 |= i26;
        }
        i27 = i17 & 512;
        if (i27 != 0) {
            i84 |= 805306368;
        } else if ((i14 & 805306368) == 0) {
            if (r17.m87157i(interfaceC4339a)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i84 |= i28;
        }
        i29 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i29 != 0) {
            i34 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (r17.m87157i(interfaceC4339a2)) {
                i35 = 4;
            } else {
                i35 = 2;
            }
            i34 = i15 | i35;
        } else {
            i34 = i15;
        }
        i36 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i36 != 0) {
            i34 |= 48;
        } else if ((i15 & 48) != 0) {
            if (r17.m87157i(interfaceC4352n)) {
                i37 = 32;
            } else {
                i37 = 16;
            }
            i34 |= i37;
        }
        i38 = i34;
        i39 = i17 & 4096;
        if (i39 != 0) {
            i44 = i38 | 384;
        } else if ((i15 & 384) == 0) {
            i44 = i38 | (r17.m87157i(list) ? 256 : 128);
        } else {
            i44 = i38;
        }
        i45 = i17 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i45 != 0) {
            i47 = i44 | 3072;
        } else {
            i46 = i44;
            if ((i15 & 3072) == 0) {
                if (r17.m87157i(function1)) {
                    i86 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i47 = i46 | i86;
            } else {
                i47 = i46;
            }
        }
        i48 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i48 != 0) {
            i54 = i47 | 24576;
        } else {
            i49 = i47;
            if ((i15 & 24576) == 0) {
                if (r17.m87157i(interfaceC4351m)) {
                    i88 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i54 = i49 | i88;
            } else {
                i54 = i49;
            }
        }
        i55 = i17 & 32768;
        if (i55 != 0) {
            i54 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (r17.m87157i(list2)) {
                i56 = 131072;
            } else {
                i56 = 65536;
            }
            i54 |= i56;
        }
        i57 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i57 != 0) {
            i54 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (r17.m87157i(interfaceC4351m2)) {
                i58 = 1048576;
            } else {
                i58 = 524288;
            }
            i54 |= i58;
        }
        i59 = i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        if (i59 != 0) {
            i54 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            i54 |= r17.m87157i(interfaceC4351m3) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            if (r17.m87157i(interfaceC15250v)) {
                i25 = 67108864;
            }
            i54 |= i25;
        }
        i64 = i17 & 524288;
        if (i64 != 0) {
            i54 |= 805306368;
        } else if ((i15 & 805306368) == 0) {
            i54 |= r17.m87157i(interfaceC4351m4) ? 536870912 : 268435456;
        }
        i65 = i54;
        i66 = i17 & 1048576;
        if (i66 != 0) {
            i67 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (r17.m87157i(interfaceC4339a3)) {
                i68 = 4;
            } else {
                i68 = 2;
            }
            i67 = i16 | i68;
        } else {
            i67 = i16;
        }
        i69 = i17 & 2097152;
        if (i69 != 0) {
            i67 |= 48;
        } else if ((i16 & 48) == 0) {
            if (enumC32692x1 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC32692x1.ordinal();
            }
            if (r17.m87149e(iOrdinal)) {
                i74 = 32;
            } else {
                i74 = 16;
            }
            i67 |= i74;
        }
        if ((i84 & 306783379) != 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (r17.m87135U(i84 & 1, z17)) {
            if (i87 != 0) {
                z16 = false;
            }
            if (i18 != 0) {
                interfaceC32666r3 = null;
            } else {
                interfaceC32666r3 = interfaceC32666r1;
            }
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier;
            }
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                objM87133R23 = r17.m87133R();
                if (objM87133R23 == c28676v0) {
                    objM87133R23 = new C32581a1(7);
                    r17.m87172p0(objM87133R23);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R23;
            } else {
                interfaceC4339a7 = interfaceC4339a;
            }
            if (i29 != 0) {
                objM87133R22 = r17.m87133R();
                if (objM87133R22 == c28676v0) {
                    objM87133R22 = new C32581a1(8);
                    r17.m87172p0(objM87133R22);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R22;
            } else {
                i48 = i48;
                interfaceC4339a8 = interfaceC4339a2;
            }
            if (i36 != 0) {
                objM87133R21 = r17.m87133R();
                if (objM87133R21 == c28676v0) {
                    objM87133R21 = new C11520c(5);
                    r17.m87172p0(objM87133R21);
                }
                interfaceC4352n3 = (InterfaceC4352n) objM87133R21;
                c2314t2 = c2314t;
            } else {
                interfaceC4339a8 = interfaceC4339a8;
                c2314t2 = c2314t;
                interfaceC4352n3 = interfaceC4352n;
            }
            if (i39 != 0) {
                list5 = null;
            } else {
                list5 = list;
            }
            if (i45 != 0) {
                objM87133R20 = r17.m87133R();
                if (objM87133R20 == c28676v0) {
                    objM87133R20 = new C32375n(26);
                    r17.m87172p0(objM87133R20);
                }
                function3 = (Function1) objM87133R20;
            } else {
                c2314t2 = c2314t2;
                function3 = function1;
            }
            if (i48 != 0) {
                objM87133R19 = r17.m87133R();
                if (objM87133R19 == c28676v0) {
                    objM87133R19 = new C31314a(27);
                    r17.m87172p0(objM87133R19);
                }
                interfaceC4351m9 = (InterfaceC4351m) objM87133R19;
            } else {
                interfaceC4351m9 = interfaceC4351m;
            }
            if (i55 != 0) {
                list6 = C25271y.f99162w;
            } else {
                list6 = list2;
            }
            if (i57 != 0) {
                objM87133R18 = r17.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = new C31314a(28);
                    r17.m87172p0(objM87133R18);
                }
                interfaceC4351m10 = (InterfaceC4351m) objM87133R18;
            } else {
                interfaceC4351m10 = interfaceC4351m2;
            }
            if (i59 != 0) {
                objM87133R17 = r17.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = new C31314a(29);
                    r17.m87172p0(objM87133R17);
                }
                interfaceC4351m11 = (InterfaceC4351m) objM87133R17;
            } else {
                interfaceC4351m11 = interfaceC4351m3;
            }
            if (i64 != 0) {
                objM87133R16 = r17.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = new C32587b2(0);
                    r17.m87172p0(objM87133R16);
                }
                interfaceC4351m12 = (InterfaceC4351m) objM87133R16;
            } else {
                interfaceC4351m12 = interfaceC4351m4;
            }
            if (i66 != 0) {
                objM87133R15 = r17.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C32581a1(9);
                    r17.m87172p0(objM87133R15);
                }
                interfaceC4339a9 = (InterfaceC4339a) objM87133R15;
            } else {
                z16 = z16;
                interfaceC4339a9 = interfaceC4339a3;
            }
            if (i69 != 0) {
                enumC32692x3 = EnumC32692x1.NONE;
            } else {
                enumC32692x3 = enumC32692x1;
            }
            objM87133R = r17.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                r17.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R;
            interfaceC4339a10 = interfaceC4339a9;
            objM87133R2 = r17.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(r17);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R2;
            objM87133R3 = r17.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                r17.m87172p0(objM87133R3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            i75 = i65;
            if (((Boolean) AbstractC15751g.m44460m(interfaceC21083i, r17, 6).getValue()).booleanValue()) {
                if (interfaceC15250v != null) {
                    z54 = false;
                } else {
                    z54 = false;
                }
                if (z54) {
                    interfaceC4351m12.invoke(C38423a.a.OPEN, Boolean.TRUE);
                }
            }
            Object[] objArr2 = new Object[0];
            objM87133R4 = r17.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C32581a1(10);
                r17.m87172p0(objM87133R4);
            }
            interfaceC28601c1M124460f = AbstractC39038k.m124460f(objArr2, (InterfaceC4339a) objM87133R4, r17);
            context = (Context) r17.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            objM87133R5 = r17.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = C30469d.f125195w.m93232a(context);
                r17.m87172p0(objM87133R5);
            }
            InterfaceC30468c interfaceC30468c2 = (InterfaceC30468c) objM87133R5;
            interfaceC28601c1M87261o = AbstractC28683x.m87261o(interfaceC30468c2.getIsListening(), r17, 0);
            if (list5 != null) {
                List<C26810l> list8 = list5;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list8, 10));
                it4 = list8.iterator();
                while (it4.hasNext()) {
                    C26810l c26810l2 = (C26810l) it4.next();
                    AttachmentType attachmentType2 = AttachmentType.IMAGE;
                    boolean zM79983d2 = c26810l2.getIsUploading();
                    boolean zM79982c2 = c26810l2.getIsError();
                    Iterator it6 = it4;
                    abstractC22403oM79981b = c26810l2.getImageSource();
                    if (abstractC22403oM79981b instanceof AbstractC22403o.c) {
                        cVar = (AbstractC22403o.c) abstractC22403oM79981b;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        uri = null;
                    } else {
                        uri = null;
                    }
                    arrayList.add(new C40628k(attachmentType2, zM79983d2, zM79982c2, uri, null, c26810l2.getFileId(), c26810l2.getImageSource(), 16, null));
                    it4 = it6;
                }
            } else {
                arrayList = C25271y.f99162w;
            }
            arrayListM74129g1 = AbstractC25265s.m74129g1((Collection) arrayList, list6);
            zIsEmpty = arrayListM74129g1.isEmpty();
            z19 = !zIsEmpty;
            if (arrayListM74129g1.isEmpty()) {
                z24 = false;
                break;
            }
            it = arrayListM74129g1.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C40628k) it.next()).getIsError()) {
                        z24 = true;
                        break;
                    }
                } else {
                    z24 = false;
                    break;
                }
            }
            if (arrayListM74129g1.isEmpty()) {
                z25 = false;
                break;
            }
            it3 = arrayListM74129g1.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((C40628k) it3.next()).getIsUploading()) {
                        z25 = true;
                        break;
                    }
                } else {
                    z25 = false;
                    break;
                }
            }
            float f17 = 4;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(modifier3, 5 * f17, 0.0f, 2);
            f13 = 1;
            Modifier modifier5 = modifier3;
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f17), C2299e.f9108K, r17, 54);
            iHashCode = Long.hashCode(r17.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = r17.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(r17, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            r46 = arrayList;
            c0213j = C0217k.f724b;
            r17.m87158i0();
            if (r17.f115903S) {
                r17.m87163l(c0213j);
            } else {
                r17.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(r17, c0209i, c22994r1M66759a4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(r17, c0209i2, interfaceC28653p1M87165m8);
            c0209i3 = C0217k.f732j;
            if (r17.f115903S) {
                c0209i4 = c0209i2;
                if (!AbstractC22676k.m65745e(r17.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(r17, c0209i5, modifierM118962N8);
                if ((1879048192 & i84) == 536870912) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R6 = r17.m87133R();
                if (z26) {
                    objM87133R6 = new C32579a(interfaceC4339a7, 11);
                    r17.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C32579a(interfaceC4339a7, 11);
                    r17.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R6;
                i76 = 3670016 & i84;
                if (i76 != 1048576) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                InterfaceC4339a interfaceC4339a118 = interfaceC4339a7;
                objM87133R7 = r17.m87133R();
                if (z27) {
                    objM87133R7 = new C32589c(mediaPickerLauncher, 1);
                    r17.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C32589c(mediaPickerLauncher, 1);
                    r17.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a119 = (InterfaceC4339a) objM87133R7;
                if ((29360128 & i84) != 8388608) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                objM87133R8 = r17.m87133R();
                if (z28) {
                    objM87133R8 = new C32683v0(interfaceC32666r3, 4);
                    r17.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C32683v0(interfaceC32666r3, 4);
                    r17.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R8;
                if (i76 != 1048576) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                objM87133R9 = r17.m87133R();
                if (z29) {
                    objM87133R9 = new C32589c(mediaPickerLauncher, 2);
                    r17.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C32589c(mediaPickerLauncher, 2);
                    r17.m87172p0(objM87133R9);
                }
                AbstractC32613g3.m101771A(z14, z16, interfaceC4339a117, interfaceC4339a119, interfaceC4339a1110, (InterfaceC4339a) objM87133R9, null, r17, (i84 >> 9) & 126, 64);
                if ((i84 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if ((i75 & 14) == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean zM87155h9 = z34 | z35 | r17.m87155h(z19) | r17.m87153g(interfaceC28601c1M124460f);
                if ((i84 & 112) == 32) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean zM87155h10 = zM87155h9 | z36 | r17.m87155h(z24) | r17.m87155h(z25);
                arrayList2 = arrayListM74129g1;
                boolean zM87157i5 = zM87155h10 | r17.m87157i(arrayList2) | r17.m87157i(r46);
                if ((i75 & 112) == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                z38 = zM87157i5 | z37;
                Object objM87133R26 = r17.m87133R();
                if (z38) {
                    ?? r114 = r17;
                    interfaceC28601c2 = interfaceC28601c1;
                    c3 = ' ';
                    final boolean z515 = z24;
                    final boolean z516 = z25;
                    final List r115 = r46;
                    final InterfaceC4352n interfaceC4352n8 = interfaceC4352n3;
                    interfaceC28601c3 = interfaceC28601c1M124460f;
                    final InterfaceC4339a interfaceC4339a1111 = interfaceC4339a8;
                    obj = new InterfaceC4339a() { // from class: sl0.c2
                        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32597d2.m101680I(z13, interfaceC4339a1111, z19, z4, z515, z516, arrayList2, r115, interfaceC4352n8, interfaceC28601c3, interfaceC28601c2);
                        }
                    };
                    arrayList2 = arrayList2;
                    interfaceC4352n4 = interfaceC4352n8;
                    r114.m87172p0(obj);
                    r15 = r115;
                    r14 = r114;
                } else {
                    ?? r116 = r17;
                    interfaceC28601c2 = interfaceC28601c1;
                    c3 = ' ';
                    final boolean z517 = z24;
                    final boolean z518 = z25;
                    final List r117 = r46;
                    final InterfaceC4352n interfaceC4352n9 = interfaceC4352n3;
                    interfaceC28601c3 = interfaceC28601c1M124460f;
                    final InterfaceC4339a interfaceC4339a1112 = interfaceC4339a8;
                    obj = new InterfaceC4339a() { // from class: sl0.c2
                        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC32597d2.m101680I(z13, interfaceC4339a1112, z19, z4, z517, z518, arrayList2, r117, interfaceC4352n9, interfaceC28601c3, interfaceC28601c2);
                        }
                    };
                    arrayList2 = arrayList2;
                    interfaceC4352n4 = interfaceC4352n9;
                    r116.m87172p0(obj);
                    r15 = r117;
                    r14 = r116;
                }
                InterfaceC4339a interfaceC4339a1113 = (InterfaceC4339a) obj;
                AbstractC32619i.m101827S(state, interfaceC28601c5, r14, ((i84 >> 15) & 14) | 48);
                if (m101674C(interfaceC28601c1M87261o)) {
                    m101716y(interfaceC28601c2, true);
                }
                C17909s c17909s3 = AbstractC17911t.f69612b;
                float f18 = 3 * f17;
                Modifier modifierM3357b3 = AbstractC1092a.m3357b(AbstractC15751g.m44456i(f13, c2314t2, C17909s.m51486d(c17909s3, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(3213583103L)), new C17919x(AbstractC17918w0.m51515c(1062262271)), new C17919x(AbstractC17918w0.m51515c(441505279)), new C17919x(AbstractC17918w0.m51515c(223401471)), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(0.0f)) << c3) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(100.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(10.0f)) << c3), 8), AbstractC33253j.m105489e(f18)), C17909s.m51486d(c17909s3, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4279636265L)), new C17919x(AbstractC17918w0.m51517e(4279050279L))), 0L, 0L, 14), AbstractC33253j.m105489e(f18), 0.0f, 4);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r14, 0);
                iHashCode2 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = r14.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(r14, modifierM3357b3);
                r14.m87158i0();
                if (r14.f115903S) {
                    c0213j2 = c0213j;
                    r14.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, c0209i, c23010xM66775a3);
                c0209i6 = c0209i4;
                AbstractC28683x.m87239G(r14, c0209i6, interfaceC28653p1M87165m9);
                if (r14.f115903S) {
                    c0209i7 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i7);
                } else {
                    c0209i7 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i7);
                }
                AbstractC28683x.m87239G(r14, c0209i5, modifierM118962N9);
                if (arrayList2.isEmpty()) {
                    r14.m87150e0(1884399155);
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f13 * 8);
                    Modifier modifierM92100V3 = AbstractC30060g.m92100V(c2314t2, AbstractC30060g.m92099U(0, r14, 1), true, false);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22971kM66746i3, C2299e.f9107J, r14, 6);
                    iHashCode4 = Long.hashCode(r14.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = r14.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(r14, modifierM92100V3);
                    r14.m87158i0();
                    if (r14.f115903S) {
                        r14.m87163l(c0213j2);
                    } else {
                        r14.m87178s0();
                    }
                    AbstractC28683x.m87239G(r14, c0209i, c22994r1M66759a5);
                    AbstractC28683x.m87239G(r14, c0209i6, interfaceC28653p1M87165m10);
                    if (r14.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(r14, c0209i5, modifierM118962N10);
                    r14.m87150e0(-1701707135);
                    while (r0.hasNext()) {
                        zContains = r15.contains(c40628k);
                        boolean zM87155h11 = r14.m87155h(zContains) | r14.m87157i(c40628k);
                        if ((i75 & 57344) == 16384) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        boolean z519 = zM87155h11 | z45;
                        if ((i75 & 3670016) == 1048576) {
                            z46 = true;
                        } else {
                            z46 = false;
                        }
                        z47 = z519 | z46;
                        objM87133R13 = r14.m87133R();
                        C28676v0 c28676v3 = c28676v0;
                        if (z47) {
                            InterfaceC4351m interfaceC4351m112 = interfaceC4351m9;
                            InterfaceC4351m interfaceC4351m26 = interfaceC4351m10;
                            objM87133R13 = new C12211k(zContains, c40628k, interfaceC4351m112, interfaceC4351m26, 6);
                            interfaceC4351m16 = interfaceC4351m112;
                            interfaceC4351m17 = interfaceC4351m26;
                            r14.m87172p0(objM87133R13);
                        } else {
                            InterfaceC4351m interfaceC4351m113 = interfaceC4351m9;
                            InterfaceC4351m interfaceC4351m27 = interfaceC4351m10;
                            objM87133R13 = new C12211k(zContains, c40628k, interfaceC4351m113, interfaceC4351m27, 6);
                            interfaceC4351m16 = interfaceC4351m113;
                            interfaceC4351m17 = interfaceC4351m27;
                            r14.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a1114 = (InterfaceC4339a) objM87133R13;
                        boolean zM87155h12 = r14.m87155h(zContains) | r14.m87157i(c40628k);
                        i78 = i75;
                        if ((i78 & 7168) == 2048) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        boolean z5110 = zM87155h12 | z48;
                        if ((29360128 & i78) == 8388608) {
                            z49 = true;
                        } else {
                            z49 = false;
                        }
                        z52 = z5110 | z49;
                        objM87133R14 = r14.m87133R();
                        if (z52) {
                            InterfaceC4351m interfaceC4351m28 = interfaceC4351m11;
                            Function1 function9 = function3;
                            objM87133R14 = new C12211k(zContains, c40628k, function9, interfaceC4351m28, 7);
                            function5 = function9;
                            interfaceC4351m18 = interfaceC4351m28;
                            r14.m87172p0(objM87133R14);
                        } else {
                            InterfaceC4351m interfaceC4351m29 = interfaceC4351m11;
                            Function1 function10 = function3;
                            objM87133R14 = new C12211k(zContains, c40628k, function10, interfaceC4351m29, 7);
                            function5 = function10;
                            interfaceC4351m18 = interfaceC4351m29;
                            r14.m87172p0(objM87133R14);
                        }
                        AbstractC32591c1.m101655j(c40628k, interfaceC4339a1114, (InterfaceC4339a) objM87133R14, null, r14, 0, 8);
                        i75 = i78;
                        c28676v0 = c28676v3;
                        interfaceC4351m10 = interfaceC4351m17;
                        function3 = function5;
                        interfaceC4351m11 = interfaceC4351m18;
                        interfaceC4351m9 = interfaceC4351m16;
                    }
                    obj2 = c28676v0;
                    interfaceC4351m13 = interfaceC4351m9;
                    interfaceC4351m14 = interfaceC4351m10;
                    interfaceC4351m15 = interfaceC4351m11;
                    function4 = function3;
                    z39 = false;
                    AbstractC25012a.m73392y(r14, false, true, false);
                } else {
                    obj2 = c28676v0;
                    interfaceC4351m13 = interfaceC4351m9;
                    interfaceC4351m14 = interfaceC4351m10;
                    interfaceC4351m15 = interfaceC4351m11;
                    function4 = function3;
                    z39 = false;
                    r14.m87150e0(1885591229);
                    r14.m87173q(false);
                }
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, z39);
                iHashCode3 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = r14.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(r14, c2314t2);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                r14.m87158i0();
                if (r14.f115903S) {
                    r14.m87163l(c0213j3);
                } else {
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(r14, C0217k.f728f, interfaceC28653p1M87165m11);
                c0209i8 = C0217k.f732j;
                if (r14.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i8);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i8);
                }
                AbstractC28683x.m87239G(r14, C0217k.f726d, modifierM118962N11);
                C29891y c29891yM101672A3 = m101672A(interfaceC28601c3);
                if (!zIsEmpty) {
                    i77 = i13;
                } else {
                    i77 = i13;
                }
                zM87153g = r14.m87153g(interfaceC28601c3);
                objM87133R10 = r14.m87133R();
                if (zM87153g) {
                    objM87133R10 = new C32614h(4, interfaceC28601c3);
                    r14.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C32614h(4, interfaceC28601c3);
                    r14.m87172p0(objM87133R10);
                }
                r16 = r14;
                EnumC32692x1 enumC32692x6 = enumC32692x3;
                AbstractC32658p3.m102225y(i77, (Function1) objM87133R10, c29891yM101672A3, interfaceC4339a1113, z19, z13, interfaceC30468c2, false, z4, enumC32692x6, r16, ((i84 << 9) & 458752) | ((i84 << 21) & 234881024) | ((i67 << 24) & 1879048192), 128);
                if (z4) {
                    r16.m87150e0(1952597449);
                    Modifier modifierMo3401b3 = C1100b.f4583a.mo3401b(c2314t2);
                    objM87133R11 = r16.m87133R();
                    if (objM87133R11 == obj2) {
                        objM87133R11 = AbstractC11266d.m30453g(r16);
                    }
                    InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R11;
                    if ((i67 & 14) == 4) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R12 = r16.m87133R();
                    if (z44) {
                        interfaceC4339a11 = interfaceC4339a10;
                        objM87133R12 = new C32579a(interfaceC4339a11, 12);
                        r16.m87172p0(objM87133R12);
                    } else {
                        interfaceC4339a11 = interfaceC4339a10;
                        objM87133R12 = new C32579a(interfaceC4339a11, 12);
                        r16.m87172p0(objM87133R12);
                    }
                    AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b3, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R12, 28), r16, 0);
                    r16.m87173q(false);
                } else {
                    interfaceC4339a11 = interfaceC4339a10;
                    r16.m87150e0(1952979927);
                    r16.m87173q(false);
                }
                AbstractC25012a.m73392y(r16, true, true, true);
                r10 = r16;
                list3 = list5;
                interfaceC32666r2 = interfaceC32666r3;
                interfaceC4351m5 = interfaceC4351m13;
                interfaceC4351m6 = interfaceC4351m14;
                z18 = z16;
                function2 = function4;
                interfaceC4351m7 = interfaceC4351m15;
                interfaceC4352n2 = interfaceC4352n4;
                interfaceC4339a4 = interfaceC4339a8;
                list4 = list6;
                interfaceC4351m8 = interfaceC4351m12;
                interfaceC4339a6 = interfaceC4339a118;
                interfaceC4339a5 = interfaceC4339a11;
                enumC32692x2 = enumC32692x6;
                modifier2 = modifier5;
            } else {
                c0209i4 = c0209i2;
            }
            AbstractC11266d.m30471y(iHashCode, r17, iHashCode, c0209i3);
            c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(r17, c0209i5, modifierM118962N8);
            if ((1879048192 & i84) == 536870912) {
                z26 = true;
            } else {
                z26 = false;
            }
            objM87133R6 = r17.m87133R();
            if (z26) {
                objM87133R6 = new C32579a(interfaceC4339a7, 11);
                r17.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C32579a(interfaceC4339a7, 11);
                r17.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a1115 = (InterfaceC4339a) objM87133R6;
            i76 = 3670016 & i84;
            if (i76 != 1048576) {
                z27 = true;
            } else {
                z27 = true;
            }
            InterfaceC4339a interfaceC4339a1116 = interfaceC4339a7;
            objM87133R7 = r17.m87133R();
            if (z27) {
                objM87133R7 = new C32589c(mediaPickerLauncher, 1);
                r17.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C32589c(mediaPickerLauncher, 1);
                r17.m87172p0(objM87133R7);
            }
            InterfaceC4339a interfaceC4339a1117 = (InterfaceC4339a) objM87133R7;
            if ((29360128 & i84) != 8388608) {
                z28 = true;
            } else {
                z28 = true;
            }
            objM87133R8 = r17.m87133R();
            if (z28) {
                objM87133R8 = new C32683v0(interfaceC32666r3, 4);
                r17.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new C32683v0(interfaceC32666r3, 4);
                r17.m87172p0(objM87133R8);
            }
            InterfaceC4339a interfaceC4339a1118 = (InterfaceC4339a) objM87133R8;
            if (i76 != 1048576) {
                z29 = true;
            } else {
                z29 = true;
            }
            objM87133R9 = r17.m87133R();
            if (z29) {
                objM87133R9 = new C32589c(mediaPickerLauncher, 2);
                r17.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C32589c(mediaPickerLauncher, 2);
                r17.m87172p0(objM87133R9);
            }
            AbstractC32613g3.m101771A(z14, z16, interfaceC4339a1115, interfaceC4339a1117, interfaceC4339a1118, (InterfaceC4339a) objM87133R9, null, r17, (i84 >> 9) & 126, 64);
            if ((i84 & 896) == 256) {
                z34 = true;
            } else {
                z34 = false;
            }
            if ((i75 & 14) == 4) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean zM87155h13 = z34 | z35 | r17.m87155h(z19) | r17.m87153g(interfaceC28601c1M124460f);
            if ((i84 & 112) == 32) {
                z36 = true;
            } else {
                z36 = false;
            }
            boolean zM87155h14 = zM87155h13 | z36 | r17.m87155h(z24) | r17.m87155h(z25);
            arrayList2 = arrayListM74129g1;
            boolean zM87157i6 = zM87155h14 | r17.m87157i(arrayList2) | r17.m87157i(r46);
            if ((i75 & 112) == 32) {
                z37 = true;
            } else {
                z37 = false;
            }
            z38 = zM87157i6 | z37;
            Object objM87133R27 = r17.m87133R();
            if (z38) {
                ?? r118 = r17;
                interfaceC28601c2 = interfaceC28601c1;
                c3 = ' ';
                final boolean z5111 = z24;
                final boolean z5112 = z25;
                final List r119 = r46;
                final InterfaceC4352n interfaceC4352n10 = interfaceC4352n3;
                interfaceC28601c3 = interfaceC28601c1M124460f;
                final InterfaceC4339a interfaceC4339a1119 = interfaceC4339a8;
                obj = new InterfaceC4339a() { // from class: sl0.c2
                    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC32597d2.m101680I(z13, interfaceC4339a1119, z19, z4, z5111, z5112, arrayList2, r119, interfaceC4352n10, interfaceC28601c3, interfaceC28601c2);
                    }
                };
                arrayList2 = arrayList2;
                interfaceC4352n4 = interfaceC4352n10;
                r118.m87172p0(obj);
                r15 = r119;
                r14 = r118;
            } else {
                ?? r1110 = r17;
                interfaceC28601c2 = interfaceC28601c1;
                c3 = ' ';
                final boolean z5113 = z24;
                final boolean z5114 = z25;
                final List r1111 = r46;
                final InterfaceC4352n interfaceC4352n11 = interfaceC4352n3;
                interfaceC28601c3 = interfaceC28601c1M124460f;
                final InterfaceC4339a interfaceC4339a11110 = interfaceC4339a8;
                obj = new InterfaceC4339a() { // from class: sl0.c2
                    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC32597d2.m101680I(z13, interfaceC4339a11110, z19, z4, z5113, z5114, arrayList2, r1111, interfaceC4352n11, interfaceC28601c3, interfaceC28601c2);
                    }
                };
                arrayList2 = arrayList2;
                interfaceC4352n4 = interfaceC4352n11;
                r1110.m87172p0(obj);
                r15 = r1111;
                r14 = r1110;
            }
            InterfaceC4339a interfaceC4339a11111 = (InterfaceC4339a) obj;
            AbstractC32619i.m101827S(state, interfaceC28601c5, r14, ((i84 >> 15) & 14) | 48);
            if (m101674C(interfaceC28601c1M87261o)) {
                m101716y(interfaceC28601c2, true);
            }
            C17909s c17909s4 = AbstractC17911t.f69612b;
            float f19 = 3 * f17;
            Modifier modifierM3357b4 = AbstractC1092a.m3357b(AbstractC15751g.m44456i(f13, c2314t2, C17909s.m51486d(c17909s4, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(3213583103L)), new C17919x(AbstractC17918w0.m51515c(1062262271)), new C17919x(AbstractC17918w0.m51515c(441505279)), new C17919x(AbstractC17918w0.m51515c(223401471)), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(0.0f)) << c3) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(100.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(10.0f)) << c3), 8), AbstractC33253j.m105489e(f19)), C17909s.m51486d(c17909s4, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4279636265L)), new C17919x(AbstractC17918w0.m51517e(4279050279L))), 0L, 0L, 14), AbstractC33253j.m105489e(f19), 0.0f, 4);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r14, 0);
            iHashCode2 = Long.hashCode(r14.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = r14.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(r14, modifierM3357b4);
            r14.m87158i0();
            if (r14.f115903S) {
                c0213j2 = c0213j;
                r14.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                r14.m87178s0();
            }
            AbstractC28683x.m87239G(r14, c0209i, c23010xM66775a4);
            c0209i6 = c0209i4;
            AbstractC28683x.m87239G(r14, c0209i6, interfaceC28653p1M87165m12);
            if (r14.f115903S) {
                c0209i7 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i7);
            } else {
                c0209i7 = c0209i3;
                AbstractC11266d.m30471y(iHashCode2, r14, iHashCode2, c0209i7);
            }
            AbstractC28683x.m87239G(r14, c0209i5, modifierM118962N12);
            if (arrayList2.isEmpty()) {
                r14.m87150e0(1884399155);
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f13 * 8);
                Modifier modifierM92100V4 = AbstractC30060g.m92100V(c2314t2, AbstractC30060g.m92099U(0, r14, 1), true, false);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22971kM66746i4, C2299e.f9107J, r14, 6);
                iHashCode4 = Long.hashCode(r14.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = r14.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(r14, modifierM92100V4);
                r14.m87158i0();
                if (r14.f115903S) {
                    r14.m87163l(c0213j2);
                } else {
                    r14.m87178s0();
                }
                AbstractC28683x.m87239G(r14, c0209i, c22994r1M66759a6);
                AbstractC28683x.m87239G(r14, c0209i6, interfaceC28653p1M87165m13);
                if (r14.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, r14, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(r14, c0209i5, modifierM118962N13);
                r14.m87150e0(-1701707135);
                while (r0.hasNext()) {
                    zContains = r15.contains(c40628k);
                    boolean zM87155h15 = r14.m87155h(zContains) | r14.m87157i(c40628k);
                    if ((i75 & 57344) == 16384) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    boolean z5115 = zM87155h15 | z45;
                    if ((i75 & 3670016) == 1048576) {
                        z46 = true;
                    } else {
                        z46 = false;
                    }
                    z47 = z5115 | z46;
                    objM87133R13 = r14.m87133R();
                    C28676v0 c28676v4 = c28676v0;
                    if (z47) {
                        InterfaceC4351m interfaceC4351m114 = interfaceC4351m9;
                        InterfaceC4351m interfaceC4351m210 = interfaceC4351m10;
                        objM87133R13 = new C12211k(zContains, c40628k, interfaceC4351m114, interfaceC4351m210, 6);
                        interfaceC4351m16 = interfaceC4351m114;
                        interfaceC4351m17 = interfaceC4351m210;
                        r14.m87172p0(objM87133R13);
                    } else {
                        InterfaceC4351m interfaceC4351m115 = interfaceC4351m9;
                        InterfaceC4351m interfaceC4351m211 = interfaceC4351m10;
                        objM87133R13 = new C12211k(zContains, c40628k, interfaceC4351m115, interfaceC4351m211, 6);
                        interfaceC4351m16 = interfaceC4351m115;
                        interfaceC4351m17 = interfaceC4351m211;
                        r14.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a11112 = (InterfaceC4339a) objM87133R13;
                    boolean zM87155h16 = r14.m87155h(zContains) | r14.m87157i(c40628k);
                    i78 = i75;
                    if ((i78 & 7168) == 2048) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean z5116 = zM87155h16 | z48;
                    if ((29360128 & i78) == 8388608) {
                        z49 = true;
                    } else {
                        z49 = false;
                    }
                    z52 = z5116 | z49;
                    objM87133R14 = r14.m87133R();
                    if (z52) {
                        InterfaceC4351m interfaceC4351m212 = interfaceC4351m11;
                        Function1 function11 = function3;
                        objM87133R14 = new C12211k(zContains, c40628k, function11, interfaceC4351m212, 7);
                        function5 = function11;
                        interfaceC4351m18 = interfaceC4351m212;
                        r14.m87172p0(objM87133R14);
                    } else {
                        InterfaceC4351m interfaceC4351m213 = interfaceC4351m11;
                        Function1 function12 = function3;
                        objM87133R14 = new C12211k(zContains, c40628k, function12, interfaceC4351m213, 7);
                        function5 = function12;
                        interfaceC4351m18 = interfaceC4351m213;
                        r14.m87172p0(objM87133R14);
                    }
                    AbstractC32591c1.m101655j(c40628k, interfaceC4339a11112, (InterfaceC4339a) objM87133R14, null, r14, 0, 8);
                    i75 = i78;
                    c28676v0 = c28676v4;
                    interfaceC4351m10 = interfaceC4351m17;
                    function3 = function5;
                    interfaceC4351m11 = interfaceC4351m18;
                    interfaceC4351m9 = interfaceC4351m16;
                }
                obj2 = c28676v0;
                interfaceC4351m13 = interfaceC4351m9;
                interfaceC4351m14 = interfaceC4351m10;
                interfaceC4351m15 = interfaceC4351m11;
                function4 = function3;
                z39 = false;
                AbstractC25012a.m73392y(r14, false, true, false);
            } else {
                obj2 = c28676v0;
                interfaceC4351m13 = interfaceC4351m9;
                interfaceC4351m14 = interfaceC4351m10;
                interfaceC4351m15 = interfaceC4351m11;
                function4 = function3;
                z39 = false;
                r14.m87150e0(1885591229);
                r14.m87173q(false);
            }
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, z39);
            iHashCode3 = Long.hashCode(r14.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = r14.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(r14, c2314t2);
            InterfaceC0221l.f734a.getClass();
            c0213j3 = C0217k.f724b;
            r14.m87158i0();
            if (r14.f115903S) {
                r14.m87163l(c0213j3);
            } else {
                r14.m87178s0();
            }
            AbstractC28683x.m87239G(r14, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(r14, C0217k.f728f, interfaceC28653p1M87165m14);
            c0209i8 = C0217k.f732j;
            if (r14.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i8);
            } else {
                AbstractC11266d.m30471y(iHashCode3, r14, iHashCode3, c0209i8);
            }
            AbstractC28683x.m87239G(r14, C0217k.f726d, modifierM118962N14);
            C29891y c29891yM101672A4 = m101672A(interfaceC28601c3);
            if (!zIsEmpty) {
                i77 = i13;
            } else {
                i77 = i13;
            }
            zM87153g = r14.m87153g(interfaceC28601c3);
            objM87133R10 = r14.m87133R();
            if (zM87153g) {
                objM87133R10 = new C32614h(4, interfaceC28601c3);
                r14.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new C32614h(4, interfaceC28601c3);
                r14.m87172p0(objM87133R10);
            }
            r16 = r14;
            EnumC32692x1 enumC32692x7 = enumC32692x3;
            AbstractC32658p3.m102225y(i77, (Function1) objM87133R10, c29891yM101672A4, interfaceC4339a11111, z19, z13, interfaceC30468c2, false, z4, enumC32692x7, r16, ((i84 << 9) & 458752) | ((i84 << 21) & 234881024) | ((i67 << 24) & 1879048192), 128);
            if (z4) {
                r16.m87150e0(1952597449);
                Modifier modifierMo3401b4 = C1100b.f4583a.mo3401b(c2314t2);
                objM87133R11 = r16.m87133R();
                if (objM87133R11 == obj2) {
                    objM87133R11 = AbstractC11266d.m30453g(r16);
                }
                InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R11;
                if ((i67 & 14) == 4) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                objM87133R12 = r16.m87133R();
                if (z44) {
                    interfaceC4339a11 = interfaceC4339a10;
                    objM87133R12 = new C32579a(interfaceC4339a11, 12);
                    r16.m87172p0(objM87133R12);
                } else {
                    interfaceC4339a11 = interfaceC4339a10;
                    objM87133R12 = new C32579a(interfaceC4339a11, 12);
                    r16.m87172p0(objM87133R12);
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierMo3401b4, interfaceC21083i5, null, false, null, (InterfaceC4339a) objM87133R12, 28), r16, 0);
                r16.m87173q(false);
            } else {
                interfaceC4339a11 = interfaceC4339a10;
                r16.m87150e0(1952979927);
                r16.m87173q(false);
            }
            AbstractC25012a.m73392y(r16, true, true, true);
            r10 = r16;
            list3 = list5;
            interfaceC32666r2 = interfaceC32666r3;
            interfaceC4351m5 = interfaceC4351m13;
            interfaceC4351m6 = interfaceC4351m14;
            z18 = z16;
            function2 = function4;
            interfaceC4351m7 = interfaceC4351m15;
            interfaceC4352n2 = interfaceC4352n4;
            interfaceC4339a4 = interfaceC4339a8;
            list4 = list6;
            interfaceC4351m8 = interfaceC4351m12;
            interfaceC4339a6 = interfaceC4339a1116;
            interfaceC4339a5 = interfaceC4339a11;
            enumC32692x2 = enumC32692x7;
            modifier2 = modifier5;
        } else {
            r17.m87138X();
            interfaceC32666r2 = interfaceC32666r1;
            modifier2 = modifier;
            interfaceC4339a4 = interfaceC4339a2;
            interfaceC4352n2 = interfaceC4352n;
            list3 = list;
            function2 = function1;
            interfaceC4351m5 = interfaceC4351m;
            list4 = list2;
            interfaceC4351m6 = interfaceC4351m2;
            interfaceC4351m7 = interfaceC4351m3;
            interfaceC4351m8 = interfaceC4351m4;
            interfaceC4339a5 = interfaceC4339a3;
            enumC32692x2 = enumC32692x1;
            z18 = z16;
            r10 = r17;
            interfaceC4339a6 = interfaceC4339a;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sl0.a2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC32597d2.m101685N(i13, z4, z13, z14, z18, state, mediaPickerLauncher, interfaceC32666r2, modifier2, interfaceC4339a6, interfaceC4339a4, interfaceC4352n2, list3, function2, interfaceC4351m5, list4, interfaceC4351m6, interfaceC4351m7, interfaceC15250v, interfaceC4351m8, interfaceC4339a5, enumC32692x2, i14, i15, i16, i17, (Composer) obj3, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m101713v() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m101714w() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final boolean m101715x(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: y */
    private static final void m101716y(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC28601c1 m101717z() {
        return AbstractC28683x.m87272z(new C29891y(6, "", 0L));
    }
}
