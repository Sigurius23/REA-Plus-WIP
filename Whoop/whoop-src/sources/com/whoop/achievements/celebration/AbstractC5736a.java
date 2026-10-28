package com.whoop.achievements.celebration;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import bg0.C3226h;
import c93.InterfaceC4351m;
import hb3.AbstractC17104a0;
import i51.C18118o;
import ih1.C18522f;
import jp1.C21851c;
import l60.C23374a;
import l83.C23454a0;
import m01.AbstractC24876d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: com.whoop.achievements.celebration.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/achievements/celebration/d;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/achievements/celebration/b;", "Ll83/a0;", "onEvent", "", "skipAnimations", "e", "(Lcom/whoop/achievements/celebration/d;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "isVisible", "achievements_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC5736a {

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.AchievementCelebrationContentKt$AchievementCelebrationContent$2$1", m100430f = "AchievementCelebrationContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22677w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f22678x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC5739d f22679y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f22680z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, AbstractC5739d abstractC5739d, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22678x = z4;
            this.f22679y = abstractC5739d;
            this.f22680z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f22678x, this.f22679y, this.f22680z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22677w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f22678x) {
                AbstractC5736a.m17022h(this.f22680z, this.f22679y instanceof AbstractC5739d.c);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.AchievementCelebrationContentKt$AchievementCelebrationContent$3$1", m100430f = "AchievementCelebrationContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22681w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f22682x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC5739d f22683y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, AbstractC5739d abstractC5739d, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22682x = function1;
            this.f22683y = abstractC5739d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f22682x, this.f22683y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22681w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f22682x.invoke(new InterfaceC5737b.a.C41365a(((AbstractC5739d.c) this.f22683y).getCelebrationOverlay()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.AchievementCelebrationContentKt$AchievementCelebrationContent$5$1", m100430f = "AchievementCelebrationContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22684w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f22685x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22685x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f22685x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22684w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f22685x.invoke(InterfaceC5737b.c.b.f22691a);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x012f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0144  */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x015f  */
    /* JADX WARN: Code duplicated, block: B:96:0x016a  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m17019e(AbstractC5739d viewState, Function1 function1, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        Function1 function3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z16;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z17;
        int i18;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        boolean z24;
        Object objM87133R3;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-357758660);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C23374a(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i18 = i15 & 14;
                    if (i18 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R2 = c28655q.m87133R();
                    if (z19 || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(z16, viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewState);
                    if (viewState instanceof AbstractC5739d.b) {
                        c28655q.m87150e0(2121117443);
                        c28655q.m87173q(false);
                        function3 = function4;
                        z15 = z16;
                    } else if (viewState instanceof AbstractC5739d.c) {
                        c28655q.m87150e0(2121225230);
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
                        objM87133R4 = c28655q.m87133R();
                        if (z27 || objM87133R4 == c28676v0) {
                            objM87133R4 = new b(function4, viewState, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, viewState);
                        z15 = z16;
                        function3 = function4;
                        AbstractC1090b.m3351f(m17021g(interfaceC28601c1), null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(700, 0, AbstractC11333b0.f36310a, 2), 2), null, null, AbstractC37817c.m121344e(404067445, c28655q, new C18522f(12, viewState, function4)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                        c28655q.m87173q(false);
                    } else {
                        function3 = function4;
                        z15 = z16;
                        if (viewState instanceof AbstractC5739d.a) {
                            throw AbstractC11895b.m32003v(-208671901, c28655q, false);
                        }
                        c28655q.m87150e0(2122843926);
                        if ((i15 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z24 || objM87133R3 == c28676v0) {
                            objM87133R3 = new c(function3, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                        c28655q.m87173q(false);
                    }
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3226h(viewState, function3, z15, i13, i14, 17);
                }
            }
            i15 |= 384;
            z13 = z4;
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C23374a(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i18 = i15 & 14;
                if (i18 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    objM87133R2 = new a(z16, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(z16, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewState);
                if (viewState instanceof AbstractC5739d.b) {
                    c28655q.m87150e0(2121117443);
                    c28655q.m87173q(false);
                    function3 = function4;
                    z15 = z16;
                } else if (viewState instanceof AbstractC5739d.c) {
                    c28655q.m87150e0(2121225230);
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
                    objM87133R4 = c28655q.m87133R();
                    if (z27) {
                        objM87133R4 = new b(function4, viewState, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new b(function4, viewState, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, viewState);
                    z15 = z16;
                    function3 = function4;
                    AbstractC1090b.m3351f(m17021g(interfaceC28601c1), null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(700, 0, AbstractC11333b0.f36310a, 2), 2), null, null, AbstractC37817c.m121344e(404067445, c28655q, new C18522f(12, viewState, function4)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                    c28655q.m87173q(false);
                } else {
                    function3 = function4;
                    z15 = z16;
                    if (viewState instanceof AbstractC5739d.a) {
                        throw AbstractC11895b.m32003v(-208671901, c28655q, false);
                    }
                    c28655q.m87150e0(2122843926);
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z24) {
                        objM87133R3 = new c(function3, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new c(function3, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
                function3 = function2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(viewState, function3, z15, i13, i14, 17);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C23374a(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95647w(z16, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i18 = i15 & 14;
                if (i18 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    objM87133R2 = new a(z16, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(z16, viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewState);
                if (viewState instanceof AbstractC5739d.b) {
                    c28655q.m87150e0(2121117443);
                    c28655q.m87173q(false);
                    function3 = function4;
                    z15 = z16;
                } else if (viewState instanceof AbstractC5739d.c) {
                    c28655q.m87150e0(2121225230);
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
                    objM87133R4 = c28655q.m87133R();
                    if (z27) {
                        objM87133R4 = new b(function4, viewState, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new b(function4, viewState, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, viewState);
                    z15 = z16;
                    function3 = function4;
                    AbstractC1090b.m3351f(m17021g(interfaceC28601c1), null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(700, 0, AbstractC11333b0.f36310a, 2), 2), null, null, AbstractC37817c.m121344e(404067445, c28655q, new C18522f(12, viewState, function4)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                    c28655q.m87173q(false);
                } else {
                    function3 = function4;
                    z15 = z16;
                    if (viewState instanceof AbstractC5739d.a) {
                        throw AbstractC11895b.m32003v(-208671901, c28655q, false);
                    }
                    c28655q.m87150e0(2122843926);
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z24) {
                        objM87133R3 = new c(function3, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new c(function3, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87138X();
                function3 = function2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(viewState, function3, z15, i13, i14, 17);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C23374a(0);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95647w(z16, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if ((i15 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            i18 = i15 & 14;
            if (i18 == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z17 | z18;
            objM87133R2 = c28655q.m87133R();
            if (z19) {
                objM87133R2 = new a(z16, viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(z16, viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewState);
            if (viewState instanceof AbstractC5739d.b) {
                c28655q.m87150e0(2121117443);
                c28655q.m87173q(false);
                function3 = function4;
                z15 = z16;
            } else if (viewState instanceof AbstractC5739d.c) {
                c28655q.m87150e0(2121225230);
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
                objM87133R4 = c28655q.m87133R();
                if (z27) {
                    objM87133R4 = new b(function4, viewState, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new b(function4, viewState, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, viewState);
                z15 = z16;
                function3 = function4;
                AbstractC1090b.m3351f(m17021g(interfaceC28601c1), null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(700, 0, AbstractC11333b0.f36310a, 2), 2), null, null, AbstractC37817c.m121344e(404067445, c28655q, new C18522f(12, viewState, function4)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 26);
                c28655q.m87173q(false);
            } else {
                function3 = function4;
                z15 = z16;
                if (viewState instanceof AbstractC5739d.a) {
                    throw AbstractC11895b.m32003v(-208671901, c28655q, false);
                }
                c28655q.m87150e0(2122843926);
                if ((i15 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z24) {
                    objM87133R3 = new c(function3, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new c(function3, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
            function3 = function2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(viewState, function3, z15, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m17020f(InterfaceC5737b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final boolean m17021g(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m17022h(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m17023i(AbstractC5739d abstractC5739d, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
        C17909s c17909s = AbstractC17911t.f69612b;
        C17919x c17919x = new C17919x(C17919x.f69636m);
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        Modifier modifierM3357b = AbstractC1092a.m3357b(modifierM3407d, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(c17919x, new C17919x(c38072d.m121949b(composer, i14).getBlack50()), new C17919x(c38072d.m121949b(composer, i14).getBlack90()), new C17919x(c38072d.m121949b(composer, i14).getBlack90())), 0.0f, 0.0f, 14), null, 0.0f, 6);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3357b);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        C18118o celebrationOverlay = ((AbstractC5739d.c) abstractC5739d).getCelebrationOverlay();
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(abstractC5739d);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C21851c(20, function1, abstractC5739d);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC24876d.m72939p(null, celebrationOverlay, (Function1) objM87133R, composer, C18118o.f70347k << 3, 1);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m17024j(Function1 function1, AbstractC5739d abstractC5739d, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(new InterfaceC5737b.b(event, ((AbstractC5739d.c) abstractC5739d).getCelebrationOverlay()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m17025k(AbstractC5739d abstractC5739d, Function1 function1, boolean z4, int i13, int i14, Composer composer, int i15) {
        m17019e(abstractC5739d, function1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
