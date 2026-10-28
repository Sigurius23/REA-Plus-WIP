.class public final Lqc3/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc3/b;
.implements Lqc3/o;


# instance fields
.field public final a:Laa3/u0;


# direct methods
.method public constructor <init>(Laa3/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc3/y0;->a:Laa3/u0;

    return-void
.end method

.method public static j(Lqc3/y0;)V
    .locals 4

    sget-object v0, Lqc3/o0;->w:Lqc3/o0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lsc3/s;

    new-instance v2, Lsc3/c;

    new-instance v3, Lqc3/d1;

    invoke-direct {v3, v0}, Lqc3/d1;-><init>(Lqc3/o0;)V

    invoke-direct {v2, v3}, Lsc3/c;-><init>(Lsc3/j;)V

    invoke-direct {v1, v2}, Lsc3/s;-><init>(Lsc3/c;)V

    iget-object p0, p0, Lqc3/y0;->a:Laa3/u0;

    invoke-virtual {p0, v1}, Laa3/u0;->f(Lsc3/k;)V

    return-void
.end method

.method public static k(Lqc3/y0;)V
    .locals 3

    sget-object v0, Lqc3/o0;->w:Lqc3/o0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lsc3/c;

    new-instance v2, Lqc3/b1;

    invoke-direct {v2, v0}, Lqc3/b1;-><init>(Lqc3/o0;)V

    invoke-direct {v1, v2}, Lsc3/c;-><init>(Lsc3/j;)V

    iget-object p0, p0, Lqc3/y0;->a:Laa3/u0;

    invoke-virtual {p0, v1}, Laa3/u0;->f(Lsc3/k;)V

    return-void
.end method

.method public static l(Lqc3/y0;)V
    .locals 3

    sget-object v0, Lqc3/o0;->w:Lqc3/o0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lsc3/c;

    new-instance v2, Lqc3/c1;

    invoke-direct {v2, v0}, Lqc3/c1;-><init>(Lqc3/o0;)V

    invoke-direct {v1, v2}, Lsc3/c;-><init>(Lsc3/j;)V

    iget-object p0, p0, Lqc3/y0;->a:Laa3/u0;

    invoke-virtual {p0, v1}, Laa3/u0;->f(Lsc3/k;)V

    return-void
.end method


# virtual methods
.method public final c()Laa3/u0;
    .locals 1

    iget-object v0, p0, Lqc3/y0;->a:Laa3/u0;

    return-object v0
.end method

.method public final f()Lqc3/b;
    .locals 3

    new-instance v0, Lqc3/y0;

    new-instance v1, Laa3/u0;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Laa3/u0;-><init>(I)V

    invoke-direct {v0, v1}, Lqc3/y0;-><init>(Laa3/u0;)V

    return-object v0
.end method
