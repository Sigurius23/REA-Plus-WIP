.class public final Lvd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lud/a;


# direct methods
.method public synthetic constructor <init>(Lud/a;I)V
    .locals 0

    iput p2, p0, Lvd/b;->w:I

    iput-object p1, p0, Lvd/b;->x:Lud/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lvd/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lhg/e;

    const-string v0, "$this$listField"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvd/b;->x:Lud/a;

    iget-object v0, v0, Lud/a;->c:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud/g;

    sget-object v2, Lvd/c;->w:Lvd/c;

    new-instance v3, Lhg/k;

    invoke-direct {v3, v1, v2}, Lhg/k;-><init>(Ljava/lang/Object;Lc93/m;)V

    invoke-interface {p1, v3}, Lhg/h;->j(Lhg/k;)V

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lhg/e;

    const-string v0, "$this$listField"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvd/b;->x:Lud/a;

    iget-object v0, v0, Lud/a;->f:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud/h;

    sget-object v2, Lvd/a;->w:Lvd/a;

    new-instance v3, Lhg/k;

    invoke-direct {v3, v1, v2}, Lhg/k;-><init>(Ljava/lang/Object;Lc93/m;)V

    invoke-interface {p1, v3}, Lhg/h;->j(Lhg/k;)V

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
