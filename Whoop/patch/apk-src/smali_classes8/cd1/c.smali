.class public final synthetic Lcd1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg1/y3;

.field public final synthetic y:Lbc3/c0;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcd1/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd1/c;->y:Lbc3/c0;

    iput-object p2, p0, Lcd1/c;->x:Lg1/y3;

    return-void
.end method

.method public synthetic constructor <init>(Lg1/y3;Lbc3/c0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcd1/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd1/c;->x:Lg1/y3;

    iput-object p2, p0, Lcd1/c;->y:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcd1/c;->w:I

    iget-object v1, p0, Lcd1/c;->y:Lbc3/c0;

    iget-object v2, p0, Lcd1/c;->x:Lg1/y3;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Lg1/y3;->b:Lg1/a0;

    check-cast p1, Li3/z;

    invoke-virtual {v2}, Lg1/y3;->e()Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Lbf0/h;

    const/16 v4, 0x9

    invoke-direct {v3, v2, v1, v4}, Lbf0/h;-><init>(Lg1/y3;Lbc3/c0;I)V

    sget-object v4, Li3/w;->a:[Lj93/z;

    sget-object v4, Li3/k;->u:Li3/y;

    new-instance v5, Li3/a;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v3}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v4, v5}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    iget-object v3, v0, Lg1/a0;->g:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lg1/z3;->y:Lg1/z3;

    if-ne v3, v4, :cond_0

    new-instance v0, Lbf0/h;

    const/4 v3, 0x6

    invoke-direct {v0, v2, v1, v3}, Lbf0/h;-><init>(Lg1/y3;Lbc3/c0;I)V

    sget-object v1, Li3/k;->s:Li3/y;

    new-instance v2, Li3/a;

    invoke-direct {v2, v6, v0}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {p1, v1, v2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lg1/a0;->e()Lg1/k3;

    move-result-object v0

    iget-object v0, v0, Lg1/k3;->a:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lbf0/h;

    const/4 v3, 0x7

    invoke-direct {v0, v2, v1, v3}, Lbf0/h;-><init>(Lg1/y3;Lbc3/c0;I)V

    sget-object v1, Li3/k;->t:Li3/y;

    new-instance v2, Li3/a;

    invoke-direct {v2, v6, v0}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {p1, v1, v2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lzc1/d0;

    invoke-static {v1, v2, p1}, Lcom/whoop/design/showcase/gallery/view/fragment/AtomicGalleryFragment;->L(Lbc3/c0;Lg1/y3;Lzc1/d0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
