.class public final Lu82/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010JG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lu82/g;",
        "",
        "Ll83/h;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Ll83/h;)V",
        "Lcom/google/gson/Gson;",
        "gson",
        "Lad3/c;",
        "json",
        "",
        "",
        "flagNames",
        "Lpg3/m;",
        "c",
        "(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lpg3/m;",
        "baseUrl",
        "Lud3/l0;",
        "client",
        "Lpg3/f;",
        "callAdapterFactory",
        "Lpg3/y0;",
        "a",
        "(Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;)Lpg3/y0;",
        "Ll83/h;",
        "serialization_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll83/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")V"
        }
    .end annotation

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu82/g;->a:Ll83/h;

    return-void
.end method

.method public static synthetic b(Lu82/g;Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;ILjava/lang/Object;)Lpg3/y0;
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lu82/g;->a(Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lpg3/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/Gson;",
            "Lad3/c;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lpg3/m;"
        }
    .end annotation

    new-instance v0, Lu82/d;

    iget-object v1, p0, Lu82/g;->a:Ll83/h;

    invoke-static {p1}, Lrg3/a;->a(Lcom/google/gson/Gson;)Lrg3/a;

    move-result-object p1

    invoke-static {p2}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p2

    invoke-direct {v0, v1, p3, p1, p2}, Lu82/d;-><init>(Ll83/h;Ljava/util/Set;Lpg3/m;Lpg3/m;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;)Lpg3/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lud3/l0;",
            "Lcom/google/gson/Gson;",
            "Lad3/c;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lpg3/f;",
            ")",
            "Lpg3/y0;"
        }
    .end annotation

    const-string v0, "baseUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gson"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flagNames"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p4, p5}, Lu82/g;->c(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lpg3/m;

    move-result-object p3

    new-instance p4, Lpg3/x0;

    invoke-direct {p4}, Lpg3/x0;-><init>()V

    iput-object p2, p4, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {p4, p1}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-virtual {p4, p3}, Lpg3/x0;->b(Lpg3/m;)V

    if-eqz p6, :cond_0

    invoke-virtual {p4, p6}, Lpg3/x0;->a(Lpg3/f;)V

    :cond_0
    invoke-virtual {p4}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p1

    return-object p1
.end method
