.class public final synthetic Lhb2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p5, p0, Lhb2/a;->w:I

    iput-object p1, p0, Lhb2/a;->x:Lp1/c1;

    iput-object p2, p0, Lhb2/a;->y:Lp1/c1;

    iput-object p3, p0, Lhb2/a;->z:Lp1/c1;

    iput-object p4, p0, Lhb2/a;->E:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lhb2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhb2/a;->E:Lp1/c1;

    check-cast p1, La71/a;

    iget-object v1, p0, Lhb2/a;->x:Lp1/c1;

    iget-object v2, p0, Lhb2/a;->y:Lp1/c1;

    iget-object v3, p0, Lhb2/a;->z:Lp1/c1;

    invoke-static {v1, v2, v3, v0, p1}, Llf0/t;->b(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;La71/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhb2/a;->z:Lp1/c1;

    iget-object v1, p0, Lhb2/a;->E:Lp1/c1;

    iget-object v2, p0, Lhb2/a;->x:Lp1/c1;

    iget-object v3, p0, Lhb2/a;->y:Lp1/c1;

    invoke-static {v2, v3, v0, v1, p1}, Lhb2/b;->d(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
