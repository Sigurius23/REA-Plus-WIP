package io.getstream.chat.android.p226ui.common.images;

import ai.C0900f;
import ai.InterfaceC0898d;
import al0.C0971f;
import android.content.Context;
import android.os.StatFs;
import bi.C3272j;
import df2.C12000a;
import e93.AbstractC12889b;
import f93.C14289a;
import fi.AbstractC14504j;
import fi.AbstractC14505k;
import io.getstream.chat.android.client.internal.file.StreamFileManager;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import li.C24097f;
import m83.C25271y;
import mi2.C25592o;
import ne3.AbstractC26632p;
import ne3.C26603a0;
import ne3.C26611e0;
import ny0.C27266m;
import p249jc.C21567b;
import p253ji.C21708a;
import p461rh.C31414c;
import p461rh.C31415d;
import p461rh.C31419h;
import p461rh.C31424m;
import p461rh.C31436y;
import p461rh.InterfaceC31425n;
import p461rh.InterfaceC31432u;
import p552vh.C36033a;
import p615xh.InterfaceC38302i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p730qt2.C30599e;
import q83.AbstractC30060g;
import ro.C31624i;
import th.C33810h;
import th.InterfaceC33803a;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;", "Lrh/u;", "Lkotlin/Function1;", "Lrh/m;", "Ll83/a0;", "builder", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "Lxh/i;", "interceptors", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lrh/n;", "newImageLoader", "(Landroid/content/Context;)Lrh/n;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "fileManager", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamImageLoaderFactory implements InterfaceC31432u {
    public static final int $stable = 8;
    private final Function1 builder;
    private final StreamFileManager fileManager;
    private List<? extends InterfaceC38302i> interceptors;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamImageLoaderFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _init_$lambda$0(C31424m c31424m) {
        AbstractC22676k.m65750j(c31424m, "<this>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _init_$lambda$1(C31424m c31424m) {
        AbstractC22676k.m65750j(c31424m, "<this>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C0900f m55074c(Context context) {
        return (C0900f) newImageLoader$lambda$2(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C33810h m55075d(StreamImageLoaderFactory streamImageLoaderFactory, Context context) {
        return (C33810h) newImageLoader$lambda$3(streamImageLoaderFactory, context);
    }

    private static final InterfaceC0898d newImageLoader$lambda$2(Context context) {
        C31624i c31624i = new C31624i(3);
        c31624i.m97715w(context, 0.25d);
        return c31624i.m97711p();
    }

    private static final InterfaceC33803a newImageLoader$lambda$3(StreamImageLoaderFactory streamImageLoaderFactory, Context context) {
        C26603a0 c26603a0 = AbstractC26632p.f105900w;
        String str = C26611e0.f105848x;
        C26611e0 c26611e0M60607p = C21567b.m60607p(streamImageLoaderFactory.fileManager.getImageCache(context));
        long jM36286p = AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES;
        try {
            File file = c26611e0M60607p.toFile();
            file.mkdir();
            StatFs statFs = new StatFs(file.getAbsolutePath());
            jM36286p = AbstractC12889b.m36286p((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES, 262144000L);
        } catch (Exception unused) {
        }
        return new C33810h(jM36286p, c26603a0, c26611e0M60607p);
    }

    @Override // p461rh.InterfaceC31432u
    public final InterfaceC31425n newImageLoader(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C31424m c31424m = new C31424m(context);
        c31424m.f129293c = AbstractC30060g.m92088H(new C0971f(context, 7));
        C14289a c14289a = AbstractC14505k.f52993a;
        C14289a c14289a2 = AbstractC14505k.f52998f;
        Boolean bool = Boolean.FALSE;
        C31419h c31419h = c31424m.f129296f;
        c31419h.m96731a(c14289a2, bool);
        C14289a c14289a3 = AbstractC14504j.f52989a;
        c31419h.m96731a(AbstractC14505k.f52993a, new C21708a(200));
        c31424m.f129294d = AbstractC30060g.m92088H(new C25592o(21, this, context));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC38302i) it.next());
        }
        arrayList4.add(new C30599e(16, new C3272j(new C12000a(8)), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31436y.class)));
        int i13 = 0;
        arrayList5.add(new C31414c(new C36033a(true), i13));
        arrayList5.add(new C31414c(new C24097f(), i13));
        c31424m.f129295e = new C31415d(AbstractC37978j.m121637V(arrayList), AbstractC37978j.m121637V(arrayList2), AbstractC37978j.m121637V(arrayList3), AbstractC37978j.m121637V(arrayList4), AbstractC37978j.m121637V(arrayList5));
        this.builder.invoke(c31424m);
        return c31424m.m96736a();
    }

    public StreamImageLoaderFactory(Function1 builder) {
        AbstractC22676k.m65750j(builder, "builder");
        this.builder = builder;
        this.interceptors = C25271y.f99162w;
        this.fileManager = new StreamFileManager();
    }

    public /* synthetic */ StreamImageLoaderFactory(Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C27266m(13) : function1);
    }

    public /* synthetic */ StreamImageLoaderFactory(List list, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? new C27266m(12) : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamImageLoaderFactory(List<? extends InterfaceC38302i> interceptors, Function1 builder) {
        this(builder);
        AbstractC22676k.m65750j(interceptors, "interceptors");
        AbstractC22676k.m65750j(builder, "builder");
        this.interceptors = interceptors;
    }
}
