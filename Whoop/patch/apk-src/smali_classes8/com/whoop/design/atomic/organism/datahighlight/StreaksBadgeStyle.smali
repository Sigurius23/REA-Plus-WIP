.class public final enum Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0087\u0081\u0002\u0018\u0000 \n2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0013\u0008\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "Ly81/f;",
        "tint",
        "<init>",
        "(Ljava/lang/String;ILy81/f;)V",
        "Ly81/f;",
        "getTint",
        "()Ly81/f;",
        "Companion",
        "a",
        "SLEEP",
        "RECOVERY",
        "STRAIN",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle$a;

.field public static final enum RECOVERY:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

.field public static final enum SLEEP:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

.field public static final enum STRAIN:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;


# instance fields
.field private final tint:Ly81/f;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;
    .locals 3

    sget-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->SLEEP:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    sget-object v1, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->RECOVERY:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    sget-object v2, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->STRAIN:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    const/4 v1, 0x0

    sget-object v2, Ly81/f;->SLEEP:Ly81/f;

    const-string v3, "SLEEP"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->SLEEP:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    new-instance v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    const/4 v1, 0x1

    sget-object v2, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    const-string v3, "RECOVERY"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->RECOVERY:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    new-instance v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    const/4 v1, 0x2

    sget-object v2, Ly81/f;->STRAIN:Ly81/f;

    const-string v3, "STRAIN"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->STRAIN:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    invoke-static {}, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->$values()[Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->$VALUES:[Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->Companion:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Ls51/p;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ls51/p;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->tint:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILy81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 3
    sget-object p3, Ly81/f;->WHITE_20:Ly81/f;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;-><init>(Ljava/lang/String;ILy81/f;)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.organism.datahighlight.StreaksBadgeStyle"

    invoke-static {}, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->values()[Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;
    .locals 1

    const-class v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;
    .locals 1

    sget-object v0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->$VALUES:[Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    return-object v0
.end method


# virtual methods
.method public final getTint()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->tint:Ly81/f;

    return-object v0
.end method
