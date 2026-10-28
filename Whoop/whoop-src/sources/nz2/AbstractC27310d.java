package nz2;

import android.net.Uri;
import android.webkit.ValueCallback;
import c93.InterfaceC4339a;
import l83.C23454a0;
import no0.C26954j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nz2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\t\u001a\u001c\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00002 \u0010\u0006\u001a\u001c\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "currentCallback", "Lkotlin/Function1;", "Ll83/a0;", "setCallback", "Lkotlin/Function0;", "launchFileChooser", "b", "(Landroid/webkit/ValueCallback;Lkotlin/jvm/functions/Function1;Lc93/a;)Lkotlin/jvm/functions/Function1;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27310d {
    /* JADX INFO: renamed from: b */
    public static final Function1 m82460b(ValueCallback<Uri[]> valueCallback, Function1 setCallback, InterfaceC4339a launchFileChooser) {
        AbstractC22676k.m65750j(setCallback, "setCallback");
        AbstractC22676k.m65750j(launchFileChooser, "launchFileChooser");
        return new C26954j0((Object) valueCallback, setCallback, (Object) launchFileChooser, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m82461c(ValueCallback valueCallback, Function1 function1, InterfaceC4339a interfaceC4339a, ValueCallback valueCallback2) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        function1.invoke(valueCallback2);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }
}
