.class public final Lwu0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwu0/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lwu0/f;",
        "Lwu0/e;",
        "Lci2/b;",
        "strapProvider",
        "Ljs0/c;",
        "configurationRepository",
        "Lwu0/a;",
        "analytics",
        "<init>",
        "(Lci2/b;Ljs0/c;Lwu0/a;)V",
        "",
        "debounce",
        "Lec3/l;",
        "Ljk0/a;",
        "e",
        "(Z)Lec3/l;",
        "a",
        "Lci2/b;",
        "b",
        "Ljs0/c;",
        "c",
        "Lwu0/a;",
        "",
        "f",
        "()J",
        "timeDelay",
        "connectivity-notifications_release"
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
.field private final a:Lci2/b;

.field private final b:Ljs0/c;

.field private final c:Lwu0/a;


# direct methods
.method public constructor <init>(Lci2/b;Ljs0/c;Lwu0/a;)V
    .locals 1

    const-string v0, "strapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwu0/f;->a:Lci2/b;

    iput-object p2, p0, Lwu0/f;->b:Ljs0/c;

    iput-object p3, p0, Lwu0/f;->c:Lwu0/a;

    return-void
.end method

.method public static final synthetic b(Lwu0/f;)Lwu0/a;
    .locals 0

    iget-object p0, p0, Lwu0/f;->c:Lwu0/a;

    return-object p0
.end method

.method public static final synthetic c(Lwu0/f;)Lci2/b;
    .locals 0

    iget-object p0, p0, Lwu0/f;->a:Lci2/b;

    return-object p0
.end method

.method public static final synthetic d(Lwu0/f;)J
    .locals 2

    invoke-direct {p0}, Lwu0/f;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method private final e(Z)Lec3/l;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lwu0/f;->a:Lci2/b;

    invoke-interface {v0}, Lci2/b;->c()Lec3/f2;

    move-result-object v0

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v0, Lwu0/f$b;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lwu0/f$b;-><init>(Lq83/d;)V

    invoke-static {v1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lwu0/f$c;

    invoke-direct {v1, v0, v2}, Lwu0/f$c;-><init>(Lec3/l;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, v1}, Lec3/s1;-><init>(Lc93/m;)V

    invoke-static {v0}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v0

    new-instance v1, Lwu0/f$e;

    invoke-direct {v1, p0, v2}, Lwu0/f$e;-><init>(Lwu0/f;Lq83/d;)V

    new-instance v3, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lwu0/f;->f()J

    move-result-wide v0

    invoke-static {v3, v0, v1}, Lec3/v;->r(Lec3/l;J)Lec3/l;

    move-result-object v3

    :cond_0
    new-instance p1, Lwu0/f$a;

    invoke-direct {p1, v3}, Lwu0/f$a;-><init>(Lec3/l;)V

    new-instance v0, Lwu0/f$d;

    invoke-direct {v0, p1, v2}, Lwu0/f$d;-><init>(Lec3/l;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final f()J
    .locals 7

    iget-object v0, p0, Lwu0/f;->b:Ljs0/c;

    sget-object v1, Lwu0/d;->a:Lwu0/d;

    invoke-virtual {v0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v0

    invoke-virtual {v1}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Ljava/lang/Long;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_0

    :cond_0
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    goto :goto_0

    :cond_1
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v6

    goto :goto_0

    :cond_2
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    goto :goto_0

    :cond_3
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_0

    :cond_4
    const-class v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :cond_5
    move-object v6, v1

    :cond_6
    :goto_0
    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    move-object v1, v6

    :goto_1
    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(Z)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lwu0/f;->e(Z)Lec3/l;

    move-result-object p1

    return-object p1
.end method
