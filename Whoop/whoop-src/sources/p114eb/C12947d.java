package p114eb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import ih0.AbstractC18489d0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: eb.d */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12961h1("activity")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Leb/d;", "Leb/i1;", "Leb/b;", "navigation-runtime_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public class C12947d extends AbstractC12964i1 {

    /* JADX INFO: renamed from: c */
    public final Context f44723c;

    /* JADX INFO: renamed from: d */
    public final Activity f44724d;

    public C12947d(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.f44723c = context;
        for (Object obj : AbstractC38176k.m122288x(context, C12944c.f44716x)) {
            if (((Context) obj) instanceof Activity) {
                this.f44724d = (Activity) obj;
            }
        }
        obj = null;
        this.f44724d = (Activity) obj;
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: a */
    public final C12977n0 mo36423a() {
        return new C12941b(this);
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: c */
    public final C12977n0 mo36424c(C12977n0 c12977n0, Bundle bundle, C12997x0 c12997x0) {
        Intent intent;
        int intExtra;
        C12941b c12941b = (C12941b) c12977n0;
        if (c12941b.f44707L == null) {
            throw new IllegalStateException(AbstractC18489d0.m53371l(new StringBuilder("Destination "), c12941b.f44819H, " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(c12941b.f44707L);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = c12941b.f44708M;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f44724d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (c12997x0 != null && c12997x0.f44903a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c12941b.f44819H);
        Context context = this.f44723c;
        Resources resources = context.getResources();
        if (c12997x0 != null) {
            int i13 = c12997x0.f44910h;
            int i14 = c12997x0.f44911i;
            if ((i13 <= 0 || !AbstractC22676k.m65745e(resources.getResourceTypeName(i13), "animator")) && (i14 <= 0 || !AbstractC22676k.m65745e(resources.getResourceTypeName(i14), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i13);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i14);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i13) + " and popExit resource " + resources.getResourceName(i14) + " when launching " + c12941b);
            }
        }
        context.startActivity(intent2);
        if (c12997x0 == null || activity == null) {
            return null;
        }
        int i15 = c12997x0.f44908f;
        int i16 = c12997x0.f44909g;
        if ((i15 <= 0 || !AbstractC22676k.m65745e(resources.getResourceTypeName(i15), "animator")) && (i16 <= 0 || !AbstractC22676k.m65745e(resources.getResourceTypeName(i16), "animator"))) {
            if (i15 < 0 && i16 < 0) {
                return null;
            }
            if (i15 < 0) {
                i15 = 0;
            }
            activity.overridePendingTransition(i15, i16 >= 0 ? i16 : 0);
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i15) + " and exit resource " + resources.getResourceName(i16) + "when launching " + c12941b);
        return null;
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: j */
    public final boolean mo36425j() {
        Activity activity = this.f44724d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
