.class public final synthetic Ldn0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc93/a;ZLbc3/c0;Lv41/f$a;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    iput v0, p0, Ldn0/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn0/k;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Ldn0/k;->x:Z

    iput-object p3, p0, Ldn0/k;->z:Ljava/lang/Object;

    iput-object p4, p0, Ldn0/k;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lj72/a;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Ldn0/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn0/k;->y:Ljava/lang/Object;

    iput-object p2, p0, Ldn0/k;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Ldn0/k;->x:Z

    iput-object p4, p0, Ldn0/k;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p5, p0, Ldn0/k;->w:I

    iput-boolean p1, p0, Ldn0/k;->x:Z

    iput-object p2, p0, Ldn0/k;->y:Ljava/lang/Object;

    iput-object p3, p0, Ldn0/k;->z:Ljava/lang/Object;

    iput-object p4, p0, Ldn0/k;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 4
    const/4 v0, 0x4

    iput v0, p0, Ldn0/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ldn0/k;->x:Z

    iput-object p2, p0, Ldn0/k;->z:Ljava/lang/Object;

    iput-object p3, p0, Ldn0/k;->y:Ljava/lang/Object;

    iput-object p4, p0, Ldn0/k;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ldn0/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldn0/k;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Ldn0/k;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Ldn0/k;->E:Ljava/lang/Object;

    check-cast v2, Lv41/f$a;

    iget-boolean v3, p0, Ldn0/k;->x:Z

    invoke-static {v0, v3, v1, v2}, Luw0/l;->f(Lc93/a;ZLbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldn0/k;->y:Ljava/lang/Object;

    check-cast v0, Lzg0/k;

    iget-object v1, p0, Ldn0/k;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ldn0/k;->E:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    iget-boolean v3, p0, Ldn0/k;->x:Z

    invoke-static {v3, v0, v1, v2}, Lsl0/d2;->j(ZLzg0/k;Lkotlin/jvm/functions/Function1;Lc93/m;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ldn0/k;->y:Ljava/lang/Object;

    check-cast v0, Lzg0/k;

    iget-object v1, p0, Ldn0/k;->z:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    iget-object v2, p0, Ldn0/k;->E:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    iget-boolean v3, p0, Ldn0/k;->x:Z

    invoke-static {v3, v0, v1, v2}, Lsl0/d2;->c(ZLzg0/k;Lc93/m;Lc93/m;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ldn0/k;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/navigation/e;

    iget-object v1, p0, Ldn0/k;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ldn0/k;->E:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-boolean v3, p0, Ldn0/k;->x:Z

    invoke-static {v3, v0, v1, v2}, Lp71/b;->i(ZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Ldn0/k;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ldn0/k;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/membership/management/navigation/b;

    iget-object v2, p0, Ldn0/k;->E:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Ldn0/k;->x:Z

    invoke-static {v3, v0, v1, v2}, Lnx1/b;->a(ZLkotlin/jvm/functions/Function1;Lcom/whoop/membership/management/navigation/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ldn0/k;->y:Ljava/lang/Object;

    check-cast v0, Lj72/a;

    iget-object v1, p0, Ldn0/k;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ldn0/k;->E:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Ldn0/k;->x:Z

    invoke-static {v0, v1, v3, v2}, Ll72/c;->a(Lj72/a;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Ldn0/k;->y:Ljava/lang/Object;

    check-cast v0, Lj02/j;

    iget-object v1, p0, Ldn0/k;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Ldn0/k;->E:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-boolean v3, p0, Ldn0/k;->x:Z

    invoke-static {v3, v0, v1, v2}, Lkd1/d;->h(ZLj02/j;Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Ldn0/k;->y:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    iget-object v1, p0, Ldn0/k;->z:Ljava/lang/Object;

    check-cast v1, Lhp1/c;

    iget-object v2, p0, Ldn0/k;->E:Ljava/lang/Object;

    check-cast v2, Lp1/a1;

    iget-boolean v3, p0, Ldn0/k;->x:Z

    invoke-static {v3, v0, v1, v2}, Lep1/i;->a(ZLz1/p;Lhp1/c;Lp1/a1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Ldn0/k;->y:Ljava/lang/Object;

    check-cast v0, Ldn0/i;

    iget-object v1, p0, Ldn0/k;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ldn0/k;->E:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Ldn0/k;->x:Z

    invoke-static {v3, v0, v1, v2}, Ldn0/p;->m(ZLdn0/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
