.class public final Lu1/r;
.super Lu1/p;
.source "SourceFile"


# instance fields
.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu1/r;->z:I

    invoke-direct {p0}, Lu1/p;-><init>()V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lu1/r;->z:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lu1/p;->y:I

    add-int/lit8 v1, v0, 0x2

    iput v1, p0, Lu1/p;->y:I

    iget-object v1, p0, Lu1/p;->w:[Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v1, v0

    return-object v0

    :pswitch_0
    iget v0, p0, Lu1/p;->y:I

    add-int/lit8 v1, v0, 0x2

    iput v1, p0, Lu1/p;->y:I

    iget-object v1, p0, Lu1/p;->w:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
