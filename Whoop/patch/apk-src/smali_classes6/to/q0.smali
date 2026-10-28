.class public final Lto/q0;
.super Lto/y;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Lds/s;


# direct methods
.method public constructor <init>(Lds/s;Landroid/app/Dialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lto/q0;->a:Landroid/app/Dialog;

    iput-object p1, p0, Lto/q0;->b:Lds/s;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lto/q0;->b:Lds/s;

    iget-object v0, v0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Lto/r0;

    iget-object v1, v0, Lto/r0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lto/r0;->k()V

    iget-object v0, p0, Lto/q0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
