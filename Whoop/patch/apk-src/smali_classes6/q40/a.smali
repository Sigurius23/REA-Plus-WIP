.class public final Lq40/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/r1;
.implements Lp1/c1;


# instance fields
.field public final synthetic w:Lp1/c1;

.field public final x:Lq83/j;


# direct methods
.method public constructor <init>(Lp1/c1;Lq83/j;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq40/a;->w:Lp1/c1;

    iput-object p2, p0, Lq40/a;->x:Lq83/j;

    return-void
.end method


# virtual methods
.method public final f()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lq40/a;->w:Lp1/c1;

    invoke-interface {v0}, Lp1/c1;->f()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lq40/a;->x:Lq83/j;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq40/a;->w:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq40/a;->w:Lp1/c1;

    invoke-interface {v0}, Lp1/c1;->i()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lq40/a;->w:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
