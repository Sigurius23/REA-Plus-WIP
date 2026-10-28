.class public final enum Lcom/squareup/wire/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lcom/squareup/wire/x;

.field public static final enum y:Lcom/squareup/wire/x;

.field public static final synthetic z:[Lcom/squareup/wire/x;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/squareup/wire/x;

    const/4 v1, 0x0

    const-string v2, "proto2"

    const-string v3, "PROTO_2"

    invoke-direct {v0, v3, v1, v2}, Lcom/squareup/wire/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/squareup/wire/x;->x:Lcom/squareup/wire/x;

    new-instance v1, Lcom/squareup/wire/x;

    const/4 v2, 0x1

    const-string v3, "proto3"

    const-string v4, "PROTO_3"

    invoke-direct {v1, v4, v2, v3}, Lcom/squareup/wire/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    filled-new-array {v0, v1}, [Lcom/squareup/wire/x;

    move-result-object v0

    sput-object v0, Lcom/squareup/wire/x;->z:[Lcom/squareup/wire/x;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/squareup/wire/x;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/wire/x;
    .locals 1

    const-class v0, Lcom/squareup/wire/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/squareup/wire/x;

    return-object p0
.end method

.method public static values()[Lcom/squareup/wire/x;
    .locals 1

    sget-object v0, Lcom/squareup/wire/x;->z:[Lcom/squareup/wire/x;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/wire/x;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/squareup/wire/x;->w:Ljava/lang/String;

    return-object v0
.end method
