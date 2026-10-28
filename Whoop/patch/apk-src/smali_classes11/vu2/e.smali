.class public abstract Lvu2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u0014\u0010\u0008\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lvu2/c;",
        "domainState",
        "Lvu2/f;",
        "internal",
        "c",
        "(Lvu2/c;Lvu2/f;)Lvu2/c;",
        "a",
        "Lvu2/c;",
        "initialDomainState",
        "weightlifting_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lvu2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lvu2/c;

    sget-object v1, Lvu2/b$b;->a:Lvu2/b$b;

    const/16 v8, 0x7e

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lvu2/c;-><init>(Lvu2/b;Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvu2/e;->a:Lvu2/c;

    return-void
.end method

.method public static final synthetic a()Lvu2/c;
    .locals 1

    sget-object v0, Lvu2/e;->a:Lvu2/c;

    return-object v0
.end method

.method public static final synthetic b(Lvu2/c;Lvu2/f;)Lvu2/c;
    .locals 0

    invoke-static {p0, p1}, Lvu2/e;->c(Lvu2/c;Lvu2/f;)Lvu2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lvu2/c;Lvu2/f;)Lvu2/c;
    .locals 11

    instance-of v0, p1, Lvu2/f$e;

    if-eqz v0, :cond_0

    new-instance v1, Lvu2/c;

    sget-object v2, Lvu2/b$b;->a:Lvu2/b$b;

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lvu2/c;-><init>(Lvu2/b;Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lvu2/f$f;

    if-eqz v0, :cond_1

    new-instance v1, Lvu2/c;

    check-cast p1, Lvu2/f$f;

    invoke-virtual {p1}, Lvu2/f$f;->b()Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    move-result-object v3

    invoke-virtual {p1}, Lvu2/f$f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lvu2/f$f;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lvu2/f$f;->a()Luu2/m;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v8}, Lvu2/c;-><init>(Lvu2/b;Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lvu2/f$c;

    if-eqz v0, :cond_2

    new-instance v1, Lvu2/c;

    sget-object v2, Lvu2/b$a;->a:Lvu2/b$a;

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lvu2/c;-><init>(Lvu2/b;Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of v0, p1, Lvu2/f$d;

    if-eqz v0, :cond_3

    new-instance v1, Lvu2/c;

    sget-object v2, Lvu2/b$c;->a:Lvu2/b$c;

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lvu2/c;-><init>(Lvu2/b;Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    instance-of v0, p1, Lvu2/f$b;

    if-eqz v0, :cond_4

    sget-object v2, Lvu2/b$b;->a:Lvu2/b$b;

    const/16 v9, 0x12

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v10}, Lvu2/c;->b(Lvu2/c;Lvu2/b;Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lvu2/c;

    move-result-object p0

    return-object p0

    :cond_4
    move-object v0, p0

    instance-of p0, p1, Lvu2/f$a;

    if-eqz p0, :cond_5

    check-cast p1, Lvu2/f$a;

    invoke-virtual {p1}, Lvu2/f$a;->a()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/16 v8, 0x5e

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lvu2/c;->b(Lvu2/c;Lvu2/b;Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lvu2/c;

    move-result-object p0

    return-object p0

    :cond_5
    instance-of p0, p1, Lvu2/f$h;

    if-eqz p0, :cond_6

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lvu2/c;->b(Lvu2/c;Lvu2/b;Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lvu2/c;

    move-result-object p0

    return-object p0

    :cond_6
    instance-of p0, p1, Lvu2/f$g;

    if-eqz p0, :cond_7

    check-cast p1, Lvu2/f$g;

    invoke-virtual {p1}, Lvu2/f$g;->a()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v9}, Lvu2/c;->b(Lvu2/c;Lvu2/b;Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lvu2/c;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
