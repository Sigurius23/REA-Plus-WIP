.class public final synthetic Lp21/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(IILp1/c1;I)V
    .locals 0

    iput p4, p0, Lp21/d;->w:I

    iput p1, p0, Lp21/d;->x:I

    iput p2, p0, Lp21/d;->y:I

    iput-object p3, p0, Lp21/d;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lp21/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp21/d;->z:Lp1/c1;

    check-cast p1, Lmh/h;

    iget v1, p0, Lp21/d;->x:I

    iget v2, p0, Lp21/d;->y:I

    invoke-static {v1, v2, v0, p1}, Luu2/g0;->a(IILp1/c1;Lmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp21/d;->z:Lp1/c1;

    check-cast p1, Lmh/h;

    iget v1, p0, Lp21/d;->x:I

    iget v2, p0, Lp21/d;->y:I

    invoke-static {v1, v2, v0, p1}, Lp21/e;->i(IILp1/c1;Lmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
