.class public final Ls40/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ls40/d;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls40/d;

    const-string v1, "00"

    const-string v2, "Stripe Test Bank"

    invoke-direct {v0, v1, v2}, Ls40/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ls40/e;->c:Ls40/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    new-instance v1, Ljava/util/Scanner;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string v2, "au_becs_bsb.json"

    invoke-virtual {p1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    const-string p1, "\\A"

    invoke-virtual {v1, p1}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object p1

    const-string v1, "next(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ls/s;->m(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    new-instance v2, Ls40/d;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ls40/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ls40/e;->a:Ljava/util/ArrayList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls40/e;->b:Z

    return-void
.end method
