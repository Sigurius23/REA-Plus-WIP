.class public final Landroidx/glance/appwidget/protobuf/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Landroidx/glance/appwidget/protobuf/x;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/glance/appwidget/protobuf/x;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/glance/appwidget/protobuf/x;-><init>(I)V

    sput-object v0, Landroidx/glance/appwidget/protobuf/m0;->b:Landroidx/glance/appwidget/protobuf/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 4
    new-instance v0, Landroidx/glance/appwidget/protobuf/l0;

    .line 5
    sget-object v1, Landroidx/glance/appwidget/protobuf/y0;->c:Landroidx/glance/appwidget/protobuf/y0;

    .line 6
    :try_start_0
    const-string v1, "androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 7
    const-string v2, "getInstance"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/glance/appwidget/protobuf/q0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 8
    :catch_0
    sget-object v1, Landroidx/glance/appwidget/protobuf/m0;->b:Landroidx/glance/appwidget/protobuf/x;

    :goto_0
    const/4 v2, 0x2

    .line 9
    new-array v2, v2, [Landroidx/glance/appwidget/protobuf/q0;

    sget-object v3, Landroidx/glance/appwidget/protobuf/x;->b:Landroidx/glance/appwidget/protobuf/x;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v1, v2, v3

    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v2, v0, Landroidx/glance/appwidget/protobuf/l0;->a:[Landroidx/glance/appwidget/protobuf/q0;

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    sget-object v1, Landroidx/glance/appwidget/protobuf/f0;->a:Ljava/nio/charset/Charset;

    iput-object v0, p0, Landroidx/glance/appwidget/protobuf/m0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/glance/appwidget/protobuf/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Landroidx/glance/appwidget/protobuf/f0;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, Landroidx/glance/appwidget/protobuf/m0;->a:Ljava/lang/Object;

    .line 3
    iput-object p0, p1, Landroidx/glance/appwidget/protobuf/p;->d:Landroidx/glance/appwidget/protobuf/m0;

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;Landroidx/glance/appwidget/protobuf/b1;)V
    .locals 2

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/m0;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/glance/appwidget/protobuf/p;

    check-cast p2, Landroidx/glance/appwidget/protobuf/a;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Landroidx/glance/appwidget/protobuf/p;->x0(II)V

    iget-object v1, v0, Landroidx/glance/appwidget/protobuf/p;->d:Landroidx/glance/appwidget/protobuf/m0;

    invoke-interface {p3, p2, v1}, Landroidx/glance/appwidget/protobuf/b1;->i(Ljava/lang/Object;Landroidx/glance/appwidget/protobuf/m0;)V

    const/4 p2, 0x4

    invoke-virtual {v0, p1, p2}, Landroidx/glance/appwidget/protobuf/p;->x0(II)V

    return-void
.end method
