.class public final enum Lr30/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lr30/j;

.field public static final enum F:Lr30/j;

.field public static final enum G:Lr30/j;

.field public static final enum H:Lr30/j;

.field public static final synthetic I:[Lr30/j;

.field public static final synthetic J:Lt83/b;

.field public static final y:Lng3/o;

.field public static final enum z:Lr30/j;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lr30/j;

    const-string v1, "Text"

    const/4 v2, 0x0

    const-string v3, "01"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lr30/j;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lr30/j;->z:Lr30/j;

    new-instance v1, Lr30/j;

    const-string v3, "SingleSelect"

    const-string v5, "02"

    invoke-direct {v1, v3, v4, v5, v4}, Lr30/j;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lr30/j;->E:Lr30/j;

    new-instance v3, Lr30/j;

    const/4 v5, 0x2

    const-string v6, "03"

    const-string v7, "MultiSelect"

    invoke-direct {v3, v7, v5, v6, v4}, Lr30/j;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v3, Lr30/j;->F:Lr30/j;

    new-instance v4, Lr30/j;

    const/4 v5, 0x3

    const-string v6, "04"

    const-string v7, "OutOfBand"

    invoke-direct {v4, v7, v5, v6, v2}, Lr30/j;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v4, Lr30/j;->G:Lr30/j;

    new-instance v5, Lr30/j;

    const/4 v6, 0x4

    const-string v7, "05"

    const-string v8, "Html"

    invoke-direct {v5, v8, v6, v7, v2}, Lr30/j;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v5, Lr30/j;->H:Lr30/j;

    filled-new-array {v0, v1, v3, v4, v5}, [Lr30/j;

    move-result-object v0

    sput-object v0, Lr30/j;->I:[Lr30/j;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lr30/j;->J:Lt83/b;

    new-instance v0, Lng3/o;

    const/16 v1, 0x13

    invoke-direct {v0, v1, v2}, Lng3/o;-><init>(IZ)V

    sput-object v0, Lr30/j;->y:Lng3/o;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lr30/j;->w:Ljava/lang/String;

    iput-boolean p4, p0, Lr30/j;->x:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr30/j;
    .locals 1

    const-class v0, Lr30/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr30/j;

    return-object p0
.end method

.method public static values()[Lr30/j;
    .locals 1

    sget-object v0, Lr30/j;->I:[Lr30/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr30/j;

    return-object v0
.end method
