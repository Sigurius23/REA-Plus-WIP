.class public final synthetic Lvf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvf/g;


# direct methods
.method public synthetic constructor <init>(Lvf/g;I)V
    .locals 0

    iput p2, p0, Lvf/f;->w:I

    iput-object p1, p0, Lvf/f;->x:Lvf/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lvf/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvf/f;->x:Lvf/g;

    iget-object v0, v0, Lvf/g;->a:Lvf/b;

    iget-object v0, v0, Lvf/b;->E:Lmf/c;

    invoke-virtual {v0}, Lmf/c;->Q()Lmf/d;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvf/f;->x:Lvf/g;

    iget-object v0, v0, Lvf/g;->a:Lvf/b;

    iget-object v0, v0, Lvf/b;->y:Lmf/c;

    new-instance v1, Lmf/i;

    iget-object v0, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    const-string v2, "values"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lgf/u;-><init>(Ljava/util/Map;)V

    return-object v1

    :pswitch_1
    iget-object v0, p0, Lvf/f;->x:Lvf/g;

    iget-object v0, v0, Lvf/g;->a:Lvf/b;

    iget-object v0, v0, Lvf/b;->x:Lcg/j;

    invoke-virtual {v0}, Lcg/j;->b()Lcg/o;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
