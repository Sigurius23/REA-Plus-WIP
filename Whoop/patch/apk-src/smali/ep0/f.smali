.class public final enum Lep0/f;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lxr2/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lep0/f;",
        ">;",
        "Lxr2/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lep0/f;",
        "Lxr2/a;",
        "",
        "",
        "serializedValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getSerializedValue",
        "()Ljava/lang/String;",
        "AUTOPOP",
        "GLOW",
        "PREVIEW",
        "NONE",
        "coach-everywhere-common_release"
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

.field private static final synthetic $VALUES:[Lep0/f;

.field public static final enum AUTOPOP:Lep0/f;

.field public static final enum GLOW:Lep0/f;

.field public static final enum NONE:Lep0/f;

.field public static final enum PREVIEW:Lep0/f;


# instance fields
.field private final serializedValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lep0/f;
    .locals 4

    sget-object v0, Lep0/f;->AUTOPOP:Lep0/f;

    sget-object v1, Lep0/f;->GLOW:Lep0/f;

    sget-object v2, Lep0/f;->PREVIEW:Lep0/f;

    sget-object v3, Lep0/f;->NONE:Lep0/f;

    filled-new-array {v0, v1, v2, v3}, [Lep0/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lep0/f;

    const-string v1, "AUTOPOP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lep0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lep0/f;->AUTOPOP:Lep0/f;

    new-instance v0, Lep0/f;

    const-string v1, "GLOW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lep0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lep0/f;->GLOW:Lep0/f;

    new-instance v0, Lep0/f;

    const-string v1, "PREVIEW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Lep0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lep0/f;->PREVIEW:Lep0/f;

    new-instance v0, Lep0/f;

    const-string v1, "NONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Lep0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lep0/f;->NONE:Lep0/f;

    invoke-static {}, Lep0/f;->$values()[Lep0/f;

    move-result-object v0

    sput-object v0, Lep0/f;->$VALUES:[Lep0/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lep0/f;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Lep0/f;->serializedValue:Ljava/lang/String;

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

    sget-object v0, Lep0/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lep0/f;
    .locals 1

    const-class v0, Lep0/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lep0/f;

    return-object p0
.end method

.method public static values()[Lep0/f;
    .locals 1

    sget-object v0, Lep0/f;->$VALUES:[Lep0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lep0/f;

    return-object v0
.end method


# virtual methods
.method public getSerializedValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lep0/f;->serializedValue:Ljava/lang/String;

    return-object v0
.end method
