.class public final enum Lo93/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic z:[Lo93/q;


# instance fields
.field public final w:Lva3/c;

.field public final x:Lva3/h;

.field public final y:Lva3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lo93/q;

    const-string v1, "kotlin/UByte"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lva3/b;->d(Ljava/lang/String;Z)Lva3/c;

    move-result-object v1

    const-string v3, "UBYTE"

    invoke-direct {v0, v3, v2, v1}, Lo93/q;-><init>(Ljava/lang/String;ILva3/c;)V

    new-instance v1, Lo93/q;

    const-string v3, "kotlin/UShort"

    invoke-static {v3, v2}, Lva3/b;->d(Ljava/lang/String;Z)Lva3/c;

    move-result-object v3

    const-string v4, "USHORT"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v3}, Lo93/q;-><init>(Ljava/lang/String;ILva3/c;)V

    new-instance v3, Lo93/q;

    const-string v4, "kotlin/UInt"

    invoke-static {v4, v2}, Lva3/b;->d(Ljava/lang/String;Z)Lva3/c;

    move-result-object v4

    const-string v5, "UINT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, Lo93/q;-><init>(Ljava/lang/String;ILva3/c;)V

    new-instance v4, Lo93/q;

    const-string v5, "kotlin/ULong"

    invoke-static {v5, v2}, Lva3/b;->d(Ljava/lang/String;Z)Lva3/c;

    move-result-object v2

    const-string v5, "ULONG"

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6, v2}, Lo93/q;-><init>(Ljava/lang/String;ILva3/c;)V

    filled-new-array {v0, v1, v3, v4}, [Lo93/q;

    move-result-object v0

    sput-object v0, Lo93/q;->z:[Lo93/q;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILva3/c;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lo93/q;->w:Lva3/c;

    invoke-virtual {p3}, Lva3/c;->f()Lva3/h;

    move-result-object p1

    iput-object p1, p0, Lo93/q;->x:Lva3/h;

    new-instance p2, Lva3/c;

    iget-object p3, p3, Lva3/c;->a:Lva3/e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "Array"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    iput-object p2, p0, Lo93/q;->y:Lva3/c;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo93/q;
    .locals 1

    const-class v0, Lo93/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo93/q;

    return-object p0
.end method

.method public static values()[Lo93/q;
    .locals 1

    sget-object v0, Lo93/q;->z:[Lo93/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo93/q;

    return-object v0
.end method
