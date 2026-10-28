.class public final Lex1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lex1/a;",
        "Lex1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00030\u000eH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J6\u0010\u0015\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J#\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lex1/c;",
        "Lod1/g;",
        "Lex1/a;",
        "Lex1/b;",
        "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;",
        "membershipManagementApi",
        "Lsr2/y;",
        "urlProvider",
        "Lax1/b;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lax1/b;Ltr2/n;)V",
        "Lec3/m;",
        "g",
        "(Lec3/m;Lq83/d;)Ljava/lang/Object;",
        "",
        "path",
        "",
        "payload",
        "f",
        "(Lec3/m;Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;",
        "b",
        "Lsr2/y;",
        "c",
        "Lax1/b;",
        "d",
        "Ltr2/n;",
        "membership_release"
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
.field private final a:Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

.field private final b:Lsr2/y;

.field private final c:Lax1/b;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lax1/b;Ltr2/n;)V
    .locals 1

    const-string v0, "membershipManagementApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lex1/c;->a:Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    .line 3
    iput-object p2, p0, Lex1/c;->b:Lsr2/y;

    .line 4
    iput-object p3, p0, Lex1/c;->c:Lax1/b;

    .line 5
    iput-object p4, p0, Lex1/c;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lax1/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "MembershipManagementInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lex1/c;-><init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lsr2/y;Lax1/b;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lex1/c;Lec3/m;Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lex1/c;->f(Lec3/m;Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lex1/c;Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lex1/c;->g(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lex1/c;)Lcom/whoop/membership/management/domain/api/MembershipManagementApi;
    .locals 0

    iget-object p0, p0, Lex1/c;->a:Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    return-object p0
.end method

.method private final f(Lec3/m;Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lex1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lex1/c$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lex1/c$a;

    iget v1, v0, Lex1/c$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lex1/c$a;->I:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lex1/c$a;

    invoke-direct {v0, p0, p4}, Lex1/c$a;-><init>(Lex1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Lex1/c$a;->G:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lex1/c$a;->I:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lex1/c$a;->F:Ljava/lang/Object;

    check-cast p1, Lkotlinx/serialization/json/JsonObject;

    iget-object p1, v6, Lex1/c$a;->E:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iget-object p1, v6, Lex1/c$a;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lex1/c$a;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iget-object p2, v6, Lex1/c$a;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object p3, v6, Lex1/c$a;->w:Ljava/lang/Object;

    check-cast p3, Lec3/m;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lex1/c$a;->y:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Ljava/util/Map;

    iget-object p1, v6, Lex1/c$a;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    iget-object p1, v6, Lex1/c$a;->w:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p4, Lex1/b$c;->a:Lex1/b$c;

    iput-object v4, v6, Lex1/c$a;->w:Ljava/lang/Object;

    iput-object p2, v6, Lex1/c$a;->x:Ljava/lang/Object;

    iput-object p3, v6, Lex1/c$a;->y:Ljava/lang/Object;

    iput v3, v6, Lex1/c$a;->I:I

    invoke-interface {p1, p4, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    iget-object p1, p0, Lex1/c;->b:Lsr2/y;

    invoke-virtual {p1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object p4, Lad3/c;->d:Lad3/b;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v1, v1}, Lxc3/a;->c(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    move-result-object v1

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p4, p3, v1}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p4

    new-instance v1, Ll83/k;

    const-string v3, "payload"

    invoke-direct {v1, v3, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object p4

    invoke-static {p4}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object p4

    new-instance v1, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v1, p4}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    move-object p4, v1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Lex1/c;->d:Ltr2/n;

    new-instance v5, Lex1/c$b;

    invoke-direct {v5, p0, p1, p4, v4}, Lex1/c$b;-><init>(Lex1/c;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)V

    iput-object v4, v6, Lex1/c$a;->w:Ljava/lang/Object;

    iput-object p2, v6, Lex1/c$a;->x:Ljava/lang/Object;

    iput-object p3, v6, Lex1/c$a;->y:Ljava/lang/Object;

    iput-object v4, v6, Lex1/c$a;->z:Ljava/lang/Object;

    iput-object v4, v6, Lex1/c$a;->E:Ljava/lang/Object;

    iput-object v4, v6, Lex1/c$a;->F:Ljava/lang/Object;

    iput v3, v6, Lex1/c$a;->I:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    move-object p1, p3

    :goto_4
    check-cast p4, Lu02/a;

    instance-of p3, p4, Lu02/a$c;

    if-eqz p3, :cond_6

    sget-object p1, Lex1/b$f;->a:Lex1/b$f;

    return-object p1

    :cond_6
    instance-of p3, p4, Lu02/a$b;

    if-eqz p3, :cond_7

    new-instance p3, Lex1/b$b;

    invoke-direct {p3, p2, p1}, Lex1/b$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p3

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lex1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lex1/c$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lex1/c$c;

    iget v1, v0, Lex1/c$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lex1/c$c;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lex1/c$c;

    invoke-direct {v0, p0, p2}, Lex1/c$c;-><init>(Lex1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lex1/c$c;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lex1/c$c;->z:I

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v10, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lex1/c$c;->w:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lex1/c$c;->w:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lex1/b$c;->a:Lex1/b$c;

    iput-object v11, v6, Lex1/c$c;->w:Ljava/lang/Object;

    iput v10, v6, Lex1/c$c;->z:I

    invoke-interface {p1, p2, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lex1/c;->d:Ltr2/n;

    new-instance v5, Lex1/c$d;

    invoke-direct {v5, p0, v11}, Lex1/c$d;-><init>(Lex1/c;Lq83/d;)V

    iput-object v11, v6, Lex1/c$c;->w:Ljava/lang/Object;

    iput v9, v6, Lex1/c$c;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    :goto_4
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_d

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;

    invoke-virtual {p1}, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;->getSections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/membership/management/domain/models/ScreenSection;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/ScreenSection;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v0, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    if-eqz v0, :cond_8

    add-int/lit8 v1, v1, 0x1

    if-ltz v1, :cond_9

    goto :goto_6

    :cond_9
    invoke-static {}, Lwb3/f;->c0()V

    throw v11

    :cond_a
    :goto_7
    if-eq v1, v10, :cond_c

    if-eq v1, v9, :cond_b

    :goto_8
    move-object v3, v11

    goto :goto_9

    :cond_b
    const-string v11, "PL"

    goto :goto_8

    :cond_c
    const-string v11, "L"

    goto :goto_8

    :goto_9
    iget-object p1, p0, Lex1/c;->c:Lax1/b;

    new-instance v0, Lax1/a$o;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;->getTrackingMonths()I

    move-result v4

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;->getTrackingUpgradesAvailable()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;

    invoke-virtual {v1}, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;->getTrackingCardUpsell()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x43

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lax1/a$o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lax1/b;->a(Lax1/a;)V

    new-instance p1, Lex1/b$d;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;

    invoke-direct {p1, p2}, Lex1/b$d;-><init>(Lcom/whoop/membership/management/domain/models/MembershipManagementScreenResponse;)V

    return-object p1

    :cond_d
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_e

    sget-object p1, Lex1/b$a;->a:Lex1/b$a;

    return-object p1

    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lex1/c$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lex1/c$e;-><init>(Lec3/l;Lex1/c;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method
