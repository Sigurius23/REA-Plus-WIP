.class public final synthetic Lno0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lno0/g;->w:I

    iput-object p1, p0, Lno0/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lno0/g;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lno0/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno0/g;->y:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lno0/g;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Lno0/l0;->t(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lno0/g;->y:Lp1/c1;

    check-cast p1, La81/t;

    iget-object v1, p0, Lno0/g;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lno0/i;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
