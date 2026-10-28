package io.getstream.android.push.delegate;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z03.C39946a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J3\u0010%\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0016H\u0016¢\u0006\u0004\b%\u0010&J=\u0010'\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0016H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"Lio/getstream/android/push/delegate/AndroidPushDelegateProvider;", "", "Landroid/content/ContentProvider;", "<init>", "()V", "Ll83/a0;", "initializeDelegates", "Landroid/content/Context;", "discoverDelegates", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "metadata", "(Landroid/os/Bundle;)V", "", "Lio/getstream/android/push/delegate/PushDelegate;", "toPushDelegate", "(Ljava/lang/String;)Lio/getstream/android/push/delegate/PushDelegate;", "", "onCreate", "()Z", "Landroid/net/Uri;", "uri", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "TAG", "Ljava/lang/String;", "stream-android-push-delegate_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class AndroidPushDelegateProvider extends ContentProvider {
    private final String TAG = "Push:Delegate";

    private final void discoverDelegates(Context context) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(new ComponentName(context.getPackageName(), AndroidPushDelegateProvider.class.getName()), 128);
        AbstractC22676k.m65749i(providerInfo, "getProviderInfo(...)");
        Bundle metaData = providerInfo.metaData;
        AbstractC22676k.m65749i(metaData, "metaData");
        discoverDelegates(metaData);
    }

    private final void initializeDelegates() {
        Context context = getContext();
        if (context != null) {
            synchronized (C39946a.f172406a) {
                try {
                    if (!C39946a.f172407b) {
                        discoverDelegates(context);
                    }
                    C39946a.f172407b = true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private final PushDelegate toPushDelegate(String str) {
        Constructor<?> declaredConstructor;
        try {
            Class<?> cls = Class.forName(str);
            if (!PushDelegate.class.isAssignableFrom(cls)) {
                cls = null;
            }
            Object objNewInstance = (cls == null || (declaredConstructor = cls.getDeclaredConstructor(null)) == null) ? null : declaredConstructor.newInstance(null);
            if (objNewInstance instanceof PushDelegate) {
                return (PushDelegate) objNewInstance;
            }
            return null;
        } catch (ClassNotFoundException e5) {
            Log.e(this.TAG, "PushDelegate not created for '" + str + "'", e5);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.e(this.TAG, "PushDelegate not created for '" + str + "'", e13);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        AbstractC22676k.m65750j(uri, "uri");
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        AbstractC22676k.m65750j(uri, "uri");
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        initializeDelegates();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        AbstractC22676k.m65750j(uri, "uri");
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        AbstractC22676k.m65750j(uri, "uri");
        throw new IllegalStateException("Not allowed.");
    }

    private final void discoverDelegates(Bundle metadata) {
        Set<String> setKeySet = metadata.keySet();
        AbstractC22676k.m65749i(setKeySet, "keySet(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (AbstractC22676k.m65745e(metadata.getString((String) obj), "io.getstream.android.push.PushDelegate")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            AbstractC22676k.m65747g(str);
            PushDelegate pushDelegate = toPushDelegate(str);
            if (pushDelegate != null) {
                arrayList2.add(pushDelegate);
            }
        }
    }
}
