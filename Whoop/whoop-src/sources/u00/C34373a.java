package u00;

import com.stripe.android.p056ui.core.elements.EmailSpec;
import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.C15440w2;
import h20.C16689l1;
import h20.EnumC16683k1;
import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: u00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C34373a extends EnumC34376d {
    public C34373a() {
        super("Email", 2);
    }

    @Override // u00.EnumC34376d
    /* JADX INFO: renamed from: a */
    public final EnumC16683k1 mo108672a(C16689l1 configuration) {
        AbstractC22676k.m65750j(configuration, "configuration");
        return configuration.f64191y;
    }

    @Override // u00.EnumC34376d
    /* JADX INFO: renamed from: b */
    public final C15440w2 mo108673b(LinkedHashMap linkedHashMap) {
        return new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null).transform(linkedHashMap);
    }
}
