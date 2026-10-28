package ps1;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.room.AbstractC1772c1;
import e93.AbstractC12889b;
import i93.C18284j;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import ns1.AbstractC27104b;
import or2.C28143a;
import or2.C28144a0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p236j.C21062a;
import p463rj.AbstractC31484o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34820i0;
import ud3.C34844u0;
import wb3.AbstractC37056f;
import x83.AbstractC38093j;
import yb3.C39412p;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ps1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\"\u0016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'¨\u0006("}, m65681d2 = {"Lps1/a;", "", "Lor2/a0;", "fileManager", "Lor2/a;", "androidUriUtils", "Lps1/b;", "pdfProcessor", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "<init>", "(Lor2/a0;Lor2/a;Lps1/b;Lzr2/a;Ltr2/n;)V", "Landroid/net/Uri;", "uri", "", "c", "(Landroid/net/Uri;)Ljava/lang/String;", "Lj/a;", "result", "", "b", "(Lj/a;)Ljava/util/List;", "Lns1/b;", "d", "(Lj/a;Lq83/d;)Ljava/lang/Object;", "uris", "e", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "filePaths", "Lps1/a$b;", "f", "(Ljava/util/List;)Lps1/a$b;", "a", "Lor2/a0;", "Lor2/a;", "Lps1/b;", "Lzr2/a;", "Ltr2/n;", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29503a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final int f119961g = 8;

    /* JADX INFO: renamed from: h */
    private static final Map<String, String> f119962h = AbstractC25247g0.m73990Y(new C23465k("pdf", MimeType.MIME_TYPE_PDF), new C23465k("jpg", "image/jpeg"), new C23465k("jpeg", "image/jpeg"), new C23465k("png", "image/png"));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28144a0 fileManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28143a androidUriUtils;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29504b pdfProcessor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ps1.a$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lps1/a$a;", "", "<init>", "()V", "", "", "a", "()[Ljava/lang/String;", "", "SUPPORTED_MIME_TYPES", "Ljava/util/Map;", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String[] m90146a() {
            return (String[]) AbstractC25265s.m74159y0(C29503a.f119962h.values()).toArray(new String[0]);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ps1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lps1/a$b;", "", "<init>", "()V", "b", "a", "Lps1/a$b$a;", "Lps1/a$b$b;", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: ps1.a$b$a */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lps1/a$b$a;", "Lps1/a$b;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String message) {
                super(null);
                AbstractC22676k.m65750j(message, "message");
                this.message = message;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.message, ((a) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("Error(message=", this.message, ")");
            }
        }

        /* JADX INFO: renamed from: ps1.a$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lps1/a$b$b;", "Lps1/a$b;", "", "Lud3/i0;", "multiparts", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42187b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final List<C34820i0> multiparts;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42187b(List<C34820i0> multiparts) {
                super(null);
                AbstractC22676k.m65750j(multiparts, "multiparts");
                this.multiparts = multiparts;
            }

            /* JADX INFO: renamed from: a */
            public final List<C34820i0> m90148a() {
                return this.multiparts;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42187b) && AbstractC22676k.m65745e(this.multiparts, ((C42187b) other).multiparts);
            }

            public int hashCode() {
                return this.multiparts.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106654m("Success(multiparts=", ")", this.multiparts);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: ps1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labfileupload.processor.TestUploadFileProcessor", m100430f = "TestUploadFileProcessor.kt", m100431l = {85, 96}, m100432m = "processFiles", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f119970E;

        /* JADX INFO: renamed from: F */
        Object f119971F;

        /* JADX INFO: renamed from: G */
        Object f119972G;

        /* JADX INFO: renamed from: H */
        Object f119973H;

        /* JADX INFO: renamed from: I */
        Object f119974I;

        /* JADX INFO: renamed from: J */
        Object f119975J;

        /* JADX INFO: renamed from: K */
        Object f119976K;

        /* JADX INFO: renamed from: L */
        Object f119977L;

        /* JADX INFO: renamed from: M */
        Object f119978M;

        /* JADX INFO: renamed from: N */
        int f119979N;

        /* JADX INFO: renamed from: O */
        int f119980O;

        /* JADX INFO: renamed from: P */
        int f119981P;

        /* JADX INFO: renamed from: Q */
        int f119982Q;

        /* JADX INFO: renamed from: R */
        int f119983R;

        /* JADX INFO: renamed from: S */
        int f119984S;

        /* JADX INFO: renamed from: T */
        int f119985T;

        /* JADX INFO: renamed from: U */
        int f119986U;

        /* JADX INFO: renamed from: V */
        /* synthetic */ Object f119987V;

        /* JADX INFO: renamed from: X */
        int f119989X;

        /* JADX INFO: renamed from: w */
        Object f119990w;

        /* JADX INFO: renamed from: x */
        Object f119991x;

        /* JADX INFO: renamed from: y */
        Object f119992y;

        /* JADX INFO: renamed from: z */
        Object f119993z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119987V = obj;
            this.f119989X |= Integer.MIN_VALUE;
            return C29503a.this.m90144e(null, this);
        }
    }

    public C29503a(C28144a0 fileManager, C28143a androidUriUtils, C29504b pdfProcessor, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(fileManager, "fileManager");
        AbstractC22676k.m65750j(androidUriUtils, "androidUriUtils");
        AbstractC22676k.m65750j(pdfProcessor, "pdfProcessor");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.fileManager = fileManager;
        this.androidUriUtils = androidUriUtils;
        this.pdfProcessor = pdfProcessor;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final List<Uri> m90141b(C21062a result) {
        Intent intent;
        int i13 = result.f79915w;
        C25271y c25271y = C25271y.f99162w;
        if (i13 != -1 || (intent = result.f79916x) == null) {
            return c25271y;
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return AbstractC37056f.m118960L(intent.getData());
        }
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, clipData.getItemCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = c18284jM36278i0.iterator();
        while (it.hasNext()) {
            Uri uri = clipData.getItemAt(((AbstractC25243e0) it).nextInt()).getUri();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        return AbstractC25265s.m74159y0(arrayList);
    }

    /* JADX INFO: renamed from: c */
    private final String m90142c(Uri uri) {
        Object next;
        String strM85156a = this.androidUriUtils.m85156a(uri);
        Iterator<T> it = f119962h.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((Map.Entry) next).getValue(), strM85156a));
        Map.Entry entry = (Map.Entry) next;
        String str = entry != null ? (String) entry.getKey() : null;
        if (str != null) {
            return ".".concat(str);
        }
        this.logger.mo85226q("Unsupported MIME type for TestUpload: " + strM85156a + " (URI: " + uri + ")", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Object m90143d(C21062a c21062a, InterfaceC30057d<? super List<? extends AbstractC27104b>> interfaceC30057d) {
        return m90144e(m90141b(c21062a), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:118:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc A[Catch: Exception -> 0x00bf, IOException -> 0x00c3, SecurityException -> 0x00c8, TryCatch #12 {IOException -> 0x00c3, SecurityException -> 0x00c8, Exception -> 0x00bf, blocks: (B:34:0x00f6, B:36:0x00fc, B:38:0x011b, B:20:0x00ac), top: B:126:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:38:0x011b A[Catch: Exception -> 0x00bf, IOException -> 0x00c3, SecurityException -> 0x00c8, TRY_LEAVE, TryCatch #12 {IOException -> 0x00c3, SecurityException -> 0x00c8, Exception -> 0x00bf, blocks: (B:34:0x00f6, B:36:0x00fc, B:38:0x011b, B:20:0x00ac), top: B:126:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0174  */
    /* JADX WARN: Code duplicated, block: B:41:0x0177  */
    /* JADX WARN: Code duplicated, block: B:44:0x0185 A[Catch: Exception -> 0x01a7, IOException -> 0x01b1, SecurityException -> 0x01bc, TRY_LEAVE, TryCatch #10 {IOException -> 0x01b1, SecurityException -> 0x01bc, Exception -> 0x01a7, blocks: (B:42:0x0181, B:44:0x0185), top: B:130:0x0181 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0213  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x026e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x019e -> B:46:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0213 -> B:116:0x0219). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x023c -> B:70:0x0228). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0275 -> B:90:0x027a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public final java.lang.Object m90144e(java.util.List<? extends android.net.Uri> r20, q83.InterfaceC30057d<? super java.util.List<? extends ns1.AbstractC27104b>> r21) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ps1.C29503a.m90144e(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    public final b m90145f(List<String> filePaths) {
        AbstractC22676k.m65750j(filePaths, "filePaths");
        if (filePaths.isEmpty()) {
            return new b.a("No files selected for upload");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : filePaths) {
            C34820i0 c34820i0M96963o = null;
            try {
                File file = new File(str);
                if (file.exists()) {
                    Map<String, String> map = f119962h;
                    String lowerCase = AbstractC38093j.m122039m(file).toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                    String str2 = map.get(lowerCase);
                    if (str2 == null) {
                        this.logger.mo85222m("Unsupported file type: " + str, new AbstractC30556a.a[0]);
                    } else {
                        String name = file.getName();
                        C34844u0 c34844u0 = AbstractC34846v0.Companion;
                        C39412p c39412p = C34818h0.f146589e;
                        C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J(str2);
                        c34844u0.getClass();
                        c34820i0M96963o = AbstractC31484o.m96963o("files", name, C34844u0.m109924a(file, c34818h0M5373J));
                    }
                } else {
                    this.logger.mo85222m("File not found: " + str, new AbstractC30556a.a[0]);
                }
            } catch (SecurityException e5) {
                this.logger.mo85230v(AbstractC11266d.m30461o("Permission denied accessing file: ", str), e5, new AbstractC30556a.a[0]);
            } catch (Exception e13) {
                this.logger.mo85230v(AbstractC11266d.m30461o("Failed to process file: ", str), e13, new AbstractC30556a.a[0]);
            }
            if (c34820i0M96963o != null) {
                arrayList.add(c34820i0M96963o);
            }
        }
        if (!arrayList.isEmpty()) {
            return new b.C42187b(arrayList);
        }
        this.logger.mo85222m("No files could be processed for upload", new AbstractC30556a.a[0]);
        return new b.a("All files failed validation");
    }

    public /* synthetic */ C29503a(C28144a0 c28144a0, C28143a c28143a, C29504b c29504b, InterfaceC41070a interfaceC41070a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28144a0, c28143a, c29504b, interfaceC41070a, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TestUploadFileProcessor") : interfaceC34116n);
    }
}
