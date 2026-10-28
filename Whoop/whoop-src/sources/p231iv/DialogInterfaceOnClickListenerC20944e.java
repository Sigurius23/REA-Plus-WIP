package p231iv;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.widget.Toast;
import com.mapbox.common.MapboxOptions;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.whoop.android.R;
import com.whoop.service.network.model.UserSessionDtoKt;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p127ev.C13665f;
import p213i7.C18194g;
import p314m.C24836e;
import p314m.C24844i;
import p314m.DialogInterfaceC24846j;
import p408q.C29660d;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: iv.e */
/* JADX INFO: loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC20944e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: E */
    public DialogInterfaceC24846j f79128E;

    /* JADX INFO: renamed from: F */
    public C13665f f79129F;

    /* JADX INFO: renamed from: G */
    public MapTelemetry f79130G;

    /* JADX INFO: renamed from: H */
    public MapGeofencingConsent f79131H;

    /* JADX INFO: renamed from: w */
    public final Context f79132w;

    /* JADX INFO: renamed from: x */
    public List f79133x;

    /* JADX INFO: renamed from: y */
    public DialogInterfaceC24846j f79134y;

    /* JADX INFO: renamed from: z */
    public DialogInterfaceC24846j f79135z;

    public DialogInterfaceOnClickListenerC20944e(Context context) {
        this.f79132w = context;
    }

    /* JADX INFO: renamed from: a */
    public final C24844i m58199a() {
        boolean zHasValue;
        int[] iArr = AbstractC20949j.f79144a;
        Context context = this.f79132w;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.AppCompatTheme)");
        try {
            zHasValue = typedArrayObtainStyledAttributes.hasValue(117);
        } catch (Throwable unused) {
            zHasValue = false;
        }
        C24844i c24844i = zHasValue ? new C24844i(context) : new C24844i(new C29660d(context, R.style.Theme_AppCompat_DayNight_Dialog_Alert));
        typedArrayObtainStyledAttributes.recycle();
        return c24844i;
    }

    /* JADX INFO: renamed from: b */
    public final void m58200b(String str) {
        Context context = this.f79132w;
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.mapbox_attributionErrorNoBrowser, 1).show();
        } catch (Throwable th3) {
            Toast.makeText(context, th3.getLocalizedMessage(), 1).show();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i13) {
        AbstractC22676k.m65750j(dialog, "dialog");
        List list = this.f79133x;
        if (list == null) {
            AbstractC22676k.m65757q("attributionList");
            throw null;
        }
        C20940a c20940a = (C20940a) list.get(i13);
        String str = c20940a.f79120b;
        if (str.equals("https://www.mapbox.com/telemetry/")) {
            C24844i c24844iM58199a = m58199a();
            c24844iM58199a.m72849b(R.string.mapbox_attributionTelemetryTitle);
            c24844iM58199a.m72848a(R.string.mapbox_attributionTelemetryMessage);
            final int i14 = 0;
            c24844iM58199a.setPositiveButton(R.string.mapbox_attributionTelemetryPositive, new DialogInterface.OnClickListener(this) { // from class: iv.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ DialogInterfaceOnClickListenerC20944e f79122x;

                {
                    this.f79122x = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i15) {
                    switch (i14) {
                        case 0:
                            DialogInterfaceOnClickListenerC20944e this$0 = this.f79122x;
                            AbstractC22676k.m65750j(this$0, "this$0");
                            MapTelemetry mapTelemetry = this$0.f79130G;
                            if (mapTelemetry != null) {
                                mapTelemetry.setUserTelemetryRequestState(true);
                            }
                            dialogInterface.cancel();
                            break;
                        case 1:
                            DialogInterfaceOnClickListenerC20944e this$1 = this.f79122x;
                            AbstractC22676k.m65750j(this$1, "this$0");
                            String string = this$1.f79132w.getResources().getString(R.string.mapbox_telemetryLink);
                            AbstractC22676k.m65749i(string, "context.resources.getStr…ing.mapbox_telemetryLink)");
                            this$1.m58200b(string);
                            dialogInterface.cancel();
                            break;
                        default:
                            DialogInterfaceOnClickListenerC20944e this$2 = this.f79122x;
                            AbstractC22676k.m65750j(this$2, "this$0");
                            MapTelemetry mapTelemetry2 = this$2.f79130G;
                            if (mapTelemetry2 != null) {
                                mapTelemetry2.setUserTelemetryRequestState(false);
                            }
                            dialogInterface.cancel();
                            break;
                    }
                }
            });
            final int i15 = 1;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: iv.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ DialogInterfaceOnClickListenerC20944e f79122x;

                {
                    this.f79122x = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i16) {
                    switch (i15) {
                        case 0:
                            DialogInterfaceOnClickListenerC20944e this$0 = this.f79122x;
                            AbstractC22676k.m65750j(this$0, "this$0");
                            MapTelemetry mapTelemetry = this$0.f79130G;
                            if (mapTelemetry != null) {
                                mapTelemetry.setUserTelemetryRequestState(true);
                            }
                            dialogInterface.cancel();
                            break;
                        case 1:
                            DialogInterfaceOnClickListenerC20944e this$1 = this.f79122x;
                            AbstractC22676k.m65750j(this$1, "this$0");
                            String string = this$1.f79132w.getResources().getString(R.string.mapbox_telemetryLink);
                            AbstractC22676k.m65749i(string, "context.resources.getStr…ing.mapbox_telemetryLink)");
                            this$1.m58200b(string);
                            dialogInterface.cancel();
                            break;
                        default:
                            DialogInterfaceOnClickListenerC20944e this$2 = this.f79122x;
                            AbstractC22676k.m65750j(this$2, "this$0");
                            MapTelemetry mapTelemetry2 = this$2.f79130G;
                            if (mapTelemetry2 != null) {
                                mapTelemetry2.setUserTelemetryRequestState(false);
                            }
                            dialogInterface.cancel();
                            break;
                    }
                }
            };
            C24836e c24836e = c24844iM58199a.f97324a;
            c24836e.f97266k = c24836e.f97256a.getText(R.string.mapbox_attributionTelemetryNeutral);
            c24836e.f97267l = onClickListener;
            final int i16 = 2;
            c24844iM58199a.setNegativeButton(R.string.mapbox_attributionTelemetryNegative, new DialogInterface.OnClickListener(this) { // from class: iv.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ DialogInterfaceOnClickListenerC20944e f79122x;

                {
                    this.f79122x = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i17) {
                    switch (i16) {
                        case 0:
                            DialogInterfaceOnClickListenerC20944e this$0 = this.f79122x;
                            AbstractC22676k.m65750j(this$0, "this$0");
                            MapTelemetry mapTelemetry = this$0.f79130G;
                            if (mapTelemetry != null) {
                                mapTelemetry.setUserTelemetryRequestState(true);
                            }
                            dialogInterface.cancel();
                            break;
                        case 1:
                            DialogInterfaceOnClickListenerC20944e this$1 = this.f79122x;
                            AbstractC22676k.m65750j(this$1, "this$0");
                            String string = this$1.f79132w.getResources().getString(R.string.mapbox_telemetryLink);
                            AbstractC22676k.m65749i(string, "context.resources.getStr…ing.mapbox_telemetryLink)");
                            this$1.m58200b(string);
                            dialogInterface.cancel();
                            break;
                        default:
                            DialogInterfaceOnClickListenerC20944e this$2 = this.f79122x;
                            AbstractC22676k.m65750j(this$2, "this$0");
                            MapTelemetry mapTelemetry2 = this$2.f79130G;
                            if (mapTelemetry2 != null) {
                                mapTelemetry2.setUserTelemetryRequestState(false);
                            }
                            dialogInterface.cancel();
                            break;
                    }
                }
            });
            this.f79135z = c24844iM58199a.m72850c();
            return;
        }
        if (str.equals("geofencing_url_marker")) {
            C24844i c24844iM58199a2 = m58199a();
            c24844iM58199a2.m72849b(R.string.mapbox_attributionGeofencingTitle);
            c24844iM58199a2.m72848a(R.string.mapbox_attributionGeofencingMessage);
            MapGeofencingConsent mapGeofencingConsent = this.f79131H;
            boolean userConsent = mapGeofencingConsent != null ? mapGeofencingConsent.getUserConsent() : false;
            int i17 = userConsent ? R.string.mapbox_attributionGeofencingConsentedPositive : R.string.mapbox_attributionGeofencingRevokedPositive;
            int i18 = userConsent ? R.string.mapbox_attributionGeofencingConsentedNegative : R.string.mapbox_attributionGeofencingRevokedNegative;
            final C18194g c18194g = new C18194g(19);
            final int i19 = 0;
            c24844iM58199a2.setPositiveButton(i17, new DialogInterface.OnClickListener(this) { // from class: iv.c

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ DialogInterfaceOnClickListenerC20944e f79124x;

                {
                    this.f79124x = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i24) {
                    switch (i19) {
                        case 0:
                            MapGeofencingConsent mapGeofencingConsent2 = this.f79124x.f79131H;
                            if (mapGeofencingConsent2 != null) {
                                mapGeofencingConsent2.setUserConsent(true, c18194g);
                            }
                            dialogInterface.cancel();
                            break;
                        default:
                            MapGeofencingConsent mapGeofencingConsent3 = this.f79124x.f79131H;
                            if (mapGeofencingConsent3 != null) {
                                mapGeofencingConsent3.setUserConsent(false, c18194g);
                            }
                            dialogInterface.cancel();
                            break;
                    }
                }
            });
            final int i24 = 1;
            c24844iM58199a2.setNegativeButton(i18, new DialogInterface.OnClickListener(this) { // from class: iv.c

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ DialogInterfaceOnClickListenerC20944e f79124x;

                {
                    this.f79124x = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i25) {
                    switch (i24) {
                        case 0:
                            MapGeofencingConsent mapGeofencingConsent2 = this.f79124x.f79131H;
                            if (mapGeofencingConsent2 != null) {
                                mapGeofencingConsent2.setUserConsent(true, c18194g);
                            }
                            dialogInterface.cancel();
                            break;
                        default:
                            MapGeofencingConsent mapGeofencingConsent3 = this.f79124x.f79131H;
                            if (mapGeofencingConsent3 != null) {
                                mapGeofencingConsent3.setUserConsent(false, c18194g);
                            }
                            dialogInterface.cancel();
                            break;
                    }
                }
            });
            this.f79128E = c24844iM58199a2.m72850c();
            return;
        }
        String string = c20940a.f79120b;
        C13665f c13665f = this.f79129F;
        if (c13665f != null && AbstractC39414r.m125876U(string, "feedback", false)) {
            Uri.Builder builderBuildUpon = Uri.parse("https://apps.mapbox.com/feedback").buildUpon();
            MapboxMap mapboxMap = c13665f.f48446a;
            CameraState cameraState = mapboxMap.getCameraState();
            Point center = cameraState.getCenter();
            builderBuildUpon.encodedFragment("/" + center.longitude() + '/' + center.latitude() + '/' + cameraState.getZoom() + '/' + cameraState.getBearing() + '/' + cameraState.getPitch());
            String packageName = this.f79132w.getApplicationContext().getPackageName();
            if (packageName != null) {
                builderBuildUpon.appendQueryParameter("referrer", packageName);
            }
            builderBuildUpon.appendQueryParameter(UserSessionDtoKt.ACCESS_TOKEN, MapboxOptions.getAccessToken());
            Style styleDeprecated = mapboxMap.getStyleDeprecated();
            if (styleDeprecated != null) {
                Pattern patternCompile = Pattern.compile("^(.*://[^:^/]*)/(.*)/(.*)");
                AbstractC22676k.m65749i(patternCompile, "compile(MAP_FEEDBACK_STYLE_URI_REGEX)");
                Matcher matcher = patternCompile.matcher(styleDeprecated.getStyleURI());
                AbstractC22676k.m65749i(matcher, "pattern.matcher(it.styleURI)");
                if (matcher.find()) {
                    builderBuildUpon.appendQueryParameter("owner", matcher.group(2)).appendQueryParameter("id", matcher.group(3));
                }
            }
            string = builderBuildUpon.build().toString();
            AbstractC22676k.m65749i(string, "builder.build().toString()");
        }
        if (string.length() > 0) {
            m58200b(string);
        }
    }
}
