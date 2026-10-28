package jf0;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34799a1;
import ud3.C34850x0;

/* JADX INFO: renamed from: jf0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R0\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ljf0/c;", "", "Lkotlin/Function1;", "Lq83/d;", "Lpg3/v0;", "Lud3/a1;", "downloadTextFunction", "Ltr2/n;", "logger", "<init>", "(Lkotlin/jvm/functions/Function1;Ltr2/n;)V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "a", "(Landroid/content/Context;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21640c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 downloadTextFunction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: jf0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.util.TextFileDownloadHelper", m100430f = "TextFileDownloadHelper.kt", m100431l = {27, 32}, m100432m = "downloadAndSaveToUri", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f83086E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f83087F;

        /* JADX INFO: renamed from: H */
        int f83089H;

        /* JADX INFO: renamed from: w */
        Object f83090w;

        /* JADX INFO: renamed from: x */
        Object f83091x;

        /* JADX INFO: renamed from: y */
        Object f83092y;

        /* JADX INFO: renamed from: z */
        Object f83093z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83087F = obj;
            this.f83089H |= Integer.MIN_VALUE;
            return C21640c.this.m60893a(null, null, this);
        }
    }

    public C21640c(Function1 downloadTextFunction, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(downloadTextFunction, "downloadTextFunction");
        AbstractC22676k.m65750j(logger, "logger");
        this.downloadTextFunction = downloadTextFunction;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b2 A[Catch: IOException -> 0x0045, TryCatch #0 {IOException -> 0x0045, blocks: (B:13:0x0041, B:37:0x00aa, B:39:0x00b2, B:40:0x00c6, B:20:0x0059, B:26:0x0078, B:28:0x0080, B:30:0x0087, B:33:0x008f, B:42:0x00db, B:43:0x00e5, B:23:0x0060), top: B:48:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[Catch: IOException -> 0x0045, TryCatch #0 {IOException -> 0x0045, blocks: (B:13:0x0041, B:37:0x00aa, B:39:0x00b2, B:40:0x00c6, B:20:0x0059, B:26:0x0078, B:28:0x0080, B:30:0x0087, B:33:0x008f, B:42:0x00db, B:43:0x00e5, B:23:0x0060), top: B:48:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00b2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00c6, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final Object m60893a(Context context, Uri uri, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        Uri uri2;
        boolean zBooleanValue;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f83089H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f83089H = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objInvoke = aVar.f83087F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f83089H;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objInvoke);
                this.logger.mo85228t("Starting text file download and save", new AbstractC30556a.a[0]);
                Function1 function1 = this.downloadTextFunction;
                aVar.f83090w = context;
                aVar.f83091x = uri;
                aVar.f83089H = 1;
                objInvoke = function1.invoke(aVar);
                if (objInvoke == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                uri = (Uri) aVar.f83091x;
                context = (Context) aVar.f83090w;
                AbstractC34132o.m107864I(objInvoke);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uri2 = (Uri) aVar.f83091x;
                AbstractC34132o.m107864I(objInvoke);
            }
            zBooleanValue = ((Boolean) objInvoke).booleanValue();
            if (zBooleanValue) {
                this.logger.mo85228t("Text file saved successfully to: " + uri2, new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m("Failed to save text file to: " + uri2, new AbstractC30556a.a[0]);
            }
            z4 = zBooleanValue;
            return Boolean.valueOf(z4);
            C29218v0 c29218v0 = (C29218v0) objInvoke;
            C34850x0 c34850x0 = c29218v0.f118269a;
            if (c34850x0.f146788Q) {
                AbstractC34799a1 abstractC34799a1 = (AbstractC34799a1) c29218v0.f118270b;
                String strM109860m = abstractC34799a1 != null ? abstractC34799a1.m109860m() : null;
                if (strM109860m != null) {
                    C21641d c21641d = new C21641d(context, this.logger);
                    aVar.f83090w = null;
                    aVar.f83091x = uri;
                    aVar.f83092y = null;
                    aVar.f83093z = null;
                    aVar.f83086E = null;
                    aVar.f83089H = 2;
                    objInvoke = c21641d.m60896c(uri, strM109860m, aVar);
                    if (objInvoke != enumC31071a) {
                        uri2 = uri;
                        zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        if (zBooleanValue) {
                            this.logger.mo85228t("Text file saved successfully to: " + uri2, new AbstractC30556a.a[0]);
                        } else {
                            this.logger.mo85222m("Failed to save text file to: " + uri2, new AbstractC30556a.a[0]);
                        }
                        z4 = zBooleanValue;
                    }
                    return enumC31071a;
                }
                this.logger.mo85222m("Text file download failed: Response body was null despite successful HTTP status", new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m("Failed to download text file: HTTP " + c34850x0.f146792z + " - " + c34850x0.f146791y, new AbstractC30556a.a[0]);
            }
        } catch (IOException e5) {
            this.logger.mo85230v("Network error during text file download", e5, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    public /* synthetic */ C21640c(Function1 function1, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TextFileDownloadHelper") : interfaceC34116n);
    }
}
