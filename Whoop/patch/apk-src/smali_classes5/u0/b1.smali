.class public final enum Lu0/b1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic x:[Lu0/b1;


# instance fields
.field public final w:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lu0/b1;

    const v3, 0x1040003

    const v4, 0x1010311

    const-string v1, "Cut"

    const/4 v2, 0x0

    sget-object v5, Lx0/e;->a:Ljava/lang/Object;

    invoke-direct/range {v0 .. v5}, Lu0/b1;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    new-instance v1, Lu0/b1;

    const v4, 0x1040001

    const v5, 0x1010312

    const-string v2, "Copy"

    const/4 v3, 0x1

    sget-object v6, Lx0/e;->b:Ljava/lang/Object;

    invoke-direct/range {v1 .. v6}, Lu0/b1;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    new-instance v2, Lu0/b1;

    const v5, 0x104000b

    const v6, 0x1010313

    const-string v3, "Paste"

    const/4 v4, 0x2

    sget-object v7, Lx0/e;->c:Ljava/lang/Object;

    invoke-direct/range {v2 .. v7}, Lu0/b1;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    new-instance v3, Lu0/b1;

    const v6, 0x104000d

    const v7, 0x101037e

    const-string v4, "SelectAll"

    const/4 v5, 0x3

    sget-object v8, Lx0/e;->d:Ljava/lang/Object;

    invoke-direct/range {v3 .. v8}, Lu0/b1;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    new-instance v4, Lu0/b1;

    const v7, 0x104001a

    const/4 v8, 0x0

    const-string v5, "Autofill"

    const/4 v6, 0x4

    sget-object v9, Lx0/e;->e:Ljava/lang/Object;

    invoke-direct/range {v4 .. v9}, Lu0/b1;-><init>(Ljava/lang/String;IIILjava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3, v4}, [Lu0/b1;

    move-result-object v0

    sput-object v0, Lu0/b1;->x:[Lu0/b1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p5, p0, Lu0/b1;->w:Ljava/lang/Object;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lu0/b1;
    .locals 1

    const-class v0, Lu0/b1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu0/b1;

    return-object p0
.end method

.method public static values()[Lu0/b1;
    .locals 1

    sget-object v0, Lu0/b1;->x:[Lu0/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu0/b1;

    return-object v0
.end method
