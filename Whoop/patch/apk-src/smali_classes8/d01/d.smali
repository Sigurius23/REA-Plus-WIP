.class public final synthetic Ld01/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Ld01/d;->w:I

    sget-object v0, Lg1/d7;->a:Ld0/i1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld01/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Ld01/d;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Ld01/d;->w:I

    iput-object p1, p0, Ld01/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Ld01/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Ld01/d;->w:I

    iput-object p1, p0, Ld01/d;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ld01/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ld01/d;->w:I

    iget-object v1, p0, Ld01/d;->y:Ljava/lang/Object;

    iget-object v2, p0, Ld01/d;->x:Lkotlin/jvm/functions/Function1;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1, v2}, Lu01/d;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {v1, v2}, Lo11/l;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {v1, v2}, Lo11/l;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {v1, v2}, Lo11/g;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {v1, v2}, Lo11/g;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {v1, v2}, Lo11/g;->j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {v1, v2}, Lny0/l0;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    sget-object v0, Lg1/d7;->a:Ld0/i1;

    new-instance v0, Lg1/n7;

    invoke-direct {v0, v1, v2}, Lg1/n7;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-object v0

    :pswitch_7
    invoke-static {v1, v2}, Lfo2/c;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {v1, v2}, Le41/j;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {v1, v2}, Le41/g;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {v1, v2}, Ld01/e;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
