.class public final Llive/hms/video/database/EventsDatabase$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/database/EventsDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\r\u001a\u0004\u0008\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Llive/hms/video/database/EventsDatabase$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "dbName",
        "Llive/hms/video/database/EventsDatabase;",
        "getInstance",
        "(Landroid/content/Context;Ljava/lang/String;)Llive/hms/video/database/EventsDatabase;",
        "Lmb/b;",
        "MIGRATION_1_2",
        "Lmb/b;",
        "getMIGRATION_1_2",
        "()Lmb/b;",
        "MIGRATION_2_3",
        "getMIGRATION_2_3",
        "MIGRATION_3_4",
        "getMIGRATION_3_4",
        "TABLE_NAME",
        "Ljava/lang/String;",
        "INSTANCE",
        "Llive/hms/video/database/EventsDatabase;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/database/EventsDatabase$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getInstance$default(Llive/hms/video/database/EventsDatabase$Companion;Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/database/EventsDatabase;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, "analytics_table"

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/database/EventsDatabase$Companion;->getInstance(Landroid/content/Context;Ljava/lang/String;)Llive/hms/video/database/EventsDatabase;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getInstance(Landroid/content/Context;Ljava/lang/String;)Llive/hms/video/database/EventsDatabase;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dbName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Llive/hms/video/database/EventsDatabase;->access$getINSTANCE$cp()Llive/hms/video/database/EventsDatabase;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    const-class v0, Llive/hms/video/database/EventsDatabase;

    invoke-static {p1, v0, p2}, Ljc/x;->C(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/p0;

    move-result-object p1

    invoke-virtual {p0}, Llive/hms/video/database/EventsDatabase$Companion;->getMIGRATION_1_2()Lmb/b;

    move-result-object p2

    invoke-virtual {p0}, Llive/hms/video/database/EventsDatabase$Companion;->getMIGRATION_2_3()Lmb/b;

    move-result-object v0

    invoke-virtual {p0}, Llive/hms/video/database/EventsDatabase$Companion;->getMIGRATION_3_4()Lmb/b;

    move-result-object v1

    filled-new-array {p2, v0, v1}, [Lmb/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/room/p0;->a([Lmb/b;)V

    invoke-virtual {p1}, Landroidx/room/p0;->b()Landroidx/room/z0;

    move-result-object p1

    check-cast p1, Llive/hms/video/database/EventsDatabase;

    invoke-static {p1}, Llive/hms/video/database/EventsDatabase;->access$setINSTANCE$cp(Llive/hms/video/database/EventsDatabase;)V

    invoke-static {}, Llive/hms/video/database/EventsDatabase;->access$getINSTANCE$cp()Llive/hms/video/database/EventsDatabase;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final getMIGRATION_1_2()Lmb/b;
    .locals 1

    invoke-static {}, Llive/hms/video/database/EventsDatabase;->access$getMIGRATION_1_2$cp()Lmb/b;

    move-result-object v0

    return-object v0
.end method

.method public final getMIGRATION_2_3()Lmb/b;
    .locals 1

    invoke-static {}, Llive/hms/video/database/EventsDatabase;->access$getMIGRATION_2_3$cp()Lmb/b;

    move-result-object v0

    return-object v0
.end method

.method public final getMIGRATION_3_4()Lmb/b;
    .locals 1

    invoke-static {}, Llive/hms/video/database/EventsDatabase;->access$getMIGRATION_3_4$cp()Lmb/b;

    move-result-object v0

    return-object v0
.end method
