.class public final synthetic Lis0/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lld1/c;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lld1/c;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Lis0/u0;->w:I

    iput-object p1, p0, Lis0/u0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lis0/u0;->y:Lld1/c;

    iput-object p3, p0, Lis0/u0;->z:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lis0/u0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/u0;->y:Lld1/c;

    iget-object v1, p0, Lis0/u0;->z:Lp1/t2;

    iget-object v2, p0, Lis0/u0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1, p1}, Lrm1/i;->d(Lkotlin/jvm/functions/Function1;Lld1/c;Lp1/t2;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lis0/u0;->y:Lld1/c;

    iget-object v1, p0, Lis0/u0;->z:Lp1/t2;

    iget-object v2, p0, Lis0/u0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1, p1}, Lis0/x0;->i(Lkotlin/jvm/functions/Function1;Lld1/c;Lp1/t2;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
