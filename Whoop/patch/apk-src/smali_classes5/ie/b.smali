.class public final enum Lie/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lbf/a;


# static fields
.field public static final enum x:Lie/b;

.field public static final synthetic y:[Lie/b;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lie/b;

    const/4 v1, 0x0

    const-string v2, "J"

    const-string v3, "S3_EXPRESS_BUCKET"

    invoke-direct {v0, v3, v1, v2}, Lie/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lie/b;->x:Lie/b;

    new-instance v1, Lie/b;

    const/4 v2, 0x1

    const-string v3, "d"

    const-string v4, "DDB_MAPPER"

    invoke-direct {v1, v4, v2, v3}, Lie/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array {v0, v1}, [Lie/b;

    move-result-object v0

    sput-object v0, Lie/b;->y:[Lie/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lie/b;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lie/b;
    .locals 1

    const-class v0, Lie/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lie/b;

    return-object p0
.end method

.method public static values()[Lie/b;
    .locals 1

    sget-object v0, Lie/b;->y:[Lie/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lie/b;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lie/b;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lie/b;->w:Ljava/lang/String;

    return-object v0
.end method
