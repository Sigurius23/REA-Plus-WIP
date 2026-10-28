package com.iterable.iterableapi;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.s1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5371s1 extends NotificationCompat.Builder {

    /* JADX INFO: renamed from: a */
    public final Context f21825a;

    /* JADX INFO: renamed from: b */
    public boolean f21826b;

    /* JADX INFO: renamed from: c */
    public String f21827c;

    /* JADX INFO: renamed from: d */
    public String f21828d;

    /* JADX INFO: renamed from: e */
    public int f21829e;

    public C5371s1(Context context, String str) {
        super(context, str);
        this.f21825a = context;
    }

    @Override // androidx.core.app.NotificationCompat.Builder
    public final Notification build() {
        NotificationCompat.Style summaryText = null;
        if (this.f21827c != null) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(this.f21827c).openConnection();
                uRLConnectionOpenConnection.setDoInput(true);
                uRLConnectionOpenConnection.connect();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(uRLConnectionOpenConnection.getInputStream());
                if (bitmapDecodeStream != null) {
                    summaryText = new NotificationCompat.BigPictureStyle().bigPicture(bitmapDecodeStream).setSummaryText(this.f21828d);
                    setLargeIcon(bitmapDecodeStream);
                } else {
                    AbstractC12350b.m34595p("IterableNotification", "Notification image could not be loaded from url: " + this.f21827c);
                }
            } catch (MalformedURLException e5) {
                AbstractC12350b.m34595p("IterableNotification", e5.toString());
            } catch (IOException e13) {
                AbstractC12350b.m34595p("IterableNotification", e13.toString());
            }
        }
        if (summaryText == null) {
            summaryText = new NotificationCompat.BigTextStyle().bigText(this.f21828d);
        }
        setStyle(summaryText);
        return super.build();
    }
}
