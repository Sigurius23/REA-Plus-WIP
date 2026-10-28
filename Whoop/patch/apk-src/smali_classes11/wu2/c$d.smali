.class final Lwu2/c$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwu2/c;->n(Lwu2/b;JLjava/lang/String;ZLq83/d;)Ljava/lang/Object;
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
        0xfd
    }
    m = "fetchWorkoutTemplateFromServer"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lwu2/c;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:J

.field z:Z


# direct methods
.method public constructor <init>(Lwu2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu2/c;",
            "Lq83/d<",
            "-",
            "Lwu2/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwu2/c$d;->F:Lwu2/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lwu2/c$d;->E:Ljava/lang/Object;

    iget p1, p0, Lwu2/c$d;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwu2/c$d;->G:I

    iget-object v0, p0, Lwu2/c$d;->F:Lwu2/c;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lwu2/c;->c(Lwu2/c;Lwu2/b;JLjava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
