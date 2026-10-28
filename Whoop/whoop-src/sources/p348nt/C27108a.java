package p348nt;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import lt.InterfaceC24720c;
import lt.InterfaceC24721d;
import p381ot.C28320f;

/* JADX INFO: renamed from: nt.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C27108a implements InterfaceC24720c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108350a;

    @Override // lt.InterfaceC24718a
    /* JADX INFO: renamed from: a */
    public final void mo41739a(Object obj, Object obj2) {
        switch (this.f108350a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC24721d interfaceC24721d = (InterfaceC24721d) obj2;
                interfaceC24721d.mo72382d(C28320f.f114203g, entry.getKey());
                interfaceC24721d.mo72382d(C28320f.f114204h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
