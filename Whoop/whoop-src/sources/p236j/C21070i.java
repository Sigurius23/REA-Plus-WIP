package p236j;

import androidx.core.app.ActivityOptionsCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p267k.AbstractC22081b;

/* JADX INFO: renamed from: j.i */
/* JADX INFO: loaded from: classes.dex */
public final class C21070i extends AbstractC21065d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79926a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC21071j f79927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f79928c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC22081b f79929d;

    public /* synthetic */ C21070i(AbstractC21071j abstractC21071j, String str, AbstractC22081b abstractC22081b, int i13) {
        this.f79926a = i13;
        this.f79927b = abstractC21071j;
        this.f79928c = str;
        this.f79929d = abstractC22081b;
    }

    @Override // p236j.AbstractC21065d
    /* JADX INFO: renamed from: a */
    public final void mo4052a(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        switch (this.f79926a) {
            case 0:
                AbstractC21071j abstractC21071j = this.f79927b;
                ArrayList arrayList = abstractC21071j.f79933d;
                LinkedHashMap linkedHashMap = abstractC21071j.f79931b;
                String str = this.f79928c;
                Object obj2 = linkedHashMap.get(str);
                AbstractC22081b abstractC22081b = this.f79929d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC22081b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    abstractC21071j.mo42997b(iIntValue, abstractC22081b, obj, activityOptionsCompat);
                    return;
                } catch (Exception e5) {
                    arrayList.remove(str);
                    throw e5;
                }
            default:
                AbstractC21071j abstractC21071j2 = this.f79927b;
                ArrayList arrayList2 = abstractC21071j2.f79933d;
                LinkedHashMap linkedHashMap2 = abstractC21071j2.f79931b;
                String str2 = this.f79928c;
                Object obj3 = linkedHashMap2.get(str2);
                AbstractC22081b abstractC22081b2 = this.f79929d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC22081b2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    abstractC21071j2.mo42997b(iIntValue2, abstractC22081b2, obj, activityOptionsCompat);
                    return;
                } catch (Exception e13) {
                    arrayList2.remove(str2);
                    throw e13;
                }
        }
    }

    @Override // p236j.AbstractC21065d
    /* JADX INFO: renamed from: b */
    public final void mo4053b() {
        switch (this.f79926a) {
            case 0:
                this.f79927b.m58916f(this.f79928c);
                break;
            default:
                this.f79927b.m58916f(this.f79928c);
                break;
        }
    }
}
