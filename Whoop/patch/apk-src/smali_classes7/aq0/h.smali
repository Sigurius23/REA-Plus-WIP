.class public final synthetic Laq0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leq0/n0;

.field public final synthetic y:Laq0/q;


# direct methods
.method public synthetic constructor <init>(Laq0/q;Leq0/n0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Laq0/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq0/h;->y:Laq0/q;

    iput-object p2, p0, Laq0/h;->x:Leq0/n0;

    return-void
.end method

.method public synthetic constructor <init>(Leq0/n0;Laq0/q;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Laq0/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq0/h;->x:Leq0/n0;

    iput-object p2, p0, Laq0/h;->y:Laq0/q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Laq0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laq0/h;->y:Laq0/q;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Laq0/h;->x:Leq0/n0;

    invoke-static {v0, v1, p1}, Laq0/q;->r0(Laq0/q;Leq0/n0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Laq0/h;->x:Leq0/n0;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Laq0/h;->y:Laq0/q;

    invoke-static {v1, v0, p1}, Laq0/q;->s0(Laq0/q;Leq0/n0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
