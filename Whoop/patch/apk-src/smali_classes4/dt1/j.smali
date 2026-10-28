.class public final Ldt1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J=\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00142\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Ldt1/j;",
        "",
        "Lqk1/b;",
        "dao",
        "Ldt1/f;",
        "mapper",
        "<init>",
        "(Lqk1/b;Ldt1/f;)V",
        "Ldt1/a;",
        "dialogState",
        "Lec3/l;",
        "Ldt1/c;",
        "d",
        "(Ldt1/a;)Lec3/l;",
        "Ljava/time/Instant;",
        "timestamp",
        "c",
        "(Ljava/time/Instant;)Lec3/l;",
        "",
        "id",
        "",
        "symptoms",
        "notes",
        "f",
        "(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)Lec3/l;",
        "Ldt1/g;",
        "upstream",
        "e",
        "(Ldt1/g;)Lec3/l;",
        "a",
        "Lqk1/b;",
        "b",
        "Ldt1/f;",
        "labrador_release"
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
.field private final a:Lqk1/b;

.field private final b:Ldt1/f;


# direct methods
.method public constructor <init>(Lqk1/b;Ldt1/f;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldt1/j;->a:Lqk1/b;

    iput-object p2, p0, Ldt1/j;->b:Ldt1/f;

    return-void
.end method

.method public static final synthetic a(Ldt1/j;)Lqk1/b;
    .locals 0

    iget-object p0, p0, Ldt1/j;->a:Lqk1/b;

    return-object p0
.end method

.method public static final synthetic b(Ldt1/j;)Ldt1/f;
    .locals 0

    iget-object p0, p0, Ldt1/j;->b:Ldt1/f;

    return-object p0
.end method

.method private final c(Ljava/time/Instant;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/time/Instant;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ldt1/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ldt1/j$a;-><init>(Ldt1/j;Ljava/time/Instant;Lq83/d;)V

    new-instance v2, Lec3/s1;

    invoke-direct {v2, v0}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance v0, Ldt1/j$b;

    invoke-direct {v0, p1, v1}, Ldt1/j$b;-><init>(Ljava/time/Instant;Lq83/d;)V

    new-instance p1, Lec3/a0;

    invoke-direct {p1, v0, v2}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    return-object p1
.end method

.method private final d(Ldt1/a;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ldt1/j$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ldt1/j$c;-><init>(Ldt1/j;Ldt1/a;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final f(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)Lec3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/time/Instant;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ldt1/j$f;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v5, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Ldt1/j$f;-><init>(Ldt1/j;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance p2, Ldt1/j$g;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Ldt1/j$g;-><init>(Lq83/d;)V

    new-instance p3, Lec3/a0;

    invoke-direct {p3, p2, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    return-object p3
.end method


# virtual methods
.method public final e(Ldt1/g;)Lec3/l;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/g;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "upstream"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Ldt1/g$d;

    if-eqz v2, :cond_0

    check-cast v1, Ldt1/g$d;

    invoke-virtual {v1}, Ldt1/g$d;->a()Ldt1/a;

    move-result-object v1

    invoke-direct {v0, v1}, Ldt1/j;->d(Ldt1/a;)Lec3/l;

    move-result-object v1

    goto/16 :goto_1

    :cond_0
    instance-of v2, v1, Ldt1/g$k;

    if-eqz v2, :cond_1

    check-cast v1, Ldt1/g$k;

    invoke-virtual {v1}, Ldt1/g$k;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ldt1/g$k;->d()Ljava/time/Instant;

    move-result-object v3

    invoke-virtual {v1}, Ldt1/g$k;->c()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Ldt1/g$k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v4, v1}, Ldt1/j;->f(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto/16 :goto_1

    :cond_1
    sget-object v2, Ldt1/g$h;->a:Ldt1/g$h;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v1, Ldt1/c$g;->a:Ldt1/c$g;

    new-instance v2, La6/u;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    move-object v1, v2

    goto/16 :goto_1

    :cond_2
    sget-object v2, Ldt1/g$j;->a:Ldt1/g$j;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v1, Ldt1/c$j;->a:Ldt1/c$j;

    new-instance v2, La6/u;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_3
    sget-object v2, Ldt1/g$i;->a:Ldt1/g$i;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v1, Ldt1/c$i;->a:Ldt1/c$i;

    new-instance v2, La6/u;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_4
    instance-of v2, v1, Ldt1/g$g;

    if-eqz v2, :cond_5

    check-cast v1, Ldt1/g$g;

    invoke-virtual {v1}, Ldt1/g$g;->c()Ldt1/a;

    move-result-object v1

    invoke-direct {v0, v1}, Ldt1/j;->d(Ldt1/a;)Lec3/l;

    move-result-object v1

    goto :goto_1

    :cond_5
    instance-of v2, v1, Ldt1/g$a;

    if-eqz v2, :cond_6

    check-cast v1, Ldt1/g$a;

    invoke-virtual {v1}, Ldt1/g$a;->a()Ljava/time/Instant;

    move-result-object v1

    invoke-direct {v0, v1}, Ldt1/j;->c(Ljava/time/Instant;)Lec3/l;

    move-result-object v1

    goto :goto_1

    :cond_6
    sget-object v2, Ldt1/g$b;->a:Ldt1/g$b;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v1, Ldt1/c$b;->a:Ldt1/c$b;

    new-instance v2, La6/u;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_7
    instance-of v2, v1, Ldt1/g$c;

    if-eqz v2, :cond_8

    check-cast v1, Ldt1/g$c;

    invoke-virtual {v1}, Ldt1/g$c;->a()Ljava/time/Instant;

    move-result-object v1

    invoke-direct {v0, v1}, Ldt1/j;->c(Ljava/time/Instant;)Lec3/l;

    move-result-object v1

    goto :goto_1

    :cond_8
    sget-object v2, Ldt1/g$f;->a:Ldt1/g$f;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v1, Ldt1/c$e;->a:Ldt1/c$e;

    new-instance v2, La6/u;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_9
    sget-object v2, Ldt1/g$e;->a:Ldt1/g$e;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Ldt1/c$d;->a:Ldt1/c$d;

    new-instance v2, La6/u;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :goto_1
    new-instance v2, Ldt1/k;

    sget-object v3, Ldt1/g$h;->a:Ldt1/g$h;

    new-instance v4, Lqk1/a;

    const/16 v17, 0x7ff

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v4 .. v18}, Lqk1/a;-><init>(FILjava/util/List;JLjava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x4

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ldt1/k;-><init>(Ldt1/g;Lqk1/a;Ldt1/c$h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ldt1/j$e;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Ldt1/j$e;-><init>(Ldt1/j;Lq83/d;)V

    new-instance v4, Lec3/l1;

    invoke-direct {v4, v2, v1, v3}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 v1, 0x1

    invoke-static {v4, v1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object v1

    new-instance v2, Ldt1/j$d;

    invoke-direct {v2, v1}, Ldt1/j$d;-><init>(Lec3/l;)V

    return-object v2

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
