.class public final enum Liz0/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Liz0/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Liz0/j;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "next",
        "()Liz0/j;",
        "NUMBERS",
        "LETTERS",
        "ROMAN",
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

.field private static final synthetic $VALUES:[Liz0/j;

.field public static final enum LETTERS:Liz0/j;

.field public static final enum NUMBERS:Liz0/j;

.field public static final enum ROMAN:Liz0/j;


# direct methods
.method private static final synthetic $values()[Liz0/j;
    .locals 3

    sget-object v0, Liz0/j;->NUMBERS:Liz0/j;

    sget-object v1, Liz0/j;->LETTERS:Liz0/j;

    sget-object v2, Liz0/j;->ROMAN:Liz0/j;

    filled-new-array {v0, v1, v2}, [Liz0/j;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Liz0/j;

    const-string v1, "NUMBERS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Liz0/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Liz0/j;->NUMBERS:Liz0/j;

    new-instance v0, Liz0/j;

    const-string v1, "LETTERS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Liz0/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Liz0/j;->LETTERS:Liz0/j;

    new-instance v0, Liz0/j;

    const-string v1, "ROMAN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Liz0/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Liz0/j;->ROMAN:Liz0/j;

    invoke-static {}, Liz0/j;->$values()[Liz0/j;

    move-result-object v0

    sput-object v0, Liz0/j;->$VALUES:[Liz0/j;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Liz0/j;->$ENTRIES:Lt83/a;

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

    sget-object v0, Liz0/j;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Liz0/j;
    .locals 1

    const-class v0, Liz0/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Liz0/j;

    return-object p0
.end method

.method public static values()[Liz0/j;
    .locals 1

    sget-object v0, Liz0/j;->$VALUES:[Liz0/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Liz0/j;

    return-object v0
.end method


# virtual methods
.method public final next()Liz0/j;
    .locals 3

    invoke-static {}, Liz0/j;->values()[Liz0/j;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {}, Liz0/j;->values()[Liz0/j;

    move-result-object v2

    array-length v2, v2

    rem-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0
.end method
