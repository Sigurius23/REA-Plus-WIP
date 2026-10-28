.class public final enum Loh2/b$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Loh2/b$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Loh2/b$c;",
        "",
        "",
        "tag",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getTag",
        "()Ljava/lang/String;",
        "EMPTY",
        "PARSING_ERROR",
        "connectivity-data-packets-model_release"
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

.field private static final synthetic $VALUES:[Loh2/b$c;

.field public static final enum EMPTY:Loh2/b$c;

.field public static final enum PARSING_ERROR:Loh2/b$c;


# instance fields
.field private final tag:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Loh2/b$c;
    .locals 2

    sget-object v0, Loh2/b$c;->EMPTY:Loh2/b$c;

    sget-object v1, Loh2/b$c;->PARSING_ERROR:Loh2/b$c;

    filled-new-array {v0, v1}, [Loh2/b$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Loh2/b$c;

    const/4 v1, 0x0

    const-string v2, "empty"

    const-string v3, "EMPTY"

    invoke-direct {v0, v3, v1, v2}, Loh2/b$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Loh2/b$c;->EMPTY:Loh2/b$c;

    new-instance v0, Loh2/b$c;

    const/4 v1, 0x1

    const-string v2, "parsing_error"

    const-string v3, "PARSING_ERROR"

    invoke-direct {v0, v3, v1, v2}, Loh2/b$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Loh2/b$c;->PARSING_ERROR:Loh2/b$c;

    invoke-static {}, Loh2/b$c;->$values()[Loh2/b$c;

    move-result-object v0

    sput-object v0, Loh2/b$c;->$VALUES:[Loh2/b$c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Loh2/b$c;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Loh2/b$c;->tag:Ljava/lang/String;

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

    sget-object v0, Loh2/b$c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Loh2/b$c;
    .locals 1

    const-class v0, Loh2/b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Loh2/b$c;

    return-object p0
.end method

.method public static values()[Loh2/b$c;
    .locals 1

    sget-object v0, Loh2/b$c;->$VALUES:[Loh2/b$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Loh2/b$c;

    return-object v0
.end method


# virtual methods
.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loh2/b$c;->tag:Ljava/lang/String;

    return-object v0
.end method
