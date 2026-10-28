.class public final enum Lkd1/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkd1/z;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lkd1/z;",
        "",
        "",
        "symbol",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Lcom/whoop/design/util/TextResource;",
        "toTextResource",
        "()Lcom/whoop/design/util/TextResource;",
        "Ljava/lang/String;",
        "getSymbol",
        "()Ljava/lang/String;",
        "BULLET",
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

.field private static final synthetic $VALUES:[Lkd1/z;

.field public static final enum BULLET:Lkd1/z;


# instance fields
.field private final symbol:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lkd1/z;
    .locals 1

    sget-object v0, Lkd1/z;->BULLET:Lkd1/z;

    filled-new-array {v0}, [Lkd1/z;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkd1/z;

    const/4 v1, 0x0

    const-string v2, "\u2022"

    const-string v3, "BULLET"

    invoke-direct {v0, v3, v1, v2}, Lkd1/z;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkd1/z;->BULLET:Lkd1/z;

    invoke-static {}, Lkd1/z;->$values()[Lkd1/z;

    move-result-object v0

    sput-object v0, Lkd1/z;->$VALUES:[Lkd1/z;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lkd1/z;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Lkd1/z;->symbol:Ljava/lang/String;

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

    sget-object v0, Lkd1/z;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkd1/z;
    .locals 1

    const-class v0, Lkd1/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkd1/z;

    return-object p0
.end method

.method public static values()[Lkd1/z;
    .locals 1

    sget-object v0, Lkd1/z;->$VALUES:[Lkd1/z;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkd1/z;

    return-object v0
.end method


# virtual methods
.method public final getSymbol()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkd1/z;->symbol:Ljava/lang/String;

    return-object v0
.end method

.method public final toTextResource()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lkd1/z;->symbol:Ljava/lang/String;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    return-object v0
.end method
