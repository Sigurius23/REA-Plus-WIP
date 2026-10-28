.class public final enum Lr21/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr21/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0014\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001BC\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\r\u001a\u0004\u0008\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u0011\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\r\u001a\u0004\u0008\u0012\u0010\u000fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lr21/a;",
        "",
        "Ly81/f;",
        "titleColor",
        "contentColor",
        "backgroundColor",
        "iconColor",
        "Lj91/b;",
        "backgroundGradient",
        "",
        "backgroundGradientAlpha",
        "<init>",
        "(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;Ly81/f;Lj91/b;F)V",
        "Ly81/f;",
        "getTitleColor",
        "()Ly81/f;",
        "getContentColor",
        "getBackgroundColor",
        "getIconColor",
        "Lj91/b;",
        "getBackgroundGradient",
        "()Lj91/b;",
        "F",
        "getBackgroundGradientAlpha",
        "()F",
        "DEFAULT",
        "RECOMMENDATION",
        "JUMPSTART",
        "TIP",
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

.field private static final synthetic $VALUES:[Lr21/a;

.field public static final enum DEFAULT:Lr21/a;

.field public static final enum JUMPSTART:Lr21/a;

.field public static final enum RECOMMENDATION:Lr21/a;

.field public static final enum TIP:Lr21/a;


# instance fields
.field private final backgroundColor:Ly81/f;

.field private final backgroundGradient:Lj91/b;

.field private final backgroundGradientAlpha:F

.field private final contentColor:Ly81/f;

.field private final iconColor:Ly81/f;

.field private final titleColor:Ly81/f;


# direct methods
.method private static final synthetic $values()[Lr21/a;
    .locals 4

    sget-object v0, Lr21/a;->DEFAULT:Lr21/a;

    sget-object v1, Lr21/a;->RECOMMENDATION:Lr21/a;

    sget-object v2, Lr21/a;->JUMPSTART:Lr21/a;

    sget-object v3, Lr21/a;->TIP:Lr21/a;

    filled-new-array {v0, v1, v2, v3}, [Lr21/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Lr21/a;

    sget-object v5, Ly81/f;->BRAND_WHITE:Ly81/f;

    sget-object v4, Ly81/f;->WHITE_70:Ly81/f;

    move-object v3, v5

    sget-object v5, Ly81/f;->WHITE_5:Ly81/f;

    const/16 v9, 0x38

    const/4 v10, 0x0

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lr21/a;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;Ly81/f;Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v4

    sput-object v0, Lr21/a;->DEFAULT:Lr21/a;

    new-instance v1, Lr21/a;

    sget-object v4, Ly81/f;->RECOVERY:Ly81/f;

    sget-object v6, Ly81/f;->NEUTRAL_15:Ly81/f;

    const/16 v10, 0x38

    const/4 v11, 0x0

    const-string v2, "RECOMMENDATION"

    move-object v5, v3

    const/4 v3, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lr21/a;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;Ly81/f;Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v5

    sput-object v1, Lr21/a;->RECOMMENDATION:Lr21/a;

    new-instance v1, Lr21/a;

    sget-object v6, Ly81/f;->RECOVERY_10:Ly81/f;

    const-string v2, "JUMPSTART"

    const/4 v3, 0x2

    invoke-direct/range {v1 .. v11}, Lr21/a;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;Ly81/f;Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v5

    sput-object v1, Lr21/a;->JUMPSTART:Lr21/a;

    new-instance v1, Lr21/a;

    sget-object v6, Ly81/f;->TRANSPARENT:Ly81/f;

    sget-object v7, Ly81/f;->WHITE_50:Ly81/f;

    sget-object v13, Li2/t;->b:Li2/s;

    invoke-static {}, Lgb1/b0;->m()Ljava/util/List;

    move-result-object v14

    const-wide/16 v17, 0x0

    const/16 v19, 0xe

    const-wide/16 v15, 0x0

    invoke-static/range {v13 .. v19}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v8

    const v9, 0x3e19999a    # 0.15f

    const-string v2, "TIP"

    const/4 v3, 0x3

    move-object v4, v5

    move-object v5, v12

    invoke-direct/range {v1 .. v9}, Lr21/a;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;Ly81/f;Lj91/b;F)V

    sput-object v1, Lr21/a;->TIP:Lr21/a;

    invoke-static {}, Lr21/a;->$values()[Lr21/a;

    move-result-object v0

    sput-object v0, Lr21/a;->$VALUES:[Lr21/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lr21/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;Ly81/f;Lj91/b;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/f;",
            "Ly81/f;",
            "Ly81/f;",
            "Ly81/f;",
            "Lj91/b;",
            "F)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lr21/a;->titleColor:Ly81/f;

    .line 3
    iput-object p4, p0, Lr21/a;->contentColor:Ly81/f;

    .line 4
    iput-object p5, p0, Lr21/a;->backgroundColor:Ly81/f;

    .line 5
    iput-object p6, p0, Lr21/a;->iconColor:Ly81/f;

    .line 6
    iput-object p7, p0, Lr21/a;->backgroundGradient:Lj91/b;

    .line 7
    iput p8, p0, Lr21/a;->backgroundGradientAlpha:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;Ly81/f;Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x8

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit8 p9, p9, 0x20

    if-eqz p9, :cond_2

    const/high16 p8, 0x3f800000    # 1.0f

    :cond_2
    move p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 8
    invoke-direct/range {p1 .. p9}, Lr21/a;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;Ly81/f;Lj91/b;F)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lr21/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lr21/a;
    .locals 1

    const-class v0, Lr21/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr21/a;

    return-object p0
.end method

.method public static values()[Lr21/a;
    .locals 1

    sget-object v0, Lr21/a;->$VALUES:[Lr21/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr21/a;

    return-object v0
.end method


# virtual methods
.method public final getBackgroundColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lr21/a;->backgroundColor:Ly81/f;

    return-object v0
.end method

.method public final getBackgroundGradient()Lj91/b;
    .locals 1

    iget-object v0, p0, Lr21/a;->backgroundGradient:Lj91/b;

    return-object v0
.end method

.method public final getBackgroundGradientAlpha()F
    .locals 1

    iget v0, p0, Lr21/a;->backgroundGradientAlpha:F

    return v0
.end method

.method public final getContentColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lr21/a;->contentColor:Ly81/f;

    return-object v0
.end method

.method public final getIconColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lr21/a;->iconColor:Ly81/f;

    return-object v0
.end method

.method public final getTitleColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lr21/a;->titleColor:Ly81/f;

    return-object v0
.end method
