.class public final Lr6/g;
.super Landroidx/glance/appwidget/protobuf/a0;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Lr6/g;

.field private static volatile PARSER:Landroidx/glance/appwidget/protobuf/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/glance/appwidget/protobuf/w0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr6/g;

    invoke-direct {v0}, Landroidx/glance/appwidget/protobuf/a0;-><init>()V

    sput-object v0, Lr6/g;->DEFAULT_INSTANCE:Lr6/g;

    const-class v1, Lr6/g;

    invoke-static {v1, v0}, Landroidx/glance/appwidget/protobuf/a0;->k(Ljava/lang/Class;Landroidx/glance/appwidget/protobuf/a0;)V

    return-void
.end method

.method public static n()Lr6/f;
    .locals 1

    sget-object v0, Lr6/g;->DEFAULT_INSTANCE:Lr6/g;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/a0;->c()Landroidx/glance/appwidget/protobuf/y;

    move-result-object v0

    check-cast v0, Lr6/f;

    return-object v0
.end method


# virtual methods
.method public final d(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lr6/g;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_1

    const-class v0, Lr6/g;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lr6/g;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/glance/appwidget/protobuf/z;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lr6/g;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1

    :pswitch_1
    sget-object p1, Lr6/g;->DEFAULT_INSTANCE:Lr6/g;

    return-object p1

    :pswitch_2
    new-instance p1, Lr6/f;

    sget-object v0, Lr6/g;->DEFAULT_INSTANCE:Lr6/g;

    invoke-direct {p1, v0}, Landroidx/glance/appwidget/protobuf/y;-><init>(Landroidx/glance/appwidget/protobuf/a0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lr6/g;

    invoke-direct {p1}, Landroidx/glance/appwidget/protobuf/a0;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "\u0000\u0000"

    sget-object v1, Lr6/g;->DEFAULT_INSTANCE:Lr6/g;

    new-instance v2, Landroidx/glance/appwidget/protobuf/a1;

    invoke-direct {v2, v1, p1, v0}, Landroidx/glance/appwidget/protobuf/a1;-><init>(Landroidx/glance/appwidget/protobuf/a;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :pswitch_5
    return-object v0

    :pswitch_6
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
