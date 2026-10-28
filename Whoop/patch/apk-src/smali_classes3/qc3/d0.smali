.class public final Lqc3/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc3/b;
.implements Lqc3/d;


# instance fields
.field public final a:Laa3/u0;


# direct methods
.method public constructor <init>(Laa3/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc3/d0;->a:Laa3/u0;

    return-void
.end method


# virtual methods
.method public final c()Laa3/u0;
    .locals 1

    iget-object v0, p0, Lqc3/d0;->a:Laa3/u0;

    return-object v0
.end method

.method public final d(Lsc3/k;)V
    .locals 1

    iget-object v0, p0, Lqc3/d0;->a:Laa3/u0;

    invoke-virtual {v0, p1}, Laa3/u0;->f(Lsc3/k;)V

    return-void
.end method

.method public final f()Lqc3/b;
    .locals 3

    new-instance v0, Lqc3/d0;

    new-instance v1, Laa3/u0;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Laa3/u0;-><init>(I)V

    invoke-direct {v0, v1}, Lqc3/d0;-><init>(Laa3/u0;)V

    return-object v0
.end method
