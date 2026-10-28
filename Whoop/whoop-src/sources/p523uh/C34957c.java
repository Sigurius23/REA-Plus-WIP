package p523uh;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import fi.C14509o;
import gi.C15870a;
import gi.C15878i;
import gi.InterfaceC15872c;
import java.io.FileNotFoundException;
import java.util.List;
import m83.AbstractC25265s;
import ne3.AbstractC26604b;
import p461rh.AbstractC31426o;
import p461rh.C31436y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import sh.C32481g;
import sh.C32493s;
import sh.EnumC32482h;

/* JADX INFO: renamed from: uh.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C34957c implements InterfaceC34960f {

    /* JADX INFO: renamed from: a */
    public final C31436y f147924a;

    /* JADX INFO: renamed from: b */
    public final C14509o f147925b;

    public C34957c(C31436y c31436y, C14509o c14509o) {
        this.f147924a = c31436y;
        this.f147925b = c14509o;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    @Override // p523uh.InterfaceC34960f
    /* JADX INFO: renamed from: a */
    public final Object mo9540a(InterfaceC30057d interfaceC30057d) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listM96744h;
        int size;
        Bundle bundle;
        C31436y c31436y = this.f147924a;
        Uri uri = Uri.parse(c31436y.f129327a);
        C14509o c14509o = this.f147925b;
        ContentResolver contentResolver = c14509o.f53003a.getContentResolver();
        String str = c31436y.f129330d;
        if (AbstractC22676k.m65745e(str, "com.android.contacts") && AbstractC22676k.m65745e(AbstractC25265s.m74114R0(AbstractC31426o.m96744h(c31436y)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && AbstractC22676k.m65745e(str, "media") && (size = (listM96744h = AbstractC31426o.m96744h(c31436y)).size()) >= 3 && AbstractC22676k.m65745e(listM96744h.get(size - 3), "audio") && AbstractC22676k.m65745e(listM96744h.get(size - 2), "albums")) {
            C15878i c15878i = c14509o.f53004b;
            InterfaceC15872c interfaceC15872c = c15878i.f59993a;
            C15870a c15870a = interfaceC15872c instanceof C15870a ? (C15870a) interfaceC15872c : null;
            if (c15870a != null) {
                int i13 = c15870a.f59978a;
                InterfaceC15872c interfaceC15872c2 = c15878i.f59994b;
                C15870a c15870a2 = interfaceC15872c2 instanceof C15870a ? (C15870a) interfaceC15872c2 : null;
                if (c15870a2 != null) {
                    int i14 = c15870a2.f59978a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i13, i14));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new C34962h(new C32493s(AbstractC26604b.m79158c(AbstractC26604b.m79166k(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), c14509o.f53008f, new C32481g(c31436y, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), EnumC32482h.f134509y);
    }
}
