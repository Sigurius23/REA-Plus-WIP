.class public final enum Lcj1/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcj1/c$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcj1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0080\u0081\u0002\u0018\u0000 \u001a2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB5\u0008\u0002\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0010\u001a\u0004\u0008\u0013\u0010\u0012R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019j\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!\u00a8\u0006\""
    }
    d2 = {
        "Lcj1/c;",
        "",
        "Lgz0/m0;",
        "iconImage",
        "Ly81/f;",
        "iconColor",
        "iconBackgroundColor",
        "Li91/a;",
        "backgroundColor",
        "Lkd1/l;",
        "type",
        "<init>",
        "(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;)V",
        "Lgz0/m0;",
        "getIconImage",
        "()Lgz0/m0;",
        "Ly81/f;",
        "getIconColor",
        "()Ly81/f;",
        "getIconBackgroundColor",
        "Li91/a;",
        "getBackgroundColor",
        "()Li91/a;",
        "Lkd1/l;",
        "getType",
        "()Lkd1/l;",
        "Companion",
        "f",
        "ShepherdDataBehind",
        "ShepherdDetected",
        "ShepherdNotDetected",
        "ShepherdOnboarding",
        "ShepherdRecentlyActivated",
        "LabradorNewReading",
        "health_release"
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

.field private static final synthetic $VALUES:[Lcj1/c;

.field public static final Companion:Lcj1/c$f;

.field public static final enum LabradorNewReading:Lcj1/c;

.field public static final enum ShepherdDataBehind:Lcj1/c;

.field public static final enum ShepherdDetected:Lcj1/c;

.field public static final enum ShepherdNotDetected:Lcj1/c;

.field public static final enum ShepherdOnboarding:Lcj1/c;

.field public static final enum ShepherdRecentlyActivated:Lcj1/c;


# instance fields
.field private final backgroundColor:Li91/a;

.field private final iconBackgroundColor:Ly81/f;

.field private final iconColor:Ly81/f;

.field private final iconImage:Lgz0/m0;

.field private final type:Lkd1/l;


# direct methods
.method private static final synthetic $values()[Lcj1/c;
    .locals 6

    sget-object v0, Lcj1/c;->ShepherdDataBehind:Lcj1/c;

    sget-object v1, Lcj1/c;->ShepherdDetected:Lcj1/c;

    sget-object v2, Lcj1/c;->ShepherdNotDetected:Lcj1/c;

    sget-object v3, Lcj1/c;->ShepherdOnboarding:Lcj1/c;

    sget-object v4, Lcj1/c;->ShepherdRecentlyActivated:Lcj1/c;

    sget-object v5, Lcj1/c;->LabradorNewReading:Lcj1/c;

    filled-new-array/range {v0 .. v5}, [Lcj1/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Lcj1/c;

    sget-object v3, Lgz0/m0;->TINY_ELLIPSE:Lgz0/m0;

    sget-object v4, Ly81/f;->WHITE_50:Ly81/f;

    sget-object v5, Ly81/f;->WHITE_10:Ly81/f;

    sget-object v1, Lcj1/c$a;->w:Lcj1/c$a;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    sget-object v7, Lkd1/l;->ANF_DATA_BEHIND:Lkd1/l;

    const-string v1, "ShepherdDataBehind"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v7}, Lcj1/c;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;)V

    sput-object v0, Lcj1/c;->ShepherdDataBehind:Lcj1/c;

    new-instance v6, Lcj1/c;

    sget-object v9, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    sget-object v10, Ly81/f;->BRAND_BLACK:Ly81/f;

    sget-object v11, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    sget-object v0, Lcj1/c$b;->w:Lcj1/c$b;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v12

    sget-object v13, Lkd1/l;->ANF_DETECTED:Lkd1/l;

    const-string v7, "ShepherdDetected"

    const/4 v8, 0x1

    invoke-direct/range {v6 .. v13}, Lcj1/c;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;)V

    sput-object v6, Lcj1/c;->ShepherdDetected:Lcj1/c;

    move-object v14, v10

    new-instance v10, Lcj1/c;

    sget-object v13, Lgz0/m0;->TINY_CHECKMARK:Lgz0/m0;

    sget-object v15, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v0, Lcj1/c$c;->w:Lcj1/c$c;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v16

    sget-object v17, Lkd1/l;->ANF_NOT_DETECTED:Lkd1/l;

    const-string v11, "ShepherdNotDetected"

    const/4 v12, 0x2

    invoke-direct/range {v10 .. v17}, Lcj1/c;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;)V

    sput-object v10, Lcj1/c;->ShepherdNotDetected:Lcj1/c;

    new-instance v11, Lcj1/c;

    sget-object v17, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-static {}, Lgb1/b0;->G0()Li2/t;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v0

    const v1, 0x3d75c28f    # 0.06f

    invoke-static {v0, v1}, Li91/c;->i(Lj91/b;F)Li91/a;

    move-result-object v0

    sget-object v18, Lkd1/l;->ANF_ONBOARDING:Lkd1/l;

    const-string v12, "ShepherdOnboarding"

    const/4 v13, 0x3

    const/4 v14, 0x0

    move-object/from16 v16, v17

    move-object/from16 v15, v17

    move-object/from16 v17, v0

    invoke-direct/range {v11 .. v18}, Lcj1/c;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;)V

    move-object/from16 v17, v15

    sput-object v11, Lcj1/c;->ShepherdOnboarding:Lcj1/c;

    new-instance v1, Lcj1/c;

    sget-object v0, Lcj1/c$d;->w:Lcj1/c$d;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v7

    sget-object v8, Lkd1/l;->ANF_RECENTLY_ACTIVATED:Lkd1/l;

    const-string v2, "ShepherdRecentlyActivated"

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    const/4 v3, 0x4

    invoke-direct/range {v1 .. v8}, Lcj1/c;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;)V

    sput-object v1, Lcj1/c;->ShepherdRecentlyActivated:Lcj1/c;

    new-instance v12, Lcj1/c;

    sget-object v15, Lgz0/m0;->ADD:Lgz0/m0;

    sget-object v16, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    sget-object v0, Lcj1/c$e;->w:Lcj1/c$e;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v18

    sget-object v19, Lkd1/l;->ECG_NEW_RECORDING:Lkd1/l;

    const-string v13, "LabradorNewReading"

    const/4 v14, 0x5

    invoke-direct/range {v12 .. v19}, Lcj1/c;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;)V

    sput-object v12, Lcj1/c;->LabradorNewReading:Lcj1/c;

    invoke-static {}, Lcj1/c;->$values()[Lcj1/c;

    move-result-object v0

    sput-object v0, Lcj1/c;->$VALUES:[Lcj1/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcj1/c;->$ENTRIES:Lt83/a;

    new-instance v0, Lcj1/c$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcj1/c$f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcj1/c;->Companion:Lcj1/c$f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgz0/m0;",
            "Ly81/f;",
            "Ly81/f;",
            "Li91/a;",
            "Lkd1/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcj1/c;->iconImage:Lgz0/m0;

    .line 3
    iput-object p4, p0, Lcj1/c;->iconColor:Ly81/f;

    .line 4
    iput-object p5, p0, Lcj1/c;->iconBackgroundColor:Ly81/f;

    .line 5
    iput-object p6, p0, Lcj1/c;->backgroundColor:Li91/a;

    .line 6
    iput-object p7, p0, Lcj1/c;->type:Lkd1/l;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    .line 7
    invoke-direct/range {v0 .. v7}, Lcj1/c;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Li91/a;Lkd1/l;)V

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

    sget-object v0, Lcj1/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcj1/c;
    .locals 1

    const-class v0, Lcj1/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcj1/c;

    return-object p0
.end method

.method public static values()[Lcj1/c;
    .locals 1

    sget-object v0, Lcj1/c;->$VALUES:[Lcj1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcj1/c;

    return-object v0
.end method


# virtual methods
.method public final getBackgroundColor()Li91/a;
    .locals 1

    iget-object v0, p0, Lcj1/c;->backgroundColor:Li91/a;

    return-object v0
.end method

.method public final getIconBackgroundColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcj1/c;->iconBackgroundColor:Ly81/f;

    return-object v0
.end method

.method public final getIconColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcj1/c;->iconColor:Ly81/f;

    return-object v0
.end method

.method public final getIconImage()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcj1/c;->iconImage:Lgz0/m0;

    return-object v0
.end method

.method public final getType()Lkd1/l;
    .locals 1

    iget-object v0, p0, Lcj1/c;->type:Lkd1/l;

    return-object v0
.end method
