package iw0;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2559k4;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io2.C20756e;
import java.util.List;
import jz0.AbstractC22070c;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import o11.AbstractC27407m;
import o11.InterfaceC27402h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p409q0.AbstractC29701y;
import p409q0.InterfaceC29694r;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: iw0.c0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Liw0/l0;", "weightliftingExercises", "", "numExerciseCards", "Lq0/y;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onViewAllClicked", "Lkotlin/Function1;", "", "onExerciseImageClicked", "", "isExerciseImageNavigationEnabled", "isExerciseDetailsV2FFEnabled", "l", "(Liw0/l0;ILq0/y;Lc93/a;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V", "Liw0/z;", "exerciseData", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Liw0/z;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20962c0 {
    /* JADX WARN: Code duplicated, block: B:101:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x018a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0196  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a  */
    /* JADX WARN: Code duplicated, block: B:90:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0131  */
    /* JADX WARN: Code duplicated, block: B:93:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX INFO: renamed from: h */
    public static final void m58251h(C20994z exerciseData, Function1 function1, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z14;
        int i17;
        int i18;
        boolean z15;
        int i19;
        boolean z16;
        Function1 function3;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        boolean z19;
        boolean z24;
        List<Integer> listM58485a;
        List<Integer> list;
        String strM58487c;
        Integer numM58486b;
        AbstractC20973i.a aVar;
        Integer num;
        boolean zM58494j;
        C23454a0 c23454a0;
        Object obj;
        Object obj2;
        InterfaceC25312u aVar2;
        boolean z25;
        Object objM87133R;
        Object obj3;
        Object objM87133R2;
        AbstractC22676k.m65750j(exerciseData, "exerciseData");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(897248100);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(exerciseData) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z14 = z4;
                    if (c28655q.m87155h(z14)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z15 = z13;
                        if (c28655q.m87155h(z15)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C20756e(22);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        } else {
                            function3 = function2;
                        }
                        if (i16 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i18 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (z24) {
                            listM58485a = exerciseData.m58485a();
                        } else {
                            listM58485a = C25271y.f99162w;
                        }
                        list = listM58485a;
                        strM58487c = exerciseData.getExerciseId();
                        numM58486b = null;
                        if (strM58487c == null) {
                            aVar = null;
                        } else {
                            if (z19 || AbstractC39414r.m125890i0(strM58487c)) {
                                strM58487c = null;
                            }
                            if (strM58487c != null) {
                                aVar = new AbstractC20973i.a(strM58487c);
                            } else {
                                aVar = null;
                            }
                        }
                        if (z24 && aVar != null) {
                            numM58486b = exerciseData.getEndIconResource();
                        }
                        num = numM58486b;
                        zM58494j = exerciseData.getIsFullWorkoutSummary();
                        c23454a0 = C23454a0.f92919a;
                        if (zM58494j) {
                            TextResource textResourceM58491g = exerciseData.getTitleDisplay();
                            TextResource textResourceM58490f = exerciseData.getSubtitleDisplay();
                            if (aVar == null) {
                                obj3 = c23454a0;
                            } else {
                                obj3 = aVar;
                            }
                            aVar2 = new AbstractC27407m.d.b(textResourceM58491g, textResourceM58490f, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, num, obj3, list, 8, null);
                        } else {
                            TextResource textResourceM58491g2 = exerciseData.getTitleDisplay();
                            TextResource textResourceM58490f2 = exerciseData.getSubtitleDisplay();
                            String strM58488d = exerciseData.getImageUrl();
                            if (aVar == null) {
                                obj = c23454a0;
                            } else {
                                obj = aVar;
                            }
                            if (aVar == null) {
                                obj2 = c23454a0;
                            } else {
                                obj2 = aVar;
                            }
                            aVar2 = new AbstractC27407m.d.a(textResourceM58491g2, textResourceM58490f2, strM58488d, null, null, obj, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, null, false, false, num, obj2, list, 1944, null);
                        }
                        InterfaceC25312u interfaceC25312u = aVar2;
                        z25 = (i15 & 112) == 32;
                        objM87133R = c28655q.m87133R();
                        if (z25 || objM87133R == c28676v0) {
                            objM87133R = new C20983o(function3, 7);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, AbstractC27407m.d.f110334v, 6);
                        z17 = z19;
                        z18 = z24;
                    } else {
                        c28655q.m87138X();
                        function3 = function2;
                        z17 = z14;
                        z18 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2559k4(exerciseData, function3, z17, z18, i13, i14, 2);
                    }
                }
                i15 |= 3072;
                z15 = z13;
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20756e(22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function2;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (z24) {
                        listM58485a = exerciseData.m58485a();
                    } else {
                        listM58485a = C25271y.f99162w;
                    }
                    list = listM58485a;
                    strM58487c = exerciseData.getExerciseId();
                    numM58486b = null;
                    if (strM58487c == null) {
                        aVar = null;
                    } else {
                        if (z19) {
                            strM58487c = null;
                        } else {
                            strM58487c = null;
                        }
                        if (strM58487c != null) {
                            aVar = new AbstractC20973i.a(strM58487c);
                        } else {
                            aVar = null;
                        }
                    }
                    if (z24) {
                        numM58486b = exerciseData.getEndIconResource();
                    }
                    num = numM58486b;
                    zM58494j = exerciseData.getIsFullWorkoutSummary();
                    c23454a0 = C23454a0.f92919a;
                    if (zM58494j) {
                        TextResource textResourceM58491g3 = exerciseData.getTitleDisplay();
                        TextResource textResourceM58490f3 = exerciseData.getSubtitleDisplay();
                        if (aVar == null) {
                            obj3 = c23454a0;
                        } else {
                            obj3 = aVar;
                        }
                        aVar2 = new AbstractC27407m.d.b(textResourceM58491g3, textResourceM58490f3, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, num, obj3, list, 8, null);
                    } else {
                        TextResource textResourceM58491g4 = exerciseData.getTitleDisplay();
                        TextResource textResourceM58490f4 = exerciseData.getSubtitleDisplay();
                        String strM58488d2 = exerciseData.getImageUrl();
                        if (aVar == null) {
                            obj = c23454a0;
                        } else {
                            obj = aVar;
                        }
                        if (aVar == null) {
                            obj2 = c23454a0;
                        } else {
                            obj2 = aVar;
                        }
                        aVar2 = new AbstractC27407m.d.a(textResourceM58491g4, textResourceM58490f4, strM58488d2, null, null, obj, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, null, false, false, num, obj2, list, 1944, null);
                    }
                    InterfaceC25312u interfaceC25312u2 = aVar2;
                    if ((i15 & 112) == 32) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z25) {
                        objM87133R = new C20983o(function3, 7);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C20983o(function3, 7);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u2, null, null, (Function1) objM87133R, c28655q, AbstractC27407m.d.f110334v, 6);
                    z17 = z19;
                    z18 = z24;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2559k4(exerciseData, function3, z17, z18, i13, i14, 2);
                }
            }
            i15 |= 384;
            z14 = z4;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20756e(22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function2;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (z24) {
                        listM58485a = exerciseData.m58485a();
                    } else {
                        listM58485a = C25271y.f99162w;
                    }
                    list = listM58485a;
                    strM58487c = exerciseData.getExerciseId();
                    numM58486b = null;
                    if (strM58487c == null) {
                        aVar = null;
                    } else {
                        if (z19) {
                            strM58487c = null;
                        } else {
                            strM58487c = null;
                        }
                        if (strM58487c != null) {
                            aVar = new AbstractC20973i.a(strM58487c);
                        } else {
                            aVar = null;
                        }
                    }
                    if (z24) {
                        numM58486b = exerciseData.getEndIconResource();
                    }
                    num = numM58486b;
                    zM58494j = exerciseData.getIsFullWorkoutSummary();
                    c23454a0 = C23454a0.f92919a;
                    if (zM58494j) {
                        TextResource textResourceM58491g5 = exerciseData.getTitleDisplay();
                        TextResource textResourceM58490f5 = exerciseData.getSubtitleDisplay();
                        if (aVar == null) {
                            obj3 = c23454a0;
                        } else {
                            obj3 = aVar;
                        }
                        aVar2 = new AbstractC27407m.d.b(textResourceM58491g5, textResourceM58490f5, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, num, obj3, list, 8, null);
                    } else {
                        TextResource textResourceM58491g6 = exerciseData.getTitleDisplay();
                        TextResource textResourceM58490f6 = exerciseData.getSubtitleDisplay();
                        String strM58488d3 = exerciseData.getImageUrl();
                        if (aVar == null) {
                            obj = c23454a0;
                        } else {
                            obj = aVar;
                        }
                        if (aVar == null) {
                            obj2 = c23454a0;
                        } else {
                            obj2 = aVar;
                        }
                        aVar2 = new AbstractC27407m.d.a(textResourceM58491g6, textResourceM58490f6, strM58488d3, null, null, obj, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, null, false, false, num, obj2, list, 1944, null);
                    }
                    InterfaceC25312u interfaceC25312u3 = aVar2;
                    if ((i15 & 112) == 32) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z25) {
                        objM87133R = new C20983o(function3, 7);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C20983o(function3, 7);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u3, null, null, (Function1) objM87133R, c28655q, AbstractC27407m.d.f110334v, 6);
                    z17 = z19;
                    z18 = z24;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2559k4(exerciseData, function3, z17, z18, i13, i14, 2);
                }
            }
            i15 |= 3072;
            z15 = z13;
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C20756e(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (z24) {
                    listM58485a = exerciseData.m58485a();
                } else {
                    listM58485a = C25271y.f99162w;
                }
                list = listM58485a;
                strM58487c = exerciseData.getExerciseId();
                numM58486b = null;
                if (strM58487c == null) {
                    aVar = null;
                } else {
                    if (z19) {
                        strM58487c = null;
                    } else {
                        strM58487c = null;
                    }
                    if (strM58487c != null) {
                        aVar = new AbstractC20973i.a(strM58487c);
                    } else {
                        aVar = null;
                    }
                }
                if (z24) {
                    numM58486b = exerciseData.getEndIconResource();
                }
                num = numM58486b;
                zM58494j = exerciseData.getIsFullWorkoutSummary();
                c23454a0 = C23454a0.f92919a;
                if (zM58494j) {
                    TextResource textResourceM58491g7 = exerciseData.getTitleDisplay();
                    TextResource textResourceM58490f7 = exerciseData.getSubtitleDisplay();
                    if (aVar == null) {
                        obj3 = c23454a0;
                    } else {
                        obj3 = aVar;
                    }
                    aVar2 = new AbstractC27407m.d.b(textResourceM58491g7, textResourceM58490f7, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, num, obj3, list, 8, null);
                } else {
                    TextResource textResourceM58491g8 = exerciseData.getTitleDisplay();
                    TextResource textResourceM58490f8 = exerciseData.getSubtitleDisplay();
                    String strM58488d4 = exerciseData.getImageUrl();
                    if (aVar == null) {
                        obj = c23454a0;
                    } else {
                        obj = aVar;
                    }
                    if (aVar == null) {
                        obj2 = c23454a0;
                    } else {
                        obj2 = aVar;
                    }
                    aVar2 = new AbstractC27407m.d.a(textResourceM58491g8, textResourceM58490f8, strM58488d4, null, null, obj, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, null, false, false, num, obj2, list, 1944, null);
                }
                InterfaceC25312u interfaceC25312u4 = aVar2;
                if ((i15 & 112) == 32) {
                }
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C20983o(function3, 7);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C20983o(function3, 7);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u4, null, null, (Function1) objM87133R, c28655q, AbstractC27407m.d.f110334v, 6);
                z17 = z19;
                z18 = z24;
            } else {
                c28655q.m87138X();
                function3 = function2;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(exerciseData, function3, z17, z18, i13, i14, 2);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                if (c28655q.m87155h(z14)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20756e(22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function2;
                    }
                    if (i16 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i18 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (z24) {
                        listM58485a = exerciseData.m58485a();
                    } else {
                        listM58485a = C25271y.f99162w;
                    }
                    list = listM58485a;
                    strM58487c = exerciseData.getExerciseId();
                    numM58486b = null;
                    if (strM58487c == null) {
                        aVar = null;
                    } else {
                        if (z19) {
                            strM58487c = null;
                        } else {
                            strM58487c = null;
                        }
                        if (strM58487c != null) {
                            aVar = new AbstractC20973i.a(strM58487c);
                        } else {
                            aVar = null;
                        }
                    }
                    if (z24) {
                        numM58486b = exerciseData.getEndIconResource();
                    }
                    num = numM58486b;
                    zM58494j = exerciseData.getIsFullWorkoutSummary();
                    c23454a0 = C23454a0.f92919a;
                    if (zM58494j) {
                        TextResource textResourceM58491g9 = exerciseData.getTitleDisplay();
                        TextResource textResourceM58490f9 = exerciseData.getSubtitleDisplay();
                        if (aVar == null) {
                            obj3 = c23454a0;
                        } else {
                            obj3 = aVar;
                        }
                        aVar2 = new AbstractC27407m.d.b(textResourceM58491g9, textResourceM58490f9, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, num, obj3, list, 8, null);
                    } else {
                        TextResource textResourceM58491g10 = exerciseData.getTitleDisplay();
                        TextResource textResourceM58490f10 = exerciseData.getSubtitleDisplay();
                        String strM58488d5 = exerciseData.getImageUrl();
                        if (aVar == null) {
                            obj = c23454a0;
                        } else {
                            obj = aVar;
                        }
                        if (aVar == null) {
                            obj2 = c23454a0;
                        } else {
                            obj2 = aVar;
                        }
                        aVar2 = new AbstractC27407m.d.a(textResourceM58491g10, textResourceM58490f10, strM58488d5, null, null, obj, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, null, false, false, num, obj2, list, 1944, null);
                    }
                    InterfaceC25312u interfaceC25312u5 = aVar2;
                    if ((i15 & 112) == 32) {
                    }
                    objM87133R = c28655q.m87133R();
                    if (z25) {
                        objM87133R = new C20983o(function3, 7);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C20983o(function3, 7);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u5, null, null, (Function1) objM87133R, c28655q, AbstractC27407m.d.f110334v, 6);
                    z17 = z19;
                    z18 = z24;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2559k4(exerciseData, function3, z17, z18, i13, i14, 2);
                }
            }
            i15 |= 3072;
            z15 = z13;
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C20756e(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (z24) {
                    listM58485a = exerciseData.m58485a();
                } else {
                    listM58485a = C25271y.f99162w;
                }
                list = listM58485a;
                strM58487c = exerciseData.getExerciseId();
                numM58486b = null;
                if (strM58487c == null) {
                    aVar = null;
                } else {
                    if (z19) {
                        strM58487c = null;
                    } else {
                        strM58487c = null;
                    }
                    if (strM58487c != null) {
                        aVar = new AbstractC20973i.a(strM58487c);
                    } else {
                        aVar = null;
                    }
                }
                if (z24) {
                    numM58486b = exerciseData.getEndIconResource();
                }
                num = numM58486b;
                zM58494j = exerciseData.getIsFullWorkoutSummary();
                c23454a0 = C23454a0.f92919a;
                if (zM58494j) {
                    TextResource textResourceM58491g11 = exerciseData.getTitleDisplay();
                    TextResource textResourceM58490f11 = exerciseData.getSubtitleDisplay();
                    if (aVar == null) {
                        obj3 = c23454a0;
                    } else {
                        obj3 = aVar;
                    }
                    aVar2 = new AbstractC27407m.d.b(textResourceM58491g11, textResourceM58490f11, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, num, obj3, list, 8, null);
                } else {
                    TextResource textResourceM58491g12 = exerciseData.getTitleDisplay();
                    TextResource textResourceM58490f12 = exerciseData.getSubtitleDisplay();
                    String strM58488d6 = exerciseData.getImageUrl();
                    if (aVar == null) {
                        obj = c23454a0;
                    } else {
                        obj = aVar;
                    }
                    if (aVar == null) {
                        obj2 = c23454a0;
                    } else {
                        obj2 = aVar;
                    }
                    aVar2 = new AbstractC27407m.d.a(textResourceM58491g12, textResourceM58490f12, strM58488d6, null, null, obj, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, null, false, false, num, obj2, list, 1944, null);
                }
                InterfaceC25312u interfaceC25312u6 = aVar2;
                if ((i15 & 112) == 32) {
                }
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C20983o(function3, 7);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C20983o(function3, 7);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u6, null, null, (Function1) objM87133R, c28655q, AbstractC27407m.d.f110334v, 6);
                z17 = z19;
                z18 = z24;
            } else {
                c28655q.m87138X();
                function3 = function2;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(exerciseData, function3, z17, z18, i13, i14, 2);
            }
        }
        i15 |= 384;
        z14 = z4;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C20756e(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                if (i16 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i18 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (z24) {
                    listM58485a = exerciseData.m58485a();
                } else {
                    listM58485a = C25271y.f99162w;
                }
                list = listM58485a;
                strM58487c = exerciseData.getExerciseId();
                numM58486b = null;
                if (strM58487c == null) {
                    aVar = null;
                } else {
                    if (z19) {
                        strM58487c = null;
                    } else {
                        strM58487c = null;
                    }
                    if (strM58487c != null) {
                        aVar = new AbstractC20973i.a(strM58487c);
                    } else {
                        aVar = null;
                    }
                }
                if (z24) {
                    numM58486b = exerciseData.getEndIconResource();
                }
                num = numM58486b;
                zM58494j = exerciseData.getIsFullWorkoutSummary();
                c23454a0 = C23454a0.f92919a;
                if (zM58494j) {
                    TextResource textResourceM58491g13 = exerciseData.getTitleDisplay();
                    TextResource textResourceM58490f13 = exerciseData.getSubtitleDisplay();
                    if (aVar == null) {
                        obj3 = c23454a0;
                    } else {
                        obj3 = aVar;
                    }
                    aVar2 = new AbstractC27407m.d.b(textResourceM58491g13, textResourceM58490f13, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, num, obj3, list, 8, null);
                } else {
                    TextResource textResourceM58491g14 = exerciseData.getTitleDisplay();
                    TextResource textResourceM58490f14 = exerciseData.getSubtitleDisplay();
                    String strM58488d7 = exerciseData.getImageUrl();
                    if (aVar == null) {
                        obj = c23454a0;
                    } else {
                        obj = aVar;
                    }
                    if (aVar == null) {
                        obj2 = c23454a0;
                    } else {
                        obj2 = aVar;
                    }
                    aVar2 = new AbstractC27407m.d.a(textResourceM58491g14, textResourceM58490f14, strM58488d7, null, null, obj, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, null, false, false, num, obj2, list, 1944, null);
                }
                InterfaceC25312u interfaceC25312u7 = aVar2;
                if ((i15 & 112) == 32) {
                }
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C20983o(function3, 7);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C20983o(function3, 7);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u7, null, null, (Function1) objM87133R, c28655q, AbstractC27407m.d.f110334v, 6);
                z17 = z19;
                z18 = z24;
            } else {
                c28655q.m87138X();
                function3 = function2;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(exerciseData, function3, z17, z18, i13, i14, 2);
            }
        }
        i15 |= 3072;
        z15 = z13;
        if ((i15 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C20756e(22);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            if (i16 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i18 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            if (z24) {
                listM58485a = exerciseData.m58485a();
            } else {
                listM58485a = C25271y.f99162w;
            }
            list = listM58485a;
            strM58487c = exerciseData.getExerciseId();
            numM58486b = null;
            if (strM58487c == null) {
                aVar = null;
            } else {
                if (z19) {
                    strM58487c = null;
                } else {
                    strM58487c = null;
                }
                if (strM58487c != null) {
                    aVar = new AbstractC20973i.a(strM58487c);
                } else {
                    aVar = null;
                }
            }
            if (z24) {
                numM58486b = exerciseData.getEndIconResource();
            }
            num = numM58486b;
            zM58494j = exerciseData.getIsFullWorkoutSummary();
            c23454a0 = C23454a0.f92919a;
            if (zM58494j) {
                TextResource textResourceM58491g15 = exerciseData.getTitleDisplay();
                TextResource textResourceM58490f15 = exerciseData.getSubtitleDisplay();
                if (aVar == null) {
                    obj3 = c23454a0;
                } else {
                    obj3 = aVar;
                }
                aVar2 = new AbstractC27407m.d.b(textResourceM58491g15, textResourceM58490f15, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, num, obj3, list, 8, null);
            } else {
                TextResource textResourceM58491g16 = exerciseData.getTitleDisplay();
                TextResource textResourceM58490f16 = exerciseData.getSubtitleDisplay();
                String strM58488d8 = exerciseData.getImageUrl();
                if (aVar == null) {
                    obj = c23454a0;
                } else {
                    obj = aVar;
                }
                if (aVar == null) {
                    obj2 = c23454a0;
                } else {
                    obj2 = aVar;
                }
                aVar2 = new AbstractC27407m.d.a(textResourceM58491g16, textResourceM58490f16, strM58488d8, null, null, obj, new InterfaceC27402h.c(exerciseData.getTonnageStat(), exerciseData.getVolumeStat(), exerciseData.getIntensityStat(), false, 8, null), false, null, false, false, num, obj2, list, 1944, null);
            }
            InterfaceC25312u interfaceC25312u8 = aVar2;
            if ((i15 & 112) == 32) {
            }
            objM87133R = c28655q.m87133R();
            if (z25) {
                objM87133R = new C20983o(function3, 7);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C20983o(function3, 7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u8, null, null, (Function1) objM87133R, c28655q, AbstractC27407m.d.f110334v, 6);
            z17 = z19;
            z18 = z24;
        } else {
            c28655q.m87138X();
            function3 = function2;
            z17 = z14;
            z18 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2559k4(exerciseData, function3, z17, z18, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m58252i(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m58253j(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC20973i.a) {
            function1.invoke(((AbstractC20973i.a) event).getExerciseId());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m58254k(C20994z c20994z, Function1 function1, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        m58251h(c20994z, function1, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0203  */
    /* JADX WARN: Code duplicated, block: B:102:0x0211  */
    /* JADX WARN: Code duplicated, block: B:107:0x025f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0261  */
    /* JADX WARN: Code duplicated, block: B:111:0x0269  */
    /* JADX WARN: Code duplicated, block: B:115:0x0271  */
    /* JADX WARN: Code duplicated, block: B:117:0x02af  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0121  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125  */
    /* JADX WARN: Code duplicated, block: B:90:0x013a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0148  */
    /* JADX WARN: Code duplicated, block: B:95:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m58255l(final C20980l0 weightliftingExercises, int i13, AbstractC29701y state, InterfaceC4339a onViewAllClicked, Function1 function1, boolean z4, boolean z13, Composer composer, int i14, int i15) {
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        boolean z15;
        int i24;
        boolean z16;
        InterfaceC4339a interfaceC4339a;
        Function1 function2;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        final boolean z19;
        final boolean z24;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i25;
        int iHashCode2;
        Object[] objArr;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(weightliftingExercises, "weightliftingExercises");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewAllClicked, "onViewAllClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1810601211);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87157i(weightliftingExercises) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(state) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(onViewAllClicked) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i26 = i15 & 16;
        if (i26 == 0) {
            if ((i14 & 24576) == 0) {
                i16 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    z14 = z4;
                    if (c28655q.m87155h(z14)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 64;
                if (i19 != 0) {
                    if ((1572864 & i14) == 0) {
                        z15 = z13;
                        if (c28655q.m87155h(z15)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                    if ((i16 & 599187) != 599186) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i16 & 1, z16)) {
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C20756e(21);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function3 = (Function1) objM87133R2;
                        } else {
                            function3 = function1;
                        }
                        if (i17 != 0) {
                            z19 = false;
                        } else {
                            z19 = z14;
                        }
                        if (i19 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        C2314t c2314t = C2314t.f9131w;
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        final Function1 function4 = function3;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        float f13 = 8 * 2;
                        i25 = i16;
                        boolean z25 = z19;
                        boolean z26 = z24;
                        AbstractC12240d.m34066d(state, AbstractC1099a.m3396r(AbstractC1091c.m3355a(c2314t, null, 3), 0.0f, f13, 1), AbstractC1099a.m3379a(f13, 0.0f, 2), null, 0, 4 * 3, null, null, false, null, null, null, AbstractC37817c.m121344e(-381044548, c28655q, new InterfaceC4352n() { // from class: iw0.a0
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC20962c0.m58257n(weightliftingExercises, function4, z19, z24, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                            }
                        }), c28655q, ((i16 >> 6) & 14) | 196992, 24576, 16344);
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
                        C2306l c2306l = C2299e.f9108K;
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        C23000t1 c23000t1 = C23000t1.f90727a;
                        AbstractC22953f.m66715b(c28655q, c23000t1.mo66772c(c2314t, true, 1.0f));
                        AbstractC22070c.m63138d(i13, state.m91162k(), c23000t1.mo66772c(c2314t, true, 1.0f), 0L, 0L, c28655q, (i25 >> 3) & 14, 24);
                        Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                        EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                        TextResource textResourceM58333c = weightliftingExercises.getViewAllLabelDisplay();
                        C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
                        if ((i25 & 7168) == 2048) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (!objArr == true || objM87133R == c28676v0) {
                            interfaceC4339a = onViewAllClicked;
                            objM87133R = new C20984p(interfaceC4339a, 1);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            interfaceC4339a = onViewAllClicked;
                        }
                        AbstractC27265l0.m82217i(modifierMo66772c, enumC27269n0, textResourceM58333c, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
                        c28655q = c28655q;
                        AbstractC17176i.m48516r(c28655q, true, c2314t, f13, c28655q);
                        c28655q.m87173q(true);
                        z17 = z25;
                        z18 = z26;
                        function2 = function4;
                    } else {
                        interfaceC4339a = onViewAllClicked;
                        c28655q.m87138X();
                        function2 = function1;
                        z17 = z14;
                        z18 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C20960b0(weightliftingExercises, i13, state, interfaceC4339a, function2, z17, z18, i14, i15);
                    }
                }
                i16 |= 1572864;
                z15 = z13;
                if ((i16 & 599187) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20756e(21);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function1;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i19 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    C2314t c2314t2 = C2314t.f9131w;
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    final Function1 function5 = function3;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i5 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                    float f14 = 8 * 2;
                    i25 = i16;
                    boolean z27 = z19;
                    boolean z28 = z24;
                    AbstractC12240d.m34066d(state, AbstractC1099a.m3396r(AbstractC1091c.m3355a(c2314t2, null, 3), 0.0f, f14, 1), AbstractC1099a.m3379a(f14, 0.0f, 2), null, 0, 4 * 3, null, null, false, null, null, null, AbstractC37817c.m121344e(-381044548, c28655q, new InterfaceC4352n() { // from class: iw0.a0
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC20962c0.m58257n(weightliftingExercises, function5, z19, z24, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                        }
                    }), c28655q, ((i16 >> 6) & 14) | 196992, 24576, 16344);
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14);
                    C2306l c2306l2 = C2299e.f9108K;
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                    C23000t1 c23000t2 = C23000t1.f90727a;
                    AbstractC22953f.m66715b(c28655q, c23000t2.mo66772c(c2314t2, true, 1.0f));
                    AbstractC22070c.m63138d(i13, state.m91162k(), c23000t2.mo66772c(c2314t2, true, 1.0f), 0L, 0L, c28655q, (i25 >> 3) & 14, 24);
                    Modifier modifierMo66772c2 = c23000t2.mo66772c(c2314t2, true, 1.0f);
                    EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                    TextResource textResourceM58333c2 = weightliftingExercises.getViewAllLabelDisplay();
                    C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
                    if ((i25 & 7168) == 2048) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objArr == true) {
                        interfaceC4339a = onViewAllClicked;
                        objM87133R = new C20984p(interfaceC4339a, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a = onViewAllClicked;
                        objM87133R = new C20984p(interfaceC4339a, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27265l0.m82217i(modifierMo66772c2, enumC27269n1, textResourceM58333c2, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
                    c28655q = c28655q;
                    AbstractC17176i.m48516r(c28655q, true, c2314t2, f14, c28655q);
                    c28655q.m87173q(true);
                    z17 = z27;
                    z18 = z28;
                    function2 = function5;
                } else {
                    interfaceC4339a = onViewAllClicked;
                    c28655q.m87138X();
                    function2 = function1;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C20960b0(weightliftingExercises, i13, state, interfaceC4339a, function2, z17, z18, i14, i15);
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z14 = z4;
            i19 = i15 & 64;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                if ((i16 & 599187) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20756e(21);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function1;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i19 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    C2314t c2314t3 = C2314t.f9131w;
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t3);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    final Function1 function6 = function3;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i8 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                    C0209i c0209i9 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                    float f15 = 8 * 2;
                    i25 = i16;
                    boolean z29 = z19;
                    boolean z210 = z24;
                    AbstractC12240d.m34066d(state, AbstractC1099a.m3396r(AbstractC1091c.m3355a(c2314t3, null, 3), 0.0f, f15, 1), AbstractC1099a.m3379a(f15, 0.0f, 2), null, 0, 4 * 3, null, null, false, null, null, null, AbstractC37817c.m121344e(-381044548, c28655q, new InterfaceC4352n() { // from class: iw0.a0
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC20962c0.m58257n(weightliftingExercises, function6, z19, z24, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                        }
                    }), c28655q, ((i16 >> 6) & 14) | 196992, 24576, 16344);
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f15);
                    C2306l c2306l3 = C2299e.f9108K;
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t3);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22971kM66746i3, c2306l3, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                    C23000t1 c23000t3 = C23000t1.f90727a;
                    AbstractC22953f.m66715b(c28655q, c23000t3.mo66772c(c2314t3, true, 1.0f));
                    AbstractC22070c.m63138d(i13, state.m91162k(), c23000t3.mo66772c(c2314t3, true, 1.0f), 0L, 0L, c28655q, (i25 >> 3) & 14, 24);
                    Modifier modifierMo66772c3 = c23000t3.mo66772c(c2314t3, true, 1.0f);
                    EnumC27269n0 enumC27269n2 = EnumC27269n0.TextSmall;
                    TextResource textResourceM58333c3 = weightliftingExercises.getViewAllLabelDisplay();
                    C39274g c39274g3 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
                    if ((i25 & 7168) == 2048) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objArr == true) {
                        interfaceC4339a = onViewAllClicked;
                        objM87133R = new C20984p(interfaceC4339a, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a = onViewAllClicked;
                        objM87133R = new C20984p(interfaceC4339a, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27265l0.m82217i(modifierMo66772c3, enumC27269n2, textResourceM58333c3, null, c39274g3, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
                    c28655q = c28655q;
                    AbstractC17176i.m48516r(c28655q, true, c2314t3, f15, c28655q);
                    c28655q.m87173q(true);
                    z17 = z29;
                    z18 = z210;
                    function2 = function6;
                } else {
                    interfaceC4339a = onViewAllClicked;
                    c28655q.m87138X();
                    function2 = function1;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C20960b0(weightliftingExercises, i13, state, interfaceC4339a, function2, z17, z18, i14, i15);
                }
            }
            i16 |= 1572864;
            z15 = z13;
            if ((i16 & 599187) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C20756e(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i19 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                C2314t c2314t4 = C2314t.f9131w;
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                final Function1 function7 = function3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                float f16 = 8 * 2;
                i25 = i16;
                boolean z211 = z19;
                boolean z212 = z24;
                AbstractC12240d.m34066d(state, AbstractC1099a.m3396r(AbstractC1091c.m3355a(c2314t4, null, 3), 0.0f, f16, 1), AbstractC1099a.m3379a(f16, 0.0f, 2), null, 0, 4 * 3, null, null, false, null, null, null, AbstractC37817c.m121344e(-381044548, c28655q, new InterfaceC4352n() { // from class: iw0.a0
                    @Override // c93.InterfaceC4352n
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC20962c0.m58257n(weightliftingExercises, function7, z19, z24, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                    }
                }), c28655q, ((i16 >> 6) & 14) | 196992, 24576, 16344);
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f16);
                C2306l c2306l4 = C2299e.f9108K;
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t4);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22971kM66746i4, c2306l4, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
                C23000t1 c23000t4 = C23000t1.f90727a;
                AbstractC22953f.m66715b(c28655q, c23000t4.mo66772c(c2314t4, true, 1.0f));
                AbstractC22070c.m63138d(i13, state.m91162k(), c23000t4.mo66772c(c2314t4, true, 1.0f), 0L, 0L, c28655q, (i25 >> 3) & 14, 24);
                Modifier modifierMo66772c4 = c23000t4.mo66772c(c2314t4, true, 1.0f);
                EnumC27269n0 enumC27269n3 = EnumC27269n0.TextSmall;
                TextResource textResourceM58333c4 = weightliftingExercises.getViewAllLabelDisplay();
                C39274g c39274g4 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
                if ((i25 & 7168) == 2048) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                objM87133R = c28655q.m87133R();
                if (objArr == true) {
                    interfaceC4339a = onViewAllClicked;
                    objM87133R = new C20984p(interfaceC4339a, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC4339a = onViewAllClicked;
                    objM87133R = new C20984p(interfaceC4339a, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(modifierMo66772c4, enumC27269n3, textResourceM58333c4, null, c39274g4, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
                c28655q = c28655q;
                AbstractC17176i.m48516r(c28655q, true, c2314t4, f16, c28655q);
                c28655q.m87173q(true);
                z17 = z211;
                z18 = z212;
                function2 = function7;
            } else {
                interfaceC4339a = onViewAllClicked;
                c28655q.m87138X();
                function2 = function1;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20960b0(weightliftingExercises, i13, state, interfaceC4339a, function2, z17, z18, i14, i15);
            }
        }
        i16 |= 24576;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                z14 = z4;
                if (c28655q.m87155h(z14)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                if ((i16 & 599187) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i16 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C20756e(21);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function1;
                    }
                    if (i17 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i19 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    C2314t c2314t5 = C2314t.f9131w;
                    Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t5);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    final Function1 function8 = function3;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f9);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a5);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m9);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N9);
                    float f17 = 8 * 2;
                    i25 = i16;
                    boolean z213 = z19;
                    boolean z214 = z24;
                    AbstractC12240d.m34066d(state, AbstractC1099a.m3396r(AbstractC1091c.m3355a(c2314t5, null, 3), 0.0f, f17, 1), AbstractC1099a.m3379a(f17, 0.0f, 2), null, 0, 4 * 3, null, null, false, null, null, null, AbstractC37817c.m121344e(-381044548, c28655q, new InterfaceC4352n() { // from class: iw0.a0
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC20962c0.m58257n(weightliftingExercises, function8, z19, z24, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                        }
                    }), c28655q, ((i16 >> 6) & 14) | 196992, 24576, 16344);
                    C22971k c22971kM66746i5 = AbstractC22977m.m66746i(f17);
                    C2306l c2306l5 = C2299e.f9108K;
                    Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t5);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22971kM66746i5, c2306l5, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f10);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                    C23000t1 c23000t5 = C23000t1.f90727a;
                    AbstractC22953f.m66715b(c28655q, c23000t5.mo66772c(c2314t5, true, 1.0f));
                    AbstractC22070c.m63138d(i13, state.m91162k(), c23000t5.mo66772c(c2314t5, true, 1.0f), 0L, 0L, c28655q, (i25 >> 3) & 14, 24);
                    Modifier modifierMo66772c5 = c23000t5.mo66772c(c2314t5, true, 1.0f);
                    EnumC27269n0 enumC27269n4 = EnumC27269n0.TextSmall;
                    TextResource textResourceM58333c5 = weightliftingExercises.getViewAllLabelDisplay();
                    C39274g c39274g5 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
                    if ((i25 & 7168) == 2048) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objArr == true) {
                        interfaceC4339a = onViewAllClicked;
                        objM87133R = new C20984p(interfaceC4339a, 1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a = onViewAllClicked;
                        objM87133R = new C20984p(interfaceC4339a, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27265l0.m82217i(modifierMo66772c5, enumC27269n4, textResourceM58333c5, null, c39274g5, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
                    c28655q = c28655q;
                    AbstractC17176i.m48516r(c28655q, true, c2314t5, f17, c28655q);
                    c28655q.m87173q(true);
                    z17 = z213;
                    z18 = z214;
                    function2 = function8;
                } else {
                    interfaceC4339a = onViewAllClicked;
                    c28655q.m87138X();
                    function2 = function1;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C20960b0(weightliftingExercises, i13, state, interfaceC4339a, function2, z17, z18, i14, i15);
                }
            }
            i16 |= 1572864;
            z15 = z13;
            if ((i16 & 599187) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C20756e(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i19 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                C2314t c2314t6 = C2314t.f9131w;
                Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t6);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                final Function1 function9 = function3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3409f11);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i17 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i17, c23010xM66775a6);
                C0209i c0209i18 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N11);
                float f18 = 8 * 2;
                i25 = i16;
                boolean z215 = z19;
                boolean z216 = z24;
                AbstractC12240d.m34066d(state, AbstractC1099a.m3396r(AbstractC1091c.m3355a(c2314t6, null, 3), 0.0f, f18, 1), AbstractC1099a.m3379a(f18, 0.0f, 2), null, 0, 4 * 3, null, null, false, null, null, null, AbstractC37817c.m121344e(-381044548, c28655q, new InterfaceC4352n() { // from class: iw0.a0
                    @Override // c93.InterfaceC4352n
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC20962c0.m58257n(weightliftingExercises, function9, z19, z24, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                    }
                }), c28655q, ((i16 >> 6) & 14) | 196992, 24576, 16344);
                C22971k c22971kM66746i6 = AbstractC22977m.m66746i(f18);
                C2306l c2306l6 = C2299e.f9108K;
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t6);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22971kM66746i6, c2306l6, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f12);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N12);
                C23000t1 c23000t6 = C23000t1.f90727a;
                AbstractC22953f.m66715b(c28655q, c23000t6.mo66772c(c2314t6, true, 1.0f));
                AbstractC22070c.m63138d(i13, state.m91162k(), c23000t6.mo66772c(c2314t6, true, 1.0f), 0L, 0L, c28655q, (i25 >> 3) & 14, 24);
                Modifier modifierMo66772c6 = c23000t6.mo66772c(c2314t6, true, 1.0f);
                EnumC27269n0 enumC27269n5 = EnumC27269n0.TextSmall;
                TextResource textResourceM58333c6 = weightliftingExercises.getViewAllLabelDisplay();
                C39274g c39274g6 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
                if ((i25 & 7168) == 2048) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                objM87133R = c28655q.m87133R();
                if (objArr == true) {
                    interfaceC4339a = onViewAllClicked;
                    objM87133R = new C20984p(interfaceC4339a, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC4339a = onViewAllClicked;
                    objM87133R = new C20984p(interfaceC4339a, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(modifierMo66772c6, enumC27269n5, textResourceM58333c6, null, c39274g6, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
                c28655q = c28655q;
                AbstractC17176i.m48516r(c28655q, true, c2314t6, f18, c28655q);
                c28655q.m87173q(true);
                z17 = z215;
                z18 = z216;
                function2 = function9;
            } else {
                interfaceC4339a = onViewAllClicked;
                c28655q.m87138X();
                function2 = function1;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20960b0(weightliftingExercises, i13, state, interfaceC4339a, function2, z17, z18, i14, i15);
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z14 = z4;
        i19 = i15 & 64;
        if (i19 != 0) {
            if ((1572864 & i14) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            if ((i16 & 599187) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i16 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C20756e(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i19 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                C2314t c2314t7 = C2314t.f9131w;
                Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t7);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                final Function1 function10 = function3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3409f13);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i110, c23010xM66775a7);
                C0209i c0209i111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m13);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N13);
                float f19 = 8 * 2;
                i25 = i16;
                boolean z217 = z19;
                boolean z218 = z24;
                AbstractC12240d.m34066d(state, AbstractC1099a.m3396r(AbstractC1091c.m3355a(c2314t7, null, 3), 0.0f, f19, 1), AbstractC1099a.m3379a(f19, 0.0f, 2), null, 0, 4 * 3, null, null, false, null, null, null, AbstractC37817c.m121344e(-381044548, c28655q, new InterfaceC4352n() { // from class: iw0.a0
                    @Override // c93.InterfaceC4352n
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC20962c0.m58257n(weightliftingExercises, function10, z19, z24, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                    }
                }), c28655q, ((i16 >> 6) & 14) | 196992, 24576, 16344);
                C22971k c22971kM66746i7 = AbstractC22977m.m66746i(f19);
                C2306l c2306l7 = C2299e.f9108K;
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t7);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22971kM66746i7, c2306l7, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3409f14);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a7);
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N14);
                C23000t1 c23000t7 = C23000t1.f90727a;
                AbstractC22953f.m66715b(c28655q, c23000t7.mo66772c(c2314t7, true, 1.0f));
                AbstractC22070c.m63138d(i13, state.m91162k(), c23000t7.mo66772c(c2314t7, true, 1.0f), 0L, 0L, c28655q, (i25 >> 3) & 14, 24);
                Modifier modifierMo66772c7 = c23000t7.mo66772c(c2314t7, true, 1.0f);
                EnumC27269n0 enumC27269n6 = EnumC27269n0.TextSmall;
                TextResource textResourceM58333c7 = weightliftingExercises.getViewAllLabelDisplay();
                C39274g c39274g7 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
                if ((i25 & 7168) == 2048) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                objM87133R = c28655q.m87133R();
                if (objArr == true) {
                    interfaceC4339a = onViewAllClicked;
                    objM87133R = new C20984p(interfaceC4339a, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC4339a = onViewAllClicked;
                    objM87133R = new C20984p(interfaceC4339a, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27265l0.m82217i(modifierMo66772c7, enumC27269n6, textResourceM58333c7, null, c39274g7, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
                c28655q = c28655q;
                AbstractC17176i.m48516r(c28655q, true, c2314t7, f19, c28655q);
                c28655q.m87173q(true);
                z17 = z217;
                z18 = z218;
                function2 = function10;
            } else {
                interfaceC4339a = onViewAllClicked;
                c28655q.m87138X();
                function2 = function1;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20960b0(weightliftingExercises, i13, state, interfaceC4339a, function2, z17, z18, i14, i15);
            }
        }
        i16 |= 1572864;
        z15 = z13;
        if ((i16 & 599187) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i16 & 1, z16)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C20756e(21);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function1;
            }
            if (i17 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i19 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            C2314t c2314t8 = C2314t.f9131w;
            Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t8);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            final Function1 function11 = function3;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3409f15);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i113 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i113, c23010xM66775a8);
            C0209i c0209i114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m15);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N15);
            float f110 = 8 * 2;
            i25 = i16;
            boolean z219 = z19;
            boolean z2110 = z24;
            AbstractC12240d.m34066d(state, AbstractC1099a.m3396r(AbstractC1091c.m3355a(c2314t8, null, 3), 0.0f, f110, 1), AbstractC1099a.m3379a(f110, 0.0f, 2), null, 0, 4 * 3, null, null, false, null, null, null, AbstractC37817c.m121344e(-381044548, c28655q, new InterfaceC4352n() { // from class: iw0.a0
                @Override // c93.InterfaceC4352n
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC20962c0.m58257n(weightliftingExercises, function11, z19, z24, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
                }
            }), c28655q, ((i16 >> 6) & 14) | 196992, 24576, 16344);
            C22971k c22971kM66746i8 = AbstractC22977m.m66746i(f110);
            C2306l c2306l8 = C2299e.f9108K;
            Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t8);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(c22971kM66746i8, c2306l8, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f16);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i113, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m16);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N16);
            C23000t1 c23000t8 = C23000t1.f90727a;
            AbstractC22953f.m66715b(c28655q, c23000t8.mo66772c(c2314t8, true, 1.0f));
            AbstractC22070c.m63138d(i13, state.m91162k(), c23000t8.mo66772c(c2314t8, true, 1.0f), 0L, 0L, c28655q, (i25 >> 3) & 14, 24);
            Modifier modifierMo66772c8 = c23000t8.mo66772c(c2314t8, true, 1.0f);
            EnumC27269n0 enumC27269n7 = EnumC27269n0.TextSmall;
            TextResource textResourceM58333c8 = weightliftingExercises.getViewAllLabelDisplay();
            C39274g c39274g8 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
            if ((i25 & 7168) == 2048) {
                objArr = true;
            } else {
                objArr = false;
            }
            objM87133R = c28655q.m87133R();
            if (objArr == true) {
                interfaceC4339a = onViewAllClicked;
                objM87133R = new C20984p(interfaceC4339a, 1);
                c28655q.m87172p0(objM87133R);
            } else {
                interfaceC4339a = onViewAllClicked;
                objM87133R = new C20984p(interfaceC4339a, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27265l0.m82217i(modifierMo66772c8, enumC27269n7, textResourceM58333c8, null, c39274g8, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (TextResource.$stable << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
            c28655q = c28655q;
            AbstractC17176i.m48516r(c28655q, true, c2314t8, f110, c28655q);
            c28655q.m87173q(true);
            z17 = z219;
            z18 = z2110;
            function2 = function11;
        } else {
            interfaceC4339a = onViewAllClicked;
            c28655q.m87138X();
            function2 = function1;
            z17 = z14;
            z18 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20960b0(weightliftingExercises, i13, state, interfaceC4339a, function2, z17, z18, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m58256m(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m58257n(C20980l0 c20980l0, Function1 function1, boolean z4, boolean z13, InterfaceC29694r HorizontalPager, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        m58251h(c20980l0.getExerciseSummaryCarousel().m58282a().get(i13), function1, z4, z13, composer, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m58258o(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m58259p(C20980l0 c20980l0, int i13, AbstractC29701y abstractC29701y, InterfaceC4339a interfaceC4339a, Function1 function1, boolean z4, boolean z13, int i14, int i15, Composer composer, int i16) {
        m58255l(c20980l0, i13, abstractC29701y, interfaceC4339a, function1, z4, z13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
