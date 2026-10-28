package jf0;

import android.content.Context;
import android.net.Uri;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.io.IOException;
import java.io.OutputStream;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import va3.AbstractC35854l;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: jf0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ljf0/d;", "", "Landroid/content/Context;", "context", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Ltr2/n;)V", "Landroid/net/Uri;", "uri", "", "textData", "", "c", "(Landroid/net/Uri;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21641d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: jf0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.util.TextFileUtil$writeTextToUri$2", m100430f = "TextFileUtil.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f83096E;

        /* JADX INFO: renamed from: w */
        int f83097w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f83098x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Uri f83100z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83100z = uri;
            this.f83096E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C21641d.this.new a(this.f83100z, this.f83096E, interfaceC30057d);
            aVar.f83098x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f83097w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean z4 = false;
            try {
                OutputStream outputStreamOpenOutputStream = C21641d.this.context.getContentResolver().openOutputStream(this.f83100z);
                if (outputStreamOpenOutputStream != null) {
                    String str = this.f83096E;
                    C21641d c21641d = C21641d.this;
                    Uri uri = this.f83100z;
                    try {
                        byte[] bytes = str.getBytes(AbstractC39397a.f169546a);
                        AbstractC22676k.m65749i(bytes, "getBytes(...)");
                        outputStreamOpenOutputStream.write(bytes);
                        outputStreamOpenOutputStream.flush();
                        c21641d.logger.mo85228t("Successfully wrote text to URI: " + uri, new AbstractC30556a.a[0]);
                        outputStreamOpenOutputStream.close();
                        z4 = true;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(outputStreamOpenOutputStream, th3);
                            throw th4;
                        }
                    }
                } else {
                    C21641d c21641d2 = C21641d.this;
                    Uri uri2 = this.f83100z;
                    c21641d2.logger.mo85222m("Failed to open output stream for URI: " + uri2, new AbstractC30556a.a[0]);
                }
            } catch (IOException e5) {
                C21641d.this.logger.mo85230v(AbstractC31061c.m95637m(this.f83100z, "IOException writing text to URI: "), e5, new AbstractC30556a.a[0]);
            }
            return Boolean.valueOf(z4);
        }
    }

    public C21641d(Context context, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    public final Object m60896c(Uri uri, String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new a(uri, str, null), interfaceC30057d);
    }
}
