package com.whoop.whoopaction.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts$CreateDocument;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import aq0.C1904o;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p236j.AbstractC21065d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m65681d2 = {"Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/whoop/whoopaction/view/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/whoopaction/view/a;", "A", "()Lcom/whoop/whoopaction/view/a;", "setFileExportUtil$whoop_action_release", "(Lcom/whoop/whoopaction/view/a;)V", "fileExportUtil", "Lj/d;", "", "kotlin.jvm.PlatformType", "x", "Lj/d;", "createDocument", "y", "a", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DownloadedFileExportFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: z */
    public static final int f33128z = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private C10812a fileExportUtil = new C10812a();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final AbstractC21065d createDocument;

    /* JADX INFO: renamed from: com.whoop.whoopaction.view.DownloadedFileExportFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.view.DownloadedFileExportFragment$createDocument$1$1", m100430f = "DownloadedFileExportFragment.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10811b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33131w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C10812a.b f33133y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Uri f33134z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10811b(C10812a.b bVar, Uri uri, InterfaceC30057d<? super C10811b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33133y = bVar;
            this.f33134z = uri;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DownloadedFileExportFragment.this.new C10811b(this.f33133y, this.f33134z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10811b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM28445c;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33131w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10812a fileExportUtil = DownloadedFileExportFragment.this.getFileExportUtil();
                Context contextRequireContext = DownloadedFileExportFragment.this.requireContext();
                AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
                File fileM28448b = this.f33133y.getFile();
                Uri uri = this.f33134z;
                this.f33131w = 1;
                objM28445c = fileExportUtil.m28445c(contextRequireContext, fileM28448b, uri, this);
                if (objM28445c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM28445c = ((C23468n) obj).f92940w;
            }
            if (objM28445c instanceof C23467m) {
                Log.e("DownloadedFileExport", "Export failed", C23468n.m68037a(objM28445c));
            }
            AbstractC5583n.m16799z(DownloadedFileExportFragment.this).m36410z();
            return C23454a0.f92919a;
        }
    }

    public DownloadedFileExportFragment() {
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$CreateDocument(DfuBaseService.MIME_TYPE_OCTET_STREAM), new C1904o(this, 20));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.createDocument = abstractC21065dRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m28441z(DownloadedFileExportFragment downloadedFileExportFragment, Uri uri) {
        if (uri == null) {
            Log.w("DownloadedFileExport", "Document creation was cancelled or failed - URI is null");
            AbstractC5583n.m16799z(downloadedFileExportFragment).m36410z();
            return;
        }
        Bundle arguments = downloadedFileExportFragment.getArguments();
        C10812a.b bVarM28446d = downloadedFileExportFragment.fileExportUtil.m28446d(arguments != null ? arguments.getString("path") : null);
        if (bVarM28446d.getIsValid() && bVarM28446d.getFile() != null) {
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(downloadedFileExportFragment), null, null, downloadedFileExportFragment.new C10811b(bVarM28446d, uri, null), 3);
            return;
        }
        Log.e("DownloadedFileExport", "File validation failed: " + bVarM28446d.getErrorMessage());
        AbstractC5583n.m16799z(downloadedFileExportFragment).m36410z();
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final C10812a getFileExportUtil() {
        return this.fileExportUtil;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        String name;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        C10812a.b bVarM28446d = this.fileExportUtil.m28446d(arguments != null ? arguments.getString("path") : null);
        if (!bVarM28446d.getIsValid()) {
            Log.e("DownloadedFileExport", "File validation failed: " + bVarM28446d.getErrorMessage());
            AbstractC5583n.m16799z(this).m36410z();
            return;
        }
        AbstractC21065d abstractC21065d = this.createDocument;
        File fileM28448b = bVarM28446d.getFile();
        if (fileM28448b == null || (name = fileM28448b.getName()) == null) {
            name = "export";
        }
        abstractC21065d.mo4052a(name, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return null;
    }
}
