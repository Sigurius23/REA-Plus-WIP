package zk2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b01.C2194o;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m81.AbstractC25230e;
import m81.C25231f;
import m81.C25232g;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import p409q0.C29674b;
import p409q0.InterfaceC29694r;
import p505ts.AbstractC34132o;
import p579wc.C37082e1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v71.C35766g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zk2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aa\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lzk2/f;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onTagSelected", "liveBottomContent", "content", "f", "(Lzk2/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40844e {

    /* JADX INFO: renamed from: zk2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.view.component.SwipeableTagGroupKt$SwipeableTagGroup$2$1", m100430f = "SwipeableTagGroup.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176062w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29701y f176063x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C40846g> f176064y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f176065z;

        /* JADX INFO: renamed from: zk2.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42760a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ List<C40846g> f176066w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f176067x;

            public C42760a(List<C40846g> list, Function1 function1) {
                this.f176066w = list;
                this.f176067x = function1;
            }

            /* JADX INFO: renamed from: b */
            public final Object m132369b(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C40846g c40846g = (C40846g) AbstractC25265s.m74102I0(i13, this.f176066w);
                if (c40846g != null) {
                    this.f176067x.invoke(c40846g.getId());
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m132369b(((Number) obj).intValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC29701y abstractC29701y, List<C40846g> list, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176063x = abstractC29701y;
            this.f176064y = list;
            this.f176065z = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final int m132368h(AbstractC29701y abstractC29701y) {
            return abstractC29701y.m91162k();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f176063x, this.f176064y, this.f176065z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176062w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C40843d(this.f176063x, 0));
                C42760a c42760a = new C42760a(this.f176064y, this.f176065z);
                this.f176062w = 1;
                if (c13084s1M87240H.collect(c42760a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zk2.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.view.component.SwipeableTagGroupKt$SwipeableTagGroup$3$2$1$1", m100430f = "SwipeableTagGroup.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176068w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29701y f176069x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f176070y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC29701y abstractC29701y, int i13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176069x = abstractC29701y;
            this.f176070y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f176069x, this.f176070y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176068w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC29701y abstractC29701y = this.f176069x;
                int i14 = this.f176070y;
                this.f176068w = 1;
                if (AbstractC29701y.m91155g(abstractC29701y, i14, null, this, 6) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d6 A[LOOP:1: B:105:0x01d0->B:107:0x01d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x022c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0267  */
    /* JADX WARN: Code duplicated, block: B:118:0x0293  */
    /* JADX WARN: Code duplicated, block: B:119:0x0297  */
    /* JADX WARN: Code duplicated, block: B:122:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:127:0x031c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0321  */
    /* JADX WARN: Code duplicated, block: B:130:0x0324  */
    /* JADX WARN: Code duplicated, block: B:131:0x0332  */
    /* JADX WARN: Code duplicated, block: B:133:0x0364  */
    /* JADX WARN: Code duplicated, block: B:134:0x0368  */
    /* JADX WARN: Code duplicated, block: B:137:0x0375  */
    /* JADX WARN: Code duplicated, block: B:139:0x0383  */
    /* JADX WARN: Code duplicated, block: B:142:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00ef A[EDGE_INSN: B:148:0x00ef->B:77:0x00ef BREAK  A[LOOP:0: B:70:0x00cf->B:75:0x00ea], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea A[LOOP:0: B:70:0x00cf->B:75:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0116  */
    /* JADX WARN: Code duplicated, block: B:89:0x012f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0131  */
    /* JADX WARN: Code duplicated, block: B:93:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x013c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0191  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public static final void m132361f(C40845f state, Modifier modifier, Function1 function1, Function3 function3, Function3 content, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        int i17;
        int i18;
        boolean z4;
        Modifier modifier3;
        Function1 function4;
        Function3 function5;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function6;
        Function3 function3M132355c;
        List<C40846g> listM132372c;
        Iterator<C40846g> it;
        int i19;
        int i24;
        boolean zM87157i;
        Object objM87133R;
        C29674b c29674bM91150b;
        Object objM87133R2;
        InterfaceC2994c0 interfaceC2994c0;
        boolean z13;
        boolean z14;
        Object objM87133R3;
        C2886a c2886a;
        int i25;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ArrayList arrayList;
        boolean zM87157i2;
        Object objM87133R4;
        Function3 function7;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C0209i c0209i5;
        C40846g c40846g;
        String strM132373a;
        int iHashCode3;
        Function3 function8;
        boolean z15;
        Object objM87133R5;
        int i26;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1303322558);
        int i27 = (i13 & 6) == 0 ? (c28655q.m87157i(state) ? 4 : 2) | i13 : i13;
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i27 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i27 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i27 |= i18;
                    }
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(content)) {
                            i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i26 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i27 |= i26;
                    }
                    if ((i27 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i27 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier2 = c2314t;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i15 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C40842c(0);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function6 = (Function1) objM87133R5;
                        } else {
                            function6 = function2;
                        }
                        if (i17 != 0) {
                            function3M132355c = C40841b.f176056a.m132355c();
                        } else {
                            function3M132355c = function3;
                        }
                        listM132372c = state.m132372c();
                        it = listM132372c.iterator();
                        i19 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i19 = -1;
                                break;
                            } else if (AbstractC22676k.m65745e(it.next().getId(), state.getSelectedTagId())) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                        if (i19 < 0) {
                            i24 = 0;
                        } else {
                            i24 = i19;
                        }
                        zM87157i = c28655q.m87157i(listM132372c);
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C40843d(listM132372c, 1);
                            c28655q.m87172p0(objM87133R);
                        }
                        c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, i24, 0, c28655q, 2);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                        boolean zM87153g = c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(listM132372c);
                        if ((i27 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | zM87153g;
                        objM87133R3 = c28655q.m87133R();
                        if (z14 || objM87133R3 == c28676v0) {
                            objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c29674bM91150b);
                        i25 = i27;
                        c2886a = new C2886a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4().getStyle(), null, 2, null);
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier2);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                        Function1 function9 = function6;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
                        List<C40846g> list = listM132372c;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                        for (C40846g c40846g2 : list) {
                            arrayList.add(new C25232g(c40846g2.getId(), null, c40846g2.getLabel(), c2886a));
                        }
                        int iM91162k = c29674bM91150b.m91162k();
                        long jMo134584toComposableColorWaAFU9c = state.getStyle().getSelected().getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        C25231f c25231fM78333a = state.getStyle().getSelected();
                        C25231f c25231fM78335c = state.getStyle().getUnselected();
                        zM87157i2 = c28655q.m87157i(listM132372c) | c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(interfaceC2994c0);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                            c28655q.m87172p0(objM87133R4);
                        }
                        int i29 = C25231f.f99095g;
                        function7 = function3M132355c;
                        AbstractC25230e.m73956l(arrayList, iM91162k, jMo134584toComposableColorWaAFU9c, null, c25231fM78333a, c25231fM78335c, (Function1) objM87133R4, c28655q, (i29 << 15) | (i29 << 12), 8);
                        AbstractC11266d.m30469w(2, 8, c2314t, c28655q);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM124374d = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM124374d);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                        c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        c0209i4 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                        }
                        c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                        Modifier modifier4 = modifier2;
                        AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1797780223, c28655q, new C2194o(content, listM132372c)), c28655q, 48, 24576, 16380);
                        c28655q = c28655q;
                        c40846g = (C40846g) AbstractC25265s.m74102I0(c29674bM91150b.m91162k(), listM132372c);
                        if (c40846g != null) {
                            strM132373a = c40846g.getId();
                        } else {
                            strM132373a = null;
                        }
                        if (strM132373a == null) {
                            c28655q.m87150e0(2141023973);
                            c28655q.m87173q(false);
                            function8 = function7;
                            z15 = true;
                        } else {
                            c28655q.m87150e0(2141023974);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H));
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j2);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                            function8 = function7;
                            function8.invoke(strM132373a, c28655q, Integer.valueOf((i25 >> 6) & 112));
                            z15 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z15);
                        c28655q.m87173q(z15);
                        function4 = function9;
                        function5 = function8;
                        modifier3 = modifier4;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        function4 = function2;
                        function5 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C35766g(state, modifier3, function4, function5, content, i13, i14);
                    }
                }
                i27 |= 3072;
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(content)) {
                        i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i26 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i27 |= i26;
                }
                if ((i27 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i27 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C40842c(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    } else {
                        function6 = function2;
                    }
                    if (i17 != 0) {
                        function3M132355c = C40841b.f176056a.m132355c();
                    } else {
                        function3M132355c = function3;
                    }
                    listM132372c = state.m132372c();
                    it = listM132372c.iterator();
                    i19 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (AbstractC22676k.m65745e(it.next().getId(), state.getSelectedTagId())) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 < 0) {
                        i24 = 0;
                    } else {
                        i24 = i19;
                    }
                    zM87157i = c28655q.m87157i(listM132372c);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C40843d(listM132372c, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C40843d(listM132372c, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, i24, 0, c28655q, 2);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    boolean zM87153g2 = c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(listM132372c);
                    if ((i27 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | zM87153g2;
                    objM87133R3 = c28655q.m87133R();
                    if (z14) {
                        objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c29674bM91150b);
                    i25 = i27;
                    c2886a = new C2886a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4().getStyle(), null, 2, null);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier2);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    Function1 function10 = function6;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    List<C40846g> list2 = listM132372c;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new C25232g(c40846g2.getId(), null, c40846g2.getLabel(), c2886a));
                    }
                    int iM91162k2 = c29674bM91150b.m91162k();
                    long jMo134584toComposableColorWaAFU9c2 = state.getStyle().getSelected().getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    C25231f c25231fM78333a2 = state.getStyle().getSelected();
                    C25231f c25231fM78335c2 = state.getStyle().getUnselected();
                    zM87157i2 = c28655q.m87157i(listM132372c) | c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(interfaceC2994c0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i210 = C25231f.f99095g;
                    function7 = function3M132355c;
                    AbstractC25230e.m73956l(arrayList, iM91162k2, jMo134584toComposableColorWaAFU9c2, null, c25231fM78333a2, c25231fM78335c2, (Function1) objM87133R4, c28655q, (i210 << 15) | (i210 << 12), 8);
                    AbstractC11266d.m30469w(2, 8, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM124374d2 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM124374d2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                    Modifier modifier5 = modifier2;
                    AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1797780223, c28655q, new C2194o(content, listM132372c)), c28655q, 48, 24576, 16380);
                    c28655q = c28655q;
                    c40846g = (C40846g) AbstractC25265s.m74102I0(c29674bM91150b.m91162k(), listM132372c);
                    if (c40846g != null) {
                        strM132373a = c40846g.getId();
                    } else {
                        strM132373a = null;
                    }
                    if (strM132373a == null) {
                        c28655q.m87150e0(2141023973);
                        c28655q.m87173q(false);
                        function8 = function7;
                        z15 = true;
                    } else {
                        c28655q.m87150e0(2141023974);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H));
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
                        function8 = function7;
                        function8.invoke(strM132373a, c28655q, Integer.valueOf((i25 >> 6) & 112));
                        z15 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    c28655q.m87173q(z15);
                    function4 = function10;
                    function5 = function8;
                    modifier3 = modifier5;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function4 = function2;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g(state, modifier3, function4, function5, content, i13, i14);
                }
            }
            i27 |= 384;
            function2 = function1;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i27 |= i18;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(content)) {
                        i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i26 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i27 |= i26;
                }
                if ((i27 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i27 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C40842c(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    } else {
                        function6 = function2;
                    }
                    if (i17 != 0) {
                        function3M132355c = C40841b.f176056a.m132355c();
                    } else {
                        function3M132355c = function3;
                    }
                    listM132372c = state.m132372c();
                    it = listM132372c.iterator();
                    i19 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (AbstractC22676k.m65745e(it.next().getId(), state.getSelectedTagId())) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 < 0) {
                        i24 = 0;
                    } else {
                        i24 = i19;
                    }
                    zM87157i = c28655q.m87157i(listM132372c);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C40843d(listM132372c, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C40843d(listM132372c, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, i24, 0, c28655q, 2);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    boolean zM87153g3 = c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(listM132372c);
                    if ((i27 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | zM87153g3;
                    objM87133R3 = c28655q.m87133R();
                    if (z14) {
                        objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c29674bM91150b);
                    i25 = i27;
                    c2886a = new C2886a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4().getStyle(), null, 2, null);
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, modifier2);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    Function1 function11 = function6;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    List<C40846g> list3 = listM132372c;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new C25232g(c40846g2.getId(), null, c40846g2.getLabel(), c2886a));
                    }
                    int iM91162k3 = c29674bM91150b.m91162k();
                    long jMo134584toComposableColorWaAFU9c3 = state.getStyle().getSelected().getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    C25231f c25231fM78333a3 = state.getStyle().getSelected();
                    C25231f c25231fM78335c3 = state.getStyle().getUnselected();
                    zM87157i2 = c28655q.m87157i(listM132372c) | c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(interfaceC2994c0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i211 = C25231f.f99095g;
                    function7 = function3M132355c;
                    AbstractC25230e.m73956l(arrayList, iM91162k3, jMo134584toComposableColorWaAFU9c3, null, c25231fM78333a3, c25231fM78335c3, (Function1) objM87133R4, c28655q, (i211 << 15) | (i211 << 12), 8);
                    AbstractC11266d.m30469w(2, 8, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM124374d3 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM124374d3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                    c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m8);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N8);
                    Modifier modifier6 = modifier2;
                    AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1797780223, c28655q, new C2194o(content, listM132372c)), c28655q, 48, 24576, 16380);
                    c28655q = c28655q;
                    c40846g = (C40846g) AbstractC25265s.m74102I0(c29674bM91150b.m91162k(), listM132372c);
                    if (c40846g != null) {
                        strM132373a = c40846g.getId();
                    } else {
                        strM132373a = null;
                    }
                    if (strM132373a == null) {
                        c28655q.m87150e0(2141023973);
                        c28655q.m87173q(false);
                        function8 = function7;
                        z15 = true;
                    } else {
                        c28655q.m87150e0(2141023974);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H));
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m9);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N9);
                        function8 = function7;
                        function8.invoke(strM132373a, c28655q, Integer.valueOf((i25 >> 6) & 112));
                        z15 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    c28655q.m87173q(z15);
                    function4 = function11;
                    function5 = function8;
                    modifier3 = modifier6;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function4 = function2;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g(state, modifier3, function4, function5, content, i13, i14);
                }
            }
            i27 |= 3072;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i27 |= i26;
            }
            if ((i27 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i27 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40842c(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                } else {
                    function6 = function2;
                }
                if (i17 != 0) {
                    function3M132355c = C40841b.f176056a.m132355c();
                } else {
                    function3M132355c = function3;
                }
                listM132372c = state.m132372c();
                it = listM132372c.iterator();
                i19 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i19 = -1;
                        break;
                    } else {
                        if (AbstractC22676k.m65745e(it.next().getId(), state.getSelectedTagId())) {
                            break;
                            break;
                        }
                        i19++;
                    }
                }
                if (i19 < 0) {
                    i24 = 0;
                } else {
                    i24 = i19;
                }
                zM87157i = c28655q.m87157i(listM132372c);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C40843d(listM132372c, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C40843d(listM132372c, 1);
                    c28655q.m87172p0(objM87133R);
                }
                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, i24, 0, c28655q, 2);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                boolean zM87153g4 = c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(listM132372c);
                if ((i27 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87153g4;
                objM87133R3 = c28655q.m87133R();
                if (z14) {
                    objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c29674bM91150b);
                i25 = i27;
                c2886a = new C2886a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4().getStyle(), null, 2, null);
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, modifier2);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                Function1 function12 = function6;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                List<C40846g> list4 = listM132372c;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                while (r0.hasNext()) {
                    arrayList.add(new C25232g(c40846g2.getId(), null, c40846g2.getLabel(), c2886a));
                }
                int iM91162k4 = c29674bM91150b.m91162k();
                long jMo134584toComposableColorWaAFU9c4 = state.getStyle().getSelected().getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                C25231f c25231fM78333a4 = state.getStyle().getSelected();
                C25231f c25231fM78335c4 = state.getStyle().getUnselected();
                zM87157i2 = c28655q.m87157i(listM132372c) | c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(interfaceC2994c0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                    c28655q.m87172p0(objM87133R4);
                }
                int i212 = C25231f.f99095g;
                function7 = function3M132355c;
                AbstractC25230e.m73956l(arrayList, iM91162k4, jMo134584toComposableColorWaAFU9c4, null, c25231fM78333a4, c25231fM78335c4, (Function1) objM87133R4, c28655q, (i212 << 15) | (i212 << 12), 8);
                AbstractC11266d.m30469w(2, 8, c2314t, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d4 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM124374d4);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
                c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m11);
                c0209i4 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N11);
                Modifier modifier7 = modifier2;
                AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1797780223, c28655q, new C2194o(content, listM132372c)), c28655q, 48, 24576, 16380);
                c28655q = c28655q;
                c40846g = (C40846g) AbstractC25265s.m74102I0(c29674bM91150b.m91162k(), listM132372c);
                if (c40846g != null) {
                    strM132373a = c40846g.getId();
                } else {
                    strM132373a = null;
                }
                if (strM132373a == null) {
                    c28655q.m87150e0(2141023973);
                    c28655q.m87173q(false);
                    function8 = function7;
                    z15 = true;
                } else {
                    c28655q.m87150e0(2141023974);
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H));
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N12);
                    function8 = function7;
                    function8.invoke(strM132373a, c28655q, Integer.valueOf((i25 >> 6) & 112));
                    z15 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                c28655q.m87173q(z15);
                function4 = function12;
                function5 = function8;
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function4 = function2;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g(state, modifier3, function4, function5, content, i13, i14);
            }
        }
        i27 |= 48;
        modifier2 = modifier;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i27 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i27 |= i18;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(content)) {
                        i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i26 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i27 |= i26;
                }
                if ((i27 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i27 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C40842c(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    } else {
                        function6 = function2;
                    }
                    if (i17 != 0) {
                        function3M132355c = C40841b.f176056a.m132355c();
                    } else {
                        function3M132355c = function3;
                    }
                    listM132372c = state.m132372c();
                    it = listM132372c.iterator();
                    i19 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i19 = -1;
                            break;
                        } else {
                            if (AbstractC22676k.m65745e(it.next().getId(), state.getSelectedTagId())) {
                                break;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (i19 < 0) {
                        i24 = 0;
                    } else {
                        i24 = i19;
                    }
                    zM87157i = c28655q.m87157i(listM132372c);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C40843d(listM132372c, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C40843d(listM132372c, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, i24, 0, c28655q, 2);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    boolean zM87153g5 = c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(listM132372c);
                    if ((i27 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | zM87153g5;
                    objM87133R3 = c28655q.m87133R();
                    if (z14) {
                        objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c29674bM91150b);
                    i25 = i27;
                    c2886a = new C2886a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4().getStyle(), null, 2, null);
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, modifier2);
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    Function1 function13 = function6;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                    List<C40846g> list5 = listM132372c;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new C25232g(c40846g2.getId(), null, c40846g2.getLabel(), c2886a));
                    }
                    int iM91162k5 = c29674bM91150b.m91162k();
                    long jMo134584toComposableColorWaAFU9c5 = state.getStyle().getSelected().getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    C25231f c25231fM78333a5 = state.getStyle().getSelected();
                    C25231f c25231fM78335c5 = state.getStyle().getUnselected();
                    zM87157i2 = c28655q.m87157i(listM132372c) | c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(interfaceC2994c0);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i213 = C25231f.f99095g;
                    function7 = function3M132355c;
                    AbstractC25230e.m73956l(arrayList, iM91162k5, jMo134584toComposableColorWaAFU9c5, null, c25231fM78333a5, c25231fM78335c5, (Function1) objM87133R4, c28655q, (i213 << 15) | (i213 << 12), 8);
                    AbstractC11266d.m30469w(2, 8, c2314t, c28655q);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM124374d5 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM124374d5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d5);
                    c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m14);
                    c0209i4 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N14);
                    Modifier modifier8 = modifier2;
                    AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1797780223, c28655q, new C2194o(content, listM132372c)), c28655q, 48, 24576, 16380);
                    c28655q = c28655q;
                    c40846g = (C40846g) AbstractC25265s.m74102I0(c29674bM91150b.m91162k(), listM132372c);
                    if (c40846g != null) {
                        strM132373a = c40846g.getId();
                    } else {
                        strM132373a = null;
                    }
                    if (strM132373a == null) {
                        c28655q.m87150e0(2141023973);
                        c28655q.m87173q(false);
                        function8 = function7;
                        z15 = true;
                    } else {
                        c28655q.m87150e0(2141023974);
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H));
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m15);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N15);
                        function8 = function7;
                        function8.invoke(strM132373a, c28655q, Integer.valueOf((i25 >> 6) & 112));
                        z15 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    c28655q.m87173q(z15);
                    function4 = function13;
                    function5 = function8;
                    modifier3 = modifier8;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function4 = function2;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35766g(state, modifier3, function4, function5, content, i13, i14);
                }
            }
            i27 |= 3072;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i27 |= i26;
            }
            if ((i27 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i27 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40842c(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                } else {
                    function6 = function2;
                }
                if (i17 != 0) {
                    function3M132355c = C40841b.f176056a.m132355c();
                } else {
                    function3M132355c = function3;
                }
                listM132372c = state.m132372c();
                it = listM132372c.iterator();
                i19 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i19 = -1;
                        break;
                    } else {
                        if (AbstractC22676k.m65745e(it.next().getId(), state.getSelectedTagId())) {
                            break;
                            break;
                        }
                        i19++;
                    }
                }
                if (i19 < 0) {
                    i24 = 0;
                } else {
                    i24 = i19;
                }
                zM87157i = c28655q.m87157i(listM132372c);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C40843d(listM132372c, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C40843d(listM132372c, 1);
                    c28655q.m87172p0(objM87133R);
                }
                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, i24, 0, c28655q, 2);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                boolean zM87153g6 = c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(listM132372c);
                if ((i27 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87153g6;
                objM87133R3 = c28655q.m87133R();
                if (z14) {
                    objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c29674bM91150b);
                i25 = i27;
                c2886a = new C2886a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4().getStyle(), null, 2, null);
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, modifier2);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                Function1 function14 = function6;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                List<C40846g> list6 = listM132372c;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list6, 10));
                while (r0.hasNext()) {
                    arrayList.add(new C25232g(c40846g2.getId(), null, c40846g2.getLabel(), c2886a));
                }
                int iM91162k6 = c29674bM91150b.m91162k();
                long jMo134584toComposableColorWaAFU9c6 = state.getStyle().getSelected().getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                C25231f c25231fM78333a6 = state.getStyle().getSelected();
                C25231f c25231fM78335c6 = state.getStyle().getUnselected();
                zM87157i2 = c28655q.m87157i(listM132372c) | c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(interfaceC2994c0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                    c28655q.m87172p0(objM87133R4);
                }
                int i214 = C25231f.f99095g;
                function7 = function3M132355c;
                AbstractC25230e.m73956l(arrayList, iM91162k6, jMo134584toComposableColorWaAFU9c6, null, c25231fM78333a6, c25231fM78335c6, (Function1) objM87133R4, c28655q, (i214 << 15) | (i214 << 12), 8);
                AbstractC11266d.m30469w(2, 8, c2314t, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d6 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM124374d6);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d6);
                c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m17);
                c0209i4 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N17);
                Modifier modifier9 = modifier2;
                AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1797780223, c28655q, new C2194o(content, listM132372c)), c28655q, 48, 24576, 16380);
                c28655q = c28655q;
                c40846g = (C40846g) AbstractC25265s.m74102I0(c29674bM91150b.m91162k(), listM132372c);
                if (c40846g != null) {
                    strM132373a = c40846g.getId();
                } else {
                    strM132373a = null;
                }
                if (strM132373a == null) {
                    c28655q.m87150e0(2141023973);
                    c28655q.m87173q(false);
                    function8 = function7;
                    z15 = true;
                } else {
                    c28655q.m87150e0(2141023974);
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H));
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m18);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N18);
                    function8 = function7;
                    function8.invoke(strM132373a, c28655q, Integer.valueOf((i25 >> 6) & 112));
                    z15 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                c28655q.m87173q(z15);
                function4 = function14;
                function5 = function8;
                modifier3 = modifier9;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function4 = function2;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g(state, modifier3, function4, function5, content, i13, i14);
            }
        }
        i27 |= 384;
        function2 = function1;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function3)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i27 |= i18;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i27 |= i26;
            }
            if ((i27 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i27 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C40842c(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                } else {
                    function6 = function2;
                }
                if (i17 != 0) {
                    function3M132355c = C40841b.f176056a.m132355c();
                } else {
                    function3M132355c = function3;
                }
                listM132372c = state.m132372c();
                it = listM132372c.iterator();
                i19 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i19 = -1;
                        break;
                    } else {
                        if (AbstractC22676k.m65745e(it.next().getId(), state.getSelectedTagId())) {
                            break;
                            break;
                        }
                        i19++;
                    }
                }
                if (i19 < 0) {
                    i24 = 0;
                } else {
                    i24 = i19;
                }
                zM87157i = c28655q.m87157i(listM132372c);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C40843d(listM132372c, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C40843d(listM132372c, 1);
                    c28655q.m87172p0(objM87133R);
                }
                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, i24, 0, c28655q, 2);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                boolean zM87153g7 = c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(listM132372c);
                if ((i27 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87153g7;
                objM87133R3 = c28655q.m87133R();
                if (z14) {
                    objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c29674bM91150b);
                i25 = i27;
                c2886a = new C2886a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4().getStyle(), null, 2, null);
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, modifier2);
                C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                Function1 function15 = function6;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3407d7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a13);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m19);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N19);
                List<C40846g> list7 = listM132372c;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list7, 10));
                while (r0.hasNext()) {
                    arrayList.add(new C25232g(c40846g2.getId(), null, c40846g2.getLabel(), c2886a));
                }
                int iM91162k7 = c29674bM91150b.m91162k();
                long jMo134584toComposableColorWaAFU9c7 = state.getStyle().getSelected().getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                C25231f c25231fM78333a7 = state.getStyle().getSelected();
                C25231f c25231fM78335c7 = state.getStyle().getUnselected();
                zM87157i2 = c28655q.m87157i(listM132372c) | c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(interfaceC2994c0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                    c28655q.m87172p0(objM87133R4);
                }
                int i215 = C25231f.f99095g;
                function7 = function3M132355c;
                AbstractC25230e.m73956l(arrayList, iM91162k7, jMo134584toComposableColorWaAFU9c7, null, c25231fM78333a7, c25231fM78335c7, (Function1) objM87133R4, c28655q, (i215 << 15) | (i215 << 12), 8);
                AbstractC11266d.m30469w(2, 8, c2314t, c28655q);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM124374d7 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM124374d7);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d7);
                c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m110);
                c0209i4 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N110);
                Modifier modifier10 = modifier2;
                AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1797780223, c28655q, new C2194o(content, listM132372c)), c28655q, 48, 24576, 16380);
                c28655q = c28655q;
                c40846g = (C40846g) AbstractC25265s.m74102I0(c29674bM91150b.m91162k(), listM132372c);
                if (c40846g != null) {
                    strM132373a = c40846g.getId();
                } else {
                    strM132373a = null;
                }
                if (strM132373a == null) {
                    c28655q.m87150e0(2141023973);
                    c28655q.m87173q(false);
                    function8 = function7;
                    z15 = true;
                } else {
                    c28655q.m87150e0(2141023974);
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H));
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m111);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N111);
                    function8 = function7;
                    function8.invoke(strM132373a, c28655q, Integer.valueOf((i25 >> 6) & 112));
                    z15 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                c28655q.m87173q(z15);
                function4 = function15;
                function5 = function8;
                modifier3 = modifier10;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function4 = function2;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35766g(state, modifier3, function4, function5, content, i13, i14);
            }
        }
        i27 |= 3072;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(content)) {
                i26 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i26 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i27 |= i26;
        }
        if ((i27 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i27 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i28 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i15 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C40842c(0);
                    c28655q.m87172p0(objM87133R5);
                }
                function6 = (Function1) objM87133R5;
            } else {
                function6 = function2;
            }
            if (i17 != 0) {
                function3M132355c = C40841b.f176056a.m132355c();
            } else {
                function3M132355c = function3;
            }
            listM132372c = state.m132372c();
            it = listM132372c.iterator();
            i19 = 0;
            while (true) {
                if (it.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (AbstractC22676k.m65745e(it.next().getId(), state.getSelectedTagId())) {
                        break;
                        break;
                    }
                    i19++;
                }
            }
            if (i19 < 0) {
                i24 = 0;
            } else {
                i24 = i19;
            }
            zM87157i = c28655q.m87157i(listM132372c);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C40843d(listM132372c, 1);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C40843d(listM132372c, 1);
                c28655q.m87172p0(objM87133R);
            }
            c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, i24, 0, c28655q, 2);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
            boolean zM87153g8 = c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(listM132372c);
            if ((i27 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zM87153g8;
            objM87133R3 = c28655q.m87133R();
            if (z14) {
                objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(c29674bM91150b, listM132372c, function6, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c29674bM91150b);
            i25 = i27;
            c2886a = new C2886a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4().getStyle(), null, 2, null);
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, modifier2);
            C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            Function1 function16 = function6;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3407d8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a15);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N112);
            List<C40846g> list8 = listM132372c;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list8, 10));
            while (r0.hasNext()) {
                arrayList.add(new C25232g(c40846g2.getId(), null, c40846g2.getLabel(), c2886a));
            }
            int iM91162k8 = c29674bM91150b.m91162k();
            long jMo134584toComposableColorWaAFU9c8 = state.getStyle().getSelected().getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            C25231f c25231fM78333a8 = state.getStyle().getSelected();
            C25231f c25231fM78335c8 = state.getStyle().getUnselected();
            zM87157i2 = c28655q.m87157i(listM132372c) | c28655q.m87153g(c29674bM91150b) | c28655q.m87157i(interfaceC2994c0);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C37082e1(listM132372c, c29674bM91150b, interfaceC2994c0, 25);
                c28655q.m87172p0(objM87133R4);
            }
            int i216 = C25231f.f99095g;
            function7 = function3M132355c;
            AbstractC25230e.m73956l(arrayList, iM91162k8, jMo134584toComposableColorWaAFU9c8, null, c25231fM78333a8, c25231fM78335c8, (Function1) objM87133R4, c28655q, (i216 << 15) | (i216 << 12), 8);
            AbstractC11266d.m30469w(2, 8, c2314t, c28655q);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM124374d8 = AbstractC38963t7.m124374d(1.0f, 1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM124374d8);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d8);
            c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m113);
            c0209i4 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N113);
            Modifier modifier11 = modifier2;
            AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1797780223, c28655q, new C2194o(content, listM132372c)), c28655q, 48, 24576, 16380);
            c28655q = c28655q;
            c40846g = (C40846g) AbstractC25265s.m74102I0(c29674bM91150b.m91162k(), listM132372c);
            if (c40846g != null) {
                strM132373a = c40846g.getId();
            } else {
                strM132373a = null;
            }
            if (strM132373a == null) {
                c28655q.m87150e0(2141023973);
                c28655q.m87173q(false);
                function8 = function7;
                z15 = true;
            } else {
                c28655q.m87150e0(2141023974);
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H));
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N114);
                function8 = function7;
                function8.invoke(strM132373a, c28655q, Integer.valueOf((i25 >> 6) & 112));
                z15 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
            c28655q.m87173q(z15);
            function4 = function16;
            function5 = function8;
            modifier3 = modifier11;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function4 = function2;
            function5 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35766g(state, modifier3, function4, function5, content, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132362g(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final int m132363h(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m132364i(List list, AbstractC29701y abstractC29701y, InterfaceC2994c0 interfaceC2994c0, String tappedId) {
        AbstractC22676k.m65750j(tappedId, "tappedId");
        Iterator it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(((C40846g) it.next()).getId(), tappedId)) {
                break;
            }
            i13++;
        }
        if (i13 >= 0 && i13 != abstractC29701y.m91162k()) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(abstractC29701y, i13, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m132365j(Function3 function3, List list, InterfaceC29694r HorizontalPager, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        function3.invoke(((C40846g) list.get(i13)).getId(), composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m132366k(C40845f c40845f, Modifier modifier, Function1 function1, Function3 function3, Function3 function4, int i13, int i14, Composer composer, int i15) {
        m132361f(c40845f, modifier, function1, function3, function4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
