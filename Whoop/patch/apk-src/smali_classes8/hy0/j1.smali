.class public final synthetic Lhy0/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lhy0/j1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lhy0/j1;->x:I

    iput-object p2, p0, Lhy0/j1;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lhy0/j1;->z:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(ILp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lhy0/j1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lhy0/j1;->x:I

    iput-object p2, p0, Lhy0/j1;->z:Lp1/c1;

    iput-object p3, p0, Lhy0/j1;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lhy0/j1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhy0/j1;->z:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget v1, p0, Lhy0/j1;->x:I

    iget-object v2, p0, Lhy0/j1;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v0, p1}, Lt11/e;->l(ILkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhy0/j1;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    iget v1, p0, Lhy0/j1;->x:I

    iget-object v2, p0, Lhy0/j1;->z:Lp1/c1;

    invoke-static {v1, v0, v2, p1}, Lhy0/l1;->c(ILkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
