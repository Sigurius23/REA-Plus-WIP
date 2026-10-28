.class public final synthetic Lh02/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    iput p2, p0, Lh02/z;->w:I

    iput-object p1, p0, Lh02/z;->x:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh02/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh02/z;->x:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj93/a0;

    invoke-interface {v0}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh02/z;->x:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj93/a0;

    invoke-interface {v0}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lh02/z;->x:Ljava/util/List;

    invoke-static {v0}, Lrs2/a;->k(Ljava/util/List;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lh02/z;->x:Ljava/util/List;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Integer;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lh02/z;->x:Ljava/util/List;

    invoke-static {v0}, Lh11/f;->e(Ljava/util/List;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lh02/z;->x:Ljava/util/List;

    invoke-static {v0}, Lh02/b0;->a(Ljava/util/List;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
