.class public abstract Ls83/c;
.super Ls83/a;
.source "SourceFile"


# instance fields
.field private final _context:Lq83/j;

.field private transient intercepted:Lq83/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq83/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0, p1}, Ls83/c;-><init>(Lq83/j;Lq83/d;)V

    return-void
.end method

.method public constructor <init>(Lq83/j;Lq83/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ls83/a;-><init>(Lq83/d;)V

    .line 2
    iput-object p1, p0, Ls83/c;->_context:Lq83/j;

    return-void
.end method


# virtual methods
.method public getContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Ls83/c;->_context:Lq83/j;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq83/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ls83/c;->intercepted:Lq83/d;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ls83/c;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lq83/e;->w:Lq83/e;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lq83/f;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lq83/f;->interceptContinuation(Lq83/d;)Lq83/d;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Ls83/c;->intercepted:Lq83/d;

    :cond_2
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 3

    iget-object v0, p0, Ls83/c;->intercepted:Lq83/d;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ls83/c;->getContext()Lq83/j;

    move-result-object v1

    sget-object v2, Lq83/e;->w:Lq83/e;

    invoke-interface {v1, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Lq83/f;

    invoke-interface {v1, v0}, Lq83/f;->releaseInterceptedContinuation(Lq83/d;)V

    :cond_0
    sget-object v0, Ls83/b;->w:Ls83/b;

    iput-object v0, p0, Ls83/c;->intercepted:Lq83/d;

    return-void
.end method
