.class public abstract Llb1/t3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/t3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a#\u0010\u0008\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "Lc31/k;",
        "g",
        "(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;",
        "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;",
        "Ll83/k;",
        "Ly81/e;",
        "Li2/t;",
        "f",
        "(Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;)Ll83/k;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "progressButtonMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/j3;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/t3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/t3;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;
    .locals 0

    invoke-static {p0}, Llb1/t3;->e(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/t3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/j3;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/ProgressButtonModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/t3$b;

    invoke-direct {v2, v0}, Llb1/t3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/t3;->g(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;)Ll83/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    sget-object v0, Llb1/t3$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    new-instance p0, Ll83/k;

    invoke-static {}, Lgb1/b0;->F0()Li2/t;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Ll83/k;

    sget-object v0, Ly81/f;->RECOVERY:Ly81/f;

    invoke-direct {p0, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_2
    new-instance p0, Ll83/k;

    sget-object v0, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    invoke-direct {p0, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_3
    new-instance p0, Ll83/k;

    sget-object v0, Ly81/f;->STRAIN:Ly81/f;

    invoke-direct {p0, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_4
    new-instance p0, Ll83/k;

    sget-object v0, Ly81/f;->ACCENT_ACTION:Ly81/f;

    invoke-direct {p0, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final g(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;
    .locals 23

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/ProgressButtonModel;->getButtonType()Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    move-result-object v0

    sget-object v2, Llb1/t3$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    sget-object v0, Lc31/d;->PROGRESS:Lc31/d;

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lc31/d;->FILLED:Lc31/d;

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/ProgressButtonModel;->getStyle()Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    move-result-object v0

    invoke-static {v0}, Llb1/t3;->f(Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;)Ll83/k;

    move-result-object v0

    iget-object v3, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v15, v3

    check-cast v15, Ly81/e;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, Li2/t;

    invoke-virtual {v1}, Lcom/whoop/design/models/ProgressButtonModel;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/ProgressButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    invoke-static {v0, v3}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/ProgressButtonModel;->getIconColor()Ly81/f;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/ProgressButtonModel;->getGlowStyle()Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/design/atomic/atom/icon/GlowStyle;->getColor()Ly81/f;

    move-result-object v0

    :goto_2
    move-object/from16 v18, v0

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/ProgressButtonModel;->getFillPercentage()Ljava/lang/Float;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_3
    move v13, v2

    invoke-virtual {v1}, Lcom/whoop/design/models/ProgressButtonModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v19

    new-instance v3, Lc31/k;

    const v21, 0x104dc

    const/16 v22, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v22}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method
