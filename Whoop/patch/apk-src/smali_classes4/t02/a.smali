.class public final Lt02/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lt02/a;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;",
        "Lhb1/d;",
        "b",
        "(Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;)Lhb1/d;",
        "Lq02/b;",
        "state",
        "Lhb1/g;",
        "a",
        "(Lq02/b;)Lhb1/g;",
        "Ljb1/a;",
        "nested-bff-arch-mini_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lt02/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt02/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Ljb1/a;

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-direct {p1, p3, p3, p2, p3}, Ljb1/a;-><init>(Llb1/y0;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lt02/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;)Lhb1/d;
    .locals 7

    new-instance v0, Lhb1/d;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lt02/a;->a:Ljb1/a;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;->getItems()Ljava/util/List;

    move-result-object p1

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v4, p1, v5, v6, v5}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lhb1/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lq02/b;)Lhb1/g;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lq02/b$b;

    if-eqz v0, :cond_0

    sget-object p1, Lhb1/g$c;->a:Lhb1/g$c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lq02/b$c;

    if-eqz v0, :cond_2

    check-cast p1, Lq02/b$c;

    invoke-virtual {p1}, Lq02/b$c;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;

    invoke-direct {p0, v1}, Lt02/a;->b(Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;)Lhb1/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Lhb1/g$d;

    invoke-direct {p1, v0}, Lhb1/g$d;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_2
    instance-of v0, p1, Lq02/b$a$a;

    if-eqz v0, :cond_3

    new-instance p1, Lhb1/g$a;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lhb1/g$a;-><init>(Z)V

    return-object p1

    :cond_3
    instance-of p1, p1, Lq02/b$a$b;

    if-eqz p1, :cond_4

    new-instance p1, Lhb1/g$a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lhb1/g$a;-><init>(Z)V

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
