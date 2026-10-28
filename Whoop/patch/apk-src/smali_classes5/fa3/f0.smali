.class public enum Lfa3/f0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lfa3/e0;

.field public static final synthetic F:[Lfa3/f0;

.field public static final enum x:Lfa3/f0;

.field public static final enum y:Lfa3/f0;

.field public static final enum z:Lfa3/f0;


# instance fields
.field public final w:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lfa3/f0;

    const-string v1, "NULL"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lfa3/f0;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lfa3/f0;->x:Lfa3/f0;

    new-instance v1, Lfa3/f0;

    const/4 v4, -0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "INDEX"

    const/4 v6, 0x1

    invoke-direct {v1, v5, v6, v4}, Lfa3/f0;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v1, Lfa3/f0;->y:Lfa3/f0;

    new-instance v4, Lfa3/f0;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v7, "FALSE"

    const/4 v8, 0x2

    invoke-direct {v4, v7, v8, v5}, Lfa3/f0;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v4, Lfa3/f0;->z:Lfa3/f0;

    new-instance v5, Lfa3/e0;

    const-string v7, "MAP_GET_OR_DEFAULT"

    const/4 v9, 0x3

    invoke-direct {v5, v7, v9, v3}, Lfa3/f0;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v5, Lfa3/f0;->E:Lfa3/e0;

    const/4 v3, 0x4

    new-array v3, v3, [Lfa3/f0;

    aput-object v0, v3, v2

    aput-object v1, v3, v6

    aput-object v4, v3, v8

    aput-object v5, v3, v9

    sput-object v3, Lfa3/f0;->F:[Lfa3/f0;

    invoke-static {v3}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lfa3/f0;->w:Ljava/lang/Object;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lfa3/f0;
    .locals 1

    const-class v0, Lfa3/f0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfa3/f0;

    return-object p0
.end method

.method public static values()[Lfa3/f0;
    .locals 1

    sget-object v0, Lfa3/f0;->F:[Lfa3/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfa3/f0;

    return-object v0
.end method
