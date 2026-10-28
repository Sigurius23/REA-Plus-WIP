.class public final Lzp2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzp2/j$a;,
        Lzp2/j$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000  2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J1\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u00152\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lzp2/j;",
        "",
        "Lcom/whoop/user/journey/sources/data/UserJourneyApi;",
        "userJourneyApi",
        "Lbc3/c0;",
        "coroutineScope",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/user/journey/sources/data/UserJourneyApi;Lbc3/c0;Ltr2/n;)V",
        "Lzp2/k;",
        "prevState",
        "",
        "changeValue",
        "year",
        "f",
        "(Lzp2/k;II)Lzp2/k;",
        "",
        "Lkz0/a;",
        "sections",
        "stepIndex",
        "Ll83/k;",
        "c",
        "(Ljava/util/List;I)Ll83/k;",
        "Ll83/a0;",
        "g",
        "(I)V",
        "",
        "e",
        "(Lzp2/k;)Z",
        "Lzp2/h;",
        "action",
        "d",
        "(Lzp2/h;)Lzp2/k;",
        "a",
        "Lcom/whoop/user/journey/sources/data/UserJourneyApi;",
        "b",
        "Lbc3/c0;",
        "Ltr2/n;",
        "user-journey_release"
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
.field public static final d:Lzp2/j$a;

.field public static final e:I


# instance fields
.field private final a:Lcom/whoop/user/journey/sources/data/UserJourneyApi;

.field private final b:Lbc3/c0;

.field private final c:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzp2/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzp2/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzp2/j;->d:Lzp2/j$a;

    const/16 v0, 0x8

    sput v0, Lzp2/j;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/user/journey/sources/data/UserJourneyApi;Lbc3/c0;Ltr2/n;)V
    .locals 1

    const-string v0, "userJourneyApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp2/j;->a:Lcom/whoop/user/journey/sources/data/UserJourneyApi;

    iput-object p2, p0, Lzp2/j;->b:Lbc3/c0;

    iput-object p3, p0, Lzp2/j;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lzp2/j;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lzp2/j;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic b(Lzp2/j;)Lcom/whoop/user/journey/sources/data/UserJourneyApi;
    .locals 0

    iget-object p0, p0, Lzp2/j;->a:Lcom/whoop/user/journey/sources/data/UserJourneyApi;

    return-object p0
.end method

.method private final c(Ljava/util/List;I)Ll83/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkz0/a;",
            ">;I)",
            "Ll83/k;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance p1, Ll83/k;

    invoke-direct {p1, v1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v3, v0, 0x1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkz0/a;

    invoke-virtual {v4}, Lkz0/a;->d()I

    move-result v5

    add-int/2addr v5, v2

    if-ge p2, v5, :cond_1

    new-instance p1, Ll83/k;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sub-int/2addr p2, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    invoke-virtual {v4}, Lkz0/a;->d()I

    move-result v0

    add-int/2addr v2, v0

    move v0, v3

    goto :goto_0

    :cond_2
    new-instance p2, Ll83/k;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkz0/a;

    invoke-virtual {p1}, Lkz0/a;->d()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method private final e(Lzp2/k;)Z
    .locals 2

    invoke-virtual {p1}, Lzp2/k;->a()I

    move-result v0

    invoke-virtual {p1}, Lzp2/k;->c()I

    move-result p1

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final f(Lzp2/k;II)Lzp2/k;
    .locals 11

    invoke-virtual {p1}, Lzp2/k;->a()I

    move-result v0

    add-int/2addr v0, p2

    invoke-virtual {p1}, Lzp2/k;->c()I

    move-result p2

    const/4 v1, 0x1

    sub-int/2addr p2, v1

    const/4 v2, 0x0

    invoke-static {v0, v2, p2}, Le93/b;->n(III)I

    move-result p2

    invoke-virtual {p1}, Lzp2/k;->b()Lzp2/a;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lzp2/a;->c()Ljava/util/List;

    move-result-object v4

    invoke-direct {p0, v4, p2}, Lzp2/j;->c(Ljava/util/List;I)Ll83/k;

    move-result-object v4

    iget-object v5, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v0}, Lzp2/a;->c()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v8, v2

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v10, v8, 0x1

    if-ltz v8, :cond_2

    check-cast v9, Lkz0/a;

    if-ge v8, v5, :cond_0

    invoke-virtual {v9}, Lkz0/a;->d()I

    move-result v8

    invoke-static {v9, v2, v8, v1, v3}, Lkz0/a;->b(Lkz0/a;IIILjava/lang/Object;)Lkz0/a;

    move-result-object v9

    goto :goto_1

    :cond_0
    if-ne v8, v5, :cond_1

    invoke-static {v9, v2, v4, v1, v3}, Lkz0/a;->b(Lkz0/a;IIILjava/lang/Object;)Lkz0/a;

    move-result-object v9

    :cond_1
    :goto_1
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v8, v10

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_3
    invoke-virtual {v0, v7, v5, v4}, Lzp2/a;->a(Ljava/util/List;II)Lzp2/a;

    move-result-object v3

    :cond_4
    new-instance v0, Lzp2/k;

    invoke-virtual {p1}, Lzp2/k;->c()I

    move-result p1

    invoke-direct {v0, p2, p1, v3}, Lzp2/k;-><init>(IILzp2/a;)V

    invoke-direct {p0, v0}, Lzp2/j;->e(Lzp2/k;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-direct {p0, p3}, Lzp2/j;->g(I)V

    :cond_5
    return-object v0
.end method

.method private final g(I)V
    .locals 3

    iget-object v0, p0, Lzp2/j;->b:Lbc3/c0;

    new-instance v1, Lzp2/j$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lzp2/j$c;-><init>(Lzp2/j;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final d(Lzp2/h;)Lzp2/k;
    .locals 2

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lzp2/h;->b()Lzp2/i;

    move-result-object v0

    sget-object v1, Lzp2/j$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lzp2/h;->a()Lzp2/k;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p1}, Lzp2/h;->c()I

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lzp2/j;->f(Lzp2/k;II)Lzp2/k;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lzp2/h;->a()Lzp2/k;

    move-result-object v0

    invoke-virtual {p1}, Lzp2/h;->c()I

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lzp2/j;->f(Lzp2/k;II)Lzp2/k;

    move-result-object p1

    return-object p1
.end method
