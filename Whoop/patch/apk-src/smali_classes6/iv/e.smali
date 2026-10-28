.class public final Liv/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public E:Lm/j;

.field public F:Lev/f;

.field public G:Lcom/mapbox/maps/module/MapTelemetry;

.field public H:Lcom/mapbox/maps/geofencing/MapGeofencingConsent;

.field public final w:Landroid/content/Context;

.field public x:Ljava/util/List;

.field public y:Lm/j;

.field public z:Lm/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liv/e;->w:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()Lm/i;
    .locals 5

    sget-object v0, Liv/j;->a:[I

    iget-object v1, p0, Liv/e;->w:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const-string v2, "context.obtainStyledAttr\u2026styleable.AppCompatTheme)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x75

    :try_start_0
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_0

    new-instance v2, Lm/i;

    invoke-direct {v2, v1}, Lm/i;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_0
    new-instance v2, Lm/i;

    new-instance v3, Lq/d;

    const v4, 0x7f150383

    invoke-direct {v3, v1, v4}, Lq/d;-><init>(Landroid/content/Context;I)V

    invoke-direct {v2, v3}, Lm/i;-><init>(Landroid/content/Context;)V

    :goto_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v2
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Liv/e;->w:Landroid/content/Context;

    const/4 v1, 0x1

    :try_start_0
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :catch_0
    const p1, 0x7f140814

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method

.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Liv/e;->x:Ljava/util/List;

    if-eqz p1, :cond_9

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Liv/a;

    iget-object p2, p1, Liv/a;->b:Ljava/lang/String;

    const-string v0, "https://www.mapbox.com/telemetry/"

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Liv/e;->a()Lm/i;

    move-result-object p1

    const p2, 0x7f14081f

    invoke-virtual {p1, p2}, Lm/i;->b(I)V

    const p2, 0x7f14081b

    invoke-virtual {p1, p2}, Lm/i;->a(I)V

    new-instance p2, Liv/b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Liv/b;-><init>(Liv/e;I)V

    const v0, 0x7f14081e

    invoke-virtual {p1, v0, p2}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    new-instance p2, Liv/b;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Liv/b;-><init>(Liv/e;I)V

    iget-object v0, p1, Lm/i;->a:Lm/e;

    iget-object v1, v0, Lm/e;->a:Landroid/view/ContextThemeWrapper;

    const v2, 0x7f14081d

    invoke-virtual {v1, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Lm/e;->k:Ljava/lang/CharSequence;

    iput-object p2, v0, Lm/e;->l:Landroid/content/DialogInterface$OnClickListener;

    new-instance p2, Liv/b;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Liv/b;-><init>(Liv/e;I)V

    const v0, 0x7f14081c

    invoke-virtual {p1, v0, p2}, Lm/i;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    invoke-virtual {p1}, Lm/i;->c()Lm/j;

    move-result-object p1

    iput-object p1, p0, Liv/e;->z:Lm/j;

    return-void

    :cond_0
    const-string v0, "geofencing_url_marker"

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Liv/e;->a()Lm/i;

    move-result-object p1

    const p2, 0x7f14081a

    invoke-virtual {p1, p2}, Lm/i;->b(I)V

    const p2, 0x7f140817

    invoke-virtual {p1, p2}, Lm/i;->a(I)V

    iget-object p2, p0, Liv/e;->H:Lcom/mapbox/maps/geofencing/MapGeofencingConsent;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/mapbox/maps/geofencing/MapGeofencingConsent;->getUserConsent()Z

    move-result v0

    :cond_1
    if-eqz v0, :cond_2

    const p2, 0x7f140816

    goto :goto_0

    :cond_2
    const p2, 0x7f140819

    :goto_0
    if-eqz v0, :cond_3

    const v0, 0x7f140815

    goto :goto_1

    :cond_3
    const v0, 0x7f140818

    :goto_1
    new-instance v1, Li7/g;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Li7/g;-><init>(I)V

    new-instance v2, Liv/c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v1, v3}, Liv/c;-><init>(Liv/e;Li7/g;I)V

    invoke-virtual {p1, p2, v2}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    new-instance p2, Liv/c;

    const/4 v2, 0x1

    invoke-direct {p2, p0, v1, v2}, Liv/c;-><init>(Liv/e;Li7/g;I)V

    invoke-virtual {p1, v0, p2}, Lm/i;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    invoke-virtual {p1}, Lm/i;->c()Lm/j;

    move-result-object p1

    iput-object p1, p0, Liv/e;->E:Lm/j;

    return-void

    :cond_4
    iget-object p1, p1, Liv/a;->b:Ljava/lang/String;

    iget-object p2, p0, Liv/e;->F:Lev/f;

    if-eqz p2, :cond_7

    const-string v1, "feedback"

    invoke-static {p1, v1, v0}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string p1, "https://apps.mapbox.com/feedback"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    iget-object p2, p2, Lev/f;->a:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {p2}, Lcom/mapbox/maps/MapboxMap;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 v3, 0x2f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/mapbox/maps/CameraState;->getPitch()D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->encodedFragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    iget-object v0, p0, Liv/e;->w:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v1, "referrer"

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_5
    const-string v0, "access_token"

    invoke-static {}, Lcom/mapbox/common/MapboxOptions;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {p2}, Lcom/mapbox/maps/MapboxMap;->getStyle()Lcom/mapbox/maps/Style;

    move-result-object p2

    if-eqz p2, :cond_6

    const-string v0, "^(.*://[^:^/]*)/(.*)/(.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(MAP_FEEDBACK_STYLE_URI_REGEX)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/mapbox/maps/Style;->getStyleURI()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    const-string v0, "pattern.matcher(it.styleURI)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "owner"

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "id"

    invoke-virtual {v0, v1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_6
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "builder.build().toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_8

    invoke-virtual {p0, p1}, Liv/e;->b(Ljava/lang/String;)V

    :cond_8
    return-void

    :cond_9
    const-string p1, "attributionList"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
