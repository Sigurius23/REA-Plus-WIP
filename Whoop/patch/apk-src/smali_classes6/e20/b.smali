.class public final Le20/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lv03/b;


# direct methods
.method public synthetic constructor <init>(Lv03/b;I)V
    .locals 0

    iput p2, p0, Le20/b;->w:I

    iput-object p1, p0, Le20/b;->x:Lv03/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Le20/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le20/b;->x:Lv03/b;

    invoke-virtual {v0}, Lv03/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/k4;

    const-string v1, "viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Le30/c;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv00/c0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Le20/b;->x:Lv03/b;

    invoke-static {v0}, Lv03/c;->a(Lv03/h;)Lu03/a;

    move-result-object v0

    const-string v1, "lazyRegistry"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lck1/c;

    const/16 v2, 0x19

    invoke-direct {v1, v0, v2}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
