.class public final synthetic Ld30/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh20/z4;


# direct methods
.method public synthetic constructor <init>(Lh20/z4;I)V
    .locals 0

    iput p2, p0, Ld30/g;->w:I

    iput-object p1, p0, Ld30/g;->x:Lh20/z4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ld30/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Ld30/g;->x:Lh20/z4;

    iget-object v0, v0, Lh20/z4;->a:Ljava/lang/Object;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv00/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lv00/c0;->R(Ljava/lang/String;)Lu00/f;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p1, Lu00/f;->c:Lzy/c;

    :cond_0
    invoke-static {v1}, Ls4/i;->p(Lzy/c;)Lzy/c;

    move-result-object v1

    :cond_1
    invoke-static {v1}, Ls4/i;->p(Lzy/c;)Lzy/c;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lh20/l;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld30/g;->x:Lh20/z4;

    invoke-virtual {v0, p1}, Lh20/z4;->f(Lh20/l;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
