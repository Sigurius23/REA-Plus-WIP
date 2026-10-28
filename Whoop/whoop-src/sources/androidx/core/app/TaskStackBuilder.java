package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p479s4.AbstractC32122c;

/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder implements Iterable<Intent> {
    private static final String TAG = "TaskStackBuilder";
    private final ArrayList<Intent> mIntents = new ArrayList<>();
    private final Context mSourceContext;

    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(Context context) {
        this.mSourceContext = context;
    }

    public static TaskStackBuilder create(Context context) {
        return new TaskStackBuilder(context);
    }

    @Deprecated
    public static TaskStackBuilder from(Context context) {
        return create(context);
    }

    public TaskStackBuilder addNextIntent(Intent intent) {
        this.mIntents.add(intent);
        return this;
    }

    public TaskStackBuilder addNextIntentWithParentStack(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.mSourceContext.getPackageManager());
        }
        if (component != null) {
            addParentStack(component);
        }
        addNextIntent(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskStackBuilder addParentStack(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof SupportParentable ? ((SupportParentable) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = NavUtils.getParentActivityIntent(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.mSourceContext.getPackageManager());
            }
            addParentStack(component);
            addNextIntent(supportParentActivityIntent);
        }
        return this;
    }

    public Intent editIntentAt(int i13) {
        return this.mIntents.get(i13);
    }

    @Deprecated
    public Intent getIntent(int i13) {
        return editIntentAt(i13);
    }

    public int getIntentCount() {
        return this.mIntents.size();
    }

    public Intent[] getIntents() {
        int size = this.mIntents.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent(this.mIntents.get(0)).addFlags(268484608);
            for (int i13 = 1; i13 < size; i13++) {
                intentArr[i13] = new Intent(this.mIntents.get(i13));
            }
        }
        return intentArr;
    }

    public PendingIntent getPendingIntent(int i13, int i14) {
        return getPendingIntent(i13, i14, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.mIntents.iterator();
    }

    public void startActivities() {
        startActivities(null);
    }

    public PendingIntent getPendingIntent(int i13, int i14, Bundle bundle) {
        if (this.mIntents.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.mIntents.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.mSourceContext, i13, intentArr, i14, bundle);
    }

    public void startActivities(Bundle bundle) {
        if (this.mIntents.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.mIntents.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (AbstractC32122c.startActivities(this.mSourceContext, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.mSourceContext.startActivity(intent);
    }

    public TaskStackBuilder addParentStack(Class<?> cls) {
        return addParentStack(new ComponentName(this.mSourceContext, cls));
    }

    public TaskStackBuilder addParentStack(ComponentName componentName) {
        int size = this.mIntents.size();
        try {
            Intent parentActivityIntent = NavUtils.getParentActivityIntent(this.mSourceContext, componentName);
            while (parentActivityIntent != null) {
                this.mIntents.add(size, parentActivityIntent);
                parentActivityIntent = NavUtils.getParentActivityIntent(this.mSourceContext, parentActivityIntent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e5) {
            Log.e(TAG, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e5);
        }
    }
}
