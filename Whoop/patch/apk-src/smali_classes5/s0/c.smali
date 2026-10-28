.class public final Ls0/c;
.super Lf0/w;
.source "SourceFile"


# instance fields
.field public l0:Z

.field public m0:Lkotlin/jvm/functions/Function1;

.field public final n0:Lq80/h;


# direct methods
.method public constructor <init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lkotlin/jvm/functions/Function1;)V
    .locals 8

    new-instance v7, Lbv2/b;

    const/4 v0, 0x7

    invoke-direct {v7, p7, p1, v0}, Lbv2/b;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v4, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lf0/h;-><init>(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V

    iput-boolean p1, v0, Ls0/c;->l0:Z

    iput-object p7, v0, Ls0/c;->m0:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lq80/h;

    const/16 p2, 0x16

    invoke-direct {p1, p0, p2}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v0, Ls0/c;->n0:Lq80/h;

    return-void
.end method


# virtual methods
.method public final a1(Li3/z;)V
    .locals 1

    iget-boolean v0, p0, Ls0/c;->l0:Z

    invoke-static {v0}, Lse/g;->j(Z)Lk3/a;

    move-result-object v0

    invoke-static {p1, v0}, Li3/w;->m(Li3/z;Lk3/a;)V

    return-void
.end method
