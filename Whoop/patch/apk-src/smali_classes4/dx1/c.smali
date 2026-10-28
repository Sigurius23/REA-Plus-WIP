.class public final Ldx1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ldx1/a;",
        "Ldx1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00030\u000cH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Ldx1/c;",
        "Lod1/g;",
        "Ldx1/a;",
        "Ldx1/b;",
        "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;",
        "membershipManagementApi",
        "Lax1/b;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lax1/b;Ltr2/n;)V",
        "Lec3/m;",
        "e",
        "(Lec3/m;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;",
        "b",
        "Lax1/b;",
        "c",
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

.field private final b:Lax1/b;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lax1/b;Ltr2/n;)V
    .locals 1

    const-string v0, "membershipManagementApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldx1/c;->a:Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    .line 3
    iput-object p2, p0, Ldx1/c;->b:Lax1/b;

    .line 4
    iput-object p3, p0, Ldx1/c;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lax1/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "ManageMembershipInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ldx1/c;-><init>(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lax1/b;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Ldx1/c;Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldx1/c;->e(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ldx1/c;)Lcom/whoop/membership/management/domain/api/MembershipManagementApi;
    .locals 0

    iget-object p0, p0, Ldx1/c;->a:Lcom/whoop/membership/management/domain/api/MembershipManagementApi;

    return-object p0
.end method

.method private final e(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ldx1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Ldx1/c$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ldx1/c$a;

    iget v3, v2, Ldx1/c$a;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ldx1/c$a;->z:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Ldx1/c$a;

    invoke-direct {v2, v0, v1}, Ldx1/c$a;-><init>(Ldx1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Ldx1/c$a;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Ldx1/c$a;->z:I

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v12, :cond_2

    if-ne v3, v11, :cond_1

    iget-object v2, v8, Ldx1/c$a;->w:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v8, Ldx1/c$a;->w:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Ldx1/b$b;->a:Ldx1/b$b;

    iput-object v13, v8, Ldx1/c$a;->w:Ljava/lang/Object;

    iput v12, v8, Ldx1/c$a;->z:I

    move-object/from16 v3, p1

    invoke-interface {v3, v1, v8}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v4, v0, Ldx1/c;->c:Ltr2/n;

    new-instance v7, Ldx1/c$b;

    invoke-direct {v7, v0, v13}, Ldx1/c$b;-><init>(Ldx1/c;Lq83/d;)V

    iput-object v13, v8, Ldx1/c$a;->w:Ljava/lang/Object;

    iput v11, v8, Ldx1/c$a;->z:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    :goto_3
    return-object v2

    :cond_5
    :goto_4
    check-cast v1, Lu02/a;

    instance-of v2, v1, Lu02/a$c;

    if-eqz v2, :cond_16

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;

    invoke-virtual {v2}, Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;->getSections()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/membership/management/domain/models/ScreenSection;

    invoke-virtual {v4}, Lcom/whoop/membership/management/domain/models/ScreenSection;->getItems()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_7

    move v3, v4

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v4

    :cond_8
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v5, v5, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    if-eqz v5, :cond_8

    add-int/lit8 v3, v3, 0x1

    if-ltz v3, :cond_9

    goto :goto_6

    :cond_9
    invoke-static {}, Lwb3/f;->c0()V

    throw v13

    :cond_a
    :goto_7
    const-string v2, "L"

    const-string v5, "PL"

    if-eq v3, v12, :cond_c

    if-eq v3, v11, :cond_b

    move-object v3, v13

    goto :goto_8

    :cond_b
    move-object v3, v5

    goto :goto_8

    :cond_c
    move-object v3, v2

    :goto_8
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    const-string v2, "Peak and Life"

    :goto_9
    move-object/from16 v18, v2

    goto :goto_a

    :cond_d
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    const-string v2, "Life"

    goto :goto_9

    :cond_e
    move-object/from16 v18, v13

    :goto_a
    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;

    invoke-virtual {v2}, Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;->getSections()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/membership/management/domain/models/ScreenSection;

    invoke-virtual {v6}, Lcom/whoop/membership/management/domain/models/ScreenSection;->getItems()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v5, v6}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_d

    :cond_10
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_11
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v5, v5, Lcom/whoop/membership/management/domain/models/items/DowngradeMembershipCardModel;

    if-eqz v5, :cond_11

    add-int/lit8 v4, v4, 0x1

    if-ltz v4, :cond_12

    goto :goto_c

    :cond_12
    invoke-static {}, Lwb3/f;->c0()V

    throw v13

    :cond_13
    :goto_d
    if-eq v4, v12, :cond_15

    if-eq v4, v11, :cond_14

    :goto_e
    move-object/from16 v19, v13

    goto :goto_f

    :cond_14
    const-string v13, "One and Peak"

    goto :goto_e

    :cond_15
    const-string v13, "One"

    goto :goto_e

    :goto_f
    iget-object v2, v0, Ldx1/c;->b:Lax1/b;

    new-instance v14, Lax1/a$n;

    const/16 v21, 0x23

    const/16 v22, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v3

    invoke-direct/range {v14 .. v22}, Lax1/a$n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v14}, Lax1/b;->a(Lax1/a;)V

    new-instance v2, Ldx1/b$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;

    invoke-direct {v2, v1}, Ldx1/b$c;-><init>(Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;)V

    return-object v2

    :cond_16
    instance-of v1, v1, Lu02/a$b;

    if-eqz v1, :cond_17

    sget-object v1, Ldx1/b$a;->a:Ldx1/b$a;

    return-object v1

    :cond_17
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
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

    new-instance v0, Ldx1/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Ldx1/c$c;-><init>(Lec3/l;Ldx1/c;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method
