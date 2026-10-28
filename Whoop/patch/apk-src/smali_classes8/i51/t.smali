.class public abstract Li51/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "",
        "json",
        "",
        "highlight",
        "c",
        "(Ljava/lang/String;[I)Ljava/lang/String;",
        "Lorg/json/JSONObject;",
        "gradientNode",
        "Ll83/a0;",
        "b",
        "(Lorg/json/JSONObject;[I)V",
        "hex",
        "",
        "a",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "stops",
        "count",
        "e",
        "([II)[I",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "LottieGradientUtil"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Li51/t;->a:Ltr2/n;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4

    const-string v0, "#"

    const-string v1, "hex"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    sget-object v2, Li51/t;->a:Ltr2/n;

    const-string v3, "Invalid hex color: "

    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v2, p0, v0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Lorg/json/JSONObject;[I)V
    .locals 9

    const-string v0, "gradientNode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "highlight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "g"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "p"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "k"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "a"

    invoke-virtual {p0, v3, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    mul-int/lit8 v3, v0, 0x4

    if-ge v2, v3, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {p1, v0}, Li51/t;->e([II)[I

    move-result-object p1

    :goto_0
    if-ge v1, v0, :cond_6

    aget v2, p1, v1

    mul-int/lit8 v3, v1, 0x4

    add-int/lit8 v4, v3, 0x1

    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    move-result v5

    int-to-double v5, v5

    const-wide v7, 0x406fe00000000000L    # 255.0

    div-double/2addr v5, v7

    invoke-virtual {p0, v4, v5, v6}, Lorg/json/JSONArray;->put(ID)Lorg/json/JSONArray;

    add-int/lit8 v4, v3, 0x2

    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    move-result v5

    int-to-double v5, v5

    div-double/2addr v5, v7

    invoke-virtual {p0, v4, v5, v6}, Lorg/json/JSONArray;->put(ID)Lorg/json/JSONArray;

    add-int/lit8 v3, v3, 0x3

    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    int-to-double v4, v2

    div-double/2addr v4, v7

    invoke-virtual {p0, v3, v4, v5}, Lorg/json/JSONArray;->put(ID)Lorg/json/JSONArray;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return-void
.end method

.method public static final c(Ljava/lang/String;[I)Ljava/lang/String;
    .locals 3

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "highlight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Li51/t;->d([ILjava/lang/Object;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object v0, Li51/t;->a:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to recolor Lottie gradients"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object p0
.end method

.method private static final d([ILjava/lang/Object;)V
    .locals 3

    instance-of v0, p1, Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    check-cast p1, Lorg/json/JSONObject;

    const-string v0, "ty"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "gf"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "gs"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p1, p0}, Li51/t;->b(Lorg/json/JSONObject;[I)V

    :cond_1
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0, v1}, Li51/t;->d([ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lorg/json/JSONArray;

    if-eqz v0, :cond_3

    check-cast p1, Lorg/json/JSONArray;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p0, v2}, Li51/t;->d([ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static final e([II)[I
    .locals 9

    const-string v0, "stops"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-gtz p1, :cond_0

    new-array p0, v0, [I

    return-object p0

    :cond_0
    array-length v1, p0

    if-nez v1, :cond_1

    new-array p0, p1, [I

    return-object p0

    :cond_1
    array-length v1, p0

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    if-ne p1, v2, :cond_2

    goto :goto_1

    :cond_2
    new-array v1, p1, [I

    move v3, v0

    :goto_0
    if-ge v3, p1, :cond_3

    int-to-float v4, v3

    add-int/lit8 v5, p1, -0x1

    int-to-float v5, v5

    div-float/2addr v4, v5

    array-length v5, p0

    sub-int/2addr v5, v2

    int-to-float v5, v5

    mul-float/2addr v4, v5

    float-to-double v5, v4

    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v7

    double-to-float v7, v7

    float-to-int v7, v7

    array-length v8, p0

    sub-int/2addr v8, v2

    invoke-static {v7, v0, v8}, Le93/b;->n(III)I

    move-result v7

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v5, v5

    float-to-int v5, v5

    array-length v6, p0

    sub-int/2addr v6, v2

    invoke-static {v5, v0, v6}, Le93/b;->n(III)I

    move-result v5

    aget v6, p0, v7

    aget v5, p0, v5

    int-to-float v7, v7

    sub-float/2addr v4, v7

    invoke-static {v6, v5, v4}, Lin2/c;->a(IIF)I

    move-result v4

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v1

    :cond_4
    :goto_1
    new-array v1, p1, [I

    move v2, v0

    :goto_2
    if-ge v2, p1, :cond_5

    aget v3, p0, v0

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-object v1
.end method
