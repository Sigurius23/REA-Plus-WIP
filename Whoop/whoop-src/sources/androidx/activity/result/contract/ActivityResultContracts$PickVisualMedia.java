package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p029b5.AbstractC2722a;
import p236j.C21074m;
import p267k.AbstractC22081b;
import p267k.C22080a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, m65681d2 = {"androidx/activity/result/contract/ActivityResultContracts$PickVisualMedia", "Lk/b;", "Lj/m;", "Landroid/net/Uri;", "<init>", "()V", "b5/a", "k/c", "k/d", "k/e", "k/f", "activity_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public class ActivityResultContracts$PickVisualMedia extends AbstractC22081b {
    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C21074m input = (C21074m) obj;
        AbstractC22676k.m65750j(input, "input");
        if (AbstractC2722a.m7680g()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(AbstractC2722a.m7679f(input.f79941a));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        if (AbstractC2722a.m7678e(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(AbstractC2722a.m7679f(input.f79941a));
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
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
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
        List arrayList;
        if (i13 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data2 = intent.getData();
        if (data2 != null) {
            linkedHashSet.add(data2);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            arrayList = C25271y.f99162w;
        } else {
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i14 = 0; i14 < itemCount; i14++) {
                    Uri uri = clipData.getItemAt(i14).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            arrayList = new ArrayList(linkedHashSet);
        }
        return (Uri) AbstractC25265s.m74100H0(arrayList);
    }
}
