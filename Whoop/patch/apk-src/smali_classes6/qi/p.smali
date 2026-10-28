.class public final synthetic Lqi/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/v;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqi/w;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(Lqi/w;FI)V
    .locals 0

    iput p3, p0, Lqi/p;->a:I

    iput-object p1, p0, Lqi/p;->b:Lqi/w;

    iput p2, p0, Lqi/p;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lqi/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqi/p;->b:Lqi/w;

    iget-object v1, v0, Lqi/w;->w:Lqi/i;

    iget v2, p0, Lqi/p;->c:F

    if-nez v1, :cond_0

    iget-object v1, v0, Lqi/w;->F:Ljava/util/ArrayList;

    new-instance v3, Lqi/p;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v2, v4}, Lqi/p;-><init>(Lqi/w;FI)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget v3, v1, Lqi/i;->l:F

    iget v1, v1, Lqi/i;->m:F

    invoke-static {v3, v1, v2}, Ldj/g;->f(FFF)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lqi/w;->u(I)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lqi/p;->b:Lqi/w;

    iget-object v1, v0, Lqi/w;->w:Lqi/i;

    iget v2, p0, Lqi/p;->c:F

    if-nez v1, :cond_1

    iget-object v1, v0, Lqi/w;->F:Ljava/util/ArrayList;

    new-instance v3, Lqi/p;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v2, v4}, Lqi/p;-><init>(Lqi/w;FI)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    iget v3, v1, Lqi/i;->l:F

    iget v1, v1, Lqi/i;->m:F

    invoke-static {v3, v1, v2}, Ldj/g;->f(FFF)F

    move-result v1

    iget v2, v0, Ldj/e;->J:F

    invoke-virtual {v0, v2, v1}, Ldj/e;->i(FF)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
