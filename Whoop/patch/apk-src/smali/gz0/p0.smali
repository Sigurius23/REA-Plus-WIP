.class public abstract Lgz0/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0017\u0010\u000b\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "T",
        "Lkotlin/Function1;",
        "Lkd1/g;",
        "",
        "block",
        "b",
        "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "Lgz0/o0;",
        "a",
        "Lgz0/o0;",
        "()Lgz0/o0;",
        "Icons",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lgz0/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    invoke-static {}, Lgz0/b;->c()Lgz0/a;

    move-result-object v1

    invoke-static {}, Lgz0/d;->c()Lgz0/c;

    move-result-object v2

    invoke-static {}, Lgz0/l;->c()Lgz0/k;

    move-result-object v3

    invoke-static {}, Lgz0/n;->c()Lgz0/m;

    move-result-object v4

    invoke-static {}, Lgz0/p;->b()Lgz0/o;

    move-result-object v5

    invoke-static {}, Lgz0/v;->b()Lgz0/u;

    move-result-object v6

    invoke-static {}, Lgz0/x;->b()Lgz0/w;

    move-result-object v7

    invoke-static {}, Lgz0/z;->b()Lgz0/y;

    move-result-object v16

    invoke-static {}, Lgz0/b0;->b()Lgz0/a0;

    move-result-object v8

    invoke-static {}, Lgz0/f0;->b()Lgz0/e0;

    move-result-object v9

    invoke-static {}, Lgz0/d0;->b()Lgz0/c0;

    move-result-object v10

    invoke-static {}, Lgz0/h0;->b()Lgz0/g0;

    move-result-object v11

    invoke-static {}, Lgz0/l0;->b()Lgz0/k0;

    move-result-object v12

    invoke-static {}, Lgz0/j0;->b()Lgz0/i0;

    move-result-object v13

    invoke-static {}, Lgz0/r;->b()Lgz0/q;

    move-result-object v14

    invoke-static {}, Lgz0/t;->b()Lgz0/s;

    move-result-object v15

    new-instance v0, Lgz0/o0;

    invoke-direct/range {v0 .. v16}, Lgz0/o0;-><init>(Lgz0/a;Lgz0/c;Lgz0/k;Lgz0/m;Lgz0/o;Lgz0/u;Lgz0/w;Lgz0/a0;Lgz0/e0;Lgz0/c0;Lgz0/g0;Lgz0/k0;Lgz0/i0;Lgz0/q;Lgz0/s;Lgz0/y;)V

    sput-object v0, Lgz0/p0;->a:Lgz0/o0;

    return-void
.end method

.method public static final a()Lgz0/o0;
    .locals 1

    sget-object v0, Lgz0/p0;->a:Lgz0/o0;

    return-object v0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")TT;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkd1/g;

    invoke-direct {v0}, Lkd1/g;-><init>()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
