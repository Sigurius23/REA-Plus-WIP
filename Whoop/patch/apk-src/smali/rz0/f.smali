.class public final enum Lrz0/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrz0/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B+\u0008\u0002\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\t\u001a\u0004\u0008\u000f\u0010\u000bj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lrz0/f;",
        "",
        "Lj91/b;",
        "borderBrush",
        "Li91/a;",
        "background",
        "leadingAccentBrush",
        "<init>",
        "(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;)V",
        "Lj91/b;",
        "getBorderBrush",
        "()Lj91/b;",
        "Li91/a;",
        "getBackground",
        "()Li91/a;",
        "getLeadingAccentBrush",
        "DEFAULT",
        "ONBOARDING_GRADIENT_FILL",
        "AMERICA_250_REWARDS",
        "AI_ACCENT",
        "AI_GRADIENT",
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


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lrz0/f;

.field public static final enum AI_ACCENT:Lrz0/f;

.field public static final enum AI_GRADIENT:Lrz0/f;

.field public static final enum AMERICA_250_REWARDS:Lrz0/f;

.field public static final enum DEFAULT:Lrz0/f;

.field public static final enum ONBOARDING_GRADIENT_FILL:Lrz0/f;


# instance fields
.field private final background:Li91/a;

.field private final borderBrush:Lj91/b;

.field private final leadingAccentBrush:Lj91/b;


# direct methods
.method private static final synthetic $values()[Lrz0/f;
    .locals 5

    sget-object v0, Lrz0/f;->DEFAULT:Lrz0/f;

    sget-object v1, Lrz0/f;->ONBOARDING_GRADIENT_FILL:Lrz0/f;

    sget-object v2, Lrz0/f;->AMERICA_250_REWARDS:Lrz0/f;

    sget-object v3, Lrz0/f;->AI_ACCENT:Lrz0/f;

    sget-object v4, Lrz0/f;->AI_GRADIENT:Lrz0/f;

    filled-new-array {v0, v1, v2, v3, v4}, [Lrz0/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lrz0/f;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lrz0/f;-><init>(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrz0/f;->DEFAULT:Lrz0/f;

    new-instance v1, Lrz0/f;

    invoke-static {}, Lgb1/b0;->O()Li2/t;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v4

    new-instance v5, Li91/d;

    invoke-static {}, Lgb1/b0;->G0()Li2/t;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v0

    const v2, 0x3d4ccccd    # 0.05f

    invoke-direct {v5, v0, v2}, Li91/d;-><init>(Lj91/b;F)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v2, "ONBOARDING_GRADIENT_FILL"

    const/4 v3, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lrz0/f;-><init>(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lrz0/f;->ONBOARDING_GRADIENT_FILL:Lrz0/f;

    new-instance v2, Lrz0/f;

    new-instance v0, Lqc1/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    invoke-static {v0}, Lj91/c;->b(Lkotlin/jvm/functions/Function1;)Lj91/b;

    move-result-object v5

    new-instance v6, Li91/d;

    new-instance v0, Lqc1/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    invoke-static {v0}, Lj91/c;->b(Lkotlin/jvm/functions/Function1;)Lj91/b;

    move-result-object v0

    const v1, 0x3dcccccd    # 0.1f

    invoke-direct {v6, v0, v1}, Li91/d;-><init>(Lj91/b;F)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v3, "AMERICA_250_REWARDS"

    const/4 v4, 0x2

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lrz0/f;-><init>(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lrz0/f;->AMERICA_250_REWARDS:Lrz0/f;

    new-instance v3, Lrz0/f;

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v8

    const/4 v9, 0x3

    const/4 v10, 0x0

    const-string v4, "AI_ACCENT"

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v10}, Lrz0/f;-><init>(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lrz0/f;->AI_ACCENT:Lrz0/f;

    new-instance v4, Lrz0/f;

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v7

    new-instance v8, Li91/d;

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v0

    invoke-direct {v8, v0, v1}, Li91/d;-><init>(Lj91/b;F)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v5, "AI_GRADIENT"

    const/4 v6, 0x4

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lrz0/f;-><init>(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lrz0/f;->AI_GRADIENT:Lrz0/f;

    invoke-static {}, Lrz0/f;->$values()[Lrz0/f;

    move-result-object v0

    sput-object v0, Lrz0/f;->$VALUES:[Lrz0/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lrz0/f;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj91/b;",
            "Li91/a;",
            "Lj91/b;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lrz0/f;->borderBrush:Lj91/b;

    .line 3
    iput-object p4, p0, Lrz0/f;->background:Li91/a;

    .line 4
    iput-object p5, p0, Lrz0/f;->leadingAccentBrush:Lj91/b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 5
    new-instance p4, Li91/f;

    sget-object p7, Ly81/f;->WHITE_10:Ly81/f;

    const/4 v1, 0x2

    invoke-direct {p4, p7, v0, v1, v0}, Li91/f;-><init>(Ly81/e;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_2

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p6, p5

    goto :goto_0

    .line 6
    :goto_1
    invoke-direct/range {p1 .. p6}, Lrz0/f;-><init>(Ljava/lang/String;ILj91/b;Li91/a;Lj91/b;)V

    return-void
.end method

.method private static final _init_$lambda$0(Ly81/i;)Li2/t;
    .locals 1

    const-string v0, "$this$whoopBrush"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lgb1/b0;->l(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$1(Ly81/i;)Li2/t;
    .locals 1

    const-string v0, "$this$whoopBrush"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lgb1/b0;->l(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lrz0/f;->_init_$lambda$0(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lrz0/f;->_init_$lambda$1(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lrz0/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrz0/f;
    .locals 1

    const-class v0, Lrz0/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrz0/f;

    return-object p0
.end method

.method public static values()[Lrz0/f;
    .locals 1

    sget-object v0, Lrz0/f;->$VALUES:[Lrz0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrz0/f;

    return-object v0
.end method


# virtual methods
.method public final getBackground()Li91/a;
    .locals 1

    iget-object v0, p0, Lrz0/f;->background:Li91/a;

    return-object v0
.end method

.method public final getBorderBrush()Lj91/b;
    .locals 1

    iget-object v0, p0, Lrz0/f;->borderBrush:Lj91/b;

    return-object v0
.end method

.method public final getLeadingAccentBrush()Lj91/b;
    .locals 1

    iget-object v0, p0, Lrz0/f;->leadingAccentBrush:Lj91/b;

    return-object v0
.end method
