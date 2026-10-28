.class public final Lb61/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lb61/l;",
        "",
        "<init>",
        "()V",
        "Lj71/b;",
        "plotState",
        "Lb61/a;",
        "a",
        "(Lj71/b;)Lb61/a;",
        "design_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj71/b;)Lb61/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj71/b;",
            ")",
            "Lb61/a<",
            "Lj71/b;",
            ">;"
        }
    .end annotation

    const-string v0, "plotState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj71/b$a;

    if-eqz v0, :cond_0

    new-instance p1, Ll61/b;

    invoke-direct {p1}, Ll61/b;-><init>()V

    return-object p1

    :cond_0
    instance-of v0, p1, Lj71/b$b;

    if-eqz v0, :cond_1

    new-instance p1, Ld71/a;

    invoke-direct {p1}, Ld71/a;-><init>()V

    return-object p1

    :cond_1
    instance-of v0, p1, Lj71/b$c;

    if-eqz v0, :cond_2

    new-instance p1, Ln61/a;

    invoke-direct {p1}, Ln61/a;-><init>()V

    return-object p1

    :cond_2
    instance-of v0, p1, Lj71/b$d;

    if-eqz v0, :cond_3

    new-instance p1, Ln61/b;

    invoke-direct {p1}, Ln61/b;-><init>()V

    return-object p1

    :cond_3
    instance-of v0, p1, Lj71/b$g;

    if-eqz v0, :cond_4

    new-instance p1, Lr61/f;

    invoke-direct {p1}, Lr61/f;-><init>()V

    return-object p1

    :cond_4
    instance-of v0, p1, Lj71/b$e;

    if-eqz v0, :cond_5

    new-instance p1, Lo61/b;

    invoke-direct {p1}, Lo61/b;-><init>()V

    return-object p1

    :cond_5
    instance-of v0, p1, Lj71/b$i;

    if-eqz v0, :cond_6

    new-instance p1, Lv61/e;

    invoke-direct {p1}, Lv61/e;-><init>()V

    return-object p1

    :cond_6
    instance-of v0, p1, Lj71/b$k;

    if-eqz v0, :cond_7

    new-instance p1, Lb71/a;

    invoke-direct {p1}, Lb71/a;-><init>()V

    return-object p1

    :cond_7
    instance-of v0, p1, Lj71/b$f;

    if-eqz v0, :cond_8

    new-instance p1, Lq61/d;

    invoke-direct {p1}, Lq61/d;-><init>()V

    return-object p1

    :cond_8
    instance-of v0, p1, Lj71/b$j;

    if-eqz v0, :cond_9

    new-instance p1, Lz61/a;

    invoke-direct {p1}, Lz61/a;-><init>()V

    return-object p1

    :cond_9
    instance-of v0, p1, Lj71/b$n;

    if-eqz v0, :cond_a

    new-instance p1, Lt81/t;

    invoke-direct {p1}, Lt81/t;-><init>()V

    return-object p1

    :cond_a
    instance-of v0, p1, Lj71/b$h;

    if-eqz v0, :cond_b

    new-instance p1, Lp61/a;

    invoke-direct {p1}, Lp61/a;-><init>()V

    return-object p1

    :cond_b
    instance-of v0, p1, Lj71/b$l;

    if-eqz v0, :cond_c

    new-instance p1, Lf71/a;

    invoke-direct {p1}, Lf71/a;-><init>()V

    return-object p1

    :cond_c
    instance-of p1, p1, Lj71/b$m;

    if-eqz p1, :cond_d

    new-instance p1, Lg71/b;

    invoke-direct {p1}, Lg71/b;-><init>()V

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
