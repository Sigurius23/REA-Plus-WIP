.class public final Lg1/e9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    iput p3, p0, Lg1/e9;->w:I

    iput-wide p1, p0, Lg1/e9;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget v0, p0, Lg1/e9;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Lg1/e9;->x:J

    return-wide v0

    :pswitch_0
    iget-wide v0, p0, Lg1/e9;->x:J

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
