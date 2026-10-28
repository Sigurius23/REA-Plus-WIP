package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m83.C25271y;
import p029b5.AbstractC2722a;
import p043c4.AbstractC3979v;
import p236j.C21074m;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"androidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia", "Lk/b;", "Lj/m;", "", "Landroid/net/Uri;", "c4/v", "activity_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public class ActivityResultContracts$PickMultipleVisualMedia extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final int f4215a;

    public ActivityResultContracts$PickMultipleVisualMedia() {
        this((Object) null);
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C21074m input = (C21074m) obj;
        AbstractC22676k.m65750j(input, "input");
        boolean zM7680g = AbstractC2722a.m7680g();
        int i13 = this.f4215a;
        if (zM7680g) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(AbstractC2722a.m7679f(input.f79941a));
            int iMin = Math.min(i13, input.f79942b);
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
            return intent;
        }
        if (AbstractC2722a.m7678e(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(AbstractC2722a.m7679f(input.f79941a));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoM7678e = AbstractC2722a.m7678e(context);
        if (resolveInfoM7678e == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoM7678e.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(AbstractC2722a.m7679f(input.f79941a));
        int iMin2 = Math.min(i13, input.f79942b);
        if (iMin2 <= 1) {
            throw new IllegalArgumentException("Max items must be greater than 1");
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
        return intent3;
    }

    @Override // p267k.AbstractC22081b
    public final C22080a getSynchronousResult(Context context, Object obj) {
        C21074m input = (C21074m) obj;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(input, "input");
        return null;
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        if (i13 != -1) {
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
                    for (int i14 = 0; i14 < itemCount; i14++) {
                        Uri uri = clipData.getItemAt(i14).getUri();
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

    public ActivityResultContracts$PickMultipleVisualMedia(int i13) {
        this.f4215a = i13;
        if (i13 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    public /* synthetic */ ActivityResultContracts$PickMultipleVisualMedia(Object obj) {
        this(AbstractC3979v.m12012c());
    }
}
