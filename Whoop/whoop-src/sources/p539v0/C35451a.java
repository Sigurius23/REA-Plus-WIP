package p539v0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import c93.InterfaceC4353o;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import l83.C23454a0;
import p294l3.C23283u0;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C35451a implements InterfaceC4353o {
    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C23283u0 c23283u0 = (C23283u0) obj5;
        String string = ((CharSequence) obj4).subSequence(C23283u0.m67360f(c23283u0.f92253a), C23283u0.m67359e(c23283u0.f92253a)).toString();
        Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeType.MIME_TYPE_TXT).putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
        ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
        Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        className.putExtra("android.intent.extra.PROCESS_TEXT", string);
        ((Context) obj).startActivity(className);
        return C23454a0.f92919a;
    }
}
