.class public final synthetic Lc11/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lny0/h;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lny0/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lc11/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc11/d;->y:Lny0/h;

    iput-object p1, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lny0/h;I)V
    .locals 0

    .line 2
    iput p3, p0, Lc11/d;->w:I

    iput-object p1, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lc11/d;->y:Lny0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc11/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/d;->y:Lny0/h;

    invoke-static {v0, v1, p1}, Llf0/l;->l(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/d;->y:Lny0/h;

    invoke-static {v0, v1, p1}, Ll01/m;->f(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/d;->y:Lny0/h;

    invoke-static {v0, v1, p1}, Ll01/m;->x(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/d;->y:Lny0/h;

    invoke-static {v0, v1, p1}, Ll01/m;->h(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/d;->y:Lny0/h;

    invoke-static {v0, v1, p1}, Lkm1/b;->g(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lc11/d;->y:Lny0/h;

    iget-object v1, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lk11/d;->a(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/d;->y:Lny0/h;

    invoke-static {v0, v1, p1}, Lht2/e;->a(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/d;->y:Lny0/h;

    invoke-static {v0, v1, p1}, Lc41/h5;->d(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lc11/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc11/d;->y:Lny0/h;

    invoke-static {v0, v1, p1}, Lc11/h;->o(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

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
