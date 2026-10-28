.class public abstract Lff1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Llb1/z0;",
        "Ll83/a0;",
        "b",
        "(Llb1/z0;)V",
        "exercise-progress-mini-arch_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/whoop/exerciseprogressminiarch/domain/models/ArchMiniExerciseProgress;)Lgf1/j;
    .locals 0

    invoke-static {p0}, Lff1/a;->c(Lcom/whoop/exerciseprogressminiarch/domain/models/ArchMiniExerciseProgress;)Lgf1/j;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Llb1/z0;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf41/f;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lf41/f;-><init>(I)V

    const-class v1, Lcom/whoop/exerciseprogressminiarch/domain/models/ArchMiniExerciseProgress;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lff1/a$a;

    invoke-direct {v2, v0}, Lff1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final c(Lcom/whoop/exerciseprogressminiarch/domain/models/ArchMiniExerciseProgress;)Lgf1/j;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/exerciseprogressminiarch/domain/models/ArchMiniExerciseProgress;->getPath()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    new-instance v0, Lef1/c;

    new-instance v1, Lef1/c$a;

    sget-object v2, Le31/d;->a:Le31/d;

    invoke-virtual {v2}, Le31/d;->a()Le31/c;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lef1/c$a;-><init>(Le31/c;Lef1/a;Lef1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2, v3}, Lef1/c;-><init>(Lef1/c$a;Lef1/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lgf1/j;

    invoke-direct {v1, v0, p0}, Lgf1/j;-><init>(Lef1/c;Ljava/lang/String;)V

    return-object v1
.end method
