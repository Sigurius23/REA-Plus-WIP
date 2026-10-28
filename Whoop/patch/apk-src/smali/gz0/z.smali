.class public abstract Lgz0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lgz0/y;",
        "a",
        "Lgz0/y;",
        "b",
        "()Lgz0/y;",
        "planIcons",
        "design_release"
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
.field private static final a:Lgz0/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgm1/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lgm1/b;-><init>(I)V

    invoke-static {v0}, Lgz0/p0;->b(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgz0/y;

    sput-object v0, Lgz0/z;->a:Lgz0/y;

    return-void
.end method

.method public static synthetic a(Lkd1/g;)Lgz0/y;
    .locals 0

    invoke-static {p0}, Lgz0/z;->c(Lkd1/g;)Lgz0/y;

    move-result-object p0

    return-object p0
.end method

.method public static final b()Lgz0/y;
    .locals 1

    sget-object v0, Lgz0/z;->a:Lgz0/y;

    return-object v0
.end method

.method private static final c(Lkd1/g;)Lgz0/y;
    .locals 9

    const-string v0, "$this$iconBuilder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lgz0/y;

    sget v0, Lgy0/a;->n2:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v4, "In The Green"

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    sget v0, Lgy0/a;->p2:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "Start Strong"

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget v3, Lgy0/a;->o2:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "Sleep Right"

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v8

    sget v3, Lgy0/a;->q2:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "Try Dry"

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v2}, Lkd1/g;->c()Ljava/util/List;

    move-result-object v6

    move v2, p0

    move v3, v0

    move v4, v8

    invoke-direct/range {v1 .. v6}, Lgz0/y;-><init>(IIIILjava/util/List;)V

    return-object v1
.end method
