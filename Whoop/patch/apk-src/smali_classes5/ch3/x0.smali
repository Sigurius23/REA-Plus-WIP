.class public final Lch3/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/o;


# instance fields
.field public final w:Lbh3/b;


# direct methods
.method public constructor <init>(Lbh3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch3/x0;->w:Lbh3/b;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lxg3/r;

    new-instance v0, Lch3/w0;

    invoke-direct {v0, p1}, Lch3/w0;-><init>(Lxg3/r;)V

    invoke-virtual {p1, v0}, Lxg3/r;->c(Lxg3/t;)V

    :try_start_0
    iget-object p1, p0, Lch3/x0;->w:Lbh3/b;

    invoke-interface {p1, v0}, Lbh3/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lch3/w0;->c(Ljava/lang/Throwable;)V

    return-void
.end method
