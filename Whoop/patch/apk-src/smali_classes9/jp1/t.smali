.class public final synthetic Ljp1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lz1/p;

.field public final synthetic w:I

.field public final synthetic x:Lhp1/m;

.field public final synthetic y:Lz1/p;

.field public final synthetic z:Lz1/p;


# direct methods
.method public synthetic constructor <init>(Lhp1/m;Lz1/p;Lz1/p;Lz1/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ljp1/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp1/t;->x:Lhp1/m;

    iput-object p2, p0, Ljp1/t;->y:Lz1/p;

    iput-object p3, p0, Ljp1/t;->z:Lz1/p;

    iput-object p4, p0, Ljp1/t;->E:Lz1/p;

    return-void
.end method

.method public synthetic constructor <init>(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ljp1/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp1/t;->y:Lz1/p;

    iput-object p2, p0, Ljp1/t;->x:Lhp1/m;

    iput-object p3, p0, Ljp1/t;->z:Lz1/p;

    iput-object p4, p0, Ljp1/t;->E:Lz1/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ljp1/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljp1/t;->E:Lz1/p;

    check-cast p1, Ln0/q;

    iget-object v1, p0, Ljp1/t;->x:Lhp1/m;

    iget-object v2, p0, Ljp1/t;->y:Lz1/p;

    iget-object v3, p0, Ljp1/t;->z:Lz1/p;

    invoke-static {v1, v2, v3, v0, p1}, Ljp1/u;->f(Lhp1/m;Lz1/p;Lz1/p;Lz1/p;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljp1/t;->E:Lz1/p;

    check-cast p1, Lp1/i0;

    iget-object v1, p0, Ljp1/t;->y:Lz1/p;

    iget-object v2, p0, Ljp1/t;->x:Lhp1/m;

    iget-object v3, p0, Ljp1/t;->z:Lz1/p;

    invoke-static {v1, v2, v3, v0, p1}, Ljp1/u;->l(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
