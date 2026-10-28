.class public final synthetic Lih0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lah0/i;

.field public final synthetic y:Lah0/h;


# direct methods
.method public synthetic constructor <init>(Lah0/i;Lah0/h;I)V
    .locals 0

    iput p3, p0, Lih0/u;->w:I

    iput-object p1, p0, Lih0/u;->x:Lah0/i;

    iput-object p2, p0, Lih0/u;->y:Lah0/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lih0/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lih0/u;->y:Lah0/h;

    check-cast p1, Ljava/util/Set;

    iget-object v1, p0, Lih0/u;->x:Lah0/i;

    invoke-static {v1, v0, p1}, Lih0/e0;->A(Lah0/i;Lah0/h;Ljava/util/Set;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lih0/u;->y:Lah0/h;

    check-cast p1, Lih0/d;

    iget-object v1, p0, Lih0/u;->x:Lah0/i;

    invoke-static {v1, v0, p1}, Lih0/e0;->g(Lah0/i;Lah0/h;Lih0/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
