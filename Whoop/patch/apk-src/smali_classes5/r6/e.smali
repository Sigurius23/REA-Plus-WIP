.class public final Lr6/e;
.super Landroidx/glance/appwidget/protobuf/a0;
.source "SourceFile"


# static fields
.field public static final ACTIONKEY_FIELD_NUMBER:I = 0x3

.field public static final APP_WIDGET_ID_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lr6/e;

.field private static volatile PARSER:Landroidx/glance/appwidget/protobuf/w0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/glance/appwidget/protobuf/w0;"
        }
    .end annotation
.end field

.field public static final RECEIVER_FIELD_NUMBER:I = 0x1


# instance fields
.field private actionKey_:Ljava/lang/String;

.field private appWidgetId_:I

.field private receiver_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr6/e;

    invoke-direct {v0}, Lr6/e;-><init>()V

    sput-object v0, Lr6/e;->DEFAULT_INSTANCE:Lr6/e;

    const-class v1, Lr6/e;

    invoke-static {v1, v0}, Landroidx/glance/appwidget/protobuf/a0;->k(Ljava/lang/Class;Landroidx/glance/appwidget/protobuf/a0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/glance/appwidget/protobuf/a0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lr6/e;->receiver_:Ljava/lang/String;

    iput-object v0, p0, Lr6/e;->actionKey_:Ljava/lang/String;

    return-void
.end method

.method public static n(Lr6/e;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/e;->receiver_:Ljava/lang/String;

    return-void
.end method

.method public static o(Lr6/e;I)V
    .locals 0

    iput p1, p0, Lr6/e;->appWidgetId_:I

    return-void
.end method

.method public static p(Lr6/e;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/e;->actionKey_:Ljava/lang/String;

    return-void
.end method

.method public static s()Lr6/e;
    .locals 1

    sget-object v0, Lr6/e;->DEFAULT_INSTANCE:Lr6/e;

    return-object v0
.end method

.method public static u()Lr6/d;
    .locals 1

    sget-object v0, Lr6/e;->DEFAULT_INSTANCE:Lr6/e;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/a0;->c()Landroidx/glance/appwidget/protobuf/y;

    move-result-object v0

    check-cast v0, Lr6/d;

    return-object v0
.end method


# virtual methods
.method public final d(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lr6/e;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_1

    const-class v0, Lr6/e;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lr6/e;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/glance/appwidget/protobuf/z;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lr6/e;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

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
    sget-object p1, Lr6/e;->DEFAULT_INSTANCE:Lr6/e;

    return-object p1

    :pswitch_2
    new-instance p1, Lr6/d;

    sget-object v0, Lr6/e;->DEFAULT_INSTANCE:Lr6/e;

    invoke-direct {p1, v0}, Landroidx/glance/appwidget/protobuf/y;-><init>(Landroidx/glance/appwidget/protobuf/a0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lr6/e;

    invoke-direct {p1}, Lr6/e;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "receiver_"

    const-string v0, "appWidgetId_"

    const-string v1, "actionKey_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0208"

    sget-object v1, Lr6/e;->DEFAULT_INSTANCE:Lr6/e;

    new-instance v2, Landroidx/glance/appwidget/protobuf/a1;

    invoke-direct {v2, v1, v0, p1}, Landroidx/glance/appwidget/protobuf/a1;-><init>(Landroidx/glance/appwidget/protobuf/a;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :pswitch_5
    const/4 p1, 0x0

    return-object p1

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

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr6/e;->actionKey_:Ljava/lang/String;

    return-object v0
.end method

.method public final r()I
    .locals 1

    iget v0, p0, Lr6/e;->appWidgetId_:I

    return v0
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr6/e;->receiver_:Ljava/lang/String;

    return-object v0
.end method
