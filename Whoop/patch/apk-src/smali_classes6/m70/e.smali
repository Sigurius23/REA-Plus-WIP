.class public abstract Lm70/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lm70/a$d;",
        "Lm70/k;",
        "d",
        "(Lm70/a$d;)Lm70/k;",
        "Lm70/a$c;",
        "c",
        "(Lm70/a$c;)Lm70/k;",
        "activation_release"
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
.method public static final synthetic a(Lm70/a$c;)Lm70/k;
    .locals 0

    invoke-static {p0}, Lm70/e;->c(Lm70/a$c;)Lm70/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lm70/a$d;)Lm70/k;
    .locals 0

    invoke-static {p0}, Lm70/e;->d(Lm70/a$d;)Lm70/k;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lm70/a$c;)Lm70/k;
    .locals 7

    new-instance v0, Lm70/k;

    invoke-virtual {p0}, Lm70/a$c;->d()Ld70/g;

    move-result-object v1

    invoke-virtual {p0}, Lm70/a$c;->b()Ld70/f;

    move-result-object v2

    invoke-virtual {p0}, Lm70/a$c;->c()Ld70/f;

    move-result-object v3

    invoke-virtual {p0}, Lm70/a$c;->a()Ld70/g;

    move-result-object v4

    invoke-virtual {p0}, Lm70/a$c;->e()Ld70/g;

    move-result-object v5

    invoke-virtual {p0}, Lm70/a$c;->i()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lm70/k;-><init>(Ld70/g;Ld70/f;Ld70/f;Ld70/g;Ld70/g;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final d(Lm70/a$d;)Lm70/k;
    .locals 7

    new-instance v0, Lm70/k;

    invoke-virtual {p0}, Lm70/a$d;->d()Ld70/g;

    move-result-object v1

    invoke-virtual {p0}, Lm70/a$d;->b()Ld70/f;

    move-result-object v2

    invoke-virtual {p0}, Lm70/a$d;->c()Ld70/f;

    move-result-object v3

    invoke-virtual {p0}, Lm70/a$d;->a()Ld70/g;

    move-result-object v4

    invoke-virtual {p0}, Lm70/a$d;->e()Ld70/g;

    move-result-object v5

    invoke-virtual {p0}, Lm70/a$d;->i()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lm70/k;-><init>(Ld70/g;Ld70/f;Ld70/f;Ld70/g;Ld70/g;Ljava/lang/String;)V

    return-object v0
.end method
