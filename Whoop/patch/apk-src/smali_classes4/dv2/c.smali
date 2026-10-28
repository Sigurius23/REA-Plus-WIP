.class public final Ldv2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ldv2/c;",
        "",
        "<init>",
        "()V",
        "Lcv2/g;",
        "domainState",
        "Ldv2/b$k;",
        "a",
        "(Lcv2/g;)Ldv2/b$k;",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcv2/g;)Ldv2/b$k;
    .locals 3

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcv2/g$a;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Lcv2/g$a;

    invoke-virtual {v1}, Lcv2/g$a;->e()Lcv2/c;

    move-result-object v2

    instance-of v2, v2, Lcv2/c$b;

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lcv2/g$a;->i()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance p1, Ldv2/b$h;

    invoke-virtual {v1}, Lcv2/g$a;->e()Lcv2/c;

    move-result-object v0

    check-cast v0, Lcv2/c$b;

    invoke-virtual {v0}, Lcv2/c$b;->a()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1}, Lcv2/g$a;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$g;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$g;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

    :goto_0
    invoke-direct {p1, v0, v1}, Ldv2/b$h;-><init>(Ljava/lang/Integer;Lcom/whoop/weightlifting/StrengthTrainerDestination;)V

    return-object p1

    :cond_1
    if-eqz v0, :cond_2

    check-cast p1, Lcv2/g$a;

    invoke-virtual {p1}, Lcv2/g$a;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcv2/g$a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, Ldv2/b$m;

    invoke-virtual {p1}, Lcv2/g$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ldv2/b$m;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
