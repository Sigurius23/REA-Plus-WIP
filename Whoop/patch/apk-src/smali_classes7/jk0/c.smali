.class public final enum Ljk0/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljk0/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljk0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Ljk0/c;",
        "",
        "",
        "locationInt",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getLocationInt",
        "()I",
        "Companion",
        "a",
        "UNKNOWN",
        "WRIST",
        "BICEP",
        "CALF",
        "SIDE_TORSO",
        "GLUTE",
        "ANKLE",
        "UNKNOWN_GARMENT",
        "NOT_CONCLUSIVE",
        "connectivity_release"
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

.field private static final synthetic $VALUES:[Ljk0/c;

.field public static final enum ANKLE:Ljk0/c;

.field public static final enum BICEP:Ljk0/c;

.field public static final enum CALF:Ljk0/c;

.field public static final Companion:Ljk0/c$a;

.field public static final enum GLUTE:Ljk0/c;

.field public static final enum NOT_CONCLUSIVE:Ljk0/c;

.field public static final enum SIDE_TORSO:Ljk0/c;

.field public static final enum UNKNOWN:Ljk0/c;

.field public static final enum UNKNOWN_GARMENT:Ljk0/c;

.field public static final enum WRIST:Ljk0/c;


# instance fields
.field private final locationInt:I


# direct methods
.method private static final synthetic $values()[Ljk0/c;
    .locals 9

    sget-object v0, Ljk0/c;->UNKNOWN:Ljk0/c;

    sget-object v1, Ljk0/c;->WRIST:Ljk0/c;

    sget-object v2, Ljk0/c;->BICEP:Ljk0/c;

    sget-object v3, Ljk0/c;->CALF:Ljk0/c;

    sget-object v4, Ljk0/c;->SIDE_TORSO:Ljk0/c;

    sget-object v5, Ljk0/c;->GLUTE:Ljk0/c;

    sget-object v6, Ljk0/c;->ANKLE:Ljk0/c;

    sget-object v7, Ljk0/c;->UNKNOWN_GARMENT:Ljk0/c;

    sget-object v8, Ljk0/c;->NOT_CONCLUSIVE:Ljk0/c;

    filled-new-array/range {v0 .. v8}, [Ljk0/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljk0/c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ljk0/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljk0/c;->UNKNOWN:Ljk0/c;

    new-instance v0, Ljk0/c;

    const-string v1, "WRIST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ljk0/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljk0/c;->WRIST:Ljk0/c;

    new-instance v0, Ljk0/c;

    const-string v1, "BICEP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Ljk0/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljk0/c;->BICEP:Ljk0/c;

    new-instance v0, Ljk0/c;

    const-string v1, "CALF"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Ljk0/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljk0/c;->CALF:Ljk0/c;

    new-instance v0, Ljk0/c;

    const-string v1, "SIDE_TORSO"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Ljk0/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljk0/c;->SIDE_TORSO:Ljk0/c;

    new-instance v0, Ljk0/c;

    const-string v1, "GLUTE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Ljk0/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljk0/c;->GLUTE:Ljk0/c;

    new-instance v0, Ljk0/c;

    const-string v1, "ANKLE"

    const/4 v2, 0x6

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Ljk0/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljk0/c;->ANKLE:Ljk0/c;

    new-instance v0, Ljk0/c;

    const-string v1, "UNKNOWN_GARMENT"

    const/16 v2, 0xa0

    invoke-direct {v0, v1, v3, v2}, Ljk0/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljk0/c;->UNKNOWN_GARMENT:Ljk0/c;

    new-instance v0, Ljk0/c;

    const/16 v1, 0x8

    const/16 v2, 0x80

    const-string v3, "NOT_CONCLUSIVE"

    invoke-direct {v0, v3, v1, v2}, Ljk0/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ljk0/c;->NOT_CONCLUSIVE:Ljk0/c;

    invoke-static {}, Ljk0/c;->$values()[Ljk0/c;

    move-result-object v0

    sput-object v0, Ljk0/c;->$VALUES:[Ljk0/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ljk0/c;->$ENTRIES:Lt83/a;

    new-instance v0, Ljk0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljk0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljk0/c;->Companion:Ljk0/c$a;

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

    iput p3, p0, Ljk0/c;->locationInt:I

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

    sget-object v0, Ljk0/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljk0/c;
    .locals 1

    const-class v0, Ljk0/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljk0/c;

    return-object p0
.end method

.method public static values()[Ljk0/c;
    .locals 1

    sget-object v0, Ljk0/c;->$VALUES:[Ljk0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljk0/c;

    return-object v0
.end method


# virtual methods
.method public final getLocationInt()I
    .locals 1

    iget v0, p0, Ljk0/c;->locationInt:I

    return v0
.end method
