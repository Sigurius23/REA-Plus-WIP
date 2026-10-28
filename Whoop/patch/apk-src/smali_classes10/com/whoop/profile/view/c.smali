.class public final synthetic Lcom/whoop/profile/view/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ln0/u;


# direct methods
.method public synthetic constructor <init>(Ln0/u;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/profile/view/c;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/c;->x:Ln0/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/c;->x:Ln0/u;

    invoke-static {v0}, Lzr1/c;->h(Ln0/u;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/c;->x:Ln0/u;

    invoke-static {v0}, Lr71/b;->d(Ln0/u;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/profile/view/c;->x:Ln0/u;

    iget-object v0, v0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/profile/view/c;->x:Ln0/u;

    invoke-static {v0}, Lcom/whoop/profile/view/ProfileScreenContentKt;->n(Ln0/u;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
