.class public final synthetic Lcg/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcg/j;

.field public final synthetic y:Lcg/t;


# direct methods
.method public synthetic constructor <init>(Lcg/j;Lcg/t;I)V
    .locals 0

    iput p3, p0, Lcg/m;->w:I

    iput-object p1, p0, Lcg/m;->x:Lcg/j;

    iput-object p2, p0, Lcg/m;->y:Lcg/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcg/m;->w:I

    check-cast p1, Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcg/q;->d:Lcg/q;

    iget-object v1, p0, Lcg/m;->y:Lcg/t;

    invoke-virtual {v1, v0}, Lcg/t;->a(Lcg/t;)Z

    move-result v0

    iget-object v1, p0, Lcg/m;->x:Lcg/j;

    if-eqz v0, :cond_0

    sget-object v0, Ltg/g;->k:Ltg/g;

    invoke-interface {v0, p1}, Ltg/e;->d(Ljava/lang/String;)Ltg/b;

    move-result-object p1

    iput-object p1, v1, Lcg/j;->G:Ltg/b;

    goto :goto_0

    :cond_0
    sget-object v0, Ltg/g;->k:Ltg/g;

    invoke-interface {v0, p1}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object p1

    iput-object p1, v1, Lcg/j;->G:Ltg/b;

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcg/m;->x:Lcg/j;

    iget-object v0, v0, Lcg/j;->E:Lcg/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcg/s;->d:Lcg/s;

    iget-object v2, p0, Lcg/m;->y:Lcg/t;

    invoke-virtual {v2, v1}, Lcg/t;->a(Lcg/t;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcg/g;->z:Lhf/h;

    invoke-virtual {v0, v1, p1}, Lcg/g;->c(Lhf/h;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcg/g;->y:Lhf/h;

    invoke-virtual {v0, v1, p1}, Lcg/g;->c(Lhf/h;Ljava/lang/String;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
