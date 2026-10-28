.class public final synthetic Lte1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:I

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lte1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lte1/a;->z:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lte1/a;->y:I

    iput-object p3, p0, Lte1/a;->x:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;ILkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lte1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lte1/a;->x:Lp1/c1;

    iput p2, p0, Lte1/a;->y:I

    iput-object p3, p0, Lte1/a;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lte1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lte1/a;->y:I

    iget-object v1, p0, Lte1/a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lte1/a;->x:Lp1/c1;

    invoke-static {v0, v1, v2}, Lz21/c;->a(ILkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget v0, p0, Lte1/a;->y:I

    iget-object v1, p0, Lte1/a;->x:Lp1/c1;

    iget-object v2, p0, Lte1/a;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v1}, Lte1/b;->g(ILkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
