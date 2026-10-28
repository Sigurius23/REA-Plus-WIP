package p093dl;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p167g5.InterfaceC15485d;
import p586wk.C37330h;
import p586wk.InterfaceC37327e;
import p618xk.C38419j;
import sl.C32578d;

/* JADX INFO: renamed from: dl.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12131b implements InterfaceC12155t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40356a;

    /* JADX INFO: renamed from: b */
    public final Object f40357b;

    /* JADX INFO: renamed from: c */
    public final Object f40358c;

    public /* synthetic */ C12131b(int i13, Object obj, Object obj2) {
        this.f40356a = i13;
        this.f40357b = obj;
        this.f40358c = obj2;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final boolean mo33590a(Object obj) {
        switch (this.f40356a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                Iterator it = ((ArrayList) this.f40357b).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC12155t) it.next()).mo33590a(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return true;
        }
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: b */
    public final C12154s mo33591b(Object obj, int i13, int i14, C37330h c37330h) {
        C38419j c38419j;
        C12154s c12154sMo33591b;
        Uri uri;
        switch (this.f40356a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C32578d c32578d = new C32578d(uri2);
                AssetManager assetManager = (AssetManager) this.f40357b;
                switch (((C12129a) this.f40358c).f40352a) {
                    case 0:
                        c38419j = new C38419j(assetManager, strSubstring, 0);
                        break;
                    default:
                        c38419j = new C38419j(assetManager, strSubstring, 1);
                        break;
                }
                return new C12154s(c32578d, c38419j);
            case 1:
                ArrayList arrayList = (ArrayList) this.f40357b;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC37327e interfaceC37327e = null;
                for (int i15 = 0; i15 < size; i15++) {
                    InterfaceC12155t interfaceC12155t = (InterfaceC12155t) arrayList.get(i15);
                    if (interfaceC12155t.mo33590a(obj) && (c12154sMo33591b = interfaceC12155t.mo33591b(obj, i13, i14, c37330h)) != null) {
                        interfaceC37327e = c12154sMo33591b.f40407a;
                        arrayList2.add(c12154sMo33591b.f40409c);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC37327e == null) {
                    return null;
                }
                return new C12154s(interfaceC37327e, new C12158w(arrayList2, (InterfaceC15485d) this.f40358c));
            default:
                Integer num = (Integer) obj;
                Resources resources = (Resources) this.f40358c;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
                    break;
                } catch (Resources.NotFoundException e5) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e5);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC12155t) this.f40357b).mo33591b(uri, i13, i14, c37330h);
        }
    }

    public String toString() {
        switch (this.f40356a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f40357b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C12131b(Resources resources, InterfaceC12155t interfaceC12155t) {
        this.f40356a = 2;
        this.f40358c = resources;
        this.f40357b = interfaceC12155t;
    }
}
