package gh;

import al0.C0971f;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import mh.C25545m;
import ne3.AbstractC26604b;
import p092dh.C12019f;
import p092dh.C12039z;
import p092dh.EnumC12020g;
import p098dt.AbstractC12350b;
import p341nh.C26707a;
import p341nh.C26714h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: gh.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C15835d implements InterfaceC15839h {

    /* JADX INFO: renamed from: a */
    public final Uri f59823a;

    /* JADX INFO: renamed from: b */
    public final C25545m f59824b;

    public C15835d(Uri uri, C25545m c25545m) {
        this.f59823a = uri;
        this.f59824b = c25545m;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    @Override // gh.InterfaceC15839h
    /* JADX INFO: renamed from: a */
    public final Object mo44670a(InterfaceC30057d interfaceC30057d) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        C25545m c25545m = this.f59824b;
        ContentResolver contentResolver = c25545m.f100135a.getContentResolver();
        Uri uri = this.f59823a;
        if (AbstractC22676k.m65745e(uri.getAuthority(), "com.android.contacts") && AbstractC22676k.m65745e(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && AbstractC22676k.m65745e(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && AbstractC22676k.m65745e(pathSegments.get(size - 3), "audio") && AbstractC22676k.m65745e(pathSegments.get(size - 2), "albums")) {
            C26714h c26714h = c25545m.f100138d;
            AbstractC12350b abstractC12350b = c26714h.f106217a;
            C26707a c26707a = abstractC12350b instanceof C26707a ? (C26707a) abstractC12350b : null;
            if (c26707a != null) {
                int i13 = c26707a.f106205a;
                AbstractC12350b abstractC12350b2 = c26714h.f106218b;
                C26707a c26707a2 = abstractC12350b2 instanceof C26707a ? (C26707a) abstractC12350b2 : null;
                if (c26707a2 != null) {
                    int i14 = c26707a2.f106205a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i13, i14));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
            }
        } else {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new C15845n(new C12039z(AbstractC26604b.m79158c(AbstractC26604b.m79166k(inputStreamOpenInputStream)), new C0971f(c25545m.f100135a, 2), new C12019f(uri)), contentResolver.getType(uri), EnumC12020g.f39763y);
    }
}
