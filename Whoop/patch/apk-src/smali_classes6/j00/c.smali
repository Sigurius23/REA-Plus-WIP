.class public final Lj00/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final a:Lj00/d0;

.field public final b:Lj00/i0;

.field public final c:Ljava/lang/Boolean;

.field public final d:Ln20/e;


# direct methods
.method public constructor <init>(Lj00/d0;Lj00/i0;Ljava/lang/Boolean;Ln20/e;)V
    .locals 1

    const-string v0, "signupMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkComponent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj00/c;->a:Lj00/d0;

    iput-object p2, p0, Lj00/c;->b:Lj00/i0;

    iput-object p3, p0, Lj00/c;->c:Ljava/lang/Boolean;

    iput-object p4, p0, Lj00/c;->d:Ln20/e;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 9

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lj00/c;->d:Ln20/e;

    iget v0, p1, Ln20/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Ln20/e;->g:Lv03/e;

    iget-object p1, p1, Lv03/e;->w:Ljava/lang/Object;

    check-cast p1, Lc00/b;

    goto :goto_0

    :pswitch_0
    iget-object p1, p1, Ln20/e;->g:Lv03/e;

    iget-object p1, p1, Lv03/e;->w:Ljava/lang/Object;

    check-cast p1, Lc00/b;

    goto :goto_0

    :pswitch_1
    iget-object p1, p1, Ln20/e;->g:Lv03/e;

    iget-object p1, p1, Lv03/e;->w:Ljava/lang/Object;

    check-cast p1, Lc00/b;

    goto :goto_0

    :pswitch_2
    iget-object p1, p1, Ln20/e;->g:Lv03/e;

    iget-object p1, p1, Lv03/e;->w:Ljava/lang/Object;

    check-cast p1, Lc00/b;

    :goto_0
    iget-object p1, p1, Lc00/b;->a:Lj00/i;

    iget-object v0, p1, Lj00/i;->a:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lwz/g0;

    iget-object v0, p1, Lj00/i;->b:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lxz/x;

    iget-object v0, p1, Lj00/i;->c:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lyz/b;

    iget-object p1, p1, Lj00/i;->d:Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lqy/d;

    new-instance v1, Lj00/h;

    iget-object v2, p0, Lj00/c;->b:Lj00/i0;

    iget-object v3, p0, Lj00/c;->a:Lj00/d0;

    iget-object v4, p0, Lj00/c;->c:Ljava/lang/Boolean;

    invoke-direct/range {v1 .. v8}, Lj00/h;-><init>(Lj00/i0;Lj00/d0;Ljava/lang/Boolean;Lwz/g0;Lxz/x;Lyz/b;Lqy/d;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
