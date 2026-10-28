.class public final Lz00/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# static fields
.field public static final w:Lz00/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz00/a;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lz00/a;-><init>(I)V

    sput-object v0, Lz00/f;->w:Lz00/a;

    return-void
.end method


# virtual methods
.method public final m(Lorg/json/JSONObject;)Lvy/b;
    .locals 5

    :try_start_0
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    move-object v2, v0

    check-cast v2, Li93/i;

    iget-boolean v2, v2, Li93/i;->y:Z

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    sget-object v3, Lz00/f;->w:Lz00/a;

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v4, "optJSONObject(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :cond_1
    instance-of p1, v1, Ll83/m;

    if-eqz p1, :cond_2

    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_2
    check-cast v1, Ljava/util/List;

    new-instance p1, Ly00/z5;

    invoke-direct {p1, v1}, Ly00/z5;-><init>(Ljava/util/List;)V

    return-object p1
.end method
