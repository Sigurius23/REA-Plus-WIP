.class public final Llg/a;
.super Luf/c0;
.source "SourceFile"


# static fields
.field public static final E:Llg/a;

.field public static final y:Llg/a;

.field public static final z:Llg/a;


# instance fields
.field public final synthetic x:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Llg/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llg/a;-><init>(I)V

    sput-object v0, Llg/a;->y:Llg/a;

    new-instance v0, Llg/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llg/a;-><init>(I)V

    sput-object v0, Llg/a;->z:Llg/a;

    new-instance v0, Llg/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llg/a;-><init>(I)V

    sput-object v0, Llg/a;->E:Llg/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llg/a;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final Q()I
    .locals 1

    iget v0, p0, Llg/a;->x:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    throw v0

    :pswitch_1
    const/4 v0, 0x0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
