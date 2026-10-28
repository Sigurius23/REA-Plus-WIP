package p734sl0;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m83.C25271y;
import p179h.C16351i;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sl0.s1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lkotlin/Function1;", "", "Landroid/net/Uri;", "Ll83/a0;", "onResult", "Lsl0/r1;", "a", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lsl0/r1;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {

    /* JADX INFO: renamed from: sl0.s1$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"sl0/s1$a", "Lsl0/r1;", "Ll83/a0;", "a", "()V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC32666r1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C16351i f135557a;

        public a(C16351i c16351i) {
            this.f135557a = c16351i;
        }

        @Override // p734sl0.InterfaceC32666r1
        /* JADX INFO: renamed from: a */
        public void mo102243a() {
            this.f135557a.mo4052a(new String[]{MimeType.MIME_TYPE_PDF}, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC32666r1 m102294a(p715kotlin.jvm.functions.Function1 onResult, Composer composer, int i13) {
        AbstractC22676k.m65750j(onResult, "onResult");
        C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(new AbstractC22081b() { // from class: androidx.activity.result.contract.ActivityResultContracts$OpenMultipleDocuments
            @Override // p267k.AbstractC22081b
            public final Intent createIntent(Context context, Object obj) {
                String[] input = (String[]) obj;
                AbstractC22676k.m65750j(input, "input");
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
                AbstractC22676k.m65749i(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type;
            }

            @Override // p267k.AbstractC22081b
            public final C22080a getSynchronousResult(Context context, Object obj) {
                String[] input = (String[]) obj;
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(input, "input");
                return null;
            }

            @Override // p267k.AbstractC22081b
            public final Object parseResult(int i14, Intent intent) {
                if (i14 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data = intent.getData();
                    if (data != null) {
                        linkedHashSet.add(data);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData != null || !linkedHashSet.isEmpty()) {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i15 = 0; i15 < itemCount; i15++) {
                                Uri uri = clipData.getItemAt(i15).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                        return new ArrayList(linkedHashSet);
                    }
                }
                return C25271y.f99162w;
            }
        }, onResult, composer, (i13 << 3) & 112);
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new a(c16351iM118972a0);
            c28655q.m87172p0(objM87133R);
        }
        return (a) objM87133R;
    }
}
