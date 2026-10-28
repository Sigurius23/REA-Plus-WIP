.class public final Lch3/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/f;


# instance fields
.field public final w:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    iput p1, p0, Lch3/v0;->w:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "limit >= 0 required but it was "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/u0;

    invoke-direct {v0, p0, p1}, Lch3/u0;-><init>(Lch3/v0;Lxg3/s;)V

    iget v1, p0, Lch3/v0;->w:I

    if-nez v1, :cond_0

    invoke-interface {p1}, Lxg3/h;->onCompleted()V

    invoke-virtual {v0}, Lxg3/s;->b()V

    :cond_0
    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    return-object v0
.end method
