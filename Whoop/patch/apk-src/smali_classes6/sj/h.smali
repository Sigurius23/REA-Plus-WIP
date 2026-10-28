.class public final Lsj/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/a;

.field public final synthetic y:Lsj/l;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/a;Lsj/l;I)V
    .locals 0

    iput p3, p0, Lsj/h;->w:I

    iput-object p1, p0, Lsj/h;->x:Lcom/amplitude/android/engagement/a;

    iput-object p2, p0, Lsj/h;->y:Lsj/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsj/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsj/h;->y:Lsj/l;

    iget-object v1, v0, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v1

    iget v0, v0, Lsj/l;->c:I

    iget-object v2, p0, Lsj/h;->x:Lcom/amplitude/android/engagement/a;

    invoke-virtual {v2, v1, v0, p1}, Lcom/amplitude/android/engagement/a;->d(IILjava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsj/h;->y:Lsj/l;

    iget-object v1, v0, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v1

    iget v0, v0, Lsj/l;->c:I

    iget-object v2, p0, Lsj/h;->x:Lcom/amplitude/android/engagement/a;

    invoke-virtual {v2, v1, v0, p1}, Lcom/amplitude/android/engagement/a;->d(IILjava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
