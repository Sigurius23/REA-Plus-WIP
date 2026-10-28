.class public final synthetic Lnv1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lnv1/h;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lnv1/h;I)V
    .locals 0

    iput p3, p0, Lnv1/a;->w:I

    iput-object p1, p0, Lnv1/a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lnv1/a;->y:Lnv1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lnv1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnv1/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnv1/a;->y:Lnv1/h;

    invoke-static {v0, v1}, Lnv1/g;->d(Lkotlin/jvm/functions/Function1;Lnv1/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lnv1/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnv1/a;->y:Lnv1/h;

    invoke-static {v0, v1}, Lnv1/c;->k(Lkotlin/jvm/functions/Function1;Lnv1/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lnv1/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnv1/a;->y:Lnv1/h;

    invoke-static {v0, v1}, Lnv1/c;->c(Lkotlin/jvm/functions/Function1;Lnv1/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
