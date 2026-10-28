.class public final synthetic Lmn1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lmn1/d;->w:I

    iput-object p1, p0, Lmn1/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmn1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmn1/d;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    invoke-static {v0}, Lmn1/c$l;->f(Lp1/t2;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmn1/d;->x:Ljava/lang/Object;

    check-cast v0, Lj31/k;

    invoke-static {v0}, Lmn1/c$k;->f(Lj31/k;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
