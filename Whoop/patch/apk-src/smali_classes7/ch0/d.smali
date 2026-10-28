.class public final synthetic Lch0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lch0/d;->w:I

    iput-object p1, p0, Lch0/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lch0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/net/Uri;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, p1, p2}, Lch0/m0;->g(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/d;->x:Ljava/lang/Object;

    check-cast v0, Lz1/s;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {v0, p1, p2}, Lch0/n;->e(Lz1/s;Ljava/lang/String;F)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
