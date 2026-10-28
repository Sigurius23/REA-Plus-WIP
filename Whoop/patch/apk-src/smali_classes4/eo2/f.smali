.class public final Leo2/f;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Leo2/f;",
        "Landroidx/lifecycle/w1;",
        "Lcom/whoop/universalcheckout/features/cart/domain/d;",
        "interactor",
        "Leo2/h;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/universalcheckout/features/cart/domain/d;Leo2/h;Lbc3/c0;)V",
        "Leo2/c$h;",
        "Lcom/whoop/universalcheckout/features/cart/domain/a;",
        "o",
        "(Leo2/c$h;)Lcom/whoop/universalcheckout/features/cart/domain/a;",
        "event",
        "Ll83/a0;",
        "n",
        "(Leo2/c$h;)V",
        "w",
        "Leo2/h;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Leo2/g;",
        "z",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "universal-checkout_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Leo2/h;

.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final z:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Leo2/h;Lbc3/c0;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Leo2/f;->w:Leo2/h;

    .line 3
    iput-object p3, p0, Leo2/f;->x:Lbc3/c0;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Leo2/f;->y:Lec3/o1;

    .line 5
    new-instance v0, Leo2/f$b;

    invoke-direct {v0, p2, p0}, Leo2/f$b;-><init>(Lec3/l;Leo2/f;)V

    .line 6
    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 7
    new-instance p2, Leo2/f$c;

    invoke-direct {p2, p1, p0}, Leo2/f$c;-><init>(Lec3/l;Leo2/f;)V

    .line 8
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p2, p3, p1, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Leo2/f;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Leo2/h;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 9
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Leo2/f;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Leo2/h;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Leo2/f;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Leo2/f;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Leo2/f;)Leo2/h;
    .locals 0

    iget-object p0, p0, Leo2/f;->w:Leo2/h;

    return-object p0
.end method

.method public static final synthetic l(Leo2/f;Leo2/c$h;)Lcom/whoop/universalcheckout/features/cart/domain/a;
    .locals 0

    invoke-direct {p0, p1}, Leo2/f;->o(Leo2/c$h;)Lcom/whoop/universalcheckout/features/cart/domain/a;

    move-result-object p0

    return-object p0
.end method

.method private final o(Leo2/c$h;)Lcom/whoop/universalcheckout/features/cart/domain/a;
    .locals 8

    instance-of v0, p1, Leo2/c$e;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/universalcheckout/features/cart/domain/a$a;

    check-cast p1, Leo2/c$e;

    invoke-virtual {p1}, Leo2/c$e;->a()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Leo2/c$b;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/whoop/universalcheckout/features/cart/domain/a$a;

    check-cast p1, Leo2/c$b;

    invoke-virtual {p1}, Leo2/c$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Leo2/c$b;->b()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Leo2/c$a;

    if-eqz v0, :cond_2

    new-instance v1, Lcom/whoop/universalcheckout/features/cart/domain/a$a;

    check-cast p1, Leo2/c$a;

    invoke-virtual {p1}, Leo2/c$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Leo2/c$a;->b()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/cart/domain/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of v0, p1, Leo2/c$g;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/a$c;

    check-cast p1, Leo2/c$g;

    invoke-virtual {p1}, Leo2/c$g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Leo2/c$g;->d()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/whoop/universalcheckout/features/cart/domain/a$c;-><init>(Ljava/lang/String;I)V

    return-object v0

    :cond_3
    instance-of v0, p1, Leo2/c$f;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/a$b;

    check-cast p1, Leo2/c$f;

    invoke-virtual {p1}, Leo2/c$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/universalcheckout/features/cart/domain/a$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Leo2/f;->z:Lec3/l;

    return-object v0
.end method

.method public final n(Leo2/c$h;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leo2/f;->x:Lbc3/c0;

    new-instance v1, Leo2/f$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Leo2/f$a;-><init>(Leo2/f;Leo2/c$h;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
