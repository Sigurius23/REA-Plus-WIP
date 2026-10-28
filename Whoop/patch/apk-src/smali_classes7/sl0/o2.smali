.class public final synthetic Lsl0/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lc93/m;Landroid/content/Context;I)V
    .locals 0

    iput p4, p0, Lsl0/o2;->w:I

    iput-object p1, p0, Lsl0/o2;->x:Lp1/c1;

    iput-object p2, p0, Lsl0/o2;->y:Lc93/m;

    iput-object p3, p0, Lsl0/o2;->z:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsl0/o2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/o2;->z:Landroid/content/Context;

    check-cast p1, Lj/a;

    iget-object v1, p0, Lsl0/o2;->x:Lp1/c1;

    iget-object v2, p0, Lsl0/o2;->y:Lc93/m;

    invoke-static {v1, v2, v0, p1}, Lsl0/p2;->b(Lp1/c1;Lc93/m;Landroid/content/Context;Lj/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsl0/o2;->x:Lp1/c1;

    iget-object v1, p0, Lsl0/o2;->y:Lc93/m;

    iget-object v2, p0, Lsl0/o2;->z:Landroid/content/Context;

    invoke-static {v0, v1, v2, p1}, Lsl0/p2;->d(Lp1/c1;Lc93/m;Landroid/content/Context;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
