.class public final enum Lcom/iterable/iterableapi/w0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum w:Lcom/iterable/iterableapi/w0;

.field public static final synthetic x:[Lcom/iterable/iterableapi/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/iterable/iterableapi/w0;

    const-string v1, "SHOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/iterable/iterableapi/w0;->w:Lcom/iterable/iterableapi/w0;

    new-instance v1, Lcom/iterable/iterableapi/w0;

    const-string v2, "SKIP"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    filled-new-array {v0, v1}, [Lcom/iterable/iterableapi/w0;

    move-result-object v0

    sput-object v0, Lcom/iterable/iterableapi/w0;->x:[Lcom/iterable/iterableapi/w0;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/iterable/iterableapi/w0;
    .locals 1

    const-class v0, Lcom/iterable/iterableapi/w0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/iterable/iterableapi/w0;

    return-object p0
.end method

.method public static values()[Lcom/iterable/iterableapi/w0;
    .locals 1

    sget-object v0, Lcom/iterable/iterableapi/w0;->x:[Lcom/iterable/iterableapi/w0;

    invoke-virtual {v0}, [Lcom/iterable/iterableapi/w0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/iterable/iterableapi/w0;

    return-object v0
.end method
