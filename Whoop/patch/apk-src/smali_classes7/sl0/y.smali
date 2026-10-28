.class public final synthetic Lsl0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lsl0/y;->w:I

    iput-object p1, p0, Lsl0/y;->y:Ljava/lang/Object;

    iput-object p2, p0, Lsl0/y;->z:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/y;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;Lnl0/f;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lsl0/y;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/y;->y:Ljava/lang/Object;

    iput-object p2, p0, Lsl0/y;->x:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/y;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsl0/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/y;->y:Ljava/lang/Object;

    check-cast v0, Lq2/a;

    iget-object v1, p0, Lsl0/y;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lsl0/y;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lsl0/j1;->c(Lq2/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/y;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lsl0/y;->z:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    iget-object v2, p0, Lsl0/y;->x:Ljava/lang/Object;

    check-cast v2, Lb3/x2;

    invoke-static {v0, v2, v1}, Lsl0/u0;->f(Lbc3/c0;Lb3/x2;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsl0/y;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lsl0/y;->x:Ljava/lang/Object;

    check-cast v1, Lnl0/f;

    iget-object v2, p0, Lsl0/y;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lsl0/o0;->d(Lkotlin/jvm/internal/g0;Lnl0/f;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lsl0/y;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lsl0/y;->z:Ljava/lang/Object;

    check-cast v1, Lsl0/q;

    iget-object v2, p0, Lsl0/y;->x:Ljava/lang/Object;

    check-cast v2, Lnl0/f;

    invoke-static {v0, v1, v2}, Lsl0/w$l;->h(Lc93/a;Lsl0/q;Lnl0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
