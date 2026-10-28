.class public final Lr6/k;
.super Landroidx/glance/appwidget/protobuf/a0;
.source "SourceFile"


# static fields
.field public static final ACTION_PARAMETERS_FIELD_NUMBER:I = 0x3

.field public static final APP_WIDGET_ID_FIELD_NUMBER:I = 0x2

.field public static final CLASS_NAME_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lr6/k;

.field private static volatile PARSER:Landroidx/glance/appwidget/protobuf/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/glance/appwidget/protobuf/w0;"
        }
    .end annotation
.end field


# instance fields
.field private actionParameters_:Landroidx/glance/appwidget/protobuf/i;

.field private appWidgetId_:I

.field private className_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr6/k;

    invoke-direct {v0}, Lr6/k;-><init>()V

    sput-object v0, Lr6/k;->DEFAULT_INSTANCE:Lr6/k;

    const-class v1, Lr6/k;

    invoke-static {v1, v0}, Landroidx/glance/appwidget/protobuf/a0;->k(Ljava/lang/Class;Landroidx/glance/appwidget/protobuf/a0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/glance/appwidget/protobuf/a0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lr6/k;->className_:Ljava/lang/String;

    sget-object v0, Landroidx/glance/appwidget/protobuf/i;->x:Landroidx/glance/appwidget/protobuf/h;

    iput-object v0, p0, Lr6/k;->actionParameters_:Landroidx/glance/appwidget/protobuf/i;

    return-void
.end method

.method public static n(Lr6/k;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/k;->className_:Ljava/lang/String;

    return-void
.end method

.method public static o(Lr6/k;I)V
    .locals 0

    iput p1, p0, Lr6/k;->appWidgetId_:I

    return-void
.end method

.method public static p(Lr6/k;Landroidx/glance/appwidget/protobuf/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr6/k;->actionParameters_:Landroidx/glance/appwidget/protobuf/i;

    return-void
.end method

.method public static s()Lr6/k;
    .locals 1

    sget-object v0, Lr6/k;->DEFAULT_INSTANCE:Lr6/k;

    return-object v0
.end method

.method public static t()Lr6/j;
    .locals 1

    sget-object v0, Lr6/k;->DEFAULT_INSTANCE:Lr6/k;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/a0;->c()Landroidx/glance/appwidget/protobuf/y;

    move-result-object v0

    check-cast v0, Lr6/j;

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
    sget-object p1, Lr6/k;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_1

    const-class v0, Lr6/k;

    monitor-enter v0

    :try_start_0
    sget-object p1, Lr6/k;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/glance/appwidget/protobuf/z;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lr6/k;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

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
    sget-object p1, Lr6/k;->DEFAULT_INSTANCE:Lr6/k;

    return-object p1

    :pswitch_2
    new-instance p1, Lr6/j;

    sget-object v0, Lr6/k;->DEFAULT_INSTANCE:Lr6/k;

    invoke-direct {p1, v0}, Landroidx/glance/appwidget/protobuf/y;-><init>(Landroidx/glance/appwidget/protobuf/a0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lr6/k;

    invoke-direct {p1}, Lr6/k;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "className_"

    const-string v0, "appWidgetId_"

    const-string v1, "actionParameters_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\n"

    sget-object v1, Lr6/k;->DEFAULT_INSTANCE:Lr6/k;

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

.method public final q()Landroidx/glance/appwidget/protobuf/i;
    .locals 1

    iget-object v0, p0, Lr6/k;->actionParameters_:Landroidx/glance/appwidget/protobuf/i;

    return-object v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr6/k;->className_:Ljava/lang/String;

    return-object v0
.end method
