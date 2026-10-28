.class public abstract Lfc3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Lq83/d;

.field public static final b:Lhc3/x;

.field public static final c:Lhc3/x;

.field public static final d:Lhc3/x;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Lq83/d;

    sput-object v0, Lfc3/b;->a:[Lq83/d;

    new-instance v0, Lhc3/x;

    const-string v1, "NULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfc3/b;->b:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "UNINITIALIZED"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfc3/b;->c:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "DONE"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfc3/b;->d:Lhc3/x;

    return-void
.end method

.method public static final a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;
    .locals 6

    new-instance v0, Lfc3/o;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lfc3/o;-><init>(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)V

    new-instance p0, Lbc3/d2;

    invoke-interface {p3}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    const/4 p2, 0x1

    invoke-direct {p0, p1, p3, p2}, Lbc3/d2;-><init>(Lq83/j;Lq83/d;I)V

    const/4 p1, 0x1

    invoke-static {p0, p1, p0, v0}, Le93/b;->c0(Lhc3/u;ZLhc3/u;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic b(Lfc3/q;Lq83/j;ILdc3/a;I)Lec3/l;
    .locals 1

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    sget-object p1, Lq83/k;->w:Lq83/k;

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    const/4 p2, -0x3

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p3, Ldc3/a;->w:Ldc3/a;

    :cond_2
    invoke-interface {p0, p1, p2, p3}, Lfc3/q;->b(Lq83/j;ILdc3/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lq83/j;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 2

    invoke-static {p0, p2}, Lhc3/b;->m(Lq83/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :try_start_0
    new-instance v0, Lfc3/x;

    invoke-direct {v0, p0, p4}, Lfc3/x;-><init>(Lq83/j;Lq83/d;)V

    if-nez p3, :cond_0

    invoke-static {p3, p1, v0}, Lge3/g;->Z(Lc93/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x2

    invoke-static {v1, p3}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {p3, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {p0, p2}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    sget-object p0, Lr83/a;->w:Lr83/a;

    if-ne p1, p0, :cond_1

    const-string p0, "frame"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1

    :goto_1
    invoke-static {p0, p2}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    throw p1
.end method
