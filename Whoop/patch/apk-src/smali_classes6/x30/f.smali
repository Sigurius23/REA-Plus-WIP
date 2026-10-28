.class public final Lx30/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/r;


# static fields
.field public static final x:Lx30/f;


# instance fields
.field public final synthetic w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx30/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx30/f;-><init>(I)V

    sput-object v0, Lx30/f;->x:Lx30/f;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lx30/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final n(I)I
    .locals 1

    iget v0, p0, Lx30/f;->w:I

    packed-switch v0, :pswitch_data_0

    div-int/lit8 v0, p1, 0x5

    sub-int/2addr p1, v0

    return p1

    :pswitch_0
    const/4 v0, 0x4

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x9

    if-gt p1, v0, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0xe

    if-gt p1, v0, :cond_2

    add-int/lit8 p1, p1, -0x2

    goto :goto_0

    :cond_2
    const/16 v0, 0x13

    if-gt p1, v0, :cond_3

    add-int/lit8 p1, p1, -0x3

    goto :goto_0

    :cond_3
    add-int/lit8 p1, p1, -0x4

    :goto_0
    return p1

    :pswitch_1
    const/4 v0, 0x4

    if-gt p1, v0, :cond_4

    goto :goto_1

    :cond_4
    const/16 v0, 0xb

    if-gt p1, v0, :cond_5

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_5
    add-int/lit8 p1, p1, -0x2

    :goto_1
    return p1

    :pswitch_2
    const/4 v0, 0x4

    if-gt p1, v0, :cond_6

    goto :goto_2

    :cond_6
    const/16 v0, 0x9

    if-gt p1, v0, :cond_7

    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    :cond_7
    const/16 v0, 0xe

    if-gt p1, v0, :cond_8

    add-int/lit8 p1, p1, -0x2

    goto :goto_2

    :cond_8
    add-int/lit8 p1, p1, -0x3

    :goto_2
    return p1

    :pswitch_3
    const/4 v0, 0x3

    if-gt p1, v0, :cond_9

    goto :goto_3

    :cond_9
    add-int/lit8 p1, p1, -0x3

    :goto_3
    return p1

    :pswitch_4
    if-nez p1, :cond_a

    const/4 p1, 0x0

    goto :goto_4

    :cond_a
    div-int/lit8 v0, p1, 0x3

    sub-int/2addr p1, v0

    :goto_4
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x(I)I
    .locals 1

    iget v0, p0, Lx30/f;->w:I

    packed-switch v0, :pswitch_data_0

    div-int/lit8 v0, p1, 0x4

    add-int/2addr v0, p1

    return v0

    :pswitch_0
    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    if-gt p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0xb

    if-gt p1, v0, :cond_2

    add-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_2
    const/16 v0, 0xf

    if-gt p1, v0, :cond_3

    add-int/lit8 p1, p1, 0x3

    goto :goto_0

    :cond_3
    add-int/lit8 p1, p1, 0x4

    :goto_0
    return p1

    :pswitch_1
    const/4 v0, 0x3

    if-gt p1, v0, :cond_4

    goto :goto_1

    :cond_4
    const/16 v0, 0x9

    if-gt p1, v0, :cond_5

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 p1, p1, 0x2

    :goto_1
    return p1

    :pswitch_2
    const/4 v0, 0x3

    if-gt p1, v0, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x7

    if-gt p1, v0, :cond_7

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_7
    const/16 v0, 0xb

    if-gt p1, v0, :cond_8

    add-int/lit8 p1, p1, 0x2

    goto :goto_2

    :cond_8
    add-int/lit8 p1, p1, 0x3

    :goto_2
    return p1

    :pswitch_3
    const/4 v0, 0x2

    if-gt p1, v0, :cond_9

    goto :goto_3

    :cond_9
    const/4 v0, 0x3

    add-int/2addr p1, v0

    :goto_3
    return p1

    :pswitch_4
    if-nez p1, :cond_a

    const/4 p1, 0x0

    goto :goto_4

    :cond_a
    div-int/lit8 v0, p1, 0x2

    add-int/2addr v0, p1

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_b

    add-int/lit8 p1, v0, -0x1

    goto :goto_4

    :cond_b
    move p1, v0

    :goto_4
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
