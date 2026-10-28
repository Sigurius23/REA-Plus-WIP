.class public final enum Lpp/r;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final enum w:Lpp/r;

.field public static final synthetic x:[Lpp/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpp/r;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpp/r;->w:Lpp/r;

    filled-new-array {v0}, [Lpp/r;

    move-result-object v0

    sput-object v0, Lpp/r;->x:[Lpp/r;

    return-void
.end method

.method public static values()[Lpp/r;
    .locals 1

    sget-object v0, Lpp/r;->x:[Lpp/r;

    invoke-virtual {v0}, [Lpp/r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpp/r;

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
