.class public final synthetic Ljk1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfk1/a;


# direct methods
.method public synthetic constructor <init>(Lfk1/a;I)V
    .locals 0

    iput p2, p0, Ljk1/a;->w:I

    iput-object p1, p0, Ljk1/a;->x:Lfk1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljk1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljk1/a;->x:Lfk1/a;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Ljk1/b;->b(Lfk1/a;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljk1/a;->x:Lfk1/a;

    check-cast p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;

    invoke-static {v0, p1}, Ljk1/b;->j(Lfk1/a;Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;)Lnk1/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljk1/a;->x:Lfk1/a;

    check-cast p1, Lcom/whoop/healthspan/domain/models/ContributorsContainerResponse;

    invoke-static {v0, p1}, Ljk1/b;->e(Lfk1/a;Lcom/whoop/healthspan/domain/models/ContributorsContainerResponse;)Lik1/e;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ljk1/a;->x:Lfk1/a;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Ljk1/b;->c(Lfk1/a;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ljk1/a;->x:Lfk1/a;

    check-cast p1, Lcom/whoop/healthspan/domain/models/TileSectionModel;

    invoke-static {v0, p1}, Ljk1/b;->h(Lfk1/a;Lcom/whoop/healthspan/domain/models/TileSectionModel;)Lok1/a;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Ljk1/a;->x:Lfk1/a;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Ljk1/b;->g(Lfk1/a;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

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
