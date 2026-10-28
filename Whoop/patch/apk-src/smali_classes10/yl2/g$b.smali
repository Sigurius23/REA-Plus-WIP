.class public final enum Lyl2/g$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyl2/g$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lyl2/g$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Fragment",
        "Compose",
        "trends_release"
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

.field private static final synthetic $VALUES:[Lyl2/g$b;

.field public static final enum Compose:Lyl2/g$b;

.field public static final enum Fragment:Lyl2/g$b;


# direct methods
.method private static final synthetic $values()[Lyl2/g$b;
    .locals 2

    sget-object v0, Lyl2/g$b;->Fragment:Lyl2/g$b;

    sget-object v1, Lyl2/g$b;->Compose:Lyl2/g$b;

    filled-new-array {v0, v1}, [Lyl2/g$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyl2/g$b;

    const-string v1, "Fragment"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lyl2/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyl2/g$b;->Fragment:Lyl2/g$b;

    new-instance v0, Lyl2/g$b;

    const-string v1, "Compose"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lyl2/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyl2/g$b;->Compose:Lyl2/g$b;

    invoke-static {}, Lyl2/g$b;->$values()[Lyl2/g$b;

    move-result-object v0

    sput-object v0, Lyl2/g$b;->$VALUES:[Lyl2/g$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lyl2/g$b;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lyl2/g$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyl2/g$b;
    .locals 1

    const-class v0, Lyl2/g$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyl2/g$b;

    return-object p0
.end method

.method public static values()[Lyl2/g$b;
    .locals 1

    sget-object v0, Lyl2/g$b;->$VALUES:[Lyl2/g$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyl2/g$b;

    return-object v0
.end method
