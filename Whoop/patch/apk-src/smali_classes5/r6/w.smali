.class public final Lr6/w;
.super Landroidx/glance/appwidget/protobuf/a0;
.source "SourceFile"


# static fields
.field public static final CHILDREN_FIELD_NUMBER:I = 0x7

.field private static final DEFAULT_INSTANCE:Lr6/w;

.field public static final HASACTION_FIELD_NUMBER:I = 0x9

.field public static final HAS_IMAGE_ALPHA_FIELD_NUMBER:I = 0xc

.field public static final HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER:I = 0xb

.field public static final HAS_IMAGE_DESCRIPTION_FIELD_NUMBER:I = 0xa

.field public static final HEIGHT_FIELD_NUMBER:I = 0x3

.field public static final HORIZONTAL_ALIGNMENT_FIELD_NUMBER:I = 0x4

.field public static final IDENTITY_FIELD_NUMBER:I = 0x8

.field public static final IMAGE_SCALE_FIELD_NUMBER:I = 0x6

.field private static volatile PARSER:Landroidx/glance/appwidget/protobuf/w0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/glance/appwidget/protobuf/w0;"
        }
    .end annotation
.end field

.field public static final TYPE_FIELD_NUMBER:I = 0x1

.field public static final VERTICAL_ALIGNMENT_FIELD_NUMBER:I = 0x5

.field public static final WIDTH_FIELD_NUMBER:I = 0x2


# instance fields
.field private children_:Landroidx/glance/appwidget/protobuf/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/glance/appwidget/protobuf/e0;"
        }
    .end annotation
.end field

.field private hasAction_:Z

.field private hasImageAlpha_:Z

.field private hasImageColorFilter_:Z

.field private hasImageDescription_:Z

.field private height_:I

.field private horizontalAlignment_:I

.field private identity_:I

.field private imageScale_:I

.field private type_:I

.field private verticalAlignment_:I

.field private width_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr6/w;

    invoke-direct {v0}, Lr6/w;-><init>()V

    sput-object v0, Lr6/w;->DEFAULT_INSTANCE:Lr6/w;

    const-class v1, Lr6/w;

    invoke-static {v1, v0}, Landroidx/glance/appwidget/protobuf/a0;->k(Ljava/lang/Class;Landroidx/glance/appwidget/protobuf/a0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/glance/appwidget/protobuf/a0;-><init>()V

    sget-object v0, Landroidx/glance/appwidget/protobuf/z0;->z:Landroidx/glance/appwidget/protobuf/z0;

    iput-object v0, p0, Lr6/w;->children_:Landroidx/glance/appwidget/protobuf/e0;

    return-void
.end method

.method public static A()Lr6/v;
    .locals 1

    sget-object v0, Lr6/w;->DEFAULT_INSTANCE:Lr6/w;

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/a0;->c()Landroidx/glance/appwidget/protobuf/y;

    move-result-object v0

    check-cast v0, Lr6/v;

    return-object v0
.end method

.method public static n(Lr6/w;Lr6/x;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lr6/x;->L:Lr6/x;

    if-eq p1, v0, :cond_0

    iget p1, p1, Lr6/x;->w:I

    iput p1, p0, Lr6/w;->type_:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static o(Lr6/w;Lr6/p;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lr6/p;->a()I

    move-result p1

    iput p1, p0, Lr6/w;->width_:I

    return-void
.end method

.method public static p(Lr6/w;Lr6/p;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lr6/p;->a()I

    move-result p1

    iput p1, p0, Lr6/w;->height_:I

    return-void
.end method

.method public static q(Lr6/w;Lr6/q;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lr6/q;->E:Lr6/q;

    if-eq p1, v0, :cond_0

    iget p1, p1, Lr6/q;->w:I

    iput p1, p0, Lr6/w;->horizontalAlignment_:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static r(Lr6/w;Lr6/y;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lr6/y;->E:Lr6/y;

    if-eq p1, v0, :cond_0

    iget p1, p1, Lr6/y;->w:I

    iput p1, p0, Lr6/w;->verticalAlignment_:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static s(Lr6/w;Lr6/o;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lr6/o;->E:Lr6/o;

    if-eq p1, v0, :cond_0

    iget p1, p1, Lr6/o;->w:I

    iput p1, p0, Lr6/w;->imageScale_:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can\'t get the number of an unknown enum value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static t(Lr6/w;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    iput v0, p0, Lr6/w;->identity_:I

    return-void
.end method

.method public static u(Lr6/w;Z)V
    .locals 0

    iput-boolean p1, p0, Lr6/w;->hasAction_:Z

    return-void
.end method

.method public static v(Lr6/w;Ljava/util/ArrayList;)V
    .locals 2

    iget-object v0, p0, Lr6/w;->children_:Landroidx/glance/appwidget/protobuf/e0;

    move-object v1, v0

    check-cast v1, Landroidx/glance/appwidget/protobuf/b;

    iget-boolean v1, v1, Landroidx/glance/appwidget/protobuf/b;->w:Z

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v1, 0x2

    :goto_0
    invoke-interface {v0, v1}, Landroidx/glance/appwidget/protobuf/e0;->i(I)Landroidx/glance/appwidget/protobuf/e0;

    move-result-object v0

    iput-object v0, p0, Lr6/w;->children_:Landroidx/glance/appwidget/protobuf/e0;

    :cond_1
    iget-object p0, p0, Lr6/w;->children_:Landroidx/glance/appwidget/protobuf/e0;

    invoke-static {p1, p0}, Landroidx/glance/appwidget/protobuf/a;->a(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static w(Lr6/w;Z)V
    .locals 0

    iput-boolean p1, p0, Lr6/w;->hasImageDescription_:Z

    return-void
.end method

.method public static x(Lr6/w;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr6/w;->hasImageColorFilter_:Z

    return-void
.end method

.method public static y(Lr6/w;Z)V
    .locals 0

    iput-boolean p1, p0, Lr6/w;->hasImageAlpha_:Z

    return-void
.end method

.method public static z()Lr6/w;
    .locals 1

    sget-object v0, Lr6/w;->DEFAULT_INSTANCE:Lr6/w;

    return-object v0
.end method


# virtual methods
.method public final d(I)Ljava/lang/Object;
    .locals 13

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lr6/w;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_1

    const-class v1, Lr6/w;

    monitor-enter v1

    :try_start_0
    sget-object p1, Lr6/w;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/glance/appwidget/protobuf/z;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Lr6/w;->PARSER:Landroidx/glance/appwidget/protobuf/w0;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-object p1

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1

    :pswitch_1
    sget-object p1, Lr6/w;->DEFAULT_INSTANCE:Lr6/w;

    return-object p1

    :pswitch_2
    new-instance p1, Lr6/v;

    sget-object v0, Lr6/w;->DEFAULT_INSTANCE:Lr6/w;

    invoke-direct {p1, v0}, Landroidx/glance/appwidget/protobuf/y;-><init>(Landroidx/glance/appwidget/protobuf/a0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lr6/w;

    invoke-direct {p1}, Lr6/w;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "type_"

    const-string v1, "width_"

    const-string v2, "height_"

    const-string v3, "horizontalAlignment_"

    const-string v4, "verticalAlignment_"

    const-string v5, "imageScale_"

    const-string v6, "children_"

    const-class v7, Lr6/w;

    const-string v8, "identity_"

    const-string v9, "hasAction_"

    const-string v10, "hasImageDescription_"

    const-string v11, "hasImageColorFilter_"

    const-string v12, "hasImageAlpha_"

    filled-new-array/range {v0 .. v12}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0000\u000c\u0000\u0000\u0001\u000c\u000c\u0000\u0001\u0000\u0001\u000c\u0002\u000c\u0003\u000c\u0004\u000c\u0005\u000c\u0006\u000c\u0007\u001b\u0008\u000c\t\u0007\n\u0007\u000b\u0007\u000c\u0007"

    sget-object v1, Lr6/w;->DEFAULT_INSTANCE:Lr6/w;

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

    nop

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
