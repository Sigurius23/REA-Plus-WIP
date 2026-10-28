.class public final Lr72/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lr72/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lr72/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lr72/a;)V",
        "Lfi0/a;",
        "sanguine_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr72/b;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Lr72/a;)V
    .locals 11

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr72/a$b;

    const-string v1, "source"

    if-eqz v0, :cond_0

    iget-object v2, p0, Lr72/b;->a:Lfi0/a;

    check-cast p1, Lr72/a$b;

    invoke-virtual {p1}, Lr72/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string v3, "bloodwork"

    const-string v4, "join_waitlist"

    const/4 v5, 0x0

    const-string v6, "Bloodwork"

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p1, Lr72/a$h;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lr72/b;->a:Lfi0/a;

    check-cast p1, Lr72/a$h;

    invoke-virtual {p1}, Lr72/a$h;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lr72/a$h;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "joined"

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_1
    const-string v0, "not_joined"

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lr72/a$h;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    const-string v3, "bloodwork"

    const-string v4, "view_details"

    const-string v6, "Bloodwork"

    invoke-interface/range {v2 .. v8}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_2
    instance-of v0, p1, Lr72/a$f;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lr72/b;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "bloodwork"

    const-string v3, "life_upgrade"

    const/4 v4, 0x0

    const-string v5, "Bloodwork"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3
    instance-of v0, p1, Lr72/a$c;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lr72/b;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "bloodwork"

    const-string v3, "waitlist_share"

    const/4 v4, 0x0

    const-string v5, "Bloodwork"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_4
    instance-of v0, p1, Lr72/a$g;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lr72/b;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "bloodwork"

    const-string v3, "all_biomarkers"

    const/4 v4, 0x0

    const-string v5, "Bloodwork"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_5
    instance-of v0, p1, Lr72/a$d;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lr72/b;->a:Lfi0/a;

    check-cast p1, Lr72/a$d;

    invoke-virtual {p1}, Lr72/a$d;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x24

    const/4 v9, 0x0

    const-string v2, "bloodwork"

    const-string v3, "bloodwork_category"

    const/4 v4, 0x0

    const-string v5, "Bloodwork"

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_6
    instance-of v0, p1, Lr72/a$e;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lr72/b;->a:Lfi0/a;

    check-cast p1, Lr72/a$e;

    invoke-virtual {p1}, Lr72/a$e;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x24

    const/4 v9, 0x0

    const-string v2, "bloodwork"

    const-string v3, "bloodwork_faq"

    const/4 v4, 0x0

    const-string v5, "Bloodwork"

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_7
    instance-of v0, p1, Lr72/a$a;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lr72/b;->a:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "bloodwork"

    const-string v3, "details_load_error"

    const/4 v4, 0x0

    const-string v5, "Bloodwork"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_8
    instance-of p1, p1, Lr72/a$i;

    if-eqz p1, :cond_9

    iget-object v0, p0, Lr72/b;->a:Lfi0/a;

    const/16 v7, 0x34

    const/4 v8, 0x0

    const-string v1, "bloodwork"

    const-string v2, "waitlist_join_error"

    const/4 v3, 0x0

    const-string v4, "Bloodwork"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
