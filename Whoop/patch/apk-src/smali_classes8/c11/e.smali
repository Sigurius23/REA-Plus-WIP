.class public final synthetic Lc11/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ld11/i;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ld11/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lc11/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc11/e;->y:Ld11/i;

    iput-object p1, p0, Lc11/e;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ld11/i;I)V
    .locals 0

    .line 2
    iput p3, p0, Lc11/e;->w:I

    iput-object p1, p0, Lc11/e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lc11/e;->y:Ld11/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc11/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc11/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/e;->y:Ld11/i;

    invoke-static {v0, v1}, Lzi1/u;->a(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc11/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/e;->y:Ld11/i;

    invoke-static {v0, v1}, Lud2/a;->a(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lc11/e;->y:Ld11/i;

    iget-object v1, p0, Lc11/e;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lre1/j;->o(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lc11/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/e;->y:Ld11/i;

    invoke-static {v0, v1}, Ld11/d;->b(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lc11/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/e;->y:Ld11/i;

    invoke-static {v0, v1}, Ld11/d;->c(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lc11/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/e;->y:Ld11/i;

    invoke-static {v0, v1}, Lc11/h;->i(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
