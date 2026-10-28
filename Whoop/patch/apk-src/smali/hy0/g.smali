.class public final enum Lhy0/g;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhy0/g;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lhy0/g;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SOLID",
        "DOTTED",
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

.field private static final synthetic $VALUES:[Lhy0/g;

.field public static final enum DOTTED:Lhy0/g;

.field public static final enum SOLID:Lhy0/g;


# direct methods
.method private static final synthetic $values()[Lhy0/g;
    .locals 2

    sget-object v0, Lhy0/g;->SOLID:Lhy0/g;

    sget-object v1, Lhy0/g;->DOTTED:Lhy0/g;

    filled-new-array {v0, v1}, [Lhy0/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhy0/g;

    const-string v1, "SOLID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhy0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/g;->SOLID:Lhy0/g;

    new-instance v0, Lhy0/g;

    const-string v1, "DOTTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhy0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/g;->DOTTED:Lhy0/g;

    invoke-static {}, Lhy0/g;->$values()[Lhy0/g;

    move-result-object v0

    sput-object v0, Lhy0/g;->$VALUES:[Lhy0/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lhy0/g;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lhy0/g;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhy0/g;
    .locals 1

    const-class v0, Lhy0/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhy0/g;

    return-object p0
.end method

.method public static values()[Lhy0/g;
    .locals 1

    sget-object v0, Lhy0/g;->$VALUES:[Lhy0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhy0/g;

    return-object v0
.end method
