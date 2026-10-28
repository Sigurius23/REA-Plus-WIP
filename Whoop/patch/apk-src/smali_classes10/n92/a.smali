.class public final enum Ln92/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln92/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ln92/a;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "SUCCESS",
        "ERROR",
        "UNKNOWN_ACTION",
        "MUST_LAUNCH_MAIN_ACTIVITY",
        "app_prodStandardRelease"
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

.field private static final synthetic $VALUES:[Ln92/a;

.field public static final enum ERROR:Ln92/a;

.field public static final enum MUST_LAUNCH_MAIN_ACTIVITY:Ln92/a;

.field public static final enum SUCCESS:Ln92/a;

.field public static final enum UNKNOWN_ACTION:Ln92/a;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Ln92/a;
    .locals 4

    sget-object v0, Ln92/a;->SUCCESS:Ln92/a;

    sget-object v1, Ln92/a;->ERROR:Ln92/a;

    sget-object v2, Ln92/a;->UNKNOWN_ACTION:Ln92/a;

    sget-object v3, Ln92/a;->MUST_LAUNCH_MAIN_ACTIVITY:Ln92/a;

    filled-new-array {v0, v1, v2, v3}, [Ln92/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ln92/a;

    const/4 v1, 0x0

    const-string v2, "success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Ln92/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ln92/a;->SUCCESS:Ln92/a;

    new-instance v0, Ln92/a;

    const/4 v1, 0x1

    const-string v2, "invalid"

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Ln92/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ln92/a;->ERROR:Ln92/a;

    new-instance v0, Ln92/a;

    const/4 v1, 0x2

    const-string v2, "unknown_action"

    const-string v3, "UNKNOWN_ACTION"

    invoke-direct {v0, v3, v1, v2}, Ln92/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ln92/a;->UNKNOWN_ACTION:Ln92/a;

    new-instance v0, Ln92/a;

    const/4 v1, 0x3

    const-string v2, "must_launch_main_activity"

    const-string v3, "MUST_LAUNCH_MAIN_ACTIVITY"

    invoke-direct {v0, v3, v1, v2}, Ln92/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ln92/a;->MUST_LAUNCH_MAIN_ACTIVITY:Ln92/a;

    invoke-static {}, Ln92/a;->$values()[Ln92/a;

    move-result-object v0

    sput-object v0, Ln92/a;->$VALUES:[Ln92/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ln92/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ln92/a;->value:Ljava/lang/String;

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

    sget-object v0, Ln92/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln92/a;
    .locals 1

    const-class v0, Ln92/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln92/a;

    return-object p0
.end method

.method public static values()[Ln92/a;
    .locals 1

    sget-object v0, Ln92/a;->$VALUES:[Ln92/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln92/a;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln92/a;->value:Ljava/lang/String;

    return-object v0
.end method
