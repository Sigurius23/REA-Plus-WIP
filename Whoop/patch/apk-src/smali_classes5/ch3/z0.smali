.class public final Lch3/z0;
.super Lxg3/r;
.source "SourceFile"


# instance fields
.field public final x:Lxg3/s;


# direct methods
.method public constructor <init>(Lxg3/s;)V
    .locals 0

    invoke-direct {p0}, Lxg3/r;-><init>()V

    iput-object p1, p0, Lch3/z0;->x:Lxg3/s;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lch3/z0;->x:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Ldh3/b;

    iget-object v1, p0, Lch3/z0;->x:Lxg3/s;

    invoke-direct {v0, v1, p1}, Ldh3/b;-><init>(Lxg3/s;Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lxg3/s;->f(Lxg3/i;)V

    return-void
.end method
