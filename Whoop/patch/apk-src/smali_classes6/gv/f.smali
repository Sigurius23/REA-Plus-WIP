.class public final Lgv/f;
.super Lgv/d;
.source "SourceFile"


# instance fields
.field public final M:Z

.field public final N:Lfv/j;


# direct methods
.method public constructor <init>(Landroid/animation/TypeEvaluator;Lfv/i;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "evaluator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lgv/d;-><init>(Landroid/animation/TypeEvaluator;Lfv/i;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lgv/f;->M:Z

    if-eqz p3, :cond_0

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Lfv/j;->w:Lfv/j;

    iput-object p1, p0, Lgv/f;->N:Lfv/j;

    return-void
.end method


# virtual methods
.method public final k()Lfv/j;
    .locals 1

    iget-object v0, p0, Lgv/f;->N:Lfv/j;

    return-object v0
.end method
