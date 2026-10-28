.class public final Llk0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llk0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0084\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Llk0/a$a;",
        "",
        "<init>",
        "()V",
        "Llk0/a;",
        "whoopStrapCommandCallback",
        "Lzj0/h;",
        "commandResponsePacket",
        "Ll83/a0;",
        "a",
        "(Llk0/a;Lzj0/h;)V",
        "connectivity_release"
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
    invoke-direct {p0}, Llk0/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llk0/a;Lzj0/h;)V
    .locals 1

    const-string v0, "whoopStrapCommandCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandResponsePacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lzj0/e0;

    if-eqz v0, :cond_0

    check-cast p2, Lzj0/e0;

    invoke-virtual {p1, p2}, Llk0/a;->p(Lzj0/e0;)V

    return-void

    :cond_0
    instance-of v0, p2, Lzj0/n;

    if-eqz v0, :cond_1

    check-cast p2, Lzj0/n;

    invoke-virtual {p1, p2}, Llk0/a;->i(Lzj0/n;)V

    return-void

    :cond_1
    instance-of v0, p2, Lzj0/p;

    if-eqz v0, :cond_2

    check-cast p2, Lzj0/p;

    invoke-virtual {p1, p2}, Llk0/a;->j(Lzj0/p;)V

    return-void

    :cond_2
    instance-of v0, p2, Lzj0/q;

    if-eqz v0, :cond_3

    check-cast p2, Lzj0/q;

    invoke-virtual {p1, p2}, Llk0/a;->k(Lzj0/q;)V

    return-void

    :cond_3
    instance-of v0, p2, Lzj0/u;

    if-eqz v0, :cond_4

    check-cast p2, Lzj0/u;

    invoke-virtual {p1, p2}, Llk0/a;->l(Lzj0/u;)V

    return-void

    :cond_4
    instance-of v0, p2, Lzj0/w;

    if-eqz v0, :cond_5

    check-cast p2, Lzj0/w;

    invoke-virtual {p1, p2}, Llk0/a;->m(Lzj0/w;)V

    return-void

    :cond_5
    instance-of v0, p2, Lzj0/a1;

    if-eqz v0, :cond_6

    check-cast p2, Lzj0/a1;

    invoke-virtual {p1, p2}, Llk0/a;->q(Lzj0/a1;)V

    return-void

    :cond_6
    instance-of v0, p2, Lzj0/b0;

    if-eqz v0, :cond_7

    check-cast p2, Lzj0/b0;

    invoke-virtual {p1, p2}, Llk0/a;->n(Lzj0/b0;)V

    return-void

    :cond_7
    instance-of v0, p2, Lzj0/c0;

    if-eqz v0, :cond_8

    check-cast p2, Lzj0/c0;

    invoke-virtual {p1, p2}, Llk0/a;->o(Lzj0/c0;)V

    return-void

    :cond_8
    instance-of v0, p2, Lzj0/d1;

    if-eqz v0, :cond_9

    check-cast p2, Lzj0/d1;

    invoke-virtual {p1, p2}, Llk0/a;->r(Lzj0/d1;)V

    return-void

    :cond_9
    instance-of v0, p2, Lzj0/j1;

    if-eqz v0, :cond_a

    check-cast p2, Lzj0/j1;

    invoke-virtual {p1, p2}, Llk0/a;->s(Lzj0/j1;)V

    return-void

    :cond_a
    instance-of v0, p2, Lak0/c;

    if-eqz v0, :cond_b

    check-cast p2, Lak0/c;

    invoke-virtual {p1, p2}, Llk0/a;->h(Lak0/c;)V

    return-void

    :cond_b
    instance-of v0, p2, Lzj0/l;

    if-eqz v0, :cond_c

    check-cast p2, Lzj0/l;

    invoke-virtual {p1, p2}, Llk0/a;->g(Lzj0/l;)V

    :cond_c
    return-void
.end method
