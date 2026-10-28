.class public final Lq3/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq3/z;

.field public final b:Lq3/t;


# direct methods
.method public constructor <init>(Lq3/z;Lq3/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/d0;->a:Lq3/z;

    iput-object p2, p0, Lq3/d0;->b:Lq3/t;

    return-void
.end method


# virtual methods
.method public final a(Lq3/y;Lq3/y;)V
    .locals 1

    iget-object v0, p0, Lq3/d0;->a:Lq3/z;

    iget-object v0, v0, Lq3/z;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/d0;

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq3/d0;->b:Lq3/t;

    invoke-interface {v0, p1, p2}, Lq3/t;->c(Lq3/y;Lq3/y;)V

    :cond_0
    return-void
.end method
