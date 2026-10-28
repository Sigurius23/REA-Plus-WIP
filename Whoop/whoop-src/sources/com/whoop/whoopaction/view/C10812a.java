package com.whoop.whoopaction.view;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23468n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: com.whoop.whoopaction.view.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/whoopaction/view/a;", "", "<init>", "()V", "Ljava/io/File;", "sourceFile", "Ljava/io/OutputStream;", "outputStream", "Ll83/a0;", "b", "(Ljava/io/File;Ljava/io/OutputStream;)V", "", "path", "Lcom/whoop/whoopaction/view/a$b;", "d", "(Ljava/lang/String;)Lcom/whoop/whoopaction/view/a$b;", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "destinationUri", "Ll83/n;", "c", "(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;", "a", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class C10812a {

    /* JADX INFO: renamed from: com.whoop.whoopaction.view.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.view.FileExportUtil", m100430f = "FileExportUtil.kt", m100431l = {53}, m100432m = "copyFileToUri-BWLJW6A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f33140F;

        /* JADX INFO: renamed from: w */
        Object f33141w;

        /* JADX INFO: renamed from: x */
        Object f33142x;

        /* JADX INFO: renamed from: y */
        Object f33143y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f33144z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33144z = obj;
            this.f33140F |= Integer.MIN_VALUE;
            Object objM28445c = C10812a.this.m28445c(null, null, null, this);
            return objM28445c == EnumC31071a.f128113w ? objM28445c : new C23468n(objM28445c);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whoopaction.view.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.view.FileExportUtil$copyFileToUri$2", m100430f = "FileExportUtil.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ll83/n;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ll83/n;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C10812a f33145E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ File f33146F;

        /* JADX INFO: renamed from: w */
        int f33147w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f33148x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Context f33149y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Uri f33150z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, Uri uri, C10812a c10812a, File file, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33149y = context;
            this.f33150z = uri;
            this.f33145E = c10812a;
            this.f33146F = file;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f33149y, this.f33150z, this.f33145E, this.f33146F, interfaceC30057d);
            dVar.f33148x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23468n> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM107888l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33147w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Context context = this.f33149y;
            Uri uri = this.f33150z;
            C10812a c10812a = this.f33145E;
            File file = this.f33146F;
            try {
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
                if (outputStreamOpenOutputStream == null) {
                    throw new IOException("Failed to open output stream for " + uri);
                }
                try {
                    c10812a.m28444b(file, outputStreamOpenOutputStream);
                    outputStreamOpenOutputStream.close();
                    objM107888l = C23454a0.f92919a;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(outputStreamOpenOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                objM107888l = AbstractC34132o.m107888l(th5);
            }
            File file2 = this.f33146F;
            Uri uri2 = this.f33150z;
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                Log.e("FileExportUtil", "Failed to copy file: " + file2.getAbsolutePath() + " to " + uri2, thM68037a);
            }
            return new C23468n(objM107888l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m28444b(File sourceFile, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        try {
            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_MASK];
            for (int i13 = fileInputStream.read(bArr); i13 != -1; i13 = fileInputStream.read(bArr)) {
                outputStream.write(bArr, 0, i13);
            }
            outputStream.flush();
            fileInputStream.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(fileInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m28445c(Context context, File file, Uri uri, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f33140F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f33140F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM8705K = cVar.f33144z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f33140F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            d dVar = new d(context, uri, this, file, null);
            cVar.f33141w = null;
            cVar.f33142x = null;
            cVar.f33143y = null;
            cVar.f33140F = 1;
            objM8705K = AbstractC3006f0.m8705K(executorC22364d, dVar, cVar);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX INFO: renamed from: d */
    public final b m28446d(String path) {
        if (path == null || path.length() == 0) {
            return new b(false, null, "Path is null or empty", 2, null);
        }
        File file = new File(path);
        if (!file.exists()) {
            return new b(false, file, AbstractC11266d.m30461o("File does not exist: ", path));
        }
        return new b(true, file, null, 4, null);
    }

    /* JADX INFO: renamed from: com.whoop.whoopaction.view.a$b */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/whoopaction/view/a$b;", "", "", "isValid", "Ljava/io/File;", "file", "", "errorMessage", "<init>", "(ZLjava/io/File;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/io/File;", "()Ljava/io/File;", "Ljava/lang/String;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isValid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final File file;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String errorMessage;

        public b(boolean z4, File file, String str) {
            this.isValid = z4;
            this.file = file;
            this.errorMessage = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.isValid == bVar.isValid && AbstractC22676k.m65745e(this.file, bVar.file) && AbstractC22676k.m65745e(this.errorMessage, bVar.errorMessage);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isValid) * 31;
            File file = this.file;
            int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
            String str = this.errorMessage;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            boolean z4 = this.isValid;
            File file = this.file;
            String str = this.errorMessage;
            StringBuilder sb4 = new StringBuilder("FileValidationResult(isValid=");
            sb4.append(z4);
            sb4.append(", file=");
            sb4.append(file);
            sb4.append(", errorMessage=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ b(boolean z4, File file, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(z4, (i13 & 2) != 0 ? null : file, (i13 & 4) != 0 ? null : str);
        }
    }
}
