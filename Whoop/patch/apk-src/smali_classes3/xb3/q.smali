.class public final Lxb3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb3/i;
.implements Lxb3/c;


# instance fields
.field public final a:Lxb3/i;

.field public final b:I


# direct methods
.method public constructor <init>(Lxb3/i;I)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb3/q;->a:Lxb3/i;

    iput p2, p0, Lxb3/q;->b:I

    if-ltz p2, :cond_0

    return-void

    :cond_0
    const-string p1, "count must be non-negative, but was "

    const/16 v0, 0x2e

    invoke-static {p1, p2, v0}, Lr80/c;->o(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a(I)Lxb3/i;
    .locals 3

    iget v0, p0, Lxb3/q;->b:I

    if-lt p1, v0, :cond_0

    sget-object p1, Lxb3/d;->a:Lxb3/d;

    return-object p1

    :cond_0
    new-instance v1, Lxb3/p;

    iget-object v2, p0, Lxb3/q;->a:Lxb3/i;

    invoke-direct {v1, v2, p1, v0}, Lxb3/p;-><init>(Lxb3/i;II)V

    return-object v1
.end method

.method public final b(I)Lxb3/i;
    .locals 2

    iget v0, p0, Lxb3/q;->b:I

    if-lt p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lxb3/q;

    iget-object v1, p0, Lxb3/q;->a:Lxb3/i;

    invoke-direct {v0, v1, p1}, Lxb3/q;-><init>(Lxb3/i;I)V

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lh5/r0;

    invoke-direct {v0, p0}, Lh5/r0;-><init>(Lxb3/q;)V

    return-object v0
.end method
