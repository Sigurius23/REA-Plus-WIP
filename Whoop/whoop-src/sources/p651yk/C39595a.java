package p651yk;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: yk.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39595a implements InterfaceC39596b {

    /* JADX INFO: renamed from: c */
    public static final String[] f170337c = {"_data"};

    /* JADX INFO: renamed from: d */
    public static final String[] f170338d = {"_data"};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f170339a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f170340b;

    public /* synthetic */ C39595a(ContentResolver contentResolver, int i13) {
        this.f170339a = i13;
        this.f170340b = contentResolver;
    }

    @Override // p651yk.InterfaceC39596b
    /* JADX INFO: renamed from: a */
    public final Cursor mo126478a(Uri uri) {
        switch (this.f170339a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f170340b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f170337c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f170340b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f170338d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
