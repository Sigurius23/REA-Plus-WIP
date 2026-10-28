.class public final synthetic Lvy0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lvy0/k;->w:I

    iput-object p1, p0, Lvy0/k;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvy0/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvy0/k;->x:Ljava/lang/Object;

    check-cast v0, Li2/t;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Lvy0/p;->e(Li2/t;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvy0/k;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lvy0/p;->z(Lc93/a;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
