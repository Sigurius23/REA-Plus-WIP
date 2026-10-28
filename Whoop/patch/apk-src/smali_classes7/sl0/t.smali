.class public final synthetic Lsl0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lsl0/q;Lg1/y3;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lsl0/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/t;->x:Ljava/lang/Object;

    iput-object p2, p0, Lsl0/t;->y:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/t;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lsl0/t;->w:I

    iput-object p1, p0, Lsl0/t;->x:Ljava/lang/Object;

    iput-object p2, p0, Lsl0/t;->z:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/t;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsl0/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/t;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lsl0/t;->z:Ljava/lang/Object;

    check-cast v1, Ll3/g;

    iget-object v2, p0, Lsl0/t;->y:Ljava/lang/Object;

    check-cast v2, Lb3/b3;

    check-cast p1, Lh2/b;

    invoke-static {v0, v1, v2, p1}, Lsl0/l2$b;->a(Lp1/c1;Ll3/g;Lb3/b3;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/t;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lsl0/t;->y:Ljava/lang/Object;

    check-cast v1, Lsl0/q;

    iget-object v2, p0, Lsl0/t;->z:Ljava/lang/Object;

    check-cast v2, Lg1/y3;

    check-cast p1, Lnl0/d;

    invoke-static {v0, v2, v1, p1}, Lsl0/w;->p(Lbc3/c0;Lg1/y3;Lsl0/q;Lnl0/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsl0/t;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lsl0/t;->z:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    iget-object v2, p0, Lsl0/t;->y:Ljava/lang/Object;

    check-cast v2, Lsl0/q;

    check-cast p1, Lnl0/d;

    invoke-static {v0, v1, v2, p1}, Lsl0/w;->b(Lbc3/c0;Lg1/y3;Lsl0/q;Lnl0/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
