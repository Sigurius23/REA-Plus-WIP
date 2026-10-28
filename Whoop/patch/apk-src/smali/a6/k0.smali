.class public La6/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/w0;


# instance fields
.field public final a:Ljava/io/File;

.field public final b:La6/y0;

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/io/File;La6/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/k0;->a:Ljava/io/File;

    iput-object p2, p0, La6/k0;->b:La6/y0;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La6/k0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final a(La6/r;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La6/k0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, La6/j0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La6/j0;-><init>(La6/k0;Lq83/d;)V

    iget-object v1, p0, La6/k0;->a:Ljava/io/File;

    invoke-static {v1, v0, p1}, Lhg3/i;->m(Ljava/io/File;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This scope has already been closed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, La6/k0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
