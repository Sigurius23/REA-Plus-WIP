.class public final synthetic Lhb2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;II)V
    .locals 0

    iput p3, p0, Lhb2/i;->w:I

    iput p2, p0, Lhb2/i;->x:I

    iput-object p1, p0, Lhb2/i;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhb2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lhb2/i;->x:I

    iget-object v1, p0, Lhb2/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Llf0/b0;->l(ILp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, Lhb2/i;->x:I

    iget-object v1, p0, Lhb2/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lhb2/j;->f(ILp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
