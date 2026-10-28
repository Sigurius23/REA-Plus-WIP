.class public final Lf52/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf52/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lf52/b$a;",
        "",
        "<init>",
        "()V",
        "Lpu0/a;",
        "packet",
        "Lf52/b;",
        "a",
        "(Lpu0/a;)Lf52/b;",
        "puffin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf52/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpu0/a;)Lf52/b;
    .locals 11

    const-string v0, "packet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf52/b;

    new-instance v1, Loh2/c;

    invoke-virtual {p1}, Lpu0/a;->f()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1}, Lpu0/a;->h()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {p1}, Lpu0/a;->g()I

    move-result v6

    int-to-long v6, v6

    invoke-direct/range {v1 .. v7}, Loh2/c;-><init>(JJJ)V

    new-instance v2, Loh2/b$b;

    invoke-virtual {p1}, Lpu0/a;->c()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {p1}, Lpu0/a;->d()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {p1}, Lpu0/a;->e()I

    move-result v7

    int-to-long v7, v7

    invoke-virtual {p1}, Lpu0/a;->b()I

    move-result v9

    int-to-long v9, v9

    invoke-direct/range {v2 .. v10}, Loh2/b$b;-><init>(JJJJ)V

    invoke-virtual {p1}, Lpu0/a;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2, p1}, Lf52/b;-><init>(Loh2/c;BLoh2/b$b;Ljava/lang/String;)V

    return-object v0
.end method
