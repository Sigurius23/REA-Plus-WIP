.class public final synthetic Llc0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljc0/d$c$a;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Llc0/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llc0/i;->y:Ljc0/d$c$a;

    iput-object p2, p0, Llc0/i;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Llc0/i;->z:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljc0/d$c$a;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Llc0/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llc0/i;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Llc0/i;->y:Ljc0/d$c$a;

    iput-object p3, p0, Llc0/i;->z:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Llc0/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llc0/i;->y:Ljc0/d$c$a;

    iget-object v1, p0, Llc0/i;->z:Lp1/c1;

    iget-object v2, p0, Llc0/i;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v1}, Llc0/j;->n(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llc0/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llc0/i;->z:Lp1/c1;

    iget-object v2, p0, Llc0/i;->y:Ljc0/d$c$a;

    invoke-static {v2, v0, v1}, Llc0/j;->b(Ljc0/d$c$a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
