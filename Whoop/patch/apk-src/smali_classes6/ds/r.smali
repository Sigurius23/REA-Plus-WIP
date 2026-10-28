.class public final enum Lds/r;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final enum w:Lds/r;

.field public static final synthetic x:[Lds/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lds/r;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lds/r;->w:Lds/r;

    filled-new-array {v0}, [Lds/r;

    move-result-object v0

    sput-object v0, Lds/r;->x:[Lds/r;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lds/r;
    .locals 1

    const-class v0, Lds/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lds/r;

    return-object p0
.end method

.method public static values()[Lds/r;
    .locals 1

    sget-object v0, Lds/r;->x:[Lds/r;

    invoke-virtual {v0}, [Lds/r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lds/r;

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MoreExecutors.directExecutor()"

    return-object v0
.end method
