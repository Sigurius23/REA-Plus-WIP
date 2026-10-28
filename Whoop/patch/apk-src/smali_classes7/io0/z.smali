.class public abstract Lio0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "intakeResponses",
        "Ltr2/n;",
        "logger",
        "",
        "Lkotlinx/serialization/json/JsonObject;",
        "a",
        "(Ljava/lang/String;Ltr2/n;)Ljava/util/List;",
        "clinician-in-the-loop_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;Ltr2/n;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltr2/n;",
            ")",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonObject;",
            ">;"
        }
    .end annotation

    const-string v0, "intakeResponses"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lad3/c;->d:Lad3/b;

    invoke-virtual {v2, p0}, Lad3/c;->f(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p0
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    instance-of v2, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v2, :cond_1

    check-cast p0, Lkotlinx/serialization/json/JsonArray;

    goto :goto_0

    :cond_1
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_6

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    instance-of v3, v3, Lkotlinx/serialization/json/JsonObject;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_4
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    const-string v1, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lkotlinx/serialization/json/JsonObject;

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    return-object p1

    :cond_6
    :goto_3
    const-string p0, "intakeResponses must be a JSON array of objects"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p0, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :catch_0
    move-exception p0

    const-string v2, "intakeResponses is not valid JSON"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v2, p0, v0}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v1
.end method
