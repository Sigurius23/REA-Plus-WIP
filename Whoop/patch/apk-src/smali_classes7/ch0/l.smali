.class public final synthetic Lch0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lch0/v0;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lch0/v0;Lbc3/c0;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lch0/l;->w:I

    iput-object p1, p0, Lch0/l;->x:Lch0/v0;

    iput-object p2, p0, Lch0/l;->y:Ljava/lang/Object;

    iput-object p3, p0, Lch0/l;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lch0/v0;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lch0/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/l;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch0/l;->x:Lch0/v0;

    iput-object p3, p0, Lch0/l;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lch0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/l;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lch0/l;->z:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    check-cast p1, Lzg0/g;

    iget-object v2, p0, Lch0/l;->x:Lch0/v0;

    invoke-static {v2, v0, v1, p1}, Lch0/c1;->c(Lch0/v0;Lbc3/c0;Lg1/y3;Lzg0/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/l;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lch0/l;->z:Ljava/lang/Object;

    check-cast v1, Ldp0/g;

    check-cast p1, Lp1/i0;

    iget-object v2, p0, Lch0/l;->x:Lch0/v0;

    invoke-static {v2, v0, v1, p1}, Lch0/c1;->n(Lch0/v0;Lbc3/c0;Ldp0/g;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lch0/l;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lch0/l;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Lp1/i0;

    iget-object v2, p0, Lch0/l;->x:Lch0/v0;

    invoke-static {v0, v2, v1, p1}, Lch0/n;->l(Lp1/c1;Lch0/v0;Ljava/lang/String;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
