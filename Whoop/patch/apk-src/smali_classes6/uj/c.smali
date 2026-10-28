.class public final Luj/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final E:Luj/c;

.field public static final F:Luj/c;

.field public static final x:Luj/c;

.field public static final y:Luj/c;

.field public static final z:Luj/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Luj/c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Luj/c;-><init>(II)V

    sput-object v0, Luj/c;->x:Luj/c;

    new-instance v0, Luj/c;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Luj/c;-><init>(II)V

    sput-object v0, Luj/c;->y:Luj/c;

    new-instance v0, Luj/c;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Luj/c;-><init>(II)V

    sput-object v0, Luj/c;->z:Luj/c;

    new-instance v0, Luj/c;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Luj/c;-><init>(II)V

    sput-object v0, Luj/c;->E:Luj/c;

    new-instance v0, Luj/c;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Luj/c;-><init>(II)V

    sput-object v0, Luj/c;->F:Luj/c;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Luj/c;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    iget v0, p0, Luj/c;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Luj/m;->o0:Luj/m;

    return-object v0

    :pswitch_0
    new-instance v0, Luj/b;

    sget-object v1, Li2/w0;->a:Li2/v0;

    invoke-direct {v0, v1}, Luj/b;-><init>(Li2/a1;)V

    return-object v0

    :pswitch_1
    const/16 v0, 0x8

    int-to-float v0, v0

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    return-object v1

    :pswitch_2
    const/16 v0, 0x20

    int-to-float v0, v0

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    return-object v1

    :pswitch_3
    new-instance v2, Luj/a;

    sget-wide v3, Li2/x;->n:J

    move-wide v5, v3

    move-wide v7, v3

    move-wide v9, v3

    invoke-direct/range {v2 .. v10}, Luj/a;-><init>(JJJJ)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
