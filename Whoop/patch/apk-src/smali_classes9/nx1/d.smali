.class public final synthetic Lnx1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljx1/o;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljx1/o;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lnx1/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnx1/d;->y:Lkotlin/jvm/functions/Function1;

    iput-object p1, p0, Lnx1/d;->x:Ljx1/o;

    return-void
.end method

.method public synthetic constructor <init>(Ljx1/o;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lnx1/d;->w:I

    iput-object p1, p0, Lnx1/d;->x:Ljx1/o;

    iput-object p2, p0, Lnx1/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lnx1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnx1/d;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnx1/d;->x:Ljx1/o;

    invoke-static {v1, v0}, Lnx1/e;->i(Ljx1/o;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lnx1/d;->x:Ljx1/o;

    iget-object v1, p0, Lnx1/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lnx1/e;->b(Ljx1/o;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lnx1/d;->x:Ljx1/o;

    iget-object v1, p0, Lnx1/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lnx1/e;->d(Ljx1/o;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
