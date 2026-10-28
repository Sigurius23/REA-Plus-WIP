.class public final synthetic Luu2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:I

.field public final synthetic x:Lqi0/a;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lqi0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p5, p0, Luu2/v;->w:I

    iput-object p1, p0, Luu2/v;->x:Lqi0/a;

    iput-object p2, p0, Luu2/v;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Luu2/v;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Luu2/v;->E:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Luu2/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luu2/v;->E:Lkotlin/jvm/functions/Function1;

    check-cast p1, La81/t;

    iget-object v1, p0, Luu2/v;->x:Lqi0/a;

    iget-object v2, p0, Luu2/v;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Luu2/v;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v3, v0, p1}, Luu2/w;->d(Lqi0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Luu2/v;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Luu2/v;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Luu2/v;->x:Lqi0/a;

    iget-object v3, p0, Luu2/v;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v0, v1, p1}, Luu2/w;->r(Lqi0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Luu2/v;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Luu2/v;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Luu2/v;->x:Lqi0/a;

    iget-object v3, p0, Luu2/v;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v0, v1, p1}, Luu2/w;->b(Lqi0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
