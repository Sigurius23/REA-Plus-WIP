.class public final enum Lyy/l0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lyy/l0;

.field public static final synthetic y:[Lyy/l0;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lyy/l0;

    const/4 v1, 0x0

    const-string v2, "application/x-www-form-urlencoded"

    const-string v3, "Form"

    invoke-direct {v0, v3, v1, v2}, Lyy/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyy/l0;->x:Lyy/l0;

    new-instance v1, Lyy/l0;

    const/4 v2, 0x1

    const-string v3, "multipart/form-data"

    const-string v4, "MultipartForm"

    invoke-direct {v1, v4, v2, v3}, Lyy/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Lyy/l0;

    const/4 v3, 0x2

    const-string v4, "application/json"

    const-string v5, "Json"

    invoke-direct {v2, v5, v3, v4}, Lyy/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array {v0, v1, v2}, [Lyy/l0;

    move-result-object v0

    sput-object v0, Lyy/l0;->y:[Lyy/l0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lyy/l0;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyy/l0;
    .locals 1

    const-class v0, Lyy/l0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyy/l0;

    return-object p0
.end method

.method public static values()[Lyy/l0;
    .locals 1

    sget-object v0, Lyy/l0;->y:[Lyy/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyy/l0;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyy/l0;->w:Ljava/lang/String;

    return-object v0
.end method
