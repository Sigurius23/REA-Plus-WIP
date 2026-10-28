.class public final Lio/sentry/internal/debugmeta/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/internal/debugmeta/a;
.implements Lf93/c;
.implements Lt9/g;
.implements Ltb/b;
.implements Le53/c;
.implements Lgl/l;
.implements Lim/b;
.implements Lig3/a;
.implements Lp9/m;
.implements Lo23/a;


# static fields
.field public static E:I

.field public static z:I


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-array v0, p1, [B

    iput-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    .line 77
    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-direct {v1, v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m;-><init>([BI)V

    .line 78
    iput-object v1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 4

    iput p1, p0, Lio/sentry/internal/debugmeta/c;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-string p1, "Video:SocketState"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 24
    new-instance p1, La3/z0;

    const/4 p2, 0x6

    sget-object v0, Lg53/i;->a:Lg53/i;

    invoke-direct {p1, p2, v0, p0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void

    .line 25
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x4

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/16 p2, 0x40

    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 v0, 0x80

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, p2, v0}, [Ljava/lang/Integer;

    move-result-object v1

    .line 29
    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    .line 30
    iput-object v1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 31
    new-instance v1, Ll83/k;

    const-string v2, "android.permission.CAMERA"

    invoke-direct {v1, p2, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    new-instance p2, Ll83/k;

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-direct {p2, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x2

    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 34
    new-instance v2, Ll83/k;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    filled-new-array {v1, p2, v2, v0}, [Ll83/k;

    move-result-object p1

    .line 37
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void

    .line 38
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 40
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void

    .line 41
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    return-void

    .line 43
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 45
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_3
        0x17 -> :sswitch_2
        0x18 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IC)V
    .locals 0

    .line 1
    iput p1, p0, Lio/sentry/internal/debugmeta/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lio/sentry/internal/debugmeta/c;->w:I

    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x5

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 66
    new-instance v0, Lgm/j;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lgm/j;-><init>(Landroid/content/Context;B)V

    iput-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-static {p1}, Lh5/b1;->f(Landroid/view/WindowInsetsAnimation$Bounds;)Lv4/b;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 69
    invoke-static {p1}, Lh5/b1;->e(Landroid/view/WindowInsetsAnimation$Bounds;)Lv4/b;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/room/n0;Ltb/b;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const-string v0, "actual"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 3
    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbi/p;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    const-string v0, "className"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lc93/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 10
    new-instance p1, La53/b;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, La53/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/h;Lf1/p1;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    .line 74
    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le53/c;Le53/d;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    const-string v0, "tokenProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfg3/b;I)V
    .locals 2

    const/16 v0, 0x14

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    .line 51
    new-instance p1, Lab/i0;

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 52
    invoke-direct {p1, v0, v1}, Lab/i0;-><init>(IZ)V

    .line 53
    iput p2, p1, Lab/i0;->x:I

    .line 54
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfk/a;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 13
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    .line 14
    :try_start_0
    const-class v0, La3/n0;

    .line 15
    const-string v1, "layoutDelegate"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 17
    :catch_0
    const-string v0, "Could not find LayoutNode.layoutDelegate field"

    invoke-interface {p1, v0}, Lfk/a;->info(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public constructor <init>(Lio/sentry/v0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 18
    const-class v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 21
    invoke-static {v0}, Lds/q;->q(Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 48
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lwm/s;

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx8/s;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 63
    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([B[B)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, [B

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    .line 57
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, [B

    iput-object p2, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void
.end method

.method public static G(Landroid/view/WindowInsetsAnimation$Bounds;)Lio/sentry/internal/debugmeta/c;
    .locals 1

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v0, p0}, Lio/sentry/internal/debugmeta/c;-><init>(Landroid/view/WindowInsetsAnimation$Bounds;)V

    return-object v0
.end method

.method public static y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lstream/video/sfu/models/PublishOption;->getId()I

    move-result v0

    invoke-virtual {p0}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A(Lb2/y;Ls83/c;)V
    .locals 4

    instance-of v0, p2, Lf53/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf53/l;

    iget v1, v0, Lf53/l;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf53/l;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf53/l;

    invoke-direct {v0, p0, p2}, Lf53/l;-><init>(Lio/sentry/internal/debugmeta/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lf53/l;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lf53/l;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object p2

    iget-object p2, p2, Ly43/b;->e:Lec3/h2;

    new-instance v1, Lf53/m;

    const/4 v3, 0x0

    invoke-direct {v1, v3, p1}, Lf53/m;-><init>(ILc93/m;)V

    iput v2, v0, Lf53/l;->y:I

    invoke-virtual {p2, v1, v0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-void
.end method

.method public B(Ls83/i;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onNetworkNotAvailable] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p0}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object v0

    sget-object v1, Lg53/r;->a:Lg53/r;

    invoke-virtual {v0, v1, p1}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public C(Lrb3/g;ZLs83/c;)Ljava/lang/Object;
    .locals 8

    sget v0, Lio/sentry/internal/debugmeta/c;->z:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    sput v0, Lio/sentry/internal/debugmeta/c;->z:I

    invoke-virtual {p0}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->x:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lrb3/g;->b()Lio/getstream/video/android/model/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-boolean v5, p1, Lrb3/g;->a:Z

    const-string v6, "[onReconnect] user.id: \'"

    const-string v7, "\', isReconnection: "

    invoke-static {v6, v2, v7, v5}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v0, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p0}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object v0

    new-instance v2, Lg53/n;

    if-ne p2, v1, :cond_1

    sget-object p2, Lg53/b;->y:Lg53/b;

    goto :goto_0

    :cond_1
    if-nez p2, :cond_3

    sget-object p2, Lg53/b;->x:Lg53/b;

    :goto_0
    invoke-direct {v2, p1, p2}, Lg53/n;-><init>(Lrb3/g;Lg53/b;)V

    invoke-virtual {v0, v2, p3}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public D(Lc5/g;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lc5/l;

    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Lty/c;

    iget v2, p1, Lc5/g;->b:I

    if-nez v2, :cond_0

    iget-object p1, p1, Lc5/g;->a:Landroid/graphics/Typeface;

    new-instance v2, Lds/s;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v1, p1}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lc5/l;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    new-instance p1, Lc5/a;

    const/4 v3, 0x0

    invoke-direct {p1, v1, v2, v3}, Lc5/a;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v0, p1}, Lc5/l;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public E(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    new-instance v2, Ld30/o;

    invoke-direct {v2, p1, v1}, Ld30/o;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v1, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    return-void
.end method

.method public F()Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 2

    invoke-static {}, Lh5/z0;->c()V

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lv4/b;

    invoke-virtual {v0}, Lv4/b;->d()Landroid/graphics/Insets;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v1, Lv4/b;

    invoke-virtual {v1}, Lv4/b;->d()Landroid/graphics/Insets;

    move-result-object v1

    invoke-static {v0, v1}, Lh5/z0;->a(Landroid/graphics/Insets;Landroid/graphics/Insets;)Landroid/view/WindowInsetsAnimation$Bounds;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Throwable;)Lig3/a;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lab/i0;

    iput-object p1, v0, Lab/i0;->E:Ljava/lang/Object;

    return-object p0
.end method

.method public b()V
    .locals 8

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lab/i0;

    iget-object v1, v0, Lab/i0;->F:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "io.sentry.internal.debugmeta.c"

    iput-object v1, v0, Lab/i0;->F:Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v1, Lfg3/b;

    iget-object v2, v0, Lab/i0;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Throwable;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    move v5, v4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    new-array v5, v5, [Ljava/lang/Object;

    if-eqz v2, :cond_2

    aput-object v2, v5, v4

    :cond_2
    iget-object v2, v0, Lab/i0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lgg3/b;

    iget-object v7, v6, Lgg3/b;->a:Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x3d

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v6, v6, Lgg3/b;->b:Ljava/lang/Object;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v6, 0x20

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    :goto_2
    const/4 v4, 0x0

    :cond_5
    iget-object v2, v0, Lab/i0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-eqz v4, :cond_6

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_6
    iget v0, v0, Lab/i0;->x:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    if-eqz v0, :cond_b

    if-eq v0, v3, :cond_a

    const/4 v3, 0x2

    if-eq v0, v3, :cond_9

    const/4 v3, 0x3

    if-eq v0, v3, :cond_8

    const/4 v3, 0x4

    if-eq v0, v3, :cond_7

    return-void

    :cond_7
    invoke-interface {v1, v2, v5}, Lfg3/b;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_8
    invoke-interface {v1, v2, v5}, Lfg3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_9
    invoke-interface {v1, v2, v5}, Lfg3/b;->u(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_a
    invoke-interface {v1, v2, v5}, Lfg3/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_b
    invoke-interface {v1, v2, v5}, Lfg3/b;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c(Landroid/net/Uri;Lko/m;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Lf9/e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-virtual {v1, v2, v3}, Lf9/e;->c(Landroid/net/Uri;Lko/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf9/c;

    iget-object v2, v0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_8

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3, v2}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    new-instance v2, Lu8/k0;

    invoke-direct {v2}, Lu8/k0;-><init>()V

    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    :goto_0
    iget-object v7, v1, Lf9/c;->m:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v6, v7, :cond_6

    invoke-virtual {v3}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu8/k0;

    iget v7, v7, Lu8/k0;->w:I

    if-eq v7, v6, :cond_1

    invoke-virtual {v1, v6}, Lf9/c;->b(I)J

    move-result-wide v10

    cmp-long v7, v10, v8

    if-eqz v7, :cond_4

    add-long/2addr v4, v10

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v1, v6}, Lf9/c;->a(I)Lf9/h;

    move-result-object v7

    iget-object v10, v7, Lf9/h;->c:Ljava/util/List;

    invoke-virtual {v3}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu8/k0;

    iget v11, v8, Lu8/k0;->w:I

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    iget v12, v8, Lu8/k0;->x:I

    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf9/a;

    iget-object v14, v13, Lf9/a;->c:Ljava/util/List;

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    iget v8, v8, Lu8/k0;->y:I

    invoke-interface {v14, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf9/m;

    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu8/k0;

    iget v0, v8, Lu8/k0;->w:I

    if-ne v0, v11, :cond_2

    iget v0, v8, Lu8/k0;->x:I

    if-eq v0, v12, :cond_3

    :cond_2
    move-object/from16 v19, v15

    goto :goto_3

    :cond_3
    move-object/from16 v0, p0

    goto :goto_2

    :goto_3
    new-instance v15, Lf9/a;

    move-wide/from16 p1, v4

    iget-wide v4, v13, Lf9/a;->a:J

    iget v0, v13, Lf9/a;->b:I

    iget-object v12, v13, Lf9/a;->d:Ljava/util/List;

    iget-object v14, v13, Lf9/a;->e:Ljava/util/List;

    iget-object v13, v13, Lf9/a;->f:Ljava/util/List;

    move/from16 v18, v0

    move-wide/from16 v16, v4

    move-object/from16 v20, v12

    move-object/from16 v22, v13

    move-object/from16 v21, v14

    invoke-direct/range {v15 .. v22}, Lf9/a;-><init>(JILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, v8, Lu8/k0;->w:I

    if-eq v0, v11, :cond_5

    invoke-virtual {v3, v8}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    new-instance v12, Lf9/h;

    iget-object v13, v7, Lf9/h;->a:Ljava/lang/String;

    iget-wide v4, v7, Lf9/h;->b:J

    sub-long v14, v4, p1

    iget-object v0, v7, Lf9/h;->d:Ljava/util/List;

    move-object/from16 v17, v0

    move-object/from16 v16, v9

    invoke-direct/range {v12 .. v17}, Lf9/h;-><init>(Ljava/lang/String;JLjava/util/ArrayList;Ljava/util/List;)V

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide/from16 v4, p1

    :cond_4
    :goto_4
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_5
    move-object/from16 v0, p0

    move-wide/from16 v4, p1

    goto :goto_1

    :cond_6
    move-wide/from16 p1, v4

    iget-wide v3, v1, Lf9/c;->b:J

    cmp-long v0, v3, v8

    if-eqz v0, :cond_7

    sub-long v8, v3, p1

    :cond_7
    move-wide v7, v8

    new-instance v4, Lf9/c;

    iget-wide v5, v1, Lf9/c;->a:J

    iget-wide v9, v1, Lf9/c;->c:J

    iget-boolean v11, v1, Lf9/c;->d:Z

    iget-wide v12, v1, Lf9/c;->e:J

    iget-wide v14, v1, Lf9/c;->f:J

    move-object/from16 v24, v2

    iget-wide v2, v1, Lf9/c;->g:J

    move-wide/from16 v16, v2

    iget-wide v2, v1, Lf9/c;->h:J

    iget-object v0, v1, Lf9/c;->l:Lf9/i;

    move-object/from16 v20, v0

    iget-object v0, v1, Lf9/c;->i:Lf9/u;

    move-object/from16 v21, v0

    iget-object v0, v1, Lf9/c;->j:Lf9/t;

    iget-object v1, v1, Lf9/c;->k:Landroid/net/Uri;

    move-object/from16 v22, v0

    move-object/from16 v23, v1

    move-wide/from16 v18, v2

    invoke-direct/range {v4 .. v24}, Lf9/c;-><init>(JJJZJJJJLf9/i;Lf9/u;Lf9/t;Landroid/net/Uri;Ljava/util/ArrayList;)V

    return-object v4

    :cond_8
    :goto_5
    return-object v1
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lx8/n;

    sget-object v1, Lx8/t;->c:[B

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v2, v1

    invoke-virtual {v0, v2, v1}, Lx8/n;->D(I[B)V

    return-void
.end method

.method public e(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Le53/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le53/a;

    iget v1, v0, Le53/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le53/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Le53/a;

    invoke-direct {v0, p0, p1}, Le53/a;-><init>(Lio/sentry/internal/debugmeta/c;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Le53/a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le53/a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Le53/a;->w:Lio/sentry/internal/debugmeta/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast p1, Le53/c;

    iput-object p0, v0, Le53/a;->w:Lio/sentry/internal/debugmeta/c;

    iput v3, v0, Le53/a;->z:I

    invoke-interface {p1, v0}, Le53/c;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Le53/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "token"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Le53/d;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public f(Ljava/lang/Object;Ljava/lang/String;)Lig3/a;
    .locals 3

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lab/i0;

    iget-object v1, v0, Lab/i0;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, v0, Lab/i0;->z:Ljava/lang/Object;

    :cond_0
    iget-object v0, v0, Lab/i0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Lgg3/b;

    invoke-direct {v1, p2, p1}, Lgg3/b;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public g(Lpg/c;)Lig3/a;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lab/i0;

    invoke-virtual {p1}, Lpg/c;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, v0, Lab/i0;->y:Ljava/lang/Object;

    return-object p0
.end method

.method public get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lf93/a;

    iget-object v0, v0, Lf93/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v1, Lhm/d;

    invoke-virtual {v1}, Lhm/d;->get()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Lhm/e;

    check-cast v1, Lgm/r;

    invoke-direct {v2, v0, v1}, Lhm/e;-><init>(Landroid/content/Context;Lgm/r;)V

    return-object v2
.end method

.method public getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 0

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast p1, La53/b;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public h(Ljava/lang/String;)Ltb/a;
    .locals 8

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/room/n0;

    const-string v1, ":memory:"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v0, Landroidx/room/n0;->c:Landroidx/room/g;

    iget-object v2, v2, Landroidx/room/g;->a:Landroid/content/Context;

    invoke-virtual {v2, p1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_0
    new-instance v2, Lkb/b;

    iget-boolean v3, v0, Landroidx/room/n0;->a:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_1

    iget-boolean v3, v0, Landroidx/room/n0;->b:Z

    if-nez v3, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    move v1, v5

    :goto_0
    invoke-direct {v2, p1, v1}, Lkb/b;-><init>(Ljava/lang/String;Z)V

    iget-object v1, v2, Lkb/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    iget-object v2, v2, Lkb/b;->b:Lqg3/d;

    if-eqz v2, :cond_2

    :try_start_0
    invoke-virtual {v2}, Lqg3/d;->x()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move v4, v5

    goto/16 :goto_6

    :cond_2
    :goto_1
    const/4 v3, 0x0

    :try_start_1
    iget-boolean v6, v0, Landroidx/room/n0;->b:Z

    if-nez v6, :cond_7

    iget-object v6, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v6, Ltb/b;

    invoke-interface {v6, p1}, Ltb/b;->h(Ljava/lang/String;)Ltb/a;

    move-result-object v6

    iget-boolean v7, v0, Landroidx/room/n0;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-nez v7, :cond_3

    :try_start_2
    iput-boolean v4, v0, Landroidx/room/n0;->b:Z

    invoke-static {v0, v6}, Landroidx/room/n0;->a(Landroidx/room/n0;Ltb/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iput-boolean v5, v0, Landroidx/room/n0;->b:Z

    goto :goto_3

    :catchall_1
    move-exception v6

    iput-boolean v5, v0, Landroidx/room/n0;->b:Z

    throw v6

    :cond_3
    invoke-static {v6}, Landroidx/room/n0;->b(Ltb/a;)V

    iget-object v5, v0, Landroidx/room/n0;->c:Landroidx/room/g;

    iget-object v5, v5, Landroidx/room/g;->g:Landroidx/room/s0;

    sget-object v7, Landroidx/room/s0;->y:Landroidx/room/s0;

    if-ne v5, v7, :cond_4

    const-string v5, "PRAGMA synchronous = NORMAL"

    invoke-static {v5, v6}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    goto :goto_2

    :cond_4
    const-string v5, "PRAGMA synchronous = FULL"

    invoke-static {v5, v6}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :goto_2
    iget-object v0, v0, Landroidx/room/n0;->d:Landroidx/room/g1;

    invoke-virtual {v0, v6}, Landroidx/room/g1;->onOpen(Ltb/a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_3
    if-eqz v2, :cond_6

    :try_start_4
    iget-object v0, v2, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/nio/channels/FileChannel;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    :try_start_5
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    iput-object v3, v2, Lqg3/d;->y:Ljava/lang/Object;

    goto :goto_4

    :catchall_2
    move-exception v0

    iput-object v3, v2, Lqg3/d;->y:Ljava/lang/Object;

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :cond_6
    :goto_4
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v6

    :cond_7
    :try_start_7
    const-string v0, "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"

    new-instance v5, Ljava/lang/IllegalStateException;

    invoke-direct {v5, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v0

    if-eqz v2, :cond_9

    :try_start_8
    iget-object v5, v2, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v5, Ljava/nio/channels/FileChannel;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    if-nez v5, :cond_8

    goto :goto_5

    :cond_8
    :try_start_9
    invoke-virtual {v5}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    iput-object v3, v2, Lqg3/d;->y:Ljava/lang/Object;

    goto :goto_5

    :catchall_4
    move-exception v0

    iput-object v3, v2, Lqg3/d;->y:Ljava/lang/Object;

    throw v0

    :cond_9
    :goto_5
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    move-exception v0

    :goto_6
    if-eqz v4, :cond_a

    :try_start_b
    throw v0

    :catchall_6
    move-exception p1

    goto :goto_7

    :cond_a
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to open database \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'. Was a proper path / name used in Room\'s database builder?"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :goto_7
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method

.method public i(Lal/b;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Ltl/d;

    iget-object v0, v0, Ltl/d;->x:Ljava/io/IOException;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, Lal/b;->h(Landroid/graphics/Bitmap;)V

    :cond_0
    throw v0

    :cond_1
    return-void
.end method

.method public j(Lt9/o;J)Lt9/f;
    .locals 16

    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lt9/o;->getPosition()J

    move-result-wide v5

    invoke-interface/range {p1 .. p1}, Lt9/o;->getLength()J

    move-result-wide v1

    sub-long/2addr v1, v5

    const-wide/16 v3, 0x4e20

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, v0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v2, Lx8/n;

    invoke-virtual {v2, v1}, Lx8/n;->C(I)V

    iget-object v3, v2, Lx8/n;->a:[B

    const/4 v4, 0x0

    move-object/from16 v7, p1

    invoke-interface {v7, v3, v4, v1}, Lt9/o;->p([BII)V

    const/4 v1, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move v7, v1

    move-wide v10, v3

    :goto_0
    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v8

    const/4 v9, 0x4

    if-lt v8, v9, :cond_e

    iget-object v8, v2, Lx8/n;->a:[B

    iget v12, v2, Lx8/n;->b:I

    invoke-static {v12, v8}, Lab/a0;->f(I[B)I

    move-result v8

    const/4 v12, 0x1

    const/16 v13, 0x1ba

    if-eq v8, v13, :cond_0

    invoke-virtual {v2, v12}, Lx8/n;->G(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v9}, Lx8/n;->G(I)V

    invoke-static {v2}, Lab/b0;->c(Lx8/n;)J

    move-result-wide v14

    cmp-long v1, v14, v3

    if-eqz v1, :cond_4

    iget-object v1, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Lx8/s;

    invoke-virtual {v1, v14, v15}, Lx8/s;->b(J)J

    move-result-wide v14

    cmp-long v1, v14, p2

    if-lez v1, :cond_2

    cmp-long v1, v10, v3

    if-nez v1, :cond_1

    new-instance v1, Lt9/f;

    const/4 v2, -0x1

    move-wide v3, v14

    invoke-direct/range {v1 .. v6}, Lt9/f;-><init>(IJJ)V

    return-object v1

    :cond_1
    int-to-long v1, v7

    add-long v11, v5, v1

    new-instance v7, Lt9/f;

    const/4 v8, 0x0

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v7 .. v12}, Lt9/f;-><init>(IJJ)V

    return-object v7

    :cond_2
    move-wide v7, v14

    const-wide/32 v10, 0x186a0

    add-long v14, v7, v10

    cmp-long v1, v14, p2

    if-lez v1, :cond_3

    iget v1, v2, Lx8/n;->b:I

    int-to-long v1, v1

    add-long v11, v5, v1

    new-instance v7, Lt9/f;

    const/4 v8, 0x0

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v7 .. v12}, Lt9/f;-><init>(IJJ)V

    return-object v7

    :cond_3
    iget v1, v2, Lx8/n;->b:I

    move-wide v10, v7

    move v7, v1

    :cond_4
    iget v1, v2, Lx8/n;->c:I

    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v8

    const/16 v14, 0xa

    if-ge v8, v14, :cond_5

    invoke-virtual {v2, v1}, Lx8/n;->F(I)V

    goto/16 :goto_2

    :cond_5
    const/16 v8, 0x9

    invoke-virtual {v2, v8}, Lx8/n;->G(I)V

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v8

    and-int/lit8 v8, v8, 0x7

    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v14

    if-ge v14, v8, :cond_6

    invoke-virtual {v2, v1}, Lx8/n;->F(I)V

    goto :goto_2

    :cond_6
    invoke-virtual {v2, v8}, Lx8/n;->G(I)V

    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v8

    if-ge v8, v9, :cond_7

    invoke-virtual {v2, v1}, Lx8/n;->F(I)V

    goto :goto_2

    :cond_7
    iget-object v8, v2, Lx8/n;->a:[B

    iget v14, v2, Lx8/n;->b:I

    invoke-static {v14, v8}, Lab/a0;->f(I[B)I

    move-result v8

    const/16 v14, 0x1bb

    if-ne v8, v14, :cond_9

    invoke-virtual {v2, v9}, Lx8/n;->G(I)V

    invoke-virtual {v2}, Lx8/n;->z()I

    move-result v8

    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v14

    if-ge v14, v8, :cond_8

    invoke-virtual {v2, v1}, Lx8/n;->F(I)V

    goto :goto_2

    :cond_8
    invoke-virtual {v2, v8}, Lx8/n;->G(I)V

    :cond_9
    :goto_1
    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v8

    if-lt v8, v9, :cond_d

    iget-object v8, v2, Lx8/n;->a:[B

    iget v14, v2, Lx8/n;->b:I

    invoke-static {v14, v8}, Lab/a0;->f(I[B)I

    move-result v8

    if-eq v8, v13, :cond_d

    const/16 v14, 0x1b9

    if-ne v8, v14, :cond_a

    goto :goto_2

    :cond_a
    ushr-int/lit8 v8, v8, 0x8

    if-eq v8, v12, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {v2, v9}, Lx8/n;->G(I)V

    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v8

    const/4 v14, 0x2

    if-ge v8, v14, :cond_c

    invoke-virtual {v2, v1}, Lx8/n;->F(I)V

    goto :goto_2

    :cond_c
    invoke-virtual {v2}, Lx8/n;->z()I

    move-result v8

    iget v14, v2, Lx8/n;->c:I

    iget v15, v2, Lx8/n;->b:I

    add-int/2addr v15, v8

    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-virtual {v2, v8}, Lx8/n;->F(I)V

    goto :goto_1

    :cond_d
    :goto_2
    iget v1, v2, Lx8/n;->b:I

    goto/16 :goto_0

    :cond_e
    cmp-long v2, v10, v3

    if-eqz v2, :cond_f

    int-to-long v1, v1

    add-long v12, v5, v1

    new-instance v8, Lt9/f;

    const/4 v9, -0x2

    invoke-direct/range {v8 .. v13}, Lt9/f;-><init>(IJJ)V

    return-object v8

    :cond_f
    sget-object v1, Lt9/f;->d:Lt9/f;

    return-object v1
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lgl/u;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lgl/u;->w:[B

    array-length v1, v1

    iput v1, v0, Lgl/u;->y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public l()Ljava/util/List;
    .locals 9

    const-string v0, "sentry-debug-meta.properties"

    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/v0;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    iget-object v3, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/net/URL;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v4}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    new-instance v6, Ljava/util/Properties;

    invoke-direct {v6}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v6, v5}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v6, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v7, "Debug Meta Data Properties loaded from %s"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v1, v6, v7, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v5, :cond_0

    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    goto :goto_3

    :catch_1
    move-exception v5

    goto :goto_2

    :catchall_0
    move-exception v6

    if-eqz v5, :cond_1

    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v5

    :try_start_5
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw v6
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    :goto_2
    :try_start_6
    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v7, "%s file is malformed."

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v6, v5, v7, v4}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_0

    :goto_3
    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Failed to load %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v1, v4, v3, v5, v6}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "No %s file was found."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_3
    return-object v2
.end method

.method public m()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 2

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/m;->g0()V

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h;

    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v1, [B

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/h;-><init>([B)V

    return-object v0
.end method

.method public n(Landroid/os/Handler;Lb9/c0;Lb9/c0;Lb9/c0;Lb9/c0;)[Lb9/f;
    .locals 12

    move-object/from16 v0, p5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    new-instance v3, Lr9/d;

    invoke-direct {v3, v2}, Lr9/d;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    move-object v7, v4

    check-cast v7, Lgm/j;

    iput-object v7, v3, Lr9/d;->c:Li9/j;

    const-wide/16 v4, 0x1388

    iput-wide v4, v3, Lr9/d;->d:J

    iput-object p1, v3, Lr9/d;->e:Landroid/os/Handler;

    iput-object p2, v3, Lr9/d;->f:Lb9/c0;

    const/16 p2, 0x32

    iput p2, v3, Lr9/d;->g:I

    iget-boolean p2, v3, Lr9/d;->b:Z

    const/4 v4, 0x1

    xor-int/2addr p2, v4

    invoke-static {p2}, Lva3/g;->i(Z)V

    iget-object p2, v3, Lr9/d;->e:Landroid/os/Handler;

    const/4 v11, 0x0

    if-nez p2, :cond_0

    iget-object v5, v3, Lr9/d;->f:Lb9/c0;

    if-eqz v5, :cond_1

    :cond_0
    if-eqz p2, :cond_2

    iget-object p2, v3, Lr9/d;->f:Lb9/c0;

    if-eqz p2, :cond_2

    :cond_1
    move p2, v4

    goto :goto_0

    :cond_2
    move p2, v11

    :goto_0
    invoke-static {p2}, Lva3/g;->i(Z)V

    iput-boolean v4, v3, Lr9/d;->b:Z

    new-instance p2, Lr9/e;

    invoke-direct {p2, v3}, Lr9/e;-><init>(Lr9/d;)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p2, Ld9/p;

    invoke-direct {p2, v2}, Ld9/p;-><init>(Landroid/content/Context;)V

    iget-boolean v3, p2, Ld9/p;->a:Z

    xor-int/2addr v3, v4

    invoke-static {v3}, Lva3/g;->i(Z)V

    iput-boolean v4, p2, Ld9/p;->a:Z

    iget-object v3, p2, Ld9/p;->d:Ljava/lang/Object;

    check-cast v3, La33/d;

    if-nez v3, :cond_3

    new-instance v3, La33/d;

    new-array v4, v11, [Lv8/e;

    invoke-direct {v3, v4}, La33/d;-><init>([Lv8/e;)V

    iput-object v3, p2, Ld9/p;->d:Ljava/lang/Object;

    :cond_3
    iget-object v3, p2, Ld9/p;->g:Ljava/lang/Object;

    check-cast v3, Lqg3/d;

    if-nez v3, :cond_4

    new-instance v3, Lqg3/d;

    invoke-direct {v3, v2}, Lqg3/d;-><init>(Landroid/content/Context;)V

    iput-object v3, p2, Ld9/p;->g:Ljava/lang/Object;

    :cond_4
    new-instance v10, Ld9/x;

    invoke-direct {v10, p2}, Ld9/x;-><init>(Ld9/p;)V

    iget-object p2, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Landroid/content/Context;

    new-instance v5, Ld9/a0;

    move-object v8, p1

    move-object v9, p3

    invoke-direct/range {v5 .. v10}, Ld9/a0;-><init>(Landroid/content/Context;Li9/j;Landroid/os/Handler;Lb9/c0;Ld9/x;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance p3, Ln9/d;

    move-object/from16 v2, p4

    invoke-direct {p3, v2, p2}, Ln9/d;-><init>(Lb9/c0;Landroid/os/Looper;)V

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    new-instance p2, Lj9/b;

    invoke-direct {p2, v0, p1}, Lj9/b;-><init>(Lb9/c0;Landroid/os/Looper;)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p2, Lj9/b;

    invoke-direct {p2, v0, p1}, Lj9/b;-><init>(Lb9/c0;Landroid/os/Looper;)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Ls9/b;

    invoke-direct {p1}, Ls9/b;-><init>()V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lh9/f;

    sget-object p2, Lh9/c;->j:Le10/k0;

    invoke-direct {p1, p2}, Lh9/f;-><init>(Lh9/c;)V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-array p1, v11, [Lb9/f;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lb9/f;

    return-object p1
.end method

.method public o(Lwm/k;Lab/l0;)V
    .locals 10

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, [Lwm/s;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_4

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v3, p2, Lab/l0;->e:I

    const/4 v4, 0x3

    invoke-interface {p1, v3, v4}, Lwm/k;->o(II)Lwm/s;

    move-result-object v3

    iget-object v4, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrm/c0;

    iget-object v5, v4, Lrm/c0;->L:Ljava/lang/String;

    const-string v6, "application/cea-608"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "application/cea-708"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v6, v1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v6, 0x1

    :goto_2
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    const-string v9, "Invalid closed caption mime type provided: "

    if-eqz v8, :cond_2

    invoke-virtual {v9, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_2
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v9}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_3
    invoke-static {v6, v7}, Llo/a;->f(ZLjava/lang/String;)V

    iget-object v6, v4, Lrm/c0;->w:Ljava/lang/String;

    if-eqz v6, :cond_3

    goto :goto_4

    :cond_3
    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v6, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    :goto_4
    new-instance v7, Lrm/b0;

    invoke-direct {v7}, Lrm/b0;-><init>()V

    iput-object v6, v7, Lrm/b0;->a:Ljava/lang/String;

    iput-object v5, v7, Lrm/b0;->k:Ljava/lang/String;

    iget v5, v4, Lrm/c0;->z:I

    iput v5, v7, Lrm/b0;->d:I

    iget-object v5, v4, Lrm/c0;->y:Ljava/lang/String;

    iput-object v5, v7, Lrm/b0;->c:Ljava/lang/String;

    iget v5, v4, Lrm/c0;->d0:I

    iput v5, v7, Lrm/b0;->C:I

    iget-object v4, v4, Lrm/c0;->N:Ljava/util/List;

    iput-object v4, v7, Lrm/b0;->m:Ljava/util/List;

    new-instance v4, Lrm/c0;

    invoke-direct {v4, v7}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v3, v4}, Lwm/s;->a(Lrm/c0;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public onResult(Ln23/h;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lo23/h;

    iget-object v0, v0, Lo23/h;->d:Ljava/lang/Object;

    check-cast v0, Lac3/a;

    invoke-virtual {v0}, Lac3/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lo23/a;

    invoke-interface {v0, p1}, Lo23/a;->onResult(Ln23/h;)V

    :cond_1
    return-void
.end method

.method public p(Lb9/g;)V
    .locals 3

    monitor-enter p1

    monitor-exit p1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, La8/c;

    const/16 v2, 0x12

    invoke-direct {v1, v2, p0, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public q(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 11

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lbi/p;

    iget-object v0, v0, Lbi/p;->a:Ljava/util/LinkedHashMap;

    new-instance v1, Lna3/o;

    invoke-direct {v1, p0, p1, p2}, Lna3/o;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    new-instance v2, Ljava/util/ArrayList;

    iget-object p3, v1, Lna3/o;->b:Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {p3, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v3, v1, Lna3/o;->c:Ll83/k;

    iget-object v3, v3, Ll83/k;->w:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, Ljava/lang/String;

    const-string v3, "ret"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x28

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v6, Loa3/s;->w:Loa3/s;

    const/16 v7, 0x1e

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v2, 0x1

    if-le p1, v2, :cond_1

    const-string p1, "L"

    const/16 v2, 0x3b

    invoke-static {v2, p1, v9}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :cond_1
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "internalName"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "jvmDescriptor"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x2e

    invoke-static {v2, p2, p1}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, v1, Lna3/o;->c:Ll83/k;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Lna3/q;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p3, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Lna3/q;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p3, Lna3/m;

    iget-object v1, v1, Lna3/o;->a:Ljava/lang/String;

    invoke-direct {p3, p2, v2, v1}, Lna3/m;-><init>(Lna3/q;Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public r(Lstream/video/sfu/models/PublishOption;)Lorg/webrtc/RtpTransceiver;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {p1}, Lio/sentry/internal/debugmeta/c;->y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li33/b;

    if-eqz p1, :cond_0

    iget-object p1, p1, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public s()Lcom/google/crypto/tink/shaded/protobuf/m;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    return-object v0
.end method

.method public t()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lio/sentry/internal/debugmeta/c;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bounds{lower="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Lv4/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v1, Lv4/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public u(Landroid/content/Context;Ljava/lang/String;)I
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ongoing_call"

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "outgoing_call"

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    :goto_0
    const/16 v0, 0x22

    const/4 v1, 0x4

    const/16 v2, 0x800

    if-eqz p2, :cond_b

    iget-object p2, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/Set;

    move-object v3, p2

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_1

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    iget-object v6, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-static {p1, v5}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v0, :cond_4

    return v2

    :cond_4
    return v1

    :cond_5
    :goto_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p1, v0, :cond_8

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    or-int/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_3

    :cond_6
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_7
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Empty collection can\'t be reduced."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    const/16 v0, 0x1d

    if-ne p1, v0, :cond_a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    return v1

    :cond_9
    return v2

    :cond_a
    const/4 p1, 0x0

    return p1

    :cond_b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v0, :cond_c

    return v2

    :cond_c
    return v1
.end method

.method public declared-synchronized v()Ljava/util/Map;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public w()Ly43/b;
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly43/b;

    return-object v0
.end method

.method public x()Ljava/util/ArrayList;
    .locals 4

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Li33/b;

    iget-object v3, v3, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v3}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v3

    invoke-virtual {v3}, Lorg/webrtc/RtpSender;->track()Lorg/webrtc/MediaStreamTrack;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lorg/webrtc/MediaStreamTrack;->isDisposed()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public z()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Ltb/b;

    invoke-interface {v0}, Ltb/b;->z()Z

    move-result v0

    return v0
.end method
