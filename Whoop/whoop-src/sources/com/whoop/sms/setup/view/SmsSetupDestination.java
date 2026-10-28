package com.whoop.sms.setup.view;

import androidx.annotation.Keep;
import ge3.AbstractC15751g;
import java.util.List;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/sms/setup/view/SmsSetupDestination;", "", "<init>", "(Ljava/lang/String;I)V", "INTRO", "INPUT", "ENTER_CODE", "COMPLETED", "TERMS_OF_SERVICE", "getNextStep", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum SmsSetupDestination {
    INTRO,
    INPUT,
    ENTER_CODE,
    COMPLETED,
    TERMS_OF_SERVICE;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final SmsSetupDestination getNextStep() {
        List listM118959K = AbstractC37056f.m118959K(INTRO, INPUT, ENTER_CODE, COMPLETED);
        int iIndexOf = listM118959K.indexOf(this);
        if (iIndexOf < 0 || iIndexOf >= listM118959K.size() - 1) {
            return null;
        }
        return (SmsSetupDestination) listM118959K.get(iIndexOf + 1);
    }
}
