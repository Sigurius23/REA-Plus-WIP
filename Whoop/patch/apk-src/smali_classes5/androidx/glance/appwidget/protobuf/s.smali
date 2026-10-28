.class public final Landroidx/glance/appwidget/protobuf/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Landroidx/glance/appwidget/protobuf/s;

.field public static final b:Landroidx/glance/appwidget/protobuf/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/glance/appwidget/protobuf/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    sput-object v0, Landroidx/glance/appwidget/protobuf/s;->b:Landroidx/glance/appwidget/protobuf/s;

    return-void
.end method

.method public static a()Landroidx/glance/appwidget/protobuf/s;
    .locals 4

    sget-object v0, Landroidx/glance/appwidget/protobuf/y0;->c:Landroidx/glance/appwidget/protobuf/y0;

    sget-object v0, Landroidx/glance/appwidget/protobuf/s;->a:Landroidx/glance/appwidget/protobuf/s;

    if-nez v0, :cond_3

    const-class v1, Landroidx/glance/appwidget/protobuf/s;

    monitor-enter v1

    :try_start_0
    sget-object v0, Landroidx/glance/appwidget/protobuf/s;->a:Landroidx/glance/appwidget/protobuf/s;

    if-nez v0, :cond_2

    const-string v0, "getEmptyRegistry"

    sget-object v2, Landroidx/glance/appwidget/protobuf/r;->a:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/glance/appwidget/protobuf/s;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v3, v0

    :catch_0
    :goto_0
    if-eqz v3, :cond_1

    move-object v0, v3

    goto :goto_1

    :cond_1
    :try_start_2
    sget-object v0, Landroidx/glance/appwidget/protobuf/s;->b:Landroidx/glance/appwidget/protobuf/s;

    :goto_1
    sput-object v0, Landroidx/glance/appwidget/protobuf/s;->a:Landroidx/glance/appwidget/protobuf/s;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit v1

    return-object v0

    :goto_3
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_3
    return-object v0
.end method
