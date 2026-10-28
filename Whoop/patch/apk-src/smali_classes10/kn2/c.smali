.class public final enum Lkn2/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkn2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lkn2/c;",
        "",
        "",
        "textResId",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getTextResId",
        "()I",
        "HARVARD",
        "GOOSE",
        "MAVERICK",
        "DISCONNECTED",
        "app_prodStandardRelease"
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

.field private static final synthetic $VALUES:[Lkn2/c;

.field public static final enum DISCONNECTED:Lkn2/c;

.field public static final enum GOOSE:Lkn2/c;

.field public static final enum HARVARD:Lkn2/c;

.field public static final enum MAVERICK:Lkn2/c;


# instance fields
.field private final textResId:I


# direct methods
.method private static final synthetic $values()[Lkn2/c;
    .locals 4

    sget-object v0, Lkn2/c;->HARVARD:Lkn2/c;

    sget-object v1, Lkn2/c;->GOOSE:Lkn2/c;

    sget-object v2, Lkn2/c;->MAVERICK:Lkn2/c;

    sget-object v3, Lkn2/c;->DISCONNECTED:Lkn2/c;

    filled-new-array {v0, v1, v2, v3}, [Lkn2/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkn2/c;

    sget v1, Lhi0/j;->F:I

    const-string v2, "HARVARD"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lkn2/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lkn2/c;->HARVARD:Lkn2/c;

    new-instance v0, Lkn2/c;

    const/4 v1, 0x1

    sget v2, Lhi0/j;->E:I

    const-string v4, "GOOSE"

    invoke-direct {v0, v4, v1, v2}, Lkn2/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lkn2/c;->GOOSE:Lkn2/c;

    new-instance v0, Lkn2/c;

    const/4 v1, 0x2

    sget v2, Lhi0/j;->G:I

    const-string v4, "MAVERICK"

    invoke-direct {v0, v4, v1, v2}, Lkn2/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lkn2/c;->MAVERICK:Lkn2/c;

    new-instance v0, Lkn2/c;

    const-string v1, "DISCONNECTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Lkn2/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lkn2/c;->DISCONNECTED:Lkn2/c;

    invoke-static {}, Lkn2/c;->$values()[Lkn2/c;

    move-result-object v0

    sput-object v0, Lkn2/c;->$VALUES:[Lkn2/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lkn2/c;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lkn2/c;->textResId:I

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

    sget-object v0, Lkn2/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkn2/c;
    .locals 1

    const-class v0, Lkn2/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkn2/c;

    return-object p0
.end method

.method public static values()[Lkn2/c;
    .locals 1

    sget-object v0, Lkn2/c;->$VALUES:[Lkn2/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkn2/c;

    return-object v0
.end method


# virtual methods
.method public final getTextResId()I
    .locals 1

    iget v0, p0, Lkn2/c;->textResId:I

    return v0
.end method
