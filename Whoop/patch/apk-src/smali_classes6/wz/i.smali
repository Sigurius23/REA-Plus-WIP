.class public final synthetic Lwz/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lwz/y;


# direct methods
.method public synthetic constructor <init>(Lwz/y;I)V
    .locals 0

    iput p2, p0, Lwz/i;->w:I

    iput-object p1, p0, Lwz/i;->x:Lwz/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lwz/i;->w:I

    const-string v1, "result"

    iget-object v2, p0, Lwz/i;->x:Lwz/y;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lwz/w1;

    sget v0, Lcom/stripe/android/link/LinkActivity;->E:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v2, Lwz/y;->w:Lc00/a;

    iget-object v0, v0, Lc00/a;->k0:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/s1;

    iget-object v0, v0, Lwz/s1;->b:Lec3/w1;

    invoke-virtual {v0, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    check-cast p1, Lwz/q;

    sget v0, Lcom/stripe/android/link/LinkActivity;->E:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, p1}, Lwz/y;->l(Lwz/q;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
