.class final Lwu2/c$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwu2/c;->r(Lwu2/b;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor"
    f = "EditWorkoutInteractor.kt"
    l = {
        0x8b,
        0x8c
    }
    m = "handleRefreshWorkoutTemplate"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Z

.field H:Z

.field I:I

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Lwu2/c;

.field L:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwu2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu2/c;",
            "Lq83/d<",
            "-",
            "Lwu2/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwu2/c$f;->K:Lwu2/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iput-object p1, p0, Lwu2/c$f;->J:Ljava/lang/Object;

    iget p1, p0, Lwu2/c$f;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwu2/c$f;->L:I

    iget-object v0, p0, Lwu2/c$f;->K:Lwu2/c;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Lwu2/c;->i(Lwu2/c;Lwu2/b;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
