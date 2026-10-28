package u00;

import com.stripe.android.p056ui.core.elements.NameSpec;
import com.stripe.android.p056ui.core.elements.TranslationId;
import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.C15440w2;
import h20.C16689l1;
import h20.EnumC16683k1;
import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: u00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C34374b extends EnumC34376d {
    public C34374b() {
        super("Name", 0);
    }

    @Override // u00.EnumC34376d
    /* JADX INFO: renamed from: a */
    public final EnumC16683k1 mo108672a(C16689l1 configuration) {
        AbstractC22676k.m65750j(configuration, "configuration");
        return configuration.f64189w;
    }

    @Override // u00.EnumC34376d
    /* JADX INFO: renamed from: b */
    public final C15440w2 mo108673b(LinkedHashMap linkedHashMap) {
        return new NameSpec((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null).transform(linkedHashMap);
    }
}
