.class public final synthetic Lkw1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Liw1/d$c;

.field public final synthetic z:Lp1/a1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Liw1/d$c;Lp1/a1;I)V
    .locals 0

    iput p4, p0, Lkw1/h;->w:I

    iput-object p1, p0, Lkw1/h;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lkw1/h;->y:Liw1/d$c;

    iput-object p3, p0, Lkw1/h;->z:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lkw1/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkw1/h;->y:Liw1/d$c;

    iget-object v1, p0, Lkw1/h;->z:Lp1/a1;

    iget-object v2, p0, Lkw1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lkw1/j;->i(Lkotlin/jvm/functions/Function1;Liw1/d$c;Lp1/a1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkw1/h;->y:Liw1/d$c;

    iget-object v1, p0, Lkw1/h;->z:Lp1/a1;

    iget-object v2, p0, Lkw1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lkw1/j;->h(Lkotlin/jvm/functions/Function1;Liw1/d$c;Lp1/a1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
