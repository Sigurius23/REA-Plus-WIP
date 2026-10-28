.class public final enum Laa3/m1;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Laa3/m1;

.field public static final synthetic F:[Laa3/m1;

.field public static final synthetic G:Lt83/b;

.field public static final enum x:Laa3/m1;

.field public static final enum y:Laa3/m1;

.field public static final enum z:Laa3/m1;


# instance fields
.field public final w:Lba3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Laa3/m1;

    const-string v1, "FINAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Laa3/m1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laa3/m1;->x:Laa3/m1;

    new-instance v1, Laa3/m1;

    const-string v2, "OPEN"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Laa3/m1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Laa3/m1;->y:Laa3/m1;

    new-instance v2, Laa3/m1;

    const-string v3, "ABSTRACT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Laa3/m1;-><init>(Ljava/lang/String;II)V

    sput-object v2, Laa3/m1;->z:Laa3/m1;

    new-instance v3, Laa3/m1;

    const-string v4, "SEALED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Laa3/m1;-><init>(Ljava/lang/String;II)V

    sput-object v3, Laa3/m1;->E:Laa3/m1;

    filled-new-array {v0, v1, v2, v3}, [Laa3/m1;

    move-result-object v0

    sput-object v0, Laa3/m1;->F:[Laa3/m1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Laa3/m1;->G:Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance p1, Lba3/h;

    sget-object p2, Lsa3/d;->e:Lsa3/c;

    const-string v0, "MODALITY"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lba3/h;-><init>(Lq1/j0;I)V

    iput-object p1, p0, Laa3/m1;->w:Lba3/h;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Laa3/m1;
    .locals 1

    const-class v0, Laa3/m1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laa3/m1;

    return-object p0
.end method

.method public static values()[Laa3/m1;
    .locals 1

    sget-object v0, Laa3/m1;->F:[Laa3/m1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laa3/m1;

    return-object v0
.end method
