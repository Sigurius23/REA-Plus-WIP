package my2;

import c93.InterfaceC4351m;
import com.whoop.whooplabs.data.room.entity.ProtocolStepMysticReading;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import java.util.regex.Pattern;
import oy2.InterfaceC28476b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: my2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ak\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Loy2/b$h;", "textInputState", "", "input", "c", "(Loy2/b$h;Ljava/lang/String;)Ljava/lang/String;", "Loy2/b$c;", "current", "reading", "Lzr2/a;", "dateAndTimeProvider", "Lkotlin/Function2;", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;", "", "updateMysticReading", "Lkotlin/Function1;", "markFieldAsInteracted", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "Ll83/a0;", "onSuccess", "Loy2/b;", "a", "(Loy2/b$c;Ljava/lang/String;Lzr2/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Loy2/b;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26034a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC28476b m77452a(InterfaceC28476b.c current, String reading, InterfaceC41070a dateAndTimeProvider, InterfaceC4351m updateMysticReading, Function1 markFieldAsInteracted, Function1 onSuccess) {
        AbstractC22676k.m65750j(current, "current");
        AbstractC22676k.m65750j(reading, "reading");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(updateMysticReading, "updateMysticReading");
        AbstractC22676k.m65750j(markFieldAsInteracted, "markFieldAsInteracted");
        AbstractC22676k.m65750j(onSuccess, "onSuccess");
        if (reading.equals("") || !m77453b(reading)) {
            ProtocolStepMysticReading mysticReading = current.getProtocolStepResult().getMysticReading();
            if (mysticReading == null) {
                mysticReading = new ProtocolStepMysticReading(dateAndTimeProvider.mo133367f(), null, null, null, 14, null);
            }
            try {
                ProtocolStepResult protocolStepResultCopy$default = ProtocolStepResult.copy$default(current.getProtocolStepResult(), 0, 0, 0, null, null, (ProtocolStepMysticReading) updateMysticReading.invoke(mysticReading, !reading.equals("") ? Integer.valueOf(Integer.parseInt(reading)) : null), false, null, null, null, null, null, 4063, null);
                onSuccess.invoke(protocolStepResultCopy$default);
                return (InterfaceC28476b) markFieldAsInteracted.invoke(InterfaceC28476b.c.m86448i(current, null, null, null, false, false, null, protocolStepResultCopy$default, null, null, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, false, false, false, -65, 31, null));
            } catch (NumberFormatException unused) {
            }
        }
        return current;
    }

    /* JADX INFO: renamed from: b */
    private static final boolean m77453b(String input) {
        Pattern patternCompile = Pattern.compile("[0-9]+");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        AbstractC22676k.m65750j(input, "input");
        return !patternCompile.matcher(input).matches();
    }

    /* JADX INFO: renamed from: c */
    public static final String m77454c(InterfaceC28476b.h textInputState, String str) {
        AbstractC22676k.m65750j(textInputState, "textInputState");
        if (str == null) {
            str = "";
        }
        Integer max = textInputState.getInputConfig().getMax();
        int iIntValue = max != null ? max.intValue() : Integer.MAX_VALUE;
        Integer min = textInputState.getInputConfig().getMin();
        int iIntValue2 = min != null ? min.intValue() : 0;
        if (str.length() == 0) {
            return null;
        }
        if (str.length() > iIntValue) {
            return textInputState.getInputConfig().getMaxErrorText();
        }
        if (str.length() < iIntValue2) {
            return textInputState.getInputConfig().getMinErrorText();
        }
        return null;
    }
}
