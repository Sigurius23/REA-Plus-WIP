.class public final enum Lfi/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum y:Lfi/b;

.field public static final synthetic z:[Lfi/b;


# instance fields
.field public final w:Z

.field public final x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lfi/b;

    const-string v1, "ENABLED"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3, v3}, Lfi/b;-><init>(Ljava/lang/String;IZZ)V

    sput-object v0, Lfi/b;->y:Lfi/b;

    new-instance v1, Lfi/b;

    const-string v4, "READ_ONLY"

    invoke-direct {v1, v4, v3, v3, v2}, Lfi/b;-><init>(Ljava/lang/String;IZZ)V

    new-instance v4, Lfi/b;

    const-string v5, "WRITE_ONLY"

    const/4 v6, 0x2

    invoke-direct {v4, v5, v6, v2, v3}, Lfi/b;-><init>(Ljava/lang/String;IZZ)V

    new-instance v3, Lfi/b;

    const-string v5, "DISABLED"

    const/4 v6, 0x3

    invoke-direct {v3, v5, v6, v2, v2}, Lfi/b;-><init>(Ljava/lang/String;IZZ)V

    filled-new-array {v0, v1, v4, v3}, [Lfi/b;

    move-result-object v0

    sput-object v0, Lfi/b;->z:[Lfi/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lfi/b;->w:Z

    iput-boolean p4, p0, Lfi/b;->x:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lfi/b;
    .locals 1

    const-class v0, Lfi/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfi/b;

    return-object p0
.end method

.method public static values()[Lfi/b;
    .locals 1

    sget-object v0, Lfi/b;->z:[Lfi/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfi/b;

    return-object v0
.end method
