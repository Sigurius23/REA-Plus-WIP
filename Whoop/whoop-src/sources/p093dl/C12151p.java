package p093dl;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import gl.C15937b0;
import p586wk.C37330h;
import p651yk.C39595a;
import p651yk.C39597c;
import sc3.AbstractC32398l;
import sl.C32578d;

/* JADX INFO: renamed from: dl.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C12151p implements InterfaceC12155t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40403a;

    /* JADX INFO: renamed from: b */
    public final Context f40404b;

    public C12151p(Context context, int i13) {
        this.f40403a = i13;
        switch (i13) {
            case 1:
                this.f40404b = context.getApplicationContext();
                break;
            case 2:
                this.f40404b = context.getApplicationContext();
                break;
            default:
                this.f40404b = context;
                break;
        }
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final boolean mo33590a(Object obj) {
        switch (this.f40403a) {
            case 0:
                return AbstractC32398l.m100975h((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC32398l.m100975h(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC32398l.m100975h(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: b */
    public final C12154s mo33591b(Object obj, int i13, int i14, C37330h c37330h) {
        Long l7;
        switch (this.f40403a) {
            case 0:
                Uri uri = (Uri) obj;
                return new C12154s(new C32578d(uri), new C12150o(0, this.f40404b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i13 == Integer.MIN_VALUE || i14 == Integer.MIN_VALUE || i13 > 512 || i14 > 384) {
                    return null;
                }
                C32578d c32578d = new C32578d(uri2);
                Context context = this.f40404b;
                return new C12154s(c32578d, new C12141g(2, uri2, new C39597c(ComponentCallbacks2C4960b.m15527c(context).f20292E.m558h(), new C39595a(context.getContentResolver(), 0), ComponentCallbacks2C4960b.m15527c(context).f20293F, context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i13 == Integer.MIN_VALUE || i14 == Integer.MIN_VALUE || i13 > 512 || i14 > 384 || (l7 = (Long) c37330h.m119569c(C15937b0.f60338d)) == null || l7.longValue() != -1) {
                    return null;
                }
                C32578d c32578d2 = new C32578d(uri3);
                Context context2 = this.f40404b;
                return new C12154s(c32578d2, new C12141g(2, uri3, new C39597c(ComponentCallbacks2C4960b.m15527c(context2).f20292E.m558h(), new C39595a(context2.getContentResolver(), 1), ComponentCallbacks2C4960b.m15527c(context2).f20293F, context2.getContentResolver())));
        }
    }
}
