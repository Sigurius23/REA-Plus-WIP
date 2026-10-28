.class public final Ln8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;
.implements Lbc3/c0;


# instance fields
.field public final w:Lq83/j;


# direct methods
.method public constructor <init>(Lq83/j;)V
    .locals 1

    const-string v0, "coroutineContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/a;->w:Lq83/j;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Ln8/a;->w:Lq83/j;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Ln8/a;->w:Lq83/j;

    return-object v0
.end method
