package com.stripe.android.p056ui.core.elements;

import androidx.core.app.NotificationCompat;
import ge3.AbstractC15751g;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wr1.C37572f;
import x30.C37876b1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/KeyboardType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "x30/b1", "Text", "Ascii", "Number", "Phone", "Uri", "Email", "Password", "NumberPassword", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public enum KeyboardType {
    Text,
    Ascii,
    Number,
    Phone,
    Uri,
    Email,
    Password,
    NumberPassword;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    public static final C37876b1 Companion = new C37876b1();
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37572f(20));

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.ui.core.elements.KeyboardType", values(), new String[]{"text", "ascii", "number", "phone", "uri", NotificationCompat.CATEGORY_EMAIL, "password", "number_password"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
