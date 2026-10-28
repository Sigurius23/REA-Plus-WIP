.class public final enum Laj/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:[Laj/b;

.field public static final enum x:Laj/b;

.field public static final enum y:Laj/b;

.field public static final enum z:Laj/b;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Laj/b;

    const/4 v1, 0x0

    const-string v2, ".json"

    const-string v3, "JSON"

    invoke-direct {v0, v3, v1, v2}, Laj/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Laj/b;->x:Laj/b;

    new-instance v1, Laj/b;

    const/4 v2, 0x1

    const-string v3, ".zip"

    const-string v4, "ZIP"

    invoke-direct {v1, v4, v2, v3}, Laj/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Laj/b;->y:Laj/b;

    new-instance v2, Laj/b;

    const/4 v3, 0x2

    const-string v4, ".gz"

    const-string v5, "GZIP"

    invoke-direct {v2, v5, v3, v4}, Laj/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Laj/b;->z:Laj/b;

    filled-new-array {v0, v1, v2}, [Laj/b;

    move-result-object v0

    sput-object v0, Laj/b;->E:[Laj/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Laj/b;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Laj/b;
    .locals 1

    const-class v0, Laj/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laj/b;

    return-object p0
.end method

.method public static values()[Laj/b;
    .locals 1

    sget-object v0, Laj/b;->E:[Laj/b;

    invoke-virtual {v0}, [Laj/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laj/b;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Laj/b;->w:Ljava/lang/String;

    return-object v0
.end method
