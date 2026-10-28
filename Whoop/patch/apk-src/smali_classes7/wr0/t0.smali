.class public final synthetic Lwr0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:I

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(IILjava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p2, p0, Lwr0/t0;->w:I

    iput-object p4, p0, Lwr0/t0;->x:Lkotlin/jvm/functions/Function1;

    iput p1, p0, Lwr0/t0;->y:I

    iput-object p3, p0, Lwr0/t0;->z:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lwr0/t0;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lwr0/t0;->y:I

    iget-object v1, p0, Lwr0/t0;->z:Ljava/util/List;

    iget-object v2, p0, Lwr0/t0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, v2}, Lwr0/u0;->d(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Z

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, Lwr0/t0;->y:I

    iget-object v1, p0, Lwr0/t0;->z:Ljava/util/List;

    iget-object v2, p0, Lwr0/t0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, v2}, Lwr0/u0;->a(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Z

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
