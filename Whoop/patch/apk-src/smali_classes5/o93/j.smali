.class public final enum Lo93/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final E:Ljava/util/Set;

.field public static final enum F:Lo93/j;

.field public static final enum G:Lo93/j;

.field public static final enum H:Lo93/j;

.field public static final enum I:Lo93/j;

.field public static final enum J:Lo93/j;

.field public static final enum K:Lo93/j;

.field public static final enum L:Lo93/j;

.field public static final enum M:Lo93/j;

.field public static final synthetic N:[Lo93/j;


# instance fields
.field public final w:Lva3/h;

.field public final x:Lva3/h;

.field public final y:Ljava/lang/Object;

.field public final z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lo93/j;

    const/4 v1, 0x0

    const-string v2, "Boolean"

    const-string v3, "BOOLEAN"

    invoke-direct {v0, v3, v1, v2}, Lo93/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo93/j;->F:Lo93/j;

    new-instance v1, Lo93/j;

    const/4 v2, 0x1

    const-string v3, "Char"

    const-string v4, "CHAR"

    invoke-direct {v1, v4, v2, v3}, Lo93/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lo93/j;->G:Lo93/j;

    new-instance v2, Lo93/j;

    const/4 v3, 0x2

    const-string v4, "Byte"

    const-string v5, "BYTE"

    invoke-direct {v2, v5, v3, v4}, Lo93/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lo93/j;->H:Lo93/j;

    new-instance v3, Lo93/j;

    const/4 v4, 0x3

    const-string v5, "Short"

    const-string v6, "SHORT"

    invoke-direct {v3, v6, v4, v5}, Lo93/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lo93/j;->I:Lo93/j;

    new-instance v4, Lo93/j;

    const/4 v5, 0x4

    const-string v6, "Int"

    const-string v7, "INT"

    invoke-direct {v4, v7, v5, v6}, Lo93/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lo93/j;->J:Lo93/j;

    new-instance v5, Lo93/j;

    const/4 v6, 0x5

    const-string v7, "Float"

    const-string v8, "FLOAT"

    invoke-direct {v5, v8, v6, v7}, Lo93/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lo93/j;->K:Lo93/j;

    new-instance v6, Lo93/j;

    const/4 v7, 0x6

    const-string v8, "Long"

    const-string v9, "LONG"

    invoke-direct {v6, v9, v7, v8}, Lo93/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lo93/j;->L:Lo93/j;

    new-instance v7, Lo93/j;

    const/4 v8, 0x7

    const-string v9, "Double"

    const-string v10, "DOUBLE"

    invoke-direct {v7, v10, v8, v9}, Lo93/j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lo93/j;->M:Lo93/j;

    filled-new-array/range {v0 .. v7}, [Lo93/j;

    move-result-object v0

    sput-object v0, Lo93/j;->N:[Lo93/j;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-object v8, v5

    move-object v9, v6

    move-object v10, v7

    move-object v5, v2

    move-object v6, v3

    move-object v7, v4

    move-object v4, v1

    filled-new-array/range {v4 .. v10}, [Lo93/j;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lo93/j;->E:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    invoke-static {p3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p1

    iput-object p1, p0, Lo93/j;->w:Lva3/h;

    const-string p1, "Array"

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p1

    iput-object p1, p0, Lo93/j;->x:Lva3/h;

    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lo93/i;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lo93/i;-><init>(Lo93/j;I)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lo93/j;->y:Ljava/lang/Object;

    new-instance p2, Lo93/i;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lo93/i;-><init>(Lo93/j;I)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lo93/j;->z:Ljava/lang/Object;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo93/j;
    .locals 1

    const-class v0, Lo93/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo93/j;

    return-object p0
.end method

.method public static values()[Lo93/j;
    .locals 1

    sget-object v0, Lo93/j;->N:[Lo93/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo93/j;

    return-object v0
.end method
