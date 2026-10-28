.class public final enum Lnl0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnl0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lnl0/b;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "USER",
        "ASSISTANT",
        "SYSTEM",
        "TOOL",
        "bot_release"
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

.field private static final synthetic $VALUES:[Lnl0/b;

.field public static final enum ASSISTANT:Lnl0/b;

.field public static final enum SYSTEM:Lnl0/b;

.field public static final enum TOOL:Lnl0/b;

.field public static final enum USER:Lnl0/b;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lnl0/b;
    .locals 4

    sget-object v0, Lnl0/b;->USER:Lnl0/b;

    sget-object v1, Lnl0/b;->ASSISTANT:Lnl0/b;

    sget-object v2, Lnl0/b;->SYSTEM:Lnl0/b;

    sget-object v3, Lnl0/b;->TOOL:Lnl0/b;

    filled-new-array {v0, v1, v2, v3}, [Lnl0/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lnl0/b;

    const/4 v1, 0x0

    const-string v2, "user"

    const-string v3, "USER"

    invoke-direct {v0, v3, v1, v2}, Lnl0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lnl0/b;->USER:Lnl0/b;

    new-instance v0, Lnl0/b;

    const/4 v1, 0x1

    const-string v2, "assistant"

    const-string v3, "ASSISTANT"

    invoke-direct {v0, v3, v1, v2}, Lnl0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lnl0/b;->ASSISTANT:Lnl0/b;

    new-instance v0, Lnl0/b;

    const/4 v1, 0x2

    const-string v2, "system"

    const-string v3, "SYSTEM"

    invoke-direct {v0, v3, v1, v2}, Lnl0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lnl0/b;->SYSTEM:Lnl0/b;

    new-instance v0, Lnl0/b;

    const/4 v1, 0x3

    const-string v2, "tool"

    const-string v3, "TOOL"

    invoke-direct {v0, v3, v1, v2}, Lnl0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lnl0/b;->TOOL:Lnl0/b;

    invoke-static {}, Lnl0/b;->$values()[Lnl0/b;

    move-result-object v0

    sput-object v0, Lnl0/b;->$VALUES:[Lnl0/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lnl0/b;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Lnl0/b;->value:Ljava/lang/String;

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

    sget-object v0, Lnl0/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnl0/b;
    .locals 1

    const-class v0, Lnl0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnl0/b;

    return-object p0
.end method

.method public static values()[Lnl0/b;
    .locals 1

    sget-object v0, Lnl0/b;->$VALUES:[Lnl0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnl0/b;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnl0/b;->value:Ljava/lang/String;

    return-object v0
.end method
