.class final Lie2/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie2/c;->f(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lie2/b;",
        "prevDomainState",
        "Lie2/a;",
        "domainAction",
        "<anonymous>",
        "(Lie2/b;Lie2/a;)Lie2/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.shepherd.feature.togglesettings.domain.ShepherdToggleSettingsInteractor$interact$1"
    f = "ShepherdToggleSettingsInteractor.kt"
    l = {
        0x18,
        0x2f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lie2/c;


# direct methods
.method public constructor <init>(Lie2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie2/c;",
            "Lq83/d<",
            "-",
            "Lie2/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lie2/c$c;->z:Lie2/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lie2/b;Lie2/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie2/b;",
            "Lie2/a;",
            "Lq83/d<",
            "-",
            "Lie2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lie2/c$c;

    iget-object v1, p0, Lie2/c$c;->z:Lie2/c;

    invoke-direct {v0, v1, p3}, Lie2/c$c;-><init>(Lie2/c;Lq83/d;)V

    iput-object p1, v0, Lie2/c$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lie2/c$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lie2/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lie2/b;

    check-cast p2, Lie2/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lie2/c$c;->f(Lie2/b;Lie2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lie2/c$c;->x:Ljava/lang/Object;

    check-cast v0, Lie2/b;

    iget-object v1, p0, Lie2/c$c;->y:Ljava/lang/Object;

    check-cast v1, Lie2/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lie2/c$c;->w:I

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v3, :cond_2

    if-eq v3, v4, :cond_1

    if-ne v3, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lie2/a$b;->a:Lie2/a$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lie2/c$c;->z:Lie2/c;

    iput-object v3, p0, Lie2/c$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lie2/c$c;->y:Ljava/lang/Object;

    iput v4, p0, Lie2/c$c;->w:I

    invoke-static {p1, v0, p0}, Lie2/c;->a(Lie2/c;Lie2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto/16 :goto_3

    :cond_3
    :goto_0
    check-cast p1, Lie2/b;

    return-object p1

    :cond_4
    instance-of p1, v1, Lie2/a$c;

    const-string v4, "off"

    const-string v6, "on"

    if-eqz p1, :cond_6

    iget-object p1, p0, Lie2/c$c;->z:Lie2/c;

    invoke-static {p1}, Lie2/c;->b(Lie2/c;)Lfi0/a;

    move-result-object v7

    check-cast v1, Lie2/a$c;

    invoke-virtual {v1}, Lie2/a$c;->a()Z

    move-result p1

    if-eqz p1, :cond_5

    move-object v12, v6

    goto :goto_1

    :cond_5
    move-object v12, v4

    :goto_1
    const-string v8, "ANF"

    const-string v9, "Toggle"

    const-string v10, "Afib Detection"

    const-string v11, "ANF"

    invoke-interface/range {v7 .. v12}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lie2/d$e;

    invoke-virtual {v1}, Lie2/a$c;->a()Z

    move-result v2

    invoke-virtual {v1}, Lie2/a$c;->b()Z

    move-result v1

    invoke-direct {p1, v2, v1}, Lie2/d$e;-><init>(ZZ)V

    invoke-static {v0, p1, v3, v5, v3}, Lie2/b;->b(Lie2/b;Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;ILjava/lang/Object;)Lie2/b;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v1, Lie2/a$d;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lie2/c$c;->z:Lie2/c;

    invoke-static {p1}, Lie2/c;->b(Lie2/c;)Lfi0/a;

    move-result-object v7

    check-cast v1, Lie2/a$d;

    invoke-virtual {v1}, Lie2/a$d;->b()Z

    move-result p1

    if-eqz p1, :cond_7

    move-object v12, v6

    goto :goto_2

    :cond_7
    move-object v12, v4

    :goto_2
    const-string v8, "ANF"

    const-string v9, "Toggle"

    const-string v10, "Arrhythmia Notification"

    const-string v11, "ANF"

    invoke-interface/range {v7 .. v12}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lie2/d$e;

    invoke-virtual {v1}, Lie2/a$d;->a()Z

    move-result v2

    invoke-virtual {v1}, Lie2/a$d;->b()Z

    move-result v1

    invoke-direct {p1, v2, v1}, Lie2/d$e;-><init>(ZZ)V

    invoke-static {v0, p1, v3, v5, v3}, Lie2/b;->b(Lie2/b;Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;ILjava/lang/Object;)Lie2/b;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, v1, Lie2/a$e;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lie2/c$c;->z:Lie2/c;

    check-cast v1, Lie2/a$e;

    invoke-virtual {v1}, Lie2/a$e;->a()Z

    move-result v4

    invoke-virtual {v1}, Lie2/a$e;->b()Z

    move-result v1

    iput-object v3, p0, Lie2/c$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lie2/c$c;->y:Ljava/lang/Object;

    iput v5, p0, Lie2/c$c;->w:I

    invoke-static {p1, v0, v4, v1, p0}, Lie2/c;->d(Lie2/c;Lie2/b;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_9

    :goto_3
    return-object v2

    :cond_9
    :goto_4
    check-cast p1, Lie2/b;

    return-object p1

    :cond_a
    sget-object p1, Lie2/a$a;->a:Lie2/a$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p1, Lie2/d$c;->a:Lie2/d$c;

    invoke-static {v0, p1, v3, v5, v3}, Lie2/b;->b(Lie2/b;Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;ILjava/lang/Object;)Lie2/b;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
