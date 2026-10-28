.class public final synthetic Lxh0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public final synthetic x:Lvh0/e;

.field public final synthetic y:Lqh0/b;

.field public final synthetic z:Lvh0/c$f;


# direct methods
.method public synthetic constructor <init>(Lvh0/e;Lqh0/b;Lvh0/c$f;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p5, p0, Lxh0/a;->w:I

    iput-object p1, p0, Lxh0/a;->x:Lvh0/e;

    iput-object p2, p0, Lxh0/a;->y:Lqh0/b;

    iput-object p3, p0, Lxh0/a;->z:Lvh0/c$f;

    iput-object p4, p0, Lxh0/a;->E:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lxh0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxh0/a;->z:Lvh0/c$f;

    iget-object v1, p0, Lxh0/a;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lxh0/a;->x:Lvh0/e;

    iget-object v3, p0, Lxh0/a;->y:Lqh0/b;

    invoke-static {v2, v3, v0, v1}, Lxh0/c;->g(Lvh0/e;Lqh0/b;Lvh0/c$f;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lxh0/a;->z:Lvh0/c$f;

    iget-object v1, p0, Lxh0/a;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lxh0/a;->x:Lvh0/e;

    iget-object v3, p0, Lxh0/a;->y:Lqh0/b;

    invoke-static {v2, v3, v0, v1}, Lxh0/c;->l(Lvh0/e;Lqh0/b;Lvh0/c$f;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
