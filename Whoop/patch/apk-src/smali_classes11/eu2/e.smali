.class public final synthetic Leu2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lz1/p;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Lz1/p;)V
    .locals 0

    iput p1, p0, Leu2/e;->w:I

    iput-object p3, p0, Leu2/e;->x:Lz1/p;

    iput-object p2, p0, Leu2/e;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Leu2/e;->w:I

    check-cast p1, Lj31/d;

    check-cast p2, Lj31/d;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leu2/e;->x:Lz1/p;

    iget-object v1, p0, Leu2/e;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lln1/k;->a(Lz1/p;Lkotlin/jvm/functions/Function1;Lj31/d;Lj31/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Leu2/e;->x:Lz1/p;

    iget-object v1, p0, Leu2/e;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Leu2/g;->h(Lz1/p;Lkotlin/jvm/functions/Function1;Lj31/d;Lj31/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
