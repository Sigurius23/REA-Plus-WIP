.class public final Liv2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Liv2/b;",
        "Liv2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Liv2/d;",
        "Lod1/g;",
        "Liv2/b;",
        "Liv2/c;",
        "Lfu2/i;",
        "strengthTrainerInteractor",
        "Lcom/whoop/weightlifting/data/WeightliftingApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V",
        "",
        "workoutTemplateId",
        "Lec3/l;",
        "g",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lfu2/i;",
        "b",
        "Lcom/whoop/weightlifting/data/WeightliftingApi;",
        "c",
        "Ltr2/n;",
        "weightlifting_release"
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
.field private final a:Lfu2/i;

.field private final b:Lcom/whoop/weightlifting/data/WeightliftingApi;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V
    .locals 1

    const-string v0, "strengthTrainerInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liv2/d;->a:Lfu2/i;

    iput-object p2, p0, Liv2/d;->b:Lcom/whoop/weightlifting/data/WeightliftingApi;

    iput-object p3, p0, Liv2/d;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Liv2/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Liv2/d;->g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Liv2/d;)Lcom/whoop/weightlifting/data/WeightliftingApi;
    .locals 0

    iget-object p0, p0, Liv2/d;->b:Lcom/whoop/weightlifting/data/WeightliftingApi;

    return-object p0
.end method

.method public static final synthetic e(Liv2/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Liv2/d;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Liv2/d;)Lfu2/i;
    .locals 0

    iget-object p0, p0, Liv2/d;->a:Lfu2/i;

    return-object p0
.end method

.method private final g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p2, Liv2/d$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, p1, v0}, Liv2/d$a;-><init>(Liv2/d;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, p2}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Liv2/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Liv2/d$b;-><init>(Lq83/d;Liv2/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
