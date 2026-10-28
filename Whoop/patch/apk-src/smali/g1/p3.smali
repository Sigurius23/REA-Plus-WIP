.class public final synthetic Lg1/p3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly2/j1;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ILy2/j1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lg1/p3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/p3;->y:I

    iput-object p2, p0, Lg1/p3;->x:Ly2/j1;

    iput p3, p0, Lg1/p3;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ly2/j1;III)V
    .locals 0

    .line 2
    iput p4, p0, Lg1/p3;->w:I

    iput-object p1, p0, Lg1/p3;->x:Ly2/j1;

    iput p2, p0, Lg1/p3;->y:I

    iput p3, p0, Lg1/p3;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lg1/p3;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lg1/p3;->z:I

    check-cast p1, Ly2/i1;

    iget-object v1, p0, Lg1/p3;->x:Ly2/j1;

    iget v2, p0, Lg1/p3;->y:I

    invoke-static {v1, v2, v0, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget v0, p0, Lg1/p3;->z:I

    check-cast p1, Ly2/i1;

    iget-object v1, p0, Lg1/p3;->x:Ly2/j1;

    iget v2, p0, Lg1/p3;->y:I

    invoke-static {v1, v2, v0, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lg1/p3;->x:Ly2/j1;

    iget v1, v0, Ly2/j1;->w:I

    iget v2, p0, Lg1/p3;->y:I

    sub-int/2addr v2, v1

    int-to-float v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    iget v3, v0, Ly2/j1;->x:I

    iget v4, p0, Lg1/p3;->z:I

    sub-int/2addr v4, v3

    int-to-float v3, v4

    div-float/2addr v3, v2

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v2

    invoke-static {v0, v1, v2, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
