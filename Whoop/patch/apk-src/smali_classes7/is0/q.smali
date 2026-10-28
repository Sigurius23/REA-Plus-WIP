.class public final synthetic Lis0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lis0/a0;


# direct methods
.method public synthetic constructor <init>(Lis0/a0;I)V
    .locals 0

    iput p2, p0, Lis0/q;->w:I

    iput-object p1, p0, Lis0/q;->x:Lis0/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lis0/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/q;->x:Lis0/a0;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lis0/p;->d(Lis0/a0;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lis0/q;->x:Lis0/a0;

    check-cast p1, Lh2/b;

    invoke-static {v0, p1}, Lis0/p$e;->a(Lis0/a0;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
