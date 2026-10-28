.class public final synthetic Lat2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lat2/l;->w:I

    iput-object p1, p0, Lat2/l;->x:Lc93/a;

    iput-object p2, p0, Lat2/l;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lc93/a;I)V
    .locals 0

    .line 2
    iput p3, p0, Lat2/l;->w:I

    iput-object p1, p0, Lat2/l;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lat2/l;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lat2/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lat2/l;->x:Lc93/a;

    iget-object v1, p0, Lat2/l;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lvy1/b;->i(Lc93/a;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lat2/l;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/l;->x:Lc93/a;

    invoke-static {v1, v0, p1}, Lqj2/b;->e(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lat2/l;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lkd0/a;

    iget-object v1, p0, Lat2/l;->x:Lc93/a;

    invoke-static {v1, v0, p1}, Lkf0/f;->e(Lc93/a;Lkotlin/jvm/functions/Function1;Lkd0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lat2/l;->x:Lc93/a;

    check-cast p1, Lp31/j;

    iget-object v1, p0, Lat2/l;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lg32/k;->n(Lkotlin/jvm/functions/Function1;Lc93/a;Lp31/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lat2/l;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/l;->x:Lc93/a;

    invoke-static {v1, v0, p1}, Lbs1/f;->c(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lat2/l;->x:Lc93/a;

    iget-object v1, p0, Lat2/l;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lb01/p;->d(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lat2/l;->x:Lc93/a;

    iget-object v1, p0, Lat2/l;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lat2/m;->v(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
