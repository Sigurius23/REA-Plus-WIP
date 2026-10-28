package cz0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.profile.view.edit.form.C9779c;
import d61.AbstractC11733b;
import d61.InterfaceC11732a;
import dz0.C12468b;
import dz0.C12469c;
import e61.AbstractC12765h;
import gw1.C16268a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.AbstractC21394b;
import java.util.List;
import kd1.C22385a0;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2395j3;
import p180h0.AbstractC16444q3;
import p180h0.AbstractC16486z0;
import p180h0.C16456t0;
import p181h2.C16617b;
import p181h2.C16618c;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34472r;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: cz0.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001ao\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lh2/c;", "contentRect", "scrubberRect", "Ld61/a;", "scrubberState", "", "Lcz0/r;", "scrubbableData", "Lkotlin/Function1;", "Ll83/a0;", "onDataScrub", "", "longPressTimeoutMillis", "", "dimContentOnScrub", "Lkotlin/Function0;", "content", "d", "(Lh2/c;Lh2/c;Ld61/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLc93/m;Landroidx/compose/runtime/Composer;II)V", "isLongPressScrubFeatureEnabled", "callerLongPressTimeoutMillis", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ZJ)J", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11245f {

    /* JADX INFO: renamed from: cz0.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12469c f36077w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List<InterfaceC11257r> f36078x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f36079y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(C12469c c12469c, List<? extends InterfaceC11257r> list, boolean z4) {
            this.f36077w = c12469c;
            this.f36078x = list;
            this.f36079y = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final C23454a0 m30361d(C12469c c12469c, List list, InterfaceC34476v interfaceC34476v, C16617b c16617b) {
            c12469c.m35105d(c16617b.f63937a, list, interfaceC34476v);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final C23454a0 m30362e(C12469c c12469c) {
            c12469c.m35104c();
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final C23454a0 m30363f(C12469c c12469c, List list, InterfaceC34476v interfaceC34476v, boolean z4, C34472r change, C16617b c16617b) {
            AbstractC22676k.m65750j(change, "change");
            c12469c.m35103b(new C12468b(change), c16617b.f63937a, list, interfaceC34476v, z4);
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C12469c c12469c = this.f36077w;
            List<InterfaceC11257r> list = this.f36078x;
            C11242c c11242c = new C11242c(c12469c, list, interfaceC34476v);
            C11243d c11243d = new C11243d(c12469c);
            C11244e c11244e = new C11244e(c12469c, list, interfaceC34476v, this.f36079y);
            float f13 = AbstractC16486z0.f63358a;
            Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new C16456t0(c11242c, c11243d, new C16268a(27), c11244e, null), interfaceC30057d);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (objM46625g != enumC31071a) {
                objM46625g = c23454a0;
            }
            return objM46625g == enumC31071a ? objM46625g : c23454a0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0148  */
    /* JADX WARN: Code duplicated, block: B:101:0x014b  */
    /* JADX WARN: Code duplicated, block: B:103:0x014e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0157  */
    /* JADX WARN: Code duplicated, block: B:106:0x015b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0163  */
    /* JADX WARN: Code duplicated, block: B:109:0x0166  */
    /* JADX WARN: Code duplicated, block: B:111:0x0169  */
    /* JADX WARN: Code duplicated, block: B:112:0x0172  */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:116:0x017e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0181  */
    /* JADX WARN: Code duplicated, block: B:119:0x0184  */
    /* JADX WARN: Code duplicated, block: B:120:0x018d  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0107  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x0120  */
    /* JADX WARN: Code duplicated, block: B:93:0x0123  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x0140  */
    /* JADX INFO: renamed from: d */
    public static final void m30353d(final C16618c contentRect, final C16618c scrubberRect, final InterfaceC11732a scrubberState, List<? extends InterfaceC11257r> list, Function1 function1, long j7, boolean z4, final InterfaceC4351m content, Composer composer, final int i13, final int i14) {
        int i15;
        List<? extends InterfaceC11257r> list2;
        int i16;
        Function1 function2;
        int i17;
        int i18;
        long j13;
        int i19;
        int i24;
        final boolean z13;
        int i25;
        int i26;
        boolean z14;
        final List<? extends InterfaceC11257r> list3;
        final Function1 function3;
        final boolean z15;
        final long j14;
        C28677v1 c28677v1M87180u;
        int i27;
        final List<? extends InterfaceC11257r> list4;
        Function1 function4;
        final Object objValueOf;
        InterfaceC11257r interfaceC11257r;
        Object objM74100H0;
        AbstractC21394b.a aVar;
        Object objM74100H1;
        AbstractC21394b.b bVar;
        Object objM74100H2;
        AbstractC21394b.g gVar;
        Object objM87133R;
        int i28;
        AbstractC22676k.m65750j(contentRect, "contentRect");
        AbstractC22676k.m65750j(scrubberRect, "scrubberRect");
        AbstractC22676k.m65750j(scrubberState, "scrubberState");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(153446957);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(contentRect) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(scrubberRect) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(scrubberState) : c28655q.m87157i(scrubberState) ? 256 : 128;
        }
        int i29 = i14 & 8;
        if (i29 == 0) {
            if ((i13 & 3072) == 0) {
                list2 = list;
                i15 |= c28655q.m87157i(list2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        j13 = j7;
                        if (c28655q.m87151f(j13)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                        z13 = z4;
                    } else {
                        z13 = z4;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87155h(z13)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i15 |= i25;
                        }
                    }
                    if ((i13 & 12582912) == 0) {
                        if (c28655q.m87157i(content)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    i26 = i15;
                    if ((i26 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i26 & 1, z14)) {
                        if (i29 != 0) {
                            list4 = C25271y.f99162w;
                            i27 = i16;
                        } else {
                            i27 = i16;
                            list4 = list2;
                        }
                        if (i27 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C9779c(25);
                                c28655q.m87172p0(objM87133R);
                            }
                            function4 = (Function1) objM87133R;
                        } else {
                            function4 = function2;
                        }
                        if (i18 != 0) {
                            j13 = 200;
                        }
                        if (i24 != 0) {
                            z13 = true;
                        }
                        objValueOf = null;
                        final C12469c c12469c = new C12469c(new C11246g(scrubberState, function4), null, 2, null);
                        interfaceC11257r = (InterfaceC11257r) AbstractC25265s.m74100H0(list4);
                        if (interfaceC11257r instanceof AbstractC21394b.g) {
                            objM74100H2 = AbstractC25265s.m74100H0(list4);
                            if (objM74100H2 instanceof AbstractC21394b.g) {
                                gVar = (AbstractC21394b.g) objM74100H2;
                            } else {
                                gVar = null;
                            }
                            if (gVar != null) {
                                objValueOf = Integer.valueOf(gVar.m60077h());
                            }
                        } else if (interfaceC11257r instanceof AbstractC21394b.b) {
                            objM74100H1 = AbstractC25265s.m74100H0(list4);
                            if (objM74100H1 instanceof AbstractC21394b.b) {
                                bVar = (AbstractC21394b.b) objM74100H1;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                objValueOf = Integer.valueOf(bVar.m60065h());
                            }
                        } else if (interfaceC11257r instanceof AbstractC21394b.a) {
                            objM74100H0 = AbstractC25265s.m74100H0(list4);
                            if (objM74100H0 instanceof AbstractC21394b.a) {
                                aVar = (AbstractC21394b.a) objM74100H0;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                objValueOf = Integer.valueOf(aVar.m60061g());
                            }
                        } else {
                            objValueOf = "";
                        }
                        C38072d c38072d = C38072d.f163053a;
                        final boolean zIsFeatureEnabled = c38072d.m121950c(c28655q, 6).isFeatureEnabled("scrubber-fix-enabled");
                        long jM30357h = m30357h(c38072d.m121950c(c28655q, 6).isFeatureEnabled("graph-scrub-on-long-press-android"), j13);
                        C28674u2 c28674u2 = AbstractC2453v1.f9580s;
                        AbstractC28683x.m87247a(c28674u2.mo86977a(new C22385a0((InterfaceC2395j3) c28655q.m87161k(c28674u2), jM30357h, 0L, 0L, 0.0f, 0L, 60, null)), AbstractC37817c.m121344e(1951424237, c28655q, new InterfaceC4351m() { // from class: cz0.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC11245f.m30355f(contentRect, scrubberState, z13, objValueOf, c12469c, list4, zIsFeatureEnabled, content, scrubberRect, (Composer) obj, iIntValue);
                            }
                        }), c28655q, 56);
                        list3 = list4;
                        function3 = function4;
                    } else {
                        c28655q.m87138X();
                        list3 = list2;
                        function3 = function2;
                    }
                    z15 = z13;
                    j14 = j13;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cz0.b
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC11245f.m30356g(contentRect, scrubberRect, scrubberState, list3, function3, j14, z15, content, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                j13 = j7;
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    z13 = z4;
                } else {
                    z13 = z4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(content)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i26 = i15;
                if ((i26 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i26 & 1, z14)) {
                    if (i29 != 0) {
                        list4 = C25271y.f99162w;
                        i27 = i16;
                    } else {
                        i27 = i16;
                        list4 = list2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C9779c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if (i18 != 0) {
                        j13 = 200;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    objValueOf = null;
                    final C12469c c12469c2 = new C12469c(new C11246g(scrubberState, function4), null, 2, null);
                    interfaceC11257r = (InterfaceC11257r) AbstractC25265s.m74100H0(list4);
                    if (interfaceC11257r instanceof AbstractC21394b.g) {
                        objM74100H2 = AbstractC25265s.m74100H0(list4);
                        if (objM74100H2 instanceof AbstractC21394b.g) {
                            gVar = (AbstractC21394b.g) objM74100H2;
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            objValueOf = Integer.valueOf(gVar.m60077h());
                        }
                    } else if (interfaceC11257r instanceof AbstractC21394b.b) {
                        objM74100H1 = AbstractC25265s.m74100H0(list4);
                        if (objM74100H1 instanceof AbstractC21394b.b) {
                            bVar = (AbstractC21394b.b) objM74100H1;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            objValueOf = Integer.valueOf(bVar.m60065h());
                        }
                    } else if (interfaceC11257r instanceof AbstractC21394b.a) {
                        objM74100H0 = AbstractC25265s.m74100H0(list4);
                        if (objM74100H0 instanceof AbstractC21394b.a) {
                            aVar = (AbstractC21394b.a) objM74100H0;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            objValueOf = Integer.valueOf(aVar.m60061g());
                        }
                    } else {
                        objValueOf = "";
                    }
                    C38072d c38072d2 = C38072d.f163053a;
                    final boolean zIsFeatureEnabled2 = c38072d2.m121950c(c28655q, 6).isFeatureEnabled("scrubber-fix-enabled");
                    long jM30357h2 = m30357h(c38072d2.m121950c(c28655q, 6).isFeatureEnabled("graph-scrub-on-long-press-android"), j13);
                    C28674u2 c28674u3 = AbstractC2453v1.f9580s;
                    AbstractC28683x.m87247a(c28674u3.mo86977a(new C22385a0((InterfaceC2395j3) c28655q.m87161k(c28674u3), jM30357h2, 0L, 0L, 0.0f, 0L, 60, null)), AbstractC37817c.m121344e(1951424237, c28655q, new InterfaceC4351m() { // from class: cz0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC11245f.m30355f(contentRect, scrubberState, z13, objValueOf, c12469c2, list4, zIsFeatureEnabled2, content, scrubberRect, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 56);
                    list3 = list4;
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    list3 = list2;
                    function3 = function2;
                }
                z15 = z13;
                j14 = j13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cz0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC11245f.m30356g(contentRect, scrubberRect, scrubberState, list3, function3, j14, z15, content, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 24576;
            function2 = function1;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    j13 = j7;
                    if (c28655q.m87151f(j13)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    z13 = z4;
                } else {
                    z13 = z4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(content)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i26 = i15;
                if ((i26 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i26 & 1, z14)) {
                    if (i29 != 0) {
                        list4 = C25271y.f99162w;
                        i27 = i16;
                    } else {
                        i27 = i16;
                        list4 = list2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C9779c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if (i18 != 0) {
                        j13 = 200;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    objValueOf = null;
                    final C12469c c12469c3 = new C12469c(new C11246g(scrubberState, function4), null, 2, null);
                    interfaceC11257r = (InterfaceC11257r) AbstractC25265s.m74100H0(list4);
                    if (interfaceC11257r instanceof AbstractC21394b.g) {
                        objM74100H2 = AbstractC25265s.m74100H0(list4);
                        if (objM74100H2 instanceof AbstractC21394b.g) {
                            gVar = (AbstractC21394b.g) objM74100H2;
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            objValueOf = Integer.valueOf(gVar.m60077h());
                        }
                    } else if (interfaceC11257r instanceof AbstractC21394b.b) {
                        objM74100H1 = AbstractC25265s.m74100H0(list4);
                        if (objM74100H1 instanceof AbstractC21394b.b) {
                            bVar = (AbstractC21394b.b) objM74100H1;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            objValueOf = Integer.valueOf(bVar.m60065h());
                        }
                    } else if (interfaceC11257r instanceof AbstractC21394b.a) {
                        objM74100H0 = AbstractC25265s.m74100H0(list4);
                        if (objM74100H0 instanceof AbstractC21394b.a) {
                            aVar = (AbstractC21394b.a) objM74100H0;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            objValueOf = Integer.valueOf(aVar.m60061g());
                        }
                    } else {
                        objValueOf = "";
                    }
                    C38072d c38072d3 = C38072d.f163053a;
                    final boolean zIsFeatureEnabled3 = c38072d3.m121950c(c28655q, 6).isFeatureEnabled("scrubber-fix-enabled");
                    long jM30357h3 = m30357h(c38072d3.m121950c(c28655q, 6).isFeatureEnabled("graph-scrub-on-long-press-android"), j13);
                    C28674u2 c28674u4 = AbstractC2453v1.f9580s;
                    AbstractC28683x.m87247a(c28674u4.mo86977a(new C22385a0((InterfaceC2395j3) c28655q.m87161k(c28674u4), jM30357h3, 0L, 0L, 0.0f, 0L, 60, null)), AbstractC37817c.m121344e(1951424237, c28655q, new InterfaceC4351m() { // from class: cz0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC11245f.m30355f(contentRect, scrubberState, z13, objValueOf, c12469c3, list4, zIsFeatureEnabled3, content, scrubberRect, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 56);
                    list3 = list4;
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    list3 = list2;
                    function3 = function2;
                }
                z15 = z13;
                j14 = j13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cz0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC11245f.m30356g(contentRect, scrubberRect, scrubberState, list3, function3, j14, z15, content, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            j13 = j7;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(content)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            i26 = i15;
            if ((i26 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i26 & 1, z14)) {
                if (i29 != 0) {
                    list4 = C25271y.f99162w;
                    i27 = i16;
                } else {
                    i27 = i16;
                    list4 = list2;
                }
                if (i27 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C9779c(25);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (i18 != 0) {
                    j13 = 200;
                }
                if (i24 != 0) {
                    z13 = true;
                }
                objValueOf = null;
                final C12469c c12469c4 = new C12469c(new C11246g(scrubberState, function4), null, 2, null);
                interfaceC11257r = (InterfaceC11257r) AbstractC25265s.m74100H0(list4);
                if (interfaceC11257r instanceof AbstractC21394b.g) {
                    objM74100H2 = AbstractC25265s.m74100H0(list4);
                    if (objM74100H2 instanceof AbstractC21394b.g) {
                        gVar = (AbstractC21394b.g) objM74100H2;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        objValueOf = Integer.valueOf(gVar.m60077h());
                    }
                } else if (interfaceC11257r instanceof AbstractC21394b.b) {
                    objM74100H1 = AbstractC25265s.m74100H0(list4);
                    if (objM74100H1 instanceof AbstractC21394b.b) {
                        bVar = (AbstractC21394b.b) objM74100H1;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        objValueOf = Integer.valueOf(bVar.m60065h());
                    }
                } else if (interfaceC11257r instanceof AbstractC21394b.a) {
                    objM74100H0 = AbstractC25265s.m74100H0(list4);
                    if (objM74100H0 instanceof AbstractC21394b.a) {
                        aVar = (AbstractC21394b.a) objM74100H0;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        objValueOf = Integer.valueOf(aVar.m60061g());
                    }
                } else {
                    objValueOf = "";
                }
                C38072d c38072d4 = C38072d.f163053a;
                final boolean zIsFeatureEnabled4 = c38072d4.m121950c(c28655q, 6).isFeatureEnabled("scrubber-fix-enabled");
                long jM30357h4 = m30357h(c38072d4.m121950c(c28655q, 6).isFeatureEnabled("graph-scrub-on-long-press-android"), j13);
                C28674u2 c28674u5 = AbstractC2453v1.f9580s;
                AbstractC28683x.m87247a(c28674u5.mo86977a(new C22385a0((InterfaceC2395j3) c28655q.m87161k(c28674u5), jM30357h4, 0L, 0L, 0.0f, 0L, 60, null)), AbstractC37817c.m121344e(1951424237, c28655q, new InterfaceC4351m() { // from class: cz0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC11245f.m30355f(contentRect, scrubberState, z13, objValueOf, c12469c4, list4, zIsFeatureEnabled4, content, scrubberRect, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
                list3 = list4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                list3 = list2;
                function3 = function2;
            }
            z15 = z13;
            j14 = j13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC11245f.m30356g(contentRect, scrubberRect, scrubberState, list3, function3, j14, z15, content, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        list2 = list;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    j13 = j7;
                    if (c28655q.m87151f(j13)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    z13 = z4;
                } else {
                    z13 = z4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(content)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i26 = i15;
                if ((i26 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i26 & 1, z14)) {
                    if (i29 != 0) {
                        list4 = C25271y.f99162w;
                        i27 = i16;
                    } else {
                        i27 = i16;
                        list4 = list2;
                    }
                    if (i27 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C9779c(25);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if (i18 != 0) {
                        j13 = 200;
                    }
                    if (i24 != 0) {
                        z13 = true;
                    }
                    objValueOf = null;
                    final C12469c c12469c5 = new C12469c(new C11246g(scrubberState, function4), null, 2, null);
                    interfaceC11257r = (InterfaceC11257r) AbstractC25265s.m74100H0(list4);
                    if (interfaceC11257r instanceof AbstractC21394b.g) {
                        objM74100H2 = AbstractC25265s.m74100H0(list4);
                        if (objM74100H2 instanceof AbstractC21394b.g) {
                            gVar = (AbstractC21394b.g) objM74100H2;
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            objValueOf = Integer.valueOf(gVar.m60077h());
                        }
                    } else if (interfaceC11257r instanceof AbstractC21394b.b) {
                        objM74100H1 = AbstractC25265s.m74100H0(list4);
                        if (objM74100H1 instanceof AbstractC21394b.b) {
                            bVar = (AbstractC21394b.b) objM74100H1;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            objValueOf = Integer.valueOf(bVar.m60065h());
                        }
                    } else if (interfaceC11257r instanceof AbstractC21394b.a) {
                        objM74100H0 = AbstractC25265s.m74100H0(list4);
                        if (objM74100H0 instanceof AbstractC21394b.a) {
                            aVar = (AbstractC21394b.a) objM74100H0;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            objValueOf = Integer.valueOf(aVar.m60061g());
                        }
                    } else {
                        objValueOf = "";
                    }
                    C38072d c38072d5 = C38072d.f163053a;
                    final boolean zIsFeatureEnabled5 = c38072d5.m121950c(c28655q, 6).isFeatureEnabled("scrubber-fix-enabled");
                    long jM30357h5 = m30357h(c38072d5.m121950c(c28655q, 6).isFeatureEnabled("graph-scrub-on-long-press-android"), j13);
                    C28674u2 c28674u6 = AbstractC2453v1.f9580s;
                    AbstractC28683x.m87247a(c28674u6.mo86977a(new C22385a0((InterfaceC2395j3) c28655q.m87161k(c28674u6), jM30357h5, 0L, 0L, 0.0f, 0L, 60, null)), AbstractC37817c.m121344e(1951424237, c28655q, new InterfaceC4351m() { // from class: cz0.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC11245f.m30355f(contentRect, scrubberState, z13, objValueOf, c12469c5, list4, zIsFeatureEnabled5, content, scrubberRect, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 56);
                    list3 = list4;
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    list3 = list2;
                    function3 = function2;
                }
                z15 = z13;
                j14 = j13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cz0.b
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC11245f.m30356g(contentRect, scrubberRect, scrubberState, list3, function3, j14, z15, content, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            j13 = j7;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(content)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            i26 = i15;
            if ((i26 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i26 & 1, z14)) {
                if (i29 != 0) {
                    list4 = C25271y.f99162w;
                    i27 = i16;
                } else {
                    i27 = i16;
                    list4 = list2;
                }
                if (i27 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C9779c(25);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (i18 != 0) {
                    j13 = 200;
                }
                if (i24 != 0) {
                    z13 = true;
                }
                objValueOf = null;
                final C12469c c12469c6 = new C12469c(new C11246g(scrubberState, function4), null, 2, null);
                interfaceC11257r = (InterfaceC11257r) AbstractC25265s.m74100H0(list4);
                if (interfaceC11257r instanceof AbstractC21394b.g) {
                    objM74100H2 = AbstractC25265s.m74100H0(list4);
                    if (objM74100H2 instanceof AbstractC21394b.g) {
                        gVar = (AbstractC21394b.g) objM74100H2;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        objValueOf = Integer.valueOf(gVar.m60077h());
                    }
                } else if (interfaceC11257r instanceof AbstractC21394b.b) {
                    objM74100H1 = AbstractC25265s.m74100H0(list4);
                    if (objM74100H1 instanceof AbstractC21394b.b) {
                        bVar = (AbstractC21394b.b) objM74100H1;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        objValueOf = Integer.valueOf(bVar.m60065h());
                    }
                } else if (interfaceC11257r instanceof AbstractC21394b.a) {
                    objM74100H0 = AbstractC25265s.m74100H0(list4);
                    if (objM74100H0 instanceof AbstractC21394b.a) {
                        aVar = (AbstractC21394b.a) objM74100H0;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        objValueOf = Integer.valueOf(aVar.m60061g());
                    }
                } else {
                    objValueOf = "";
                }
                C38072d c38072d6 = C38072d.f163053a;
                final boolean zIsFeatureEnabled6 = c38072d6.m121950c(c28655q, 6).isFeatureEnabled("scrubber-fix-enabled");
                long jM30357h6 = m30357h(c38072d6.m121950c(c28655q, 6).isFeatureEnabled("graph-scrub-on-long-press-android"), j13);
                C28674u2 c28674u7 = AbstractC2453v1.f9580s;
                AbstractC28683x.m87247a(c28674u7.mo86977a(new C22385a0((InterfaceC2395j3) c28655q.m87161k(c28674u7), jM30357h6, 0L, 0L, 0.0f, 0L, 60, null)), AbstractC37817c.m121344e(1951424237, c28655q, new InterfaceC4351m() { // from class: cz0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC11245f.m30355f(contentRect, scrubberState, z13, objValueOf, c12469c6, list4, zIsFeatureEnabled6, content, scrubberRect, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
                list3 = list4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                list3 = list2;
                function3 = function2;
            }
            z15 = z13;
            j14 = j13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC11245f.m30356g(contentRect, scrubberRect, scrubberState, list3, function3, j14, z15, content, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 24576;
        function2 = function1;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                j13 = j7;
                if (c28655q.m87151f(j13)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(content)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            i26 = i15;
            if ((i26 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i26 & 1, z14)) {
                if (i29 != 0) {
                    list4 = C25271y.f99162w;
                    i27 = i16;
                } else {
                    i27 = i16;
                    list4 = list2;
                }
                if (i27 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C9779c(25);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (i18 != 0) {
                    j13 = 200;
                }
                if (i24 != 0) {
                    z13 = true;
                }
                objValueOf = null;
                final C12469c c12469c7 = new C12469c(new C11246g(scrubberState, function4), null, 2, null);
                interfaceC11257r = (InterfaceC11257r) AbstractC25265s.m74100H0(list4);
                if (interfaceC11257r instanceof AbstractC21394b.g) {
                    objM74100H2 = AbstractC25265s.m74100H0(list4);
                    if (objM74100H2 instanceof AbstractC21394b.g) {
                        gVar = (AbstractC21394b.g) objM74100H2;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        objValueOf = Integer.valueOf(gVar.m60077h());
                    }
                } else if (interfaceC11257r instanceof AbstractC21394b.b) {
                    objM74100H1 = AbstractC25265s.m74100H0(list4);
                    if (objM74100H1 instanceof AbstractC21394b.b) {
                        bVar = (AbstractC21394b.b) objM74100H1;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        objValueOf = Integer.valueOf(bVar.m60065h());
                    }
                } else if (interfaceC11257r instanceof AbstractC21394b.a) {
                    objM74100H0 = AbstractC25265s.m74100H0(list4);
                    if (objM74100H0 instanceof AbstractC21394b.a) {
                        aVar = (AbstractC21394b.a) objM74100H0;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        objValueOf = Integer.valueOf(aVar.m60061g());
                    }
                } else {
                    objValueOf = "";
                }
                C38072d c38072d7 = C38072d.f163053a;
                final boolean zIsFeatureEnabled7 = c38072d7.m121950c(c28655q, 6).isFeatureEnabled("scrubber-fix-enabled");
                long jM30357h7 = m30357h(c38072d7.m121950c(c28655q, 6).isFeatureEnabled("graph-scrub-on-long-press-android"), j13);
                C28674u2 c28674u8 = AbstractC2453v1.f9580s;
                AbstractC28683x.m87247a(c28674u8.mo86977a(new C22385a0((InterfaceC2395j3) c28655q.m87161k(c28674u8), jM30357h7, 0L, 0L, 0.0f, 0L, 60, null)), AbstractC37817c.m121344e(1951424237, c28655q, new InterfaceC4351m() { // from class: cz0.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC11245f.m30355f(contentRect, scrubberState, z13, objValueOf, c12469c7, list4, zIsFeatureEnabled7, content, scrubberRect, (Composer) obj, iIntValue);
                    }
                }), c28655q, 56);
                list3 = list4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                list3 = list2;
                function3 = function2;
            }
            z15 = z13;
            j14 = j13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cz0.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC11245f.m30356g(contentRect, scrubberRect, scrubberState, list3, function3, j14, z15, content, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        j13 = j7;
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
            z13 = z4;
        } else {
            z13 = z4;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z13)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q.m87157i(content)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i15 |= i28;
        }
        i26 = i15;
        if ((i26 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i26 & 1, z14)) {
            if (i29 != 0) {
                list4 = C25271y.f99162w;
                i27 = i16;
            } else {
                i27 = i16;
                list4 = list2;
            }
            if (i27 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C9779c(25);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            if (i18 != 0) {
                j13 = 200;
            }
            if (i24 != 0) {
                z13 = true;
            }
            objValueOf = null;
            final C12469c c12469c8 = new C12469c(new C11246g(scrubberState, function4), null, 2, null);
            interfaceC11257r = (InterfaceC11257r) AbstractC25265s.m74100H0(list4);
            if (interfaceC11257r instanceof AbstractC21394b.g) {
                objM74100H2 = AbstractC25265s.m74100H0(list4);
                if (objM74100H2 instanceof AbstractC21394b.g) {
                    gVar = (AbstractC21394b.g) objM74100H2;
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    objValueOf = Integer.valueOf(gVar.m60077h());
                }
            } else if (interfaceC11257r instanceof AbstractC21394b.b) {
                objM74100H1 = AbstractC25265s.m74100H0(list4);
                if (objM74100H1 instanceof AbstractC21394b.b) {
                    bVar = (AbstractC21394b.b) objM74100H1;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    objValueOf = Integer.valueOf(bVar.m60065h());
                }
            } else if (interfaceC11257r instanceof AbstractC21394b.a) {
                objM74100H0 = AbstractC25265s.m74100H0(list4);
                if (objM74100H0 instanceof AbstractC21394b.a) {
                    aVar = (AbstractC21394b.a) objM74100H0;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    objValueOf = Integer.valueOf(aVar.m60061g());
                }
            } else {
                objValueOf = "";
            }
            C38072d c38072d8 = C38072d.f163053a;
            final boolean zIsFeatureEnabled8 = c38072d8.m121950c(c28655q, 6).isFeatureEnabled("scrubber-fix-enabled");
            long jM30357h8 = m30357h(c38072d8.m121950c(c28655q, 6).isFeatureEnabled("graph-scrub-on-long-press-android"), j13);
            C28674u2 c28674u9 = AbstractC2453v1.f9580s;
            AbstractC28683x.m87247a(c28674u9.mo86977a(new C22385a0((InterfaceC2395j3) c28655q.m87161k(c28674u9), jM30357h8, 0L, 0L, 0.0f, 0L, 60, null)), AbstractC37817c.m121344e(1951424237, c28655q, new InterfaceC4351m() { // from class: cz0.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC11245f.m30355f(contentRect, scrubberState, z13, objValueOf, c12469c8, list4, zIsFeatureEnabled8, content, scrubberRect, (Composer) obj, iIntValue);
                }
            }), c28655q, 56);
            list3 = list4;
            function3 = function4;
        } else {
            c28655q.m87138X();
            list3 = list2;
            function3 = function2;
        }
        z15 = z13;
        j14 = j13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cz0.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC11245f.m30356g(contentRect, scrubberRect, scrubberState, list3, function3, j14, z15, content, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m30354e(InterfaceC11732a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m30355f(C16618c c16618c, InterfaceC11732a interfaceC11732a, boolean z4, Object obj, C12469c c12469c, List list, boolean z13, InterfaceC4351m interfaceC4351m, C16618c c16618c2, Composer composer, int i13) {
        float f13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM35718G = AbstractC12765h.m35718G(C2314t.f9131w, c16618c, null, 2, null);
            if (!AbstractC11733b.m31361a(interfaceC11732a) || z4) {
                f13 = AbstractC11733b.m31361a(interfaceC11732a) ? 0.25f : 1.0f;
            } else {
                f13 = 0.99f;
            }
            Modifier modifierM107879c = AbstractC34132o.m107879c(f13, modifierM35718G);
            boolean zM87157i = c28655q.m87157i(c12469c) | c28655q.m87157i(list) | c28655q.m87155h(z13);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new a(c12469c, list, z13);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierM107879c, obj, (PointerInputEventHandler) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM108903b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            interfaceC4351m.invoke(c28655q, 0);
            c28655q.m87173q(true);
            Float fM35102a = c12469c.m35102a();
            if (fM35102a != null) {
                c28655q.m87150e0(-1262684680);
                AbstractC11254o.m30378j(c16618c, c16618c2, fM35102a.floatValue(), AbstractC25265s.m74093D1(interfaceC11732a.mo31360b().values()), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1262474221);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m30356g(C16618c c16618c, C16618c c16618c2, InterfaceC11732a interfaceC11732a, List list, Function1 function1, long j7, boolean z4, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m30353d(c16618c, c16618c2, interfaceC11732a, list, function1, j7, z4, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final long m30357h(boolean z4, long j7) {
        if (z4 && j7 == 0) {
            return 200L;
        }
        return j7;
    }
}
