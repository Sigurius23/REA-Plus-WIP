.class public final synthetic Lch0/c;
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

    iput p2, p0, Lch0/c;->w:I

    iput-object p1, p0, Lch0/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lch0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lch0/w0;->d(Landroid/content/Context;Landroid/net/Uri;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/c;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lch0/n;->n(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
