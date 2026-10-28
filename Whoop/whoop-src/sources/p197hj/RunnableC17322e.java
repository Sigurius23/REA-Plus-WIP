package p197hj;

import c93.InterfaceC4339a;
import com.amplitude.android.engagement.C4861a;
import java.util.Iterator;
import p031b9.AbstractC2875y;
import p328mj.C25609p;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: hj.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC17322e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67102w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4861a f67103x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f67104y;

    public /* synthetic */ RunnableC17322e(C4861a c4861a, String str, int i13) {
        this.f67102w = i13;
        this.f67103x = c4861a;
        this.f67104y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67102w) {
            case 0:
                C4861a c4861a = this.f67103x;
                c4861a.f20263d.m53801a(AbstractC31061c.m95633i(')', "globalThis.locationActions.setLocation(", this.f67104y), C17330m.f67124y);
                for (C25609p c25609p : c4861a.f20265f.values()) {
                    c25609p.getClass();
                    C4861a.f20259o.m16031I("Repositioning Nudges");
                    Iterator it = c25609p.f100471k.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4339a) it.next()).invoke();
                    }
                }
                break;
            default:
                String identifier = this.f67104y;
                AbstractC22676k.m65750j(identifier, "$identifier");
                this.f67103x.f20263d.m53801a(AbstractC2875y.m8300m("\n                        // Publish a \"click\" event (not \"tap\")\n                        window.engagement._.messageBus.publish('click', {\n                            event: {\n                                type: 'click',\n                                target: { identifier: '", identifier, "' }\n                            }\n                        });\n\n                        console.log('Published click event for identifier: ", identifier, "');\n                    "), null);
                break;
        }
    }
}
