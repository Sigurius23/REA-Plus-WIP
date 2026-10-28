.class public final enum Lo93/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lo93/p;

.field public static final synthetic F:[Lo93/p;

.field public static final enum x:Lo93/p;

.field public static final enum y:Lo93/p;

.field public static final enum z:Lo93/p;


# instance fields
.field public final w:Lva3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lo93/p;

    const-string v1, "kotlin/UByteArray"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lva3/b;->d(Ljava/lang/String;Z)Lva3/c;

    move-result-object v1

    const-string v3, "UBYTEARRAY"

    invoke-direct {v0, v3, v2, v1}, Lo93/p;-><init>(Ljava/lang/String;ILva3/c;)V

    sput-object v0, Lo93/p;->x:Lo93/p;

    new-instance v1, Lo93/p;

    const-string v3, "kotlin/UShortArray"

    invoke-static {v3, v2}, Lva3/b;->d(Ljava/lang/String;Z)Lva3/c;

    move-result-object v3

    const-string v4, "USHORTARRAY"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v3}, Lo93/p;-><init>(Ljava/lang/String;ILva3/c;)V

    sput-object v1, Lo93/p;->y:Lo93/p;

    new-instance v3, Lo93/p;

    const-string v4, "kotlin/UIntArray"

    invoke-static {v4, v2}, Lva3/b;->d(Ljava/lang/String;Z)Lva3/c;

    move-result-object v4

    const-string v5, "UINTARRAY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, Lo93/p;-><init>(Ljava/lang/String;ILva3/c;)V

    sput-object v3, Lo93/p;->z:Lo93/p;

    new-instance v4, Lo93/p;

    const-string v5, "kotlin/ULongArray"

    invoke-static {v5, v2}, Lva3/b;->d(Ljava/lang/String;Z)Lva3/c;

    move-result-object v2

    const-string v5, "ULONGARRAY"

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6, v2}, Lo93/p;-><init>(Ljava/lang/String;ILva3/c;)V

    sput-object v4, Lo93/p;->E:Lo93/p;

    filled-new-array {v0, v1, v3, v4}, [Lo93/p;

    move-result-object v0

    sput-object v0, Lo93/p;->F:[Lo93/p;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILva3/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p3}, Lva3/c;->f()Lva3/h;

    move-result-object p1

    iput-object p1, p0, Lo93/p;->w:Lva3/h;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo93/p;
    .locals 1

    const-class v0, Lo93/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo93/p;

    return-object p0
.end method

.method public static values()[Lo93/p;
    .locals 1

    sget-object v0, Lo93/p;->F:[Lo93/p;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo93/p;

    return-object v0
.end method
