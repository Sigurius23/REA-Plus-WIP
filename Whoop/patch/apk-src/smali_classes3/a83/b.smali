.class public final enum La83/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ls73/c;


# static fields
.field public static final enum w:La83/b;

.field public static final synthetic x:[La83/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La83/b;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La83/b;->w:La83/b;

    filled-new-array {v0}, [La83/b;

    move-result-object v0

    sput-object v0, La83/b;->x:[La83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La83/b;
    .locals 1

    const-class v0, La83/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La83/b;

    return-object p0
.end method

.method public static values()[La83/b;
    .locals 1

    sget-object v0, La83/b;->x:[La83/b;

    invoke-virtual {v0}, [La83/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La83/b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final cancel()V
    .locals 0

    return-void
.end method

.method public final clear()V
    .locals 0

    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final poll()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final request(J)V
    .locals 0

    invoke-static {p1, p2}, La83/c;->b(J)Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptySubscription"

    return-object v0
.end method
