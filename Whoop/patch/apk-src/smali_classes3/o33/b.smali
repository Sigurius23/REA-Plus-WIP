.class public final enum Lo33/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final x:Lng3/o;

.field public static final enum y:Lo33/b;

.field public static final synthetic z:[Lo33/b;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lo33/b;

    const/4 v1, 0x0

    const-string v2, "none"

    const-string v3, "NONE"

    invoke-direct {v0, v3, v1, v2}, Lo33/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lo33/b;

    const/4 v2, 0x1

    const-string v3, "cpu"

    const-string v4, "CPU"

    invoke-direct {v1, v4, v2, v3}, Lo33/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v2, Lo33/b;

    const/4 v3, 0x2

    const-string v4, "bandwidth"

    const-string v5, "BANDWIDTH"

    invoke-direct {v2, v5, v3, v4}, Lo33/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Lo33/b;

    const/4 v4, 0x3

    const-string v5, "other"

    const-string v6, "OTHER"

    invoke-direct {v3, v6, v4, v5}, Lo33/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Lo33/b;

    const/4 v5, 0x4

    const-string v6, "unknown"

    const-string v7, "UNKNOWN"

    invoke-direct {v4, v7, v5, v6}, Lo33/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lo33/b;->y:Lo33/b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lo33/b;

    move-result-object v0

    sput-object v0, Lo33/b;->z:[Lo33/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    new-instance v0, Lng3/o;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lng3/o;-><init>(IZ)V

    sput-object v0, Lo33/b;->x:Lng3/o;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lo33/b;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo33/b;
    .locals 1

    const-class v0, Lo33/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo33/b;

    return-object p0
.end method

.method public static values()[Lo33/b;
    .locals 1

    sget-object v0, Lo33/b;->z:[Lo33/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo33/b;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo33/b;->w:Ljava/lang/String;

    return-object v0
.end method
