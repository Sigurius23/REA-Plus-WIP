.class public final synthetic Lb61/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lb61/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb61/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb61/g;->y:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lb61/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb61/g;->y:Lp1/c1;

    iput-object p2, p0, Lb61/g;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb61/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb61/g;->y:Lp1/c1;

    check-cast p1, Ll3/r0;

    iget-object v1, p0, Lb61/g;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lh01/p;->f(Lkotlin/jvm/functions/Function1;Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb61/g;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ld61/a;

    iget-object v1, p0, Lb61/g;->y:Lp1/c1;

    invoke-static {v1, v0, p1}, Lb61/k;->m(Lp1/c1;Lkotlin/jvm/functions/Function1;Ld61/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
