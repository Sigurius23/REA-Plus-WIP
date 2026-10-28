.class public final Ld80/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld80/f$a;,
        Ld80/f$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R+\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u0010R/\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00028F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u0005\u00a8\u0006\u001f"
    }
    d2 = {
        "Ld80/f;",
        "",
        "Lc31/k;",
        "initialProgressButtonState",
        "<init>",
        "(Lc31/k;)V",
        "Lc31/e;",
        "action",
        "Ll83/a0;",
        "d",
        "(Lc31/e;)V",
        "newState",
        "i",
        "",
        "defaultEnabled",
        "e",
        "(Z)V",
        "Lny0/h;",
        "button",
        "a",
        "(Lny0/h;)Lny0/h;",
        "<set-?>",
        "Lp1/c1;",
        "b",
        "()Z",
        "g",
        "footerButtonsEnabled",
        "c",
        "()Lc31/k;",
        "h",
        "progressButtonState",
        "activation_release"
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
.field public static final c:Ld80/f$a;


# instance fields
.field private final a:Lp1/c1;

.field private final b:Lp1/c1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld80/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld80/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ld80/f;->c:Ld80/f$a;

    return-void
.end method

.method public constructor <init>(Lc31/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lc31/k;->g()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ld80/f;->a:Lp1/c1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ld80/f;->b:Lp1/c1;

    return-void
.end method

.method public static synthetic f(Ld80/f;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Ld80/f;->e(Z)V

    return-void
.end method

.method private final g(Z)V
    .locals 1

    iget-object v0, p0, Ld80/f;->a:Lp1/c1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final h(Lc31/k;)V
    .locals 1

    iget-object v0, p0, Ld80/f;->b:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lny0/h;)Lny0/h;
    .locals 29

    const-string v0, "button"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Ld80/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lny0/h;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move/from16 v18, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    sget-object v0, Ld80/f;->c:Ld80/f$a;

    const v27, 0x1feffff

    const/16 v28, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v1 .. v28}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v1

    move/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Ld80/f$a;->a(Lny0/h;Z)Lny0/h;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Ld80/f;->a:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c()Lc31/k;
    .locals 1

    iget-object v0, p0, Ld80/f;->b:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc31/k;

    return-object v0
.end method

.method public final d(Lc31/e;)V
    .locals 26

    move-object/from16 v0, p0

    const-string v1, "action"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ld80/f$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v1, v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v5, :cond_1

    if-eq v3, v4, :cond_0

    invoke-virtual {v0}, Ld80/f;->b()Z

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_0
    invoke-direct {v0, v3}, Ld80/f;->g(Z)V

    invoke-virtual {v0}, Ld80/f;->c()Lc31/k;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    if-eq v1, v5, :cond_6

    if-eq v1, v4, :cond_5

    const/4 v2, 0x3

    if-eq v1, v2, :cond_4

    const/4 v2, 0x4

    if-eq v1, v2, :cond_3

    const/4 v2, 0x5

    if-ne v1, v2, :cond_2

    const v24, 0x1ffe7

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v6 .. v25}, Lc31/k;->b(Lc31/k;Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILjava/lang/Object;)Lc31/k;

    move-result-object v1

    goto/16 :goto_1

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_3
    const v24, 0x1fbff

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v6 .. v25}, Lc31/k;->b(Lc31/k;Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILjava/lang/Object;)Lc31/k;

    move-result-object v1

    goto :goto_1

    :cond_4
    const v24, 0x1fbff

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v6 .. v25}, Lc31/k;->b(Lc31/k;Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILjava/lang/Object;)Lc31/k;

    move-result-object v1

    goto :goto_1

    :cond_5
    const v24, 0x1fdff

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v6 .. v25}, Lc31/k;->b(Lc31/k;Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILjava/lang/Object;)Lc31/k;

    move-result-object v1

    goto :goto_1

    :cond_6
    const v24, 0x1fdff

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v6 .. v25}, Lc31/k;->b(Lc31/k;Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILjava/lang/Object;)Lc31/k;

    move-result-object v1

    goto :goto_1

    :cond_7
    const/4 v1, 0x0

    :goto_1
    invoke-direct {v0, v1}, Ld80/f;->h(Lc31/k;)V

    return-void
.end method

.method public final e(Z)V
    .locals 1

    invoke-virtual {p0}, Ld80/f;->c()Lc31/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc31/k;->g()Z

    move-result p1

    :cond_0
    invoke-direct {p0, p1}, Ld80/f;->g(Z)V

    return-void
.end method

.method public final i(Lc31/k;)V
    .locals 0

    invoke-direct {p0, p1}, Ld80/f;->h(Lc31/k;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lc31/k;->g()Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ld80/f;->b()Z

    move-result p1

    :goto_0
    invoke-direct {p0, p1}, Ld80/f;->g(Z)V

    return-void
.end method
