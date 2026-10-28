.class public final enum Lsl0/c3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsl0/c3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lsl0/c3;",
        "",
        "",
        "symbol",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "next",
        "()Lsl0/c3;",
        "Ljava/lang/String;",
        "getSymbol",
        "()Ljava/lang/String;",
        "DOT",
        "WHITE_DOT",
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

.field private static final synthetic $VALUES:[Lsl0/c3;

.field public static final enum DOT:Lsl0/c3;

.field public static final enum WHITE_DOT:Lsl0/c3;


# instance fields
.field private final symbol:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lsl0/c3;
    .locals 2

    sget-object v0, Lsl0/c3;->DOT:Lsl0/c3;

    sget-object v1, Lsl0/c3;->WHITE_DOT:Lsl0/c3;

    filled-new-array {v0, v1}, [Lsl0/c3;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lsl0/c3;

    const/4 v1, 0x0

    const-string v2, "\u2022"

    const-string v3, "DOT"

    invoke-direct {v0, v3, v1, v2}, Lsl0/c3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lsl0/c3;->DOT:Lsl0/c3;

    new-instance v0, Lsl0/c3;

    const/4 v1, 0x1

    const-string v2, "\u25e6"

    const-string v3, "WHITE_DOT"

    invoke-direct {v0, v3, v1, v2}, Lsl0/c3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lsl0/c3;->WHITE_DOT:Lsl0/c3;

    invoke-static {}, Lsl0/c3;->$values()[Lsl0/c3;

    move-result-object v0

    sput-object v0, Lsl0/c3;->$VALUES:[Lsl0/c3;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lsl0/c3;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Lsl0/c3;->symbol:Ljava/lang/String;

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

    sget-object v0, Lsl0/c3;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsl0/c3;
    .locals 1

    const-class v0, Lsl0/c3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsl0/c3;

    return-object p0
.end method

.method public static values()[Lsl0/c3;
    .locals 1

    sget-object v0, Lsl0/c3;->$VALUES:[Lsl0/c3;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsl0/c3;

    return-object v0
.end method


# virtual methods
.method public final getSymbol()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsl0/c3;->symbol:Ljava/lang/String;

    return-object v0
.end method

.method public final next()Lsl0/c3;
    .locals 3

    invoke-static {}, Lsl0/c3;->values()[Lsl0/c3;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {}, Lsl0/c3;->values()[Lsl0/c3;

    move-result-object v2

    array-length v2, v2

    rem-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0
.end method
