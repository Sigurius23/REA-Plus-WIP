.class final Lrg0/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrg0/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg0/c$a$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lrg0/c;


# direct methods
.method public constructor <init>(Lrg0/c;)V
    .locals 0

    iput-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lnl0/m;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl0/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lrg0/c$a$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1, v0}, Lrg0/c;->h(Lrg0/c;Z)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1, p2}, Lrg0/c;->g(Lrg0/c;Ljava/lang/Long;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    const-string p2, "terminal"

    invoke-static {p1, p2}, Lrg0/c;->f(Lrg0/c;Ljava/lang/String;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1}, Lrg0/c;->a(Lrg0/c;)Lrg0/b;

    move-result-object p1

    new-instance p2, Lrg0/a$d0;

    iget-object v1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-virtual {v1}, Lrg0/c;->i()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Lrg0/a$d0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lrg0/b;->a(Lrg0/a;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1}, Lrg0/c;->c(Lrg0/c;)Ltr2/n;

    move-result-object p1

    const-string p2, "Terminal error occurred"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_0

    :pswitch_1
    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1, v0}, Lrg0/c;->h(Lrg0/c;Z)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1, p2}, Lrg0/c;->g(Lrg0/c;Ljava/lang/Long;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1}, Lrg0/c;->c(Lrg0/c;)Ltr2/n;

    move-result-object p1

    const-string p2, "Response received or error occurred"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_0

    :pswitch_2
    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1, v0}, Lrg0/c;->h(Lrg0/c;Z)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1, p2}, Lrg0/c;->g(Lrg0/c;Ljava/lang/Long;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    const-string p2, "flagged"

    invoke-static {p1, p2}, Lrg0/c;->f(Lrg0/c;Ljava/lang/String;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1}, Lrg0/c;->a(Lrg0/c;)Lrg0/b;

    move-result-object p1

    new-instance p2, Lrg0/a$d0;

    iget-object v1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-virtual {v1}, Lrg0/c;->i()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Lrg0/a$d0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lrg0/b;->a(Lrg0/a;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1}, Lrg0/c;->c(Lrg0/c;)Ltr2/n;

    move-result-object p1

    const-string p2, "Message flagged, retry view shown"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1, v0}, Lrg0/c;->h(Lrg0/c;Z)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1, p2}, Lrg0/c;->g(Lrg0/c;Ljava/lang/Long;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    const-string p2, "retryable"

    invoke-static {p1, p2}, Lrg0/c;->f(Lrg0/c;Ljava/lang/String;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1}, Lrg0/c;->a(Lrg0/c;)Lrg0/b;

    move-result-object p1

    new-instance p2, Lrg0/a$d0;

    iget-object v1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-virtual {v1}, Lrg0/c;->i()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Lrg0/a$d0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lrg0/b;->a(Lrg0/a;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1}, Lrg0/c;->c(Lrg0/c;)Ltr2/n;

    move-result-object p1

    const-string p2, "Response error occurred"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :pswitch_4
    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1}, Lrg0/c;->b(Lrg0/c;)Lzr2/a;

    move-result-object p2

    invoke-interface {p2}, Lzr2/a;->b()J

    move-result-wide v1

    new-instance p2, Ljava/lang/Long;

    invoke-direct {p2, v1, v2}, Ljava/lang/Long;-><init>(J)V

    invoke-static {p1, p2}, Lrg0/c;->g(Lrg0/c;Ljava/lang/Long;)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lrg0/c;->h(Lrg0/c;Z)V

    iget-object p1, p0, Lrg0/c$a$a;->w:Lrg0/c;

    invoke-static {p1}, Lrg0/c;->c(Lrg0/c;)Ltr2/n;

    move-result-object p1

    const-string p2, "Message sent, waiting for response"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_0
    :pswitch_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnl0/m;

    invoke-virtual {p0, p1, p2}, Lrg0/c$a$a;->b(Lnl0/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
