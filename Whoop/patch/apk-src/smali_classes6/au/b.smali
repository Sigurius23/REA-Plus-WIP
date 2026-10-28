.class public final enum Lau/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lot/c;


# static fields
.field public static final enum x:Lau/b;

.field public static final enum y:Lau/b;

.field public static final synthetic z:[Lau/b;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lau/b;

    const-string v1, "UNKNOWN_EVENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lau/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lau/b;->x:Lau/b;

    new-instance v1, Lau/b;

    const-string v2, "MESSAGE_DELIVERED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lau/b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lau/b;->y:Lau/b;

    new-instance v2, Lau/b;

    const-string v3, "MESSAGE_OPEN"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lau/b;-><init>(Ljava/lang/String;II)V

    filled-new-array {v0, v1, v2}, [Lau/b;

    move-result-object v0

    sput-object v0, Lau/b;->z:[Lau/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lau/b;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lau/b;
    .locals 1

    const-class v0, Lau/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lau/b;

    return-object p0
.end method

.method public static values()[Lau/b;
    .locals 1

    sget-object v0, Lau/b;->z:[Lau/b;

    invoke-virtual {v0}, [Lau/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lau/b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lau/b;->w:I

    return v0
.end method
