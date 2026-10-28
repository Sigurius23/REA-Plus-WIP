.class public final enum Lgt0/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgt0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lgt0/c;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "TRIGGERED",
        "SUCCESS",
        "FAILURE",
        "COACH_INTERACTION",
        "UPDATE_PROMPT",
        "UPDATE_SUCCESS",
        "BLOCKED",
        "connectivity-core_release"
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

.field private static final synthetic $VALUES:[Lgt0/c;

.field public static final enum BLOCKED:Lgt0/c;

.field public static final enum COACH_INTERACTION:Lgt0/c;

.field public static final enum FAILURE:Lgt0/c;

.field public static final enum SUCCESS:Lgt0/c;

.field public static final enum TRIGGERED:Lgt0/c;

.field public static final enum UPDATE_PROMPT:Lgt0/c;

.field public static final enum UPDATE_SUCCESS:Lgt0/c;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lgt0/c;
    .locals 7

    sget-object v0, Lgt0/c;->TRIGGERED:Lgt0/c;

    sget-object v1, Lgt0/c;->SUCCESS:Lgt0/c;

    sget-object v2, Lgt0/c;->FAILURE:Lgt0/c;

    sget-object v3, Lgt0/c;->COACH_INTERACTION:Lgt0/c;

    sget-object v4, Lgt0/c;->UPDATE_PROMPT:Lgt0/c;

    sget-object v5, Lgt0/c;->UPDATE_SUCCESS:Lgt0/c;

    sget-object v6, Lgt0/c;->BLOCKED:Lgt0/c;

    filled-new-array/range {v0 .. v6}, [Lgt0/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgt0/c;

    const/4 v1, 0x0

    const-string v2, "triggered"

    const-string v3, "TRIGGERED"

    invoke-direct {v0, v3, v1, v2}, Lgt0/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgt0/c;->TRIGGERED:Lgt0/c;

    new-instance v0, Lgt0/c;

    const/4 v1, 0x1

    const-string v2, "success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lgt0/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgt0/c;->SUCCESS:Lgt0/c;

    new-instance v0, Lgt0/c;

    const/4 v1, 0x2

    const-string v2, "failure"

    const-string v3, "FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lgt0/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgt0/c;->FAILURE:Lgt0/c;

    new-instance v0, Lgt0/c;

    const/4 v1, 0x3

    const-string v2, "coach_interaction"

    const-string v3, "COACH_INTERACTION"

    invoke-direct {v0, v3, v1, v2}, Lgt0/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgt0/c;->COACH_INTERACTION:Lgt0/c;

    new-instance v0, Lgt0/c;

    const/4 v1, 0x4

    const-string v2, "update_prompt"

    const-string v3, "UPDATE_PROMPT"

    invoke-direct {v0, v3, v1, v2}, Lgt0/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgt0/c;->UPDATE_PROMPT:Lgt0/c;

    new-instance v0, Lgt0/c;

    const/4 v1, 0x5

    const-string v2, "update_success"

    const-string v3, "UPDATE_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lgt0/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgt0/c;->UPDATE_SUCCESS:Lgt0/c;

    new-instance v0, Lgt0/c;

    const/4 v1, 0x6

    const-string v2, "blocked"

    const-string v3, "BLOCKED"

    invoke-direct {v0, v3, v1, v2}, Lgt0/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lgt0/c;->BLOCKED:Lgt0/c;

    invoke-static {}, Lgt0/c;->$values()[Lgt0/c;

    move-result-object v0

    sput-object v0, Lgt0/c;->$VALUES:[Lgt0/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lgt0/c;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Lgt0/c;->value:Ljava/lang/String;

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

    sget-object v0, Lgt0/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgt0/c;
    .locals 1

    const-class v0, Lgt0/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgt0/c;

    return-object p0
.end method

.method public static values()[Lgt0/c;
    .locals 1

    sget-object v0, Lgt0/c;->$VALUES:[Lgt0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgt0/c;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgt0/c;->value:Ljava/lang/String;

    return-object v0
.end method
