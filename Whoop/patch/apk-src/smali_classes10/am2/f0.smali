.class public final synthetic Lam2/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lam2/f0;->w:I

    iput-object p1, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lam2/f0;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lam2/f0;->w:I

    iput-boolean p1, p0, Lam2/f0;->y:Z

    iput-object p2, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lam2/f0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    iget-boolean v1, p0, Lam2/f0;->y:Z

    invoke-static {v1, v0, p1}, Lyb0/g;->g(ZLkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lam2/f0;->y:Z

    invoke-static {v0, v1, p1}, Lsy0/p;->b(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lam2/f0;->y:Z

    invoke-static {v0, v1, p1}, Lsy0/g;->c(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lam2/f0;->y:Z

    invoke-static {v0, v1, p1}, Lo42/k;->s(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lam2/f0;->y:Z

    invoke-static {v0, v1, p1}, Lo42/k;->u(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Li3/z;

    iget-boolean v1, p0, Lam2/f0;->y:Z

    invoke-static {v1, v0, p1}, Lo11/l;->i(ZLkotlin/jvm/functions/Function1;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lam2/f0;->y:Z

    invoke-static {v0, v1, p1}, Lmf2/f;->l(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lam2/f0;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Lam2/f0;->y:Z

    invoke-static {v0, v1, p1}, Lam2/o0;->G(Lkotlin/jvm/functions/Function1;ZLjava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
