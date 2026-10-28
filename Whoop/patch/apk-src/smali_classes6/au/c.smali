.class public final enum Lau/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lot/c;


# static fields
.field public static final synthetic E:[Lau/c;

.field public static final enum x:Lau/c;

.field public static final enum y:Lau/c;

.field public static final enum z:Lau/c;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lau/c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lau/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lau/c;->x:Lau/c;

    new-instance v1, Lau/c;

    const-string v2, "DATA_MESSAGE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lau/c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lau/c;->y:Lau/c;

    new-instance v2, Lau/c;

    const-string v3, "TOPIC"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lau/c;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lau/c;

    const-string v4, "DISPLAY_NOTIFICATION"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lau/c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lau/c;->z:Lau/c;

    filled-new-array {v0, v1, v2, v3}, [Lau/c;

    move-result-object v0

    sput-object v0, Lau/c;->E:[Lau/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lau/c;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lau/c;
    .locals 1

    const-class v0, Lau/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lau/c;

    return-object p0
.end method

.method public static values()[Lau/c;
    .locals 1

    sget-object v0, Lau/c;->E:[Lau/c;

    invoke-virtual {v0}, [Lau/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lau/c;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lau/c;->w:I

    return v0
.end method
