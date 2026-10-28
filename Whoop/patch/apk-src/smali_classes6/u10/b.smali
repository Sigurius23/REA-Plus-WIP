.class public final synthetic Lu10/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu10/d;


# direct methods
.method public synthetic constructor <init>(Lu10/d;I)V
    .locals 0

    iput p2, p0, Lu10/b;->w:I

    iput-object p1, p0, Lu10/b;->x:Lu10/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lu10/b;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lu10/b;->x:Lu10/d;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly00/o4;

    iget-object v0, v2, Lu10/d;->d:Ls10/f;

    iget-object v2, v0, Ls10/f;->b:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq20/y;

    iget-object v3, p1, Ly00/o4;->w:Ljava/lang/String;

    instance-of v4, v2, Lq20/w;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v2, Lq20/w;

    goto :goto_0

    :cond_0
    move-object v2, v5

    :goto_0
    if-eqz v2, :cond_1

    iget-object v2, v2, Lq20/w;->x:Ly00/o4;

    if-eqz v2, :cond_1

    iget-object v2, v2, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v2, v5

    :goto_1
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lq20/w;

    invoke-direct {v2, p1, v5, v5}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    invoke-virtual {v0, v2}, Ls10/f;->a(Lq20/y;)V

    :cond_2
    return-object v1

    :pswitch_0
    check-cast p1, Ly00/i;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v2, Lu10/d;->e:Lk20/a;

    sget-object v2, Lk20/c;->w:[Lk20/c;

    invoke-virtual {v0, p1}, Lk20/a;->j(Ly00/i;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
