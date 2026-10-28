.class public final Lb3/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/x2;


# instance fields
.field public final a:Lq3/z;


# direct methods
.method public constructor <init>(Lq3/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/x1;->a:Lq3/z;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lb3/x1;->a:Lq3/z;

    iget-object v0, v0, Lq3/z;->a:Lq3/t;

    invoke-interface {v0}, Lq3/t;->d()V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lb3/x1;->a:Lq3/z;

    iget-object v1, v0, Lq3/z;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq3/d0;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lq3/z;->a:Lq3/t;

    invoke-interface {v0}, Lq3/t;->h()V

    :cond_0
    return-void
.end method
