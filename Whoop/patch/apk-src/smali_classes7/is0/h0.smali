.class public final synthetic Lis0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLp1/t2;Lp1/z0;Lp1/z0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lis0/h0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lis0/h0;->x:F

    iput-object p2, p0, Lis0/h0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lis0/h0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lis0/h0;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lti0/e;Lti0/g;FLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lis0/h0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis0/h0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lis0/h0;->z:Ljava/lang/Object;

    iput p3, p0, Lis0/h0;->x:F

    iput-object p4, p0, Lis0/h0;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lis0/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/h0;->y:Ljava/lang/Object;

    check-cast v0, Lti0/e;

    iget-object v1, p0, Lis0/h0;->z:Ljava/lang/Object;

    check-cast v1, Lti0/g;

    iget-object v2, p0, Lis0/h0;->E:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget v3, p0, Lis0/h0;->x:F

    invoke-static {v0, v1, v3, v2, p1}, Lzi0/a;->l(Lti0/e;Lti0/g;FLkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lis0/h0;->y:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lis0/h0;->z:Ljava/lang/Object;

    check-cast v1, Lp1/z0;

    iget-object v2, p0, Lis0/h0;->E:Ljava/lang/Object;

    check-cast v2, Lp1/z0;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v3, p0, Lis0/h0;->x:F

    invoke-static {v3, v0, v1, v2, p1}, Lis0/j0;->w(FLp1/t2;Lp1/z0;Lp1/z0;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
