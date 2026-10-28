.class public final synthetic Lkf0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Ll1/w3;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lc93/a;Ll1/w3;I)V
    .locals 0

    .line 1
    iput p4, p0, Lkf0/g;->w:I

    iput-object p1, p0, Lkf0/g;->x:Lbc3/c0;

    iput-object p2, p0, Lkf0/g;->y:Lc93/a;

    iput-object p3, p0, Lkf0/g;->z:Ll1/w3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Ll1/w3;Lc93/a;I)V
    .locals 0

    .line 2
    iput p4, p0, Lkf0/g;->w:I

    iput-object p1, p0, Lkf0/g;->x:Lbc3/c0;

    iput-object p2, p0, Lkf0/g;->z:Ll1/w3;

    iput-object p3, p0, Lkf0/g;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll1/w3;Lbc3/c0;Lc93/a;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lkf0/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkf0/g;->z:Ll1/w3;

    iput-object p2, p0, Lkf0/g;->x:Lbc3/c0;

    iput-object p3, p0, Lkf0/g;->y:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Ll1/w3;Lc93/a;Lbc3/c0;)V
    .locals 1

    .line 4
    const/4 v0, 0x3

    iput v0, p0, Lkf0/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkf0/g;->z:Ll1/w3;

    iput-object p2, p0, Lkf0/g;->y:Lc93/a;

    iput-object p3, p0, Lkf0/g;->x:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lkf0/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkf0/g;->z:Ll1/w3;

    iget-object v1, p0, Lkf0/g;->y:Lc93/a;

    iget-object v2, p0, Lkf0/g;->x:Lbc3/c0;

    invoke-static {v2, v1, v0}, Ltg2/d;->a(Lbc3/c0;Lc93/a;Ll1/w3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkf0/g;->z:Ll1/w3;

    iget-object v1, p0, Lkf0/g;->y:Lc93/a;

    iget-object v2, p0, Lkf0/g;->x:Lbc3/c0;

    invoke-static {v2, v1, v0}, Ltg2/d;->e(Lbc3/c0;Lc93/a;Ll1/w3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lkf0/g;->z:Ll1/w3;

    invoke-virtual {v0}, Ll1/w3;->c()Ll1/x3;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    const/4 v3, 0x3

    iget-object v4, p0, Lkf0/g;->x:Lbc3/c0;

    const/4 v5, 0x0

    if-eq v1, v2, :cond_0

    new-instance v1, Ll1/k2;

    const/4 v2, 0x5

    invoke-direct {v1, v0, v5, v2}, Ll1/k2;-><init>(Ll1/w3;Lq83/d;I)V

    invoke-static {v4, v5, v5, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    new-instance v1, Ll1/k2;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v5, v2}, Ll1/k2;-><init>(Ll1/w3;Lq83/d;I)V

    invoke-static {v4, v5, v5, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkf0/g;->y:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lkf0/g;->z:Ll1/w3;

    iget-object v1, v0, Ll1/w3;->e:Lm1/g;

    iget-object v1, v1, Lm1/g;->d:Lkotlin/jvm/functions/Function1;

    sget-object v2, Ll1/x3;->w:Ll1/x3;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ll1/k2;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3, v2}, Ll1/k2;-><init>(Ll1/w3;Lq83/d;I)V

    iget-object v4, p0, Lkf0/g;->x:Lbc3/c0;

    invoke-static {v4, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    new-instance v2, Ll1/j2;

    const/4 v3, 0x0

    iget-object v4, p0, Lkf0/g;->y:Lc93/a;

    invoke-direct {v2, v0, v4, v3}, Ll1/j2;-><init>(Ll1/w3;Lc93/a;I)V

    invoke-virtual {v1, v2}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lkf0/g;->y:Lc93/a;

    iget-object v1, p0, Lkf0/g;->z:Ll1/w3;

    iget-object v2, p0, Lkf0/g;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lkf0/h;->i(Lbc3/c0;Lc93/a;Ll1/w3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lkf0/g;->y:Lc93/a;

    iget-object v1, p0, Lkf0/g;->z:Ll1/w3;

    iget-object v2, p0, Lkf0/g;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lkf0/h;->e(Lbc3/c0;Lc93/a;Ll1/w3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
