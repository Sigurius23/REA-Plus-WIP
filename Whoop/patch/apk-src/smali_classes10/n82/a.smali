.class public final enum Ln82/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln82/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ln82/a;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Lcom/whoop/addactivity/network/model/ScoreType;",
        "toScoreType",
        "()Lcom/whoop/addactivity/network/model/ScoreType;",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "ALL",
        "STRAIN",
        "RECOVERY",
        "SLEEP",
        "select-activity_release"
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

.field private static final synthetic $VALUES:[Ln82/a;

.field public static final enum ALL:Ln82/a;

.field public static final enum RECOVERY:Ln82/a;

.field public static final enum SLEEP:Ln82/a;

.field public static final enum STRAIN:Ln82/a;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Ln82/a;
    .locals 4

    sget-object v0, Ln82/a;->ALL:Ln82/a;

    sget-object v1, Ln82/a;->STRAIN:Ln82/a;

    sget-object v2, Ln82/a;->RECOVERY:Ln82/a;

    sget-object v3, Ln82/a;->SLEEP:Ln82/a;

    filled-new-array {v0, v1, v2, v3}, [Ln82/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln82/a;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Ln82/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ln82/a;->ALL:Ln82/a;

    new-instance v0, Ln82/a;

    const-string v1, "STRAIN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Ln82/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ln82/a;->STRAIN:Ln82/a;

    new-instance v0, Ln82/a;

    const-string v1, "RECOVERY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Ln82/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ln82/a;->RECOVERY:Ln82/a;

    new-instance v0, Ln82/a;

    const-string v1, "SLEEP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Ln82/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ln82/a;->SLEEP:Ln82/a;

    invoke-static {}, Ln82/a;->$values()[Ln82/a;

    move-result-object v0

    sput-object v0, Ln82/a;->$VALUES:[Ln82/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ln82/a;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Ln82/a;->value:Ljava/lang/String;

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

    sget-object v0, Ln82/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln82/a;
    .locals 1

    const-class v0, Ln82/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln82/a;

    return-object p0
.end method

.method public static values()[Ln82/a;
    .locals 1

    sget-object v0, Ln82/a;->$VALUES:[Ln82/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln82/a;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln82/a;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final toScoreType()Lcom/whoop/addactivity/network/model/ScoreType;
    .locals 1

    sget-object v0, Ln82/a;->STRAIN:Ln82/a;

    if-ne p0, v0, :cond_0

    sget-object v0, Lcom/whoop/addactivity/network/model/ScoreType;->CARDIO:Lcom/whoop/addactivity/network/model/ScoreType;

    return-object v0

    :cond_0
    iget-object v0, p0, Ln82/a;->value:Ljava/lang/String;

    invoke-static {v0}, Lcom/whoop/addactivity/network/model/ScoreType;->valueOf(Ljava/lang/String;)Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v0

    return-object v0
.end method
