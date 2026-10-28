package x21;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16278g;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p408q.C29660d;
import p709he2.C17216b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x21.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0097\u0001\u0010\u0011\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001ak\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018²\u0006\u000e\u0010\u0017\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "textResource", "", "currentValue", "minimumValue", "maximumValue", "", "isButtonEnabled", "Lkotlin/Function1;", "Ll83/a0;", "onNumberChanged", "onSavedClicked", "updateValue", "showButton", "trailingText", "", "formatter", "i", "(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lx21/a;", "pickerState", "k", "(Lx21/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "selectedNumber", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37861d {
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:117:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x016d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:125:0x0178  */
    /* JADX WARN: Code duplicated, block: B:127:0x0180  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122  */
    /* JADX INFO: renamed from: i */
    public static final void m121396i(final TextResource textResource, final int i13, final int i14, final int i15, final boolean z4, final Function1 onNumberChanged, final Function1 onSavedClicked, boolean z13, boolean z14, TextResource textResource2, Function1 function1, Composer composer, final int i16, final int i17, final int i18) {
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z15;
        boolean z16;
        int i27;
        boolean z17;
        int i28;
        TextResource textResourceM21267a;
        int i29;
        int i34;
        int i35;
        boolean z18;
        final Function1 function2;
        final boolean z19;
        final TextResource textResource3;
        final boolean z24;
        C28677v1 c28677v1M87180u;
        boolean z25;
        boolean z26;
        TextResource textResource4;
        int i36;
        boolean z27;
        boolean z28;
        Function1 function3;
        AbstractC22676k.m65750j(onNumberChanged, "onNumberChanged");
        AbstractC22676k.m65750j(onSavedClicked, "onSavedClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1109632974);
        if ((i16 & 6) == 0) {
            i19 = (c28655q.m87153g(textResource) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i24 = i13;
            i19 |= c28655q.m87149e(i24) ? 32 : 16;
        } else {
            i24 = i13;
        }
        if ((i16 & 384) == 0) {
            i25 = i14;
            i19 |= c28655q.m87149e(i25) ? 256 : 128;
        } else {
            i25 = i14;
        }
        if ((i16 & 3072) == 0) {
            i26 = i15;
            i19 |= c28655q.m87149e(i26) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            i26 = i15;
        }
        if ((i16 & 24576) == 0) {
            z15 = z4;
            i19 |= c28655q.m87155h(z15) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            z15 = z4;
        }
        if ((196608 & i16) == 0) {
            i19 |= c28655q.m87157i(onNumberChanged) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i16) == 0) {
            i19 |= c28655q.m87157i(onSavedClicked) ? 1048576 : 524288;
        }
        int i37 = i18 & 128;
        if (i37 == 0) {
            if ((12582912 & i16) == 0) {
                z16 = z13;
                i19 |= c28655q.m87155h(z16) ? 8388608 : 4194304;
            }
            i27 = i18 & 256;
            if (i27 != 0) {
                i19 |= 100663296;
                z17 = z14;
            } else {
                z17 = z14;
                if ((i16 & 100663296) == 0) {
                    if (c28655q.m87155h(z17)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i19 |= i28;
                }
            }
            if ((i16 & 805306368) == 0) {
                if ((i18 & 512) == 0) {
                    textResourceM21267a = textResource2;
                    int i38 = c28655q.m87153g(textResourceM21267a) ? 536870912 : 268435456;
                    i19 |= i38;
                } else {
                    textResourceM21267a = textResource2;
                }
                i19 |= i38;
            } else {
                textResourceM21267a = textResource2;
            }
            i29 = i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i29 != 0) {
                i34 = i17 | 6;
            } else if ((i17 & 6) == 0) {
                if (c28655q.m87157i(function1)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i34 = i17 | i35;
            } else {
                i34 = i17;
            }
            if ((i19 & 306783379) == 306783378 || (i34 & 3) != 2) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i19 & 1, z18)) {
                c28655q.m87140Z();
                if ((i16 & 1) != 0 || c28655q.m87118C()) {
                    z25 = i37 == 0 ? z16 : false;
                    z26 = i27 == 0 ? z17 : true;
                    if ((i18 & 512) != 0) {
                        i19 &= -1879048193;
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i29 != 0) {
                        int i39 = i19;
                        function3 = null;
                        i36 = i39;
                        textResource4 = textResourceM21267a;
                        z27 = z25;
                        z28 = z26;
                    } else {
                        textResource4 = textResourceM21267a;
                        i36 = i19;
                        z27 = z25;
                        z28 = z26;
                        function3 = function1;
                    }
                } else {
                    c28655q.m87138X();
                    if ((i18 & 512) != 0) {
                        i19 &= -1879048193;
                    }
                    textResource4 = textResourceM21267a;
                    i36 = i19;
                    function3 = function1;
                    z28 = z17;
                    z27 = z16;
                }
                c28655q.m87175r();
                m121398k(C37858a.INSTANCE.m121387a(textResource, i24, i25, i26, z15, textResource4), onNumberChanged, onSavedClicked, z27, z28, function3, c28655q, ((i34 << 15) & 458752) | ((i36 >> 12) & 65520), 0);
                z24 = z27;
                z19 = z28;
                function2 = function3;
                textResource3 = textResource4;
            } else {
                c28655q.m87138X();
                function2 = function1;
                z19 = z17;
                textResource3 = textResourceM21267a;
                z24 = z16;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: x21.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC37861d.m121397j(textResource, i13, i14, i15, z4, onNumberChanged, onSavedClicked, z24, z19, textResource3, function2, i16, i17, i18, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i19 |= 12582912;
        z16 = z13;
        i27 = i18 & 256;
        if (i27 != 0) {
            i19 |= 100663296;
            z17 = z14;
        } else {
            z17 = z14;
            if ((i16 & 100663296) == 0) {
                if (c28655q.m87155h(z17)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i19 |= i28;
            }
        }
        if ((i16 & 805306368) == 0) {
            if ((i18 & 512) == 0) {
                textResourceM21267a = textResource2;
                if (c28655q.m87153g(textResourceM21267a)) {
                }
                i19 |= i38;
            } else {
                textResourceM21267a = textResource2;
            }
            i19 |= i38;
        } else {
            textResourceM21267a = textResource2;
        }
        i29 = i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i29 != 0) {
            i34 = i17 | 6;
        } else if ((i17 & 6) == 0) {
            if (c28655q.m87157i(function1)) {
                i35 = 4;
            } else {
                i35 = 2;
            }
            i34 = i17 | i35;
        } else {
            i34 = i17;
        }
        if ((i19 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (c28655q.m87135U(i19 & 1, z18)) {
            c28655q.m87140Z();
            if ((i16 & 1) != 0) {
                if (i37 == 0) {
                }
                if (i27 == 0) {
                }
                if ((i18 & 512) != 0) {
                    i19 &= -1879048193;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i29 != 0) {
                    int i310 = i19;
                    function3 = null;
                    i36 = i310;
                    textResource4 = textResourceM21267a;
                    z27 = z25;
                    z28 = z26;
                } else {
                    textResource4 = textResourceM21267a;
                    i36 = i19;
                    z27 = z25;
                    z28 = z26;
                    function3 = function1;
                }
            } else {
                if (i37 == 0) {
                }
                if (i27 == 0) {
                }
                if ((i18 & 512) != 0) {
                    i19 &= -1879048193;
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i29 != 0) {
                    int i311 = i19;
                    function3 = null;
                    i36 = i311;
                    textResource4 = textResourceM21267a;
                    z27 = z25;
                    z28 = z26;
                } else {
                    textResource4 = textResourceM21267a;
                    i36 = i19;
                    z27 = z25;
                    z28 = z26;
                    function3 = function1;
                }
            }
            c28655q.m87175r();
            m121398k(C37858a.INSTANCE.m121387a(textResource, i24, i25, i26, z15, textResource4), onNumberChanged, onSavedClicked, z27, z28, function3, c28655q, ((i34 << 15) & 458752) | ((i36 >> 12) & 65520), 0);
            z24 = z27;
            z19 = z28;
            function2 = function3;
            textResource3 = textResource4;
        } else {
            c28655q.m87138X();
            function2 = function1;
            z19 = z17;
            textResource3 = textResourceM21267a;
            z24 = z16;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: x21.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC37861d.m121397j(textResource, i13, i14, i15, z4, onNumberChanged, onSavedClicked, z24, z19, textResource3, function2, i16, i17, i18, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m121397j(TextResource textResource, int i13, int i14, int i15, boolean z4, Function1 function1, Function1 function2, boolean z13, boolean z14, TextResource textResource2, Function1 function3, int i16, int i17, int i18, Composer composer, int i19) {
        m121396i(textResource, i13, i14, i15, z4, function1, function2, z13, z14, textResource2, function3, composer, AbstractC28683x.m87244L(i16 | 1), AbstractC28683x.m87244L(i17), i18);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Failed to calculate best type for var: r10v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v10 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v2 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r50v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r50v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r50v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r50v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: k */
    private static final void m121398k(x21.C37858a r43, p715kotlin.jvm.functions.Function1 r44, p715kotlin.jvm.functions.Function1 r45, boolean r46, boolean r47, p715kotlin.jvm.functions.Function1 r48, androidx.compose.runtime.Composer r49, int r50, int r51) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x21.AbstractC37861d.m121398k(x21.a, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: l */
    private static final int m121399l(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: m */
    private static final void m121400m(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final NumberPicker m121401n(C37858a c37858a, final Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, final String str, Context it) {
        AbstractC22676k.m65750j(it, "it");
        NumberPicker numberPicker = new NumberPicker(new C29660d(it, AbstractC16278g.f62408c));
        numberPicker.setOnValueChangedListener(new C17216b(function2, interfaceC28601c1, 2));
        numberPicker.setMinValue(c37858a.getMinimumValue());
        numberPicker.setMaxValue(c37858a.getMaximumValue());
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setValue(c37858a.getCurrentValue());
        numberPicker.setDescendantFocusability(393216);
        if (function1 == null) {
            final int i13 = 1;
            numberPicker.setFormatter(new NumberPicker.Formatter() { // from class: x21.c
                @Override // android.widget.NumberPicker.Formatter
                public final String format(int i14) {
                    switch (i13) {
                        case 0:
                            return AbstractC37861d.m121403p((Function1) str, i14);
                        default:
                            return AbstractC37861d.m121404q((String) str, i14);
                    }
                }
            });
            return numberPicker;
        }
        final int i14 = 0;
        numberPicker.setFormatter(new NumberPicker.Formatter() { // from class: x21.c
            @Override // android.widget.NumberPicker.Formatter
            public final String format(int i15) {
                switch (i14) {
                    case 0:
                        return AbstractC37861d.m121403p((Function1) function1, i15);
                    default:
                        return AbstractC37861d.m121404q((String) function1, i15);
                }
            }
        });
        int iM121383c = c37858a.getMinimumValue();
        int iM121382b = c37858a.getMaximumValue();
        if (iM121383c <= iM121382b) {
            while (true) {
                View childAt = numberPicker.getChildAt(iM121383c - c37858a.getMinimumValue());
                if (childAt != null && (childAt instanceof EditText)) {
                    ((EditText) childAt).setFilters(new InputFilter[0]);
                }
                if (iM121383c == iM121382b) {
                    break;
                }
                iM121383c++;
            }
        }
        return numberPicker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m121402o(Function1 function1, InterfaceC28601c1 interfaceC28601c1, NumberPicker numberPicker, int i13, int i14) {
        m121400m(interfaceC28601c1, i14);
        function1.invoke(Integer.valueOf(i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m121403p(Function1 function1, int i13) {
        return (String) function1.invoke(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final String m121404q(String str, int i13) {
        return i13 + " " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m121405r(boolean z4, C37858a c37858a, NumberPicker it) {
        AbstractC22676k.m65750j(it, "it");
        if (z4) {
            it.setValue(c37858a.getCurrentValue());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m121406s(C37858a c37858a, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        if (c37858a.getIsButtonEnabled()) {
            function1.invoke(Integer.valueOf(m121399l(interfaceC28601c1)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m121407t(C37858a c37858a, Function1 function1, Function1 function2, boolean z4, boolean z13, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m121398k(c37858a, function1, function2, z4, z13, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
