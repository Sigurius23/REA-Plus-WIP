.class public final enum Lsl0/v2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsl0/v2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lsl0/v2;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "next",
        "()Lsl0/v2;",
        "NUMBERS",
        "LETTERS",
        "ROMAN",
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

.field private static final synthetic $VALUES:[Lsl0/v2;

.field public static final enum LETTERS:Lsl0/v2;

.field public static final enum NUMBERS:Lsl0/v2;

.field public static final enum ROMAN:Lsl0/v2;


# direct methods
.method private static final synthetic $values()[Lsl0/v2;
    .locals 3

    sget-object v0, Lsl0/v2;->NUMBERS:Lsl0/v2;

    sget-object v1, Lsl0/v2;->LETTERS:Lsl0/v2;

    sget-object v2, Lsl0/v2;->ROMAN:Lsl0/v2;

    filled-new-array {v0, v1, v2}, [Lsl0/v2;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsl0/v2;

    const-string v1, "NUMBERS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsl0/v2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsl0/v2;->NUMBERS:Lsl0/v2;

    new-instance v0, Lsl0/v2;

    const-string v1, "LETTERS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lsl0/v2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsl0/v2;->LETTERS:Lsl0/v2;

    new-instance v0, Lsl0/v2;

    const-string v1, "ROMAN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lsl0/v2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsl0/v2;->ROMAN:Lsl0/v2;

    invoke-static {}, Lsl0/v2;->$values()[Lsl0/v2;

    move-result-object v0

    sput-object v0, Lsl0/v2;->$VALUES:[Lsl0/v2;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lsl0/v2;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lsl0/v2;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsl0/v2;
    .locals 1

    const-class v0, Lsl0/v2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsl0/v2;

    return-object p0
.end method

.method public static values()[Lsl0/v2;
    .locals 1

    sget-object v0, Lsl0/v2;->$VALUES:[Lsl0/v2;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsl0/v2;

    return-object v0
.end method


# virtual methods
.method public final next()Lsl0/v2;
    .locals 3

    invoke-static {}, Lsl0/v2;->values()[Lsl0/v2;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {}, Lsl0/v2;->values()[Lsl0/v2;

    move-result-object v2

    array-length v2, v2

    rem-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0
.end method
