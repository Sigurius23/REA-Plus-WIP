.class public final Lgv/h;
.super Lgv/d;
.source "SourceFile"


# instance fields
.field public final M:Lfv/j;


# direct methods
.method public constructor <init>(Lfv/i;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    sget-object v0, Lgv/k;->b:Lgv/j;

    invoke-direct {p0, v0, p1}, Lgv/d;-><init>(Landroid/animation/TypeEvaluator;Lfv/i;)V

    if-eqz p2, :cond_0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Lfv/j;->z:Lfv/j;

    iput-object p1, p0, Lgv/h;->M:Lfv/j;

    return-void
.end method


# virtual methods
.method public final k()Lfv/j;
    .locals 1

    iget-object v0, p0, Lgv/h;->M:Lfv/j;

    return-object v0
.end method
