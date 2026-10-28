package os1;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import m83.C25271y;
import p236j.AbstractC21065d;
import p236j.C21062a;
import p236j.InterfaceC21063b;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ps1.C29503a;

/* JADX INFO: renamed from: os1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0013BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\f0\f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, m65681d2 = {"Los1/b;", "", "Landroidx/fragment/app/m0;", "fragment", "Lkotlin/Function1;", "Lj/a;", "Ll83/a0;", "onFilesSelected", "", "Landroid/net/Uri;", "onImagesSelected", "", "", "mimeTypes", "<init>", "(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;[Ljava/lang/String;)V", "e", "()V", "f", "a", "[Ljava/lang/String;", "Lj/d;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "b", "Lj/d;", "filePickerLauncher", "c", "imagePickerLauncher", "d", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28314b {

    /* JADX INFO: renamed from: d */
    private static final a f114193d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f114194e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String[] mimeTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21065d filePickerLauncher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21065d imagePickerLauncher;

    /* JADX INFO: renamed from: os1.b$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Los1/b$a;", "", "<init>", "()V", "", "GENERAL_CONTENT_TYPE", "Ljava/lang/String;", "IMAGE_MIME_TYPE", "lab-file-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C28314b(AbstractComponentCallbacksC1320m0 fragment, final Function1 onFilesSelected, final Function1 onImagesSelected, String[] mimeTypes) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(onFilesSelected, "onFilesSelected");
        AbstractC22676k.m65750j(onImagesSelected, "onImagesSelected");
        AbstractC22676k.m65750j(mimeTypes, "mimeTypes");
        this.mimeTypes = mimeTypes;
        final int i13 = 0;
        AbstractC21065d abstractC21065dRegisterForActivityResult = fragment.registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new InterfaceC21063b() { // from class: os1.a
            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i13) {
                    case 0:
                        C28314b.m85774c(onFilesSelected, (C21062a) obj);
                        break;
                    default:
                        C28314b.m85775d(onFilesSelected, (List) obj);
                        break;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.filePickerLauncher = abstractC21065dRegisterForActivityResult;
        final int i14 = 1;
        AbstractC21065d abstractC21065dRegisterForActivityResult2 = fragment.registerForActivityResult(new AbstractC22081b() { // from class: androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents
            @Override // p267k.AbstractC22081b
            public final Intent createIntent(Context context, Object obj) {
                String input = (String) obj;
                AbstractC22676k.m65750j(input, "input");
                Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                AbstractC22676k.m65749i(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
                return intentPutExtra;
            }

            @Override // p267k.AbstractC22081b
            public final C22080a getSynchronousResult(Context context, Object obj) {
                String input = (String) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input, "input");
                return null;
            }

            @Override // p267k.AbstractC22081b
            public final Object parseResult(int i15, Intent intent) {
                if (i15 != -1) {
                    intent = null;
                }
                C25271y c25271y = C25271y.f99162w;
                if (intent == null) {
                    return c25271y;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return c25271y;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i16 = 0; i16 < itemCount; i16++) {
                        Uri uri = clipData.getItemAt(i16).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }, new InterfaceC21063b() { // from class: os1.a
            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                switch (i14) {
                    case 0:
                        C28314b.m85774c(onImagesSelected, (C21062a) obj);
                        break;
                    default:
                        C28314b.m85775d(onImagesSelected, (List) obj);
                        break;
                }
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult2, "registerForActivityResult(...)");
        this.imagePickerLauncher = abstractC21065dRegisterForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m85774c(Function1 function1, C21062a c21062a) {
        AbstractC22676k.m65747g(c21062a);
        function1.invoke(c21062a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m85775d(Function1 function1, List list) {
        AbstractC22676k.m65747g(list);
        if (list.isEmpty()) {
            return;
        }
        function1.invoke(list);
    }

    /* JADX INFO: renamed from: e */
    public final void m85776e() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.putExtra("android.intent.extra.MIME_TYPES", this.mimeTypes);
        intent.addCategory("android.intent.category.OPENABLE");
        this.filePickerLauncher.mo4052a(Intent.createChooser(intent, null), null);
    }

    /* JADX INFO: renamed from: f */
    public final void m85777f() {
        this.imagePickerLauncher.mo4052a("image/*", null);
    }

    public /* synthetic */ C28314b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Function1 function1, Function1 function2, String[] strArr, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractComponentCallbacksC1320m0, function1, function2, (i13 & 8) != 0 ? C29503a.INSTANCE.m90146a() : strArr);
    }
}
