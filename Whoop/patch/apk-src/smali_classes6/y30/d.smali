.class public final Ly30/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lg40/l0;Lh32/b;Lp6/e1;Lb20/f;)Ly30/e;
    .locals 0

    const-string p2, "googlePlacesApiKey"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string p1, "com.google.android.libraries.places.api.Places"

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p4}, Lp6/e1;->invoke()Ljava/lang/Object;

    new-instance p1, Ly30/c;

    invoke-virtual {p3, p0}, Lh32/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/libraries/places/api/net/PlacesClient;

    invoke-direct {p1, p0, p5}, Ly30/c;-><init>(Lcom/google/android/libraries/places/api/net/PlacesClient;Lb20/f;)V

    return-object p1

    :catch_0
    new-instance p0, Ly30/f;

    invoke-direct {p0, p5}, Ly30/f;-><init>(Lb20/f;)V

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Lb20/f;)Ly30/e;
    .locals 6

    new-instance v2, Lg40/l0;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lg40/l0;-><init>(I)V

    new-instance v3, Lh32/b;

    const/4 v0, 0x4

    invoke-direct {v3, p0, v0}, Lh32/b;-><init>(Landroid/content/Context;I)V

    new-instance v4, Lp6/e1;

    const/4 v0, 0x1

    invoke-direct {v4, p0, p1, v0}, Lp6/e1;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Ly30/d;->a(Landroid/content/Context;Ljava/lang/String;Lg40/l0;Lh32/b;Lp6/e1;Lb20/f;)Ly30/e;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/content/Context;Landroid/content/Context;)Lcom/google/android/libraries/places/api/net/PlacesClient;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/libraries/places/api/Places;->createClient(Landroid/content/Context;)Lcom/google/android/libraries/places/api/net/PlacesClient;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/libraries/places/api/Places;->initialize(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static e(ZLg40/l0;)Ljava/lang/Integer;
    .locals 0

    :try_start_0
    const-string p1, "com.google.android.libraries.places.api.Places"

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    sget p0, Lcom/google/android/libraries/places/R$drawable;->places_powered_by_google_dark:I

    goto :goto_0

    :cond_0
    sget p0, Lcom/google/android/libraries/places/R$drawable;->places_powered_by_google_light:I

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method
