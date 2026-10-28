.class final Lq92/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq92/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lq92/g$a;",
        "",
        "<init>",
        "()V",
        "Lq92/g;",
        "whoopStrapConnectionCallback",
        "Lst0/f;",
        "connectionState",
        "Ll83/a0;",
        "a",
        "(Lq92/g;Lst0/f;)V",
        "core_release"
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
    invoke-direct {p0}, Lq92/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq92/g;Lst0/f;)V
    .locals 1

    const-string v0, "whoopStrapConnectionCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lst0/c;->a:Lst0/c;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lq92/g;->h()V

    return-void

    :cond_0
    sget-object v0, Lst0/b;->a:Lst0/b;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lq92/g;->g()V

    return-void

    :cond_1
    sget-object v0, Lst0/e;->a:Lst0/e;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lq92/g;->j()V

    return-void

    :cond_2
    sget-object v0, Lst0/d;->a:Lst0/d;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lq92/g;->i()V

    return-void

    :cond_3
    sget-object v0, Lst0/n;->a:Lst0/n;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lq92/g;->o()V

    return-void

    :cond_4
    sget-object v0, Lst0/m;->a:Lst0/m;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    sget-object v0, Lst0/h;->a:Lst0/h;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lq92/g;->m()V

    return-void

    :cond_5
    sget-object v0, Lst0/g;->a:Lst0/g;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lq92/g;->l()V

    return-void

    :cond_6
    sget-object v0, Lst0/j;->a:Lst0/j;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lq92/g;->n()V

    return-void

    :cond_7
    sget-object v0, Lst0/o;->a:Lst0/o;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lq92/g;->p()V

    return-void

    :cond_8
    sget-object v0, Lst0/k;->a:Lst0/k;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    instance-of v0, p2, Lst0/i;

    if-eqz v0, :cond_9

    check-cast p2, Lst0/i;

    invoke-virtual {p2}, Lst0/i;->a()I

    move-result v0

    invoke-virtual {p2}, Lst0/i;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lq92/g;->k(ILjava/lang/String;)V

    return-void

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    return-void
.end method
