.class public abstract Lvj0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lnt0/e;",
        "Lvj0/a;",
        "a",
        "(Lnt0/e;)Lvj0/a;",
        "connectivity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lnt0/e;)Lvj0/a;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvj0/a;

    invoke-virtual {p0}, Llt0/b;->Y()Lfk2/a;

    move-result-object v2

    invoke-virtual {p0}, Lnt0/e;->g0()I

    move-result v3

    invoke-virtual {p0}, Llt0/b;->Q()J

    move-result-wide v4

    invoke-virtual {p0}, Lnt0/e;->n0()I

    move-result v7

    invoke-virtual {p0}, Lnt0/e;->h0()[S

    move-result-object v8

    invoke-virtual {p0}, Lnt0/e;->i0()[S

    move-result-object v9

    invoke-virtual {p0}, Lnt0/e;->j0()[S

    move-result-object v10

    invoke-virtual {p0}, Lnt0/e;->o0()I

    move-result v11

    invoke-virtual {p0}, Lnt0/e;->k0()[S

    move-result-object v12

    invoke-virtual {p0}, Lnt0/e;->l0()[S

    move-result-object v13

    invoke-virtual {p0}, Lnt0/e;->m0()[S

    move-result-object v14

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v14}, Lvj0/a;-><init>(Lfk2/a;IJII[S[S[SI[S[S[S)V

    return-object v1
.end method
