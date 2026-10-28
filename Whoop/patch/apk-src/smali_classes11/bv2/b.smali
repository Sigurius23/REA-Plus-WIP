.class public final synthetic Lbv2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lbv2/b;->w:I

    iput-object p1, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lbv2/b;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lbv2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lbv2/b;->y:Z

    iput-object p2, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbv2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Lyb0/k;->I(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Lw51/g;->h(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Luz1/h;->f(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Luz1/f;->c(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Ltp0/e;->c(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Ltj1/a;->b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Lsy0/r;->a(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Lsy0/m;->c(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-boolean v0, p0, Lbv2/b;->y:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Lo42/k;->x(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Lny0/d1;->b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Lmf2/f;->c(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Lih2/b;->i(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-boolean v0, p0, Lbv2/b;->y:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lbv2/b;->y:Z

    invoke-static {v0, v1}, Lea2/n;->f(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-boolean v0, p0, Lbv2/b;->y:Z

    iget-object v1, p0, Lbv2/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lbv2/c;->h(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
