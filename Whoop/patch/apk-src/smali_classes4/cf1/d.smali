.class public final Lcf1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf1/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcf1/b;",
        "Lcf1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J7\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\r2\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ#\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcf1/d;",
        "Lod1/g;",
        "Lcf1/b;",
        "Lcf1/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "",
        "path",
        "endDate",
        "",
        "showLoading",
        "Lec3/l;",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;",
        "b",
        "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;",
        "accumulatedResponse",
        "exercise-progress-mini-arch_release"
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
.field private final a:Lnm0/e;

.field private b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;


# direct methods
.method public constructor <init>(Lnm0/e;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcf1/d;->a:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Lcf1/d;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcf1/d;->f(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcf1/d;)Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;
    .locals 0

    iget-object p0, p0, Lcf1/d;->b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    return-object p0
.end method

.method public static final synthetic e(Lcf1/d;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;)V
    .locals 0

    iput-object p1, p0, Lcf1/d;->b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    return-void
.end method

.method private final f(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lec3/l;"
        }
    .end annotation

    if-nez p1, :cond_0

    const-string p1, "progression-service/v3/exercise"

    :cond_0
    invoke-static {p1}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    const-string v1, "UTF-8"

    invoke-static {p2, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "decode(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "T"

    invoke-static {p2, v1}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, " "

    invoke-static {p2, v1}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ll83/k;

    const-string v2, "endDate"

    invoke-direct {v1, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object p2

    if-eqz v1, :cond_2

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    :cond_2
    sget-object v1, Lm83/z;->w:Lm83/z;

    :goto_1
    invoke-static {p2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    new-instance v1, Lcom/whoop/exerciseprogressminiarch/domain/GetExerciseProgressRequest;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Lcom/whoop/exerciseprogressminiarch/domain/GetExerciseProgressRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance p2, La6/u;

    const/4 v2, 0x1

    invoke-direct {p2, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v1, "home"

    const-string v2, "cycle"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {p2, v1, v0, v2, v0}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p2

    iget-object v1, p0, Lcf1/d;->a:Lnm0/e;

    new-instance v2, Lcf1/d$b;

    invoke-direct {v2, v0, v1}, Lcf1/d$b;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p2, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p2

    new-instance v0, Lcf1/d$c;

    invoke-direct {v0, p2, p3, p0, p1}, Lcf1/d$c;-><init>(Lec3/l;ZLcf1/d;La12/a;)V

    return-object v0
.end method

.method public static synthetic g(Lcf1/d;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lec3/l;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x1

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcf1/d;->f(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 8
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

    new-instance v0, Lcf1/d$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcf1/d$d;-><init>(Lq83/d;Lcf1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lcf1/c;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcf1/c;-><init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcf1/d$e;

    invoke-direct {v0, v1}, Lcf1/d$e;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
