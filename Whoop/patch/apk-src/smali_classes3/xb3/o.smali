.class public final Lxb3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb3/i;


# instance fields
.field public final synthetic a:I

.field public final b:Lxb3/i;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lxb3/i;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxb3/o;->a:I

    iput-object p1, p0, Lxb3/o;->b:Lxb3/i;

    iput-object p2, p0, Lxb3/o;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lxb3/i;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxb3/o;->a:I

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lxb3/o;->b:Lxb3/i;

    .line 4
    iput-object p2, p0, Lxb3/o;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget v0, p0, Lxb3/o;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La0/t0;

    invoke-direct {v0, p0}, La0/t0;-><init>(Lxb3/o;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lxb3/r;

    invoke-direct {v0, p0}, Lxb3/r;-><init>(Lxb3/o;)V

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lxb3/o;->b:Lxb3/i;

    invoke-interface {v1}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lxb3/o;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Comparator;

    invoke-static {v0, v1}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
