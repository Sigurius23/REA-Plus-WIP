.class public final enum Lf01/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf01/x;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0008\u0002\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lf01/x;",
        "",
        "Lj91/b;",
        "buttonBrush",
        "Ly81/f;",
        "buttonColor",
        "<init>",
        "(Ljava/lang/String;ILj91/b;Ly81/f;)V",
        "Lj91/b;",
        "getButtonBrush",
        "()Lj91/b;",
        "Ly81/f;",
        "getButtonColor",
        "()Ly81/f;",
        "NORMAL",
        "ONBOARDING",
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

.field private static final synthetic $VALUES:[Lf01/x;

.field public static final enum NORMAL:Lf01/x;

.field public static final enum ONBOARDING:Lf01/x;


# instance fields
.field private final buttonBrush:Lj91/b;

.field private final buttonColor:Ly81/f;


# direct methods
.method private static final synthetic $values()[Lf01/x;
    .locals 2

    sget-object v0, Lf01/x;->NORMAL:Lf01/x;

    sget-object v1, Lf01/x;->ONBOARDING:Lf01/x;

    filled-new-array {v0, v1}, [Lf01/x;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lf01/x;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lf01/x;-><init>(Ljava/lang/String;ILj91/b;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf01/x;->NORMAL:Lf01/x;

    new-instance v1, Lf01/x;

    invoke-static {}, Lgb1/b0;->O()Li2/t;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v4

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v2, "ONBOARDING"

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lf01/x;-><init>(Ljava/lang/String;ILj91/b;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lf01/x;->ONBOARDING:Lf01/x;

    invoke-static {}, Lf01/x;->$values()[Lf01/x;

    move-result-object v0

    sput-object v0, Lf01/x;->$VALUES:[Lf01/x;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lf01/x;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILj91/b;Ly81/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj91/b;",
            "Ly81/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lf01/x;->buttonBrush:Lj91/b;

    .line 3
    iput-object p4, p0, Lf01/x;->buttonColor:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILj91/b;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    .line 4
    sget-object p4, Ly81/f;->BRAND_WHITE:Ly81/f;

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lf01/x;-><init>(Ljava/lang/String;ILj91/b;Ly81/f;)V

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

    sget-object v0, Lf01/x;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf01/x;
    .locals 1

    const-class v0, Lf01/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf01/x;

    return-object p0
.end method

.method public static values()[Lf01/x;
    .locals 1

    sget-object v0, Lf01/x;->$VALUES:[Lf01/x;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf01/x;

    return-object v0
.end method


# virtual methods
.method public final getButtonBrush()Lj91/b;
    .locals 1

    iget-object v0, p0, Lf01/x;->buttonBrush:Lj91/b;

    return-object v0
.end method

.method public final getButtonColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lf01/x;->buttonColor:Ly81/f;

    return-object v0
.end method
