package kw1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2883e;
import b91.C2886a;
import bb2.C2931g;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.extensions.domain.models.CtaAction;
import gy0.AbstractC16277f;
import h02.C16561a0;
import hw1.AbstractC17702a;
import iw1.AbstractC20997c;
import iw1.AbstractC20998d;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.Iterator;
import java.util.List;
import jp1.C21852d;
import jp1.C21860l;
import jp1.C21862n;
import km2.C22594e;
import ku2.C22837a;
import l83.C23454a0;
import lw1.AbstractC24772h;
import lw1.C24773i;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: kw1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001ay\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Liw1/d;", "viewState", "Lkotlin/Function1;", "Liw1/c;", "Ll83/a0;", "onViewEvent", "Lhw1/a;", "onNavigationEvent", "r", "(Liw1/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Liw1/d$c;", "", "ctaButtonText", "disclaimerText", "Lkotlin/Function0;", "onBackButtonClicked", "Llw1/i;", "onChangeOption", "onContinueButtonClicked", "onSecondaryCtaClicked", "F", "(Liw1/d$c;Ljava/lang/String;Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "optionSelected", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22859j {

    /* JADX INFO: renamed from: kw1.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.view.ExtensionsV2LandingScreenKt$ExtensionsV2LandingScreen$3$1", m100430f = "ExtensionsV2LandingScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f90116w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC20998d f90117x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f90118y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f90119z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC20998d abstractC20998d, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f90117x = abstractC20998d;
            this.f90118y = interfaceC28601c1;
            this.f90119z = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f90117x, this.f90118y, this.f90119z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String ctaTitle;
            String disclaimer;
            List<C24773i> listM58526f;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f90116w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC20998d abstractC20998d = this.f90117x;
            C24773i c24773i = null;
            Object obj2 = null;
            c24773i = null;
            AbstractC20998d.c cVar = abstractC20998d instanceof AbstractC20998d.c ? (AbstractC20998d.c) abstractC20998d : null;
            InterfaceC28601c1 interfaceC28601c1 = this.f90118y;
            InterfaceC28601c1 interfaceC28601c2 = this.f90119z;
            if (cVar != null && (listM58526f = cVar.m58526f()) != null) {
                for (Object obj3 : listM58526f) {
                    if (((C24773i) obj3).getSelected()) {
                        obj2 = obj3;
                        break;
                    }
                }
                c24773i = (C24773i) obj2;
            }
            String str = "";
            if (c24773i == null || (ctaTitle = c24773i.getCtaTitle()) == null) {
                ctaTitle = "";
            }
            AbstractC22859j.m66348B(interfaceC28601c1, ctaTitle);
            if (c24773i != null && (disclaimer = c24773i.getDisclaimer()) != null) {
                str = disclaimer;
            }
            AbstractC22859j.m66350D(interfaceC28601c2, str);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final String m66347A(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m66348B(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: C */
    private static final String m66349C(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m66350D(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m66351E(Function1 function1, AbstractC20998d abstractC20998d, CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC20997c.b(abstractC20998d, it));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0148 A[LOOP:0: B:101:0x0135->B:106:0x0148, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:122:0x0383  */
    /* JADX WARN: Code duplicated, block: B:123:0x0387  */
    /* JADX WARN: Code duplicated, block: B:126:0x0394  */
    /* JADX WARN: Code duplicated, block: B:128:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:134:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:141:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:146:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:150:0x0401  */
    /* JADX WARN: Code duplicated, block: B:151:0x0404  */
    /* JADX WARN: Code duplicated, block: B:154:0x042f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0431  */
    /* JADX WARN: Code duplicated, block: B:158:0x043e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0443  */
    /* JADX WARN: Code duplicated, block: B:162:0x0448  */
    /* JADX WARN: Code duplicated, block: B:169:0x048f  */
    /* JADX WARN: Code duplicated, block: B:170:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:172:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:174:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:177:0x04e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:184:0x0536  */
    /* JADX WARN: Code duplicated, block: B:187:0x0542 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x0548  */
    /* JADX WARN: Code duplicated, block: B:192:0x061a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0629  */
    /* JADX WARN: Code duplicated, block: B:197:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x014c A[EDGE_INSN: B:198:0x014c->B:108:0x014c BREAK  A[LOOP:0: B:101:0x0135->B:106:0x0148], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x03b9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0467 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
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
    /* JADX INFO: renamed from: F */
    private static final void m66352F(AbstractC20998d.c cVar, String str, String str2, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        InterfaceC4339a interfaceC4339a2;
        int i15;
        int i16;
        int i17;
        Function1 function4;
        int i18;
        int i19;
        Function1 function5;
        int i24;
        boolean z4;
        final AbstractC20998d.c cVar2;
        Function1 function6;
        InterfaceC4339a interfaceC4339a3;
        Function1 function7;
        final Function1 function8;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Function1 function9;
        Function1 function10;
        Object objM87133R;
        Function1 function11;
        C2314t c2314t;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0213j c0213j2;
        Function1 function12;
        int i25;
        C28676v0 c28676v1;
        Function1 function13;
        C0213j c0213j3;
        InterfaceC28593a1 interfaceC28593a1;
        C28655q c28655q;
        int iHashCode2;
        Iterator<T> it;
        Object next;
        boolean z13;
        int i26;
        final InterfaceC28593a1 interfaceC28593a2;
        String secondaryCtaTitle;
        float f14;
        float f15;
        boolean z14;
        boolean zM87157i;
        Object objM87133R2;
        final Function1 function14;
        final InterfaceC28593a1 interfaceC28593a3;
        boolean z15;
        boolean zM87157i2;
        Object objM87133R3;
        int i27;
        boolean z16;
        boolean z17;
        boolean zM87157i3;
        Object objM87133R4;
        C28676v0 c28676v2;
        InterfaceC28593a1 interfaceC28593a4;
        Function1 function15;
        String tag;
        Iterator<C24773i> it3;
        int i28;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(842709158);
        int i29 = (i13 & 6) == 0 ? (c28655q2.m87157i(cVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i29 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i29 |= c28655q2.m87153g(str2) ? 256 : 128;
        }
        int i34 = i14 & 8;
        if (i34 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i29 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 = i14 & 16;
            if (i15 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i16 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i29 |= i16;
                }
                i17 = i14 & 32;
                if (i17 != 0) {
                    if ((196608 & i13) == 0) {
                        function4 = function2;
                        if (c28655q2.m87157i(function4)) {
                            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i29 |= i18;
                    }
                    i19 = i14 & 64;
                    if (i19 != 0) {
                        i29 |= 1572864;
                        function5 = function3;
                    } else {
                        function5 = function3;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87157i(function5)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i29 |= i24;
                        }
                    }
                    if ((i29 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i29 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i34 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C22837a(21);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        if (i15 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C22594e(16);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function9 = (Function1) objM87133R7;
                        } else {
                            function9 = function1;
                        }
                        if (i17 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C22594e(17);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function10 = (Function1) objM87133R6;
                        } else {
                            function10 = function4;
                        }
                        if (i19 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C22594e(18);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function5 = (Function1) objM87133R5;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            it3 = cVar.m58526f().iterator();
                            i28 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    i28 = -1;
                                    break;
                                } else if (it3.next().getSelected()) {
                                    break;
                                } else {
                                    i28++;
                                }
                            }
                            objM87133R = AbstractC31061c.m95646v(i28, c28655q2);
                        }
                        InterfaceC28593a1 interfaceC28593a5 = (InterfaceC28593a1) objM87133R;
                        C38072d c38072d = C38072d.f163053a;
                        function11 = function10;
                        int i35 = C38072d.f163054b;
                        Function1 function16 = function5;
                        long jM125410o = c38072d.m121949b(c28655q2, i35).getBackgroundDarkStd();
                        C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o, c17916v0)));
                        float f16 = 8;
                        f13 = 2 * f16;
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                        Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f13, modifierM66723l), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C2305k c2305k = C2299e.f9111N;
                        C22957g c22957g = AbstractC22977m.f90652c;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            c0213j2 = c0213j;
                        } else {
                            c0213j2 = c0213j;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                            function12 = function16;
                            i25 = i29;
                            c28676v1 = c28676v0;
                            function13 = function9;
                            c0213j3 = c0213j2;
                            interfaceC28593a1 = interfaceC28593a5;
                            AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a5, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                            TextResource textResourceM58528h = cVar.getTitle();
                            int i36 = TextResource.$stable;
                            String strM21274h = AbstractC8693b.m21274h(textResourceM58528h, c28655q2, i36);
                            C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q2, i35).getT1(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i35).getT1().getStyle(), c38072d.m121949b(c28655q2, i35).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                            int i37 = C2886a.f11498d << 18;
                            AbstractC30795n.m94707h(strM21274h, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q2, 0, i37, 196606);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i36), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i35).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d, c28655q2, i35), c38072d.m121949b(c28655q2, i35).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i37, 196606);
                            c28655q = c28655q2;
                            float f17 = 3 * f16;
                            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, f17, 1);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j3);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                            it = cVar.m58526f().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                tag = ((C24773i) next).getTag();
                                if (tag == null && tag.length() != 0) {
                                    break;
                                }
                            }
                            if (next != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            c28655q.m87150e0(-1756979165);
                            i26 = 0;
                            for (Object obj : cVar.m58526f()) {
                                i27 = i26 + 1;
                                if (i26 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                C24773i c24773i = (C24773i) obj;
                                if (m66357K(interfaceC28593a1) == i26) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                C24773i c24773iM72590b = C24773i.m72590b(c24773i, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                                boolean zM87149e = c28655q.m87149e(i26);
                                if ((i25 & 57344) == 16384) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zM87157i3 = zM87149e | z17 | c28655q.m87157i(c24773i);
                                objM87133R4 = c28655q.m87133R();
                                if (zM87157i3) {
                                    c28676v2 = c28676v1;
                                } else {
                                    c28676v2 = c28676v1;
                                    if (objM87133R4 == c28676v2) {
                                        interfaceC28593a4 = interfaceC28593a1;
                                        function15 = function13;
                                    }
                                    AbstractC24772h.m72579j(c24773iM72590b, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                                    i26 = i27;
                                    c28676v1 = c28676v2;
                                    function13 = function15;
                                    interfaceC28593a1 = interfaceC28593a4;
                                }
                                interfaceC28593a4 = interfaceC28593a1;
                                function15 = function13;
                                objM87133R4 = new C16561a0(i26, function15, c24773i, interfaceC28593a4);
                                c28655q.m87172p0(objM87133R4);
                                AbstractC24772h.m72579j(c24773iM72590b, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                                i26 = i27;
                                c28676v1 = c28676v2;
                                function13 = function15;
                                interfaceC28593a1 = interfaceC28593a4;
                            }
                            interfaceC28593a2 = interfaceC28593a1;
                            Function1 function17 = function13;
                            C28676v0 c28676v3 = c28676v1;
                            c28655q.m87173q(false);
                            c28655q.m87173q(true);
                            secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                            if (secondaryCtaTitle == null) {
                                c28655q.m87150e0(1096998318);
                                c28655q.m87173q(false);
                                cVar2 = cVar;
                                z15 = false;
                                interfaceC28593a3 = interfaceC28593a2;
                                f14 = f13;
                                f15 = 1.0f;
                            } else {
                                c28655q.m87150e0(1096998319);
                                f14 = f13;
                                f15 = 1.0f;
                                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                                String strM21275i = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                                if ((i25 & 3670016) == 1048576) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                cVar2 = cVar;
                                zM87157i = z14 | c28655q.m87157i(cVar2);
                                objM87133R2 = c28655q.m87133R();
                                if (!zM87157i || objM87133R2 == c28676v3) {
                                    final int i38 = 0;
                                    function14 = function12;
                                    objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i38) {
                                                case 0:
                                                    return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                                default:
                                                    return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    function14 = function12;
                                }
                                function12 = function14;
                                interfaceC28593a3 = interfaceC28593a2;
                                AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21275i, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                                c28655q = c28655q;
                                z15 = false;
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                            String strM21275i2 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                            if ((i25 & 458752) == 131072) {
                                z15 = true;
                            }
                            zM87157i2 = z15 | c28655q.m87157i(cVar2);
                            objM87133R3 = c28655q.m87133R();
                            if (!zM87157i2 || objM87133R3 == c28676v3) {
                                final int i39 = 1;
                                function8 = function11;
                                objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i39) {
                                            case 0:
                                                return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                            default:
                                                return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                function8 = function11;
                            }
                            C28655q c28655q3 = c28655q;
                            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21275i2, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q3, 54, 120);
                            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f14, f17);
                            C21054m c21054mM58880a = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32767);
                            C38072d c38072d2 = C38072d.f163053a;
                            int i44 = C38072d.f163054b;
                            AbstractC21048g.m58807M(str2, modifierM3395q, false, C21054m.m58881b(c21054mM58880a, C23285v0.m67364b(c38072d2.m121952e(c28655q3, i44).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d2.m121949b(c28655q3, i44).getWhite50(), c38072d2.m121949b(c28655q3, i44).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q3, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(true);
                            function6 = function17;
                            interfaceC4339a3 = interfaceC4339a5;
                            function7 = function12;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                        function12 = function16;
                        i25 = i29;
                        c28676v1 = c28676v0;
                        function13 = function9;
                        c0213j3 = c0213j2;
                        interfaceC28593a1 = interfaceC28593a5;
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a5, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                        TextResource textResourceM58528h2 = cVar.getTitle();
                        int i310 = TextResource.$stable;
                        String strM21274h2 = AbstractC8693b.m21274h(textResourceM58528h2, c28655q2, i310);
                        C2886a c2886aM8397c2 = C2886a.m8397c(c38072d.m121952e(c28655q2, i35).getT1(), C23285v0.m67364b(c38072d.m121952e(c28655q2, i35).getT1().getStyle(), c38072d.m121949b(c28655q2, i35).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                        int i311 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM21274h2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c2, null, c28655q2, 0, i311, 196606);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i310), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q2, i35).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d, c28655q2, i35), c38072d.m121949b(c28655q2, i35).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i311, 196606);
                        c28655q = c28655q2;
                        float f18 = 3 * f16;
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 0.0f, f18, 1);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                        it = cVar.m58526f().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                tag = ((C24773i) next).getTag();
                                if (tag == null) {
                                }
                            }
                        }
                        if (next != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c28655q.m87150e0(-1756979165);
                        i26 = 0;
                        while (r1.hasNext()) {
                            i27 = i26 + 1;
                            if (i26 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            C24773i c24773i2 = (C24773i) obj;
                            if (m66357K(interfaceC28593a1) == i26) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            C24773i c24773iM72590b2 = C24773i.m72590b(c24773i2, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                            boolean zM87149e2 = c28655q.m87149e(i26);
                            if ((i25 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i3 = zM87149e2 | z17 | c28655q.m87157i(c24773i2);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87157i3) {
                                c28676v2 = c28676v1;
                                if (objM87133R4 == c28676v2) {
                                    interfaceC28593a4 = interfaceC28593a1;
                                    function15 = function13;
                                }
                                AbstractC24772h.m72579j(c24773iM72590b2, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                                i26 = i27;
                                c28676v1 = c28676v2;
                                function13 = function15;
                                interfaceC28593a1 = interfaceC28593a4;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            interfaceC28593a4 = interfaceC28593a1;
                            function15 = function13;
                            objM87133R4 = new C16561a0(i26, function15, c24773i2, interfaceC28593a4);
                            c28655q.m87172p0(objM87133R4);
                            AbstractC24772h.m72579j(c24773iM72590b2, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        }
                        interfaceC28593a2 = interfaceC28593a1;
                        Function1 function18 = function13;
                        C28676v0 c28676v4 = c28676v1;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                        if (secondaryCtaTitle == null) {
                            c28655q.m87150e0(1096998318);
                            c28655q.m87173q(false);
                            cVar2 = cVar;
                            z15 = false;
                            interfaceC28593a3 = interfaceC28593a2;
                            f14 = f13;
                            f15 = 1.0f;
                        } else {
                            c28655q.m87150e0(1096998319);
                            f14 = f13;
                            f15 = 1.0f;
                            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                            EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                            String strM21275i3 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                            if ((i25 & 3670016) == 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            cVar2 = cVar;
                            zM87157i = z14 | c28655q.m87157i(cVar2);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i) {
                                final int i312 = 0;
                                function14 = function12;
                                objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i312) {
                                            case 0:
                                                return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                            default:
                                                return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i313 = 0;
                                function14 = function12;
                                objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i313) {
                                            case 0:
                                                return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                            default:
                                                return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            function12 = function14;
                            interfaceC28593a3 = interfaceC28593a2;
                            AbstractC27282u.m82292h(modifierM3409f3, enumC27284v3, strM21275i3, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                            c28655q = c28655q;
                            z15 = false;
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                        EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
                        String strM21275i4 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                        if ((i25 & 458752) == 131072) {
                            z15 = true;
                        }
                        zM87157i2 = z15 | c28655q.m87157i(cVar2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i314 = 1;
                            function8 = function11;
                            objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i314) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                        default:
                                            return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i315 = 1;
                            function8 = function11;
                            objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i315) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                        default:
                                            return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q4 = c28655q;
                        AbstractC27282u.m82292h(modifierM3409f4, enumC27284v4, strM21275i4, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q4, 54, 120);
                        Modifier modifierM3395q2 = AbstractC1099a.m3395q(c2314t, f14, f18);
                        C21054m c21054mM58880a2 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q4, 0, C21053l.f79835b << 15, 32767);
                        C38072d c38072d3 = C38072d.f163053a;
                        int i45 = C38072d.f163054b;
                        AbstractC21048g.m58807M(str2, modifierM3395q2, false, C21054m.m58881b(c21054mM58880a2, C23285v0.m67364b(c38072d3.m121952e(c28655q4, i45).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d3.m121949b(c28655q4, i45).getWhite50(), c38072d3.m121949b(c28655q4, i45).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q4, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(true);
                        function6 = function18;
                        interfaceC4339a3 = interfaceC4339a5;
                        function7 = function12;
                    } else {
                        cVar2 = cVar;
                        c28655q2.m87138X();
                        function6 = function1;
                        interfaceC4339a3 = interfaceC4339a2;
                        function7 = function5;
                        function8 = function4;
                    }
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g((Object) cVar2, (Object) str, (Object) str2, (Object) interfaceC4339a3, function6, function8, function7, i13, i14, 13);
                    }
                }
                i29 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function4 = function2;
                i19 = i14 & 64;
                if (i19 != 0) {
                    i29 |= 1572864;
                    function5 = function3;
                } else {
                    function5 = function3;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function5)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i29 |= i24;
                    }
                }
                if ((i29 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i29 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(21);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i15 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C22594e(16);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function9 = (Function1) objM87133R7;
                    } else {
                        function9 = function1;
                    }
                    if (i17 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22594e(17);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function10 = (Function1) objM87133R6;
                    } else {
                        function10 = function4;
                    }
                    if (i19 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22594e(18);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function5 = (Function1) objM87133R5;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        it3 = cVar.m58526f().iterator();
                        i28 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                i28 = -1;
                                break;
                            } else {
                                if (it3.next().getSelected()) {
                                    break;
                                    break;
                                }
                                i28++;
                            }
                        }
                        objM87133R = AbstractC31061c.m95646v(i28, c28655q2);
                    }
                    InterfaceC28593a1 interfaceC28593a6 = (InterfaceC28593a1) objM87133R;
                    C38072d c38072d4 = C38072d.f163053a;
                    function11 = function10;
                    int i316 = C38072d.f163054b;
                    Function1 function19 = function5;
                    long jM125410o2 = c38072d4.m121949b(c28655q2, i316).getBackgroundDarkStd();
                    C17916v0 c17916v1 = AbstractC17918w0.f69621a;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o2, c17916v1)));
                    float f19 = 8;
                    f13 = 2 * f19;
                    InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                    Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f13, modifierM66723l2), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C2305k c2305k2 = C2299e.f9111N;
                    C22957g c22957g2 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i6 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a4);
                    C0209i c0209i7 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i8 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                        function12 = function19;
                        i25 = i29;
                        c28676v1 = c28676v0;
                        function13 = function9;
                        c0213j3 = c0213j2;
                        interfaceC28593a1 = interfaceC28593a6;
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d4), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                        TextResource textResourceM58528h3 = cVar.getTitle();
                        int i317 = TextResource.$stable;
                        String strM21274h3 = AbstractC8693b.m21274h(textResourceM58528h3, c28655q2, i317);
                        C2886a c2886aM8397c3 = C2886a.m8397c(c38072d4.m121952e(c28655q2, i316).getT1(), C23285v0.m67364b(c38072d4.m121952e(c28655q2, i316).getT1().getStyle(), c38072d4.m121949b(c28655q2, i316).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                        int i318 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM21274h3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c3, null, c28655q2, 0, i318, 196606);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i317), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d4.m121952e(c28655q2, i316).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d4, c28655q2, i316), c38072d4.m121949b(c28655q2, i316).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i318, 196606);
                        c28655q = c28655q2;
                        float f110 = 3 * f19;
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, 0.0f, f110, 1);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                        it = cVar.m58526f().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                tag = ((C24773i) next).getTag();
                                if (tag == null) {
                                }
                            }
                        }
                        if (next != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c28655q.m87150e0(-1756979165);
                        i26 = 0;
                        while (r1.hasNext()) {
                            i27 = i26 + 1;
                            if (i26 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            C24773i c24773i3 = (C24773i) obj;
                            if (m66357K(interfaceC28593a1) == i26) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            C24773i c24773iM72590b3 = C24773i.m72590b(c24773i3, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                            boolean zM87149e3 = c28655q.m87149e(i26);
                            if ((i25 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i3 = zM87149e3 | z17 | c28655q.m87157i(c24773i3);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87157i3) {
                                c28676v2 = c28676v1;
                                if (objM87133R4 == c28676v2) {
                                    interfaceC28593a4 = interfaceC28593a1;
                                    function15 = function13;
                                }
                                AbstractC24772h.m72579j(c24773iM72590b3, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                                i26 = i27;
                                c28676v1 = c28676v2;
                                function13 = function15;
                                interfaceC28593a1 = interfaceC28593a4;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            interfaceC28593a4 = interfaceC28593a1;
                            function15 = function13;
                            objM87133R4 = new C16561a0(i26, function15, c24773i3, interfaceC28593a4);
                            c28655q.m87172p0(objM87133R4);
                            AbstractC24772h.m72579j(c24773iM72590b3, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        }
                        interfaceC28593a2 = interfaceC28593a1;
                        Function1 function110 = function13;
                        C28676v0 c28676v5 = c28676v1;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                        if (secondaryCtaTitle == null) {
                            c28655q.m87150e0(1096998318);
                            c28655q.m87173q(false);
                            cVar2 = cVar;
                            z15 = false;
                            interfaceC28593a3 = interfaceC28593a2;
                            f14 = f13;
                            f15 = 1.0f;
                        } else {
                            c28655q.m87150e0(1096998319);
                            f14 = f13;
                            f15 = 1.0f;
                            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                            EnumC27284v enumC27284v5 = EnumC27284v.TextLarge;
                            String strM21275i5 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                            if ((i25 & 3670016) == 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            cVar2 = cVar;
                            zM87157i = z14 | c28655q.m87157i(cVar2);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i) {
                                final int i319 = 0;
                                function14 = function12;
                                objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i319) {
                                            case 0:
                                                return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                            default:
                                                return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i3110 = 0;
                                function14 = function12;
                                objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i3110) {
                                            case 0:
                                                return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                            default:
                                                return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            function12 = function14;
                            interfaceC28593a3 = interfaceC28593a2;
                            AbstractC27282u.m82292h(modifierM3409f5, enumC27284v5, strM21275i5, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                            c28655q = c28655q;
                            z15 = false;
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f6 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                        EnumC27284v enumC27284v6 = EnumC27284v.TextLarge;
                        String strM21275i6 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                        if ((i25 & 458752) == 131072) {
                            z15 = true;
                        }
                        zM87157i2 = z15 | c28655q.m87157i(cVar2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i3111 = 1;
                            function8 = function11;
                            objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3111) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                        default:
                                            return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i3112 = 1;
                            function8 = function11;
                            objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3112) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                        default:
                                            return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q5 = c28655q;
                        AbstractC27282u.m82292h(modifierM3409f6, enumC27284v6, strM21275i6, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q5, 54, 120);
                        Modifier modifierM3395q3 = AbstractC1099a.m3395q(c2314t, f14, f110);
                        C21054m c21054mM58880a3 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q5, 0, C21053l.f79835b << 15, 32767);
                        C38072d c38072d5 = C38072d.f163053a;
                        int i46 = C38072d.f163054b;
                        AbstractC21048g.m58807M(str2, modifierM3395q3, false, C21054m.m58881b(c21054mM58880a3, C23285v0.m67364b(c38072d5.m121952e(c28655q5, i46).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d5.m121949b(c28655q5, i46).getWhite50(), c38072d5.m121949b(c28655q5, i46).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q5, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                        c28655q2 = c28655q5;
                        c28655q2.m87173q(true);
                        function6 = function110;
                        interfaceC4339a3 = interfaceC4339a6;
                        function7 = function12;
                    } else {
                        c0213j2 = c0213j;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
                    function12 = function19;
                    i25 = i29;
                    c28676v1 = c28676v0;
                    function13 = function9;
                    c0213j3 = c0213j2;
                    interfaceC28593a1 = interfaceC28593a6;
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d4), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                    TextResource textResourceM58528h4 = cVar.getTitle();
                    int i3113 = TextResource.$stable;
                    String strM21274h4 = AbstractC8693b.m21274h(textResourceM58528h4, c28655q2, i3113);
                    C2886a c2886aM8397c4 = C2886a.m8397c(c38072d4.m121952e(c28655q2, i316).getT1(), C23285v0.m67364b(c38072d4.m121952e(c28655q2, i316).getT1().getStyle(), c38072d4.m121949b(c28655q2, i316).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                    int i3114 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c4, null, c28655q2, 0, i3114, 196606);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i3113), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d4.m121952e(c28655q2, i316).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d4, c28655q2, i316), c38072d4.m121949b(c28655q2, i316).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i3114, 196606);
                    c28655q = c28655q2;
                    float f111 = 3 * f19;
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, 0.0f, f111, 1);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                    it = cVar.m58526f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            tag = ((C24773i) next).getTag();
                            if (tag == null) {
                            }
                        }
                    }
                    if (next != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c28655q.m87150e0(-1756979165);
                    i26 = 0;
                    while (r1.hasNext()) {
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C24773i c24773i4 = (C24773i) obj;
                        if (m66357K(interfaceC28593a1) == i26) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        C24773i c24773iM72590b4 = C24773i.m72590b(c24773i4, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                        boolean zM87149e4 = c28655q.m87149e(i26);
                        if ((i25 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i3 = zM87149e4 | z17 | c28655q.m87157i(c24773i4);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i3) {
                            c28676v2 = c28676v1;
                            if (objM87133R4 == c28676v2) {
                                interfaceC28593a4 = interfaceC28593a1;
                                function15 = function13;
                            }
                            AbstractC24772h.m72579j(c24773iM72590b4, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        interfaceC28593a4 = interfaceC28593a1;
                        function15 = function13;
                        objM87133R4 = new C16561a0(i26, function15, c24773i4, interfaceC28593a4);
                        c28655q.m87172p0(objM87133R4);
                        AbstractC24772h.m72579j(c24773iM72590b4, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    }
                    interfaceC28593a2 = interfaceC28593a1;
                    Function1 function111 = function13;
                    C28676v0 c28676v6 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                    if (secondaryCtaTitle == null) {
                        c28655q.m87150e0(1096998318);
                        c28655q.m87173q(false);
                        cVar2 = cVar;
                        z15 = false;
                        interfaceC28593a3 = interfaceC28593a2;
                        f14 = f13;
                        f15 = 1.0f;
                    } else {
                        c28655q.m87150e0(1096998319);
                        f14 = f13;
                        f15 = 1.0f;
                        Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                        EnumC27284v enumC27284v7 = EnumC27284v.TextLarge;
                        String strM21275i7 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                        if ((i25 & 3670016) == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cVar2 = cVar;
                        zM87157i = z14 | c28655q.m87157i(cVar2);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i3115 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3115) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i3116 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3116) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        function12 = function14;
                        interfaceC28593a3 = interfaceC28593a2;
                        AbstractC27282u.m82292h(modifierM3409f7, enumC27284v7, strM21275i7, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                        c28655q = c28655q;
                        z15 = false;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f8 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                    EnumC27284v enumC27284v8 = EnumC27284v.TextLarge;
                    String strM21275i8 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                    if ((i25 & 458752) == 131072) {
                        z15 = true;
                    }
                    zM87157i2 = z15 | c28655q.m87157i(cVar2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i3117 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3117) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i3118 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3118) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q6 = c28655q;
                    AbstractC27282u.m82292h(modifierM3409f8, enumC27284v8, strM21275i8, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q6, 54, 120);
                    Modifier modifierM3395q4 = AbstractC1099a.m3395q(c2314t, f14, f111);
                    C21054m c21054mM58880a4 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q6, 0, C21053l.f79835b << 15, 32767);
                    C38072d c38072d6 = C38072d.f163053a;
                    int i47 = C38072d.f163054b;
                    AbstractC21048g.m58807M(str2, modifierM3395q4, false, C21054m.m58881b(c21054mM58880a4, C23285v0.m67364b(c38072d6.m121952e(c28655q6, i47).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d6.m121949b(c28655q6, i47).getWhite50(), c38072d6.m121949b(c28655q6, i47).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q6, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                    c28655q2 = c28655q6;
                    c28655q2.m87173q(true);
                    function6 = function111;
                    interfaceC4339a3 = interfaceC4339a6;
                    function7 = function12;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    function6 = function1;
                    interfaceC4339a3 = interfaceC4339a2;
                    function7 = function5;
                    function8 = function4;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g((Object) cVar2, (Object) str, (Object) str2, (Object) interfaceC4339a3, function6, function8, function7, i13, i14, 13);
                }
            }
            i29 |= 24576;
            i17 = i14 & 32;
            if (i17 != 0) {
                if ((196608 & i13) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i29 |= i18;
                }
                i19 = i14 & 64;
                if (i19 != 0) {
                    i29 |= 1572864;
                    function5 = function3;
                } else {
                    function5 = function3;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function5)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i29 |= i24;
                    }
                }
                if ((i29 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i29 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(21);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i15 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C22594e(16);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function9 = (Function1) objM87133R7;
                    } else {
                        function9 = function1;
                    }
                    if (i17 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22594e(17);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function10 = (Function1) objM87133R6;
                    } else {
                        function10 = function4;
                    }
                    if (i19 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22594e(18);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function5 = (Function1) objM87133R5;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        it3 = cVar.m58526f().iterator();
                        i28 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                i28 = -1;
                                break;
                            } else {
                                if (it3.next().getSelected()) {
                                    break;
                                    break;
                                }
                                i28++;
                            }
                        }
                        objM87133R = AbstractC31061c.m95646v(i28, c28655q2);
                    }
                    InterfaceC28593a1 interfaceC28593a7 = (InterfaceC28593a1) objM87133R;
                    C38072d c38072d7 = C38072d.f163053a;
                    function11 = function10;
                    int i3119 = C38072d.f163054b;
                    Function1 function112 = function5;
                    long jM125410o3 = c38072d7.m121949b(c28655q2, i3119).getBackgroundDarkStd();
                    C17916v0 c17916v2 = AbstractC17918w0.f69621a;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l3 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o3, c17916v2)));
                    float f112 = 8;
                    f13 = 2 * f112;
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                    Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f13, modifierM66723l3), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C2305k c2305k3 = C2299e.f9111N;
                    C22957g c22957g3 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM92116f2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i10 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a7);
                    C0209i c0209i11 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i12 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N7);
                        function12 = function112;
                        i25 = i29;
                        c28676v1 = c28676v0;
                        function13 = function9;
                        c0213j3 = c0213j2;
                        interfaceC28593a1 = interfaceC28593a7;
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d7), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a7, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                        TextResource textResourceM58528h5 = cVar.getTitle();
                        int i31110 = TextResource.$stable;
                        String strM21274h5 = AbstractC8693b.m21274h(textResourceM58528h5, c28655q2, i31110);
                        C2886a c2886aM8397c5 = C2886a.m8397c(c38072d7.m121952e(c28655q2, i3119).getT1(), C23285v0.m67364b(c38072d7.m121952e(c28655q2, i3119).getT1().getStyle(), c38072d7.m121949b(c28655q2, i3119).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                        int i31111 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM21274h5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c5, null, c28655q2, 0, i31111, 196606);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i31110), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d7.m121952e(c28655q2, i3119).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d7, c28655q2, i3119), c38072d7.m121949b(c28655q2, i3119).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i31111, 196606);
                        c28655q = c28655q2;
                        float f113 = 3 * f112;
                        Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, 0.0f, f113, 1);
                        C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3396r5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a8);
                        AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                        it = cVar.m58526f().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                tag = ((C24773i) next).getTag();
                                if (tag == null) {
                                }
                            }
                        }
                        if (next != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c28655q.m87150e0(-1756979165);
                        i26 = 0;
                        while (r1.hasNext()) {
                            i27 = i26 + 1;
                            if (i26 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            C24773i c24773i5 = (C24773i) obj;
                            if (m66357K(interfaceC28593a1) == i26) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            C24773i c24773iM72590b5 = C24773i.m72590b(c24773i5, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                            boolean zM87149e5 = c28655q.m87149e(i26);
                            if ((i25 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i3 = zM87149e5 | z17 | c28655q.m87157i(c24773i5);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87157i3) {
                                c28676v2 = c28676v1;
                                if (objM87133R4 == c28676v2) {
                                    interfaceC28593a4 = interfaceC28593a1;
                                    function15 = function13;
                                }
                                AbstractC24772h.m72579j(c24773iM72590b5, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                                i26 = i27;
                                c28676v1 = c28676v2;
                                function13 = function15;
                                interfaceC28593a1 = interfaceC28593a4;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            interfaceC28593a4 = interfaceC28593a1;
                            function15 = function13;
                            objM87133R4 = new C16561a0(i26, function15, c24773i5, interfaceC28593a4);
                            c28655q.m87172p0(objM87133R4);
                            AbstractC24772h.m72579j(c24773iM72590b5, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        }
                        interfaceC28593a2 = interfaceC28593a1;
                        Function1 function113 = function13;
                        C28676v0 c28676v7 = c28676v1;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                        if (secondaryCtaTitle == null) {
                            c28655q.m87150e0(1096998318);
                            c28655q.m87173q(false);
                            cVar2 = cVar;
                            z15 = false;
                            interfaceC28593a3 = interfaceC28593a2;
                            f14 = f13;
                            f15 = 1.0f;
                        } else {
                            c28655q.m87150e0(1096998319);
                            f14 = f13;
                            f15 = 1.0f;
                            Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                            EnumC27284v enumC27284v9 = EnumC27284v.TextLarge;
                            String strM21275i9 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                            if ((i25 & 3670016) == 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            cVar2 = cVar;
                            zM87157i = z14 | c28655q.m87157i(cVar2);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i) {
                                final int i31112 = 0;
                                function14 = function12;
                                objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i31112) {
                                            case 0:
                                                return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                            default:
                                                return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i31113 = 0;
                                function14 = function12;
                                objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i31113) {
                                            case 0:
                                                return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                            default:
                                                return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            function12 = function14;
                            interfaceC28593a3 = interfaceC28593a2;
                            AbstractC27282u.m82292h(modifierM3409f9, enumC27284v9, strM21275i9, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                            c28655q = c28655q;
                            z15 = false;
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f10 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                        EnumC27284v enumC27284v10 = EnumC27284v.TextLarge;
                        String strM21275i10 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                        if ((i25 & 458752) == 131072) {
                            z15 = true;
                        }
                        zM87157i2 = z15 | c28655q.m87157i(cVar2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i31114 = 1;
                            function8 = function11;
                            objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i31114) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                        default:
                                            return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i31115 = 1;
                            function8 = function11;
                            objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i31115) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                        default:
                                            return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q7 = c28655q;
                        AbstractC27282u.m82292h(modifierM3409f10, enumC27284v10, strM21275i10, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q7, 54, 120);
                        Modifier modifierM3395q5 = AbstractC1099a.m3395q(c2314t, f14, f113);
                        C21054m c21054mM58880a5 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q7, 0, C21053l.f79835b << 15, 32767);
                        C38072d c38072d8 = C38072d.f163053a;
                        int i48 = C38072d.f163054b;
                        AbstractC21048g.m58807M(str2, modifierM3395q5, false, C21054m.m58881b(c21054mM58880a5, C23285v0.m67364b(c38072d8.m121952e(c28655q7, i48).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d8.m121949b(c28655q7, i48).getWhite50(), c38072d8.m121949b(c28655q7, i48).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q7, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                        c28655q2 = c28655q7;
                        c28655q2.m87173q(true);
                        function6 = function113;
                        interfaceC4339a3 = interfaceC4339a7;
                        function7 = function12;
                    } else {
                        c0213j2 = c0213j;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i13 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N7);
                    function12 = function112;
                    i25 = i29;
                    c28676v1 = c28676v0;
                    function13 = function9;
                    c0213j3 = c0213j2;
                    interfaceC28593a1 = interfaceC28593a7;
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d7), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a7, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                    TextResource textResourceM58528h6 = cVar.getTitle();
                    int i31116 = TextResource.$stable;
                    String strM21274h6 = AbstractC8693b.m21274h(textResourceM58528h6, c28655q2, i31116);
                    C2886a c2886aM8397c6 = C2886a.m8397c(c38072d7.m121952e(c28655q2, i3119).getT1(), C23285v0.m67364b(c38072d7.m121952e(c28655q2, i3119).getT1().getStyle(), c38072d7.m121949b(c28655q2, i3119).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                    int i31117 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h6, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c6, null, c28655q2, 0, i31117, 196606);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i31116), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d7.m121952e(c28655q2, i3119).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d7, c28655q2, i3119), c38072d7.m121949b(c28655q2, i3119).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i31117, 196606);
                    c28655q = c28655q2;
                    float f114 = 3 * f112;
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, 0.0f, f114, 1);
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3396r6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                    it = cVar.m58526f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            tag = ((C24773i) next).getTag();
                            if (tag == null) {
                            }
                        }
                    }
                    if (next != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c28655q.m87150e0(-1756979165);
                    i26 = 0;
                    while (r1.hasNext()) {
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C24773i c24773i6 = (C24773i) obj;
                        if (m66357K(interfaceC28593a1) == i26) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        C24773i c24773iM72590b6 = C24773i.m72590b(c24773i6, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                        boolean zM87149e6 = c28655q.m87149e(i26);
                        if ((i25 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i3 = zM87149e6 | z17 | c28655q.m87157i(c24773i6);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i3) {
                            c28676v2 = c28676v1;
                            if (objM87133R4 == c28676v2) {
                                interfaceC28593a4 = interfaceC28593a1;
                                function15 = function13;
                            }
                            AbstractC24772h.m72579j(c24773iM72590b6, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        interfaceC28593a4 = interfaceC28593a1;
                        function15 = function13;
                        objM87133R4 = new C16561a0(i26, function15, c24773i6, interfaceC28593a4);
                        c28655q.m87172p0(objM87133R4);
                        AbstractC24772h.m72579j(c24773iM72590b6, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    }
                    interfaceC28593a2 = interfaceC28593a1;
                    Function1 function114 = function13;
                    C28676v0 c28676v8 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                    if (secondaryCtaTitle == null) {
                        c28655q.m87150e0(1096998318);
                        c28655q.m87173q(false);
                        cVar2 = cVar;
                        z15 = false;
                        interfaceC28593a3 = interfaceC28593a2;
                        f14 = f13;
                        f15 = 1.0f;
                    } else {
                        c28655q.m87150e0(1096998319);
                        f14 = f13;
                        f15 = 1.0f;
                        Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                        EnumC27284v enumC27284v11 = EnumC27284v.TextLarge;
                        String strM21275i11 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                        if ((i25 & 3670016) == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cVar2 = cVar;
                        zM87157i = z14 | c28655q.m87157i(cVar2);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i31118 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i31118) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i31119 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i31119) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        function12 = function14;
                        interfaceC28593a3 = interfaceC28593a2;
                        AbstractC27282u.m82292h(modifierM3409f11, enumC27284v11, strM21275i11, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                        c28655q = c28655q;
                        z15 = false;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f12 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                    EnumC27284v enumC27284v12 = EnumC27284v.TextLarge;
                    String strM21275i12 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                    if ((i25 & 458752) == 131072) {
                        z15 = true;
                    }
                    zM87157i2 = z15 | c28655q.m87157i(cVar2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i311110 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311110) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i311111 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311111) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q8 = c28655q;
                    AbstractC27282u.m82292h(modifierM3409f12, enumC27284v12, strM21275i12, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q8, 54, 120);
                    Modifier modifierM3395q6 = AbstractC1099a.m3395q(c2314t, f14, f114);
                    C21054m c21054mM58880a6 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q8, 0, C21053l.f79835b << 15, 32767);
                    C38072d c38072d9 = C38072d.f163053a;
                    int i49 = C38072d.f163054b;
                    AbstractC21048g.m58807M(str2, modifierM3395q6, false, C21054m.m58881b(c21054mM58880a6, C23285v0.m67364b(c38072d9.m121952e(c28655q8, i49).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d9.m121949b(c28655q8, i49).getWhite50(), c38072d9.m121949b(c28655q8, i49).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q8, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                    c28655q2 = c28655q8;
                    c28655q2.m87173q(true);
                    function6 = function114;
                    interfaceC4339a3 = interfaceC4339a7;
                    function7 = function12;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    function6 = function1;
                    interfaceC4339a3 = interfaceC4339a2;
                    function7 = function5;
                    function8 = function4;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g((Object) cVar2, (Object) str, (Object) str2, (Object) interfaceC4339a3, function6, function8, function7, i13, i14, 13);
                }
            }
            i29 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function4 = function2;
            i19 = i14 & 64;
            if (i19 != 0) {
                i29 |= 1572864;
                function5 = function3;
            } else {
                function5 = function3;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function5)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i29 |= i24;
                }
            }
            if ((i29 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i29 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C22837a(21);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i15 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C22594e(16);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function9 = (Function1) objM87133R7;
                } else {
                    function9 = function1;
                }
                if (i17 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22594e(17);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function10 = (Function1) objM87133R6;
                } else {
                    function10 = function4;
                }
                if (i19 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22594e(18);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function5 = (Function1) objM87133R5;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    it3 = cVar.m58526f().iterator();
                    i28 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            i28 = -1;
                            break;
                        } else {
                            if (it3.next().getSelected()) {
                                break;
                                break;
                            }
                            i28++;
                        }
                    }
                    objM87133R = AbstractC31061c.m95646v(i28, c28655q2);
                }
                InterfaceC28593a1 interfaceC28593a8 = (InterfaceC28593a1) objM87133R;
                C38072d c38072d10 = C38072d.f163053a;
                function11 = function10;
                int i31120 = C38072d.f163054b;
                Function1 function115 = function5;
                long jM125410o4 = c38072d10.m121949b(c28655q2, i31120).getBackgroundDarkStd();
                C17916v0 c17916v3 = AbstractC17918w0.f69621a;
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l4 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o4, c17916v3)));
                float f115 = 8;
                f13 = 2 * f115;
                InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
                Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f13, modifierM66723l4), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C2305k c2305k4 = C2299e.f9111N;
                C22957g c22957g4 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM92116f3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i14 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a10);
                C0209i c0209i15 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N10);
                    function12 = function115;
                    i25 = i29;
                    c28676v1 = c28676v0;
                    function13 = function9;
                    c0213j3 = c0213j2;
                    interfaceC28593a1 = interfaceC28593a8;
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d10), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a8, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                    TextResource textResourceM58528h7 = cVar.getTitle();
                    int i311112 = TextResource.$stable;
                    String strM21274h7 = AbstractC8693b.m21274h(textResourceM58528h7, c28655q2, i311112);
                    C2886a c2886aM8397c7 = C2886a.m8397c(c38072d10.m121952e(c28655q2, i31120).getT1(), C23285v0.m67364b(c38072d10.m121952e(c28655q2, i31120).getT1().getStyle(), c38072d10.m121949b(c28655q2, i31120).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                    int i311113 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c7, null, c28655q2, 0, i311113, 196606);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i311112), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d10.m121952e(c28655q2, i31120).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d10, c28655q2, i31120), c38072d10.m121949b(c28655q2, i31120).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i311113, 196606);
                    c28655q = c28655q2;
                    float f116 = 3 * f115;
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t, 0.0f, f116, 1);
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3396r7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                    it = cVar.m58526f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            tag = ((C24773i) next).getTag();
                            if (tag == null) {
                            }
                        }
                    }
                    if (next != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c28655q.m87150e0(-1756979165);
                    i26 = 0;
                    while (r1.hasNext()) {
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C24773i c24773i7 = (C24773i) obj;
                        if (m66357K(interfaceC28593a1) == i26) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        C24773i c24773iM72590b7 = C24773i.m72590b(c24773i7, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                        boolean zM87149e7 = c28655q.m87149e(i26);
                        if ((i25 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i3 = zM87149e7 | z17 | c28655q.m87157i(c24773i7);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i3) {
                            c28676v2 = c28676v1;
                            if (objM87133R4 == c28676v2) {
                                interfaceC28593a4 = interfaceC28593a1;
                                function15 = function13;
                            }
                            AbstractC24772h.m72579j(c24773iM72590b7, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        interfaceC28593a4 = interfaceC28593a1;
                        function15 = function13;
                        objM87133R4 = new C16561a0(i26, function15, c24773i7, interfaceC28593a4);
                        c28655q.m87172p0(objM87133R4);
                        AbstractC24772h.m72579j(c24773iM72590b7, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    }
                    interfaceC28593a2 = interfaceC28593a1;
                    Function1 function116 = function13;
                    C28676v0 c28676v9 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                    if (secondaryCtaTitle == null) {
                        c28655q.m87150e0(1096998318);
                        c28655q.m87173q(false);
                        cVar2 = cVar;
                        z15 = false;
                        interfaceC28593a3 = interfaceC28593a2;
                        f14 = f13;
                        f15 = 1.0f;
                    } else {
                        c28655q.m87150e0(1096998319);
                        f14 = f13;
                        f15 = 1.0f;
                        Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                        EnumC27284v enumC27284v13 = EnumC27284v.TextLarge;
                        String strM21275i13 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                        if ((i25 & 3670016) == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cVar2 = cVar;
                        zM87157i = z14 | c28655q.m87157i(cVar2);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i311114 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i311114) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i311115 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i311115) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        function12 = function14;
                        interfaceC28593a3 = interfaceC28593a2;
                        AbstractC27282u.m82292h(modifierM3409f13, enumC27284v13, strM21275i13, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                        c28655q = c28655q;
                        z15 = false;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f14 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                    EnumC27284v enumC27284v14 = EnumC27284v.TextLarge;
                    String strM21275i14 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                    if ((i25 & 458752) == 131072) {
                        z15 = true;
                    }
                    zM87157i2 = z15 | c28655q.m87157i(cVar2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i311116 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311116) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i311117 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311117) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q9 = c28655q;
                    AbstractC27282u.m82292h(modifierM3409f14, enumC27284v14, strM21275i14, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q9, 54, 120);
                    Modifier modifierM3395q7 = AbstractC1099a.m3395q(c2314t, f14, f116);
                    C21054m c21054mM58880a7 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q9, 0, C21053l.f79835b << 15, 32767);
                    C38072d c38072d11 = C38072d.f163053a;
                    int i410 = C38072d.f163054b;
                    AbstractC21048g.m58807M(str2, modifierM3395q7, false, C21054m.m58881b(c21054mM58880a7, C23285v0.m67364b(c38072d11.m121952e(c28655q9, i410).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d11.m121949b(c28655q9, i410).getWhite50(), c38072d11.m121949b(c28655q9, i410).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q9, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                    c28655q2 = c28655q9;
                    c28655q2.m87173q(true);
                    function6 = function116;
                    interfaceC4339a3 = interfaceC4339a8;
                    function7 = function12;
                } else {
                    c0213j2 = c0213j;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N10);
                function12 = function115;
                i25 = i29;
                c28676v1 = c28676v0;
                function13 = function9;
                c0213j3 = c0213j2;
                interfaceC28593a1 = interfaceC28593a8;
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d10), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a8, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                TextResource textResourceM58528h8 = cVar.getTitle();
                int i311118 = TextResource.$stable;
                String strM21274h8 = AbstractC8693b.m21274h(textResourceM58528h8, c28655q2, i311118);
                C2886a c2886aM8397c8 = C2886a.m8397c(c38072d10.m121952e(c28655q2, i31120).getT1(), C23285v0.m67364b(c38072d10.m121952e(c28655q2, i31120).getT1().getStyle(), c38072d10.m121949b(c28655q2, i31120).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                int i311119 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h8, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c8, null, c28655q2, 0, i311119, 196606);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i311118), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d10.m121952e(c28655q2, i31120).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d10, c28655q2, i31120), c38072d10.m121949b(c28655q2, i31120).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i311119, 196606);
                c28655q = c28655q2;
                float f117 = 3 * f115;
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(c2314t, 0.0f, f117, 1);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3396r8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
                it = cVar.m58526f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        tag = ((C24773i) next).getTag();
                        if (tag == null) {
                        }
                    }
                }
                if (next != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c28655q.m87150e0(-1756979165);
                i26 = 0;
                while (r1.hasNext()) {
                    i27 = i26 + 1;
                    if (i26 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C24773i c24773i8 = (C24773i) obj;
                    if (m66357K(interfaceC28593a1) == i26) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    C24773i c24773iM72590b8 = C24773i.m72590b(c24773i8, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                    boolean zM87149e8 = c28655q.m87149e(i26);
                    if ((i25 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = zM87149e8 | z17 | c28655q.m87157i(c24773i8);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i3) {
                        c28676v2 = c28676v1;
                        if (objM87133R4 == c28676v2) {
                            interfaceC28593a4 = interfaceC28593a1;
                            function15 = function13;
                        }
                        AbstractC24772h.m72579j(c24773iM72590b8, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    interfaceC28593a4 = interfaceC28593a1;
                    function15 = function13;
                    objM87133R4 = new C16561a0(i26, function15, c24773i8, interfaceC28593a4);
                    c28655q.m87172p0(objM87133R4);
                    AbstractC24772h.m72579j(c24773iM72590b8, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                    i26 = i27;
                    c28676v1 = c28676v2;
                    function13 = function15;
                    interfaceC28593a1 = interfaceC28593a4;
                }
                interfaceC28593a2 = interfaceC28593a1;
                Function1 function117 = function13;
                C28676v0 c28676v10 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                if (secondaryCtaTitle == null) {
                    c28655q.m87150e0(1096998318);
                    c28655q.m87173q(false);
                    cVar2 = cVar;
                    z15 = false;
                    interfaceC28593a3 = interfaceC28593a2;
                    f14 = f13;
                    f15 = 1.0f;
                } else {
                    c28655q.m87150e0(1096998319);
                    f14 = f13;
                    f15 = 1.0f;
                    Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                    EnumC27284v enumC27284v15 = EnumC27284v.TextLarge;
                    String strM21275i15 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                    if ((i25 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    cVar2 = cVar;
                    zM87157i = z14 | c28655q.m87157i(cVar2);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        final int i3111110 = 0;
                        function14 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3111110) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                    default:
                                        return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i3111111 = 0;
                        function14 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3111111) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                    default:
                                        return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    function12 = function14;
                    interfaceC28593a3 = interfaceC28593a2;
                    AbstractC27282u.m82292h(modifierM3409f15, enumC27284v15, strM21275i15, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                    c28655q = c28655q;
                    z15 = false;
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f16 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                EnumC27284v enumC27284v16 = EnumC27284v.TextLarge;
                String strM21275i16 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                if ((i25 & 458752) == 131072) {
                    z15 = true;
                }
                zM87157i2 = z15 | c28655q.m87157i(cVar2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i3111112 = 1;
                    function8 = function11;
                    objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3111112) {
                                case 0:
                                    return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                default:
                                    return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i3111113 = 1;
                    function8 = function11;
                    objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3111113) {
                                case 0:
                                    return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                default:
                                    return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                C28655q c28655q10 = c28655q;
                AbstractC27282u.m82292h(modifierM3409f16, enumC27284v16, strM21275i16, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q10, 54, 120);
                Modifier modifierM3395q8 = AbstractC1099a.m3395q(c2314t, f14, f117);
                C21054m c21054mM58880a8 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q10, 0, C21053l.f79835b << 15, 32767);
                C38072d c38072d12 = C38072d.f163053a;
                int i411 = C38072d.f163054b;
                AbstractC21048g.m58807M(str2, modifierM3395q8, false, C21054m.m58881b(c21054mM58880a8, C23285v0.m67364b(c38072d12.m121952e(c28655q10, i411).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d12.m121949b(c28655q10, i411).getWhite50(), c38072d12.m121949b(c28655q10, i411).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q10, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                c28655q2 = c28655q10;
                c28655q2.m87173q(true);
                function6 = function117;
                interfaceC4339a3 = interfaceC4339a8;
                function7 = function12;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                function6 = function1;
                interfaceC4339a3 = interfaceC4339a2;
                function7 = function5;
                function8 = function4;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) cVar2, (Object) str, (Object) str2, (Object) interfaceC4339a3, function6, function8, function7, i13, i14, 13);
            }
        }
        i29 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        i15 = i14 & 16;
        if (i15 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i29 |= i16;
            }
            i17 = i14 & 32;
            if (i17 != 0) {
                if ((196608 & i13) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i29 |= i18;
                }
                i19 = i14 & 64;
                if (i19 != 0) {
                    i29 |= 1572864;
                    function5 = function3;
                } else {
                    function5 = function3;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function5)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i29 |= i24;
                    }
                }
                if ((i29 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i29 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(21);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i15 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C22594e(16);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function9 = (Function1) objM87133R7;
                    } else {
                        function9 = function1;
                    }
                    if (i17 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22594e(17);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function10 = (Function1) objM87133R6;
                    } else {
                        function10 = function4;
                    }
                    if (i19 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22594e(18);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function5 = (Function1) objM87133R5;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        it3 = cVar.m58526f().iterator();
                        i28 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                i28 = -1;
                                break;
                            } else {
                                if (it3.next().getSelected()) {
                                    break;
                                    break;
                                }
                                i28++;
                            }
                        }
                        objM87133R = AbstractC31061c.m95646v(i28, c28655q2);
                    }
                    InterfaceC28593a1 interfaceC28593a9 = (InterfaceC28593a1) objM87133R;
                    C38072d c38072d13 = C38072d.f163053a;
                    function11 = function10;
                    int i31121 = C38072d.f163054b;
                    Function1 function118 = function5;
                    long jM125410o5 = c38072d13.m121949b(c28655q2, i31121).getBackgroundDarkStd();
                    C17916v0 c17916v4 = AbstractC17918w0.f69621a;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l5 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o5, c17916v4)));
                    float f118 = 8;
                    f13 = 2 * f118;
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a4;
                    Modifier modifierM92116f4 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f13, modifierM66723l5), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C2305k c2305k5 = C2299e.f9111N;
                    C22957g c22957g5 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM92116f4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i18 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i18, c23010xM66775a13);
                    C0209i c0209i19 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N13);
                        function12 = function118;
                        i25 = i29;
                        c28676v1 = c28676v0;
                        function13 = function9;
                        c0213j3 = c0213j2;
                        interfaceC28593a1 = interfaceC28593a9;
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d13), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a9, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                        TextResource textResourceM58528h9 = cVar.getTitle();
                        int i3111114 = TextResource.$stable;
                        String strM21274h9 = AbstractC8693b.m21274h(textResourceM58528h9, c28655q2, i3111114);
                        C2886a c2886aM8397c9 = C2886a.m8397c(c38072d13.m121952e(c28655q2, i31121).getT1(), C23285v0.m67364b(c38072d13.m121952e(c28655q2, i31121).getT1().getStyle(), c38072d13.m121949b(c28655q2, i31121).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                        int i3111115 = C2886a.f11498d << 18;
                        AbstractC30795n.m94707h(strM21274h9, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c9, null, c28655q2, 0, i3111115, 196606);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i3111114), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d13.m121952e(c28655q2, i31121).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d13, c28655q2, i31121), c38072d13.m121949b(c28655q2, i31121).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i3111115, 196606);
                        c28655q = c28655q2;
                        float f119 = 3 * f118;
                        Modifier modifierM3396r9 = AbstractC1099a.m3396r(c2314t, 0.0f, f119, 1);
                        C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3396r9);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i18, c23010xM66775a14);
                        AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m14);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N14);
                        it = cVar.m58526f().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                tag = ((C24773i) next).getTag();
                                if (tag == null) {
                                }
                            }
                        }
                        if (next != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c28655q.m87150e0(-1756979165);
                        i26 = 0;
                        while (r1.hasNext()) {
                            i27 = i26 + 1;
                            if (i26 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            C24773i c24773i9 = (C24773i) obj;
                            if (m66357K(interfaceC28593a1) == i26) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            C24773i c24773iM72590b9 = C24773i.m72590b(c24773i9, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                            boolean zM87149e9 = c28655q.m87149e(i26);
                            if ((i25 & 57344) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87157i3 = zM87149e9 | z17 | c28655q.m87157i(c24773i9);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87157i3) {
                                c28676v2 = c28676v1;
                                if (objM87133R4 == c28676v2) {
                                    interfaceC28593a4 = interfaceC28593a1;
                                    function15 = function13;
                                }
                                AbstractC24772h.m72579j(c24773iM72590b9, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                                i26 = i27;
                                c28676v1 = c28676v2;
                                function13 = function15;
                                interfaceC28593a1 = interfaceC28593a4;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            interfaceC28593a4 = interfaceC28593a1;
                            function15 = function13;
                            objM87133R4 = new C16561a0(i26, function15, c24773i9, interfaceC28593a4);
                            c28655q.m87172p0(objM87133R4);
                            AbstractC24772h.m72579j(c24773iM72590b9, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        }
                        interfaceC28593a2 = interfaceC28593a1;
                        Function1 function119 = function13;
                        C28676v0 c28676v11 = c28676v1;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                        if (secondaryCtaTitle == null) {
                            c28655q.m87150e0(1096998318);
                            c28655q.m87173q(false);
                            cVar2 = cVar;
                            z15 = false;
                            interfaceC28593a3 = interfaceC28593a2;
                            f14 = f13;
                            f15 = 1.0f;
                        } else {
                            c28655q.m87150e0(1096998319);
                            f14 = f13;
                            f15 = 1.0f;
                            Modifier modifierM3409f17 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                            EnumC27284v enumC27284v17 = EnumC27284v.TextLarge;
                            String strM21275i17 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                            if ((i25 & 3670016) == 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            cVar2 = cVar;
                            zM87157i = z14 | c28655q.m87157i(cVar2);
                            objM87133R2 = c28655q.m87133R();
                            if (zM87157i) {
                                final int i3111116 = 0;
                                function14 = function12;
                                objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i3111116) {
                                            case 0:
                                                return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                            default:
                                                return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i3111117 = 0;
                                function14 = function12;
                                objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i3111117) {
                                            case 0:
                                                return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                            default:
                                                return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            function12 = function14;
                            interfaceC28593a3 = interfaceC28593a2;
                            AbstractC27282u.m82292h(modifierM3409f17, enumC27284v17, strM21275i17, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                            c28655q = c28655q;
                            z15 = false;
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3409f18 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                        EnumC27284v enumC27284v18 = EnumC27284v.TextLarge;
                        String strM21275i18 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                        if ((i25 & 458752) == 131072) {
                            z15 = true;
                        }
                        zM87157i2 = z15 | c28655q.m87157i(cVar2);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2) {
                            final int i3111118 = 1;
                            function8 = function11;
                            objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3111118) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                        default:
                                            return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i3111119 = 1;
                            function8 = function11;
                            objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3111119) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                        default:
                                            return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        C28655q c28655q11 = c28655q;
                        AbstractC27282u.m82292h(modifierM3409f18, enumC27284v18, strM21275i18, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q11, 54, 120);
                        Modifier modifierM3395q9 = AbstractC1099a.m3395q(c2314t, f14, f119);
                        C21054m c21054mM58880a9 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q11, 0, C21053l.f79835b << 15, 32767);
                        C38072d c38072d14 = C38072d.f163053a;
                        int i412 = C38072d.f163054b;
                        AbstractC21048g.m58807M(str2, modifierM3395q9, false, C21054m.m58881b(c21054mM58880a9, C23285v0.m67364b(c38072d14.m121952e(c28655q11, i412).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d14.m121949b(c28655q11, i412).getWhite50(), c38072d14.m121949b(c28655q11, i412).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q11, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                        c28655q2 = c28655q11;
                        c28655q2.m87173q(true);
                        function6 = function119;
                        interfaceC4339a3 = interfaceC4339a9;
                        function7 = function12;
                    } else {
                        c0213j2 = c0213j;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N13);
                    function12 = function118;
                    i25 = i29;
                    c28676v1 = c28676v0;
                    function13 = function9;
                    c0213j3 = c0213j2;
                    interfaceC28593a1 = interfaceC28593a9;
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d13), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a9, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                    TextResource textResourceM58528h10 = cVar.getTitle();
                    int i31111110 = TextResource.$stable;
                    String strM21274h10 = AbstractC8693b.m21274h(textResourceM58528h10, c28655q2, i31111110);
                    C2886a c2886aM8397c10 = C2886a.m8397c(c38072d13.m121952e(c28655q2, i31121).getT1(), C23285v0.m67364b(c38072d13.m121952e(c28655q2, i31121).getT1().getStyle(), c38072d13.m121949b(c28655q2, i31121).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                    int i31111111 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h10, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c10, null, c28655q2, 0, i31111111, 196606);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i31111110), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d13.m121952e(c28655q2, i31121).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d13, c28655q2, i31121), c38072d13.m121949b(c28655q2, i31121).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i31111111, 196606);
                    c28655q = c28655q2;
                    float f1110 = 3 * f118;
                    Modifier modifierM3396r10 = AbstractC1099a.m3396r(c2314t, 0.0f, f1110, 1);
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3396r10);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i18, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m15);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N15);
                    it = cVar.m58526f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            tag = ((C24773i) next).getTag();
                            if (tag == null) {
                            }
                        }
                    }
                    if (next != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c28655q.m87150e0(-1756979165);
                    i26 = 0;
                    while (r1.hasNext()) {
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C24773i c24773i10 = (C24773i) obj;
                        if (m66357K(interfaceC28593a1) == i26) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        C24773i c24773iM72590b10 = C24773i.m72590b(c24773i10, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                        boolean zM87149e10 = c28655q.m87149e(i26);
                        if ((i25 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i3 = zM87149e10 | z17 | c28655q.m87157i(c24773i10);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i3) {
                            c28676v2 = c28676v1;
                            if (objM87133R4 == c28676v2) {
                                interfaceC28593a4 = interfaceC28593a1;
                                function15 = function13;
                            }
                            AbstractC24772h.m72579j(c24773iM72590b10, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        interfaceC28593a4 = interfaceC28593a1;
                        function15 = function13;
                        objM87133R4 = new C16561a0(i26, function15, c24773i10, interfaceC28593a4);
                        c28655q.m87172p0(objM87133R4);
                        AbstractC24772h.m72579j(c24773iM72590b10, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    }
                    interfaceC28593a2 = interfaceC28593a1;
                    Function1 function1110 = function13;
                    C28676v0 c28676v12 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                    if (secondaryCtaTitle == null) {
                        c28655q.m87150e0(1096998318);
                        c28655q.m87173q(false);
                        cVar2 = cVar;
                        z15 = false;
                        interfaceC28593a3 = interfaceC28593a2;
                        f14 = f13;
                        f15 = 1.0f;
                    } else {
                        c28655q.m87150e0(1096998319);
                        f14 = f13;
                        f15 = 1.0f;
                        Modifier modifierM3409f19 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                        EnumC27284v enumC27284v19 = EnumC27284v.TextLarge;
                        String strM21275i19 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                        if ((i25 & 3670016) == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cVar2 = cVar;
                        zM87157i = z14 | c28655q.m87157i(cVar2);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i31111112 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i31111112) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i31111113 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i31111113) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        function12 = function14;
                        interfaceC28593a3 = interfaceC28593a2;
                        AbstractC27282u.m82292h(modifierM3409f19, enumC27284v19, strM21275i19, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                        c28655q = c28655q;
                        z15 = false;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f110 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                    EnumC27284v enumC27284v110 = EnumC27284v.TextLarge;
                    String strM21275i110 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                    if ((i25 & 458752) == 131072) {
                        z15 = true;
                    }
                    zM87157i2 = z15 | c28655q.m87157i(cVar2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i31111114 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i31111114) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i31111115 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i31111115) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q12 = c28655q;
                    AbstractC27282u.m82292h(modifierM3409f110, enumC27284v110, strM21275i110, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q12, 54, 120);
                    Modifier modifierM3395q10 = AbstractC1099a.m3395q(c2314t, f14, f1110);
                    C21054m c21054mM58880a10 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q12, 0, C21053l.f79835b << 15, 32767);
                    C38072d c38072d15 = C38072d.f163053a;
                    int i413 = C38072d.f163054b;
                    AbstractC21048g.m58807M(str2, modifierM3395q10, false, C21054m.m58881b(c21054mM58880a10, C23285v0.m67364b(c38072d15.m121952e(c28655q12, i413).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d15.m121949b(c28655q12, i413).getWhite50(), c38072d15.m121949b(c28655q12, i413).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q12, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                    c28655q2 = c28655q12;
                    c28655q2.m87173q(true);
                    function6 = function1110;
                    interfaceC4339a3 = interfaceC4339a9;
                    function7 = function12;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    function6 = function1;
                    interfaceC4339a3 = interfaceC4339a2;
                    function7 = function5;
                    function8 = function4;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g((Object) cVar2, (Object) str, (Object) str2, (Object) interfaceC4339a3, function6, function8, function7, i13, i14, 13);
                }
            }
            i29 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function4 = function2;
            i19 = i14 & 64;
            if (i19 != 0) {
                i29 |= 1572864;
                function5 = function3;
            } else {
                function5 = function3;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function5)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i29 |= i24;
                }
            }
            if ((i29 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i29 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C22837a(21);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i15 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C22594e(16);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function9 = (Function1) objM87133R7;
                } else {
                    function9 = function1;
                }
                if (i17 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22594e(17);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function10 = (Function1) objM87133R6;
                } else {
                    function10 = function4;
                }
                if (i19 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22594e(18);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function5 = (Function1) objM87133R5;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    it3 = cVar.m58526f().iterator();
                    i28 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            i28 = -1;
                            break;
                        } else {
                            if (it3.next().getSelected()) {
                                break;
                                break;
                            }
                            i28++;
                        }
                    }
                    objM87133R = AbstractC31061c.m95646v(i28, c28655q2);
                }
                InterfaceC28593a1 interfaceC28593a10 = (InterfaceC28593a1) objM87133R;
                C38072d c38072d16 = C38072d.f163053a;
                function11 = function10;
                int i31122 = C38072d.f163054b;
                Function1 function1111 = function5;
                long jM125410o6 = c38072d16.m121949b(c28655q2, i31122).getBackgroundDarkStd();
                C17916v0 c17916v5 = AbstractC17918w0.f69621a;
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l6 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o6, c17916v5)));
                float f1111 = 8;
                f13 = 2 * f1111;
                InterfaceC4339a interfaceC4339a10 = interfaceC4339a4;
                Modifier modifierM92116f5 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f13, modifierM66723l6), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C2305k c2305k6 = C2299e.f9111N;
                C22957g c22957g6 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM92116f5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i112 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM66775a16);
                C0209i c0209i113 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N16);
                    function12 = function1111;
                    i25 = i29;
                    c28676v1 = c28676v0;
                    function13 = function9;
                    c0213j3 = c0213j2;
                    interfaceC28593a1 = interfaceC28593a10;
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d16), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a10, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                    TextResource textResourceM58528h11 = cVar.getTitle();
                    int i31111116 = TextResource.$stable;
                    String strM21274h11 = AbstractC8693b.m21274h(textResourceM58528h11, c28655q2, i31111116);
                    C2886a c2886aM8397c11 = C2886a.m8397c(c38072d16.m121952e(c28655q2, i31122).getT1(), C23285v0.m67364b(c38072d16.m121952e(c28655q2, i31122).getT1().getStyle(), c38072d16.m121949b(c28655q2, i31122).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                    int i31111117 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h11, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c11, null, c28655q2, 0, i31111117, 196606);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i31111116), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d16.m121952e(c28655q2, i31122).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d16, c28655q2, i31122), c38072d16.m121949b(c28655q2, i31122).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i31111117, 196606);
                    c28655q = c28655q2;
                    float f1112 = 3 * f1111;
                    Modifier modifierM3396r11 = AbstractC1099a.m3396r(c2314t, 0.0f, f1112, 1);
                    C23010x c23010xM66775a17 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3396r11);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, c23010xM66775a17);
                    AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m17);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N17);
                    it = cVar.m58526f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            tag = ((C24773i) next).getTag();
                            if (tag == null) {
                            }
                        }
                    }
                    if (next != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c28655q.m87150e0(-1756979165);
                    i26 = 0;
                    while (r1.hasNext()) {
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C24773i c24773i11 = (C24773i) obj;
                        if (m66357K(interfaceC28593a1) == i26) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        C24773i c24773iM72590b11 = C24773i.m72590b(c24773i11, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                        boolean zM87149e11 = c28655q.m87149e(i26);
                        if ((i25 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i3 = zM87149e11 | z17 | c28655q.m87157i(c24773i11);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i3) {
                            c28676v2 = c28676v1;
                            if (objM87133R4 == c28676v2) {
                                interfaceC28593a4 = interfaceC28593a1;
                                function15 = function13;
                            }
                            AbstractC24772h.m72579j(c24773iM72590b11, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        interfaceC28593a4 = interfaceC28593a1;
                        function15 = function13;
                        objM87133R4 = new C16561a0(i26, function15, c24773i11, interfaceC28593a4);
                        c28655q.m87172p0(objM87133R4);
                        AbstractC24772h.m72579j(c24773iM72590b11, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    }
                    interfaceC28593a2 = interfaceC28593a1;
                    Function1 function1112 = function13;
                    C28676v0 c28676v13 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                    if (secondaryCtaTitle == null) {
                        c28655q.m87150e0(1096998318);
                        c28655q.m87173q(false);
                        cVar2 = cVar;
                        z15 = false;
                        interfaceC28593a3 = interfaceC28593a2;
                        f14 = f13;
                        f15 = 1.0f;
                    } else {
                        c28655q.m87150e0(1096998319);
                        f14 = f13;
                        f15 = 1.0f;
                        Modifier modifierM3409f111 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                        EnumC27284v enumC27284v111 = EnumC27284v.TextLarge;
                        String strM21275i111 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                        if ((i25 & 3670016) == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cVar2 = cVar;
                        zM87157i = z14 | c28655q.m87157i(cVar2);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i31111118 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i31111118) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i31111119 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i31111119) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        function12 = function14;
                        interfaceC28593a3 = interfaceC28593a2;
                        AbstractC27282u.m82292h(modifierM3409f111, enumC27284v111, strM21275i111, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                        c28655q = c28655q;
                        z15 = false;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f112 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                    EnumC27284v enumC27284v112 = EnumC27284v.TextLarge;
                    String strM21275i112 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                    if ((i25 & 458752) == 131072) {
                        z15 = true;
                    }
                    zM87157i2 = z15 | c28655q.m87157i(cVar2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i311111110 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311111110) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i311111111 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311111111) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q13 = c28655q;
                    AbstractC27282u.m82292h(modifierM3409f112, enumC27284v112, strM21275i112, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q13, 54, 120);
                    Modifier modifierM3395q11 = AbstractC1099a.m3395q(c2314t, f14, f1112);
                    C21054m c21054mM58880a11 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q13, 0, C21053l.f79835b << 15, 32767);
                    C38072d c38072d17 = C38072d.f163053a;
                    int i414 = C38072d.f163054b;
                    AbstractC21048g.m58807M(str2, modifierM3395q11, false, C21054m.m58881b(c21054mM58880a11, C23285v0.m67364b(c38072d17.m121952e(c28655q13, i414).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d17.m121949b(c28655q13, i414).getWhite50(), c38072d17.m121949b(c28655q13, i414).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q13, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                    c28655q2 = c28655q13;
                    c28655q2.m87173q(true);
                    function6 = function1112;
                    interfaceC4339a3 = interfaceC4339a10;
                    function7 = function12;
                } else {
                    c0213j2 = c0213j;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i115 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N16);
                function12 = function1111;
                i25 = i29;
                c28676v1 = c28676v0;
                function13 = function9;
                c0213j3 = c0213j2;
                interfaceC28593a1 = interfaceC28593a10;
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d16), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a10, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                TextResource textResourceM58528h12 = cVar.getTitle();
                int i311111112 = TextResource.$stable;
                String strM21274h12 = AbstractC8693b.m21274h(textResourceM58528h12, c28655q2, i311111112);
                C2886a c2886aM8397c12 = C2886a.m8397c(c38072d16.m121952e(c28655q2, i31122).getT1(), C23285v0.m67364b(c38072d16.m121952e(c28655q2, i31122).getT1().getStyle(), c38072d16.m121949b(c28655q2, i31122).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                int i311111113 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h12, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c12, null, c28655q2, 0, i311111113, 196606);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i311111112), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d16.m121952e(c28655q2, i31122).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d16, c28655q2, i31122), c38072d16.m121949b(c28655q2, i31122).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i311111113, 196606);
                c28655q = c28655q2;
                float f1113 = 3 * f1111;
                Modifier modifierM3396r12 = AbstractC1099a.m3396r(c2314t, 0.0f, f1113, 1);
                C23010x c23010xM66775a18 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3396r12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, c23010xM66775a18);
                AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N18);
                it = cVar.m58526f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        tag = ((C24773i) next).getTag();
                        if (tag == null) {
                        }
                    }
                }
                if (next != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c28655q.m87150e0(-1756979165);
                i26 = 0;
                while (r1.hasNext()) {
                    i27 = i26 + 1;
                    if (i26 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C24773i c24773i12 = (C24773i) obj;
                    if (m66357K(interfaceC28593a1) == i26) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    C24773i c24773iM72590b12 = C24773i.m72590b(c24773i12, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                    boolean zM87149e12 = c28655q.m87149e(i26);
                    if ((i25 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = zM87149e12 | z17 | c28655q.m87157i(c24773i12);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i3) {
                        c28676v2 = c28676v1;
                        if (objM87133R4 == c28676v2) {
                            interfaceC28593a4 = interfaceC28593a1;
                            function15 = function13;
                        }
                        AbstractC24772h.m72579j(c24773iM72590b12, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    interfaceC28593a4 = interfaceC28593a1;
                    function15 = function13;
                    objM87133R4 = new C16561a0(i26, function15, c24773i12, interfaceC28593a4);
                    c28655q.m87172p0(objM87133R4);
                    AbstractC24772h.m72579j(c24773iM72590b12, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                    i26 = i27;
                    c28676v1 = c28676v2;
                    function13 = function15;
                    interfaceC28593a1 = interfaceC28593a4;
                }
                interfaceC28593a2 = interfaceC28593a1;
                Function1 function1113 = function13;
                C28676v0 c28676v14 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                if (secondaryCtaTitle == null) {
                    c28655q.m87150e0(1096998318);
                    c28655q.m87173q(false);
                    cVar2 = cVar;
                    z15 = false;
                    interfaceC28593a3 = interfaceC28593a2;
                    f14 = f13;
                    f15 = 1.0f;
                } else {
                    c28655q.m87150e0(1096998319);
                    f14 = f13;
                    f15 = 1.0f;
                    Modifier modifierM3409f113 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                    EnumC27284v enumC27284v113 = EnumC27284v.TextLarge;
                    String strM21275i113 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                    if ((i25 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    cVar2 = cVar;
                    zM87157i = z14 | c28655q.m87157i(cVar2);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        final int i311111114 = 0;
                        function14 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311111114) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                    default:
                                        return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i311111115 = 0;
                        function14 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i311111115) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                    default:
                                        return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    function12 = function14;
                    interfaceC28593a3 = interfaceC28593a2;
                    AbstractC27282u.m82292h(modifierM3409f113, enumC27284v113, strM21275i113, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                    c28655q = c28655q;
                    z15 = false;
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f114 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                EnumC27284v enumC27284v114 = EnumC27284v.TextLarge;
                String strM21275i114 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                if ((i25 & 458752) == 131072) {
                    z15 = true;
                }
                zM87157i2 = z15 | c28655q.m87157i(cVar2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i311111116 = 1;
                    function8 = function11;
                    objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i311111116) {
                                case 0:
                                    return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                default:
                                    return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i311111117 = 1;
                    function8 = function11;
                    objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i311111117) {
                                case 0:
                                    return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                default:
                                    return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                C28655q c28655q14 = c28655q;
                AbstractC27282u.m82292h(modifierM3409f114, enumC27284v114, strM21275i114, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q14, 54, 120);
                Modifier modifierM3395q12 = AbstractC1099a.m3395q(c2314t, f14, f1113);
                C21054m c21054mM58880a12 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q14, 0, C21053l.f79835b << 15, 32767);
                C38072d c38072d18 = C38072d.f163053a;
                int i415 = C38072d.f163054b;
                AbstractC21048g.m58807M(str2, modifierM3395q12, false, C21054m.m58881b(c21054mM58880a12, C23285v0.m67364b(c38072d18.m121952e(c28655q14, i415).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d18.m121949b(c28655q14, i415).getWhite50(), c38072d18.m121949b(c28655q14, i415).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q14, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                c28655q2 = c28655q14;
                c28655q2.m87173q(true);
                function6 = function1113;
                interfaceC4339a3 = interfaceC4339a10;
                function7 = function12;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                function6 = function1;
                interfaceC4339a3 = interfaceC4339a2;
                function7 = function5;
                function8 = function4;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) cVar2, (Object) str, (Object) str2, (Object) interfaceC4339a3, function6, function8, function7, i13, i14, 13);
            }
        }
        i29 |= 24576;
        i17 = i14 & 32;
        if (i17 != 0) {
            if ((196608 & i13) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i29 |= i18;
            }
            i19 = i14 & 64;
            if (i19 != 0) {
                i29 |= 1572864;
                function5 = function3;
            } else {
                function5 = function3;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function5)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i29 |= i24;
                }
            }
            if ((i29 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i29 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C22837a(21);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i15 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C22594e(16);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function9 = (Function1) objM87133R7;
                } else {
                    function9 = function1;
                }
                if (i17 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22594e(17);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function10 = (Function1) objM87133R6;
                } else {
                    function10 = function4;
                }
                if (i19 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22594e(18);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function5 = (Function1) objM87133R5;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    it3 = cVar.m58526f().iterator();
                    i28 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            i28 = -1;
                            break;
                        } else {
                            if (it3.next().getSelected()) {
                                break;
                                break;
                            }
                            i28++;
                        }
                    }
                    objM87133R = AbstractC31061c.m95646v(i28, c28655q2);
                }
                InterfaceC28593a1 interfaceC28593a11 = (InterfaceC28593a1) objM87133R;
                C38072d c38072d19 = C38072d.f163053a;
                function11 = function10;
                int i31123 = C38072d.f163054b;
                Function1 function1114 = function5;
                long jM125410o7 = c38072d19.m121949b(c28655q2, i31123).getBackgroundDarkStd();
                C17916v0 c17916v6 = AbstractC17918w0.f69621a;
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l7 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o7, c17916v6)));
                float f1114 = 8;
                f13 = 2 * f1114;
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a4;
                Modifier modifierM92116f6 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f13, modifierM66723l7), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C2305k c2305k7 = C2299e.f9111N;
                C22957g c22957g7 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM92116f6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i116 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM66775a19);
                C0209i c0209i117 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m19);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i118 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N19);
                    function12 = function1114;
                    i25 = i29;
                    c28676v1 = c28676v0;
                    function13 = function9;
                    c0213j3 = c0213j2;
                    interfaceC28593a1 = interfaceC28593a11;
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d19), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a11, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                    TextResource textResourceM58528h13 = cVar.getTitle();
                    int i311111118 = TextResource.$stable;
                    String strM21274h13 = AbstractC8693b.m21274h(textResourceM58528h13, c28655q2, i311111118);
                    C2886a c2886aM8397c13 = C2886a.m8397c(c38072d19.m121952e(c28655q2, i31123).getT1(), C23285v0.m67364b(c38072d19.m121952e(c28655q2, i31123).getT1().getStyle(), c38072d19.m121949b(c28655q2, i31123).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                    int i311111119 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h13, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c13, null, c28655q2, 0, i311111119, 196606);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i311111118), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d19.m121952e(c28655q2, i31123).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d19, c28655q2, i31123), c38072d19.m121949b(c28655q2, i31123).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i311111119, 196606);
                    c28655q = c28655q2;
                    float f1115 = 3 * f1114;
                    Modifier modifierM3396r13 = AbstractC1099a.m3396r(c2314t, 0.0f, f1115, 1);
                    C23010x c23010xM66775a110 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3396r13);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, c23010xM66775a110);
                    AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N110);
                    it = cVar.m58526f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            tag = ((C24773i) next).getTag();
                            if (tag == null) {
                            }
                        }
                    }
                    if (next != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c28655q.m87150e0(-1756979165);
                    i26 = 0;
                    while (r1.hasNext()) {
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C24773i c24773i13 = (C24773i) obj;
                        if (m66357K(interfaceC28593a1) == i26) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        C24773i c24773iM72590b13 = C24773i.m72590b(c24773i13, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                        boolean zM87149e13 = c28655q.m87149e(i26);
                        if ((i25 & 57344) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87157i3 = zM87149e13 | z17 | c28655q.m87157i(c24773i13);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i3) {
                            c28676v2 = c28676v1;
                            if (objM87133R4 == c28676v2) {
                                interfaceC28593a4 = interfaceC28593a1;
                                function15 = function13;
                            }
                            AbstractC24772h.m72579j(c24773iM72590b13, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                            i26 = i27;
                            c28676v1 = c28676v2;
                            function13 = function15;
                            interfaceC28593a1 = interfaceC28593a4;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        interfaceC28593a4 = interfaceC28593a1;
                        function15 = function13;
                        objM87133R4 = new C16561a0(i26, function15, c24773i13, interfaceC28593a4);
                        c28655q.m87172p0(objM87133R4);
                        AbstractC24772h.m72579j(c24773iM72590b13, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    }
                    interfaceC28593a2 = interfaceC28593a1;
                    Function1 function1115 = function13;
                    C28676v0 c28676v15 = c28676v1;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                    if (secondaryCtaTitle == null) {
                        c28655q.m87150e0(1096998318);
                        c28655q.m87173q(false);
                        cVar2 = cVar;
                        z15 = false;
                        interfaceC28593a3 = interfaceC28593a2;
                        f14 = f13;
                        f15 = 1.0f;
                    } else {
                        c28655q.m87150e0(1096998319);
                        f14 = f13;
                        f15 = 1.0f;
                        Modifier modifierM3409f115 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                        EnumC27284v enumC27284v115 = EnumC27284v.TextLarge;
                        String strM21275i115 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                        if ((i25 & 3670016) == 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cVar2 = cVar;
                        zM87157i = z14 | c28655q.m87157i(cVar2);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i) {
                            final int i3111111110 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3111111110) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i3111111111 = 0;
                            function14 = function12;
                            objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i3111111111) {
                                        case 0:
                                            return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                        default:
                                            return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        function12 = function14;
                        interfaceC28593a3 = interfaceC28593a2;
                        AbstractC27282u.m82292h(modifierM3409f115, enumC27284v115, strM21275i115, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                        c28655q = c28655q;
                        z15 = false;
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3409f116 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                    EnumC27284v enumC27284v116 = EnumC27284v.TextLarge;
                    String strM21275i116 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                    if ((i25 & 458752) == 131072) {
                        z15 = true;
                    }
                    zM87157i2 = z15 | c28655q.m87157i(cVar2);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        final int i3111111112 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3111111112) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        final int i3111111113 = 1;
                        function8 = function11;
                        objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3111111113) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                    default:
                                        return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    C28655q c28655q15 = c28655q;
                    AbstractC27282u.m82292h(modifierM3409f116, enumC27284v116, strM21275i116, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q15, 54, 120);
                    Modifier modifierM3395q13 = AbstractC1099a.m3395q(c2314t, f14, f1115);
                    C21054m c21054mM58880a13 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q15, 0, C21053l.f79835b << 15, 32767);
                    C38072d c38072d110 = C38072d.f163053a;
                    int i416 = C38072d.f163054b;
                    AbstractC21048g.m58807M(str2, modifierM3395q13, false, C21054m.m58881b(c21054mM58880a13, C23285v0.m67364b(c38072d110.m121952e(c28655q15, i416).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d110.m121949b(c28655q15, i416).getWhite50(), c38072d110.m121949b(c28655q15, i416).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q15, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                    c28655q2 = c28655q15;
                    c28655q2.m87173q(true);
                    function6 = function1115;
                    interfaceC4339a3 = interfaceC4339a11;
                    function7 = function12;
                } else {
                    c0213j2 = c0213j;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i119 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i119, modifierM118962N19);
                function12 = function1114;
                i25 = i29;
                c28676v1 = c28676v0;
                function13 = function9;
                c0213j3 = c0213j2;
                interfaceC28593a1 = interfaceC28593a11;
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d19), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a11, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                TextResource textResourceM58528h14 = cVar.getTitle();
                int i3111111114 = TextResource.$stable;
                String strM21274h14 = AbstractC8693b.m21274h(textResourceM58528h14, c28655q2, i3111111114);
                C2886a c2886aM8397c14 = C2886a.m8397c(c38072d19.m121952e(c28655q2, i31123).getT1(), C23285v0.m67364b(c38072d19.m121952e(c28655q2, i31123).getT1().getStyle(), c38072d19.m121949b(c28655q2, i31123).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                int i3111111115 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h14, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c14, null, c28655q2, 0, i3111111115, 196606);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i3111111114), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d19.m121952e(c28655q2, i31123).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d19, c28655q2, i31123), c38072d19.m121949b(c28655q2, i31123).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i3111111115, 196606);
                c28655q = c28655q2;
                float f1116 = 3 * f1114;
                Modifier modifierM3396r14 = AbstractC1099a.m3396r(c2314t, 0.0f, f1116, 1);
                C23010x c23010xM66775a111 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3396r14);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i116, c23010xM66775a111);
                AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N111);
                it = cVar.m58526f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        tag = ((C24773i) next).getTag();
                        if (tag == null) {
                        }
                    }
                }
                if (next != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c28655q.m87150e0(-1756979165);
                i26 = 0;
                while (r1.hasNext()) {
                    i27 = i26 + 1;
                    if (i26 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C24773i c24773i14 = (C24773i) obj;
                    if (m66357K(interfaceC28593a1) == i26) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    C24773i c24773iM72590b14 = C24773i.m72590b(c24773i14, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                    boolean zM87149e14 = c28655q.m87149e(i26);
                    if ((i25 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = zM87149e14 | z17 | c28655q.m87157i(c24773i14);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i3) {
                        c28676v2 = c28676v1;
                        if (objM87133R4 == c28676v2) {
                            interfaceC28593a4 = interfaceC28593a1;
                            function15 = function13;
                        }
                        AbstractC24772h.m72579j(c24773iM72590b14, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    interfaceC28593a4 = interfaceC28593a1;
                    function15 = function13;
                    objM87133R4 = new C16561a0(i26, function15, c24773i14, interfaceC28593a4);
                    c28655q.m87172p0(objM87133R4);
                    AbstractC24772h.m72579j(c24773iM72590b14, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                    i26 = i27;
                    c28676v1 = c28676v2;
                    function13 = function15;
                    interfaceC28593a1 = interfaceC28593a4;
                }
                interfaceC28593a2 = interfaceC28593a1;
                Function1 function1116 = function13;
                C28676v0 c28676v16 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                if (secondaryCtaTitle == null) {
                    c28655q.m87150e0(1096998318);
                    c28655q.m87173q(false);
                    cVar2 = cVar;
                    z15 = false;
                    interfaceC28593a3 = interfaceC28593a2;
                    f14 = f13;
                    f15 = 1.0f;
                } else {
                    c28655q.m87150e0(1096998319);
                    f14 = f13;
                    f15 = 1.0f;
                    Modifier modifierM3409f117 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                    EnumC27284v enumC27284v117 = EnumC27284v.TextLarge;
                    String strM21275i117 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                    if ((i25 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    cVar2 = cVar;
                    zM87157i = z14 | c28655q.m87157i(cVar2);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        final int i3111111116 = 0;
                        function14 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3111111116) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                    default:
                                        return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i3111111117 = 0;
                        function14 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i3111111117) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                    default:
                                        return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    function12 = function14;
                    interfaceC28593a3 = interfaceC28593a2;
                    AbstractC27282u.m82292h(modifierM3409f117, enumC27284v117, strM21275i117, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                    c28655q = c28655q;
                    z15 = false;
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f118 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                EnumC27284v enumC27284v118 = EnumC27284v.TextLarge;
                String strM21275i118 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                if ((i25 & 458752) == 131072) {
                    z15 = true;
                }
                zM87157i2 = z15 | c28655q.m87157i(cVar2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i3111111118 = 1;
                    function8 = function11;
                    objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3111111118) {
                                case 0:
                                    return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                default:
                                    return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i3111111119 = 1;
                    function8 = function11;
                    objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i3111111119) {
                                case 0:
                                    return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                default:
                                    return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                C28655q c28655q16 = c28655q;
                AbstractC27282u.m82292h(modifierM3409f118, enumC27284v118, strM21275i118, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q16, 54, 120);
                Modifier modifierM3395q14 = AbstractC1099a.m3395q(c2314t, f14, f1116);
                C21054m c21054mM58880a14 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q16, 0, C21053l.f79835b << 15, 32767);
                C38072d c38072d111 = C38072d.f163053a;
                int i417 = C38072d.f163054b;
                AbstractC21048g.m58807M(str2, modifierM3395q14, false, C21054m.m58881b(c21054mM58880a14, C23285v0.m67364b(c38072d111.m121952e(c28655q16, i417).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d111.m121949b(c28655q16, i417).getWhite50(), c38072d111.m121949b(c28655q16, i417).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q16, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                c28655q2 = c28655q16;
                c28655q2.m87173q(true);
                function6 = function1116;
                interfaceC4339a3 = interfaceC4339a11;
                function7 = function12;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                function6 = function1;
                interfaceC4339a3 = interfaceC4339a2;
                function7 = function5;
                function8 = function4;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) cVar2, (Object) str, (Object) str2, (Object) interfaceC4339a3, function6, function8, function7, i13, i14, 13);
            }
        }
        i29 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function4 = function2;
        i19 = i14 & 64;
        if (i19 != 0) {
            i29 |= 1572864;
            function5 = function3;
        } else {
            function5 = function3;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(function5)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i29 |= i24;
            }
        }
        if ((i29 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i29 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C22837a(21);
                    c28655q2.m87172p0(objM87133R8);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (i15 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C22594e(16);
                    c28655q2.m87172p0(objM87133R7);
                }
                function9 = (Function1) objM87133R7;
            } else {
                function9 = function1;
            }
            if (i17 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C22594e(17);
                    c28655q2.m87172p0(objM87133R6);
                }
                function10 = (Function1) objM87133R6;
            } else {
                function10 = function4;
            }
            if (i19 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C22594e(18);
                    c28655q2.m87172p0(objM87133R5);
                }
                function5 = (Function1) objM87133R5;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                it3 = cVar.m58526f().iterator();
                i28 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        i28 = -1;
                        break;
                    } else {
                        if (it3.next().getSelected()) {
                            break;
                            break;
                        }
                        i28++;
                    }
                }
                objM87133R = AbstractC31061c.m95646v(i28, c28655q2);
            }
            InterfaceC28593a1 interfaceC28593a12 = (InterfaceC28593a1) objM87133R;
            C38072d c38072d112 = C38072d.f163053a;
            function11 = function10;
            int i31124 = C38072d.f163054b;
            Function1 function1117 = function5;
            long jM125410o8 = c38072d112.m121949b(c28655q2, i31124).getBackgroundDarkStd();
            C17916v0 c17916v7 = AbstractC17918w0.f69621a;
            c2314t = C2314t.f9131w;
            Modifier modifierM66723l8 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o8, c17916v7)));
            float f1117 = 8;
            f13 = 2 * f1117;
            InterfaceC4339a interfaceC4339a12 = interfaceC4339a4;
            Modifier modifierM92116f7 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f13, modifierM66723l8), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            C2305k c2305k8 = C2299e.f9111N;
            C22957g c22957g8 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a112 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM92116f7);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i1110 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i1110, c23010xM66775a112);
            C0209i c0209i1111 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                c0213j2 = c0213j;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i1112, modifierM118962N112);
                function12 = function1117;
                i25 = i29;
                c28676v1 = c28676v0;
                function13 = function9;
                c0213j3 = c0213j2;
                interfaceC28593a1 = interfaceC28593a12;
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d112), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a12, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
                TextResource textResourceM58528h15 = cVar.getTitle();
                int i31111111110 = TextResource.$stable;
                String strM21274h15 = AbstractC8693b.m21274h(textResourceM58528h15, c28655q2, i31111111110);
                C2886a c2886aM8397c15 = C2886a.m8397c(c38072d112.m121952e(c28655q2, i31124).getT1(), C23285v0.m67364b(c38072d112.m121952e(c28655q2, i31124).getT1().getStyle(), c38072d112.m121949b(c28655q2, i31124).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
                int i31111111111 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h15, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c15, null, c28655q2, 0, i31111111111, 196606);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i31111111110), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d112.m121952e(c28655q2, i31124).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d112, c28655q2, i31124), c38072d112.m121949b(c28655q2, i31124).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i31111111111, 196606);
                c28655q = c28655q2;
                float f1118 = 3 * f1117;
                Modifier modifierM3396r15 = AbstractC1099a.m3396r(c2314t, 0.0f, f1118, 1);
                C23010x c23010xM66775a113 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3396r15);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1110, c23010xM66775a113);
                AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m113);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N113);
                it = cVar.m58526f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        tag = ((C24773i) next).getTag();
                        if (tag == null) {
                        }
                    }
                }
                if (next != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c28655q.m87150e0(-1756979165);
                i26 = 0;
                while (r1.hasNext()) {
                    i27 = i26 + 1;
                    if (i26 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C24773i c24773i15 = (C24773i) obj;
                    if (m66357K(interfaceC28593a1) == i26) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    C24773i c24773iM72590b15 = C24773i.m72590b(c24773i15, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                    boolean zM87149e15 = c28655q.m87149e(i26);
                    if ((i25 & 57344) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87157i3 = zM87149e15 | z17 | c28655q.m87157i(c24773i15);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i3) {
                        c28676v2 = c28676v1;
                        if (objM87133R4 == c28676v2) {
                            interfaceC28593a4 = interfaceC28593a1;
                            function15 = function13;
                        }
                        AbstractC24772h.m72579j(c24773iM72590b15, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                        i26 = i27;
                        c28676v1 = c28676v2;
                        function13 = function15;
                        interfaceC28593a1 = interfaceC28593a4;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    interfaceC28593a4 = interfaceC28593a1;
                    function15 = function13;
                    objM87133R4 = new C16561a0(i26, function15, c24773i15, interfaceC28593a4);
                    c28655q.m87172p0(objM87133R4);
                    AbstractC24772h.m72579j(c24773iM72590b15, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                    i26 = i27;
                    c28676v1 = c28676v2;
                    function13 = function15;
                    interfaceC28593a1 = interfaceC28593a4;
                }
                interfaceC28593a2 = interfaceC28593a1;
                Function1 function1118 = function13;
                C28676v0 c28676v17 = c28676v1;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
                if (secondaryCtaTitle == null) {
                    c28655q.m87150e0(1096998318);
                    c28655q.m87173q(false);
                    cVar2 = cVar;
                    z15 = false;
                    interfaceC28593a3 = interfaceC28593a2;
                    f14 = f13;
                    f15 = 1.0f;
                } else {
                    c28655q.m87150e0(1096998319);
                    f14 = f13;
                    f15 = 1.0f;
                    Modifier modifierM3409f119 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                    EnumC27284v enumC27284v119 = EnumC27284v.TextLarge;
                    String strM21275i119 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                    if ((i25 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    cVar2 = cVar;
                    zM87157i = z14 | c28655q.m87157i(cVar2);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        final int i31111111112 = 0;
                        function14 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i31111111112) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                    default:
                                        return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i31111111113 = 0;
                        function14 = function12;
                        objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i31111111113) {
                                    case 0:
                                        return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                    default:
                                        return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    function12 = function14;
                    interfaceC28593a3 = interfaceC28593a2;
                    AbstractC27282u.m82292h(modifierM3409f119, enumC27284v119, strM21275i119, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                    c28655q = c28655q;
                    z15 = false;
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f1110 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
                EnumC27284v enumC27284v1110 = EnumC27284v.TextLarge;
                String strM21275i1110 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
                if ((i25 & 458752) == 131072) {
                    z15 = true;
                }
                zM87157i2 = z15 | c28655q.m87157i(cVar2);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i31111111114 = 1;
                    function8 = function11;
                    objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31111111114) {
                                case 0:
                                    return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                default:
                                    return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i31111111115 = 1;
                    function8 = function11;
                    objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31111111115) {
                                case 0:
                                    return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                                default:
                                    return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                C28655q c28655q17 = c28655q;
                AbstractC27282u.m82292h(modifierM3409f1110, enumC27284v1110, strM21275i1110, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q17, 54, 120);
                Modifier modifierM3395q15 = AbstractC1099a.m3395q(c2314t, f14, f1118);
                C21054m c21054mM58880a15 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q17, 0, C21053l.f79835b << 15, 32767);
                C38072d c38072d113 = C38072d.f163053a;
                int i418 = C38072d.f163054b;
                AbstractC21048g.m58807M(str2, modifierM3395q15, false, C21054m.m58881b(c21054mM58880a15, C23285v0.m67364b(c38072d113.m121952e(c28655q17, i418).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d113.m121949b(c28655q17, i418).getWhite50(), c38072d113.m121949b(c28655q17, i418).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q17, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
                c28655q2 = c28655q17;
                c28655q2.m87173q(true);
                function6 = function1118;
                interfaceC4339a3 = interfaceC4339a12;
                function7 = function12;
            } else {
                c0213j2 = c0213j;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i1113 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i1113, modifierM118962N112);
            function12 = function1117;
            i25 = i29;
            c28676v1 = c28676v0;
            function13 = function9;
            c0213j3 = c0213j2;
            interfaceC28593a1 = interfaceC28593a12;
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(cVar.getHeader(), null, AbstractC13673n.m38561h(c38072d112), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a12, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | (i29 & 7168), 53);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(16, c2314t));
            TextResource textResourceM58528h16 = cVar.getTitle();
            int i31111111116 = TextResource.$stable;
            String strM21274h16 = AbstractC8693b.m21274h(textResourceM58528h16, c28655q2, i31111111116);
            C2886a c2886aM8397c16 = C2886a.m8397c(c38072d112.m121952e(c28655q2, i31124).getT1(), C23285v0.m67364b(c38072d112.m121952e(c28655q2, i31124).getT1().getStyle(), c38072d112.m121949b(c28655q2, i31124).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null);
            int i31111111117 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h16, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c16, null, c28655q2, 0, i31111111117, 196606);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q2, i31111111116), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d112.m121952e(c28655q2, i31124).getB1(), C23285v0.m67364b(AbstractC33745d.m106661t(c38072d112, c28655q2, i31124), c38072d112.m121949b(c28655q2, i31124).getBrandWhite(), 0L, null, null, 0L, 3, 0L, null, null, 16744446), null, 2, null), null, c28655q2, 0, i31111111117, 196606);
            c28655q = c28655q2;
            float f1119 = 3 * f1117;
            Modifier modifierM3396r16 = AbstractC1099a.m3396r(c2314t, 0.0f, f1119, 1);
            C23010x c23010xM66775a114 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3396r16);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i1110, c23010xM66775a114);
            AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m114);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N114);
            it = cVar.m58526f().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    tag = ((C24773i) next).getTag();
                    if (tag == null) {
                    }
                }
            }
            if (next != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            c28655q.m87150e0(-1756979165);
            i26 = 0;
            while (r1.hasNext()) {
                i27 = i26 + 1;
                if (i26 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C24773i c24773i16 = (C24773i) obj;
                if (m66357K(interfaceC28593a1) == i26) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C24773i c24773iM72590b16 = C24773i.m72590b(c24773i16, null, null, null, z16, null, null, null, null, null, null, null, null, 4087, null);
                boolean zM87149e16 = c28655q.m87149e(i26);
                if ((i25 & 57344) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i3 = zM87149e16 | z17 | c28655q.m87157i(c24773i16);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i3) {
                    c28676v2 = c28676v1;
                    if (objM87133R4 == c28676v2) {
                        interfaceC28593a4 = interfaceC28593a1;
                        function15 = function13;
                    }
                    AbstractC24772h.m72579j(c24773iM72590b16, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                    i26 = i27;
                    c28676v1 = c28676v2;
                    function13 = function15;
                    interfaceC28593a1 = interfaceC28593a4;
                } else {
                    c28676v2 = c28676v1;
                }
                interfaceC28593a4 = interfaceC28593a1;
                function15 = function13;
                objM87133R4 = new C16561a0(i26, function15, c24773i16, interfaceC28593a4);
                c28655q.m87172p0(objM87133R4);
                AbstractC24772h.m72579j(c24773iM72590b16, z13, (InterfaceC4339a) objM87133R4, c28655q, 0, 0);
                i26 = i27;
                c28676v1 = c28676v2;
                function13 = function15;
                interfaceC28593a1 = interfaceC28593a4;
            }
            interfaceC28593a2 = interfaceC28593a1;
            Function1 function1119 = function13;
            C28676v0 c28676v18 = c28676v1;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            secondaryCtaTitle = cVar.m58526f().get(m66357K(interfaceC28593a2)).getSecondaryCtaTitle();
            if (secondaryCtaTitle == null) {
                c28655q.m87150e0(1096998318);
                c28655q.m87173q(false);
                cVar2 = cVar;
                z15 = false;
                interfaceC28593a3 = interfaceC28593a2;
                f14 = f13;
                f15 = 1.0f;
            } else {
                c28655q.m87150e0(1096998319);
                f14 = f13;
                f15 = 1.0f;
                Modifier modifierM3409f1111 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, f13, 7));
                EnumC27284v enumC27284v1111 = EnumC27284v.TextLarge;
                String strM21275i1111 = AbstractC8693b.m21275i(secondaryCtaTitle, c28655q, 0);
                if ((i25 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                cVar2 = cVar;
                zM87157i = z14 | c28655q.m87157i(cVar2);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    final int i31111111118 = 0;
                    function14 = function12;
                    objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31111111118) {
                                case 0:
                                    return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                default:
                                    return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i31111111119 = 0;
                    function14 = function12;
                    objM87133R2 = new InterfaceC4339a() { // from class: kw1.h
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i31111111119) {
                                case 0:
                                    return AbstractC22859j.m66360N(function14, cVar2, interfaceC28593a2);
                                default:
                                    return AbstractC22859j.m66361O(function14, cVar2, interfaceC28593a2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                function12 = function14;
                interfaceC28593a3 = interfaceC28593a2;
                AbstractC27282u.m82292h(modifierM3409f1111, enumC27284v1111, strM21275i1111, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                c28655q = c28655q;
                z15 = false;
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f1112 = AbstractC1102d.m3409f(f15, AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2));
            EnumC27284v enumC27284v1112 = EnumC27284v.TextLarge;
            String strM21275i1112 = AbstractC8693b.m21275i(str, c28655q, (i25 >> 3) & 14);
            if ((i25 & 458752) == 131072) {
                z15 = true;
            }
            zM87157i2 = z15 | c28655q.m87157i(cVar2);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                final int i311111111110 = 1;
                function8 = function11;
                objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i311111111110) {
                            case 0:
                                return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                            default:
                                return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            } else {
                final int i311111111111 = 1;
                function8 = function11;
                objM87133R3 = new InterfaceC4339a() { // from class: kw1.h
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i311111111111) {
                            case 0:
                                return AbstractC22859j.m66360N(function8, cVar2, interfaceC28593a3);
                            default:
                                return AbstractC22859j.m66361O(function8, cVar2, interfaceC28593a3);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            C28655q c28655q18 = c28655q;
            AbstractC27282u.m82292h(modifierM3409f1112, enumC27284v1112, strM21275i1112, false, 0L, null, false, (InterfaceC4339a) objM87133R3, c28655q18, 54, 120);
            Modifier modifierM3395q16 = AbstractC1099a.m3395q(c2314t, f14, f1119);
            C21054m c21054mM58880a16 = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q18, 0, C21053l.f79835b << 15, 32767);
            C38072d c38072d114 = C38072d.f163053a;
            int i419 = C38072d.f163054b;
            AbstractC21048g.m58807M(str2, modifierM3395q16, false, C21054m.m58881b(c21054mM58880a16, C23285v0.m67364b(c38072d114.m121952e(c28655q18, i419).getB3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d114.m121949b(c28655q18, i419).getWhite50(), c38072d114.m121949b(c28655q18, i419).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32760, null), null, 0, 0, 0, false, c28655q18, ((i25 >> 6) & 14) | (C21054m.f79836p << 9), 500);
            c28655q2 = c28655q18;
            c28655q2.m87173q(true);
            function6 = function1119;
            interfaceC4339a3 = interfaceC4339a12;
            function7 = function12;
        } else {
            cVar2 = cVar;
            c28655q2.m87138X();
            function6 = function1;
            interfaceC4339a3 = interfaceC4339a2;
            function7 = function5;
            function8 = function4;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g((Object) cVar2, (Object) str, (Object) str2, (Object) interfaceC4339a3, function6, function8, function7, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m66353G() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m66354H(C24773i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m66355I(C24773i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m66356J(C24773i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final int m66357K(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: L */
    private static final void m66358L(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m66359M(int i13, Function1 function1, C24773i c24773i, InterfaceC28593a1 interfaceC28593a1) {
        m66358L(interfaceC28593a1, i13);
        function1.invoke(c24773i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m66360N(Function1 function1, AbstractC20998d.c cVar, InterfaceC28593a1 interfaceC28593a1) {
        function1.invoke(cVar.m58526f().get(m66357K(interfaceC28593a1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m66361O(Function1 function1, AbstractC20998d.c cVar, InterfaceC28593a1 interfaceC28593a1) {
        function1.invoke(cVar.m58526f().get(m66357K(interfaceC28593a1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m66362P(AbstractC20998d.c cVar, String str, String str2, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m66352F(cVar, str, str2, interfaceC4339a, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0163 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0165  */
    /* JADX WARN: Code duplicated, block: B:106:0x0176  */
    /* JADX WARN: Code duplicated, block: B:107:0x0178  */
    /* JADX WARN: Code duplicated, block: B:110:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0181  */
    /* JADX WARN: Code duplicated, block: B:114:0x0190  */
    /* JADX WARN: Code duplicated, block: B:115:0x0192  */
    /* JADX WARN: Code duplicated, block: B:118:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x019b  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a  */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x013e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0143  */
    /* JADX WARN: Code duplicated, block: B:98:0x015a  */
    /* JADX WARN: Code duplicated, block: B:99:0x015c  */
    /* JADX INFO: renamed from: r */
    public static final void m66382r(final AbstractC20998d viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final Function1 function6;
        Function1 function7;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        int i18;
        boolean z13;
        Object objM87133R3;
        boolean z14;
        Object objM87133R4;
        int i19;
        boolean z15;
        Object objM87133R5;
        boolean z16;
        Object objM87133R6;
        boolean z17;
        Object objM87133R7;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R8;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objM87133R9;
        Object objM87133R10;
        Object objM87133R11;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(158889398);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
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
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R11 = c28655q.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C22594e(15);
                            c28655q.m87172p0(objM87133R11);
                        }
                        function6 = (Function1) objM87133R11;
                    } else {
                        function6 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C22594e(19);
                            c28655q.m87172p0(objM87133R10);
                        }
                        function7 = (Function1) objM87133R10;
                    } else {
                        function7 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z("");
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z("");
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    i18 = i15 & 14;
                    if (i18 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z13 || objM87133R3 == c28676v0) {
                        objM87133R3 = new a(viewState, interfaceC28601c1, interfaceC28601c2, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, viewState);
                    if (viewState instanceof AbstractC20998d.a) {
                        c28655q.m87150e0(-1926088079);
                        if ((i15 & 112) == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if (i18 == 4) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z25 | z26;
                        objM87133R9 = c28655q.m87133R();
                        if (z27 || objM87133R9 == c28676v0) {
                            final int i25 = 0;
                            objM87133R9 = new Function1() { // from class: kw1.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i25) {
                                        case 0:
                                            return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                        default:
                                            return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R9);
                        }
                        AbstractC22862m.m66395e(null, (Function1) objM87133R9, c28655q, 0, 1);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC20998d.b) {
                            c28655q.m87150e0(-1926077325);
                            if ((i15 & 112) == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (i18 == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z24 = z18 | z19;
                            objM87133R8 = c28655q.m87133R();
                            if (z24 || objM87133R8 == c28676v0) {
                                final int i26 = 1;
                                objM87133R8 = new Function1() { // from class: kw1.i
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        switch (i26) {
                                            case 0:
                                                return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                            default:
                                                return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R8);
                            }
                            AbstractC22863n.m66404e(null, (Function1) objM87133R8, c28655q, 0, 1);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC20998d.c) {
                                throw AbstractC11895b.m32003v(-1926088877, c28655q, false);
                            }
                            c28655q.m87150e0(-1926065881);
                            AbstractC20998d.c cVar = (AbstractC20998d.c) viewState;
                            String strM66347A = m66347A(interfaceC28601c1);
                            String strM66349C = m66349C(interfaceC28601c2);
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R4 = c28655q.m87133R();
                            if (z14 || objM87133R4 == c28676v0) {
                                objM87133R4 = new C21860l(function7, 28);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                            i19 = i15 & 112;
                            if (i19 == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z15 || objM87133R5 == c28676v0) {
                                objM87133R5 = new C2883e(2, function6, interfaceC28601c1, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R5);
                            }
                            Function1 function8 = (Function1) objM87133R5;
                            if (i19 == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objM87133R6 = c28655q.m87133R();
                            if (z16 || objM87133R6 == c28676v0) {
                                objM87133R6 = new C21862n(function6, 20);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Function1 function9 = (Function1) objM87133R6;
                            if (i19 == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (z17 || objM87133R7 == c28676v0) {
                                objM87133R7 = new C21862n(function6, 21);
                                c28655q.m87172p0(objM87133R7);
                            }
                            m66352F(cVar, strM66347A, strM66349C, interfaceC4339a, function8, function9, (Function1) objM87133R7, c28655q, i18, 0);
                            c28655q.m87173q(false);
                        }
                        function5 = function7;
                        function3 = function6;
                    }
                    function5 = function7;
                    function3 = function6;
                } else {
                    c28655q.m87138X();
                    function5 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21852d(i13, i14, 21, viewState, function5, function3);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C22594e(15);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function6 = (Function1) objM87133R11;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C22594e(19);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function7 = (Function1) objM87133R10;
                } else {
                    function7 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                i18 = i15 & 14;
                if (i18 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z13) {
                    objM87133R3 = new a(viewState, interfaceC28601c1, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new a(viewState, interfaceC28601c1, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, viewState);
                if (viewState instanceof AbstractC20998d.a) {
                    c28655q.m87150e0(-1926088079);
                    if ((i15 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (i18 == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z25 | z26;
                    objM87133R9 = c28655q.m87133R();
                    if (z27) {
                        final int i27 = 0;
                        objM87133R9 = new Function1() { // from class: kw1.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i27) {
                                    case 0:
                                        return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                    default:
                                        return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        final int i28 = 0;
                        objM87133R9 = new Function1() { // from class: kw1.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i28) {
                                    case 0:
                                        return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                    default:
                                        return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC22862m.m66395e(null, (Function1) objM87133R9, c28655q, 0, 1);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC20998d.b) {
                        c28655q.m87150e0(-1926077325);
                        if ((i15 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (i18 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z18 | z19;
                        objM87133R8 = c28655q.m87133R();
                        if (z24) {
                            final int i29 = 1;
                            objM87133R8 = new Function1() { // from class: kw1.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i29) {
                                        case 0:
                                            return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                        default:
                                            return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            final int i210 = 1;
                            objM87133R8 = new Function1() { // from class: kw1.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i210) {
                                        case 0:
                                            return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                        default:
                                            return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R8);
                        }
                        AbstractC22863n.m66404e(null, (Function1) objM87133R8, c28655q, 0, 1);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC20998d.c) {
                            throw AbstractC11895b.m32003v(-1926088877, c28655q, false);
                        }
                        c28655q.m87150e0(-1926065881);
                        AbstractC20998d.c cVar2 = (AbstractC20998d.c) viewState;
                        String strM66347A2 = m66347A(interfaceC28601c1);
                        String strM66349C2 = m66349C(interfaceC28601c2);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z14) {
                            objM87133R4 = new C21860l(function7, 28);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C21860l(function7, 28);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                        i19 = i15 & 112;
                        if (i19 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z15) {
                            objM87133R5 = new C2883e(2, function6, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C2883e(2, function6, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Function1 function10 = (Function1) objM87133R5;
                        if (i19 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C21862n(function6, 20);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C21862n(function6, 20);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function11 = (Function1) objM87133R6;
                        if (i19 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            objM87133R7 = new C21862n(function6, 21);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C21862n(function6, 21);
                            c28655q.m87172p0(objM87133R7);
                        }
                        m66352F(cVar2, strM66347A2, strM66349C2, interfaceC4339a2, function10, function11, (Function1) objM87133R7, c28655q, i18, 0);
                        c28655q.m87173q(false);
                    }
                    function5 = function7;
                    function3 = function6;
                }
                function5 = function7;
                function3 = function6;
            } else {
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(i13, i14, 21, viewState, function5, function3);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
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
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C22594e(15);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function6 = (Function1) objM87133R11;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C22594e(19);
                        c28655q.m87172p0(objM87133R10);
                    }
                    function7 = (Function1) objM87133R10;
                } else {
                    function7 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z("");
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                i18 = i15 & 14;
                if (i18 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z13) {
                    objM87133R3 = new a(viewState, interfaceC28601c1, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new a(viewState, interfaceC28601c1, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, viewState);
                if (viewState instanceof AbstractC20998d.a) {
                    c28655q.m87150e0(-1926088079);
                    if ((i15 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (i18 == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z25 | z26;
                    objM87133R9 = c28655q.m87133R();
                    if (z27) {
                        final int i211 = 0;
                        objM87133R9 = new Function1() { // from class: kw1.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i211) {
                                    case 0:
                                        return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                    default:
                                        return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        final int i212 = 0;
                        objM87133R9 = new Function1() { // from class: kw1.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i212) {
                                    case 0:
                                        return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                    default:
                                        return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC22862m.m66395e(null, (Function1) objM87133R9, c28655q, 0, 1);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC20998d.b) {
                        c28655q.m87150e0(-1926077325);
                        if ((i15 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (i18 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z18 | z19;
                        objM87133R8 = c28655q.m87133R();
                        if (z24) {
                            final int i213 = 1;
                            objM87133R8 = new Function1() { // from class: kw1.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                        default:
                                            return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R8);
                        } else {
                            final int i214 = 1;
                            objM87133R8 = new Function1() { // from class: kw1.i
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i214) {
                                        case 0:
                                            return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                        default:
                                            return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R8);
                        }
                        AbstractC22863n.m66404e(null, (Function1) objM87133R8, c28655q, 0, 1);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC20998d.c) {
                            throw AbstractC11895b.m32003v(-1926088877, c28655q, false);
                        }
                        c28655q.m87150e0(-1926065881);
                        AbstractC20998d.c cVar3 = (AbstractC20998d.c) viewState;
                        String strM66347A3 = m66347A(interfaceC28601c1);
                        String strM66349C3 = m66349C(interfaceC28601c2);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z14) {
                            objM87133R4 = new C21860l(function7, 28);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C21860l(function7, 28);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                        i19 = i15 & 112;
                        if (i19 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z15) {
                            objM87133R5 = new C2883e(2, function6, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C2883e(2, function6, interfaceC28601c1, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        Function1 function12 = (Function1) objM87133R5;
                        if (i19 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z16) {
                            objM87133R6 = new C21862n(function6, 20);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C21862n(function6, 20);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Function1 function13 = (Function1) objM87133R6;
                        if (i19 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (z17) {
                            objM87133R7 = new C21862n(function6, 21);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C21862n(function6, 21);
                            c28655q.m87172p0(objM87133R7);
                        }
                        m66352F(cVar3, strM66347A3, strM66349C3, interfaceC4339a3, function12, function13, (Function1) objM87133R7, c28655q, i18, 0);
                        c28655q.m87173q(false);
                    }
                    function5 = function7;
                    function3 = function6;
                }
                function5 = function7;
                function3 = function6;
            } else {
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(i13, i14, 21, viewState, function5, function3);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C22594e(15);
                    c28655q.m87172p0(objM87133R11);
                }
                function6 = (Function1) objM87133R11;
            } else {
                function6 = function3;
            }
            if (i16 != 0) {
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C22594e(19);
                    c28655q.m87172p0(objM87133R10);
                }
                function7 = (Function1) objM87133R10;
            } else {
                function7 = function4;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            i18 = i15 & 14;
            if (i18 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z13) {
                objM87133R3 = new a(viewState, interfaceC28601c1, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(viewState, interfaceC28601c1, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, viewState);
            if (viewState instanceof AbstractC20998d.a) {
                c28655q.m87150e0(-1926088079);
                if ((i15 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (i18 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z25 | z26;
                objM87133R9 = c28655q.m87133R();
                if (z27) {
                    final int i215 = 0;
                    objM87133R9 = new Function1() { // from class: kw1.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i215) {
                                case 0:
                                    return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                default:
                                    return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                } else {
                    final int i216 = 0;
                    objM87133R9 = new Function1() { // from class: kw1.i
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i216) {
                                case 0:
                                    return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                default:
                                    return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC22862m.m66395e(null, (Function1) objM87133R9, c28655q, 0, 1);
                c28655q.m87173q(false);
            } else {
                if (viewState instanceof AbstractC20998d.b) {
                    c28655q.m87150e0(-1926077325);
                    if ((i15 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (i18 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z18 | z19;
                    objM87133R8 = c28655q.m87133R();
                    if (z24) {
                        final int i217 = 1;
                        objM87133R8 = new Function1() { // from class: kw1.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i217) {
                                    case 0:
                                        return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                    default:
                                        return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        final int i218 = 1;
                        objM87133R8 = new Function1() { // from class: kw1.i
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i218) {
                                    case 0:
                                        return AbstractC22859j.m66351E(function6, viewState, (CtaAction) obj);
                                    default:
                                        return AbstractC22859j.m66385u(function6, viewState, (CtaAction) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC22863n.m66404e(null, (Function1) objM87133R8, c28655q, 0, 1);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC20998d.c) {
                        throw AbstractC11895b.m32003v(-1926088877, c28655q, false);
                    }
                    c28655q.m87150e0(-1926065881);
                    AbstractC20998d.c cVar4 = (AbstractC20998d.c) viewState;
                    String strM66347A4 = m66347A(interfaceC28601c1);
                    String strM66349C4 = m66349C(interfaceC28601c2);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z14) {
                        objM87133R4 = new C21860l(function7, 28);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C21860l(function7, 28);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    i19 = i15 & 112;
                    if (i19 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z15) {
                        objM87133R5 = new C2883e(2, function6, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C2883e(2, function6, interfaceC28601c1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Function1 function14 = (Function1) objM87133R5;
                    if (i19 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z16) {
                        objM87133R6 = new C21862n(function6, 20);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C21862n(function6, 20);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Function1 function15 = (Function1) objM87133R6;
                    if (i19 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z17) {
                        objM87133R7 = new C21862n(function6, 21);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C21862n(function6, 21);
                        c28655q.m87172p0(objM87133R7);
                    }
                    m66352F(cVar4, strM66347A4, strM66349C4, interfaceC4339a4, function14, function15, (Function1) objM87133R7, c28655q, i18, 0);
                    c28655q.m87173q(false);
                }
                function5 = function7;
                function3 = function6;
            }
            function5 = function7;
            function3 = function6;
        } else {
            c28655q.m87138X();
            function5 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(i13, i14, 21, viewState, function5, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m66383s(AbstractC20997c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m66384t(AbstractC17702a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m66385u(Function1 function1, AbstractC20998d abstractC20998d, CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC20997c.b(abstractC20998d, it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m66386v(Function1 function1) {
        function1.invoke(AbstractC17702a.a.f68771a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m66387w(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C24773i optionSelected) {
        AbstractC22676k.m65750j(optionSelected, "optionSelected");
        function1.invoke(new AbstractC20997c.a(optionSelected));
        m66348B(interfaceC28601c1, optionSelected.getCtaTitle());
        String disclaimer = optionSelected.getDisclaimer();
        if (disclaimer == null) {
            disclaimer = "";
        }
        m66350D(interfaceC28601c2, disclaimer);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m66388x(Function1 function1, C24773i optionSelected) {
        AbstractC22676k.m65750j(optionSelected, "optionSelected");
        function1.invoke(new AbstractC20997c.c(optionSelected));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m66389y(Function1 function1, C24773i optionSelected) {
        AbstractC22676k.m65750j(optionSelected, "optionSelected");
        function1.invoke(new AbstractC20997c.d(optionSelected));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m66390z(AbstractC20998d abstractC20998d, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m66382r(abstractC20998d, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
